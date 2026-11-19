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
public final class GrassKt {
    private static ImageVector _grass;

    public static final ImageVector getGrass(Icons.Rounded rounded) {
        ImageVector imageVector = _grass;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Grass", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.64f, 11.02f);
        pathBuilder.curveToRelative(0.55f, -1.47f, 1.43f, -2.78f, 2.56f, -3.83f);
        pathBuilder.curveToRelative(0.38f, -0.36f, 0.04f, -1.0f, -0.46f, -0.85f);
        pathBuilder.curveToRelative(-3.32f, 0.98f, -5.75f, 4.05f, -5.74f, 7.69f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.curveTo(12.95f, 12.75f, 14.2f, 11.72f, 15.64f, 11.02f);
        pathBuilder.close();
        pathBuilder.moveTo(11.42f, 8.85f);
        pathBuilder.curveToRelative(-0.6f, -1.56f, -1.63f, -2.91f, -2.96f, -3.87f);
        pathBuilder.curveTo(8.04f, 4.68f, 7.5f, 5.17f, 7.74f, 5.63f);
        pathBuilder.curveTo(8.54f, 7.15f, 9.0f, 8.88f, 9.0f, 10.71f);
        pathBuilder.curveToRelative(0.0f, 0.21f, -0.03f, 0.41f, -0.04f, 0.61f);
        pathBuilder.curveToRelative(0.43f, 0.24f, 0.83f, 0.52f, 1.22f, 0.82f);
        pathBuilder.curveTo(10.39f, 10.96f, 10.83f, 9.85f, 11.42f, 8.85f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(4.75f);
        pathBuilder.curveToRelative(-0.57f, -2.19f, -2.04f, -4.02f, -4.0f, -5.06f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.16f, -0.08f, -0.26f, -0.25f, -0.26f, -0.44f);
        pathBuilder.curveToRelative(0.0f, -0.27f, 0.22f, -0.49f, 0.49f, -0.5f);
        pathBuilder.curveToRelative(0.01f, 0.0f, 0.02f, 0.0f, 0.02f, 0.0f);
        pathBuilder.curveTo(8.42f, 12.0f, 12.0f, 15.58f, 12.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.26f, 12.94f);
        pathBuilder.lineTo(20.26f, 12.94f);
        pathBuilder.curveToRelative(-1.96f, 1.04f, -3.44f, 2.87f, -4.0f, 5.06f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(-5.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -0.68f, -0.07f, -1.35f, -0.2f, -2.0f);
        pathBuilder.curveToRelative(-0.15f, -0.72f, -0.38f, -1.42f, -0.67f, -2.07f);
        pathBuilder.curveTo(14.52f, 13.58f, 17.07f, 12.0f, 20.0f, 12.0f);
        pathBuilder.curveToRelative(0.01f, 0.0f, 0.02f, 0.0f, 0.02f, 0.0f);
        pathBuilder.curveToRelative(0.27f, 0.0f, 0.49f, 0.23f, 0.49f, 0.5f);
        pathBuilder.curveTo(20.52f, 12.69f, 20.41f, 12.85f, 20.26f, 12.94f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _grass = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
