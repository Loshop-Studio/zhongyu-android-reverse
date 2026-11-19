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
public final class BlindKt {
    private static ImageVector _blind;

    public static final ImageVector getBlind(Icons.TwoTone twoTone) {
        ImageVector imageVector = _blind;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Blind", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.5f, 3.5f);
        pathBuilder.moveToRelative(-2.0f, 0.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.13f, 7.12f);
        pathBuilder2.curveToRelative(-0.17f, -0.35f, -0.44f, -0.65f, -0.8f, -0.85f);
        pathBuilder2.curveTo(10.72f, 5.91f, 9.99f, 5.93f, 9.4f, 6.24f);
        pathBuilder2.lineToRelative(0.0f, -0.01f);
        pathBuilder2.lineTo(4.0f, 9.3f);
        pathBuilder2.verticalLineTo(14.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(-3.54f);
        pathBuilder2.lineToRelative(1.5f, -0.85f);
        pathBuilder2.curveTo(7.18f, 10.71f, 7.0f, 11.85f, 7.0f, 13.0f);
        pathBuilder2.verticalLineToRelative(5.33f);
        pathBuilder2.lineTo(4.4f, 21.8f);
        pathBuilder2.lineTo(6.0f, 23.0f);
        pathBuilder2.lineToRelative(3.0f, -4.0f);
        pathBuilder2.lineToRelative(0.22f, -3.54f);
        pathBuilder2.lineTo(11.0f, 18.0f);
        pathBuilder2.verticalLineToRelative(5.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(-6.5f);
        pathBuilder2.lineToRelative(-1.97f, -2.81f);
        pathBuilder2.curveToRelative(-0.04f, -0.52f, -0.14f, -1.76f, 0.45f, -3.4f);
        pathBuilder2.curveToRelative(0.75f, 1.14f, 1.88f, 1.98f, 3.2f, 2.41f);
        pathBuilder2.lineTo(20.63f, 23.0f);
        pathBuilder2.lineToRelative(0.87f, -0.5f);
        pathBuilder2.lineTo(16.02f, 13.0f);
        pathBuilder2.horizontalLineTo(17.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.curveToRelative(-0.49f, 0.0f, -2.88f, 0.17f, -4.08f, -2.21f);
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _blind = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
