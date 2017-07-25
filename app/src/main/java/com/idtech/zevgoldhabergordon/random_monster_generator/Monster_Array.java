package com.idtech.zevgoldhabergordon.random_monster_generator;

/**
 * Created by idstudent on 7/19/17.
 */

public class Monster_Array {
    public static void main (String[] args){
        Monster myMonster;
        int monsterIndex;
        Monster[] monsterArray = new Monster[66];
        Monster Bandit = new Monster("Bandit", 0, 0, 0, "Common street thugs searching for money. Mostly found in groups.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[32] = Bandit;
        monsterArray[32].p = playerRank;
        monsterArray[32].numEnemies = enemNum;
        monsterArray[32].health = (int) Math.ceil(monsterArray[32].p*monsterArray[32].e/monsterArray[32].numEnemies);
        monsterArray[32].damage = (int) Math.floor(monsterArray[32].p*monsterArray[32].e/4);
        monsterArray[32].armor = (int) Math.floor(monsterArray[32].e/2);
        if(monsterArray[32].p*monsterArray[32].e >=8){
            monsterArray[32].powers = "Steal, Hiding";
        } else if(monsterArray[32].p*monsterArray[32].e >=4){
            monsterArray[32].powers = "Steal";
        }

        Monster Goblin = new Monster("Goblin", 0, 0, 0, "Small evil humanoids that are under Blin.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[24] = Goblin;
        monsterArray[24].p = playerRank;
        monsterArray[24].numEnemies = enemNum;
        monsterArray[24].health = (int) Math.ceil(Math.floor(monsterArray[23].p*monsterArray[23].e*2/3)/monsterArray[23].numEnemies);
        monsterArray[24].damage = (int) Math.floor(monsterArray[24].p*monsterArray[24].e/2);
        monsterArray[24].armor = monsterArray[24].e/-3;
        Monster Orc = new Monster("Orc", 0, 0, 0, "Evil humanoid creatures.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);

        monsterArray[25] = Orc;
        monsterArray[25].p = playerRank;
        monsterArray[25].numEnemies = enemNum;
        monsterArray[25].health = (int) Math.ceil(monsterArray[25].p*(monsterArray[25].e+1)/monsterArray[25].numEnemies);
        monsterArray[25].damage = (int) Math.ceil(monsterArray[25].p*(monsterArray[25].e+1)/4);
        monsterArray[25].armor = (int) Math.floor((monsterArray[25].e+1)/2);
        if(monsterArray[25].p*monsterArray[25].e >=12){
            monsterArray[25].powers = "+5 Damage from fire, Resist, Charge, Regeneration full(" + (30-monsterArray[25].e) + ")";
        } else if(monsterArray[25].p*monsterArray[25].e >=7){
            monsterArray[25].powers = "+5 Damage from fire, Resist, Charge";
        } else if(monsterArray[25].p*monsterArray[25].e >=3){
            monsterArray[25].powers = "+5 Damage from fire, Resist";
        } else{
            monsterArray[25].powers = "+5 Damage from fire";
        }
        Monster Ogre = new Monster("Ogre", 0, 0, 0, "Large evil humanoids with a thirst for destruction.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[26] = Ogre;
        monsterArray[26].p = playerRank;
        monsterArray[26].numEnemies = enemNum;
        monsterArray[26].health = (int) Math.ceil(monsterArray[26].p*monsterArray[26].e/monsterArray[26].numEnemies);
        monsterArray[26].damage = (int) Math.ceil(monsterArray[26].p*monsterArray[26].e/3);
        monsterArray[26].armor = (int) Math.floor((monsterArray[26].e+2)/2);
        if(monsterArray[26].p*monsterArray[26].e >=10){
            monsterArray[26].powers = "Trample";}
        monsterArray[26].notes = "Trample lasts for 10 seconds";
        Monster Dark_Archer = new Monster("Dark Archer", 0, 0, 0, "Archers corrupted by evil or pay.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[27] = Dark_Archer;
        monsterArray[27].p = playerRank;
        monsterArray[27].numEnemies = enemNum;
        monsterArray[27].health = (int) Math.ceil(Math.floor(monsterArray[27].p*(monsterArray[27].e)/2)/monsterArray[27].numEnemies);
        monsterArray[27].damage = (int) Math.ceil(monsterArray[27].p*monsterArray[27].e/2);
        monsterArray[27].armor = (int) Math.floor(monsterArray[27].e/4);
        if(monsterArray[27].p*monsterArray[27].e >=8){
            monsterArray[27].powers = "AP arrows, +" + monsterArray[27].e + "damage if you stand stationary for 10 seconds";
        } else if(monsterArray[27].p*monsterArray[27].e >=5){
            monsterArray[27].powers = "AP arrows";
        }
        Monster Dark_Knight = new Monster("Dark Knight", 0, 0, 0, "Evil knights, with armor stuck to their bodies.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[28] = Dark_Knight;
        monsterArray[28].p = playerRank;
        monsterArray[28].numEnemies = enemNum;
        monsterArray[28].health = (int) Math.ceil(Math.floor(monsterArray[28].p*(monsterArray[28].e)*3)/monsterArray[28].numEnemies);
        monsterArray[28].damage = (int) Math.ceil(monsterArray[28].p*monsterArray[28].e/4);
        monsterArray[28].armor = monsterArray[28].e;
        monsterArray[28].powers = "Rank " + Math.ceil(monsterArray[28].e*monsterArray[28].p/2) + " Armored Knight";

        Monster Goblin_Grenadier = new Monster("Goblin Grenadier", 0, 0, 0, "Small evil humanoids armed with bombs.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[29] = Goblin_Grenadier;
        monsterArray[29].p = playerRank;
        monsterArray[29].numEnemies = enemNum;
        monsterArray[29].health = (int) Math.ceil(monsterArray[29].p*monsterArray[29].e/monsterArray[29].numEnemies);
        monsterArray[29].damage = (int) Math.ceil(monsterArray[29].p*monsterArray[29].e/6);
        monsterArray[29].armor = 0;
        if(monsterArray[29].p*monsterArray[29].e >=9){
            monsterArray[29].powers = "Bombs (" + monsterArray[29].e + " damage 5 foot radius thrown packet), Martyrdom (" + (monsterArray[29].e + 2) + " damage explosion in 5 foot radius on death";
        } else if(monsterArray[29].p*monsterArray[29].e >=4){
            monsterArray[29].powers = "Bombs (" + monsterArray[29].e + " damage 5 foot radius thrown packet)";
        }
        Monster Gargoyle = new Monster("Gargoyle", 0, 0, 0, "Large evil winged creatures. Can turn into stone statues to avoid detection.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[30] = Gargoyle;
        monsterArray[30].p = playerRank;
        monsterArray[30].numEnemies = enemNum;
        monsterArray[30].health = (int) Math.ceil(monsterArray[30].p*monsterArray[30].e*2/monsterArray[30].numEnemies);
        monsterArray[30].damage = (int) Math.ceil(monsterArray[30].p*monsterArray[30].e/4);
        monsterArray[30].armor = monsterArray[30].e+1;
        if(monsterArray[30].p*monsterArray[30].e >=6){
            monsterArray[30].powers = "Claw, Bite(2ap), Flying";
        } else if(monsterArray[30].p*monsterArray[27].e >=4) {
            monsterArray[30].powers = "Claw, Bite(2ap)";
        } else{
            monsterArray[30].powers  = "Claw";
        }
        monsterArray[30].notes = "Most of the time gargoyles will start as statues, meaning they aren’t creatures that can be interacted with, rather just part of the environment."
        Monster Wolf = new Monster("Wolf", 0, 0, 0, "Feral Animals.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[31] = Wolf;
        monsterArray[31].p = playerRank;
        monsterArray[31].numEnemies = enemNum;
        monsterArray[31].health = (int) Math.ceil(monsterArray[31].p*monsterArray[31].e/monsterArray[31].numEnemies);
        monsterArray[31].damage = (int) Math.ceil(monsterArray[31].p*monsterArray[31].e/4);
        monsterArray[31].armor = monsterArray[31].e-2;
        if(monsterArray[31].p*monsterArray[31].e >=12){
            monsterArray[31].powers = "Claw, Bite(2ap), Devour(" + (30-monsterArray[31].e) + " seconds), Roar, Rider has +5 health";
        } else if(monsterArray[31].p*monsterArray[31].e >=8){
            monsterArray[31].powers = "Claw, Bite(2ap), Devour(" + (30-monsterArray[31].e) + " seconds), Roar";
        } else if(monsterArray[31].p*monsterArray[31].e >=5){
            monsterArray[31].powers = "Claw, Bite(2ap), Devour(" + (30-monsterArray[31].e) + " seconds)";
        } else if(monsterArray[31].p*monsterArray[31].e >=3){
            monsterArray[31].powers = "Claw, Bite(2ap)";
        } else{
            monsterArray[31].powers = "Claw";
        } monsterArray[31].notes = "If devour time is zero, then it is insta-devour instead.";
        Monster Hell_Hound = new Monster("Hell Hound", 0, 0, 0, "Large wolves made out of molten lava.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[1] = Hell_Hound;
        monsterArray[1].p = playerRank;
        monsterArray[1].numEnemies = enemNum;
        monsterArray[1].health = monsterArray[1].p*monsterArray[1].e;
        monsterArray[1].damage = monsterArray[1].p*monsterArray[27].e;
        monsterArray[1].armor = monsterArray[1].e*2;
        if(monsterArray[1].p*monsterArray[1].e >=10){
            monsterArray[1].powers = "Claw(" + monsterArray[1].e + " hellfire), Devour(" + (15 - monsterArray[1].e) + " secs), Bite(" + monsterArray[1].p + " AP), Hellfire Breath(Ten foot cone, " + monsterArray[1].e + " fire damage), Combustion(on death, 15 foot explosion, " + monsterArray[1].e + " fire damage)";
        } else if(monsterArray[27].p*monsterArray[1].e >=5){
            monsterArray[1].powers = "Claw(" + monsterArray[1].e + " hellfire), Devour(" + (15 - monsterArray[1].e) + " secs), Bite(" + monsterArray[1].p + " AP)";
        } else{monsterArray[1].powers = "Claw(" + monsterArray[1].e + " hellfire), Devour(" + (15 - monsterArray[1].e) + " secs)";
        }
        monsterArray[1].notes = "Leader(Only 1 of these in an encounter), If devour time is zero, then it is insta-devour instead.";
        Monster Orc_Shaman = new Monster("Orc Shaman", 0, 0, 0, "Evil humanoids that heal their allies.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[2] = Orc_Shaman;
        monsterArray[2].p = playerRank;
        monsterArray[2].numEnemies = enemNum;
        monsterArray[2].health = monsterArray[2].e + 1;
        monsterArray[2].damage = 1;
        monsterArray[2].armor = 0;
        if(monsterArray[2].p*monsterArray[2].e >=8){
            monsterArray[2].powers = "+5 damage from fire, Healing ray, Healing aura(10 foot radius, " + (60 - monsterArray[2].e*monsterArray[2].p) + " second cd";
        } else if(monsterArray[2].p*monsterArray[2].e >=2){
            monsterArray[2].powers = "+5 damage from fire, Healing ray";
        } else{
            monsterArray[2].powers = "+5 damage from fire";
        } monsterArray[2].notes = "Leader(Only 1 of these in an encounter)";

        Monster Troll = new Monster("Troll", 0, 0, 0, "Large capitalist humanoids that live sometimes under bridges.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[33] = Troll;
        monsterArray[33].p = playerRank;
        monsterArray[33].numEnemies = enemNum;
        monsterArray[33].health = (int) Math.ceil(monsterArray[33].p*(monsterArray[33].e)*2/monsterArray[33].numEnemies);
        monsterArray[33].damage = (int) Math.ceil(monsterArray[33].p*monsterArray[33].e/3);
        monsterArray[33].armor = monsterArray[33].e-1;
        if(monsterArray[33].p*monsterArray[33].e >=10){
            monsterArray[33].powers = "+5 damage from fire(stops regeneration), Regen " + monsterArray[33].e + " hp every " + (20-monsterArray[33].e*monsterArray[33].p) + "seconds, Trample";
        } else if(monsterArray[33].p*monsterArray[33].e >=5){
            monsterArray[33].powers = "+5 damage from fire(stops regeneration), Regen " + monsterArray[33].e + " hp every " + (20-monsterArray[33].e*monsterArray[33].p) + "seconds";
        } else{
            monsterArray[33].powers = "+5 damage from fire";
        } monsterArray[33].notes = "Trample lasts for 10 seconds.";
        Monster Giant_Spider = new Monster("Giant Spider", 0, 0, 0, "Large, vicious, territorial spiders.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[34] = Giant_Spider;
        monsterArray[34].p = playerRank;
        monsterArray[34].numEnemies = enemNum;
        monsterArray[34].health = (int) Math.ceil(Math.floor(monsterArray[34].p*(monsterArray[34].e)*3/2)/monsterArray[34].numEnemies);
        monsterArray[34].damage = (int) Math.ceil(monsterArray[34].p*monsterArray[34].e/4);
        monsterArray[34].armor = (monsterArray[34].e-2);
        if(monsterArray[34].p*monsterArray[34].e >=5){
            monsterArray[34].powers = "AP Bite";
        } else{
            monsterArray[34].powers = "Bite";
        } monsterArray[34].notes = "Bite deals dmg equal to the giant spider's dmg";
        Monster Spider_Mother = new Monster("Spider Mother", 0, 0, 0, "Large Spiders that create other spiders.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[0] = Spider_Mother;
        monsterArray[0].p = playerRank;
        monsterArray[0].numEnemies = enemNum;
        monsterArray[0].health = (monsterArray[0].p*monsterArray[0].e);
        monsterArray[0].damage = (int) Math.ceil(monsterArray[0].p*monsterArray[0].e/2);
        monsterArray[0].armor = (monsterArray[0].e-2);
        if(monsterArray[0].p*monsterArray[0].e >=7){
            monsterArray[0].powers = "AP Bite, Stun Bite, Summon Spider Hatchling(reinforce " + monsterArray[0].e + " times as as spider hatchling), devour in " + (20 - monsterArray[0].e*monsterArray[0].p) + " seconds";
        } else if(monsterArray[0].p*monsterArray[0].e >=5){
            monsterArray[0].powers = "AP Bite, Stun Bite, devour in " + (20 - monsterArray[0].e*monsterArray[0].p) + " seconds";
        } else{
            monsterArray[0].powers = "Bite";
        }
            monsterArray[0].notes = "Leader(only one in the encounter), Bite deals dmg equal to the spider's dmg, spider hatchling is a " + monsterArray[0].p + " health, " + Math.ceil(monsterArray[0].p/3) + " damage spider with bite and no armor, If devour time is zero, then it is insta-devour instead.";
        Monster Spider_Hatchling = new Monster("Spider_Hatchling", 0, 0, 0, "Small spiders that are created by Spider Matriarchs.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[45] = Spider_Hatchling;
        monsterArray[45].p = playerRank;
        monsterArray[45].numEnemies = enemNum;
        monsterArray[45].health = monsterArray[45].p;
        monsterArray[45].damage = (int) Math.ceil(monsterArray[45].e/3);
        monsterArray[45].armor = 0;
        if(monsterArray[45].p*monsterArray[45].e >=5){
            monsterArray[45].powers = "AP Bite";
        } else{
            monsterArray[45].powers = "Bite";
        } monsterArray[45].notes = "Bite deals dmg equal to the giant spider's dmg";
        Monster Troll_Warrior = new Monster("Troll Warrior", 0, 0, 0, "Large capitalist humanoids that live to fight.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[35] = Troll_Warrior;
        monsterArray[35].p = playerRank;
        monsterArray[35].numEnemies = enemNum;
        monsterArray[35].health = (int) Math.ceil(Math.floor(monsterArray[35].p*(monsterArray[35].e)*5/2)/monsterArray[35].numEnemies);
        monsterArray[35].damage = (int) Math.ceil(monsterArray[35].p*monsterArray[35].e/2);
        monsterArray[35].armor = (monsterArray[35].e);
        if(monsterArray[35].p*monsterArray[35].e >=12){
            monsterArray[35].powers = "+3 damage from fire(stop regen),  regen " + monsterArray[35].e + " hp per " + (20-monsterArray[35].e*monsterArray[35].p) + " seconds, Attacks are ap, Trample, Earthquake(stun aura, 10 ft)";
        } else if (monsterArray[35].p*monsterArray[35].e >=10){
            monsterArray[35].powers = "+3 damage from fire(stop regen),  regen " + monsterArray[35].e + " hp per " + (20-monsterArray[35].e*monsterArray[35].p) + " seconds, Attacks are ap, Trample";
        } else if(monsterArray[35].p*monsterArray[35].e >= 5){
            monsterArray[35].powers = "+3 damage from fire(stop regen),  regen " + monsterArray[35].e + " hp per " + (20-monsterArray[35].e*monsterArray[35].p) + " seconds, Attacks are ap";
        } else if(monsterArray[35].p*monsterArray[35].e >= 3){
            monsterArray[35].powers = "+3 damage from fire(stop regen),  regen " + monsterArray[35].e + " hp per " + (20-monsterArray[35].e*monsterArray[35].p) + " seconds";
        } else{
            monsterArray[35].powers = "+3 damage from fire";
        }
        monsterArray[35].notes = "Trample lasts 10 seconds";
        Monster Troll_Chief = new Monster("Troll Chief", 0, 0, 0, "Large capitalist humanoids that command trolls.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[3] = Troll_Chief;
        monsterArray[3].p = playerRank;
        monsterArray[3].numEnemies = enemNum;
        monsterArray[3].health = (monsterArray[3].p*monsterArray[3].e);
        monsterArray[3].damage = (int) Math.ceil(monsterArray[3].p*monsterArray[3].e/2);
        monsterArray[3].armor = (monsterArray[3].e+1);
        if(monsterArray[3].p*monsterArray[3].e >=10){
            monsterArray[3].powers = "+5 damage from fire(stop regen), regen " + monsterArray[3].e + " hp per " + (20-monsterArray[3].e*monsterArray[3].p) + " seconds, Charge, Trample";
        } else if(monsterArray[3].p*monsterArray[3].e >=6){
            monsterArray[3].powers = "+5 damage from fire(stop regen), regen " + monsterArray[3].e + " hp per " + (20-monsterArray[3].e*monsterArray[3].p) + " seconds, Charge";
        } else if (monsterArray[3].p*monsterArray[3].e >= 3){
            monsterArray[3].powers = "+5 damage from fire(stop regen), regen " + monsterArray[3].e + " hp per " + (20-monsterArray[3].e*monsterArray[3].p) + " seconds";
        } else{
            monsterArray[3].powers = "+5 damage from fire";
        }
        monsterArray[3].notes = "Leader(only one in the encounter), Trample lasts 10 seconds";
        Monster Yeti = new Monster("Yeti", 0, 0, 0, "Large furry animals that come from the mountains", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[36] = Yeti;
        monsterArray[36].p = playerRank;
        monsterArray[36].numEnemies = enemNum;
        monsterArray[36].health = (int) Math.ceil(monsterArray[36].p*(monsterArray[36].e)*2/monsterArray[36].numEnemies);
        monsterArray[36].damage = (int) Math.ceil(monsterArray[36].p*monsterArray[36].e/2);
        monsterArray[36].armor = (monsterArray[36].e-1);
        if(monsterArray[36].p*monsterArray[36].e >=10){
            monsterArray[36].powers = "Claw, Bite for +1 damage, attacks are ap, Trample";
        } else if (monsterArray[36].p*monsterArray[36].e >=5){
            monsterArray[36].powers = "Claw, Bite for +1 damage, attacks are ap";
        } else if(monsterArray[36].p*monsterArray[36].e >= 3){
            monsterArray[36].powers = "Claw, Bite for +1 damage";
        } else{
            monsterArray[36].powers = "Claw";
        }monsterArray[36].notes = "Trample lasts 10 seconds";
        Monster Rocketeer = new Monster("Rocketeer", 0, 0, 0, "People wearing strange armor that allows them to fly.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[4] = Rocketeer;
        monsterArray[4].p = playerRank;
        monsterArray[4].numEnemies = enemNum;
        monsterArray[4].health = (int) Math.ceil(monsterArray[4].p*monsterArray[4].e/2);
        monsterArray[4].damage = (int) Math.ceil(monsterArray[4].p*monsterArray[4].e/2);
        monsterArray[4].armor = (monsterArray[4].e+1);
        if(monsterArray[4].p*monsterArray[4].e >=12){
            monsterArray[4].powers = "Flight, Divebomb(instant descend,  " + monsterArray[4].e + " damage), takes 2 less damage from attacks";
        } else if(monsterArray[4].p*monsterArray[4].e >=7){
            monsterArray[4].powers = "Flight, Divebomb(instant descend,  " + monsterArray[4].e + " damage)";
        } else if (monsterArray[4].p*monsterArray[4].e >= 3){
            monsterArray[4].powers = "Flight";
        }monsterArray[4].notes = "Leader(only one in the encounter)";
        Monster Dark_Slayer = new Monster("Dark Slayer", 0, 0, 0, "Evil knights, killing anything in their way.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[37] = Dark_Slayer;
        monsterArray[37].p = playerRank;
        monsterArray[37].numEnemies = enemNum;
        monsterArray[37].health = (int) Math.ceil(monsterArray[37].p*(monsterArray[37].e)*4/monsterArray[37].numEnemies);
        monsterArray[37].damage = (int) Math.ceil(monsterArray[37].p*monsterArray[37].e/2);
        monsterArray[37].armor = (monsterArray[37].e*2);
        if(monsterArray[37].p*monsterArray[37].e >=7){
            monsterArray[37].powers = "Rank " + Math.ceil(monsterArray[37].e*monsterArray[37].p/2) + " challenger, Rank " + Math.ceil(monsterArray[37].e*monsterArray[37].p/3) + " barbarian, weapons have vampiric and ap";
        } else if(monsterArray[37].e*monsterArray[37].p >= 5){
            monsterArray[37].powers = "Rank " + Math.ceil(monsterArray[37].e*monsterArray[37].p/2) + " challenger, Rank " + Math.ceil(monsterArray[37].e*monsterArray[37].p/3) + " barbarian";
        }
        else{
            monsterArray[37].powers = "Rank " + Math.ceil(monsterArray[37].e*monsterArray[37].p/2) + " challenger";
        }
        Monster Demon = new Monster("Demon", 0, 0, 0, "A standard demon.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[38] = Demon;
        monsterArray[38].p = playerRank;
        monsterArray[38].numEnemies = enemNum;
        monsterArray[38].health = (int) Math.ceil(monsterArray[38].p*(monsterArray[38].e)*2/monsterArray[38].numEnemies);
        monsterArray[38].damage = (int) Math.ceil(monsterArray[38].p*monsterArray[38].e/2);
        monsterArray[38].armor = (monsterArray[38].e);
        if(monsterArray[38].p*monsterArray[38].e >=8){
            monsterArray[38].powers = "All attacks deal fire dmg, Infernal Combustion(On death, 10 ft aoe, " + (monsterArray[38].e+1) + " damage)";
        } else if(monsterArray[38].e*monsterArray[38].p >= 4){
            monsterArray[38].powers = "All attacks deal fire dmg)";
        }
        Monster Demon_Warlord = new Monster("Demon Warlord", 0, 0, 0, "A warlord that leads lesser demons into battle.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[5] = Demon_Warlord;
        monsterArray[5].p = playerRank;
        monsterArray[5].numEnemies = enemNum;
        monsterArray[5].health = (monsterArray[5].p*monsterArray[5].e);
        monsterArray[5].damage = (int) Math.ceil(monsterArray[5].p*monsterArray[5].e/2);
        monsterArray[5].armor = (monsterArray[5].e+1);
        if(monsterArray[5].p*monsterArray[5].e >=10){
            monsterArray[5].powers = "All attacks deal fire, Infernal combustion(on death, 10 ft aoe, " + (monsterArray[5].e + 1) + " damage), Charge";
        } else if(monsterArray[5].p*monsterArray[5].e >=6){
            monsterArray[5].powers = "All attacks deal fire, Infernal combustion(on death, 10 ft aoe, " + (monsterArray[5].e + 1) + " damage)";
        } else if (monsterArray[5].p*monsterArray[5].e >= 2){
            monsterArray[5].powers = "All attacks deal fire";
        }monsterArray[5].notes = "Leader(only one in the encounter)";
        Monster Skeleton = new Monster("Skeleton", 0, 0, 0, "Mindless sets of bones.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[39] = Skeleton;
        monsterArray[39].p = playerRank;
        monsterArray[39].numEnemies = enemNum;
        monsterArray[39].health = (int) Math.ceil(monsterArray[39].p*(monsterArray[39].e)*3/2/monsterArray[39].numEnemies);
        monsterArray[39].damage = (int) Math.ceil(monsterArray[39].p*monsterArray[39].e/3);
        monsterArray[39].armor = (int) Math.floor(monsterArray[39].e/2);
        monsterArray[39].powers = "Arrow immunity";
        Monster Skeleton_Knight = new Monster("Skeleton Knight", 0, 0, 0, "Knights made of bone.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[40] = Skeleton_Knight;
        monsterArray[40].p = playerRank;
        monsterArray[40].numEnemies = enemNum;
        monsterArray[40].health = (int) Math.ceil(monsterArray[40].p*(monsterArray[40].e)*2/monsterArray[40].numEnemies);
        monsterArray[40].damage = (int) Math.ceil(monsterArray[40].p*monsterArray[40].e/2);
        monsterArray[40].armor = (monsterArray[40].e);
        if(monsterArray[40].p*monsterArray[40].e >=5){
            monsterArray[40].powers = "Hands are weapons, arrow immunity, Armored knight level " + (monsterArray[40].e-1);
        } else{
            monsterArray[40].powers = "Hands are weapons, arrow immunity)";
        }
        Monster Necromancer = new Monster("Necromancer", 0, 0, 0, "Evil mages that summon skeletons to do their bidding.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[6] = Necromancer;
        monsterArray[6].p = playerRank;
        monsterArray[6].numEnemies = enemNum;
        monsterArray[6].health = (monsterArray[6].p*monsterArray[6].e/4);
        monsterArray[6].damage = 1;
        monsterArray[6].armor = 0;
        if(monsterArray[6].p*monsterArray[6].e >=5){
            monsterArray[6].powers = "Rank " + (monsterArray[6].e + 1) + " Necromancer, summon skeleton (up to " + monsterArray[6].e + " times.";
        } else{
            monsterArray[6].powers = "Rank " + (monsterArray[6].e + 1) + " Necromancer";
        }monsterArray[6].notes = "Leader(only one in the encounter), Skeleton is " + Math.floor(monsterArray[6].p*3/2) + " health, " + Math.ceil(monsterArray[6].p*monsterArray[6].e/3) + " damage, with no armor and arrow immunity.";
        Monster Aracnia_Minor = new Monster("Aracnia_Minor", 0, 0, 0, "Dwarf-size spiders who travel in packs usually with an Aracnia Queen.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[41] = Aracnia_Minor;
        monsterArray[41].p = playerRank;
        monsterArray[41].numEnemies = enemNum;
        monsterArray[41].health = (int) Math.ceil(monsterArray[41].p*monsterArray[41].e/monsterArray[41].numEnemies);
        monsterArray[41].damage = 0;
        monsterArray[41].armor = (int) Math.floor(monsterArray[41].e-2);
        if(monsterArray[41].p*monsterArray[41].e >=6){
            monsterArray[41].powers = "Stun Bite, Devouring " + (60-monsterArray[41].e*monsterArray[41].p) + " secs, Steal";
        } else if(monsterArray[41].p*monsterArray[41].e >=3) {
            monsterArray[41].powers = "Stun Bite, Devouring " + (60-monsterArray[41].e*monsterArray[41].p) + " secs";
        } else{
            monsterArray[41].powers = "Stun Bite";
        } monsterArray[41].notes = "If devour time is equal to 0, it is instead insta-devour.";
        Monster Aracnia_Queen = new Monster("Aracnia Queen", 0, 0, 0, "Large spiders that lead their minion spiders to destroy nearby life.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[7] = Aracnia_Queen;
        monsterArray[7].p = playerRank;
        monsterArray[7].numEnemies = enemNum;
        monsterArray[7].health = (monsterArray[7].p*monsterArray[7].e);
        monsterArray[7].damage = (int) Math.ceil(monsterArray[7].p*monsterArray[7].e/4);
        monsterArray[7].armor = monsterArray[7].e;
        if(monsterArray[7].p*monsterArray[7].e >=9){
            monsterArray[7].powers = "Bite, Devouring " + (50-monsterArray[7].e*monsterArray[7].p) + " secs, Bite is Poisonous, summon Aracnia Minor (up to " + monsterArray[6].e + " times.";
        } else if(monsterArray[7].p*monsterArray[7].e >=4){
            monsterArray[7].powers = "Bite, Devouring " + (50-monsterArray[7].e*monsterArray[7].p) + " secs, Bite is Poisonous";
        }
        else{
            monsterArray[7].powers = "Bite, Devouring " + (50-monsterArray[7].e*monsterArray[7].p) + " secs";
        }monsterArray[7].notes = "Leader (Only one in the encounter), If devour time is equal to 0, it is instead insta-devour, Aracnia Minor are 0/2s with stun bite, devour in 30 secs, and steal";
        Monster Arthran = new Monster("Arthran", 0, 0, 0, "Bear-like creatures who live on the mountain edge.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[42] = Arthran;
        monsterArray[42].p = playerRank;
        monsterArray[42].numEnemies = enemNum;
        monsterArray[42].health = (int) Math.ceil(monsterArray[42].p*monsterArray[42].e*3/2/monsterArray[42].numEnemies);
        monsterArray[42].damage = (int) Math.ceil(monsterArray[42].p*monsterArray[42].e/4);
        monsterArray[42].armor = (int) Math.floor(monsterArray[42].e-1);
        if(monsterArray[42].p*monsterArray[42].e >=5){
            monsterArray[42].powers = "Bite, Devouring " + (40-monsterArray[42].e*monsterArray[42].p) + " secs, Hiding(Mountain)";
        } else if(monsterArray[42].p*monsterArray[42].e >=3) {
            monsterArray[42].powers = "Bite, Devouring " + (40-monsterArray[42].e*monsterArray[42].p) + " secs";
        } else{
            monsterArray[42].powers = "Bite";
        } monsterArray[42].notes = "If devour time is equal to 0, it is instead insta-devour.";
        Monster Barn_Bugger = new Monster("Barn Bugger", 0, 0, 0, "Large spider-like insects that invade barnyards and eat livestock.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[43] = Barn_Bugger;
        monsterArray[43].p = playerRank;
        monsterArray[43].numEnemies = enemNum;
        monsterArray[43].health = (int) Math.ceil(monsterArray[43].p*monsterArray[43].e/monsterArray[43].numEnemies);
        monsterArray[43].damage = (int) Math.ceil(monsterArray[43].p*monsterArray[43].e/2);
        monsterArray[43].armor = (int) Math.floor(monsterArray[43].e/2);
        if(monsterArray[43].p*monsterArray[43].e >=5){
            monsterArray[43].powers = "Bite, Climbing, Stun Bite, Devouring " + (60-monsterArray[43].e*monsterArray[43].p) + " secs";
        } else if(monsterArray[43].p*monsterArray[43].e >=3) {
            monsterArray[43].powers = "Bite, Climbing, Stun Bite";
        } else if(monsterArray[43].p*monsterArray[43].e >=3){
            monsterArray[43].powers = "Bite, Climbing";
        }
        else{
            monsterArray[43].powers = "Bite";
        } monsterArray[43].notes = "If devour time is equal to 0, it is instead insta-devour.";
        Monster Bargot = new Monster("Bargot", 0, 0, 0, "A goblin-like creature skilled in travel.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[44] = Bargot;
        monsterArray[44].p = playerRank;
        monsterArray[44].numEnemies = enemNum;
        monsterArray[44].health = (int) Math.ceil(monsterArray[44].p*monsterArray[44].e/2/monsterArray[44].numEnemies);
        monsterArray[44].damage = (int) Math.ceil(monsterArray[44].p*monsterArray[44].e/2);
        monsterArray[44].armor = monsterArray[44].e-3;
        Monster Bargot_Warrior = new Monster("Bargot Warrior", 0, 0, 0, "Small, violent warriors, often seen with town guards and bandits.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[46] = Bargot_Warrior;
        monsterArray[46].p = playerRank;
        monsterArray[46].numEnemies = enemNum;
        monsterArray[46].health = (int) Math.ceil(monsterArray[46].p*monsterArray[46].e/monsterArray[46].numEnemies);
        monsterArray[46].damage = (int) Math.ceil(monsterArray[46].p*monsterArray[46].e/2);
        monsterArray[46].armor = (int) Math.floor(monsterArray[46].e);
        if(monsterArray[46].p*monsterArray[46].e >=7){
            monsterArray[46].powers = "Honor Bound, Duel, Army Duel";
        } else if(monsterArray[46].p*monsterArray[46].e >=3) {
            monsterArray[46].powers = "Honor Bound, Duel";}
        else{
            monsterArray[46].powers = "Honor Bound";
        }
        Monster Tarnador = new Monster("Tarnador", 0, 0, 0, "Large bulking furry beasts wandering around.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[8] = Tarnador;
        monsterArray[8].p = playerRank;
        monsterArray[8].numEnemies = enemNum;
        monsterArray[8].health = (monsterArray[8].p*monsterArray[8].e);
        monsterArray[8].damage = (int) Math.ceil(monsterArray[8].p*monsterArray[8].e*2/3);
        monsterArray[8].armor = (monsterArray[8].e-2)*2;
        if(monsterArray[8].p*monsterArray[8].e >=10){
            monsterArray[8].powers = "AP Bite, Claw, Devouring " + (30-monsterArray[8].e*monsterArray[8].p) + " secs, Roar(20 secs fear), Mount has +" + monsterArray[8].e + " HP, Trample";
        } else if(monsterArray[8].p*monsterArray[8].e >=8){
            monsterArray[8].powers = "AP Bite, Claw, Devouring " + (30-monsterArray[8].e*monsterArray[8].p) + " secs, Roar(20 secs fear), Mount has +" + monsterArray[8].e + " HP";
        } else if(monsterArray[8].p*monsterArray[8].e >=6){
            monsterArray[8].powers = "AP Bite, Claw, Devouring " + (30-monsterArray[8].e*monsterArray[8].p) + " secs, Roar(20 secs fear)";
        } else if(monsterArray[8].p*monsterArray[8].e >=2){
            monsterArray[8].powers = "AP Bite, Claw, Devouring " + (30-monsterArray[8].e*monsterArray[8].p) + " secs";
        } else{
            monsterArray[8].powers = "AP Bite, Claw";
        }monsterArray[8].notes = "Leader (Only one in the encounter), If devour time is equal to 0, it is instead insta-devour";
        Monster Bug = new Monster("Bug", 0, 0, 0, "Any insect not specified.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[47] = Bug;
        monsterArray[47].p = playerRank;
        monsterArray[47].numEnemies = enemNum;
        monsterArray[47].health = 1;
        monsterArray[47].damage = 0;
        monsterArray[47].armor = 0;
        if(monsterArray[47].p*monsterArray[47].e >=5) {
            monsterArray[47].powers = "Bite(0), Infects on a d20 roll under " + (monsterArray[47].e*monsterArray[47].p) + ", (GM's discretion as to disease or poison), Flying";
        } else{
            monsterArray[47].powers = "Bite(0), Infects on a d20 roll under " + (monsterArray[47].e*monsterArray[47].p) + ", (GM's discretion as to disease or poison)";
        }
        Monster Bugbear = new Monster("Bugbear", 0, 0, 0, "Short furry goblin like creatures.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[48] = Bugbear;
        monsterArray[48].p = playerRank;
        monsterArray[48].numEnemies = enemNum;
        monsterArray[48].health = (int) Math.ceil(monsterArray[48].p*monsterArray[48].e*2/3/monsterArray[46].numEnemies);
        monsterArray[48].damage = (int) Math.ceil(monsterArray[48].p*monsterArray[48].e/2);
        monsterArray[48].armor = (int) Math.floor(monsterArray[48].e-2);
        if(monsterArray[48].p*monsterArray[46].e >=4){
            monsterArray[48].powers = "Claw, Bite for +1 ap";
        } else{
            monsterArray[48].powers = "Claw";
        }
        Monster Candor = new Monster("Candor", 0, 0, 0, "Large Vulture-like scavengers who prefer to run rather than walk.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[49] = Candor;
        monsterArray[49].p = playerRank;
        monsterArray[49].numEnemies = enemNum;
        monsterArray[49].health = (int) Math.ceil(monsterArray[49].p*monsterArray[49].e/2/monsterArray[49].numEnemies);
        monsterArray[49].damage = (int) Math.ceil(monsterArray[49].p*monsterArray[49].e/4);
        monsterArray[49].armor = 0;
        if(monsterArray[49].p*monsterArray[49].e >=8){
            monsterArray[49].powers = "Bite, Devouring " + (40-monsterArray[49].e*monsterArray[49].p) + " secs, Flying, Speed";
        } else if(monsterArray[49].p*monsterArray[49].e >=6){
            monsterArray[49].powers = "Bite, Devouring " + (40-monsterArray[49].e*monsterArray[49].p) + " secs, Flying";
        } else if(monsterArray[49].p*monsterArray[49].e >=3){
            monsterArray[49].powers = "Bite, Devouring " + (40-monsterArray[49].e*monsterArray[49].p) + " secs";
        }
        else {
            monsterArray[49].powers = "Bite";
        }monsterArray[49].notes = "If devour time is zero, then it is insta-devour instead.";
        Monster Sand_Tiger = new Monster("Sand Tiger", 0, 0, 0, "A greater relative of the mighty tiger, the ruler of the Desert.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[50] = Sand_Tiger;
        monsterArray[50].p = playerRank;
        monsterArray[50].numEnemies = enemNum;
        monsterArray[50].health = (int) Math.ceil(monsterArray[50].p*monsterArray[50].e/monsterArray[50].numEnemies);
        monsterArray[50].damage = (int) Math.ceil(monsterArray[50].p*monsterArray[50].e*3/4);
        monsterArray[50].armor = monsterArray[50].e;
        if(monsterArray[50].p*monsterArray[50].e >=9){
            monsterArray[50].powers = "Claw, Bite for +1 ap, Devouring " + (40-monsterArray[50].e*monsterArray[50].p) + " secs, Speed, Mount has +3 health";
        } else if(monsterArray[50].p*monsterArray[50].e >=7){
            monsterArray[50].powers = "Claw, Bite for +1 ap, Devouring " + (40-monsterArray[50].e*monsterArray[50].p) + " secs, Speed";
        } else if(monsterArray[50].p*monsterArray[50].e >=5){
            monsterArray[50].powers = "Claw, Bite for +1 ap, Devouring " + (40-monsterArray[50].e*monsterArray[50].p) + " secs";
        }
        else {
            monsterArray[50].powers = "Claw, Bite for +1 ap";
        }monsterArray[51].notes = "If devour time is zero, then it is insta-devour instead.";
        Monster Panther = new Monster("Panther", 0, 0, 0, "A black beast feeding off of unlucky travelers.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[51] = Panther;
        monsterArray[51].p = playerRank;
        monsterArray[51].numEnemies = enemNum;
        monsterArray[51].health = (int) Math.ceil(monsterArray[51].p*monsterArray[51].e*2/3/monsterArray[51].numEnemies);
        monsterArray[51].damage = (int) Math.ceil(monsterArray[51].p*monsterArray[51].e/2);
        monsterArray[51].armor = monsterArray[51].e-1;
        if(monsterArray[51].p*monsterArray[51].e >=7){
            monsterArray[51].powers = "Claw, Bite, Hiding forests, Devouring " + (60-monsterArray[51].e*monsterArray[51].p) + " secs";
        } else if(monsterArray[51].p*monsterArray[51].e >=4){
            monsterArray[51].powers = "Claw, Bite, Hiding forests";
        } else {
            monsterArray[51].powers = "Claw, Bite";
        }monsterArray[51].notes = "If devour time is zero, then it is insta-devour instead.";
        Monster Lion = new Monster("Lion", 0, 0, 0, "A mighty hunter and king of the plains.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[52] = Lion;
        monsterArray[52].p = playerRank;
        monsterArray[52].numEnemies = enemNum;
        monsterArray[52].health = (int) Math.ceil((monsterArray[52].p*monsterArray[52].e-1)/monsterArray[52].numEnemies);
        monsterArray[52].damage = (int) Math.ceil(monsterArray[52].p*monsterArray[52].e/2);
        monsterArray[52].armor = monsterArray[52].e+1;
        if(monsterArray[52].p*monsterArray[52].e >=6){
            monsterArray[52].powers = "Claw, Bite for +1 ap, devouring " + (30-monsterArray[52].e*monsterArray[52].p) + " secs";
        } else {
            monsterArray[52].powers = "Claw, Bite for +1 ap";
        }monsterArray[52].notes = "If devour time is zero, then it is insta-devour instead.";
        Monster Centaur = new Monster("Centaur", 0, 0, 0, "An honorable half Human, half horse.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[53] = Centaur;
        monsterArray[53].p = playerRank;
        monsterArray[53].numEnemies = enemNum;
        monsterArray[53].health = (int) Math.ceil(monsterArray[53].p*monsterArray[53].e/monsterArray[53].numEnemies);
        monsterArray[53].damage = (int) Math.ceil(monsterArray[53].p*monsterArray[53].e/4);
        monsterArray[53].armor = monsterArray[53].e-2;
        if(monsterArray[53].p*monsterArray[53].e >=10){
            monsterArray[53].powers = "Honor Bound, Scouting, trample";
        } else if(monsterArray[53].p*monsterArray[53].e >=3){
            monsterArray[53].powers = "Honor Bound, Scouting";
        } else {
            monsterArray[53].powers = "Honor Bound";
        }
        Monster Centaur_Druid = new Monster("Centaur Druid", 0, 0, 0, "A magical half Human, half horse who uses their magic to seek wisdom.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[54] = Centaur_Druid;
        monsterArray[54].p = playerRank;
        monsterArray[54].numEnemies = enemNum;
        monsterArray[54].health = (int) Math.ceil(monsterArray[54].p*monsterArray[54].e/monsterArray[54].numEnemies);
        monsterArray[54].damage = (int) Math.ceil(monsterArray[54].p*monsterArray[54].e/4);
        monsterArray[54].armor = (int) Math.floor(monsterArray[54].e/3);
        if(monsterArray[54].p*monsterArray[54].e >=10){
            monsterArray[54].powers = "Root, Tree Ball, trample";
        } else if(monsterArray[54].p*monsterArray[54].e >=6){
            monsterArray[54].powers = "Root, Tree Ball";
        } else if(monsterArray[54].p*monsterArray[54].e >=3){
            monsterArray[54].powers = "Root";
        }
        Monster Centaur_Captain = new Monster("Centaur Captain", 0, 0, 0, "An honorable half Human, half horse captain.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[9] = Centaur_Captain;
        monsterArray[9].p = playerRank;
        monsterArray[9].numEnemies = enemNum;
        monsterArray[9].health = (monsterArray[9].p*monsterArray[9].e);
        monsterArray[9].damage = (int) Math.ceil(monsterArray[9].p*monsterArray[9].e*2);
        monsterArray[9].armor = monsterArray[9].e;
        if(monsterArray[9].p*monsterArray[9].e >=10){
            monsterArray[9].powers = "Honor Bound, Immunity to Fear, Intimidate, Trample";
        } else if(monsterArray[9].p*monsterArray[9].e >=7){
            monsterArray[9].powers = "Honor Bound, Immunity to Fear, Intimidate";
        } else if(monsterArray[9].p*monsterArray[9].e >=3){
            monsterArray[9].powers = "Honor Bound, Immunity to Fear";
        } else{
            monsterArray[9].powers = "Honor Bound";
        }monsterArray[9].notes = "Leader (Only one in the encounter)";
        Monster Changeling = new Monster("Changeling", 0, 0, 0, "Pale Humanoids that change their shape.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[55] = Changeling;
        monsterArray[55].p = playerRank;
        monsterArray[55].numEnemies = enemNum;
        monsterArray[55].health = (int) Math.ceil(monsterArray[55].p*monsterArray[55].e/2/monsterArray[55].numEnemies);
        monsterArray[55].damage = (int) Math.ceil(monsterArray[55].p*monsterArray[55].e/2);
        monsterArray[55].armor = (int) Math.floor(monsterArray[55].e-3);
        if(monsterArray[55].p*monsterArray[55].e >=3){
            monsterArray[55].powers = "Martial Arts, Polymorph(Instant, any creature of it's size";
        } else{
            monsterArray[55].powers = "Martial Arts";
        }
        Monster Chaos_Elemental = new Monster("Chaos Elemental", 0, 0, 0, "A large blackish fluorescent purple humanoid that flashes from place to place", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[10] = Chaos_Elemental;
        monsterArray[10].p = playerRank;
        monsterArray[10].numEnemies = enemNum;
        monsterArray[10].health = (monsterArray[10].p*monsterArray[10].e);
        monsterArray[10].damage = (int) Math.ceil(monsterArray[10].p*monsterArray[10].e);
        monsterArray[10].armor = 2*(monsterArray[10].e-2);
        if(monsterArray[10].p*monsterArray[10].e >=12){
            monsterArray[10].powers = "Teleport, Martial Arts, Chaos Bolt, Ethereal Travel";
        } else if(monsterArray[10].p*monsterArray[10].e >=5){
            monsterArray[10].powers = "Teleport, Martial Arts, Chaos Bolt";
        } else{
            monsterArray[10].powers = "Teleport, Martial Arts";
        }monsterArray[10].notes = "Leader (Only one in the encounter)";
        Monster Cyclops = new Monster("Cyclops", 0, 0, 0, "A large one-eyed giant warrior armed with a large spear/mace/axe.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[56] = Cyclops;
        monsterArray[56].p = playerRank;
        monsterArray[56].numEnemies = enemNum;
        monsterArray[56].health = (int) Math.ceil((monsterArray[56].p+2)*monsterArray[56].e/monsterArray[56].numEnemies);
        monsterArray[56].damage = (int) Math.ceil(monsterArray[56].p*monsterArray[56].e/4);
        monsterArray[56].armor = (int) Math.floor(monsterArray[56].e-1);
        if(monsterArray[56].p*monsterArray[56].e >=10){
            monsterArray[56].powers = "Two Handed Destruction, Intimidate, Trample";
        } else if(monsterArray[56].p*monsterArray[56].e >=5){
            monsterArray[56].powers = "Two Handed Destruction, Intimidate";
        }else if(monsterArray[56].p*monsterArray[56].e >=3){
            monsterArray[56].powers = "Two Handed Destruction";
        }
        Monster Draconian = new Monster("Draconian", 0, 0, 0, "Part human, part dragon people, has strong scales, wings, and a breath weapon.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[57] = Draconian;
        monsterArray[57].p = playerRank;
        monsterArray[57].numEnemies = enemNum;
        monsterArray[57].health = (int) Math.ceil(monsterArray[57].p*monsterArray[57].e/monsterArray[57].numEnemies);
        monsterArray[57].damage = (int) Math.ceil(monsterArray[57].p*monsterArray[57].e*3/8);
        monsterArray[57].armor = (int) Math.floor((monsterArray[57].e+2)/2);
        if(monsterArray[57].p*monsterArray[57].e >=7){
            monsterArray[57].powers = "Martial Arts, Flying, Bite for +1 AP, Breath Weapon Based on Color";
        } else if(monsterArray[57].p*monsterArray[57].e >=3){
            monsterArray[57].powers = "Martial Arts, Flying, Bite for +1 AP";
        }else{
            monsterArray[57].powers = "Martial Arts";
        }
        Monster Red_Dragon = new Monster("Red Dragon", 0, 0, 0, "A mighty beast of myth, with impenetrable scales and a thirst for destruction.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[11] = Red_Dragon;
        monsterArray[11].p = playerRank;
        monsterArray[11].numEnemies = enemNum;
        monsterArray[11].health = (int) Math.ceil(monsterArray[11].p*monsterArray[11].e*3/2);
        monsterArray[11].damage = (int) Math.ceil(monsterArray[11].p*monsterArray[11].e);
        monsterArray[11].armor = monsterArray[11].e+1;
        if(monsterArray[11].p*monsterArray[11].e >=10){
            monsterArray[11].powers = "Martial Arts, Flying, Bite(AP), Devour in " + (30 -monsterArray[11].e*monsterArray[11].p) + " secs, Fire Breath (Instant KO), Unbreachable Armor";
        } else if(monsterArray[11].p*monsterArray[11].e >=5){
            monsterArray[11].powers = "Martial Arts, Flying, Bite(AP), Devour in " + (30 -monsterArray[11].e*monsterArray[11].p) + " secs";
        } else if(monsterArray[11].p*monsterArray[11].e >=3){
            monsterArray[11].powers = "Martial Arts, Flying, Bite(AP)";
        } else{
            monsterArray[11].powers = "Martial Arts";
        }monsterArray[11].notes = "Leader (Only one in the encounter), If devour time is 0 seconds, it is instead instant devour.";
        Monster White_Dragon = new Monster("White Dragon", 0, 0, 0, "A mighty beast of myth, with impenetrable scales and a thirst for destruction.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[12] = White_Dragon;
        monsterArray[12].p = playerRank;
        monsterArray[12].numEnemies = enemNum;
        monsterArray[12].health = (int) Math.ceil(monsterArray[12].p*monsterArray[12].e*3/2);
        monsterArray[12].damage = (int) Math.ceil(monsterArray[12].p*monsterArray[12].e);
        monsterArray[12].armor = monsterArray[12].e+1;
        if(monsterArray[12].p*monsterArray[12].e >=10){
            monsterArray[12].powers = "Martial Arts, Flying, Bite(AP), Devour in " + (30 -monsterArray[12].e*monsterArray[12].p) + " secs, Binding Breath (Light 20), Unbreachable Armor";
        } else if(monsterArray[12].p*monsterArray[12].e >=5){
            monsterArray[12].powers = "Martial Arts, Flying, Bite(AP), Devour in " + (30 -monsterArray[12].e*monsterArray[12].p) + " secs";
        } else if(monsterArray[12].p*monsterArray[12].e >=3){
            monsterArray[12].powers = "Martial Arts, Flying, Bite(AP)";
        } else{
            monsterArray[12].powers = "Martial Arts";
        }monsterArray[12].notes = "Leader (Only one in the encounter), If devour time is 0 seconds, it is instead instant devour.";
        Monster Green_Dragon = new Monster("Green Dragon", 0, 0, 0, "A mighty beast of myth, with impenetrable scales and a thirst for destruction.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[13] = Green_Dragon;
        monsterArray[13].p = playerRank;
        monsterArray[13].numEnemies = enemNum;
        monsterArray[13].health = (int) Math.ceil(monsterArray[13].p*monsterArray[13].e*3/2);
        monsterArray[13].damage = (int) Math.ceil(monsterArray[13].p*monsterArray[13].e);
        monsterArray[13].armor = monsterArray[13].e+1;
        if(monsterArray[13].p*monsterArray[13].e >=10){
            monsterArray[13].powers = "Martial Arts, Flying, Bite(AP), Devour in " + (30 -monsterArray[13].e*monsterArray[13].p) + " secs, Root Breath (Root 20), Unbreachable Armor";
        } else if(monsterArray[13].p*monsterArray[13].e >=5){
            monsterArray[13].powers = "Martial Arts, Flying, Bite(AP), Devour in " + (30 -monsterArray[13].e*monsterArray[13].p) + " secs";
        } else if(monsterArray[13].p*monsterArray[13].e >=3){
            monsterArray[13].powers = "Martial Arts, Flying, Bite(AP)";
        } else{
            monsterArray[13].powers = "Martial Arts";
        }monsterArray[13].notes = "Leader (Only one in the encounter), If devour time is 0 seconds, it is instead instant devour.";
        Monster Mountain_Dragon = new Monster("Mountain Dragon", 0, 0, 0, "A mighty beast of myth, with impenetrable scales and a thirst for destruction.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[14] = Mountain_Dragon;
        monsterArray[14].p = playerRank;
        monsterArray[14].numEnemies = enemNum;
        monsterArray[14].health = (int) Math.ceil(monsterArray[14].p*monsterArray[14].e*3/2);
        monsterArray[14].damage = (int) Math.ceil(monsterArray[14].p*monsterArray[14].e);
        monsterArray[14].armor = monsterArray[14].e+1;
        if(monsterArray[14].p*monsterArray[14].e >=10){
            monsterArray[14].powers = "Martial Arts, Flying, Bite(AP), Devour in " + (30 -monsterArray[14].e*monsterArray[14].p) + " secs, Rust Breath (Shatter), Unbreachable Armor";
        } else if(monsterArray[14].p*monsterArray[14].e >=5){
            monsterArray[14].powers = "Martial Arts, Flying, Bite(AP), Devour in " + (30 -monsterArray[14].e*monsterArray[14].p) + " secs";
        } else if(monsterArray[14].p*monsterArray[14].e >=3){
            monsterArray[14].powers = "Martial Arts, Flying, Bite(AP)";
        } else{
            monsterArray[14].powers = "Martial Arts";
        }monsterArray[14].notes = "Leader (Only one in the encounter), If devour time is 0 seconds, it is instead instant devour.";
        Monster Blue_Dragon = new Monster("Blue Dragon", 0, 0, 0, "A mighty beast of myth, with impenetrable scales and a thirst for destruction.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[15] = Blue_Dragon;
        monsterArray[15].p = playerRank;
        monsterArray[15].numEnemies = enemNum;
        monsterArray[15].health = (int) Math.ceil(monsterArray[15].p*monsterArray[15].e*3/2);
        monsterArray[15].damage = (int) Math.ceil(monsterArray[15].p*monsterArray[15].e);
        monsterArray[15].armor = monsterArray[15].e+1;
        if(monsterArray[15].p*monsterArray[15].e >=10){
            monsterArray[15].powers = "Martial Arts, Flying, Bite(AP), Devour in " + (30 -monsterArray[15].e*monsterArray[15].p) + " secs, Ice Breath (30), Unbreachable Armor";
        } else if(monsterArray[15].p*monsterArray[15].e >=5){
            monsterArray[15].powers = "Martial Arts, Flying, Bite(AP), Devour in " + (30 -monsterArray[15].e*monsterArray[15].p) + " secs";
        } else if(monsterArray[15].p*monsterArray[15].e >=3){
            monsterArray[15].powers = "Martial Arts, Flying, Bite(AP)";
        } else{
            monsterArray[15].powers = "Martial Arts";
        }monsterArray[15].notes = "Leader (Only one in the encounter), If devour time is 0 seconds, it is instead instant devour.";
        Monster Ettin = new Monster("Ettin", 0, 0, 0, "A large two-headed giant warrior armed with a spear/mace/axe.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[58] = Ettin;
        monsterArray[58].p = playerRank;
        monsterArray[58].numEnemies = enemNum;
        monsterArray[58].health = (int) Math.ceil(monsterArray[58].p*monsterArray[58].e/monsterArray[58].numEnemies);
        monsterArray[58].damage = (int) Math.ceil(monsterArray[58].e);
        monsterArray[58].armor = (int) Math.floor((monsterArray[58].e+2)/2);
        if(monsterArray[58].p*monsterArray[58].e >=10){
            monsterArray[58].powers = "Two Handed destruction, Immunity to blindness and mental effects, Intimidate, devour in " + (30 - monsterArray[58].p*monsterArray[58].e) + " secs, Trample";
        } else if(monsterArray[58].p*monsterArray[58].e >=5){
            monsterArray[58].powers = "Two Handed destruction, Immunity to blindness and mental effects, Intimidate, devour in " + (30 - monsterArray[58].p*monsterArray[58].e) + " secs";
        }else if(monsterArray[58].p*monsterArray[58].e >=2){
            monsterArray[58].powers = "Two Handed destruction, Immunity to blindness and mental effects";
        }
        Monster Ent = new Monster("Ent", 0, 0, 0, "A large animate tree with humanoid features.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[59] = Ent;
        monsterArray[59].p = playerRank;
        monsterArray[59].numEnemies = enemNum;
        monsterArray[59].health = (int) Math.ceil(monsterArray[59].p*monsterArray[59].e/monsterArray[59].numEnemies);
        monsterArray[59].damage = (int) Math.ceil(monsterArray[59].p*monsterArray[59].e/2);
        monsterArray[59].armor = (int) Math.floor(monsterArray[59].e/2);
        if(monsterArray[59].p*monsterArray[59].e >=7){
            monsterArray[59].powers = "Martial arts, Regenerate 1 in " + (30 - monsterArray[59].p*monsterArray[59].e) + " secs, Treeball, Shatter";
        } else if(monsterArray[59].p*monsterArray[59].e >=5){
            monsterArray[59].powers = "Martial arts, Regenerate 1 in " + (30 - monsterArray[59].p*monsterArray[59].e) + " secs, Treeball";
        }else if(monsterArray[59].p*monsterArray[59].e >=4){
            monsterArray[59].powers = "Martial arts, Regenerate 1 in " + (30 - monsterArray[59].p*monsterArray[59].e) + " secs";
        }else{
            monsterArray[59].powers = "Martial arts";
        } monsterArray[59].notes = "Ents hate axes and will target them first and foremost. When playing an ent, you may use large weapons as extensions of you arms.";
        Monster Slime = new Monster("Slime", 0, 0, 0, "A large blob of amorphous gel, of a variety of different colors.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[60] = Slime;
        monsterArray[60].p = playerRank;
        monsterArray[60].numEnemies = enemNum;
        monsterArray[60].health = (int) Math.ceil(monsterArray[61].p*monsterArray[60].e/2/monsterArray[60].numEnemies);
        monsterArray[60].damage = 0;
        monsterArray[60].armor = 0;
        if(monsterArray[60].p*monsterArray[60].e >=10){
            monsterArray[60].powers = "Acidic, Immune to Non-Magic damage, Rank 2 of mage of the corresponding color";
        } else if(monsterArray[60].p*monsterArray[61].e >=5){
            monsterArray[60].powers = "Acidic, Immune to Non-Magic damage";
        }else{
            monsterArray[60].powers = "Acidic";
        } monsterArray[60].notes = "Slimes have a touch attack on weapons that corrode them, meaning that the weapons shatter at the end of the encounter.";
        Monster Wurm = new Monster("Wurm", 0, 0, 0, "Giant armored serpents with massive maws containing rows of teeth.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[16] = Wurm;
        monsterArray[16].p = playerRank;
        monsterArray[16].numEnemies = enemNum;
        monsterArray[16].health = (int) Math.ceil(monsterArray[16].p*monsterArray[16].e*4/3);
        monsterArray[16].damage = (int) Math.ceil(monsterArray[16].p*monsterArray[16].e/2);
        monsterArray[16].armor = monsterArray[16].e;
        if(monsterArray[16].p*monsterArray[16].e >=10){
            monsterArray[16].powers = "Bite(AP), " + (15 -monsterArray[16].e*monsterArray[16].p) + " secs, Trample";
        } else if(monsterArray[16].p*monsterArray[16].e >=5){
            monsterArray[16].powers = "Bite(AP), " + (15 -monsterArray[16].e*monsterArray[16].p) + " secs";
        } else{
            monsterArray[16].powers = "Bite(AP)";
        }monsterArray[16].notes = "Leader (Only one in the encounter), If devour time is 0 seconds, it is instead instant devour.";
        Monster Angel = new Monster("Angel", 0, 0, 0, "Celestial beings and protectors of human nature. Do not die, dissipate unless permanently destroyed. Each Angel is associated with one of six elements, and gains powers based on that.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[61] = Angel;
        monsterArray[61].p = playerRank;
        monsterArray[61].numEnemies = enemNum;
        monsterArray[61].health = (int) Math.ceil((monsterArray[61].p*monsterArray[61].e+2)/monsterArray[61].numEnemies);
        monsterArray[61].damage = (int) Math.ceil((monsterArray[61].p-1)*monsterArray[61].e/2);
        monsterArray[61].armor = monsterArray[61].e;
        if(monsterArray[61].p*monsterArray[61].e >=8){
            monsterArray[61].powers = "Flying, Heal, Rebirth(1 per encounter), Stun Strike(Channel 2)";
        } else if(monsterArray[61].p*monsterArray[61].e >=5){
            monsterArray[61].powers = "Flying, Heal, Rebirth(1 per encounter)";
        } else if(monsterArray[61].p*monsterArray[61].e >=1){
            monsterArray[61].powers = "Flying, Heal";
        } else{
            monsterArray[61].powers = "Flying";
        } monsterArray[61].notes = "Angels heal with their hands.";
        Monster Bone_Horror = new Monster("Bone Horror", 0, 0, 0, "A mass of animate bones held together by dark magic, similar to abomination.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[17] = Bone_Horror;
        monsterArray[17].p = playerRank;
        monsterArray[17].numEnemies = enemNum;
        monsterArray[17].health = 0;
        monsterArray[17].damage = (int) Math.ceil(monsterArray[17].p/2+1);
        monsterArray[17].armor = (int) Math.ceil(monsterArray[17].e/2);
        if(monsterArray[17].p*monsterArray[17].e >=5){
            monsterArray[17].powers = "Regeneration(" + (50-monsterArray[17].e*monsterArray[17].p) + " secs), Bite AP, Devour " + (30 -monsterArray[17].e*monsterArray[17].p) + " secs, Martial Arts, Fear Aura, Fear Touch";
        } else if(monsterArray[17].p*monsterArray[17].e >=3){
            monsterArray[17].powers = "Regeneration(" + (50-monsterArray[17].e*monsterArray[17].p) + " secs), Bite AP, Devour " + (30 -monsterArray[17].e*monsterArray[17].p) + " secs, Martial Arts";
        } else{
            monsterArray[17].powers = "Regeneration(" + (50-monsterArray[17].e*monsterArray[17].p) + " secs), Bite AP";
        }monsterArray[17].notes = "Leader (Only one in the encounter), If devour time is 0 seconds, it is instead instant devour, Starts with " + (monsterArray[17].p*3) + " times X HP where X is the number of encounters completed this session. The bone horror gets +3 HP every time it devours.";
        Monster Carne = new Monster("Carne", 0, 0, 0, "A zombie cow.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[62] = Carne;
        monsterArray[62].p = playerRank;
        monsterArray[62].numEnemies = enemNum;
        monsterArray[62].health = (int) Math.ceil((monsterArray[62].p*monsterArray[62].e-2)/monsterArray[62].numEnemies);
        monsterArray[62].damage = 1;
        monsterArray[62].armor = 0;
        if(monsterArray[62].p*monsterArray[62].e >=10){
            monsterArray[62].powers = "Bite(AP), Devour " + (40 - monsterArray[62].p*monsterArray[62].e) + " secs, Trample";
        } else if(monsterArray[62].p*monsterArray[62].e >=4){
            monsterArray[62].powers = "Bite(AP), Devour " + (40 - monsterArray[62].p*monsterArray[62].e) + " secs";
        } else{
            monsterArray[62].powers = "Bite(AP)";
        } monsterArray[62].notes = "Carnes don’t devour the whole body of those they eat, but they do still kill them. If devour's time is equal to zero, it is instead insta-devour.";
        Monster Dracolich = new Monster("Dracolich", 0, 0, 0, "A deadly undead dragon.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[18] = Dracolich;
        monsterArray[18].p = playerRank;
        monsterArray[18].numEnemies = enemNum;
        monsterArray[18].health = (monsterArray[18].e*monsterArray[18].p);
        monsterArray[18].damage = (int) Math.ceil(monsterArray[18].p*monsterArray[18].e/2);
        monsterArray[18].armor = (int) Math.ceil(monsterArray[18].e/2+1);
        if(monsterArray[18].p*monsterArray[18].e >=14){
            monsterArray[18].powers = "Flying, Bite(AP), Martial Arts, Devour(" + (20-monsterArray[18].e*monsterArray[18].p) + " secs), Death Breath(Slay)";
        } else if(monsterArray[18].p*monsterArray[18].e >=5){
            monsterArray[18].powers = "Flying, Bite(AP), Martial Arts, Devour(" + (20-monsterArray[18].e*monsterArray[18].p) + " secs)";
        } else if(monsterArray[18].p*monsterArray[18].e >=2){
            monsterArray[18].powers = "Flying, Bite(AP), Martial Arts";
        } else{
            monsterArray[18].powers = "Flying, Bite(AP)";
        }monsterArray[18].notes = "Leader (Only one in the encounter), If devour time is 0 seconds, it is instead instant devour.";
        Monster Ghoul = new Monster("Carne", 0, 0, 0, "A zombie cow.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[63] = Ghoul;
        monsterArray[63].p = playerRank;
        monsterArray[63].numEnemies = enemNum;
        monsterArray[63].health = (int) Math.ceil(monsterArray[63].e/monsterArray[63].numEnemies);
        monsterArray[63].damage = (int) Math.ceil(monsterArray[63].e/4);
        monsterArray[63].armor = 0;
        if(monsterArray[63].p*monsterArray[63].e >=10){
            monsterArray[63].powers = "Claw, Bite(+1 AP), Devour " + (15 - monsterArray[63].p*monsterArray[63].e) + " secs";
        } else{
            monsterArray[63].powers = "Claw";
        } monsterArray[63].notes = "If devour's time is equal to zero, it is instead insta-devour.";
        Monster Lich = new Monster("Lich", 0, 0, 0, "A more powerful undead, can create and control large amounts of lesser undead. Occasionally uses a phylactery to stay immortal.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[19] = Lich;
        monsterArray[19].p = playerRank;
        monsterArray[19].numEnemies = enemNum;
        monsterArray[19].health = (int) Math.ceil((monsterArray[19].e*monsterArray[19].p)/2);
        monsterArray[19].damage = 1;
        monsterArray[19].armor = 0;
        if(monsterArray[19].p*monsterArray[19].e >=7){
            monsterArray[19].powers = "Battle Mage Level " + monsterArray[19].e + ", Animate Dead, Soulbound";
        } else{
            monsterArray[19].powers = "Battle Mage Level " + monsterArray[19].e;
        }monsterArray[19].notes = "Leader (Only one in the encounter), Not all Liches have to be soulbound, however, if they are, they are soulbound to a phylactery.";
        Monster Shadewood_Ent = new Monster("Shadewood Ent", 0, 0, 0, "A massive animate tree, with writhing grey wood, and red eyes.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[20] = Shadewood_Ent;
        monsterArray[20].p = playerRank;
        monsterArray[20].numEnemies = enemNum;
        monsterArray[20].health = (int) Math.ceil(monsterArray[20].e*(monsterArray[20].p+2));
        monsterArray[20].damage = monsterArray[20].p;
        monsterArray[20].armor = (int) Math.ceil((monsterArray[20].e+3)/2);
        if(monsterArray[20].p*monsterArray[20].e >=12){
            monsterArray[20].powers = "Martial Arts, Regenerating(" + (40-monsterArray[20].e*monsterArray[20].p)+ " secs), Shatter, Slay, Death Ray";
        } else if(monsterArray[20].p*monsterArray[20].e >=8){
            monsterArray[20].powers = "Martial Arts, Regenerating(" + (40-monsterArray[20].e*monsterArray[20].p)+ " secs), Shatter";
        } else if(monsterArray[20].p*monsterArray[20].e >=3){
            monsterArray[20].powers = "Martial Arts, Regenerating(" + (40-monsterArray[20].e*monsterArray[20].p)+ " secs)";
        } else{
            monsterArray[20].powers = "Martial Arts";
        } monsterArray[20].notes = "Leader (Only one in the encounter), Ents hate axes and will target them first and foremost. When playing an ent, you may use large weapons as extensions of you arms.";
        Monster Shade_Juggernaut = new Monster("Shade Juggernaut", 0, 0, 0, "A dark undead warrior, leader of dark knights.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[21] = Shade_Juggernaut;
        monsterArray[21].p = playerRank;
        monsterArray[21].numEnemies = enemNum;
        monsterArray[21].health = (int) Math.ceil(monsterArray[21].e*(monsterArray[21].p+2));
        monsterArray[21].damage = (int) Math.ceil(monsterArray[21].p*monsterArray[21].e/2);
        monsterArray[21].armor = (int) Math.ceil((monsterArray[21].e+1)/2);
        if(monsterArray[21].p*monsterArray[21].e >=12){
            monsterArray[21].powers = "Rank " + (monsterArray[21].p+3) + " Armored Knight, Regenerating " + (50-monsterArray[21].e*monsterArray[21].p)+ " secs, Battle Mage Rank " + (monsterArray[21].p+1);
        } else if(monsterArray[21].p*monsterArray[21].e >=6){
            monsterArray[21].powers = "Rank " + (monsterArray[21].p+3) + " Armored Knight, Regenerating " + (50-monsterArray[21].e*monsterArray[21].p)+ " secs";
        } else if(monsterArray[21].p*monsterArray[21].e >=3){
            monsterArray[21].powers = "Rank " + (monsterArray[21].p+3) + " Armored Knight";
        } monsterArray[21].notes = "Leader (Only one in the encounter)";
        Monster Spectre = new Monster("Spectre", 0, 0, 0, "A transparent humanoid that flickers in and out of existence.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[22] = Spectre;
        monsterArray[22].p = playerRank;
        monsterArray[22].numEnemies = enemNum;
        monsterArray[22].health = monsterArray[21].e;
        monsterArray[22].damage = 1;
        monsterArray[22].armor = 0;
        if(monsterArray[22].p*monsterArray[22].e >=7){
            monsterArray[22].powers = "Martial Arts, Evade, Ethereal Travel";
        } else if(monsterArray[22].p*monsterArray[22].e >=5){
            monsterArray[22].powers = "Martial Arts, Evade";
        } else{
            monsterArray[22].powers = "Martial Arts";
        } monsterArray[22].notes = "Spectres will always start in the ethereal, regardless of whether or not they have ethereal travel.";
        Monster Greater_Vampire = new Monster("Greater Vampire", 0, 0, 0, "Powerful vampires created by dark magic casted by Elder Vampires.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[23] = Greater_Vampire;
        monsterArray[23].p = playerRank;
        monsterArray[23].numEnemies = enemNum;
        monsterArray[23].health = (monsterArray[23].e*monsterArray[23].p/monsterArray[23].numEnemies);
        monsterArray[23].damage = monsterArray[23].p;
        monsterArray[23].armor = 0;
        if(monsterArray[23].p*monsterArray[23].e >=10){
            monsterArray[23].powers = "Bite(Infect on a d20 roll under " + (monsterArray[23].e*monsterArray[23].p)+ "), Polymorph(Bat), Charm, Animate Dead, Slay";
        } else if(monsterArray[23].p*monsterArray[23].e >=8){
            monsterArray[23].powers = "Bite(Infect on a d20 roll under " + (monsterArray[23].e*monsterArray[23].p)+ "), Polymorph(Bat), Charm, Animate Dead";
        } else if(monsterArray[23].p*monsterArray[23].e >=5){
            monsterArray[23].powers = "Bite(Infect on a d20 roll under " + (monsterArray[23].e*monsterArray[23].p)+ "), Polymorph(Bat), Charm";
        } else if(monsterArray[23].p*monsterArray[23].e >=3){
            monsterArray[23].powers = "Bite(Infect on a d20 roll under " + (monsterArray[23].e*monsterArray[23].p)+ "), Polymorph(Bat)";
        } else{
            monsterArray[23].powers = "Bite(Infect on a d20 roll under " + (monsterArray[23].e*monsterArray[23].p)+ ")";
        }
        Monster Wraith = new Monster("Wraith", 0, 0, 0, "Shadowy beings with glowing red eyes and black claws.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[64] = Wraith;
        monsterArray[64].p = playerRank;
        monsterArray[64].numEnemies = enemNum;
        monsterArray[64].health = (monsterArray[64].e*(monsterArray[64].p-1)/monsterArray[64].numEnemies);
        monsterArray[64].damage = monsterArray[64].p;
        monsterArray[64].armor = 0;
        if(monsterArray[64].p*monsterArray[64].e >=10){
            monsterArray[64].powers = "Martial Arts, Flight, Ethereal Travel, Teleport, Slay";
        } else if(monsterArray[64].p*monsterArray[64].e >=8){
            monsterArray[64].powers = "Martial Arts, Flight, Ethereal Travel, Teleport";
        } else if(monsterArray[64].p*monsterArray[64].e >=3){
            monsterArray[64].powers = "Martial Arts, Flight, Ethereal Travel";
        } else if(monsterArray[64].p*monsterArray[64].e >=3){
            monsterArray[64].powers = "Martial Arts, Flight";
        } else{
            monsterArray[64].powers = "Martial Arts";
        }
        Monster Zombie = new Monster("Zombie", 0, 0, 0, "Reanimated corpses that crave flesh.", "None", "None", (int) Math.ceil(Math.random()*6), 0, 0);
        monsterArray[65] = Zombie;
        monsterArray[65].p = playerRank;
        monsterArray[65].numEnemies = enemNum;
        monsterArray[65].health = (monsterArray[65].e*(monsterArray[65].p+1)/monsterArray[65].numEnemies);
        monsterArray[65].damage = (int) Math.ceil(monsterArray[65].p/2);
        monsterArray[65].armor = monsterArray[65].p-monsterArray[65].e;
        if(monsterArray[65].p*monsterArray[65].e >=5){
            monsterArray[65].powers = "Bite, Claw, Devouring(" + (50-monsterArray[65].p*monsterArray[65].e) + ") secs";
        } else if(monsterArray[65].p*monsterArray[65].e >=3){
            monsterArray[65].powers = "Bite, Claw";
        } else{
            monsterArray[65].powers = "Bite";
        }monsterArray[65].notes = "When a zombie’s limb is hit, they take a hack instead of taking damage. If a player is dead but not devoured at the end of an encounter in which they were bitten by a zombie, they are reanimated as a zombie at the end of the encounter, if devour time equals 0, it is insta-devour instead.";
        switch(enemNum){
            case 1:
            monsterIndex = (int) Math.floor(Math.random()*22);
            myMonster = new Monster(monsterArray[monsterIndex].name,monsterArray[monsterIndex].health, monsterArray[monsterIndex].damage, monsterArray[monsterIndex].armor, monsterArray[monsterIndex].description, monsterArray[monsterIndex].powers, monsterArray[monsterIndex].notes, monsterArray[monsterIndex].e, monsterArray[monsterIndex].p, monsterArray[monsterIndex].numEnemies);
            break;
            default:
            monsterIndex = (int) Math.floor(Math.random()*44+21);
            myMonster = new Monster(monsterArray[monsterIndex].name,monsterArray[monsterIndex].health, monsterArray[monsterIndex].damage, monsterArray[monsterIndex].armor, monsterArray[monsterIndex].description, monsterArray[monsterIndex].powers, monsterArray[monsterIndex].notes, monsterArray[monsterIndex].e, monsterArray[monsterIndex].p, monsterArray[monsterIndex].numEnemies);
                break;
        }
    }

}
