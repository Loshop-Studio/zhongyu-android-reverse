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
public final class CoffeeKt {
    private static ImageVector _coffee;

    public static final ImageVector getCoffee(Icons.Rounded rounded) {
        ImageVector imageVector = _coffee;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Coffee", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.5f, 3.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveTo(4.9f, 3.0f, 4.0f, 3.9f, 4.0f, 5.0f);
        pathBuilder.verticalLineToRelative(5.71f);
        pathBuilder.curveToRelative(0.0f, 3.83f, 2.95f, 7.18f, 6.78f, 7.29f);
        pathBuilder.curveToRelative(3.96f, 0.12f, 7.22f, -3.06f, 7.22f, -7.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(0.5f);
        pathBuilder.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder.reflectiveCurveTo(20.43f, 3.0f, 18.5f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 5.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.5f, 8.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(0.5f);
        pathBuilder.curveTo(19.33f, 5.0f, 20.0f, 5.67f, 20.0f, 6.5f);
        pathBuilder.reflectiveCurveTo(19.33f, 8.0f, 18.5f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(4.0f, 19.45f, 4.45f, 19.0f, 5.0f, 19.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _coffee = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
