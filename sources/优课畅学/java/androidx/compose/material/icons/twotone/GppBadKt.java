package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class GppBadKt {
    private static ImageVector _gppBad;

    public static final ImageVector getGppBad(Icons.TwoTone twoTone) {
        ImageVector imageVector = _gppBad;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.GppBad", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM24629getButtKaPHkGw = companion2.m24629getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM24639getBevelLxFBmk8 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.lineTo(4.0f, 5.0f);
        pathBuilder.verticalLineToRelative(6.09f);
        pathBuilder.curveToRelative(0.0f, 5.05f, 3.41f, 9.76f, 8.0f, 10.91f);
        pathBuilder.curveToRelative(4.59f, -1.15f, 8.0f, -5.86f, 8.0f, -10.91f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.lineTo(12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 11.09f);
        pathBuilder.curveToRelative(0.0f, 4.0f, -2.55f, 7.7f, -6.0f, 8.83f);
        pathBuilder.curveToRelative(-3.45f, -1.13f, -6.0f, -4.82f, -6.0f, -8.83f);
        pathBuilder.verticalLineToRelative(-4.7f);
        pathBuilder.lineToRelative(6.0f, -2.25f);
        pathBuilder.lineToRelative(6.0f, 2.25f);
        pathBuilder.verticalLineTo(11.09f);
        pathBuilder.close();
        pathBuilder.moveTo(9.91f, 8.5f);
        pathBuilder.lineTo(8.5f, 9.91f);
        pathBuilder.lineTo(10.59f, 12.0f);
        pathBuilder.lineTo(8.5f, 14.09f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineTo(12.0f, 13.42f);
        pathBuilder.lineToRelative(2.09f, 2.08f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(13.42f, 12.0f);
        pathBuilder.lineToRelative(2.08f, -2.09f);
        pathBuilder.lineTo(14.09f, 8.5f);
        pathBuilder.lineTo(12.0f, 10.59f);
        pathBuilder.lineTo(9.91f, 8.5f);
        pathBuilder.close();
        ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw2 = companion2.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk82 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(6.0f, 6.39f);
        pathBuilder2.verticalLineToRelative(4.7f);
        pathBuilder2.curveToRelative(0.0f, 4.0f, 2.55f, 7.7f, 6.0f, 8.83f);
        pathBuilder2.curveToRelative(3.45f, -1.13f, 6.0f, -4.82f, 6.0f, -8.83f);
        pathBuilder2.verticalLineToRelative(-4.7f);
        pathBuilder2.lineToRelative(-6.0f, -2.25f);
        pathBuilder2.lineTo(6.0f, 6.39f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.5f, 9.91f);
        pathBuilder2.lineTo(13.42f, 12.0f);
        pathBuilder2.lineToRelative(2.08f, 2.09f);
        pathBuilder2.lineToRelative(-1.41f, 1.41f);
        pathBuilder2.lineTo(12.0f, 13.42f);
        pathBuilder2.lineTo(9.91f, 15.5f);
        pathBuilder2.lineTo(8.5f, 14.09f);
        pathBuilder2.lineTo(10.59f, 12.0f);
        pathBuilder2.lineTo(8.5f, 9.91f);
        pathBuilder2.lineTo(9.91f, 8.5f);
        pathBuilder2.lineTo(12.0f, 10.59f);
        pathBuilder2.lineToRelative(2.09f, -2.09f);
        pathBuilder2.lineTo(15.5f, 9.91f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM24629getButtKaPHkGw2, iM24639getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gppBad = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
