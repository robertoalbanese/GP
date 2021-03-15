# File list 
__provaSocket__ è la prova di un doppio socket tra app e uno script in python. Quindi permette la comunicazione in entrambe le direzioni. 
__AndroidServe_PythonClient__ Contiene due script: un che invia semplicemente una striga, latro un file JSON con pitch, roll e yaw (l' app printa solo il valore del pitch). Runnare prima il server sull'app android e poi lo script python che vi chiederà di inseriere il valore di pitch.
__DJISimulatorDemo__ è il codice del simulatore con del controllo del drone tramite stick, riadattato con il nostro socket che manda pacchetti JSON con le posizioni angolari e le fa printare al simulatore (Quindi gli stick sono stati rimossi).

