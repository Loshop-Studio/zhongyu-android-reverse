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
public final class ArchiveKt {
    private static ImageVector _archive;

    public static final ImageVector getArchive(Icons.Filled filled) {
        ImageVector imageVector = _archive;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Archive", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.54f, 5.23f);
        pathBuilder.lineToRelative(-1.39f, -1.68f);
        pathBuilder.curveTo(18.88f, 3.21f, 18.47f, 3.0f, 18.0f, 3.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveToRelative(-0.47f, 0.0f, -0.88f, 0.21f, -1.16f, 0.55f);
        pathBuilder.lineTo(3.46f, 5.23f);
        pathBuilder.curveTo(3.17f, 5.57f, 3.0f, 6.02f, 3.0f, 6.5f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.curveToRelative(0.0f, -0.48f, -0.17f, -0.93f, -0.46f, -1.27f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 17.5f);
        pathBuilder.lineTo(6.5f, 12.0f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(3.5f);
        pathBuilder.lineTo(12.0f, 17.5f);
        pathBuilder.close();
        pathBuilder.moveTo(5.12f, 5.0f);
        pathBuilder.lineToRelative(0.81f, -1.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.lineToRelative(0.94f, 1.0f);
        pathBuilder.horizontalLineTo(5.12f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _archive = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
