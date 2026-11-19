package androidx.compose.material.icons.outlined;

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
public final class BiotechKt {
    private static ImageVector _biotech;

    public static final ImageVector getBiotech(Icons.Outlined outlined) {
        ImageVector imageVector = _biotech;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Biotech", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.0f, 19.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.curveToRelative(0.0f, -1.09f, 0.59f, -2.04f, 1.47f, -2.57f);
        pathBuilder.curveToRelative(0.41f, 0.59f, 1.06f, 1.0f, 1.83f, 1.06f);
        pathBuilder.curveToRelative(0.7f, 0.06f, 1.36f, -0.19f, 1.85f, -0.62f);
        pathBuilder.lineToRelative(0.59f, 1.61f);
        pathBuilder.lineToRelative(0.94f, -0.34f);
        pathBuilder.lineToRelative(0.34f, 0.94f);
        pathBuilder.lineToRelative(1.88f, -0.68f);
        pathBuilder.lineToRelative(-0.34f, -0.94f);
        pathBuilder.lineToRelative(0.94f, -0.34f);
        pathBuilder.lineTo(13.76f, 2.6f);
        pathBuilder.lineToRelative(-0.94f, 0.34f);
        pathBuilder.lineTo(12.48f, 2.0f);
        pathBuilder.lineTo(10.6f, 2.68f);
        pathBuilder.lineToRelative(0.34f, 0.94f);
        pathBuilder.lineTo(10.0f, 3.97f);
        pathBuilder.lineToRelative(0.56f, 1.55f);
        pathBuilder.curveTo(9.39f, 5.48f, 8.37f, 6.27f, 8.08f, 7.38f);
        pathBuilder.curveTo(6.27f, 8.14f, 5.0f, 9.92f, 5.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.86f, 4.52f);
        pathBuilder.lineToRelative(1.71f, 4.7f);
        pathBuilder.lineToRelative(-0.94f, 0.34f);
        pathBuilder.lineToRelative(-1.71f, -4.7f);
        pathBuilder.lineTo(12.86f, 4.52f);
        pathBuilder.close();
        pathBuilder.moveTo(10.5f, 7.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveTo(9.5f, 7.45f, 9.95f, 7.0f, 10.5f, 7.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _biotech = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
