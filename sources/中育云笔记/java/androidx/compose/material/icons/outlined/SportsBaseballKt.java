package androidx.compose.material.icons.outlined;

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
public final class SportsBaseballKt {
    private static ImageVector _sportsBaseball;

    public static final ImageVector getSportsBaseball(Icons.Outlined outlined) {
        ImageVector imageVector = _sportsBaseball;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SportsBaseball", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.61f, 16.78f);
        pathBuilder.curveTo(4.6f, 15.45f, 4.0f, 13.8f, 4.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(0.6f, -3.45f, 1.61f, -4.78f);
        pathBuilder.curveTo(7.06f, 8.31f, 8.0f, 10.05f, 8.0f, 12.0f);
        pathBuilder.reflectiveCurveTo(7.06f, 15.69f, 5.61f, 16.78f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-1.89f, 0.0f, -3.63f, -0.66f, -5.0f, -1.76f);
        pathBuilder.curveToRelative(1.83f, -1.47f, 3.0f, -3.71f, 3.0f, -6.24f);
        pathBuilder.reflectiveCurveTo(8.83f, 7.23f, 7.0f, 5.76f);
        pathBuilder.curveTo(8.37f, 4.66f, 10.11f, 4.0f, 12.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(3.63f, 0.66f, 5.0f, 1.76f);
        pathBuilder.curveToRelative(-1.83f, 1.47f, -3.0f, 3.71f, -3.0f, 6.24f);
        pathBuilder.reflectiveCurveToRelative(1.17f, 4.77f, 3.0f, 6.24f);
        pathBuilder.curveTo(15.63f, 19.34f, 13.89f, 20.0f, 12.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.39f, 16.78f);
        pathBuilder.curveTo(16.94f, 15.69f, 16.0f, 13.95f, 16.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(0.94f, -3.69f, 2.39f, -4.78f);
        pathBuilder.curveTo(19.4f, 8.55f, 20.0f, 10.2f, 20.0f, 12.0f);
        pathBuilder.reflectiveCurveTo(19.4f, 15.45f, 18.39f, 16.78f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsBaseball = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
