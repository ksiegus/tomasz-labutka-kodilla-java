package com.kodilla.patterns.strategy.social;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User tomasz = new Millenials("Tomasz Tomaszewski");
        User maciej = new YGeneration("Maciej Maciejewski");
        User michal = new ZGeneration("Michal Michalowski");

        //When
        String tomaszSharePost = tomasz.sharePost();
        System.out.println("Tomasz should: " + tomaszSharePost);
        String maciejSharePost = maciej.sharePost();
        System.out.println("Maciej should: " + maciejSharePost);
        String michalSharePost = michal.sharePost();
        System.out.println("Michal should: " + michalSharePost);

        //Then
        assertEquals("[FacebookPublisher] share in Facebook", tomaszSharePost);
        assertEquals("[TwitterPublisher] share in Twitter", maciejSharePost);
        assertEquals("[SnapchatPublisher] share in Snapchat", michalSharePost);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User tomasz = new Millenials("Tomasz Tomaszewski");

        //When
        String tomaszSharePost = tomasz.sharePost();
        System.out.println("Tomasz should: " + tomaszSharePost);
        tomasz.setShareStrategy(new TwitterPublisher());
        tomaszSharePost = tomasz.sharePost();
        System.out.println("Tomasz now should: " + tomaszSharePost);

        //Then
        assertEquals("[TwitterPublisher] share in Twitter", tomaszSharePost);
    }
}