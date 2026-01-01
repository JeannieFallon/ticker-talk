# Ticker-Talk

This is a simple Spring Boot project called Ticker-Talk.

## Tech Stack

*   Java 21
*   Spring Boot 3.4
*   Maven

## Functionality

The application exposes a single GET endpoint at `/api/health` which returns a JSON object `{"status": "up"}`.

## Build and Run

To build the project, run the following command:

```bash
mvn clean install
```

To run the application, use the following command:

```bash
mvn spring-boot:run
```

## Testing the Endpoint

Once the application is running, you can test the health check endpoint with the following `curl` command:

```bash
curl http://localhost:8080/api/health
```