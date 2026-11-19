package androidx.compose.material.icons.twotone;

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

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13413d2 = {"_workspacePremium", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WorkspacePremium", "Landroidx/compose/material/icons/Icons$TwoTone;", "getWorkspacePremium", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nWorkspacePremium.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkspacePremium.kt\nandroidx/compose/material/icons/twotone/WorkspacePremiumKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,101:1\n212#2,12:102\n233#2,18:115\n253#2:152\n233#2,18:153\n253#2:190\n174#3:114\n705#4,2:133\n717#4,2:135\n719#4,11:141\n705#4,2:171\n717#4,2:173\n719#4,11:179\n72#5,4:137\n72#5,4:175\n*S KotlinDebug\n*F\n+ 1 WorkspacePremium.kt\nandroidx/compose/material/icons/twotone/WorkspacePremiumKt\n*L\n29#1:102,12\n30#1:115,18\n30#1:152\n58#1:153,18\n58#1:190\n29#1:114\n30#1:133,2\n30#1:135,2\n30#1:141,11\n58#1:171,2\n58#1:173,2\n58#1:179,11\n30#1:137,4\n58#1:175,4\n*E\n"})
/* loaded from: classes2.dex */
public final class WorkspacePremiumKt {
    private static ImageVector _workspacePremium;

    public static final ImageVector getWorkspacePremium(Icons.TwoTone twoTone) {
        ImageVector imageVector = _workspacePremium;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.WorkspacePremium", C3115Dp.m23994constructorimpl(24.0f), C3115Dp.m23994constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m21435getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM21762getButtKaPHkGw = companion2.m21762getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM21772getBevelLxFBmk8 = companion3.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilder.reflectiveCurveTo(15.31f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.31f, 13.69f);
        pathBuilder.lineTo(12.0f, 11.93f);
        pathBuilder.lineToRelative(-2.32f, 1.76f);
        pathBuilder.lineToRelative(0.88f, -2.85f);
        pathBuilder.lineTo(8.25f, 9.0f);
        pathBuilder.horizontalLineToRelative(2.84f);
        pathBuilder.lineTo(12.0f, 6.19f);
        pathBuilder.lineTo(12.91f, 9.0f);
        pathBuilder.horizontalLineToRelative(2.84f);
        pathBuilder.lineToRelative(-2.32f, 1.84f);
        pathBuilder.lineTo(14.31f, 13.69f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 19.0f);
        pathBuilder.lineToRelative(-4.0f, 1.02f);
        pathBuilder.verticalLineToRelative(-3.1f);
        pathBuilder.curveTo(9.18f, 17.6f, 10.54f, 18.0f, 12.0f, 18.0f);
        pathBuilder.reflectiveCurveToRelative(2.82f, -0.4f, 4.0f, -1.08f);
        pathBuilder.verticalLineToRelative(3.1f);
        pathBuilder.lineTo(12.0f, 19.0f);
        pathBuilder.close();
        ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM21762getButtKaPHkGw, iM21772getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m21435getBlack0d7_KjU(), null);
        int iM21762getButtKaPHkGw2 = companion2.m21762getButtKaPHkGw();
        int iM21772getBevelLxFBmk82 = companion3.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(9.68f, 13.69f);
        pathBuilder2.lineTo(12.0f, 11.93f);
        pathBuilder2.lineToRelative(2.31f, 1.76f);
        pathBuilder2.lineToRelative(-0.88f, -2.85f);
        pathBuilder2.lineTo(15.75f, 9.0f);
        pathBuilder2.horizontalLineToRelative(-2.84f);
        pathBuilder2.lineTo(12.0f, 6.19f);
        pathBuilder2.lineTo(11.09f, 9.0f);
        pathBuilder2.horizontalLineTo(8.25f);
        pathBuilder2.lineToRelative(2.31f, 1.84f);
        pathBuilder2.lineTo(9.68f, 13.69f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 10.0f);
        pathBuilder2.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        pathBuilder2.reflectiveCurveToRelative(-8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilder2.curveToRelative(0.0f, 2.03f, 0.76f, 3.87f, 2.0f, 5.28f);
        pathBuilder2.verticalLineTo(23.0f);
        pathBuilder2.lineToRelative(6.0f, -2.0f);
        pathBuilder2.lineToRelative(6.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(-7.72f);
        pathBuilder2.curveTo(19.24f, 13.87f, 20.0f, 12.03f, 20.0f, 10.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 4.0f);
        pathBuilder2.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder2.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder2.reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder2.reflectiveCurveTo(8.69f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 19.0f);
        pathBuilder2.lineToRelative(-4.0f, 1.02f);
        pathBuilder2.verticalLineToRelative(-3.1f);
        pathBuilder2.curveTo(9.18f, 17.6f, 10.54f, 18.0f, 12.0f, 18.0f);
        pathBuilder2.reflectiveCurveToRelative(2.82f, -0.4f, 4.0f, -1.08f);
        pathBuilder2.verticalLineToRelative(3.1f);
        pathBuilder2.lineTo(12.0f, 19.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM21762getButtKaPHkGw2, iM21772getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _workspacePremium = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
