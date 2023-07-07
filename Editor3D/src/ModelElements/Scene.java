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

    public Type method1(Type type){
        return type; // or new Type() - ???   .. может тут вообще нужна Camera...
    }
    public Type method2(Type type, Type type1){
        return new Type();  // same here
    }
}
