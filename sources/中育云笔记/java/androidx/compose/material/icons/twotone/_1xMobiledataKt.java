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
public final class _1xMobiledataKt {
    private static ImageVector __1xMobiledata;

    public static final ImageVector get_1xMobiledata(Icons.TwoTone twoTone) {
        ImageVector imageVector = __1xMobiledata;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone._1xMobiledata", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.83f, 11.72f);
        pathBuilder.lineTo(18.66f, 7.0f);
        pathBuilder.horizontalLineToRelative(-2.33f);
        pathBuilder.lineToRelative(-1.66f, 2.77f);
        pathBuilder.lineTo(13.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(-2.33f);
        pathBuilder.lineToRelative(2.83f, 4.72f);
        pathBuilder.lineTo(10.33f, 17.0f);
        pathBuilder.horizontalLineToRelative(2.33f);
        pathBuilder.lineToRelative(2.0f, -3.34f);
        pathBuilder.lineToRelative(2.0f, 3.34f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.lineTo(15.83f, 11.72f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __1xMobiledata = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
