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

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13413d2 = {"_contacts", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Contacts", "Landroidx/compose/material/icons/Icons$TwoTone;", "getContacts", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nContacts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Contacts.kt\nandroidx/compose/material/icons/twotone/ContactsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,108:1\n212#2,12:109\n233#2,18:122\n253#2:159\n233#2,18:160\n253#2:197\n174#3:121\n705#4,2:140\n717#4,2:142\n719#4,11:148\n705#4,2:178\n717#4,2:180\n719#4,11:186\n72#5,4:144\n72#5,4:182\n*S KotlinDebug\n*F\n+ 1 Contacts.kt\nandroidx/compose/material/icons/twotone/ContactsKt\n*L\n29#1:109,12\n30#1:122,18\n30#1:159\n51#1:160,18\n51#1:197\n29#1:121\n30#1:140,2\n30#1:142,2\n30#1:148,11\n51#1:178,2\n51#1:180,2\n51#1:186,11\n30#1:144,4\n51#1:182,4\n*E\n"})
/* loaded from: classes2.dex */
public final class ContactsKt {
    private static ImageVector _contacts;

    public static final ImageVector getContacts(Icons.TwoTone twoTone) {
        ImageVector imageVector = _contacts;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Contacts", C3115Dp.m23994constructorimpl(24.0f), C3115Dp.m23994constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m21435getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM21762getButtKaPHkGw = companion2.m21762getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM21772getBevelLxFBmk8 = companion3.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 6.0f);
        pathBuilder.lineTo(4.0f, 6.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.lineTo(20.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 7.0f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder.reflectiveCurveTo(13.38f, 12.0f, 12.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f);
        pathBuilder.reflectiveCurveTo(10.62f, 7.0f, 12.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 17.0f);
        pathBuilder.lineTo(7.0f, 17.0f);
        pathBuilder.verticalLineToRelative(-1.01f);
        pathBuilder.curveTo(7.0f, 13.9f, 10.31f, 13.0f, 12.0f, 13.0f);
        pathBuilder.reflectiveCurveToRelative(5.0f, 0.9f, 5.0f, 2.99f);
        pathBuilder.lineTo(17.0f, 17.0f);
        pathBuilder.close();
        ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM21762getButtKaPHkGw, iM21772getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m21435getBlack0d7_KjU(), null);
        int iM21762getButtKaPHkGw2 = companion2.m21762getButtKaPHkGw();
        int iM21772getBevelLxFBmk82 = companion3.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(4.0f, 20.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.lineTo(22.0f, 6.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.lineTo(4.0f, 4.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(4.0f, 6.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.lineTo(4.0f, 18.0f);
        pathBuilder2.lineTo(4.0f, 6.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(4.0f, 0.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.lineTo(4.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(4.0f, 22.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.lineTo(4.0f, 24.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 12.0f);
        pathBuilder2.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilder2.reflectiveCurveTo(13.38f, 7.0f, 12.0f, 7.0f);
        pathBuilder2.reflectiveCurveTo(9.5f, 8.12f, 9.5f, 9.5f);
        pathBuilder2.reflectiveCurveTo(10.62f, 12.0f, 12.0f, 12.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 8.5f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder2.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 13.0f);
        pathBuilder2.curveToRelative(-1.69f, 0.0f, -5.0f, 0.9f, -5.0f, 2.99f);
        pathBuilder2.lineTo(7.0f, 17.0f);
        pathBuilder2.horizontalLineToRelative(10.0f);
        pathBuilder2.verticalLineToRelative(-1.01f);
        pathBuilder2.curveTo(17.0f, 13.9f, 13.69f, 13.0f, 12.0f, 13.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(8.81f, 15.5f);
        pathBuilder2.curveToRelative(0.61f, -0.52f, 2.03f, -1.0f, 3.19f, -1.0f);
        pathBuilder2.curveToRelative(1.17f, 0.0f, 2.59f, 0.48f, 3.2f, 1.0f);
        pathBuilder2.lineTo(8.81f, 15.5f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM21762getButtKaPHkGw2, iM21772getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contacts = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
