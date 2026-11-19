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
public final class FiberPinKt {
    private static ImageVector _fiberPin;

    public static final ImageVector getFiberPin(Icons.TwoTone twoTone) {
        ImageVector imageVector = _fiberPin;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FiberPin", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 14.62f);
        pathBuilder.horizontalLineToRelative(1.31f);
        pathBuilder.verticalLineToRelative(-1.75f);
        pathBuilder.horizontalLineToRelative(1.75f);
        pathBuilder.curveToRelative(0.74f, 0.0f, 1.31f, -0.57f, 1.31f, -1.31f);
        pathBuilder.verticalLineToRelative(-0.88f);
        pathBuilder.curveToRelative(0.0f, -0.74f, -0.57f, -1.31f, -1.31f, -1.31f);
        pathBuilder.lineTo(5.0f, 9.37f);
        pathBuilder.verticalLineToRelative(5.25f);
        pathBuilder.close();
        pathBuilder.moveTo(6.31f, 10.69f);
        pathBuilder.horizontalLineToRelative(1.75f);
        pathBuilder.verticalLineToRelative(0.88f);
        pathBuilder.lineTo(6.31f, 11.57f);
        pathBuilder.verticalLineToRelative(-0.88f);
        pathBuilder.close();
        pathBuilder.moveTo(11.34f, 9.38f);
        pathBuilder.horizontalLineToRelative(1.31f);
        pathBuilder.verticalLineToRelative(5.25f);
        pathBuilder.horizontalLineToRelative(-1.31f);
        pathBuilder.close();
        pathBuilder.moveTo(14.62f, 14.62f);
        pathBuilder.horizontalLineToRelative(1.1f);
        pathBuilder.verticalLineToRelative(-3.06f);
        pathBuilder.lineToRelative(2.23f, 3.06f);
        pathBuilder.lineTo(19.0f, 14.62f);
        pathBuilder.lineTo(19.0f, 9.38f);
        pathBuilder.horizontalLineToRelative(-1.09f);
        pathBuilder.verticalLineToRelative(3.06f);
        pathBuilder.lineToRelative(-2.19f, -3.06f);
        pathBuilder.horizontalLineToRelative(-1.1f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(4.0f, 6.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.0f, 4.0f);
        pathBuilder3.lineTo(4.0f, 4.0f);
        pathBuilder3.curveToRelative(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
        pathBuilder3.lineTo(2.0f, 18.0f);
        pathBuilder3.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder3.horizontalLineToRelative(16.0f);
        pathBuilder3.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        pathBuilder3.lineTo(22.0f, 6.0f);
        pathBuilder3.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(20.0f, 18.0f);
        pathBuilder3.lineTo(4.0f, 18.0f);
        pathBuilder3.lineTo(4.0f, 6.0f);
        pathBuilder3.horizontalLineToRelative(16.0f);
        pathBuilder3.verticalLineToRelative(12.0f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberPin = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
