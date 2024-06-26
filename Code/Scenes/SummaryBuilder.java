package Scenes;


import java.lang.reflect.InvocationTargetException;

public class SummaryBuilder {
    private static SummaryBuilder instance = new SummaryBuilder(); // Singleton instance
    public static int instanceCount = 0;

    private Integer[] abilities;
    private Integer[] updateAbilities;
    private String race;
    private String subrace;
    private String characterClass;
    private String subclass;
    private String name;
    private String background;
    private String skillsAndProficiencies1;
    private String skillsAndProficiencies2;
    private String hair;
    private String skin;
    private String eyes;
    private String height;
    private String weight;
    private String age;
    private String gender;
    private String backgroundText;
    private int acrobaticsBonus;
    private int animalHandlingBonus;
    private int arcanaBonus;
    private int athleticsBonus;
    private int deceptionBonus;
    private int insightBonus;
    private int intimidationBonus;
    private int investigationBonus;
    private int medicineBonus;
    private int natureBonus;
    private int perceptionBonus;
    private int performanceBonus;
    private int persuasionBonus;
    private int religionBonus;
    private int sleightOfHandBonus;
    private int stealthBonus;
    private int survivalBonus;
    private int historyBonus;
    private int armorAmount;
    private int healthAmount;
    private int strThrow;
    private int dexThrow;
    private int conThrow;
    private int intThrow;
    private int wisThrow;
    private int chaThrow;
    private String equipment;
    private String spells;
    private String notes;
    private String cursor;
    private double volume;

    // Private constructor to prevent external instantiation
    private SummaryBuilder()
    {
        // You can initialize default values here if needed
        cursor = "/src/sword.png";
        volume = 0.15;
    }
    public Memento createMemento(String desp)
    {
        return new Memento();
    }
    public void setMemento(Memento m)
    {

    }
    public Summary build() throws Exception {
        return new Summary();
    }
    public static SummaryBuilder getInstance()
    {
        if (instanceCount < 1)
        {
            instance = new SummaryBuilder(); //eventually use build() here
            instanceCount++;
        }
        return instance;
    }

    // Getter and Setter methods for each variable

    public String getRace() 
    {
        return race;
    }

    public void setRace(String race) 
    {
        this.race = race;
    }

    public String getSubrace() 
    {
        return subrace;
    }

    public void setSubrace(String subrace) 
    {
        this.subrace = subrace;
    }

    public String getCharacterClass() 
    {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) 
    {
        this.characterClass = characterClass;
    }

    public String getSubclass() 
    {
        return subclass;
    }

    public void setSubclass(String subclass) 
    {
        this.subclass = subclass;
    }

    public Integer[] getAbilities() 
    {
        return abilities;
    }

    public void setAbilities(Integer[] abilities) 
    {
        this.abilities = abilities;
    }

    public Integer[] getUpdateAbilities() 
    {
        return updateAbilities;
    }

    public void setUpdateAbilities(Integer[] updateAbilities) 
    {
        this.updateAbilities = updateAbilities;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
        System.out.println("The name is " + this.name);
    }

    public String getBackground() 
    {
        return background;
    }

    public void setBackground(String background) 
    {
        this.background = background;
    }

    public String getSkillsAndProficiencies1() 
    {
        return skillsAndProficiencies1;
    }

    public void setSkillsAndProficiencies1(String skillsAndProficiencies1) 
    {
        this.skillsAndProficiencies1 = skillsAndProficiencies1;
    }

    public String getSkillsAndProficiencies2() 
    {
        return skillsAndProficiencies2;
    }

    public void setSkillsAndProficiencies2(String skillsAndProficiencies2) 
    {
        this.skillsAndProficiencies2 = skillsAndProficiencies2;
    }

    public String getHair() 
    {
        return hair;
    }

    public void setHair(String hair) 
    {
        this.hair = hair;
    }

    public String getSkin() 
    {
        return skin;
    }

    public void setSkin(String skin) 
    {
        this.skin = skin;
    }

    public String getEyes() 
    {
        return eyes;
    }

    public void setEyes(String eyes) 
    {
        this.eyes = eyes;
    }

    public String getHeight() 
    {
        return height;
    }

    public void setHeight(String height) 
    {
        this.height = height;
    }

    public String getWeight() 
    {
        return weight;
    }

    public void setWeight(String weight) 
    {
        this.weight = weight;
    }

    public String getAge()
    {
        return age;
    }

    public void setAge(String age) 
    {
        this.age = age;
    }

    public String getGender() 
    {
        return gender;
    }

    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getEquipment()
    {
        return equipment;
    }

    public void setEquipment(String equipment)
    {
        this.equipment = equipment;
    }
    public String getSpells()
    {
        return spells;
    }

    public void setSpells(String spells)
    {
        this.spells = spells;
    }

    public int getAcrobaticsBonus() {
        return acrobaticsBonus;
    }
    
    public void setAcrobaticsBonus(int acrobaticsBonus) {
        this.acrobaticsBonus = acrobaticsBonus;
    }
    
    public int getAnimalHandlingBonus() {
        return animalHandlingBonus;
    }
    
    public void setAnimalHandlingBonus(int animalHandlingBonus) {
        this.animalHandlingBonus = animalHandlingBonus;
    }
    
    public int getArcanaBonus() {
        return arcanaBonus;
    }
    
    public void setArcanaBonus(int arcanaBonus) {
        this.arcanaBonus = arcanaBonus;
    }
    
    public int getAthleticsBonus() {
        return athleticsBonus;
    }
    
    public void setAthleticsBonus(int athleticsBonus) {
        this.athleticsBonus = athleticsBonus;
    }
    
    public int getDeceptionBonus() {
        return deceptionBonus;
    }
    
    public void setDeceptionBonus(int deceptionBonus) {
        this.deceptionBonus = deceptionBonus;
    }
    
    public int getInsightBonus() {
        return insightBonus;
    }
    
    public void setInsightBonus(int insightBonus) {
        this.insightBonus = insightBonus;
    }
    
    public int getIntimidationBonus() {
        return intimidationBonus;
    }
    
    public void setIntimidationBonus(int intimidationBonus) {
        this.intimidationBonus = intimidationBonus;
    }
    
    public int getInvestigationBonus() {
        return investigationBonus;
    }
    
    public void setInvestigationBonus(int investigationBonus) {
        this.investigationBonus = investigationBonus;
    }
    
    public int getMedicineBonus() {
        return medicineBonus;
    }
    
    public void setMedicineBonus(int medicineBonus) {
        this.medicineBonus = medicineBonus;
    }
    
    public int getNatureBonus() {
        return natureBonus;
    }
    
    public void setNatureBonus(int natureBonus) {
        this.natureBonus = natureBonus;
    }
    
    public int getPerceptionBonus() {
        return perceptionBonus;
    }
    
    public void setPerceptionBonus(int perceptionBonus) {
        this.perceptionBonus = perceptionBonus;
    }
    
    public int getPerformanceBonus() {
        return performanceBonus;
    }
    
    public void setPerformanceBonus(int performanceBonus) {
        this.performanceBonus = performanceBonus;
    }
    
    public int getPersuasionBonus() {
        return persuasionBonus;
    }
    
    public void setPersuasionBonus(int persuasionBonus) {
        this.persuasionBonus = persuasionBonus;
    }
    
    public int getReligionBonus() {
        return religionBonus;
    }
    
    public void setReligionBonus(int religionBonus) {
        this.religionBonus = religionBonus;
    }
    
    public int getSleightOfHandBonus() {
        return sleightOfHandBonus;
    }
    
    public void setSleightOfHandBonus(int sleightOfHandBonus) {
        this.sleightOfHandBonus = sleightOfHandBonus;
    }
    
    public int getStealthBonus() {
        return stealthBonus;
    }
    
    public void setStealthBonus(int stealthBonus) {
        this.stealthBonus = stealthBonus;
    }
    
    public int getSurvivalBonus() {
        return survivalBonus;
    }
    
    public void setSurvivalBonus(int survivalBonus) {
        this.survivalBonus = survivalBonus;
    }
    
    public int getHistoryBonus() {
        return historyBonus;
    }
    
    public void setHistoryBonus(int historyBonus) {
        this.historyBonus = historyBonus;
    }

    public int getArmorAmount() {
        return armorAmount;
    }
    
    public void setArmorAmount(int armorAmount) {
        this.armorAmount = armorAmount;
    }

    public int getHealthAmount() {
        return healthAmount;
    }
    
    public void setHealthAmount(int healthAmount) {
        this.healthAmount = healthAmount;
    }

    public String getbackgroundText() {
        return backgroundText;
    }
    
    public void setBackgroundText(String backgroundText) {
        this.backgroundText = backgroundText;
    }

    public String getNotes(){return notes;}
    public void setNotes(String notes) {this.notes = notes;}
    public int getStrThrow() {
        return strThrow;
    }

    public void setStrThrow(int strThrow) {
        this.strThrow = strThrow;
    }

    public int getDexThrow() {
        return dexThrow;
    }
    
    public void setDexThrow(int dexThrow) {
        this.dexThrow = dexThrow;
    }

    public int getConThrow() {
        return conThrow;
    }
    
    public void setConThrow(int conThrow) {
        this.conThrow = conThrow;
    }

    public int getIntThrow() {
        return intThrow;
    }

    public void setIntThrow(int intThrow) {
        this.intThrow = intThrow;
    }
    
    public int getChaThrow() {
        return chaThrow;
    }
    
    public void setChaThrow(int chaThrow) {
        this.chaThrow = chaThrow;
    }

    public int getWisThrow() {
        return wisThrow;
    }

    public void setWisThrow(int wisThrow) {
        this.wisThrow = wisThrow;
    }

    public String getCursor() {
        return cursor;
    }
    
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

}