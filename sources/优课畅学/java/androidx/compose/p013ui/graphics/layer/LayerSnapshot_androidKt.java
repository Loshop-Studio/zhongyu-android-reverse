package androidx.compose.p013ui.graphics.layer;

import android.graphics.Bitmap;
import android.media.Image;
import androidx.compose.p013ui.graphics.ColorKt;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class LayerSnapshot_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap toBitmap(Image image) {
        Image.Plane[] planes = image.getPlanes();
        AbstractC9133u.m16130d(planes);
        Image.Plane plane = planes[0];
        int width = image.getWidth() * image.getHeight();
        int[] iArr = new int[width];
        plane.getBuffer().asIntBuffer().get(iArr);
        for (int i10 = 0; i10 < width; i10++) {
            int i11 = iArr[i10];
            iArr[i10] = ColorKt.m24330toArgb8_81llA(ColorKt.Color(i11 & 255, (i11 >> 8) & 255, (i11 >> 16) & 255, (i11 >> 24) & 255));
        }
        return Bitmap.createBitmap(iArr, image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
    }
}
