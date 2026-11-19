package androidx.compose.material.icons.rounded;

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

    public static final ImageVector getNoCell(Icons.Rounded rounded) {
        ImageVector imageVector = _noCell;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NoCell", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.83f, 6.0f);
        pathBuilder.lineToRelative(-3.7f, -3.7f);
        pathBuilder.curveTo(5.42f, 1.55f, 6.15f, 1.0f, 7.0f, 1.0f);
        pathBuilder.lineToRelative(10.0f, 0.01f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.89f, 2.0f, 1.99f);
        pathBuilder.verticalLineToRelative(13.17f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineTo(8.83f);
        pathBuilder.close();
        pathBuilder.moveTo(20.49f, 21.9f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-0.2f, -0.2f);
        pathBuilder.curveTo(18.58f, 22.45f, 17.85f, 23.0f, 17.0f, 23.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(7.83f);
        pathBuilder.lineToRelative(-2.9f, -2.9f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(16.97f, 16.97f);
        pathBuilder.curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f);
        pathBuilder.close();
        pathBuilder.moveTo(15.17f, 18.0f);
        pathBuilder.lineTo(7.0f, 9.83f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineTo(15.17f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noCell = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
