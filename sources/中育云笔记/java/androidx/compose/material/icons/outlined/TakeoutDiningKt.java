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
public final class TakeoutDiningKt {
    private static ImageVector _takeoutDining;

    public static final ImageVector getTakeoutDining(Icons.Outlined outlined) {
        ImageVector imageVector = _takeoutDining;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.TakeoutDining", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.79f, 18.0f);
        pathBuilder.lineToRelative(-0.51f, -7.0f);
        pathBuilder.horizontalLineToRelative(9.46f);
        pathBuilder.lineToRelative(-0.51f, 7.0f);
        pathBuilder.horizontalLineTo(7.79f);
        pathBuilder.close();
        pathBuilder.moveTo(9.83f, 5.0f);
        pathBuilder.horizontalLineToRelative(4.33f);
        pathBuilder.lineToRelative(2.8f, 2.73f);
        pathBuilder.lineTo(16.87f, 9.0f);
        pathBuilder.horizontalLineTo(7.12f);
        pathBuilder.lineTo(7.03f, 7.73f);
        pathBuilder.lineTo(9.83f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 7.46f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineTo(19.0f, 7.63f);
        pathBuilder.lineToRelative(0.03f, -0.56f);
        pathBuilder.lineTo(14.98f, 3.0f);
        pathBuilder.horizontalLineTo(9.02f);
        pathBuilder.lineTo(4.97f, 7.07f);
        pathBuilder.lineTo(5.0f, 7.57f);
        pathBuilder.lineTo(3.41f, 6.01f);
        pathBuilder.lineTo(2.0f, 7.44f);
        pathBuilder.lineToRelative(3.23f, 3.11f);
        pathBuilder.lineTo(5.93f, 20.0f);
        pathBuilder.horizontalLineToRelative(12.14f);
        pathBuilder.lineToRelative(0.7f, -9.44f);
        pathBuilder.lineTo(22.0f, 7.46f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _takeoutDining = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
