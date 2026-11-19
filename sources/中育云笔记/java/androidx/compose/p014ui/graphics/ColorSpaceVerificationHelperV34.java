package androidx.compose.p014ui.graphics;

import android.graphics.ColorSpace;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.graphics.colorspace.ColorSpaces;
import kotlin.jvm.internal.AbstractC9979u;

@RequiresApi(34)
/* loaded from: classes2.dex */
final class ColorSpaceVerificationHelperV34 {
    public static final ColorSpaceVerificationHelperV34 INSTANCE = new ColorSpaceVerificationHelperV34();

    private ColorSpaceVerificationHelperV34() {
    }

    public static final ColorSpace obtainAndroidColorSpace(androidx.compose.p014ui.graphics.colorspace.ColorSpace colorSpace) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (AbstractC9979u.m20289b(colorSpace, colorSpaces.getBt2020Hlg())) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (AbstractC9979u.m20289b(colorSpace, colorSpaces.getBt2020Pq())) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }

    public static final androidx.compose.p014ui.graphics.colorspace.ColorSpace obtainComposeColorSpaceFromId(int i10) {
        return i10 == ColorSpace.Named.BT2020_HLG.ordinal() ? ColorSpaces.INSTANCE.getBt2020Hlg() : i10 == ColorSpace.Named.BT2020_PQ.ordinal() ? ColorSpaces.INSTANCE.getBt2020Pq() : ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release();
    }
}
