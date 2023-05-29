# Quiz Application

The Quiz Application is an API-based application that allows users to create and participate in timed quizzes.

## Features

- Create a quiz by providing the question, answer options, right answer, start date, and end date.
- Retrieve the active quiz that is currently within its start and end time.
- Get the result of a quiz after 5 minutes of its end time.
- View all quizzes available in the system.

## Technologies Used

- Java Spring Boot
- MongoDB (as the chosen database)

## API Endpoints

- POST /quizzes: Create a new quiz.
- GET /quizzes/active: Retrieve the active quiz.
- GET /quizzes/:id/result: Retrieve the result of a quiz by its ID.
- GET /quizzes/all: Retrieve all quizzes.

## Installation

1. Clone the repository:

   ```bash
   git clone <repository_url>
