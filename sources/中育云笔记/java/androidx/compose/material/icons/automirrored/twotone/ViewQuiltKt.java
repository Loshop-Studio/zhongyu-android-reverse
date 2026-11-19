package androidx.compose.material.icons.automirrored.twotone;

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
public final class ViewQuiltKt {
    private static ImageVector _viewQuilt;

    public static final ImageVector getViewQuilt(Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector imageVector = _viewQuilt;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone.ViewQuilt", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.33f, 17.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(3.33f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.67f, 17.0f);
        pathBuilder.horizontalLineToRelative(-3.33f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(3.33f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(-3.33f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(-8.67f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(3.0f, 5.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.horizontalLineToRelative(18.0f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder2.horizontalLineTo(3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(8.33f, 17.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.verticalLineTo(7.0f);
        pathBuilder2.horizontalLineToRelative(3.33f);
        pathBuilder2.verticalLineTo(17.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.67f, 17.0f);
        pathBuilder2.horizontalLineToRelative(-3.33f);
        pathBuilder2.verticalLineToRelative(-4.0f);
        pathBuilder2.horizontalLineToRelative(3.33f);
        pathBuilder2.verticalLineTo(17.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 17.0f);
        pathBuilder2.horizontalLineToRelative(-3.33f);
        pathBuilder2.verticalLineToRelative(-4.0f);
        pathBuilder2.horizontalLineTo(19.0f);
        pathBuilder2.verticalLineTo(17.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 11.0f);
        pathBuilder2.horizontalLineToRelative(-8.67f);
        pathBuilder2.verticalLineTo(7.0f);
        pathBuilder2.horizontalLineTo(19.0f);
        pathBuilder2.verticalLineTo(11.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _viewQuilt = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
