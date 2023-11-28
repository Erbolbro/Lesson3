fun main(args: Array<String>) {
    val android: Android = Android(System.`in`)
    when (android.nextInt()) {
        0 -> {
            val warrior = Character.Warrior(" Банкай")
            val magic = Character.Magic("превращает кролика")
            val archer=Character.Archer("огненные стрелы")
            CharacterCommon.attack(warrior)
            CharacterCommon.attack(magic)
            CharacterCommon.attack(archer)
        }
        1->{
            val warrior =Character.Warrior(" меч защита")
            val magic = Character.Magic("зеркальная защита")
            val archer = Character.Archer("невидимая защита ")
            CharacterCommon.defend((warrior))
            CharacterCommon.defend(magic)
            CharacterCommon.defend(archer)

            val hiller = object {
                val name = "лечит"
                fun hill(){
                    println("$name вылнчил всех")
                }
            }
            hiller.hill()
        }

        
    }
}