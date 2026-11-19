package androidx.compose.p014ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.compose.p014ui.graphics.colorspace.ColorSpace;
import androidx.compose.p014ui.graphics.colorspace.ColorSpaces;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class AndroidImageBitmap implements ImageBitmap {
    private final Bitmap bitmap;

    public AndroidImageBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public final Bitmap getBitmap$ui_graphics_release() {
        return this.bitmap;
    }

    @Override // androidx.compose.p014ui.graphics.ImageBitmap
    public ColorSpace getColorSpace() {
        if (Build.VERSION.SDK_INT < 26) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        Api26Bitmap api26Bitmap = Api26Bitmap.INSTANCE;
        return Api26Bitmap.composeColorSpace$ui_graphics_release(this.bitmap);
    }

    @Override // androidx.compose.p014ui.graphics.ImageBitmap
    /* renamed from: getConfig-_sVssgQ, reason: not valid java name */
    public int mo30745getConfig_sVssgQ() {
        Bitmap.Config config = this.bitmap.getConfig();
        AbstractC9979u.m20291d(config);
        return AndroidImageBitmap_androidKt.toImageConfig(config);
    }

    @Override // androidx.compose.p014ui.graphics.ImageBitmap
    public boolean getHasAlpha() {
        return this.bitmap.hasAlpha();
    }

    @Override // androidx.compose.p014ui.graphics.ImageBitmap
    public int getHeight() {
        return this.bitmap.getHeight();
    }

    @Override // androidx.compose.p014ui.graphics.ImageBitmap
    public int getWidth() {
        return this.bitmap.getWidth();
    }

    @Override // androidx.compose.p014ui.graphics.ImageBitmap
    public void prepareToDraw() {
        this.bitmap.prepareToDraw();
    }

    @Override // androidx.compose.p014ui.graphics.ImageBitmap
    public void readPixels(int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15) {
        Bitmap bitmapAsAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(this);
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 26 && bitmapAsAndroidBitmap.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapAsAndroidBitmap = bitmapAsAndroidBitmap.copy(Bitmap.Config.ARGB_8888, false);
            z10 = true;
        }
        Bitmap bitmap = bitmapAsAndroidBitmap;
        bitmap.getPixels(iArr, i14, i15, i10, i11, i12, i13);
        if (z10) {
            bitmap.recycle();
        }
    }
}
