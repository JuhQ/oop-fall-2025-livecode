import java.util.ArrayList;

interface Example {
    void hello();
    void exampleMethod();
    ArrayList<String> getNames();
}

interface Country {
    String getName();
    String getCapital();
}

interface World extends Example {
    void world();
}

interface Finland extends Example, Country {
    String getKarjalanPiirakka();
}

interface TwoTypesOfData extends Example, Country {}


class FinlandClass implements Finland {

    public void sayHello(TwoTypesOfData a) {
        a.hello();
        a.getCapital();
    }

    @Override
    public String getCapital() {
        return "";
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void hello() {

    }

    @Override
    public void exampleMethod() {

    }

    @Override
    public ArrayList<String> getNames() {
        return null;
    }

    @Override
    public String getKarjalanPiirakka() {
        return "";
    }
}


class WorldClass implements World {

    @Override
    public void world() {

    }

    @Override
    public void hello() {

    }

    @Override
    public void exampleMethod() {

    }

    @Override
    public ArrayList<String> getNames() {
        return null;
    }
}