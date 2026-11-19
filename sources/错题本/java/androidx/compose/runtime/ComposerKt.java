package androidx.compose.runtime;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000º\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\u0005H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\r\u001a'\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a/\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010!\u001a\u00020\f*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\u001a>\u0010(\u001a\u00020\f\"\u0004\b\u0000\u0010#*\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010$2\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u00000&H\u0080\b¢\u0006\u0004\b(\u0010)\u001a\u001b\u0010*\u001a\u00020\f*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b*\u0010\"\u001a%\u0010.\u001a\u00020\f*\u00020\u001e2\u0006\u0010+\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b.\u0010/\u001a7\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000103\"\b\b\u0000\u00100*\u00020,\"\b\b\u0001\u00101*\u00020,2\u0006\u00102\u001a\u00020\u000eH\u0002¢\u0006\u0004\b4\u00105\u001a/\u00109\u001a\u0004\u0018\u00010,2\b\u00106\u001a\u0004\u0018\u00010,2\b\u00107\u001a\u0004\u0018\u00010,2\b\u00108\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b9\u0010:\u001a!\u0010>\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010=\u001a\u00020\u000eH\u0002¢\u0006\u0004\b>\u0010?\u001a!\u0010@\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010=\u001a\u00020\u000eH\u0002¢\u0006\u0004\b@\u0010?\u001a3\u0010D\u001a\u00020\f*\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010=\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020A2\b\u0010C\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\bD\u0010E\u001a+\u0010H\u001a\u0004\u0018\u00010<*\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010F\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\u000eH\u0002¢\u0006\u0004\bH\u0010I\u001a#\u0010J\u001a\u0004\u0018\u00010<*\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010=\u001a\u00020\u000eH\u0002¢\u0006\u0004\bJ\u0010K\u001a)\u0010L\u001a\u00020\f*\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010F\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\u000eH\u0002¢\u0006\u0004\bL\u0010M\u001a/\u0010N\u001a\b\u0012\u0004\u0012\u00020<0;*\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010F\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\u000eH\u0002¢\u0006\u0004\bN\u0010O\u001a\u0013\u0010P\u001a\u00020\u000e*\u00020\u0002H\u0002¢\u0006\u0004\bP\u0010Q\u001a\u0013\u0010R\u001a\u00020\u0002*\u00020\u000eH\u0002¢\u0006\u0004\bR\u0010S\u001a#\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0U*\u00020T2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\bV\u0010W\u001a#\u0010Z\u001a\u00020\u000e*\u00020X2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\u000eH\u0002¢\u0006\u0004\bZ\u0010[\u001a+\u0010_\u001a\u00020\u000e*\u00020X2\u0006\u0010\\\u001a\u00020\u000e2\u0006\u0010]\u001a\u00020\u000e2\u0006\u0010^\u001a\u00020\u000eH\u0002¢\u0006\u0004\b_\u0010`\u001a1\u0010b\u001a\u00020\f2\u0006\u00106\u001a\u00020\u00022\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\bb\u0010c\u001a&\u0010d\u001a\u00020\f2\u0006\u00106\u001a\u00020\u00022\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0080\b¢\u0006\u0004\bd\u0010c\u001a\u0018\u0010d\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bd\u0010e\u001a\u0018\u0010b\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bb\u0010e\u001a\u0017\u0010h\u001a\u00020g2\u0006\u0010f\u001a\u00020\nH\u0000¢\u0006\u0004\bh\u0010i\u001a\u0017\u0010j\u001a\u00020\f2\u0006\u0010f\u001a\u00020\nH\u0000¢\u0006\u0004\bj\u0010k\u001a5\u0010t\u001a\u00020s2\u0006\u0010m\u001a\u00020l2\u0006\u0010o\u001a\u00020n2\u0006\u0010p\u001a\u00020\u001e2\f\u0010r\u001a\b\u0012\u0002\b\u0003\u0018\u00010qH\u0000¢\u0006\u0004\bt\u0010u\"\u001e\u0010w\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bw\u0010x\u0012\u0004\by\u0010\u001b\"\u0014\u0010z\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\bz\u0010{\"\u0014\u0010|\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b|\u0010{\"\u0014\u0010}\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b}\u0010{\"\u001a\u0010~\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\f\n\u0004\b~\u0010{\u0012\u0004\b\u007f\u0010\u001b\"&\u0010\u0080\u0001\u001a\u00020,8\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u0012\u0005\b\u0084\u0001\u0010\u001b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u001d\u0010\u0085\u0001\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010{\u0012\u0005\b\u0086\u0001\u0010\u001b\"&\u0010\u0087\u0001\u001a\u00020,8\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b\u0087\u0001\u0010\u0081\u0001\u0012\u0005\b\u0089\u0001\u0010\u001b\u001a\u0006\b\u0088\u0001\u0010\u0083\u0001\"\u001d\u0010\u008a\u0001\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010{\u0012\u0005\b\u008b\u0001\u0010\u001b\"&\u0010\u008c\u0001\u001a\u00020,8\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b\u008c\u0001\u0010\u0081\u0001\u0012\u0005\b\u008e\u0001\u0010\u001b\u001a\u0006\b\u008d\u0001\u0010\u0083\u0001\"\u001d\u0010\u008f\u0001\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010{\u0012\u0005\b\u0090\u0001\u0010\u001b\"&\u0010\u0091\u0001\u001a\u00020,8\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b\u0091\u0001\u0010\u0081\u0001\u0012\u0005\b\u0093\u0001\u0010\u001b\u001a\u0006\b\u0092\u0001\u0010\u0083\u0001\"\u001d\u0010\u0094\u0001\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010{\u0012\u0005\b\u0095\u0001\u0010\u001b\"&\u0010\u0096\u0001\u001a\u00020,8\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b\u0096\u0001\u0010\u0081\u0001\u0012\u0005\b\u0098\u0001\u0010\u001b\u001a\u0006\b\u0097\u0001\u0010\u0083\u0001\"\u001d\u0010\u0099\u0001\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010{\u0012\u0005\b\u009a\u0001\u0010\u001b\"$\u0010o\u001a\u00020,8\u0000X\u0081\u0004¢\u0006\u0016\n\u0005\bo\u0010\u0081\u0001\u0012\u0005\b\u009c\u0001\u0010\u001b\u001a\u0006\b\u009b\u0001\u0010\u0083\u0001\"\u001d\u0010\u009d\u0001\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010{\u0012\u0005\b\u009e\u0001\u0010\u001b\"\u0016\u0010\u009f\u0001\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u009f\u0001\u0010{\"\u0017\u0010 \u0001\u001a\u00020\u00028\u0000X\u0080T¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001\"\u001e\u0010£\u0001\u001a\t\u0012\u0004\u0012\u00020<0¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001\"\u001b\u0010§\u0001\u001a\u00020\u000e*\u00020\u001e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u001b\u0010¨\u0001\u001a\u00020\u0002*\u00020\u001e8@X\u0080\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001\"\u001b\u0010¨\u0001\u001a\u00020\u0002*\u00020X8@X\u0080\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010ª\u0001\"\u001c\u0010®\u0001\u001a\u00020,*\u00030«\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001¨\u0006¯\u0001"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/Composer;", "", "invalid", "Lkotlin/Function0;", "Landroidx/compose/runtime/DisallowComposableCalls;", "block", "cache", "(Landroidx/compose/runtime/Composer;ZLr6/a;)Ljava/lang/Object;", "composer", "", "sourceInformation", "Ld6/s;", "(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V", "", "key", "sourceInformationMarkerStart", "(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V", "isTraceInProgress", "()Z", "info", "traceEventStart", "(ILjava/lang/String;)V", "dirty1", "dirty2", "(IIILjava/lang/String;)V", "traceEventEnd", "()V", "sourceInformationMarkerEnd", "(Landroidx/compose/runtime/Composer;)V", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "removeCurrentGroup", "(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "R", "Landroidx/compose/runtime/Anchor;", "anchor", "Lkotlin/Function2;", "cb", "withAfterAnchorInfo", "(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Anchor;Lr6/e;)V", "deactivateCurrentGroup", "index", "", "data", "removeData", "(Landroidx/compose/runtime/SlotWriter;ILjava/lang/Object;)V", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "initialCapacity", "Landroidx/compose/runtime/collection/MultiValueMap;", "multiMap", "(I)Landroidx/collection/MutableScatterMap;", "value", "left", "right", "getKey", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/Invalidation;", RequestParameters.SUBRESOURCE_LOCATION, "findLocation", "(Ljava/util/List;I)I", "findInsertLocation", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "instance", "insertIfMissing", "(Ljava/util/List;ILandroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)V", "start", "end", "firstInRange", "(Ljava/util/List;II)Landroidx/compose/runtime/Invalidation;", "removeLocation", "(Ljava/util/List;I)Landroidx/compose/runtime/Invalidation;", "removeRange", "(Ljava/util/List;II)V", "filterToRange", "(Ljava/util/List;II)Ljava/util/List;", "asInt", "(Z)I", "asBool", "(I)Z", "Landroidx/compose/runtime/SlotTable;", "", "collectNodesFrom", "(Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/Anchor;)Ljava/util/List;", "Landroidx/compose/runtime/SlotReader;", "root", "distanceFrom", "(Landroidx/compose/runtime/SlotReader;II)I", "a", "b", "common", "nearestCommonRootOf", "(Landroidx/compose/runtime/SlotReader;III)I", "lazyMessage", "runtimeCheck", "(ZLr6/a;)V", "debugRuntimeCheck", "(Z)V", "message", "", "composeRuntimeError", "(Ljava/lang/String;)Ljava/lang/Void;", "composeImmediateRuntimeError", "(Ljava/lang/String;)V", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Landroidx/compose/runtime/MovableContentStateReference;", TypedValues.Custom.S_REFERENCE, "slots", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/MovableContentState;", "extractMovableContentAtCurrent", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Applier;)Landroidx/compose/runtime/MovableContentState;", "Landroidx/compose/runtime/CompositionTracer;", "compositionTracer", "Landroidx/compose/runtime/CompositionTracer;", "getCompositionTracer$annotations", "rootKey", "I", "nodeKey", "defaultsKey", "invocationKey", "getInvocationKey$annotations", "invocation", "Ljava/lang/Object;", "getInvocation", "()Ljava/lang/Object;", "getInvocation$annotations", "providerKey", "getProviderKey$annotations", "provider", "getProvider", "getProvider$annotations", "compositionLocalMapKey", "getCompositionLocalMapKey$annotations", "compositionLocalMap", "getCompositionLocalMap", "getCompositionLocalMap$annotations", "providerValuesKey", "getProviderValuesKey$annotations", "providerValues", "getProviderValues", "getProviderValues$annotations", "providerMapsKey", "getProviderMapsKey$annotations", "providerMaps", "getProviderMaps", "getProviderMaps$annotations", "referenceKey", "getReferenceKey$annotations", "getReference", "getReference$annotations", "reuseKey", "getReuseKey$annotations", "invalidGroupLocation", "EnableDebugRuntimeChecks", "Z", "Ljava/util/Comparator;", "InvalidationLocationAscending", "Ljava/util/Comparator;", "getNextGroup", "(Landroidx/compose/runtime/SlotWriter;)I", "nextGroup", "isAfterFirstChild", "(Landroidx/compose/runtime/SlotWriter;)Z", "(Landroidx/compose/runtime/SlotReader;)Z", "Landroidx/compose/runtime/KeyInfo;", "getJoinedKey", "(Landroidx/compose/runtime/KeyInfo;)Ljava/lang/Object;", "joinedKey", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,4891:1\n4341#1,8:4898\n4341#1,8:4912\n4643#1,5:4921\n4658#1,4:4933\n4643#1,5:4937\n1#2:4892\n1#2:4946\n1#2:4954\n2043#3,5:4893\n2049#3:4906\n2043#3,5:4907\n2049#3:4920\n158#4,7:4926\n174#4,4:4942\n179#4,3:4947\n174#4,4:4950\n179#4,3:4955\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n4328#1:4898,8\n4375#1:4912,8\n4395#1:4921,5\n4663#1:4933,4\n4665#1:4937,5\n4755#1:4946\n4815#1:4954\n4319#1:4893,5\n4319#1:4906\n4362#1:4907,5\n4362#1:4920\n4508#1:4926,7\n4755#1:4942,4\n4755#1:4947,3\n4815#1:4950,4\n4815#1:4955,3\n*E\n"})
/* loaded from: classes.dex */
public final class ComposerKt {
    public static final boolean EnableDebugRuntimeChecks = false;
    public static final int compositionLocalMapKey = 202;

    @Nullable
    private static CompositionTracer compositionTracer = null;
    private static final int defaultsKey = -127;
    private static final int invalidGroupLocation = -2;
    public static final int invocationKey = 200;
    private static final int nodeKey = 125;
    public static final int providerKey = 201;
    public static final int providerMapsKey = 204;
    public static final int providerValuesKey = 203;
    public static final int referenceKey = 206;
    public static final int reuseKey = 207;
    private static final int rootKey = 100;

    @NotNull
    private static final Object invocation = new OpaqueKey("provider");

    @NotNull
    private static final Object provider = new OpaqueKey("provider");

    @NotNull
    private static final Object compositionLocalMap = new OpaqueKey("compositionLocalMap");

    @NotNull
    private static final Object providerValues = new OpaqueKey("providerValues");

    @NotNull
    private static final Object providerMaps = new OpaqueKey("providers");

    @NotNull
    private static final Object reference = new OpaqueKey(TypedValues.Custom.S_REFERENCE);

    @NotNull
    private static final Comparator<Invalidation> InvalidationLocationAscending = new C2024a();

    /* JADX INFO: Access modifiers changed from: private */
    public static final int InvalidationLocationAscending$lambda$16(Invalidation invalidation, Invalidation invalidation2) {
        return AbstractC5830k.m5332i(invalidation.getLocation(), invalidation2.getLocation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBool(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int asInt(boolean z8) {
        return z8 ? 1 : 0;
    }

    @ComposeCompilerApi
    public static final <T> T cache(@NotNull Composer composer, boolean z8, @NotNull InterfaceC6469a interfaceC6469a) {
        T t8 = (T) composer.rememberedValue();
        if (!z8 && t8 != Composer.INSTANCE.getEmpty()) {
            return t8;
        }
        T t9 = (T) interfaceC6469a.invoke();
        composer.updateRememberedValue(t9);
        return t9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> collectNodesFrom(SlotTable slotTable, Anchor anchor) {
        ArrayList arrayList = new ArrayList();
        SlotReader slotReaderOpenReader = slotTable.openReader();
        try {
            collectNodesFrom$lambda$10$collectFromGroup(slotReaderOpenReader, arrayList, slotTable.anchorIndex(anchor));
            return arrayList;
        } finally {
            slotReaderOpenReader.close();
        }
    }

    private static final void collectNodesFrom$lambda$10$collectFromGroup(SlotReader slotReader, List<Object> list, int i) {
        if (slotReader.isNode(i)) {
            list.add(slotReader.node(i));
            return;
        }
        int iGroupSize = i + 1;
        int iGroupSize2 = slotReader.groupSize(i) + i;
        while (iGroupSize < iGroupSize2) {
            collectNodesFrom$lambda$10$collectFromGroup(slotReader, list, iGroupSize);
            iGroupSize += slotReader.groupSize(iGroupSize);
        }
    }

    public static final void composeImmediateRuntimeError(@NotNull String str) {
        throw new ComposeRuntimeError(AbstractC0037f.m86k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    @NotNull
    public static final Void composeRuntimeError(@NotNull String str) {
        throw new ComposeRuntimeError(AbstractC0037f.m86k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void deactivateCurrentGroup(@NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
        int slotsSize;
        int iDataIndex = slotWriter.dataIndex(slotWriter.groups, slotWriter.groupIndexToAddress(slotWriter.groupSize(slotWriter.getCurrentGroup()) + slotWriter.getCurrentGroup()));
        for (int iDataIndex2 = slotWriter.dataIndex(slotWriter.groups, slotWriter.groupIndexToAddress(slotWriter.getCurrentGroup())); iDataIndex2 < iDataIndex; iDataIndex2++) {
            Object obj = slotWriter.slots[slotWriter.dataIndexToDataAddress(iDataIndex2)];
            int iAnchorIndex = -1;
            if (obj instanceof ComposeNodeLifecycleCallback) {
                rememberManager.deactivating((ComposeNodeLifecycleCallback) obj, slotWriter.getSlotsSize() - iDataIndex2, -1, -1);
            } else if (obj instanceof RememberObserverHolder) {
                RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
                if (!(rememberObserverHolder.getWrapped() instanceof ReusableRememberObserver)) {
                    removeData(slotWriter, iDataIndex2, obj);
                    int slotsSize2 = slotWriter.getSlotsSize() - iDataIndex2;
                    Anchor after = rememberObserverHolder.getAfter();
                    if (after == null || !after.getValid()) {
                        slotsSize = -1;
                    } else {
                        iAnchorIndex = slotWriter.anchorIndex(after);
                        slotsSize = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime_release(iAnchorIndex);
                    }
                    rememberManager.forgetting(rememberObserverHolder, slotsSize2, iAnchorIndex, slotsSize);
                }
            } else if (obj instanceof RecomposeScopeImpl) {
                removeData(slotWriter, iDataIndex2, obj);
                ((RecomposeScopeImpl) obj).release();
            }
        }
    }

    public static final void debugRuntimeCheck(boolean z8) {
    }

    private static final int distanceFrom(SlotReader slotReader, int i, int i8) {
        int i9 = 0;
        while (i > 0 && i != i8) {
            i = slotReader.parent(i);
            i9++;
        }
        return i9;
    }

    @NotNull
    public static final MovableContentState extractMovableContentAtCurrent(@NotNull final ControlledComposition controlledComposition, @NotNull final MovableContentStateReference movableContentStateReference, @NotNull SlotWriter slotWriter, @Nullable Applier<?> applier) {
        SlotTable slotTable = new SlotTable();
        if (slotWriter.getCollectingSourceInformation()) {
            slotTable.collectSourceInformation();
        }
        if (slotWriter.getCollectingCalledInformation()) {
            slotTable.collectCalledByInformation();
        }
        int currentGroup = slotWriter.getCurrentGroup();
        if (applier != null && slotWriter.nodeCount(currentGroup) > 0) {
            int parent = slotWriter.getParent();
            while (parent > 0 && !slotWriter.isNode(parent)) {
                parent = slotWriter.parent(parent);
            }
            if (parent >= 0 && slotWriter.isNode(parent)) {
                Object objNode = slotWriter.node(parent);
                int i = parent + 1;
                int iGroupSize = slotWriter.groupSize(parent) + parent;
                int iNodeCount = 0;
                while (i < iGroupSize) {
                    int iGroupSize2 = slotWriter.groupSize(i) + i;
                    if (iGroupSize2 > currentGroup) {
                        break;
                    }
                    iNodeCount += slotWriter.isNode(i) ? 1 : slotWriter.nodeCount(i);
                    i = iGroupSize2;
                }
                int iNodeCount2 = slotWriter.isNode(currentGroup) ? 1 : slotWriter.nodeCount(currentGroup);
                applier.down(objNode);
                applier.remove(iNodeCount, iNodeCount2);
                applier.mo1095up();
            }
        }
        SlotWriter slotWriterOpenWriter = slotTable.openWriter();
        try {
            slotWriterOpenWriter.beginInsert();
            slotWriterOpenWriter.startGroup(MovableContentKt.movableContentKey, movableContentStateReference.getContent$runtime_release());
            SlotWriter.markGroup$default(slotWriterOpenWriter, 0, 1, null);
            slotWriterOpenWriter.update(movableContentStateReference.getParameter());
            List<Anchor> listMoveTo = slotWriter.moveTo(movableContentStateReference.getAnchor(), 1, slotWriterOpenWriter);
            slotWriterOpenWriter.skipGroup();
            slotWriterOpenWriter.endGroup();
            slotWriterOpenWriter.endInsert();
            slotWriterOpenWriter.close(true);
            MovableContentState movableContentState = new MovableContentState(slotTable);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.INSTANCE;
            if (!companion.hasAnchoredRecomposeScopes$runtime_release(slotTable, listMoveTo)) {
                return movableContentState;
            }
            RecomposeScopeOwner recomposeScopeOwner = new RecomposeScopeOwner() { // from class: androidx.compose.runtime.ComposerKt$extractMovableContentAtCurrent$movableContentRecomposeScopeOwner$1
                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public InvalidationResult invalidate(RecomposeScopeImpl scope, Object instance) {
                    InvalidationResult invalidationResultInvalidate;
                    ControlledComposition controlledComposition2 = controlledComposition;
                    RecomposeScopeOwner recomposeScopeOwner2 = controlledComposition2 instanceof RecomposeScopeOwner ? (RecomposeScopeOwner) controlledComposition2 : null;
                    if (recomposeScopeOwner2 == null || (invalidationResultInvalidate = recomposeScopeOwner2.invalidate(scope, instance)) == null) {
                        invalidationResultInvalidate = InvalidationResult.IGNORED;
                    }
                    if (invalidationResultInvalidate != InvalidationResult.IGNORED) {
                        return invalidationResultInvalidate;
                    }
                    MovableContentStateReference movableContentStateReference2 = movableContentStateReference;
                    movableContentStateReference2.setInvalidations$runtime_release(AbstractC5805t.m5239s0(movableContentStateReference2.getInvalidations$runtime_release(), new Pair(scope, instance)));
                    return InvalidationResult.SCHEDULED;
                }

                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public void recomposeScopeReleased(RecomposeScopeImpl scope) {
                }

                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public void recordReadOf(Object value) {
                }
            };
            slotWriterOpenWriter = slotTable.openWriter();
            try {
                companion.adoptAnchoredScopes$runtime_release(slotWriterOpenWriter, listMoveTo, recomposeScopeOwner);
                slotWriterOpenWriter.close(true);
                return movableContentState;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Invalidation> filterToRange(List<Invalidation> list, int i, int i8) {
        ArrayList arrayList = new ArrayList();
        for (int iFindInsertLocation = findInsertLocation(list, i); iFindInsertLocation < list.size(); iFindInsertLocation++) {
            Invalidation invalidation = list.get(iFindInsertLocation);
            if (invalidation.getLocation() >= i8) {
                break;
            }
            arrayList.add(invalidation);
        }
        return arrayList;
    }

    private static final int findInsertLocation(List<Invalidation> list, int i) {
        int iFindLocation = findLocation(list, i);
        return iFindLocation < 0 ? -(iFindLocation + 1) : iFindLocation;
    }

    private static final int findLocation(List<Invalidation> list, int i) {
        int size = list.size() - 1;
        int i8 = 0;
        while (i8 <= size) {
            int i9 = (i8 + size) >>> 1;
            int iM5332i = AbstractC5830k.m5332i(list.get(i9).getLocation(), i);
            if (iM5332i < 0) {
                i8 = i9 + 1;
            } else {
                if (iM5332i <= 0) {
                    return i9;
                }
                size = i9 - 1;
            }
        }
        return -(i8 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation firstInRange(List<Invalidation> list, int i, int i8) {
        int iFindInsertLocation = findInsertLocation(list, i);
        if (iFindInsertLocation >= list.size()) {
            return null;
        }
        Invalidation invalidation = list.get(iFindInsertLocation);
        if (invalidation.getLocation() < i8) {
            return invalidation;
        }
        return null;
    }

    @NotNull
    public static final Object getCompositionLocalMap() {
        return compositionLocalMap;
    }

    @PublishedApi
    public static /* synthetic */ void getCompositionLocalMap$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getCompositionLocalMapKey$annotations() {
    }

    private static /* synthetic */ void getCompositionTracer$annotations() {
    }

    @NotNull
    public static final Object getInvocation() {
        return invocation;
    }

    @PublishedApi
    public static /* synthetic */ void getInvocation$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getInvocationKey$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getJoinedKey(KeyInfo keyInfo) {
        return keyInfo.getObjectKey() != null ? new JoinedKey(Integer.valueOf(keyInfo.getKey()), keyInfo.getObjectKey()) : Integer.valueOf(keyInfo.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getKey(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey = obj instanceof JoinedKey ? (JoinedKey) obj : null;
        if (joinedKey == null) {
            return null;
        }
        if (AbstractC5830k.m5325b(joinedKey.getLeft(), obj2) && AbstractC5830k.m5325b(joinedKey.getRight(), obj3)) {
            return obj;
        }
        Object key = getKey(joinedKey.getLeft(), obj2, obj3);
        return key == null ? getKey(joinedKey.getRight(), obj2, obj3) : key;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getNextGroup(SlotWriter slotWriter) {
        return slotWriter.groupSize(slotWriter.getCurrentGroup()) + slotWriter.getCurrentGroup();
    }

    @NotNull
    public static final Object getProvider() {
        return provider;
    }

    @PublishedApi
    public static /* synthetic */ void getProvider$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProviderKey$annotations() {
    }

    @NotNull
    public static final Object getProviderMaps() {
        return providerMaps;
    }

    @PublishedApi
    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    @NotNull
    public static final Object getProviderValues() {
        return providerValues;
    }

    @PublishedApi
    public static /* synthetic */ void getProviderValues$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

    @NotNull
    public static final Object getReference() {
        return reference;
    }

    @PublishedApi
    public static /* synthetic */ void getReference$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getReferenceKey$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getReuseKey$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertIfMissing(List<Invalidation> list, int i, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int iFindLocation = findLocation(list, i);
        if (iFindLocation < 0) {
            int i8 = -(iFindLocation + 1);
            if (!(obj instanceof DerivedState)) {
                obj = null;
            }
            list.add(i8, new Invalidation(recomposeScopeImpl, i, obj));
            return;
        }
        Invalidation invalidation = list.get(iFindLocation);
        if (!(obj instanceof DerivedState)) {
            invalidation.setInstances(null);
            return;
        }
        Object instances = invalidation.getInstances();
        if (instances == null) {
            invalidation.setInstances(obj);
        } else if (instances instanceof MutableScatterSet) {
            ((MutableScatterSet) instances).add(obj);
        } else {
            invalidation.setInstances(ScatterSetKt.mutableScatterSetOf(instances, obj));
        }
    }

    public static final boolean isAfterFirstChild(@NotNull SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() > slotWriter.getParent() + 1;
    }

    @ComposeCompilerApi
    public static final boolean isTraceInProgress() {
        CompositionTracer compositionTracer2 = compositionTracer;
        return compositionTracer2 != null && compositionTracer2.isTraceInProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> MutableScatterMap<Object, Object> multiMap(int i) {
        return MultiValueMap.m10187constructorimpl(new MutableScatterMap(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nearestCommonRootOf(SlotReader slotReader, int i, int i8, int i9) {
        if (i != i8) {
            if (i == i9 || i8 == i9) {
                return i9;
            }
            if (slotReader.parent(i) == i8) {
                return i8;
            }
            if (slotReader.parent(i8) != i) {
                if (slotReader.parent(i) == slotReader.parent(i8)) {
                    return slotReader.parent(i);
                }
                int iDistanceFrom = distanceFrom(slotReader, i, i9);
                int iDistanceFrom2 = distanceFrom(slotReader, i8, i9);
                int i10 = iDistanceFrom - iDistanceFrom2;
                for (int i11 = 0; i11 < i10; i11++) {
                    i = slotReader.parent(i);
                }
                int i12 = iDistanceFrom2 - iDistanceFrom;
                for (int i13 = 0; i13 < i12; i13++) {
                    i8 = slotReader.parent(i8);
                }
                while (i != i8) {
                    i = slotReader.parent(i);
                    i8 = slotReader.parent(i8);
                }
                return i;
            }
        }
        return i;
    }

    public static final void removeCurrentGroup(@NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
        int slotsSize;
        int iDataIndex = slotWriter.dataIndex(slotWriter.groups, slotWriter.groupIndexToAddress(slotWriter.groupSize(slotWriter.getCurrentGroup()) + slotWriter.getCurrentGroup()));
        for (int iDataIndex2 = slotWriter.dataIndex(slotWriter.groups, slotWriter.groupIndexToAddress(slotWriter.getCurrentGroup())); iDataIndex2 < iDataIndex; iDataIndex2++) {
            Object obj = slotWriter.slots[slotWriter.dataIndexToDataAddress(iDataIndex2)];
            int iAnchorIndex = -1;
            if (obj instanceof ComposeNodeLifecycleCallback) {
                rememberManager.releasing((ComposeNodeLifecycleCallback) obj, slotWriter.getSlotsSize() - iDataIndex2, -1, -1);
            }
            if (obj instanceof RememberObserverHolder) {
                int slotsSize2 = slotWriter.getSlotsSize() - iDataIndex2;
                RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
                Anchor after = rememberObserverHolder.getAfter();
                if (after == null || !after.getValid()) {
                    slotsSize = -1;
                } else {
                    iAnchorIndex = slotWriter.anchorIndex(after);
                    slotsSize = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime_release(iAnchorIndex);
                }
                rememberManager.forgetting(rememberObserverHolder, slotsSize2, iAnchorIndex, slotsSize);
            }
            if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).release();
            }
        }
        slotWriter.removeGroup();
    }

    private static final void removeData(SlotWriter slotWriter, int i, Object obj) {
        Object objClear = slotWriter.clear(i);
        if (obj == objClear) {
            return;
        }
        composeImmediateRuntimeError("Slot table is out of sync (expected " + obj + ", got " + objClear + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation removeLocation(List<Invalidation> list, int i) {
        int iFindLocation = findLocation(list, i);
        if (iFindLocation >= 0) {
            return list.remove(iFindLocation);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeRange(List<Invalidation> list, int i, int i8) {
        int iFindInsertLocation = findInsertLocation(list, i);
        while (iFindInsertLocation < list.size() && list.get(iFindInsertLocation).getLocation() < i8) {
            list.remove(iFindInsertLocation);
        }
    }

    public static final void runtimeCheck(boolean z8, @NotNull InterfaceC6469a interfaceC6469a) {
        if (z8) {
            return;
        }
        composeImmediateRuntimeError((String) interfaceC6469a.invoke());
    }

    @ComposeCompilerApi
    public static final void sourceInformation(@NotNull Composer composer, @NotNull String str) {
        composer.sourceInformation(str);
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(@NotNull Composer composer) {
        composer.sourceInformationMarkerEnd();
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerStart(@NotNull Composer composer, int i, @NotNull String str) {
        composer.sourceInformationMarkerStart(i, str);
    }

    @ComposeCompilerApi
    public static final void traceEventEnd() {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventEnd();
        }
    }

    public static final <R> void withAfterAnchorInfo(@NotNull SlotWriter slotWriter, @Nullable Anchor anchor, @NotNull InterfaceC6473e interfaceC6473e) {
        int iAnchorIndex;
        int slotsSize;
        if (anchor == null || !anchor.getValid()) {
            iAnchorIndex = -1;
            slotsSize = -1;
        } else {
            iAnchorIndex = slotWriter.anchorIndex(anchor);
            slotsSize = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime_release(iAnchorIndex);
        }
        interfaceC6473e.invoke(Integer.valueOf(iAnchorIndex), Integer.valueOf(slotsSize));
    }

    public static final void debugRuntimeCheck(boolean z8, @NotNull InterfaceC6469a interfaceC6469a) {
    }

    public static final boolean isAfterFirstChild(@NotNull SlotReader slotReader) {
        return slotReader.getCurrentGroup() > slotReader.getParent() + 1;
    }

    public static final void runtimeCheck(boolean z8) {
        if (z8) {
            return;
        }
        composeImmediateRuntimeError("Check failed");
    }

    @ComposeCompilerApi
    public static final void traceEventStart(int i, int i8, int i9, @NotNull String str) {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventStart(i, i8, i9, str);
        }
    }
}
