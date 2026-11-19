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
public final class NoCellKt {
    private static ImageVector _noCell;

    public static final ImageVector getNoCell(Icons.Sharp sharp) {
        ImageVector imageVector = _noCell;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NoCell", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.19f, 21.19f);
        pathBuilder.lineTo(2.81f, 2.81f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineTo(5.0f, 7.83f);
        pathBuilder.verticalLineTo(23.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(-1.17f);
        pathBuilder.lineToRelative(0.78f, 0.78f);
        pathBuilder.lineTo(21.19f, 21.19f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 18.0f);
        pathBuilder.verticalLineTo(9.83f);
        pathBuilder.lineTo(15.17f, 18.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.83f, 6.0f);
        pathBuilder.lineTo(5.0f, 2.17f);
        pathBuilder.verticalLineTo(1.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(15.17f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineTo(8.83f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noCell = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
