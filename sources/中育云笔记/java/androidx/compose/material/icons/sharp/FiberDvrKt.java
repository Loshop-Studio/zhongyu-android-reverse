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
public final class FiberDvrKt {
    private static ImageVector _fiberDvr;

    public static final ImageVector getFiberDvr(Icons.Sharp sharp) {
        ImageVector imageVector = _fiberDvr;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FiberDvr", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.5f, 10.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.5f, 10.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(23.0f, 3.0f);
        pathBuilder.lineTo(1.0f, 3.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.horizontalLineToRelative(22.0f);
        pathBuilder.lineTo(23.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 13.5f);
        pathBuilder.curveToRelative(0.0f, 0.85f, -0.65f, 1.5f, -1.5f, 1.5f);
        pathBuilder.lineTo(3.0f, 15.0f);
        pathBuilder.lineTo(3.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(3.5f);
        pathBuilder.curveToRelative(0.85f, 0.0f, 1.5f, 0.65f, 1.5f, 1.5f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.62f, 15.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.lineTo(9.37f, 9.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.lineToRelative(1.0f, 3.43f);
        pathBuilder.lineToRelative(1.0f, -3.43f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.lineToRelative(-1.75f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 12.9f);
        pathBuilder.horizontalLineToRelative(-0.9f);
        pathBuilder.lineTo(21.0f, 15.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.lineToRelative(-0.85f, -2.0f);
        pathBuilder.lineTo(17.5f, 13.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(16.0f, 15.0f);
        pathBuilder.lineTo(16.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineToRelative(3.9f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberDvr = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
