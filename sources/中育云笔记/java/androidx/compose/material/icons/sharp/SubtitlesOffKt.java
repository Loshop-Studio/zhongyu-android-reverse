package androidx.compose.material.icons.sharp;

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
public final class SubtitlesOffKt {
    private static ImageVector _subtitlesOff;

    public static final ImageVector getSubtitlesOff(Icons.Sharp sharp) {
        ImageVector imageVector = _subtitlesOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SubtitlesOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.83f, 4.0f);
        pathBuilder.lineToRelative(8.0f, 8.0f);
        pathBuilder.lineToRelative(5.17f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 2.0f);
        pathBuilder.lineToRelative(-3.17f, 0.0f);
        pathBuilder.lineToRelative(5.17f, 5.17f);
        pathBuilder.lineToRelative(0.0f, -15.17f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(1.04f, 3.87f);
        pathBuilder2.lineTo(2.0f, 4.83f);
        pathBuilder2.verticalLineTo(20.0f);
        pathBuilder2.horizontalLineToRelative(15.17f);
        pathBuilder2.lineToRelative(2.96f, 2.96f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineTo(2.45f, 2.45f);
        pathBuilder2.lineTo(1.04f, 3.87f);
        pathBuilder2.close();
        pathBuilder2.moveTo(4.0f, 12.0f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.verticalLineTo(12.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(4.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(9.17f);
        pathBuilder2.lineTo(14.0f, 16.83f);
        pathBuilder2.verticalLineTo(18.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.verticalLineTo(16.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _subtitlesOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
