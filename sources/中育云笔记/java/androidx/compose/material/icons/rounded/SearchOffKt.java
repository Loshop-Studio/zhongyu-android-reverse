package androidx.compose.material.icons.rounded;

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
public final class SearchOffKt {
    private static ImageVector _searchOff;

    public static final ImageVector getSearchOff(Icons.Rounded rounded) {
        ImageVector imageVector = _searchOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SearchOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.5f, 14.0f);
        pathBuilder.horizontalLineToRelative(-0.79f);
        pathBuilder.lineToRelative(-0.28f, -0.27f);
        pathBuilder.curveToRelative(1.2f, -1.4f, 1.82f, -3.31f, 1.48f, -5.34f);
        pathBuilder.curveToRelative(-0.47f, -2.78f, -2.79f, -4.99f, -5.58f, -5.34f);
        pathBuilder.curveTo(6.54f, 2.58f, 3.3f, 5.38f, 3.03f, 9.0f);
        pathBuilder.horizontalLineToRelative(2.02f);
        pathBuilder.curveToRelative(0.24f, -2.12f, 1.92f, -3.8f, 4.06f, -3.98f);
        pathBuilder.curveTo(11.65f, 4.8f, 14.0f, 6.95f, 14.0f, 9.5f);
        pathBuilder.curveToRelative(0.0f, 2.49f, -2.01f, 4.5f, -4.5f, 4.5f);
        pathBuilder.curveToRelative(-0.17f, 0.0f, -0.33f, -0.03f, -0.5f, -0.05f);
        pathBuilder.lineToRelative(0.0f, 2.02f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.01f, 0.01f);
        pathBuilder.curveToRelative(1.8f, 0.13f, 3.47f, -0.47f, 4.72f, -1.55f);
        pathBuilder.lineTo(14.0f, 14.71f);
        pathBuilder.verticalLineToRelative(0.79f);
        pathBuilder.lineToRelative(4.25f, 4.25f);
        pathBuilder.curveToRelative(0.41f, 0.41f, 1.08f, 0.41f, 1.49f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.41f, -0.41f, 0.41f, -1.08f, 0.0f, -1.49f);
        pathBuilder.lineTo(15.5f, 14.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(6.12f, 11.17f);
        pathBuilder2.lineTo(4.0f, 13.29f);
        pathBuilder2.lineToRelative(-2.12f, -2.12f);
        pathBuilder2.curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder2.lineTo(3.29f, 14.0f);
        pathBuilder2.lineToRelative(-2.12f, 2.12f);
        pathBuilder2.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilder2.lineTo(4.0f, 14.71f);
        pathBuilder2.lineToRelative(2.12f, 2.12f);
        pathBuilder2.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        pathBuilder2.lineTo(4.71f, 14.0f);
        pathBuilder2.lineToRelative(2.12f, -2.12f);
        pathBuilder2.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveTo(6.63f, 10.98f, 6.32f, 10.98f, 6.12f, 11.17f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _searchOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
