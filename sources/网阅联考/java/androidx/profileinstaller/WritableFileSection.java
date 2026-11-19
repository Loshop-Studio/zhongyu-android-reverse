package androidx.profileinstaller;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
class WritableFileSection {
    final byte[] mContents;
    final int mExpectedInflateSize;
    final boolean mNeedsCompression;
    final FileSectionType mType;

    public WritableFileSection(@NonNull FileSectionType fileSectionType, int i4, @NonNull byte[] bArr, boolean z3) {
        this.mType = fileSectionType;
        this.mExpectedInflateSize = i4;
        this.mContents = bArr;
        this.mNeedsCompression = z3;
    }
}
