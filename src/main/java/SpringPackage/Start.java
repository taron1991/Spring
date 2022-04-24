package SpringPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * класс с мейн методом(запуск)
 */
public class Start {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(Config.class);
        MusicPlayer bean = applicationContext1.getBean(MusicPlayer.class);
        bean.playMusic(EnumType.ROCK);


    }

}
