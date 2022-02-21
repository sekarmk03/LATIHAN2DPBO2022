from Hardware import *

class Memory(Hardware):
    def __init__(self):
        Hardware.__init__(self)
        self.frecuency = ""
        self.memorySize = ""
        self.supportsCuda = "No"

    def setFrecuency(self, frecuency):
        self.frecuency = frecuency

    def getFrecuency(self):
        return self.frecuency
    
    def setMemorySize(self, memorySize):
        self.memorySize = memorySize
    
    def getMemorySize(self):
        return self.memorySize
    
    def setSupportsCuda(self, supportsCuda):
        self.supportsCuda = supportsCuda

    def getSupportsCuda(self):
        return self.supportsCuda