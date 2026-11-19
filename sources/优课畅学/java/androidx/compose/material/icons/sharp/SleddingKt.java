package androidx.compose.material.icons.sharp;

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
public final class SleddingKt {
    private static ImageVector _sledding;

    public static final ImageVector getSledding(Icons.Sharp sharp) {
        ImageVector imageVector = _sledding;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Sledding", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 4.5f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(14.0f, 3.4f, 14.0f, 4.5f);
        pathBuilder.close();
        pathBuilder.moveTo(17.22f, 17.9f);
        pathBuilder.lineToRelative(1.93f, 0.63f);
        pathBuilder.lineToRelative(-0.46f, 1.43f);
        pathBuilder.lineToRelative(-3.32f, -1.08f);
        pathBuilder.lineTo(14.9f, 20.3f);
        pathBuilder.lineToRelative(3.32f, 1.08f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(1.31f, 0.43f, 2.72f, -0.29f, 3.15f, -1.61f);
        pathBuilder.curveToRelative(0.43f, -1.31f, -0.29f, -2.72f, -1.61f, -3.15f);
        pathBuilder.lineToRelative(0.46f, -1.43f);
        pathBuilder.curveToRelative(2.1f, 0.68f, 3.25f, 2.94f, 2.57f, 5.04f);
        pathBuilder.curveToRelative(-0.68f, 2.1f, -2.94f, 3.25f, -5.04f, 2.57f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(1.0f, 17.36f);
        pathBuilder.lineToRelative(0.46f, -1.43f);
        pathBuilder.lineToRelative(3.93f, 1.28f);
        pathBuilder.lineToRelative(0.46f, -1.43f);
        pathBuilder.lineTo(1.93f, 14.5f);
        pathBuilder.lineToRelative(0.46f, -1.43f);
        pathBuilder.lineTo(4.0f, 13.6f);
        pathBuilder.verticalLineTo(9.5f);
        pathBuilder.lineToRelative(5.47f, -2.35f);
        pathBuilder.curveToRelative(0.39f, -0.17f, 0.84f, -0.21f, 1.28f, -0.07f);
        pathBuilder.curveToRelative(0.95f, 0.31f, 1.46f, 1.32f, 1.16f, 2.27f);
        pathBuilder.lineToRelative(-1.05f, 3.24f);
        pathBuilder.lineTo(14.5f, 12.0f);
        pathBuilder.lineTo(17.22f, 17.9f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 14.25f);
        pathBuilder.lineToRelative(0.48f, 0.16f);
        pathBuilder.lineToRelative(0.75f, -2.31f);
        pathBuilder.lineTo(7.92f, 10.0f);
        pathBuilder.lineTo(6.0f, 10.82f);
        pathBuilder.verticalLineTo(14.25f);
        pathBuilder.close();
        pathBuilder.moveTo(13.94f, 18.41f);
        pathBuilder.lineToRelative(-6.66f, -2.16f);
        pathBuilder.lineToRelative(-0.46f, 1.43f);
        pathBuilder.lineToRelative(6.66f, 2.16f);
        pathBuilder.lineTo(13.94f, 18.41f);
        pathBuilder.close();
        pathBuilder.moveTo(14.63f, 17.05f);
        pathBuilder.lineToRelative(-1.18f, -2.56f);
        pathBuilder.lineToRelative(-3.97f, 0.89f);
        pathBuilder.lineTo(14.63f, 17.05f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sledding = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
