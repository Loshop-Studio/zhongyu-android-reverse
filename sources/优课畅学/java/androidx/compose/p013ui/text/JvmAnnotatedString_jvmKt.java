package androidx.compose.p013ui.text;

import androidx.compose.p013ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p123h7.AbstractC8726f;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8810v0;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

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

    public static final AnnotatedString transform(final AnnotatedString annotatedString, final InterfaceC10575q interfaceC10575q) {
        ArrayList arrayList;
        TreeSet treeSetM14785e = AbstractC8810v0.m14785e(0, Integer.valueOf(annotatedString.getText().length()));
        collectRangeTransitions(annotatedString.getAnnotations$ui_text_release(), treeSetM14785e);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f17473a = "";
        final Map mapM15947l = AbstractC9080a.m15947l(AbstractC8726f.m14230a(0, 0));
        AbstractC8778f0.m14553b1(treeSetM14785e, 2, 0, false, new InterfaceC10570l() { // from class: androidx.compose.ui.text.JvmAnnotatedString_jvmKt.transform.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final Integer invoke(List<Integer> list) {
                int iIntValue = list.get(0).intValue();
                int iIntValue2 = list.get(1).intValue();
                ref$ObjectRef.f17473a = ((String) ref$ObjectRef.f17473a) + ((String) interfaceC10575q.invoke(annotatedString.getText(), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)));
                return mapM15947l.put(Integer.valueOf(iIntValue2), Integer.valueOf(((String) ref$ObjectRef.f17473a).length()));
            }
        }, 6, null);
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
        if (annotations$ui_text_release != null) {
            arrayList = new ArrayList(annotations$ui_text_release.size());
            int size = annotations$ui_text_release.size();
            for (int i10 = 0; i10 < size; i10++) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range = annotations$ui_text_release.get(i10);
                AnnotatedString.Annotation item = range.getItem();
                Object obj = mapM15947l.get(Integer.valueOf(range.getStart()));
                AbstractC9133u.m16130d(obj);
                int iIntValue = ((Number) obj).intValue();
                Object obj2 = mapM15947l.get(Integer.valueOf(range.getEnd()));
                AbstractC9133u.m16130d(obj2);
                arrayList.add(new AnnotatedString.Range(item, iIntValue, ((Number) obj2).intValue()));
            }
        } else {
            arrayList = null;
        }
        return new AnnotatedString(arrayList, (String) ref$ObjectRef.f17473a);
    }
}
