package step3;

public class ApplePredicateHeavy implements ApplePredicate {
    
    @Override
    public boolean test(Apple apple){
        return ((apple.getPeso() > 150));
        
    }
}
