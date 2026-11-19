package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class TableBarKt {
    private static ImageVector _tableBar;

    public static final ImageVector getTableBar(Icons.TwoTone twoTone) {
        ImageVector imageVector = _tableBar;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.TableBar", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.28f, 7.5f);
        pathBuilder.arcToRelative(7.72f, 1.5f, 0.0f, true, false, 15.44f, 0.0f);
        pathBuilder.arcToRelative(7.72f, 1.5f, 0.0f, true, false, -15.44f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(22.0f, 7.5f);
        pathBuilder2.curveTo(22.0f, 5.57f, 17.52f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.reflectiveCurveTo(2.0f, 5.57f, 2.0f, 7.5f);
        pathBuilder2.curveToRelative(0.0f, 1.81f, 3.95f, 3.31f, 9.0f, 3.48f);
        pathBuilder2.verticalLineTo(15.0f);
        pathBuilder2.horizontalLineTo(9.35f);
        pathBuilder2.curveToRelative(-0.82f, 0.0f, -1.55f, 0.5f, -1.86f, 1.26f);
        pathBuilder2.lineTo(6.0f, 20.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.lineToRelative(1.2f, -3.0f);
        pathBuilder2.horizontalLineToRelative(5.6f);
        pathBuilder2.lineToRelative(1.2f, 3.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.lineToRelative(-1.5f, -3.74f);
        pathBuilder2.curveTo(16.2f, 15.5f, 15.46f, 15.0f, 14.65f, 15.0f);
        pathBuilder2.horizontalLineTo(13.0f);
        pathBuilder2.verticalLineToRelative(-4.02f);
        pathBuilder2.curveTo(18.05f, 10.81f, 22.0f, 9.31f, 22.0f, 7.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 9.0f);
        pathBuilder2.curveTo(7.95f, 9.0f, 5.26f, 8.14f, 4.28f, 7.5f);
        pathBuilder2.curveTo(5.26f, 6.86f, 7.95f, 6.0f, 12.0f, 6.0f);
        pathBuilder2.reflectiveCurveToRelative(6.74f, 0.86f, 7.72f, 1.5f);
        pathBuilder2.curveTo(18.74f, 8.14f, 16.05f, 9.0f, 12.0f, 9.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tableBar = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
