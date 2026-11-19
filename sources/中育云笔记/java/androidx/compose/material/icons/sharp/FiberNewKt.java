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
public final class FiberNewKt {
    private static ImageVector _fiberNew;

    public static final ImageVector getFiberNew(Icons.Sharp sharp) {
        ImageVector imageVector = _fiberNew;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FiberNew", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 4.0f);
        pathBuilder.lineTo(2.0f, 4.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.lineTo(22.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.5f, 15.0f);
        pathBuilder.lineTo(7.3f, 15.0f);
        pathBuilder.lineToRelative(-2.55f, -3.5f);
        pathBuilder.lineTo(4.75f, 15.0f);
        pathBuilder.lineTo(3.5f, 15.0f);
        pathBuilder.lineTo(3.5f, 9.0f);
        pathBuilder.horizontalLineToRelative(1.25f);
        pathBuilder.lineToRelative(2.5f, 3.5f);
        pathBuilder.lineTo(7.25f, 9.0f);
        pathBuilder.lineTo(8.5f, 9.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 10.26f);
        pathBuilder.lineTo(11.0f, 10.26f);
        pathBuilder.verticalLineToRelative(1.12f);
        pathBuilder.horizontalLineToRelative(2.5f);
        pathBuilder.verticalLineToRelative(1.26f);
        pathBuilder.lineTo(11.0f, 12.64f);
        pathBuilder.verticalLineToRelative(1.11f);
        pathBuilder.horizontalLineToRelative(2.5f);
        pathBuilder.lineTo(13.5f, 15.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.lineTo(9.5f, 9.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(1.26f);
        pathBuilder.close();
        pathBuilder.moveTo(20.5f, 15.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.lineTo(14.5f, 9.0f);
        pathBuilder.horizontalLineToRelative(1.25f);
        pathBuilder.verticalLineToRelative(4.51f);
        pathBuilder.horizontalLineToRelative(1.13f);
        pathBuilder.lineTo(16.88f, 9.99f);
        pathBuilder.horizontalLineToRelative(1.25f);
        pathBuilder.verticalLineToRelative(3.51f);
        pathBuilder.horizontalLineToRelative(1.12f);
        pathBuilder.lineTo(19.25f, 9.0f);
        pathBuilder.horizontalLineToRelative(1.25f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberNew = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
