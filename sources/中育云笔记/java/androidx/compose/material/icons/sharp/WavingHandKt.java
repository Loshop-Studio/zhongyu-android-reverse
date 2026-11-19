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
public final class WavingHandKt {
    private static ImageVector _wavingHand;

    public static final ImageVector getWavingHand(Icons.Sharp sharp) {
        ImageVector imageVector = _wavingHand;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.WavingHand", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.0f, 17.0f);
        pathBuilder.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder.verticalLineToRelative(-1.5f);
        pathBuilder.curveToRelative(2.48f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f);
        pathBuilder.horizontalLineTo(23.0f);
        pathBuilder.close();
        pathBuilder.moveTo(1.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.curveTo(4.52f, 2.5f, 2.5f, 4.52f, 2.5f, 7.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.9f, 3.43f);
        pathBuilder.lineTo(3.42f, 8.91f);
        pathBuilder.curveToRelative(-3.22f, 3.22f, -3.22f, 8.44f, 0.0f, 11.67f);
        pathBuilder.reflectiveCurveToRelative(8.44f, 3.22f, 11.67f, 0.0f);
        pathBuilder.lineToRelative(7.95f, -7.95f);
        pathBuilder.lineToRelative(-1.77f, -1.77f);
        pathBuilder.lineToRelative(-5.3f, 5.3f);
        pathBuilder.lineToRelative(-0.71f, -0.71f);
        pathBuilder.lineToRelative(7.42f, -7.42f);
        pathBuilder.lineToRelative(-1.77f, -1.77f);
        pathBuilder.lineToRelative(-6.72f, 6.72f);
        pathBuilder.lineToRelative(-0.71f, -0.71f);
        pathBuilder.lineToRelative(7.78f, -7.78f);
        pathBuilder.lineTo(19.5f, 2.73f);
        pathBuilder.lineToRelative(-7.78f, 7.78f);
        pathBuilder.lineTo(11.02f, 9.8f);
        pathBuilder.lineToRelative(6.36f, -6.36f);
        pathBuilder.lineToRelative(-1.77f, -1.77f);
        pathBuilder.lineToRelative(-8.51f, 8.51f);
        pathBuilder.curveToRelative(1.22f, 1.57f, 1.11f, 3.84f, -0.33f, 5.28f);
        pathBuilder.lineToRelative(-0.71f, -0.71f);
        pathBuilder.curveToRelative(1.17f, -1.17f, 1.17f, -3.08f, 0.0f, -4.24f);
        pathBuilder.lineToRelative(-0.35f, -0.35f);
        pathBuilder.lineToRelative(4.95f, -4.95f);
        pathBuilder.lineTo(8.9f, 3.43f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wavingHand = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
