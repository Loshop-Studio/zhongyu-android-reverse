package androidx.compose.material.icons.sharp;

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
public final class AppBlockingKt {
    private static ImageVector _appBlocking;

    public static final ImageVector getAppBlocking(Icons.Sharp sharp) {
        ImageVector imageVector = _appBlocking;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AppBlocking", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 8.0f);
        pathBuilder.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.curveTo(22.0f, 9.79f, 20.21f, 8.0f, 18.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilder.curveToRelative(0.42f, 0.0f, 0.8f, 0.11f, 1.15f, 0.29f);
        pathBuilder.lineToRelative(-3.36f, 3.36f);
        pathBuilder.curveTo(15.61f, 12.8f, 15.5f, 12.42f, 15.5f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 14.5f);
        pathBuilder.curveToRelative(-0.42f, 0.0f, -0.8f, -0.11f, -1.15f, -0.29f);
        pathBuilder.lineToRelative(3.36f, -3.36f);
        pathBuilder.curveToRelative(0.18f, 0.35f, 0.29f, 0.73f, 0.29f, 1.15f);
        pathBuilder.curveTo(20.5f, 13.38f, 19.38f, 14.5f, 18.0f, 14.5f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.0f, 23.0f);
        pathBuilder2.verticalLineToRelative(-6.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineToRelative(1.0f);
        pathBuilder2.horizontalLineTo(7.0f);
        pathBuilder2.verticalLineTo(6.0f);
        pathBuilder2.horizontalLineToRelative(10.0f);
        pathBuilder2.verticalLineToRelative(1.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineTo(0.94f);
        pathBuilder2.lineTo(5.0f, 1.0f);
        pathBuilder2.verticalLineToRelative(22.0f);
        pathBuilder2.horizontalLineTo(19.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _appBlocking = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
