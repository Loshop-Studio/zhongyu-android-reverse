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
public final class SearchOffKt {
    private static ImageVector _searchOff;

    public static final ImageVector getSearchOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _searchOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SearchOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        pathBuilder.curveTo(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        pathBuilder.curveTo(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        pathBuilder.curveTo(6.08f, 3.0f, 3.28f, 5.64f, 3.03f, 9.0f);
        pathBuilder.horizontalLineToRelative(2.02f);
        pathBuilder.curveTo(5.3f, 6.75f, 7.18f, 5.0f, 9.5f, 5.0f);
        pathBuilder.curveTo(11.99f, 5.0f, 14.0f, 7.01f, 14.0f, 9.5f);
        pathBuilder.reflectiveCurveTo(11.99f, 14.0f, 9.5f, 14.0f);
        pathBuilder.curveToRelative(-0.17f, 0.0f, -0.33f, -0.03f, -0.5f, -0.05f);
        pathBuilder.verticalLineToRelative(2.02f);
        pathBuilder.curveTo(9.17f, 15.99f, 9.33f, 16.0f, 9.5f, 16.0f);
        pathBuilder.curveToRelative(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        pathBuilder.lineTo(14.0f, 14.71f);
        pathBuilder.verticalLineToRelative(0.79f);
        pathBuilder.lineToRelative(5.0f, 4.99f);
        pathBuilder.lineTo(20.49f, 19.0f);
        pathBuilder.lineTo(15.5f, 14.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(6.47f, 10.82f);
        pathBuilder2.lineToRelative(-2.47f, 2.47f);
        pathBuilder2.lineToRelative(-2.47f, -2.47f);
        pathBuilder2.lineToRelative(-0.71f, 0.71f);
        pathBuilder2.lineToRelative(2.47f, 2.47f);
        pathBuilder2.lineToRelative(-2.47f, 2.47f);
        pathBuilder2.lineToRelative(0.71f, 0.71f);
        pathBuilder2.lineToRelative(2.47f, -2.47f);
        pathBuilder2.lineToRelative(2.47f, 2.47f);
        pathBuilder2.lineToRelative(0.71f, -0.71f);
        pathBuilder2.lineToRelative(-2.47f, -2.47f);
        pathBuilder2.lineToRelative(2.47f, -2.47f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _searchOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
