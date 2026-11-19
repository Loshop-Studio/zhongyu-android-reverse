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
public final class MapKt {
    private static ImageVector _map;

    public static final ImageVector getMap(Icons.TwoTone twoTone) {
        ImageVector imageVector = _map;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Map", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 18.31f);
        pathBuilder.lineToRelative(3.0f, -1.16f);
        pathBuilder.lineTo(8.0f, 5.45f);
        pathBuilder.lineTo(5.0f, 6.46f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 18.55f);
        pathBuilder.lineToRelative(3.0f, -1.01f);
        pathBuilder.lineTo(19.0f, 5.69f);
        pathBuilder.lineToRelative(-3.0f, 1.17f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.5f, 3.0f);
        pathBuilder2.lineToRelative(-0.16f, 0.03f);
        pathBuilder2.lineTo(15.0f, 5.1f);
        pathBuilder2.lineTo(9.0f, 3.0f);
        pathBuilder2.lineTo(3.36f, 4.9f);
        pathBuilder2.curveToRelative(-0.21f, 0.07f, -0.36f, 0.25f, -0.36f, 0.48f);
        pathBuilder2.lineTo(3.0f, 20.5f);
        pathBuilder2.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder2.lineToRelative(0.16f, -0.03f);
        pathBuilder2.lineTo(9.0f, 18.9f);
        pathBuilder2.lineToRelative(6.0f, 2.1f);
        pathBuilder2.lineToRelative(5.64f, -1.9f);
        pathBuilder2.curveToRelative(0.21f, -0.07f, 0.36f, -0.25f, 0.36f, -0.48f);
        pathBuilder2.lineTo(21.0f, 3.5f);
        pathBuilder2.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(8.0f, 17.15f);
        pathBuilder2.lineToRelative(-3.0f, 1.16f);
        pathBuilder2.lineTo(5.0f, 6.46f);
        pathBuilder2.lineToRelative(3.0f, -1.01f);
        pathBuilder2.verticalLineToRelative(11.7f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.0f, 18.53f);
        pathBuilder2.lineToRelative(-4.0f, -1.4f);
        pathBuilder2.lineTo(10.0f, 5.47f);
        pathBuilder2.lineToRelative(4.0f, 1.4f);
        pathBuilder2.verticalLineToRelative(11.66f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 17.54f);
        pathBuilder2.lineToRelative(-3.0f, 1.01f);
        pathBuilder2.lineTo(16.0f, 6.86f);
        pathBuilder2.lineToRelative(3.0f, -1.16f);
        pathBuilder2.verticalLineToRelative(11.84f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _map = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
