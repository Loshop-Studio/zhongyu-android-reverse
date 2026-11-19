package androidx.compose.material.icons.automirrored.sharp;

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
public final class MessageKt {
    private static ImageVector _message;

    public static final ImageVector getMessage(Icons.AutoMirrored.Sharp sharp) {
        ImageVector imageVector = _message;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Sharp.Message", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 2.0f);
        pathBuilder.lineTo(2.01f, 2.0f);
        pathBuilder.lineTo(2.0f, 22.0f);
        pathBuilder.lineToRelative(4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.lineTo(22.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 14.0f);
        pathBuilder.lineTo(6.0f, 14.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 11.0f);
        pathBuilder.lineTo(6.0f, 11.0f);
        pathBuilder.lineTo(6.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 8.0f);
        pathBuilder.lineTo(6.0f, 8.0f);
        pathBuilder.lineTo(6.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _message = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
