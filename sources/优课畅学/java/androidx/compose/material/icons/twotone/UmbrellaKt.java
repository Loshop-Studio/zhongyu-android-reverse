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
public final class UmbrellaKt {
    private static ImageVector _umbrella;

    public static final ImageVector getUmbrella(Icons.TwoTone twoTone) {
        ImageVector imageVector = _umbrella;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Umbrella", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM24629getButtKaPHkGw = companion2.m24629getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM24639getBevelLxFBmk8 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.28f, 8.5f);
        pathBuilder.lineToRelative(0.76f, 0.58f);
        pathBuilder.lineToRelative(0.92f, -0.23f);
        pathBuilder.lineTo(13.0f, 14.8f);
        pathBuilder.verticalLineTo(8.29f);
        pathBuilder.lineTo(13.28f, 8.5f);
        pathBuilder.close();
        pathBuilder.moveTo(9.03f, 8.86f);
        pathBuilder.lineTo(11.0f, 14.8f);
        pathBuilder.verticalLineTo(8.29f);
        pathBuilder.lineTo(10.72f, 8.5f);
        pathBuilder.lineTo(9.96f, 9.09f);
        pathBuilder.lineTo(9.03f, 8.86f);
        pathBuilder.close();
        ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw2 = companion2.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk82 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(14.5f, 6.92f);
        pathBuilder2.lineTo(13.0f, 5.77f);
        pathBuilder2.verticalLineTo(3.88f);
        pathBuilder2.verticalLineTo(3.4f);
        pathBuilder2.curveToRelative(0.0f, -0.26f, 0.22f, -0.48f, 0.5f, -0.48f);
        pathBuilder2.curveToRelative(0.28f, 0.0f, 0.5f, 0.21f, 0.5f, 0.48f);
        pathBuilder2.verticalLineTo(4.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineTo(3.4f);
        pathBuilder2.curveTo(16.0f, 2.07f, 14.88f, 1.0f, 13.5f, 1.0f);
        pathBuilder2.curveTo(12.12f, 1.0f, 11.0f, 2.07f, 11.0f, 3.4f);
        pathBuilder2.verticalLineToRelative(0.48f);
        pathBuilder2.verticalLineToRelative(1.89f);
        pathBuilder2.lineTo(9.5f, 6.92f);
        pathBuilder2.lineTo(6.0f, 6.07f);
        pathBuilder2.lineToRelative(5.05f, 15.25f);
        pathBuilder2.curveTo(11.2f, 21.77f, 11.6f, 22.0f, 12.0f, 22.0f);
        pathBuilder2.reflectiveCurveToRelative(0.8f, -0.23f, 0.95f, -0.69f);
        pathBuilder2.lineTo(18.0f, 6.07f);
        pathBuilder2.lineTo(14.5f, 6.92f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.28f, 8.5f);
        pathBuilder2.lineToRelative(0.76f, 0.58f);
        pathBuilder2.lineToRelative(0.92f, -0.23f);
        pathBuilder2.lineTo(13.0f, 14.8f);
        pathBuilder2.verticalLineTo(8.29f);
        pathBuilder2.lineTo(13.28f, 8.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(9.96f, 9.09f);
        pathBuilder2.lineToRelative(0.76f, -0.58f);
        pathBuilder2.lineTo(11.0f, 8.29f);
        pathBuilder2.verticalLineToRelative(6.51f);
        pathBuilder2.lineTo(9.03f, 8.86f);
        pathBuilder2.lineTo(9.96f, 9.09f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw2, iM24639getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _umbrella = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
