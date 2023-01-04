# POS account

```
src
 |___resources
 |      |___application.properties (mysql connection)
 |___main
        |___java
               |___com.gunp.testEcom
                    |___controller (API endpoint(url))
                    |___model (Data mapping Object Model(java) <=> Database(Relational Model))
                    |___repo  (Query method Interface)
                    |___service (logics + Query method Interface)
```

## Controller
| Annotation      | Description |
|-----------------|-------------|
| @RESTController |             |
| @MappRequest    |             |
| @RESTController |             |
| @RESTController |             |


## Repository and native query 
### !! query in JPA string query must use class name as table reference.

