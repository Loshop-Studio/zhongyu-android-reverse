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
public final class SpeedKt {
    private static ImageVector _speed;

    public static final ImageVector getSpeed(Icons.Filled filled) {
        ImageVector imageVector = _speed;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Speed", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.38f, 8.57f);
        pathBuilder.lineToRelative(-1.23f, 1.85f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.22f, 7.58f);
        pathBuilder.lineTo(5.07f, 18.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 15.58f, 6.85f);
        pathBuilder.lineToRelative(1.85f, -1.23f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 3.35f, 19.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.72f, 1.0f);
        pathBuilder.horizontalLineToRelative(13.85f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.74f, -1.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, false, -0.27f, -10.44f);
        pathBuilder.close();
        pathBuilder.moveTo(10.59f, 15.41f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.83f, 0.0f);
        pathBuilder.lineToRelative(5.66f, -8.49f);
        pathBuilder.lineToRelative(-8.49f, 5.66f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 2.83f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _speed = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
