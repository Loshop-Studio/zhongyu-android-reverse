package androidx.compose.material.icons.sharp;

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
public final class WorkspacePremiumKt {
    private static ImageVector _workspacePremium;

    public static final ImageVector getWorkspacePremium(Icons.Sharp sharp) {
        ImageVector imageVector = _workspacePremium;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.WorkspacePremium", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.68f, 13.69f);
        pathBuilder.lineTo(12.0f, 11.93f);
        pathBuilder.lineToRelative(2.31f, 1.76f);
        pathBuilder.lineToRelative(-0.88f, -2.85f);
        pathBuilder.lineTo(15.75f, 9.0f);
        pathBuilder.horizontalLineToRelative(-2.84f);
        pathBuilder.lineTo(12.0f, 6.19f);
        pathBuilder.lineTo(11.09f, 9.0f);
        pathBuilder.horizontalLineTo(8.25f);
        pathBuilder.lineToRelative(2.31f, 1.84f);
        pathBuilder.lineTo(9.68f, 13.69f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 10.0f);
        pathBuilder.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(-8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, 2.03f, 0.76f, 3.87f, 2.0f, 5.28f);
        pathBuilder.verticalLineTo(23.0f);
        pathBuilder.lineToRelative(6.0f, -2.0f);
        pathBuilder.lineToRelative(6.0f, 2.0f);
        pathBuilder.verticalLineToRelative(-7.72f);
        pathBuilder.curveTo(19.24f, 13.87f, 20.0f, 12.03f, 20.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder.reflectiveCurveTo(8.69f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _workspacePremium = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
