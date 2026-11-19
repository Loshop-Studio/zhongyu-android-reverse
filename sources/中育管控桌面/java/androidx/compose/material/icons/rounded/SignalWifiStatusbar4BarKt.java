package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.p009ui.graphics.Color;
import androidx.compose.p009ui.graphics.SolidColor;
import androidx.compose.p009ui.graphics.StrokeCap;
import androidx.compose.p009ui.graphics.StrokeJoin;
import androidx.compose.p009ui.graphics.vector.ImageVector;
import androidx.compose.p009ui.graphics.vector.PathBuilder;
import androidx.compose.p009ui.graphics.vector.VectorKt;
import androidx.compose.p009ui.unit.C2452Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7880d2 = {"_signalWifiStatusbar4Bar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SignalWifiStatusbar4Bar", "Landroidx/compose/material/icons/Icons$Rounded;", "getSignalWifiStatusbar4Bar", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7881k = 2, m7882mv = {1, 8, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nSignalWifiStatusbar4Bar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignalWifiStatusbar4Bar.kt\nandroidx/compose/material/icons/rounded/SignalWifiStatusbar4BarKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,46:1\n212#2,12:47\n233#2,18:60\n253#2:97\n174#3:59\n705#4,2:78\n717#4,2:80\n719#4,11:86\n72#5,4:82\n*S KotlinDebug\n*F\n+ 1 SignalWifiStatusbar4Bar.kt\nandroidx/compose/material/icons/rounded/SignalWifiStatusbar4BarKt\n*L\n29#1:47,12\n30#1:60,18\n30#1:97\n29#1:59\n30#1:78,2\n30#1:80,2\n30#1:86,11\n30#1:82,4\n*E\n"})
/* loaded from: classes.dex */
public final class SignalWifiStatusbar4BarKt {
    private static ImageVector _signalWifiStatusbar4Bar;

    public static final ImageVector getSignalWifiStatusbar4Bar(Icons.Rounded rounded) {
        ImageVector imageVector = _signalWifiStatusbar4Bar;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SignalWifiStatusbar4Bar", C2452Dp.m16484constructorimpl(24.0f), C2452Dp.m16484constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m13925getBlack0d7_KjU(), null);
        int iM14252getButtKaPHkGw = StrokeCap.INSTANCE.m14252getButtKaPHkGw();
        int iM14262getBevelLxFBmk8 = StrokeJoin.INSTANCE.m14262getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveTo(7.7f, 4.0f, 3.78f, 5.6f, 0.79f, 8.24f);
        pathBuilder.curveTo(0.35f, 8.63f, 0.32f, 9.3f, 0.73f, 9.71f);
        pathBuilder.lineToRelative(10.56f, 10.58f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0.0f);
        pathBuilder.lineTo(23.27f, 9.71f);
        pathBuilder.curveToRelative(0.41f, -0.41f, 0.38f, -1.08f, -0.06f, -1.47f);
        pathBuilder.curveTo(20.22f, 5.6f, 16.3f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m14584addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM14252getButtKaPHkGw, iM14262getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signalWifiStatusbar4Bar = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
