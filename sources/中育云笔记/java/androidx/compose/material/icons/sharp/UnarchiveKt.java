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
public final class UnarchiveKt {
    private static ImageVector _unarchive;

    public static final ImageVector getUnarchive(Icons.Sharp sharp) {
        ImageVector imageVector = _unarchive;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Unarchive", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.71f, 3.0f);
        pathBuilder.horizontalLineTo(5.29f);
        pathBuilder.lineTo(3.0f, 5.79f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.verticalLineTo(5.79f);
        pathBuilder.lineTo(18.71f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 15.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(6.5f);
        pathBuilder.lineTo(12.0f, 9.5f);
        pathBuilder.lineToRelative(5.5f, 5.5f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.12f, 5.0f);
        pathBuilder.lineToRelative(0.81f, -1.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.lineToRelative(0.94f, 1.0f);
        pathBuilder.horizontalLineTo(5.12f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _unarchive = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
