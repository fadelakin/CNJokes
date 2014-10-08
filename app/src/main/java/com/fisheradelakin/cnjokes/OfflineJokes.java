package com.fisheradelakin.cnjokes;

import java.util.Random;

/**
 * Created by Fisher on 10/8/14.
 */
public class OfflineJokes {

    public String[] mJokes = {
            "MacGyver can build an airplane out of gum and paper clips. Chuck Norris can kill him and take it.",
            "Chuck Norris doesn't read books. He stares them down until he gets the information he wants.",
            "If you ask Chuck Norris what time it is, he always answers \"Two seconds till\". After you ask \"Two seconds to what?\", he roundhouse kicks you in the face.",
            "Since 1940, the year Chuck Norris was born, roundhouse kick related deaths have increased 13,000 percent.",
            "Chuck Norris sheds his skin twice a year.",
            "When Chuck Norris goes to donate blood, he declines the syringe, and instead requests a hand gun and a bucket.",
            "In an average living room there are 1,242 objects Chuck Norris could use to kill you, including the room itself.",
            "Chuck Norris doesn't shower, he only takes blood baths.",
            "Time waits for no man. Unless that man is Chuck Norris.",
            "Chuck Norris has two speeds: Walk and Kill.",
            "If you spell Chuck Norris in Scrabble, you win. Forever.",
            "Chuck Norris is the only man to ever defeat a brick wall in a game of tennis.",
            "There is no theory of evolution, just a list of creatures Chuck Norris allows to live.",
            "The quickest way to a man's heart is with Chuck Norris' fist.",
            "Chuck Norris drives an ice cream truck covered in human skulls.",
            "The Great Wall of China was originally created to keep Chuck Norris out. It failed miserably.",
            "When Chuck Norris calls 1-900 numbers, he doesn't get charged. He holds up the phone and money falls out.",
            "There are no races, only countries of people Chuck Norris has beaten to different shades of black and blue.",
            "Chuck Norris' house has no doors, only walls that he walks through.",
            "How much wood would a woodchuck chuck if a woodchuck could Chuck Norris? All of it.",
            "If tapped, a Chuck Norris roundhouse kick could power the country of Australia for 44 minutes.",
            "Chuck Norris can believe it's not butter.",
            "Chuck Norris doesn't actually write books, the words assemble themselves out of fear.",
            "Chuck Norris invented his own type of karate. It's called Chuck-Will-Kill.",
            "When Chuck Norris talks, everybody listens. And dies.",
            "Contrary to popular belief, there is indeed enough Chuck Norris to go around.",
            "Chuck Norris always knows the EXACT location of Carmen SanDiego.",
            "When taking the SAT, write \"Chuck Norris\" for every answer. You will score over 8000.",
            "When you're Chuck Norris, anything + anything is equal to 1. One roundhouse kick to the face.",
            "Chuck Norris invented black. In fact, he invented the entire spectrum of visible light. Except pink. Tom Cruise invented pink.",
            "On his birthday, Chuck Norris randomly selects one lucky child to be thrown into the sun.",
            "Chuck Norris doesn't throw up if he drinks too much. Chuck Norris throws down!",
            "Chuck Norris has 12 moons. One of those moons is the Earth.",
            "Chuck Norris grinds his coffee with his teeth and boils the water with his own rage.",
            "Chuck Norris ordered a Big Mac at Burger King, and got one.",
            "Chuck Norris can drink an entire gallon of milk in thirty-seven seconds.",
            "Chuck Norris doesn't bowl strikes, he just knocks down one pin and the other nine faint.",
            "It takes Chuck Norris 20 minutes to watch 60 Minutes.",
            "Chuck Norris doesn't believe in Germany.",
            "When Chuck Norris is in a crowded area, he doesn't walk around people. He walks through them.",
            "Chuck Norris once ate an entire bottle of sleeping pills. They made him blink.",
            "Chuck Norris can touch MC Hammer.",
            "Chuck Norris played Russian Roulette with a fully loaded gun and won.",
            "Some people wear Superman pajamas. Superman wears Chuck Norris pajamas."
    };

    public String getJoke() {

        String joke;
        // Randomly select a joke
        Random randomGenerator = new Random(); // random number generator
        int randomNumber = randomGenerator.nextInt(mJokes.length);

        joke = mJokes[randomNumber];

        return joke;
    }
}
