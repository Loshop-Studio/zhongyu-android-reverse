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
public final class GroupRemoveKt {
    private static ImageVector _groupRemove;

    public static final ImageVector getGroupRemove(Icons.Sharp sharp) {
        ImageVector imageVector = _groupRemove;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.GroupRemove", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(24.0f, 9.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineTo(24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 4.0f);
        pathBuilder.curveTo(5.79f, 4.0f, 4.0f, 5.79f, 4.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.reflectiveCurveTo(10.21f, 4.0f, 8.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 13.0f);
        pathBuilder.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveTo(16.0f, 14.34f, 10.67f, 13.0f, 8.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.51f, 4.05f);
        pathBuilder.curveTo(13.43f, 5.11f, 14.0f, 6.49f, 14.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(-0.57f, 2.89f, -1.49f, 3.95f);
        pathBuilder.curveTo(14.47f, 11.7f, 16.0f, 10.04f, 16.0f, 8.0f);
        pathBuilder.reflectiveCurveTo(14.47f, 4.3f, 12.51f, 4.05f);
        pathBuilder.close();
        pathBuilder.moveTo(16.53f, 13.83f);
        pathBuilder.curveTo(17.42f, 14.66f, 18.0f, 15.7f, 18.0f, 17.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveTo(20.0f, 15.55f, 18.41f, 14.49f, 16.53f, 13.83f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _groupRemove = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
