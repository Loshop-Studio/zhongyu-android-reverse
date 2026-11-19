package androidx.compose.material.icons.sharp;

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
public final class NoFlashKt {
    private static ImageVector _noFlash;

    public static final ImageVector getNoFlash(Icons.Sharp sharp) {
        ImageVector imageVector = _noFlash;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NoFlash", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.45f, 2.45f);
        pathBuilder.lineTo(1.04f, 3.87f);
        pathBuilder.lineToRelative(5.3f, 5.3f);
        pathBuilder.lineTo(6.14f, 9.4f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineToRelative(-1.17f);
        pathBuilder.lineToRelative(2.13f, 2.13f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(2.45f, 2.45f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 20.0f);
        pathBuilder.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilder.curveToRelative(0.0f, -1.95f, 1.4f, -3.57f, 3.25f, -3.92f);
        pathBuilder.lineToRelative(1.57f, 1.57f);
        pathBuilder.curveToRelative(-0.26f, -0.09f, -0.53f, -0.15f, -0.82f, -0.15f);
        pathBuilder.curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f);
        pathBuilder.curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilder.curveToRelative(0.0f, -0.29f, -0.06f, -0.56f, -0.15f, -0.82f);
        pathBuilder.lineToRelative(1.57f, 1.57f);
        pathBuilder.curveTo(13.57f, 18.6f, 11.95f, 20.0f, 10.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 15.17f);
        pathBuilder.lineTo(10.83f, 8.0f);
        pathBuilder.horizontalLineToRelative(1.75f);
        pathBuilder.lineToRelative(1.28f, 1.4f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.verticalLineTo(15.17f);
        pathBuilder.close();
        pathBuilder.moveTo(20.4f, 5.6f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.lineTo(19.0f, 11.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.lineTo(20.4f, 5.6f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noFlash = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
