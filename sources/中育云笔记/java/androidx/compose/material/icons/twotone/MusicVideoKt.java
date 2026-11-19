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
public final class MusicVideoKt {
    private static ImageVector _musicVideo;

    public static final ImageVector getMusicVideo(Icons.TwoTone twoTone) {
        ImageVector imageVector = _musicVideo;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MusicVideo", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.lineTo(21.0f, 5.0f);
        pathBuilder.lineTo(3.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 12.0f);
        pathBuilder.curveToRelative(0.35f, 0.0f, 0.69f, 0.07f, 1.0f, 0.18f);
        pathBuilder.lineTo(12.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(7.03f);
        pathBuilder.curveToRelative(-0.02f, 1.64f, -1.35f, 2.97f, -3.0f, 2.97f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(21.0f, 3.0f);
        pathBuilder2.lineTo(3.0f, 3.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(18.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.lineTo(23.0f, 5.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(21.0f, 19.0f);
        pathBuilder2.lineTo(3.0f, 19.0f);
        pathBuilder2.lineTo(3.0f, 5.0f);
        pathBuilder2.horizontalLineToRelative(18.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.0f, 18.0f);
        pathBuilder2.curveToRelative(1.65f, 0.0f, 2.98f, -1.33f, 3.0f, -2.97f);
        pathBuilder2.lineTo(14.0f, 8.0f);
        pathBuilder2.horizontalLineToRelative(3.0f);
        pathBuilder2.lineTo(17.0f, 6.0f);
        pathBuilder2.horizontalLineToRelative(-5.0f);
        pathBuilder2.verticalLineToRelative(6.18f);
        pathBuilder2.curveToRelative(-0.31f, -0.11f, -0.65f, -0.18f, -1.0f, -0.18f);
        pathBuilder2.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder2.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _musicVideo = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
