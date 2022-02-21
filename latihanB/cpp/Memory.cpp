#include <iostream>
#include <string>
#include "Hardware.cpp"

using namespace std;

class Memory : public Hardware {
    private:
        string frecuency;
        string memorySize;
        string supportsCuda;

    public:
        Memory() {
        }

        Memory(string frecuency, string memorySize, string supportsCuda) {
            this->frecuency = frecuency;
            this->memorySize = memorySize;
            this->supportsCuda = supportsCuda;
        }

        void setFrecuency(string frecuency) {
            this->frecuency = frecuency;
        }

        string getFrecuency() {
            return this->frecuency;
        }

        void setMemorySize(string memorySize) {
            this->memorySize = memorySize;
        }

        string getMemorySize() {
            return this->memorySize;
        }

        void setSupportsCuda(string supportsCuda) {
            this->supportsCuda = supportsCuda;
        }

        string getSupportsCuda() {
            return this->supportsCuda;
        }

        ~Memory() {
        }
};