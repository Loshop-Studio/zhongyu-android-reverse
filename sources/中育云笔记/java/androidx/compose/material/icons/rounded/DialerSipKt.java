package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.StrokeJoin;
import androidx.compose.p014ui.graphics.vector.ImageVector;
import androidx.compose.p014ui.graphics.vector.PathBuilder;
import androidx.compose.p014ui.graphics.vector.VectorKt;
import androidx.compose.p014ui.unit.C3186Dp;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class DialerSipKt {
    private static ImageVector _dialerSip;

    public static final ImageVector getDialerSip(Icons.Rounded rounded) {
        ImageVector imageVector = _dialerSip;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DialerSip", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.5f, 8.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder.close();
        pathBuilder.moveTo(12.5f, 7.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilder.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder.horizontalLineToRelative(1.95f);
        pathBuilder.curveToRelative(0.3f, 0.0f, 0.55f, -0.25f, 0.55f, -0.55f);
        pathBuilder.verticalLineToRelative(-1.9f);
        pathBuilder.curveToRelative(0.0f, -0.3f, -0.25f, -0.55f, -0.55f, -0.55f);
        pathBuilder.lineTo(13.0f, 5.0f);
        pathBuilder.lineTo(13.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder.reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder.horizontalLineToRelative(-1.95f);
        pathBuilder.curveToRelative(-0.3f, 0.0f, -0.55f, 0.25f, -0.55f, 0.55f);
        pathBuilder.verticalLineToRelative(1.89f);
        pathBuilder.curveToRelative(0.0f, 0.31f, 0.25f, 0.56f, 0.55f, 0.56f);
        pathBuilder.lineTo(14.0f, 6.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.close();
        pathBuilder.moveTo(20.45f, 3.0f);
        pathBuilder.horizontalLineToRelative(-1.89f);
        pathBuilder.curveToRelative(-0.31f, 0.0f, -0.56f, 0.25f, -0.56f, 0.55f);
        pathBuilder.lineTo(18.0f, 7.5f);
        pathBuilder.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder.reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder.lineTo(19.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(1.45f);
        pathBuilder.curveToRelative(0.3f, 0.0f, 0.55f, -0.25f, 0.55f, -0.55f);
        pathBuilder.verticalLineToRelative(-1.9f);
        pathBuilder.curveToRelative(0.0f, -0.3f, -0.25f, -0.55f, -0.55f, -0.55f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.lineTo(19.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.21f, 15.27f);
        pathBuilder.lineToRelative(-2.54f, -0.29f);
        pathBuilder.curveToRelative(-0.61f, -0.07f, -1.21f, 0.14f, -1.64f, 0.57f);
        pathBuilder.lineToRelative(-1.84f, 1.84f);
        pathBuilder.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        pathBuilder.lineToRelative(1.85f, -1.85f);
        pathBuilder.curveToRelative(0.43f, -0.43f, 0.64f, -1.04f, 0.57f, -1.64f);
        pathBuilder.lineToRelative(-0.29f, -2.52f);
        pathBuilder.curveToRelative(-0.11f, -1.01f, -0.97f, -1.78f, -1.98f, -1.78f);
        pathBuilder.lineTo(5.02f, 3.01f);
        pathBuilder.curveToRelative(-1.13f, 0.0f, -2.07f, 0.94f, -2.0f, 2.07f);
        pathBuilder.curveToRelative(0.53f, 8.54f, 7.36f, 15.36f, 15.89f, 15.89f);
        pathBuilder.curveToRelative(1.13f, 0.07f, 2.07f, -0.87f, 2.07f, -2.0f);
        pathBuilder.verticalLineToRelative(-1.73f);
        pathBuilder.curveToRelative(0.01f, -1.0f, -0.76f, -1.86f, -1.77f, -1.97f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dialerSip = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
