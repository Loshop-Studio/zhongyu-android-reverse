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
public final class TurnSlightLeftKt {
    private static ImageVector _turnSlightLeft;

    public static final ImageVector getTurnSlightLeft(Icons.Sharp sharp) {
        ImageVector imageVector = _turnSlightLeft;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.TurnSlightLeft", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.66f, 6.0f);
        pathBuilder.lineToRelative(0.0f, -2.0f);
        pathBuilder.lineToRelative(-5.66f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 5.66f);
        pathBuilder.lineToRelative(2.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, -2.25f);
        pathBuilder.lineToRelative(5.0f, 5.0f);
        pathBuilder.lineToRelative(0.0f, 7.59f);
        pathBuilder.lineToRelative(2.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, -8.41f);
        pathBuilder.lineToRelative(-5.59f, -5.59f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _turnSlightLeft = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
