package homework6;

import java.util.Objects;

public class Notebook {
  private String model;
  private String productSeries;
  private int id;
  private String ram;
  private String volumeHdd;
  private String operatingSystem;
  private String colorNotebook;

  private double price;
  @Override
  public String toString() {
    return "Notebook{" +
        "model='" + model + '\'' +
        ", productSeries='" + productSeries + '\'' +
        ", id=" + id +
        ", ram='" + ram + '\'' +
        ", volumeHdd='" + volumeHdd + '\'' +
        ", operatingSystem='" + operatingSystem + '\'' +
        ", colorNotebook='" + colorNotebook + '\'' +
        ", price=" + price +
        '}';
  }



  public double getPrice(){
    return price;
  }

  public String getModel() {
    return model;
  }

  public String getProductSeries() {
    return productSeries;
  }

  public String getRam() {
    return ram;
  }

  public int getId() {
    return id;
  }
  public String getVolumeHdd() {
    return volumeHdd;
  }

  public String getOperatingSystem() {
    return operatingSystem;
  }

  public String getColorNotebook() {
    return colorNotebook;
  }

  public void setPrice(double price){
    this.price = price;
  }
  public void setModel(String model) {
    this.model = model;
  }
  public void setId(int id) {
    this.id = id;
  }
  public void setProductSeries(String productSeries) {
    this.productSeries = productSeries;
  }

  public void setRam(String ram) {
    this.ram = ram;
  }

  public void setVolumeHdd(String volumeHdd) {
    this.volumeHdd = volumeHdd;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public void setColorNotebook(String colorNotebook) {
    this.colorNotebook = colorNotebook;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notebook notebook = (Notebook) o;
    return id == notebook.id && ram.equals(notebook.ram) && volumeHdd.equals(notebook.volumeHdd)
        && model.equals(notebook.model) && productSeries.equals(notebook.productSeries)
        && operatingSystem.equals(notebook.operatingSystem) && colorNotebook.equals(
        notebook.colorNotebook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, productSeries, ram, volumeHdd,
        operatingSystem, colorNotebook, 27);
  }
}
