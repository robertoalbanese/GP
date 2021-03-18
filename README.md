# File list 
## AndroidServe_PythonClient
Contiene lo script del socket: il socket invia un file JSON con pitch, roll, yaw e throttle . Runnare prima il server sull'app android e poi lo script python che vi chiederà di inseriere il valore di pitch.
## DJISimulatorDemo
è il codice del simulatore con del controllo del drone tramite stick, riadattato con il nostro socket che manda pacchetti JSON con le posizioni angolari e le fa printare al simulatore (Quindi gli stick sono stati rimossi).

