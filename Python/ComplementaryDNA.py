def DNA_strand(dna):
    word = { "A":"T","T":"A","G":"C","C":"G"}
    return "".join([word[X] for X in dna])