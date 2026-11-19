package androidx.compose.material.icons.automirrored.filled;

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

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13413d2 = {"_manageSearch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ManageSearch", "Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;", "getManageSearch", "(Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nManageSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageSearch.kt\nandroidx/compose/material/icons/automirrored/filled/ManageSearchKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,71:1\n223#2:72\n216#2,3:73\n219#2,4:77\n233#2,18:81\n253#2:118\n174#3:76\n705#4,2:99\n717#4,2:101\n719#4,11:107\n72#5,4:103\n*S KotlinDebug\n*F\n+ 1 ManageSearch.kt\nandroidx/compose/material/icons/automirrored/filled/ManageSearchKt\n*L\n29#1:72\n29#1:73,3\n29#1:77,4\n30#1:81,18\n30#1:118\n29#1:76\n30#1:99,2\n30#1:101,2\n30#1:107,11\n30#1:103,4\n*E\n"})
/* loaded from: classes.dex */
public final class ManageSearchKt {
    private static ImageVector _manageSearch;

    public static final ImageVector getManageSearch(Icons.AutoMirrored.Filled filled) {
        ImageVector imageVector = _manageSearch;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.ManageSearch", C3115Dp.m23994constructorimpl(24.0f), C3115Dp.m23994constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21435getBlack0d7_KjU(), null);
        int iM21762getButtKaPHkGw = StrokeCap.INSTANCE.m21762getButtKaPHkGw();
        int iM21772getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.0f, 9.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 12.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.59f, 19.0f);
        pathBuilder.lineToRelative(-3.83f, -3.83f);
        pathBuilder.curveTo(15.96f, 15.69f, 15.02f, 16.0f, 14.0f, 16.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, 1.02f, -0.31f, 1.96f, -0.83f, 2.75f);
        pathBuilder.lineTo(22.0f, 17.59f);
        pathBuilder.lineTo(20.59f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 11.0f);
        pathBuilder.curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveTo(17.0f, 12.65f, 17.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21762getButtKaPHkGw, iM21772getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _manageSearch = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
