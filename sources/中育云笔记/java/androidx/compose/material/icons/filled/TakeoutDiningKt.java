package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.PathFillType;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.StrokeJoin;
import androidx.compose.p014ui.graphics.vector.ImageVector;
import androidx.compose.p014ui.graphics.vector.PathBuilder;
import androidx.compose.p014ui.unit.C3186Dp;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class TakeoutDiningKt {
    private static ImageVector _takeoutDining;

    public static final ImageVector getTakeoutDining(Icons.Filled filled) {
        ImageVector imageVector = _takeoutDining;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TakeoutDining", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int iM31160getEvenOddRgk1Os = PathFillType.Companion.m31160getEvenOddRgk1Os();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.26f, 11.0f);
        pathBuilder.horizontalLineToRelative(13.48f);
        pathBuilder.lineToRelative(-0.67f, 9.0f);
        pathBuilder.horizontalLineTo(5.93f);
        pathBuilder.lineTo(5.26f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.02f, 4.0f);
        pathBuilder.horizontalLineToRelative(5.95f);
        pathBuilder.lineTo(19.0f, 7.38f);
        pathBuilder.lineToRelative(1.59f, -1.59f);
        pathBuilder.lineTo(22.0f, 7.21f);
        pathBuilder.lineTo(19.21f, 10.0f);
        pathBuilder.horizontalLineTo(4.79f);
        pathBuilder.lineTo(2.0f, 7.21f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(5.0f, 7.38f);
        pathBuilder.lineTo(9.02f, 4.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), iM31160getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _takeoutDining = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
