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
public final class LooksKt {
    private static ImageVector _looks;

    public static final ImageVector getLooks(Icons.Rounded rounded) {
        ImageVector imageVector = _looks;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Looks", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 10.0f);
        pathBuilder.curveToRelative(-3.47f, 0.0f, -6.36f, 2.54f, -6.91f, 5.86f);
        pathBuilder.curveToRelative(-0.1f, 0.6f, 0.39f, 1.14f, 1.0f, 1.14f);
        pathBuilder.curveToRelative(0.49f, 0.0f, 0.9f, -0.36f, 0.98f, -0.85f);
        pathBuilder.curveTo(7.48f, 13.79f, 9.53f, 12.0f, 12.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.52f, 1.79f, 4.93f, 4.15f);
        pathBuilder.curveToRelative(0.08f, 0.49f, 0.49f, 0.85f, 0.98f, 0.85f);
        pathBuilder.curveToRelative(0.61f, 0.0f, 1.09f, -0.54f, 0.99f, -1.14f);
        pathBuilder.curveTo(18.36f, 12.54f, 15.47f, 10.0f, 12.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder.curveTo(6.3f, 6.0f, 1.61f, 10.34f, 1.05f, 15.9f);
        pathBuilder.curveToRelative(-0.05f, 0.59f, 0.41f, 1.1f, 1.01f, 1.1f);
        pathBuilder.curveToRelative(0.51f, 0.0f, 0.94f, -0.38f, 0.99f, -0.88f);
        pathBuilder.curveTo(3.49f, 11.57f, 7.34f, 8.0f, 12.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(8.51f, 3.57f, 8.96f, 8.12f);
        pathBuilder.curveToRelative(0.05f, 0.5f, 0.48f, 0.88f, 0.99f, 0.88f);
        pathBuilder.curveToRelative(0.59f, 0.0f, 1.06f, -0.51f, 1.0f, -1.1f);
        pathBuilder.curveTo(22.39f, 10.34f, 17.7f, 6.0f, 12.0f, 6.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _looks = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
