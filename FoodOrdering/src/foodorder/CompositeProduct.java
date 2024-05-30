package foodorder;
import java.util.ArrayList;
import java.util.List;

import FoodOrdering.Component;

// abstract class Component { // Abstract base class for components
//     public abstract double getPrice(); // Abstract method to get the price of the component
//     public void add(Component component) { throw new UnsupportedOperationException(); } // Default implementation throws an exception (to be overridden by concrete classes)
//     public void remove(Component component) { throw new UnsupportedOperationException(); } // Default implementation throws an exception (to be overridden by concrete classes)
//     public Component getChild(int i) { throw new UnsupportedOperationException(); } // Default implementation throws an exception (to be overridden by concrete classes)
// }

public class CompositeProduct extends Component { // Concrete class representing a composite product
    private List<Component> components = new ArrayList<>(); // List to store the child components

    @Override
    public void add(Component component) { // Implementation of the add() method
        components.add(component); // Add the child component to the list
    }

    @Override
    public void remove(Component component) { // Implementation of the remove() method
        components.remove(component); // Remove the child component from the list
    }

    @Override
    public Component getChild(int i) { // Implementation of the getChild() method
        return components.get(i); // Return the child component at the specified index
    }

    @Override
    public double getPrice() { // Implementation of the getPrice() method
        double total = 0; // Variable to hold the total price
        for (Component component : components) { // Iterate over the child components
            total += component.getPrice(); // Add the price of each child component to the total
        }
        return total; // Return the total price
    }
}