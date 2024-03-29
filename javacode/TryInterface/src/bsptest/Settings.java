package bsptest;

public class Settings {
	
	public static int Loop = 100; 
	public static String[] keyWordList = new String[]{"AARON", "ABLE", "ABOUT", "ABOVE", "ACCORDING", "ACCOUNT", "ACROSS", "ACTIVE", "ACTOR", 
		   "ADDRESS", "ADJOINED", "ADMINISTERED", "ADORED", "ADULTS", "ADVENTURE", "ADVENTURES", "ADVICE", 
		   "AFFORD", "AFRICAN-AMERICAN", "AFTER", "AFTERNOON", "AFTERWARD", "AGAIN", "AGAINST", "AGE", "AGED", 
		   "AGGRESSIVE", "AGO", "AIRLINE", "AL", "ALABAMA", "ALIKE", "ALIVE", "ALL", "ALMOST", "ALONE", 
		   "ALONG", "ALSO", "ALWAYS", "ALZHEIMERS", "AM", "AMAZING", "AMBITIOUS", "AMERICA", "AMERICAN", 
		   "AMERICANS", "AMONG", "AN", "AND", "ANESTHETICS", "ANESTHETIST", "ANGER", "ANNIVERSARY", "ANNUAL", 
		   "ANOTHER", "ANY", "ANYONE", "ANYWAY", "APPARENTLY", "APPEARS", "APPLIANCE", "ARDENT", "ARE", 
		   "ARKANSAS", "ARKANSAS!", "ARLY", "ARM", "AROUND", "ARRIVED", "ARTICLE", "AS", "ASKED", "ASKING", 
		   "ASSOCIATE", "ASSOCIATED", "ASSURING", "AT", "ATE", "ATTORNEY", "AUGUST", "AUNT", "AUNTS", 
		   "AUTHORITY", "AUTOPEN", "AVAIL", "AWAKENING", "AWAY", "AWE", "BABY", "BACK", "BACKSEAT", "BACKYARD", 
		   "BAD", "BAG", "BARON", "BATHED", "BATTLE", "BATTLING", "BAWDY", "BE", "BEAMED", "BEANS", "BEAR", 
		   "BEAUTIFUL", "BECAME", "BECAUSE", "BED", "BEEN", "BEFORE", "BEFRIENDED", "BEGAN", "BEIGNETS", 
		   "BEING", "BELIEVED", "BELT", "BENTLEY", "BESIDES", "BEST", "BETSEY", "BETTER", "BETTER-TASTING", 
		   "BEYOND", "BIBLE", "BIG", "BIGGER", "BILL", "BILLS", "BIRDS", "BIRTH", "BIRTHDAY", "BIRTHPLACE", 
		   "BITE", "BLACK", "BLANKS", "BLEW", "BLISSFULLY", "BLOCK", "BLOCKS", "BLYTHE", "BLYTHES", "BOARDING", 
		   "BODCAW", "BODY", "BONE", "BOOK", "BOOKS", "BORDER", "BORN", "BOTH", "BOUGHT", "BOWL", "BOY", 
		   "BOYFRIENDS", "BOYS", "BRAGGING", "BRANCH", "BREAD", "BREAKFAST", "BREAKING", "BREAUX", "BRIEF",
		   "BRIGHT", "BRIGHTER", "BRING", "BRINGING", "BROKE", "BROTHER", "BROUGHT", "BRUSH", "BRYANTS", "BUCK", 
		   "BUDDY", "BUDDYS", "BUICK", "BUILDING", "BUILT", "BULLETS", "BURN", "BUSINESS", "BUT", "BUTTERMILK", 
		   "BUTTONED", "BUY", "BUYING", "BY", "CALIFORNIA", "CALL", "CALLED", "CALM", "CAME", "CAMP", "CAMPAIGN", 
		   "CAMPBELL", "CAN", "CANAL", "CANCER", "CANDY", "CANT", "CAR", "CARD", "CARDS", "CARE", "CAREER", 
		   "CARL", "CARLS", "CARRIED", "CARRY", "CAR-TAG", "CARTER", "CASE", "CASSIDY", "CASUALLY", "CELEBRATION", 
		   "CELLAR", "CEMETERY", "CENTER", "CENTS", "CENTURY", "CERTAINLY", "CERTIFICATE", "CHAIN", "CHAIR", 
		   "CHALLENGE", "CHANCE", "CHANGE", "CHARITY", "CHARMAINE", "CHEER", "CHELSEA", "CHESTER", "CHICAGO", 
		   "CHIEF", "CHILD", "CHILDHOOD", "CHILDREN", "CHILLS", "CHRISTMAS", "CHUNKS", "CHURCH", "CHURNS", 
		   "CIRCUMSTANCES", "CITIES", "CITY", "CLAUS", "CLAW", "CLEAN", "CLEANER", "CLEAR", "CLEARLY", "CLIMB", 
		   "CLINCHED", "CLINGING", "CLINTON", "CLOSED", "CLOSET", "CLOTHES", "CLOTHESLINES", "CLUB", "COAL-OIL", 
		   "COAST", "COFFEE", "COLLARD", "COLLECTED", "COLLEGE", "COME", "COMERS", "COMMENTS", "COMMON", 
		   "COMMUNITY", "COMPANY", "COMPLETELY", "COMPLICATED", "CONDITION", "CONDOLENCE", "CONFINES", "CONFIRMED", 
		   "CONFIRMING", "CONGRESS", "CONGRESSMAN", "CONNECTION", "CONRAD", "CONSCIENTIOUS", "CONSCIOUSNESS", 
		   "CONSIDERING", "CONSTANT", "CONTACT", "CONTROL", "CONVENTIONAL", "CONVENTIONS", "CONVERSATION", "CONVEY", 
		   "COOK", "COOKIES", "COOLED", "COPIES", "COPY", "CORN", "CORNER", "CORNSTALK", "CORRESPONDED", 
		   "CORRESPONDENCE", "COST", "COULD", "COULDNT", "COUNSELED", "COUNT", "COUNTER", "COUNTRY", 
		   "COUNTY", "COUPLE", "COURAGE", "COURSE", "COURTING", "COUSIN", "COWBOY", "CRANK", "CRAWLED", 
		   "CRAZY", "CREAM", "CREATURES", "CREDIT", "CRESCENT", "CRIED", "CRIME", "CRUEL", "CRY", "CRYING", 
		   "CURRENT", "CUSTOMERS", "DAILY", "DALLAS", "DANCE", "DANCED", "DARK", "DARKNESS", "DATE", 
		   "DATES", "DAUGHTER", "DAUGHTERS", "DAY", "DAYS", "D-DAY", "DEALING", "DEATH", "DECADES", 
		   "DECIDED", "DEEP", "DELIVERING", "DEMAND", "DEMOCRATIC", "DEMONS", "DENIED", "DEPRESSION", 
		   "DESERVED", "DETERMINATION", "DEVELOPED", "DEVELOPMENT", "DICK", "DID", "DIDNT", "DIE", "DIED", 
		   "DIFFERENT", "DIME", "DIMES", "DIMLY", "DINNER", "DIRT", "DISAPPOINTMENT", "DISAPPROVE", 
		   "DISCUSSING", "DISEASE", "DISTINGUISHED", "DITCH", "DIVORCED", "DIXIELAND", "DOCTORS", 
		   "DODGING", "DOGS", "DOING", "DOLLAR", "DOMESTIC", "DONE", "DONT", "DONUT", "DOOR", "DOORMAN", 
		   "DOORS", "DOOR-TO-DOOR", "DOUBT", "DOWN", "DRAG", "DRAIN", "DRAINAGE", "DRAMA", "DRANK", 
		   "DREAM", "DREAMS", "DRESS", "DRIED", "DRINK", "DRINKING", "DRIVE", "DRIVES", "DRIVING", 
		   "DROLL", "DROVE", "DROWNED", "DUG", "DURING", "DUTIFULLY", "DWAYNE", "EACH", "EAGERLY", 
		   "EARLIER", "EARLY", "EARNED", "EAST", "EASTER", "EAT", "EATING", "EDITH", "EDUCATION", 
		   "EFFECTIVE", "EIGHT", "EIGHTIES", "EIGHTY-SEVEN", "ELDRIDGE", "ELECTED", "ELECTORAL", "ELSE", 
		   "EMERGENCY", "EMPLOYEE", "ENCOUNTERS", "ENCYCLOPEDIA", "END", "ENDED", "ENDLESS", "ENGINES", 
		   "ENOUGH", "EQUIPMENT", "ERNESTINE", "ETTA", "EVEN", "EVENING", "EVENT", "EVENTS", "EVER", 
		   "EVERY", "EVERYBODY", "EVERYONE", "EXACTLY", "EXCEPT", "EXECUTIVE", "EXPERIENCE", 
		   "EXPERIENCED", "EXPERIENCES", "EXPLAIN", "EXPLAINING", "EXPOSING", "EXPRESSING", "EXTENDED", 
		   "EXTRA", "EYES", "FACED", "FACT", "FACTS", "FAILED", "FAIR", "FAITHFUL", "FALBA", "FALBAS", 
		   "FAMILIES", "FAMILY", "FAR", "FARMER", "FASCINATION", "FAT", "FATHER", "FATHERS", "FAVORITE", 
		   "FEAR", "FEATURE", "FEED", "FEEL", "FEELING", "FEET", "FELL", "FELLOW", "FELT", "FESTIVAL", 
		   "FETCH", "FEW", "FIFTEEN", "FIFTIES", "FIFTIETH", "FIFTY", "FIFTY-FOUR", "FIFTY-SIX", 
		   "FIGURES", "FILL", "FIND", "FINE", "FINE-LOOKING", "FINGER", "FINGERS", "FIRM", "FIRST", 
		   "FIRSTHAND", "FISHED", "FIVE", "FLAP", "FLIRTED", "FLOOR", "FLOORS", "FLOWERS", "FOLLOWED", 
		   "FOOD", "FOR", "FOREST", "FORGET", "FORGOT", "FORM", "FORMER", "FORTUNATE", "FORTY", "FOSTER", 
		   "FOUND", "FOUR", "FRAME", "FRENCH", "FRESH-CUT", "FRIDAY", "FRIEND", "FRIENDS", "FRIENDSHIP", 
		   "FROM", "FRONT", "FRUIT", "FULL", "FUNDS", "FUN-LOVING", "FUNNY", "FURNITURE", "GAMES", 
		   "GARAGE", "GAS", "GAVE", "GENERAL", "GENERATION", "GENEROUS", "GET", "GETS", "GETTING", "GI", 
		   "GIFT:", "GIVE", "GIVEN", "GIVES", "GIVING", "GLAD", "GLASSES", "GLEE", "GO", "GOALS", 
		   "GOBLET-LIKE", "GOING", "GOINGS-ON", "GONE", "GOOD", "GOODBYE", "GOOD-BYE", "GOOD-BYES", 
		   "GOODNESS", "GOSPEL", "GOSSIP", "GOT", "GOTHIC", "GOVERNOR", "GOVERNORS", "GRABBED", 
		   "GRANDFATHER", "GRANDFATHERS", "GRANDMOTHER", "GRANDMOTHERS", "GRANDPARENTS", "GRASPING", 
		   "GRASS", "GRATITUDE", "GRAVES", "GREAT", "GREAT-AUNT", "GREAT-GRANDFATHER", "GREAT-GRANDPARENTS", 
		   "GREAT-UNCLE", "GREEN", "GREENS", "GREW", "GRISHAM", "GRISHAMS", "GROCERIES", "GROCERY", "GROUND", 
		   "GROUP", "GROW", "GROWING", "GROWN", "GROWN-UPS", "GUBERNATORIAL", "GUESS", "GULF", "GUSTO", "GUY", 
		   "GUYS", "HABITS", "HAD", "HADNT", "HALF", "HALL", "HAM", "HAMPSHIRE", "HAND", "HANDS", "HANDSOME", 
		   "HANGING", "HAPPENED", "HAPPY", "HARD", "HARDLY", "HARDWORKING", "HARRY", "HARSH", "HAS", "HAUNTS", 
		   "HAVE", "HE", "HEADED", "HEALTHY", "HEAR", "HEARING", "HEART", "HEARTACHE", "HEARTBREAK", "HED", 
		   "HELD", "HELP", "HER", "HERVEY", "HES", "HIGH", "HIGHER", "HIGHLIGHTING", "HIGHWAY", "HILLARY",
		   "HILLARYS", "HILLS", "HIM", "HIMIN", "HIMSELF", "HIRT", "HIS", "HOLDS", "HOLE", "HOLIDAY", "HOME", 
		   "HOMEMADE", "HOMETOWN", "HOOKS", "HOPE", "HOPES", "HOPING", "HORSE-DRAWN", "HOSPITAL", "HOST", "HOT", 
		   "HOTEL", "HOURS", "HOUSE", "HOUSES", "HOUSING", "HOW", "HOWEVER", "HUGE", "HUGGED", "HUMAN", 
		   "HUMILIATING", "HUMOR", "HUNDRED", "HUNG", "HUNGRY", "HUNTED", "HURRY", "HURT", "HURTING", "HUSBAND", 
		   "HUSH", "HYPOCRITES", "ICE", "ICEBOXES", "ICE-CREAM", "ICED", "ICEHOUSE", "ID", "IDEAL", "IDEALIZED", 
		   "IDENTIFIED", "IF", "III", "ILL", "IM", "IMMIGRANTS", "IMPACT", "IMPORTANT", "IN", "INCLUDED", 
		   "INCLUDING", "INCOME", "INCREASE", "INCREDIBLY", "INDIANA", "INDUSTRY", "INEVITABLE", "INFLUENCE", 
		   "INFLUENCED", "INFORMATION", "INFUSED", "INITIATIVES", "INSPIRED", "INSTEAD", "INSTINCT", 
		   "INSTRUCTIONS", "INTENSE", "INTERACTION", "INTERESTED", "INTERVALS", "INTERVIEW", "INTO", 
		   "INVASION", "INVESTIGATIVE", "INVITE", "INVITED", "INVOLVING", "IQ", "ITALY", "IVE", "JACKET", 
		   "JACKSONS", "JAMES", "JANE", "JANITORIAL", "JAR", "JAZZ", "JEEPS", "JEFFERSON", "JERSEY", 
		   "JINGLED", "JINGLING", "JOB", "JOBS", "JOE", "JOGGING", "JOHN", "JOKE", "JOKES", "JR", "JUDGE", 
		   "JUDGED", "JUDGMENTS", "JUDY", "JULIA", "JUNG", "JUST", "KANSAS", "KEEN", "KEEP", "KEEPS", 
		   "KEPT", "KICK", "KID", "KIDS", "KIDSSOMETIMES", "KIND", "KINDNESS", "KINFOLKS", "KITCHEN", 
		   "KNEES", "KNELT", "KNEW", "KNIFE", "KNOW", "KNOWLEDGE", "KNOWN", "LADIES", "LADY", "LANDED", 
		   "LANTERN", "LANTERNS", "LARGE", "LARGEST", "LAST", "LATE", "LATER", "LAUGH", "LAUGHTER", 
		   "LAW", "LAWN", "LAWYER", "LEARN", "LEARNED", "LEARNING", "LEAST", "LEATHER", "LEAVE", "LEAVING", 
		   "LED", "LEE", "LEFT", "LEFT-HAND", "LEG", "LEGENDARY", "LENGTH", "LEON", "LESS", "LESSTAPPED", 
		   "LET", "LETTER", "LEVEL", "LICENSE", "LIFE", "LIFEAND", "LIFETIME", "LIFETO", "LIGHT-COLORED", 
		   "LIGHTNING", "LIGHTS", "LIKE", "LIKED", "LIMA", "LIMITED", "LINE", "LINEN", "LISA", "LISTEN", 
		   "LIT", "LITTLE", "LIVE", "LIVED", "LIVES", "LIVING", "LOAD", "LOCAL", "LONG", "LONG-AGO", 
		   "LOOK", "LOOKED", "LOOKING", "LOOKS", "LORDED", "LOSING", "LOSS", "LOST", "LOT", "LOTS", 
		   "LOUISIANA", "LOUISIANAS", "LOUNGE", "LOVE", "LOVED", "LOVED:", "LOVELY", "LOVING", "LOWER", 
		   "LUCID", "LUNCH", "LUNG", "MADE", "MAGICAL", "MAGNETS", "MAIL", "MAIN", "MAKE", "MAKER", 
		   "MAKERS", "MAKES", "MAKING", "MALE", "MAMMAW", "MAMMAWS", "MAN", "MANBEE", "MANS", "MANUFACTURER", 
		   "MANY", "MARGINS", "MARRIAGE", "MARRIAGE?", "MARRIED", "MARY", "MASHED", "MASSIVE", "MATCHING", 
		   "MATERNAL", "MATTER", "MATTERED", "MAY", "MAYBE", "ME", "ME:", "MEAL", "MEALS", "MEALTIMES", 
		   "MEANING", "MEANS", "MEDICAL", "MEET", "MEETING", "MELON", "MELONS", "MEMBERS", "MEMORABILIA", 
		   "MEMORABLE", "MEMORIAL", "MEMORIES", "MEMORY", "MEN", "MET", "METROPOLIS", "MID-", "MIGHT", 
		   "MILDLY", "MILES", "MILL", "MIND", "MINE", "MINUTES", "MISHAPS", "MISPLACED", "MISSISSIPPI", 
		   "MISSOURI", "MISTS", "MODEST", "MOMENT", "MOMENTS", "MONEY", "MONTHS", "MORE", "MORNING", 
		   "MORTALITY", "MOST", "MOSTLY", "MOTHER", "MOTHERS", "MOTOR", "MOUNTAINS", "MOVE", "MOVED", 
		   "MOVIES", "MOVING", "MUCH", "MUSIC", "MUST", "MY", "MY-OH-MY", "MYRA", "MYSELF", "MYSTERIOUS", 
		   "NAME", "NAMED", "NAMES", "NARROW", "NATURE", "NEAR", "NEARLY", "NEAT", "NEEDED", "NEIGHBORHOOD", 
		   "NEIGHBORHOODS", "NETCONG", "NEVER", "NEVILLE", "NEW", "NEWS", "NEWSPAPERS", "NEXT", "NICER", 
		   "NICKEL", "NIGGER", "NIGHT", "NIGHTMARES", "NIGHTS", "NINE", "NINETY-ONE", "NINETY-THREE", 
		   "NO", "NOBODY", "NOMINATION", "NONE", "NORTH", "NORTHERN", "NOSHE", "NOT", "NOW", "NOW?", 
		   "NUMBER", "NURSE", "NURSING", "OBSERVATION", "OBSERVATIONS", "OBSESSIONS", "OBVIOUSLY", 
		   "OCCASIONAL", "OCCASIONALLY", "ODESSA", "OF", "OFF", "OFFICE", "OFTEN", "OHIO", "OLD", 
		   "OLDER", "OLLIE", "OLLIES", "ON", "ON:", "ONCE", "ONE", "ONES", "ONLY", "ONTO", "OPALWE", 
		   "OPEN", "OPENED", "OPPORTUNITY", "OR", "ORDINARY", "OREN", "ORENKNOWN", "ORLEANS", "OTHER", 
		   "OTIE", "OTIEWAS", "OUNCES", "OUR", "OURS", "OUT", "OUTFIT", "OUTSIDE", "OVER", "OVERHEAD", 
		   "OVER-THE-TOP", "OVERWHELMING", "OWED", "OWN", "OWNER", "PAID", "PAIN", "PAIR", "PALMER", 
		   "PALS", "PANTS", "PAPAW", "PAPER", "PAPERS", "PARENTS", "PARK", "PART", "PARTICULAR", "PARTY", 
		   "PATRICKS", "PEAS", "PECULIAR", "PEERING", "PEOPLE", "PEOPLES", "PERFECT", "PERHAPS", "PERIOD", 
		   "PERSON", "PERSONALITIES", "PETTIJOHN", "PHD", "PHONE", "PHOTO", "PICKED", "PICTURE", "PICTURES", 
		   "PIE", "PIECE", "PIECES", "PILES", "PINK", "PLACE", "PLACES", "PLAY", "PLAYED", "PLAYING", 
		   "PLOTS", "POCKETS", "POINT", "POLITICAL", "POLITICS", "POOL", "POOR", "POPULATION", "PORCH", 
		   "POSED", "POSSIBLE", "POST", "POTATOES", "POUNDS", "POURING", "POVERTY", "PRECIOUS", "PRECISE", 
		   "PREGNANT", "PREJUDICE", "PREPARE", "PRESERVATION", "PRESIDENCY", "PRESIDENT", "PRESS", 
		   "PRESTIGE", "PRETENDED", "PRETTY", "PRIDE", "PRIMARY", "PRIVATE", "PRIVATE-DUTY", "PRIZED", 
		   "PRO", "PROBABLY", "PROBLEM", "PROFESSOR", "PROTECTED", "PROVED", "PROVIDED", "PUBLISHED", 
		   "PULL", "PULLED", "PULLING", "PUMPING", "PUPPIES", "PUT", "QUAINT", "QUANTITIES", "QUARTER", 
		   "QUEEN", "QUIET", "QUIT", "QUITE", "RACE", "RACIAL", "RACIST", "RAGING", "RAIDED", "RAILROAD", 
		   "RAINY", "RAISED", "RAISING", "RAN", "RANDOLPH", "RARE", "RARELY", "RATTLE", "RAYBURN", 
		   "REACTION", "READ", "READERS", "READING", "REAL", "REALIZE", "REALLY", "REASON", "RECALL", 
		   "RECALLED", "RECEIVED", "RECEIVING", "RECLAIM", "RECORD", "RECOUNTING", "RED", "REELECTION", 
		   "REES", "REFRIGERATORS", "REGALING", "REGULAR", "REGULARS", "RELATIONSHIP", "RELATIVELY", 
		   "RELATIVES", "RELATIVES:", "REMEMBER", "REMEMBERED", "REMINDED", "REMOVED", "REPAIR", "REPAIRING", 
		   "REPEALED", "REPLY", "RESEMBLED", "RESPECTABLE", "RESPONSE", "RESTAURANTS", "RESTORE", "RETAINED", 
		   "RETIRED", "RETRIEVED", "RETURNED", "REVOLVED", "RHODES", "RIDE", "RIGHT", "RING", "RITUAL", 
		   "RITZENTHALER", "RIVER-ENRICHED", "ROAD", "ROAST", "ROCK", "RODEO", "ROOM", "ROSE", "ROUGH", 
		   "RUNNING", "RURAL", "RUSSELL", "SACRIFICE", "SAD", "SADLY", "SAID", "SALESMAN", "SALESMEN", 
		   "SAM", "SANDWICHES", "SANDY", "SANG", "SANK", "SANTA", "SAW", "SAWDUST", "SAWMILL", "SAXOPHONE", 
		   "SAY", "SAYS", "SCARED", "SCENE", "SCHOLARSHIP", "SCHOOL", "SCOTT", "SCRAP", "SEARCH", "SEASONS", 
		   "SECOND", "SEE", "SEEMED", "SEEMS", "SEEN", "SEGREGATED", "SEGREGATION", "SELF-CONSCIOUS", 
		   "SELFISHNESS", "SENSE", "SENT", "SENTENCE", "SEPARATELY", "SERVED", "SERVICE", "SET", "SETIT", 
		   "SETTLED", "SEVEN", "SEVENTEEN", "SEVERAL", "SHARON", "SHE", "SHELLING", "SHERIFF", "SHERMAN", 
		   "SHIELDED", "SHIRT", "SHOCK", "SHOE", "SHOP", "SHORT", "SHORTLY", "SHORT-SLEEVED", "SHOT", 
		   "SHOULD", "SHOVED", "SHOWING", "SHREVEPORT", "SHUT", "SHUTTLE", "SIDE", "SIDEWALK", "SIGHT", 
		   "SIGNED", "SIKESTON", "SIMPLE", "SINCE", "SINGING", "SINGLE", "SISTER", "SISTERS", "SIT", 
		   "SITTING", "SIX", "SIXTY", "SIX-YEAR-OLD", "SIZE", "SKEPTICAL", "SKETCH", "SKY", "SLAMMED", 
		   "SLEEP", "SLIDE", "SLIGHT", "SMALL", "SMALLER", "SMELLS", "SMILE", "SMILED", "SNAKE", "SNAKES", 
		   "SNAPSHOT", "SNICKERED", "SO", "SOCIAL", "SOCIALIZED", "SOIL", "SOLD", "SOLDIER", "SOLO", "SOME", 
		   "SOMEHOW", "SOMETHING", "SOMETIMES", "SOMEWHERE", "SON", "SORRY", "SORT", "SOUTH", "SOUTHERN", 
		   "SOUTHERNER", "SOUTHWEST", "SPACE", "SPECIAL", "SPECIALFOR", "SPEECH", "SPEND", "SPENDING", 
		   "SPENT", "SPINACH", "SPIRIT", "SPOT", "SPRINGS", "SQUARE", "ST", "STAFF", "STALKS", "STAMMERED",
		   "STAMPS", "STAND", "STARLIT", "STARTED", "STATES", "STATION", "STAYED", "STAYING", "STEPFATHER", 
		   "STEPS", "STICK", "STILL", "STOOD", "STOPPED", "STOPS", "STORE", "STORIES", "STORM", "STORY", 
		   "STORYOF", "STORYTELLER", "STORYTELLING", "STRAIGHT", "STRANGE", "STRAPPED", "STREET", "STREETS", 
		   "STRETCH", "STRIDE", "STRONG", "STRUCK", "STUDENT", "STUDENTS", "STUDY", "STUFFED", "SUBJECT", 
		   "SUBURB", "SUCCESS", "SUCCESSFUL", "SUCK", "SUDDENLY", "SUEDE", "SUGAR", "SUITE", "SUMMER", 
		   "SUPPER", "SUPPER)", "SUPPLEMENTED", "SUPPORTER", "SUPPORTERS", "SURE", "SURPRISED", 
		   "SURVIVAL", "SWAMPLAND", "SWEET", "SWEETER", "SWIM", "SYMPATHETIC", "TABLE", "TACKED", 
		   "TAKE", "TAKEN", "TAKING", "TALE", "TALK", "TALK:", "TALKED", "TALKING", "TALL", "TANKS", 
		   "TAR-COATED", "TAUGHT", "TAXES", "TEA", "TEARS", "TEETH", "TELEPHONE", "TELEVISION", "TELL", 
		   "TENOR", "TERRIFIC", "TEXARKANA", "TEXAS", "THAN", "THANK", "THANKED", "THANKS", "THAT", "THATS", 
		   "THE", "(THE", "THEIR", "THEIRS", "THEM", "THEN", "THERE", "THESE", "THEY", "THEYD", "THEYRE", 
		   "THINGS", "THINK", "THIRD", "THIRTY-THREE", "THIS", "THOSE", "THOUGH", "THOUGHT", "THOUSAND", 
		   "THREE", "THRIVING", "THROUGH", "THROWING", "THROWN", "THUMBING", "TIMBER", "TIMBERS", "TIME", 
		   "TIMES", "TIRADES", "TIRE", "TO", "TODAY", "TODDLER", "TOGETHER", "TOLD", "TOLEDO", "TONSILS", 
		   "TOO", "TOOK", "TORNADOES", "TOUCH", "TOUCHED", "TOWARD", "TOWN", "TOWNS", "TOYS", "TRACKS", 
		   "TRADEMARK", "TRAIN", "TRAINING", "TRAINS", "TREATED", "TRIED", "TRIP", "TRIPS", "TRI-STATE", 
		   "TRUCK", "TRUE", "TRUMAN", "TRUMPETER", "TRY", "TRYING", "TURNED", "TURNING", "TWELVE", 
		   "TWENTY-EIGHT", "TWENTY-FIVE", "TWENTY-ONE", "TWENTY-ONE-INCH", "TWENTY-THREE-YEAR-OLD", "TWICE", 
		   "TWO", "TWO-HOUR", "TYPICAL", "UMBERTO", "UNAWARE", "UNBELIEVABLE", "UNCLE", "UNDER", "UNDERAGE", 
		   "UNDERPASS", "UNDERSTAND", "UNDERSTANDING", "UNDERSTOOD", "UNEDUCATED", "UNIFORM", "UNITED", 
		   "UNPAID", "UNPAVED", "UNPOPULAR", "UNTIL", "UNUSUAL", "UP", "US", "USAIR", "USED", "USING", 
		   "USUALLY", "VACATION", "VACATIONS", "VACUUM", "VARIED", "VEGETABLES", "VERY", "VETS", "VICTORIES", 
		   "VICTORY", "VIEWS", "VINCE", "VINTAGE", "VIOLENT", "VIRTUAL", "VISIT", "VISITING", "VIVID", 
		   "VOICE", "VOICES", "VOLUMES", "VOTES", "WAGON", "WAITING", "WALK", "WALKED", "WANTED", "WAR", 
		   "WARD", "WAS", "WASH", "WASHBOARDS", "WASHINGTON", "WASHTUB", "WASNT", "WATCH", "WATCHING", 
		   "WATCHMAN", "WATER", "WATERLINE", "WATERMELON", "WATERMELONS", "WAVED", "WAY", "WE", "WEAK", 
		   "WEAKEST", "WEARING", "WEDDING", "WEEK", "WEEKEND", "WEEKS", "WEIGH", "WEIGHED", "WEIGHING", 
		   "WEIGHT", "WELFARE", "WELL", "WENT", "WERE", "WERENT", "WET", "WEVE", "WHAT", "WHATEVER", "WHEN", 
		   "WHERE", "WHETHER", "WHICH", "WHILE", "WHIPPING", "WHIPPINGS", "WHITE", "WHO", "WHOLE", "WHOM", 
		   "WHOSE", "WHY", "WIDOW", "WIDOWED", "WIFE", "WILLIAM", "WILSON", "WINDOW", "WISDOM", "WISE", 
		   "WISH", "WITH", "WITHOUT", "WITTY", "WOMAN", "WOMEN", "WON", "WONDER", "WONDERED", "WONT", 
		   "WOODEN", "WORK", "WORKED", "WORKING", "WORLD", "WORLDS", "WORST", "WOULD", "WOULDNT", "WRECK", 
		   "WRIGHT", "WRITTEN", "WROTE", "YALE", "YARD", "YEAH", "YEAR", "YEARS", "YEARTO", "YELLOW", 
		   "YESTERDAY", "YORK", "YOUNG", "YOUNGER", "YOUNGEST", "YOUR", "YOURE"};
	
}
