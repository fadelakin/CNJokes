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
            "Some people wear Superman pajamas. Superman wears Chuck Norris pajamas.",
            "A man once asked Chuck Norris if his real name is \"Charles\". Chuck Norris did not respond, he simply stared at him until he exploded.",
            "In a tagteam match, Chuck Norris was teamed with Hulk Hogan against King Kong Bundy and Andre The Giant. He pinned all 3 at the same time.",
            "For undercover police work, Chuck Norris pins his badge underneath his shirt, directly into his chest.",
            "We live in an expanding universe. All of it is trying to get away from Chuck Norris.",
            "Chuck Norris has never won an Academy Award for acting... because he's not acting.",
            "Godzilla is a Japanese rendition of Chuck Norris' first visit to Tokyo.",
            "\"Sweating bullets\" is literally what happens when Chuck Norris gets too hot.",
            "Chuck Norris doesn't daydream. He's too busy giving other people nightmares.",
            "Chuck Norris once participated in the running of the bulls. He walked.",
            "For Spring Break '05, Chuck Norris drove to Madagascar, riding a chariot pulled by two electric eels.",
            "Chuck Norris has banned rainbows from the state of North Dakota.",
            "Only Chuck Norris can prevent forest fires.",
            "Chuck Norris crossed the road. No one has ever dared question his motives.",
            "Chuck Norris hosting is 101% uptime guaranteed.",
            "Chuck Norris can binary search unsorted data.",
            "Chuck Norris breaks RSA 128-bit encrypted codes in milliseconds.",
            "Chuck Norris doesn't needs try-catch, exceptions are too afraid to raise.",
            "Chuck Norris went out of an infinite loop.",
            "If Chuck Norris writes code with bugs, the bugs fix themselves.",
            "Chuck Norris can access the DB from the UI.",
            "Chuck Norris' programs never exit, they terminate.",
            "Chuck Norris insists on strongly-typed programming languages.",
            "Chuck Norris protocol design method has no status, requests or responses, only commands.",
            "Chuck Norris can spawn threads that complete before they are started.",
            "Chuck Norris can install iTunes without installing Quicktime.",
            "Chuck Norris can compile syntax errors.",
            "Chuck Norris does not need to type-cast. The Chuck-Norris Compiler (CNC) sees through things. All way down. Always.",
            "Chuck Norris does not code in cycles, he codes in strikes.",
            "Chuck Norris doesn't use a computer because a computer does everything slower than Chuck Norris.",
            "Chuck Norris compresses his files by doing a flying round house kick to the hard drive.",
            "With Chuck Norris P = NP. There's no nondeterminism with Chuck Norris decisions.",
            "Chuck Norris doesn't use GUI, he prefers COMMAND line.",
            "No one has ever spoken during review of Chuck Norris' code and lived to tell about it.",
            "Chuck Norris can retrieve anything from /dev/null.",
            "Chuck Norris doesn't use Oracle, he is the Oracle.",
            "Chuck Norris finished World of Warcraft.",
            "When Chuck Norris break the build, you can't fix it, because there is not a single line of code left.",
            "If you try to kill -9 Chuck Norris's programs, it backfires.",
            "Chuck Norris can speak Braille.",
            "Chuck Norris knows the value of NULL, and he can sort by it too.",
            "Chuck Norris could use anything in java.util.* to kill you, including the javadocs.",
            "Chuck Norris killed two stones with one bird.",
            "Chuck Norris' unit tests don't run. They die.",
            "Chuck Norris doesn't need an account. He just logs in.",
            "Chuck Norris sits at the stand-up.",
            "Chuck Norris doesn't daydream. He's too busy giving other people nightmares."
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
