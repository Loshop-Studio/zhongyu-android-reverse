package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.PathFillType;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class BakeryDiningKt {
    private static ImageVector _bakeryDining;

    public static final ImageVector getBakeryDining(Icons.Filled filled) {
        ImageVector imageVector = _bakeryDining;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BakeryDining", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int iM24558getEvenOddRgk1Os = PathFillType.Companion.m24558getEvenOddRgk1Os();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.28f, 16.34f);
        pathBuilder.curveTo(18.07f, 15.45f, 17.46f, 15.0f, 17.46f, 15.0f);
        pathBuilder.reflectiveCurveToRelative(0.32f, -0.59f, 0.96f, -1.78f);
        pathBuilder.curveToRelative(0.38f, -0.59f, 1.22f, -0.59f, 1.6f, 0.0f);
        pathBuilder.lineToRelative(0.81f, 1.26f);
        pathBuilder.curveToRelative(0.19f, 0.3f, 0.21f, 0.68f, 0.06f, 1.0f);
        pathBuilder.lineToRelative(-0.22f, 0.47f);
        pathBuilder.curveTo(20.42f, 16.49f, 19.76f, 16.67f, 19.28f, 16.34f);
        pathBuilder.close();
        pathBuilder.moveTo(4.72f, 16.34f);
        pathBuilder.curveToRelative(-0.48f, 0.33f, -1.13f, 0.15f, -1.39f, -0.38f);
        pathBuilder.lineTo(3.1f, 15.49f);
        pathBuilder.curveToRelative(-0.15f, -0.32f, -0.13f, -0.7f, 0.06f, -1.0f);
        pathBuilder.lineToRelative(0.81f, -1.26f);
        pathBuilder.curveToRelative(0.38f, -0.59f, 1.22f, -0.59f, 1.6f, 0.0f);
        pathBuilder.curveTo(6.22f, 14.41f, 6.54f, 15.0f, 6.54f, 15.0f);
        pathBuilder.reflectiveCurveTo(5.93f, 15.45f, 4.72f, 16.34f);
        pathBuilder.close();
        pathBuilder.moveTo(15.36f, 9.37f);
        pathBuilder.curveToRelative(0.09f, -0.68f, 0.73f, -1.06f, 1.27f, -0.75f);
        pathBuilder.lineToRelative(1.59f, 0.9f);
        pathBuilder.curveToRelative(0.46f, 0.26f, 0.63f, 0.91f, 0.36f, 1.41f);
        pathBuilder.lineTo(16.5f, 15.0f);
        pathBuilder.horizontalLineToRelative(-1.8f);
        pathBuilder.lineTo(15.36f, 9.37f);
        pathBuilder.close();
        pathBuilder.moveTo(8.63f, 9.37f);
        pathBuilder.lineTo(9.3f, 15.0f);
        pathBuilder.horizontalLineTo(7.5f);
        pathBuilder.lineToRelative(-2.09f, -4.08f);
        pathBuilder.curveToRelative(-0.27f, -0.5f, -0.1f, -1.15f, 0.36f, -1.41f);
        pathBuilder.lineToRelative(1.59f, -0.9f);
        pathBuilder.curveTo(7.89f, 8.31f, 8.54f, 8.69f, 8.63f, 9.37f);
        pathBuilder.close();
        pathBuilder.moveTo(13.8f, 15.0f);
        pathBuilder.horizontalLineToRelative(-3.6f);
        pathBuilder.lineTo(9.46f, 8.12f);
        pathBuilder.curveTo(9.39f, 7.53f, 9.81f, 7.0f, 10.34f, 7.0f);
        pathBuilder.horizontalLineToRelative(3.3f);
        pathBuilder.curveToRelative(0.53f, 0.0f, 0.94f, 0.53f, 0.88f, 1.12f);
        pathBuilder.lineTo(13.8f, 15.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), iM24558getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bakeryDining = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
