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
public final class PsychologyAltKt {
    private static ImageVector _psychologyAlt;

    public static final ImageVector getPsychologyAlt(Icons.Rounded rounded) {
        ImageVector imageVector = _psychologyAlt;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PsychologyAlt", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.94f, 9.06f);
        pathBuilder.curveTo(19.5f, 5.73f, 16.57f, 3.0f, 13.0f, 3.0f);
        pathBuilder.curveTo(9.47f, 3.0f, 6.57f, 5.61f, 6.08f, 9.0f);
        pathBuilder.lineToRelative(-1.93f, 3.48f);
        pathBuilder.curveTo(3.74f, 13.14f, 4.22f, 14.0f, 5.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.lineToRelative(0.0f, 2.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.lineToRelative(0.0f, -3.68f);
        pathBuilder.curveTo(18.62f, 15.07f, 20.35f, 12.24f, 19.94f, 9.06f);
        pathBuilder.close();
        pathBuilder.moveTo(12.5f, 14.0f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.74f, -0.33f, -0.74f, -0.74f);
        pathBuilder.curveToRelative(0.0f, -0.41f, 0.33f, -0.73f, 0.74f, -0.73f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.73f, 0.32f, 0.73f, 0.73f);
        pathBuilder.curveTo(13.23f, 13.67f, 12.92f, 14.0f, 12.5f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.26f, 9.68f);
        pathBuilder.curveToRelative(-0.44f, 0.65f, -0.86f, 0.85f, -1.09f, 1.27f);
        pathBuilder.curveToRelative(-0.09f, 0.17f, -0.13f, 0.28f, -0.13f, 0.82f);
        pathBuilder.horizontalLineToRelative(-1.06f);
        pathBuilder.curveToRelative(0.0f, -0.29f, -0.04f, -0.75f, 0.18f, -1.16f);
        pathBuilder.curveToRelative(0.28f, -0.51f, 0.83f, -0.81f, 1.14f, -1.26f);
        pathBuilder.curveToRelative(0.33f, -0.47f, 0.15f, -1.36f, -0.8f, -1.36f);
        pathBuilder.curveToRelative(-0.62f, 0.0f, -0.92f, 0.47f, -1.05f, 0.86f);
        pathBuilder.lineToRelative(-0.96f, -0.4f);
        pathBuilder.curveTo(10.76f, 7.67f, 11.46f, 7.0f, 12.5f, 7.0f);
        pathBuilder.curveToRelative(0.86f, 0.0f, 1.45f, 0.39f, 1.75f, 0.88f);
        pathBuilder.curveTo(14.51f, 8.31f, 14.66f, 9.1f, 14.26f, 9.68f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _psychologyAlt = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
