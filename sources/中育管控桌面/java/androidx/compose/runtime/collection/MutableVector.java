package androidx.compose.runtime.collection;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003tuvB\u001f\b\u0001\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0002\u0010\u001aJ\u001b\u0010\u0017\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0002\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\bJ\u0019\u0010\u001e\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010 J\u001c\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u001c\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000!J\u001c\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\"J\u0014\u0010\u001e\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000!J\u0017\u0010\u001e\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0086\bJ(\u0010#\u001a\u00020\u00182\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J\u0006\u0010'\u001a\u00020\u001bJ\u0016\u0010(\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u001aJ\u0014\u0010)\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010)\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000!J\u0014\u0010)\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\"J\u0014\u0010*\u001a\u00020\u00182\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0011\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u0007H\u0086\bJ\u000b\u0010.\u001a\u00028\u0000¢\u0006\u0002\u0010/J-\u0010.\u001a\u00028\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100J\u0010\u00101\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0002\u0010/J/\u00101\u001a\u0004\u0018\u00018\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100JP\u00102\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H32'\u00105\u001a#\u0012\u0013\u0012\u0011H3¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(9\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H306H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010:Je\u0010;\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H32<\u00105\u001a8\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u0011H3¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(9\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H30<H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010=JP\u0010>\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H32'\u00105\u001a#\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u0011H3¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(9\u0012\u0004\u0012\u0002H306H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010:Je\u0010?\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H32<\u00105\u001a8\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u0011H3¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(9\u0012\u0004\u0012\u0002H30<H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010=J(\u0010@\u001a\u00020\u001b2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J.\u0010B\u001a\u00020\u001b2\u0018\u0010A\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b06H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J(\u0010C\u001a\u00020\u001b2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J.\u0010D\u001a\u00020\u001b2\u0018\u0010A\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b06H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0016\u0010E\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u0007H\u0086\n¢\u0006\u0002\u0010FJ\u0015\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0001¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0002\u0010JJ(\u0010K\u001a\u00020\u00072\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J(\u0010L\u001a\u00020\u00072\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\t\u0010M\u001a\u00020\u0018H\u0086\bJ\t\u0010N\u001a\u00020\u0018H\u0086\bJ\u000b\u0010O\u001a\u00028\u0000¢\u0006\u0002\u0010/J-\u0010O\u001a\u00028\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100J\u0013\u0010P\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0002\u0010JJ\u0010\u0010Q\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0002\u0010/J/\u0010Q\u001a\u0004\u0018\u00018\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100J;\u0010R\u001a\b\u0012\u0004\u0012\u0002H30\u0005\"\u0006\b\u0001\u00103\u0018\u00012\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H30%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010TJP\u0010U\u001a\b\u0012\u0004\u0012\u0002H30\u0005\"\u0006\b\u0001\u00103\u0018\u00012'\u0010S\u001a#\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H306H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010VJM\u0010W\u001a\b\u0012\u0004\u0012\u0002H30\u0000\"\u0006\b\u0001\u00103\u0018\u00012)\u0010S\u001a%\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u0001H306H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J8\u0010X\u001a\b\u0012\u0004\u0012\u0002H30\u0000\"\u0006\b\u0001\u00103\u0018\u00012\u0014\u0010S\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u0001H30%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0016\u0010Y\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00028\u0000H\u0086\n¢\u0006\u0002\u0010ZJ\u0016\u0010[\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00028\u0000H\u0086\n¢\u0006\u0002\u0010ZJ\u0013\u0010\\\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0002\u0010\u001aJ\u0014\u0010]\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010]\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000!J\u0014\u0010]\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\"J\u0013\u0010^\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u0007¢\u0006\u0002\u0010FJ\u001d\u0010_\u001a\u00020\u001b2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180%H\u0086\bJ\u0016\u0010`\u001a\u00020\u001b2\u0006\u0010a\u001a\u00020\u00072\u0006\u0010b\u001a\u00020\u0007J\u0010\u0010c\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u0007H\u0001J\u0014\u0010d\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000!J(\u0010e\u001a\u00020\u00182\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u001e\u0010f\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010gJ\u0010\u0010h\u001a\u00020\u001b2\u0006\u0010i\u001a\u00020\u0007H\u0001J\u001e\u0010j\u001a\u00020\u001b2\u0016\u0010k\u001a\u0012\u0012\u0004\u0012\u00028\u00000lj\b\u0012\u0004\u0012\u00028\u0000`mJ(\u0010n\u001a\u00020\u00072\u0012\u0010o\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\t\u0010p\u001a\u00020qH\u0081\bJ\u0010\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020sH\u0001R\"\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00058\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010\u000b\u0012\u0004\b\t\u0010\nR\u0012\u0010\f\u001a\u00020\r8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006w"}, m7880d2 = {"Landroidx/compose/runtime/collection/MutableVector;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "content", "", "size", "", "([Ljava/lang/Object;I)V", "getContent$annotations", "()V", "[Ljava/lang/Object;", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "lastIndex", "getLastIndex", "()I", "list", "", "<set-?>", "getSize", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "([Ljava/lang/Object;)Z", "", "", "any", "predicate", "Lkotlin/Function1;", "asMutableList", "clear", "contains", "containsAll", "contentEquals", "other", "ensureCapacity", "capacity", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "acc", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldIndexed", "Lkotlin/Function3;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "forEach", "block", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "(I)Ljava/lang/Object;", "getContent", "()[Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastIndexOf", "lastOrNull", "map", "transform", "(Lkotlin/jvm/functions/Function1;)[Ljava/lang/Object;", "mapIndexed", "(Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "mapIndexedNotNull", "mapNotNull", "minusAssign", "(Ljava/lang/Object;)V", "plusAssign", "remove", "removeAll", "removeAt", "removeIf", "removeRange", "start", "end", "resizeStorage", "retainAll", "reversedAny", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "setSize", "newSize", "sortWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "sumBy", "selector", "throwNoSuchElementException", "", "message", "", "MutableVectorList", "SubList", "VectorListIterator", "runtime_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 2 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1110:1\n289#1,4:1111\n289#1,4:1115\n289#1,4:1121\n289#1,4:1127\n289#1,4:1135\n289#1,4:1141\n44#1:1151\n472#1:1152\n48#1:1155\n472#1:1156\n44#1:1157\n472#1:1158\n516#1:1161\n332#1:1162\n472#1:1163\n516#1:1164\n472#1:1165\n516#1:1166\n44#1:1167\n472#1:1168\n516#1:1169\n44#1:1170\n472#1:1171\n472#1:1172\n472#1:1173\n44#1:1174\n472#1:1175\n44#1:1178\n44#1:1183\n44#1:1184\n472#1:1185\n27#2,2:1119\n27#2,2:1125\n27#2,2:1131\n27#2,2:1133\n27#2,2:1139\n27#2,2:1145\n27#2,2:1159\n27#2,2:1179\n27#2,2:1181\n1864#3,3:1147\n1855#3,2:1153\n1855#3,2:1176\n1#4:1150\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n55#1:1111,4\n66#1:1115,4\n87#1:1121,4\n111#1:1127,4\n156#1:1135,4\n169#1:1141,4\n234#1:1151\n235#1:1152\n265#1:1155\n266#1:1156\n279#1:1157\n280#1:1158\n309#1:1161\n310#1:1162\n312#1:1163\n340#1:1164\n340#1:1165\n526#1:1166\n529#1:1167\n529#1:1168\n563#1:1169\n563#1:1170\n563#1:1171\n588#1:1172\n598#1:1173\n678#1:1174\n679#1:1175\n700#1:1178\n725#1:1183\n759#1:1184\n760#1:1185\n69#1:1119,2\n90#1:1125,2\n114#1:1131,2\n121#1:1133,2\n157#1:1139,2\n172#1:1145,2\n300#1:1159,2\n701#1:1179,2\n717#1:1181,2\n179#1:1147,3\n256#1:1153,2\n692#1:1176,2\n*E\n"})
/* loaded from: classes2.dex */
public final class MutableVector<T> implements RandomAccess {
    public static final int $stable = 8;

    @JvmField
    public T[] content;
    private List<T> list;
    private int size;

    @Metadata(m7879d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\rJ\u001d\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0016\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0016\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\rJ\u0016\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0016\u0010\u0017\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u000bH\u0016J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001dH\u0096\u0002J\u0015\u0010\u001e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010 H\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\rJ\u0016\u0010\"\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0015\u0010#\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0018J\u0016\u0010$\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u001e\u0010%\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010&J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m7880d2 = {"Landroidx/compose/runtime/collection/MutableVector$MutableVectorList;", ExifInterface.GPS_DIRECTION_TRUE, "", "vector", "Landroidx/compose/runtime/collection/MutableVector;", "(Landroidx/compose/runtime/collection/MutableVector;)V", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "runtime_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
    @SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1110:1\n472#2:1111\n516#2:1112\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n*L\n850#1:1111\n855#1:1112\n*E\n"})
    public static final class MutableVectorList<T> implements List<T>, KMutableList {
        private final MutableVector<T> vector;

        public MutableVectorList(MutableVector<T> mutableVector) {
            this.vector = mutableVector;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            return this.vector.add(element);
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends T> elements) {
            return this.vector.addAll(index, elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.vector.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            return this.vector.contains(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            return this.vector.containsAll(elements);
        }

        @Override // java.util.List
        public T get(int index) {
            MutableVectorKt.checkIndex(this, index);
            return this.vector.content[index];
        }

        public int getSize() {
            return this.vector.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            return this.vector.indexOf(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.vector.getSize() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            return this.vector.lastIndexOf(element);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i6) {
            return removeAt(i6);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            return this.vector.removeAll(elements);
        }

        public T removeAt(int index) {
            MutableVectorKt.checkIndex(this, index);
            return this.vector.removeAt(index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            return this.vector.retainAll(elements);
        }

        @Override // java.util.List
        public T set(int index, T element) {
            MutableVectorKt.checkIndex(this, index);
            return this.vector.set(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            MutableVectorKt.checkSubIndex(this, fromIndex, toIndex);
            return new SubList(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.vector.add(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            return this.vector.addAll(elements);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int index) {
            return new VectorListIterator(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            return this.vector.remove(element);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.toArray(this, tArr);
        }
    }

    @Metadata(m7879d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0016\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0016\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u0017\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0016\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0002\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\fH\u0016J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eH\u0096\u0002J\u0015\u0010\u001f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001bJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010!H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010!2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000eJ\u0016\u0010#\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0015\u0010$\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0019J\u0016\u0010%\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u001e\u0010&\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010'J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005H\u0016R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m7880d2 = {"Landroidx/compose/runtime/collection/MutableVector$SubList;", ExifInterface.GPS_DIRECTION_TRUE, "", "list", "start", "", "end", "(Ljava/util/List;II)V", "size", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "runtime_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
    @SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1110:1\n1855#2,2:1111\n1855#2,2:1113\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n*L\n922#1:1111,2\n1006#1:1113,2\n*E\n"})
    public static final class SubList<T> implements List<T>, KMutableList {
        private int end;
        private final List<T> list;
        private final int start;

        public SubList(List<T> list, int i6, int i7) {
            this.list = list;
            this.start = i6;
            this.end = i7;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            List<T> list = this.list;
            int i6 = this.end;
            this.end = i6 + 1;
            list.add(i6, element);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends T> elements) {
            this.list.addAll(index + this.start, elements);
            int size = elements.size();
            this.end += size;
            return size > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i6 = this.end - 1;
            int i7 = this.start;
            if (i7 <= i6) {
                while (true) {
                    this.list.remove(i6);
                    if (i6 == i7) {
                        break;
                    } else {
                        i6--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            int i6 = this.end;
            for (int i7 = this.start; i7 < i6; i7++) {
                if (Intrinsics.areEqual(this.list.get(i7), element)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int index) {
            MutableVectorKt.checkIndex(this, index);
            return this.list.get(index + this.start);
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            int i6 = this.end;
            for (int i7 = this.start; i7 < i6; i7++) {
                if (Intrinsics.areEqual(this.list.get(i7), element)) {
                    return i7 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            int i6 = this.end - 1;
            int i7 = this.start;
            if (i7 > i6) {
                return -1;
            }
            while (!Intrinsics.areEqual(this.list.get(i6), element)) {
                if (i6 == i7) {
                    return -1;
                }
                i6--;
            }
            return i6 - this.start;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i6) {
            return removeAt(i6);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            int i6 = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i6 != this.end;
        }

        public T removeAt(int index) {
            MutableVectorKt.checkIndex(this, index);
            this.end--;
            return this.list.remove(index + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            int i6 = this.end;
            int i7 = i6 - 1;
            int i8 = this.start;
            if (i8 <= i7) {
                while (true) {
                    if (!elements.contains(this.list.get(i7))) {
                        this.list.remove(i7);
                        this.end--;
                    }
                    if (i7 == i8) {
                        break;
                    }
                    i7--;
                }
            }
            return i6 != this.end;
        }

        @Override // java.util.List
        public T set(int index, T element) {
            MutableVectorKt.checkIndex(this, index);
            return this.list.set(index + this.start, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            MutableVectorKt.checkSubIndex(this, fromIndex, toIndex);
            return new SubList(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.list.add(index + this.start, element);
            this.end++;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int index) {
            return new VectorListIterator(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            int i6 = this.end;
            for (int i7 = this.start; i7 < i6; i7++) {
                if (Intrinsics.areEqual(this.list.get(i7), element)) {
                    this.list.remove(i7);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.toArray(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            this.list.addAll(this.end, elements);
            int size = elements.size();
            this.end += size;
            return size > 0;
        }
    }

    @Metadata(m7879d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000bJ\t\u0010\f\u001a\u00020\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u000f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\r\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m7880d2 = {"Landroidx/compose/runtime/collection/MutableVector$VectorListIterator;", ExifInterface.GPS_DIRECTION_TRUE, "", "list", "", "index", "", "(Ljava/util/List;I)V", "add", "", "element", "(Ljava/lang/Object;)V", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "previous", "previousIndex", "remove", "set", "runtime_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
    public static final class VectorListIterator<T> implements ListIterator<T>, KMutableListIterator {
        private int index;
        private final List<T> list;

        public VectorListIterator(List<T> list, int i6) {
            this.list = list;
            this.index = i6;
        }

        @Override // java.util.ListIterator
        public void add(T element) {
            this.list.add(this.index, element);
            this.index++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.list.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i6 = this.index;
            this.index = i6 + 1;
            return list.get(i6);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i6 = this.index - 1;
            this.index = i6;
            return this.list.get(i6);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i6 = this.index - 1;
            this.index = i6;
            this.list.remove(i6);
        }

        @Override // java.util.ListIterator
        public void set(T element) {
            this.list.set(this.index, element);
        }
    }

    @PublishedApi
    public MutableVector(T[] tArr, int i6) {
        this.content = tArr;
        this.size = i6;
    }

    @PublishedApi
    public static /* synthetic */ void getContent$annotations() {
    }

    public final boolean add(T element) {
        int i6 = this.size + 1;
        if (this.content.length < i6) {
            resizeStorage(i6);
        }
        T[] tArr = this.content;
        int i7 = this.size;
        tArr[i7] = element;
        this.size = i7 + 1;
        return true;
    }

    public final boolean addAll(int index, List<? extends T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        int size = elements.size();
        int i6 = this.size + size;
        if (this.content.length < i6) {
            resizeStorage(i6);
        }
        T[] tArr = this.content;
        int i7 = this.size;
        if (index != i7) {
            System.arraycopy(tArr, index, tArr, index + size, i7 - index);
        }
        int size2 = elements.size();
        for (int i8 = 0; i8 < size2; i8++) {
            tArr[index + i8] = elements.get(i8);
        }
        this.size += size;
        return true;
    }

    public final boolean any(Function1<? super T, Boolean> predicate) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i6 = 0; i6 < size; i6++) {
            if (predicate.invoke(tArr[i6]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final List<T> asMutableList() {
        List<T> list = this.list;
        if (list != null) {
            return list;
        }
        MutableVectorList mutableVectorList = new MutableVectorList(this);
        this.list = mutableVectorList;
        return mutableVectorList;
    }

    public final void clear() {
        T[] tArr = this.content;
        int i6 = this.size;
        for (int i7 = 0; i7 < i6; i7++) {
            tArr[i7] = null;
        }
        this.size = 0;
    }

    public final boolean contains(T element) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i6 = 0; !Intrinsics.areEqual(this.content[i6], element); i6++) {
                if (i6 != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean containsAll(List<? extends T> elements) {
        int size = elements.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (!contains(elements.get(i6))) {
                return false;
            }
        }
        return true;
    }

    public final boolean contentEquals(MutableVector<T> other) {
        if (other.size != this.size) {
            return false;
        }
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i6 = 0; Intrinsics.areEqual(other.content[i6], this.content[i6]); i6++) {
                if (i6 != size) {
                }
            }
            return false;
        }
        return true;
    }

    public final void ensureCapacity(int capacity) {
        if (this.content.length < capacity) {
            resizeStorage(capacity);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    public final T first(Function1<? super T, Boolean> predicate) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i6 = 0; i6 < size; i6++) {
            ?? r32 = (Object) tArr[i6];
            if (predicate.invoke(r32).booleanValue()) {
                return r32;
            }
        }
        throwNoSuchElementException("MutableVector contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    public final T firstOrNull(Function1<? super T, Boolean> predicate) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i6 = 0; i6 < size; i6++) {
            ?? r32 = (Object) tArr[i6];
            if (predicate.invoke(r32).booleanValue()) {
                return r32;
            }
        }
        return null;
    }

    public final <R> R fold(R initial, Function2<? super R, ? super T, ? extends R> operation) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i6 = 0; i6 < size; i6++) {
            initial = operation.invoke(initial, tArr[i6]);
        }
        return initial;
    }

    public final <R> R foldIndexed(R initial, Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i6 = 0; i6 < size; i6++) {
            initial = operation.invoke(Integer.valueOf(i6), initial, tArr[i6]);
        }
        return initial;
    }

    public final <R> R foldRight(R initial, Function2<? super T, ? super R, ? extends R> operation) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return initial;
        }
        while (size >= 0) {
            initial = operation.invoke(tArr[size], initial);
            size--;
        }
        return initial;
    }

    public final <R> R foldRightIndexed(R initial, Function3<? super Integer, ? super T, ? super R, ? extends R> operation) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return initial;
        }
        while (size >= 0) {
            initial = operation.invoke(Integer.valueOf(size), tArr[size], initial);
            size--;
        }
        return initial;
    }

    public final void forEach(Function1<? super T, Unit> block) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i6 = 0; i6 < size; i6++) {
            block.invoke(tArr[i6]);
        }
    }

    public final void forEachIndexed(Function2<? super Integer, ? super T, Unit> block) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i6 = 0; i6 < size; i6++) {
            block.invoke(Integer.valueOf(i6), tArr[i6]);
        }
    }

    public final void forEachReversed(Function1<? super T, Unit> block) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return;
        }
        while (size >= 0) {
            block.invoke(tArr[size]);
            size--;
        }
    }

    public final void forEachReversedIndexed(Function2<? super Integer, ? super T, Unit> block) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return;
        }
        while (size >= 0) {
            block.invoke(Integer.valueOf(size), tArr[size]);
            size--;
        }
    }

    public final T get(int index) {
        return this.content[index];
    }

    @PublishedApi
    public final T[] getContent() {
        return this.content;
    }

    public final IntRange getIndices() {
        return RangesKt.until(0, getSize());
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.size;
    }

    public final int indexOf(T element) {
        T[] tArr = this.content;
        int i6 = this.size;
        for (int i7 = 0; i7 < i6; i7++) {
            if (Intrinsics.areEqual(element, tArr[i7])) {
                return i7;
            }
        }
        return -1;
    }

    public final int indexOfFirst(Function1<? super T, Boolean> predicate) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i6 = 0; i6 < size; i6++) {
            if (predicate.invoke(tArr[i6]).booleanValue()) {
                return i6;
            }
        }
        return -1;
    }

    public final int indexOfLast(Function1<? super T, Boolean> predicate) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return -1;
        }
        while (size >= 0) {
            if (predicate.invoke(tArr[size]).booleanValue()) {
                return size;
            }
            size--;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final boolean isNotEmpty() {
        return getSize() != 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public final T last(Function1<? super T, Boolean> predicate) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            ?? r22 = (Object) tArr[size];
            if (predicate.invoke(r22).booleanValue()) {
                return r22;
            }
        }
        throwNoSuchElementException("MutableVector contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    public final int lastIndexOf(T element) {
        T[] tArr = this.content;
        for (int i6 = this.size - 1; i6 >= 0; i6--) {
            if (Intrinsics.areEqual(element, tArr[i6])) {
                return i6;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public final T lastOrNull(Function1<? super T, Boolean> predicate) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            ?? r22 = (Object) tArr[size];
            if (predicate.invoke(r22).booleanValue()) {
                return r22;
            }
        }
        return null;
    }

    public final /* synthetic */ <R> R[] map(Function1<? super T, ? extends R> transform) {
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i6 = 0; i6 < size; i6++) {
            rArr[i6] = transform.invoke(this.content[i6]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> R[] mapIndexed(Function2<? super Integer, ? super T, ? extends R> transform) {
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i6 = 0; i6 < size; i6++) {
            rArr[i6] = transform.invoke(Integer.valueOf(i6), this.content[i6]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> MutableVector<R> mapIndexedNotNull(Function2<? super Integer, ? super T, ? extends R> transform) {
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[size];
        T[] tArr = this.content;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            R rInvoke = transform.invoke(Integer.valueOf(i7), tArr[i7]);
            if (rInvoke != null) {
                objArr[i6] = rInvoke;
                i6++;
            }
        }
        return new MutableVector<>(objArr, i6);
    }

    public final /* synthetic */ <R> MutableVector<R> mapNotNull(Function1<? super T, ? extends R> transform) {
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[size];
        T[] tArr = this.content;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            R rInvoke = transform.invoke(tArr[i7]);
            if (rInvoke != null) {
                objArr[i6] = rInvoke;
                i6++;
            }
        }
        return new MutableVector<>(objArr, i6);
    }

    public final void minusAssign(T element) {
        remove(element);
    }

    public final void plusAssign(T element) {
        add(element);
    }

    public final boolean remove(T element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(List<? extends T> elements) {
        int i6 = this.size;
        int size = elements.size();
        for (int i7 = 0; i7 < size; i7++) {
            remove(elements.get(i7));
        }
        return i6 != this.size;
    }

    public final T removeAt(int index) {
        T[] tArr = this.content;
        T t6 = tArr[index];
        if (index != getSize() - 1) {
            int i6 = index + 1;
            System.arraycopy(tArr, i6, tArr, index, this.size - i6);
        }
        int i7 = this.size - 1;
        this.size = i7;
        tArr[i7] = null;
        return t6;
    }

    public final void removeIf(Function1<? super T, Boolean> predicate) {
        int size = getSize();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            if (predicate.invoke(this.content[i7]).booleanValue()) {
                i6++;
            } else if (i6 > 0) {
                T[] tArr = this.content;
                tArr[i7 - i6] = tArr[i7];
            }
        }
        int i8 = size - i6;
        ArraysKt.fill(this.content, (Object) null, i8, size);
        setSize(i8);
    }

    public final void removeRange(int start, int end) {
        if (end > start) {
            int i6 = this.size;
            if (end < i6) {
                T[] tArr = this.content;
                System.arraycopy(tArr, end, tArr, start, i6 - end);
            }
            int i7 = this.size - (end - start);
            int size = getSize() - 1;
            if (i7 <= size) {
                int i8 = i7;
                while (true) {
                    this.content[i8] = null;
                    if (i8 == size) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.size = i7;
        }
    }

    @PublishedApi
    public final void resizeStorage(int capacity) {
        T[] tArr = this.content;
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[Math.max(capacity, length * 2)];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        this.content = tArr2;
    }

    public final boolean retainAll(Collection<? extends T> elements) {
        int i6 = this.size;
        for (int size = getSize() - 1; -1 < size; size--) {
            if (!elements.contains(this.content[size])) {
                removeAt(size);
            }
        }
        return i6 != this.size;
    }

    public final boolean reversedAny(Function1<? super T, Boolean> predicate) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            if (predicate.invoke(tArr[size]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final T set(int index, T element) {
        T[] tArr = this.content;
        T t6 = tArr[index];
        tArr[index] = element;
        return t6;
    }

    @PublishedApi
    public final void setSize(int newSize) {
        this.size = newSize;
    }

    public final void sortWith(Comparator<T> comparator) {
        ArraysKt.sortWith(this.content, comparator, 0, this.size);
    }

    public final int sumBy(Function1<? super T, Integer> selector) {
        T[] tArr = this.content;
        int iIntValue = 0;
        for (int i6 = 0; i6 < getSize(); i6++) {
            iIntValue += selector.invoke(tArr[i6]).intValue();
        }
        return iIntValue;
    }

    @PublishedApi
    public final Void throwNoSuchElementException() {
        throwNoSuchElementException("MutableVector is empty.");
        throw new KotlinNothingValueException();
    }

    @PublishedApi
    public final Void throwNoSuchElementException(String message) {
        throw new NoSuchElementException(message);
    }

    public final boolean containsAll(Collection<? extends T> elements) {
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final T firstOrNull() {
        if (getSize() == 0) {
            return null;
        }
        return this.content[0];
    }

    public final T lastOrNull() {
        if (getSize() == 0) {
            return null;
        }
        return this.content[getSize() - 1];
    }

    public final boolean removeAll(MutableVector<T> elements) {
        int i6 = this.size;
        int size = elements.getSize() - 1;
        if (size >= 0) {
            int i7 = 0;
            while (true) {
                remove(elements.content[i7]);
                if (i7 == size) {
                    break;
                }
                i7++;
            }
        }
        return i6 != this.size;
    }

    public final void add(int index, T element) {
        int i6 = this.size + 1;
        if (this.content.length < i6) {
            resizeStorage(i6);
        }
        T[] tArr = this.content;
        int i7 = this.size;
        if (index != i7) {
            System.arraycopy(tArr, index, tArr, index + 1, i7 - index);
        }
        tArr[index] = element;
        this.size++;
    }

    public final boolean containsAll(MutableVector<T> elements) {
        IntRange intRangeUntil = RangesKt.until(0, elements.getSize());
        int first = intRangeUntil.getFirst();
        int last = intRangeUntil.getLast();
        if (first > last) {
            return true;
        }
        while (contains(elements.content[first])) {
            if (first == last) {
                return true;
            }
            first++;
        }
        return false;
    }

    public final T first() {
        if (getSize() != 0) {
            return this.content[0];
        }
        throwNoSuchElementException("MutableVector is empty.");
        throw new KotlinNothingValueException();
    }

    public final T last() {
        if (getSize() != 0) {
            return this.content[getSize() - 1];
        }
        throwNoSuchElementException("MutableVector is empty.");
        throw new KotlinNothingValueException();
    }

    public final boolean removeAll(Collection<? extends T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        int i6 = this.size;
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i6 != this.size;
    }

    public final boolean addAll(int index, MutableVector<T> elements) {
        int i6 = elements.size;
        if (i6 == 0) {
            return false;
        }
        int i7 = this.size + i6;
        if (this.content.length < i7) {
            resizeStorage(i7);
        }
        T[] tArr = this.content;
        int i8 = this.size;
        if (index != i8) {
            System.arraycopy(tArr, index, tArr, index + i6, i8 - index);
        }
        System.arraycopy(elements.content, 0, tArr, index, i6);
        this.size += i6;
        return true;
    }

    public final boolean addAll(List<? extends T> elements) {
        return addAll(getSize(), (List) elements);
    }

    public final boolean addAll(MutableVector<T> elements) {
        return addAll(getSize(), elements);
    }

    public final boolean addAll(T[] elements) {
        int length = elements.length;
        if (length == 0) {
            return false;
        }
        int i6 = this.size + length;
        if (this.content.length < i6) {
            resizeStorage(i6);
        }
        System.arraycopy(elements, 0, this.content, this.size, length);
        this.size += length;
        return true;
    }

    public final boolean addAll(int index, Collection<? extends T> elements) {
        int i6 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        int size = elements.size();
        int i7 = this.size + size;
        if (this.content.length < i7) {
            resizeStorage(i7);
        }
        T[] tArr = this.content;
        int i8 = this.size;
        if (index != i8) {
            System.arraycopy(tArr, index, tArr, index + size, i8 - index);
        }
        for (T t6 : elements) {
            int i9 = i6 + 1;
            if (i6 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            tArr[i6 + index] = t6;
            i6 = i9;
        }
        this.size += size;
        return true;
    }

    public final boolean addAll(Collection<? extends T> elements) {
        return addAll(this.size, elements);
    }
}
