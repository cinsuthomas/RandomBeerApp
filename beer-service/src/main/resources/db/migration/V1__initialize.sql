CREATE TABLE beer_data (
  id int(11) NOT NULL,
  name varchar(255) DEFAULT NULL,
  description varchar(2000) DEFAULT NULL,
  alcohol_percentage float DEFAULT NULL,
  brewery_location varchar(255) DEFAULT NULL,
  image_location varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ;

INSERT INTO beer_data (id,name,description,alcohol_percentage,brewery_location,image_location)
 VALUES (
 1,
 'Troegenator Double Bock',
 'Brewed by Troegs, the Double Bock is made from chocolate, Munich, Pilsner, German Northern Brewer, Magnum, and Lager.It is thick and chewy with intense notes of caramel and chocolate. Popping the bottle will give you a scent of Christmas with cinnamon and gingerbread. Aside from caramel, you can also taste sweet mash and dried stone fruit. Beer writer Lew Bryson has also named the Troegenator Double Bock as the best beer he had in 2004.',
 8.2,
 'Troegs',
 '/images/Troegenator-Double-Bock.jpg');

INSERT INTO beer_data (id,name,description,alcohol_percentage,brewery_location,image_location)
 VALUES (
 2,
 'Delirium Tremens',
 'As described on the website, “Sipping this beer feels like the sound shot of alcohol is igniting the mouth. The tongue and palate are warmed.Its roundness characterizes the taste. The aftertaste is strong, long-lasting and dry bitter.” Its scent is slightly malty which gives a nice touch of alcohol and spice.“Delirium Tremens was nominated as the “best beer in the world” in 1997 and won a gold medal during the World Beer Championships in Chicago in 1998. The brewery’s other beers have also won multiple awards.”– Andrew Thomas, VinePair',
 8.5,
 'Huyghe Brewery',
 '/images/Delirium-Tremens.jpg');

INSERT INTO beer_data (id,name,description,alcohol_percentage,brewery_location,image_location)
 VALUES (
 3,
 'G’Knight Imperial Red',
 'This beer was brewed with an impressive background. There is a quote on the can saying “If you knew the man behind this tribute, this ale needs no explanation. If you didn’t, we’re sorry.”It is a tribute to Gordon Knight, a Vietnam vet, who died fighting the Lyons, Colorado forest fire in 2002. Aside from being a soldier, Knight was also a helicopter pilot, a beer enthusiast, and brewer himself. It is lightly carbonated with tea flavor, and it gives you a surprisingly smooth finish.',
 8.7,
 'Oskar Blues Brewery',
 '/images/GKnight-Imperial-Red.jpg');

INSERT INTO beer_data (id,name,description,alcohol_percentage,brewery_location,image_location)
 VALUES (
 4,
 'Japanese Green Tea IPA',
 'A double IPA with an ABV of 10.1%, this beer is brewed by 3 different brewing companies Baird, Ishii, and Stone.The brewers said that this beer is an “extension of our ‘What if’ mentality” and they took it to the next level by brewing a beer made of green tea. The tea flavor is delicate, and the hop finish is not too much.',
 10.1,
 'Baird Brewing Company, Ishii Brewing Co., Stone Brewing Co.',
 '/images/Japanese-Green-Tea-IPA.jpg');

INSERT INTO beer_data (id,name,description,alcohol_percentage,brewery_location,image_location)
 VALUES (
 5,
 'Bourbon County Brand Coffee Stout',
 'This Imperial Stout Aged in Bourbon Barrels is made from 2-Row, Black Malt, Caramel, Chocolate, Munich, and Roast Barley. Its taste is dominated by coffee, dark chocolate, vanilla, and wood.This beer is perfect for those who love beer and coffee at the same time.Intelligentsia coffee strongly influences its taste, and aside from that, it is housed in Heaven Hill bourbon barrels for eight months.',
 12.9,
 'Goose Island Beer Company',
 '/images/Bourbon-County-Brand-Coffee-Stout.jpg');

INSERT INTO beer_data (id,name,description,alcohol_percentage,brewery_location,image_location)
 VALUES (
 6,
 '120 Minute IPA',
 'This is one of the strongest beer on our list with a alcohol content of 15-20%. The sweet citrus, piney, floral hop aromas, almost candy-like aroma of this beer imperial IPA will surely leave you wanting for more.Its flavor will give you hoppy with some hop resin character, and its mouthful experience will bring you a slight coating with lingering bitterness.Dogfish Head considers this beer as the Holy Grail for hopheads.',
 18.4,
 'Dogfish Head',
 '/images/120-Minute-IPA.jpg');

commit;

