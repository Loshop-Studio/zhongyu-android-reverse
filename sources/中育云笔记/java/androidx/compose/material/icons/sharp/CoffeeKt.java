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
public final class CoffeeKt {
    private static ImageVector _coffee;

    public static final ImageVector getCoffee(Icons.Sharp sharp) {
        ImageVector imageVector = _coffee;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Coffee", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.5f, 3.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.curveToRelative(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(3.87f, 0.0f, 7.0f, -3.13f, 7.0f, -7.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.lineToRelative(0.4f, 0.0f);
        pathBuilder.curveToRelative(1.67f, 0.0f, 3.19f, -1.13f, 3.52f, -2.77f);
        pathBuilder.curveTo(22.39f, 4.98f, 20.67f, 3.0f, 18.5f, 3.0f);
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
        pathBuilder.moveTo(4.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _coffee = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
