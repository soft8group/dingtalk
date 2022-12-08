package compile.java;

public class TalkFactory{

    public session CreateTalk(Class <?>clazz) {
        if(clazz == Talk.class) {
            return new Talk();
        } else {
            return null;
        }
    } 
}