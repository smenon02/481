package test;
import java.util.Locale;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class testChartFactory {

    public JFreeChart testcreatePieChart(){
        return ChartFactory.createPieChart(
                "Pie Chart",
                createPieDataset(),
                true,
                true,
                false
        );

    }   

    public static JFreeChart testcreatePieChart1(){
        return ChartFactory.createPieChart(
                "Pie Chart",
                createPieDataset()
        );
    }   

    public static JFreeChart testcreatePieChart2(){
        return ChartFactory.createPieChart(
                "Pie Chart",
                createPieDataset(),
                true,
                true,
                Locale.getDefault()
        );

    }   

    public static JFreeChart testcreate2PieChart() {
        return ChartFactory.createPieChart(
                "Multiple Pie Chart",
                createPieDataset(),
                createPieDataset(),
                10,
                true,
                true,
                true,
                Locale.getDefault(),
                true,
                true
        );
    }

    public static JFreeChart testcreate2PieChart2() {
        return ChartFactory.createPieChart(
                "Multiple Pie Chart",
                createPieDataset(),
                createPieDataset(),
                10,
                true,
                true,
                true,
                true,
                true,
                true
        );
    }

    private static DefaultPieDataset createPieDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        
        // Add data to the dataset
        dataset.setValue("Category 1", 30);
        dataset.setValue("Category 2", 50);
        dataset.setValue("Category 3", 20);
    
        return dataset;
    }

    public static void main(String[] args){
        testcreatePieChart1();
    }    
 
}