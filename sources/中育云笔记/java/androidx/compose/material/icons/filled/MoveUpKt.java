package androidx.compose.material.icons.filled;

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
public final class MoveUpKt {
    private static ImageVector _moveUp;

    public static final ImageVector getMoveUp(Icons.Filled filled) {
        ImageVector imageVector = _moveUp;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.MoveUp", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, -2.45f, 1.76f, -4.47f, 4.08f, -4.91f);
        pathBuilder.lineTo(5.59f, 9.59f);
        pathBuilder.lineTo(7.0f, 11.0f);
        pathBuilder.lineToRelative(4.0f, -4.01f);
        pathBuilder.lineTo(7.0f, 3.0f);
        pathBuilder.lineTo(5.59f, 4.41f);
        pathBuilder.lineToRelative(1.58f, 1.58f);
        pathBuilder.lineToRelative(0.0f, 0.06f);
        pathBuilder.curveTo(3.7f, 6.46f, 1.0f, 9.42f, 1.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.curveTo(5.24f, 18.0f, 3.0f, 15.76f, 3.0f, 13.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(13.0f, 13.0f);
        pathBuilder2.verticalLineToRelative(7.0f);
        pathBuilder2.horizontalLineToRelative(9.0f);
        pathBuilder2.verticalLineToRelative(-7.0f);
        pathBuilder2.horizontalLineTo(13.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 18.0f);
        pathBuilder2.horizontalLineToRelative(-5.0f);
        pathBuilder2.verticalLineToRelative(-3.0f);
        pathBuilder2.horizontalLineToRelative(5.0f);
        pathBuilder2.verticalLineTo(18.0f);
        pathBuilder2.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(13.0f, 4.0f);
        pathBuilder3.horizontalLineToRelative(9.0f);
        pathBuilder3.verticalLineToRelative(7.0f);
        pathBuilder3.horizontalLineToRelative(-9.0f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _moveUp = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
