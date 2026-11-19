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
public final class MarkEmailReadKt {
    private static ImageVector _markEmailRead;

    public static final ImageVector getMarkEmailRead(Icons.TwoTone twoTone) {
        ImageVector imageVector = _markEmailRead;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MarkEmailRead", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 8.0f);
        pathBuilder.verticalLineToRelative(4.08f);
        pathBuilder.curveTo(19.67f, 12.03f, 19.34f, 12.0f, 19.0f, 12.0f);
        pathBuilder.curveToRelative(-3.53f, 0.0f, -6.43f, 2.61f, -6.92f, 6.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.lineToRelative(8.0f, 5.0f);
        pathBuilder.lineTo(20.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 6.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.lineToRelative(8.0f, 5.0f);
        pathBuilder.lineTo(20.0f, 6.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.08f, 18.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.verticalLineTo(8.0f);
        pathBuilder2.lineToRelative(8.0f, 5.0f);
        pathBuilder2.lineToRelative(8.0f, -5.0f);
        pathBuilder2.verticalLineToRelative(4.08f);
        pathBuilder2.curveToRelative(0.71f, 0.1f, 1.38f, 0.31f, 2.0f, 0.6f);
        pathBuilder2.verticalLineTo(6.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.curveTo(2.9f, 4.0f, 2.01f, 4.9f, 2.01f, 6.0f);
        pathBuilder2.lineTo(2.0f, 18.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(8.08f);
        pathBuilder2.curveTo(12.03f, 19.67f, 12.0f, 19.34f, 12.0f, 19.0f);
        pathBuilder2.reflectiveCurveTo(12.03f, 18.33f, 12.08f, 18.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 6.0f);
        pathBuilder2.lineToRelative(-8.0f, 5.0f);
        pathBuilder2.lineTo(4.0f, 6.0f);
        pathBuilder2.horizontalLineTo(20.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.34f, 22.0f);
        pathBuilder2.lineToRelative(-3.54f, -3.54f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineToRelative(2.12f, 2.12f);
        pathBuilder2.lineToRelative(4.24f, -4.24f);
        pathBuilder2.lineTo(23.0f, 16.34f);
        pathBuilder2.lineTo(17.34f, 22.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _markEmailRead = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
