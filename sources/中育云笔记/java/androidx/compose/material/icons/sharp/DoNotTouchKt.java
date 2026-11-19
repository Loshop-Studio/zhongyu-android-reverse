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
public final class DoNotTouchKt {
    private static ImageVector _doNotTouch;

    public static final ImageVector getDoNotTouch(Icons.Sharp sharp) {
        ImageVector imageVector = _doNotTouch;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DoNotTouch", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 10.17f);
        pathBuilder.lineToRelative(-2.5f, -2.5f);
        pathBuilder.verticalLineTo(1.0f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.verticalLineTo(10.17f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-2.5f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.verticalLineToRelative(9.17f);
        pathBuilder.lineToRelative(6.0f, 6.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.5f, 3.0f);
        pathBuilder.horizontalLineTo(7.01f);
        pathBuilder.verticalLineToRelative(1.18f);
        pathBuilder.lineTo(9.5f, 6.67f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.19f, 21.19f);
        pathBuilder.lineTo(2.81f, 2.81f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineTo(7.0f, 9.83f);
        pathBuilder.verticalLineToRelative(4.3f);
        pathBuilder.lineToRelative(-3.32f, -1.9f);
        pathBuilder.lineTo(2.0f, 13.88f);
        pathBuilder.lineTo(9.68f, 22.0f);
        pathBuilder.horizontalLineToRelative(9.54f);
        pathBuilder.lineToRelative(0.56f, 0.61f);
        pathBuilder.lineTo(21.19f, 21.19f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doNotTouch = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
