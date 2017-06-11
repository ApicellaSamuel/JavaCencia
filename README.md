#### Prima lezione
_`I tipi di dato primitivi`_
#### Seconda lezione
_`Le funzioni`_
#### Terza lezione
_`Le eccezzioni`_
#### Quarta lezione
_`Le liste`_
#### Quinta lezione
_`L'ereditarietà`_

Per quanto riguarda le funzioni ereditate, la pseudo variabile super è statica e 
this è dinamica; mentre per gli attributi super e this sono statiche.
Estendendo una classe si ereditano anche gli attributi.

#### Sesta lezione
_`I modificatori di accesso`_

Il modificatore protected vieta l'accesso solo all'esterno del package,
a meno che la classe da cui si tenta l'accesso al metodo protected estende la classe in cui
è contenuto l'attributo.

#### Settima lezione
_`Le classi astratte e le interfacce`_

#### Ottava lezione
_`Le interfacce`_

Se una variabile ha il modificatore di accesso di dafault allora l'accesso è
ristretto solo all'interno del package in ogni caso.
In una interfaccia tutti i metodi sono implicitamente public e anche le 
interfacce possono avere attributi, che sono implicitamente static.

#### Nona lezione (da rivedere la classe stato)
_`Classi locali`_

Le classi locali hanno accesso alle variabili solo in lettura.

#### Decima lezione
_`Le sequenze`_

#### Undicesima lezione
_`Le wildcard`_

#### Dodicesima lezione
_`Due modi di creare classi anonime: estendendo una classe o
 implementando un'interfaccia`_
 
In pratica è possibile estendere o implementare _al volo_.
 
#### Tredicesima lezione
_`Gli iterable`_

Esempio: foreach(Consumer[definibile anche al volo]).

#### Lezione 14
_`Thread`_

#### Lezione 15
_`Deadlock e Synchronize`_

#### Lezione 16
_`Wait e notify`_

I metodi wait, notify e notifyAll possono essere invocati esclusivamente
all'interno di codice sincronizzato, _utilizzando il lock dell'oggetto sul
quale vengono invocati_. L'invocazione può essere fatta direttamente dal
codice sincronizzato o indirettamente da uno dei metodi invocati al suo
interno. Qualora si cercasse di invocare questi metodi su di un oggetto
del quale non si possegga il lock, si otterrebbe un'eccezione.

#### Lezione 17
_`Variabili volatile e isInterrupted()`_
 
#### Lezione 18
_`Synchrocoda`_