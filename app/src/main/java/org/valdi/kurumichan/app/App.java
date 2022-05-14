package org.valdi.kurumichan.app;

import org.valdi.animedownloader.api.episode.Episode;
import org.valdi.animedownloader.api.episode.IEpisode;

public class App {

    public static void main(final String... args) {
        System.out.println("Hello kurumi-chan!");
        final IEpisode e = new Episode("id_1", "https://www.website.com/episode_list/1");
        e.setDownloadLink("https://www.website.com/episode_list/1/download/episode.mp4");
        e.setFilename("file_name.mp4");
        System.out.println(e);
    }

}
