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
public final class TransferWithinAStationKt {
    private static ImageVector _transferWithinAStation;

    public static final ImageVector getTransferWithinAStation(Icons.TwoTone twoTone) {
        ImageVector imageVector = _transferWithinAStation;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.TransferWithinAStation", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.49f, 13.75f);
        pathBuilder.lineTo(14.0f, 16.25f);
        pathBuilder.lineToRelative(2.49f, 2.5f);
        pathBuilder.lineTo(16.49f, 17.0f);
        pathBuilder.lineTo(22.0f, 17.0f);
        pathBuilder.verticalLineToRelative(-1.5f);
        pathBuilder.horizontalLineToRelative(-5.51f);
        pathBuilder.close();
        pathBuilder.moveTo(19.51f, 19.75f);
        pathBuilder.lineTo(14.0f, 19.75f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.horizontalLineToRelative(5.51f);
        pathBuilder.lineTo(19.51f, 23.0f);
        pathBuilder.lineTo(22.0f, 20.5f);
        pathBuilder.lineTo(19.51f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.5f, 3.5f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.55f, 10.4f);
        pathBuilder.curveTo(10.85f, 12.0f, 12.8f, 13.0f, 15.0f, 13.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(-1.85f, 0.0f, -3.45f, -1.0f, -4.35f, -2.45f);
        pathBuilder.lineToRelative(-0.95f, -1.6f);
        pathBuilder.curveTo(9.35f, 6.35f, 8.7f, 6.0f, 8.0f, 6.0f);
        pathBuilder.curveToRelative(-0.25f, 0.0f, -0.5f, 0.05f, -0.75f, 0.15f);
        pathBuilder.lineTo(2.0f, 8.3f);
        pathBuilder.lineTo(2.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(4.0f, 9.65f);
        pathBuilder.lineToRelative(1.75f, -0.75f);
        pathBuilder.lineTo(3.0f, 23.0f);
        pathBuilder.horizontalLineToRelative(2.1f);
        pathBuilder.lineToRelative(1.75f, -8.0f);
        pathBuilder.lineTo(9.0f, 17.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-7.55f);
        pathBuilder.lineTo(8.95f, 13.4f);
        pathBuilder.lineToRelative(0.6f, -3.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _transferWithinAStation = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
