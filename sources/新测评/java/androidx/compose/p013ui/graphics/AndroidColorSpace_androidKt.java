package androidx.compose.p013ui.graphics;

import android.graphics.ColorSpace;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0007¨\u0006\u0004"}, m13558d2 = {"toAndroidColorSpace", "Landroid/graphics/ColorSpace;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "toComposeColorSpace", "ui-graphics_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nAndroidColorSpace.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidColorSpace.android.kt\nandroidx/compose/ui/graphics/AndroidColorSpace_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidColorSpace_androidKt {
    @RequiresApi(26)
    public static final ColorSpace toAndroidColorSpace(androidx.compose.p013ui.graphics.colorspace.ColorSpace colorSpace) {
        return ColorSpaceVerificationHelper.androidColorSpace(colorSpace);
    }

    @RequiresApi(26)
    public static final androidx.compose.p013ui.graphics.colorspace.ColorSpace toComposeColorSpace(ColorSpace colorSpace) {
        return ColorSpaceVerificationHelper.composeColorSpace(colorSpace);
    }
}
