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
public final class DonutLargeKt {
    private static ImageVector _donutLarge;

    public static final ImageVector getDonutLarge(Icons.Sharp sharp) {
        ImageVector imageVector = _donutLarge;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DonutLarge", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 5.08f);
        pathBuilder.curveToRelative(3.06f, 0.44f, 5.48f, 2.86f, 5.92f, 5.92f);
        pathBuilder.horizontalLineToRelative(3.03f);
        pathBuilder.curveToRelative(-0.47f, -4.72f, -4.23f, -8.48f, -8.95f, -8.95f);
        pathBuilder.verticalLineToRelative(3.03f);
        pathBuilder.close();
        pathBuilder.moveTo(18.92f, 13.0f);
        pathBuilder.curveToRelative(-0.44f, 3.06f, -2.86f, 5.48f, -5.92f, 5.92f);
        pathBuilder.verticalLineToRelative(3.03f);
        pathBuilder.curveToRelative(4.72f, -0.47f, 8.48f, -4.23f, 8.95f, -8.95f);
        pathBuilder.horizontalLineToRelative(-3.03f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 18.92f);
        pathBuilder.curveToRelative(-3.39f, -0.49f, -6.0f, -3.4f, -6.0f, -6.92f);
        pathBuilder.reflectiveCurveToRelative(2.61f, -6.43f, 6.0f, -6.92f);
        pathBuilder.verticalLineTo(2.05f);
        pathBuilder.curveToRelative(-5.05f, 0.5f, -9.0f, 4.76f, -9.0f, 9.95f);
        pathBuilder.curveToRelative(0.0f, 5.19f, 3.95f, 9.45f, 9.0f, 9.95f);
        pathBuilder.verticalLineToRelative(-3.03f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _donutLarge = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
