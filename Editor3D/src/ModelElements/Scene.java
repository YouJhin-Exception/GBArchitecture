package src.ModelElements;

import src.Stuff.Type;


import java.util.List;


public class Scene {
    public int Id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;

    public Scene(List<PoligonalModel> models, List<Flash> flashes) {
        this.models = models;
        this.flashes = flashes;
    }

    public Scene(int id) {
        Id = id;
    }

    public <T> T method1(T flash) {
        return flash;
    }

    public <T, E> T method2(T model, E flash) {
        return model;
    }

    //заглушки

//    public Type method1(Type type){
//        return type; // or new Type() - ???   .. может тут вообще нужна Camera...
//    }
//    public Type method2(Type type1, Type2 type2){
//        return new Type();  // same here
//    }


}
