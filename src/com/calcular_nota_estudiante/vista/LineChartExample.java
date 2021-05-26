/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calcular_nota_estudiante.vista;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author juanv
 */
public class LineChartExample extends JFrame {

  private static final long serialVersionUID = 1L;
  

  public LineChartExample(String title) {
    super(title);
    // Create dataset
    DefaultCategoryDataset dataset = createDataset();
    // Create chart
    JFreeChart chart = ChartFactory.createLineChart(
        "Promedio de los Estudiantes de Ingenieria de Sistemas",
        "Semestre",
        "Promedio",
        dataset
        );

    ChartPanel panel = new ChartPanel(chart);
    setContentPane(panel);
  }


  private DefaultCategoryDataset createDataset() {

    String series1 = "Quinto Semestre     ";
    String series2 = "Sexto semestre";

    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    dataset.addValue(200, series1, "2016-12-19");
    dataset.addValue(150, series1, "2016-12-20");
    dataset.addValue(100, series1, "2016-12-21");
    dataset.addValue(210, series1, "2016-12-22");
    dataset.addValue(240, series1, "2016-12-23");
    dataset.addValue(195, series1, "2016-12-24");
    dataset.addValue(245, series1, "2016-12-25");

    dataset.addValue(150, series2, "2016-12-19");
    dataset.addValue(130, series2, "2016-12-20");
    dataset.addValue(95, series2, "2016-12-21");
    dataset.addValue(195, series2, "2016-12-22");
    dataset.addValue(200, series2, "2016-12-23");
    dataset.addValue(180, series2, "2016-12-24");
    dataset.addValue(230, series2, "2016-12-25");

    return dataset;
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      LineChartExample example = new LineChartExample("Line Chart Example");
      example.setAlwaysOnTop(true);
      example.pack();
      example.setSize(600, 400);
      example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      example.setVisible(true);
    });
  }
}