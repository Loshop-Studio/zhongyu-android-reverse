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
public final class BloodtypeKt {
    private static ImageVector _bloodtype;

    public static final ImageVector getBloodtype(Icons.Outlined outlined) {
        ImageVector imageVector = _bloodtype;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Bloodtype", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(13.0f, 9.0f);
        pathBuilder2.lineToRelative(-2.0f, 0.0f);
        pathBuilder2.lineToRelative(0.0f, 2.0f);
        pathBuilder2.lineToRelative(-2.0f, 0.0f);
        pathBuilder2.lineToRelative(0.0f, 2.0f);
        pathBuilder2.lineToRelative(2.0f, 0.0f);
        pathBuilder2.lineToRelative(0.0f, 2.0f);
        pathBuilder2.lineToRelative(2.0f, 0.0f);
        pathBuilder2.lineToRelative(0.0f, -2.0f);
        pathBuilder2.lineToRelative(2.0f, 0.0f);
        pathBuilder2.lineToRelative(0.0f, -2.0f);
        pathBuilder2.lineToRelative(-2.0f, 0.0f);
        pathBuilder2.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 2.0f);
        pathBuilder3.curveToRelative(-5.33f, 4.55f, -8.0f, 8.48f, -8.0f, 11.8f);
        pathBuilder3.curveToRelative(0.0f, 4.98f, 3.8f, 8.2f, 8.0f, 8.2f);
        pathBuilder3.reflectiveCurveToRelative(8.0f, -3.22f, 8.0f, -8.2f);
        pathBuilder3.curveTo(20.0f, 10.48f, 17.33f, 6.55f, 12.0f, 2.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.0f, 20.0f);
        pathBuilder3.curveToRelative(-3.35f, 0.0f, -6.0f, -2.57f, -6.0f, -6.2f);
        pathBuilder3.curveToRelative(0.0f, -2.34f, 1.95f, -5.44f, 6.0f, -9.14f);
        pathBuilder3.curveToRelative(4.05f, 3.7f, 6.0f, 6.79f, 6.0f, 9.14f);
        pathBuilder3.curveTo(18.0f, 17.43f, 15.35f, 20.0f, 12.0f, 20.0f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bloodtype = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
