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
public final class TextIncreaseKt {
    private static ImageVector _textIncrease;

    public static final ImageVector getTextIncrease(Icons.Outlined outlined) {
        ImageVector imageVector = _textIncrease;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.TextIncrease", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(0.99f, 19.0f);
        pathBuilder.horizontalLineToRelative(2.42f);
        pathBuilder.lineToRelative(1.27f, -3.58f);
        pathBuilder.horizontalLineToRelative(5.65f);
        pathBuilder.lineTo(11.59f, 19.0f);
        pathBuilder.horizontalLineToRelative(2.42f);
        pathBuilder.lineTo(8.75f, 5.0f);
        pathBuilder.horizontalLineToRelative(-2.5f);
        pathBuilder.lineTo(0.99f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.41f, 13.39f);
        pathBuilder.lineTo(7.44f, 7.6f);
        pathBuilder.horizontalLineToRelative(0.12f);
        pathBuilder.lineToRelative(2.03f, 5.79f);
        pathBuilder.horizontalLineTo(5.41f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textIncrease = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
