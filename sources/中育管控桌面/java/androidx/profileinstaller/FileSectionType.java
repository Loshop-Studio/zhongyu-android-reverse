package androidx.profileinstaller;

/* loaded from: classes3.dex */
enum FileSectionType {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    FileSectionType(long j6) {
        this.mValue = j6;
    }

    public static FileSectionType fromValue(long j6) {
        FileSectionType[] fileSectionTypeArrValues = values();
        for (int i6 = 0; i6 < fileSectionTypeArrValues.length; i6++) {
            if (fileSectionTypeArrValues[i6].getValue() == j6) {
                return fileSectionTypeArrValues[i6];
            }
        }
        throw new IllegalArgumentException("Unsupported FileSection Type " + j6);
    }

    public long getValue() {
        return this.mValue;
    }
}
