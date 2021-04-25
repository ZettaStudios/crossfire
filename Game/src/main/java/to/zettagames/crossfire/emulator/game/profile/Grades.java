package to.zettagames.crossfire.emulator.game.profile;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum Grades {

    UNKNOWN((byte) -1, "Unknown", -1),

    //<editor-fold desc="SOLDIERS">
    TRAINEE_1((byte) 0, "Trainee 1", 0),
    TRAINEE_2((byte) 1, "Trainee 2", 457),
    PRIVATE((byte) 2, "Private", 913),

    PFC((byte) 3, "Private First Class", 1825),

    CORPORAL((byte) 4, "Corporal", 3193),
    SERGEANT_1((byte) 5, "Sergeant 1", 5017),
    SERGEANT_2((byte) 6, "Sergeant 2", 7297),
    SERGEANT_3((byte) 7, "Sergeant 3", 10033),
    SERGEANT_4((byte) 8, "Sergeant 4", 13225),
    //</editor-fold>

    //<editor-fold desc="PETTY OFFICER">
    STAFF_SERGEANT_1((byte) 9, "Staff Sergeant 1", 17785),
    STAFF_SERGEANT_2((byte) 10, "Staff Sergeant 2", 23941),
    STAFF_SERGEANT_3((byte) 11, "Staff Sergeant 3", 33061),
    STAFF_SERGEANT_4((byte) 12, "Staff Sergeant 4", 43093),
    STAFF_SERGEANT_5((byte) 13, "Staff Sergeant 5", 54037),
    STAFF_SERGEANT_6((byte) 14, "Staff Sergeant 6", 65893),
    SFC_1((byte) 15, "Sergeant First Class 1", 78661),
    SFC_2((byte) 16, "Sergeant First Class 2", 92341),
    SFC_3((byte) 17, "Sergeant First Class 3", 106933),
    SFC_4((byte) 18, "Sergeant First Class 4", 122437),
    SFC_5((byte) 19, "Sergeant First Class 5", 138853),
    SFC_6((byte) 20, "Sergeant First Class 6", 156181),
    MASTER_SERGEANT_1((byte) 21, "Master Sergeant 1", 174421),
    MASTER_SERGEANT_2((byte) 22, "Master Sergeant 2", 193573),
    MASTER_SERGEANT_3((byte) 23, "Master Sergeant 3", 213637),
    MASTER_SERGEANT_4((byte) 24, "Master Sergeant 4", 234613),
    MASTER_SERGEANT_5((byte) 25, "Master Sergeant 5", 256501),
    MASTER_SERGEANT_6((byte) 26, "Master Sergeant 6", 279301),
    //</editor-fold>

    //<editor-fold desc="COMPANY OFFICER">
    SECOND_LIEUTENANT_1((byte) 27, "Second Lieutenant 1", 326725),
    SECOND_LIEUTENANT_2((byte) 28, "Second Lieutenant 2", 375973),
    SECOND_LIEUTENANT_3((byte) 29, "Second Lieutenant 3", 427045),
    SECOND_LIEUTENANT_4((byte) 30, "Second Lieutenant 4", 479941),
    SECOND_LIEUTENANT_5((byte) 31, "Second Lieutenant 5", 534661),
    SECOND_LIEUTENANT_6((byte) 32, "Second Lieutenant 6", 591205),
    SECOND_LIEUTENANT_7((byte) 33, "Second Lieutenant 7", 649573),
    SECOND_LIEUTENANT_8((byte) 34, "Second Lieutenant 8", 709765),
    FIRST_LIEUTENANT_1((byte) 35, "First Lieutenant 1", 771781),
    FIRST_LIEUTENANT_2((byte) 36, "First Lieutenant 2", 835621),
    FIRST_LIEUTENANT_3((byte) 37, "First Lieutenant 3", 901285),
    FIRST_LIEUTENANT_4((byte) 38, "First Lieutenant 4", 968773),
    FIRST_LIEUTENANT_5((byte) 39, "First Lieutenant 5", 1038085),
    FIRST_LIEUTENANT_6((byte) 40, "First Lieutenant 6", 1109221),
    FIRST_LIEUTENANT_7((byte) 41, "First Lieutenant 7", 1182181),
    FIRST_LIEUTENANT_8((byte) 42, "First Lieutenant 8", 1256965),
    CAPTAIN_1((byte) 43, "Captain 1", 1333573),
    CAPTAIN_2((byte) 44, "Captain 2", 1412005),
    CAPTAIN_3((byte) 45, "Captain 3", 1492261),
    CAPTAIN_4((byte) 46, "Captain 4", 1574341),
    CAPTAIN_5((byte) 47, "Captain 5", 1658245),
    CAPTAIN_6((byte) 48, "Captain 6", 1743973),
    CAPTAIN_7((byte) 49, "Captain 7", 1831525),
    CAPTAIN_8((byte) 50, "Captain 8", 1920901),
    //</editor-fold>

    //<editor-fold desc="FIELD OFFICER">
    MAJOR_1((byte) 51, "Major 1", 2057701),
    MAJOR_2((byte) 52, "Major 2", 2107237),
    MAJOR_3((byte) 53, "Major 3", 2339509),
    MAJOR_4((byte) 54, "Major 4", 2484517),
    MAJOR_5((byte) 55, "Major 5", 2632261),
    MAJOR_6((byte) 56, "Major 6", 2782741),
    MAJOR_7((byte) 57, "Major 7", 2935957),
    MAJOR_8((byte) 58, "Major 8", 3091909),
    LIEUTENANT_COLONEL_1((byte) 59, "Lieutenant Colonel 1", 3277045),
    LIEUTENANT_COLONEL_2((byte) 60, "Lieutenant Colonel 2", 3465373),
    LIEUTENANT_COLONEL_3((byte) 61, "Lieutenant Colonel 3", 3673537),
    LIEUTENANT_COLONEL_4((byte) 62, "Lieutenant Colonel 4", 3885178),
    LIEUTENANT_COLONEL_5((byte) 63, "Lieutenant Colonel 5", 4100296),
    LIEUTENANT_COLONEL_6((byte) 64, "Lieutenant Colonel 6", 4318891),
    LIEUTENANT_COLONEL_7((byte) 65, "Lieutenant Colonel 7", 4540963),
    LIEUTENANT_COLONEL_8((byte) 66, "Lieutenant Colonel 8", 4766512),
    COLONEL_1((byte) 67, "Colonel 1", 5028199),
    COLONEL_2((byte) 68, "Colonel 2", 5319184),
    COLONEL_3((byte) 69, "Colonel 3", 5614501),
    COLONEL_4((byte) 70, "Colonel 4", 5914150),
    COLONEL_5((byte) 71, "Colonel 5", 6218131),
    COLONEL_6((byte) 72, "Colonel 6", 6526501),
    COLONEL_7((byte) 73, "Colonel 7", 6839203),
    COLONEL_8((byte) 74, "Colonel 8", 7156237),
    //</editor-fold>

    //<editor-fold desc="GENERAL">
    BRIGADIER_GENERAL_1((byte) 75, "Brigadier General 1", 7578037),
    BRIGADIER_GENERAL_2((byte) 76, "Brigadier General 2", 8026912),
    BRIGADIER_GENERAL_3((byte) 77, "Brigadier General 3", 8481772),
    BRIGADIER_GENERAL_4((byte) 78, "Brigadier General 4", 8964562),
    BRIGADIER_GENERAL_5((byte) 79, "Brigadier General 5", 9475852),
    BRIGADIER_GENERAL_6((byte) 80, "Brigadier General 6", 10016212),
    MAJOR_GENERAL_1((byte) 81, "Major General 1", 10586212),
    MAJOR_GENERAL_2((byte) 82, "Major General 2", 11186422),
    MAJOR_GENERAL_3((byte) 83, "Major General 3", 11817412),
    MAJOR_GENERAL_4((byte) 84, "Major General 4", 12479752),
    MAJOR_GENERAL_5((byte) 85, "Major General 5", 13174012),
    MAJOR_GENERAL_6((byte) 86, "Major General 6", 13900762),
    LIEUTENANT_GENERAL_1((byte) 87, "Lieutenant General 1", 14660572),
    LIEUTENANT_GENERAL_2((byte) 88, "Lieutenant General 2", 15454012),
    LIEUTENANT_GENERAL_3((byte) 89, "Lieutenant General 3", 16281652),
    LIEUTENANT_GENERAL_4((byte) 90, "Lieutenant General 4", 17144062),
    LIEUTENANT_GENERAL_5((byte) 91, "Lieutenant General 5", 18041812),
    LIEUTENANT_GENERAL_6((byte) 92, "Lieutenant General 6", 18975472),
    GENERAL_1((byte) 93, "General 1", 19945612),
    GENERAL_2((byte) 94, "General 2", 20952802),
    GENERAL_3((byte) 95, "General 3", 21997612),
    GENERAL_4((byte) 96, "General 4", 23080612),
    GENERAL_5((byte) 97, "General 5", 24202372),
    GENERAL_6((byte) 98, "General 6", 25363462),
    MARSHALL((byte) 99, "Marshall", 26564452),
    GRAND_MARSHALL((byte) 100, "Grand Marshall", 100000000);
    //</editor-fold>

    private final byte id;
    private final String name;
    private final int experience;

    public static Grades getGradeById(byte id) {
        return Arrays.stream(values()).filter(grade -> grade.id == id).findFirst().orElse(UNKNOWN);
    }

    public static Grades getGradeByExp(int experience) {
        return Arrays.stream(values()).filter(grade -> grade.experience > experience).findFirst().orElse(UNKNOWN);
    }

}
