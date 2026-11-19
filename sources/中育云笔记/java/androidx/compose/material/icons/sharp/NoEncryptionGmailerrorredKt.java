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
public final class NoEncryptionGmailerrorredKt {
    private static ImageVector _noEncryptionGmailerrorred;

    public static final ImageVector getNoEncryptionGmailerrorred(Icons.Sharp sharp) {
        ImageVector imageVector = _noEncryptionGmailerrorred;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NoEncryptionGmailerrorred", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.9f, 6.0f);
        pathBuilder.curveToRelative(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        pathBuilder.reflectiveCurveToRelative(3.1f, 1.39f, 3.1f, 3.1f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-4.66f);
        pathBuilder.lineTo(20.0f, 17.56f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineTo(6.22f);
        pathBuilder.curveToRelative(0.0f, -2.61f, -1.91f, -4.94f, -4.51f, -5.19f);
        pathBuilder.curveToRelative(-2.53f, -0.25f, -4.72f, 1.41f, -5.32f, 3.7f);
        pathBuilder.lineTo(8.9f, 6.46f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.41f, 4.81f);
        pathBuilder.lineTo(3.0f, 6.22f);
        pathBuilder.lineTo(4.78f, 8.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.horizontalLineToRelative(14.78f);
        pathBuilder.lineToRelative(1.0f, 1.0f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noEncryptionGmailerrorred = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
