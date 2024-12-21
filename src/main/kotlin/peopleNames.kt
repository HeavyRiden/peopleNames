fun main() {

    val likes: Int = 11;
    var wordEnding: String = "людям";

    if ((likes % 10) == 1 && (likes % 100) != 11) {
        wordEnding = "человеку";
    }

    println("понравилось $likes $wordEnding");
}