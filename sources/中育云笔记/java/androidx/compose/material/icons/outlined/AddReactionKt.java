package androidx.compose.material.icons.outlined;

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
public final class AddReactionKt {
    private static ImageVector _addReaction;

    public static final ImageVector getAddReaction(Icons.Outlined outlined) {
        ImageVector imageVector = _addReaction;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AddReaction", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.0f, 9.5f);
        pathBuilder.curveTo(7.0f, 8.67f, 7.67f, 8.0f, 8.5f, 8.0f);
        pathBuilder.reflectiveCurveTo(10.0f, 8.67f, 10.0f, 9.5f);
        pathBuilder.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(7.0f, 10.33f, 7.0f, 9.5f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 17.5f);
        pathBuilder.curveToRelative(2.33f, 0.0f, 4.31f, -1.46f, 5.11f, -3.5f);
        pathBuilder.horizontalLineTo(6.89f);
        pathBuilder.curveTo(7.69f, 16.04f, 9.67f, 17.5f, 12.0f, 17.5f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 11.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.curveTo(17.0f, 8.67f, 16.33f, 8.0f, 15.5f, 8.0f);
        pathBuilder.reflectiveCurveTo(14.0f, 8.67f, 14.0f, 9.5f);
        pathBuilder.curveTo(14.0f, 10.33f, 14.67f, 11.0f, 15.5f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(-8.0f, -3.58f, -8.0f, -8.0f);
        pathBuilder.curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f);
        pathBuilder.curveToRelative(1.46f, 0.0f, 2.82f, 0.4f, 4.0f, 1.08f);
        pathBuilder.verticalLineTo(2.84f);
        pathBuilder.curveTo(14.77f, 2.3f, 13.42f, 2.0f, 11.99f, 2.0f);
        pathBuilder.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, 4.47f, 10.0f, 9.99f, 10.0f);
        pathBuilder.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.05f, -0.17f, -2.05f, -0.47f, -3.0f);
        pathBuilder.horizontalLineToRelative(-2.13f);
        pathBuilder.curveTo(19.78f, 9.93f, 20.0f, 10.94f, 20.0f, 12.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addReaction = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
