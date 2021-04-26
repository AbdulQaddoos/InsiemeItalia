package com.ibmclub.discounts;

import android.location.Location;

import java.io.Serializable;
import java.util.ArrayList;

public class MyLocation implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String description;
	Location location;
	int type;
	int drawable;

	public MyLocation(String name, String description, Location location, int type, int drawable )
		{
			// TODO Auto-generated constructor stub
			setDescription(description);
			setName(name);
			setLocation(location);
			setType(type);
			setDrawable(drawable);
		}

	public String getName()
		{
			return name;
		}

	public void setName(String name)
		{
			this.name = name;
		}

	public String getDescription()
		{
			return description;
		}

	public void setDescription(String description)
		{
			this.description = description;
		}

	public Location getLocation()
		{
			return location;
		}

	public void setLocation(Location location)
		{
			this.location = location;
		}

	public int getType()
		{
			return type;
		}

	public void setType(int type)
		{
			this.type = type;
		}

	public int getDrawable()
		{
			return drawable;
		}

	public void setDrawable(int drawable)
		{
			this.drawable = drawable;
		}


	static MyLocation m0 = new MyLocation("IBM",
			"International Business Machines Corporation (IBM) is an American multinational information technology company headquartered in Armonk, New York, with operations in over 170 countries. The company began in 1911, founded in Endicott, New York, as the Computing-Tabulating-Recording Company (CTR) and was renamed International Business Machines in 1924. IBM is incorporated in New York", getLocationFromLatLng(49.225612, 16.5758007), 0,
			R.drawable.clubibm);

//	Childcare / Education
	static MyLocation m1 = new MyLocation("Dráček", "Dráček Nursery School in Brno provides full pre-school education for children generally aged between 2 and 6. Our aim is to assure that the children are enthusiastic and actively enjoy their day in the nursery school, and that parents are satisfied in that they can do their jobs in the assurance that their children are being very well looked after.", getLocationFromLatLng(49.207913, 16.601067), 1, R.drawable.childcare);
	static MyLocation m2 = new MyLocation("Mateřídouška", "The First Private Nursery school in Brno.It's fully and modernly equipped to meet the children's needs.We promote the healthly lifestyle: well-ballanced diet (two snacks and lunch), trips, diverse and stimulating environment,etc.For information in English call: +420-739-954-344, +420-605-712-132.Information in Czech call: +420-608-886-870", getLocationFromLatLng(49.201855, 16.595825), 1, R.drawable.childcare);
	static MyLocation m3 = new MyLocation("MonkeyMatter", "Monkey Matters is a new and modern English daycare with educational standards. We are a family-oriented daycare which allows parents to involve themselves within our program. We are a brand-new school located nearby the centre of Brno. Our entire program is in English and taught by native speakers. Carrying out daily routines in English aims for the children to build on English as a second language from an early age. We have a multi-cultural environment where any culture, race or religion can feel comfortable.", getLocationFromLatLng(49.1858735, 16.6236224), 1, R.drawable.childcare);
	static MyLocation m86 = new MyLocation("International School of Brno", "The International School of Brno was established in 2008 with major support from Brno town hall and the South-Moravian regional office. Our aim is to provide Kindergarten to High School students from all over the world with the necessary tools to become committed, lifelong learners and responsible, engaged citizens of the world.", getLocationFromLatLng(49.2012502, 16.6615583), 1, R.drawable.childcare);
	static MyLocation m4 = new MyLocation("Brno Business Toastmasters", "Toastmasters is a non-profit organization that has clubs all over the world (more than 350k members in 16k clubs worldwide), dedicated to teaching Public speaking & Leadership skills in a very experiential manner (learning by doing). What that means is that we meet once a week for a couple of hours and have prepared and unprepared speeches followed by feedback.", getLocationFromLatLng(49.2005242, 16.6009439), 1, R.drawable.childcare);

//	Electronics
	static MyLocation m5 = new MyLocation("Apple products/iSetos", "Employee purchase program.Apple products.All products can be purchased for your special price at our stores upon your employee card presentation.", getLocationFromLatLng(50.121643, 14.5907811), 2, R.drawable.electronics);
	static MyLocation m6 = new MyLocation("Euronics and Kasa.cz", "EURONICS offer you all kinds of consumer electronics. Products from large and small household appliances, via laptops, tablets, mobile phones and other equipment to offices to navigation, cameras and other products suitable for travel and entertainment. Wide range of products includes smart technology, ecological and economical products. It's up to you whether you visit one of our stores or take goods online at e-shop.KASA.cz is one of the online stores belonging to the group of shopping portals operated by.nákupních portálů.It is currently operating as an independent legal entity in the Czech Republic, Slovakia and Poland", getLocationFromLatLng(49.1861355, 16.5909369), 2, R.drawable.electronics);
	static MyLocation m7 = new MyLocation("Datart", "DATART is a leading retailer focused on consumer electronics. The Czech and Slovak market since 1990 and during this time we have gained many satisfied customers who are searching for our quality products at the best prices and with rich services.", getLocationFromLatLng(49.177003, 16.5658534), 2, R.drawable.electronics);
	static MyLocation m8 = new MyLocation("iRobot", "", getLocationFromLatLng(49.1687503, 16.623988), 2, R.drawable.electronics);

	//Foods
	static MyLocation m9 = new MyLocation("Healthy FOOD - 3 LISTEK", "E-shop 3listek.cz and stone plant 3lístek at Štefánikova 850/23, Brno are operated by MEL & THEI,sro.Ordered goods will be delivered in Brno according to the agreement, according to our time possibilities, immediately after receiving the order, in the evening or on weekends.", getLocationFromLatLng(49.2103005, 16.6003703), 3, R.drawable.foods);
	static MyLocation m10 = new MyLocation("Cafe d'Elvert", "We are an e-shop where you will find everything you need to prepare the perfect coffee. Not only do we sell fresh coffee , we also teach how to care for it and how to prepare it properly.In our assortment you can also find quality baristic equipment, coffee machines, coffee grinders, courses and other accessories.", getLocationFromLatLng(49.1939467, 16.6386263), 3, R.drawable.foods);
	static MyLocation m11 = new MyLocation("LakeView Cafe", "LakeView Cafe Serves breakfast, lunch, coffee and drinks.Provide Services:Catering.Good for groups or parties.Takes bookings.Takeaway.Table service.Walk-ins welcome", getLocationFromLatLng(49.2307615, 16.5746103), 3, R.drawable.foods);
	static MyLocation m12 = new MyLocation("U Josta", " U Jošta is an exquisite setting for extravagant afternoon socialization event.10% discount to all serving to you as an IBM employee", getLocationFromLatLng(49.1962415, 16.603369), 3, R.drawable.foods);

//	Finance
	static MyLocation m13 = new MyLocation("Raiffeisenbank", "Raiffeisen Bank is a top universal bank on the Romanian market, providing a complete range of products and services to private individuals, SMEs and large corporations via multiple distribution channels: banking outlets (more than 350 throughout the country), ATM and EPOS networks, phone-banking (Raiffeisen Direct) and mobile-banking (myBanking).", getLocationFromLatLng(49.2231849, 16.5866449), 4, R.drawable.finance);
	static MyLocation m14 = new MyLocation("UniCredit bank", "UniCredit S.p.A. is an Italian global banking and financial services company.Its network spans 50 markets in 17 countries, with more than 8,500 branches and over 147,000 employees.Its strategic position in Western and Eastern Europe gives the group one of the region's highest market shares.", getLocationFromLatLng(49.2234792, 16.5950969), 4, R.drawable.finance);

//Real estates & Accommodation
	static MyLocation m15 = new MyLocation("Century 21 All Inclusive - Real Estates", "It offers comprehensive services. We specialize in Brno west, mainly Bystrc, Komin, Kohoutovice and Zebetin, but we operate within the whole South Moravia region and beyond. We can offer all inclusive support and guidance if you decide to invest your finance into real estate. ", getLocationFromLatLng(49.2254167, 16.5279833), 5, R.drawable.realestates);
	static MyLocation m16 = new MyLocation("Apartments U Tomana", "Experience Brno U Tomana! Experience Brno in our eleven boutique apartments on the Freedom square. Each floor offers you a piece of historical or today’s Brno: Grand Prix, Villa Tugendhat, theater scene, prison and urban spa under one roof right on the Freedom Square.", getLocationFromLatLng(49.1951913, 16.6049122), 5, R.drawable.realestates);
	static MyLocation m17 = new MyLocation("Guesthouse Snezna Sumava", "Unique Penzion Sněžná is located at the heart of Sumava Mountains and is housed in a more than 200 years old timbered house, national monument. Accommodation is available in rooms for 2 to 6 people, every room has its own TV, private bathroom and toilet. There are 2 meeting rooms and a large garden with a seating area. There is also an indoor playing area for children and outdoor garden with sandpit. The guesthouse offers accommodation with breakfast (large buffet) or half board (served two-course dinner). Nearby, there are hiking, cycling, cross-country skiing tracks and ski resorts. This wooden lodge is ideal for family holidays as well as group gatherings.", getLocationFromLatLng(48.9090262, 13.8872568), 5, R.drawable.realestates);


//	Health & Body
	static MyLocation m18 = new MyLocation("Health & Beauty Studio", "Body analysis is FOR FREE for IBMers on special body scanner", getLocationFromLatLng(49.1954094, 16.6133883), 6, R.drawable.healthandbody);
	static MyLocation m19 = new MyLocation("M Salon (Hairdrassers)", "M- Salon is located in the heart center of Brno and has over 12 year of experience, recently fully renovated.", getLocationFromLatLng(49.1949395, 16.6078261), 6, R.drawable.healthandbody);
	static MyLocation m20 = new MyLocation("MANELO – BEAUTY SALON", "You will find complete cosmetic services, body treatments, slimming procedures, body wraps, manicure, pedicure, hairdresser, eyelash extension etc.", getLocationFromLatLng(49.1922345, 16.6054742), 6, R.drawable.healthandbody);
	static MyLocation m21 = new MyLocation("Psychotherapeut Stepan Borkovec", "Stepan Borkovec is a Private psychologist and psychotereapeut offering individual psychotherapy for adults, teens and couple therapy. ", getLocationFromLatLng(49.2153774, 16.6220522), 6, R.drawable.healthandbody);
	static MyLocation m22 = new MyLocation("KaOptik", "KaOptik is a personal approach to customers and their requirements, we offer dioptric, sunglasses (glasses), contact lenses and accessories. In our optics, we will gladly measure your vision and perform various eye tests important for correction", getLocationFromLatLng(49.1877535, 16.6050602), 6, R.drawable.healthandbody);
	static MyLocation m23 = new MyLocation("Optik-Dirk", "Family optician stores with 20-year tradition in Brno", getLocationFromLatLng(49.187848, 16.5372086), 6, R.drawable.healthandbody);
	static MyLocation m24 = new MyLocation("Studio Linie", " offer great massages , recovery in the whirlpool , strengthening immunity in the infrared sauna . In the solarium you give your skin a natural color. In addition, if you suffer from excess adipose tissue, we offer professional application of so-called injection lipolysis.", getLocationFromLatLng(49.2073126, 16.5992658), 6, R.drawable.healthandbody);
	static MyLocation m25 = new MyLocation("EpicWorks", "EpicWorks is Czech Republic premiere source for men’s grooming solutions. We provide these solutions via our best-in-class web destination(right here at www.epicworks.cz),iconic Barbershops & Men’s Spa locations.", getLocationFromLatLng(49.3162785, 16.5436452), 6, R.drawable.healthandbody);
	static MyLocation m26 = new MyLocation("Bubeliny Barber Shop", "Our barbers are precise and experienced.Service quality, your satisfaction and your comfort are most important to us.For each visit you will get coffee, water,and a glass of premium whisk(e)y or rum.We have spare parking spots reserved for our customers right across the barber shop. We are in the heart of Brno – next to the shopping centre Vaňkovka.", getLocationFromLatLng(49.1882604, 16.6110568), 6, R.drawable.healthandbody);


	//Sports
	static MyLocation m27 = new MyLocation("Body Diamond", "Revolutionary EMS fitness training in Brno", getLocationFromLatLng(49.1972782, 16.5975864), 7, R.drawable.sports);
	static MyLocation m28 = new MyLocation("Big1Fitness", "Modern Fitness Club in the city center.122 fitness machines, special Cross Fit cage and planty of classes every day.", getLocationFromLatLng(49.1895315, 16.5952789), 7, R.drawable.sports);
	static MyLocation m29 = new MyLocation("Dance Center", "We are proud to have large but cozy studios with friendly staff ready to help you. There are toilets, showers and locker rooms at all of the studios. There are also props free to use during the lessons (such as over balls, yoga mats, TRX, rollers, bosu, dance props...).", getLocationFromLatLng(49.1956487, 16.5940859), 7, R.drawable.sports);
	static MyLocation m30 = new MyLocation("Dancing School Dynamic", "Lead by a dance professional, 7 lessons at luxury premises of the Starobrno brewery hall at Mendel square (Mendlovo namesti). 2 lessons of Salsa with a Cuban instructor William Zamora. Classic dances: Waltz, Tango, Quickstep Latino dances: Cha cha, Rumba, Salsa, Mambo, Samba Round dances: Valcik, Polka Jazz dance: jive Individual approach to clients is a priority.", getLocationFromLatLng(49.1910637, 16.6084923), 7, R.drawable.sports);
	static MyLocation m31 = new MyLocation("Davidovofitko", "We are a fitness center not only for students but also for the general public. Come and see us and exercise.", getLocationFromLatLng(49.2233485, 16.5795982), 7, R.drawable.sports);
	static MyLocation m32 = new MyLocation("Hot Yoga Balkan", "There are thousands of hot yoga studios throughout the world. Our certified instructors will lead you through a 90 minute class that is considered one of the most complete body workouts ever designed. Our yoga is performed at around 42° to allow for safe and deep stretching while simultaneously flushing and detoxifying every system of the body. Challenge yourself to a hot yoga class and be amazed how quickly you improve your health, flexibility and general sense of well being. You will tone and strengthen your muscles while trimming your waistline.", getLocationFromLatLng(49.2035681, 16.6222163), 7, R.drawable.sports);
	static MyLocation m33 = new MyLocation("Sportcentrum Kuklenska", "Sportcentrum Kuklenská offers:4 badminton courts in a modern air-conditioned Brno badminton hall with quality flexible floor and non-slip sports surface.Air-conditioned exercise hall for a number of activities.Rehabilitation and massage room,Sport Bar,Wi-Fi,Parking,Sport Shop,coaches,accept Multisport cards", getLocationFromLatLng(49.1952295, 16.630258), 7, R.drawable.sports);
	static MyLocation m34 = new MyLocation("Sportcentrum Ivanovice", "Sports facilities for badminton, table tennis and squash", getLocationFromLatLng(49.2589249, 16.569844), 7, R.drawable.sports);
	static MyLocation m35 = new MyLocation("Laser Game", "Lasergame (or lasertag) is an action game combining computer games with games like paintball and airsoft. It just doesn’t hurt,doesn’t make stains and can be played in a special laser arena thorough the year.", getLocationFromLatLng(49.1965685, 16.6023563), 7, R.drawable.sports);
	static MyLocation m36 = new MyLocation("Lanové centrum PROUD Brno", "Provide different sports activities", getLocationFromLatLng(49.228247, 16.6228322), 7, R.drawable.sports);
	static MyLocation m37 = new MyLocation("CrossFit New Park", "New Park Gym – the biggest Gym for functional exercises and competitive fitness sport in Brno", getLocationFromLatLng(49.1806585, 16.600492), 7, R.drawable.sports);
	static MyLocation m38 = new MyLocation("Sport95 (shop&service for bikes&skis)", "The Sport95 ski and cycling shop was founded in 1995 and since then we have been trying to offer top service.", getLocationFromLatLng(49.2127509, 16.604172), 7, R.drawable.sports);
	static MyLocation m39 = new MyLocation("Kung Fu School", "We’ve been training Kung-fu in Brno since 2003. We train a south Chinese style called Hung Gar or Hung Kuen. We have regular training for kids as well as adults. We train Kung-fu and also real-life self-defense. The best time to join us is during September (or January as well). Also, other parts of the year are available after arrangement. Our sessions are held in the Czech language but all our trainers speak English and are willing to help you. Apart from regular sessions you can arrange private training or seminars for specific groups such as a school or a company.", getLocationFromLatLng(49.1891191, 16.6177339), 7, R.drawable.sports);
	static MyLocation m40 = new MyLocation("Monika Houstkova - Qi Gong YOGA ", "Certified QIGONG lecturer, yoga and professional coach.", getLocationFromLatLng(49.2442817, 16.5832877), 7, R.drawable.sports);
	static MyLocation m41 = new MyLocation("Brazilian Jiu Jitsu", "Brazilian Jiu Jitsu is a modern and fast growing martial art.", getLocationFromLatLng(49.1895315, 16.5952789), 7, R.drawable.sports);
	static MyLocation m42 = new MyLocation("BKB", "Discussion with ultratrail runner Linda Beniačova (winner of extreme races as LH24, Beskydská sedmička, Horská výzva and others) ", getLocationFromLatLng(49.2202724, 16.5921556), 7, R.drawable.sports);
	static MyLocation m43 = new MyLocation("TuristServis", "Bikes rental, discount on trips, services, and treasure hunt game", getLocationFromLatLng(49.1941535, 16.6053867), 7, R.drawable.sports);
	static MyLocation m44 = new MyLocation("JetSurf Academy", "JETSURF is a surfboard with a built-in engine reaching speeds of up to 60 km / h with a weight of only 17 kg. You don't need any waves, but you surf - you have a board under your feet that you only control your body's tilt and accelerate your hands!", getLocationFromLatLng(48.7317071, 16.7914874), 7, R.drawable.sports);



//	Travel & Automotive
	static MyLocation m45 = new MyLocation("Mercedes", "Hošek Motor as was established in 1995 as a representation of the Mercedes-Benz Stuttgart automobile company for Brno and South Moravia. In the same year construction began and in 1996 the sales and service area in Brno-Vinohrady was put into operation.", getLocationFromLatLng(49.2080571, 16.6619768), 8, R.drawable.travel);
	static MyLocation m46 = new MyLocation("Opel partner", "BS AUTO, 10-25% discount on passenger vehicles", getLocationFromLatLng(50.1047177, 14.4550916), 8, R.drawable.travel);
	static MyLocation m47 = new MyLocation("Operational Leasing (Skoda)", "Auto Ros & Business Lease,Discounted offer for operational leasing (Skoda, VW and Audi)", getLocationFromLatLng(49.1857035, 16.5857303), 8, R.drawable.travel);
	static MyLocation m48 = new MyLocation("Car cleaning (Cistirna Aut)", "Car cleaning and hand car wash services for IBMers", getLocationFromLatLng(49.1438043, 16.6229433), 8, R.drawable.travel);


//Other
	static MyLocation m49 = new MyLocation("Koolna", "This company designs and engraves personalized gifts for weddings, anniversaries and not only. The services include designing of logo, engraving of logo or phrases to different type of material (T- shirts, wood, stainless steel and many more) and includes products like Personalized Coasters, Personalized Notebooks with Wooden cover, Engraved cutlery and many more)", getLocationFromLatLng(49.1886185, 16.6217215), 1, R.drawable.other);
	static MyLocation m50 = new MyLocation("Healthcare - Center of martial arts", "Provides Self-defense for women Fit for Fight - fitness excercise, Fit for Life - excercises similar to Yoga and/or ChiKung", getLocationFromLatLng(49.2031747, 16.5985394), 1, R.drawable.other);
	static MyLocation m51 = new MyLocation("Philharmonic Brno", "", getLocationFromLatLng(49.2032466, 16.5919733), 1, R.drawable.other);
	static MyLocation m52 = new MyLocation("Nazehlime ", "We provide services including transport within Brno free of charge.", getLocationFromLatLng(49.203725, 16.706693), 1, R.drawable.other);
	static MyLocation m53 = new MyLocation("TuristickeBatohy", "", getLocationFromLatLng(49.1938205, 14.4817124), 1, R.drawable.other);
	static MyLocation m54 = new MyLocation("Letofest BRNO 2019 ", "", getLocationFromLatLng(49.1877347, 16.5800167), 1, R.drawable.other);



	static Location getLocationFromLatLng(double lat, double lng)
		{
			Location loc = new Location("gps");
			loc.setLatitude(lat);
			loc.setLongitude(lng);
			return loc;
		}

	static ArrayList<MyLocation> locationList = new ArrayList<MyLocation>();

	static void setLocationList()
		{
			locationList = new ArrayList<MyLocation>();
			locationList.add(m0);
			locationList.add(m1);
			locationList.add(m2);
			locationList.add(m3);
			locationList.add(m4);
			locationList.add(m5);
			locationList.add(m6);
			locationList.add(m7);
			locationList.add(m8);
			locationList.add(m9);
			locationList.add(m10);
			locationList.add(m11);
			locationList.add(m12);
			locationList.add(m13);
			locationList.add(m14);
			locationList.add(m15);
			locationList.add(m16);
			locationList.add(m17);
			locationList.add(m18);
			locationList.add(m19);
			locationList.add(m20);
			locationList.add(m21);
			locationList.add(m22);
			locationList.add(m23);
			locationList.add(m24);
			locationList.add(m25);
			locationList.add(m26);
			locationList.add(m27);
			locationList.add(m28);
			locationList.add(m29);
			locationList.add(m30);
			locationList.add(m31);
			locationList.add(m32);
			locationList.add(m33);
			locationList.add(m34);
			locationList.add(m35);
			locationList.add(m36);
			locationList.add(m37);
			locationList.add(m38);
			locationList.add(m39);
			locationList.add(m40);
			locationList.add(m41);
			locationList.add(m42);
			locationList.add(m43);
			locationList.add(m44);
			locationList.add(m45);
			locationList.add(m46);
			locationList.add(m47);
			locationList.add(m48);
			locationList.add(m49);
			locationList.add(m50);
			locationList.add(m51);
			locationList.add(m52);
			locationList.add(m53);
			locationList.add(m54);

		}

	public static ArrayList<MyLocation> getLocationList()
		{
			return locationList;
		}

	public static ArrayList<MyLocation> getFilteredList(int type)
		{
			ArrayList<MyLocation> mList = new ArrayList<MyLocation>();
			setLocationList();
			if (type == 0)
				return locationList;
			for (int i = 0; i < locationList.size(); i++)
				{
					if (locationList.get(i).getType() == type)
						mList.add(locationList.get(i));
				}
			return mList;
		}
}
