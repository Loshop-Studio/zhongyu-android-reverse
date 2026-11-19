package androidx.profileinstaller;

/* loaded from: classes.dex */
enum FileSectionType {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    FileSectionType(long j4) {
        this.mValue = j4;
    }

    public static FileSectionType fromValue(long j4) {
        FileSectionType[] fileSectionTypeArrValues = values();
        for (int i4 = 0; i4 < fileSectionTypeArrValues.length; i4++) {
            if (fileSectionTypeArrValues[i4].getValue() == j4) {
                return fileSectionTypeArrValues[i4];
            }
        }
        throw new IllegalArgumentException("Unsupported FileSection Type " + j4);
    }

    public long getValue() {
        return this.mValue;
    }
}
