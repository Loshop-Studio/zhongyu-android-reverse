package androidx.collection;

import androidx.autofill.HintConstants;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(m13412d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0014\u001a\u00020\u0015H\u0086\bJ:\u0010\u0014\u001a\u00020\u00152!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J$\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0003H\u0007J\u0011\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0003H\u0086\u0002J\u000e\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0000J\t\u0010!\u001a\u00020\u0003H\u0086\bJ:\u0010!\u001a\u00020\u00032!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0010\u0010\"\u001a\u00020\u00032\b\b\u0001\u0010#\u001a\u00020\u0003J9\u0010$\u001a\u00020\u00032\b\b\u0001\u0010#\u001a\u00020\u00032!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00030\u0017H\u0086\bø\u0001\u0000J\u0013\u0010&\u001a\u00020\u00152\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0006\u0010(\u001a\u00020\u0003J:\u0010(\u001a\u00020\u00032!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001Jb\u0010)\u001a\u0002H*\"\u0004\b\u0000\u0010*2\u0006\u0010+\u001a\u0002H*26\u0010,\u001a2\u0012\u0013\u0012\u0011H*¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002H*0-H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010/Jw\u00100\u001a\u0002H*\"\u0004\b\u0000\u0010*2\u0006\u0010+\u001a\u0002H*2K\u0010,\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(#\u0012\u0013\u0012\u0011H*¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002H*01H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u00102Jb\u00103\u001a\u0002H*\"\u0004\b\u0000\u0010*2\u0006\u0010+\u001a\u0002H*26\u0010,\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u0011H*¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(.\u0012\u0004\u0012\u0002H*0-H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010/Jw\u00104\u001a\u0002H*\"\u0004\b\u0000\u0010*2\u0006\u0010+\u001a\u0002H*2K\u0010,\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u0011H*¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(.\u0012\u0004\u0012\u0002H*01H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u00102J:\u00105\u001a\u0002062!\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002060\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u00108\u001a\u00020626\u00107\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002060-H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u00109\u001a\u0002062!\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002060\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u0010:\u001a\u00020626\u00107\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002060-H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0013\u0010;\u001a\u00020\u00032\b\b\u0001\u0010#\u001a\u00020\u0003H\u0086\u0002J\b\u0010<\u001a\u00020\u0003H\u0016J\u000e\u0010=\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003J:\u0010>\u001a\u00020\u00032!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010?\u001a\u00020\u00032!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\t\u0010@\u001a\u00020\u0015H\u0086\bJ\t\u0010A\u001a\u00020\u0015H\u0086\bJ:\u0010B\u001a\u00020C2\b\b\u0002\u0010D\u001a\u00020E2\b\b\u0002\u0010F\u001a\u00020E2\b\b\u0002\u0010G\u001a\u00020E2\b\b\u0002\u0010H\u001a\u00020\u00032\b\b\u0002\u0010I\u001a\u00020EH\u0007JT\u0010B\u001a\u00020C2\b\b\u0002\u0010D\u001a\u00020E2\b\b\u0002\u0010F\u001a\u00020E2\b\b\u0002\u0010G\u001a\u00020E2\b\b\u0002\u0010H\u001a\u00020\u00032\b\b\u0002\u0010I\u001a\u00020E2\u0014\b\u0004\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020E0\u0017H\u0087\bø\u0001\u0000J\u0006\u0010K\u001a\u00020\u0003J:\u0010K\u001a\u00020\u00032!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u000e\u0010L\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003J\t\u0010M\u001a\u00020\u0015H\u0086\bJ:\u0010N\u001a\u00020\u00152!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u0010O\u001a\u00020CH\u0016R\u0018\u0010\u0005\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0007R\u0012\u0010\u000b\u001a\u00020\f8Æ\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u00038Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u00038Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u0082\u0001\u0001P\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006Q"}, m13413d2 = {"Landroidx/collection/IntList;", "", "initialCapacity", "", "(I)V", "_size", "get_size$annotations", "()V", "content", "", "getContent$annotations", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "lastIndex", "getLastIndex", "()I", "size", "getSize", "any", "", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "element", "binarySearch", "fromIndex", "toIndex", "contains", "containsAll", "elements", "count", "elementAt", "index", "elementAtOrElse", "defaultValue", "equals", "other", "first", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "acc", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldIndexed", "Lkotlin/Function3;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "forEach", "", "block", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "hashCode", "indexOf", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", RequestParameters.PREFIX, "postfix", "limit", "truncated", "transform", "last", "lastIndexOf", "none", "reversedAny", "toString", "Landroidx/collection/MutableIntList;", "collection"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,968:1\n363#1:969\n366#1:970\n237#1,6:971\n265#1,6:977\n237#1,6:983\n74#1:989\n237#1,6:990\n363#1:996\n237#1,6:997\n237#1,6:1003\n251#1,6:1009\n265#1,6:1015\n279#1,6:1021\n251#1,6:1027\n251#1,6:1033\n279#1,6:1039\n363#1:1045\n70#1:1046\n265#1,6:1047\n279#1,6:1053\n65#1:1059\n251#1,6:1060\n251#1,6:1066\n237#1,6:1072\n74#1:1078\n484#1,10:1079\n251#1,4:1089\n494#1,9:1093\n256#1:1102\n503#1,2:1103\n484#1,10:1105\n251#1,4:1115\n494#1,9:1119\n256#1:1128\n503#1,2:1129\n484#1,10:1131\n251#1,4:1141\n494#1,9:1145\n256#1:1154\n503#1,2:1155\n484#1,10:1157\n251#1,4:1167\n494#1,9:1171\n256#1:1180\n503#1,2:1181\n484#1,10:1183\n251#1,4:1193\n494#1,9:1197\n256#1:1206\n503#1,2:1207\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/IntList\n*L\n78#1:969\n83#1:970\n89#1:971,6\n103#1:977,6\n113#1:983,6\n126#1:989\n143#1:990,6\n152#1:996\n166#1:997,6\n182#1:1003,6\n196#1:1009,6\n212#1:1015,6\n226#1:1021,6\n328#1:1027,6\n341#1:1033,6\n354#1:1039,6\n373#1:1045\n376#1:1046\n387#1:1047,6\n400#1:1053,6\n422#1:1059\n462#1:1060,6\n493#1:1066,6\n509#1:1072,6\n522#1:1078\n-1#1:1079,10\n-1#1:1089,4\n-1#1:1093,9\n-1#1:1102\n-1#1:1103,2\n-1#1:1105,10\n-1#1:1115,4\n-1#1:1119,9\n-1#1:1128\n-1#1:1129,2\n-1#1:1131,10\n-1#1:1141,4\n-1#1:1145,9\n-1#1:1154\n-1#1:1155,2\n-1#1:1157,10\n-1#1:1167,4\n-1#1:1171,9\n-1#1:1180\n-1#1:1181,2\n-1#1:1183,10\n-1#1:1193,4\n-1#1:1197,9\n-1#1:1206\n-1#1:1207,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class IntList {

    @JvmField
    public int _size;

    @JvmField
    public int[] content;

    public /* synthetic */ IntList(int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(i9);
    }

    public static /* synthetic */ int binarySearch$default(IntList intList, int i9, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = intList._size;
        }
        return intList.binarySearch(i9, i10, i11);
    }

    @PublishedApi
    public static /* synthetic */ void getContent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(IntList intList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i9, CharSequence charSequence4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i10 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i10 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i10 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i10 & 8) != 0) {
            i9 = -1;
        }
        if ((i10 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return intList.joinToString(charSequence, charSequence2, charSequence6, i9, charSequence5);
    }

    public final boolean any() {
        return this._size != 0;
    }

    @JvmOverloads
    public final int binarySearch(int i9) {
        return binarySearch$default(this, i9, 0, 0, 6, null);
    }

    public final boolean contains(int element) {
        int[] iArr = this.content;
        int i9 = this._size;
        for (int i10 = 0; i10 < i9; i10++) {
            if (iArr[i10] == element) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(IntList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        IntRange intRangeUntil = RangesKt.until(0, elements._size);
        int first = intRangeUntil.getFirst();
        int last = intRangeUntil.getLast();
        if (first > last) {
            return true;
        }
        while (contains(elements.get(first))) {
            if (first == last) {
                return true;
            }
            first++;
        }
        return false;
    }

    /* renamed from: count, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final int elementAt(@androidx.annotation.IntRange(from = 0) int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[index];
    }

    public final int elementAtOrElse(@androidx.annotation.IntRange(from = 0) int index, Function1<? super Integer, Integer> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (index < 0 || index >= this._size) ? defaultValue.invoke(Integer.valueOf(index)).intValue() : this.content[index];
    }

    public boolean equals(Object other) {
        if (other instanceof IntList) {
            IntList intList = (IntList) other;
            int i9 = intList._size;
            int i10 = this._size;
            if (i9 == i10) {
                int[] iArr = this.content;
                int[] iArr2 = intList.content;
                IntRange intRangeUntil = RangesKt.until(0, i10);
                int first = intRangeUntil.getFirst();
                int last = intRangeUntil.getLast();
                if (first > last) {
                    return true;
                }
                while (iArr[first] == iArr2[first]) {
                    if (first == last) {
                        return true;
                    }
                    first++;
                }
                return false;
            }
        }
        return false;
    }

    public final int first() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("IntList is empty.");
        }
        return this.content[0];
    }

    public final <R> R fold(R initial, Function2<? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int[] iArr = this.content;
        int i9 = this._size;
        for (int i10 = 0; i10 < i9; i10++) {
            initial = operation.invoke(initial, Integer.valueOf(iArr[i10]));
        }
        return initial;
    }

    public final <R> R foldIndexed(R initial, Function3<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int[] iArr = this.content;
        int i9 = this._size;
        for (int i10 = 0; i10 < i9; i10++) {
            R r9 = initial;
            initial = operation.invoke(Integer.valueOf(i10), r9, Integer.valueOf(iArr[i10]));
        }
        return initial;
    }

    public final <R> R foldRight(R initial, Function2<? super Integer, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int[] iArr = this.content;
        int i9 = this._size;
        while (true) {
            i9--;
            if (-1 >= i9) {
                return initial;
            }
            initial = operation.invoke(Integer.valueOf(iArr[i9]), initial);
        }
    }

    public final <R> R foldRightIndexed(R initial, Function3<? super Integer, ? super Integer, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int[] iArr = this.content;
        int i9 = this._size;
        while (true) {
            i9--;
            if (-1 >= i9) {
                return initial;
            }
            initial = operation.invoke(Integer.valueOf(i9), Integer.valueOf(iArr[i9]), initial);
        }
    }

    public final void forEach(Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.content;
        int i9 = this._size;
        for (int i10 = 0; i10 < i9; i10++) {
            block.invoke(Integer.valueOf(iArr[i10]));
        }
    }

    public final void forEachIndexed(Function2<? super Integer, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.content;
        int i9 = this._size;
        for (int i10 = 0; i10 < i9; i10++) {
            block.invoke(Integer.valueOf(i10), Integer.valueOf(iArr[i10]));
        }
    }

    public final void forEachReversed(Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.content;
        int i9 = this._size;
        while (true) {
            i9--;
            if (-1 >= i9) {
                return;
            } else {
                block.invoke(Integer.valueOf(iArr[i9]));
            }
        }
    }

    public final void forEachReversedIndexed(Function2<? super Integer, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.content;
        int i9 = this._size;
        while (true) {
            i9--;
            if (-1 >= i9) {
                return;
            } else {
                block.invoke(Integer.valueOf(i9), Integer.valueOf(iArr[i9]));
            }
        }
    }

    public final int get(@androidx.annotation.IntRange(from = 0) int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[index];
    }

    public final IntRange getIndices() {
        return RangesKt.until(0, this._size);
    }

    @androidx.annotation.IntRange(from = -1)
    public final int getLastIndex() {
        return this._size - 1;
    }

    @androidx.annotation.IntRange(from = 0)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        int[] iArr = this.content;
        int i9 = this._size;
        int iHashCode = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            iHashCode += Integer.hashCode(iArr[i10]) * 31;
        }
        return iHashCode;
    }

    public final int indexOf(int element) {
        int[] iArr = this.content;
        int i9 = this._size;
        for (int i10 = 0; i10 < i9; i10++) {
            if (element == iArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public final int indexOfFirst(Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.content;
        int i9 = this._size;
        for (int i10 = 0; i10 < i9; i10++) {
            if (predicate.invoke(Integer.valueOf(iArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public final int indexOfLast(Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.content;
        int i9 = this._size;
        do {
            i9--;
            if (-1 >= i9) {
                return -1;
            }
        } while (!predicate.invoke(Integer.valueOf(iArr[i9])).booleanValue());
        return i9;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @JvmOverloads
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final int last() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("IntList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final int lastIndexOf(int element) {
        int[] iArr = this.content;
        int i9 = this._size;
        do {
            i9--;
            if (-1 >= i9) {
                return -1;
            }
        } while (iArr[i9] != element);
        return i9;
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean reversedAny(Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.content;
        for (int i9 = this._size - 1; -1 < i9; i9--) {
            if (predicate.invoke(Integer.valueOf(iArr[i9])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private IntList(int i9) {
        this.content = i9 == 0 ? IntSetKt.getEmptyIntArray() : new int[i9];
    }

    public final boolean any(Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.content;
        int i9 = this._size;
        for (int i10 = 0; i10 < i9; i10++) {
            if (predicate.invoke(Integer.valueOf(iArr[i10])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @JvmOverloads
    public final int binarySearch(int i9, int i10) {
        return binarySearch$default(this, i9, i10, 0, 4, null);
    }

    public final int count(Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.content;
        int i9 = this._size;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            if (predicate.invoke(Integer.valueOf(iArr[i11])).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    @JvmOverloads
    public final int binarySearch(int element, int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex >= toIndex || toIndex > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i9 = toIndex - 1;
        while (fromIndex <= i9) {
            int i10 = (fromIndex + i9) >>> 1;
            int i11 = this.content[i10];
            if (i11 < element) {
                fromIndex = i10 + 1;
            } else {
                if (i11 <= element) {
                    return i10;
                }
                i9 = i10 - 1;
            }
        }
        return -(fromIndex + 1);
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final int first(Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.content;
        int i9 = this._size;
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = iArr[i10];
            if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                return i11;
            }
        }
        throw new NoSuchElementException("IntList contains no element matching the predicate.");
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(IntList intList, CharSequence separator, CharSequence prefix, CharSequence postfix, int i9, CharSequence truncated, Function1 transform, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                separator = ", ";
            }
            if ((i10 & 2) != 0) {
                prefix = "";
            }
            if ((i10 & 4) != 0) {
                postfix = "";
            }
            if ((i10 & 8) != 0) {
                i9 = -1;
            }
            if ((i10 & 16) != 0) {
                truncated = "...";
            }
            Intrinsics.checkNotNullParameter(separator, "separator");
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(postfix, "postfix");
            Intrinsics.checkNotNullParameter(truncated, "truncated");
            Intrinsics.checkNotNullParameter(transform, "transform");
            StringBuilder sb = new StringBuilder();
            sb.append(prefix);
            int[] iArr = intList.content;
            int i11 = intList._size;
            int i12 = 0;
            while (true) {
                if (i12 < i11) {
                    int i13 = iArr[i12];
                    if (i12 == i9) {
                        sb.append(truncated);
                        break;
                    }
                    if (i12 != 0) {
                        sb.append(separator);
                    }
                    sb.append((CharSequence) transform.invoke(Integer.valueOf(i13)));
                    i12++;
                } else {
                    sb.append(postfix);
                    break;
                }
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i9) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i9, null, 16, null);
    }

    public final int last(Function1<? super Integer, Boolean> predicate) {
        int i9;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.content;
        int i10 = this._size;
        do {
            i10--;
            if (-1 < i10) {
                i9 = iArr[i10];
            } else {
                throw new NoSuchElementException("IntList contains no element matching the predicate.");
            }
        } while (!predicate.invoke(Integer.valueOf(i9)).booleanValue());
        return i9;
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i9 = this._size;
        int i10 = 0;
        while (true) {
            if (i10 < i9) {
                int i11 = iArr[i10];
                if (i10 == limit) {
                    sb.append(truncated);
                    break;
                }
                if (i10 != 0) {
                    sb.append(separator);
                }
                sb.append(i11);
                i10++;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1<? super Integer, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i9 = this._size;
        int i10 = 0;
        while (true) {
            if (i10 < i9) {
                int i11 = iArr[i10];
                if (i10 == limit) {
                    sb.append(truncated);
                    break;
                }
                if (i10 != 0) {
                    sb.append(separator);
                }
                sb.append(transform.invoke(Integer.valueOf(i11)));
                i10++;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i9, Function1<? super Integer, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                int i12 = iArr[i11];
                if (i11 == i9) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i11 != 0) {
                    sb.append(separator);
                }
                sb.append(transform.invoke(Integer.valueOf(i12)));
                i11++;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, Function1<? super Integer, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i9 = this._size;
        int i10 = 0;
        while (true) {
            if (i10 < i9) {
                int i11 = iArr[i10];
                if (i10 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i10 != 0) {
                    sb.append(separator);
                }
                sb.append(transform.invoke(Integer.valueOf(i11)));
                i10++;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix, Function1<? super Integer, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i9 = this._size;
        int i10 = 0;
        while (true) {
            if (i10 < i9) {
                int i11 = iArr[i10];
                if (i10 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i10 != 0) {
                    sb.append(separator);
                }
                sb.append(transform.invoke(Integer.valueOf(i11)));
                i10++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, Function1<? super Integer, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int[] iArr = this.content;
        int i9 = this._size;
        int i10 = 0;
        while (true) {
            if (i10 < i9) {
                int i11 = iArr[i10];
                if (i10 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i10 != 0) {
                    sb.append(separator);
                }
                sb.append(transform.invoke(Integer.valueOf(i11)));
                i10++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @JvmOverloads
    public final String joinToString(Function1<? super Integer, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int[] iArr = this.content;
        int i9 = this._size;
        int i10 = 0;
        while (true) {
            if (i10 < i9) {
                int i11 = iArr[i10];
                if (i10 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i10 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append(transform.invoke(Integer.valueOf(i11)));
                i10++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
