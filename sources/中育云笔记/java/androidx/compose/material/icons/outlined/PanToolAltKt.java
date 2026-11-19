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
public final class PanToolAltKt {
    private static ImageVector _panToolAlt;

    public static final ImageVector getPanToolAlt(Icons.Outlined outlined) {
        ImageVector imageVector = _panToolAlt;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PanToolAlt", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.89f, 11.77f);
        pathBuilder.lineToRelative(-3.8f, -1.67f);
        pathBuilder.curveTo(14.96f, 10.04f, 14.81f, 10.0f, 14.65f, 10.0f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.verticalLineTo(5.5f);
        pathBuilder.curveTo(14.0f, 4.12f, 12.88f, 3.0f, 11.5f, 3.0f);
        pathBuilder.reflectiveCurveTo(9.0f, 4.12f, 9.0f, 5.5f);
        pathBuilder.verticalLineToRelative(8.15f);
        pathBuilder.lineToRelative(-1.87f, -0.4f);
        pathBuilder.curveToRelative(-0.19f, -0.03f, -1.02f, -0.15f, -1.73f, 0.56f);
        pathBuilder.lineTo(4.0f, 15.22f);
        pathBuilder.lineToRelative(5.12f, 5.19f);
        pathBuilder.curveTo(9.49f, 20.79f, 10.0f, 21.0f, 10.53f, 21.0f);
        pathBuilder.horizontalLineToRelative(6.55f);
        pathBuilder.curveToRelative(0.98f, 0.0f, 1.81f, -0.7f, 1.97f, -1.67f);
        pathBuilder.lineToRelative(0.92f, -5.44f);
        pathBuilder.curveTo(20.12f, 13.03f, 19.68f, 12.17f, 18.89f, 11.77f);
        pathBuilder.close();
        pathBuilder.moveTo(17.08f, 19.0f);
        pathBuilder.horizontalLineToRelative(-6.55f);
        pathBuilder.lineToRelative(-3.7f, -3.78f);
        pathBuilder.lineTo(11.0f, 16.11f);
        pathBuilder.verticalLineTo(5.5f);
        pathBuilder.curveTo(11.0f, 5.22f, 11.22f, 5.0f, 11.5f, 5.0f);
        pathBuilder.reflectiveCurveTo(12.0f, 5.22f, 12.0f, 5.5f);
        pathBuilder.verticalLineToRelative(6.18f);
        pathBuilder.horizontalLineToRelative(1.76f);
        pathBuilder.lineTo(18.0f, 13.56f);
        pathBuilder.lineTo(17.08f, 19.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panToolAlt = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
