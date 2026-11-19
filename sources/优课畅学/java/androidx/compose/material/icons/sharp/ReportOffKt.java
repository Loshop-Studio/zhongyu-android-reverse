package androidx.compose.material.icons.sharp;

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
public final class ReportOffKt {
    private static ImageVector _reportOff;

    public static final ImageVector getReportOff(Icons.Sharp sharp) {
        ImageVector imageVector = _reportOff;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ReportOff", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.33f);
        pathBuilder.lineToRelative(7.2f, 7.2f);
        pathBuilder.lineToRelative(0.8f, -0.8f);
        pathBuilder.lineTo(21.0f, 8.27f);
        pathBuilder.lineTo(15.73f, 3.0f);
        pathBuilder.lineTo(8.27f, 3.0f);
        pathBuilder.lineToRelative(-0.8f, 0.8f);
        pathBuilder.lineTo(11.0f, 7.33f);
        pathBuilder.close();
        pathBuilder.moveTo(2.41f, 1.58f);
        pathBuilder.lineTo(1.0f, 2.99f);
        pathBuilder.lineToRelative(3.64f, 3.64f);
        pathBuilder.lineTo(3.0f, 8.27f);
        pathBuilder.verticalLineToRelative(7.46f);
        pathBuilder.lineTo(8.27f, 21.0f);
        pathBuilder.horizontalLineToRelative(7.46f);
        pathBuilder.lineToRelative(1.64f, -1.64f);
        pathBuilder.lineTo(21.01f, 23.0f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(2.41f, 1.58f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 12.99f);
        pathBuilder.lineToRelative(0.01f, 0.01f);
        pathBuilder.lineTo(11.0f, 13.0f);
        pathBuilder.verticalLineToRelative(-0.01f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 17.3f);
        pathBuilder.curveToRelative(-0.72f, 0.0f, -1.3f, -0.58f, -1.3f, -1.3f);
        pathBuilder.curveToRelative(0.0f, -0.72f, 0.58f, -1.3f, 1.3f, -1.3f);
        pathBuilder.reflectiveCurveToRelative(1.3f, 0.58f, 1.3f, 1.3f);
        pathBuilder.curveToRelative(0.0f, 0.72f, -0.58f, 1.3f, -1.3f, 1.3f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _reportOff = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
