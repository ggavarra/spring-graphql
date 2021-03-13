# spring-graphql
spring-graphql

Simple spring based graphql APIs

Use GraphQL playground to view the schema and docs
http://localhost:8083/graphql

Sample queries+mutations
query{
  recentPosts(count:3,offset:2){
    title
  }
}
