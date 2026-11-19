package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class PanoramaVerticalSelectKt {
    private static ImageVector _panoramaVerticalSelect;

    public static final ImageVector getPanoramaVerticalSelect(Icons.TwoTone twoTone) {
        ImageVector imageVector = _panoramaVerticalSelect;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PanoramaVerticalSelect", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.5f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -3.89f, 0.84f, -6.95f, 1.43f, -8.69f);
        pathBuilder.curveTo(20.15f, 2.67f, 19.67f, 2.0f, 18.98f, 2.0f);
        pathBuilder.lineTo(5.0f, 2.0f);
        pathBuilder.curveTo(4.32f, 2.0f, 3.84f, 2.66f, 4.05f, 3.31f);
        pathBuilder.curveTo(4.74f, 5.36f, 5.5f, 8.1f, 5.5f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 3.87f, -0.76f, 6.66f, -1.45f, 8.69f);
        pathBuilder.curveTo(3.84f, 21.34f, 4.32f, 22.0f, 5.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.68f, 0.0f, 1.17f, -0.66f, 0.95f, -1.31f);
        pathBuilder.curveTo(19.27f, 18.66f, 18.5f, 15.86f, 18.5f, 12.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaVerticalSelect = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
