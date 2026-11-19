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
public final class SavedSearchKt {
    private static ImageVector _savedSearch;

    public static final ImageVector getSavedSearch(Icons.Rounded rounded) {
        ImageVector imageVector = _savedSearch;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SavedSearch", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.73f, 13.31f);
        pathBuilder.curveToRelative(1.13f, -1.55f, 1.63f, -3.58f, 0.98f, -5.74f);
        pathBuilder.curveToRelative(-0.68f, -2.23f, -2.57f, -3.98f, -4.85f, -4.44f);
        pathBuilder.curveTo(6.21f, 2.2f, 2.2f, 6.22f, 3.14f, 10.86f);
        pathBuilder.curveToRelative(0.46f, 2.29f, 2.21f, 4.18f, 4.44f, 4.85f);
        pathBuilder.curveToRelative(2.16f, 0.65f, 4.19f, 0.15f, 5.74f, -0.98f);
        pathBuilder.lineToRelative(5.56f, 5.56f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineTo(14.73f, 13.31f);
        pathBuilder.close();
        pathBuilder.moveTo(9.5f, 14.0f);
        pathBuilder.curveTo(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        pathBuilder.reflectiveCurveTo(7.01f, 5.0f, 9.5f, 5.0f);
        pathBuilder.reflectiveCurveTo(14.0f, 7.01f, 14.0f, 9.5f);
        pathBuilder.reflectiveCurveTo(11.99f, 14.0f, 9.5f, 14.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(10.29f, 8.44f);
        pathBuilder2.lineToRelative(-0.79f, -2.44f);
        pathBuilder2.lineToRelative(-0.79f, 2.44f);
        pathBuilder2.lineToRelative(-2.46f, 0.0f);
        pathBuilder2.lineToRelative(2.01f, 1.59f);
        pathBuilder2.lineToRelative(-0.77f, 2.47f);
        pathBuilder2.lineToRelative(2.01f, -1.53f);
        pathBuilder2.lineToRelative(2.01f, 1.53f);
        pathBuilder2.lineToRelative(-0.77f, -2.47f);
        pathBuilder2.lineToRelative(2.01f, -1.59f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _savedSearch = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
