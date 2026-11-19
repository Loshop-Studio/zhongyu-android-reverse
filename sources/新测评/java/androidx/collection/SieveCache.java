package androidx.collection;

import androidx.annotation.IntRange;
import androidx.autofill.HintConstants;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import io.reactivex.annotations.SchedulerSupport;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@Metadata(m13557d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u001d\n\u0002\u0010\u0015\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002Bà\u0001\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u00128\b\u0002\u0010\u0007\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00050\b\u0012%\b\u0002\u0010\r\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000e\u0012d\b\u0002\u0010\u000f\u001a^\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010¢\u0006\u0002\u0010\u0016J\r\u00103\u001a\u00020\u0015H\u0000¢\u0006\u0002\b4J&\u00105\u001a\u00020\u00132\u0018\u00106\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00130\bH\u0086\bø\u0001\u0000J\u0006\u00107\u001a\u00020\u0013J&\u00107\u001a\u00020\u00132\u0018\u00106\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00130\bH\u0086\bø\u0001\u0000J\u0016\u00108\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0002\u00109J\u0013\u0010;\u001a\u00020\u00132\u0006\u0010\f\u001a\u00028\u0001¢\u0006\u0002\u00109J\u0006\u0010\u001e\u001a\u00020\u0005J&\u0010\u001e\u001a\u00020\u00052\u0018\u00106\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00130\bH\u0086\bø\u0001\u0000J\r\u0010<\u001a\u00020\u0015H\u0000¢\u0006\u0002\b=J\u0013\u0010>\u001a\u00020\u00132\b\u0010?\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0006\u0010@\u001a\u00020\u0015J\b\u0010A\u001a\u00020\u0005H\u0002J\u0010\u0010B\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005H\u0002J\u0015\u0010D\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010EJ\u0015\u0010F\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010EJ\u0010\u0010G\u001a\u00020\u00152\u0006\u0010H\u001a\u00020IH\u0002J\u0010\u0010G\u001a\u00020\u00152\u0006\u0010H\u001a\u00020+H\u0002JD\u0010J\u001a\u00020\u001526\u0010K\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00150\bH\u0086\bø\u0001\u0000J/\u0010L\u001a\u00020\u00152!\u0010K\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(M\u0012\u0004\u0012\u00020\u00150\u000eH\u0081\bø\u0001\u0000J/\u0010N\u001a\u00020\u00152!\u0010K\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00150\u000eH\u0086\bø\u0001\u0000J/\u0010O\u001a\u00020\u00152!\u0010K\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00150\u000eH\u0086\bø\u0001\u0000J\u0018\u0010P\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010QJ\b\u0010R\u001a\u00020\u0005H\u0016J\b\u0010S\u001a\u00020\u0015H\u0002J\u0010\u0010T\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J\u0010\u0010U\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0006\u0010V\u001a\u00020\u0013J\u0006\u0010W\u001a\u00020\u0013J\u0011\u0010X\u001a\u00020\u00152\u0006\u0010M\u001a\u00020\u0005H\u0082\bJ\u0016\u0010Y\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\n¢\u0006\u0002\u0010ZJ\u0017\u0010Y\u001a\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000[H\u0086\nJ\u0017\u0010Y\u001a\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\\H\u0086\nJ\u001e\u0010Y\u001a\u00020\u00152\u000e\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000&H\u0086\n¢\u0006\u0002\u0010]J\u0017\u0010Y\u001a\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000^H\u0086\nJ\u0017\u0010Y\u001a\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000_H\u0086\nJ\u0011\u0010`\u001a\u00020\u00152\u0006\u0010M\u001a\u00020\u0005H\u0082\bJ\u0006\u0010a\u001a\u00020\u0013J\u001d\u0010b\u001a\u00020\u00152\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010dH\u0086\nJ\u001d\u0010b\u001a\u00020\u00152\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0086\nJ*\u0010b\u001a\u00020\u00152\u001a\u0010e\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f0&H\u0086\n¢\u0006\u0002\u0010gJ\u001d\u0010b\u001a\u00020\u00152\u0012\u0010h\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010fH\u0086\nJ#\u0010b\u001a\u00020\u00152\u0018\u0010e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f0^H\u0086\nJ\u001d\u0010b\u001a\u00020\u00152\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010iH\u0086\nJ#\u0010b\u001a\u00020\u00152\u0018\u0010e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f0_H\u0086\nJ\u001d\u0010j\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001¢\u0006\u0002\u0010kJ\u001a\u0010l\u001a\u00020\u00152\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010dJ\u001a\u0010l\u001a\u00020\u00152\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000J'\u0010l\u001a\u00020\u00152\u001a\u0010e\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f0&¢\u0006\u0002\u0010gJ \u0010l\u001a\u00020\u00152\u0018\u0010e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f0^J\u001a\u0010l\u001a\u00020\u00152\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010iJ \u0010l\u001a\u00020\u00152\u0018\u0010e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f0_J\u0015\u0010m\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0002\u0010QJ\u001b\u0010m\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001¢\u0006\u0002\u0010nJ \u0010o\u001a\u00020\u00152\u0018\u00106\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00130\bJ\u0011\u0010p\u001a\u00020\u00152\u0006\u0010M\u001a\u00020\u0005H\u0082\bJ\u0017\u0010q\u001a\u0004\u0018\u00018\u00012\u0006\u0010M\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010rJ\u0010\u0010s\u001a\u00020\u00152\b\b\u0001\u0010\u0004\u001a\u00020\u0005J\u0015\u0010t\u001a\u00020\u00152\u0006\u0010u\u001a\u00020\u0005H\u0000¢\u0006\u0002\bvJ\u001e\u0010w\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001H\u0086\n¢\u0006\u0002\u0010xJ\b\u0010y\u001a\u00020zH\u0016J\u000e\u0010{\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u001dR+\u0010\r\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020&8\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010(\u0012\u0004\b'\u0010 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b)\u0010\u001dR\u0018\u0010*\u001a\u00020+8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b,\u0010 R\u000e\u0010-\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000Rj\u0010\u000f\u001a^\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010.\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b/\u0010\u001dR>\u0010\u0007\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020&8\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010(\u0012\u0004\b2\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006|"}, m13558d2 = {"Landroidx/collection/SieveCache;", "K", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "maxSize", "", "initialCapacity", "sizeOf", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "key", "value", "createValueFromKey", "Lkotlin/Function1;", "onEntryRemoved", "Lkotlin/Function4;", "oldValue", "newValue", "", "evicted", "", "(IILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "_capacity", "_count", "_maxSize", "_size", "capacity", "getCapacity", "()I", "count", "getCount$annotations", "()V", "getCount", "growthLimit", "hand", "head", "keys", "", "getKeys$annotations", "[Ljava/lang/Object;", "getMaxSize", "metadata", "", "getMetadata$annotations", "nodes", "size", "getSize", "tail", "values", "getValues$annotations", "adjustStorage", "adjustStorage$collection", "all", "predicate", "any", "contains", "(Ljava/lang/Object;)Z", "containsKey", "containsValue", "dropDeletes", "dropDeletes$collection", "equals", "other", "evictAll", "findEvictionCandidate", "findFirstAvailableSlot", "hash1", "findInsertIndex", "(Ljava/lang/Object;)I", "findKeyIndex", "fixupNodes", "mapping", "", "forEach", "block", "forEachIndexed", "index", "forEachKey", "forEachValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "initializeGrowth", "initializeMetadata", "initializeStorage", "isEmpty", "isNotEmpty", "markNodeVisited", "minusAssign", "(Ljava/lang/Object;)V", "Landroidx/collection/ObjectList;", "Landroidx/collection/ScatterSet;", "([Ljava/lang/Object;)V", "", "Lkotlin/sequences/Sequence;", "moveNodeToHead", SchedulerSupport.NONE, "plusAssign", TypedValues.TransitionType.S_FROM, "Landroidx/collection/ScatterMap;", "pairs", "Lkotlin/Pair;", "([Lkotlin/Pair;)V", "pair", "", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeIf", "removeNode", "removeValueAt", "(I)Ljava/lang/Object;", "resize", "resizeStorage", "newCapacity", "resizeStorage$collection", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "toString", "", "trimToSize", "collection"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSieveCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SieveCache.kt\nandroidx/collection/SieveCache\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 SieveCache.kt\nandroidx/collection/SieveCacheKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 8 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 9 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1148:1\n684#1,2:1161\n633#1:1163\n635#1,2:1165\n638#1,6:1168\n251#1,2:1174\n251#1,2:1176\n251#1,2:1178\n251#1,2:1181\n251#1,2:1201\n548#1,4:1210\n1025#1,6:1214\n1035#1,3:1221\n1038#1,2:1225\n251#1,2:1227\n1041#1,6:1229\n552#1:1235\n251#1,2:1236\n1025#1,6:1238\n1035#1,3:1245\n1038#1,9:1249\n1025#1,6:1289\n1035#1,3:1296\n1038#1,9:1300\n1025#1,6:1309\n1035#1,3:1316\n1038#1,9:1320\n1025#1,6:1329\n1035#1,3:1336\n1038#1,9:1340\n548#1,4:1349\n1025#1,6:1353\n1035#1,3:1360\n1038#1,9:1364\n552#1:1373\n548#1,4:1374\n1025#1,6:1378\n1035#1,3:1385\n1038#1,9:1389\n552#1:1398\n548#1,4:1399\n1025#1,6:1403\n1035#1,3:1410\n1038#1,9:1414\n552#1:1423\n1025#1,6:1424\n1035#1,3:1431\n1038#1,9:1435\n660#1,3:1462\n663#1:1466\n665#1,2:1468\n668#1,5:1471\n674#1,8:1477\n548#1,4:1638\n1025#1,6:1642\n1035#1,3:1649\n1038#1,9:1653\n552#1:1662\n548#1,4:1663\n1025#1,6:1667\n1035#1,3:1674\n1038#1,9:1678\n552#1:1687\n59#2,5:1149\n1#3:1154\n1254#4,6:1155\n1399#4:1194\n1270#4:1198\n1399#4:1220\n1270#4:1224\n1399#4:1244\n1270#4:1248\n1399#4:1268\n1270#4:1272\n1399#4:1295\n1270#4:1299\n1399#4:1315\n1270#4:1319\n1399#4:1335\n1270#4:1339\n1399#4:1359\n1270#4:1363\n1399#4:1384\n1270#4:1388\n1399#4:1409\n1270#4:1413\n1399#4:1430\n1270#4:1434\n1230#4:1450\n1254#4,6:1451\n1242#4:1457\n1241#4,4:1458\n1165#4,3:1489\n1179#4:1492\n1175#4:1493\n1372#4,3:1494\n1386#4,3:1497\n1312#4:1500\n1303#4:1501\n1297#4:1502\n1309#4:1503\n1393#4:1504\n1165#4,3:1505\n1175#4:1508\n1179#4:1509\n1372#4,3:1510\n1386#4,3:1513\n1312#4:1516\n1303#4:1517\n1297#4:1518\n1309#4:1519\n1393#4:1520\n1265#4:1521\n1220#4:1522\n1262#4:1523\n1220#4:1524\n1230#4:1525\n1254#4,6:1526\n1242#4:1532\n1241#4,4:1533\n1372#4,3:1537\n1399#4:1540\n1297#4:1541\n1144#4,14:1542\n1220#4:1556\n1165#4,3:1557\n1175#4:1560\n1179#4:1561\n1254#4,6:1562\n1220#4:1569\n1179#4:1570\n1254#4,6:1571\n1254#4,6:1577\n1179#4:1588\n1254#4,6:1589\n1268#4:1600\n1220#4:1601\n1165#4,3:1602\n1175#4:1605\n1179#4:1606\n1230#4:1607\n1254#4,6:1608\n1242#4:1614\n1241#4,4:1615\n1399#4:1636\n1270#4:1637\n1399#4:1648\n1270#4:1652\n1399#4:1673\n1270#4:1677\n1111#5:1164\n1114#5:1167\n1130#5:1444\n1123#5:1445\n1119#5:1446\n1123#5:1447\n1111#5:1448\n1114#5:1449\n1123#5:1465\n1127#5:1467\n1117#5:1470\n1114#5:1476\n1123#5:1485\n1127#5:1486\n1117#5:1487\n1114#5:1488\n1132#5:1568\n1144#5:1583\n1138#5:1584\n1141#5:1585\n1132#5:1586\n1132#5:1587\n1144#5:1595\n1138#5:1596\n1135#5:1597\n1132#5:1598\n1132#5:1599\n1123#5:1619\n1127#5:1620\n1096#5,2:1621\n1147#5:1623\n1098#5,2:1624\n1147#5:1626\n1147#5:1627\n1147#5:1628\n1147#5:1629\n1123#5:1630\n1127#5:1631\n1103#5,4:1632\n215#6:1180\n216#6:1183\n357#7,4:1184\n329#7,6:1188\n339#7,3:1195\n342#7,2:1199\n345#7,6:1203\n361#7:1209\n231#8,3:1258\n200#8,7:1261\n211#8,3:1269\n214#8,9:1273\n234#8:1282\n287#9,6:1283\n*S KotlinDebug\n*F\n+ 1 SieveCache.kt\nandroidx/collection/SieveCache\n*L\n229#1:1161,2\n288#1:1163\n288#1:1165,2\n288#1:1168,6\n300#1:1174,2\n311#1:1176,2\n322#1:1178,2\n332#1:1181,2\n341#1:1201,2\n350#1:1210,4\n350#1:1214,6\n350#1:1221,3\n350#1:1225,2\n350#1:1227,2\n350#1:1229,6\n350#1:1235\n358#1:1236,2\n447#1:1238,6\n447#1:1245,3\n447#1:1249,9\n551#1:1289,6\n551#1:1296,3\n551#1:1300,9\n563#1:1309,6\n563#1:1316,3\n563#1:1320,9\n575#1:1329,6\n575#1:1336,3\n575#1:1340,9\n580#1:1349,4\n580#1:1353,6\n580#1:1360,3\n580#1:1364,9\n580#1:1373\n586#1:1374,4\n586#1:1378,6\n586#1:1385,3\n586#1:1389,9\n586#1:1398\n596#1:1399,4\n596#1:1403,6\n596#1:1410,3\n596#1:1414,9\n596#1:1423\n609#1:1424,6\n609#1:1431,3\n609#1:1435,9\n654#1:1462,3\n654#1:1466\n654#1:1468,2\n654#1:1471,5\n654#1:1477,8\n1055#1:1638,4\n1055#1:1642,6\n1055#1:1649,3\n1055#1:1653,9\n1055#1:1662\n1081#1:1663,4\n1081#1:1667,6\n1081#1:1674,3\n1081#1:1678,9\n1081#1:1687\n131#1:1149,5\n211#1:1155,6\n341#1:1194\n341#1:1198\n350#1:1220\n350#1:1224\n447#1:1244\n447#1:1248\n486#1:1268\n486#1:1272\n551#1:1295\n551#1:1299\n563#1:1315\n563#1:1319\n575#1:1335\n575#1:1339\n580#1:1359\n580#1:1363\n586#1:1384\n586#1:1388\n596#1:1409\n596#1:1413\n609#1:1430\n609#1:1434\n648#1:1450\n648#1:1451,6\n648#1:1457\n648#1:1458,4\n688#1:1489,3\n689#1:1492\n692#1:1493\n696#1:1494,3\n697#1:1497,3\n698#1:1500\n699#1:1501\n699#1:1502\n703#1:1503\n706#1:1504\n718#1:1505,3\n719#1:1508\n720#1:1509\n727#1:1510,3\n728#1:1513,3\n729#1:1516\n730#1:1517\n730#1:1518\n734#1:1519\n737#1:1520\n746#1:1521\n746#1:1522\n752#1:1523\n752#1:1524\n753#1:1525\n753#1:1526,6\n753#1:1532\n753#1:1533,4\n764#1:1537,3\n765#1:1540\n767#1:1541\n841#1:1542,14\n847#1:1556\n861#1:1557,3\n862#1:1560\n873#1:1561\n874#1:1562,6\n888#1:1569\n891#1:1570\n892#1:1571,6\n893#1:1577,6\n915#1:1588\n916#1:1589,6\n980#1:1600\n980#1:1601\n982#1:1602,3\n983#1:1605\n985#1:1606\n985#1:1607\n985#1:1608,6\n985#1:1614\n985#1:1615,4\n1030#1:1636\n1037#1:1637\n1055#1:1648\n1055#1:1652\n1081#1:1673\n1081#1:1677\n288#1:1164\n288#1:1167\n619#1:1444\n621#1:1445\n622#1:1446\n626#1:1447\n633#1:1448\n636#1:1449\n654#1:1465\n654#1:1467\n654#1:1470\n654#1:1476\n662#1:1485\n663#1:1486\n666#1:1487\n672#1:1488\n878#1:1568\n905#1:1583\n907#1:1584\n908#1:1585\n910#1:1586\n912#1:1587\n931#1:1595\n933#1:1596\n934#1:1597\n936#1:1598\n940#1:1599\n1001#1:1619\n1002#1:1620\n1003#1:1621,2\n1003#1:1623\n1003#1:1624,2\n1003#1:1626\n1005#1:1627\n1006#1:1628\n1007#1:1629\n1014#1:1630\n1015#1:1631\n1016#1:1632,4\n332#1:1180\n332#1:1183\n341#1:1184,4\n341#1:1188,6\n341#1:1195,3\n341#1:1199,2\n341#1:1203,6\n341#1:1209\n486#1:1258,3\n486#1:1261,7\n486#1:1269,3\n486#1:1273,9\n486#1:1282\n491#1:1283,6\n*E\n"})
/* loaded from: classes.dex */
public final class SieveCache<K, V> {

    /* renamed from: _capacity, reason: from kotlin metadata and from toString */
    private int capacity;

    /* renamed from: _count, reason: from kotlin metadata and from toString */
    private int count;
    private int _maxSize;

    /* renamed from: _size, reason: from kotlin metadata and from toString */
    private int size;
    private final Function1<K, V> createValueFromKey;
    private int growthLimit;
    private int hand;
    private int head;

    @JvmField
    public Object[] keys;

    @JvmField
    public long[] metadata;
    private long[] nodes;
    private final Function4<K, V, V, Boolean, Unit> onEntryRemoved;
    private final Function2<K, V, Integer> sizeOf;
    private int tail;

    @JvmField
    public Object[] values;

    /* JADX WARN: Multi-variable type inference failed */
    public SieveCache(@IntRange(from = 1, m488to = 2147483646) int i10, @IntRange(from = 0, m488to = 2147483646) int i11, Function2<? super K, ? super V, Integer> sizeOf, Function1<? super K, ? extends V> createValueFromKey, Function4<? super K, ? super V, ? super V, ? super Boolean, Unit> onEntryRemoved) {
        Intrinsics.checkNotNullParameter(sizeOf, "sizeOf");
        Intrinsics.checkNotNullParameter(createValueFromKey, "createValueFromKey");
        Intrinsics.checkNotNullParameter(onEntryRemoved, "onEntryRemoved");
        this.sizeOf = sizeOf;
        this.createValueFromKey = createValueFromKey;
        this.onEntryRemoved = onEntryRemoved;
        this.metadata = ScatterMapKt.EmptyGroup;
        Object[] objArr = ContainerHelpersKt.EMPTY_OBJECTS;
        this.keys = objArr;
        this.values = objArr;
        this.nodes = SieveCacheKt.getEmptyNodes();
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
        this.hand = Integer.MAX_VALUE;
        if (!(i10 > 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("maxSize must be > 0");
        }
        this._maxSize = i10;
        initializeStorage(ScatterMapKt.unloadedCapacity(i11));
    }

    private final int findEvictionCandidate() {
        long[] jArr = this.nodes;
        int i10 = this.hand;
        if (i10 == Integer.MAX_VALUE) {
            i10 = this.tail;
        }
        while (i10 != Integer.MAX_VALUE) {
            long j10 = jArr[i10];
            if (((int) ((j10 >> 62) & 1)) == 0) {
                break;
            }
            int i11 = (int) (SieveCacheKt.NodeLinkMask & (j10 >> 31));
            jArr[i10] = 4611686018427387903L & j10;
            i10 = i11 != Integer.MAX_VALUE ? i11 : this.tail;
        }
        int i12 = (int) (SieveCacheKt.NodeLinkMask & (jArr[i10] >> 31));
        this.hand = i12 != Integer.MAX_VALUE ? i12 : Integer.MAX_VALUE;
        return i10;
    }

    private final int findFirstAvailableSlot(int hash1) {
        int i10 = this.capacity;
        int i11 = hash1 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j10 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i11 + (Long.numberOfTrailingZeros(j11) >> 3)) & i10;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    private final int findInsertIndex(K key) {
        int iHashCode = (key != null ? key.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.capacity;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * ScatterMapKt.BitmaskLsb);
            for (long j13 = (~j12) & (j12 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (Intrinsics.areEqual(this.keys[iNumberOfTrailingZeros], key)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i11);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i11);
                }
                this.count++;
                int i19 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i20 = iFindFirstAvailableSlot >> 3;
                long j14 = jArr2[i20];
                int i21 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.capacity;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iFindFirstAvailableSlot - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~iFindFirstAvailableSlot;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final int findKeyIndex(K key) {
        int i10 = 0;
        int iHashCode = (key != null ? key.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.capacity;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.metadata;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (i12 * ScatterMapKt.BitmaskLsb) ^ j10;
            for (long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (Intrinsics.areEqual(this.keys[iNumberOfTrailingZeros], key)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    private final void fixupNodes(long[] mapping) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            if (i10 >= length) {
                break;
            }
            long j10 = jArr[i10];
            int i12 = (int) ((j10 >> 31) & SieveCacheKt.NodeLinkMask);
            int i13 = (int) (j10 & SieveCacheKt.NodeLinkMask);
            long j11 = ((j10 & SieveCacheKt.NodeMetaMask) | (i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (mapping[i12] & 4294967295L))) << 31;
            if (i13 != Integer.MAX_VALUE) {
                i11 = (int) (4294967295L & mapping[i13]);
            }
            jArr[i10] = i11 | j11;
            i10++;
        }
        int i14 = this.head;
        if (i14 != Integer.MAX_VALUE) {
            this.head = (int) (mapping[i14] & 4294967295L);
        }
        int i15 = this.tail;
        if (i15 != Integer.MAX_VALUE) {
            this.tail = (int) (mapping[i15] & 4294967295L);
        }
        int i16 = this.hand;
        if (i16 != Integer.MAX_VALUE) {
            this.hand = (int) (mapping[i16] & 4294967295L);
        }
    }

    public static /* synthetic */ void getCount$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getKeys$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getValues$annotations() {
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(this.capacity) - getCount();
    }

    private final void initializeMetadata(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            long[] jArr2 = new long[((capacity + 15) & (-8)) >> 3];
            ArraysKt.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            int i10 = capacity >> 3;
            long j10 = 255 << ((capacity & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j10)) | j10;
            jArr = jArr2;
        }
        this.metadata = jArr;
        initializeGrowth();
    }

    private final void initializeStorage(int initialCapacity) {
        long[] emptyNodes;
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0;
        this.capacity = iMax;
        initializeMetadata(iMax);
        this.keys = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
        this.values = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
        if (iMax == 0) {
            emptyNodes = SieveCacheKt.getEmptyNodes();
        } else {
            long[] jArr = new long[iMax];
            ArraysKt.fill$default(jArr, 4611686018427387903L, 0, 0, 6, (Object) null);
            emptyNodes = jArr;
        }
        this.nodes = emptyNodes;
    }

    private final void markNodeVisited(int index) {
        long[] jArr = this.nodes;
        jArr[index] = (jArr[index] & 4611686018427387903L) | SieveCacheKt.NodeVisitedBit;
    }

    private final void moveNodeToHead(int index) {
        long[] jArr = this.nodes;
        int i10 = this.head;
        jArr[index] = (i10 & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = ((index & SieveCacheKt.NodeLinkMask) << 31) | (jArr[i10] & SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = index;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = index;
        }
    }

    private final void removeNode(int index) {
        long[] jArr = this.nodes;
        long j10 = jArr[index];
        int i10 = (int) ((j10 >> 31) & SieveCacheKt.NodeLinkMask);
        int i11 = (int) (j10 & SieveCacheKt.NodeLinkMask);
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = (jArr[i10] & SieveCacheKt.NodeMetaAndPreviousMask) | (i11 & SieveCacheKt.NodeLinkMask);
        } else {
            this.head = i11;
        }
        if (i11 != Integer.MAX_VALUE) {
            jArr[i11] = ((i10 & SieveCacheKt.NodeLinkMask) << 31) | (jArr[i11] & SieveCacheKt.NodeMetaAndNextMask);
        } else {
            this.tail = i10;
        }
        if (this.hand == index) {
            this.hand = i10;
        }
        jArr[index] = 4611686018427387903L;
    }

    private final V removeValueAt(int index) {
        this.count--;
        long[] jArr = this.metadata;
        int i10 = this.capacity;
        int i11 = index >> 3;
        int i12 = (index & 7) << 3;
        long j10 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j10;
        jArr[(((index - 7) & i10) + (i10 & 7)) >> 3] = j10;
        this.keys[index] = null;
        Object[] objArr = this.values;
        V v9 = (V) objArr[index];
        objArr[index] = null;
        long[] jArr2 = this.nodes;
        long j11 = jArr2[index];
        int i13 = (int) ((j11 >> 31) & SieveCacheKt.NodeLinkMask);
        int i14 = (int) (j11 & SieveCacheKt.NodeLinkMask);
        if (i13 != Integer.MAX_VALUE) {
            jArr2[i13] = (jArr2[i13] & SieveCacheKt.NodeMetaAndPreviousMask) | (i14 & SieveCacheKt.NodeLinkMask);
        } else {
            this.head = i14;
        }
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = ((i13 & SieveCacheKt.NodeLinkMask) << 31) | (jArr2[i14] & SieveCacheKt.NodeMetaAndNextMask);
        } else {
            this.tail = i13;
        }
        if (this.hand == index) {
            this.hand = i13;
        }
        jArr2[index] = 4611686018427387903L;
        return v9;
    }

    public final void adjustStorage$collection() {
        if (this.capacity <= 8 || Long.compare(ULong.m24473constructorimpl(ULong.m24473constructorimpl(getCount()) * 32) ^ Long.MIN_VALUE, ULong.m24473constructorimpl(ULong.m24473constructorimpl(this.capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            resizeStorage$collection(ScatterMapKt.nextCapacity(this.capacity));
        } else {
            dropDeletes$collection();
        }
    }

    public final boolean all(Function2<? super K, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i13];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        if (!predicate.invoke(obj, obj2).booleanValue()) {
                            return false;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean any() {
        return this.count != 0;
    }

    public final boolean contains(K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return findKeyIndex(key) >= 0;
    }

    public final boolean containsKey(K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return findKeyIndex(key) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsValue(V r15) {
        /*
            r14 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.Object[] r0 = r14.values
            long[] r1 = r14.metadata
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L54
            r4 = r3
        L11:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4f
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2b:
            if (r9 >= r7) goto L4d
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L49
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            java.lang.String r11 = "null cannot be cast to non-null type V of androidx.collection.SieveCache"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10, r11)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r10)
            if (r10 == 0) goto L49
            r15 = 1
            return r15
        L49:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2b
        L4d:
            if (r7 != r8) goto L54
        L4f:
            if (r4 == r2) goto L54
            int r4 = r4 + 1
            goto L11
        L54:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.SieveCache.containsValue(java.lang.Object):boolean");
    }

    public final int count() {
        return getSize();
    }

    public final void dropDeletes$collection() {
        int i10;
        Object[] objArr;
        long[] jArr = this.metadata;
        if (jArr == null) {
            return;
        }
        int i11 = this.capacity;
        Object[] objArr2 = this.keys;
        Object[] objArr3 = this.values;
        long[] jArr2 = this.nodes;
        long[] jArr3 = new long[i11];
        long j10 = 9223372034707292159L;
        int i12 = 0;
        ArraysKt.fill(jArr3, 9223372034707292159L, 0, i11);
        int i13 = (i11 + 7) >> 3;
        for (int i14 = 0; i14 < i13; i14++) {
            long j11 = jArr[i14] & (-9187201950435737472L);
            jArr[i14] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i15 = lastIndex - 1;
        jArr[i15] = (jArr[i15] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i16 = 0;
        while (i16 != i11) {
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j12 = (jArr[i17] >> i18) & 255;
            if (j12 != 128 && j12 == 254) {
                Object obj = objArr2[i16];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * ScatterMapKt.MurmurHashC1;
                int i19 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                long j13 = j10;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i19);
                int i20 = i19 & i11;
                if (((iFindFirstAvailableSlot - i20) & i11) / 8 == ((i16 - i20) & i11) / 8) {
                    int i21 = i12;
                    int i22 = i16;
                    jArr[i17] = ((r12 & 127) << i18) | ((~(255 << i18)) & jArr[i17]);
                    if (jArr3[i22] == j13) {
                        long j14 = i22;
                        jArr3[i22] = j14 | (j14 << 32);
                    }
                    jArr[jArr.length - 1] = jArr[i21];
                    i16 = i22 + 1;
                    j10 = j13;
                    i12 = i21;
                } else {
                    int i23 = i12;
                    int i24 = iFindFirstAvailableSlot >> 3;
                    long j15 = jArr[i24];
                    int i25 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j15 >> i25) & 255) == 128) {
                        i10 = i11;
                        objArr = objArr2;
                        jArr[i24] = (j15 & (~(255 << i25))) | ((r12 & 127) << i25);
                        jArr[i17] = (jArr[i17] & (~(255 << i18))) | (128 << i18);
                        objArr[iFindFirstAvailableSlot] = objArr[i16];
                        objArr[i16] = null;
                        objArr3[iFindFirstAvailableSlot] = objArr3[i16];
                        objArr3[i16] = null;
                        jArr2[iFindFirstAvailableSlot] = jArr2[i16];
                        jArr2[i16] = 4611686018427387903L;
                        int i26 = (int) ((jArr3[i16] >> 32) & 4294967295L);
                        if (i26 != Integer.MAX_VALUE) {
                            jArr3[i26] = (jArr3[i26] & (-4294967296L)) | iFindFirstAvailableSlot;
                            jArr3[i16] = (jArr3[i16] & 4294967295L) | (-4294967296L);
                        } else {
                            jArr3[i16] = (Integer.MAX_VALUE << 32) | iFindFirstAvailableSlot;
                        }
                        jArr3[iFindFirstAvailableSlot] = (i16 << 32) | Integer.MAX_VALUE;
                    } else {
                        i10 = i11;
                        objArr = objArr2;
                        jArr[i24] = ((r12 & 127) << i25) | (j15 & (~(255 << i25)));
                        Object obj2 = objArr[iFindFirstAvailableSlot];
                        objArr[iFindFirstAvailableSlot] = objArr[i16];
                        objArr[i16] = obj2;
                        Object obj3 = objArr3[iFindFirstAvailableSlot];
                        objArr3[iFindFirstAvailableSlot] = objArr3[i16];
                        objArr3[i16] = obj3;
                        long j16 = jArr2[iFindFirstAvailableSlot];
                        jArr2[iFindFirstAvailableSlot] = jArr2[i16];
                        jArr2[i16] = j16;
                        int i27 = (int) ((jArr3[i16] >> 32) & 4294967295L);
                        if (i27 != Integer.MAX_VALUE) {
                            long j17 = iFindFirstAvailableSlot;
                            jArr3[i27] = (jArr3[i27] & (-4294967296L)) | j17;
                            jArr3[i16] = (jArr3[i16] & 4294967295L) | (j17 << 32);
                        } else {
                            long j18 = iFindFirstAvailableSlot;
                            jArr3[i16] = j18 | (j18 << 32);
                            i27 = i16;
                        }
                        jArr3[iFindFirstAvailableSlot] = (i27 << 32) | i16;
                        i16--;
                    }
                    jArr[jArr.length - 1] = jArr[i23];
                    i16++;
                    i11 = i10;
                    j10 = j13;
                    i12 = i23;
                    objArr2 = objArr;
                }
            } else {
                i16++;
            }
        }
        initializeGrowth();
        fixupNodes(jArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object other) {
        boolean z9;
        boolean z10;
        boolean z11 = true;
        if (other == this) {
            return true;
        }
        if (!(other instanceof SieveCache)) {
            return false;
        }
        SieveCache sieveCache = (SieveCache) other;
        if (sieveCache.getSize() != getSize() || sieveCache.count != this.count) {
            return false;
        }
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                int i12 = 0;
                while (i12 < i11) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        z10 = z11;
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i13];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        if (!Intrinsics.areEqual(obj2, sieveCache.get(obj))) {
                            return false;
                        }
                    } else {
                        z10 = z11;
                    }
                    j10 >>= 8;
                    i12++;
                    z11 = z10;
                }
                z9 = z11;
                if (i11 != 8) {
                    return z9;
                }
            } else {
                z9 = z11;
            }
            if (i10 == length) {
                return z9;
            }
            i10++;
            z11 = z9;
        }
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final void forEach(Function2<? super K, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i13];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        block.invoke(obj, obj2);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @PublishedApi
    public final void forEachIndexed(Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        block.invoke(Integer.valueOf((i10 << 3) + i12));
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void forEachKey(Function1<? super K, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.keys;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        Object obj = objArr[(i10 << 3) + i12];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        block.invoke(obj);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void forEachValue(Function1<? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        Object obj = objArr[(i10 << 3) + i12];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        block.invoke(obj);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final V get(K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            long[] jArr = this.nodes;
            jArr[iFindKeyIndex] = (jArr[iFindKeyIndex] & 4611686018427387903L) | SieveCacheKt.NodeVisitedBit;
            return (V) this.values[iFindKeyIndex];
        }
        V vInvoke = this.createValueFromKey.invoke(key);
        if (vInvoke == null) {
            return null;
        }
        put(key, vInvoke);
        return vInvoke;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final int getCount() {
        return this.count;
    }

    /* renamed from: getMaxSize, reason: from getter */
    public final int get_maxSize() {
        return this._maxSize;
    }

    public final int getSize() {
        return this.size;
    }

    public int hashCode() {
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i13];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        iHashCode += obj2.hashCode() ^ obj.hashCode();
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return iHashCode;
                }
            }
            if (i10 == length) {
                return iHashCode;
            }
            i10++;
        }
    }

    public final boolean isEmpty() {
        return this.count == 0;
    }

    public final boolean isNotEmpty() {
        return this.count != 0;
    }

    public final void minusAssign(K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        remove(key);
    }

    public final boolean none() {
        return this.count == 0;
    }

    public final void plusAssign(Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        put(pair.getFirst(), pair.getSecond());
    }

    public final V put(K key, V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        Object[] objArr = this.values;
        V v9 = (V) objArr[iFindInsertIndex];
        objArr[iFindInsertIndex] = value;
        this.keys[iFindInsertIndex] = key;
        int iIntValue = this.size + this.sizeOf.invoke(key, value).intValue();
        this.size = iIntValue;
        if (v9 != null) {
            this.size = iIntValue - ((Number) this.sizeOf.invoke(key, v9)).intValue();
            this.onEntryRemoved.invoke(key, v9, value, Boolean.FALSE);
            trimToSize(this._maxSize);
            return v9;
        }
        trimToSize(this._maxSize);
        long[] jArr = this.nodes;
        int i10 = this.head;
        jArr[iFindInsertIndex] = (i10 & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = (jArr[i10] & SieveCacheKt.NodeMetaAndNextMask) | ((SieveCacheKt.NodeLinkMask & iFindInsertIndex) << 31);
        }
        this.head = iFindInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iFindInsertIndex;
        }
        return v9;
    }

    public final void putAll(Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            put(pair.component1(), pair.component2());
        }
    }

    public final V remove(K key) {
        V vRemoveValueAt;
        Intrinsics.checkNotNullParameter(key, "key");
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex < 0 || (vRemoveValueAt = removeValueAt(iFindKeyIndex)) == null) {
            return null;
        }
        this.size -= this.sizeOf.invoke(key, vRemoveValueAt).intValue();
        this.onEntryRemoved.invoke(key, vRemoveValueAt, null, Boolean.FALSE);
        return vRemoveValueAt;
    }

    public final void removeIf(Function2<? super K, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = this.keys[i13];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = this.values[i13];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        if (predicate.invoke(obj, obj2).booleanValue()) {
                            V vRemoveValueAt = removeValueAt(i13);
                            if (vRemoveValueAt == null) {
                                return;
                            }
                            this.size -= ((Number) this.sizeOf.invoke(obj, vRemoveValueAt)).intValue();
                            this.onEntryRemoved.invoke(obj, vRemoveValueAt, null, Boolean.FALSE);
                        } else {
                            continue;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void resize(@IntRange(from = 1, m488to = 2147483646) int maxSize) {
        this._maxSize = maxSize;
        trimToSize(maxSize);
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        Object[] objArr;
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.keys;
        Object[] objArr3 = this.values;
        long[] jArr3 = this.nodes;
        int i10 = this.capacity;
        int[] iArr = new int[i10];
        initializeStorage(newCapacity);
        long[] jArr4 = this.metadata;
        Object[] objArr4 = this.keys;
        Object[] objArr5 = this.values;
        long[] jArr5 = this.nodes;
        int i11 = this.capacity;
        int i12 = 0;
        while (i12 < i10) {
            if (((jArr2[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                Object obj = objArr2[i12];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int i13 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i13 >>> 7);
                jArr = jArr2;
                objArr = objArr2;
                long j10 = i13 & 127;
                int i14 = iFindFirstAvailableSlot >> 3;
                int i15 = (iFindFirstAvailableSlot & 7) << 3;
                long j11 = (jArr4[i14] & (~(255 << i15))) | (j10 << i15);
                jArr4[i14] = j11;
                jArr4[(((iFindFirstAvailableSlot - 7) & i11) + (i11 & 7)) >> 3] = j11;
                objArr4[iFindFirstAvailableSlot] = obj;
                objArr5[iFindFirstAvailableSlot] = objArr3[i12];
                jArr5[iFindFirstAvailableSlot] = jArr3[i12];
                iArr[i12] = iFindFirstAvailableSlot;
            } else {
                jArr = jArr2;
                objArr = objArr2;
            }
            i12++;
            jArr2 = jArr;
            objArr2 = objArr;
        }
        fixupNodes(iArr);
    }

    public final void set(K key, V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        put(key, value);
    }

    public String toString() {
        return "SieveCache[maxSize=" + this._maxSize + ", size=" + this.size + ", capacity=" + this.capacity + ", count=" + this.count + ']';
    }

    public final void trimToSize(int maxSize) {
        int iFindEvictionCandidate;
        while (this.size > maxSize && getCount() != 0 && (iFindEvictionCandidate = findEvictionCandidate()) != Integer.MAX_VALUE) {
            Object obj = this.keys[iFindEvictionCandidate];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
            V vRemoveValueAt = removeValueAt(iFindEvictionCandidate);
            if (vRemoveValueAt != null) {
                this.size -= ((Number) this.sizeOf.invoke(obj, vRemoveValueAt)).intValue();
                this.onEntryRemoved.invoke(obj, vRemoveValueAt, null, Boolean.TRUE);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean any(kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Boolean> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.Object[] r2 = r0.keys
            java.lang.Object[] r3 = r0.values
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L68
            r7 = r6
        L17:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L63
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L31:
            if (r12 >= r10) goto L61
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L5d
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            java.lang.String r15 = "null cannot be cast to non-null type K of androidx.collection.SieveCache"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r14, r15)
            r13 = r3[r13]
            java.lang.String r15 = "null cannot be cast to non-null type V of androidx.collection.SieveCache"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13, r15)
            java.lang.Object r13 = r1.invoke(r14, r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L5d
            r1 = 1
            return r1
        L5d:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L31
        L61:
            if (r10 != r11) goto L68
        L63:
            if (r7 == r5) goto L68
            int r7 = r7 + 1
            goto L17
        L68:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.SieveCache.any(kotlin.jvm.functions.Function2):boolean");
    }

    public final int count(Function2<? super K, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        int i14 = (i10 << 3) + i13;
                        Object obj = objArr[i14];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i14];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        if (predicate.invoke(obj, obj2).booleanValue()) {
                            i11++;
                        }
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return i11;
                }
            }
            if (i10 == length) {
                return i11;
            }
            i10++;
        }
    }

    public final void minusAssign(K[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (K k10 : keys) {
            remove(k10);
        }
    }

    public final void plusAssign(Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    public final void putAll(Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            put(pair.component1(), pair.component2());
        }
    }

    public final void minusAssign(Iterable<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    public final void plusAssign(Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    public final void putAll(Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            put(pair.component1(), pair.component2());
        }
    }

    public final boolean remove(K key, V value) {
        V vRemoveValueAt;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex < 0 || !Intrinsics.areEqual(this.values[iFindKeyIndex], value) || (vRemoveValueAt = removeValueAt(iFindKeyIndex)) == null) {
            return false;
        }
        this.size -= this.sizeOf.invoke(key, vRemoveValueAt).intValue();
        this.onEntryRemoved.invoke(key, vRemoveValueAt, null, Boolean.FALSE);
        return true;
    }

    public final void minusAssign(Sequence<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(Map<K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void plusAssign(ScatterMap<K, V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void putAll(Map<K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Object[] objArr = keys.elements;
        long[] jArr = keys.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        remove(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void plusAssign(SieveCache<K, V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    private final void fixupNodes(int[] mapping) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            if (i10 >= length) {
                break;
            }
            long j10 = jArr[i10];
            int i12 = (int) ((j10 >> 31) & SieveCacheKt.NodeLinkMask);
            int i13 = (int) (j10 & SieveCacheKt.NodeLinkMask);
            long j11 = ((j10 & SieveCacheKt.NodeMetaMask) | (i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : mapping[i12])) << 31;
            if (i13 != Integer.MAX_VALUE) {
                i11 = mapping[i13];
            }
            jArr[i10] = j11 | i11;
            i10++;
        }
        int i14 = this.head;
        if (i14 != Integer.MAX_VALUE) {
            this.head = mapping[i14];
        }
        int i15 = this.tail;
        if (i15 != Integer.MAX_VALUE) {
            this.tail = mapping[i15];
        }
        int i16 = this.hand;
        if (i16 != Integer.MAX_VALUE) {
            this.hand = mapping[i16];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(ScatterMap<K, V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Object[] objArr = from.keys;
        Object[] objArr2 = from.values;
        long[] jArr = from.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        put(objArr[i13], objArr2[i13]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Object[] objArr = keys.content;
        int i10 = keys._size;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(objArr[i11]);
        }
    }

    public /* synthetic */ SieveCache(int i10, int i11, Function2 function2, Function1 function1, Function4 function4, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i12 & 2) != 0 ? 6 : i11, (i12 & 4) != 0 ? new Function2<K, V, Integer>() { // from class: androidx.collection.SieveCache.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function2
            public final Integer invoke(K k10, V v9) {
                Intrinsics.checkNotNullParameter(k10, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(v9, "<anonymous parameter 1>");
                return 1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(Object obj, Object obj2) {
                return invoke((C09511) obj, obj2);
            }
        } : function2, (i12 & 8) != 0 ? new Function1() { // from class: androidx.collection.SieveCache.2
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(K it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((C09522) obj);
            }
        } : function1, (i12 & 16) != 0 ? new Function4<K, V, V, Boolean, Unit>() { // from class: androidx.collection.SieveCache.3
            public final void invoke(K k10, V v9, V v10, boolean z9) {
                Intrinsics.checkNotNullParameter(k10, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(v9, "<anonymous parameter 1>");
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3, Boolean bool) {
                invoke((C09533) obj, obj2, obj3, bool.booleanValue());
                return Unit.INSTANCE;
            }
        } : function4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(SieveCache<K, V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Object[] objArr = from.keys;
        Object[] objArr2 = from.values;
        long[] jArr = from.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i13];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        put(obj, obj2);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }
}
