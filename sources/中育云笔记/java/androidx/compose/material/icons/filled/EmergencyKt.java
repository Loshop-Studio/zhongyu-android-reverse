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
public final class EmergencyKt {
    private static ImageVector _emergency;

    public static final ImageVector getEmergency(Icons.Filled filled) {
        ImageVector imageVector = _emergency;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Emergency", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.79f, 9.23f);
        pathBuilder.lineToRelative(-2.0f, -3.46f);
        pathBuilder.lineToRelative(-4.79f, 2.77f);
        pathBuilder.lineToRelative(0.0f, -5.54f);
        pathBuilder.lineToRelative(-4.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 5.54f);
        pathBuilder.lineToRelative(-4.79f, -2.77f);
        pathBuilder.lineToRelative(-2.0f, 3.46f);
        pathBuilder.lineToRelative(4.79f, 2.77f);
        pathBuilder.lineToRelative(-4.79f, 2.77f);
        pathBuilder.lineToRelative(2.0f, 3.46f);
        pathBuilder.lineToRelative(4.79f, -2.77f);
        pathBuilder.lineToRelative(0.0f, 5.54f);
        pathBuilder.lineToRelative(4.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, -5.54f);
        pathBuilder.lineToRelative(4.79f, 2.77f);
        pathBuilder.lineToRelative(2.0f, -3.46f);
        pathBuilder.lineToRelative(-4.79f, -2.77f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emergency = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
