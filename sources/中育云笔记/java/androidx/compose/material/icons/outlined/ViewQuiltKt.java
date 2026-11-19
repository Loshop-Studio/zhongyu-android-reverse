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
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
public final class ViewQuiltKt {
    private static ImageVector _viewQuilt;

    public static final ImageVector getViewQuilt(Icons.Outlined outlined) {
        ImageVector imageVector = _viewQuilt;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ViewQuilt", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.33f, 17.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(3.33f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.67f, 17.0f);
        pathBuilder.horizontalLineToRelative(-3.33f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(3.33f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(-3.33f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(-8.67f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _viewQuilt = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getViewQuilt$annotations(Icons.Outlined outlined) {
    }
}
