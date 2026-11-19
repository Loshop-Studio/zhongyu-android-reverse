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
public final class MicExternalOnKt {
    private static ImageVector _micExternalOn;

    public static final ImageVector getMicExternalOn(Icons.Sharp sharp) {
        ImageVector imageVector = _micExternalOn;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MicExternalOn", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.22f, 7.0f);
        pathBuilder.horizontalLineTo(4.78f);
        pathBuilder.curveTo(4.3f, 6.47f, 4.0f, 5.77f, 4.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder.curveTo(10.0f, 5.77f, 9.7f, 6.47f, 9.22f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 2.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, -1.79f, 0.0f, -4.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.lineTo(4.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.lineTo(9.0f, 18.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _micExternalOn = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
