package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class MovieFilterKt {
    private static ImageVector _movieFilter;

    public static final ImageVector getMovieFilter(Icons.Sharp sharp) {
        ImageVector imageVector = _movieFilter;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MovieFilter", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 4.0f);
        pathBuilder.lineToRelative(2.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.lineToRelative(-2.0f, -3.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.lineToRelative(2.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.lineToRelative(-2.0f, -3.0f);
        pathBuilder.lineTo(8.0f, 4.0f);
        pathBuilder.lineToRelative(2.0f, 3.0f);
        pathBuilder.lineTo(7.0f, 7.0f);
        pathBuilder.lineTo(5.0f, 4.0f);
        pathBuilder.lineTo(4.0f, 4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilder.lineTo(2.0f, 18.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(22.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
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
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _movieFilter = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
