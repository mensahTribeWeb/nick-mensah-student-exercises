package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;
		System.out.println(birdsRemaining);

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println(numberOfExtraBirds);

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int raccoonsInWoods = 3;
		int raccoonsEatingDinner = 2;
		int raccoonsRemainingInWoods = raccoonsInWoods - raccoonsEatingDinner;
		System.out.println(raccoonsRemainingInWoods);

        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int beesToFlowers =  numberOfFlowers - numberOfBees;
		System.out.println(beesToFlowers);


        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int pigeonsEatingBreadcrumbs = 1;
		int pigeonsComingToEat = 1;
		int totalPigeonsEating = pigeonsEatingBreadcrumbs + pigeonsComingToEat;
		System.out.print(totalPigeonsEating);

        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlsSittingOnFence = 3;
		int owlsJoiningFence = 2;
		int totalOwlsOnFence = owlsSittingOnFence + owlsJoiningFence;
		System.out.println(totalOwlsOnFence);


        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWorkingOnHome = 2;
		int beaversLeftToSwim = 1;
		int remainingBeaversWorking = beaversWorkingOnHome -beaversLeftToSwim;
		System.out.println(remainingBeaversWorking);

        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansSittingOnTreeLimb = 2;
		int toucansJoiningTreeLimb = 1;
		int totalToucansOnTreeLimb = toucansSittingOnTreeLimb + toucansJoiningTreeLimb;
		System.out.println(totalToucansOnTreeLimb);


        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int numOfSquirrels = 4;
		int numOfNuts = 2;
		int numOfSquirrelsToNuts = numOfSquirrels - numOfNuts;
		System.out.println(numOfSquirrelsToNuts);


        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double totalQuarters = .25;
		double totalDimes = .10;
		double totalNickles = .05 * 2;
		double totalMoneyFound = totalQuarters + totalDimes + totalNickles;
		System.out.println(totalMoneyFound);


        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int numberOfBriersFirstGradeMuffins = 18;
		int numberOfMacAdamsFirstGradeMuffins = 20;
		int numberOfFlannerysFirstGradeMuffins = 17;
		int totalMuffinsFromFirstGrade = numberOfBriersFirstGradeMuffins + numberOfMacAdamsFirstGradeMuffins + numberOfFlannerysFirstGradeMuffins;
		System.out.println(totalMuffinsFromFirstGrade);


        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double costOfYoyo = .24d;
		double costOfWhistle = .14d;
		double totalCostOfToys = costOfYoyo + costOfWhistle;
		System.out.println(totalCostOfToys);



        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallows = largeMarshmallows + miniMarshmallows;
		System.out.println(totalMarshmallows);


        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int hiltsHouseInchesOfSnow = 29;
		int brecknockElementaryInchesOfSnow = 17;
		int totalInchesOfSnow = hiltsHouseInchesOfSnow - brecknockElementaryInchesOfSnow;
		System.out.println(totalInchesOfSnow); //inches are factors of a whole number



        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		double hiltsTotalFunds =10;
		double costOfToyTruck = 3;
		double costOfPencilCase = 2;
		double totalCostOfItems = costOfToyTruck + costOfPencilCase;
		double hiltsRemainingFunds = hiltsTotalFunds - totalCostOfItems;
		System.out.println(hiltsRemainingFunds);


        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int marbleCollection = 16;
		int misplacedMarbles = 7;
		int remainingMarbles = marbleCollection - misplacedMarbles;
		System.out.println(remainingMarbles);


        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int initialSeashells = 19;
		int desiredSeashellCollectionTotal = 25;
		int remainingSeashellsNeeded = desiredSeashellCollectionTotal - initialSeashells;
		System.out.println(remainingSeashellsNeeded);


        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int totalBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = totalBalloons - redBalloons;
		System.out.println(greenBalloons);


        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int numberOfBooksOnSelf = 38;
		int additionalBooksAdded = 10;
		int totalBooksOnSelf = numberOfBooksOnSelf + additionalBooksAdded;
		System.out.println(totalBooksOnSelf);


        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int legsOnBees = 6;
		int numOfBees = 8;
		int totalLegsOnBees = legsOnBees * numOfBees;
		System.out.println(totalLegsOnBees);



        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double costOfIceCreamCone = .99;
		double costOfTwoIceCreamCones = costOfIceCreamCone * 2;
		System.out.println(costOfTwoIceCreamCones);


        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int totalNumberOfRocksRequired = 125;
		int totalRocksObtained = 64;
		int remainingRocksRequired = totalNumberOfRocksRequired - totalRocksObtained;
		System.out.println(remainingRocksRequired);


        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int hiltsTotalMarbles = 38;
		int hiltsMissingMarbles = 15;
		int hiltsRemainingMarbles = hiltsTotalMarbles - hiltsMissingMarbles;
		System.out.println(hiltsRemainingMarbles);


        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int totalMilesToConcert = 78;
		int milesDrivenCurrently =32;
		int remainingMilesToConcert = totalMilesToConcert - milesDrivenCurrently;
		System.out.println(remainingMilesToConcert);


        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int minutesShoveledSaturdayMorning = 90; // 1hr will be 60minutes 60+30=90
		int minutesShoveledSaturdayAfternoon = 45;
		int totalMinutesShoveling = minutesShoveledSaturdayMorning + minutesShoveledSaturdayAfternoon;
		System.out.println(totalMinutesShoveling);


        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int hotDogsPurchased = 6;
		double costOfHotDogs = .50;
		double totalCostOfHotDogs = hotDogsPurchased * costOfHotDogs;
		System.out.println(totalCostOfHotDogs);


        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int hiltsPencilFundInCents =  50;
		int costOfPencilsInCents = 7;
		int pencilsHiltCanPurchase =  hiltsPencilFundInCents / costOfPencilsInCents;
		System.out.println(pencilsHiltCanPurchase);


        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalButterfliesObserved = 33;
		int orangeButterflies = 20;
		int redButterflies = totalButterfliesObserved - orangeButterflies;
		System.out.println(redButterflies);


        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double kateTendered = 1.00;
		double katesCandyCost = .54;
		double katesPurchaseChange = kateTendered - katesCandyCost;
		System.out.println(katesPurchaseChange);


        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int treesInBackYard = 13;
		int treeAdditionToYard = 12;
		int potentialTreeTotal = treesInBackYard + treeAdditionToYard;
		System.out.println(potentialTreeTotal);


        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int daysUntilGrandmasVisit = 2;
		int hourInDay = 24;
		int daysToHoursRemaining = daysUntilGrandmasVisit * hourInDay;
		System.out.println(daysToHoursRemaining);


        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int totalCousins = 4;
		int gumToDistribute =5;
		int requiredPiecesOfGum = totalCousins * gumToDistribute;
		System.out.println(requiredPiecesOfGum);



        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double dansTotalFunds = 3;
		double costOfCandyBar = 1;
		double dansMoneyRemaining = dansTotalFunds - costOfCandyBar;
		System.out.print(dansMoneyRemaining);

        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsInLake = 5;
		int boatCapacity = 3;
		int totalIndividualOnBoats = boatsInLake * boatCapacity;
		System.out.println(totalIndividualOnBoats);


        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int ellensTotalLegos = 380;
		int ellensMisplacesLegos = 57;
		int ellensRemainingLegos = ellensTotalLegos -ellensMisplacesLegos;
		System.out.println(ellensRemainingLegos);


        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int arthursRequiredMuffins = 83;
		int arthursBakedMuffins = 35;
		int arthurShouldBake = arthursRequiredMuffins - arthursBakedMuffins;
		System.out.println(arthurShouldBake);

        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willysCrayons = 1400;
		int lucysCrayons = 290;
		int willysComparedToLucys = willysCrayons - lucysCrayons;
		System.out.println(willysComparedToLucys);
        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersPerPages = 10;
		int pagesOfStickers = 22;
		int totalNumberOfStickers = stickersPerPages * pagesOfStickers;
		System.out.println(totalNumberOfStickers);


        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		double totalNumberOfCupcakes = (int)100;
		double numberOfChildren = (int)8;
		double equallyShareCupcakes  = totalNumberOfCupcakes / numberOfChildren;
		System.out.println(equallyShareCupcakes);


        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int totalGingerbreadCookiesMade = 47;
		int cookiesPerJar = (int)6;
		int remainingCookies = totalGingerbreadCookiesMade % cookiesPerJar;
		System.out.println(remainingCookies);



        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int preparedCroissants = 59;
		int neigbors = 8;
		int remainingCroissants = preparedCroissants % neigbors;


        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookieCapacityPerTray = 12;
		int desiredCookiesToPrepare = 276;
		int requiredTrays = desiredCookiesToPrepare / cookieCapacityPerTray;
		System.out.println(requiredTrays);

        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int servingOfPretzels = 12;
		int preparedBiteSizedPretzels = 480;
		int totalServingsPossible = preparedBiteSizedPretzels / servingOfPretzels;
		System.out.println(totalServingsPossible);


        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int totalLemonCakesPrepared = 53;
		int lemonCakesLeftAtHome = 2;
		int lemonCakeBoxCapacity = 3;
		int cakesToPrepareServings = totalLemonCakesPrepared - lemonCakesLeftAtHome;
		int boxesOfLemonCakesDonated = cakesToPrepareServings / lemonCakeBoxCapacity;
		System.out.println(boxesOfLemonCakesDonated);


        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int preparedCarrotSticks = 74;
		int equallyServedIndividuals = 12;
		int remainingCarrotSticks = preparedCarrotSticks % equallyServedIndividuals;
		System.out.println(remainingCarrotSticks);


        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int totalTeddyBearsGathered = 98;
		int selfCapacity = 7;
		int filledShelves = totalTeddyBearsGathered / selfCapacity;
		System.out.println(filledShelves);


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int albumPicturesCapacity = 20;
		int totalPicturesCollected = 480;
		int totalAlbumsRequired = totalPicturesCollected / albumPicturesCapacity;
		System.out.println(totalAlbumsRequired);



        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int collectedTradingCard = 94;
		int photoBoxCapacity = 8;
		int totalBoxesFilled = collectedTradingCard / photoBoxCapacity;
		int cardRemaining = collectedTradingCard % photoBoxCapacity;
		System.out.println(totalBoxesFilled);
		System.out.println(cardRemaining);



        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int totalBooks = 210;
		int totalBookShelves = 10;
		int booksShelvesObtained = totalBooks / totalBookShelves;
		System.out.println(booksShelvesObtained);



        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double cristinasCroissants = (int)17;
		double cristinasGuest = (int)7;
		double guestServed = cristinasCroissants / cristinasGuest;
		System.out.println(guestServed);


	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the
	    combined hourly rate of the painters.
	    */
		double totalRooms = (int)5;
		double roomInFeet = (int)14;
		double totalWalls = totalRooms * roomInFeet;
		double billsPaintingTimeInHours = 2.15 ;
		double jillsPaintingTimeInHours = 1.90 ;

//		double billsPaintingAverage = roomInFeet / billsPaintingTimeInHours;
//		double jillsPaintingAverage = roomInFeet / jillsPaintingTimeInHours;

		double combinedPaintingAverage = billsPaintingTimeInHours + jillsPaintingTimeInHours;
		double totalTimeToPaintRooms = combinedPaintingAverage / totalWalls;
		System.out.println(totalTimeToPaintRooms);



	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName = "Grace";
		String lastName = "Hopper";
		char middleInitial = 'B';

		String fullName = (lastName + ", "  ) + (firstName + " ") + (middleInitial + ".");
		System.out.println(fullName);


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		double totalDistanceBetweenCities = (int)800;
		double distanceTraveled = (int)537;
		int percentageCompleted = (int) ((distanceTraveled / totalDistanceBetweenCities) * 100);
		System.out.println(percentageCompleted);

	}

}
