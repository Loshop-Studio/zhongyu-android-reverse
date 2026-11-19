package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class ColorizeKt {
    private static ImageVector _colorize;

    public static final ImageVector getColorize(Icons.TwoTone twoTone) {
        ImageVector imageVector = _colorize;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Colorize", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.896f, 9.023f);
        pathBuilder.lineToRelative(-0.92f, -0.92f);
        pathBuilder.lineTo(17.67f, 5.41f);
        pathBuilder.lineToRelative(0.92f, 0.92f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.71f, 5.63f);
        pathBuilder2.lineToRelative(-2.34f, -2.34f);
        pathBuilder2.curveToRelative(-0.2f, -0.2f, -0.45f, -0.29f, -0.71f, -0.29f);
        pathBuilder2.reflectiveCurveToRelative(-0.51f, 0.1f, -0.7f, 0.29f);
        pathBuilder2.lineToRelative(-3.12f, 3.12f);
        pathBuilder2.lineToRelative(-1.93f, -1.91f);
        pathBuilder2.lineToRelative(-1.41f, 1.41f);
        pathBuilder2.lineToRelative(1.42f, 1.42f);
        pathBuilder2.lineTo(3.0f, 16.25f);
        pathBuilder2.lineTo(3.0f, 21.0f);
        pathBuilder2.horizontalLineToRelative(4.75f);
        pathBuilder2.lineToRelative(8.92f, -8.92f);
        pathBuilder2.lineToRelative(1.42f, 1.42f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineToRelative(-1.92f, -1.92f);
        pathBuilder2.lineToRelative(3.12f, -3.12f);
        pathBuilder2.curveToRelative(0.4f, -0.4f, 0.4f, -1.03f, 0.01f, -1.42f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.92f, 19.0f);
        pathBuilder2.lineTo(5.0f, 17.08f);
        pathBuilder2.lineToRelative(8.06f, -8.06f);
        pathBuilder2.lineToRelative(1.92f, 1.92f);
        pathBuilder2.lineTo(6.92f, 19.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.9f, 9.03f);
        pathBuilder2.lineToRelative(-0.93f, -0.93f);
        pathBuilder2.lineToRelative(2.69f, -2.69f);
        pathBuilder2.lineToRelative(0.92f, 0.92f);
        pathBuilder2.lineToRelative(-2.68f, 2.7f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _colorize = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
