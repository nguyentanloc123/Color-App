package com.tanloc2017.appmau;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.makeramen.roundedimageview.RoundedImageView;

import java.text.NumberFormat;
import java.util.ArrayList;

import mehdi.sakout.fancybuttons.FancyButton;
import petrov.kristiyan.colorpicker.ColorPicker;

//import petrov.kristiyan.colorpicker.ColorPicker;

public class MainEXtract extends AppCompatActivity {
    TextView txtname;
    Button img_bt;
    FancyButton btn2;
    TextView txthsl;
    TextView txthex;
    TextView txtrbg;
    TextView co1;
    TextView co2;
    TextView co3;
    TextView co4;
    TextView co5;
    TextView co6;
    FancyButton button;




    //ImageView imgv;
    String temp;
    private  static final int PICK_IMAGE=100;
    Uri image_uri;
    private Bitmap bitmap;
    TextView tv;
    int r,b,g;
    Button btn1;
    ListView lv;
    int mycolor;
    ColorPicker colorPicker;
    Integer selected;
    boolean checkopen=true;
    String[] name_color;
    String[] hex_color1;
    RoundedImageView imgv;
    FancyButton btn_home;
    FancyButton bt_loadimg;
    ArrayList<String> colors= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_extract);
        txthex=(TextView)findViewById(R.id.txthex);
        txtrbg=(TextView) findViewById(R.id.txtrbg);
        button=(FancyButton) findViewById(R.id.btnconvert);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainEXtract.this,Main2Activity.class);
                startActivity(intent);
            }
        });


        name_color= new String[]{"Black",
"Blue",
"Blue",
"Blue",
"Stratos",
"Swamp",
"Blue",
"Fir",
"Burnham",
"Blue",
"Blue",
"Blue",
"Smalt",
"Teal",
"Cyprus",
"Green",
"Cobalt",
"Crusoe",
"Blue",
"Endeavour",
"Camarone",
"Blue",
"Ribbon",
"Forest",
"Allports",
"Cerulean",
"Lochmara",
"Radiance",
"Teal",
"Blue",
"Blue",
"Green",
"Jade",
"Green",
"Blue",
"Green",
"Green",
"Aqua",
"Charcoal",
"Midnight",
"Holly",
"Daintree",
"Green",
"Green",
"Blue",
"Blue",
"Deep",
"Orient",
"Stone",
"Green",
"Green",
"Lagoon",
"Sea",
"Haze",
"Holly",
"Green",
"Blue",
"Sea",
"Blue",
"Observatory",
"Cerulean",
"Tangaroa",
"Vogue",
"Mosque",
"Moss",
"Pearl",
"Whale",
"Zuccini",
"Blue",
"Cove",
"Blue",
"Blue",
"Watercourse",
"Blue",
"Tiber",
"Gossamer",
"Niagara",
"Tarawera",
"Jaguar",
"Bean",
"Sapphire",
"Green",
"Turquoise",
"Downriver",
"Green",
"Madison",
"Green",
"Green",
"Salem",
"Russian",
"Fern",
"Laurel",
"Atoll",
"Gray",
"Marshland",
"Green",
"Forest",
"Felix",
"Malachite",
"Ebony",
"Woodsmoke",
"Green",
"Green",
"Chill",
"Rock",
"Bunker",
"Aztec",
"Bush",
"Cinder",
"Firefly",
"Bay",
"Vulcan",
"Waterloo",
"Eden",
"Arapawa",
"Ultramarine",
"Elephant",
"Jewel",
"Diesel",
"Asphalt",
"Zodiac",
"Parsley",
"Nero",
"Blue",
"Bunting",
"Denim",
"Genoa",
"Mirage",
"Green",
"Stone",
"Celtic",
"Green",
"Green",
"Tree",
"Blue",
"Green",
"Blumine",
"Leaf",
"Blue",
"Blue",
"Point",
"Meadow",
"Tolopea",
"Haiti",
"Koamaru",
"Acadia",
"Seaweed",
"Biscay",
"Matisse",
"Crowshead",
"Green",
"Blue",
"Everglade",
"Elm",
"Pea",
"Creole",
"Karaka",
"Paso",
"Cello",
"Green",
"Blue",
"Blue",
"Rider",
"Java",
"Purple",
"Burst",
"Dianne",
"Eternity",
"Blue",
"Green",
"Mallard",
"Violet",
"Kilamanjaro",
"Cabin",
"Olive",
"House",
"Graphite",
"Black",
"Gore",
"Shark",
"Kelp",
"Blue",
"Paua",
"M",
"Bark",
"Gondola",
"Gray",
"Clay",
"Many",
"Plantation",
"Eucalyptus",
"Oil",
"Astronaut",
"Mariner",
"Violet",
"Bastille",
"Zeus",
"Charade",
"Bean",
"Green",
"Pie",
"Bean",
"Sea",
"Green",
"Blue",
"Black",
"Valhalla",
"Metal",
"Gem",
"Revolver",
"Cedar",
"Lochinvar",
"Mikado",
"Space",
"Tropaz",
"Jacaranda",
"Bean",
"Rangitoto",
"Rhino",
"Green",
"Scooter",
"Onion",
"Bay",
"Sapphire",
"Spectra",
"Casal",
"Melanzane",
"Brown",
"Woodrush",
"Juan",
"Turquoise",
"Eclipse",
"Bluewood",
"Azure",
"Calypso",
"Paradiso",
"Indigo",
"Blackcurrant",
"Shaft",
"Stromboli",
"Bilbao",
"Astral",
"Christalle",
"Thunder",
"Shamrock",
"Tamarind",
"Gras",
"Valentino",
"Jagger",
"Tuna",
"Chambray",
"Martinique",
"Tuatara",
"Waiouru",
"Ming",
"Palma",
"Chocolate",
"Clinker",
"Tumbleweed",
"Birch",
"Oracle",
"Diamond",
"Grape",
"Dune",
"Blue",
"Clover",
"Spruce",
"Dell",
"Toledo",
"Sambuca",
"Jacarta",
"William",
"Killarney",
"Keppel",
"Temptress",
"Aubergine",
"Jon",
"Treehouse",
"Amazon",
"Blue",
"Windsor",
"Rebel",
"Meteorite",
"Ebony",
"Camouflage",
"Gray",
"Cod",
"Green",

"Bistre",
"Goblin",
"Daisy",
"Cedar",
"Walnut",
"Marlin",
"Gray",
"Pelorous",
"Bronze",
"Cola",
"Madras",
"Minsk",
"Pont",
"Thumb",
"Green",
"Rico",
"Harlequin",
"Pod",
"Cork",
"Masala",
"Green",
"Fiord",
"Viridian",
"Green",
"Plum",
"Paco",
"Oak",
"Merlin",
"Powder",
"Bay",
"Blue",
"Green",
"Maroon",
"Brown",
"Jade",
"Gum",
"Iroko",
"Armadillo",
"Bed",
"Leaf",
"Barossa",
"Brown",
"Mako",
"Kelp",
"Marino",
"Blue",
"Loulou",
"Brown",
"Asparagus",
"Blue",
"Red",
"Rose",
"Clairvoyant",
"Bean",
"Brown",
"Taupe",
"Cleef",
"Derby",
"Bronze",
"Green",
"Bayoux",
"Bismark",
"Bracken",
"Bronze",
"Mondo",
"Tundora",
"Gravel",
"Trout",
"Indigo",
"Nandor",
"Saddle",
"Abbey",
"Blackberry",
"Sav",
"Tan",
"Cowboy",
"Brown",
"Rock",
"Punga",
"Bronzetone",
"Woodland",
"Mahogany",
"Bossanova",
"Matterhorn",
"Olive",
"Wine",
"Axolotl",
"Wedgewood",
"Shakespeare",
"Flower",
"Bush",
"Indigo",
"Green",
"Salad",
"Apple",
"Mortar",
"Blue",
"Sark",
"Emerald",
"Emperor",
"Green",
"Como",
"Blue",
"Castro",
"Oak",
"Gigas",
"Voodoo",
"Victoria",
"Green",
"Heath",
"Gray",
"Gray",
"Loca",
"Cioccolato",
"Saratoga",
"Finlandia",
"Blue",
"Blue",
"Leaves",
"Brown",
"Flow",
"Cactus",
"Blue",
"Berry",
"Bramble",
"Brown",
"Millbrook",
"Gray",
"Horizon",
"Jambalaya",
"Bordeaux",
"Wood",
"Tan",
"Comet",
"Redwood",
"Juan",
"Chicago",
"Verdigris",
"Dingley",
"Bay",
"Kabul",
"Hemlock",
"Coffee",
"Gray",
"Gray",
"Forest",
"Tradewind",
"Neck",
"Smoky",
"Corduroy",
"Danube",
"Espresso",
"Eggplant",
"Sol",
"Green",
"Buccaneer",
"Quincy",
"Bush",
"Coast",
"Finch",
"Patina",
"Fern",
"Violet",
"Dolphin",
"Dust",
"Siam",
"Nevada",
"Blue",
"Viking",
"Rosewood",
"Cherrywood",
"Heart",
"Frond",
"Grove",
"Hoki",
"Pompadour",
"Purple",
"Purple",
"Tan",
"Tree",
"Green",
"Green",
"Rose",
"Scampi",
"Gray",
"Green",
"Christi",
"Finish",
"Zambezi",
"Box",
"Port",
"Finn",
"Scorpion",
"Lynch",
"Spice",
"Himalaya",
"Bean",
"Heath",
"Purple",
"Fawn",
"Dorado",
"Gray",
"Drab",
"Eminence",
"Blue",
"Lonestar",
"Cone",
"Gray",
"Juniper",
"Gothic",
"Oxide",
"Moccaccino",
"Bean",
"Dallas",
"Kokoda",
"Sky",
"Royale",
"Flint",
"Highland",
"Limeade",
"Downy",
"Plum",
"Sepia",
"Bronze",
"Ferra",
"Coffee",
"Gray",
"Finish",
"Copper",
"Affair",
"Studio",
"Brown",
"Metal",
"Peat",
"Olivetone",
"Gray",
"Sirocco",
"Blue",
"Red",
"Copper",
"Ben",
"Raven",
"Seance",
"Umber",
"Kimberly",
"Crocodile",
"Crete",
"Xanadu",
"Mustard",
"Ash",
"Stone",
"Smoke",
"Laurel",
"Mantis",
"Russett",
"Deluge",
"Cosmic",
"Marguerite",
"Lima",
"Blue",
"Burgundy",
"Thorns",
"Walnut",
"Pablo",
"Pacifika",
"Oxley",
"Green",
"Maple",
"Mocha",
"Peanut",
"Green",
"Wasabi",
"Cove",
"Nymph",
"Coffee",
"Lavender",
"Rum",
"Fedora",
"Sandstone",
"Spray",
"Siren",
"Blue",
"Boulder",
"Yonder",
"York",
"Beech",
"Cinnamon",
"Gold",
"Tapa",

"Smoke",
"Amulet",
"Asparagus",
"Copper",
"Pesto",
"Topaz",
"Concord",
"Jumbo",
"Green",
"Gumbo",
"Acapulco",
"Neptune",
"Pueblo",
"Leaf",
"Malibu",
"Bermuda",
"Canyon",
"Claret",
"Tan",
"Falcon",
"Mobster",
"Blue",
"Chartreuse",
"Aquamarine",
"Maroon",
"Cherry",
"Red",
"Robin",
"Violet",
"Russet",
"Gray",
"Olive",
"Gray",
"Stream",
"Glacier",
"Seagull",
"Nutmeg",
"Pink",
"Empress",
"Green",
"Dune",
"Gunsmoke",
"Gray",
"Merlot",
"Shadow",
"Cucumber",
"Carlo",
"Plum",
"Smith",
"Blue",
"Bandicoot",
"Hai",
"Baked",
"Devil",
"Lotus",
"Ironstone",
"Shot",
"Nail",
"Bitter",
"Gray",
"Disco",
"Americano",
"Hurricane",
"Gray",
"Sushi",
"Mix",
"Kumera",
"Gray",
"Avocado",
"Camelot",
"Pink",
"Pink",
"Makara",
"Umber",
"V",
"Creek",
"Monsoon",
"Stack",
"Blue",
"Violet",
"Monarch",
"Harvest",
"Haze",
"Schooner",
"Gray",
"Mantle",
"Portage",
"Envy",
"Cascade",
"Riptide",
"Pink",
"Fawn",
"Clay",
"Pink",
"Paprika",
"Brown",
"Tosca",
"Cement",
"Green",
"Manatee",
"Blue",
"Berry",
"Rope",
"Opium",
"Domino",
"Mamba",
"Nepal",
"Pohutukawa",
"Salva",
"Korma",
"Squirrel",
"Blue",
"Burgundy",
"Brick",
"Hemp",
"Frost",
"Sycamore",
"Sangria",
"Cumin",
"Beaver",
"Stonewall",
"Venus",
"Purple",
"Cornflower",
"Green",
"Rust",
"Arrowtown",
"Scarlett",
"Strikemaster",
"Mist",
"Carmine",
"Brown",
"Leather",
"Majesty",
"Purple",
"Pewter",
"Green",
"Chico",
"Wisteria",
"Atlantis",
"Rouge",
"Bush",
"Bazaar",
"Hacienda",
"Oyster",
"Green",
"Eggplant",
"Eggplant",
"Tamarillo",
"Pole",
"Rose",
"Amethyst",
"Pink",
"Bell",
"Sand",
"Toast",
"Gurkha",
"Olivine",
"Green",
"Oregon",
"Grass",
"Stiletto",
"Tan",
"Gray",
"Pistachio",
"Apple",
"Anakiwa",
"Gem",
"Skin",
"Sage",
"Citron",
"Blue",
"Glory",
"Cognac",
"Gold",
"Dust",
"Gray",
"Sinbad",
"Feijoa",
"Tabasco",
"Rum",
"Gray",
"Citrus",
"Island",
"Leaf",
"Flirt",
"Rouge",
"Palliser",
"Chateau",
"Edward",
"Pharlap",
"Smoke",
"Blue",
"Delta",
"Wistful",
"Smoke",
"Jam",
"Zorba",
"Bahia",
"Terracotta",
"Paarl",
"Corn",
"Brown",
"Dawn",
"Red",
"Gold",
"Gold",
"Sand",
"Tree",
"Gray",
"Lavender",
"Tallow",
"Bud",
"Locust",
"Norway",
"Chinook",
"Olive",
"Aluminium",
"Blue",
"Schist",
"Gray",
"Perano",
"Opal",
"Shadz",
"Fire",
"Muesli",
"Sandal",
"Lady",
"Logan",
"Pearl",
"Blue",
"Mint",
"Lipstick",
"Heath",
"Sandrift",
"Purple",
"Bronco",
"Oak",
"Side",
"Ginger",
"Napa",
"Hillary",
"Cloudy",
"Chalice",
"Green",
"Rain",
"Conifer",
"Celadon",
"Mandalay",
"Casper",
"Green",
"Padua",
"Yellow",
"Pink",
"Desert",
"Bouquet",
"Carmine",
"Blossom",
"Rust",
"Driftwood",
"Alpine",
"Lucky",
"Martini",
"Bombay",
"Post",
"Cadillac",
"Matrix",
"Tapestry",
"Tai",
"Rio",
"Blue",
"Worm",
"Red",
"Vesuvius",
"Skin",
"Fe",
"Teak",
"Flower",
"Cold",
"Shiraz",
"Flower",
"Poppy",
"Orange",
"Toddy",
"Gray",
"Rioja",
"Read",
"Blush",
"Mist",
"Rose",
"Lavender",
"Mongoose",
"Green",
"Stream",
"Cruise",
"Hibiscus",
"Thatch",
"Gray",
"Eagle",
"Spindle",
"Leaf",
"Rust",
"Waters",
"Sahara",
"Husk",
"Nobel",
"Heather",
"Madang",
"Red",
"Copper",
"Gimblet",
"Spring",
"Celery",
"Sail",
"Chestnut",
"Crail",
"Marigold",
"Willow",
"Rainee",
"Red",
"Spray",
"Bourbon",
"Gold",
"Nomad",
"Submarine",
"Charlotte",
"Violet",
"Rose",
"Grande",
"Surf",
"Ash",
"Tuscany",
"Quicksand",
"Silk",
"Malta",
"Chatelle",
"Gray",
"Gray",
"Ash",
"Loblolly",
"Pass",
"Hue",
"Swan",
"Fuego",
"Sharon",
"Tide",
"Haze",
"Sand",
"Pie",
"Ziggurat",
"Lime",
"Thunderbird",
"Mojo",
"Rose",
"Silver",
"Leaf",
"Green",
"Maria",
"Pink",
"Gold",
"Hide",
"Tea",
"Suit",
"Sprout",
"Sulu",
"Indochine",
"Twine",
"Seed",
"Pumice",
"Ice",
"Flush",
"Khaki",
"Slate",
"Nickel",
"Gray",
"Tiara",
"Blue",
"Cardinal",
"Brown",
"Roughy",
"Gray",
"Coriander",
"Tulip",
"Mulberry",
"Nugget",
"Tussock",
"Mist",
"Green",
"Red",
"Contessa",
"Pink",
"Roti",
"Ash",
"Kangaroo",
"Palmas",
"Monza",
"Violet",
"Reef",
"Melrose",
"Cloud",
"Ghost",
"Glade",
"Botticelli",
"Brass",
"Lilac",
"Pokey",
"Lily",
"Laser",
"Edgewater",
"Piper",
"Pizza",
"Wisteria",
"Dust",
"Sundance",
"Green",
"Rust",
"Conch",
"Reef",
"Blue",
"Mahogany",
"Turmeric",
"White",
"Lemon",
"Skeptic",
"Viola",
"Gray",
"Mist",
"Nebula",
"Red",
"Orange",
"Ochre",
"Puce",
"Green",
"Periwinkle",
"Lime",
"Tenn",
"Rose",
"Punch",
"Onahau",
"Brown",
"Turkey",
"Yuma",
"Chino",
"Eunry",
"Gold",
"Tasman",
"Crest",
"Bird",
"Scandal",
"Stage",
"Hopbush",
"Meteor",
"Perfume",
"Prelude",
"Green",
"Geebung",
"Vanilla",
"Amber",
"Celeste",
"Mischka",
"Pear",
"Cinnamon",
"Sienna",
"Pink",
"Tan",
"Deco",
"Romance",
"Gossip",
"Sisal",
"Swirl",
"Charm",
"Shell",
"Straw",
"Akaroa",
"Flower",
"Iron",
"Geyser",
"Blue",
"Grenadier",
"Can",
"Whiskey",
"Hazel",
"Apple",
"Pink",
"Tacha",
"Raker",
"Gray",
"Mint",
"Pink",
"Pavlova",
"Fog",
"Valencia",
"Japonica",
"Thistle",
"Maverick",
"Foam",
"Cabaret",
"Sand",
"Cameo",
"Timberwolf",
"Tana",
"Water",
"Mabel",
"Cerise",
"Pea",
"Bamboo",
"Damask",
"Orchid",
"Copperfield",
"Grass",
"Zanah",
"Iceberg",
"Bay",
"Cranberry",
"Orchid",
"Serria",
"Alto",
"Mint",
"Crimson",
"Punch",
"Galliano",
"Blossom",
"Wattle",
"Westar",
"Mist",
"Caper",
"Down",
"Coffee",
"Ice",
"Red",
"Roman",
"Tumbleweed",
"Tips",
"Brandy",
"Wafer",
"Sapling",
"Barberry",
"Green",
"Blue",
"Heliotrope",
"Apache",
"Chenin",
"Lola",
"Brook",
"Yellow",
"Mauve",
"Anzac",
"Gold",
"Calico",
"Blue",
"Sunglo",
"Equator",
"Flare",
"Blue",
"Kidnapper",
"Tara",
"Mandy",
"Terracotta",
"Bell",
"Shocking",
"Dixie",
"Orchid",
"Snuff",
"Mystic",
"Green",
"Razzmatazz",
"Crimson",
"Cinnabar",
"Pink",
"Peppermint",
"Mindaro",
"Blush",
"Gamboge",
"Melanie",
"Twilight",
"Bone",
"Sunflower",
"Brown",
"Zombie",
"Frostee",
"Flurry",
"Amaranth",
"Zest",
"Storm",
"White",
"Hampton",
"Jour",
"Mercury",
"Polar",
"Trinidad",
"Sand",
"Cashmere",
"White",
"Linen",
"Harp",
"Green",
"Green",
"Tranquil",
"Tango",
"Christine",
"Pink",
"Kobi",
"Fog",
"Corn",
"Putty",
"Nurse",
"White",
"Bubbles",
"Bush",
"Shilo",
"Bush",
"White",
"White",
"Gin",
"Squeeze",
"Clementine",
"Sienna",
"Gold",
"Pink",
"Confetti",
"Ebb",
"Ottoman",
"Day",
"Carissma",
"Porsche",
"Tree",
"Roy",
"Raffia",
"Rock",
"Panache",
"Solitude",
"Spring",
"Dew",
"Apricot",
"Zinnwaldite",
"Yellow",
"Ronchi",
"Lilac",
"Right",
"Rice",
"Green",
"Special",
"Starship",
"Ribbon",
"Tango",
"Orange",
"Pink",
"Tacao",
"Sand",
"Pancho",
"Chamois",
"Primrose",
"Frost",
"Haze",
"Zumthor",
"Narvik",
"Honeysuckle",
"Magenta",
"Bush",
"Chalky",
"Almond",
"Flax",
"Bizarre",
"White",
"Cararra",
"Manz",
"Sands",
"Gray",
"Tusk",
"Loafer",
"White",
"Blue",
"Jonquil",
"Flower",
"Jaffa",
"Gallery",
"Porcelain",
"Mauvelous",
"Dream",
"Sand",
"Buff",
"Prim",
"Khaki",
"Selago",
"White",
"Blue",
"Feta",
"Drop",
"Wewak",
"Sand",
"Parchment",
"Chalk",
"Julep",
"Seashell",
"Saltpan",
"Tidal",
"Chiffon",
"Flamingo",
"Tangerine",
"Pink",
"Concrete",
"Squeeze",
"Pomegranate",
"Buttercup",
"Orleans",
"Ice",
"Sidecar",
"Pink",
"Wheatfield",
"Canary",
"Orinoco",
"Carla",
"Cerise",
"brown",
"Saffron",
"Lemon",
"Janna",
"Pampas",
"Sand",
"Zircon",
"Froly",
"Can",
"Manhattan",
"Maize",
"Wheat",
"Sandwisp",
"Pourri",
"White",
"Peach",
"White",
"Beige",
"Fizz",
"Mint",
"Rose",
"Rose",
"Illusion",
"Merino",
"Haze",
"Sun",
"Red",
"Fire",
"Pink",
"Rajah",
"Azalea",
"Peep",
"White",
"Whisper",
"Drift",
"Casablanca",
"Chantilly",
"Cherub",
"Marzipan",
"Yellow",
"Givry",
"Linen",
"Magnolia",
"Wood",
"Cream",
"Lilac",
"Storm",
"Texas",
"Field",
"Mimosa",
"Carnation",
"Mango",
"Pink",
"Cream",
"Portica",
"Amour",
"Swizzle",
"Dolly",
"Cane",
"Ecstasy",
"Hide",
"Corvette",
"Yellow",
"Turbo",
"Astra",
"Champagne",
"Linen",
"Fantasy",
"White",
"Alabaster",
"Yellow",
"Milan",
"Pink",
"Geraldine",
"Rose",
"Buckthorn",
"Sun",
"Pink",
"Bud",
"Cupid",
"Rose",
"Peach",
"Mania",
"Yellow",
"Festival",
"Corn",
"Corn",
"Red",
"Shalimar",
"Pink",
"Pink",
"Poppy",
"Yellow",
"Goldenrod",
"Candlelight",
"Cherokee",
"Lusta",
"Lusta",
"White",
"Bianca",
"Glow",
"Ivory",
"Ceramic",
"Red",
"Watermelon",
"Crusta",
"Sorbus",
"Pink",
"Apricot",
"Pink",
"Cinderella",
"Glow",
"Lemon",
"Lace",
"White",
"Drover",
"Prim",
"Cumulus",
"Rose",
"Orange",
"Bittersweet",
"California",
"Sea",
"Melon",
"Sun",
"Dandelion",
"Salomie",
"Honey",
"Remy",
"Oasis",
"Bridesmaid",
"Beeswax",
"White",
"Pipi",
"White",
"Pink",
"Pink",
"White",
"Solitaire",
"Pointer",
"Yellow",
"White",
"Red",
"Rose",
"Pizzazz",
"Fuchsia",
"Scarlet",
"Strawberry",
"Rose",
"Red",
"Orange",
"Red",
"Vermilion",
"Orange",
"Orange",
"Orange",
"Flamingo",
"Orange",
"Pink",
"Persimmon",
"Pink",
"Orange",
"Pumpkin",
"Flamenco",
"Orange",
"Coral",
"Salmon",
"Pizazz",
"Side",
"Salmon",
"Carrot",
"Tangerine",
"Tangerine",
"Sunshade",
"Peel",
"Lisa",
"Orange",
"Pink",
"Pink",
"Orange",
"Lilac",
"Sundown",
"Sin",
"Rose",
"Candy",
"Cheese",
"Yellow",
"Koromiko",
"Amber",
"Flower",
"Pink",
"Pink",
"Supernova",
"Flesh",
"Sunglow",
"Tainoi",
"Orange",
"Chardonnay",
"Pink",
"Romantic",
"Grandis",
"Gold",
"Yellow",
"Cosmos",
"Mustard",
"Schnapps",
"Caramel",
"Bush",
"Watusi",
"Lace",
"White",
"Frangipani",
"Pippin",
"Rose",
"Negroni",
"Brulee",
"Peach",
"Tequila",
"Kournikova",
"Beach",
"Karry",
"Broom",
"White",
"Derby",
"Vis",
"White",
"Whip",
"Pink",
"Cream",
"blush",
"Gorse",
"Buttermilk",
"Lady",
"Not",
"Tutu",
"Picasso",
"Chardon",
"Daisy",
"White",
"Sour",
"Sazerac",
"Serenade",
"Chablis",
"Peach",
"Sauvignon",
"Punch",
"Varden",
"White",
"White",
"Fizz",
"Dawn",
"Chiffon",
"Heath",
"Mist",
"Soapstone",
"Haze",
"White",
"Spice",
"Cream",
"Heath",
"Travertine",
"White",
"Lusta",
"Half",
"White",
"Cake",
"White",
"Romance",
"Yellow",
"Lemon",
"Canary",
"Portafino",
"Ivory",
"White"};
        hex_color1= new String[]{
	"000000",
	"000080",
	"0000C8",
	"0000FF",
	"000741",
	"001B1C",
	"002387",
	"002900",
	"002E20",
	"002FA7",
	"003153",
	"003366",
	"003399",
	"003532",
	"003E40",
	"004620",
	"0047AB",
	"004816",
	"004950",
	"0056A7",
	"00581A",
	"0066CC",
	"0066FF",
	"00755E",
	"0076A3",
	"007BA7",
	"007EC7",
	"007FFF",
	"008080",
	"0095B6",
	"009DC4",
	"00A693",
	"00A86B",
	"00CC99",
	"00CCCC",
	"00FF00",
	"00FF7F",
	"00FFFF",
	"010D1A",
	"011635",
	"011D13",
	"012731",
	"01361C",
	"01371A",
	"013E62",
	"013F6A",
	"014B43",
	"015E85",
	"016162",
	"016D39",
	"01796F",
	"017987",
	"01826B",
	"01A368",
	"022D15",
	"02402C",
	"02478E",
	"024E46",
	"026395",
	"02866F",
	"02A4D3",
	"03163C",
	"032B52",
	"036A6E",
	"041004",
	"041322",
	"042E4C",
	"044022",
	"044259",
	"051040",
	"051657",
	"055989",
	"056F57",
	"062A78",
	"063537",
	"069B81",
	"06A189",
	"073A50",
	"080110",
	"081910",
	"082567",
	"088370",
	"08E8DE",
	"092256",
	"09230F",
	"09255D",
	"093624",
	"095859",
	"097F4B",
	"0A001C",
	"0A480D",
	"0A6906",
	"0A6F75",
	"0B0B0B",
	"0B0F08",
	"0B1107",
	"0B1304",
	"0B6207",
	"0BDA51",
	"0C0B1D",
	"0C0D0F",
	"0C1911",
	"0C7A79",
	"0C8990",
	"0D0332",
	"0D1117",
	"0D1C19",
	"0D2E1C",
	"0E0E18",
	"0E2A30",
	"0F2D9E",
	"10121D",
	"101405",
	"105852",
	"110C6C",
	"120A8F",
	"123447",
	"126B40",
	"130000",
	"130A06",
	"13264D",
	"134F19",
	"140600",
	"1450AA",
	"151F4C",
	"1560BD",
	"15736B",
	"161928",
	"161D10",
	"162A40",
	"163222",
	"16322C",
	"163531",
	"171F04",
	"175579",
	"182D09",
	"18587A",
	"19330E",
	"193751",
	"1959A8",
	"1A1A68",
	"1AB385",
	"1B0245",
	"1B1035",
	"1B127B",
	"1B1404",
	"1B2F11",
	"1B3162",
	"1B659D",
	"1C1208",
	"1C1E13",
	"1C39BB",
	"1C402E",
	"1C7C7D",
	"1D6142",
	"1E0F04",
	"1E1609",
	"1E1708",
	"1E385B",
	"1E433C",
	"1E90FF",
	"1E9AB0",
	"1F120F",
	"1FC2C2",
	"20208D",
	"202E54",
	"204852",
	"211A0E",
	"220878",
	"228B22",
	"233418",
	"240A40",
	"240C02",
	"242A1D",
	"242E16",
	"24500F",
	"251607",
	"251706",
	"251F4F",
	"25272C",
	"25311C",
	"2596D1",
	"260368",
	"26056A",
	"261105",
	"261414",
	"262335",
	"26283B",
	"273A81",
	"27504B",
	"278A5B",
	"281E15",
	"283A77",
	"286ACD",
	"290C5E",
	"292130",
	"292319",
	"292937",
	"297B9A",
	"29AB87",
	"2A0359",
	"2A140E",
	"2A2630",
	"2A380B",
	"2A52BE",
	"2B0202",
	"2B194F",
	"2B3228",
	"2C0E8C",
	"2C1632",
	"2C2133",
	"2C8C84",
	"2D2510",
	"2D383A",
	"2D569B",
	"2E0329",
	"2E1905",
	"2E3222",
	"2E3F62",
	"2E8B57",
	"2EBFD4",
	"2F270E",
	"2F3CB3",
	"2F519E",
	"2F5A57",
	"2F6168",
	"300529",
	"301F1E",
	"302A0F",
	"304B6A",
	"30D5C8",
	"311C17",
	"314459",
	"315BA1",
	"31728D",
	"317D82",
	"32127A",
	"32293A",
	"323232",
	"325D52",
	"327C14",
	"327DA0",
	"33036B",
	"33292F",
	"33CC99",
	"341515",
	"350036",
	"350E42",
	"350E57",
	"353542",
	"354E8C",
	"363050",
	"363534",
	"363C0D",
	"36747D",
	"368716",
	"370202",
	"371D09",
	"37290E",
	"373021",
	"377475",
	"380474",
	"381A51",
	"383533",
	"384555",
	"384910",
	"394851",
	"396413",
	"3A0020",
	"3A2010",
	"3A2A6A",
	"3A686C",
	"3A6A47",
	"3AB09E",
	"3B000B",
	"3B0910",
	"3B1F1F",
	"3B2820",
	"3B7A57",
	"3B91B4",
	"3C0878",
	"3C1206",
	"3C1F76",
	"3C2005",
	"3C3910",
	"3C4151",
	"3C4443",
	"3C493A",
	"3D0C02",
	"3D2B1F",
	"3D7D52",
	"3E0480",
	"3E1C14",
	"3E2B23",
	"3E2C1C",
	"3E3A44",
	"3EABBF",
	"3F2109",
	"3F2500",
	"3F3002",
	"3F307F",
	"3F4C3A",
	"3F583B",
	"3F5D53",
	"3FC1AA",
	"3FFF00",
	"401801",
	"40291D",
	"403B38",
	"403D19",
	"405169",
	"40826D",
	"40A860",
	"410056",
	"411F10",
	"412010",
	"413C37",
	"414257",
	"414C7D",
	"4169E1",
	"41AA78",
	"420303",
	"423921",
	"427977",
	"431560",
	"433120",
	"433E37",
	"434C59",
	"436A0D",
	"44012D",
	"441D00",
	"444954",
	"454936",
	"456CAC",
	"45B1E8",
	"460B41",
	"462425",
	"465945",
	"4682B4",
	"480404",
	"480607",
	"480656",
	"481C1C",
	"483131",
	"483C32",
	"49170C",
	"492615",
	"49371B",
	"495400",
	"496679",
	"497183",
	"4A2A04",
	"4A3004",
	"4A3C30",
	"4A4244",
	"4A444B",
	"4A4E5A",
	"4B0082",
	"4B5D52",
	"4C3024",
	"4C4F56",
	"4D0135",
	"4D0A18",
	"4D1E01",
	"4D282D",
	"4D282E",
	"4D3833",
	"4D3D14",
	"4D400F",
	"4D5328",
	"4E0606",
	"4E2A5A",
	"4E3B41",
	"4E420C",
	"4E4562",
	"4E6649",
	"4E7F9E",
	"4EABD1",
	"4F1C70",
	"4F2398",
	"4F69C6",
	"4F7942",
	"4F9D5D",
	"4FA83D",
	"504351",
	"507096",
	"507672",
	"50C878",
	"514649",
	"516E3D",
	"517C66",
	"51808F",
	"52001F",
	"520C17",
	"523C94",
	"533455",
	"534491",
	"53824B",
	"541012",
	"544333",
	"54534D",
	"549019",
	"55280C",
	"555B10",
	"556D56",
	"5590D9",
	"56B4BE",
	"578363",
	"583401",
	"585562",
	"587156",
	"589AAF",
	"591D35",
	"592804",
	"593737",
	"594433",
	"5A6E9C",
	"5A87A0",
	"5B3013",
	"5C0120",
	"5C0536",
	"5C2E01",
	"5C5D75",
	"5D1E0F",
	"5D4C51",
	"5D5C58",
	"5D5E37",
	"5D7747",
	"5DA19F",
	"5E483E",
	"5E5D3B",
	"5F3D26",
	"5F5F6E",
	"5F6672",
	"5FA777",
	"5FB3AC",
	"604913",
	"605B73",
	"606E68",
	"6093D1",
	"612718",
	"614051",
	"615D30",
	"61845F",
	"622F30",
	"623F2D",
	"624E9A",
	"625119",
	"626649",
	"639A8F",
	"63B76C",
	"6456B7",
	"646077",
	"646463",
	"646A54",
	"646E75",
	"6495ED",
	"64CCDB",
	"65000B",
	"651A14",
	"652DC1",
	"657220",
	"65745D",
	"65869F",
	"660045",
	"660099",
	"66023C",
	"661010",
	"66B58F",
	"66FF00",
	"66FF66",
	"67032D",
	"675FA6",
	"676662",
	"678975",
	"67A712",
	"683600",
	"685558",
	"685E6E",
	"692545",
	"692D54",
	"695F62",
	"697E9A",
	"6A442E",
	"6A5D1B",
	"6A6051",
	"6B2A14",
	"6B3FA0",
	"6B4E31",
	"6B5755",
	"6B8BA2",
	"6B8E23",
	"6C3082",
	"6CDAE7",
	"6D0101",
	"6D5E54",
	"6D6C6C",
	"6D9292",
	"6D92A1",
	"6E0902",
	"6E1D14",
	"6E4826",
	"6E4B26",
	"6E6D57",
	"6E7783",
	"6F440C",
	"6F6A61",
	"6F8E63",
	"6F9D02",
	"6FD0C5",
	"701C1C",
	"704214",
	"704A07",
	"704F50",
	"706555",
	"708090",
	"711A00",
	"71291D",
	"714693",
	"714AB2",
	"715D47",
	"716338",
	"716B56",
	"716E10",
	"717486",
	"718080",
	"71D9E2",
	"72010F",
	"724A2F",
	"726D4E",
	"727B89",
	"731E8F",
	"734A12",
	"736C9F",
	"736D58",
	"737829",
	"738678",
	"74640D",
	"747D63",
	"747D83",
	"748881",
	"749378",
	"74C365",
	"755A57",
	"7563A8",
	"76395D",
	"7666C6",
	"76BD17",
	"76D7EA",
	"770F05",
	"771F1F",
	"773F1A",
	"776F61",
	"778120",
	"779E86",
	"77DD77",
	"780109",
	"782D19",
	"782F16",
	"78866B",
	"788A25",
	"788BBA",
	"78A39C",
	"795D4C",
	"796878",
	"796989",
	"796A78",
	"796D62",
	"79DEEC",
	"7A013A",
	"7A58C1",
	"7A7A7A",
	"7A89B8",
	"7AC488",
	"7B3801",
	"7B3F00",
	"7B6608",
	"7B7874",
	"7B7C94",
	"7B8265",
	"7B9F80",
	"7BA05B",
	"7C1C05",
	"7C7631",
	"7C778A",
	"7C7B7A",
	"7C7B82",
	"7C881A",
	"7CA1A6",
	"7CB0A1",
	"7CB7BB",
	"7D2C14",
	"7DA98D",
	"7DC8F7",
	"7DD8C6",
	"7E3A15",
	"7F1734",
	"7F3A02",
	"7F626D",
	"7F7589",
	"7F76D3",
	"7FFF00",
	"7FFFD4",
	"800000",
	"800B47",
	"801818",
	"80341F",
	"803790",
	"80461B",
	"807E79",
	"808000",
	"808080",
	"80B3AE",
	"80B3C4",
	"80CCEA",
	"81422C",
	"816E71",
	"817377",
	"819885",
	"826F65",
	"828685",
	"828F72",
	"831923",
	"837050",
	"83AA5D",
	"83D0C6",
	"843179",
	"84A0A0",
	"8581D9",
	"858470",
	"859FAF",
	"85C4CC",
	"860111",
	"863C3C",
	"86483C",
	"864D1E",
	"86560A",
	"868974",
	"86949F",
	"871550",
	"87756E",
	"877C7B",
	"878D91",
	"87AB39",
	"885342",
	"886221",
	"888387",
	"888D65",
	"893456",
	"893843",
	"894367",
	"897D6D",
	"8A3324",
	"8A73D6",
	"8A8360",
	"8A8389",
	"8A8F8A",
	"8AB9F1",
	"8B00FF",
	"8B0723",
	"8B6B0B",
	"8B8470",
	"8B847E",
	"8B8680",
	"8B9C90",
	"8B9FEE",
	"8BA690",
	"8BA9A5",
	"8BE6D8",
	"8C055E",
	"8C472F",
	"8C5738",
	"8C6495",
	"8D0226",
	"8D3D38",
	"8D3F3F",
	"8D7662",
	"8D8974",
	"8D90A1",
	"8DA8CC",
	"8E0000",
	"8E4D1E",
	"8E6F70",
	"8E775E",
	"8E8190",
	"8EABC1",
	"8F021C",
	"8F3E33",
	"8F4B0E",
	"8F8176",
	"8FD6B4",
	"900020",
	"901E1E",
	"907874",
	"907B71",
	"908D39",
	"92000A",
	"924321",
	"926F5B",
	"928573",
	"928590",
	"9370DB",
	"93CCEA",
	"93DFB8",
	"944747",
	"948771",
	"950015",
	"956387",
	"959396",
	"960018",
	"964B00",
	"967059",
	"9678B6",
	"967BB6",
	"96A8A1",
	"96BBAB",
	"97605D",
	"9771B5",
	"97CD2D",
	"983D61",
	"9874D3",
	"98777B",
	"98811B",
	"988D77",
	"98FF98",
	"990066",
	"991199",
	"991613",
	"991B07",
	"996666",
	"9966CC",
	"997A8D",
	"9999CC",
	"9A3820",
	"9A6E61",
	"9A9577",
	"9AB973",
	"9AC2B8",
	"9B4703",
	"9B9E8F",
	"9C3336",
	"9D5616",
	"9DACB7",
	"9DC209",
	"9DE093",
	"9DE5FF",
	"9E5302",
	"9E5B40",
	"9EA587",
	"9EA91F",
	"9EB1CD",
	"9EDEE0",
	"9F381D",
	"9F821C",
	"9F9F9C",
	"9FA0B1",
	"9FD7D3",
	"9FDD8C",
	"A02712",
	"A1750D",
	"A1ADB5",
	"A1C50A",
	"A1DAD7",
	"A1E9DE",
	"A2006D",
	"A23B6C",
	"A26645",
	"A2AAB3",
	"A2AEAB",
	"A3807B",
	"A397B4",
	"A3E3ED",
	"A4A49D",
	"A4A6D3",
	"A4AF6E",
	"A50B5E",
	"A59B91",
	"A5CB0C",
	"A62F20",
	"A65529",
	"A68B5B",
	"A69279",
	"A6A29A",
	"A72525",
	"A7882C",
	"A85307",
	"A86515",
	"A86B6B",
	"A8989B",
	"A899E6",
	"A8A589",
	"A8AE9C",
	"A8AF8E",
	"A8BD9F",
	"A8E3BD",
	"A9A491",
	"A9ACB6",
	"A9B2C3",
	"A9B497",
	"A9BDBF",
	"A9BEF2",
	"A9C6C2",
	"AA375A",
	"AA4203",
	"AA8B5B",
	"AA8D6F",
	"AAA5A9",
	"AAA9CD",
	"AAABB7",
	"AAD6E6",
	"AAF0D1",
	"AB0563",
	"AB3472",
	"AB917A",
	"ABA0D9",
	"ABA196",
	"AC8A56",
	"AC91CE",
	"AC9E22",
	"ACA494",
	"ACA586",
	"ACA59F",
	"ACACAC",
	"ACB78E",
	"ACCBB1",
	"ACDD4D",
	"ACE1AF",
	"AD781B",
	"ADBED1",
	"ADDFAD",
	"ADE6C4",
	"ADFF2F",
	"AE4560",
	"AE6020",
	"AE809E",
	"AF4035",
	"AF4D43",
	"AF593E",
	"AF8751",
	"AF8F2C",
	"AF9F1C",
	"AFA09E",
	"AFB1B8",
	"AFBDD9",
	"B04C6A",
	"B05D54",
	"B05E81",
	"B06608",
	"B09A95",
	"B0E0E6",
	"B0E313",
	"B10000",
	"B14A0B",
	"B1610B",
	"B16D52",
	"B19461",
	"B1E2C1",
	"B1F4E7",
	"B20931",
	"B2A1EA",
	"B32D29",
	"B35213",
	"B38007",
	"B3AF95",
	"B3C110",
	"B43332",
	"B44668",
	"B4CFD3",
	"B57281",
	"B57EDC",
	"B5A27F",
	"B5B35C",
	"B5D2CE",
	"B5ECDF",
	"B6316C",
	"B69D98",
	"B6B095",
	"B6BAA4",
	"B6D1EA",
	"B6D3BF",
	"B7410E",
	"B78E5C",
	"B7A214",
	"B7A458",
	"B7B1B1",
	"B7C3D0",
	"B7F0BE",
	"B81104",
	"B87333",
	"B8B56A",
	"B8C1B1",
	"B8C25D",
	"B8E0F9",
	"B94E48",
	"B95140",
	"B98D28",
	"B9C46A",
	"B9C8AC",
	"BA0101",
	"BA450C",
	"BA6F1E",
	"BA7F03",
	"BAB1A2",
	"BAC7C9",
	"BAEEF9",
	"BB3385",
	"BB8983",
	"BBD009",
	"BBD7C1",
	"BCC9C2",
	"BD5E2E",
	"BD978E",
	"BDB1A8",
	"BDB2A1",
	"BDB3C7",
	"BDBBD7",
	"BDBDC6",
	"BDC8B3",
	"BDC9CE",
	"BDEDFD",
	"BEA6C3",
	"BEB5B7",
	"BEDE0D",
	"BF5500",
	"BFB8B0",
	"BFBED8",
	"BFC1C2",
	"BFC921",
	"BFDBE2",
	"BFFF00",
	"C02B18",
	"C04737",
	"C08081",
	"C0C0C0",
	"C0D3B9",
	"C0D8B6",
	"C1440E",
	"C154C1",
	"C1A004",
	"C1B7A4",
	"C1BAB0",
	"C1BECD",
	"C1D7B0",
	"C1F07C",
	"C26B03",
	"C2955D",
	"C2BDB6",
	"C2CAC4",
	"C2E8E5",
	"C32148",
	"C3B091",
	"C3BFC1",
	"C3C3BD",
	"C3CDE6",
	"C3D1D1",
	"C3DDF9",
	"C41E3A",
	"C45655",
	"C45719",
	"C4C4BC",
	"C4D0B0",
	"C4F4EB",
	"C54B8C",
	"C59922",
	"C5994B",
	"C5DBCA",
	"C5E17A",
	"C62D42",
	"C6726B",
	"C69191",
	"C6A84B",
	"C6C3B5",
	"C6C8BD",
	"C6E610",
	"C7031E",
	"C71585",
	"C7BCA2",
	"C7C1FF",
	"C7C4BF",
	"C7C9D5",
	"C7CD90",
	"C7DDE5",
	"C88A65",
	"C8A2C8",
	"C8A528",
	"C8AABF",
	"C8B568",
	"C8E3D7",
	"C96323",
	"C99415",
	"C9A0DC",
	"C9B29B",
	"C9B35B",
	"C9B93B",
	"C9C0BB",
	"C9D9D2",
	"C9FFA2",
	"C9FFE5",
	"CA3435",
	"CABB48",
	"CADCD4",
	"CAE00D",
	"CAE6DA",
	"CB8FA9",
	"CBCAB6",
	"CBD3B0",
	"CBDBD6",
	"CC3333",
	"CC5500",
	"CC7722",
	"CC8899",
	"CCCAA8",
	"CCCCFF",
	"CCFF00",
	"CD5700",
	"CD5C5C",
	"CD8429",
	"CDF4FF",
	"CEB98F",
	"CEBABA",
	"CEC291",
	"CEC7A7",
	"CFA39D",
	"CFB53B",
	"CFDCCF",
	"CFE5D2",
	"CFF9F3",
	"CFFAF4",
	"D05F04",
	"D06DA1",
	"D07D12",
	"D0BEF8",
	"D0C0E5",
	"D0F0C0",
	"D18F1B",
	"D1BEA8",
	"D1C6B4",
	"D1D2CA",
	"D1D2DD",
	"D1E231",
	"D2691E",
	"D27D46",
	"D29EAA",
	"D2B48C",
	"D2DA97",
	"D2F6DE",
	"D2F8B0",
	"D3CBBA",
	"D3CDC5",
	"D47494",
	"D4B6AF",
	"D4BF8D",
	"D4C4A8",
	"D4CD16",
	"D4D7D9",
	"D4DFE2",
	"D4E2FC",
	"D54600",
	"D591A4",
	"D59A6F",
	"D5D195",
	"D5F6E3",
	"D69188",
	"D6C562",
	"D6CEF6",
	"D6D6D1",
	"D6FFDB",
	"D7837F",
	"D7C498",
	"D7D0FF",
	"D84437",
	"D87C63",
	"D8BFD8",
	"D8C2D5",
	"D8FCFA",
	"D94972",
	"D99376",
	"D9B99B",
	"D9D6CF",
	"D9DCC1",
	"D9E4F5",
	"D9F7FF",
	"DA3287",
	"DA5B38",
	"DA6304",
	"DA6A41",
	"DA70D6",
	"DA8A67",
	"DAA520",
	"DAECD6",
	"DAF4F0",
	"DAFAFF",
	"DB5079",
	"DB9690",
	"DB995E",
	"DBDBDB",
	"DBFFF8",
	"DC143C",
	"DC4333",
	"DCB20C",
	"DCB4BC",
	"DCD747",
	"DCD9D2",
	"DCDDCC",
	"DCEDB4",
	"DCF0EA",
	"DDD6D5",
	"DDF9F1",
	"DE3163",
	"DE6360",
	"DEA681",
	"DEBA13",
	"DEC196",
	"DECBC6",
	"DED4A4",
	"DED717",
	"DEE5C0",
	"DEF5FF",
	"DF73FF",
	"DFBE6F",
	"DFCD6F",
	"DFCFDB",
	"DFECDA",
	"DFFF00",
	"E0B0FF",
	"E0B646",
	"E0B974",
	"E0C095",
	"E0FFFF",
	"E16865",
	"E1BC64",
	"E1C0C8",
	"E1E6D6",
	"E1EAD4",
	"E1F6E8",
	"E25465",
	"E2725B",
	"E28913",
	"E292C0",
	"E29418",
	"E29CD2",
	"E2D8ED",
	"E2EBED",
	"E2F3EC",
	"E30B5C",
	"E32636",
	"E34234",
	"E3BEBE",
	"E3F5E1",
	"E3F988",
	"E47698",
	"E49B0F",
	"E4C2D5",
	"E4CFDE",
	"E4D1C0",
	"E4D422",
	"E4D5B7",
	"E4D69B",
	"E4F6E7",
	"E4FFD1",
	"E52B50",
	"E5841B",
	"E5CCC9",
	"E5D7BD",
	"E5D8AF",
	"E5E0E1",
	"E5E5E5",
	"E5F9F6",
	"E64E03",
	"E6BE8A",
	"E6BEA5",
	"E6D7B9",
	"E6E4D4",
	"E6F2EA",
	"E6F8F3",
	"E6FFE9",
	"E6FFFF",
	"E77200",
	"E7730A",
	"E79F8C",
	"E79FC4",
	"E7BCB4",
	"E7BF05",
	"E7CD8C",
	"E7ECE6",
	"E7F8FF",
	"E7FEFF",
	"E89928",
	"E8B9B3",
	"E8E0D5",
	"E8EBE0",
	"E8F1D4",
	"E8F2EB",
	"E8F5F2",
	"E96E00",
	"E97451",
	"E97C07",
	"E9CECD",
	"E9D75A",
	"E9E3E3",
	"E9F8ED",
	"E9FFFD",
	"EA88A8",
	"EAAE69",
	"EAB33B",
	"EAC674",
	"EADAB8",
	"EAE8D4",
	"EAF6EE",
	"EAF6FF",
	"EAF9F5",
	"EAFFFE",
	"EB9373",
	"EBC2AF",
	"ECA927",
	"ECC54E",
	"ECC7EE",
	"ECCDB9",
	"ECE090",
	"ECEBBD",
	"ECEBCE",
	"ECF245",
	"ED0A3F",
	"ED7A1C",
	"ED9121",
	"ED989E",
	"EDB381",
	"EDC9AF",
	"EDCDAB",
	"EDDCB1",
	"EDEA99",
	"EDF5DD",
	"EDF5F5",
	"EDF6FF",
	"EDF9F1",
	"EDFC84",
	"EE82EE",
	"EEC1BE",
	"EED794",
	"EED9C4",
	"EEDC82",
	"EEDEDA",
	"EEE3AD",
	"EEEEE8",
	"EEEF78",
	"EEF0C8",
	"EEF0F3",
	"EEF3C3",
	"EEF4DE",
	"EEF6F7",
	"EEFDFF",
	"EEFF9A",
	"EEFFE2",
	"EF863F",
	"EFEFEF",
	"EFF2F3",
	"F091A9",
	"F0D52D",
	"F0DB7D",
	"F0DC82",
	"F0E2EC",
	"F0E68C",
	"F0EEFD",
	"F0EEFF",
	"F0F8FF",
	"F0FCEA",
	"F18200",
	"F19BAB",
	"F1E788",
	"F1E9D2",
	"F1E9FF",
	"F1EEC1",
	"F1F1F1",
	"F1F7F2",
	"F1FFAD",
	"F1FFC8",
	"F2552A",
	"F28500",
	"F2C3B2",
	"F2F2F2",
	"F2FAFA",
	"F34723",
	"F3AD16",
	"F3D69D",
	"F3D9DF",
	"F3E7BB",
	"F3E9E5",
	"F3EDCF",
	"F3FB62",
	"F3FBD4",
	"F3FFD8",
	"F400A1",
	"F4A460",
	"F4C430",
	"F4D81C",
	"F4EBD3",
	"F4F2EE",
	"F4F4F4",
	"F4F8FF",
	"F57584",
	"F5C85C",
	"F5C999",
	"F5D5A0",
	"F5DEB3",
	"F5E7A2",
	"F5E7E2",
	"F5E9D3",
	"F5EDEF",
	"F5F3E5",
	"F5F5DC",
	"F5FB3D",
	"F5FFBE",
	"F64A8A",
	"F653A6",
	"F6A4C9",
	"F6F0E6",
	"F6F7F7",
	"F6FFDC",
	"F7468A",
	"F77703",
	"F77FBE",
	"F7B668",
	"F7C8DA",
	"F7DBE6",
	"F7F2E1",
	"F7F5FA",
	"F7FAF7",
	"F8B853",
	"F8C3DF",
	"F8D9E9",
	"F8DB9D",
	"F8DD5C",
	"F8E4BF",
	"F8F0E8",
	"F8F4FF",
	"F8F6F1",
	"F8F7DC",
	"F8F7FC",
	"F8F8F7",
	"F8F99C",
	"F8FACD",
	"F8FDD3",
	"F95A61",
	"F9BF58",
	"F9E0ED",
	"F9E4BC",
	"F9E663",
	"F9EAF3",
	"F9F8E4",
	"F9FF8B",
	"F9FFF6",
	"FA7814",
	"FA9D5A",
	"FAD3A2",
	"FADFAD",
	"FAE600",
	"FAEAB9",
	"FAECCC",
	"FAF0E6",
	"FAF3F0",
	"FAF7D6",
	"FAFAFA",
	"FAFDE4",
	"FAFFA4",
	"FB607F",
	"FB8989",
	"FBA0E3",
	"FBA129",
	"FBAC13",
	"FBAED2",
	"FBB2A3",
	"FBBEDA",
	"FBCCE7",
	"FBCEB1",
	"FBE7B2",
	"FBE870",
	"FBE96C",
	"FBEA8C",
	"FBEC5D",
	"FBF9F9",
	"FBFFBA",
	"FC0FC0",
	"FC80A5",
	"FC9C1D",
	"FCC01E",
	"FCD667",
	"FCD917",
	"FCDA98",
	"FCF4D0",
	"FCF4DC",
	"FCF8F7",
	"FCFBF3",
	"FCFEDA",
	"FCFFE7",
	"FCFFF9",
	"FD0E35",
	"FD5B78",
	"FD7B33",
	"FD7C07",
	"FD9FA2",
	"FDD5B1",
	"FDD7E4",
	"FDE1DC",
	"FDE295",
	"FDE910",
	"FDF5E6",
	"FDF6D3",
	"FDF7AD",
	"FDFEB8",
	"FDFFD5",
	"FE28A2",
	"FE4C40",
	"FE6F5E",
	"FE9D04",
	"FEA904",
	"FEBAAD",
	"FED33C",
	"FED85D",
	"FEDB8D",
	"FEE5AC",
	"FEEBF3",
	"FEEFCE",
	"FEF0EC",
	"FEF2C7",
	"FEF3D8",
	"FEF4CC",
	"FEF4DB",
	"FEF4F8",
	"FEF5F1",
	"FEF7DE",
	"FEF8E2",
	"FEF8FF",
	"FEF9E3",
	"FEFCED",
	"FF0000",
	"FF007F",
	"FF00CC",
	"FF00FF",
	"FF2400",
	"FF3399",
	"FF33CC",
	"FF355E",
	"FF3F34",
	"FF4040",
	"FF4D00",
	"FF4F00",
	"FF6037",
	"FF6600",
	"FF66FF",
	"FF681F",
	"FF69B4",
	"FF6B53",
	"FF6FFF",
	"FF7034",
	"FF7518",
	"FF7D07",
	"FF7F00",
	"FF7F50",
	"FF8C69",
	"FF9000",
	"FF910F",
	"FF91A4",
	"FF9933",
	"FF9966",
	"FF9980",
	"FF9E2C",
	"FFA000",
	"FFA194",
	"FFA500",
	"FFA6C9",
	"FFAB81",
	"FFAE42",
	"FFB0AC",
	"FFB1B3",
	"FFB31F",
	"FFB555",
	"FFB7D5",
	"FFB97B",
	"FFBA00",
	"FFBD5F",
	"FFBF00",
	"FFC0A8",
	"FFC0CB",
	"FFC3C0",
	"FFC901",
	"FFCBA4",
	"FFCC33",
	"FFCC5C",
	"FFCC99",
	"FFCD8C",
	"FFD1DC",
	"FFD2B7",
	"FFD38C",
	"FFD700",
	"FFD800",
	"FFD8D9",
	"FFDB58",
	"FFDCD6",
	"FFDDAF",
	"FFDDCD",
	"FFDDCF",
	"FFDDF4",
	"FFDEAD",
	"FFDEB3",
	"FFE1DF",
	"FFE1F2",
	"FFE2C5",
	"FFE5A0",
	"FFE5B4",
	"FFE6C7",
	"FFE772",
	"FFEAC8",
	"FFEAD4",
	"FFEC13",
	"FFEDBC",
	"FFEED8",
	"FFEFA1",
	"FFEFC1",
	"FFEFD5",
	"FFEFEC",
	"FFF0DB",
	"FFF0F5",
	"FFF14F",
	"FFF1B5",
	"FFF1D8",
	"FFF1EE",
	"FFF1F9",
	"FFF39D",
	"FFF3F1",
	"FFF46E",
	"FFF4CE",
	"FFF4DD",
	"FFF4E0",
	"FFF4E8",
	"FFF4F3",
	"FFF5EE",
	"FFF5F3",
	"FFF6D4",
	"FFF6DF",
	"FFF6F5",
	"FFF8D1",
	"FFF9E2",
	"FFF9E6",
	"FFFACD",
	"FFFAF4",
	"FFFBDC",
	"FFFBF9",
	"FFFC99",
	"FFFCEA",
	"FFFCEE",
	"FFFDD0",
	"FFFDE6",
	"FFFDE8",
	"FFFDF3",
	"FFFDF4",
	"FFFEE1",
	"FFFEEC",
	"FFFEF0",
	"FFFEF6",
	"FFFEFD",
	"FFFF00",
	"FFFF66",
	"FFFF99",
	"FFFFB4",
	"FFFFF0",
	"FFFFFF",
	};



        // khoi tao
        txtname=(TextView) findViewById(R.id.txtname);
        txtname.setVisibility(View.INVISIBLE);
        bt_loadimg = (FancyButton) findViewById(R.id.bt_load);
        btn2=(FancyButton)findViewById(R.id.btn_2);
        txthsl=(TextView) findViewById(R.id.txthsl);
        imgv = (RoundedImageView) findViewById(R.id.img);
       // img_bt= (Button) findViewById(R.id.img_bt);
     //   colorPicker = new ColorPicker(MainEXtract.this);
        btn1= (Button)findViewById(R.id.button);
        final AlertDialog.Builder builderSingle = new AlertDialog.Builder(MainEXtract.this);
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainEXtract.this, android.R.layout.select_dialog_singlechoice);

        btn_home=(FancyButton)findViewById(R.id.bt_home);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainEXtract.this, MainActivity.class);
                startActivity(intent);
            }
        });




        final MediaPlayer song = MediaPlayer.create(this, R.raw.rainday);
        song.start();
        song.setLooping(true);

        builderSingle.setIcon(R.drawable.b1);
        builderSingle.setTitle("Color you was coppy name");


       final AlertDialog.Builder builderInner = new AlertDialog.Builder(MainEXtract.this);

        builderInner.setTitle("Your Color You Choose");






        builderSingle.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayAdapter.add(temp);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                builderSingle.setAdapter(arrayAdapter, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String strName = arrayAdapter.getItem(which);
                        builderInner.setMessage(strName);
                         lv = ((AlertDialog)dialog).getListView();
                        selected = (Integer)lv.getTag();
                        if(selected != null) {
                            mycolor=selected;
                        }
                        builderInner.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {


                                dialog.dismiss();
                            }
                        });
                      //  builderInner.show();
                        AlertDialog alert1 = builderInner.create();
                        alert1.show();


                    }
                });
                AlertDialog alert = builderSingle.create();
                alert.show();
                Button bn = alert.getButton(DialogInterface.BUTTON_NEGATIVE);
                bn.setBackgroundColor(mycolor);


            }
        });









        bt_loadimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    OpenGalery();

                   

                }catch (Exception e) {
                    Toast.makeText(MainEXtract.this, "You need open gallery first!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
//        imgv.setDrawingCacheEnabled(true);
//        imgv.buildDrawingCache(true);

//
//        Bitmap bitmap1 =((BitmapDrawable)imgv.getDrawable()).getBitmap();
//        if(bitmap1!=null)
//        {
//            Palette.from(bitmap1).generate(new Palette.PaletteAsyncListener() {
//                @Override
//                public void onGenerated(@NonNull Palette palette) {
//                    setViewSwatch(co1,palette.getVibrantSwatch(),"Vibrant");
//                    setViewSwatch(co3,palette.getLightVibrantSwatch(),"Light Vibrant");
//                    setViewSwatch(co2,palette.getMutedSwatch(),"Muted");
//                    setViewSwatch(co6,palette.getDarkMutedSwatch(),"DarkMuted");
//                    setViewSwatch(co5,palette.getDarkVibrantSwatch(),"Dark Vibrant");
//                    setViewSwatch(co4,palette.getLightMutedSwatch(),"Light Muted");
//
//                }
//            });
//        }













        // custom listview

        // hàm chạm để pick img
        imgv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()== MotionEvent.ACTION_DOWN || motionEvent.getAction()== MotionEvent.ACTION_MOVE)
                {

                    if(checkopen==false)
                    {
                        bitmap= imgv.getDrawingCache();
                        int pix= bitmap.getPixel((int)motionEvent.getX(),(int)motionEvent.getY());
                        r= Color.red(pix);
                        b= Color.blue(pix);
                        g= Color.green(pix);
                        temp= String.format("#%02x%02x%02x", r, g, b);
                        txtrbg.setText("   R: "+r+"   B: "+b+"\n\t\t\t"+"G: "+g);
                        btn1.setBackgroundColor(Color.rgb(r,g,b));

                        float[] hsv = new float[3];
                        Color.RGBToHSV(r, g, b, hsv);

                        float hue = hsv[0];
                        float sat = hsv[1];
                        float val = hsv[2];

                        NumberFormat nf = NumberFormat.getInstance(); // get instance
                        nf.setMaximumFractionDigits(2); // set decimal places
                        String e = nf.format(hue);
                        String d= nf.format(sat);
                        String f= nf.format(val);




                        txthsl.setText("h:"+e+"\t\t\t"+"s:"+d+"\n"+"\t\t\t"+"v:"+f);
                        txthex.setText("      "+temp.toString());












                        if(r==0 && g==0 && b==0)
                            txtname.setText("Black");
                        else if(r==255 && b==255 && g==255)
                            txtname.setText("White");
                        else if(r==47 && g==79 && b==79)
                            txtname.setText("Dark Slate Grey");
                        else if ((r==84 && b==84 && g==84) || (r==105 && g==105 && b==105))
                            txtname.setText("Dim Grey");
                        else if(r==205 && b==205 && g==205)
                            txtname.setText("Very Light Grey");
                        else if(r==99 && g==86 && b==136)
                            txtname.setText("Free Speech Grey");
                        else if(r==211 && g==211 && b==211)
                            txtname.setText("Light Gray");
                        else if(r==119 && g==136 && b==153)
                            txtname.setText("Light Slate Grey");
                        else if(r==112 && g==128 && b==144)
                            txtname.setText("Slate Gray");
                        else if(r==198 && g==226 && b==255)
                            txtname.setText("Slate Gray1");
                        else if(r==185 && g==211 && b==238)
                            txtname.setText("Slate Gray2");
                        else if(r==159 && g==182 && b==205)
                            txtname.setText("Slate Gray3");
                        else if(r==108 && g==123 && b==139)
                            txtname.setText("Slate Gray4");
                        else if(r==g && g==b && b==r)
                            txtname.setText("Gray");
                        //SHADES OF BLUE
                        else if(r==240 && g==248 && b==255)
                            txtname.setText("AliceBlue");
                        else if(r==138 && g==43 && b==226)
                            txtname.setText("BlueViolet");
                        else if((r==95 && g==159 && b==159) || (r==95 && g==158 && b==160) || (r==95 && g==158 && b==160)) txtname.setText("Cadet Blue");
                        else if(r==152 && g==245 && b==255)
                            txtname.setText("CadetBlue1");
                        else if(r==142 && g==229 && b==238)
                            txtname.setText("CadetBlue2");
                        else if(r==122 && g==197 && b==205)
                            txtname.setText("CadetBlue2");
                        else if(r==83 && g==134 && b==139)
                            txtname.setText("CadetBlue4");
                        else if(r==66 && g==66 && b==111 || (r==100 && g==149 && b==237))
                            txtname.setText("Corn Flower Blue");
                        else if(r==72 && g==61 && b==139)
                            txtname.setText("Dark Slate Blue");
                        else if(r==0 && g==206 && b==209)
                            txtname.setText("DarkTurquoise");
                        else if(r==0 && g==191 && b==255)
                            txtname.setText("DeepSkyBlue");
                        else if(r==0 && g==178 && b==238)
                            txtname.setText("DeepSkyBlue2");
                        else if(r==0 && g==154 && b==205)
                            txtname.setText("DeepSkyBlue3");
                        else if(r==0 && g==104 && b==139)
                            txtname.setText("DeepSkyBlue4");
                        else if(r==30 && g==144 && b==255)
                            txtname.setText("DodgerBlue");
                        else if(r==28 && g==134 && b==238)
                            txtname.setText("DodgerBlue2");
                        else if(r==24 && g==116 && b==205)
                            txtname.setText("DodgerBlue3");
                        else if(r==16 && g==78 && b==139)
                            txtname.setText("DodgerBlue4");
                        else if(r==173 && g==216 && b==230)
                            txtname.setText("LightBlue");
                        else if(r==191 && g==239 && b==255)
                            txtname.setText("LightBlue1");
                        else if(r==178 && g==223 && b==238)
                            txtname.setText("LightBlue2");
                        else if(r==154 && g==192 && b==205)
                            txtname.setText("LightBlue3");
                        else if(r==104 && g==131 && b==139)
                            txtname.setText("LightBlue4");
                        else if(r==224 && g==255 && b==255)
                            txtname.setText("LightCyan");
                        else if(r==209 && g==238 && b==238)
                            txtname.setText("LightCyan2");
                        else if(r==180 && g==205 && b==205)
                            txtname.setText("LightCyan3");
                        else if(r==122 && g==139 && b==139)
                            txtname.setText("LightCyan4");
                        else if(r==135 && g==206 && b==250)
                            txtname.setText("LightSkyBlue");
                        else if(r==176 && g==226 && b==255)
                            txtname.setText("LightSkyBlue1");
                        else if(r==164 && g==211 && b==238)
                            txtname.setText("LightSkyBlue2");
                        else if(r==141 && g==182 && b==205)
                            txtname.setText("LightSkyBlue3");
                        else if(r==96 && g==123 && b==139)
                            txtname.setText("LightSkyBlue4");
                        else if(r==132 && g==112 && b==255)
                            txtname.setText("LightSlateBlue");
                        else if(r==176 && g==196 && b==222)
                            txtname.setText("LightSteelBlue");
                        else if(r==202 && g==225 && b==255)
                            txtname.setText("LightSteelBlue1");
                        else if(r==188 && g==210 && b==238)
                            txtname.setText("LightSteelBlue2");
                        else if(r==162 && g==181 && b==205)
                            txtname.setText("LightSteelBlue3");
                        else if(r==110 && g==123 && b==139)
                            txtname.setText("LightSteelBlue4");
                        else if(r==112 && g==219 && b==147)
                            txtname.setText("Aquamarine");
                        else if(r==0 && g==0 && b==205)
                            txtname.setText("MediumBlue");
                        else if(r==123 && g==104 && b==238)
                            txtname.setText("MediumSlateBlue");
                        else if(r==72 && g==209 && b==204)
                            txtname.setText("MediumTurquoise");
                        else if(r==25 && g==25 && b==112)
                            txtname.setText("MidnightBlue");
                        else if(r==0 && g==0 && b==128)
                            txtname.setText("NavyBlue");
                        else if(r==175 && g==238 && b==238)
                            txtname.setText("PaleTurquoise");
                        else if(r==187 && g==255 && b==255)
                            txtname.setText("PaleTurquoise1");
                        else if(r==150 && g==205 && b==205)
                            txtname.setText("PaleTurquoise2");
                        else if(r==141 && g==182 && b==205)
                            txtname.setText("PaleTurquoise3");
                        else if(r==102 && g==139 && b==139)
                            txtname.setText("PaleTurquoise4");
                        else if(r==176 && g==224 && b==230)
                            txtname.setText("PowderBlue");
                        else if(r==65 && g==105 && b==225)
                            txtname.setText("RoyalBlue");
                        else if(r==72 && g==118 && b==255)
                            txtname.setText("RoyalBlue1");
                        else if(r==67 && g==110 && b==238)
                            txtname.setText("RoyalBlue2");
                        else if(r==58 && g==98 && b==205)
                            txtname.setText("RoyalBlue3");
                        else if(r==39 && g==64 && b==139)
                            txtname.setText("RoyalBlue4");
                        else if(r==0 && g==34 && b==102)
                            txtname.setText("RoyalBlue5");
                        else if(r==135 && g==206 && b==235)
                            txtname.setText("SkyBlue");
                        else if(r==126 && g==192 && b==238)
                            txtname.setText("SkyBlue2");
                        else if(r==108 && g==166 && b==205)
                            txtname.setText("SkyBlue3");
                        else if(r==74 && g==112 && b==139)
                            txtname.setText("SkyBlue4");
                        else if(r==106 && g==90 && b==205)
                            txtname.setText("SlateBlue");
                        else if(r==131 && g==111 && b==255)
                            txtname.setText("SlateBlue1");
                        else if(r==122 && g==103 && b==238)
                            txtname.setText("SlateBlue2");
                        else if(r==105 && g==89 && b==205)
                            txtname.setText("SlateBlue3");
                        else if(r==71 && g==60 && b==139)
                            txtname.setText("SlateBlue4");
                        else if(r==70 && g==130 && b==180)
                            txtname.setText("SteelBlue");
                        else if(r==99 && g==184 && b==255)
                            txtname.setText("SteelBlue1");
                        else if(r==92 && g==172 && b==238)
                            txtname.setText("SteelBlue2");
                        else if(r==79 && g==148 && b==205)
                            txtname.setText("SteelBlue3");
                        else if(r==54 && g==100 && b==139)
                            txtname.setText("SteelBlue4");
                        else if(r==127 && g==255 && b==212)
                            txtname.setText("aquamarine");
                        else if(r==118 && g==238 && b==198)
                            txtname.setText("aquamarine2");
                        else if(r==102 && g==205 && b==116)
                            txtname.setText("MediumAquamarine");
                        else if(r==69 && g==139 && b==102)
                            txtname.setText("aquamarine4");
                        else if(r==240 && g==255 && b==255)
                            txtname.setText("azure");
                        else if(r==224 && g==238 && b==238)
                            txtname.setText("azure2");
                        else if(r==193 && g==205 && b==205)
                            txtname.setText("azure3");
                        else if(r==131 && g==139 && b==139)
                            txtname.setText("azure4");
                        else if(r==0 && g==0 && b==255)
                            txtname.setText("blue");
                        else if(r==0 && g==0 && b==238)
                            txtname.setText("blue2");
                        else if(r==0 && g==0 && b==205)
                            txtname.setText("blue3");
                        else if(r==0 && g==0 && b==139)
                            txtname.setText("blue4");
                        else if(r==0 && g==255 && b==255)
                            txtname.setText("aqua");
                        else if(r==3 && g==180 && b==204)
                            txtname.setText("True Iris Blue");
                        else if(r==0 && g==255 && b==255)
                            txtname.setText("cyan");
                        else if(r==0 && g==238 && b==238)
                            txtname.setText("cyan2");
                        else if(r==0 && g==205 && b==205)
                            txtname.setText("cyan3");
                        else if(r==0 && g==128 && b==128)
                            txtname.setText("cyan4");
                        else if(r==0 && g==255 && b==255)
                            txtname.setText("teal");
                        else if(r==64 && g==224 && b==208)
                            txtname.setText("turquoise");
                        else if(r==0 && g==245 && b==255)
                            txtname.setText("turquoise1");
                        else if(r==0 && g==229 && b==238)
                            txtname.setText("turquoise2");
                        else if(r==0 && g==197 && b==205)
                            txtname.setText("turquoise3");
                        else if(r==0 && g==134 && b==139)
                            txtname.setText("turquoise4");
                        else if(r==47 && g==79 && b==79)
                            txtname.setText("DarkSlateGray");
                        else if(r==151 && g==255 && b==255)
                            txtname.setText("DarkSlateGray1");
                        else if(r==141 && g==238 && b==238)
                            txtname.setText("DarkSlateGray2");
                        else if(r==121 && g==205 && b==205)
                            txtname.setText("DarkSlateGray3");
                        else if(r==82 && g==139 && b==139)
                            txtname.setText("DarkSlateGray4");
                        else if(r==36 && g==24 && b==130)
                            txtname.setText("Dark Slate Blue");
                        else if(r==112 && g==147 && b==219)
                            txtname.setText("Dark Turquoise");
                        else if(r==127 && g==0 && b==255)
                            txtname.setText("Medium Slate Blue");
                        else if(r==112 && g==219 && b==219)
                            txtname.setText("Medium Turquoise");
                        else if(r==47 && g==47 && b==79)
                            txtname.setText("Midnight Blue");
                        else if(r==77 && g==77 && b==255)
                            txtname.setText("Neon Blue");
                        else if(r==0 && g==0 && b==156)
                            txtname.setText("New Midnight Blue");
                        else if(r==89 && g==89 && b==171)
                            txtname.setText("Rich Blue");
                        else if(r==50 && g==153 && b==204)
                            txtname.setText("Sky Blue");
                        else if(r==0 && g==127 && b==255)
                            txtname.setText("Slate Blue");
                        else if(r==56 && g==176 && b==222)
                            txtname.setText("Summer Sky");
                        else if(r==3 && g==180 && b==200)
                            txtname.setText("Iris Blue");
                        else if(r==65 && g==56 && b==197)
                            txtname.setText("Free Speech Blue");
                            // SHADES OF BROWN
                        else if(r==188 && g==143 && b==143)
                            txtname.setText("RosyBrown");
                        else if(r==255 && g==193 && b==193)
                            txtname.setText("RosyBrown1");
                        else if(r==112 && g==219 && b==219)
                            txtname.setText("RosyBrown2");
                        else if(r==205 && g==155 && b==155)
                            txtname.setText("RosyBrown3");
                        else if(r==139 && g==105 && b==105)
                            txtname.setText("RosyBrown4");

                        else if(r==193 && g==69 && b==19)
                            txtname.setText("SaddleBrown");
                        else if(r==244 && g==164 && b==96)
                            txtname.setText("SandyBrown");
                        else if(r==245 && g==245 && b==20)
                            txtname.setText("beige");
                        else if(r==165 && g==42 && b==42)
                            txtname.setText("brown");

                        else if(r==255 && g==64 && b==64)
                            txtname.setText("brown1");
                        else if(r==238 && g==59 && b==59)
                            txtname.setText("brown2");
                        else if(r==205 && g==51 && b==51)
                            txtname.setText("brown3");
                        else if(r==139 && g==35 && b==35)
                            txtname.setText("brown4");


                        else if(r==92 && g==64 && b==51)
                            txtname.setText("dark brown");
                        else if(r==222 && g==184 && b==135)
                            txtname.setText("burlywood");
                        else if(r==255 && g==211 && b==155)
                            txtname.setText("burlywood1");
                        else if(r==238 && g==197 && b==145)
                            txtname.setText("burlywood2");
                        else if(r==205 && g==170 && b==125)
                            txtname.setText("burlywood3");
                        else if(r==139 && g==115 && b==85)
                            txtname.setText("burlywood4");
                        else if(r==92 && g==51 && b==23)
                            txtname.setText("baker's chocolate");
                        else if(r==210 && g==105 && b==30)
                            txtname.setText("chocolate");
                        else if(r==255 && g==127 && b==36)
                            txtname.setText("chocolate1");
                        else if(r==238 && g==118 && b==33)
                            txtname.setText("chocolate2");
                        else if(r==205 && g==102 && b==29)
                            txtname.setText("chocolate3");
                        else if(r==139 && g==69 && b==19)
                            txtname.setText("chocolate4");
                        else if(r==205 && g==133 && b==63)
                            txtname.setText("peru");
                        else if(r==210 && g==180 && b==140)
                            txtname.setText("tan");
                        else if(r==255 && g==165 && b==79)
                            txtname.setText("tan1");
                        else if(r==238 && g==154 && b==73)
                            txtname.setText("tan2");
                        else if(r==205 && g==133 && b==63)
                            txtname.setText("tan3");
                        else if(r==139 && g==90 && b==43)
                            txtname.setText("tan4");
                        else if(r==151 && g==105 && b==79)
                            txtname.setText("Dark Tan");
                        else if(r==133 && g==94 && b==66)
                            txtname.setText("Dark Wood");
                        else if(r==133 && g==99 && b==99)
                            txtname.setText("Light Wood");
                        else if(r==166 && g==128 && b==100)
                            txtname.setText("Medium Wood");
                        else if(r==235 && g==199 && b==158)
                            txtname.setText("New Tan");
                        else if(r==107 && g==66 && b==38)
                            txtname.setText("Semi-Sweet Chocolate");
                        else if(r==142 && g==107 && b==35)
                            txtname.setText("Sienna");
                        else if(r==219 && g==147 && b==112)
                            txtname.setText("Tan");
                        else if(r==92 && g==64 && b==51)
                            txtname.setText("Very Dark Brown");

                        //SHADES OF GREEN
                        else if(r==47 && g==79 && b==47)
                            txtname.setText("Dark Green");
                        else if(r==0 && g==100 && b==0)
                            txtname.setText("DarkGreen");
                        else if(r==74 && g==118 && b==110)
                            txtname.setText("dark green copper");
                        else if(r==189 && g==183 && b==107)
                            txtname.setText("DarkKhaki");
                        else if(r==85 && g==107 && b==47)
                            txtname.setText("DarkOliveGreen");
                        else if(r==202 && g==255 && b==112)
                            txtname.setText("DarkOliveGreen1");
                        else if(r==188 && g==238 && b==104)
                            txtname.setText("DarkOliveGreen2");
                        else if(r==162 && g==205 && b==90)
                            txtname.setText("DarkOliveGreen3");
                        else if(r==110 && g==139 && b==61)
                            txtname.setText("DarkOliveGreen4");
                        else if(r==128 && g==128 && b==0)
                            txtname.setText("olive");
                        else if(r==143 && g==188 && b==143)
                            txtname.setText("DarkSeaGreen");
                        else if(r==193 && g==255 && b==193)
                            txtname.setText("DarkSeaGreen1");
                        else if(r==180 && g==238 && b==180)
                            txtname.setText("DarkSeaGreen2");
                        else if(r==155 && g==205 && b==155)
                            txtname.setText("DarkSeaGreen3");
                        else if(r==105 && g==139 && b==105)
                            txtname.setText("DarkSeaGreen4");
                        else if(r==34 && g==139 && b==34)
                            txtname.setText("ForestGreen");
                        else if(r==173 && g==255 && b==47)
                            txtname.setText("GreenYellow");
                        else if(r==124 && g==252 && b==0)
                            txtname.setText("LawnGreen");
                        else if(r==32 && g==178 && b==170)
                            txtname.setText("LightSeaGreen");
                        else if(r==50 && g==205 && b==50)
                            txtname.setText("LimeGreen");
                        else if(r==60 && g==179 && b==113)
                            txtname.setText("MediumSeaGreen");
                        else if(r==0 && g==250 && b==154)
                            txtname.setText("MediumSpringGreen");
                        else if(r==245 && g==255 && b==250)
                            txtname.setText("MintCream");
                        else if(r==107 && g==142 && b==35)
                            txtname.setText("OliveDrab");
                        else if(r==192 && g==255 && b==62)
                            txtname.setText("OliveDrab1");
                        else if(r==179 && g==238 && b==58)
                            txtname.setText("OliveDrab2");
                        else if(r==154 && g==205 && b==50)
                            txtname.setText("OliveDrab3");
                        else if(r==105 && g==133 && b==63)
                            txtname.setText("OliveDrab4");
                        else if(r==152 && g==251 && b==152)
                            txtname.setText("PaleGreen");
                        else if(r==154 && g==255 && b==154)
                            txtname.setText("PaleGreen1");
                        else if(r==144 && g==238 && b==144)
                            txtname.setText("PaleGreen2");
                        else if(r==124 && g==205 && b==124)
                            txtname.setText("PaleGreen3");
                        else if(r==84 && g==139 && b==84)
                            txtname.setText("PaleGreen4");
                        else if(r==46 && g==139 && b==84)
                            txtname.setText("SeaGreen");
                        else if(r==84 && g==255 && b==159)
                            txtname.setText("SeaGreen1");
                        else if(r==78 && g==238 && b==148)
                            txtname.setText("SeaGreen2");
                        else if(r==67 && g==205 && b==128)
                            txtname.setText("SeaGreen3");
                        else if(r==0 && g==255 && b==127)
                            txtname.setText("SpringGreen");
                        else if(r==0 && g==238 && b==118)
                            txtname.setText("SpringGreen2");
                        else if(r==0 && g==205 && b==102)
                            txtname.setText("SpringGreen3");
                        else if(r==0 && g==139 && b==69)
                            txtname.setText("SpringGreen4");
                        else if(r==154 && g==205 && b==50)
                            txtname.setText("YellowGreen");
                        else if(r==127 && g==255 && b==0)
                            txtname.setText("chartreuse");
                        else if(r==118 && g==238 && b==0)
                            txtname.setText("chartreuse2");
                        else if(r==102 && g==205 && b==0)
                            txtname.setText("chartreuse3");
                        else if(r==69 && g==139 && b==0)
                            txtname.setText("chartreuse4");
                        else if(r==0 && g==255 && b==0)
                            txtname.setText("green");
                        else if(r==0 && g==128 && b==0)
                            txtname.setText("green");
                        else if(r==0 && g==238 && b==0)
                            txtname.setText("green2");
                        else if(r==0 && g==205 && b==0)
                            txtname.setText("green3");
                        else if(r==0 && g==139 && b==0)
                            txtname.setText("green4");
                        else if(r==240 && g==230 && b==140)
                            txtname.setText("khaki");
                        else if(r==255 && g==246 && b==143)
                            txtname.setText("khaki1");
                        else if(r==238 && g==230 && b==133)
                            txtname.setText("khaki2");
                        else if(r==205 && g==198 && b==115)
                            txtname.setText("khaki3");
                        else if(r==139 && g==134 && b==78)
                            txtname.setText("khaki4");
                        else if(r==79 && g==79 && b==47)
                            txtname.setText("Dark Olive Green");
                        else if(r==209 && g==146 && b==117)
                            txtname.setText("Green Yellow");
                        else if(r==142 && g==35 && b==35)
                            txtname.setText("Hunter Green");
                        else if(r==66 && g==111 && b==666)
                            txtname.setText("Medium Sea Green");
                        else if(r==127 && g==255 && b==0)
                            txtname.setText("Medium Spring Green");
                        else if(r==143 && g==188 && b==143)
                            txtname.setText("Pale Green");
                        else if(r==35 && g==142 && b==104)
                            txtname.setText("Sea Green");
                        else if(r==0 && g==255 && b==127)
                            txtname.setText("Spring Green");
                        else if(r==9 && g==249 && b==17)
                            txtname.setText("Free Speech Green");
                        else if(r==2 && g==157 && b==116)
                            txtname.setText("Free Speech Aquamarine");

                        // SHADES OF ORANGE

                        else if(r==255 && g==140 && b==0)
                            txtname.setText("DarkOrange");
                        else if(r==255 && g==127 && b==0)
                            txtname.setText("DarkOrange1");
                        else if(r==238 && g==118 && b==0)
                            txtname.setText("DarkOrange2");
                        else if(r==205 && g==102 && b==0)
                            txtname.setText("DarkOrange3");
                        else if(r==139 && g==69 && b==0)
                            txtname.setText("DarkOrange4");
                        else if(r==233 && g==150 && b==122)
                            txtname.setText("DarkSalmon");
                        else if(r==240 && g==128 && b==128)
                            txtname.setText("LightCoral");
                        else if(r==255 && g==160 && b==122)
                            txtname.setText("LightSalmon");
                        else if(r==238 && g==149 && b==114)
                            txtname.setText("LightSalmon2");
                        else if(r==205 && g==129 && b==98)
                            txtname.setText("LightSalmon3");
                        else if(r==139 && g==87 && b==66)
                            txtname.setText("LightSalmon4");
                        else if(r==255 && g==218 && b==185)
                            txtname.setText("PeachPuff");
                        else if(r==124 && g==205 && b==124)
                            txtname.setText("PeachPuff2");
                        else if(r==205 && g==175 && b==149)
                            txtname.setText("PeachPuff3");
                        else if(r==139 && g==119 && b==101)
                            txtname.setText("PeachPuff4");
                        else if(r==255 && g==228 && b==196)
                            txtname.setText("bisque");
                        else if(r==255 && g==228 && b==196)
                            txtname.setText("bisque1");
                        else if(r==238 && g==213 && b==183)
                            txtname.setText("bisque2");
                        else if(r==205 && g==183 && b==158)
                            txtname.setText("bisque3");
                        else if(r==139 && g==125 && b==107)
                            txtname.setText("bisque4");
                        else if((r==255 && g==127 && b==0) || (r==255 && g==127 && b==80))
                            txtname.setText("coral");
                        else if(r==255 && g==114 && b==86)
                            txtname.setText("coral1");
                        else if(r==238 && g==106 && b==80)
                            txtname.setText("coral2");
                        else if(r==205 && g==91 && b==69)
                            txtname.setText("coral3");
                        else if(r==139 && g==62 && b==47)
                            txtname.setText("coral4");
                        else if(r==240 && g==255 && b==240)
                            txtname.setText("honeydew");
                        else if(r==224 && g==238 && b==224)
                            txtname.setText("honeydew2");
                        else if(r==193 && g==205 && b==193)
                            txtname.setText("honeydew3");
                        else if(r==131 && g==139 && b==131)
                            txtname.setText("honeydew4");
                        else if(r==255 && g==165 && b==0)
                            txtname.setText("orange");
                        else if(r==238 && g==154 && b==0)
                            txtname.setText("orange2");
                        else if(r==205 && g==133 && b==0)
                            txtname.setText("orange3");
                        else if(r==139 && g==90 && b==0)
                            txtname.setText("orange4");
                        else if(r==250 && g==128 && b==114)
                            txtname.setText("salmon");
                        else if(r==255 && g==140 && b==105)
                            txtname.setText("salmon1");
                        else if(r==238 && g==130 && b==98)
                            txtname.setText("salmon2");
                        else if(r==205 && g==112 && b==84)
                            txtname.setText("salmon3");
                        else if(r==139 && g==76 && b==57)
                            txtname.setText("salmon4");
                        else if(r==160 && g==82 && b==45)
                            txtname.setText("sienna");
                        else if(r==255 && g==130 && b==71)
                            txtname.setText("sienna1");
                        else if(r==238 && g==121 && b==66)
                            txtname.setText("sienna2");
                        else if(r==205 && g==104 && b==57)
                            txtname.setText("sienna3");
                        else if(r==139 && g==71 && b==38)
                            txtname.setText("sienna4");
                        else if(r==142 && g==35 && b==35)
                            txtname.setText("Mandarian Orange");
                        else if(r==255 && g==127 && b==0)
                            txtname.setText("Orange");
                        else if((r==255 && g==36 && b==0) || (r==255 && g==69 && b==0))
                            txtname.setText("Orange Red");
                            //shades of red


                        else if(r==255 && g==20 && b==147)
                            txtname.setText("DeepPink");
                        else if(r==255 && g==20 && b==147)
                            txtname.setText("DeepPink1");
                        else if(r==238 && g==18 && b==137)
                            txtname.setText("DeepPink2");
                        else if(r==205 && g==16 && b==118)
                            txtname.setText("DeepPink3");
                        else if(r==139 && g==10 && b==80)
                            txtname.setText("DeepPink4");
                        else if(r==255 && g==105 && b==180)
                            txtname.setText("HotPink");
                        else if(r==255 && g==110 && b==180)
                            txtname.setText("HotPink1");
                        else if(r==238 && g==106 && b==167)
                            txtname.setText("HotPink2");
                        else if(r==205 && g==96 && b==144)
                            txtname.setText("HotPink3");
                        else if(r==139 && g==58 && b==98)
                            txtname.setText("HotPink4");
                        else if(r==205 && g==92 && b==92)
                            txtname.setText("IndianRed");
                        else if(r==255 && g==106 && b==106)
                            txtname.setText("IndianRed1");
                        else if(r==238 && g==99 && b==99)
                            txtname.setText("IndianRed2");
                        else if(r==205 && g==85 && b==85)
                            txtname.setText("IndianRed3");
                        else if(r==139 && g==58 && b==58)
                            txtname.setText("IndianRed4");
                        else if(r==255 && g==174 && b==185)
                            txtname.setText("LightPink");
                        else if(r==124 && g==205 && b==124)
                            txtname.setText("LightPink1");
                        else if(r==238 && g==162 && b==173)
                            txtname.setText("LightPink2");
                        else if(r==205 && g==140 && b==149)
                            txtname.setText("LightPink3");
                        else if(r==139 && g==95 && b==101)
                            txtname.setText("LightPink4");
                        else if(r==199 && g==21 && b==133)
                            txtname.setText("MediumVioletRed");
                        else if(r==255 && g==228 && b==225)
                            txtname.setText("MistyRose");
                        else if(r==255 && g==213 && b==210)
                            txtname.setText("MistyRose2");
                        else if(r==205 && g==183 && b==181)
                            txtname.setText("MistyRose3");
                        else if(r==139 && g==125 && b==123)
                            txtname.setText("MistyRose4");
                        else if(r==238 && g==64 && b==0)
                            txtname.setText("OrangeRed2");
                        else if(r==205 && g==55 && b==0)
                            txtname.setText("OrangeRed3");
                        else if(r==139 && g==37 && b==0)
                            txtname.setText("OrangeRed4");
                        else if(r==219 && g==112 && b==147)
                            txtname.setText("PaleVioletRed");
                        else if(r==255 && g==121 && b==159)
                            txtname.setText("PaleVioletRed1");
                        else if(r==238 && g==205 && b==124)
                            txtname.setText("PaleVioletRed2");
                        else if(r==205 && g==104 && b==137)
                            txtname.setText("PaleVioletRed3");
                        else if(r==139 && g==71 && b==93)
                            txtname.setText("PaleVioletRed4");
                        else if(r==208 && g==32 && b==144)
                            txtname.setText("VioletRed");
                        else if(r==255 && g==62 && b==150)
                            txtname.setText("VioletRed1");
                        else if(r==238 && g==58 && b==140)
                            txtname.setText("VioletRed2");
                        else if(r==205 && g==50 && b==120)
                            txtname.setText("VioletRed3");
                        else if(r==139 && g==34 && b==82)
                            txtname.setText("VioletRed4");
                        else if(r==178 && g==34 && b==34)
                            txtname.setText("firebrick");
                        else if(r==255 && g==48 && b==48)
                            txtname.setText("firebrick1");
                        else if(r==238 && g==44 && b==44)
                            txtname.setText("firebrick2");
                        else if(r==205 && g==38 && b==38)
                            txtname.setText("firebrick3");
                        else if(r==139 && g==26 && b==26)
                            txtname.setText("firebrick4");
                        else if(r==255 && g==192 && b==203)
                            txtname.setText("pink");
                        else if(r==255 && g==181 && b==197)
                            txtname.setText("pink1");
                        else if(r==238 && g==169 && b==184)
                            txtname.setText("pink2");
                        else if(r==205 && g==145 && b==158)
                            txtname.setText("pink3");
                        else if(r==139 && g==99 && b==108)
                            txtname.setText("pink4");
                        else if(r==245 && g==204 && b==176)
                            txtname.setText("Flesh");
                        else if(r==209 && g==146 && b==117)
                            txtname.setText("Feldspar");
                        else if(r==255 && g==0 && b==0)
                            txtname.setText("red");
                        else if(r==238 && g==0 && b==0)
                            txtname.setText("red2");
                        else if(r==205 && g==0 && b==0)
                            txtname.setText("red3");
                        else if(r==139 && g==0 && b==0)
                            txtname.setText("red4");
                        else if(r==255 && g==99 && b==71)
                            txtname.setText("tomato");
                        else if(r==238 && g==92 && b==66)
                            txtname.setText("tomato2");
                        else if(r==205 && g==79 && b==57)
                            txtname.setText("tomato3");
                        else if(r==139 && g==54 && b==38)
                            txtname.setText("tomato4");
                        else if(r==133 && g==99 && b==99)
                            txtname.setText("Dusty Rose");
                        else if(r==142 && g==35 && b==35)
                            txtname.setText("Firebrick");
                        else if(r==245 && g==204 && b==176)
                            txtname.setText("Indian Red");
                        else if(r==188 && g==143 && b==143)
                            txtname.setText("Pink");
                        else if(r==111 && g==66 && b==66)
                            txtname.setText("Salmon");
                        else if(r==140 && g==23 && b==23)
                            txtname.setText("Scarlet");
                        else if(r==255 && g==28 && b==174)
                            txtname.setText("Spicy Pink");
                        else if(r==227 && g==91 && b==216)
                            txtname.setText("Free Speech Magenta");
                        else if(r==192 && g==0 && b==0)
                            txtname.setText("Free Speech Red");


                        //shades of violet
                        else if(r==153 && g==50 && b==204)
                            txtname.setText("DarkOrchid");
                        else if(r==191 && g==62 && b==255)
                            txtname.setText("DarkOrchid1");
                        else if(r==178 && g==58 && b==238)
                            txtname.setText("DarkOrchid2");
                        else if(r==154 && g==50 && b==205)
                            txtname.setText("DarkOrchid3");
                        else if(r==148 && g==34 && b==139)
                            txtname.setText("DarkViolet");
                        else if(r==255 && g==240 && b==245)
                            txtname.setText("LavenderBlush");
                        else if(r==238 && g==224 && b==229)
                            txtname.setText("LavenderBlush2");
                        else if(r==205 && g==193 && b==197)
                            txtname.setText("LavenderBlush3");
                        else if(r==139 && g==131 && b==134)
                            txtname.setText("LavenderBlush4");
                        else if(r==186 && g==131 && b==134)
                            txtname.setText("MediumOrchid");
                        else if(r==224 && g==102 && b==255)
                            txtname.setText("MediumOrchid1");
                        else if(r==209 && g==95 && b==238)
                            txtname.setText("MediumOrchid2");
                        else if(r==180 && g==82 && b==205)
                            txtname.setText("MediumOrchid3");
                        else if(r==122 && g==55 && b==139)
                            txtname.setText("MediumOrchid4");
                        else if(r==147 && g==112 && b==219)
                            txtname.setText("MediumPurple");
                        else if(r==147 && g==112 && b==219)
                            txtname.setText("Medium Orchid");
                        else if(r==171 && g==130 && b==255)
                            txtname.setText("MediumPurple1");
                        else if(r==153 && g==50 && b==205)
                            txtname.setText("Dark Orchid");
                        else if(r==159 && g==121 && b==238)
                            txtname.setText("MediumPurple2");
                        else if(r==137 && g==104 && b==205)
                            txtname.setText("MediumPurple3");
                        else if(r==93 && g==71 && b==139)
                            txtname.setText("MediumPurple4");
                        else if(r==230 && g==230 && b==250)
                            txtname.setText("lavender");
                        else if(r==255 && g==0 && b==255)
                            txtname.setText("magenta");
                        else if(r==255 && g==0 && b==255)
                            txtname.setText("fuchsia");
                        else if(r==238 && g==0 && b==238)
                            txtname.setText("magenta2");
                        else if(r==205 && g==0 && b==205)
                            txtname.setText("magenta3");
                        else if(r==139 && g==0 && b==139)
                            txtname.setText("magenta4");
                        else if(r==176 && g==48 && b==96)
                            txtname.setText("maroon");
                        else if(r==255 && g==52 && b==179)
                            txtname.setText("maroon1");
                        else if(r==238 && g==48 && b==167)
                            txtname.setText("maroon2");
                        else if(r==205 && g==41 && b==144)
                            txtname.setText("maroon3");
                        else if(r==139 && g==28 && b==98)
                            txtname.setText("maroon4");
                        else if((r==218 && g==112 && b==214) || (r==219 && g==112 && b==219))
                            txtname.setText("orchid");
                        else if(r==255 && g==131 && b==250)
                            txtname.setText("orchid1");
                        else if(r==238 && g==122 && b==233)
                            txtname.setText("orchid2");
                        else if(r==205 && g==105 && b==201)
                            txtname.setText("orchid3");
                        else if(r==139 && g==71 && b==137)
                            txtname.setText("orchid4");
                        else if(r==124 && g==205 && b==124)
                            txtname.setText("plum");
                        else if(r==255 && g==187 && b==255)
                            txtname.setText("plum1");
                        else if(r==238 && g==174 && b==238)
                            txtname.setText("plum2");
                        else if(r==205 && g==150 && b==205)
                            txtname.setText("plum3");
                        else if(r==139 && g==102 && b==139)
                            txtname.setText("plum4");
                        else if((r==160 && g==32 && b==240) || (r==128 && g==0 && b==128))
                            txtname.setText("purple");
                        else if(r==155 && g==48 && b==255)
                            txtname.setText("purple1");
                        else if(r==145 && g==44 && b==238)
                            txtname.setText("purple2");
                        else if(r==125 && g==38 && b==205)
                            txtname.setText("purple3");
                        else if(r==85 && g==26 && b==139)
                            txtname.setText("purple4");
                        else if(r==216 && g==191 && b==216)
                            txtname.setText("thistle");
                        else if(r==255 && g==225 && b==255)
                            txtname.setText("thistle1");
                        else if(r==238 && g==210 && b==238)
                            txtname.setText("thistle2");
                        else if(r==205 && g==181 && b==205)
                            txtname.setText("thistle3");
                        else if(r==139 && g==123 && b==139)
                            txtname.setText("thistle4");
                        else if(r==238 && g==130 && b==238)
                            txtname.setText("violet");
                        else if(r==159 && g==95 && b==159)
                            txtname.setText("violet blue");
                        else if(r==135 && g==31 && b==120)
                            txtname.setText("Dark Purple");
                        else if(r==128 && g==0 && b==0)
                            txtname.setText("Maroon");
                        else if(r==219 && g==112 && b==147)
                            txtname.setText("Medium Violet Red");
                        else if(r==255 && g==110 && b==199)
                            txtname.setText("Neon Pink");
                        else if(r==234 && g==173 && b==234)
                            txtname.setText("Plum");
                        else if(r==173 && g==234 && b==234)
                            txtname.setText("Turquoise");
                        else if(r==79 && g==47 && b==79)
                            txtname.setText("Violet");
                        else if(r==204 && g==50 && b==153)
                            txtname.setText("Violet Red");
                        else if(r==216 && g==191 && b==216)
                            txtname.setText("Thistle");
                        // SHADES OF WHITE
                        else if(r==250 && g==235 && b==215)
                            txtname.setText("AntiqueWhite");
                        else if(r==255 && g==239 && b==219)
                            txtname.setText("AntiqueWhite1");
                        else if(r==238 && g==223 && b==204)
                            txtname.setText("AntiqueWhite2");
                        else if(r==205 && g==192 && b==176)
                            txtname.setText("AntiqueWhite3");
                        else if(r==139 && g==131 && b==120)
                            txtname.setText("AntiqueWhite4");
                        else if(r==255 && g==250 && b==240)
                            txtname.setText("FloralWhite");
                        else if(r==248 && g==248 && b==255)
                            txtname.setText("GhostWhite");
                        else if(r==255 && g==222 && b==173)
                            txtname.setText("NavajoWhite");
                        else if(r==238 && g==207 && b==161)
                            txtname.setText("NavajoWhite2");
                        else if(r==205 && g==179 && b==139)
                            txtname.setText("NavajoWhite3");
                        else if(r==139 && g==121 && b==94)
                            txtname.setText("NavajoWhite4");
                        else if(r==253 && g==245 && b==230)
                            txtname.setText("OldLace");
                        else if(r==245 && g==245 && b==245)
                            txtname.setText("WhiteSmoke");
                        else if(r==220 && g==220 && b==220)
                            txtname.setText("gainsboro");
                        else if(r==255 && g==255 && b==240)
                            txtname.setText("ivory");
                        else if(r==238 && g==238 && b==224)
                            txtname.setText("ivory2");
                        else if(r==205 && g==205 && b==193)
                            txtname.setText("ivory3");
                        else if(r==139 && g==139 && b==131)
                            txtname.setText("ivory4");
                        else if(r==250 && g==240 && b==230)
                            txtname.setText("linen");
                        else if(r==255 && g==245 && b==238)
                            txtname.setText("seashell");
                        else if(r==238 && g==229 && b==222)
                            txtname.setText("seashell2");
                        else if(r==205 && g==197 && b==191)
                            txtname.setText("seashell3");
                        else if(r==139 && g==134 && b==130)
                            txtname.setText("seashell4");
                        else if(r==255 && g==250 && b==250)
                            txtname.setText("snow");
                        else if(r==238 && g==233 && b==233)
                            txtname.setText("snow2");
                        else if(r==205 && g==201 && b==201)
                            txtname.setText("snow3");
                        else if(r==139 && g==137 && b==137)
                            txtname.setText("snow4");
                        else if(r==245 && g==222 && b==179)
                            txtname.setText("wheat");
                        else if(r==255 && g==231 && b==186)
                            txtname.setText("wheat1");
                        else if(r==238 && g==216 && b==174)
                            txtname.setText("wheat2");
                        else if(r==205 && g==186 && b==150)
                            txtname.setText("wheat3");
                        else if(r==139 && g==126 && b==102)
                            txtname.setText("wheat4");
                        else if(r==217 && g==217 && b==243)
                            txtname.setText("Quartz");
                        else if(r==216 && g==216 && b==191)
                            txtname.setText("Wheat");

                        // SHADES OF YELLOW
                        else if(r==255 && g==235 && b==205)
                            txtname.setText("BlanchedAlmond");
                        else if(r==184 && g==134 && b==11)
                            txtname.setText("DarkGoldenrod");
                        else if(r==255 && g==185 && b==15)
                            txtname.setText("DarkGoldenrod1");
                        else if(r==238 && g==173 && b==14)
                            txtname.setText("DarkGoldenrod2");
                        else if(r==205 && g==149 && b==12)
                            txtname.setText("DarkGoldenrod3");
                        else if(r==139 && g==101&& b==8)
                            txtname.setText("DarkGoldenrod4");
                        else if(r==255 && g==250 && b==205)
                            txtname.setText("LemonChiffon");
                        else if(r==238 && g==233 && b==191)
                            txtname.setText("LemonChiffon2");
                        else if(r==205 && g==201 && b==165)
                            txtname.setText("LemonChiffon3");
                        else if(r==139 && g==137 && b==112)
                            txtname.setText("LemonChiffon4");
                        else if(r==238 && g==221 && b==130)
                            txtname.setText("LightGoldenrod");
                        else if(r==255 && g==236 && b==139)
                            txtname.setText("LightGoldenrod1");
                        else if(r==238 && g==220 && b==130)
                            txtname.setText("LightGoldenrod2");
                        else if(r==205 && g==190 && b==112)
                            txtname.setText("LightGoldenrod3");
                        else if(r==139 && g==129 && b==76)
                            txtname.setText("LightGoldenrod4");
                        else if(r==250 && g==250 && b==210)
                            txtname.setText("LightGoldenrodYellow");
                        else if(r==255 && g==255 && b==224)
                            txtname.setText("LightYellow1");
                        else if(r==238 && g==238 && b==209)
                            txtname.setText("LightYellow2");
                        else if(r==205 && g==205 && b==180)
                            txtname.setText("LightYellow3");
                        else if(r==139 && g==139 && b==122)
                            txtname.setText("LightYellow4");
                        else if(r==238 && g==232 && b==170)
                            txtname.setText("PaleGoldenrod");
                        else if(r==255 && g==239 && b==213)
                            txtname.setText("PapayaWhip");
                        else if(r==255 && g==248 && b==220)
                            txtname.setText("cornsilk");
                        else if(r==238 && g==232 && b==205)
                            txtname.setText("cornsilk2");
                        else if(r==205 && g==200 && b==177)
                            txtname.setText("cornsilk3");
                        else if(r==139 && g==136 && b==120)
                            txtname.setText("cornsilk4");
                        else if(r==218 && g==165 && b==32)
                            txtname.setText("goldenrod");
                        else if(r==255 && g==193 && b==37)
                            txtname.setText("goldenrod1");
                        else if(r==238 && g==180 && b==34)
                            txtname.setText("goldenrod2");
                        else if(r==205 && g==155 && b==29)
                            txtname.setText("goldenrod3");
                        else if(r==139 && g==105 && b==20)
                            txtname.setText("goldenrod4");
                        else if(r==255 && g==228 && b==181)
                            txtname.setText("moccasin");
                        else if(r==255 && g==255 && b==0)
                            txtname.setText("yellow");
                        else if(r==238 && g==238 && b==0)
                            txtname.setText("yellow2");
                        else if(r==205 && g==205 && b==0)
                            txtname.setText("yellow3");
                        else if(r==139 && g==139 && b==0)
                            txtname.setText("yellow4");
                        else if(r==255 && g==215 && b==0)
                            txtname.setText("gold");
                        else if(r==238 && g==201 && b==0)
                            txtname.setText("gold2");
                        else if(r==205 && g==173 && b==0)
                            txtname.setText("gold3");
                        else if(r==139 && g==117 && b==0)
                            txtname.setText("gold4");
                        else if(r==219 && g==219 && b==112)
                            txtname.setText("Goldenrod");
                        else if(r==234 && g==234 && b==174)
                            txtname.setText("Medium Goldenrod");
                        else if(r==153 && g==204 && b==50)
                            txtname.setText("Yellow Green");
                        else if(r==184 && g==115 && b==51)
                            txtname.setText("copper");
                        else if(r==217 && g==135 && b==25)
                            txtname.setText("cool copper");
                        else if(r==133 && g==99 && b==99)
                            txtname.setText("Green Copper");
                        else if(r==181 && g==166 && b==66)
                            txtname.setText("brass");
                        else if(r==140 && g==120 && b==83)
                            txtname.setText("bronze");
                        else if(r==166 && g==125 && b==61)
                            txtname.setText("bronze II");
                        else if(r==217 && g==217 && b==25)
                            txtname.setText("bright gold");
                        else if(r==207 && g==181 && b==59)
                            txtname.setText("Old Gold");
                        else if(r==204 && g==153 && b==0)
                            txtname.setText("CSS Gold");
                        else if(r==205 && g==127 && b==50)
                            txtname.setText("gold");
                        else if(r==230 && g==232 && b==250)
                            txtname.setText("silver");
                        else if(r==192 && g==192 && b==192)
                            txtname.setText("Grey");
                        else if(r==84 && g==84 && b==84)
                            txtname.setText("Light Steel Blue");
                        else if(r==35 && g==107 && b==142)
                            txtname.setText("Steel Blue");
                       else if((b<=25 && r>=224 && g<=18) || (r>=224 && g==0 && b<=14))
                           txtname.setText("red");
                       else if(((r<224 && r>=169) && g<=48 && b==0) || ((r<=223 && r>=170) && b<=9 && g==0))
                           txtname.setText("Free Speech Red");
                       else if(((r<=168 && r>=148) && b==0 && g<=64) || ((r<=168 && r>=138) && g==0 && b<=9 ))
                           txtname.setText("Sangria");
                       else if(((r<=147 && r>=134) && b==0 && g<=66) || ((r<=137 && r>=134) && g==0 && b<=12))
                           txtname.setText("Dark red");
                       else if (((r<=133 && r>=51) && g<=46 && b==0) || ((r<=133 && r>=73) && (g==0) && b<=10))
                           txtname.setText("Maroon");
                       else if(((r<=50 && r>=1) && b==0 && g<=5) || ((r<=50 && r>=1) && g==0 && b<=50))
                        txtname.setText("Tyrian Purple");
                       else if (((b==0 && r>=224 && (g>=19 && g<=52)) ))
                                txtname.setText("Scarlet");
                        else if (((g==0 && r>=224 && (b>=43 && b<=63)) ))
                            txtname.setText("Torch Red");
                        else if((g>=53 && g<=72) && b==0 && r>=230)
                            txtname.setText("Orange Red");
                        else if ((g<=81 && g>=73)&& r>241 && b<=29)
                            txtname.setText("Vermilion");
                        else if ((g<=78 && g<=90)&& r>244 && b==0)
                            txtname.setText("International Orange");
                        else if ((g<=90 && g<=120)&& r>244 && b==0)
                            txtname.setText("Safety Orange");
                        else if ((g<=121 && g<=149)&& r>244 && b==0)
                            txtname.setText("Dark Orange");
                        else if ((g<=150 && g<=162)&& r>244 && b==0)
                            txtname.setText("Orange Peel\n");
                        else if ((g<=163 && g<=175)&& r>244 && b==0)
                            txtname.setText("Orange");
                        else if ((g<=176 && g<=188)&& r>244 && b==0)
                            txtname.setText("Selective Yellow");
                        else if ((g<=189 && g<=194)&& r>244 && b==0)
                            txtname.setText("Amber");
                        else if ((g<=195 && g<=198)&& r>244 && b==0)
                            txtname.setText("Golden Poppy");
                        else if ((g<=199 && g<=209)&& r>244 && b==0)
                            txtname.setText("Tangerine Yellow");
                        else if ((g<=210 && g<=215)&& r>244 && b==0)
                            txtname.setText("Tangerine Yellow");
                        else if ((g<=210 && g<=215)&& r>244 && b==0)
                            txtname.setText("Gold");
                        else if ((g<=216 && g<=219)&& r>244 && b==0)
                            txtname.setText("School Bus Yellow");
                        else if ((g<=220 && g<=239)&& r>244 && b==0)
                            txtname.setText("Golden Yellow");
                        else if ((g<=240 && g<=255)&& r>244 && b==0)
                            txtname.setText("Yellow");
                        else if ((r<=214 && r<=255)&& (g==254 || g==253) && b==0)
                            txtname.setText("Chartreuse Yellow");
                        else if ((r>=146 && r<=186)&& r>244 && b<=1 && (g>=212))
                            txtname.setText("Electric Lime");
                        else if((r<=185 && r>=148) && b<=12 && g<=243)
                            txtname.setText("Spring Bud");
                        else if((r<=147 && r>=121) && b<=38 && g>=249)
                            txtname.setText("Chartreuse");
                        else if((r<=120 && r>=112) && b<=9 &&(g<=249 && g<=200) )
                            txtname.setText("Lawn Green");
                        else if((r<=111 && r>=81) && b==0 && g>=188 )
                            txtname.setText("Bright Green");
                        else if((r<=80 && r>=32) && b<=3 && g>=196 )
                            txtname.setText("Harlequin");
                        else if((r<=31 && r>=0) && b<=3 && g>=204 )
                            txtname.setText("Lime");
                        else if((b>=22 && b<=68) && g==255 && r<=48)
                            txtname.setText("Free Speech Green");
                        else if((b>=46 && b<=97) && (g<=247 && g>=208) && r<=27)
                            txtname.setText("Malachite");
                        else if((b>=73 && b<=141) && g>=254 && r<=57)
                            txtname.setText("Spring Green");
                        else if((b>=142 && b<=197) && g>=228 && r<=66)
                            txtname.setText("Medium Spring Green");
                        else if((b>=198 && b<=220) && g>=228 && r<=25)
                            txtname.setText("Bright Turquoise");
                        else if((b>=221 && b<=255) && g>=224 && r<=55)
                            txtname.setText("Aqua");
                        else if((g>=220) && b>=244 && r==0)
                            txtname.setText("Deep Sky Blue");
                        else if((g<=204 && g>=113) && b>=244 && (r>=2 && r<60))
                            txtname.setText("Dodger Blue");
                        else if((g<=113 && g>=47) && b==255 && (r>=57 && r<94))
                            txtname.setText("Neon Blue");
                        else if((g<=93 && g>=70) && b>=184 && r<=9)
                            txtname.setText("Navy Blue");
                        else if(g<=69 && b==255 && r<=18)
                            txtname.setText("Blue");
                        else if(b>=248 && (r>=47 && r<=67) && g<=46)
                            txtname.setText("Han Purple");
                        else if(b>=248 && (r>=67 && r<=146) && g<=49)
                            txtname.setText("Electric Indigo");
                        else if(b>=248 && (r>=147 && r<=205) && g<=58)
                            txtname.setText("Electric Purple");
                        else if(b>=248 && (r>=205 && r<=205) && g<=58)
                            txtname.setText("Psychedelic Purple");
                        else if(r==255 && (b>=230 && b<=255) && g<=26)
                            txtname.setText("Magenta");
                        else if(r==255 && (b>=183 && b<=229) && g==0)
                            txtname.setText("Hot Magenta");
                        else if(r>=254 && (b>=181 && b<=228) && g<=17)
                            txtname.setText("Shocking Pink");
                        else if(r>=195 && (b>=141 && b<=180) && g==0)
                            txtname.setText("Hollywood Cerise");
                        else if(r>=254 && (b>=106 && b<=140) && g==0)
                            txtname.setText("Deep Pink");
                        else if(r>=197 && (b>=95 && b<=105) && g<=11)
                            txtname.setText("Razzmatazz");
                        else if((r>=215 && r<=229) && g<=11 && (b<=224 && b>=185))
                            txtname.setText("Deep Magenta");
                        else if((r>=97 && r<=201) && g<=14 && (b<=220 && b>=171))
                            txtname.setText("Dark Violet");
                        else if(r<=68 && g<=7 && (b<=203 && b>=188))
                            txtname.setText("Medium Blue");
                        else if(r<=7 && g<=55 && (b<=188 && b>=159))
                            txtname.setText("International Klein Blue");
                        else if(r<=11 && (g>=52 && g<=134) && (b<=235 && b>=218))
                            txtname.setText("Navy Blue");
                        else if(r<=14 && (g<=167 && g>=135) && (b<=234 && b>=219))
                            txtname.setText("Pacific Blue");
                        else if(r<=19 && (g<=184 && g>=168) && (b<=220 && b>=174))
                            txtname.setText("Iris Blue");
                        else if(r<=4 && (g<=230 && g>=195) && (b<=230 && b>=209))
                            txtname.setText("Dark Turquoise");
                        else if(r<=8 && (g<=216 && g>=209) && (b<=201 && b>=179))
                            txtname.setText("Robin's Egg Blue");
                        else if(r<=12 && (g<=203 && g>=193) && (b<=169 && b>=125))
                            txtname.setText("Caribbean Green");
                        else if((r<=87 && r>=19)&& (g<=236 && g>=183) && (b<=61 && b>=26))
                            txtname.setText("Kelly Green");
                        else if((r<=2 && r>=0)&& (g<=211 && g>=184) && (b<=94 && b>=10))
                            txtname.setText("Dark Pastel Green");
                        else if((r<=3 && r>=0)&& (g<=196 && g>=140) && (b<=43 && b>=0))
                            txtname.setText("Islamic Green");
                        else if((r<=64 && r>=0)&& (g<=130 && g>=140) && (b<=14 && b>=0))
                            txtname.setText("Green");
                        else if((r<=114 && r>=78)&& (g<=63 && g>=140) && (b<=3 && b>=0))
                            txtname.setText("Olive");
                        else if((r<=170 && r>=141)&& (g<=211 && g>=162) && (b<=2 && b>=0))
                            txtname.setText("Citrus");
                        else if((r<=241 && r>=205)&& (g<=157 && g>=150) && (b<=2 && b>=0))
                            txtname.setText("Tangerine");
                        else if((r<=225 && r>=199)&& (g<=133 && g>=127) && (b<=2 && b>=0))
                            txtname.setText("Mango Tango");
                        else if((r<=243 && r>=225)&& (g<=133 && g>=100) && (b<=2 && b>=0))
                            txtname.setText("Persimmon");
                        else if((r<=225 && r>=199)&& (g<=133 && g>=127) && (b<=15 && b>=0))
                            txtname.setText("Mango Tango");
                        else if((r<=168 && r>=146)&& (g<=8 && g>=0) && (b<=8 && b>=0))
                            txtname.setText("Sangria");
                        else if((r<=187 && r>=147)&& (g<=13 && g>=0) && (b<=140 && b>=124))
                            txtname.setText("Dark Magenta");
                        else if((r<=184 && r>=150)&& (g<=11 && g>=0) && (b<=63 && b>=13))
                            txtname.setText("Carmine");
                        else if((r<=40 && r>=0)&& (g<=2 && g>=0) && (b<=147 && b>=134))
                            txtname.setText("Dark Blue");
                        else if((r<=184 && r>=164)&& (g<=5 && g>=0) && (b<=63 && b>=109))
                            txtname.setText("Eggplant");
                        else if((b>=41 && b<=145)&& (r>=40 && r<=144) && g<=15)
                            txtname.setText(" Indigo");
                        else if((b>=109 && b<=130)&& (r>=40 && r<=144) && g<=2)
                            txtname.setText(" Purple");
                        else if((b>=0 && b<=2)&& (r>=182 && r<=203) && (g<=120 && g>=47))
                            txtname.setText(" Tenne (Tawny)");
                        else if((b>=0 && b<=19)&& (r>=179 && r<=196) && (g<=141 && g>=115))
                            txtname.setText("Dark Goldenrod");
                        else if((b>=22 && b<=39)&& (r>=142 && r<=177) && (g<=0 && g>=17))
                            txtname.setText("Bahia");
                        else if((b>=148 && b<=180)&& (r>=0 && r<=56) && (g<=141 && g>=115))
                            txtname.setText("New Midnight Blue");
                        else if((b>=164 && b<=181)&& (r>=0 && r<=9) && (g<=141 && g>=96))
                            txtname.setText("Cobalt");
                        else if((b>=143 && b<=173)&& (r>=0 && r<=10) && (g<=115 && g>=98))
                            txtname.setText("Cerulean");
                        else if((b>=145 && b<=153)&& (r>=0 && r<=11) && (g<=127 && g>=115))
                            txtname.setText("Eastern Blue");
                        else if((b>=136 && b<=147)&& (r>=0 && r<=3) && (g<=152 && g>=120))
                            txtname.setText("Dark Cyan");
                        else if((b>=126 && b<=142)&& (r>=0 && r<=4) && (g<=138 && g>=120))
                            txtname.setText("Teal");
                        else if((b>=114 && b<=129)&& (r>=0 && r<=1) && (g<=133 && g>=111))
                            txtname.setText("Surfie Green");
                        else if((b>=83 && b<=132)&& (r>=0 && r<=10) && (g<=141 && g>=133))
                            txtname.setText("Pine Green");
                        else if((b>=46 && b<=76)&& (r>=0 && r<=8) && (g<=135 && g>=96))
                            txtname.setText("Watercourse");
                        else if((b>=143 && b<=173)&& (r>=0 && r<=12) && (g<=136 && g>=98))
                            txtname.setText("Cerulean");
                        else if((b>=98 && b<=114)&& (r>=0 && r<=3) && (g<=151 && g>=132))
                            txtname.setText("Observatory");
                        else if((b>=90 && b<=99)&& (r>=0 && r<=4) && (g<=135 && g>=106))
                            txtname.setText("Tropical Rain Forest");
                        else if((b>=88 && b<=99)&& (r>=0 && r<=8) && (g<=104 && g>=83))
                            txtname.setText("Mosque");
                        else if((b>=0 && b<=54)&& (r>=0 && r<=7) && (g<=95 && g>=54))
                            txtname.setText("British Racing Green");
                        else if((b>=0 && b<=53)&& (r>=0 && r<=4) && (g<=53 && g>=0))
                            txtname.setText("Dark Green");
                        else if((b>=89 && b<=127)&& (r>=0 && r<=4) && (g<=68 && g>=14))
                            txtname.setText("Prussian Blue");
                        else if((b>=59 && b<=127)&& (r>=0 && r<=3   ) && (g<=87 && g>=43))
                            txtname.setText("Sherpa Blue");
                        else if((b>=11 && b<=37)&& (r==255 && r==255 ) && (g<=133 && g>=102))
                            txtname.setText("Pumpkin");
                        else if((b>=13 && b<=32)&& (r>=0 && r<=247 ) && (g<=185 && g>=149))
                            txtname.setText("Dark Tangerine");
                        else if((b>=3 && b<=13)&& (r>=201 && r<=220 ) && (g<=30 && g>=3))
                            txtname.setText("Venetian Red");
                        else if((b>=137 && b<=156)&& (r>=0 && r<=3 ) && (g<=67 && g>=29))
                            txtname.setText("Smalt");
                        else if((b>=100 && b<=137)&& (r>=0 && r<=4 ) && (g<=108 && g>=73))
                            txtname.setText("Blue Lagoon");
                        else if((b>=108 && b<=132)&& (r>=0 && r<=13 ) && (g<=162 && g>=152))
                            txtname.setText("Free Speech Aquamarine");
                        else if((b>=45 && b<=65)&& (r>=119 && r<=144 ) && (g<=04 && g>=0))
                            txtname.setText("Burgundy");
                        else if((b>=0 && b<=15)&& (r>=195 && r<=206 ) && (g<=209 && g>=170))
                            txtname.setText("La Rioja");
                        else if((b>=94 && b<=127)&& (r>=0 && r<=11) && (g<=201 && g>=161))
                            txtname.setText("Jade");
                        else if((b>=176 && b<=195)&& (r>=0 && r<=3 ) && (g<=159 && g>=127))
                            txtname.setText("Bondi Blue");
                        else if((b>=3 && b<=24)&& (r>=156 && r<=188 ) && (g<=69 && g>=42))
                            txtname.setText("Rust");
                        else if((b>=34 && b<=76)&& (r>=4 && r<=33 ) && (g<=7 && g>=0))
                            txtname.setText("Sapphire");
                        else if((b>=59 && b<=95)&& (r>=173 && r<=195 ) && (g<=21 && g>=3))
                            txtname.setText("Jazzberry Jam");
                        else if((b>=3 && b<=21)&& (r>=207 && r<=221 ) && (g<=173 && g>=161))
                            txtname.setText("Gamboge");
                        else if((b>=7 && b<=35)&& (r>=235 && r<=255 ) && (g<=245 && g>=226))
                            txtname.setText("Lemon");
                        else if((b>=3 && b<=12)&& (r>=51 && r<=86 ) && (g<=58 && g>=49))
                            txtname.setText("Raw Umber");
                        else if((b>=128 && b<=158)&& (r>=187 && r<=210 ) && (g<=33 && g>=3))
                            txtname.setText("Medium Violet Red");
                        else if((b>=110 && b<=178)&& (r>=47 && r<=69 ) && (g<=14 && g>=5))
                            txtname.setText("Ultramarine");
                        else if((b>=7 && b<=27)&& (r>=208 && r<=221 ) && (g<=51 && g>=50))
                            txtname.setText("Harley Davidson Orange");
                        else if((b>=5 && b<=21)&& (r>=114 && r<=122 ) && (g<=75 && g>=55))
                            txtname.setText("Saddle Brown");
                        else if((b>=169 && b<=188)&& (r>=2 && r<=20 ) && (g<=70 && g>=26))
                            txtname.setText("Egyptian Blue");
                        else if((b>=119 && b<=133)&& (r>=3 && r<=18 ) && (g<=95 && g>=53))
                            txtname.setText("Dark Cerulean");
                        else if((b>=8 && b<=50)&& (r>=142 && r<=209 ) && (g<=216 && g>=161))
                            txtname.setText("Inch Worm");
                        else if((b>=46 && b<=72)&& (r>=0 && r<=3 ) && (g<=181 && g>=135))
                            txtname.setText("Pigment Green");
                        else if((b>=80 && b<=96)&& (r>=5 && r<=12 ) && (g<=146 && g>=135))
                            txtname.setText("Shamrock Green");
                        else if((b>=130 && b<=157)&& (r>=0 && r<=12 ) && (g<=183 && g>=151))
                            txtname.setText("Persian Green");
                        else if((b>=12 && b<=36)&& (r>=240 && r<=247 ) && (g<=225 && g>=214))
                            txtname.setText("Turbo");
                        else if((b>=216 && b<=230)&& (r>=13 && r<=31 ) && (g<=114 && g>=53))
                            txtname.setText("Denim");
                        else if((b>=202 && b<=238)&& (r>=16 && r<=36 ) && (g<=57 && g>=49))
                            txtname.setText("Persian Blue");
                        else if((b>=52 && b<=92)&& (r>=24 && r<=91 ) && (g<=17 && g>=6))
                            txtname.setText("Persian Indigo ");
                        else if((b>=12 && b<=18)&& (r>=223 && r<=241 ) && (g<=235 && g>=219))
                            txtname.setText("Broom");
                        else if((b>=13 && b<=25)&& (r>=218 && r<=220 ) && (g<=224 && g>=187))
                            txtname.setText("Bird Flower");
                        else if((b>=16 && b<=36)&& (r>=165 && r<=239 ) && (g<=40 && g>=14))
                            txtname.setText("Fire Engine Red");
                        else if((b>=30 && b<=48)&& (r>=155 && r<=164 ) && (g<=33 && g>=17))
                            txtname.setText("Fire Brick");
                        else if((b>=10 && b<=21)&& (r>=195 && r<=226 ) && (g<=61 && g>=38))
                            txtname.setText("Harley Davidson Orange");
                        else if((b>=216 && b<=230)&& (r>=13 && r<=31 ) && (g<=114 && g>=53))
                            txtname.setText("Mountain Meadow");






                        else
                            txtname.setText("Invald Color");




























                    }
                    else if(checkopen==true)
                    {
                        Toast.makeText(MainEXtract.this, "You need open Gallery first", Toast.LENGTH_SHORT).show();
                    }
                }
                return true;
            }
        });


    }

    // ham mo thu vien
    private void OpenGalery()
    {
        Intent Galery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(Galery,PICK_IMAGE);
        checkopen=false;
    }
    private void setViewSwatch(TextView view, Palette.Swatch swatch, final  String title1)
    {
        if(swatch!=null)
        {

            view.setBackgroundColor(swatch.getRgb());
            view.setText(title1);
            view.setTextColor(swatch.getTitleTextColor());

        }


    }


    // ham ghi de mo thu vien va pivk hinh anh
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==RESULT_OK && requestCode==PICK_IMAGE)
        {
            image_uri=data.getData();
            imgv.setImageURI(image_uri);
        }
    }
}
