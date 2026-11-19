package androidx.compose.material.icons.outlined;

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
public final class NoFlashKt {
    private static ImageVector _noFlash;

    public static final ImageVector getNoFlash(Icons.Outlined outlined) {
        ImageVector imageVector = _noFlash;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NoFlash", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.4f, 5.6f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.lineTo(19.0f, 11.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.lineTo(20.4f, 5.6f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 11.4f);
        pathBuilder.lineToRelative(0.0f, 1.77f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.curveToRelative(0.0f, -0.88f, -0.72f, -1.6f, -1.6f, -1.6f);
        pathBuilder.horizontalLineToRelative(-2.54f);
        pathBuilder.lineTo(12.58f, 8.0f);
        pathBuilder.horizontalLineToRelative(-1.75f);
        pathBuilder.lineToRelative(3.4f, 3.4f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.1f, 2.1f);
        pathBuilder.lineTo(0.69f, 3.51f);
        pathBuilder.lineToRelative(5.66f, 5.66f);
        pathBuilder.lineTo(6.14f, 9.4f);
        pathBuilder.horizontalLineTo(3.6f);
        pathBuilder.curveTo(2.72f, 9.4f, 2.0f, 10.12f, 2.0f, 11.0f);
        pathBuilder.verticalLineToRelative(9.4f);
        pathBuilder.curveTo(2.0f, 21.28f, 2.72f, 22.0f, 3.6f, 22.0f);
        pathBuilder.horizontalLineToRelative(12.8f);
        pathBuilder.curveToRelative(0.75f, 0.0f, 1.38f, -0.52f, 1.55f, -1.22f);
        pathBuilder.lineToRelative(2.54f, 2.54f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(2.1f, 2.1f);
        pathBuilder.close();
        pathBuilder.moveTo(11.5f, 15.5f);
        pathBuilder.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(9.17f, 14.0f, 10.0f, 14.0f);
        pathBuilder.reflectiveCurveTo(11.5f, 14.67f, 11.5f, 15.5f);
        pathBuilder.close();
        pathBuilder.moveTo(15.96f, 20.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(-8.6f);
        pathBuilder.horizontalLineToRelative(2.14f);
        pathBuilder.horizontalLineToRelative(0.88f);
        pathBuilder.lineToRelative(0.59f, -0.65f);
        pathBuilder.lineToRelative(0.15f, -0.16f);
        pathBuilder.lineToRelative(1.5f, 1.5f);
        pathBuilder.curveTo(7.68f, 12.43f, 6.5f, 13.82f, 6.5f, 15.5f);
        pathBuilder.curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f);
        pathBuilder.curveToRelative(1.68f, 0.0f, 3.07f, -1.18f, 3.42f, -2.76f);
        pathBuilder.lineToRelative(2.55f, 2.55f);
        pathBuilder.lineTo(15.96f, 20.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noFlash = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
