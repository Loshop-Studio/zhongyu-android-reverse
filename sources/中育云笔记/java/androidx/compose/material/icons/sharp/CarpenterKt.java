package androidx.compose.material.icons.sharp;

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
public final class CarpenterKt {
    private static ImageVector _carpenter;

    public static final ImageVector getCarpenter(Icons.Sharp sharp) {
        ImageVector imageVector = _carpenter;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Carpenter", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.0f, 1.5f);
        pathBuilder.lineTo(3.11f, 5.39f);
        pathBuilder.lineToRelative(8.13f, 11.67f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineToRelative(4.24f, 4.24f);
        pathBuilder.lineToRelative(7.07f, -7.07f);
        pathBuilder.lineTo(7.0f, 1.5f);
        pathBuilder.close();
        pathBuilder.moveTo(12.66f, 18.47f);
        pathBuilder.lineToRelative(4.24f, -4.24f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(-4.24f, 4.24f);
        pathBuilder.lineTo(12.66f, 18.47f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _carpenter = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
