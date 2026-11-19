package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.p012ui.graphics.Color;
import androidx.compose.p012ui.graphics.SolidColor;
import androidx.compose.p012ui.graphics.StrokeCap;
import androidx.compose.p012ui.graphics.StrokeJoin;
import androidx.compose.p012ui.graphics.vector.ImageVector;
import androidx.compose.p012ui.graphics.vector.PathBuilder;
import androidx.compose.p012ui.graphics.vector.VectorKt;
import androidx.compose.p012ui.unit.C3115Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13413d2 = {"_wifiOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WifiOff", "Landroidx/compose/material/icons/Icons$Filled;", "getWifiOff", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nWifiOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WifiOff.kt\nandroidx/compose/material/icons/filled/WifiOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,68:1\n212#2,12:69\n233#2,18:82\n253#2:119\n174#3:81\n705#4,2:100\n717#4,2:102\n719#4,11:108\n72#5,4:104\n*S KotlinDebug\n*F\n+ 1 WifiOff.kt\nandroidx/compose/material/icons/filled/WifiOffKt\n*L\n29#1:69,12\n30#1:82,18\n30#1:119\n29#1:81\n30#1:100,2\n30#1:102,2\n30#1:108,11\n30#1:104,4\n*E\n"})
/* loaded from: classes.dex */
public final class WifiOffKt {
    private static ImageVector _wifiOff;

    public static final ImageVector getWifiOff(Icons.Filled filled) {
        ImageVector imageVector = _wifiOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.WifiOff", C3115Dp.m23994constructorimpl(24.0f), C3115Dp.m23994constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21435getBlack0d7_KjU(), null);
        int iM21762getButtKaPHkGw = StrokeCap.INSTANCE.m21762getButtKaPHkGw();
        int iM21772getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.99f, 9.0f);
        pathBuilder.curveTo(19.15f, 5.16f, 13.8f, 3.76f, 8.84f, 4.78f);
        pathBuilder.lineToRelative(2.52f, 2.52f);
        pathBuilder.curveToRelative(3.47f, -0.17f, 6.99f, 1.05f, 9.63f, 3.7f);
        pathBuilder.lineToRelative(2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.99f, 13.0f);
        pathBuilder.curveToRelative(-1.29f, -1.29f, -2.84f, -2.13f, -4.49f, -2.56f);
        pathBuilder.lineToRelative(3.53f, 3.53f);
        pathBuilder.lineToRelative(0.96f, -0.97f);
        pathBuilder.close();
        pathBuilder.moveTo(2.0f, 3.05f);
        pathBuilder.lineTo(5.07f, 6.1f);
        pathBuilder.curveTo(3.6f, 6.82f, 2.22f, 7.78f, 1.0f, 9.0f);
        pathBuilder.lineToRelative(1.99f, 2.0f);
        pathBuilder.curveToRelative(1.24f, -1.24f, 2.67f, -2.16f, 4.2f, -2.77f);
        pathBuilder.lineToRelative(2.24f, 2.24f);
        pathBuilder.curveTo(7.81f, 10.89f, 6.27f, 11.73f, 5.0f, 13.0f);
        pathBuilder.verticalLineToRelative(0.01f);
        pathBuilder.lineTo(6.99f, 15.0f);
        pathBuilder.curveToRelative(1.36f, -1.36f, 3.14f, -2.04f, 4.92f, -2.06f);
        pathBuilder.lineTo(18.98f, 20.0f);
        pathBuilder.lineToRelative(1.27f, -1.26f);
        pathBuilder.lineTo(3.29f, 1.79f);
        pathBuilder.lineTo(2.0f, 3.05f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 17.0f);
        pathBuilder.lineToRelative(3.0f, 3.0f);
        pathBuilder.lineToRelative(3.0f, -3.0f);
        pathBuilder.curveToRelative(-1.65f, -1.66f, -4.34f, -1.66f, -6.0f, 0.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21762getButtKaPHkGw, iM21772getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiOff = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
