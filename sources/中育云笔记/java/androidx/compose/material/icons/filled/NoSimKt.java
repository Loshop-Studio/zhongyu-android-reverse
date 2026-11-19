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
public final class NoSimKt {
    private static ImageVector _noSim;

    public static final ImageVector getNoSim(Icons.Filled filled) {
        ImageVector imageVector = _noSim;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NoSim", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.99f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.89f, -2.0f, -1.99f, -2.0f);
        pathBuilder.horizontalLineToRelative(-7.0f);
        pathBuilder.lineTo(7.66f, 5.34f);
        pathBuilder.lineTo(19.0f, 16.68f);
        pathBuilder.lineTo(18.99f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.65f, 3.88f);
        pathBuilder.lineTo(2.38f, 5.15f);
        pathBuilder.lineTo(5.0f, 7.77f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(10.01f);
        pathBuilder.curveToRelative(0.35f, 0.0f, 0.67f, -0.1f, 0.96f, -0.26f);
        pathBuilder.lineToRelative(1.88f, 1.88f);
        pathBuilder.lineToRelative(1.27f, -1.27f);
        pathBuilder.lineTo(3.65f, 3.88f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noSim = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
