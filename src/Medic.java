public class Medic extends Hero implements HavingSuperAbility {
    private double healPoints;
    public void increaseExperience () {
        healPoints = healPoints * (1.1);
        System.out.println("Medic увличил опыт лечения на 10%");
    }


    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил способность ЛЕЧИТЬ");
    }



}


