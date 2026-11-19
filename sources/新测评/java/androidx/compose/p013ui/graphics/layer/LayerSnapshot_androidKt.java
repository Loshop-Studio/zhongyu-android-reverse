package androidx.compose.p013ui.graphics.layer;

import android.graphics.Bitmap;
import android.media.Image;
import androidx.compose.p013ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m13558d2 = {"toBitmap", "Landroid/graphics/Bitmap;", "Landroid/media/Image;", "ui-graphics_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class LayerSnapshot_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap toBitmap(Image image) {
        Image.Plane[] planes = image.getPlanes();
        Intrinsics.checkNotNull(planes);
        Image.Plane plane = planes[0];
        int width = image.getWidth() * image.getHeight();
        int[] iArr = new int[width];
        plane.getBuffer().asIntBuffer().get(iArr);
        for (int i10 = 0; i10 < width; i10++) {
            int i11 = iArr[i10];
            iArr[i10] = ColorKt.m21030toArgb8_81llA(ColorKt.Color(i11 & 255, (i11 >> 8) & 255, (i11 >> 16) & 255, (i11 >> 24) & 255));
        }
        return Bitmap.createBitmap(iArr, image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
    }
}
