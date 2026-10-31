# Customer Support Ticket Management System

## Project Overview
The Customer Support Ticket Management System is a Java backend application developed using Spring Boot. It helps manage customer complaints by creating support tickets, storing complaint details, and tracking their status until resolution.

## Technologies Used
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven
- Postman

## Features
- Create customer complaint tickets.
- View all customer complaints.
- Find a ticket using its ID.
- Update complaint details and status.
- Delete ticket records.
- Track ticket priority and status.

## REST API Endpoints

| HTTP Method | Endpoint | Description |
|---|---|---|
| POST | `/api/tickets` | Create a new ticket |
| GET | `/api/tickets` | Get all tickets |
| GET | `/api/tickets/{id}` | Get ticket by ID |
| PUT | `/api/tickets/{id}` | Update ticket details |
| DELETE | `/api/tickets/{id}` | Delete a ticket |

## Ticket Status
- OPEN
- IN_PROGRESS
- RESOLVED

## Project Architecture

Controller → Service → Repository → PostgreSQL

- **Entity:** Represents ticket information.
- **Controller:** Handles incoming REST API requests.
- **Service:** Contains application business logic.
- **Repository:** Performs database operations using Spring Data JPA.

## Example Workflow
1. A customer submits a complaint about a payment issue.
2. The application creates a ticket with a unique ID and OPEN status.
3. The support team retrieves the ticket and investigates the issue.
4. The ticket status is updated to IN_PROGRESS.
5. After the issue is resolved, the status is updated to RESOLVED.

## Testing
All REST API endpoints are tested using Postman.

## Future Enhancements
- User authentication and authorization.
- Support agent assignment.
- Ticket search and filtering.
- Input validation and exception handling.
- Email notifications.
