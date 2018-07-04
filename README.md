# spring-boot-microservice-currency-conversion
Currency Conversion Service (CCS) can convert a bucket of currencies into another currency. It uses the Forex Service to get current currency exchange values. CCS is the Service Consumer.

An example request and response is shown below:

GET to http://localhost:8100/currency-converter/from/EUR/to/INR/quantity/10000

{
  id: 10002,
  from: "EUR",
  to: "INR",
  conversionMultiple: 75,
  quantity: 10000,
  totalCalculatedAmount: 750000,
  port: 8000,
}

The diagram below shows the communication between CCS and FS.<br>
<img src="http://www.springboottutorial.com/images/Spring-Boot-Microservice-1-CCS-FS.png"/>
