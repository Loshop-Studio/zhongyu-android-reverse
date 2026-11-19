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
public final class TakeoutDiningKt {
    private static ImageVector _takeoutDining;

    public static final ImageVector getTakeoutDining(Icons.TwoTone twoTone) {
        ImageVector imageVector = _takeoutDining;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.TakeoutDining", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.83f, 5.0f);
        pathBuilder.lineToRelative(-2.8f, 2.73f);
        pathBuilder.lineToRelative(0.09f, 1.27f);
        pathBuilder.lineToRelative(9.75f, 0.0f);
        pathBuilder.lineToRelative(0.09f, -1.27f);
        pathBuilder.lineToRelative(-2.8f, -2.73f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(7.79f, 18.0f);
        pathBuilder2.lineToRelative(8.44f, 0.0f);
        pathBuilder2.lineToRelative(0.51f, -7.0f);
        pathBuilder2.lineToRelative(-9.46f, 0.0f);
        pathBuilder2.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.59f, 6.05f);
        pathBuilder3.lineTo(19.0f, 7.63f);
        pathBuilder3.lineToRelative(0.03f, -0.56f);
        pathBuilder3.lineTo(14.98f, 3.0f);
        pathBuilder3.horizontalLineTo(9.02f);
        pathBuilder3.lineTo(4.97f, 7.07f);
        pathBuilder3.lineTo(5.0f, 7.57f);
        pathBuilder3.lineTo(3.41f, 6.01f);
        pathBuilder3.lineTo(2.0f, 7.44f);
        pathBuilder3.lineToRelative(3.23f, 3.11f);
        pathBuilder3.lineTo(5.93f, 20.0f);
        pathBuilder3.horizontalLineToRelative(12.14f);
        pathBuilder3.lineToRelative(0.7f, -9.44f);
        pathBuilder3.lineTo(22.0f, 7.46f);
        pathBuilder3.lineTo(20.59f, 6.05f);
        pathBuilder3.close();
        pathBuilder3.moveTo(16.23f, 18.0f);
        pathBuilder3.horizontalLineTo(7.79f);
        pathBuilder3.lineToRelative(-0.51f, -7.0f);
        pathBuilder3.horizontalLineToRelative(9.46f);
        pathBuilder3.lineTo(16.23f, 18.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(16.87f, 9.0f);
        pathBuilder3.horizontalLineTo(7.12f);
        pathBuilder3.lineTo(7.03f, 7.73f);
        pathBuilder3.lineTo(9.83f, 5.0f);
        pathBuilder3.horizontalLineToRelative(4.33f);
        pathBuilder3.lineToRelative(2.8f, 2.73f);
        pathBuilder3.lineTo(16.87f, 9.0f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _takeoutDining = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
