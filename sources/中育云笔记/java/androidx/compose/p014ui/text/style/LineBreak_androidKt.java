package androidx.compose.p014ui.text.style;

/* loaded from: classes2.dex */
public final class LineBreak_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int packBytes(int i10, int i11, int i12) {
        return i10 | (i11 << 8) | (i12 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unpackByte1(int i10) {
        return i10 & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unpackByte2(int i10) {
        return (i10 >> 8) & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unpackByte3(int i10) {
        return (i10 >> 16) & 255;
    }
}
