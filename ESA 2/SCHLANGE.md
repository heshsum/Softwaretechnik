# SWT ESA 2 - REQ

Hendrik Schlange

# Zweck

## Ziel

Im Rahmen des Projektes BibSoft sollen die Spezifikation, Programmierung, Einführung und Wartung einer neuen Software für den Betrieb von Bibliotheken im schulischen Umfeld umgesetzt werden. In diesem Dokument werden die Requirements an diese Software beschrieben.

## Langfristiges Ziel

Langfristig sollen alle Schulen im Land Berlin mit dieser Software ausgestattet werden, sodass auf einen schulübergreifenden Pool von Medien zurückgegriffen werden kann um vorhandene Ressourcen besser nutzen zu können und unnötige Anschaffungen zu vermeiden.

Sehr langfristiges Ziel ist die Übernahme der Weltherrschaft durch Bibliothekar:innen.

## Projektumfang

- Konzeption der Software
- Aufstellung eines Pflichtenhefts
- Umsetzung der Software
- Dokumentation
- Test
- Inbetriebnahme
- Wartung und Pflege der Software

## Stakeholder

- Schulträger
- Schulleitung
- Lehrpersonal
- Bibliothekspersonal
- Schülerschaft

# Anforderungen

## Funktionale Anforderungen an die Anwendung

### Muss-Anforderungen

- Verwaltung von Schulbibliotheken
    
    Die Software muss in der Lage sein, mehrere Standorte zu verwalten, bspw. eine getrennte Schüler- und Lehrerbibliothek.
    
- Verwaltung von Schulmedien
    
    Von der Bibliothek werden nicht nur Bücher verwaltet, sondern auch andere Medien wie u.a.:
    
    - Zeitschriften
    - DVDs, Blu-Rays
    - CD-ROMs
    - Online-Medien
    
    Aus diesem Grunde muss die Software verschiedene Medientypen inkl. ihrer jeweiligen Metadaten (Barcode, Verlag/Hersteller, Jahr, Auflage, Altersfreigabe usw.) unterstützen.
    
- Ausleihe
    
    Die Software muss das Ausleihen von Medien unterstützen, sowohl für Einzelexemplare als auch bspw. Klassensätze. Die Ausleihfristen müssen dabei automatisch von der Anwendung berechnet werden. Ausleihfristen müssen darüber hinaus manuell überschrieben werden können.
    
    Außerdem muss auch eine Dauerausleihe unterstützt werden.
    
- Verlängerung der Ausleihe
    
    Die Ausleihfrist von bereits ausgeliehenen Medien muss verlängert werden können. Dies muss innerhalb festzulegender Regeln auch im self-service durch die Nutzer geschehen können.
    
- Berechnung von Gebühren
    
    Bei verspäteter Rückgabe oder Beschädigung von Medien muss die Software Gebühren anhand eines Tagessatzes bzw. für den Ersatz eines Mediums berechnen können.
    
- Web-Interface
    
    Die Software muss mit einem Browser bedient werden können, da in der Bibliothek nur Thin-Clients zur Verfügung stehen. Außerdem müssen sowohl Lehrer:innen, als auch Schüler:innen und das Bibliothekspersonal auf die Bibliothek zugreifen können.
    
    Ein Großteil der Schüler:innen verwendet Smartphones als primären Client. Daher muss das Design der Anwendung responsive sein, sodass eine Nutzung mit unterschiedlichen Endgerätetypen möglich ist.
    
- Unterstützung von Barcodes
    
    Jedes Exemplar soll einzeln verwaltet werden können. Für die eindeutige Identifikation einzelner Werke ist die Nutzung von Barcodes oder QR vorgesehen. Die Software muss daher Barcodes generieren (Inventarisierung und Nachdruck) und einlesen (Ausleihe, Bestandsverwaltung) können.
    
- Rechte- und Rollensystem
    
    Unterschiedliche Nutzer haben unterschiedliche Zugriffsberechtigungen. Es soll daher ein Rechte- und Rollensystem geben, mit dem mindestens zwischen folgenden Rollen unterschieden werden kann:
    
    1. Schüler
    2. Lehrer
    3. Bibliothekspersonal
    4. Administratoren
- Software Stack
    
    Die Software muss sich in das bestehende Software-Ökosystem integrieren. Daher muss die Anwendung entweder als Docker-Container ausgeliefert werden oder auf einem LAMP-Stack installiert werden können.
    

### Soll-Anforderungen

- Unterstützung von Zustandsinformationen
    
    Medien liegen in unterschiedlichen Zuständen vor. Die Anwendung soll daher verschiedene Zustände unterscheiden können wie bspw.
    
    - neu
    - gebraucht
    - beschädigt
- Reporting
    
    Das Reporting ist wichtig für die Etatplanung in der Schulverwaltung wie auch in den  Fachbereichen. Hierzu gehören:
    
    - Unterstützung beim Einkauf neuer Medien
    - Auswertung häufig ausgeliehener Medien
- Single Sign-On
    
    In der Schule wird ein Active Directory betrieben. Jede(r) Lehrer:in und Schüler:in hat dort bereits einen eigenen Account. 
    
    Das Active Directory bietet bereits Authentifizierungsdienste via OAuth2 und LDAP an. Die Software soll daher einen Single Sign-On mit einem der angebotenen Dienste unterstützen, sodass die Daten nicht doppelt vorgehalten werden müssen und Supportprozesse (etwa Passwort-Resets) einfacher abgewickelt werden können.
    

### Wird-Anforderungen

- Schnittstellen zwischen Instanzen
    
    Die Anwendung soll in vielen Schulen zum Einsatz kommen. Diese Schulen sollen künftig untereinander Medien austauschen können. Dies soll in einer zukünftigen Version mit Hilfe von Schnittstellen zwischen Instanzen der Anwendung ermöglicht werden.
    

### Kann-Anforderungen

- Abruf von Metadaten
    
    Für eine schnelle Inventarisierung wäre ein Daten-Lookup anhand der ISBN und/oder des UPC Codes sehr hilfreich.
    
- Import- und Exportfunktionen
    
    Die Möglichkeit eines Imports und Exports von Daten aus dem System wird als hilfreich angesehen.
    

## Nicht-funktionale Anforderungen an die Anwendung

- Gebrauchstauglichkeit
    
    Die Software soll einfach zu bedienen und erlernen sein. Lehrer:innen und Schüler:innen müssen die Anwendung gleichermaßen ohne spezielle Schulung nutzen können (etwa Medien ausleihen und Ausleihen verlängern).
    
- Sicherheit
    
    Die Software muss unter Berücksichtigung aktueller Gesichtspunkte der IT-Sicherheit entwickelt werden.
    
- Rechtliche Rahmenbedingungen
    
    Die Software wird von einer Kommune, d.h. einem öffentlichen Träger betrieben. Die Software muss die damit verbundenen rechtlichen Anforderungen erfüllen.
    
- Datenschutz
    
    Minderjährige genießen einen besonderen Schutz ihrer persönlichen Daten. Die Software muss die rechtlichen Anforderungen hieran erfüllen.
    
- Geschwindigkeit
    
    Die Anwendung muss auch mit großen Datenbeständen umgehen können. Bei einer Suche innerhalb einer lokalen Bibliothek über den Titel darf auch bei einem Datenbestand von >50.000 Einträgen die Suche nicht länger als 0,5s dauern.
    
    Bei einer Titelsuche über mehrere Bibliotheken hinweg (siehe Wird-Anforderung “Schnittstellen zwischen Instanzen”) darf die Suche über drei Instanzen bei einem Bestand von bis zu 1.000.000 Titeln nicht länger als 5s dauern.