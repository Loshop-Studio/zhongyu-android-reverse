package androidx.compose.runtime.snapshots;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000Z\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001aE\u0010\f\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\nH\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\f\u0010\r\u001aK\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a?\u0010\u0014\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a?\u0010\u0016\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0016\u0010\u0015\u001aW\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0019\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0017*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001ai\u0010#\u001a\u00020\"\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u001c2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0002H\u0000¢\u0006\u0004\b#\u0010$\u001a\u007f\u0010)\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010'*\u00060%j\u0002`&*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010(\u001a\u00028\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u001c2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0002H\u0002¢\u0006\u0004\b)\u0010*\u001a;\u0010,\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u00060%j\u0002`&2\u0006\u0010+\u001a\u00028\u00002\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0002H\u0002¢\u0006\u0004\b,\u0010-\u001aM\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b.\u0010\u0011\u001aZ\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012'\u0010\u0013\u001a#\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\nH\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b2\u00103¨\u00064"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/Function1;", "Ld6/s;", "action", "fastForEach", "(Ljava/util/List;Lr6/c;)V", "", "fastToSet", "(Ljava/util/List;)Ljava/util/Set;", "Lkotlin/Function2;", "", "fastForEachIndexed", "(Ljava/util/List;Lr6/e;)V", "R", "transform", "fastMap", "(Ljava/util/List;Lr6/c;)Ljava/util/List;", "", "predicate", "fastAny", "(Ljava/util/List;Lr6/c;)Z", "fastAll", "K", "keySelector", "", "fastGroupBy", "(Ljava/util/List;Lr6/c;)Ljava/util/Map;", "", "separator", RequestParameters.PREFIX, "postfix", "limit", "truncated", "", "fastJoinToString", "(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lr6/c;)Ljava/lang/String;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "buffer", "fastJoinTo", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lr6/c;)Ljava/lang/Appendable;", "element", "appendElement", "(Ljava/lang/Appendable;Ljava/lang/Object;Lr6/c;)V", "fastMapNotNull", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "fastFilterIndexed", "(Ljava/util/List;Lr6/e;)Ljava/util/List;", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,227:1\n33#1,6:229\n33#1,6:235\n33#1,6:241\n33#1,6:247\n33#1,4:253\n38#1:264\n33#1,6:265\n63#1,6:271\n1#2:228\n372#3,7:257\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n50#1:229,6\n83#1:235,6\n91#1:241,6\n106#1:247,6\n115#1:253,4\n115#1:264\n205#1:265,6\n224#1:271,6\n117#1:257,7\n*E\n"})
/* loaded from: classes.dex */
public final class ListUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void appendElement(Appendable appendable, T t8, InterfaceC6471c interfaceC6471c) throws IOException {
        if (interfaceC6471c != null) {
            appendable.append((CharSequence) interfaceC6471c.invoke(t8));
            return;
        }
        if (t8 == 0 ? true : t8 instanceof CharSequence) {
            appendable.append((CharSequence) t8);
        } else if (t8 instanceof Character) {
            appendable.append(((Character) t8).charValue());
        } else {
            appendable.append(String.valueOf(t8));
        }
    }

    public static final <T> boolean fastAll(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!((Boolean) interfaceC6471c.invoke(list.get(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean fastAny(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((Boolean) interfaceC6471c.invoke(list.get(i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final <T> List<T> fastFilterIndexed(@NotNull List<? extends T> list, @NotNull InterfaceC6473e interfaceC6473e) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t8 = list.get(i);
            if (((Boolean) interfaceC6473e.invoke(Integer.valueOf(i), t8)).booleanValue()) {
                arrayList.add(t8);
            }
        }
        return arrayList;
    }

    public static final <T> void fastForEach(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            interfaceC6471c.invoke(list.get(i));
        }
    }

    public static final <T> void fastForEachIndexed(@NotNull List<? extends T> list, @NotNull InterfaceC6473e interfaceC6473e) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            interfaceC6473e.invoke(Integer.valueOf(i), list.get(i));
        }
    }

    @NotNull
    public static final <T, K> Map<K, List<T>> fastGroupBy(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c) {
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t8 = list.get(i);
            Object objInvoke = interfaceC6471c.invoke(t8);
            Object arrayList = map.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(objInvoke, arrayList);
            }
            ((ArrayList) arrayList).add(t8);
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, A extends Appendable> A fastJoinTo(List<? extends T> list, A a9, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6471c interfaceC6471c) throws IOException {
        a9.append(charSequence2);
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            T t8 = list.get(i9);
            i8++;
            if (i8 > 1) {
                a9.append(charSequence);
            }
            if (i >= 0 && i8 > i) {
                break;
            }
            appendElement(a9, t8, interfaceC6471c);
        }
        if (i >= 0 && i8 > i) {
            a9.append(charSequence4);
        }
        a9.append(charSequence3);
        return a9;
    }

    @NotNull
    public static final <T> String fastJoinToString(@NotNull List<? extends T> list, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable InterfaceC6471c interfaceC6471c) {
        return ((StringBuilder) fastJoinTo(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, interfaceC6471c)).toString();
    }

    public static /* synthetic */ String fastJoinToString$default(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6471c interfaceC6471c, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i8 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i8 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i8 & 8) != 0) {
            i = -1;
        }
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i8 & 32) != 0) {
            interfaceC6471c = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC6471c interfaceC6471c2 = interfaceC6471c;
        return fastJoinToString(list, charSequence, charSequence2, charSequence3, i, charSequence5, interfaceC6471c2);
    }

    @NotNull
    public static final <T, R> List<R> fastMap(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(interfaceC6471c.invoke(list.get(i)));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> fastMapNotNull(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object objInvoke = interfaceC6471c.invoke(list.get(i));
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> Set<T> fastToSet(@NotNull List<? extends T> list) {
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(list.get(i));
        }
        return hashSet;
    }
}
