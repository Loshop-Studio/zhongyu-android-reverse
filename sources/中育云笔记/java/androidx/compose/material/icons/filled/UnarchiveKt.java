package androidx.compose.material.icons.filled;

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

    public static final ImageVector getUnarchive(Icons.Filled filled) {
        ImageVector imageVector = _unarchive;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Unarchive", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.55f, 5.22f);
        pathBuilder.lineToRelative(-1.39f, -1.68f);
        pathBuilder.curveTo(18.88f, 3.21f, 18.47f, 3.0f, 18.0f, 3.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveTo(5.53f, 3.0f, 5.12f, 3.21f, 4.85f, 3.55f);
        pathBuilder.lineTo(3.46f, 5.22f);
        pathBuilder.curveTo(3.17f, 5.57f, 3.0f, 6.01f, 3.0f, 6.5f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.curveTo(21.0f, 6.01f, 20.83f, 5.57f, 20.55f, 5.22f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 9.5f);
        pathBuilder.lineToRelative(5.5f, 5.5f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(6.5f);
        pathBuilder.lineTo(12.0f, 9.5f);
        pathBuilder.close();
        pathBuilder.moveTo(5.12f, 5.0f);
        pathBuilder.lineToRelative(0.82f, -1.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.lineToRelative(0.93f, 1.0f);
        pathBuilder.horizontalLineTo(5.12f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _unarchive = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
