package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.StrokeJoin;
import androidx.compose.p014ui.graphics.vector.ImageVector;
import androidx.compose.p014ui.graphics.vector.PathBuilder;
import androidx.compose.p014ui.graphics.vector.VectorKt;
import androidx.compose.p014ui.unit.C3186Dp;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class PanoramaWideAngleSelectKt {
    private static ImageVector _panoramaWideAngleSelect;

    public static final ImageVector getPanoramaWideAngleSelect(Icons.Sharp sharp) {
        ImageVector imageVector = _panoramaWideAngleSelect;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PanoramaWideAngleSelect", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveTo(8.03f, 4.0f, 5.15f, 4.63f, 3.0f, 5.0f);
        pathBuilder.curveToRelative(-0.55f, 1.97f, -1.0f, 3.92f, -1.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, 3.03f, 0.45f, 5.05f, 1.0f, 7.0f);
        pathBuilder.curveToRelative(2.15f, 0.37f, 4.98f, 1.0f, 9.0f, 1.0f);
        pathBuilder.curveToRelative(3.97f, 0.0f, 6.85f, -0.63f, 9.0f, -1.0f);
        pathBuilder.curveToRelative(0.57f, -2.02f, 1.0f, -3.99f, 1.0f, -7.0f);
        pathBuilder.curveToRelative(0.0f, -3.03f, -0.45f, -5.05f, -1.0f, -7.0f);
        pathBuilder.curveTo(18.85f, 4.63f, 16.02f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaWideAngleSelect = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
