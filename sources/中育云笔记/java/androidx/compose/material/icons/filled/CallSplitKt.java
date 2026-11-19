package androidx.compose.material.icons.filled;

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
public final class CallSplitKt {
    private static ImageVector _callSplit;

    public static final ImageVector getCallSplit(Icons.Filled filled) {
        ImageVector imageVector = _callSplit;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CallSplit", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 4.0f);
        pathBuilder.lineToRelative(2.29f, 2.29f);
        pathBuilder.lineToRelative(-2.88f, 2.88f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder.lineToRelative(2.88f, -2.88f);
        pathBuilder.lineTo(20.0f, 10.0f);
        pathBuilder.lineTo(20.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 4.0f);
        pathBuilder.lineTo(4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.lineToRelative(2.29f, -2.29f);
        pathBuilder.lineToRelative(4.71f, 4.7f);
        pathBuilder.lineTo(11.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-8.41f);
        pathBuilder.lineToRelative(-5.29f, -5.3f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _callSplit = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getCallSplit$annotations(Icons.Filled filled) {
    }
}
