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
public final class DoneAllKt {
    private static ImageVector _doneAll;

    public static final ImageVector getDoneAll(Icons.Sharp sharp) {
        ImageVector imageVector = _doneAll;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DoneAll", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 7.0f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineToRelative(-6.34f, 6.34f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineTo(18.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.24f, 5.59f);
        pathBuilder.lineTo(11.66f, 16.17f);
        pathBuilder.lineTo(7.48f, 12.0f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineTo(11.66f, 19.0f);
        pathBuilder.lineToRelative(12.0f, -12.0f);
        pathBuilder.lineToRelative(-1.42f, -1.41f);
        pathBuilder.close();
        pathBuilder.moveTo(0.41f, 13.41f);
        pathBuilder.lineTo(6.0f, 19.0f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(1.83f, 12.0f);
        pathBuilder.lineTo(0.41f, 13.41f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doneAll = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
