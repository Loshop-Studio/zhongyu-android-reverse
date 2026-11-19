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
public final class ContentPasteSearchKt {
    private static ImageVector _contentPasteSearch;

    public static final ImageVector getContentPasteSearch(Icons.Rounded rounded) {
        ImageVector imageVector = _contentPasteSearch;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ContentPasteSearch", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(-4.18f);
        pathBuilder.curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 3.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveTo(11.45f, 3.0f, 12.0f, 3.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(22.3f, 20.9f);
        pathBuilder2.lineToRelative(-2.0f, -2.0f);
        pathBuilder2.curveToRelative(0.58f, -1.01f, 0.95f, -2.23f, 0.51f, -3.65f);
        pathBuilder2.curveToRelative(-0.53f, -1.72f, -2.04f, -3.05f, -3.84f, -3.22f);
        pathBuilder2.curveToRelative(-2.87f, -0.28f, -5.23f, 2.07f, -4.95f, 4.95f);
        pathBuilder2.curveToRelative(0.18f, 1.79f, 1.5f, 3.31f, 3.22f, 3.84f);
        pathBuilder2.curveToRelative(1.43f, 0.44f, 2.64f, 0.07f, 3.65f, -0.51f);
        pathBuilder2.lineToRelative(2.0f, 2.0f);
        pathBuilder2.curveToRelative(0.39f, 0.39f, 1.01f, 0.39f, 1.4f, 0.0f);
        pathBuilder2.reflectiveCurveTo(22.69f, 21.29f, 22.3f, 20.9f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.5f, 19.0f);
        pathBuilder2.curveToRelative(-1.4f, 0.0f, -2.5f, -1.1f, -2.5f, -2.5f);
        pathBuilder2.curveToRelative(0.0f, -1.4f, 1.1f, -2.5f, 2.5f, -2.5f);
        pathBuilder2.reflectiveCurveToRelative(2.5f, 1.1f, 2.5f, 2.5f);
        pathBuilder2.curveTo(19.0f, 17.9f, 17.9f, 19.0f, 16.5f, 19.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contentPasteSearch = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
