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
public final class PhoneDisabledKt {
    private static ImageVector _phoneDisabled;

    public static final ImageVector getPhoneDisabled(Icons.Sharp sharp) {
        ImageVector imageVector = _phoneDisabled;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PhoneDisabled", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.52f, 17.35f);
        pathBuilder.curveTo(11.39f, 19.83f, 7.36f, 21.22f, 3.0f, 20.97f);
        pathBuilder.verticalLineToRelative(-5.51f);
        pathBuilder.lineToRelative(5.27f, -0.61f);
        pathBuilder.lineToRelative(2.52f, 2.52f);
        pathBuilder.curveToRelative(0.81f, -0.41f, 1.58f, -0.9f, 2.3f, -1.45f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineToRelative(1.42f, -1.41f);
        pathBuilder.lineTo(21.19f, 21.2f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineTo(14.52f, 17.35f);
        pathBuilder.close();
        pathBuilder.moveTo(15.91f, 13.11f);
        pathBuilder.curveToRelative(0.56f, -0.73f, 1.05f, -1.51f, 1.47f, -2.33f);
        pathBuilder.lineToRelative(-2.53f, -2.53f);
        pathBuilder.lineTo(15.46f, 3.0f);
        pathBuilder.horizontalLineToRelative(5.51f);
        pathBuilder.curveToRelative(0.25f, 4.37f, -1.15f, 8.4f, -3.63f, 11.54f);
        pathBuilder.lineTo(15.91f, 13.11f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneDisabled = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
