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
public final class SquareFootKt {
    private static ImageVector _squareFoot;

    public static final ImageVector getSquareFoot(Icons.Sharp sharp) {
        ImageVector imageVector = _squareFoot;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SquareFoot", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.66f, 17.66f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        pathBuilder.lineToRelative(-0.71f, -0.71f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineToRelative(-1.94f, -1.94f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        pathBuilder.lineToRelative(-0.71f, -0.71f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineToRelative(-1.94f, -1.94f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        pathBuilder.lineToRelative(-0.71f, -0.71f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineTo(9.7f, 9.7f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        pathBuilder.lineToRelative(-0.71f, -0.71f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineTo(7.05f, 7.05f);
        pathBuilder.lineTo(5.99f, 8.11f);
        pathBuilder.lineTo(5.28f, 7.4f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineTo(4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.lineTo(17.66f, 17.66f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 17.0f);
        pathBuilder.verticalLineToRelative(-5.76f);
        pathBuilder.lineTo(12.76f, 17.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _squareFoot = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
