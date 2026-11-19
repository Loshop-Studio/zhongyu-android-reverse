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
public final class NoSimKt {
    private static ImageVector _noSim;

    public static final ImageVector getNoSim(Icons.Outlined outlined) {
        ImageVector imageVector = _noSim;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NoSim", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.26f, 21.21f);
        pathBuilder.lineTo(3.79f, 3.74f);
        pathBuilder.lineTo(2.38f, 5.15f);
        pathBuilder.lineToRelative(2.74f, 2.74f);
        pathBuilder.lineToRelative(-0.12f, 0.12f);
        pathBuilder.lineTo(5.0f, 19.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveToRelative(0.35f, 0.0f, 0.68f, -0.1f, 0.97f, -0.26f);
        pathBuilder.lineToRelative(1.88f, 1.88f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 19.0f);
        pathBuilder.lineTo(7.0f, 9.77f);
        pathBuilder.lineTo(16.23f, 19.0f);
        pathBuilder.lineTo(7.0f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.84f, 5.0f);
        pathBuilder.lineTo(17.0f, 5.0f);
        pathBuilder.verticalLineToRelative(9.11f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.lineTo(19.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(-6.99f);
        pathBuilder.lineTo(7.95f, 5.06f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineTo(10.84f, 5.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noSim = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
