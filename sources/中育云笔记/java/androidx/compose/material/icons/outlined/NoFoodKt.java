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
public final class NoFoodKt {
    private static ImageVector _noFood;

    public static final ImageVector getNoFood(Icons.Outlined outlined) {
        ImageVector imageVector = _noFood;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NoFood", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(1.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(15.01f);
        pathBuilder.verticalLineToRelative(0.98f);
        pathBuilder.curveToRelative(0.0f, 0.56f, -0.45f, 1.01f, -1.01f, 1.01f);
        pathBuilder.horizontalLineTo(2.01f);
        pathBuilder.curveTo(1.45f, 22.99f, 1.0f, 22.54f, 1.0f, 21.98f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.49f, 23.31f);
        pathBuilder.lineTo(16.0f, 18.83f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(13.17f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.curveToRelative(0.0f, -3.24f, 2.46f, -5.17f, 5.38f, -5.79f);
        pathBuilder.lineToRelative(-5.7f, -5.7f);
        pathBuilder.lineTo(2.1f, 2.1f);
        pathBuilder.lineTo(13.0f, 13.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.lineToRelative(6.9f, 6.9f);
        pathBuilder.lineTo(20.49f, 23.31f);
        pathBuilder.close();
        pathBuilder.moveTo(10.17f, 13.0f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.curveToRelative(-1.42f, 0.06f, -3.52f, 0.56f, -4.55f, 2.0f);
        pathBuilder.horizontalLineTo(10.17f);
        pathBuilder.close();
        pathBuilder.moveTo(23.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(-5.0f);
        pathBuilder.verticalLineTo(1.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(-5.0f);
        pathBuilder.lineToRelative(0.23f, 2.0f);
        pathBuilder.horizontalLineToRelative(9.56f);
        pathBuilder.lineToRelative(-1.0f, 9.97f);
        pathBuilder.lineToRelative(1.83f, 1.83f);
        pathBuilder.lineTo(23.0f, 5.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noFood = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
