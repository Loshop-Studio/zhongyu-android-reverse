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
public final class BrowserNotSupportedKt {
    private static ImageVector _browserNotSupported;

    public static final ImageVector getBrowserNotSupported(Icons.Rounded rounded) {
        ImageVector imageVector = _browserNotSupported;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BrowserNotSupported", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 6.0f);
        pathBuilder.verticalLineToRelative(10.5f);
        pathBuilder.lineToRelative(1.95f, 1.95f);
        pathBuilder.curveTo(20.98f, 18.3f, 21.0f, 18.15f, 21.0f, 18.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(6.5f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(3.86f, 3.95f);
        pathBuilder2.curveToRelative(-0.35f, -0.35f, -0.92f, -0.35f, -1.27f, 0.0f);
        pathBuilder2.curveToRelative(-0.35f, 0.35f, -0.35f, 0.92f, 0.0f, 1.27f);
        pathBuilder2.lineTo(3.0f, 5.64f);
        pathBuilder2.lineTo(3.0f, 18.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(12.36f);
        pathBuilder2.lineToRelative(1.42f, 1.42f);
        pathBuilder2.curveToRelative(0.35f, 0.35f, 0.92f, 0.35f, 1.27f, 0.0f);
        pathBuilder2.curveToRelative(0.35f, -0.35f, 0.35f, -0.92f, 0.0f, -1.27f);
        pathBuilder2.lineTo(3.86f, 3.95f);
        pathBuilder2.close();
        pathBuilder2.moveTo(5.0f, 18.0f);
        pathBuilder2.verticalLineTo(7.64f);
        pathBuilder2.lineTo(15.36f, 18.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _browserNotSupported = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
