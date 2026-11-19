package androidx.compose.material.icons.automirrored.outlined;

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
public final class RttKt {
    private static ImageVector _rtt;

    public static final ImageVector getRtt(Icons.AutoMirrored.Outlined outlined) {
        ImageVector imageVector = _rtt;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Outlined.Rtt", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.03f, 3.0f);
        pathBuilder.lineToRelative(-1.11f, 7.07f);
        pathBuilder.horizontalLineToRelative(2.62f);
        pathBuilder.lineToRelative(0.7f, -4.5f);
        pathBuilder.horizontalLineToRelative(2.58f);
        pathBuilder.lineTo(11.8f, 18.43f);
        pathBuilder.horizontalLineTo(9.47f);
        pathBuilder.lineTo(9.06f, 21.0f);
        pathBuilder.horizontalLineToRelative(7.27f);
        pathBuilder.lineToRelative(0.4f, -2.57f);
        pathBuilder.horizontalLineToRelative(-2.35f);
        pathBuilder.lineToRelative(2.0f, -12.86f);
        pathBuilder.horizontalLineToRelative(2.58f);
        pathBuilder.lineToRelative(-0.71f, 4.5f);
        pathBuilder.horizontalLineToRelative(2.65f);
        pathBuilder.lineTo(22.0f, 3.0f);
        pathBuilder.horizontalLineTo(9.03f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 5.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.lineTo(3.69f, 7.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.lineTo(8.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.39f, 9.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.lineToRelative(-0.31f, 2.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.lineTo(7.39f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.31f, 17.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.lineTo(2.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.lineTo(8.31f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.93f, 13.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.lineToRelative(-0.31f, 2.0f);
        pathBuilder.horizontalLineToRelative(6.01f);
        pathBuilder.lineTo(8.93f, 13.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rtt = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
