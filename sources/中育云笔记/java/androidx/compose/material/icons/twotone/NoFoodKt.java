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
public final class NoFoodKt {
    private static ImageVector _noFood;

    public static final ImageVector getNoFood(Icons.TwoTone twoTone) {
        ImageVector imageVector = _noFood;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NoFood", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.16f, 11.0f);
        pathBuilder.curveToRelative(-1.43f, 0.07f, -3.52f, 0.57f, -4.54f, 2.0f);
        pathBuilder.horizontalLineToRelative(6.55f);
        pathBuilder.lineTo(8.16f, 11.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(1.0f, 21.0f);
        pathBuilder2.horizontalLineToRelative(15.01f);
        pathBuilder2.verticalLineToRelative(0.98f);
        pathBuilder2.curveToRelative(0.0f, 0.56f, -0.45f, 1.01f, -1.01f, 1.01f);
        pathBuilder2.horizontalLineTo(2.01f);
        pathBuilder2.curveTo(1.45f, 22.99f, 1.0f, 22.54f, 1.0f, 21.98f);
        pathBuilder2.verticalLineTo(21.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.49f, 23.31f);
        pathBuilder2.lineTo(16.0f, 18.83f);
        pathBuilder2.verticalLineTo(19.0f);
        pathBuilder2.horizontalLineTo(1.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.horizontalLineToRelative(13.17f);
        pathBuilder2.lineToRelative(-2.0f, -2.0f);
        pathBuilder2.horizontalLineTo(1.0f);
        pathBuilder2.curveToRelative(0.0f, -3.24f, 2.46f, -5.17f, 5.38f, -5.79f);
        pathBuilder2.lineToRelative(-5.7f, -5.7f);
        pathBuilder2.lineTo(2.1f, 2.1f);
        pathBuilder2.lineTo(13.0f, 13.0f);
        pathBuilder2.lineToRelative(2.0f, 2.0f);
        pathBuilder2.lineToRelative(6.9f, 6.9f);
        pathBuilder2.lineTo(20.49f, 23.31f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.17f, 13.0f);
        pathBuilder2.lineToRelative(-2.0f, -2.0f);
        pathBuilder2.curveToRelative(-1.42f, 0.06f, -3.52f, 0.56f, -4.55f, 2.0f);
        pathBuilder2.horizontalLineTo(10.17f);
        pathBuilder2.close();
        pathBuilder2.moveTo(23.0f, 5.0f);
        pathBuilder2.horizontalLineToRelative(-5.0f);
        pathBuilder2.verticalLineTo(1.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineToRelative(4.0f);
        pathBuilder2.horizontalLineToRelative(-5.0f);
        pathBuilder2.lineToRelative(0.23f, 2.0f);
        pathBuilder2.horizontalLineToRelative(9.56f);
        pathBuilder2.lineToRelative(-1.0f, 9.97f);
        pathBuilder2.lineToRelative(1.83f, 1.83f);
        pathBuilder2.lineTo(23.0f, 5.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noFood = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
