# Kotlin Empty List Exception Handling
This repository demonstrates a common error in Kotlin when dealing with collections: exceptions thrown when accessing elements of an empty list.

The `bug.kt` file contains code that attempts to access the first element of a list that might be empty. This results in a `NoSuchElementException`.

The `bugSolution.kt` file shows how to use safe calls and the elvis operator to handle potential empty lists gracefully.