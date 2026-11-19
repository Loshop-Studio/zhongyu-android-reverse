package androidx.compose.material.icons.rounded;

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
public final class SportsGymnasticsKt {
    private static ImageVector _sportsGymnastics;

    public static final ImageVector getSportsGymnastics(Icons.Rounded rounded) {
        ImageVector imageVector = _sportsGymnastics;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SportsGymnastics", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(7.1f, 8.0f, 6.0f, 8.0f);
        pathBuilder.reflectiveCurveTo(4.0f, 7.1f, 4.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 22.0f);
        pathBuilder.curveToRelative(-0.56f, 0.0f, -1.02f, -0.44f, -1.05f, -1.0f);
        pathBuilder.lineToRelative(-0.45f, -9.0f);
        pathBuilder.lineTo(8.0f, 11.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.lineToRelative(6.26f, -4.47f);
        pathBuilder.curveToRelative(0.42f, -0.3f, 1.0f, -0.23f, 1.34f, 0.16f);
        pathBuilder.curveToRelative(0.38f, 0.45f, 0.3f, 1.12f, -0.18f, 1.46f);
        pathBuilder.lineTo(11.14f, 8.5f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.lineToRelative(7.09f, -4.09f);
        pathBuilder.curveToRelative(0.41f, -0.24f, 0.93f, -0.15f, 1.24f, 0.21f);
        pathBuilder.curveToRelative(0.36f, 0.43f, 0.3f, 1.07f, -0.14f, 1.41f);
        pathBuilder.lineTo(14.5f, 12.0f);
        pathBuilder.lineToRelative(-0.45f, 9.0f);
        pathBuilder.curveTo(14.02f, 21.56f, 13.56f, 22.0f, 13.0f, 22.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsGymnastics = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
