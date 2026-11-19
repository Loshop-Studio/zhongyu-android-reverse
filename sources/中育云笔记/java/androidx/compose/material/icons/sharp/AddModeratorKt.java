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
public final class AddModeratorKt {
    private static ImageVector _addModerator;

    public static final ImageVector getAddModerator(Icons.Sharp sharp) {
        ImageVector imageVector = _addModerator;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AddModerator", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 10.0f);
        pathBuilder.curveToRelative(1.08f, 0.0f, 2.09f, 0.25f, 3.0f, 0.68f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.lineToRelative(-8.0f, -3.0f);
        pathBuilder.lineTo(4.0f, 5.0f);
        pathBuilder.verticalLineToRelative(6.09f);
        pathBuilder.curveToRelative(0.0f, 5.05f, 3.41f, 9.76f, 8.0f, 10.91f);
        pathBuilder.curveToRelative(0.03f, -0.01f, 0.05f, -0.02f, 0.08f, -0.02f);
        pathBuilder.curveTo(10.8f, 20.71f, 10.0f, 18.95f, 10.0f, 17.0f);
        pathBuilder.curveTo(10.0f, 13.13f, 13.13f, 10.0f, 17.0f, 10.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.0f, 12.0f);
        pathBuilder2.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder2.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder2.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder2.reflectiveCurveTo(19.76f, 12.0f, 17.0f, 12.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 17.5f);
        pathBuilder2.horizontalLineToRelative(-2.5f);
        pathBuilder2.verticalLineTo(20.0f);
        pathBuilder2.horizontalLineToRelative(-1.0f);
        pathBuilder2.verticalLineToRelative(-2.5f);
        pathBuilder2.horizontalLineTo(14.0f);
        pathBuilder2.verticalLineToRelative(-1.0f);
        pathBuilder2.horizontalLineToRelative(2.5f);
        pathBuilder2.verticalLineTo(14.0f);
        pathBuilder2.horizontalLineToRelative(1.0f);
        pathBuilder2.verticalLineToRelative(2.5f);
        pathBuilder2.horizontalLineTo(20.0f);
        pathBuilder2.verticalLineTo(17.5f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addModerator = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
