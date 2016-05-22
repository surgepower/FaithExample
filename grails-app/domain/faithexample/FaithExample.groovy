package faithexample

import metafunctionality.ModuleInput

class FaithExample extends ModuleInput {
    String word
    String answer
    static hasMany = [rhymingCandidates:String]
    List rhymingCandidates
}
