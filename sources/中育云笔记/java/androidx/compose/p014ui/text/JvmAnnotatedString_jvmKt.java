package androidx.compose.p014ui.text;

import androidx.compose.p014ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p309qc.AbstractC10776g;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10981x0;

/* loaded from: classes2.dex */
public final class JvmAnnotatedString_jvmKt {
    private static final void collectRangeTransitions(List<? extends AnnotatedString.Range<?>> list, SortedSet<Integer> sortedSet) {
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                AnnotatedString.Range<?> range = list.get(i10);
                sortedSet.add(Integer.valueOf(range.getStart()));
                sortedSet.add(Integer.valueOf(range.getEnd()));
            }
        }
    }

    public static final AnnotatedString transform(final AnnotatedString annotatedString, final InterfaceC9545q interfaceC9545q) {
        ArrayList arrayList;
        TreeSet treeSetM24159e = AbstractC10981x0.m24159e(0, Integer.valueOf(annotatedString.getText().length()));
        collectRangeTransitions(annotatedString.getAnnotations$ui_text_release(), treeSetM24159e);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f23402c = "";
        final Map mapM20092l = AbstractC9925a.m20092l(AbstractC10776g.m22975a(0, 0));
        AbstractC10947g0.m23933e1(treeSetM24159e, 2, 0, false, new InterfaceC9540l() { // from class: androidx.compose.ui.text.JvmAnnotatedString_jvmKt.transform.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final Integer invoke(List<Integer> list) {
                int iIntValue = list.get(0).intValue();
                int iIntValue2 = list.get(1).intValue();
                ref$ObjectRef.f23402c = ((String) ref$ObjectRef.f23402c) + ((String) interfaceC9545q.invoke(annotatedString.getText(), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)));
                return mapM20092l.put(Integer.valueOf(iIntValue2), Integer.valueOf(((String) ref$ObjectRef.f23402c).length()));
            }
        }, 6, null);
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
        if (annotations$ui_text_release != null) {
            arrayList = new ArrayList(annotations$ui_text_release.size());
            int size = annotations$ui_text_release.size();
            for (int i10 = 0; i10 < size; i10++) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range = annotations$ui_text_release.get(i10);
                AnnotatedString.Annotation item = range.getItem();
                Object obj = mapM20092l.get(Integer.valueOf(range.getStart()));
                AbstractC9979u.m20291d(obj);
                int iIntValue = ((Number) obj).intValue();
                Object obj2 = mapM20092l.get(Integer.valueOf(range.getEnd()));
                AbstractC9979u.m20291d(obj2);
                arrayList.add(new AnnotatedString.Range(item, iIntValue, ((Number) obj2).intValue()));
            }
        } else {
            arrayList = null;
        }
        return new AnnotatedString(arrayList, (String) ref$ObjectRef.f23402c);
    }
}
