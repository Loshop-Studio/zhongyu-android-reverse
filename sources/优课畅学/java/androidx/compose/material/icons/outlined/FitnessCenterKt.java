package androidx.compose.material.icons.outlined;

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

/* loaded from: classes.dex */
public final class FitnessCenterKt {
    private static ImageVector _fitnessCenter;

    public static final ImageVector getFitnessCenter(Icons.Outlined outlined) {
        ImageVector imageVector = _fitnessCenter;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FitnessCenter", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.57f, 14.86f);
        pathBuilder.lineTo(22.0f, 13.43f);
        pathBuilder.lineTo(20.57f, 12.0f);
        pathBuilder.lineTo(17.0f, 15.57f);
        pathBuilder.lineTo(8.43f, 7.0f);
        pathBuilder.lineTo(12.0f, 3.43f);
        pathBuilder.lineTo(10.57f, 2.0f);
        pathBuilder.lineTo(9.14f, 3.43f);
        pathBuilder.lineTo(7.71f, 2.0f);
        pathBuilder.lineTo(5.57f, 4.14f);
        pathBuilder.lineTo(4.14f, 2.71f);
        pathBuilder.lineTo(2.71f, 4.14f);
        pathBuilder.lineToRelative(1.43f, 1.43f);
        pathBuilder.lineTo(2.0f, 7.71f);
        pathBuilder.lineToRelative(1.43f, 1.43f);
        pathBuilder.lineTo(2.0f, 10.57f);
        pathBuilder.lineTo(3.43f, 12.0f);
        pathBuilder.lineTo(7.0f, 8.43f);
        pathBuilder.lineTo(15.57f, 17.0f);
        pathBuilder.lineTo(12.0f, 20.57f);
        pathBuilder.lineTo(13.43f, 22.0f);
        pathBuilder.lineToRelative(1.43f, -1.43f);
        pathBuilder.lineTo(16.29f, 22.0f);
        pathBuilder.lineToRelative(2.14f, -2.14f);
        pathBuilder.lineToRelative(1.43f, 1.43f);
        pathBuilder.lineToRelative(1.43f, -1.43f);
        pathBuilder.lineToRelative(-1.43f, -1.43f);
        pathBuilder.lineTo(22.0f, 16.29f);
        pathBuilder.lineToRelative(-1.43f, -1.43f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fitnessCenter = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
