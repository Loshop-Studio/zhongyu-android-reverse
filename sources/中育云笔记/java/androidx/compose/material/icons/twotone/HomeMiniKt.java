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
public final class HomeMiniKt {
    private static ImageVector _homeMini;

    public static final ImageVector getHomeMini(Icons.TwoTone twoTone) {
        ImageVector imageVector = _homeMini;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HomeMini", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 7.0f);
        pathBuilder.curveToRelative(-7.91f, 0.0f, -8.0f, 4.8f, -8.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveTo(19.99f, 11.51f, 19.64f, 7.0f, 12.0f, 7.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(9.14f, 17.0f);
        pathBuilder2.horizontalLineToRelative(5.72f);
        pathBuilder2.curveToRelative(2.1f, 0.0f, 3.92f, -1.24f, 4.71f, -3.0f);
        pathBuilder2.horizontalLineTo(4.42f);
        pathBuilder2.curveTo(5.22f, 15.76f, 7.04f, 17.0f, 9.14f, 17.0f);
        pathBuilder2.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 5.0f);
        pathBuilder3.curveTo(4.19f, 5.0f, 2.0f, 9.48f, 2.0f, 12.0f);
        pathBuilder3.curveToRelative(0.0f, 3.86f, 3.13f, 7.0f, 6.99f, 7.0f);
        pathBuilder3.horizontalLineToRelative(6.02f);
        pathBuilder3.curveToRelative(2.69f, 0.0f, 6.99f, -2.08f, 6.99f, -7.0f);
        pathBuilder3.curveTo(22.0f, 12.0f, 22.0f, 5.0f, 12.0f, 5.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(14.86f, 17.0f);
        pathBuilder3.horizontalLineTo(9.14f);
        pathBuilder3.curveToRelative(-2.1f, 0.0f, -3.92f, -1.24f, -4.71f, -3.0f);
        pathBuilder3.horizontalLineToRelative(15.15f);
        pathBuilder3.curveTo(18.78f, 15.76f, 16.96f, 17.0f, 14.86f, 17.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(4.0f, 12.0f);
        pathBuilder3.curveToRelative(0.0f, -0.2f, 0.09f, -5.0f, 8.0f, -5.0f);
        pathBuilder3.curveToRelative(7.64f, 0.0f, 7.99f, 4.51f, 8.0f, 5.0f);
        pathBuilder3.horizontalLineTo(4.0f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _homeMini = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
