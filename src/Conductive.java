interface Conductive {
    double percent_conductive();
    void conductivity();
}

interface Magnetic {
    int magnetic_strength();
    String magnetic_type();
    void magnetize();
}

interface Radioactive {
    int half_life();
    void radiate();
}