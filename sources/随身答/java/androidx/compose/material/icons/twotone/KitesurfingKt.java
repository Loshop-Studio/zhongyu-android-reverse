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

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13413d2 = {"_kitesurfing", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Kitesurfing", "Landroidx/compose/material/icons/Icons$TwoTone;", "getKitesurfing", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nKitesurfing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Kitesurfing.kt\nandroidx/compose/material/icons/twotone/KitesurfingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,94:1\n212#2,12:95\n233#2,18:108\n253#2:145\n174#3:107\n705#4,2:126\n717#4,2:128\n719#4,11:134\n72#5,4:130\n*S KotlinDebug\n*F\n+ 1 Kitesurfing.kt\nandroidx/compose/material/icons/twotone/KitesurfingKt\n*L\n29#1:95,12\n30#1:108,18\n30#1:145\n29#1:107\n30#1:126,2\n30#1:128,2\n30#1:134,11\n30#1:130,4\n*E\n"})
/* loaded from: classes2.dex */
public final class KitesurfingKt {
    private static ImageVector _kitesurfing;

    public static final ImageVector getKitesurfing(Icons.TwoTone twoTone) {
        ImageVector imageVector = _kitesurfing;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Kitesurfing", C3115Dp.m23994constructorimpl(24.0f), C3115Dp.m23994constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21435getBlack0d7_KjU(), null);
        int iM21762getButtKaPHkGw = StrokeCap.INSTANCE.m21762getButtKaPHkGw();
        int iM21772getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(6.0f, 4.1f, 6.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.06f, 1.0f);
        pathBuilder.horizontalLineToRelative(-2.12f);
        pathBuilder.lineTo(15.5f, 3.44f);
        pathBuilder.lineToRelative(1.06f, 1.06f);
        pathBuilder.lineTo(20.06f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 23.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(-1.04f, 0.0f, -2.08f, -0.35f, -3.0f, -1.0f);
        pathBuilder.curveToRelative(-1.83f, 1.3f, -4.17f, 1.3f, -6.0f, 0.0f);
        pathBuilder.curveToRelative(-1.83f, 1.3f, -4.17f, 1.3f, -6.0f, 0.0f);
        pathBuilder.curveToRelative(-0.91f, 0.65f, -1.96f, 1.0f, -3.0f, 1.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.lineToRelative(0.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveToRelative(1.03f, 0.0f, 2.05f, -0.25f, 3.0f, -0.75f);
        pathBuilder.curveToRelative(1.89f, 1.0f, 4.11f, 1.0f, 6.0f, 0.0f);
        pathBuilder.curveToRelative(1.89f, 1.0f, 4.11f, 1.0f, 6.0f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.95f, 0.5f, 1.97f, 0.75f, 3.0f, 0.75f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 13.28f);
        pathBuilder.curveToRelative(0.0f, 1.44f, -2.19f, 3.62f, -5.04f, 5.58f);
        pathBuilder.curveTo(15.65f, 18.95f, 15.33f, 19.0f, 15.0f, 19.0f);
        pathBuilder.curveToRelative(-1.2f, 0.0f, -2.27f, -0.66f, -3.0f, -1.5f);
        pathBuilder.curveToRelative(-0.73f, 0.84f, -1.8f, 1.5f, -3.0f, 1.5f);
        pathBuilder.curveToRelative(-0.94f, 0.0f, -1.81f, -0.41f, -2.49f, -0.99f);
        pathBuilder.curveToRelative(0.46f, -0.39f, 0.96f, -0.78f, 1.49f, -1.17f);
        pathBuilder.lineToRelative(-1.55f, -2.97f);
        pathBuilder.curveTo(6.15f, 13.3f, 6.0f, 12.64f, 6.0f, 12.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.63f, -0.56f, 3.54f, -1.46f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.curveTo(14.68f, 7.21f, 12.93f, 8.0f, 11.0f, 8.0f);
        pathBuilder.horizontalLineTo(9.6f);
        pathBuilder.lineToRelative(0.0f, 3.5f);
        pathBuilder.horizontalLineToRelative(2.8f);
        pathBuilder.lineToRelative(1.69f, 1.88f);
        pathBuilder.curveToRelative(1.95f, -0.84f, 3.77f, -1.38f, 5.06f, -1.38f);
        pathBuilder.curveTo(19.99f, 12.0f, 21.0f, 12.25f, 21.0f, 13.28f);
        pathBuilder.close();
        pathBuilder.moveTo(12.2f, 14.27f);
        pathBuilder.lineToRelative(-0.7f, -0.77f);
        pathBuilder.lineTo(9.0f, 13.6f);
        pathBuilder.lineToRelative(0.83f, 2.01f);
        pathBuilder.curveTo(10.42f, 15.23f, 11.64f, 14.55f, 12.2f, 14.27f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21762getButtKaPHkGw, iM21772getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _kitesurfing = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
