package androidx.compose.p011ui.text;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\f\u001a\u00020\u000b2\u0012\u0010\b\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m5110d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "Lkotlin/Function3;", "", "", "transform", "(Landroidx/compose/ui/text/AnnotatedString;Lr6/f;)Landroidx/compose/ui/text/AnnotatedString;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "ranges", "Ljava/util/SortedSet;", TypedValues.AttributesType.S_TARGET, "Ld6/s;", "collectRangeTransitions", "(Ljava/util/List;Ljava/util/SortedSet;)V", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nJvmAnnotatedString.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,63:1\n150#2,3:64\n34#2,6:67\n153#2:73\n269#2,3:74\n34#2,6:77\n272#2:83\n*S KotlinDebug\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n*L\n44#1:64,3\n44#1:67,6\n44#1:73\n56#1:74,3\n56#1:77,6\n56#1:83\n*E\n"})
/* loaded from: classes2.dex */
public final class JvmAnnotatedString_jvmKt {
    private static final void collectRangeTransitions(List<? extends AnnotatedString.Range<?>> list, SortedSet<Integer> sortedSet) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnnotatedString.Range<?> range = list.get(i);
                sortedSet.add(Integer.valueOf(range.getStart()));
                sortedSet.add(Integer.valueOf(range.getEnd()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final AnnotatedString transform(@NotNull final AnnotatedString annotatedString, @NotNull final InterfaceC6474f interfaceC6474f) {
        ArrayList arrayList;
        Integer[] numArr = {0, Integer.valueOf(annotatedString.getText().length())};
        TreeSet treeSet = new TreeSet();
        AbstractC5802q.m5200a0(numArr, treeSet);
        collectRangeTransitions(annotatedString.getAnnotations$ui_text_release(), treeSet);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = "";
        Pair[] pairArr = {new Pair(0, 0)};
        final LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5785e0.m5149C(1));
        AbstractC5785e0.m5154H(linkedHashMap, pairArr);
        AbstractC5805t.m5222I0(treeSet, new InterfaceC6471c() { // from class: androidx.compose.ui.text.JvmAnnotatedString_jvmKt.transform.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
            @Override // p152r6.InterfaceC6471c
            public final Integer invoke(List<Integer> list) {
                int iIntValue = list.get(0).intValue();
                int iIntValue2 = list.get(1).intValue();
                ref$ObjectRef.element = ref$ObjectRef.element + ((String) interfaceC6474f.invoke(annotatedString.getText(), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)));
                return linkedHashMap.put(Integer.valueOf(iIntValue2), Integer.valueOf(ref$ObjectRef.element.length()));
            }
        });
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
        if (annotations$ui_text_release != null) {
            arrayList = new ArrayList(annotations$ui_text_release.size());
            int size = annotations$ui_text_release.size();
            for (int i = 0; i < size; i++) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range = annotations$ui_text_release.get(i);
                AnnotatedString.Annotation item = range.getItem();
                Object obj = linkedHashMap.get(Integer.valueOf(range.getStart()));
                AbstractC5830k.m5327d(obj);
                int iIntValue = ((Number) obj).intValue();
                Object obj2 = linkedHashMap.get(Integer.valueOf(range.getEnd()));
                AbstractC5830k.m5327d(obj2);
                arrayList.add(new AnnotatedString.Range(item, iIntValue, ((Number) obj2).intValue()));
            }
        } else {
            arrayList = null;
        }
        return new AnnotatedString(arrayList, (String) ref$ObjectRef.element);
    }
}
