package androidx.profileinstaller;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
class WritableFileSection {
    final byte[] mContents;
    final int mExpectedInflateSize;
    final boolean mNeedsCompression;
    final FileSectionType mType;

    public WritableFileSection(@NonNull FileSectionType fileSectionType, int i6, @NonNull byte[] bArr, boolean z6) {
        this.mType = fileSectionType;
        this.mExpectedInflateSize = i6;
        this.mContents = bArr;
        this.mNeedsCompression = z6;
    }
}
