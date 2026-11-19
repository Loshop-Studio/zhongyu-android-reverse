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
public final class CurtainsClosedKt {
    private static ImageVector _curtainsClosed;

    public static final ImageVector getCurtainsClosed(Icons.TwoTone twoTone) {
        ImageVector imageVector = _curtainsClosed;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CurtainsClosed", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(15.0f, 5.0f);
        pathBuilder2.horizontalLineToRelative(3.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.horizontalLineToRelative(-3.0f);
        pathBuilder2.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.0f, 19.0f);
        pathBuilder3.verticalLineTo(3.0f);
        pathBuilder3.horizontalLineTo(4.0f);
        pathBuilder3.verticalLineToRelative(16.0f);
        pathBuilder3.horizontalLineTo(2.0f);
        pathBuilder3.verticalLineToRelative(2.0f);
        pathBuilder3.horizontalLineToRelative(20.0f);
        pathBuilder3.verticalLineToRelative(-2.0f);
        pathBuilder3.horizontalLineTo(20.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(9.0f, 19.0f);
        pathBuilder3.horizontalLineTo(6.0f);
        pathBuilder3.verticalLineTo(5.0f);
        pathBuilder3.horizontalLineToRelative(3.0f);
        pathBuilder3.verticalLineTo(19.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(13.0f, 19.0f);
        pathBuilder3.horizontalLineToRelative(-2.0f);
        pathBuilder3.verticalLineTo(5.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.verticalLineTo(19.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(18.0f, 19.0f);
        pathBuilder3.horizontalLineToRelative(-3.0f);
        pathBuilder3.verticalLineTo(5.0f);
        pathBuilder3.horizontalLineToRelative(3.0f);
        pathBuilder3.verticalLineTo(19.0f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _curtainsClosed = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
