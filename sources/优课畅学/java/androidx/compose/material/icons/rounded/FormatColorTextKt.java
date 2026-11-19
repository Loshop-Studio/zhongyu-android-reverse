package androidx.compose.material.icons.rounded;

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
public final class FormatColorTextKt {
    private static ImageVector _formatColorText;

    public static final ImageVector getFormatColorText(Icons.Rounded rounded) {
        ImageVector imageVector = _formatColorText;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FormatColorText", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM24629getButtKaPHkGw = companion2.m24629getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM24639getBevelLxFBmk8 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 20.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(21.1f, 20.0f, 20.0f, 20.0f);
        pathBuilder.close();
        ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw2 = companion2.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk82 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(7.11f, 17.0f);
        pathBuilder2.lineTo(7.11f, 17.0f);
        pathBuilder2.curveToRelative(0.48f, 0.0f, 0.91f, -0.3f, 1.06f, -0.75f);
        pathBuilder2.lineToRelative(1.01f, -2.83f);
        pathBuilder2.horizontalLineToRelative(5.65f);
        pathBuilder2.lineToRelative(0.99f, 2.82f);
        pathBuilder2.curveTo(15.98f, 16.7f, 16.41f, 17.0f, 16.89f, 17.0f);
        pathBuilder2.curveToRelative(0.79f, 0.0f, 1.33f, -0.79f, 1.05f, -1.52f);
        pathBuilder2.lineTo(13.69f, 4.17f);
        pathBuilder2.curveTo(13.43f, 3.47f, 12.75f, 3.0f, 12.0f, 3.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.43f, 0.47f, -1.69f, 1.17f);
        pathBuilder2.lineTo(6.06f, 15.48f);
        pathBuilder2.curveTo(5.78f, 16.21f, 6.33f, 17.0f, 7.11f, 17.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.94f, 5.6f);
        pathBuilder2.horizontalLineToRelative(0.12f);
        pathBuilder2.lineToRelative(2.03f, 5.79f);
        pathBuilder2.horizontalLineTo(9.91f);
        pathBuilder2.lineTo(11.94f, 5.6f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw2, iM24639getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatColorText = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
