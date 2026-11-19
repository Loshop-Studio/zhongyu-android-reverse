package androidx.compose.material.icons.filled;

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
public final class AddToDriveKt {
    private static ImageVector _addToDrive;

    public static final ImageVector getAddToDrive(Icons.Filled filled) {
        ImageVector imageVector = _addToDrive;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AddToDrive", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 21.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.03f, 21.5f);
        pathBuilder.horizontalLineTo(5.66f);
        pathBuilder.curveToRelative(-0.72f, 0.0f, -1.38f, -0.38f, -1.73f, -1.0f);
        pathBuilder.lineTo(1.57f, 16.4f);
        pathBuilder.curveToRelative(-0.36f, -0.62f, -0.35f, -1.38f, 0.01f, -2.0f);
        pathBuilder.lineTo(7.92f, 3.49f);
        pathBuilder.curveTo(8.28f, 2.88f, 8.94f, 2.5f, 9.65f, 2.5f);
        pathBuilder.horizontalLineToRelative(4.7f);
        pathBuilder.curveToRelative(0.71f, 0.0f, 1.37f, 0.38f, 1.73f, 0.99f);
        pathBuilder.lineToRelative(4.48f, 7.71f);
        pathBuilder.curveTo(20.06f, 11.07f, 19.54f, 11.0f, 19.0f, 11.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.56f, 0.02f, -0.84f, 0.06f);
        pathBuilder.lineTo(14.35f, 4.5f);
        pathBuilder.horizontalLineToRelative(-4.7f);
        pathBuilder.lineTo(3.31f, 15.41f);
        pathBuilder.lineToRelative(2.35f, 4.09f);
        pathBuilder.horizontalLineToRelative(7.89f);
        pathBuilder.curveTo(13.9f, 20.27f, 14.4f, 20.95f, 15.03f, 21.5f);
        pathBuilder.close();
        pathBuilder.moveTo(13.34f, 15.0f);
        pathBuilder.curveTo(13.12f, 15.63f, 13.0f, 16.3f, 13.0f, 17.0f);
        pathBuilder.horizontalLineTo(7.25f);
        pathBuilder.lineToRelative(-0.73f, -1.27f);
        pathBuilder.lineToRelative(4.58f, -7.98f);
        pathBuilder.horizontalLineToRelative(1.8f);
        pathBuilder.lineToRelative(2.53f, 4.42f);
        pathBuilder.curveToRelative(-0.56f, 0.42f, -1.05f, 0.93f, -1.44f, 1.51f);
        pathBuilder.lineToRelative(-2.0f, -3.49f);
        pathBuilder.lineTo(9.25f, 15.0f);
        pathBuilder.horizontalLineTo(13.34f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addToDrive = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
