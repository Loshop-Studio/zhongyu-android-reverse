package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.TextFieldImplKt;
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

@Metadata(m5109d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ?\u0010\u0011\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0015\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u001e\u001a\u00020\u001b*\u00020\u00172\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001f\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010 J)\u0010!\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010 J)\u0010\"\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010 J)\u0010#\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, m5110d2 = {"Landroidx/compose/material3/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "", "singleLine", "", "animationProgress", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "<init>", "(ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurables", "", "height", "Lkotlin/Function2;", "intrinsicMeasurer", "intrinsicWidth", "(Ljava/util/List;ILr6/e;)I", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "intrinsicHeight", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILr6/e;)I", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "maxIntrinsicHeight", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "minIntrinsicHeight", "maxIntrinsicWidth", "minIntrinsicWidth", "Z", "F", "Landroidx/compose/foundation/layout/PaddingValues;", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1140:1\n116#2,2:1141\n33#2,6:1143\n118#2:1149\n116#2,2:1150\n33#2,6:1152\n118#2:1158\n116#2,2:1159\n33#2,6:1161\n118#2:1167\n116#2,2:1168\n33#2,6:1170\n118#2:1176\n116#2,2:1177\n33#2,6:1179\n118#2:1185\n116#2,2:1186\n33#2,6:1188\n118#2:1194\n544#2,2:1195\n33#2,6:1197\n546#2:1203\n116#2,2:1204\n33#2,6:1206\n118#2:1212\n544#2,2:1213\n33#2,6:1215\n546#2:1221\n544#2,2:1222\n33#2,6:1224\n546#2:1230\n116#2,2:1231\n33#2,6:1233\n118#2:1239\n116#2,2:1241\n33#2,6:1243\n118#2:1249\n116#2,2:1250\n33#2,6:1252\n118#2:1258\n116#2,2:1259\n33#2,6:1261\n118#2:1267\n116#2,2:1268\n33#2,6:1270\n118#2:1276\n116#2,2:1277\n33#2,6:1279\n118#2:1285\n116#2,2:1286\n33#2,6:1288\n118#2:1294\n116#2,2:1295\n33#2,6:1297\n118#2:1303\n116#2,2:1304\n33#2,6:1306\n118#2:1312\n116#2,2:1313\n33#2,6:1315\n118#2:1321\n116#2,2:1322\n33#2,6:1324\n118#2:1330\n544#2,2:1331\n33#2,6:1333\n546#2:1339\n116#2,2:1340\n33#2,6:1342\n118#2:1348\n116#2,2:1349\n33#2,6:1351\n118#2:1357\n1#3:1240\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldMeasurePolicy\n*L\n593#1:1141,2\n593#1:1143,6\n593#1:1149\n600#1:1150,2\n600#1:1152,6\n600#1:1158\n608#1:1159,2\n608#1:1161,6\n608#1:1167\n616#1:1168,2\n616#1:1170,6\n616#1:1176\n628#1:1177,2\n628#1:1179,6\n628#1:1185\n632#1:1186,2\n632#1:1188,6\n632#1:1194\n646#1:1195,2\n646#1:1197,6\n646#1:1203\n652#1:1204,2\n652#1:1206,6\n652#1:1212\n701#1:1213,2\n701#1:1215,6\n701#1:1221\n793#1:1222,2\n793#1:1224,6\n793#1:1230\n796#1:1231,2\n796#1:1233,6\n796#1:1239\n800#1:1241,2\n800#1:1243,6\n800#1:1249\n804#1:1250,2\n804#1:1252,6\n804#1:1258\n808#1:1259,2\n808#1:1261,6\n808#1:1267\n812#1:1268,2\n812#1:1270,6\n812#1:1276\n816#1:1277,2\n816#1:1279,6\n816#1:1285\n838#1:1286,2\n838#1:1288,6\n838#1:1294\n848#1:1295,2\n848#1:1297,6\n848#1:1303\n858#1:1304,2\n858#1:1306,6\n858#1:1312\n863#1:1313,2\n863#1:1315,6\n863#1:1321\n874#1:1322,2\n874#1:1324,6\n874#1:1330\n885#1:1331,2\n885#1:1333,6\n885#1:1339\n888#1:1340,2\n888#1:1342,6\n888#1:1348\n893#1:1349,2\n893#1:1351,6\n893#1:1357\n*E\n"})
/* loaded from: classes.dex */
final class TextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;

    @NotNull
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    public TextFieldMeasurePolicy(boolean z8, float f, @NotNull PaddingValues paddingValues) {
        this.singleLine = z8;
        this.animationProgress = f;
        this.paddingValues = paddingValues;
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, InterfaceC6473e interfaceC6473e) {
        IntrinsicMeasurable intrinsicMeasurable;
        int i8;
        int iSubstractConstraintSafely;
        int iIntValue;
        IntrinsicMeasurable intrinsicMeasurable2;
        int iIntValue2;
        Object obj;
        IntrinsicMeasurable intrinsicMeasurable3;
        int iIntValue3;
        IntrinsicMeasurable intrinsicMeasurable4;
        int i9;
        Object obj2;
        Object obj3;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                intrinsicMeasurable = null;
                break;
            }
            intrinsicMeasurable = list.get(i10);
            if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable), TextFieldImplKt.LeadingId)) {
                break;
            }
            i10++;
        }
        IntrinsicMeasurable intrinsicMeasurable5 = intrinsicMeasurable;
        if (intrinsicMeasurable5 != null) {
            i8 = i;
            iSubstractConstraintSafely = TextFieldKt.substractConstraintSafely(i8, intrinsicMeasurable5.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue = ((Number) interfaceC6473e.invoke(intrinsicMeasurable5, Integer.valueOf(i8))).intValue();
        } else {
            i8 = i;
            iSubstractConstraintSafely = i8;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                intrinsicMeasurable2 = null;
                break;
            }
            intrinsicMeasurable2 = list.get(i11);
            if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), TextFieldImplKt.TrailingId)) {
                break;
            }
            i11++;
        }
        IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable2;
        if (intrinsicMeasurable6 != null) {
            iSubstractConstraintSafely = TextFieldKt.substractConstraintSafely(iSubstractConstraintSafely, intrinsicMeasurable6.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue2 = ((Number) interfaceC6473e.invoke(intrinsicMeasurable6, Integer.valueOf(i8))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size3) {
                obj = null;
                break;
            }
            obj = list.get(i12);
            if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj), TextFieldImplKt.LabelId)) {
                break;
            }
            i12++;
        }
        Object obj4 = (IntrinsicMeasurable) obj;
        int iIntValue4 = obj4 != null ? ((Number) interfaceC6473e.invoke(obj4, Integer.valueOf(iSubstractConstraintSafely))).intValue() : 0;
        int size4 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size4) {
                intrinsicMeasurable3 = null;
                break;
            }
            intrinsicMeasurable3 = list.get(i13);
            if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), TextFieldImplKt.PrefixId)) {
                break;
            }
            i13++;
        }
        IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable3;
        if (intrinsicMeasurable7 != null) {
            iIntValue3 = ((Number) interfaceC6473e.invoke(intrinsicMeasurable7, Integer.valueOf(iSubstractConstraintSafely))).intValue();
            iSubstractConstraintSafely = TextFieldKt.substractConstraintSafely(iSubstractConstraintSafely, intrinsicMeasurable7.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size5) {
                intrinsicMeasurable4 = null;
                break;
            }
            intrinsicMeasurable4 = list.get(i14);
            if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.SuffixId)) {
                break;
            }
            i14++;
        }
        IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable4;
        if (intrinsicMeasurable8 != null) {
            int iIntValue5 = ((Number) interfaceC6473e.invoke(intrinsicMeasurable8, Integer.valueOf(iSubstractConstraintSafely))).intValue();
            iSubstractConstraintSafely = TextFieldKt.substractConstraintSafely(iSubstractConstraintSafely, intrinsicMeasurable8.maxIntrinsicWidth(Integer.MAX_VALUE));
            i9 = iIntValue5;
        } else {
            i9 = 0;
        }
        int size6 = list.size();
        for (int i15 = 0; i15 < size6; i15++) {
            Object obj5 = list.get(i15);
            if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj5), TextFieldImplKt.TextFieldId)) {
                int iIntValue6 = ((Number) interfaceC6473e.invoke(obj5, Integer.valueOf(iSubstractConstraintSafely))).intValue();
                int size7 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size7) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i16);
                    if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                    i16++;
                }
                Object obj6 = (IntrinsicMeasurable) obj2;
                int iIntValue7 = obj6 != null ? ((Number) interfaceC6473e.invoke(obj6, Integer.valueOf(iSubstractConstraintSafely))).intValue() : 0;
                int size8 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size8) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i17);
                    if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj3), TextFieldImplKt.SupportingId)) {
                        break;
                    }
                    i17++;
                }
                Object obj7 = (IntrinsicMeasurable) obj3;
                return TextFieldKt.m9102calculateHeightmKXJcVc(iIntValue6, iIntValue4, iIntValue, iIntValue2, iIntValue3, i9, iIntValue7, obj7 != null ? ((Number) interfaceC6473e.invoke(obj7, Integer.valueOf(i8))).intValue() : 0, this.animationProgress, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicWidth(List<? extends IntrinsicMeasurable> measurables, int height, InterfaceC6473e intrinsicMeasurer) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        IntrinsicMeasurable intrinsicMeasurable5;
        IntrinsicMeasurable intrinsicMeasurable6;
        int size = measurables.size();
        for (int i = 0; i < size; i++) {
            IntrinsicMeasurable intrinsicMeasurable7 = measurables.get(i);
            if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable7), TextFieldImplKt.TextFieldId)) {
                int iIntValue = ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable7, Integer.valueOf(height))).intValue();
                int size2 = measurables.size();
                int i8 = 0;
                while (true) {
                    intrinsicMeasurable = null;
                    if (i8 >= size2) {
                        intrinsicMeasurable2 = null;
                        break;
                    }
                    intrinsicMeasurable2 = measurables.get(i8);
                    if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), TextFieldImplKt.LabelId)) {
                        break;
                    }
                    i8++;
                }
                IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable2;
                int iIntValue2 = intrinsicMeasurable8 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable8, Integer.valueOf(height))).intValue() : 0;
                int size3 = measurables.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size3) {
                        intrinsicMeasurable3 = null;
                        break;
                    }
                    intrinsicMeasurable3 = measurables.get(i9);
                    if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), TextFieldImplKt.TrailingId)) {
                        break;
                    }
                    i9++;
                }
                IntrinsicMeasurable intrinsicMeasurable9 = intrinsicMeasurable3;
                int iIntValue3 = intrinsicMeasurable9 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable9, Integer.valueOf(height))).intValue() : 0;
                int size4 = measurables.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size4) {
                        intrinsicMeasurable4 = null;
                        break;
                    }
                    intrinsicMeasurable4 = measurables.get(i10);
                    if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.PrefixId)) {
                        break;
                    }
                    i10++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable4;
                int iIntValue4 = intrinsicMeasurable10 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable10, Integer.valueOf(height))).intValue() : 0;
                int size5 = measurables.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size5) {
                        intrinsicMeasurable5 = null;
                        break;
                    }
                    intrinsicMeasurable5 = measurables.get(i11);
                    if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable5), TextFieldImplKt.SuffixId)) {
                        break;
                    }
                    i11++;
                }
                IntrinsicMeasurable intrinsicMeasurable11 = intrinsicMeasurable5;
                int iIntValue5 = intrinsicMeasurable11 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable11, Integer.valueOf(height))).intValue() : 0;
                int size6 = measurables.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size6) {
                        intrinsicMeasurable6 = null;
                        break;
                    }
                    intrinsicMeasurable6 = measurables.get(i12);
                    if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable6), TextFieldImplKt.LeadingId)) {
                        break;
                    }
                    i12++;
                }
                IntrinsicMeasurable intrinsicMeasurable12 = intrinsicMeasurable6;
                int iIntValue6 = intrinsicMeasurable12 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable12, Integer.valueOf(height))).intValue() : 0;
                int size7 = measurables.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size7) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable13 = measurables.get(i13);
                    if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable13), TextFieldImplKt.PlaceholderId)) {
                        intrinsicMeasurable = intrinsicMeasurable13;
                        break;
                    }
                    i13++;
                }
                IntrinsicMeasurable intrinsicMeasurable14 = intrinsicMeasurable;
                return TextFieldKt.m9103calculateWidthyeHjK3Y(iIntValue6, iIntValue3, iIntValue4, iIntValue5, iIntValue, iIntValue2, intrinsicMeasurable14 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable14, Integer.valueOf(height))).intValue() : 0, TextFieldImplKt.getZeroConstraints());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new InterfaceC6473e() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.maxIntrinsicHeight.1
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
        return intrinsicWidth(list, i, new InterfaceC6473e() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.maxIntrinsicWidth.1
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
        long j8;
        Placeable placeableMo12033measureBRTryo0;
        Measurable measurable3;
        Measurable measurable4;
        final Placeable placeable;
        int i;
        Placeable placeable2;
        long j9;
        Placeable placeableMo12033measureBRTryo02;
        Placeable placeable3;
        Measurable measurable5;
        Placeable placeable4;
        Measurable measurable6;
        Placeable placeable5;
        Measurable measurable7;
        final TextFieldMeasurePolicy textFieldMeasurePolicy = this;
        final MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        final int iMo6897roundToPx0680j_4 = measureScope2.mo6897roundToPx0680j_4(textFieldMeasurePolicy.paddingValues.getTop());
        int iMo6897roundToPx0680j_42 = measureScope2.mo6897roundToPx0680j_4(textFieldMeasurePolicy.paddingValues.getBottom());
        long jM13248copyZbe2FdA$default = Constraints.m13248copyZbe2FdA$default(j7, 0, 0, 0, 0, 10, null);
        int size = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                measurable = null;
                break;
            }
            measurable = list2.get(i8);
            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable), TextFieldImplKt.LeadingId)) {
                break;
            }
            i8++;
        }
        Measurable measurable8 = measurable;
        Placeable placeableMo12033measureBRTryo03 = measurable8 != null ? measurable8.mo12033measureBRTryo0(jM13248copyZbe2FdA$default) : null;
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo12033measureBRTryo03);
        int iMax = Math.max(0, TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo03));
        int size2 = list2.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list2.get(i9);
            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable2), TextFieldImplKt.TrailingId)) {
                break;
            }
            i9++;
        }
        Measurable measurable9 = measurable2;
        if (measurable9 != null) {
            j8 = jM13248copyZbe2FdA$default;
            placeableMo12033measureBRTryo0 = measurable9.mo12033measureBRTryo0(ConstraintsKt.m13278offsetNN6EwU$default(j8, -iWidthOrZero, 0, 2, null));
        } else {
            j8 = jM13248copyZbe2FdA$default;
            placeableMo12033measureBRTryo0 = null;
        }
        int iWidthOrZero2 = TextFieldImplKt.widthOrZero(placeableMo12033measureBRTryo0) + iWidthOrZero;
        int iMax2 = Math.max(iMax, TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo0));
        int size3 = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                measurable3 = null;
                break;
            }
            measurable3 = list2.get(i10);
            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable3), TextFieldImplKt.PrefixId)) {
                break;
            }
            i10++;
        }
        Measurable measurable10 = measurable3;
        final Placeable placeableMo12033measureBRTryo04 = measurable10 != null ? measurable10.mo12033measureBRTryo0(ConstraintsKt.m13278offsetNN6EwU$default(j8, -iWidthOrZero2, 0, 2, null)) : null;
        int iWidthOrZero3 = TextFieldImplKt.widthOrZero(placeableMo12033measureBRTryo04) + iWidthOrZero2;
        int iMax3 = Math.max(iMax2, TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo04));
        int size4 = list2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size4) {
                measurable4 = null;
                break;
            }
            measurable4 = list2.get(i11);
            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable4), TextFieldImplKt.SuffixId)) {
                break;
            }
            i11++;
        }
        Measurable measurable11 = measurable4;
        if (measurable11 != null) {
            placeable = placeableMo12033measureBRTryo0;
            long jM13278offsetNN6EwU$default = ConstraintsKt.m13278offsetNN6EwU$default(j8, -iWidthOrZero3, 0, 2, null);
            i = iWidthOrZero3;
            placeable2 = placeableMo12033measureBRTryo03;
            j9 = j8;
            placeableMo12033measureBRTryo02 = measurable11.mo12033measureBRTryo0(jM13278offsetNN6EwU$default);
        } else {
            placeable = placeableMo12033measureBRTryo0;
            i = iWidthOrZero3;
            placeable2 = placeableMo12033measureBRTryo03;
            j9 = j8;
            placeableMo12033measureBRTryo02 = null;
        }
        int iWidthOrZero4 = TextFieldImplKt.widthOrZero(placeableMo12033measureBRTryo02) + i;
        int iMax4 = Math.max(iMax3, TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo02));
        int i12 = -iWidthOrZero4;
        long jM13277offsetNN6EwU = ConstraintsKt.m13277offsetNN6EwU(j9, i12, -iMo6897roundToPx0680j_42);
        int size5 = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size5) {
                placeable3 = placeableMo12033measureBRTryo02;
                measurable5 = null;
                break;
            }
            measurable5 = list2.get(i13);
            int i14 = i13;
            placeable3 = placeableMo12033measureBRTryo02;
            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable5), TextFieldImplKt.LabelId)) {
                break;
            }
            i13 = i14 + 1;
            placeableMo12033measureBRTryo02 = placeable3;
        }
        Measurable measurable12 = measurable5;
        Placeable placeableMo12033measureBRTryo05 = measurable12 != null ? measurable12.mo12033measureBRTryo0(jM13277offsetNN6EwU) : null;
        int size6 = list2.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size6) {
                placeable4 = placeableMo12033measureBRTryo05;
                measurable6 = null;
                break;
            }
            measurable6 = list2.get(i15);
            placeable4 = placeableMo12033measureBRTryo05;
            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable6), TextFieldImplKt.SupportingId)) {
                break;
            }
            i15++;
            placeableMo12033measureBRTryo05 = placeable4;
        }
        Measurable measurable13 = measurable6;
        int iMinIntrinsicHeight = measurable13 != null ? measurable13.minIntrinsicHeight(Constraints.m13260getMinWidthimpl(j7)) : 0;
        int iHeightOrZero = TextFieldImplKt.heightOrZero(placeable4) + iMo6897roundToPx0680j_4;
        long j10 = j9;
        long jM13277offsetNN6EwU2 = ConstraintsKt.m13277offsetNN6EwU(Constraints.m13248copyZbe2FdA$default(j7, 0, 0, 0, 0, 11, null), i12, ((-iHeightOrZero) - iMo6897roundToPx0680j_42) - iMinIntrinsicHeight);
        int size7 = list2.size();
        int i16 = 0;
        while (i16 < size7) {
            Measurable measurable14 = list2.get(i16);
            int i17 = size7;
            int i18 = iHeightOrZero;
            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable14), TextFieldImplKt.TextFieldId)) {
                Placeable placeableMo12033measureBRTryo06 = measurable14.mo12033measureBRTryo0(jM13277offsetNN6EwU2);
                long jM13248copyZbe2FdA$default2 = Constraints.m13248copyZbe2FdA$default(jM13277offsetNN6EwU2, 0, 0, 0, 0, 14, null);
                int size8 = list2.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size8) {
                        placeable5 = placeableMo12033measureBRTryo06;
                        measurable7 = null;
                        break;
                    }
                    measurable7 = list2.get(i19);
                    placeable5 = placeableMo12033measureBRTryo06;
                    int i20 = size8;
                    if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable7), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                    i19++;
                    size8 = i20;
                    placeableMo12033measureBRTryo06 = placeable5;
                }
                Measurable measurable15 = measurable7;
                final Placeable placeableMo12033measureBRTryo07 = measurable15 != null ? measurable15.mo12033measureBRTryo0(jM13248copyZbe2FdA$default2) : null;
                int iMax5 = Math.max(iMax4, Math.max(TextFieldImplKt.heightOrZero(placeable5), TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo07)) + i18 + iMo6897roundToPx0680j_42);
                int iM9103calculateWidthyeHjK3Y = TextFieldKt.m9103calculateWidthyeHjK3Y(TextFieldImplKt.widthOrZero(placeable2), TextFieldImplKt.widthOrZero(placeable), TextFieldImplKt.widthOrZero(placeableMo12033measureBRTryo04), TextFieldImplKt.widthOrZero(placeable3), placeable5.getWidth(), TextFieldImplKt.widthOrZero(placeable4), TextFieldImplKt.widthOrZero(placeableMo12033measureBRTryo07), j7);
                int i21 = iM9103calculateWidthyeHjK3Y;
                final Placeable placeableMo12033measureBRTryo08 = measurable13 != null ? measurable13.mo12033measureBRTryo0(Constraints.m13248copyZbe2FdA$default(ConstraintsKt.m13278offsetNN6EwU$default(j10, 0, -iMax5, 1, null), 0, iM9103calculateWidthyeHjK3Y, 0, 0, 9, null)) : null;
                int iHeightOrZero2 = TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo08);
                int iM9102calculateHeightmKXJcVc = TextFieldKt.m9102calculateHeightmKXJcVc(placeable5.getHeight(), TextFieldImplKt.heightOrZero(placeable4), TextFieldImplKt.heightOrZero(placeable2), TextFieldImplKt.heightOrZero(placeable), TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo04), TextFieldImplKt.heightOrZero(placeable3), TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo07), TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo08), textFieldMeasurePolicy.animationProgress, j7, measureScope2.getDensity(), textFieldMeasurePolicy.paddingValues);
                int i22 = iM9102calculateHeightmKXJcVc - iHeightOrZero2;
                int size9 = list2.size();
                int i23 = 0;
                while (i23 < size9) {
                    Measurable measurable16 = list2.get(i23);
                    final int i24 = iM9102calculateHeightmKXJcVc;
                    if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable16), TextFieldImplKt.ContainerId)) {
                        final Placeable placeableMo12033measureBRTryo09 = measurable16.mo12033measureBRTryo0(ConstraintsKt.Constraints(i21 != Integer.MAX_VALUE ? i21 : 0, i21, i22 != Integer.MAX_VALUE ? i22 : 0, i22));
                        final int i25 = i21;
                        final Placeable placeable6 = placeable2;
                        final Placeable placeable7 = placeable3;
                        final Placeable placeable8 = placeable4;
                        final Placeable placeable9 = placeable5;
                        return MeasureScope.layout$default(measureScope, i25, i24, null, new InterfaceC6471c() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$measure$1
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
                                Placeable placeable10 = placeable8;
                                if (placeable10 == null) {
                                    TextFieldKt.placeWithoutLabel(placementScope, i25, i24, placeable9, placeableMo12033measureBRTryo07, placeable6, placeable, placeableMo12033measureBRTryo04, placeable7, placeableMo12033measureBRTryo09, placeableMo12033measureBRTryo08, textFieldMeasurePolicy.singleLine, measureScope2.getDensity(), textFieldMeasurePolicy.paddingValues);
                                    return;
                                }
                                int i26 = i25;
                                int i27 = i24;
                                Placeable placeable11 = placeable9;
                                Placeable placeable12 = placeableMo12033measureBRTryo07;
                                Placeable placeable13 = placeable6;
                                Placeable placeable14 = placeable;
                                Placeable placeable15 = placeableMo12033measureBRTryo04;
                                Placeable placeable16 = placeable7;
                                Placeable placeable17 = placeableMo12033measureBRTryo09;
                                Placeable placeable18 = placeableMo12033measureBRTryo08;
                                boolean z8 = textFieldMeasurePolicy.singleLine;
                                int i28 = iMo6897roundToPx0680j_4;
                                TextFieldKt.placeWithLabel(placementScope, i26, i27, placeable11, placeable10, placeable12, placeable13, placeable14, placeable15, placeable16, placeable17, placeable18, z8, i28, placeable8.getHeight() + i28, textFieldMeasurePolicy.animationProgress, measureScope2.getDensity());
                            }
                        }, 4, null);
                    }
                    i23++;
                    i21 = i21;
                    iM9102calculateHeightmKXJcVc = i24;
                    textFieldMeasurePolicy = this;
                    measureScope2 = measureScope;
                    list2 = list;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i16++;
            textFieldMeasurePolicy = this;
            measureScope2 = measureScope;
            size7 = i17;
            iHeightOrZero = i18;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new InterfaceC6473e() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.minIntrinsicHeight.1
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
        return intrinsicWidth(list, i, new InterfaceC6473e() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.minIntrinsicWidth.1
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
