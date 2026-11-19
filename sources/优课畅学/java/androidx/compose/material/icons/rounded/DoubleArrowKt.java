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
public final class DoubleArrowKt {
    private static ImageVector _doubleArrow;

    public static final ImageVector getDoubleArrow(Icons.Rounded rounded) {
        ImageVector imageVector = _doubleArrow;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DoubleArrow", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM24629getButtKaPHkGw = companion2.m24629getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM24639getBevelLxFBmk8 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.08f, 11.42f);
        pathBuilder.lineToRelative(-4.04f, -5.65f);
        pathBuilder.curveTo(15.7f, 5.29f, 15.15f, 5.0f, 14.56f, 5.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-1.49f, 0.0f, -2.35f, 1.68f, -1.49f, 2.89f);
        pathBuilder.lineTo(16.0f, 12.0f);
        pathBuilder.lineToRelative(-2.93f, 4.11f);
        pathBuilder.curveToRelative(-0.87f, 1.21f, 0.0f, 2.89f, 1.49f, 2.89f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.59f, 0.0f, 1.15f, -0.29f, 1.49f, -0.77f);
        pathBuilder.lineToRelative(4.04f, -5.65f);
        pathBuilder.curveTo(20.33f, 12.23f, 20.33f, 11.77f, 20.08f, 11.42f);
        pathBuilder.close();
        ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw2 = companion2.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk82 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(13.08f, 11.42f);
        pathBuilder2.lineTo(9.05f, 5.77f);
        pathBuilder2.curveTo(8.7f, 5.29f, 8.15f, 5.0f, 7.56f, 5.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveTo(6.07f, 5.0f, 5.2f, 6.68f, 6.07f, 7.89f);
        pathBuilder2.lineTo(9.0f, 12.0f);
        pathBuilder2.lineToRelative(-2.93f, 4.11f);
        pathBuilder2.curveTo(5.2f, 17.32f, 6.07f, 19.0f, 7.56f, 19.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.59f, 0.0f, 1.15f, -0.29f, 1.49f, -0.77f);
        pathBuilder2.lineToRelative(4.04f, -5.65f);
        pathBuilder2.curveTo(13.33f, 12.23f, 13.33f, 11.77f, 13.08f, 11.42f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw2, iM24639getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doubleArrow = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
