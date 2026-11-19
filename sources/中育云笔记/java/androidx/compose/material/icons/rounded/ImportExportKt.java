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
public final class ImportExportKt {
    private static ImageVector _importExport;

    public static final ImageVector getImportExport(Icons.Rounded rounded) {
        ImageVector imageVector = _importExport;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ImportExport", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.65f, 3.35f);
        pathBuilder.lineTo(5.86f, 6.14f);
        pathBuilder.curveToRelative(-0.32f, 0.31f, -0.1f, 0.85f, 0.35f, 0.85f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(6.99f);
        pathBuilder.horizontalLineToRelative(1.79f);
        pathBuilder.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        pathBuilder.lineTo(9.35f, 3.35f);
        pathBuilder.curveToRelative(-0.19f, -0.19f, -0.51f, -0.19f, -0.7f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 17.01f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(6.01f);
        pathBuilder.horizontalLineToRelative(-1.79f);
        pathBuilder.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        pathBuilder.lineToRelative(2.79f, 2.78f);
        pathBuilder.curveToRelative(0.2f, 0.19f, 0.51f, 0.19f, 0.71f, 0.0f);
        pathBuilder.lineToRelative(2.79f, -2.78f);
        pathBuilder.curveToRelative(0.32f, -0.31f, 0.09f, -0.85f, -0.35f, -0.85f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _importExport = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
