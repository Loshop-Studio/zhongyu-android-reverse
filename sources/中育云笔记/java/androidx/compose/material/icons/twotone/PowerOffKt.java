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
public final class PowerOffKt {
    private static ImageVector _powerOff;

    public static final ImageVector getPowerOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _powerOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PowerOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.12f, 9.0f);
        pathBuilder.lineTo(16.0f, 12.88f);
        pathBuilder.lineTo(16.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.5f, 17.17f);
        pathBuilder.lineTo(11.5f, 19.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(-1.83f);
        pathBuilder.lineToRelative(1.07f, -1.06f);
        pathBuilder.lineTo(8.0f, 10.54f);
        pathBuilder.verticalLineToRelative(3.11f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(10.0f, 3.0f);
        pathBuilder2.lineTo(8.0f, 3.0f);
        pathBuilder2.verticalLineToRelative(1.88f);
        pathBuilder2.lineToRelative(2.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.0f, 9.0f);
        pathBuilder2.verticalLineToRelative(3.88f);
        pathBuilder2.lineToRelative(1.8f, 1.8f);
        pathBuilder2.lineToRelative(0.2f, -0.2f);
        pathBuilder2.lineTo(18.0f, 9.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.lineTo(16.0f, 3.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineToRelative(4.0f);
        pathBuilder2.horizontalLineToRelative(-3.88f);
        pathBuilder2.lineToRelative(2.0f, 2.0f);
        pathBuilder2.lineTo(16.0f, 9.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(4.12f, 3.84f);
        pathBuilder2.lineTo(2.71f, 5.25f);
        pathBuilder2.lineTo(6.0f, 8.54f);
        pathBuilder2.verticalLineToRelative(5.96f);
        pathBuilder2.lineTo(9.5f, 18.0f);
        pathBuilder2.verticalLineToRelative(3.0f);
        pathBuilder2.horizontalLineToRelative(5.0f);
        pathBuilder2.verticalLineToRelative(-3.0f);
        pathBuilder2.lineToRelative(0.48f, -0.48f);
        pathBuilder2.lineToRelative(4.47f, 4.47f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineTo(4.12f, 3.84f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.5f, 17.17f);
        pathBuilder2.lineTo(12.5f, 19.0f);
        pathBuilder2.horizontalLineToRelative(-1.0f);
        pathBuilder2.verticalLineToRelative(-1.83f);
        pathBuilder2.lineTo(8.0f, 13.65f);
        pathBuilder2.verticalLineToRelative(-3.11f);
        pathBuilder2.lineToRelative(5.57f, 5.57f);
        pathBuilder2.lineToRelative(-1.07f, 1.06f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _powerOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
