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
public final class TableBarKt {
    private static ImageVector _tableBar;

    public static final ImageVector getTableBar(Icons.Rounded rounded) {
        ImageVector imageVector = _tableBar;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TableBar", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 7.5f);
        pathBuilder.curveTo(22.0f, 5.57f, 17.52f, 4.0f, 12.0f, 4.0f);
        pathBuilder.reflectiveCurveTo(2.0f, 5.57f, 2.0f, 7.5f);
        pathBuilder.curveToRelative(0.0f, 1.81f, 3.95f, 3.31f, 9.0f, 3.48f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.horizontalLineTo(9.35f);
        pathBuilder.curveToRelative(-0.82f, 0.0f, -1.55f, 0.5f, -1.86f, 1.26f);
        pathBuilder.lineToRelative(-0.99f, 2.47f);
        pathBuilder.curveTo(6.27f, 19.34f, 6.71f, 20.0f, 7.37f, 20.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.38f, 0.0f, 0.72f, -0.23f, 0.86f, -0.58f);
        pathBuilder.lineTo(9.2f, 17.0f);
        pathBuilder.horizontalLineToRelative(5.6f);
        pathBuilder.lineToRelative(0.97f, 2.42f);
        pathBuilder.curveToRelative(0.14f, 0.35f, 0.48f, 0.58f, 0.86f, 0.58f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.66f, 0.0f, 1.11f, -0.66f, 0.86f, -1.27f);
        pathBuilder.lineToRelative(-0.99f, -2.47f);
        pathBuilder.curveTo(16.2f, 15.5f, 15.46f, 15.0f, 14.65f, 15.0f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.verticalLineToRelative(-4.02f);
        pathBuilder.curveTo(18.05f, 10.81f, 22.0f, 9.31f, 22.0f, 7.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tableBar = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
