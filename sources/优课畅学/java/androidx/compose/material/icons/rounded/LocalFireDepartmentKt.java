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
public final class LocalFireDepartmentKt {
    private static ImageVector _localFireDepartment;

    public static final ImageVector getLocalFireDepartment(Icons.Rounded rounded) {
        ImageVector imageVector = _localFireDepartment;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalFireDepartment", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM24629getButtKaPHkGw = companion2.m24629getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM24639getBevelLxFBmk8 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 12.9f);
        pathBuilder.lineToRelative(-2.03f, 2.0f);
        pathBuilder.curveToRelative(-0.46f, 0.46f, -0.82f, 1.03f, -0.93f, 1.67f);
        pathBuilder.curveTo(8.74f, 18.41f, 10.18f, 20.0f, 12.0f, 20.0f);
        pathBuilder.reflectiveCurveToRelative(3.26f, -1.59f, 2.96f, -3.42f);
        pathBuilder.curveToRelative(-0.11f, -0.64f, -0.46f, -1.22f, -0.93f, -1.67f);
        pathBuilder.lineTo(12.0f, 12.9f);
        pathBuilder.close();
        ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw2 = companion2.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk82 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(15.56f, 6.55f);
        pathBuilder2.lineTo(15.56f, 6.55f);
        pathBuilder2.curveTo(14.38f, 8.02f, 12.0f, 7.19f, 12.0f, 5.3f);
        pathBuilder2.verticalLineTo(3.77f);
        pathBuilder2.curveToRelative(0.0f, -0.8f, -0.89f, -1.28f, -1.55f, -0.84f);
        pathBuilder2.curveTo(8.12f, 4.49f, 4.0f, 7.97f, 4.0f, 13.0f);
        pathBuilder2.curveToRelative(0.0f, 2.92f, 1.56f, 5.47f, 3.89f, 6.86f);
        pathBuilder2.curveToRelative(-0.71f, -1.02f, -1.06f, -2.31f, -0.81f, -3.68f);
        pathBuilder2.curveToRelative(0.19f, -1.04f, 0.75f, -1.98f, 1.51f, -2.72f);
        pathBuilder2.lineToRelative(2.71f, -2.67f);
        pathBuilder2.curveToRelative(0.39f, -0.38f, 1.01f, -0.38f, 1.4f, 0.0f);
        pathBuilder2.lineToRelative(2.73f, 2.69f);
        pathBuilder2.curveToRelative(0.74f, 0.73f, 1.3f, 1.65f, 1.48f, 2.68f);
        pathBuilder2.curveToRelative(0.25f, 1.36f, -0.07f, 2.64f, -0.77f, 3.66f);
        pathBuilder2.curveToRelative(1.89f, -1.15f, 3.29f, -3.06f, 3.71f, -5.3f);
        pathBuilder2.curveToRelative(0.61f, -3.27f, -0.81f, -6.37f, -3.22f, -8.1f);
        pathBuilder2.curveTo(16.3f, 6.17f, 15.83f, 6.22f, 15.56f, 6.55f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw2, iM24639getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localFireDepartment = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
