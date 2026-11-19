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

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13413d2 = {"_smokingRooms", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SmokingRooms", "Landroidx/compose/material/icons/Icons$Filled;", "getSmokingRooms", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSmokingRooms.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmokingRooms.kt\nandroidx/compose/material/icons/filled/SmokingRoomsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n72#5,4:115\n*S KotlinDebug\n*F\n+ 1 SmokingRooms.kt\nandroidx/compose/material/icons/filled/SmokingRoomsKt\n*L\n29#1:80,12\n30#1:93,18\n30#1:130\n29#1:92\n30#1:111,2\n30#1:113,2\n30#1:119,11\n30#1:115,4\n*E\n"})
/* loaded from: classes.dex */
public final class SmokingRoomsKt {
    private static ImageVector _smokingRooms;

    public static final ImageVector getSmokingRooms(Icons.Filled filled) {
        ImageVector imageVector = _smokingRooms;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SmokingRooms", C3115Dp.m23994constructorimpl(24.0f), C3115Dp.m23994constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21435getBlack0d7_KjU(), null);
        int iM21762getButtKaPHkGw = StrokeCap.INSTANCE.m21762getButtKaPHkGw();
        int iM21772getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(15.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.lineTo(2.0f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.5f, 16.0f);
        pathBuilder.lineTo(22.0f, 16.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.lineTo(18.0f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.85f, 7.73f);
        pathBuilder.curveToRelative(0.62f, -0.61f, 1.0f, -1.45f, 1.0f, -2.38f);
        pathBuilder.curveTo(19.85f, 3.5f, 18.35f, 2.0f, 16.5f, 2.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.curveToRelative(1.02f, 0.0f, 1.85f, 0.83f, 1.85f, 1.85f);
        pathBuilder.reflectiveCurveTo(17.52f, 7.2f, 16.5f, 7.2f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.curveToRelative(2.24f, 0.0f, 4.0f, 1.83f, 4.0f, 4.07f);
        pathBuilder.lineTo(20.5f, 15.0f);
        pathBuilder.lineTo(22.0f, 15.0f);
        pathBuilder.verticalLineToRelative(-2.24f);
        pathBuilder.curveToRelative(0.0f, -2.22f, -1.28f, -4.14f, -3.15f, -5.03f);
        pathBuilder.close();
        pathBuilder.moveTo(16.03f, 10.2f);
        pathBuilder.lineTo(14.5f, 10.2f);
        pathBuilder.curveToRelative(-1.02f, 0.0f, -1.85f, -0.98f, -1.85f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.83f, -1.75f, 1.85f, -1.75f);
        pathBuilder.verticalLineToRelative(-1.5f);
        pathBuilder.curveToRelative(-1.85f, 0.0f, -3.35f, 1.5f, -3.35f, 3.35f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 3.35f, 3.35f, 3.35f);
        pathBuilder.horizontalLineToRelative(1.53f);
        pathBuilder.curveToRelative(1.05f, 0.0f, 1.97f, 0.74f, 1.97f, 2.05f);
        pathBuilder.lineTo(18.0f, 15.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(-1.64f);
        pathBuilder.curveToRelative(0.0f, -1.81f, -1.6f, -3.16f, -3.47f, -3.16f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21762getButtKaPHkGw, iM21772getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _smokingRooms = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
