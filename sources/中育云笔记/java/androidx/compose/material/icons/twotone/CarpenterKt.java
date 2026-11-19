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
public final class CarpenterKt {
    private static ImageVector _carpenter;

    public static final ImageVector getCarpenter(Icons.TwoTone twoTone) {
        ImageVector imageVector = _carpenter;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Carpenter", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.71f, 5.62f);
        pathBuilder.lineTo(7.0f, 4.33f);
        pathBuilder.lineToRelative(8.49f, 8.49f);
        pathBuilder.lineToRelative(-2.81f, 2.81f);
        pathBuilder.lineTo(5.71f, 5.62f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.73f, 14.23f);
        pathBuilder2.lineTo(7.0f, 1.5f);
        pathBuilder2.lineTo(3.11f, 5.39f);
        pathBuilder2.lineToRelative(8.13f, 11.67f);
        pathBuilder2.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilder2.lineToRelative(1.41f, 1.41f);
        pathBuilder2.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        pathBuilder2.lineToRelative(4.24f, -4.24f);
        pathBuilder2.curveTo(20.51f, 16.28f, 20.51f, 15.01f, 19.73f, 14.23f);
        pathBuilder2.close();
        pathBuilder2.moveTo(5.71f, 5.62f);
        pathBuilder2.lineTo(7.0f, 4.33f);
        pathBuilder2.lineToRelative(8.49f, 8.49f);
        pathBuilder2.lineToRelative(-2.81f, 2.81f);
        pathBuilder2.lineTo(5.71f, 5.62f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.07f, 19.88f);
        pathBuilder2.lineToRelative(-1.41f, -1.41f);
        pathBuilder2.lineToRelative(4.24f, -4.24f);
        pathBuilder2.lineToRelative(1.41f, 1.41f);
        pathBuilder2.lineTo(14.07f, 19.88f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _carpenter = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
