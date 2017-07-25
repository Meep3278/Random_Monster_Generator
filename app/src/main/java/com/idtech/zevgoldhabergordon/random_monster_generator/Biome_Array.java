package com.idtech.zevgoldhabergordon.random_monster_generator;

/**
 * Created by idstudent on 7/25/17.
 */

public class Biome_Array {
    public static void main (String args[]) {
        Biome myBiome;

        Biome[] biomeArray = new Biome[20];
        Biome Tundra_One = new Biome("Tundra", "All fire damage is reduced by one due to the extreme cold.");
        biomeArray[0] = Tundra_One;
        Biome Tundra_Two = new Biome("Tundra", "People die after one minute on the ground due to frostbite.");
        biomeArray[1] = Tundra_Two;
        Biome Tundra_Three = new Biome("Tundra", "All walking must be done with completely straight legs(goose-walking only) due to heavy snowfall.");
        biomeArray[2] = Tundra_Three;
        Biome Tundra_Four = new Biome("Tundra", "It is a perfectly clear day. No hiding.");
        biomeArray[3] = Tundra_Four;
        Biome Forest_One = new Biome("Forest", "Animals are strongest on their own terrain. All animals in this encounter have +1/+1.");
        biomeArray[4] = Forest_One;
        Biome Forest_Two = new Biome("Forest", "Place 4 objects on random places on the field, these are easily climbed tree(5 secs up and down), only one person can be in a tree at once.");
        biomeArray[5] = Forest_Two;
        Biome Forest_Three = new Biome("Forest", "Medicinal Herbs scattered around make first aid take 10 secs instead of 20, 5 with 2 people.");
        biomeArray[6] = Forest_Three;
        Biome Forest_Four = new Biome("Forest", "Axes deal +1 damage this encounter(due to breaking through the leaves etc. quicker)");
        biomeArray[7] = Forest_Four;
        Biome Savanna_One = new Biome("Savanna", "The heat is wearying, Resist and other effects that prevent being knocked out are ineffective.");
        biomeArray[8] = Savanna_One;
        Biome Savanna_Two = new Biome("Savanna", "The wide open space makes it easier to run face first at enemies. Charge, Trample, and Rages are all double duration.");
        biomeArray[9] = Savanna_Two;
        Biome Savanna_Three = new Biome("Savanna", "Vicious beasts stalk this plane and will hunt any easy prey. Anyone who makes noise louder than normal talking is immediately knocked out.");
        biomeArray[10] = Savanna_Three;
        Biome Savanna_Four = new Biome("Savanna", "The long grass brushes on your armor, and you take it off. Everyone can get hit below the knees, even if they have armor.");
        biomeArray[11] = Savanna_Four;
        Biome Mountain_One = new Biome("Mountain", "The thin air makes any disturbance dangerous. Stun and Root instantly knock out instead.");
        biomeArray[12] = Mountain_One;
        Biome Mountain_Two = new Biome("Mountain", "The crags and peaks make hiding easy. Hiding takes 2 seconds instead of 5.");
        biomeArray[13] = Mountain_Two;
        Biome Mountain_Three = new Biome("Mountain", "The slippery rocks makes moving precarious. If both feat are off the ground at any time, instantly knock out.");
        biomeArray[14] = Mountain_Three;
        Biome Mountain_Four = new Biome("Mountain", "The heavy pelts of this area help protect against invaders. All monster armor classes are increased by one, if they already have full plate, it is unbreachable.");
        biomeArray[15] = Mountain_Four;
        Biome Swamp_One = new Biome("Swamp", "A poisonous disease lurks in this swamp. After the encounter, if you were knocked out and you roll under a 25 on a d100, get a disease of the GM's choice.");
        biomeArray[16] = Swamp_One;
        Biome Swamp_Two = new Biome("Swamp", "The large quantities of muck here make slashing not very effective. All edged weapons deal -1 damage.");
        biomeArray[17] = Swamp_Two;
        Biome Swamp_Three = new Biome("Swamp", "The swamp is very thick, restricting all movement to a walk. If you have Iceball, you may walk as normal.");
        biomeArray[18] = Swamp_Three;
        Biome Swamp_Four = new Biome("Swamp", "Monsters are adapted to the strange, murky landscape. All monsters gain hiding.");
        biomeArray[19] = Swamp_Four;

        switch(biome){
            int type;

            case 0:
                myBiome = new Biome("Tundra",biomeArray[(int) Math.floor(Math.random()*4)].abilities);
                break;
            case 1:
                myBiome = new Biome("Forest",biomeArray[(int) Math.floor(Math.random()*4) + 4].abilities);
                break;
            case 2:
                myBiome = new Biome("Savanna",biomeArray[(int) Math.floor(Math.random()*4) + 8].abilities);
                break;
            case 3:
                myBiome = new Biome("Mountain",biomeArray[(int) Math.floor(Math.random()*4) + 12].abilities);
                break;
            case 4:
                myBiome = new Biome("Swamp",biomeArray[(int) Math.floor(Math.random()*4) + 16].abilities);
                break;
            default:
                type = (int) Math.floor(Math.random()*20);
                myBiome = new Biome(biomeArray[type].type,biomeArray[type].abilities);
                break;
        }

    }
}
