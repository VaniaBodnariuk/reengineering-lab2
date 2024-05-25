* Problem in edu.pro.MainToRefactor
* Solution in edu.pro.analyzer

1. Remove unused imports
2. Extract File operations to a separate class `FileUtil`
3. Add error handling for file operations
4. Extract Duration measuring to a separate class `OperationDurationUtil`
5. Use Instant instead of LocalDateTime
6. Extract Text analysis to a separate class `TextAnalyzer`
7. Divide analysis logic into separate methods to increase readability (`calculateWordFrequency`, `getTopFrequencies`, etc.)
8. Utilize StringBuilder for the distinctString to prevent unnecessary immutable string creation
9. Use a `Map` instead of arrays to count the frequency of words, improving both clarity and performance
10. Use modern java features (`Stream API`) to improve clarity
11. Replace "magic numbers" with named constants (`FILE_PATH`, `TOP_N`) to increase code readability
12. Safeguard with fast return in case content is empty