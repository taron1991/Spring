package SpringPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Конкретная реализация музыки
 */
@Component("classicClass")
public class ClassicalMusic implements Music {

    private String name;

    public ClassicalMusic() {
    }

    /**
     * Нестатическая инициализация Листа музыки
     * @return Лист песен
     */
   public List<String> getRandomSong() {
        List<String> classicalMusicList = new ArrayList<>();
        {
            classicalMusicList.add("classic11");
            classicalMusicList.add("classic2");
            classicalMusicList.add("classic3");

        }

       return classicalMusicList;
    }

    /**
     * Реализаация абстрактного метода
     * @return строку
     */
    @Override
    public String getSong() {
        return "classic";
    }

    @Override
    public String toString() {
        return "ClassicalMusic{" +
                "name='" + name + '\'' +
                '}';
    }
}
