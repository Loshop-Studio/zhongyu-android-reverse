package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class TakeoutDiningKt {
    private static ImageVector _takeoutDining;

    public static final ImageVector getTakeoutDining(Icons.TwoTone twoTone) {
        ImageVector imageVector = _takeoutDining;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.TakeoutDining", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM24629getButtKaPHkGw = companion2.m24629getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM24639getBevelLxFBmk8 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.83f, 5.0f);
        pathBuilder.lineToRelative(-2.8f, 2.73f);
        pathBuilder.lineToRelative(0.09f, 1.27f);
        pathBuilder.lineToRelative(9.75f, 0.0f);
        pathBuilder.lineToRelative(0.09f, -1.27f);
        pathBuilder.lineToRelative(-2.8f, -2.73f);
        pathBuilder.close();
        ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw2 = companion2.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk82 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(7.79f, 18.0f);
        pathBuilder2.lineToRelative(8.44f, 0.0f);
        pathBuilder2.lineToRelative(0.51f, -7.0f);
        pathBuilder2.lineToRelative(-9.46f, 0.0f);
        pathBuilder2.close();
        ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM24629getButtKaPHkGw2, iM24639getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw3 = companion2.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk83 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.59f, 6.05f);
        pathBuilder3.lineTo(19.0f, 7.63f);
        pathBuilder3.lineToRelative(0.03f, -0.56f);
        pathBuilder3.lineTo(14.98f, 3.0f);
        pathBuilder3.horizontalLineTo(9.02f);
        pathBuilder3.lineTo(4.97f, 7.07f);
        pathBuilder3.lineTo(5.0f, 7.57f);
        pathBuilder3.lineTo(3.41f, 6.01f);
        pathBuilder3.lineTo(2.0f, 7.44f);
        pathBuilder3.lineToRelative(3.23f, 3.11f);
        pathBuilder3.lineTo(5.93f, 20.0f);
        pathBuilder3.horizontalLineToRelative(12.14f);
        pathBuilder3.lineToRelative(0.7f, -9.44f);
        pathBuilder3.lineTo(22.0f, 7.46f);
        pathBuilder3.lineTo(20.59f, 6.05f);
        pathBuilder3.close();
        pathBuilder3.moveTo(16.23f, 18.0f);
        pathBuilder3.horizontalLineTo(7.79f);
        pathBuilder3.lineToRelative(-0.51f, -7.0f);
        pathBuilder3.horizontalLineToRelative(9.46f);
        pathBuilder3.lineTo(16.23f, 18.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(16.87f, 9.0f);
        pathBuilder3.horizontalLineTo(7.12f);
        pathBuilder3.lineTo(7.03f, 7.73f);
        pathBuilder3.lineTo(9.83f, 5.0f);
        pathBuilder3.horizontalLineToRelative(4.33f);
        pathBuilder3.lineToRelative(2.8f, 2.73f);
        pathBuilder3.lineTo(16.87f, 9.0f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw3, iM24639getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _takeoutDining = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
