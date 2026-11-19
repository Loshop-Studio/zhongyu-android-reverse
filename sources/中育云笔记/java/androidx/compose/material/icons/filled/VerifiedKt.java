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
public final class VerifiedKt {
    private static ImageVector _verified;

    public static final ImageVector getVerified(Icons.Filled filled) {
        ImageVector imageVector = _verified;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Verified", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.0f, 12.0f);
        pathBuilder.lineToRelative(-2.44f, -2.79f);
        pathBuilder.lineToRelative(0.34f, -3.69f);
        pathBuilder.lineToRelative(-3.61f, -0.82f);
        pathBuilder.lineTo(15.4f, 1.5f);
        pathBuilder.lineTo(12.0f, 2.96f);
        pathBuilder.lineTo(8.6f, 1.5f);
        pathBuilder.lineTo(6.71f, 4.69f);
        pathBuilder.lineTo(3.1f, 5.5f);
        pathBuilder.lineTo(3.44f, 9.2f);
        pathBuilder.lineTo(1.0f, 12.0f);
        pathBuilder.lineToRelative(2.44f, 2.79f);
        pathBuilder.lineToRelative(-0.34f, 3.7f);
        pathBuilder.lineToRelative(3.61f, 0.82f);
        pathBuilder.lineTo(8.6f, 22.5f);
        pathBuilder.lineToRelative(3.4f, -1.47f);
        pathBuilder.lineToRelative(3.4f, 1.46f);
        pathBuilder.lineToRelative(1.89f, -3.19f);
        pathBuilder.lineToRelative(3.61f, -0.82f);
        pathBuilder.lineToRelative(-0.34f, -3.69f);
        pathBuilder.lineTo(23.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.09f, 16.72f);
        pathBuilder.lineToRelative(-3.8f, -3.81f);
        pathBuilder.lineToRelative(1.48f, -1.48f);
        pathBuilder.lineToRelative(2.32f, 2.33f);
        pathBuilder.lineToRelative(5.85f, -5.87f);
        pathBuilder.lineToRelative(1.48f, 1.48f);
        pathBuilder.lineTo(10.09f, 16.72f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _verified = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
