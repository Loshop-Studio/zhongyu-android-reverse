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
public final class SpaKt {
    private static ImageVector _spa;

    public static final ImageVector getSpa(Icons.Sharp sharp) {
        ImageVector imageVector = _spa;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Spa", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.55f, 12.0f);
        pathBuilder.curveToRelative(-1.07f, -0.71f, -2.25f, -1.27f, -3.53f, -1.61f);
        pathBuilder.curveToRelative(1.28f, 0.34f, 2.46f, 0.9f, 3.53f, 1.61f);
        pathBuilder.close();
        pathBuilder.moveTo(18.98f, 10.39f);
        pathBuilder.curveToRelative(-1.29f, 0.34f, -2.49f, 0.91f, -3.57f, 1.64f);
        pathBuilder.curveToRelative(1.08f, -0.73f, 2.28f, -1.3f, 3.57f, -1.64f);
        pathBuilder.close();
        pathBuilder.moveTo(15.49f, 9.63f);
        pathBuilder.curveToRelative(-0.18f, -2.79f, -1.31f, -5.51f, -3.43f, -7.63f);
        pathBuilder.curveToRelative(-2.14f, 2.14f, -3.32f, 4.86f, -3.55f, 7.63f);
        pathBuilder.curveToRelative(1.28f, 0.68f, 2.46f, 1.56f, 3.49f, 2.63f);
        pathBuilder.curveToRelative(1.03f, -1.06f, 2.21f, -1.94f, 3.49f, -2.63f);
        pathBuilder.close();
        pathBuilder.moveTo(8.99f, 12.28f);
        pathBuilder.curveToRelative(-0.14f, -0.1f, -0.3f, -0.19f, -0.45f, -0.29f);
        pathBuilder.curveToRelative(0.15f, 0.11f, 0.31f, 0.19f, 0.45f, 0.29f);
        pathBuilder.close();
        pathBuilder.moveTo(15.41f, 12.03f);
        pathBuilder.curveToRelative(-0.13f, 0.09f, -0.27f, 0.16f, -0.4f, 0.26f);
        pathBuilder.curveToRelative(0.13f, -0.1f, 0.27f, -0.17f, 0.4f, -0.26f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 15.45f);
        pathBuilder.curveTo(9.85f, 12.17f, 6.18f, 10.0f, 2.0f, 10.0f);
        pathBuilder.curveToRelative(0.0f, 5.32f, 3.36f, 9.82f, 8.03f, 11.49f);
        pathBuilder.curveToRelative(0.63f, 0.23f, 1.29f, 0.4f, 1.97f, 0.51f);
        pathBuilder.curveToRelative(0.68f, -0.12f, 1.33f, -0.29f, 1.97f, -0.51f);
        pathBuilder.curveTo(18.64f, 19.82f, 22.0f, 15.32f, 22.0f, 10.0f);
        pathBuilder.curveToRelative(-4.18f, 0.0f, -7.85f, 2.17f, -10.0f, 5.45f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _spa = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
