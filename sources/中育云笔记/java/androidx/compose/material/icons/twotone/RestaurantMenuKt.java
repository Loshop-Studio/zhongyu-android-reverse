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
public final class RestaurantMenuKt {
    private static ImageVector _restaurantMenu;

    public static final ImageVector getRestaurantMenu(Icons.TwoTone twoTone) {
        ImageVector imageVector = _restaurantMenu;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RestaurantMenu", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.1f, 13.34f);
        pathBuilder.lineToRelative(2.83f, -2.83f);
        pathBuilder.lineTo(3.91f, 3.5f);
        pathBuilder.curveToRelative(-1.56f, 1.56f, -1.56f, 4.09f, 0.0f, 5.66f);
        pathBuilder.lineToRelative(4.19f, 4.18f);
        pathBuilder.close();
        pathBuilder.moveTo(20.15f, 10.15f);
        pathBuilder.curveToRelative(1.91f, -1.91f, 2.28f, -4.65f, 0.81f, -6.12f);
        pathBuilder.curveToRelative(-1.46f, -1.46f, -4.2f, -1.1f, -6.12f, 0.81f);
        pathBuilder.curveToRelative(-1.59f, 1.59f, -2.09f, 3.74f, -1.38f, 5.27f);
        pathBuilder.lineTo(3.7f, 19.87f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineTo(12.0f, 14.41f);
        pathBuilder.lineToRelative(6.88f, 6.88f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(13.41f, 13.0f);
        pathBuilder.lineToRelative(1.47f, -1.47f);
        pathBuilder.curveToRelative(1.53f, 0.71f, 3.68f, 0.21f, 5.27f, -1.38f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _restaurantMenu = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
