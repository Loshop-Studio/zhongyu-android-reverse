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
public final class SingleBedKt {
    private static ImageVector _singleBed;

    public static final ImageVector getSingleBed(Icons.Rounded rounded) {
        ImageVector imageVector = _singleBed;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SingleBed", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 10.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.curveTo(6.9f, 5.0f, 6.0f, 5.9f, 6.0f, 7.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(1.33f);
        pathBuilder.lineToRelative(0.51f, 1.53f);
        pathBuilder.curveTo(5.94f, 18.81f, 6.2f, 19.0f, 6.5f, 19.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.3f, 0.0f, 0.56f, -0.19f, 0.66f, -0.47f);
        pathBuilder.lineTo(7.67f, 17.0f);
        pathBuilder.horizontalLineToRelative(8.67f);
        pathBuilder.lineToRelative(0.51f, 1.53f);
        pathBuilder.curveTo(16.94f, 18.81f, 17.2f, 19.0f, 17.5f, 19.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.3f, 0.0f, 0.56f, -0.19f, 0.66f, -0.47f);
        pathBuilder.lineTo(18.67f, 17.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.curveTo(20.0f, 10.9f, 19.1f, 10.0f, 18.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 10.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _singleBed = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
