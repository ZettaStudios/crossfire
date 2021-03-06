package to.zettagames.crossfire.emulator.game.weapon;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum Weapons {

    UNKNOWN((byte) -1, "Unknown", WeaponType.UNKNOWN),
    AK47((byte) 1, "AK47", WeaponType.RIFLE),
    AK74((byte) 2, "AK74", WeaponType.RIFLE),
    M4A1((byte) 3, "M4A1", WeaponType.RIFLE),
    STEYR_AUG_A1((byte) 4, "Steyr AUG A1", WeaponType.RIFLE),
    M16((byte) 5, "M16", WeaponType.RIFLE),
    K2((byte) 6, "K2", WeaponType.RIFLE),
    MP5((byte) 7, "MP5", WeaponType.SMG),
    MINI_UZI((byte) 8, "Mini Uzi", WeaponType.SMG),
    M700((byte) 9, "M700", WeaponType.SNIPER_RIFLE),
    AWM((byte) 10, "AWM", WeaponType.SNIPER_RIFLE),
    M60((byte) 11, "M60", WeaponType.MACHINE_GUN),
    XM_1014((byte) 12, "XM1014", WeaponType.SHOTGUN),
    BERETTA_M9((byte) 13, "Beretta M9", WeaponType.PISTOL),
    P228((byte) 14, "P228", WeaponType.PISTOL),
    GRENADE((byte) 15, "Grenade", WeaponType.GRENADE),
    SMOKE_GRENADE((byte) 16, "Smoke Grenade", WeaponType.GRENADE),
    KNIFE((byte) 17, "Knife", WeaponType.KNIFE),
    FAMAS((byte) 18, "Famas", WeaponType.RIFLE),
    SCAR_HEAVY((byte) 19, "Scar Heavy", WeaponType.RIFLE),
    SG552((byte) 20, "SG552", WeaponType.RIFLE),
    WINCHESTER((byte) 21, "Winchester", WeaponType.RIFLE),
    XM8((byte) 22, "XM8", WeaponType.RIFLE),
    QBZ_95((byte) 23, "QBZ-95", WeaponType.RIFLE),
    MP7((byte) 24, "MP7", WeaponType.SMG),
    K1A((byte) 25, "K1A", WeaponType.SMG),
    P90((byte) 26, "P90", WeaponType.SMG),
    DRAGUNOV((byte) 27, "Dragunov", WeaponType.SNIPER_RIFLE),
    RPK((byte) 28, "RPK", WeaponType.MACHINE_GUN),
    SPAS_12((byte) 29, "SPAS-12", WeaponType.SHOTGUN),
    DESERT_EAGLE((byte) 30, "Desert Eagle", WeaponType.PISTOL),
    COLT_1911((byte) 31, "Colt 1911", WeaponType.PISTOL),
    GLOCK_18((byte) 32, "Glock-18", WeaponType.PISTOL),
    RED_SMOKE_GRENADE((byte) 33, "Red Smoke Grenade", WeaponType.GRENADE),
    SCAR_LIGHT((byte) 34, "Scar Light", WeaponType.RIFLE),
    G36K((byte) 35, "G36K", WeaponType.RIFLE),
    TYPE_89((byte) 36, "Type 89", WeaponType.RIFLE),
    AK47_KNIFE((byte) 37, "AK47 - Knife", WeaponType.RIFLE),
    M4A1_ADV((byte) 38, "M4A1 Advanced", WeaponType.RIFLE),
    AKS_74U((byte) 39, "AKS-74U", WeaponType.RIFLE),
    MICRO_GALIL((byte) 40, "Micro Galil", WeaponType.SMG),
    MP5_ADV((byte) 41, "MP5 Advanced", WeaponType.SMG),
    DUAL_UZI((byte) 42, "Dual Uzis", WeaponType.SMG),
    KRISS_SUPER_V((byte) 43, "Kriss Super V", WeaponType.SMG),
    AWM_ADV((byte) 44, "AWM Advanced", WeaponType.SNIPER_RIFLE),
    M60_ADV((byte) 45, "M60 Advanced", WeaponType.MACHINE_GUN),
    GATLING_GUN((byte) 46, "Gatling Gun", WeaponType.MACHINE_GUN),
    DUAL_DESPERADO((byte) 47, "Dual Desperado", WeaponType.SHOTGUN),
    ANACONDA((byte) 48, "Anaconda", WeaponType.PISTOL),
    DUAL_COLT_1911S((byte) 49, "Dual Colt 1911s", WeaponType.PISTOL),
    DESERT_EAGLE_B((byte) 50, "Desert Eagle B", WeaponType.PISTOL),
    FLASHBANG_GRENADE((byte) 51, "Flashbang Grenade", WeaponType.GRENADE),
    FC_GRENADE((byte) 52, "FC Grenade", WeaponType.GRENADE),
    FIELD_SHOVEL((byte) 53, "Field Shovel", WeaponType.KNIFE),
    KATANA((byte) 54, "Katana", WeaponType.KNIFE),
    BC_AXE((byte) 55, "BC Axe", WeaponType.KNIFE),
    DESERT_EAGLE_B_2((byte) 56, "Desert Eagle B2", WeaponType.PISTOL),
    MP5_ADV_2((byte) 57, "MP5 Advanced 2", WeaponType.SMG),
    AWM_ADV_2((byte) 58, "AWM Advanced 2", WeaponType.SNIPER_RIFLE),
    SG552_ADV_2((byte) 59, "SG552 Advanced 2", WeaponType.RIFLE),
    RED_SMOKE_GRENADE_2((byte) 60, "Red Smoke Grenade 2", WeaponType.GRENADE),
    AK47_2((byte) 61, "AK47 2", WeaponType.RIFLE),
    AK47_KNIFE_2((byte) 62, "AK47 - Knife 2", WeaponType.RIFLE),
    M4A1_ADV_2((byte) 63, "M4A1 Advanced 2", WeaponType.RIFLE),
    M4A1_2((byte) 64, "M4A1 2", WeaponType.RIFLE),
    AKS_74U_2((byte) 65, "AKS-74U 2", WeaponType.RIFLE),
    MP5_ADV_3((byte) 66, "MP5 Advanced 3", WeaponType.SMG),
    DUAL_UZI_2((byte) 67, "Dual Uzis 2", WeaponType.SMG),
    AWM_2((byte) 68, "AWM 2", WeaponType.SNIPER_RIFLE),
    AWM_ADV_3((byte) 69, "AWM Advanced 3", WeaponType.SNIPER_RIFLE),
    M60_2((byte) 70, "M60 2", WeaponType.MACHINE_GUN),
    M60_ADV_2((byte) 71, "M60 Advanced 2", WeaponType.MACHINE_GUN),
    GATLING_GUN_2((byte) 72, "Gatling Gun 2", WeaponType.MACHINE_GUN),
    DUAL_COLT_1911S_2((byte) 73, "Dual Colt 1911s 2", WeaponType.PISTOL),
    DESERT_EAGLE_2((byte) 74, "Desert Eagle 2", WeaponType.PISTOL),
    DESERT_EAGLE_B_3((byte) 75, "Desert Eagle B3", WeaponType.PISTOL),
    FIELD_SHOVEL_2((byte) 76, "Field Shovel 2", WeaponType.KNIFE),
    KATANA_2((byte) 77, "Katana 2", WeaponType.KNIFE),
    BC_AXE_2((byte) 78, "BC Axe 2", WeaponType.KNIFE),
    MAUSER_M1896((byte) 79, "Mauser M1896", WeaponType.PISTOL),
    DUAL_DOUBLE_BARREL((byte) 80, "Dual Double Barrel", WeaponType.PISTOL),
    FN_M249_MINIMI((byte) 81, "FN M249 - Minimi", WeaponType.MACHINE_GUN),
    DESERT_EAGLE_B_4((byte) 82, "Desert Eagle B 4", WeaponType.PISTOL),
    DESERT_EAGLE_TIGER((byte) 83, "Desert Eagle Tiger", WeaponType.PISTOL),
    M4A1A_BRONZE((byte) 84, "M4A1A Bronze", WeaponType.RIFLE),
    DUAL_DOUBLE_BARREL_B((byte) 85, "Dual Double Barrel B", WeaponType.PISTOL),
    M4A1_ADV_TIGER((byte) 86, "M4A1 Advanced Tiger", WeaponType.RIFLE),
    KRISS_SUPER_V_TIGER((byte) 87, "Kriss Super V Tiger", WeaponType.SMG),
    DUAL_UZI_TIGER((byte) 88, "Dual Uzi Tiger", WeaponType.SMG),
    AK47_KNIFE_RED_DRAGON((byte) 89, "AK47 Knife Red Dragon", WeaponType.RIFLE),
    M4A1_ADV_RED_DRAGON((byte) 90, "M4A1 Advanced Red Dragon", WeaponType.RIFLE),
    AWM_RED_DRAGON((byte) 91, "AWM Red Dragon", WeaponType.SNIPER_RIFLE),
    RUGER_MINI_14((byte) 92, "Ruger MINI-14", WeaponType.RIFLE),
    SR_2M_VERESK((byte) 93, "SR-2M Veresk", WeaponType.SMG),
    SL8((byte) 94, "SL8", WeaponType.SNIPER_RIFLE),
    SMOKE_GRENADE_2((byte) 95, "Smoke Grenade 2", WeaponType.GRENADE),
    MINI_UZI_2((byte) 96, "Mini Uzi 2", WeaponType.SMG),
    COLT_1911S_2((byte) 97, "Colt 1911s 2", WeaponType.PISTOL),
    SCAR_LIGHT_2((byte) 98, "Scar Light 2", WeaponType.RIFLE),
    ANACONDA_2((byte) 99, "Anaconda 2", WeaponType.PISTOL),
    GRENADE_2((byte) 100, "Grenade 2", WeaponType.GRENADE),
    XM8_2((byte) 101, "XM8 2", WeaponType.RIFLE),
    DRAGUNOV_2((byte) 102, "Dragunov 2", WeaponType.SNIPER_RIFLE),
    FLASHBANG_GRENADE_2((byte) 103, "Flashbang Grenade 2", WeaponType.GRENADE),
    DOLL_GRENADE((byte) 104, "Doll Grenade", WeaponType.GRENADE),
    AWM_STRIPES((byte) 105, "AWM Stripes", WeaponType.SNIPER_RIFLE),
    M4A1_STRIPES((byte) 106, "M4A1 Stripes", WeaponType.RIFLE),
    DESERT_EAGLE_STRIPES((byte) 107, "Desert Eagle Stripes", WeaponType.PISTOL),
    KNIFE_STRIPES((byte) 108, "Knife Stripes", WeaponType.KNIFE),
    M60_WCG((byte) 109, "M60 WCG", WeaponType.MACHINE_GUN),
    MP5_WCG((byte) 110, "MP5 WCG", WeaponType.SMG),
    P90_WCG((byte) 111, "P90 WCG", WeaponType.SMG),
    M4A1_WCG((byte) 112, "M4A1 WCG", WeaponType.RIFLE),
    AK47_WCG((byte) 113, "AK47 WCG", WeaponType.RIFLE),
    STEYR_AUG_A1_WCG((byte) 114, "Steyr Aug A1 WCG", WeaponType.RIFLE),
    SG552_WCG((byte) 115, "SG552 WCG", WeaponType.RIFLE),
    AWM_WCG((byte) 116, "AWM WCG", WeaponType.SNIPER_RIFLE),
    XM1014_WCG((byte) 117, "XM1014 WCG", WeaponType.SHOTGUN),
    Colt_1911S_WCG((byte) 118, "Colt 1911s WCG", WeaponType.PISTOL),
    DESERT_EAGLE_WCG((byte) 119, "Desert Eagle WCG", WeaponType.PISTOL),
    KNIFE_WCG((byte) 120, "Knife WCG", WeaponType.KNIFE),
    GRENADE_WCG((byte) 121, "Grenade WCG", WeaponType.GRENADE),
    FLASHBANG_GRENADE_WCG((byte) 122, "Flashbang Grenade WCG", WeaponType.GRENADE),
    SMOKE_GRENADE_WCG((byte) 123, "Smoke Grenade WCG", WeaponType.GRENADE),
    BC_AXE_WCG((byte) 124, "BC Axe WCG", WeaponType.KNIFE),
    GHOST_GRENADE((byte) 125, "Ghost Grenade", WeaponType.GRENADE),
    M4A1_HALLOWEEN((byte) 126, "M4A1 - Halloween", WeaponType.RIFLE),
    JACKHAMMER_HALLOWEEN((byte) 127, "Jackhammer - Halloween", WeaponType.SHOTGUN),
    FIELD_SHOVEL_HALLOWEEN((byte) 128, "Field Shovel - Halloween", WeaponType.KNIFE),
    PUMPKIN_GRENADE((byte) 129, "Pumpkin Grenade", WeaponType.GRENADE),
    ROSE_GRENADE((byte) 130, "Rose Grenade", WeaponType.GRENADE),
    AK47_KNIFE_RED_DRAGON_2((byte) 131, "AK47 Knife Red Dragon 2", WeaponType.RIFLE),
    KERIS_XMAS((byte) 132, "Keris - Xmas", WeaponType.KNIFE),
    AWM_XMAS((byte) 133, "AWM - Xmas", WeaponType.SNIPER_RIFLE),
    KRISS_SUPER_V_XMAS((byte) 134, "Kriss Super V - Xmas", WeaponType.SMG),
    M4A1_XMAS((byte) 135, "M4A1 - Xmas", WeaponType.RIFLE),
    SNOWFLAKE_GRENADE((byte) 136, "Snowflake Grenade", WeaponType.GRENADE),
    M249_XMAS((byte) 137, "M249 - Xmas", WeaponType.MACHINE_GUN),
    GLOCK18_XMAS((byte) 138, "Glock-18 - Xmas", WeaponType.PISTOL),
    DSR_1((byte) 139, "DSR-1", WeaponType.SNIPER_RIFLE),
    TAR21((byte) 140, "TAR21", WeaponType.RIFLE),
    NANO_GRENADE((byte) 141, "Nano Grenade", WeaponType.GRENADE),
    SOCCER_GRENADE((byte) 142, "Soccer Grenade", WeaponType.GRENADE),
    FN_F2000((byte) 143, "FN F2000", WeaponType.RIFLE),
    M249_GOLD((byte) 144, "M249 Gold", WeaponType.MACHINE_GUN),
    DUAL_DESERT_EAGLE((byte) 145, "Dual Desert Eagle", WeaponType.PISTOL),
    AK47_GOLD((byte) 146, "AK47 Gold", WeaponType.RIFLE),
    XM8_ADV((byte) 147, "XM8 Advanced", WeaponType.RIFLE),
    TAR21_2((byte) 148, "TAR21 2", WeaponType.RIFLE),
    DSR_1_2((byte) 149, "DSR-1 2", WeaponType.SNIPER_RIFLE),
    LOTUS_GRENADE((byte) 150, "Lotus Grenade", WeaponType.GRENADE),
    P90_CAMO((byte) 151, "P90 Camo", WeaponType.SMG),
    WINCHESTER_SCOPE((byte) 152, "Winchester Scope", WeaponType.RIFLE),
    M12S((byte) 153, "M12S", WeaponType.SMG),
    MP7_2((byte) 154, "MP7 2", WeaponType.SMG),
    KERIS((byte) 155, "Keris", WeaponType.KNIFE),
    MICRO_GALIL_SILENCER((byte) 156, "Micro Galil - Silencer", WeaponType.SMG),
    CHAOS_HOOK((byte) 157, "Chaos Hook", WeaponType.KNIFE),
    MACE_GRENADE((byte) 158, "Mace Grenade", WeaponType.GRENADE),
    USP((byte) 159, "USP", WeaponType.PISTOL),
    ANACONDA_3((byte) 160, "Anaconda 3", WeaponType.PISTOL),
    PSG_1((byte) 161, "PSG-1", WeaponType.SNIPER_RIFLE),
    PSG_1_S((byte) 162, "PSG-1 S", WeaponType.SNIPER_RIFLE),
    MSG90((byte) 163, "MSG90", WeaponType.SNIPER_RIFLE),
    BERETTA_AR_70((byte) 164, "Beretta AR-70", WeaponType.RIFLE),
    THOMPSON((byte) 165, "Thompson", WeaponType.SMG),
    M14EBR((byte) 166, "M14EBR", WeaponType.RIFLE),
    RPK_GOLD((byte) 167, "RPK Gold", WeaponType.MACHINE_GUN),
    PP_19_BIZON((byte) 168, "PP-19 Bizon", WeaponType.SMG),
    XM1014_ADV((byte) 169, "XM1014 Advanced", WeaponType.SHOTGUN),
    FAMAS_CAMO((byte) 170, "FAMAS Camo", WeaponType.RIFLE),
    AWM_PINK((byte) 171, "AWM Pink", WeaponType.SNIPER_RIFLE),
    DUAL_UZI_PINK((byte) 172, "Dual Uzis Pink", WeaponType.SMG),
    M4A1_PINK((byte) 173, "M4A1 Pink", WeaponType.RIFLE),
    MP7_PINK((byte) 174, "MP7 Pink", WeaponType.SMG),
    M4A1_CUSTOM((byte) 175, "M4A1 Custom", WeaponType.RIFLE),
    M37_STAKEOUT((byte) 176, "M37 Stakeout", WeaponType.SHOTGUN),
    QBZ_95_ADV((byte) 177, "QBZ-95 Advanced", WeaponType.RIFLE),
    STEYR_AUG_A1_ADV((byte) 178, "Steyr Aug A1 Advanced", WeaponType.RIFLE),
    BERETTA_AR_70_2((byte) 179, "Beretta AR-70 2", WeaponType.RIFLE),
    BUSHMASTER_ACR_2((byte) 180, "Bushmaster ACR 2", WeaponType.RIFLE),
    MICRO_GALIL_SILENCER_2((byte) 181, "Micro Galil Silencer 2", WeaponType.SMG),
    THOMPSON_2((byte) 182, "Thompson 2", WeaponType.SMG),
    DUAL_DOUBLE_BARREL_2((byte) 183, "Dual Double Barrel 2", WeaponType.PISTOL),
    ULTIMAX_100((byte) 184, "Ultimax 100", WeaponType.MACHINE_GUN),
    PSG_1_2((byte) 185, "PSG-1 2", WeaponType.SNIPER_RIFLE),
    MAUSER_M1896_2((byte) 186, "Mauser M1896 2", WeaponType.PISTOL),
    KUKRI((byte) 187, "Kukri", WeaponType.KNIFE),
    DSR_1_DIGITAL_CAMO((byte) 188, "DSR-1 DC", WeaponType.SNIPER_RIFLE),
    SCAR_HEAVY_CAMO((byte) 189, "Scar Heavy Camo", WeaponType.RIFLE),
    RX4_STORM((byte) 190, "RX4 Storm", WeaponType.RIFLE),
    M16A3_LMG((byte) 191, "M16A3 LMG", WeaponType.MACHINE_GUN),
    MP7_ADV((byte) 192, "MP7 Advanced", WeaponType.SMG),
    USP_2((byte) 193, "USP 2", WeaponType.PISTOL),
    EASTER_EGG_GRENADE((byte) 194, "Easter Egg Grenade", WeaponType.GRENADE),
    XM8_JASMINE((byte) 195, "XM8 Jasmine", WeaponType.RIFLE),
    GATLING_GUN_GOLD((byte) 196, "Gatling Gun Gold", WeaponType.MACHINE_GUN),
    AK47_KNIFE_BLACK_STRIPES((byte) 197, "AK47 - Knife BS", WeaponType.RIFLE),
    WINCHESTER_GOLD((byte) 198, "Winchester Gold", WeaponType.RIFLE),
    BERETTA_M93R((byte) 199, "Beretta M93R", WeaponType.PISTOL),
    M16_ADV_2((byte) 200, "M16 Advanced 2", WeaponType.RIFLE),
    MSG90_2((byte) 201, "MSG90 2", WeaponType.SNIPER_RIFLE),
    DUAL_1911S_RED_DRAGON((byte) 202, "Dual 1911s Red Dragon", WeaponType.PISTOL),
    M4A1_BANDAGE((byte) 203, "M4A1 Bandage", WeaponType.RIFLE),
    FIELD_SHOVEL_RED_DRAGON((byte) 204, "Field Shovel Red Dragon", WeaponType.KNIFE),
    SCAR_LIGHT_RED_DRAGON((byte) 205, "Scar Light Red Dragon", WeaponType.RIFLE),
    ANACONDA_RED_DRAGON((byte) 206, "Anaconda Red Dragon", WeaponType.PISTOL),
    SG552_B((byte) 207, "SG552 B", WeaponType.RIFLE),
    L85A1((byte) 208, "L85A1", WeaponType.RIFLE),
    AK47_B((byte) 209, "AK47 B", WeaponType.RIFLE),
    QBZ_03((byte) 210, "QBZ-03", WeaponType.RIFLE),
    KRISS_SUPER_V_LIQUID_METAL((byte) 211, "Kriss Super V - Liquid Metal", WeaponType.SMG),
    MG3_GOLD((byte) 212, "MG3 Gold", WeaponType.MACHINE_GUN),
    DSR_1_RUSTY((byte) 213, "DSR-1 Rusty", WeaponType.SNIPER_RIFLE),
    GALIL_ARM((byte) 214, "Galil ARM", WeaponType.RIFLE),
    JACKHAMMER((byte) 215, "Jackhammer", WeaponType.SHOTGUN),
    RUGER_BISLEY((byte) 216, "Ruger Bisley", WeaponType.PISTOL),
    M16_ADV((byte) 217, "M16 Advanced", WeaponType.RIFLE),
    M4A1_ROYAL_DRAGON((byte) 218, "M4A1 Royal Dragon", WeaponType.RIFLE),
    KUKRI_ROYAL_DRAGON((byte) 219, "Kukri Royal Dragon", WeaponType.KNIFE),
    MP7A1((byte) 220, "MP7A1", WeaponType.SMG),
    KTR_08((byte) 221, "KTR-08", WeaponType.RIFLE),
    FC_GRENADE_2((byte) 222, "FC Grenade 2", WeaponType.GRENADE),
    STERLING((byte) 223, "Sterling", WeaponType.SMG),
    M37_STAKEOUT_HELLFIRE((byte) 224, "M37 Stakeout Hellfire", WeaponType.SHOTGUN),
    SCAR_HEAVY_RED_DRAGON((byte) 225, "Scar Heavy Red Dragon", WeaponType.RIFLE),
    JACKHAMMER_OCTANE((byte) 226, "Jackhammer - Octane", WeaponType.SHOTGUN),
    M4A1_CUSTOM_OCTANE((byte) 227, "M4A1 Custom - Octane", WeaponType.RIFLE),
    BC_AXE_OCTANE((byte) 228, "BC Axe - Octane", WeaponType.KNIFE),
    MK23_OCTANE((byte) 229, "MK23 - Octane", WeaponType.PISTOL),
    JACKHAMMER_OCTANE_2((byte) 230, "Jackhammer - Octane 2", WeaponType.SHOTGUN),
    M4A1_CUSTOM_OCTANE_2((byte) 231, "M4A1 Custom - Octane 2", WeaponType.RIFLE),
    BC_AXE_OCTANE_2((byte) 232, "BC Axe - Octane 2", WeaponType.KNIFE),
    MK23_OCTANE_2((byte) 233, "MK23 - Octane 2", WeaponType.PISTOL),
    OCTANE_GRENADE((byte) 234, "Octane Grenade", WeaponType.GRENADE),
    M60_WCG_2012((byte) 235, "M60 2012 WCG", WeaponType.MACHINE_GUN),
    MP5_WCG_2012((byte) 236, "MP5 2012 WCG", WeaponType.SMG),
    P90_WCG_2012((byte) 237, "P90 2012 WCG", WeaponType.SMG),
    M4A1_WCG_2012((byte) 238, "M4A1 2012 WCG", WeaponType.RIFLE),
    AK47_WCG_2012((byte) 239, "AK47 2012 WCG", WeaponType.RIFLE),
    STEYR_AUG_A1_WCG_2012((byte) 240, "Steyr AUG A1 2012 WCG", WeaponType.RIFLE),
    SG552_WCG_2012((byte) 241, "SG552 2012 WCG", WeaponType.RIFLE),
    AWM_WCG_2012((byte) 242, "AWM 2012 WCG", WeaponType.SNIPER_RIFLE),
    XM1014_WCG_2012((byte) 243, "XM1014 2012 WCG", WeaponType.SHOTGUN),
    COLT_1911S_WCG_2012((byte) 244, "Colt 1911s 2012 WCG", WeaponType.PISTOL),
    DESERT_EAGLE_WCG_2012((byte) 245, "Desert Eagle 2012 WCG", WeaponType.PISTOL),
    KNIFE_WCG_2012((byte) 246, "Knife 2012 WCG", WeaponType.KNIFE),
    GRENADE_WCG_2012((byte) 247, "Grenade 2012 WCG", WeaponType.GRENADE),
    FLASHBANG_GRENADE_WCG_2012((byte) 248, "Flashbang Grenade 2012 WCG", WeaponType.GRENADE),
    SMOKE_GRENADE_WCG_2012((byte) 249, "Smoke Grenade 2012 WCG", WeaponType.GRENADE),
    BC_AXE_WCG_2012((byte) 250, "BC Axe 2012 WCG", WeaponType.KNIFE),
    LR300_ML((byte) 251, "LR300ML", WeaponType.RIFLE),
    DESERT_EAGLE_CRYSTAL((byte) 252, "Desert Eagle Crystal", WeaponType.PISTOL),
    AWM_BLUE_DIAMOND((byte) 253, "AWM Blue Diamond", WeaponType.SNIPER_RIFLE),
    M4A1_CUSTOM_AUTUMN_CAMO((byte) 254, "M4A1 Custom - Autumn Camo", WeaponType.RIFLE),
    BC_AXE_AUTUMN_CAMO((byte) 255, "BC AXE - Autumn Camo", WeaponType.KNIFE),
    M4A1_CUSTOM_AUTUMN_CAMO_2((byte) 256, "M4A1 Custom - Autumn Camo 2", WeaponType.RIFLE),
    BC_AXE_AUTUMN_CAMO_2((byte) 257, "BC AXE - Autumn Camo 2", WeaponType.KNIFE),
    AUTUMN_CAMO_GRENADE((byte) 258, "Autumn Camo Grenade", WeaponType.GRENADE),
    KNUCKBLES((byte) 259, "Knuckles", WeaponType.KNIFE),
    KRISS_SUPER_V_HALLOWEEN((byte) 260, "Kriss Super V - Halloween", WeaponType.SMG),
    MAUSER_M1896_HALLOWEEN((byte) 261, "Mauser M1896 - Halloween", WeaponType.PISTOL),
    GATLING_GUN_HALLOWEEN((byte) 262, "Gatling Gun - Halloween", WeaponType.MACHINE_GUN),
    FR_F2_HALLOWEEN((byte) 263, "FR-F2 - Halloween", WeaponType.SNIPER_RIFLE),
    M4A1_X_HALLOWEEN((byte) 264, "M4A1-X - Halloween", WeaponType.RIFLE),
    M16_SILENCER_CAMO((byte) 265, "M16-S-Camo", WeaponType.RIFLE),
    AK47_SCOPE((byte) 266, "AK47 - Scope", WeaponType.RIFLE),
    DESERT_EAGLE_SCOPE((byte) 267, "Desert Eagle - Scope", WeaponType.PISTOL),
    XM8_B((byte) 268, "XM8 B", WeaponType.RIFLE),
    RPK_RED_EAGLE((byte) 269, "RPK Red Eagle", WeaponType.MACHINE_GUN),
    DUAL_DOUBLE_BARREL_SILVER((byte) 270, "Dual Double Barrel Silver", WeaponType.PISTOL),
    SCAR_LIGHT_GOLD((byte) 271, "Scar Light Gold", WeaponType.RIFLE),
    ANACONDA_GOLD((byte) 272, "Anaconda Gold", WeaponType.PISTOL),
    AWM_ADV_XMAS((byte) 273, "AWM Advanced Xmas", WeaponType.SNIPER_RIFLE),
    M14EBR_XMAS((byte) 274, "M14EBR Xmas", WeaponType.RIFLE),
    AK47_XMAS((byte) 275, "AK47 Xmas", WeaponType.RIFLE),
    BC_AXE_XMAS((byte) 276, "BC Axe Xmas", WeaponType.KNIFE),
    M14EBR_ULTIMATE_GOLD((byte) 277, "M14EBR Ultimate Gold", WeaponType.RIFLE),
    AR_57((byte) 278, "AR-57", WeaponType.RIFLE),
    FN_F2000_GREEN_SKULL((byte) 279, "FN-F2000 Green Skull", WeaponType.RIFLE),
    DUAL_DESERT_EAGLE_GREEN_VEIN((byte) 280, "Dual Desert Eagle Green_Vein", WeaponType.PISTOL),
    BIOHAZARD_MODE_GRENADE((byte) 281, "Biohazard Mode - Grenade", WeaponType.GRENADE),
    MEGA_WARMONGER_FISTS((byte) 282, "Mega Warmonger Fists", WeaponType.KNIFE),
    MG3_PERFECT_SILVER((byte) 283, "MG3 - PS", WeaponType.MACHINE_GUN),
    M1216((byte) 284, "M1216", WeaponType.SHOTGUN),
    SW_M66((byte) 285, "S&W M66", WeaponType.PISTOL),
    GHOST_GRENADE_2((byte) 286, "Ghost Grenade 2", WeaponType.GRENADE),
    M37_STAKEOUT_2((byte) 287, "M37 Stakeout 2", WeaponType.SHOTGUN),
    NANO_GRENADE_2((byte) 288, "Nano Grenade 2", WeaponType.GRENADE),
    BARRETT_M82A1_RED_DRAGON((byte) 289, "Barrett M82A1 Red Dragon", WeaponType.SNIPER_RIFLE),
    STEYR_AUG_A1_RED_DRAGON((byte) 290, "Steyr Aug A1 Red Dragon", WeaponType.RIFLE),
    ANACONDA_RED_DRAGON_2((byte) 291, "Anaconda Red Dragon 2", WeaponType.PISTOL),
    THOMPSON_GOLD((byte) 292, "Thompson Gold", WeaponType.SMG),
    M4A1_ADV_CRYSTAL((byte) 293, "M4A1 Advanced Crystal", WeaponType.RIFLE),
    M60E3((byte) 294, "M60E3", WeaponType.MACHINE_GUN),
    MACHETE((byte) 295, "Machete", WeaponType.KNIFE),
    TRG_21((byte) 296, "TRG-21", WeaponType.SNIPER_RIFLE);

    private final byte id;
    private final String name;
    private final WeaponType type;

    public static Weapons getWeaponById(byte id) {
        return Arrays.stream(values()).filter(weapon -> weapon.id == id).findFirst().orElse(UNKNOWN);
    }

}
