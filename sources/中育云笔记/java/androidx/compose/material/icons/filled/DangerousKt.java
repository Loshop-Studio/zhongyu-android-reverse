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
public final class DangerousKt {
    private static ImageVector _dangerous;

    public static final ImageVector getDangerous(Icons.Filled filled) {
        ImageVector imageVector = _dangerous;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Dangerous", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.73f, 3.0f);
        pathBuilder.horizontalLineTo(8.27f);
        pathBuilder.lineTo(3.0f, 8.27f);
        pathBuilder.verticalLineToRelative(7.46f);
        pathBuilder.lineTo(8.27f, 21.0f);
        pathBuilder.horizontalLineToRelative(7.46f);
        pathBuilder.lineTo(21.0f, 15.73f);
        pathBuilder.verticalLineTo(8.27f);
        pathBuilder.lineTo(15.73f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 15.74f);
        pathBuilder.lineTo(15.74f, 17.0f);
        pathBuilder.lineTo(12.0f, 13.26f);
        pathBuilder.lineTo(8.26f, 17.0f);
        pathBuilder.lineTo(7.0f, 15.74f);
        pathBuilder.lineTo(10.74f, 12.0f);
        pathBuilder.lineTo(7.0f, 8.26f);
        pathBuilder.lineTo(8.26f, 7.0f);
        pathBuilder.lineTo(12.0f, 10.74f);
        pathBuilder.lineTo(15.74f, 7.0f);
        pathBuilder.lineTo(17.0f, 8.26f);
        pathBuilder.lineTo(13.26f, 12.0f);
        pathBuilder.lineTo(17.0f, 15.74f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dangerous = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
