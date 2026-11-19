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
public final class OpenInNewOffKt {
    private static ImageVector _openInNewOff;

    public static final ImageVector getOpenInNewOff(Icons.Rounded rounded) {
        ImageVector imageVector = _openInNewOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.OpenInNewOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.79f, 5.8f);
        pathBuilder.lineToRelative(-1.94f, -1.94f);
        pathBuilder.curveTo(14.54f, 3.54f, 14.76f, 3.0f, 15.21f, 3.0f);
        pathBuilder.horizontalLineToRelative(5.29f);
        pathBuilder.curveTo(20.78f, 3.0f, 21.0f, 3.22f, 21.0f, 3.5f);
        pathBuilder.verticalLineToRelative(5.29f);
        pathBuilder.curveToRelative(0.0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.35f);
        pathBuilder.lineTo(18.21f, 7.2f);
        pathBuilder.lineToRelative(-4.09f, 4.09f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineTo(16.79f, 5.8f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 13.0f);
        pathBuilder.verticalLineToRelative(3.17f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.curveTo(19.45f, 12.0f, 19.0f, 12.45f, 19.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.07f, 21.9f);
        pathBuilder.lineToRelative(-0.9f, -0.9f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(5.83f);
        pathBuilder.lineToRelative(-0.9f, -0.9f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(16.97f, 16.97f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(20.09f, 22.29f, 19.46f, 22.29f, 19.07f, 21.9f);
        pathBuilder.close();
        pathBuilder.moveTo(16.17f, 19.0f);
        pathBuilder.lineToRelative(-4.88f, -4.88f);
        pathBuilder.lineTo(10.41f, 15.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(0.88f, -0.88f);
        pathBuilder.lineTo(5.0f, 7.83f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineTo(16.17f);
        pathBuilder.close();
        pathBuilder.moveTo(7.83f, 5.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(5.83f);
        pathBuilder.lineTo(7.83f, 5.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _openInNewOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
