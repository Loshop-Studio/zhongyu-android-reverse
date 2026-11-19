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
public final class SchoolKt {
    private static ImageVector _school;

    public static final ImageVector getSchool(Icons.TwoTone twoTone) {
        ImageVector imageVector = _school;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.School", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.0f, 12.27f);
        pathBuilder.verticalLineToRelative(3.72f);
        pathBuilder.lineToRelative(5.0f, 2.73f);
        pathBuilder.lineToRelative(5.0f, -2.73f);
        pathBuilder.verticalLineToRelative(-3.72f);
        pathBuilder.lineTo(12.0f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.18f, 9.0f);
        pathBuilder.lineTo(12.0f, 12.72f);
        pathBuilder.lineTo(18.82f, 9.0f);
        pathBuilder.lineTo(12.0f, 5.28f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 3.0f);
        pathBuilder2.lineTo(1.0f, 9.0f);
        pathBuilder2.lineToRelative(4.0f, 2.18f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.lineTo(12.0f, 21.0f);
        pathBuilder2.lineToRelative(7.0f, -3.82f);
        pathBuilder2.verticalLineToRelative(-6.0f);
        pathBuilder2.lineToRelative(2.0f, -1.09f);
        pathBuilder2.lineTo(21.0f, 17.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.lineTo(23.0f, 9.0f);
        pathBuilder2.lineTo(12.0f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.0f, 15.99f);
        pathBuilder2.lineToRelative(-5.0f, 2.73f);
        pathBuilder2.lineToRelative(-5.0f, -2.73f);
        pathBuilder2.verticalLineToRelative(-3.72f);
        pathBuilder2.lineTo(12.0f, 15.0f);
        pathBuilder2.lineToRelative(5.0f, -2.73f);
        pathBuilder2.verticalLineToRelative(3.72f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 12.72f);
        pathBuilder2.lineTo(5.18f, 9.0f);
        pathBuilder2.lineTo(12.0f, 5.28f);
        pathBuilder2.lineTo(18.82f, 9.0f);
        pathBuilder2.lineTo(12.0f, 12.72f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _school = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
