# javaGraphic
Programma JAVA che elabora i file JSON prelevati dal sito Torino Respira al fine di rappresentarli sotto forma di Graifco


## JAVA - ANALISI DI DATI SUI PROBLEMI AMBIENTALI ##
Concentrazioni NO2(g/m3) Annuali e Mensili - Torino Respira

### PRESENTAZIONE	DEL PROBLEMA ###
“A partire dai siti di ARPA Piemonte o Torino Respira, cercare degli "open data" riguardo a qualità dell'aria o su argomenti che riguardano i cambiamenti climatici o l'ambiente in generale. Cercare i dati in un formato che sia CSV oppure JSON o XML. Comprendere bene il significato dei dati e il loro formato. In seguito, progettare e scrivere un programma JAVA che, tramite interfaccia GUI legga il file con i dati, li elabori e visualizzi in una forma grafica i dati stessi, in modo da poterli interpretare e poi discutere. La lettura da file può essere utilizzata per inserire i vari dati in un vettore (in modalità pila o coda a vostra scelta)".

### ANALISI DEL FILE .JSON ###

Abbiamo così deciso di prelevare i dati dal sito Torino Respira. Nella sezione #cheariatira del sito, è inserita una mappa realizzata con Google My Maps, nella quale sono registrate le misurazioni mensili di NO2 nell'aria (µg/m3). Nelle impostazioni, è stato possibile esportare la mappa come file  KML. Tramite dei Tool Online, abbiamo convertito il file .KML in .KMZ, ed in seguito da .KMZ a .geojson. Infine, abbiamo validato il file secondo lo standard RFC 8259.

![File Structure](https://i.imgur.com/vCqQP9Y.png)

Dopo aver convertito il file in un formato leggibile, il passo successivo è stato quello di comprendere la struttura del file stesso, per poi andare a creare le classi Java di appoggio per la lettura. Nei file Json, quando si incontrano delle parentesi graffe '{', siamo in presenza di un dato da trattare come Oggetto. Quando si trovano invece delle parentesi quadre '[', dobbiamo trattare quei dati come una lista (nel nostro caso, abbiamo utilizzato la classe ArrayList).


### RISOLUZIONE DEL PROBLEMA ###

Utilizzando la libreria GSON, l'unica complicazione nella lettura del file è stata creare delle classi Java in modo corretto. Abbiamo così ideato uno schema per aiutarci:

![File Structure Scheme](https://i.imgur.com/pRMFMNQ.png)

Spiegato a parole: Abbiamo una classe principale, FeatureCollection, che andrà a contenere tutti i dati del file. I suoi attributi sono type (Stringa), name (Stringa), crs (oggetto di classe Crs), ed infine features (un ArrayList di Feature). 
A sua volta, la classe Crs ha come attributi type (una Stringa), e properties (un oggetto di classe Properties, che a sua volta ha come attributo “name”, ovvero una Stringa).
Analizziamo infine la classe Feature. Quest'ultima ha come attributi type (una Stringa), un oggetto di classe FeatureProperties ed infine “geometry” (sempre impostato a null).
La classe FeatureProperties possiede a sua volta 21 attributi (tutti stringhe).

Dopo aver creato tutto ciò, la classe GSON tramite il metodo
      << FeatureCollection featureCollection = gson.fromJson(reader, FeatureCollection.class); >>
è in grado di salvare tutto il file di dati all'interno di “featureCollection”.

### Grafico ###

![Graph](https://i.imgur.com/bFDzn1M.png)
