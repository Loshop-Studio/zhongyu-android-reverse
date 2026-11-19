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
public final class StarRateKt {
    private static ImageVector _starRate;

    public static final ImageVector getStarRate(Icons.Rounded rounded) {
        ImageVector imageVector = _starRate;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.StarRate", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.43f, 10.0f);
        pathBuilder.lineToRelative(-1.47f, -4.84f);
        pathBuilder.curveToRelative(-0.29f, -0.95f, -1.63f, -0.95f, -1.91f, 0.0f);
        pathBuilder.lineTo(9.57f, 10.0f);
        pathBuilder.horizontalLineTo(5.12f);
        pathBuilder.curveToRelative(-0.97f, 0.0f, -1.37f, 1.25f, -0.58f, 1.81f);
        pathBuilder.lineToRelative(3.64f, 2.6f);
        pathBuilder.lineToRelative(-1.43f, 4.61f);
        pathBuilder.curveToRelative(-0.29f, 0.93f, 0.79f, 1.68f, 1.56f, 1.09f);
        pathBuilder.lineTo(12.0f, 17.31f);
        pathBuilder.lineToRelative(3.69f, 2.81f);
        pathBuilder.curveToRelative(0.77f, 0.59f, 1.85f, -0.16f, 1.56f, -1.09f);
        pathBuilder.lineToRelative(-1.43f, -4.61f);
        pathBuilder.lineToRelative(3.64f, -2.6f);
        pathBuilder.curveToRelative(0.79f, -0.57f, 0.39f, -1.81f, -0.58f, -1.81f);
        pathBuilder.horizontalLineTo(14.43f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _starRate = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
