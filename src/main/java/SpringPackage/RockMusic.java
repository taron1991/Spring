package SpringPackage;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Конкретная реализация музыки
 */
@Component("rockclass")
public class RockMusic implements Music {

    private String name;

    public RockMusic() {
    }


    /**
     * Реализаация абстрактного метода
     * @return строку
     */
    @Override
    public String getSong() {
        return "rock";
    }

    /**
     * Нестатическая инициализация Листа музыки
     * @return Лист песен
     */
    public List<String> getRandomSong() {
        List<String> classicalMusicList = new ArrayList<>();
        {
            classicalMusicList.add("rock1");
            classicalMusicList.add("rock2");
            classicalMusicList.add("rock3");

        }

        return classicalMusicList;
    }


    @Override
    public String toString() {
        return "RockMusic{" +
                "name='" + name + '\'' +
                '}';
    }
}
