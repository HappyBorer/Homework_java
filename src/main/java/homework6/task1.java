package homework6;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
// Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить
// в Map. Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// 3.1. Далее нужно запросить минимальные значения для указанных критериев - сохранить
// параметры фильтрации можно также в Map.
// 4. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.util.HashSet;
import java.util.Set;

public class task1 {

  public static void main(String[] args) {
    Notebook notebook1 = new Notebook();
    notebook1.setModel("Huawei MateBook D 14");
    notebook1.setId(1);
    notebook1.setProductSeries("53013erk");
    notebook1.setOperatingSystem("Windows 11 Home");
    notebook1.setRam("8 ГБ");
    notebook1.setVolumeHdd("256 ГБ");
    notebook1.setColorNotebook("Серебристый");
    notebook1.setPrice(42990);

    Notebook notebook2 = new Notebook();
    notebook2.setModel("HIPER Workbook N1567");
    notebook2.setId(4);
    notebook2.setProductSeries("n1567rh5wi");
    notebook2.setOperatingSystem("Windows 10 Professional");
    notebook2.setRam("16 ГБ");
    notebook2.setVolumeHdd("512 ГБ");
    notebook2.setColorNotebook("Серебристый");
    notebook2.setPrice(49990);

    Notebook notebook3 = new Notebook();
    notebook3.setModel("A-Data XPG XENIA 14");
    notebook3.setId(2);
    notebook3.setProductSeries("xenia14i5g11gxelx-bkcru");
    notebook3.setOperatingSystem("Windows 10 Home");
    notebook3.setRam("16 ГБ");
    notebook3.setVolumeHdd("512 ГБ");
    notebook3.setColorNotebook("Черный");
    notebook3.setPrice(74990);

    Notebook notebook4 = new Notebook();
    notebook4.setModel("Huawei MateBook D 15");
    notebook4.setId(3);
    notebook4.setProductSeries("53013ert");
    notebook4.setOperatingSystem("Windows 11 Home");
    notebook4.setRam("8 ГБ");
    notebook4.setVolumeHdd("256 ГБ");
    notebook4.setColorNotebook("Серебристый");
    notebook4.setPrice(44990);

    Notebook notebook5 = new Notebook();
    notebook5.setModel("MSI GF63 Thin 11UD-206XRU");
    notebook5.setId(5);
    notebook5.setProductSeries("9s7-16r612-206");
    notebook5.setOperatingSystem("Free DOS");
    notebook5.setRam("16 ГБ");
    notebook5.setVolumeHdd("512 ГБ");
    notebook5.setColorNotebook("Черный");
    notebook5.setPrice(79990);

    Set<Notebook> set = new HashSet<>();
    set.add(notebook1);
    set.add(notebook2);
    set.add(notebook3);
    set.add(notebook4);
    set.add(notebook5);

    for (Notebook n : set) {
      System.out.println(n.toString());
    }
  }
}
