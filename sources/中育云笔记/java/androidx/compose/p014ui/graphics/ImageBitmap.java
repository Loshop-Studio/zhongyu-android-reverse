package androidx.compose.p014ui.graphics;

import androidx.compose.p014ui.graphics.colorspace.ColorSpace;

/* loaded from: classes2.dex */
public interface ImageBitmap {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    public static final class DefaultImpls {
    }

    static /* synthetic */ void readPixels$default(ImageBitmap imageBitmap, int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readPixels");
        }
        if ((i16 & 2) != 0) {
            i10 = 0;
        }
        if ((i16 & 4) != 0) {
            i11 = 0;
        }
        if ((i16 & 8) != 0) {
            i12 = imageBitmap.getWidth();
        }
        if ((i16 & 16) != 0) {
            i13 = imageBitmap.getHeight();
        }
        if ((i16 & 32) != 0) {
            i14 = 0;
        }
        if ((i16 & 64) != 0) {
            i15 = i12;
        }
        imageBitmap.readPixels(iArr, i10, i11, i12, i13, i14, i15);
    }

    ColorSpace getColorSpace();

    /* renamed from: getConfig-_sVssgQ */
    int mo30745getConfig_sVssgQ();

    boolean getHasAlpha();

    int getHeight();

    int getWidth();

    void prepareToDraw();

    void readPixels(int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15);
}
