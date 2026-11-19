package androidx.compose.material.icons.outlined;

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
public final class TextRotationDownKt {
    private static ImageVector _textRotationDown;

    public static final ImageVector getTextRotationDown(Icons.Outlined outlined) {
        ImageVector imageVector = _textRotationDown;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.TextRotationDown", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 20.0f);
        pathBuilder.lineToRelative(3.0f, -3.0f);
        pathBuilder.lineTo(7.0f, 17.0f);
        pathBuilder.lineTo(7.0f, 4.0f);
        pathBuilder.lineTo(5.0f, 4.0f);
        pathBuilder.verticalLineToRelative(13.0f);
        pathBuilder.lineTo(3.0f, 17.0f);
        pathBuilder.lineToRelative(3.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.2f, 8.5f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.lineToRelative(-2.2f, 0.9f);
        pathBuilder.verticalLineToRelative(2.1f);
        pathBuilder.lineToRelative(11.0f, -4.75f);
        pathBuilder.verticalLineToRelative(-1.5f);
        pathBuilder.lineTo(10.0f, 5.5f);
        pathBuilder.verticalLineToRelative(2.1f);
        pathBuilder.lineToRelative(2.2f, 0.9f);
        pathBuilder.close();
        pathBuilder.moveTo(19.02f, 11.0f);
        pathBuilder.lineTo(14.0f, 12.87f);
        pathBuilder.lineTo(14.0f, 9.13f);
        pathBuilder.lineTo(19.02f, 11.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textRotationDown = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
