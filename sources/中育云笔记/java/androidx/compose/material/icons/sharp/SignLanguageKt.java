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
public final class SignLanguageKt {
    private static ImageVector _signLanguage;

    public static final ImageVector getSignLanguage(Icons.Sharp sharp) {
        ImageVector imageVector = _signLanguage;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SignLanguage", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.49f, 13.0f);
        pathBuilder.lineToRelative(-1.39f, -2.7f);
        pathBuilder.lineTo(12.49f, 9.0f);
        pathBuilder.lineTo(19.0f, 15.2f);
        pathBuilder.verticalLineTo(24.0f);
        pathBuilder.horizontalLineTo(4.5f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(7.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineTo(3.5f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(12.49f);
        pathBuilder.close();
        pathBuilder.moveTo(11.78f, 7.12f);
        pathBuilder.curveToRelative(-0.84f, 0.4f, -1.17f, 0.62f, -1.63f, 1.19f);
        pathBuilder.lineTo(6.76f, 4.74f);
        pathBuilder.lineToRelative(1.45f, -1.38f);
        pathBuilder.lineTo(11.78f, 7.12f);
        pathBuilder.close();
        pathBuilder.moveTo(9.64f, 9.21f);
        pathBuilder.curveTo(9.41f, 9.76f, 9.35f, 10.45f, 9.44f, 11.0f);
        pathBuilder.horizontalLineTo(8.58f);
        pathBuilder.lineTo(5.62f, 7.89f);
        pathBuilder.lineToRelative(1.45f, -1.38f);
        pathBuilder.lineTo(9.64f, 9.21f);
        pathBuilder.close();
        pathBuilder.moveTo(21.98f, 12.34f);
        pathBuilder.lineTo(22.0f, 3.35f);
        pathBuilder.lineToRelative(-1.9f, -0.1f);
        pathBuilder.lineToRelative(-1.0f, 2.86f);
        pathBuilder.lineTo(13.3f, 0.0f);
        pathBuilder.lineToRelative(-1.45f, 1.38f);
        pathBuilder.lineToRelative(4.09f, 4.3f);
        pathBuilder.lineToRelative(-0.73f, 0.69f);
        pathBuilder.lineTo(9.74f, 0.64f);
        pathBuilder.lineTo(8.3f, 2.0f);
        pathBuilder.lineToRelative(3.36f, 3.53f);
        pathBuilder.lineToRelative(1.06f, 1.11f);
        pathBuilder.lineToRelative(2.65f, 2.33f);
        pathBuilder.lineToRelative(5.08f, 4.83f);
        pathBuilder.lineTo(21.98f, 12.34f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signLanguage = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
