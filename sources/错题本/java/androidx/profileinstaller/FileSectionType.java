package androidx.profileinstaller;

import androidx.collection.AbstractC0584a;

/* loaded from: classes2.dex */
enum FileSectionType {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    FileSectionType(long j7) {
        this.mValue = j7;
    }

    public static FileSectionType fromValue(long j7) {
        FileSectionType[] fileSectionTypeArrValues = values();
        for (int i = 0; i < fileSectionTypeArrValues.length; i++) {
            if (fileSectionTypeArrValues[i].getValue() == j7) {
                return fileSectionTypeArrValues[i];
            }
        }
        throw new IllegalArgumentException(AbstractC0584a.m913n(j7, "Unsupported FileSection Type "));
    }

    public long getValue() {
        return this.mValue;
    }
}
