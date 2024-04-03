import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

//        double cost_per_litre = 3.50;
        do {


            // Prompt the user to enter the length and height of the wall
            System.out.print("Enter the height of the wall (in m): ");
            double wall_height = scanner.nextDouble();

            System.out.println("Enter number of walls: ");
            int num_walls = scanner.nextInt();

            System.out.println("Enter the width of the wall (in m): ");
            double wall_width = scanner.nextDouble();

            System.out.println("Enter the width of the Door (in m): ");
            double width_of_door = scanner.nextDouble();

            System.out.println("Enter the height of the Door (in m): ");
            double height_of_door = scanner.nextDouble();

            System.out.println("Enter the number of Doors: ");
            int num_door = scanner.nextInt();


            System.out.println("Enter window height (in m): ");
            double window_height = scanner.nextDouble();

            System.out.println("Enter window width (in m): ");
            double window_width = scanner.nextDouble();

            System.out.println("Enter number of Windows: ");
            int num_windows = scanner.nextInt();

            System.out.println("Enter the ceiling length (in m): ");
            double ceiling_length = scanner.nextDouble();

            System.out.println("Enter ceiling width (in m): ");
            double ceiling_width = scanner.nextDouble();


            System.out.println("Enter number of ceilings: ");
            int num_ceilings = scanner.nextInt();

            double doors_area = calculateDoorArea(height_of_door, width_of_door, num_door);
            double window_area = calculateWindowArea(num_windows, window_height, window_width);
            double wall_area = calculateWallArea(num_walls, wall_width, wall_height);
            double ceiling_area = calculateCeilingArea(num_ceilings, ceiling_length, ceiling_width);
            // Map to store the cost per liter of paint for each color
            Map<String, Double> paint_costs = new HashMap<>();

            // Prompt the user to enter the cost per liter of paint for each color
            System.out.println("Enter the cost per liter of paint for each color:");
            for (int i = 0; i < num_walls; i++) {
                System.out.print("Colour: ");
                String colour = scanner.next();
                System.out.print("Cost: ");
                double cost = scanner.nextDouble();
                paint_costs.put(colour, cost);
            }

            Map<String, Double> painted_areas = new HashMap<>();

            System.out.println("Do you want to paint ceiling? yes/no: ");
            String ceiling_paint = scanner.next();
            if (ceiling_paint.equals("yes")) {
                System.out.println("Enter how many times you want to coat wall: ");
                int num_coats = scanner.nextInt();
                double total_paint_cost = calculatePaintCost(paint_costs, painted_areas, doors_area, window_area, wall_area, ceiling_area);
                System.out.println("How much of the wall & Ceiling do you want to paint (as a decimal): ");
                double fraction_painted = scanner.nextDouble();
                double new_paint_cost = total_paint_cost * fraction_painted * num_coats;
                System.out.println("Total cost of paint: £" + String.format("%.2f", total_paint_cost));
                System.out.println("Total cost of paint: £" + String.format("%.2f", new_paint_cost));
            } else {
                System.out.println("Enter how many times you want to coat wall: ");
                int num_coats = scanner.nextInt();
                double total_paint_cost = calculatePaintCost(paint_costs, painted_areas, doors_area, window_area, wall_area);
                System.out.println("How much of the wall & Ceiling do you want to paint (as a decimal): ");
                double fraction_painted = scanner.nextDouble();
                double new_paint_cost = total_paint_cost * fraction_painted * num_coats;
                System.out.println("Total cost of paint: £" + String.format("%.2f", total_paint_cost));
                System.out.println("Total cost of paint: £" + String.format("%.2f", new_paint_cost));
            }
            System.out.println("Do you want to calculate paint cost of a new room? yes/no: ");
        } while (scanner.next().equals("yes"));
    }

    public static double calculateDoorArea(double height_of_door, double width_of_door, int num_door){
        double area_of_door = height_of_door * width_of_door;
        double area_of_all_doors = area_of_door * num_door;

        return area_of_all_doors;
    }

    public static double calculateWallArea(int num_walls, double wall_width, double wall_height) {
        double area_of_wall = wall_height * wall_width;
        double area_of_all_walls = area_of_wall * num_walls;

        return area_of_all_walls;
    }

    public static double calculateCeilingArea(int num_ceilings, double ceiling_length, double ceiling_width){
        double area_of_ceiling = ceiling_length * ceiling_width;
        double area_of_all_ceilings = area_of_ceiling * num_ceilings;

        return area_of_all_ceilings;
    }
    public static double calculateWindowArea(int num_windows, double window_height, double window_width) {
        double area_of_window = window_height * window_width;
        double area_of_all_windows = area_of_window * num_windows;

        return area_of_all_windows;
    }
//    public static double calculatePaintCost(double doors_area, double wall_area,  double window_area, double ceiling_area, double cost_per_litre) {
//
//
//        double total_paint_area = wall_area - window_area - doors_area;
//        total_paint_area += ceiling_area;
//        double total_paint_volume = total_paint_area / 5.0;
//
//        double total_paint_cost = total_paint_volume * cost_per_litre;
//
//        return total_paint_cost;
//
//    }
//    public static double calculatePaintCost(double doors_area, double wall_area, double window_area, double cost_per_litre) {
//
//        double total_paint_area = wall_area - window_area - doors_area;
//        double total_paint_volume = total_paint_area / 5.0;
//
//        double total_paint_cost = total_paint_volume * cost_per_litre;
//
//        return total_paint_cost;
//    }
    public static double calculatePaintCost(Map<String, Double> paint_costs, Map<String, Double> painted_areas, double doors_area, double window_area, double wall_area) {
        double total_paint_cost = 0;
        double remaining_wall_area = wall_area - (window_area + doors_area);
        for (String colour : paint_costs.keySet()) {
            double cost_per_litre = paint_costs.get(colour);
            double area_already_painted = painted_areas.containsKey(colour) ? painted_areas.get(colour) : 0;
            System.out.println("Already painted " + area_already_painted);
            double remaining_unpainted_area = Math.max(remaining_wall_area - area_already_painted, 0);
            System.out.println("Remaining unpainted " + remaining_unpainted_area);
            double total_paint_volume = remaining_unpainted_area / 5.0;
            System.out.println("total paint volume " + total_paint_volume);
            double coloured_paint_cost = total_paint_volume * cost_per_litre;
            System.out.println("coloured_paint_cost " + coloured_paint_cost);
            total_paint_cost += coloured_paint_cost;
        }
        return total_paint_cost;
    }

    public static double calculatePaintCost(Map<String, Double> paint_costs, Map<String, Double> painted_areas, double doors_area, double window_area, double wall_area, double ceiling_area) {
        double total_paint_cost = 0;
        double remaining_wall_area = wall_area - (window_area + doors_area);
        remaining_wall_area += ceiling_area;
        for (String colour : paint_costs.keySet()) {
            double cost_per_litre = paint_costs.get(colour);
            double area_already_painted = painted_areas.containsKey(colour) ? painted_areas.get(colour) : 0;
            double remaining_unpainted_area = Math.max(remaining_wall_area - area_already_painted, 0);
            double total_paint_volume = remaining_unpainted_area / 5.0;
            double coloured_paint_cost = total_paint_volume * cost_per_litre;
            System.out.println(coloured_paint_cost);
            total_paint_cost += coloured_paint_cost;

        }
        return total_paint_cost;
    }


}

