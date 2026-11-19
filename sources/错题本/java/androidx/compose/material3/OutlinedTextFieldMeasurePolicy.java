package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.geometry.SizeKt;
import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutIdKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.compose.p011ui.util.MathHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJC\u0010\u0016\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u0019\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u00122\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J,\u0010!\u001a\u00020\u001e*\u00020\u001a2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J)\u0010\"\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010#J)\u0010$\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b$\u0010#J)\u0010%\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b%\u0010#J)\u0010&\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010#R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, m5110d2 = {"Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Size;", "Ld6/s;", "onLabelMeasured", "", "singleLine", "", "animationProgress", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "<init>", "(Lr6/c;ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurables", "", "height", "Lkotlin/Function2;", "intrinsicMeasurer", "intrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILr6/e;)I", "width", "intrinsicHeight", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "maxIntrinsicHeight", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "minIntrinsicHeight", "maxIntrinsicWidth", "minIntrinsicWidth", "Lr6/c;", "Z", "F", "Landroidx/compose/foundation/layout/PaddingValues;", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1155:1\n116#2,2:1156\n33#2,6:1158\n118#2:1164\n116#2,2:1165\n33#2,6:1167\n118#2:1173\n116#2,2:1174\n33#2,6:1176\n118#2:1182\n116#2,2:1183\n33#2,6:1185\n118#2:1191\n116#2,2:1192\n33#2,6:1194\n118#2:1200\n116#2,2:1202\n33#2,6:1204\n118#2:1210\n544#2,2:1211\n33#2,6:1213\n546#2:1219\n116#2,2:1220\n33#2,6:1222\n118#2:1228\n544#2,2:1229\n33#2,6:1231\n546#2:1237\n544#2,2:1238\n33#2,6:1240\n546#2:1246\n116#2,2:1247\n33#2,6:1249\n118#2:1255\n116#2,2:1256\n33#2,6:1258\n118#2:1264\n116#2,2:1265\n33#2,6:1267\n118#2:1273\n116#2,2:1274\n33#2,6:1276\n118#2:1282\n116#2,2:1283\n33#2,6:1285\n118#2:1291\n116#2,2:1292\n33#2,6:1294\n118#2:1300\n116#2,2:1301\n33#2,6:1303\n118#2:1309\n116#2,2:1310\n33#2,6:1312\n118#2:1318\n116#2,2:1319\n33#2,6:1321\n118#2:1327\n116#2,2:1328\n33#2,6:1330\n118#2:1336\n116#2,2:1337\n33#2,6:1339\n118#2:1345\n544#2,2:1346\n33#2,6:1348\n546#2:1354\n116#2,2:1355\n33#2,6:1357\n118#2:1363\n116#2,2:1364\n33#2,6:1366\n118#2:1372\n1#3:1201\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldMeasurePolicy\n*L\n608#1:1156,2\n608#1:1158,6\n608#1:1164\n615#1:1165,2\n615#1:1167,6\n615#1:1173\n623#1:1174,2\n623#1:1176,6\n623#1:1182\n631#1:1183,2\n631#1:1185,6\n631#1:1191\n652#1:1192,2\n652#1:1194,6\n652#1:1200\n659#1:1202,2\n659#1:1204,6\n659#1:1210\n674#1:1211,2\n674#1:1213,6\n674#1:1219\n680#1:1220,2\n680#1:1222,6\n680#1:1228\n733#1:1229,2\n733#1:1231,6\n733#1:1237\n806#1:1238,2\n806#1:1240,6\n806#1:1246\n809#1:1247,2\n809#1:1249,6\n809#1:1255\n813#1:1256,2\n813#1:1258,6\n813#1:1264\n817#1:1265,2\n817#1:1267,6\n817#1:1273\n821#1:1274,2\n821#1:1276,6\n821#1:1282\n825#1:1283,2\n825#1:1285,6\n825#1:1291\n829#1:1292,2\n829#1:1294,6\n829#1:1300\n854#1:1301,2\n854#1:1303,6\n854#1:1309\n864#1:1310,2\n864#1:1312,6\n864#1:1318\n875#1:1319,2\n875#1:1321,6\n875#1:1327\n880#1:1328,2\n880#1:1330,6\n880#1:1336\n891#1:1337,2\n891#1:1339,6\n891#1:1345\n902#1:1346,2\n902#1:1348,6\n902#1:1354\n906#1:1355,2\n906#1:1357,6\n906#1:1363\n911#1:1364,2\n911#1:1366,6\n911#1:1372\n*E\n"})
/* loaded from: classes.dex */
final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;

    @NotNull
    private final InterfaceC6471c onLabelMeasured;

    @NotNull
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    public OutlinedTextFieldMeasurePolicy(@NotNull InterfaceC6471c interfaceC6471c, boolean z8, float f, @NotNull PaddingValues paddingValues) {
        this.onLabelMeasured = interfaceC6471c;
        this.singleLine = z8;
        this.animationProgress = f;
        this.paddingValues = paddingValues;
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, InterfaceC6473e interfaceC6473e) {
        IntrinsicMeasurable intrinsicMeasurable;
        int iSubstractConstraintSafely;
        int iIntValue;
        IntrinsicMeasurable intrinsicMeasurable2;
        int iIntValue2;
        Object obj;
        IntrinsicMeasurable intrinsicMeasurable3;
        int iIntValue3;
        IntrinsicMeasurable intrinsicMeasurable4;
        int i8;
        Object obj2;
        Object obj3;
        int size = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                intrinsicMeasurable = null;
                break;
            }
            intrinsicMeasurable = list.get(i9);
            if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable), TextFieldImplKt.LeadingId)) {
                break;
            }
            i9++;
        }
        IntrinsicMeasurable intrinsicMeasurable5 = intrinsicMeasurable;
        if (intrinsicMeasurable5 != null) {
            iSubstractConstraintSafely = OutlinedTextFieldKt.substractConstraintSafely(i, intrinsicMeasurable5.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue = ((Number) interfaceC6473e.invoke(intrinsicMeasurable5, Integer.valueOf(i))).intValue();
        } else {
            iSubstractConstraintSafely = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                intrinsicMeasurable2 = null;
                break;
            }
            intrinsicMeasurable2 = list.get(i10);
            if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), TextFieldImplKt.TrailingId)) {
                break;
            }
            i10++;
        }
        IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable2;
        if (intrinsicMeasurable6 != null) {
            iSubstractConstraintSafely = OutlinedTextFieldKt.substractConstraintSafely(iSubstractConstraintSafely, intrinsicMeasurable6.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue2 = ((Number) interfaceC6473e.invoke(intrinsicMeasurable6, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size3) {
                obj = null;
                break;
            }
            obj = list.get(i11);
            if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj), TextFieldImplKt.LabelId)) {
                break;
            }
            i11++;
        }
        Object obj4 = (IntrinsicMeasurable) obj;
        int iIntValue4 = obj4 != null ? ((Number) interfaceC6473e.invoke(obj4, Integer.valueOf(MathHelpersKt.lerp(iSubstractConstraintSafely, i, this.animationProgress)))).intValue() : 0;
        int size4 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size4) {
                intrinsicMeasurable3 = null;
                break;
            }
            intrinsicMeasurable3 = list.get(i12);
            if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), TextFieldImplKt.PrefixId)) {
                break;
            }
            i12++;
        }
        IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable3;
        if (intrinsicMeasurable7 != null) {
            iIntValue3 = ((Number) interfaceC6473e.invoke(intrinsicMeasurable7, Integer.valueOf(iSubstractConstraintSafely))).intValue();
            iSubstractConstraintSafely = OutlinedTextFieldKt.substractConstraintSafely(iSubstractConstraintSafely, intrinsicMeasurable7.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size5) {
                intrinsicMeasurable4 = null;
                break;
            }
            intrinsicMeasurable4 = list.get(i13);
            if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.SuffixId)) {
                break;
            }
            i13++;
        }
        IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable4;
        if (intrinsicMeasurable8 != null) {
            int iIntValue5 = ((Number) interfaceC6473e.invoke(intrinsicMeasurable8, Integer.valueOf(iSubstractConstraintSafely))).intValue();
            iSubstractConstraintSafely = OutlinedTextFieldKt.substractConstraintSafely(iSubstractConstraintSafely, intrinsicMeasurable8.maxIntrinsicWidth(Integer.MAX_VALUE));
            i8 = iIntValue5;
        } else {
            i8 = 0;
        }
        int size6 = list.size();
        for (int i14 = 0; i14 < size6; i14++) {
            Object obj5 = list.get(i14);
            if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj5), TextFieldImplKt.TextFieldId)) {
                int iIntValue6 = ((Number) interfaceC6473e.invoke(obj5, Integer.valueOf(iSubstractConstraintSafely))).intValue();
                int size7 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size7) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i15);
                    if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                    i15++;
                }
                Object obj6 = (IntrinsicMeasurable) obj2;
                int iIntValue7 = obj6 != null ? ((Number) interfaceC6473e.invoke(obj6, Integer.valueOf(iSubstractConstraintSafely))).intValue() : 0;
                int size8 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size8) {
                        obj3 = null;
                        break;
                    }
                    Object obj7 = list.get(i16);
                    if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj7), TextFieldImplKt.SupportingId)) {
                        obj3 = obj7;
                        break;
                    }
                    i16++;
                }
                Object obj8 = (IntrinsicMeasurable) obj3;
                return OutlinedTextFieldKt.m8757calculateHeightmKXJcVc(iIntValue, iIntValue2, iIntValue3, i8, iIntValue6, iIntValue4, iIntValue7, obj8 != null ? ((Number) interfaceC6473e.invoke(obj8, Integer.valueOf(i))).intValue() : 0, this.animationProgress, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, InterfaceC6473e interfaceC6473e) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        IntrinsicMeasurable intrinsicMeasurable5;
        IntrinsicMeasurable intrinsicMeasurable6;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            IntrinsicMeasurable intrinsicMeasurable7 = list.get(i8);
            if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable7), TextFieldImplKt.TextFieldId)) {
                int iIntValue = ((Number) interfaceC6473e.invoke(intrinsicMeasurable7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i9 = 0;
                while (true) {
                    intrinsicMeasurable = null;
                    if (i9 >= size2) {
                        intrinsicMeasurable2 = null;
                        break;
                    }
                    intrinsicMeasurable2 = list.get(i9);
                    if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), TextFieldImplKt.LabelId)) {
                        break;
                    }
                    i9++;
                }
                IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable2;
                int iIntValue2 = intrinsicMeasurable8 != null ? ((Number) interfaceC6473e.invoke(intrinsicMeasurable8, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size3) {
                        intrinsicMeasurable3 = null;
                        break;
                    }
                    intrinsicMeasurable3 = list.get(i10);
                    if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), TextFieldImplKt.TrailingId)) {
                        break;
                    }
                    i10++;
                }
                IntrinsicMeasurable intrinsicMeasurable9 = intrinsicMeasurable3;
                int iIntValue3 = intrinsicMeasurable9 != null ? ((Number) interfaceC6473e.invoke(intrinsicMeasurable9, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size4) {
                        intrinsicMeasurable4 = null;
                        break;
                    }
                    intrinsicMeasurable4 = list.get(i11);
                    if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.LeadingId)) {
                        break;
                    }
                    i11++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable4;
                int iIntValue4 = intrinsicMeasurable10 != null ? ((Number) interfaceC6473e.invoke(intrinsicMeasurable10, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size5) {
                        intrinsicMeasurable5 = null;
                        break;
                    }
                    intrinsicMeasurable5 = list.get(i12);
                    if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable5), TextFieldImplKt.PrefixId)) {
                        break;
                    }
                    i12++;
                }
                IntrinsicMeasurable intrinsicMeasurable11 = intrinsicMeasurable5;
                int iIntValue5 = intrinsicMeasurable11 != null ? ((Number) interfaceC6473e.invoke(intrinsicMeasurable11, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size6) {
                        intrinsicMeasurable6 = null;
                        break;
                    }
                    intrinsicMeasurable6 = list.get(i13);
                    if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable6), TextFieldImplKt.SuffixId)) {
                        break;
                    }
                    i13++;
                }
                IntrinsicMeasurable intrinsicMeasurable12 = intrinsicMeasurable6;
                int iIntValue6 = intrinsicMeasurable12 != null ? ((Number) interfaceC6473e.invoke(intrinsicMeasurable12, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size7) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable13 = list.get(i14);
                    if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable13), TextFieldImplKt.PlaceholderId)) {
                        intrinsicMeasurable = intrinsicMeasurable13;
                        break;
                    }
                    i14++;
                }
                IntrinsicMeasurable intrinsicMeasurable14 = intrinsicMeasurable;
                return OutlinedTextFieldKt.m8758calculateWidthDHJA7U0(iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, intrinsicMeasurable14 != null ? ((Number) interfaceC6473e.invoke(intrinsicMeasurable14, Integer.valueOf(i))).intValue() : 0, this.animationProgress, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new InterfaceC6473e() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy.maxIntrinsicHeight.1
            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i8) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i8));
            }
        });
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(intrinsicMeasureScope, list, i, new InterfaceC6473e() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy.maxIntrinsicWidth.1
            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i8) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i8));
            }
        });
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6545measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j7) {
        Measurable measurable;
        Measurable measurable2;
        Measurable measurable3;
        Measurable measurable4;
        Placeable placeable;
        Measurable measurable5;
        Measurable measurable6;
        Measurable measurable7;
        final OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = this;
        final MeasureScope measureScope2 = measureScope;
        int iMo6897roundToPx0680j_4 = measureScope2.mo6897roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.getBottom());
        long jM13248copyZbe2FdA$default = Constraints.m13248copyZbe2FdA$default(j7, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                measurable = null;
                break;
            }
            measurable = list.get(i);
            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable), TextFieldImplKt.LeadingId)) {
                break;
            }
            i++;
        }
        Measurable measurable8 = measurable;
        Placeable placeableMo12033measureBRTryo0 = measurable8 != null ? measurable8.mo12033measureBRTryo0(jM13248copyZbe2FdA$default) : null;
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo12033measureBRTryo0);
        int iMax = Math.max(0, TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo0));
        int size2 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list.get(i8);
            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable2), TextFieldImplKt.TrailingId)) {
                break;
            }
            i8++;
        }
        Measurable measurable9 = measurable2;
        Placeable placeableMo12033measureBRTryo02 = measurable9 != null ? measurable9.mo12033measureBRTryo0(ConstraintsKt.m13278offsetNN6EwU$default(jM13248copyZbe2FdA$default, -iWidthOrZero, 0, 2, null)) : null;
        int iWidthOrZero2 = TextFieldImplKt.widthOrZero(placeableMo12033measureBRTryo02) + iWidthOrZero;
        int iMax2 = Math.max(iMax, TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo02));
        int size3 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size3) {
                measurable3 = null;
                break;
            }
            measurable3 = list.get(i9);
            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable3), TextFieldImplKt.PrefixId)) {
                break;
            }
            i9++;
        }
        Measurable measurable10 = measurable3;
        Placeable placeableMo12033measureBRTryo03 = measurable10 != null ? measurable10.mo12033measureBRTryo0(ConstraintsKt.m13278offsetNN6EwU$default(jM13248copyZbe2FdA$default, -iWidthOrZero2, 0, 2, null)) : null;
        int iWidthOrZero3 = TextFieldImplKt.widthOrZero(placeableMo12033measureBRTryo03) + iWidthOrZero2;
        int iMax3 = Math.max(iMax2, TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo03));
        int size4 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size4) {
                measurable4 = null;
                break;
            }
            measurable4 = list.get(i10);
            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable4), TextFieldImplKt.SuffixId)) {
                break;
            }
            i10++;
        }
        Measurable measurable11 = measurable4;
        Placeable placeableMo12033measureBRTryo04 = measurable11 != null ? measurable11.mo12033measureBRTryo0(ConstraintsKt.m13278offsetNN6EwU$default(jM13248copyZbe2FdA$default, -iWidthOrZero3, 0, 2, null)) : null;
        int iWidthOrZero4 = TextFieldImplKt.widthOrZero(placeableMo12033measureBRTryo04) + iWidthOrZero3;
        int iMax4 = Math.max(iMax3, TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo04));
        int iMo6897roundToPx0680j_42 = measureScope2.mo6897roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.mo7213calculateRightPaddingu2uoSUM(measureScope2.getLayoutDirection())) + measureScope2.mo6897roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.mo7212calculateLeftPaddingu2uoSUM(measureScope2.getLayoutDirection()));
        int i11 = -iWidthOrZero4;
        int iLerp = MathHelpersKt.lerp(i11 - iMo6897roundToPx0680j_42, -iMo6897roundToPx0680j_42, outlinedTextFieldMeasurePolicy.animationProgress);
        int i12 = -iMo6897roundToPx0680j_4;
        long jM13277offsetNN6EwU = ConstraintsKt.m13277offsetNN6EwU(jM13248copyZbe2FdA$default, iLerp, i12);
        int size5 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size5) {
                placeable = placeableMo12033measureBRTryo0;
                measurable5 = null;
                break;
            }
            measurable5 = list.get(i13);
            int i14 = i13;
            placeable = placeableMo12033measureBRTryo0;
            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable5), TextFieldImplKt.LabelId)) {
                break;
            }
            i13 = i14 + 1;
            placeableMo12033measureBRTryo0 = placeable;
        }
        Measurable measurable12 = measurable5;
        final Placeable placeableMo12033measureBRTryo05 = measurable12 != null ? measurable12.mo12033measureBRTryo0(jM13277offsetNN6EwU) : null;
        outlinedTextFieldMeasurePolicy.onLabelMeasured.invoke(Size.m10498boximpl(placeableMo12033measureBRTryo05 != null ? SizeKt.Size(placeableMo12033measureBRTryo05.getWidth(), placeableMo12033measureBRTryo05.getHeight()) : Size.INSTANCE.m10519getZeroNHjbRc()));
        int size6 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size6) {
                measurable6 = null;
                break;
            }
            measurable6 = list.get(i15);
            int i16 = size6;
            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable6), TextFieldImplKt.SupportingId)) {
                break;
            }
            i15++;
            size6 = i16;
        }
        Measurable measurable13 = measurable6;
        int iMinIntrinsicHeight = measurable13 != null ? measurable13.minIntrinsicHeight(Constraints.m13260getMinWidthimpl(j7)) : 0;
        int iMax5 = Math.max(TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo05) / 2, measureScope2.mo6897roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.getTop()));
        long jM13248copyZbe2FdA$default2 = Constraints.m13248copyZbe2FdA$default(ConstraintsKt.m13277offsetNN6EwU(j7, i11, (i12 - iMax5) - iMinIntrinsicHeight), 0, 0, 0, 0, 11, null);
        int size7 = list.size();
        final Placeable placeable2 = placeableMo12033measureBRTryo04;
        int i17 = 0;
        while (i17 < size7) {
            final Placeable placeable3 = placeableMo12033measureBRTryo03;
            Measurable measurable14 = list.get(i17);
            int i18 = size7;
            final Placeable placeable4 = placeableMo12033measureBRTryo02;
            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable14), TextFieldImplKt.TextFieldId)) {
                final Placeable placeableMo12033measureBRTryo06 = measurable14.mo12033measureBRTryo0(jM13248copyZbe2FdA$default2);
                long jM13248copyZbe2FdA$default3 = Constraints.m13248copyZbe2FdA$default(jM13248copyZbe2FdA$default2, 0, 0, 0, 0, 14, null);
                int size8 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size8) {
                        measurable7 = null;
                        break;
                    }
                    measurable7 = list.get(i19);
                    int i20 = size8;
                    int i21 = i19;
                    if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable7), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                    i19 = i21 + 1;
                    size8 = i20;
                }
                Measurable measurable15 = measurable7;
                final Placeable placeableMo12033measureBRTryo07 = measurable15 != null ? measurable15.mo12033measureBRTryo0(jM13248copyZbe2FdA$default3) : null;
                int iMax6 = Math.max(iMax4, Math.max(TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo06), TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo07)) + iMax5 + iMo6897roundToPx0680j_4);
                final int iM8758calculateWidthDHJA7U0 = OutlinedTextFieldKt.m8758calculateWidthDHJA7U0(TextFieldImplKt.widthOrZero(placeable), TextFieldImplKt.widthOrZero(placeable4), TextFieldImplKt.widthOrZero(placeable3), TextFieldImplKt.widthOrZero(placeable2), placeableMo12033measureBRTryo06.getWidth(), TextFieldImplKt.widthOrZero(placeableMo12033measureBRTryo05), TextFieldImplKt.widthOrZero(placeableMo12033measureBRTryo07), outlinedTextFieldMeasurePolicy.animationProgress, j7, measureScope2.getDensity(), outlinedTextFieldMeasurePolicy.paddingValues);
                final Placeable placeableMo12033measureBRTryo08 = measurable13 != null ? measurable13.mo12033measureBRTryo0(Constraints.m13248copyZbe2FdA$default(ConstraintsKt.m13278offsetNN6EwU$default(jM13248copyZbe2FdA$default, 0, -iMax6, 1, null), 0, iM8758calculateWidthDHJA7U0, 0, 0, 9, null)) : null;
                int iHeightOrZero = TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo08);
                final int iM8757calculateHeightmKXJcVc = OutlinedTextFieldKt.m8757calculateHeightmKXJcVc(TextFieldImplKt.heightOrZero(placeable), TextFieldImplKt.heightOrZero(placeable4), TextFieldImplKt.heightOrZero(placeable3), TextFieldImplKt.heightOrZero(placeable2), placeableMo12033measureBRTryo06.getHeight(), TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo05), TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo07), TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo08), outlinedTextFieldMeasurePolicy.animationProgress, j7, measureScope2.getDensity(), outlinedTextFieldMeasurePolicy.paddingValues);
                int i22 = iM8757calculateHeightmKXJcVc - iHeightOrZero;
                int size9 = list.size();
                int i23 = 0;
                while (i23 < size9) {
                    Measurable measurable16 = list.get(i23);
                    if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable16), TextFieldImplKt.ContainerId)) {
                        final Placeable placeableMo12033measureBRTryo09 = measurable16.mo12033measureBRTryo0(ConstraintsKt.Constraints(iM8758calculateWidthDHJA7U0 != Integer.MAX_VALUE ? iM8758calculateWidthDHJA7U0 : 0, iM8758calculateWidthDHJA7U0, i22 != Integer.MAX_VALUE ? i22 : 0, i22));
                        final Placeable placeable5 = placeable;
                        return MeasureScope.layout$default(measureScope, iM8758calculateWidthDHJA7U0, iM8757calculateHeightmKXJcVc, null, new InterfaceC6471c() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy$measure$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Placeable.PlacementScope) obj);
                                return C5443s.f8405a;
                            }

                            public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                                OutlinedTextFieldKt.place(placementScope, iM8757calculateHeightmKXJcVc, iM8758calculateWidthDHJA7U0, placeable5, placeable4, placeable3, placeable2, placeableMo12033measureBRTryo06, placeableMo12033measureBRTryo05, placeableMo12033measureBRTryo07, placeableMo12033measureBRTryo09, placeableMo12033measureBRTryo08, outlinedTextFieldMeasurePolicy.animationProgress, outlinedTextFieldMeasurePolicy.singleLine, measureScope2.getDensity(), measureScope2.getLayoutDirection(), outlinedTextFieldMeasurePolicy.paddingValues);
                            }
                        }, 4, null);
                    }
                    i23++;
                    outlinedTextFieldMeasurePolicy = this;
                    measureScope2 = measureScope;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i17++;
            outlinedTextFieldMeasurePolicy = this;
            measureScope2 = measureScope;
            size7 = i18;
            placeableMo12033measureBRTryo03 = placeable3;
            placeableMo12033measureBRTryo02 = placeable4;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new InterfaceC6473e() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy.minIntrinsicHeight.1
            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i8) {
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i8));
            }
        });
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(intrinsicMeasureScope, list, i, new InterfaceC6473e() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy.minIntrinsicWidth.1
            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i8) {
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i8));
            }
        });
    }
}
