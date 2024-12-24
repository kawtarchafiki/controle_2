@Configuration
public class GraphQLConfig {

    @Bean
    public GraphQL graphQL() {
        // Définir le schéma et les résolveurs ici
        return GraphQL.newGraphQL(schema)
                .build();
    }
}

