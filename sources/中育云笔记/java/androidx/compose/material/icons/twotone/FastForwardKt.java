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
public final class FastForwardKt {
    private static ImageVector _fastForward;

    public static final ImageVector getFastForward(Icons.TwoTone twoTone) {
        ImageVector imageVector = _fastForward;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FastForward", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 9.86f);
        pathBuilder.lineToRelative(0.0f, 4.28f);
        pathBuilder.lineToRelative(3.03f, -2.14f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(6.0f, 9.86f);
        pathBuilder2.lineToRelative(0.0f, 4.28f);
        pathBuilder2.lineToRelative(3.03f, -2.14f);
        pathBuilder2.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(4.0f, 18.0f);
        pathBuilder3.lineToRelative(8.5f, -6.0f);
        pathBuilder3.lineTo(4.0f, 6.0f);
        pathBuilder3.verticalLineTo(18.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(6.0f, 9.86f);
        pathBuilder3.lineTo(9.03f, 12.0f);
        pathBuilder3.lineTo(6.0f, 14.14f);
        pathBuilder3.verticalLineTo(9.86f);
        pathBuilder3.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw4 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk84 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(21.5f, 12.0f);
        pathBuilder4.lineTo(13.0f, 6.0f);
        pathBuilder4.verticalLineToRelative(12.0f);
        pathBuilder4.lineTo(21.5f, 12.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(15.0f, 9.86f);
        pathBuilder4.lineTo(18.03f, 12.0f);
        pathBuilder4.lineTo(15.0f, 14.14f);
        pathBuilder4.verticalLineTo(9.86f);
        pathBuilder4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw4, iM31241getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fastForward = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
