package SpringPackage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Spring bean class с 2 зависимостями
 * ClassicalMusic classicalMusic;
 * RockMusic rockMusic;
 */
@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    /**
     * Метод возвращающий рандомную музыку
     * @param type
     */
    public void playMusic(EnumType type) {
        Random random = new Random();

        int randomNum = random.nextInt(4);

        switch (type) {
            case ROCK -> System.out.println(classicalMusic.getRandomSong().get(randomNum));
            case CLASSICAL -> System.out.println(rockMusic.getRandomSong().get(randomNum));
        }
    }

}
