package androidx.compose.runtime;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AbstractC0369d;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0091\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010T\u001a\u00020\u001bH\u0002J\u001e\u0010U\u001a\u00020\u001b2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020.0W2\u0006\u0010X\u001a\u00020\u000fH\u0002J\b\u0010Y\u001a\u00020\u001bH\u0016Jc\u0010Z\u001a\u00020\u001b2Y\u0010\u0012\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u001b0\u0014j\u0002`\u001c0\u0013H\u0002J\b\u0010[\u001a\u00020\u001bH\u0016J\b\u0010\\\u001a\u00020\u001bH\u0016J\b\u0010]\u001a\u00020\u001bH\u0002J \u0010^\u001a\u00020\u001b2\u0011\u0010_\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001e¢\u0006\u0002\b\u001fH\u0016¢\u0006\u0002\u0010#J3\u0010`\u001a\u0002Ha\"\u0004\b\u0000\u0010a2\b\u0010b\u001a\u0004\u0018\u00010\u00012\u0006\u0010c\u001a\u00020:2\f\u0010d\u001a\b\u0012\u0004\u0012\u0002Ha0\u001eH\u0016¢\u0006\u0002\u0010eJ\b\u0010f\u001a\u00020\u001bH\u0016J\u0010\u0010g\u001a\u00020\u001b2\u0006\u0010h\u001a\u00020iH\u0016J\b\u0010j\u001a\u00020\u001bH\u0002J\b\u0010k\u001a\u00020\u001bH\u0002J\"\u0010l\u001a\u0002Hm\"\u0004\b\u0000\u0010m2\f\u0010d\u001a\b\u0012\u0004\u0012\u0002Hm0\u001eH\u0082\b¢\u0006\u0002\u0010nJK\u0010o\u001a\u0002Hm\"\u0004\b\u0000\u0010m25\u0010d\u001a1\u0012'\u0012%\u0012\u0004\u0012\u00020)\u0012\f\u0012\n\u0012\u0004\u0012\u00020.\u0018\u00010=0<¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u0002Hm0pH\u0082\b¢\u0006\u0002\u0010qJ$\u0010r\u001a\u00020\u001b2\u001a\u0010s\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020u\u0012\u0006\u0012\u0004\u0018\u00010u0t0(H\u0016J\u0018\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020)2\b\u0010y\u001a\u0004\u0018\u00010.J\b\u0010z\u001a\u00020\u001bH\u0016J\"\u0010{\u001a\u00020w2\u0006\u0010x\u001a\u00020)2\u0006\u0010|\u001a\u00020}2\b\u0010y\u001a\u0004\u0018\u00010.H\u0002J\u000e\u0010~\u001a\u00020\u001b2\u0006\u0010\u007f\u001a\u00020:J\u0012\u0010\u0080\u0001\u001a\u00020\u001b2\u0007\u0010\u0081\u0001\u001a\u00020.H\u0002J\u0017\u0010\u0082\u0001\u001a\u00020\u000f2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020.0WH\u0016J\u0017\u0010\u0083\u0001\u001a\u00020\u001b2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001eH\u0016J\t\u0010\u0084\u0001\u001a\u00020\u000fH\u0016J\u0017\u0010\u0085\u0001\u001a\u00020\u001b2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020.0WH\u0016J\u0012\u0010\u0086\u0001\u001a\u00020\u001b2\u0007\u0010\u0081\u0001\u001a\u00020.H\u0016J\u0012\u0010\u0087\u0001\u001a\u00020\u001b2\u0007\u0010\u0081\u0001\u001a\u00020.H\u0016J\u001b\u0010\u0088\u0001\u001a\u00020\u001b2\n\u0010h\u001a\u0006\u0012\u0002\b\u000302H\u0000¢\u0006\u0003\b\u0089\u0001J\u001f\u0010\u008a\u0001\u001a\u00020\u001b2\u0006\u0010y\u001a\u00020.2\u0006\u0010x\u001a\u00020)H\u0000¢\u0006\u0003\b\u008b\u0001J!\u0010\u008c\u0001\u001a\u00020\u001b2\u0011\u0010_\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001e¢\u0006\u0002\b\u001fH\u0016¢\u0006\u0002\u0010#J\u001d\u0010\u008d\u0001\u001a\u0016\u0012\u0004\u0012\u00020)\u0012\f\u0012\n\u0012\u0004\u0012\u00020.\u0018\u00010=0<H\u0002J#\u0010\u008e\u0001\u001a\u0002Hm\"\u0004\b\u0000\u0010m2\f\u0010d\u001a\b\u0012\u0004\u0012\u0002Hm0\u001eH\u0082\b¢\u0006\u0002\u0010nJ\u0011\u0010\u008f\u0001\u001a\u00020\u001b2\u0006\u0010P\u001a\u00020QH\u0002J\t\u0010\u0090\u0001\u001a\u00020\u001bH\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011Ra\u0010\u0012\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u001b0\u0014j\u0002`\u001c0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001e¢\u0006\u0002\b\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001e\u0010,\u001a\u0012\u0012\u0004\u0012\u00020)0\u000bj\b\u0012\u0004\u0012\u00020)`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020.0(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u0010+R\u0018\u00100\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030201X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00104\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0011R\u0014\u00106\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0011R\u0010\u00108\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010;\u001a\u0016\u0012\u0004\u0012\u00020)\u0012\f\u0012\n\u0012\u0004\u0012\u00020.\u0018\u00010=0<X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010>\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0011R\u0014\u0010?\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0011R\u0011\u0010@\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0011Ra\u0010A\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u001b0\u0014j\u0002`\u001c0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010C\u001a\b\u0012\u0004\u0012\u00020)01X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020)01X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020.0(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010G\u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0011\"\u0004\bI\u0010JR\"\u0010K\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010.0Lj\n\u0012\u0006\u0012\u0004\u0018\u00010.`MX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020QX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010S¨\u0006\u0092\u0001"}, m5175d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "parent", "Landroidx/compose/runtime/CompositionContext;", "applier", "Landroidx/compose/runtime/Applier;", "recomposeContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "_recomposeContext", "abandonSet", "Ljava/util/HashSet;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/collections/HashSet;", "areChildrenComposing", "", "getAreChildrenComposing", "()Z", "changes", "", "Lkotlin/Function3;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "Landroidx/compose/runtime/Change;", "composable", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "conditionalScopes", "", "Landroidx/compose/runtime/RecomposeScopeImpl;", "getConditionalScopes$runtime_release", "()Ljava/util/List;", "conditionallyInvalidatedScopes", "derivedStateDependencies", "", "getDerivedStateDependencies$runtime_release", "derivedStates", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "Landroidx/compose/runtime/DerivedState;", "disposed", "hasInvalidations", "getHasInvalidations", "hasPendingChanges", "getHasPendingChanges", "invalidationDelegate", "invalidationDelegateGroup", "", "invalidations", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "isComposing", "isDisposed", "isRoot", "lateChanges", "lock", "observations", "observationsProcessed", "observedObjects", "getObservedObjects$runtime_release", "pendingInvalidScopes", "getPendingInvalidScopes$runtime_release", "setPendingInvalidScopes$runtime_release", "(Z)V", "pendingModifications", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "getRecomposeContext", "()Lkotlin/coroutines/CoroutineContext;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "abandonChanges", "addPendingInvalidationsLocked", "values", "", "forgetConditionalScopes", "applyChanges", "applyChangesInLocked", "applyLateChanges", "changesApplied", "cleanUpDerivedStateObservations", "composeContent", "content", "delegateInvalidations", "R", "to", "groupIndex", "block", "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "dispose", "disposeUnusedMovableContent", "state", "Landroidx/compose/runtime/MovableContentState;", "drainPendingModificationsForCompositionLocked", "drainPendingModificationsLocked", "guardChanges", ExifInterface.GPS_DIRECTION_TRUE, "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "guardInvalidationsLocked", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "insertMovableContent", "references", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "invalidate", "Landroidx/compose/runtime/InvalidationResult;", "scope", "instance", "invalidateAll", "invalidateChecked", "anchor", "Landroidx/compose/runtime/Anchor;", "invalidateGroupsWithKey", "key", "invalidateScopeOfLocked", "value", "observesAnyOf", "prepareCompose", "recompose", "recordModificationsOf", "recordReadOf", "recordWriteOf", "removeDerivedStateObservation", "removeDerivedStateObservation$runtime_release", "removeObservation", "removeObservation$runtime_release", "setContent", "takeInvalidations", "trackAbandonedValues", "validateRecomposeScopeAnchors", "verifyConsistent", "RememberEventDispatcher", "runtime_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 IdentityScopeMap.kt\nandroidx/compose/runtime/collection/IdentityScopeMap\n+ 7 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 8 Composition.kt\nandroidx/compose/runtime/CompositionKt\n+ 9 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 10 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1257:1\n884#1,2:1271\n1025#1,3:1273\n874#1,6:1277\n1028#1,7:1283\n886#1,4:1290\n884#1,2:1467\n1025#1,3:1469\n874#1,6:1472\n1028#1,7:1478\n886#1,4:1485\n884#1,2:1498\n1025#1,10:1500\n886#1,4:1510\n884#1,2:1586\n1025#1,10:1588\n886#1,4:1598\n884#1,2:1603\n1025#1,10:1605\n886#1,4:1615\n884#1,2:1620\n1025#1,10:1622\n886#1,4:1632\n1025#1,10:1636\n70#2:1258\n70#2:1260\n70#2:1276\n70#2:1294\n70#2:1303\n70#2:1304\n70#2:1456\n70#2:1466\n70#2:1585\n70#2:1602\n70#2:1619\n70#2:1646\n70#2:1649\n70#2:1650\n1#3:1259\n1#3:1661\n93#4,2:1261\n33#4,4:1263\n95#4,2:1267\n38#4:1269\n97#4:1270\n110#4,2:1489\n33#4,6:1491\n112#4:1497\n33#4,6:1529\n33#4,6:1664\n162#5,8:1295\n162#5,8:1514\n162#5,4:1525\n167#5,3:1535\n89#6,3:1305\n93#6:1313\n220#6:1314\n236#6,5:1315\n221#6:1320\n222#6:1337\n241#6,17:1338\n223#6:1355\n220#6:1356\n236#6,5:1357\n221#6:1362\n222#6:1379\n241#6,17:1380\n223#6:1397\n220#6:1398\n236#6,5:1399\n221#6:1404\n222#6:1421\n241#6,17:1422\n223#6:1439\n89#6,3:1447\n93#6:1455\n89#6,3:1457\n93#6:1465\n220#6:1542\n236#6,5:1543\n221#6:1548\n222#6:1565\n241#6,17:1566\n223#6:1583\n89#6,3:1670\n93#6:1678\n105#7,5:1308\n146#7,16:1321\n146#7,16:1363\n146#7,16:1405\n105#7,5:1450\n105#7,5:1460\n146#7,16:1549\n105#7,5:1673\n1251#8,7:1440\n46#9,3:1522\n50#9:1538\n46#9,3:1539\n50#9:1584\n13579#10,2:1647\n11653#10,9:1651\n13579#10:1660\n13580#10:1662\n11662#10:1663\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n*L\n583#1:1271,2\n583#1:1273,3\n586#1:1277,6\n583#1:1283,7\n583#1:1290,4\n770#1:1467,2\n770#1:1469,3\n771#1:1472,6\n770#1:1478,7\n770#1:1485,4\n784#1:1498,2\n784#1:1500,10\n784#1:1510,4\n841#1:1586,2\n841#1:1588,10\n841#1:1598,4\n850#1:1603,2\n850#1:1605,10\n850#1:1615,4\n860#1:1620,2\n860#1:1622,10\n860#1:1632,4\n885#1:1636,10\n514#1:1258\n523#1:1260\n584#1:1276\n594#1:1294\n635#1:1303\n656#1:1304\n758#1:1456\n768#1:1466\n840#1:1585\n849#1:1602\n859#1:1619\n899#1:1646\n905#1:1649\n950#1:1650\n1012#1:1661\n530#1:1261,2\n530#1:1263,4\n530#1:1267,2\n530#1:1269\n530#1:1270\n783#1:1489,2\n783#1:1491,6\n783#1:1497\n809#1:1529,6\n1013#1:1664,6\n620#1:1295,8\n792#1:1514,8\n807#1:1525,4\n807#1:1535,3\n701#1:1305,3\n701#1:1313\n708#1:1314\n708#1:1315,5\n708#1:1320\n708#1:1337\n708#1:1338,17\n708#1:1355\n715#1:1356\n715#1:1357,5\n715#1:1362\n715#1:1379\n715#1:1380,17\n715#1:1397\n722#1:1398\n722#1:1399,5\n722#1:1404\n722#1:1421\n722#1:1422,17\n722#1:1439\n750#1:1447,3\n750#1:1455\n763#1:1457,3\n763#1:1465\n827#1:1542\n827#1:1543,5\n827#1:1548\n827#1:1565\n827#1:1566,17\n827#1:1583\n678#1:1670,3\n678#1:1678\n701#1:1308,5\n708#1:1321,16\n715#1:1363,16\n722#1:1405,16\n750#1:1450,5\n763#1:1460,5\n827#1:1549,16\n678#1:1673,5\n723#1:1440,7\n803#1:1522,3\n803#1:1538\n825#1:1539,3\n825#1:1584\n900#1:1647,2\n1012#1:1651,9\n1012#1:1660\n1012#1:1662\n1012#1:1663\n*E\n"})
/* loaded from: classes.dex */
public final class CompositionImpl implements ControlledComposition {
    private final CoroutineContext _recomposeContext;
    private final HashSet<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private final List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> changes;
    private Function2<? super Composer, ? super Integer, Unit> composable;
    private final ComposerImpl composer;
    private final HashSet<RecomposeScopeImpl> conditionallyInvalidatedScopes;
    private final IdentityScopeMap<DerivedState<?>> derivedStates;
    private boolean disposed;
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;
    private IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidations;
    private final boolean isRoot;
    private final List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> lateChanges;
    private final Object lock;
    private final IdentityScopeMap<RecomposeScopeImpl> observations;
    private final IdentityScopeMap<RecomposeScopeImpl> observationsProcessed;
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;
    private final AtomicReference<Object> pendingModifications;
    private final SlotTable slotTable;

    @Metadata(m5174d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0006\u0010\u0010\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u000eJ\u0006\u0010\u0013\u001a\u00020\u000eJ\u0010\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0016\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m5175d2 = {"Landroidx/compose/runtime/CompositionImpl$RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "abandoning", "", "Landroidx/compose/runtime/RememberObserver;", "(Ljava/util/Set;)V", "deactivating", "", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "forgetting", "releasing", "remembering", "sideEffects", "Lkotlin/Function0;", "", "instance", "dispatchAbandons", "dispatchNodeCallbacks", "dispatchRememberObservers", "dispatchSideEffects", "sideEffect", "effect", "runtime_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n+ 2 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1257:1\n46#2,5:1258\n46#2,3:1263\n50#2:1272\n46#2,3:1273\n50#2:1282\n46#2,5:1283\n46#2,5:1288\n46#2,5:1293\n33#3,6:1266\n33#3,6:1276\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n*L\n1090#1:1258,5\n1102#1:1263,3\n1102#1:1272\n1113#1:1273,3\n1113#1:1282\n1124#1:1283,5\n1138#1:1288,5\n1151#1:1293,5\n1103#1:1266,6\n1114#1:1276,6\n*E\n"})
    public static final class RememberEventDispatcher implements RememberManager {
        private final Set<RememberObserver> abandoning;
        private List<ComposeNodeLifecycleCallback> deactivating;
        private final List<RememberObserver> forgetting;
        private List<ComposeNodeLifecycleCallback> releasing;
        private final List<RememberObserver> remembering;
        private final List<Function0<Unit>> sideEffects;

        public RememberEventDispatcher(Set<RememberObserver> abandoning) {
            Intrinsics.checkNotNullParameter(abandoning, "abandoning");
            this.abandoning = abandoning;
            this.remembering = new ArrayList();
            this.forgetting = new ArrayList();
            this.sideEffects = new ArrayList();
        }

        @Override // androidx.compose.runtime.RememberManager
        public void deactivating(ComposeNodeLifecycleCallback instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            List arrayList = this.deactivating;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.deactivating = arrayList;
            }
            arrayList.add(instance);
        }

        public final void dispatchAbandons() {
            if (!this.abandoning.isEmpty()) {
                Object objBeginSection = Trace.INSTANCE.beginSection("Compose:abandons");
                try {
                    Iterator<RememberObserver> it = this.abandoning.iterator();
                    while (it.hasNext()) {
                        RememberObserver next = it.next();
                        it.remove();
                        next.onAbandoned();
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                    Trace.INSTANCE.endSection(objBeginSection);
                }
            }
        }

        public final void dispatchNodeCallbacks() {
            Object objBeginSection;
            List<ComposeNodeLifecycleCallback> list = this.deactivating;
            if (!(list == null || list.isEmpty())) {
                objBeginSection = Trace.INSTANCE.beginSection("Compose:deactivations");
                try {
                    for (int size = list.size() - 1; -1 < size; size--) {
                        list.get(size).onDeactivate();
                    }
                    Unit unit = Unit.INSTANCE;
                    Trace.INSTANCE.endSection(objBeginSection);
                    list.clear();
                } finally {
                }
            }
            List<ComposeNodeLifecycleCallback> list2 = this.releasing;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            objBeginSection = Trace.INSTANCE.beginSection("Compose:releases");
            try {
                for (int size2 = list2.size() - 1; -1 < size2; size2--) {
                    list2.get(size2).onRelease();
                }
                Unit unit2 = Unit.INSTANCE;
                Trace.INSTANCE.endSection(objBeginSection);
                list2.clear();
            } finally {
            }
        }

        public final void dispatchRememberObservers() {
            Object objBeginSection;
            if (!this.forgetting.isEmpty()) {
                objBeginSection = Trace.INSTANCE.beginSection("Compose:onForgotten");
                try {
                    for (int size = this.forgetting.size() - 1; -1 < size; size--) {
                        RememberObserver rememberObserver = this.forgetting.get(size);
                        if (!this.abandoning.contains(rememberObserver)) {
                            rememberObserver.onForgotten();
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                }
            }
            if (!this.remembering.isEmpty()) {
                objBeginSection = Trace.INSTANCE.beginSection("Compose:onRemembered");
                try {
                    List<RememberObserver> list = this.remembering;
                    int size2 = list.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        RememberObserver rememberObserver2 = list.get(i4);
                        this.abandoning.remove(rememberObserver2);
                        rememberObserver2.onRemembered();
                    }
                    Unit unit2 = Unit.INSTANCE;
                } finally {
                }
            }
        }

        public final void dispatchSideEffects() {
            if (!this.sideEffects.isEmpty()) {
                Object objBeginSection = Trace.INSTANCE.beginSection("Compose:sideeffects");
                try {
                    List<Function0<Unit>> list = this.sideEffects;
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        list.get(i4).invoke();
                    }
                    this.sideEffects.clear();
                    Unit unit = Unit.INSTANCE;
                } finally {
                    Trace.INSTANCE.endSection(objBeginSection);
                }
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public void forgetting(RememberObserver instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            int iLastIndexOf = this.remembering.lastIndexOf(instance);
            if (iLastIndexOf < 0) {
                this.forgetting.add(instance);
            } else {
                this.remembering.remove(iLastIndexOf);
                this.abandoning.remove(instance);
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public void releasing(ComposeNodeLifecycleCallback instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            List arrayList = this.releasing;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.releasing = arrayList;
            }
            arrayList.add(instance);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void remembering(RememberObserver instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            int iLastIndexOf = this.forgetting.lastIndexOf(instance);
            if (iLastIndexOf < 0) {
                this.remembering.add(instance);
            } else {
                this.forgetting.remove(iLastIndexOf);
                this.abandoning.remove(instance);
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public void sideEffect(Function0<Unit> effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            this.sideEffects.add(effect);
        }
    }

    public CompositionImpl(CompositionContext parent, Applier<?> applier, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(applier, "applier");
        this.parent = parent;
        this.applier = applier;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        HashSet<RememberObserver> hashSet = new HashSet<>();
        this.abandonSet = hashSet;
        SlotTable slotTable = new SlotTable();
        this.slotTable = slotTable;
        this.observations = new IdentityScopeMap<>();
        this.conditionallyInvalidatedScopes = new HashSet<>();
        this.derivedStates = new IdentityScopeMap<>();
        ArrayList arrayList = new ArrayList();
        this.changes = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.lateChanges = arrayList2;
        this.observationsProcessed = new IdentityScopeMap<>();
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        ComposerImpl composerImpl = new ComposerImpl(applier, parent, slotTable, hashSet, arrayList, arrayList2, this);
        parent.registerComposer$runtime_release(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = coroutineContext;
        this.isRoot = parent instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m8799getLambda1$runtime_release();
    }

    private final void abandonChanges() {
        this.pendingModifications.set(null);
        this.changes.clear();
        this.lateChanges.clear();
        this.abandonSet.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addPendingInvalidationsLocked(java.util.Set<? extends java.lang.Object> r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.addPendingInvalidationsLocked(java.util.Set, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [T, java.util.HashSet] */
    private static final void addPendingInvalidationsLocked$invalidate(CompositionImpl compositionImpl, boolean z3, Ref.ObjectRef<HashSet<RecomposeScopeImpl>> objectRef, Object obj) {
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = compositionImpl.observations;
        int iFind = identityScopeMap.find(obj);
        if (iFind >= 0) {
            IdentityArraySet identityArraySetScopeSetAt = identityScopeMap.scopeSetAt(iFind);
            int size = identityArraySetScopeSetAt.size();
            for (int i4 = 0; i4 < size; i4++) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) identityArraySetScopeSetAt.get(i4);
                if (!compositionImpl.observationsProcessed.remove(obj, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                    if (!recomposeScopeImpl.isConditional() || z3) {
                        HashSet<RecomposeScopeImpl> hashSet = objectRef.element;
                        HashSet<RecomposeScopeImpl> hashSet2 = hashSet;
                        if (hashSet == null) {
                            ?? hashSet3 = new HashSet();
                            objectRef.element = hashSet3;
                            hashSet2 = hashSet3;
                        }
                        hashSet2.add(recomposeScopeImpl);
                    } else {
                        compositionImpl.conditionallyInvalidatedScopes.add(recomposeScopeImpl);
                    }
                }
            }
        }
    }

    private final void applyChangesInLocked(List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> changes) {
        boolean zIsEmpty;
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        try {
            if (changes.isEmpty()) {
                if (zIsEmpty) {
                    return;
                } else {
                    return;
                }
            }
            Object objBeginSection = Trace.INSTANCE.beginSection("Compose:applyChanges");
            try {
                this.applier.onBeginChanges();
                SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                try {
                    Applier<?> applier = this.applier;
                    int size = changes.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        changes.get(i4).invoke(applier, slotWriterOpenWriter, rememberEventDispatcher);
                    }
                    changes.clear();
                    Unit unit = Unit.INSTANCE;
                    slotWriterOpenWriter.close();
                    this.applier.onEndChanges();
                    Trace trace = Trace.INSTANCE;
                    trace.endSection(objBeginSection);
                    rememberEventDispatcher.dispatchRememberObservers();
                    rememberEventDispatcher.dispatchNodeCallbacks();
                    rememberEventDispatcher.dispatchSideEffects();
                    if (this.pendingInvalidScopes) {
                        objBeginSection = trace.beginSection("Compose:unobserve");
                        try {
                            this.pendingInvalidScopes = false;
                            IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = this.observations;
                            int size2 = identityScopeMap.getSize();
                            int i5 = 0;
                            for (int i6 = 0; i6 < size2; i6++) {
                                int i7 = identityScopeMap.getValueOrder()[i6];
                                IdentityArraySet<RecomposeScopeImpl> identityArraySet = identityScopeMap.getScopeSets()[i7];
                                Intrinsics.checkNotNull(identityArraySet);
                                int size3 = identityArraySet.size();
                                int i8 = 0;
                                for (int i9 = 0; i9 < size3; i9++) {
                                    Object obj = identityArraySet.getValues()[i9];
                                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    if (!(!((RecomposeScopeImpl) obj).getValid())) {
                                        if (i8 != i9) {
                                            identityArraySet.getValues()[i8] = obj;
                                        }
                                        i8++;
                                    }
                                }
                                int size4 = identityArraySet.size();
                                for (int i10 = i8; i10 < size4; i10++) {
                                    identityArraySet.getValues()[i10] = null;
                                }
                                identityArraySet.setSize(i8);
                                if (identityArraySet.size() > 0) {
                                    if (i5 != i6) {
                                        int i11 = identityScopeMap.getValueOrder()[i5];
                                        identityScopeMap.getValueOrder()[i5] = i7;
                                        identityScopeMap.getValueOrder()[i6] = i11;
                                    }
                                    i5++;
                                }
                            }
                            int size5 = identityScopeMap.getSize();
                            for (int i12 = i5; i12 < size5; i12++) {
                                identityScopeMap.getValues()[identityScopeMap.getValueOrder()[i12]] = null;
                            }
                            identityScopeMap.setSize(i5);
                            cleanUpDerivedStateObservations();
                            Unit unit2 = Unit.INSTANCE;
                            Trace.INSTANCE.endSection(objBeginSection);
                        } finally {
                        }
                    }
                    if (this.lateChanges.isEmpty()) {
                        rememberEventDispatcher.dispatchAbandons();
                    }
                } catch (Throwable th) {
                    slotWriterOpenWriter.close();
                    throw th;
                }
            } finally {
            }
        } finally {
            if (this.lateChanges.isEmpty()) {
                rememberEventDispatcher.dispatchAbandons();
            }
        }
    }

    private final void cleanUpDerivedStateObservations() {
        IdentityScopeMap<DerivedState<?>> identityScopeMap = this.derivedStates;
        int size = identityScopeMap.getSize();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = identityScopeMap.getValueOrder()[i5];
            IdentityArraySet<DerivedState<?>> identityArraySet = identityScopeMap.getScopeSets()[i6];
            Intrinsics.checkNotNull(identityArraySet);
            int size2 = identityArraySet.size();
            int i7 = 0;
            for (int i8 = 0; i8 < size2; i8++) {
                Object obj = identityArraySet.getValues()[i8];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!(!this.observations.contains((DerivedState) obj))) {
                    if (i7 != i8) {
                        identityArraySet.getValues()[i7] = obj;
                    }
                    i7++;
                }
            }
            int size3 = identityArraySet.size();
            for (int i9 = i7; i9 < size3; i9++) {
                identityArraySet.getValues()[i9] = null;
            }
            identityArraySet.setSize(i7);
            if (identityArraySet.size() > 0) {
                if (i4 != i5) {
                    int i10 = identityScopeMap.getValueOrder()[i4];
                    identityScopeMap.getValueOrder()[i4] = i6;
                    identityScopeMap.getValueOrder()[i5] = i10;
                }
                i4++;
            }
        }
        int size4 = identityScopeMap.getSize();
        for (int i11 = i4; i11 < size4; i11++) {
            identityScopeMap.getValues()[identityScopeMap.getValueOrder()[i11]] = null;
        }
        identityScopeMap.setSize(i4);
        Iterator<RecomposeScopeImpl> it = this.conditionallyInvalidatedScopes.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator()");
        while (it.hasNext()) {
            if (!it.next().isConditional()) {
                it.remove();
            }
        }
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object andSet = this.pendingModifications.getAndSet(CompositionKt.PendingApplyNoModifications);
        if (andSet != null) {
            if (Intrinsics.areEqual(andSet, CompositionKt.PendingApplyNoModifications)) {
                ComposerKt.composeRuntimeError("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                addPendingInvalidationsLocked((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new KotlinNothingValueException();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, true);
            }
        }
    }

    private final void drainPendingModificationsLocked() {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (Intrinsics.areEqual(andSet, CompositionKt.PendingApplyNoModifications)) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, false);
            }
            return;
        }
        if (andSet == null) {
            ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
        throw new KotlinNothingValueException();
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime_release();
    }

    private final <T> T guardChanges(Function0<? extends T> block) throws Exception {
        try {
            try {
                T tInvoke = block.invoke();
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                return tInvoke;
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                InlineMarker.finallyEnd(1);
                throw th;
            }
        } catch (Exception e4) {
            abandonChanges();
            throw e4;
        }
    }

    private final <T> T guardInvalidationsLocked(Function1<? super IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>>, ? extends T> block) throws Exception {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMapTakeInvalidations = takeInvalidations();
        try {
            return block.invoke(identityArrayMapTakeInvalidations);
        } catch (Exception e4) {
            this.invalidations = identityArrayMapTakeInvalidations;
            throw e4;
        }
    }

    private final InvalidationResult invalidateChecked(RecomposeScopeImpl scope, Anchor anchor, Object instance) {
        synchronized (this.lock) {
            CompositionImpl compositionImpl = this.invalidationDelegate;
            if (compositionImpl == null || !this.slotTable.groupContainsAnchor(this.invalidationDelegateGroup, anchor)) {
                compositionImpl = null;
            }
            if (compositionImpl == null) {
                if (isComposing() && this.composer.tryImminentInvalidation$runtime_release(scope, instance)) {
                    return InvalidationResult.IMMINENT;
                }
                if (instance == null) {
                    this.invalidations.set(scope, null);
                } else {
                    CompositionKt.addValue(this.invalidations, scope, instance);
                }
            }
            if (compositionImpl != null) {
                return compositionImpl.invalidateChecked(scope, anchor, instance);
            }
            this.parent.invalidate$runtime_release(this);
            return isComposing() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
        }
    }

    private final void invalidateScopeOfLocked(Object value) {
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = this.observations;
        int iFind = identityScopeMap.find(value);
        if (iFind >= 0) {
            IdentityArraySet identityArraySetScopeSetAt = identityScopeMap.scopeSetAt(iFind);
            int size = identityArraySetScopeSetAt.size();
            for (int i4 = 0; i4 < size; i4++) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) identityArraySetScopeSetAt.get(i4);
                if (recomposeScopeImpl.invalidateForResult(value) == InvalidationResult.IMMINENT) {
                    this.observationsProcessed.add(value, recomposeScopeImpl);
                }
            }
        }
    }

    private final IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations() {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap = this.invalidations;
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        return identityArrayMap;
    }

    private final <T> T trackAbandonedValues(Function0<? extends T> block) {
        try {
            T tInvoke = block.invoke();
            InlineMarker.finallyStart(1);
            InlineMarker.finallyEnd(1);
            return tInvoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    private final void validateRecomposeScopeAnchors(SlotTable slotTable) {
        Object[] slots = slotTable.getSlots();
        ArrayList arrayList = new ArrayList();
        for (Object obj : slots) {
            RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList.get(i4);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null && !slotTable.slotsOf$runtime_release(anchor.toIndexFor(slotTable)).contains(recomposeScopeImpl2)) {
                throw new IllegalStateException(("Misaligned anchor " + anchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + ArraysKt___ArraysKt.indexOf((RecomposeScopeImpl[]) slotTable.getSlots(), recomposeScopeImpl2)).toString());
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.lock) {
            try {
                applyChangesInLocked(this.changes);
                drainPendingModificationsLocked();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                    }
                    throw th;
                } catch (Exception e4) {
                    abandonChanges();
                    throw e4;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        synchronized (this.lock) {
            try {
                if (!this.lateChanges.isEmpty()) {
                    applyChangesInLocked(this.lateChanges);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                    }
                    throw th;
                } catch (Exception e4) {
                    abandonChanges();
                    throw e4;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        synchronized (this.lock) {
            try {
                this.composer.changesApplied$runtime_release();
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                    }
                    throw th;
                } catch (Exception e4) {
                    abandonChanges();
                    throw e4;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        try {
            synchronized (this.lock) {
                drainPendingModificationsForCompositionLocked();
                IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMapTakeInvalidations = takeInvalidations();
                try {
                    this.composer.composeContent$runtime_release(identityArrayMapTakeInvalidations, content);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e4) {
                    this.invalidations = identityArrayMapTakeInvalidations;
                    throw e4;
                }
            }
        } finally {
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public <R> R delegateInvalidations(ControlledComposition to, int groupIndex, Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (to == null || Intrinsics.areEqual(to, this) || groupIndex < 0) {
            return block.invoke();
        }
        this.invalidationDelegate = (CompositionImpl) to;
        this.invalidationDelegateGroup = groupIndex;
        try {
            return block.invoke();
        } finally {
            this.invalidationDelegate = null;
            this.invalidationDelegateGroup = 0;
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized (this.lock) {
            if (!this.disposed) {
                this.disposed = true;
                this.composable = ComposableSingletons$CompositionKt.INSTANCE.m8800getLambda2$runtime_release();
                List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> deferredChanges$runtime_release = this.composer.getDeferredChanges$runtime_release();
                if (deferredChanges$runtime_release != null) {
                    applyChangesInLocked(deferredChanges$runtime_release);
                }
                boolean z3 = this.slotTable.getGroupsSize() > 0;
                if (z3 || (true ^ this.abandonSet.isEmpty())) {
                    RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                    if (z3) {
                        SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                        try {
                            ComposerKt.removeCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
                            Unit unit = Unit.INSTANCE;
                            slotWriterOpenWriter.close();
                            this.applier.clear();
                            rememberEventDispatcher.dispatchRememberObservers();
                            rememberEventDispatcher.dispatchNodeCallbacks();
                        } catch (Throwable th) {
                            slotWriterOpenWriter.close();
                            throw th;
                        }
                    }
                    rememberEventDispatcher.dispatchAbandons();
                }
                this.composer.dispose$runtime_release();
            }
            Unit unit2 = Unit.INSTANCE;
        }
        this.parent.unregisterComposition$runtime_release(this);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(MovableContentState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        SlotWriter slotWriterOpenWriter = state.getSlotTable().openWriter();
        try {
            ComposerKt.removeCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
            Unit unit = Unit.INSTANCE;
            slotWriterOpenWriter.close();
            rememberEventDispatcher.dispatchRememberObservers();
            rememberEventDispatcher.dispatchNodeCallbacks();
        } catch (Throwable th) {
            slotWriterOpenWriter.close();
            throw th;
        }
    }

    public final Function2<Composer, Integer, Unit> getComposable() {
        return this.composable;
    }

    public final List<RecomposeScopeImpl> getConditionalScopes$runtime_release() {
        return CollectionsKt___CollectionsKt.toList(this.conditionallyInvalidatedScopes);
    }

    public final List<Object> getDerivedStateDependencies$runtime_release() {
        return ArraysKt___ArraysKt.filterNotNull(this.derivedStates.getValues());
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z3;
        synchronized (this.lock) {
            z3 = this.invalidations.getSize() > 0;
        }
        return z3;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime_release;
        synchronized (this.lock) {
            hasPendingChanges$runtime_release = this.composer.getHasPendingChanges$runtime_release();
        }
        return hasPendingChanges$runtime_release;
    }

    public final List<Object> getObservedObjects$runtime_release() {
        return ArraysKt___ArraysKt.filterNotNull(this.observations.getValues());
    }

    /* renamed from: getPendingInvalidScopes$runtime_release, reason: from getter */
    public final boolean getPendingInvalidScopes() {
        return this.pendingInvalidScopes;
    }

    public final CoroutineContext getRecomposeContext() {
        CoroutineContext coroutineContext = this._recomposeContext;
        return coroutineContext == null ? this.parent.getRecomposeCoroutineContext$runtime_release() : coroutineContext;
    }

    /* renamed from: getSlotTable$runtime_release, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(List<Pair<MovableContentStateReference, MovableContentStateReference>> references) {
        Intrinsics.checkNotNullParameter(references, "references");
        int size = references.size();
        boolean z3 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                z3 = true;
                break;
            } else if (!Intrinsics.areEqual(references.get(i4).getFirst().getComposition(), this)) {
                break;
            } else {
                i4++;
            }
        }
        ComposerKt.runtimeCheck(z3);
        try {
            this.composer.insertMovableContentReferences(references);
            Unit unit = Unit.INSTANCE;
        } finally {
        }
    }

    public final InvalidationResult invalidate(RecomposeScopeImpl scope, Object instance) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (scope.getDefaultsInScope()) {
            scope.setDefaultsInvalid(true);
        }
        Anchor anchor = scope.getAnchor();
        return (anchor != null && this.slotTable.ownsAnchor(anchor) && anchor.getValid()) ? !anchor.getValid() ? InvalidationResult.IGNORED : !scope.getCanRecompose() ? InvalidationResult.IGNORED : invalidateChecked(scope, anchor, instance) : InvalidationResult.IGNORED;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        synchronized (this.lock) {
            for (Object obj : this.slotTable.getSlots()) {
                RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.invalidate();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void invalidateGroupsWithKey(int key) {
        List<RecomposeScopeImpl> listInvalidateGroupsWithKey$runtime_release;
        boolean z3;
        synchronized (this.lock) {
            listInvalidateGroupsWithKey$runtime_release = this.slotTable.invalidateGroupsWithKey$runtime_release(key);
        }
        boolean z4 = true;
        if (listInvalidateGroupsWithKey$runtime_release != null) {
            int size = listInvalidateGroupsWithKey$runtime_release.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z3 = false;
                    break;
                }
                if (listInvalidateGroupsWithKey$runtime_release.get(i4).invalidateForResult(null) == InvalidationResult.IGNORED) {
                    z3 = true;
                    break;
                }
                i4++;
            }
            if (!z3) {
                z4 = false;
            }
        }
        if (z4 && this.composer.forceRecomposeScopes$runtime_release()) {
            this.parent.invalidate$runtime_release(this);
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.getIsComposing();
    }

    @Override // androidx.compose.runtime.Composition
    /* renamed from: isDisposed, reason: from getter */
    public boolean getDisposed() {
        return this.disposed;
    }

    /* renamed from: isRoot, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean observesAnyOf(Set<? extends Object> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        for (Object obj : values) {
            if (this.observations.contains(obj) || this.derivedStates.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.composer.prepareCompose$runtime_release(block);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        boolean zRecompose$runtime_release;
        synchronized (this.lock) {
            drainPendingModificationsForCompositionLocked();
            try {
                IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMapTakeInvalidations = takeInvalidations();
                try {
                    zRecompose$runtime_release = this.composer.recompose$runtime_release(identityArrayMapTakeInvalidations);
                    if (!zRecompose$runtime_release) {
                        drainPendingModificationsLocked();
                    }
                } catch (Exception e4) {
                    this.invalidations = identityArrayMapTakeInvalidations;
                    throw e4;
                }
            } finally {
            }
        }
        return zRecompose$runtime_release;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set[]] */
    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(Set<? extends Object> values) {
        Object obj;
        Set<? extends Object> setPlus;
        Intrinsics.checkNotNullParameter(values, "values");
        do {
            obj = this.pendingModifications.get();
            if (obj == null ? true : Intrinsics.areEqual(obj, CompositionKt.PendingApplyNoModifications)) {
                setPlus = values;
            } else if (obj instanceof Set) {
                setPlus = new Set[]{(Set) obj, values};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                setPlus = ArraysKt___ArraysJvmKt.plus((Set<? extends Object>[]) obj, values);
            }
        } while (!AbstractC0369d.m147a(this.pendingModifications, obj, setPlus));
        if (obj == null) {
            synchronized (this.lock) {
                drainPendingModificationsLocked();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordReadOf(Object value) {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        Intrinsics.checkNotNullParameter(value, "value");
        if (getAreChildrenComposing() || (currentRecomposeScope$runtime_release = this.composer.getCurrentRecomposeScope$runtime_release()) == null) {
            return;
        }
        currentRecomposeScope$runtime_release.setUsed(true);
        this.observations.add(value, currentRecomposeScope$runtime_release);
        if (value instanceof DerivedState) {
            this.derivedStates.removeScope(value);
            for (Object obj : ((DerivedState) value).getDependencies()) {
                if (obj == null) {
                    break;
                }
                this.derivedStates.add(obj, value);
            }
        }
        currentRecomposeScope$runtime_release.recordRead(value);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordWriteOf(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.lock) {
            invalidateScopeOfLocked(value);
            IdentityScopeMap<DerivedState<?>> identityScopeMap = this.derivedStates;
            int iFind = identityScopeMap.find(value);
            if (iFind >= 0) {
                IdentityArraySet identityArraySetScopeSetAt = identityScopeMap.scopeSetAt(iFind);
                int size = identityArraySetScopeSetAt.size();
                for (int i4 = 0; i4 < size; i4++) {
                    invalidateScopeOfLocked((DerivedState) identityArraySetScopeSetAt.get(i4));
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void removeDerivedStateObservation$runtime_release(DerivedState<?> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.observations.contains(state)) {
            return;
        }
        this.derivedStates.removeScope(state);
    }

    public final void removeObservation$runtime_release(Object instance, RecomposeScopeImpl scope) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.observations.remove(instance, scope);
    }

    public final void setComposable(Function2<? super Composer, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.composable = function2;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (!(!this.disposed)) {
            throw new IllegalStateException("The composition is disposed".toString());
        }
        this.composable = content;
        this.parent.composeInitial$runtime_release(this, content);
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z3) {
        this.pendingInvalidScopes = z3;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized (this.lock) {
            if (!isComposing()) {
                this.composer.verifyConsistent$runtime_release();
                this.slotTable.verifyWellFormed();
                validateRecomposeScopeAnchors(this.slotTable);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, CoroutineContext coroutineContext, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier, (i4 & 4) != 0 ? null : coroutineContext);
    }
}
