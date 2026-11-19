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
public final class SwipeDownAltKt {
    private static ImageVector _swipeDownAlt;

    public static final ImageVector getSwipeDownAlt(Icons.TwoTone twoTone) {
        ImageVector imageVector = _swipeDownAlt;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SwipeDownAlt", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 9.0f);
        pathBuilder.moveToRelative(-3.0f, 0.0f);
        pathBuilder.arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f);
        pathBuilder.arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f);
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(13.0f, 13.9f);
        pathBuilder2.curveToRelative(2.28f, -0.46f, 4.0f, -2.48f, 4.0f, -4.9f);
        pathBuilder2.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilder2.reflectiveCurveTo(7.0f, 6.24f, 7.0f, 9.0f);
        pathBuilder2.curveToRelative(0.0f, 2.42f, 1.72f, 4.44f, 4.0f, 4.9f);
        pathBuilder2.verticalLineToRelative(4.27f);
        pathBuilder2.lineToRelative(-1.59f, -1.59f);
        pathBuilder2.lineTo(8.0f, 18.0f);
        pathBuilder2.lineToRelative(4.0f, 4.0f);
        pathBuilder2.lineToRelative(4.0f, -4.0f);
        pathBuilder2.lineToRelative(-1.41f, -1.41f);
        pathBuilder2.lineTo(13.0f, 18.17f);
        pathBuilder2.verticalLineTo(13.9f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.0f, 9.0f);
        pathBuilder2.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilder2.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder2.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder2.reflectiveCurveTo(15.0f, 7.34f, 15.0f, 9.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeDownAlt = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
