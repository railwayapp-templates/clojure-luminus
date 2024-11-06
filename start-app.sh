# start-app.sh
#!/bin/bash

# Run migrations
lein run migrate

# Find and run the built JAR file
java -jar $(find ./target -name '*.jar' ! -name '*SNAPSHOT*') migrate && java -jar $(find ./target -name '*.jar' ! -name '*SNAPSHOT*')
