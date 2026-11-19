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
public final class MovieFilterKt {
    private static ImageVector _movieFilter;

    public static final ImageVector getMovieFilter(Icons.Rounded rounded) {
        ImageVector imageVector = _movieFilter;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MovieFilter", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.5f, 4.0f);
        pathBuilder.lineTo(18.0f, 4.0f);
        pathBuilder.lineToRelative(1.74f, 2.61f);
        pathBuilder.curveToRelative(0.11f, 0.17f, -0.01f, 0.39f, -0.21f, 0.39f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(-0.33f, 0.0f, -0.65f, -0.17f, -0.83f, -0.45f);
        pathBuilder.lineTo(15.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.lineToRelative(1.74f, 2.61f);
        pathBuilder.curveToRelative(0.11f, 0.17f, -0.01f, 0.39f, -0.21f, 0.39f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(-0.33f, 0.0f, -0.65f, -0.17f, -0.83f, -0.45f);
        pathBuilder.lineTo(10.0f, 4.0f);
        pathBuilder.lineTo(8.0f, 4.0f);
        pathBuilder.lineToRelative(1.74f, 2.61f);
        pathBuilder.curveToRelative(0.11f, 0.17f, -0.01f, 0.39f, -0.21f, 0.39f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(-0.33f, 0.0f, -0.64f, -0.17f, -0.83f, -0.45f);
        pathBuilder.lineTo(5.0f, 4.0f);
        pathBuilder.lineTo(4.0f, 4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilder.lineTo(2.0f, 18.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(22.0f, 4.5f);
        pathBuilder.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder.close();
        pathBuilder.moveTo(11.25f, 15.25f);
        pathBuilder.lineTo(10.0f, 18.0f);
        pathBuilder.lineToRelative(-1.25f, -2.75f);
        pathBuilder.lineTo(6.0f, 14.0f);
        pathBuilder.lineToRelative(2.75f, -1.25f);
        pathBuilder.lineTo(10.0f, 10.0f);
        pathBuilder.lineToRelative(1.25f, 2.75f);
        pathBuilder.lineTo(14.0f, 14.0f);
        pathBuilder.lineToRelative(-2.75f, 1.25f);
        pathBuilder.close();
        pathBuilder.moveTo(16.94f, 11.94f);
        pathBuilder.lineTo(16.0f, 14.0f);
        pathBuilder.lineToRelative(-0.94f, -2.06f);
        pathBuilder.lineTo(13.0f, 11.0f);
        pathBuilder.lineToRelative(2.06f, -0.94f);
        pathBuilder.lineTo(16.0f, 8.0f);
        pathBuilder.lineToRelative(0.94f, 2.06f);
        pathBuilder.lineTo(19.0f, 11.0f);
        pathBuilder.lineToRelative(-2.06f, 0.94f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _movieFilter = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
