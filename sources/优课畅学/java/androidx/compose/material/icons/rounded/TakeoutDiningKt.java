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
public final class TakeoutDiningKt {
    private static ImageVector _takeoutDining;

    public static final ImageVector getTakeoutDining(Icons.Rounded rounded) {
        ImageVector imageVector = _takeoutDining;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TakeoutDining", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM24629getButtKaPHkGw = companion2.m24629getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM24639getBevelLxFBmk8 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.29f, 6.75f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.01f, -0.39f, -1.4f, 0.0f);
        pathBuilder.lineTo(19.0f, 7.63f);
        pathBuilder.lineToRelative(0.03f, -0.56f);
        pathBuilder.lineToRelative(-3.46f, -3.48f);
        pathBuilder.curveTo(15.19f, 3.21f, 14.68f, 3.0f, 14.15f, 3.0f);
        pathBuilder.horizontalLineToRelative(-4.3f);
        pathBuilder.curveTo(9.32f, 3.0f, 8.81f, 3.21f, 8.43f, 3.59f);
        pathBuilder.lineTo(4.97f, 7.07f);
        pathBuilder.lineTo(5.0f, 7.57f);
        pathBuilder.lineTo(4.11f, 6.7f);
        pathBuilder.curveTo(3.72f, 6.32f, 3.1f, 6.32f, 2.72f, 6.71f);
        pathBuilder.lineTo(2.7f, 6.73f);
        pathBuilder.curveTo(2.32f, 7.12f, 2.32f, 7.75f, 2.72f, 8.13f);
        pathBuilder.lineTo(4.66f, 10.0f);
        pathBuilder.horizontalLineToRelative(14.69f);
        pathBuilder.lineToRelative(1.92f, -1.84f);
        pathBuilder.curveTo(21.67f, 7.78f, 21.68f, 7.14f, 21.29f, 6.75f);
        pathBuilder.close();
        ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw2 = companion2.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk82 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(5.79f, 18.15f);
        pathBuilder2.curveTo(5.87f, 19.19f, 6.74f, 20.0f, 7.79f, 20.0f);
        pathBuilder2.horizontalLineToRelative(8.43f);
        pathBuilder2.curveToRelative(1.05f, 0.0f, 1.92f, -0.81f, 1.99f, -1.85f);
        pathBuilder2.lineToRelative(0.49f, -6.6f);
        pathBuilder2.horizontalLineTo(5.3f);
        pathBuilder2.lineTo(5.79f, 18.15f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw2, iM24639getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _takeoutDining = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
