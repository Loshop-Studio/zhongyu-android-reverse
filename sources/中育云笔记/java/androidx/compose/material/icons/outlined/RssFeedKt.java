package androidx.compose.material.icons.outlined;

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

    public static final ImageVector getRssFeed(Icons.Outlined outlined) {
        ImageVector imageVector = _rssFeed;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RssFeed", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        pathBuilder2.moveTo(4.0f, 4.44f);
        pathBuilder2.verticalLineToRelative(2.83f);
        pathBuilder2.curveToRelative(7.03f, 0.0f, 12.73f, 5.7f, 12.73f, 12.73f);
        pathBuilder2.horizontalLineToRelative(2.83f);
        pathBuilder2.curveToRelative(0.0f, -8.59f, -6.97f, -15.56f, -15.56f, -15.56f);
        pathBuilder2.close();
        pathBuilder2.moveTo(4.0f, 10.1f);
        pathBuilder2.verticalLineToRelative(2.83f);
        pathBuilder2.curveToRelative(3.9f, 0.0f, 7.07f, 3.17f, 7.07f, 7.07f);
        pathBuilder2.horizontalLineToRelative(2.83f);
        pathBuilder2.curveToRelative(0.0f, -5.47f, -4.43f, -9.9f, -9.9f, -9.9f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rssFeed = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
