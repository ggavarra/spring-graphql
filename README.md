# spring-graphql
spring-graphql

Simple spring based graphql APIs

Use GraphQL playground to view the schema and docs
http://localhost:8083/graphql

**Examples**

**Query**
query{
  recentPosts(count:3,offset:2){
    title
  }
}


**Mutation**

mutation{
  writePost(title:"A new Day!",text:"ABC",category:"Fiction",author:"ggavarra"){
    title
  }
}


