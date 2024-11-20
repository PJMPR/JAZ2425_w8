package jaz.users.apiclient;

import jaz.users.apiclient.client.IRandomUsersClient;
import jaz.users.apiclient.client.ISetRandomUsersApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JazUsersApiClientApplication implements CommandLineRunner {

    private final IRandomUsersClient randomUsersClient;
    private final ISetRandomUsersApi clientSettings;

    public JazUsersApiClientApplication(IRandomUsersClient randomUsersClient, ISetRandomUsersApi clientSettings) {
        this.randomUsersClient = randomUsersClient;
        this.clientSettings = clientSettings;
    }

    public static void main(String[] args) {
        SpringApplication.run(JazUsersApiClientApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
//        funWithSettings();
//        funWithRecords();
//        funWithUsers();
    }

    void funWithSettings(){
//        System.out.println(clientSettings.getApiUrl());
//        System.out.println(clientSettings.getUrlBuilder().toUriString());
    }

    void funWithRecords(){
        Person jan1 = new Person("jan");
        Person jan2 = new Person("jan");

        PersonRecord janRecord1 = new PersonRecord("jan");
        PersonRecord janRecord2 = new PersonRecord("jan");
        PersonRecord janRecord3 = new PersonRecord("janusz");

        System.out.println(jan1);
        System.out.println(janRecord1);

        System.out.println(jan1==jan2);
        System.out.println(janRecord1==janRecord2);

        System.out.println(jan1.equals(jan2));
        System.out.println(jan1.equals(janRecord1));

        System.out.println(janRecord1.equals(janRecord2));
        System.out.println(janRecord1.equals(janRecord3));

        System.out.println(jan1.hashCode());
        System.out.println(jan2.hashCode());

        System.out.println(janRecord1.hashCode());
        System.out.println(janRecord2.hashCode());
        System.out.println(janRecord3.hashCode());
    }

    class Person{
        String name;

        public Person() {
        }

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    record  PersonRecord(String name){}

    void funWithUsers(){
        System.out.println(randomUsersClient.getRandomUsers());
    }
}
