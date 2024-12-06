# Compte GRPC
This is a gRPC service for managing bank accounts, with various functionalities for creating, retrieving, and deleting accounts, as well as performing statistics queries. The service is implemented in Java and utilizes Protocol Buffers (.proto files) to define messages and the gRPC service.

## Functions
### AllComptes
Retrieves a list of all accounts.  

### CompteById
Retrieves a specific account by its ID.

### TotalSolde
Retrieves statistics on the total balance of all accounts.

### SaveCompte
Saves (creates or updates) an account.

### FindByType
Retrieves accounts filtered by type (either COURANT or EPARGNE).

### DeleteCompte
Deletes an account by its ID.




## Video Demo

https://github.com/user-attachments/assets/e5a132f9-ef14-4983-9040-3ece3f50f5fe

