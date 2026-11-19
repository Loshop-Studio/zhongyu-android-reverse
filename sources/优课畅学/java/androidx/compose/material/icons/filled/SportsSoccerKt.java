package androidx.compose.material.icons.filled;

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

/* loaded from: classes.dex */
public final class SportsSoccerKt {
    private static ImageVector _sportsSoccer;

    public static final ImageVector getSportsSoccer(Icons.Filled filled) {
        ImageVector imageVector = _sportsSoccer;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SportsSoccer", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 5.3f);
        pathBuilder.lineToRelative(1.35f, -0.95f);
        pathBuilder.curveToRelative(1.82f, 0.56f, 3.37f, 1.76f, 4.38f, 3.34f);
        pathBuilder.lineToRelative(-0.39f, 1.34f);
        pathBuilder.lineToRelative(-1.35f, 0.46f);
        pathBuilder.lineTo(13.0f, 6.7f);
        pathBuilder.verticalLineTo(5.3f);
        pathBuilder.close();
        pathBuilder.moveTo(9.65f, 4.35f);
        pathBuilder.lineTo(11.0f, 5.3f);
        pathBuilder.verticalLineToRelative(1.4f);
        pathBuilder.lineTo(7.01f, 9.49f);
        pathBuilder.lineTo(5.66f, 9.03f);
        pathBuilder.lineTo(5.27f, 7.69f);
        pathBuilder.curveTo(6.28f, 6.12f, 7.83f, 4.92f, 9.65f, 4.35f);
        pathBuilder.close();
        pathBuilder.moveTo(7.08f, 17.11f);
        pathBuilder.lineToRelative(-1.14f, 0.1f);
        pathBuilder.curveTo(4.73f, 15.81f, 4.0f, 13.99f, 4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -0.12f, 0.01f, -0.23f, 0.02f, -0.35f);
        pathBuilder.lineToRelative(1.0f, -0.73f);
        pathBuilder.lineTo(6.4f, 11.4f);
        pathBuilder.lineToRelative(1.46f, 4.34f);
        pathBuilder.lineTo(7.08f, 17.11f);
        pathBuilder.close();
        pathBuilder.moveTo(14.5f, 19.59f);
        pathBuilder.curveTo(13.71f, 19.85f, 12.87f, 20.0f, 12.0f, 20.0f);
        pathBuilder.reflectiveCurveToRelative(-1.71f, -0.15f, -2.5f, -0.41f);
        pathBuilder.lineToRelative(-0.69f, -1.49f);
        pathBuilder.lineTo(9.45f, 17.0f);
        pathBuilder.horizontalLineToRelative(5.11f);
        pathBuilder.lineToRelative(0.64f, 1.11f);
        pathBuilder.lineTo(14.5f, 19.59f);
        pathBuilder.close();
        pathBuilder.moveTo(14.27f, 15.0f);
        pathBuilder.horizontalLineTo(9.73f);
        pathBuilder.lineToRelative(-1.35f, -4.02f);
        pathBuilder.lineTo(12.0f, 8.44f);
        pathBuilder.lineToRelative(3.63f, 2.54f);
        pathBuilder.lineTo(14.27f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.06f, 17.21f);
        pathBuilder.lineToRelative(-1.14f, -0.1f);
        pathBuilder.lineToRelative(-0.79f, -1.37f);
        pathBuilder.lineToRelative(1.46f, -4.34f);
        pathBuilder.lineToRelative(1.39f, -0.47f);
        pathBuilder.lineToRelative(1.0f, 0.73f);
        pathBuilder.curveTo(19.99f, 11.77f, 20.0f, 11.88f, 20.0f, 12.0f);
        pathBuilder.curveTo(20.0f, 13.99f, 19.27f, 15.81f, 18.06f, 17.21f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsSoccer = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
