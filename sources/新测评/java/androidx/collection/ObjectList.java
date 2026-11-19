package androidx.collection;

import androidx.annotation.IntRange;
import androidx.autofill.HintConstants;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import io.reactivex.annotations.SchedulerSupport;
import java.util.Iterator;
import java.util.List;
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
import kotlin.ranges.RangesKt;

@Metadata(m13557d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0016\u001a\u00020\u0017J:\u0010\u0016\u001a\u00020\u00172!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH&J\u0016\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010 J\u0014\u0010!\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0019\u0010!\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0002\u0010#J\u0014\u0010!\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000$J\u0014\u0010!\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eJ\u0006\u0010%\u001a\u00020\u0004J:\u0010%\u001a\u00020\u00042!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0015\u0010&\u001a\u00028\u00002\b\b\u0001\u0010'\u001a\u00020\u0004¢\u0006\u0002\u0010(J>\u0010)\u001a\u00028\u00002\b\b\u0001\u0010'\u001a\u00020\u00042!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b('\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u00172\b\u0010-\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u000b\u0010.\u001a\u00028\u0000¢\u0006\u0002\u0010/J?\u0010.\u001a\u00028\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100J\u0010\u00101\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0002\u0010/JA\u00101\u001a\u0004\u0018\u00018\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100Jb\u00102\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H326\u00105\u001a2\u0012\u0013\u0012\u0011H3¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(7\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u0002H306H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u00108Jw\u00109\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H32K\u00105\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b('\u0012\u0013\u0012\u0011H3¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(7\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u0002H30:H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010;Jb\u0010<\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H326\u00105\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u0011H3¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(7\u0012\u0004\u0012\u0002H306H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u00108Jw\u0010=\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H32K\u00105\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b('\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u0011H3¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(7\u0012\u0004\u0012\u0002H30:H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010;J:\u0010>\u001a\u00020?2!\u0010@\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020?0\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u0010A\u001a\u00020?26\u0010@\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b('\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020?06H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010B\u001a\u00020?2!\u0010@\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020?0\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u0010C\u001a\u00020?26\u0010@\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b('\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020?06H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0018\u0010D\u001a\u00028\u00002\b\b\u0001\u0010'\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0002\u0010(J\b\u0010E\u001a\u00020\u0004H\u0016J\u0013\u0010F\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0002\u0010GJ:\u0010H\u001a\u00020\u00042!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010I\u001a\u00020\u00042!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010J\u001a\u00020\u0017J\u0006\u0010K\u001a\u00020\u0017JR\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020O2\b\b\u0002\u0010P\u001a\u00020O2\b\b\u0002\u0010Q\u001a\u00020O2\b\b\u0002\u0010R\u001a\u00020\u00042\b\b\u0002\u0010S\u001a\u00020O2\u0016\b\u0002\u0010T\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020O\u0018\u00010\u0019H\u0007J\u000b\u0010U\u001a\u00028\u0000¢\u0006\u0002\u0010/J?\u0010U\u001a\u00028\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100J\u0013\u0010V\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0002\u0010GJ\u0010\u0010W\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0002\u0010/JA\u0010W\u001a\u0004\u0018\u00018\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100J\u0006\u0010X\u001a\u00020\u0017J:\u0010Y\u001a\u00020\u00172!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0015\u0010Z\u001a\u00020?2\u0006\u0010'\u001a\u00020\u0004H\u0000¢\u0006\u0002\b[J\b\u0010\\\u001a\u00020MH\u0016R\u0018\u0010\u0006\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010\f\u0012\u0004\b\u000b\u0010\bR\u0012\u0010\r\u001a\u00020\u000e8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u00048Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\u0082\u0001\u0001]\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006^"}, m13558d2 = {"Landroidx/collection/ObjectList;", ExifInterface.LONGITUDE_EAST, "", "initialCapacity", "", "(I)V", "_size", "get_size$annotations", "()V", "content", "", "getContent$annotations", "[Ljava/lang/Object;", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "lastIndex", "getLastIndex", "()I", "size", "getSize", "any", "", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "element", "asList", "", "contains", "(Ljava/lang/Object;)Z", "containsAll", "elements", "([Ljava/lang/Object;)Z", "", "count", "elementAt", "index", "(I)Ljava/lang/Object;", "elementAtOrElse", "defaultValue", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "equals", "other", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "acc", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldIndexed", "Lkotlin/Function3;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "forEach", "", "block", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "hashCode", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", RequestParameters.PREFIX, "postfix", "limit", "truncated", "transform", "last", "lastIndexOf", "lastOrNull", SchedulerSupport.NONE, "reversedAny", "throwIndexOutOfBoundsExclusiveException", "throwIndexOutOfBoundsExclusiveException$collection", "toString", "Landroidx/collection/MutableObjectList;", "collection"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1548:1\n287#1,6:1549\n315#1,6:1555\n287#1,6:1563\n287#1,6:1569\n287#1,6:1575\n287#1,6:1581\n287#1,6:1587\n301#1,6:1593\n315#1,6:1599\n329#1,6:1605\n80#1:1611\n301#1,6:1612\n301#1,6:1618\n301#1,6:1624\n329#1,6:1630\n80#1:1636\n315#1,6:1637\n80#1:1643\n315#1,6:1644\n329#1,6:1650\n329#1,6:1656\n301#1,6:1662\n287#1,6:1668\n84#1:1674\n1855#2,2:1561\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n99#1:1549,6\n113#1:1555,6\n162#1:1563,6\n177#1:1569,6\n201#1:1575,6\n216#1:1581,6\n232#1:1587,6\n246#1:1593,6\n262#1:1599,6\n276#1:1605,6\n359#1:1611\n386#1:1612,6\n392#1:1618,6\n408#1:1624,6\n422#1:1630,6\n444#1:1636\n456#1:1637,6\n465#1:1643\n475#1:1644,6\n492#1:1650,6\n498#1:1656,6\n528#1:1662,6\n557#1:1668,6\n571#1:1674\n153#1:1561,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class ObjectList<E> {

    @JvmField
    public int _size;

    @JvmField
    public Object[] content;

    public /* synthetic */ ObjectList(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    @PublishedApi
    public static /* synthetic */ void getContent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(ObjectList objectList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function12 = function1;
        return objectList.joinToString(charSequence, charSequence2, charSequence3, i10, charSequence5, function12);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public abstract List<E> asList();

    public final boolean contains(E element) {
        return indexOf(element) >= 0;
    }

    public final boolean containsAll(E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (E e10 : elements) {
            if (!contains(e10)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: count, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final E elementAt(@IntRange(from = 0) int index) {
        if (index < 0 || index >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(index);
        }
        return (E) this.content[index];
    }

    public final E elementAtOrElse(@IntRange(from = 0) int index, Function1<? super Integer, ? extends E> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (index < 0 || index >= this._size) ? defaultValue.invoke(Integer.valueOf(index)) : (E) this.content[index];
    }

    public boolean equals(Object other) {
        if (other instanceof ObjectList) {
            ObjectList objectList = (ObjectList) other;
            int i10 = objectList._size;
            int i11 = this._size;
            if (i10 == i11) {
                Object[] objArr = this.content;
                Object[] objArr2 = objectList.content;
                kotlin.ranges.IntRange intRangeUntil = RangesKt.until(0, i11);
                int first = intRangeUntil.getFirst();
                int last = intRangeUntil.getLast();
                if (first > last) {
                    return true;
                }
                while (Intrinsics.areEqual(objArr[first], objArr2[first])) {
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

    public final E first() {
        if (isEmpty()) {
            RuntimeHelpersKt.throwNoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[0];
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final <R> R fold(R initial, Function2<? super R, ? super E, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            initial = operation.invoke(initial, objArr[i11]);
        }
        return initial;
    }

    public final <R> R foldIndexed(R initial, Function3<? super Integer, ? super R, ? super E, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            initial = operation.invoke(Integer.valueOf(i11), initial, objArr[i11]);
        }
        return initial;
    }

    public final <R> R foldRight(R initial, Function2<? super E, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object[] objArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return initial;
            }
            initial = operation.invoke(objArr[i10], initial);
        }
    }

    public final <R> R foldRightIndexed(R initial, Function3<? super Integer, ? super E, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object[] objArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return initial;
            }
            initial = operation.invoke(Integer.valueOf(i10), objArr[i10], initial);
        }
    }

    public final void forEach(Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(objArr[i11]);
        }
    }

    public final void forEachIndexed(Function2<? super Integer, ? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(i11), objArr[i11]);
        }
    }

    public final void forEachReversed(Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(objArr[i10]);
            }
        }
    }

    public final void forEachReversedIndexed(Function2<? super Integer, ? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Integer.valueOf(i10), objArr[i10]);
            }
        }
    }

    public final E get(@IntRange(from = 0) int index) {
        if (index < 0 || index >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(index);
        }
        return (E) this.content[index];
    }

    public final kotlin.ranges.IntRange getIndices() {
        return RangesKt.until(0, this._size);
    }

    @IntRange(from = -1)
    public final int getLastIndex() {
        return this._size - 1;
    }

    @IntRange(from = 0)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        Object[] objArr = this.content;
        int i10 = this._size;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final int indexOf(E element) {
        int i10 = 0;
        if (element == null) {
            Object[] objArr = this.content;
            int i11 = this._size;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Object[] objArr2 = this.content;
        int i12 = this._size;
        while (i10 < i12) {
            if (element.equals(objArr2[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final int indexOfFirst(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(objArr[i11]).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    public final int indexOfLast(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (!predicate.invoke(objArr[i10]).booleanValue());
        return i10;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @JvmOverloads
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final E last() {
        if (isEmpty()) {
            RuntimeHelpersKt.throwNoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[this._size - 1];
    }

    public final int lastIndexOf(E element) {
        if (element == null) {
            Object[] objArr = this.content;
            for (int i10 = this._size - 1; -1 < i10; i10--) {
                if (objArr[i10] == null) {
                    return i10;
                }
            }
        } else {
            Object[] objArr2 = this.content;
            for (int i11 = this._size - 1; -1 < i11; i11--) {
                if (element.equals(objArr2[i11])) {
                    return i11;
                }
            }
        }
        return -1;
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.content[this._size - 1];
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        for (int i10 = this._size - 1; -1 < i10; i10--) {
            if (predicate.invoke(objArr[i10]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void throwIndexOutOfBoundsExclusiveException$collection(int index) {
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(index);
        sb.append(" must be in 0..");
        sb.append(this._size - 1);
        RuntimeHelpersKt.throwIndexOutOfBoundsException(sb.toString());
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new Function1<E, CharSequence>(this) { // from class: androidx.collection.ObjectList.toString.1
            final /* synthetic */ ObjectList<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Object obj) {
                return invoke((C09461) obj);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(E e10) {
                return e10 == this.this$0 ? "(this)" : String.valueOf(e10);
            }
        }, 25, null);
    }

    private ObjectList(int i10) {
        this.content = i10 == 0 ? ObjectListKt.EmptyArray : new Object[i10];
    }

    public final boolean any(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(objArr[i11]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (predicate.invoke(objArr[i12]).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [E, java.lang.Object] */
    public final E firstOrNull(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            ?? r32 = (Object) objArr[i11];
            if (predicate.invoke(r32).booleanValue()) {
                return r32;
            }
        }
        return null;
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    public final boolean containsAll(List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!contains(elements.get(i10))) {
                return false;
            }
        }
        return true;
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [E, java.lang.Object] */
    public final E lastOrNull(Function1<? super E, Boolean> predicate) {
        ?? r22;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        do {
            i10--;
            if (-1 >= i10) {
                return null;
            }
            r22 = (Object) objArr[i10];
        } while (!predicate.invoke(r22).booleanValue());
        return r22;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [E, java.lang.Object] */
    public final E first(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            ?? r32 = (Object) objArr[i11];
            if (predicate.invoke(r32).booleanValue()) {
                return r32;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    public final boolean containsAll(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i10, null, null, 48, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [E, java.lang.Object] */
    public final E last(Function1<? super E, Boolean> predicate) {
        ?? r22;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        do {
            i10--;
            if (-1 < i10) {
                r22 = (Object) objArr[i10];
            } else {
                throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
            }
        } while (!predicate.invoke(r22).booleanValue());
        return r22;
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, i10, truncated, null, 32, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.content;
        int i10 = elements._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (!contains(objArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1<? super E, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                Object obj = objArr[i11];
                if (i11 == limit) {
                    sb.append(truncated);
                    break;
                }
                if (i11 != 0) {
                    sb.append(separator);
                }
                if (transform == null) {
                    sb.append(obj);
                } else {
                    sb.append(transform.invoke(obj));
                }
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
}
