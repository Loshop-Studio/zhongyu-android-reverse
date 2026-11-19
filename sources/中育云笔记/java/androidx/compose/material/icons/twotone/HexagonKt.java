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
public final class HexagonKt {
    private static ImageVector _hexagon;

    public static final ImageVector getHexagon(Icons.TwoTone twoTone) {
        ImageVector imageVector = _hexagon;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Hexagon", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.05f, 19.0f);
        pathBuilder.lineToRelative(-8.1f, 0.0f);
        pathBuilder.lineToRelative(-4.04f, -7.0f);
        pathBuilder.lineToRelative(4.04f, -7.0f);
        pathBuilder.lineToRelative(8.1f, 0.0f);
        pathBuilder.lineToRelative(4.04f, 7.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.2f, 3.0f);
        pathBuilder2.horizontalLineTo(6.8f);
        pathBuilder2.lineToRelative(-5.2f, 9.0f);
        pathBuilder2.lineToRelative(5.2f, 9.0f);
        pathBuilder2.horizontalLineToRelative(10.4f);
        pathBuilder2.lineToRelative(5.2f, -9.0f);
        pathBuilder2.lineTo(17.2f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.05f, 19.0f);
        pathBuilder2.horizontalLineTo(7.95f);
        pathBuilder2.lineToRelative(-4.04f, -7.0f);
        pathBuilder2.lineToRelative(4.04f, -7.0f);
        pathBuilder2.horizontalLineToRelative(8.09f);
        pathBuilder2.lineToRelative(4.04f, 7.0f);
        pathBuilder2.lineTo(16.05f, 19.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hexagon = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
