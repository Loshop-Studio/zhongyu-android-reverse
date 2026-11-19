package androidx.profileinstaller;

/* loaded from: classes3.dex */
enum FileSectionType {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    FileSectionType(long j9) {
        this.mValue = j9;
    }

    public static FileSectionType fromValue(long j9) {
        FileSectionType[] fileSectionTypeArrValues = values();
        for (int i9 = 0; i9 < fileSectionTypeArrValues.length; i9++) {
            if (fileSectionTypeArrValues[i9].getValue() == j9) {
                return fileSectionTypeArrValues[i9];
            }
        }
        throw new IllegalArgumentException("Unsupported FileSection Type " + j9);
    }

    public long getValue() {
        return this.mValue;
    }
}
