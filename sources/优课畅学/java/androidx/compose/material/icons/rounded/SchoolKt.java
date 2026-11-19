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
public final class SchoolKt {
    private static ImageVector _school;

    public static final ImageVector getSchool(Icons.Rounded rounded) {
        ImageVector imageVector = _school;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.School", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 13.18f);
        pathBuilder.verticalLineToRelative(2.81f);
        pathBuilder.curveToRelative(0.0f, 0.73f, 0.4f, 1.41f, 1.04f, 1.76f);
        pathBuilder.lineToRelative(5.0f, 2.73f);
        pathBuilder.curveToRelative(0.6f, 0.33f, 1.32f, 0.33f, 1.92f, 0.0f);
        pathBuilder.lineToRelative(5.0f, -2.73f);
        pathBuilder.curveToRelative(0.64f, -0.35f, 1.04f, -1.03f, 1.04f, -1.76f);
        pathBuilder.verticalLineToRelative(-2.81f);
        pathBuilder.lineToRelative(-6.04f, 3.3f);
        pathBuilder.curveToRelative(-0.6f, 0.33f, -1.32f, 0.33f, -1.92f, 0.0f);
        pathBuilder.lineTo(5.0f, 13.18f);
        pathBuilder.close();
        pathBuilder.moveTo(11.04f, 3.52f);
        pathBuilder.lineToRelative(-8.43f, 4.6f);
        pathBuilder.curveToRelative(-0.69f, 0.38f, -0.69f, 1.38f, 0.0f, 1.76f);
        pathBuilder.lineToRelative(8.43f, 4.6f);
        pathBuilder.curveToRelative(0.6f, 0.33f, 1.32f, 0.33f, 1.92f, 0.0f);
        pathBuilder.lineTo(21.0f, 10.09f);
        pathBuilder.lineTo(21.0f, 16.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.lineTo(23.0f, 9.59f);
        pathBuilder.curveToRelative(0.0f, -0.37f, -0.2f, -0.7f, -0.52f, -0.88f);
        pathBuilder.lineToRelative(-9.52f, -5.19f);
        pathBuilder.curveToRelative(-0.6f, -0.32f, -1.32f, -0.32f, -1.92f, 0.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _school = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
