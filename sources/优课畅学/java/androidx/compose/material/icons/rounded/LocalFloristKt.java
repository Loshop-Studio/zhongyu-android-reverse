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
public final class LocalFloristKt {
    private static ImageVector _localFlorist;

    public static final ImageVector getLocalFlorist(Icons.Rounded rounded) {
        ImageVector imageVector = _localFlorist;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalFlorist", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 22.0f);
        pathBuilder.curveToRelative(4.56f, 0.0f, 8.33f, -3.4f, 8.92f, -7.8f);
        pathBuilder.curveToRelative(0.09f, -0.64f, -0.48f, -1.21f, -1.12f, -1.12f);
        pathBuilder.curveToRelative(-4.4f, 0.59f, -7.8f, 4.36f, -7.8f, 8.92f);
        pathBuilder.close();
        pathBuilder.moveTo(5.6f, 10.25f);
        pathBuilder.curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        pathBuilder.curveToRelative(0.53f, 0.0f, 1.01f, -0.16f, 1.42f, -0.44f);
        pathBuilder.lineToRelative(-0.02f, 0.19f);
        pathBuilder.curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        pathBuilder.reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilder.lineToRelative(-0.02f, -0.19f);
        pathBuilder.curveToRelative(0.4f, 0.28f, 0.89f, 0.44f, 1.42f, 0.44f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilder.curveToRelative(0.0f, -1.0f, -0.59f, -1.85f, -1.43f, -2.25f);
        pathBuilder.curveToRelative(0.84f, -0.4f, 1.43f, -1.25f, 1.43f, -2.25f);
        pathBuilder.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilder.curveToRelative(-0.53f, 0.0f, -1.01f, 0.16f, -1.42f, 0.44f);
        pathBuilder.lineToRelative(0.02f, -0.19f);
        pathBuilder.curveTo(14.5f, 2.12f, 13.38f, 1.0f, 12.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(9.5f, 2.12f, 9.5f, 3.5f);
        pathBuilder.lineToRelative(0.02f, 0.19f);
        pathBuilder.curveToRelative(-0.4f, -0.28f, -0.89f, -0.44f, -1.42f, -0.44f);
        pathBuilder.curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f);
        pathBuilder.curveToRelative(0.0f, 1.0f, 0.59f, 1.85f, 1.43f, 2.25f);
        pathBuilder.curveToRelative(-0.84f, 0.4f, -1.43f, 1.25f, -1.43f, 2.25f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 5.5f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder.reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f);
        pathBuilder.reflectiveCurveTo(9.5f, 9.38f, 9.5f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilder.close();
        pathBuilder.moveTo(3.08f, 14.2f);
        pathBuilder.curveTo(3.67f, 18.6f, 7.44f, 22.0f, 12.0f, 22.0f);
        pathBuilder.curveToRelative(0.0f, -4.56f, -3.4f, -8.33f, -7.8f, -8.92f);
        pathBuilder.curveToRelative(-0.64f, -0.09f, -1.21f, 0.48f, -1.12f, 1.12f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localFlorist = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
