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
public final class DoorbellKt {
    private static ImageVector _doorbell;

    public static final ImageVector getDoorbell(Icons.Rounded rounded) {
        ImageVector imageVector = _doorbell;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Doorbell", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.8f, 3.9f);
        pathBuilder.lineToRelative(-6.0f, 4.5f);
        pathBuilder.curveTo(4.3f, 8.78f, 4.0f, 9.37f, 4.0f, 10.0f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-9.0f);
        pathBuilder.curveToRelative(0.0f, -0.63f, -0.3f, -1.22f, -0.8f, -1.6f);
        pathBuilder.lineToRelative(-6.0f, -4.5f);
        pathBuilder.curveTo(12.49f, 3.37f, 11.51f, 3.37f, 10.8f, 3.9f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 17.5f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveTo(13.0f, 17.05f, 12.55f, 17.5f, 12.0f, 17.5f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 16.0f);
        pathBuilder.horizontalLineToRelative(-7.0f);
        pathBuilder.curveTo(8.22f, 16.0f, 8.0f, 15.78f, 8.0f, 15.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(8.0f, 15.22f, 8.22f, 15.0f, 8.5f, 15.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.verticalLineToRelative(-2.34f);
        pathBuilder.curveToRelative(0.0f, -1.54f, 0.82f, -2.82f, 2.25f, -3.16f);
        pathBuilder.verticalLineTo(9.25f);
        pathBuilder.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilder.reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.verticalLineTo(9.5f);
        pathBuilder.curveTo(14.19f, 9.84f, 15.0f, 11.12f, 15.0f, 12.66f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.horizontalLineToRelative(0.5f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(16.0f, 15.78f, 15.78f, 16.0f, 15.5f, 16.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doorbell = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
