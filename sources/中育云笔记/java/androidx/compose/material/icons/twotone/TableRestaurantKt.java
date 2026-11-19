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
public final class TableRestaurantKt {
    private static ImageVector _tableRestaurant;

    public static final ImageVector getTableRestaurant(Icons.TwoTone twoTone) {
        ImageVector imageVector = _tableRestaurant;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.TableRestaurant", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.18f, 6.0f);
        pathBuilder.lineToRelative(-0.85f, 3.0f);
        pathBuilder.lineToRelative(15.34f, 0.0f);
        pathBuilder.lineToRelative(-0.85f, -3.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(21.96f, 9.73f);
        pathBuilder2.lineToRelative(-1.43f, -5.0f);
        pathBuilder2.curveTo(20.41f, 4.3f, 20.02f, 4.0f, 19.57f, 4.0f);
        pathBuilder2.horizontalLineTo(4.43f);
        pathBuilder2.curveTo(3.98f, 4.0f, 3.59f, 4.3f, 3.47f, 4.73f);
        pathBuilder2.lineToRelative(-1.43f, 5.0f);
        pathBuilder2.curveTo(1.86f, 10.36f, 2.34f, 11.0f, 3.0f, 11.0f);
        pathBuilder2.horizontalLineToRelative(2.2f);
        pathBuilder2.lineTo(4.0f, 20.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.lineToRelative(0.67f, -5.0f);
        pathBuilder2.horizontalLineToRelative(10.67f);
        pathBuilder2.lineTo(18.0f, 20.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.lineToRelative(-1.2f, -9.0f);
        pathBuilder2.horizontalLineTo(21.0f);
        pathBuilder2.curveTo(21.66f, 11.0f, 22.14f, 10.36f, 21.96f, 9.73f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.93f, 13.0f);
        pathBuilder2.lineToRelative(0.27f, -2.0f);
        pathBuilder2.horizontalLineToRelative(9.6f);
        pathBuilder2.lineToRelative(0.27f, 2.0f);
        pathBuilder2.horizontalLineTo(6.93f);
        pathBuilder2.close();
        pathBuilder2.moveTo(4.33f, 9.0f);
        pathBuilder2.lineToRelative(0.86f, -3.0f);
        pathBuilder2.horizontalLineToRelative(13.63f);
        pathBuilder2.lineToRelative(0.86f, 3.0f);
        pathBuilder2.horizontalLineTo(4.33f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tableRestaurant = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
