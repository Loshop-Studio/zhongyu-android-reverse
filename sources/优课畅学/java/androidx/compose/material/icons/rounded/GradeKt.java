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
public final class GradeKt {
    private static ImageVector _grade;

    public static final ImageVector getGrade(Icons.Rounded rounded) {
        ImageVector imageVector = _grade;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Grade", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 17.27f);
        pathBuilder.lineToRelative(5.17f, 3.12f);
        pathBuilder.curveToRelative(0.38f, 0.23f, 0.85f, -0.11f, 0.75f, -0.54f);
        pathBuilder.lineToRelative(-1.37f, -5.88f);
        pathBuilder.lineToRelative(4.56f, -3.95f);
        pathBuilder.curveToRelative(0.33f, -0.29f, 0.16f, -0.84f, -0.29f, -0.88f);
        pathBuilder.lineToRelative(-6.01f, -0.51f);
        pathBuilder.lineToRelative(-2.35f, -5.54f);
        pathBuilder.curveToRelative(-0.17f, -0.41f, -0.75f, -0.41f, -0.92f, 0.0f);
        pathBuilder.lineTo(9.19f, 8.63f);
        pathBuilder.lineToRelative(-6.01f, 0.51f);
        pathBuilder.curveToRelative(-0.44f, 0.04f, -0.62f, 0.59f, -0.28f, 0.88f);
        pathBuilder.lineToRelative(4.56f, 3.95f);
        pathBuilder.lineToRelative(-1.37f, 5.88f);
        pathBuilder.curveToRelative(-0.1f, 0.43f, 0.37f, 0.77f, 0.75f, 0.54f);
        pathBuilder.lineTo(12.0f, 17.27f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _grade = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
