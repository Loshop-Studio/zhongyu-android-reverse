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
public final class RssFeedKt {
    private static ImageVector _rssFeed;

    public static final ImageVector getRssFeed(Icons.Rounded rounded) {
        ImageVector imageVector = _rssFeed;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RssFeed", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.18f, 17.82f);
        pathBuilder.moveToRelative(-2.18f, 0.0f);
        pathBuilder.arcToRelative(2.18f, 2.18f, 0.0f, true, true, 4.36f, 0.0f);
        pathBuilder.arcToRelative(2.18f, 2.18f, 0.0f, true, true, -4.36f, 0.0f);
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(5.59f, 10.23f);
        pathBuilder2.curveToRelative(-0.84f, -0.14f, -1.59f, 0.55f, -1.59f, 1.4f);
        pathBuilder2.curveToRelative(0.0f, 0.71f, 0.53f, 1.28f, 1.23f, 1.4f);
        pathBuilder2.curveToRelative(2.92f, 0.51f, 5.22f, 2.82f, 5.74f, 5.74f);
        pathBuilder2.curveToRelative(0.12f, 0.7f, 0.69f, 1.23f, 1.4f, 1.23f);
        pathBuilder2.curveToRelative(0.85f, 0.0f, 1.54f, -0.75f, 1.41f, -1.59f);
        pathBuilder2.curveToRelative(-0.68f, -4.2f, -3.99f, -7.51f, -8.19f, -8.18f);
        pathBuilder2.close();
        pathBuilder2.moveTo(5.56f, 4.52f);
        pathBuilder2.curveTo(4.73f, 4.43f, 4.0f, 5.1f, 4.0f, 5.93f);
        pathBuilder2.curveToRelative(0.0f, 0.73f, 0.55f, 1.33f, 1.27f, 1.4f);
        pathBuilder2.curveToRelative(6.01f, 0.6f, 10.79f, 5.38f, 11.39f, 11.39f);
        pathBuilder2.curveToRelative(0.07f, 0.73f, 0.67f, 1.28f, 1.4f, 1.28f);
        pathBuilder2.curveToRelative(0.84f, 0.0f, 1.5f, -0.73f, 1.42f, -1.56f);
        pathBuilder2.curveToRelative(-0.73f, -7.34f, -6.57f, -13.19f, -13.92f, -13.92f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rssFeed = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
