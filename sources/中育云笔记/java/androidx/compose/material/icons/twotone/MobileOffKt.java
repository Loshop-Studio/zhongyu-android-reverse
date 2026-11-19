package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class MobileOffKt {
    private static ImageVector _mobileOff;

    public static final ImageVector getMobileOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _mobileOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MobileOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 5.0f);
        pathBuilder.verticalLineToRelative(8.61f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.curveToRelative(-0.71f, 0.0f, -1.33f, 0.37f, -1.68f, 0.93f);
        pathBuilder.lineTo(8.39f, 5.0f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(1.49f, 3.76f);
        pathBuilder.lineTo(5.0f, 7.27f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveToRelative(1.02f, 0.0f, 1.85f, -0.77f, 1.98f, -1.75f);
        pathBuilder.lineToRelative(1.72f, 1.72f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(2.9f, 2.35f);
        pathBuilder.lineTo(1.49f, 3.76f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 9.27f);
        pathBuilder.lineTo(16.73f, 19.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineTo(9.27f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mobileOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
