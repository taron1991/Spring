package SpringPackage;

import java.util.ArrayList;
import java.util.List;

/**
 * Интерфейс музыка
 */
public interface Music {

    /**
     * метод для функциональности
     * @return
     */
    String getSong();

    /**
     * Лист песен
     * @return радномная музыка
     */
    List<String> getRandomSong();
}
