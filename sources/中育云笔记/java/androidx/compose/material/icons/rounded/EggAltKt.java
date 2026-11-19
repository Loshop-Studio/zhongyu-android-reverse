package androidx.compose.material.icons.rounded;

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
public final class EggAltKt {
    private static ImageVector _eggAlt;

    public static final ImageVector getEggAlt(Icons.Rounded rounded) {
        ImageVector imageVector = _eggAlt;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EggAlt", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 9.0f);
        pathBuilder.curveTo(17.0f, 7.0f, 15.99f, 2.0f, 9.97f, 2.0f);
        pathBuilder.curveTo(4.95f, 2.0f, 1.94f, 6.0f, 2.0f, 11.52f);
        pathBuilder.curveTo(2.06f, 17.04f, 6.96f, 19.0f, 9.97f, 19.0f);
        pathBuilder.curveToRelative(2.01f, 0.0f, 2.01f, 3.0f, 6.02f, 3.0f);
        pathBuilder.curveTo(19.0f, 22.0f, 22.0f, 19.0f, 22.0f, 15.02f);
        pathBuilder.curveTo(22.0f, 12.0f, 21.01f, 11.0f, 19.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 15.5f);
        pathBuilder.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        pathBuilder.reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f);
        pathBuilder.reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f);
        pathBuilder.reflectiveCurveTo(13.93f, 15.5f, 12.0f, 15.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _eggAlt = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
