package androidx.compose.material.icons.outlined;

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

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13413d2 = {"_nearbyOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NearbyOff", "Landroidx/compose/material/icons/Icons$Outlined;", "getNearbyOff", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNearbyOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NearbyOff.kt\nandroidx/compose/material/icons/outlined/NearbyOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n212#2,12:78\n233#2,18:91\n253#2:128\n174#3:90\n705#4,2:109\n717#4,2:111\n719#4,11:117\n72#5,4:113\n*S KotlinDebug\n*F\n+ 1 NearbyOff.kt\nandroidx/compose/material/icons/outlined/NearbyOffKt\n*L\n29#1:78,12\n30#1:91,18\n30#1:128\n29#1:90\n30#1:109,2\n30#1:111,2\n30#1:117,11\n30#1:113,4\n*E\n"})
/* loaded from: classes.dex */
public final class NearbyOffKt {
    private static ImageVector _nearbyOff;

    public static final ImageVector getNearbyOff(Icons.Outlined outlined) {
        ImageVector imageVector = _nearbyOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NearbyOff", C3115Dp.m23994constructorimpl(24.0f), C3115Dp.m23994constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21435getBlack0d7_KjU(), null);
        int iM21762getButtKaPHkGw = StrokeCap.INSTANCE.m21762getButtKaPHkGw();
        int iM21772getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.41f, 13.42f);
        pathBuilder.lineTo(18.83f, 16.0f);
        pathBuilder.lineToRelative(-1.81f, -1.81f);
        pathBuilder.lineTo(19.2f, 12.0f);
        pathBuilder.lineTo(12.0f, 4.8f);
        pathBuilder.lineTo(9.81f, 6.99f);
        pathBuilder.lineTo(8.0f, 5.17f);
        pathBuilder.lineToRelative(2.58f, -2.58f);
        pathBuilder.curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0.0f);
        pathBuilder.lineToRelative(8.0f, 8.0f);
        pathBuilder.curveTo(22.2f, 11.37f, 22.2f, 12.63f, 21.41f, 13.42f);
        pathBuilder.close();
        pathBuilder.moveTo(21.19f, 21.19f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineTo(16.0f, 18.83f);
        pathBuilder.lineToRelative(-2.58f, 2.58f);
        pathBuilder.curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0.0f);
        pathBuilder.lineToRelative(-8.0f, -8.0f);
        pathBuilder.curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilder.lineTo(5.17f, 8.0f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineTo(2.8f, 2.81f);
        pathBuilder.lineTo(21.19f, 21.19f);
        pathBuilder.close();
        pathBuilder.moveTo(14.19f, 17.02f);
        pathBuilder.lineToRelative(-1.39f, -1.39f);
        pathBuilder.lineToRelative(-0.8f, 0.8f);
        pathBuilder.lineTo(7.58f, 12.0f);
        pathBuilder.lineToRelative(0.8f, -0.8f);
        pathBuilder.lineToRelative(-1.4f, -1.39f);
        pathBuilder.lineTo(4.8f, 12.0f);
        pathBuilder.lineToRelative(7.2f, 7.2f);
        pathBuilder.lineTo(14.19f, 17.02f);
        pathBuilder.close();
        pathBuilder.moveTo(16.42f, 12.0f);
        pathBuilder.lineTo(12.0f, 7.58f);
        pathBuilder.lineToRelative(-0.8f, 0.8f);
        pathBuilder.lineToRelative(4.42f, 4.42f);
        pathBuilder.lineTo(16.42f, 12.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21762getButtKaPHkGw, iM21772getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nearbyOff = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
