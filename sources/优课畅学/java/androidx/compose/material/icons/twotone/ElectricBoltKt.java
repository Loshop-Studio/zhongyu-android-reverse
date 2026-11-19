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
public final class ElectricBoltKt {
    private static ImageVector _electricBolt;

    public static final ImageVector getElectricBolt(Icons.TwoTone twoTone) {
        ImageVector imageVector = _electricBolt;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ElectricBolt", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.69f, 2.21f);
        pathBuilder.lineTo(4.33f, 11.49f);
        pathBuilder.curveToRelative(-0.64f, 0.58f, -0.28f, 1.65f, 0.58f, 1.73f);
        pathBuilder.lineTo(13.0f, 14.0f);
        pathBuilder.lineToRelative(-4.85f, 6.76f);
        pathBuilder.curveToRelative(-0.22f, 0.31f, -0.19f, 0.74f, 0.08f, 1.01f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.3f, 0.3f, 0.77f, 0.31f, 1.08f, 0.02f);
        pathBuilder.lineToRelative(10.36f, -9.28f);
        pathBuilder.curveToRelative(0.64f, -0.58f, 0.28f, -1.65f, -0.58f, -1.73f);
        pathBuilder.lineTo(11.0f, 10.0f);
        pathBuilder.lineToRelative(4.85f, -6.76f);
        pathBuilder.curveToRelative(0.22f, -0.31f, 0.19f, -0.74f, -0.08f, -1.01f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(15.47f, 1.93f, 15.0f, 1.92f, 14.69f, 2.21f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _electricBolt = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
