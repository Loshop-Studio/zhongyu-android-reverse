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
public final class LandscapeKt {
    private static ImageVector _landscape;

    public static final ImageVector getLandscape(Icons.Rounded rounded) {
        ImageVector imageVector = _landscape;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Landscape", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.2f, 7.07f);
        pathBuilder.lineTo(10.25f, 11.0f);
        pathBuilder.lineToRelative(2.25f, 3.0f);
        pathBuilder.curveToRelative(0.33f, 0.44f, 0.24f, 1.07f, -0.2f, 1.4f);
        pathBuilder.curveToRelative(-0.44f, 0.33f, -1.07f, 0.25f, -1.4f, -0.2f);
        pathBuilder.curveToRelative(-1.05f, -1.4f, -2.31f, -3.07f, -3.1f, -4.14f);
        pathBuilder.curveToRelative(-0.4f, -0.53f, -1.2f, -0.53f, -1.6f, 0.0f);
        pathBuilder.lineToRelative(-4.0f, 5.33f);
        pathBuilder.curveToRelative(-0.49f, 0.67f, -0.02f, 1.61f, 0.8f, 1.61f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.curveToRelative(0.82f, 0.0f, 1.29f, -0.94f, 0.8f, -1.6f);
        pathBuilder.lineToRelative(-7.0f, -9.33f);
        pathBuilder.curveToRelative(-0.4f, -0.54f, -1.2f, -0.54f, -1.6f, 0.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _landscape = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
