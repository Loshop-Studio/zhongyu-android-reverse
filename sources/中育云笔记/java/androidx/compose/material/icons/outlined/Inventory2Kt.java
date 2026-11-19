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
public final class Inventory2Kt {
    private static ImageVector _inventory2;

    public static final ImageVector getInventory2(Icons.Outlined outlined) {
        ImageVector imageVector = _inventory2;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Inventory2", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveTo(3.0f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        pathBuilder.verticalLineToRelative(3.01f);
        pathBuilder.curveTo(2.0f, 7.73f, 2.43f, 8.35f, 3.0f, 8.7f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 1.1f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.9f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(8.7f);
        pathBuilder.curveToRelative(0.57f, -0.35f, 1.0f, -0.97f, 1.0f, -1.69f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveTo(22.0f, 2.9f, 21.0f, 2.0f, 20.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 20.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 7.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(9.0f, 12.0f);
        pathBuilder2.horizontalLineToRelative(6.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(-6.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _inventory2 = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
