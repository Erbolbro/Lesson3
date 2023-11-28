sealed class Character(
    val name: Geeks,
    val weaponType: WeaponType
) {
    class Warrior(val ability: Geeks) : Character(WARRIOR_NAME, WeaponType.SWORD)
    class Magic(val spell: Geeks) : Character(MAGE_NAME, WeaponType.STICK)
    class Archer( val ability: Geeks) : Character(ARCHER_NAME,WeaponType.BOW)
    companion object{
        const val WARRIOR_NAME = "Warrior"
        const val MAGE_NAME = "Mage"
        const val ARCHER_NAME = "Archer"
    }
}