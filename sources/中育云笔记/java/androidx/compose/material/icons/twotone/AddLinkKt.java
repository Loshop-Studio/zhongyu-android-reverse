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
public final class AddLinkKt {
    private static ImageVector _addLink;

    public static final ImageVector getAddLink(Icons.TwoTone twoTone) {
        ImageVector imageVector = _addLink;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AddLink", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.1f, 12.0f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(1.9f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveTo(18.71f, 8.9f, 20.1f, 10.29f, 20.1f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.9f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(-1.9f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.curveTo(5.29f, 15.1f, 3.9f, 13.71f, 3.9f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addLink = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
