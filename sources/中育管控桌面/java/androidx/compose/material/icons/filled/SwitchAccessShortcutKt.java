package androidx.compose.material.icons.filled;

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

@Metadata(m7879d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7880d2 = {"_switchAccessShortcut", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SwitchAccessShortcut", "Landroidx/compose/material/icons/Icons$Filled;", "getSwitchAccessShortcut", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7881k = 2, m7882mv = {1, 8, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nSwitchAccessShortcut.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwitchAccessShortcut.kt\nandroidx/compose/material/icons/filled/SwitchAccessShortcutKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,78:1\n212#2,12:79\n233#2,18:92\n253#2:129\n174#3:91\n705#4,2:110\n717#4,2:112\n719#4,11:118\n72#5,4:114\n*S KotlinDebug\n*F\n+ 1 SwitchAccessShortcut.kt\nandroidx/compose/material/icons/filled/SwitchAccessShortcutKt\n*L\n29#1:79,12\n30#1:92,18\n30#1:129\n29#1:91\n30#1:110,2\n30#1:112,2\n30#1:118,11\n30#1:114,4\n*E\n"})
/* loaded from: classes.dex */
public final class SwitchAccessShortcutKt {
    private static ImageVector _switchAccessShortcut;

    public static final ImageVector getSwitchAccessShortcut(Icons.Filled filled) {
        ImageVector imageVector = _switchAccessShortcut;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SwitchAccessShortcut", C2452Dp.m16484constructorimpl(24.0f), C2452Dp.m16484constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m13925getBlack0d7_KjU(), null);
        int iM14252getButtKaPHkGw = StrokeCap.INSTANCE.m14252getButtKaPHkGw();
        int iM14262getBevelLxFBmk8 = StrokeJoin.INSTANCE.m14262getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.06f, 8.94f);
        pathBuilder.lineTo(5.0f, 8.0f);
        pathBuilder.lineToRelative(2.06f, -0.94f);
        pathBuilder.lineTo(8.0f, 5.0f);
        pathBuilder.lineToRelative(0.94f, 2.06f);
        pathBuilder.lineTo(11.0f, 8.0f);
        pathBuilder.lineTo(8.94f, 8.94f);
        pathBuilder.lineTo(8.0f, 11.0f);
        pathBuilder.lineTo(7.06f, 8.94f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 21.0f);
        pathBuilder.lineToRelative(0.94f, -2.06f);
        pathBuilder.lineTo(11.0f, 18.0f);
        pathBuilder.lineToRelative(-2.06f, -0.94f);
        pathBuilder.lineTo(8.0f, 15.0f);
        pathBuilder.lineToRelative(-0.94f, 2.06f);
        pathBuilder.lineTo(5.0f, 18.0f);
        pathBuilder.lineToRelative(2.06f, 0.94f);
        pathBuilder.lineTo(8.0f, 21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.37f, 12.37f);
        pathBuilder.lineTo(3.0f, 13.0f);
        pathBuilder.lineToRelative(1.37f, 0.63f);
        pathBuilder.lineTo(5.0f, 15.0f);
        pathBuilder.lineToRelative(0.63f, -1.37f);
        pathBuilder.lineTo(7.0f, 13.0f);
        pathBuilder.lineToRelative(-1.37f, -0.63f);
        pathBuilder.lineTo(5.0f, 11.0f);
        pathBuilder.lineTo(4.37f, 12.37f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.73f, 1.08f, -5.27f, 2.75f, -7.25f);
        pathBuilder.lineTo(12.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(7.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.lineToRelative(-2.82f, -2.82f);
        pathBuilder.curveTo(14.84f, 7.82f, 14.0f, 9.88f, 14.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 3.32f, 2.1f, 6.36f, 5.0f, 7.82f);
        pathBuilder.lineTo(19.0f, 22.0f);
        pathBuilder.curveTo(14.91f, 20.41f, 12.0f, 16.35f, 12.0f, 12.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m14584addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM14252getButtKaPHkGw, iM14262getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _switchAccessShortcut = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
