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
public final class AutoFixOffKt {
    private static ImageVector _autoFixOff;

    public static final ImageVector getAutoFixOff(Icons.Filled filled) {
        ImageVector imageVector = _autoFixOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AutoFixOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.0f, 1.0f);
        pathBuilder.lineToRelative(-2.5f, 1.4f);
        pathBuilder.lineTo(18.0f, 1.0f);
        pathBuilder.lineToRelative(1.4f, 2.5f);
        pathBuilder.lineTo(18.0f, 6.0f);
        pathBuilder.lineToRelative(2.5f, -1.4f);
        pathBuilder.lineTo(23.0f, 6.0f);
        pathBuilder.lineToRelative(-1.4f, -2.5f);
        pathBuilder.lineTo(23.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.66f, 7.22f);
        pathBuilder.lineToRelative(2.12f, 2.12f);
        pathBuilder.lineToRelative(-2.44f, 2.44f);
        pathBuilder.lineToRelative(0.81f, 0.81f);
        pathBuilder.lineToRelative(2.55f, -2.55f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(-2.34f, -2.34f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineTo(11.4f, 8.84f);
        pathBuilder.lineToRelative(0.81f, 0.81f);
        pathBuilder.lineToRelative(2.45f, -2.43f);
        pathBuilder.close();
        pathBuilder.moveTo(13.88f, 13.87f);
        pathBuilder.lineToRelative(-3.75f, -3.75f);
        pathBuilder.lineToRelative(-6.86f, -6.86f);
        pathBuilder.lineTo(2.0f, 4.53f);
        pathBuilder.lineToRelative(6.86f, 6.86f);
        pathBuilder.lineToRelative(-6.57f, 6.57f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(2.34f, 2.34f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(6.57f, -6.57f);
        pathBuilder.lineTo(19.47f, 22.0f);
        pathBuilder.lineToRelative(1.27f, -1.27f);
        pathBuilder.lineToRelative(-6.86f, -6.86f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoFixOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
