package com.example.quizy.domain;

import com.example.quizy.data.model.CategoryType;
import com.example.quizy.data.model.QuestionData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppController {
    private static AppController appController;
    private CategoryType selectCategory;
    private List<QuestionData> questionsList = new ArrayList<>();

    private AppController() {
    }

    public static AppController getInstance() {
        if (appController == null) {
            appController = new AppController();
        }
        return appController;
    }


    public void setSelectCategory(CategoryType categoryType) {
        this.selectCategory = categoryType;
        loadQuestions();
    }

    public List<QuestionData> getQuestionListByItsCategory() {
        Collections.shuffle(questionsList);
        List<QuestionData> shuffledQuestions = questionsList.subList(0, 15);
        return shuffledQuestions;
    }

    private void loadQuestions() {
        questionsList.clear();
        switch (selectCategory) {
            case JAVA: {
                questionsList.add(new QuestionData("What is the purpose of the 'assert' statement in Java?", "Perform runtime checks","Enforce coding standards", "Perform runtime checks", "Handle exceptions", "Print debug messages"));
                questionsList.add(new QuestionData("What is the purpose of the 'static' keyword in Java?", "Memory Allocation", "Class Level", "Runtime Polymorphism", "Dynamic Binding", "Class Level"));
                questionsList.add(new QuestionData("In Java, what is the default value of a byte variable?", "null", "1", "-1", "0", "0"));
                questionsList.add(new QuestionData("Which Java keyword is used to define a method that can be called on any object?", "new", "this", "super", "void", "this"));
                questionsList.add(new QuestionData("What is the return type of the 'main' method in Java?", "void", "int", "double", "String", "void"));
                questionsList.add(new QuestionData("What is the purpose of the 'break' statement in Java?", "Terminate Program", "Ends Loop Iteration", "Return from Method", "Pause Execution", "Ends Loop Iteration"));
                questionsList.add(new QuestionData("Which Java class is used for input and output operations?", "BufferedReader", "FileReader", "InputOutput", "Scanner", "Scanner"));
                questionsList.add(new QuestionData("What is the keyword used to declare a constant variable in Java?", "const", "static", "var", "final", "final"));
                questionsList.add(new QuestionData("In Java, what is the purpose of the 'super' keyword?", "Invoke Current Object", "Call Parent Class", "Access Subclass Members", "Reference Child Class", "Call Parent Class"));
                questionsList.add(new QuestionData("What data type is used to store characters in Java?", "int", "boolean", "float", "char", "char"));
                questionsList.add(new QuestionData("Which Java keyword is used to implement multiple inheritances?", "extends", "interface", "inherits", "implements", "implements"));
                questionsList.add(new QuestionData("What is the purpose of the 'instanceof' operator in Java?", "Type Conversion", "Object Instantiation", "Check Object Type", "Class Initialization", "Check Object Type"));
                questionsList.add(new QuestionData("In Java, what does the 'finally' block contain?", "Cleanup Code", "Exception Handling", "Loop Conditions", "Method Definitions", "Cleanup Code"));
                questionsList.add(new QuestionData("Which Java operator is used to compare object references?", "==", "!=", "<=", "equals()", "=="));
                questionsList.add(new QuestionData("What is the role of the 'toString' method in Java?", "Convert Object to String", "Convert String to Object", "Display Dialog Box", "Parse Integer Values", "Convert Object to String"));
                questionsList.add(new QuestionData("In Java, how is an interface different from a class?", "No Implementation", "No Inheritance", "No Fields", "No Polymorphism", "No Implementation"));
                questionsList.add(new QuestionData("What is the purpose of the 'throw' keyword in Java?", "Handle Exceptions", "Create Exceptions", "Terminate Program", "Generate Warnings", "Create Exceptions"));
                questionsList.add(new QuestionData("Which Java keyword is used to create an object?", "create", "new", "instance", "object", "new"));
                questionsList.add(new QuestionData("What is the purpose of the 'try' block in Java?", "Define Variables", "Handle Exceptions", "Declare Methods", "Execute Loops", "Handle Exceptions"));
                questionsList.add(new QuestionData("What does 'OOP' stand for in Java programming?", "Object-Oriented Programming", "Operator Overloading Principle", "Output Optimization Process", "Object Ordering Protocol", "Object-Oriented Programming"));
                questionsList.add(new QuestionData("Which method is called when an object is no longer referenced in Java?", "onDestroy()", "onStop()", "finalize()", "dispose()", "finalize()"));
                questionsList.add(new QuestionData("What is the difference between '==' and '.equals()' in Java for comparing objects?", "Reference comparison", "Value comparison", "Memory comparison", "Identity comparison", ".equals()"));
                questionsList.add(new QuestionData("In Java, what is the purpose of the 'static' block?", "Initialize instance variables", "Execute code when class is loaded", "Define constants", "Handle exceptions", "Execute code when class is loaded"));
                questionsList.add(new QuestionData("Which Java access modifier provides the widest accessibility?", "private", "default", "protected", "public", "public"));
                questionsList.add(new QuestionData("What is the significance of the 'volatile' keyword in Java?", "Prevents variable modification", "Enables thread-safe operations", "Ensures variable visibility", "Optimizes code execution", "Ensures variable visibility"));
                questionsList.add(new QuestionData("What is the role of the 'this' keyword in Java?", "Access superclass members", "Invoke a method", "Reference the current object", "Create a new instance", "Reference the current object"));
                questionsList.add(new QuestionData("In Java, what is the purpose of the 'transient' keyword?", "Allocate memory", "Prevent serialization", "Ensure thread safety", "Handle exceptions", "Prevent serialization"));
                questionsList.add(new QuestionData("Which Java collection class does not allow duplicate elements?", "HashSet", "ArrayList", "LinkedHashSet", "TreeSet", "HashSet"));
                questionsList.add(new QuestionData("What is the default implementation of the 'hashCode()' method in the Object class?", "Random number generation", "Memory address", "Object reference", "Sequential number", "Memory address"));
                questionsList.add(new QuestionData("In Java, what is the purpose of the 'package' keyword?", "Declare a package-private class", "Define a package", "Import a package", "Access a package-private variable", "Define a package"));
                questionsList.add(new QuestionData("Which design pattern is used for creating an object in a way that it can be cloned?", "Factory Method", "Singleton", "Prototype", "Abstract Factory", "Prototype"));
                questionsList.add(new QuestionData("What is the use of the 'assert' keyword in Java?", "Handle exceptions", "Terminate the program", "Perform assertions for debugging", "Define assertions in interfaces", "Perform assertions for debugging"));
                questionsList.add(new QuestionData("Which Java feature allows a class to have multiple methods with the same name but different parameters?", "Method overloading", "Method overriding", "Polymorphism", "Method shadowing", "Method overloading"));
                questionsList.add(new QuestionData("What is the purpose of the 'synchronized' keyword in Java?", "Thread-safe method execution", "Memory allocation", "Prevent method invocation", "Asynchronous programming", "Thread-safe method execution"));
                questionsList.add(new QuestionData("Which Java class is used to create a thread?", "Thread", "Runnable", "Process", "Executor", "Thread"));
                questionsList.add(new QuestionData("In Java, what is the purpose of the 'strictfp' keyword?", "Force strict type checking", "Enable floating-point precision", "Ensure thread safety", "Define a strict interface", "Enable floating-point precision"));
                questionsList.add(new QuestionData("Which Java interface is used for sorting and comparing objects?", "Sorter", "Comparable", "Comparator", "Sortable", "Comparator"));
                questionsList.add(new QuestionData("What is the purpose of the 'enum' keyword in Java?", "Define a constant variable", "Declare an enumerated type", "Access external libraries", "Implement an interface", "Declare an enumerated type"));
                questionsList.add(new QuestionData("Which Java collection class allows duplicate elements and preserves insertion order?", "HashSet", "TreeSet", "LinkedHashSet", "ArrayList", "LinkedHashSet"));
                questionsList.add(new QuestionData("Which Java keyword is used for method overriding?", "override", "extends", "implement", "super", "override"));
                questionsList.add(new QuestionData("In Java, what is the purpose of the 'strictfp' keyword?", "Force strict type checking", "Enable floating-point precision", "Ensure thread safety", "Define a strict interface", "Enable floating-point precision"));
                questionsList.add(new QuestionData("What is the role of the 'super' keyword in Java?", "Invoke the superclass constructor", "Access subclass members", "Create a new instance of a subclass", "Override superclass methods", "Invoke the superclass constructor"));
                questionsList.add(new QuestionData("Which Java class is used for reading character streams?", "FileReader", "BufferedReader", "InputStreamReader", "CharArrayReader", "BufferedReader"));
                questionsList.add(new QuestionData("What is the purpose of the 'instanceof' operator in Java?", "Check object type compatibility", "Create a new instance of a class", "Access instance variables", "Define instance methods", "Check object type compatibility"));
                questionsList.add(new QuestionData("Which Java keyword is used to implement multiple inheritances?", "extends", "interface", "inherits", "implements", "implements"));
                questionsList.add(new QuestionData("What is the purpose of the 'throw' keyword in Java?", "Handle Exceptions", "Create Exceptions", "Terminate Program", "Generate Warnings", "Create Exceptions"));
                questionsList.add(new QuestionData("Which Java keyword is used to create an object?", "create", "new", "instance", "object", "new"));
                questionsList.add(new QuestionData("What is the purpose of the 'try' block in Java?", "Define Variables", "Handle Exceptions", "Declare Methods", "Execute Loops", "Handle Exceptions"));
                questionsList.add(new QuestionData("What does 'OOP' stand for in Java programming?", "Object-Oriented Programming", "Operator Overloading Principle", "Output Optimization Process", "Object Ordering Protocol", "Object-Oriented Programming"));
                questionsList.add(new QuestionData("Which method is called when an object is no longer referenced in Java?", "onDestroy()", "onStop()", "finalize()", "dispose()", "finalize()"));


                break;
            }


            case ANDROID: {
                questionsList.add(new QuestionData("What does SDK stand for in Android development?", "Software Development Kit", "System Development Kit", "Source Code Kit", "Security Development Kit", "Software Development Kit"));
                questionsList.add(new QuestionData("Which file is responsible for storing key-value pairs in Android?", "Manifest.xml", "Layout.xml", "Strings.xml", "SharedPreferences", "SharedPreferences"));
                questionsList.add(new QuestionData("What is an 'APK' in the context of Android?", "Android Project Kit", "Application Package", "App Presentation Kit", "Android Programming Key", "Application Package"));
                questionsList.add(new QuestionData("In Android, what is the role of the 'Toast' class?", "Show Notifications", "Display Short Messages", "Handle Background Tasks", "Create Animations", "Display Short Messages"));
                questionsList.add(new QuestionData("Which component is responsible for managing the app's UI in Android?", "Service", "Broadcast Receiver", "Activity", "Content Provider", "Activity"));
                questionsList.add(new QuestionData("What is the purpose of the 'Intent' in Android?", "Start an Activity", "Store Data", "Display Images", "Handle Background Processes", "Start an Activity"));
                questionsList.add(new QuestionData("Which XML file is used to declare app permissions in Android?", "Layout.xml", "Manifest.xml", "Config.xml", "Settings.xml", "Manifest.xml"));
                questionsList.add(new QuestionData("What is the role of 'adb' in Android development?", "App Development Builder", "Android Debug Bridge", "Application Debugger", "Android Device Browser", "Android Debug Bridge"));
                questionsList.add(new QuestionData("What layout is often used for creating a user interface in Android?", "RelativeLayout", "GridLayout", "LinearLayout", "FrameLayout", "LinearLayout"));
                questionsList.add(new QuestionData("In Android, what is the primary purpose of the 'RecyclerView'?", "Display a Scrollable List", "Handle Touch Events", "Manage Fragments", "Play Videos", "Display a Scrollable List"));
                questionsList.add(new QuestionData("Which method is called when an Android activity is first created?", "onStart()", "onCreate()", "onResume()", "onCreateView()", "onCreate()"));
                questionsList.add(new QuestionData("What is the primary function of the 'AsyncTask' class in Android?", "Handle Background Tasks", "Display Images", "Manage Database Operations", "Play Audio Files", "Handle Background Tasks"));
                questionsList.add(new QuestionData("In Android, what does 'ADB' stand for?", "Android Debug Bridge", "Application Development Build", "Advanced Debugging", "App Distribution Bundle", "Android Debug Bridge"));
                questionsList.add(new QuestionData("Which class is the entry point for an Android app?", "MainActivity", "MainClass", "AppEntryPoint", "EntryPointActivity", "MainActivity"));
                questionsList.add(new QuestionData("What is the purpose of the 'Logcat' in Android?", "Display System Logs", "Debugging Messages", "Handle User Inputs", "Activity Logging", "Debugging Messages"));
                questionsList.add(new QuestionData("What is the role of the 'Context' in Android?", "Manage App Resources", "Handle User Inputs", "Control Background Services", "Run Background Threads", "Manage App Resources"));
                questionsList.add(new QuestionData("Which file is used to specify the dependencies in an Android project?", "Manifest.xml", "Build.gradle", "Settings.gradle", "Dependencies.xml", "Build.gradle"));
                questionsList.add(new QuestionData("What is the purpose of the 'View' in Android?", "Manage Data", "Display User Interface", "Handle Background Processes", "Run Background Threads", "Display User Interface"));
                questionsList.add(new QuestionData("Which method is used to initialize an Android Activity?", "onCreate()", "onStart()", "onResume()", "onInitialize()", "onCreate()"));
                questionsList.add(new QuestionData("Which method is used to initialize an Android Fragment?", "onCreateView()", "onStart()", "onResume()", "onInitialize()", "onCreateView()"));
                questionsList.add(new QuestionData("What is the purpose of the 'FragmentManager' in Android?", "Manage Fragments", "Display Images", "Handle Navigation", "Control Animations", "Manage Fragments"));
                questionsList.add(new QuestionData("In Android, what is the primary purpose of the 'ContentProvider'?", "Manage App Data", "Handle Background Tasks", "Display Images", "Create Animations", "Manage App Data"));
                questionsList.add(new QuestionData("Which component is used to perform background tasks in Android?", "Service", "Broadcast Receiver", "Content Provider", "Intent", "Service"));
                questionsList.add(new QuestionData("What is the purpose of the 'R class' in Android development?", "Resource Management", "Runtime Execution", "Reference Class", "RelativeLayout", "Resource Management"));
                questionsList.add(new QuestionData("Which layout is often used for creating a flexible user interface in Android?", "RelativeLayout", "GridLayout", "LinearLayout", "ConstraintLayout", "ConstraintLayout"));
                questionsList.add(new QuestionData("In Android, what is the purpose of the 'ViewModel' class?", "Manage UI-related Data", "Handle Database Operations", "Control Navigation", "Handle Animations", "Manage UI-related Data"));

                questionsList.add(new QuestionData("Which XML file is used to declare app permissions in Android?", "Manifest.xml", "Layout.xml", "Config.xml", "Settings.xml", "Manifest.xml"));
                questionsList.add(new QuestionData("What is the purpose of the 'adb' in Android development?", "Android Debug Bridge", "Application Debugger", "App Distribution Bundle", "Android Device Browser", "Android Debug Bridge"));
                questionsList.add(new QuestionData("Which class is responsible for managing the app's data in Android?", "DataManager", "DataHandler", "SQLiteOpenHelper", "SharedPreferences", "SQLiteOpenHelper"));
                questionsList.add(new QuestionData("What is the role of the 'IntentService' in Android?", "Handle Background Tasks", "Display Notifications", "Manage Fragments", "Play Audio Files", "Handle Background Tasks"));
                questionsList.add(new QuestionData("In Android, what does 'UI' stand for?", "User Interaction", "User Interface", "Unified Interaction", "Universal Interface", "User Interface"));
                questionsList.add(new QuestionData("Which file is used to specify the dependencies in an Android project?", "Manifest.xml", "Build.gradle", "Settings.gradle", "Dependencies.xml", "Build.gradle"));
                questionsList.add(new QuestionData("What is the primary purpose of the 'View' in Android?", "Manage Data", "Display User Interface", "Handle Background Processes", "Run Background Threads", "Display User Interface"));
                questionsList.add(new QuestionData("What is the role of the 'ContentResolver' in Android?", "Manage App Data", "Handle Background Tasks", "Handle Content Providers", "Display Notifications", "Handle Content Providers"));
                questionsList.add(new QuestionData("In Android, what is the purpose of the 'ViewGroup' class?", "Manage Child Views", "Display Images", "Handle Touch Events", "Create Animations", "Manage Child Views"));
                questionsList.add(new QuestionData("In Android, what is the role of the 'PackageManager'?", "Manage App Packages", "Handle Background Tasks", "Control Animations", "Manage UI Components", "Manage App Packages"));
                questionsList.add(new QuestionData("Which XML attribute is used to specify the layout width of a View in Android?", "android:width", "android:layout_width", "android:size", "android:layout_size", "android:layout_width"));
                questionsList.add(new QuestionData("What is the purpose of the 'PackageManager' in Android?", "Manage App Packages", "Handle Background Tasks", "Control Animations", "Manage UI Components", "Manage App Packages"));
                questionsList.add(new QuestionData("Which method is called when an Android activity is about to be destroyed?", "onPause()", "onStop()", "onDestroy()", "onFinish()", "onDestroy()"));
                questionsList.add(new QuestionData("In Android, what is the purpose of the 'ViewBinding' feature?", "Bind Views to Code", "Handle User Inputs", "Manage Fragments", "Control Navigation", "Bind Views to Code"));
                questionsList.add(new QuestionData("What is the purpose of the 'SavedStateHandle' in Android?", "Retain UI State", "Handle Background Tasks", "Display Notifications", "Manage Fragments", "Retain UI State"));
                questionsList.add(new QuestionData("Which method is used to create options menu in Android?", "onCreateOptionsMenu()", "onPrepareOptionsMenu()", "onOptionsItemSelected()", "onMenuCreated()", "onCreateOptionsMenu()"));
                questionsList.add(new QuestionData("What is the purpose of the 'HandlerThread' class in Android?", "Run Background Threads", "Handle UI Updates", "Control Animations", "Play Audio Files", "Run Background Threads"));
                questionsList.add(new QuestionData("In Android, what is the purpose of the 'ViewStub'?", "Lazy Loading of Views", "Display Notifications", "Handle Background Tasks", "Create Animations", "Lazy Loading of Views"));
                questionsList.add(new QuestionData("In Android, what is the primary purpose of the 'PackageManager'?", "Manage App Packages", "Handle Background Tasks", "Control Animations", "Manage UI Components", "Manage App Packages"));
                questionsList.add(new QuestionData("In Android, what does the 'adb' command 'logcat' display?", "System and Application Logs", "Device Hardware Information", "Network Activity", "User Inputs", "System and Application Logs"));

                questionsList.add(new QuestionData("What is the primary purpose of the 'VectorDrawable' in Android?", "Scalable Vector Graphics", "Bitmap Images", "Audio Playback", "Video Playback", "Scalable Vector Graphics"));
                questionsList.add(new QuestionData("In Android, what is the purpose of the 'NotificationManager' class?", "Manage Notifications", "Handle Background Tasks", "Control Animations", "Manage UI Components", "Manage Notifications"));
                questionsList.add(new QuestionData("What is the role of the 'TelephonyManager' in Android?", "Retrieve Telephony Information", "Handle Background Tasks", "Control Animations", "Play Audio Files", "Retrieve Telephony Information"));
                break;
            }

            case GEOGRAPHY: {
                questionsList.add(new QuestionData("Which country is known as the 'Land of the Rising Sun'?", "China", "Japan", "South Korea", "Vietnam", "Japan"));
                questionsList.add(new QuestionData("What is the world's largest ocean?", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean", "Pacific Ocean"));
                questionsList.add(new QuestionData("Which river is the longest in the world?", "Nile", "Amazon", "Ganges", "Mississippi", "Nile"));
                questionsList.add(new QuestionData("In which continent is the Sahara Desert located?", "Asia", "Africa", "South America", "Australia", "Africa"));
                questionsList.add(new QuestionData("What is the capital city of Canada?", "Toronto", "Vancouver", "Montreal", "Ottawa", "Ottawa"));
                questionsList.add(new QuestionData("Which country is known as the 'Land of Fire and Ice'?", "Iceland", "Greenland", "Canada", "Norway", "Iceland"));
                questionsList.add(new QuestionData("What is the largest island in the world?", "Greenland", "Australia", "Borneo", "Madagascar", "Greenland"));
                questionsList.add(new QuestionData("Which city is famous for its canals and gondolas?", "Venice", "Amsterdam", "Bruges", "Copenhagen", "Venice"));
                questionsList.add(new QuestionData("In which country would you find the Great Barrier Reef?", "Brazil", "Australia", "Philippines", "Mexico", "Australia"));
                questionsList.add(new QuestionData("What is the capital city of New Zealand?", "Wellington", "Auckland", "Christchurch", "Sydney", "Wellington"));
                questionsList.add(new QuestionData("Which ocean is the largest by size?", "Indian Ocean", "Arctic Ocean", "Atlantic Ocean", "Pacific Ocean", "Pacific Ocean"));
                questionsList.add(new QuestionData("Which river flows through Egypt?", "Nile", "Amazon", "Yangtze", "Danube", "Nile"));
                questionsList.add(new QuestionData("What is the smallest country in the world?", "Monaco", "Vatican City", "Nauru", "San Marino", "Vatican City"));
                questionsList.add(new QuestionData("Which African country is known as the 'Pearl of Africa'?", "Kenya", "Uganda", "Tanzania", "South Africa", "Uganda"));
                questionsList.add(new QuestionData("What is the tallest mountain in North America?", "Denali", "Mount McKinley", "Mount Logan", "Mount St. Elias", "Denali"));
                questionsList.add(new QuestionData("Which lake is the deepest in the world?", "Baikal", "Superior", "Victoria", "Huron", "Baikal"));
                questionsList.add(new QuestionData("In which country is the city of Marrakech located?", "Morocco", "Egypt", "Algeria", "Tunisia", "Morocco"));
                questionsList.add(new QuestionData("What is the capital city of South Korea?", "Seoul", "Tokyo", "Beijing", "Bangkok", "Seoul"));
                questionsList.add(new QuestionData("Which country is known as the 'Land of the Midnight Sun'?", "Norway", "Sweden", "Finland", "Russia", "Norway"));
                questionsList.add(new QuestionData("What is the world's second-largest continent by land area?", "Asia", "Africa", "North America", "South America", "Africa"));
                questionsList.add(new QuestionData("Which river is often referred to as the 'Cradle of Civilization'?", "Indus", "Tigris", "Euphrates", "Nile", "Euphrates"));
                questionsList.add(new QuestionData("What is the capital city of Argentina?", "Buenos Aires", "Santiago", "Lima", "Bogotá", "Buenos Aires"));
                questionsList.add(new QuestionData("Which country is known as the 'Land of a Thousand Lakes'?", "Finland", "Canada", "Sweden", "Norway", "Finland"));
                questionsList.add(new QuestionData("Which city is famous for its historic Acropolis?", "Athens", "Rome", "Istanbul", "Cairo", "Athens"));
                questionsList.add(new QuestionData("In which African country would you find Mount Kilimanjaro?", "Kenya", "Tanzania", "Uganda", "Rwanda", "Tanzania"));
                questionsList.add(new QuestionData("What is the capital city of Peru?", "Bogotá", "Quito", "Lima", "Caracas", "Lima"));
                questionsList.add(new QuestionData("Which ocean is the warmest?", "Indian Ocean", "Atlantic Ocean", "Southern Ocean", "Pacific Ocean", "Indian Ocean"));
                questionsList.add(new QuestionData("What is the largest desert in Asia?", "Gobi Desert", "Arabian Desert", "Karakum Desert", "Thar Desert", "Gobi Desert"));
                questionsList.add(new QuestionData("Which river is the longest in Europe?", "Volga River", "Danube River", "Loire River", "Thames River", "Volga River"));
                questionsList.add(new QuestionData("What is the capital city of Hungary?", "Prague", "Warsaw", "Budapest", "Vienna", "Budapest"));
                questionsList.add(new QuestionData("Which African country is known as the 'Land of a Thousand Hills'?", "Rwanda", "Uganda", "Burundi", "Tanzania", "Rwanda"));
                questionsList.add(new QuestionData("In which country would you find the city of Vladivostok?", "China", "Japan", "South Korea", "Russia", "Russia"));
                questionsList.add(new QuestionData("What is the capital city of Australia?", "Sydney", "Melbourne", "Canberra", "Brisbane", "Canberra"));
                questionsList.add(new QuestionData("Which country is known as the 'Land of the Thunder Dragon'?", "Bhutan", "Nepal", "Tibet", "Mongolia", "Bhutan"));
                questionsList.add(new QuestionData("What is the capital city of Saudi Arabia?", "Doha", "Riyadh", "Dubai", "Muscat", "Riyadh"));
                questionsList.add(new QuestionData("What is the capital city of Portugal?", "Lisbon", "Madrid", "Barcelona", "Rome", "Lisbon"));
                questionsList.add(new QuestionData("In which country is the city of Casablanca located?", "Morocco", "Egypt", "Algeria", "Tunisia", "Morocco"));
                questionsList.add(new QuestionData("What is the capital city of South Korea?", "Seoul", "Tokyo", "Beijing", "Bangkok", "Seoul"));
                questionsList.add(new QuestionData("Which country is known as the 'Land of the Rising Sun'?", "China", "Japan", "South Korea", "Vietnam", "Japan"));
                questionsList.add(new QuestionData("What is the world's largest ocean?", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean", "Pacific Ocean"));
                questionsList.add(new QuestionData("Which river is the longest in the world?", "Nile", "Amazon", "Ganges", "Mississippi", "Nile"));
                questionsList.add(new QuestionData("In which continent is the Sahara Desert located?", "Asia", "Africa", "South America", "Australia", "Africa"));
                questionsList.add(new QuestionData("What is the capital city of Canada?", "Toronto", "Vancouver", "Montreal", "Ottawa", "Ottawa"));
                questionsList.add(new QuestionData("Which mountain range is the highest in the world?", "Rocky Mountains", "Himalayas", "Andes", "Alps", "Himalayas"));
                questionsList.add(new QuestionData("Which country is known as the 'Land of Fire and Ice'?", "Iceland", "Greenland", "Canada", "Norway", "Iceland"));
                questionsList.add(new QuestionData("What is the largest island in the world?", "Greenland", "Australia", "Borneo", "Madagascar", "Greenland"));
                questionsList.add(new QuestionData("Which city is famous for its canals and gondolas?", "Venice", "Amsterdam", "Bruges", "Copenhagen", "Venice"));
                questionsList.add(new QuestionData("In which country would you find the Great Barrier Reef?", "Brazil", "Australia", "Philippines", "Mexico", "Australia"));
                questionsList.add(new QuestionData("What is the capital city of New Zealand?", "Wellington", "Auckland", "Christchurch", "Sydney", "Wellington"));
                questionsList.add(new QuestionData("Which ocean is the largest by size?", "Indian Ocean", "Arctic Ocean", "Atlantic Ocean", "Pacific Ocean", "Pacific Ocean"));
                break;
            }


            case HISTORY: {
                questionsList.add(new QuestionData("Who is known as the 'Father of Modern Physics'?", "Isaac Newton", "Albert Einstein", "Galileo Galilei", "Nikola Tesla", "Albert Einstein"));
                questionsList.add(new QuestionData("Which ancient Egyptian queen was known for her intelligence and political acumen?", "Nefertiti", "Cleopatra", "Hatshepsut", "Isis", "Hatshepsut"));
                questionsList.add(new QuestionData("Who was the legendary king of Uruk in Mesopotamian mythology?", "Gilgamesh", "Enkidu", "Hammurabi", "Nimrod", "Gilgamesh"));
                questionsList.add(new QuestionData("Which Chinese philosopher emphasized the concept of Yin and Yang?", "Laozi", "Confucius", "Sun Tzu", "Mencius", "Laozi"));
                questionsList.add(new QuestionData("Which ancient Greek philosopher is associated with the Socratic method of questioning?", "Socrates", "Plato", "Aristotle", "Homer", "Socrates"));
                questionsList.add(new QuestionData("Who was the first President of the United States to be impeached?", "Andrew Johnson", "Richard Nixon", "Bill Clinton", "Donald Trump", "Andrew Johnson"));
                questionsList.add(new QuestionData("Which ancient civilization built the city of Machu Picchu in the Andes Mountains?", "Maya", "Inca", "Aztec", "Olmec", "Inca"));
                questionsList.add(new QuestionData("Who was the iconic queen of ancient Carthage who led her people during the Punic Wars?", "Hannibal", "Dido", "Scipio Africanus", "Cato the Elder", "Dido"));
                questionsList.add(new QuestionData("Who was the Roman general and statesman responsible for the conquest of Gaul?", "Julius Caesar", "Augustus", "Hannibal", "Spartacus", "Julius Caesar"));
                questionsList.add(new QuestionData("Who was the ancient Greek philosopher credited with laying the groundwork for Western philosophy?", "Socrates", "Plato", "Aristotle", "Heraclitus", "Socrates"));
                questionsList.add(new QuestionData("Who wrote the famous play \"Romeo and Juliet\"?", "William Shakespeare", "Charles Dickens", "Jane Austen", "Mark Twain", "William Shakespeare"));
                questionsList.add(new QuestionData("In which year did the Titanic sink?", "1912", "1905", "1920", "1931", "1912"));
                questionsList.add(new QuestionData("Which planet is known as the \"Red Planet\"?", "Venus", "Mars", "Jupiter", "Saturn", "Mars"));
                questionsList.add(new QuestionData("Who painted the Mona Lisa?", "Vincent van Gogh", "Leonardo da Vinci", "Pablo Picasso", "Michelangelo", "Leonardo da Vinci"));
                questionsList.add(new QuestionData("What is the capital city of Japan?", "Seoul", "Beijing", "Tokyo", "Bangkok", "Tokyo"));
                questionsList.add(new QuestionData("Who wrote the novel \"To Kill a Mockingbird\"?", "J.K. Rowling", "Harper Lee", "Ernest Hemingway", "F. Scott Fitzgerald", "Harper Lee"));
                questionsList.add(new QuestionData("What is the largest mammal in the world?", "Elephant", "Blue Whale", "Giraffe", "Polar Bear", "Blue Whale"));
                questionsList.add(new QuestionData("Who is known as the \"Queen of Pop\"?", "Madonna", "Beyoncé", "Lady Gaga", "Rihanna", "Madonna"));
                questionsList.add(new QuestionData("Which planet is known as the \"Morning Star\" or \"Evening Star\"?", "Venus", "Mars", "Mercury", "Jupiter", "Venus"));
                questionsList.add(new QuestionData("What is the capital city of Australia?", "Sydney", "Melbourne", "Canberra", "Brisbane", "Canberra"));
                questionsList.add(new QuestionData("Who is the author of the Harry Potter series?", "J.R.R. Tolkien", "J.K. Rowling", "George R.R. Martin", "Suzanne Collins", "J.K. Rowling"));
                questionsList.add(new QuestionData("In which year did World War I begin?", "1914", "1917", "1919", "1921", "1914"));
                questionsList.add(new QuestionData("Which famous scientist developed the theory of general relativity?", "Isaac Newton", "Niels Bohr", "Albert Einstein", "Stephen Hawking", "Albert Einstein"));
                questionsList.add(new QuestionData("Who is known as the \"Father of Computer Science\"?", "Charles Babbage", "Ada Lovelace", "Alan Turing", "Bill Gates", "Alan Turing"));
                questionsList.add(new QuestionData("What is the currency of Japan?", "Yuan", "Won", "Yen", "Ringgit", "Yen"));
                questionsList.add(new QuestionData("Which famous artist is known for painting the Sistine Chapel ceiling?", "Vincent van Gogh", "Leonardo da Vinci", "Raphael", "Michelangelo", "Michelangelo"));
                questionsList.add(new QuestionData("Who discovered penicillin?", "Marie Curie", "Alexander Fleming", "Louis Pasteur", "Joseph Lister", "Alexander Fleming"));
                questionsList.add(new QuestionData("What is the largest ocean on Earth?", "Indian Ocean", "Atlantic Ocean", "Southern Ocean", "Pacific Ocean", "Pacific Ocean"));
                questionsList.add(new QuestionData("Which element has the chemical symbol \"O\"?", "Oxygen", "Osmium", "Ozone", "Opium", "Oxygen"));
                questionsList.add(new QuestionData("Who wrote the play \"Hamlet\"?", "William Shakespeare", "Anton Chekhov", "George Bernard Shaw", "Samuel Beckett", "William Shakespeare"));
                questionsList.add(new QuestionData("In which country did the Renaissance begin?", "France", "England", "Italy", "Germany", "Italy"));
                questionsList.add(new QuestionData("What is the capital city of Canada?", "Toronto", "Ottawa", "Vancouver", "Montreal", "Ottawa"));
                questionsList.add(new QuestionData("Who was the first woman to fly solo across the Atlantic Ocean?", "Beryl Markham", "Amelia Earhart", "Jacqueline Cochran", "Valentina Tereshkova", "Amelia Earhart"));
                questionsList.add(new QuestionData("What is the largest desert in the world?", "Sahara Desert", "Arabian Desert", "Gobi Desert", "Antarctica", "Antarctica"));
                questionsList.add(new QuestionData("Who is the Greek god of the sea?", "Zeus", "Hades", "Poseidon", "Apollo", "Poseidon"));
                questionsList.add(new QuestionData("What is the capital city of Brazil?", "Rio de Janeiro", "Sao Paulo", "Brasilia", "Salvador", "Brasilia"));
                questionsList.add(new QuestionData("Who painted the Starry Night?", "Vincent van Gogh", "Pablo Picasso", "Claude Monet", "Edvard Munch", "Vincent van Gogh"));
                questionsList.add(new QuestionData("Which famous scientist formulated the laws of motion and universal gravitation?", "Isaac Newton", "Galileo Galilei", "Johannes Kepler", "Nicolaus Copernicus", "Isaac Newton"));
                questionsList.add(new QuestionData("In which year did the Berlin Wall fall, leading to the reunification of Germany?", "1985", "1987", "1989", "1991", "1989"));
                questionsList.add(new QuestionData("Who wrote the play \"Macbeth\"?", "William Shakespeare", "Christopher Marlowe", "John Milton", "George Bernard Shaw", "William Shakespeare"));
                questionsList.add(new QuestionData("What is the currency of China?", "Won", "Yuan", "Yen", "Ringgit", "Yuan"));
                questionsList.add(new QuestionData("Who is known as the \"Father of Psychology\"?", "Sigmund Freud", "Ivan Pavlov", "John Watson", "B.F. Skinner", "Sigmund Freud"));
                questionsList.add(new QuestionData("What is the largest river in the world by discharge?", "Amazon River", "Nile River", "Yangtze River", "Mississippi River", "Amazon River"));
                questionsList.add(new QuestionData("Who wrote the famous novel \"1984\"?", "George Orwell", "Aldous Huxley", "Ray Bradbury", "J.K. Rowling", "George Orwell"));
                questionsList.add(new QuestionData("Which mountain is the tallest in the world?", "K2", "Mount Everest", "Kangchenjunga", "Lhotse", "Mount Everest"));
                questionsList.add(new QuestionData("Which African leader played a crucial role in ending apartheid in South Africa?", "Nelson Mandela", "Desmond Tutu", "Steve Biko", "Thabo Mbeki", "Nelson Mandela"));
                questionsList.add(new QuestionData("Who was the first President of the United States to be impeached?", "Andrew Johnson", "Richard Nixon", "Bill Clinton", "Donald Trump", "Andrew Johnson"));
                questionsList.add(new QuestionData("Which ancient civilization built the city of Machu Picchu in the Andes Mountains?", "Maya", "Inca", "Aztec", "Olmec", "Inca"));
                questionsList.add(new QuestionData("Who was the iconic queen of ancient Carthage who led her people during the Punic Wars?", "Hannibal", "Dido", "Scipio Africanus", "Cato the Elder", "Dido"));
                questionsList.add(new QuestionData("Which Indian leader is known for his philosophy of nonviolent resistance?", "Jawaharlal Nehru", "Subhas Chandra Bose", "Sardar Patel", "Mahatma Gandhi", "Mahatma Gandhi"));
                break;
            }


        }
    }
}
