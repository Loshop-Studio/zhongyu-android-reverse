package androidx.compose.material.icons.filled;

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
public final class BorderColorKt {
    private static ImageVector _borderColor;

    public static final ImageVector getBorderColor(Icons.Filled filled) {
        ImageVector imageVector = _borderColor;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BorderColor", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 24.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.verticalLineTo(24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.06f, 5.19f);
        pathBuilder.lineToRelative(3.75f, 3.75f);
        pathBuilder.lineTo(7.75f, 18.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(-3.75f);
        pathBuilder.lineTo(13.06f, 5.19f);
        pathBuilder.close();
        pathBuilder.moveTo(17.88f, 7.87f);
        pathBuilder.lineToRelative(-3.75f, -3.75f);
        pathBuilder.lineToRelative(1.83f, -1.83f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(2.34f, 2.34f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineTo(17.88f, 7.87f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _borderColor = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
