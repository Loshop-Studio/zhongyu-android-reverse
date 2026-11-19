package androidx.compose.p006ui.text;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0003\u001a9\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00060\u0003j\u0002`\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\t\u001aG\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\f*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\f0\u0007H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a&\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001aA\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00130\u0007H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aA\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00130\u0007H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a$\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b\"\b\b\u0000\u0010\u0002*\u00020\u0016*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000bH\u0000\u001aM\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00180\u000b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u00190\u0007H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001ac\u0010\u001a\u001a\u0002H\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\u0006\u0010\u001b\u001a\u0002H\u00182'\u0010\u001c\u001a#\u0012\u0013\u0012\u0011H\u0018¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00180\u001dH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010!\u001a}\u0010\"\u001a\u0002H#\"\u0004\b\u0000\u0010\u0002\"\f\b\u0001\u0010#*\u00060\u0003j\u0002`\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\u0006\u0010$\u001a\u0002H#2\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020\u00102\b\b\u0002\u0010)\u001a\u00020\b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010*\u001ab\u0010+\u001a\u00020,\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020\u00102\b\b\u0002\u0010)\u001a\u00020\b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0000\u001aR\u0010-\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u0002H\u00180.*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00180\u0007H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010/\u001aA\u00100\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00130\u0007H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00061"}, m5175d2 = {"appendElement", "", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "element", "transform", "Lkotlin/Function1;", "", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "fastDistinctBy", "", "K", "selector", "fastDrop", "n", "", "fastFilter", "predicate", "", "fastFilterNot", "fastFilterNotNull", "", "fastFlatMap", "R", "", "fastFold", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "acc", "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "fastJoinTo", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "buffer", "separator", "prefix", "postfix", "limit", "truncated", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "fastJoinToString", "", "fastMinByOrNull", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "fastTakeWhile", "ui-text_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTempListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,289:1\n33#2,6:290\n33#2,6:296\n33#2,6:302\n33#2,6:308\n33#2,6:314\n33#2,6:320\n1#3:326\n*S KotlinDebug\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n*L\n37#1:290,6\n59#1:296,6\n110#1:302,6\n129#1:308,6\n148#1:314,6\n164#1:320,6\n*E\n"})
/* loaded from: classes.dex */
public final class TempListUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void appendElement(Appendable appendable, T t3, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        if (function1 != null) {
            appendable.append(function1.invoke(t3));
            return;
        }
        if (t3 == 0 ? true : t3 instanceof CharSequence) {
            appendable.append((CharSequence) t3);
        } else if (t3 instanceof Character) {
            appendable.append(((Character) t3).charValue());
        } else {
            appendable.append(String.valueOf(t3));
        }
    }

    public static final <T, K> List<T> fastDistinctBy(List<? extends T> list, Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            T t3 = list.get(i4);
            if (hashSet.add(selector.invoke(t3))) {
                arrayList.add(t3);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> fastDrop(List<? extends T> list, int i4) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        }
        if (i4 == 0) {
            return list;
        }
        int size = list.size() - i4;
        if (size <= 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (size == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(CollectionsKt___CollectionsKt.last((List) list));
        }
        ArrayList arrayList = new ArrayList(size);
        int size2 = list.size();
        while (i4 < size2) {
            arrayList.add(list.get(i4));
            i4++;
        }
        return arrayList;
    }

    public static final <T> List<T> fastFilter(List<? extends T> list, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            T t3 = list.get(i4);
            if (predicate.invoke(t3).booleanValue()) {
                arrayList.add(t3);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> fastFilterNot(List<? extends T> list, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            T t3 = list.get(i4);
            if (!predicate.invoke(t3).booleanValue()) {
                arrayList.add(t3);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> fastFilterNotNull(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            T t3 = list.get(i4);
            if (t3 != null) {
                arrayList.add(t3);
            }
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastFlatMap(List<? extends T> list, Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(list.get(i4)));
        }
        return arrayList;
    }

    public static final <T, R> R fastFold(List<? extends T> list, R r3, Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            r3 = operation.invoke(r3, list.get(i4));
        }
        return r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, A extends Appendable> A fastJoinTo(List<? extends T> list, A a4, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        a4.append(charSequence2);
        int size = list.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            T t3 = list.get(i6);
            i5++;
            if (i5 > 1) {
                a4.append(charSequence);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            appendElement(a4, t3, function1);
        }
        if (i4 >= 0 && i5 > i4) {
            a4.append(charSequence4);
        }
        a4.append(charSequence3);
        return a4;
    }

    public static final <T> String fastJoinToString(List<? extends T> list, CharSequence separator, CharSequence prefix, CharSequence postfix, int i4, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) fastJoinTo(list, new StringBuilder(), separator, prefix, postfix, i4, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return string;
    }

    public static /* synthetic */ String fastJoinToString$default(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, Function1 function1, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i5 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i5 & 4) == 0 ? charSequence3 : "";
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        int i6 = i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i5 & 32) != 0) {
            function1 = null;
        }
        return fastJoinToString(list, charSequence, charSequence5, charSequence6, i6, charSequence7, function1);
    }

    public static final <T, R extends Comparable<? super R>> T fastMinByOrNull(List<? extends T> list, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (list.isEmpty()) {
            return null;
        }
        T t3 = list.get(0);
        R rInvoke = selector.invoke(t3);
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        int i4 = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t4 = list.get(i4);
                R rInvoke2 = selector.invoke(t4);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    t3 = t4;
                    rInvoke = rInvoke2;
                }
                if (i4 == lastIndex) {
                    break;
                }
                i4++;
            }
        }
        return (T) t3;
    }

    public static final <T> List<T> fastTakeWhile(List<? extends T> list, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            T t3 = list.get(i4);
            if (!predicate.invoke(t3).booleanValue()) {
                break;
            }
            arrayList.add(t3);
        }
        return arrayList;
    }
}
