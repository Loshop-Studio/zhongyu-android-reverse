package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000¼\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0000\u001a\u0010\u0010@\u001a\u00020A2\u0006\u0010>\u001a\u00020?H\u0000\u001a\u0011\u0010B\u001a\u00020=2\u0006\u0010C\u001a\u00020\u0001H\u0080\b\u001a\u001f\u0010B\u001a\u00020=2\u0006\u0010C\u001a\u00020\u00012\f\u0010D\u001a\b\u0012\u0004\u0012\u00020?0EH\u0080\b\u001a.\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010(\u001a\u00020J2\u0006\u0010K\u001a\u0002032\f\u0010L\u001a\b\u0012\u0002\b\u0003\u0018\u00010MH\u0000\u001a(\u0010N\u001a\u0004\u0018\u00010\u00062\b\u0010C\u001a\u0004\u0018\u00010\u00062\b\u0010O\u001a\u0004\u0018\u00010\u00062\b\u0010P\u001a\u0004\u0018\u00010\u0006H\u0002\u001a\b\u0010Q\u001a\u00020\u0001H\u0007\u001a5\u0010R\u001a\u000e\u0012\u0004\u0012\u0002HT\u0012\u0004\u0012\u0002HU0S\"\b\b\u0000\u0010T*\u00020\u0006\"\b\b\u0001\u0010U*\u00020\u00062\u0006\u0010V\u001a\u00020\fH\u0002¢\u0006\u0002\u0010W\u001a\u0011\u0010X\u001a\u00020=2\u0006\u0010C\u001a\u00020\u0001H\u0080\b\u001a*\u0010X\u001a\u00020=2\u0006\u0010C\u001a\u00020\u00012\f\u0010D\u001a\b\u0012\u0004\u0012\u00020?0EH\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a\u0018\u0010Y\u001a\u00020=2\u0006\u0010Z\u001a\u00020[2\u0006\u0010Y\u001a\u00020?H\u0007\u001a\u0010\u0010\\\u001a\u00020=2\u0006\u0010Z\u001a\u00020[H\u0007\u001a \u0010]\u001a\u00020=2\u0006\u0010Z\u001a\u00020[2\u0006\u0010^\u001a\u00020\f2\u0006\u0010Y\u001a\u00020?H\u0007\u001a\b\u0010_\u001a\u00020=H\u0007\u001a(\u0010`\u001a\u00020=2\u0006\u0010^\u001a\u00020\f2\u0006\u0010a\u001a\u00020\f2\u0006\u0010b\u001a\u00020\f2\u0006\u0010c\u001a\u00020?H\u0007\u001a\u0018\u0010`\u001a\u00020=2\u0006\u0010^\u001a\u00020\f2\u0006\u0010c\u001a\u00020?H\u0007\u001a\f\u0010d\u001a\u00020\u0001*\u00020\fH\u0002\u001a\f\u0010e\u001a\u00020\f*\u00020\u0001H\u0002\u001a3\u0010f\u001a\u0002Hg\"\u0004\b\u0000\u0010g*\u00020[2\u0006\u0010h\u001a\u00020\u00012\u0011\u0010i\u001a\r\u0012\u0004\u0012\u0002Hg0E¢\u0006\u0002\bjH\u0087\b¢\u0006\u0002\u0010k\u001a\u001c\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060m*\u00020n2\u0006\u0010o\u001a\u00020pH\u0002\u001a\u0014\u0010q\u001a\u00020=*\u0002032\u0006\u0010r\u001a\u00020sH\u0000\u001a\u001c\u0010t\u001a\u00020\f*\u0002012\u0006\u0010u\u001a\u00020\f2\u0006\u0010v\u001a\u00020\fH\u0002\u001a(\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00040x*\b\u0012\u0004\u0012\u00020\u00040x2\u0006\u0010y\u001a\u00020\f2\u0006\u0010z\u001a\u00020\fH\u0002\u001a\u001a\u0010{\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00040x2\u0006\u0010|\u001a\u00020\fH\u0002\u001a\u001a\u0010}\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00040x2\u0006\u0010|\u001a\u00020\fH\u0002\u001a$\u0010~\u001a\u0004\u0018\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00040x2\u0006\u0010y\u001a\u00020\f2\u0006\u0010z\u001a\u00020\fH\u0002\u001a/\u0010\u007f\u001a\u00020=*\b\u0012\u0004\u0012\u00020\u00040x2\u0006\u0010|\u001a\u00020\f2\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0006H\u0002\u001a(\u0010\u0083\u0001\u001a\u00020\f*\u0002012\u0007\u0010\u0084\u0001\u001a\u00020\f2\u0007\u0010\u0085\u0001\u001a\u00020\f2\u0007\u0010\u0086\u0001\u001a\u00020\fH\u0002\u001a\u0015\u0010\u0087\u0001\u001a\u00020=*\u0002032\u0006\u0010r\u001a\u00020sH\u0000\u001a \u0010\u0088\u0001\u001a\u00020=*\u0002032\u0006\u0010u\u001a\u00020\f2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0006H\u0002\u001a\u001d\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00040x2\u0006\u0010|\u001a\u00020\fH\u0002\u001a#\u0010\u008b\u0001\u001a\u00020=*\b\u0012\u0004\u0012\u00020\u00040x2\u0006\u0010y\u001a\u00020\f2\u0006\u0010z\u001a\u00020\fH\u0002\u001a<\u0010\u008c\u0001\u001a\u00020=\"\u0005\b\u0000\u0010\u008d\u0001*\u0002032\b\u0010o\u001a\u0004\u0018\u00010p2\u001b\u0010\u008e\u0001\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0005\u0012\u0003H\u008d\u00010\u008f\u0001H\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u0005\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0016\u0010\u000b\u001a\u00020\f8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\b\"\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\b\"\u000e\u0010\u0011\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000\"\u001c\u0010\u0013\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0015\u0010\n\"\u0016\u0010\u0016\u001a\u00020\f8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\b\"\u000e\u0010\u0018\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000\"\u001c\u0010\u0019\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\b\u001a\u0004\b\u001b\u0010\n\"\u0016\u0010\u001c\u001a\u00020\f8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001d\u0010\b\"\u001c\u0010\u001e\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\b\u001a\u0004\b \u0010\n\"\u0016\u0010!\u001a\u00020\f8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\"\u0010\b\"\u001c\u0010#\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\b\u001a\u0004\b%\u0010\n\"\u0016\u0010&\u001a\u00020\f8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b'\u0010\b\"\u001c\u0010(\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\b\u001a\u0004\b*\u0010\n\"\u0016\u0010+\u001a\u00020\f8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b,\u0010\b\"\u0016\u0010-\u001a\u00020\f8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b.\u0010\b\"\u000e\u0010/\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000\"\u0018\u00100\u001a\u00020\u0001*\u0002018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u00102\"\u0018\u00100\u001a\u00020\u0001*\u0002038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u00104\"\u0018\u00105\u001a\u00020\u0006*\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108\"\u0018\u00109\u001a\u00020\f*\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006\u0090\u0001"}, m7880d2 = {"EnableDebugRuntimeChecks", "", "InvalidationLocationAscending", "Ljava/util/Comparator;", "Landroidx/compose/runtime/Invalidation;", "compositionLocalMap", "", "getCompositionLocalMap$annotations", "()V", "getCompositionLocalMap", "()Ljava/lang/Object;", "compositionLocalMapKey", "", "getCompositionLocalMapKey$annotations", "compositionTracer", "Landroidx/compose/runtime/CompositionTracer;", "getCompositionTracer$annotations", "defaultsKey", "invalidGroupLocation", "invocation", "getInvocation$annotations", "getInvocation", "invocationKey", "getInvocationKey$annotations", "nodeKey", "provider", "getProvider$annotations", "getProvider", "providerKey", "getProviderKey$annotations", "providerMaps", "getProviderMaps$annotations", "getProviderMaps", "providerMapsKey", "getProviderMapsKey$annotations", "providerValues", "getProviderValues$annotations", "getProviderValues", "providerValuesKey", "getProviderValuesKey$annotations", TypedValues.Custom.S_REFERENCE, "getReference$annotations", "getReference", "referenceKey", "getReferenceKey$annotations", "reuseKey", "getReuseKey$annotations", "rootKey", "isAfterFirstChild", "Landroidx/compose/runtime/SlotReader;", "(Landroidx/compose/runtime/SlotReader;)Z", "Landroidx/compose/runtime/SlotWriter;", "(Landroidx/compose/runtime/SlotWriter;)Z", "joinedKey", "Landroidx/compose/runtime/KeyInfo;", "getJoinedKey", "(Landroidx/compose/runtime/KeyInfo;)Ljava/lang/Object;", "nextGroup", "getNextGroup", "(Landroidx/compose/runtime/SlotWriter;)I", "composeImmediateRuntimeError", "", "message", "", "composeRuntimeError", "", "debugRuntimeCheck", "value", "lazyMessage", "Lkotlin/Function0;", "extractMovableContentAtCurrent", "Landroidx/compose/runtime/MovableContentState;", "composition", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/MovableContentStateReference;", "slots", "applier", "Landroidx/compose/runtime/Applier;", "getKey", "left", "right", "isTraceInProgress", "multiMap", "Landroidx/compose/runtime/collection/MultiValueMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "initialCapacity", "(I)Landroidx/collection/MutableScatterMap;", "runtimeCheck", "sourceInformation", "composer", "Landroidx/compose/runtime/Composer;", "sourceInformationMarkerEnd", "sourceInformationMarkerStart", "key", "traceEventEnd", "traceEventStart", "dirty1", "dirty2", "info", "asBool", "asInt", "cache", ExifInterface.GPS_DIRECTION_TRUE, "invalid", "block", "Landroidx/compose/runtime/DisallowComposableCalls;", "(Landroidx/compose/runtime/Composer;ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "collectNodesFrom", "", "Landroidx/compose/runtime/SlotTable;", "anchor", "Landroidx/compose/runtime/Anchor;", "deactivateCurrentGroup", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "distanceFrom", "index", "root", "filterToRange", "", "start", "end", "findInsertLocation", RequestParameters.SUBRESOURCE_LOCATION, "findLocation", "firstInRange", "insertIfMissing", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "instance", "nearestCommonRootOf", "a", "b", "common", "removeCurrentGroup", "removeData", "data", "removeLocation", "removeRange", "withAfterAnchorInfo", "R", "cb", "Lkotlin/Function2;", "runtime_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,4891:1\n4341#1,8:4898\n4341#1,8:4912\n4643#1,5:4921\n4658#1,4:4933\n4643#1,5:4937\n1#2:4892\n1#2:4946\n1#2:4954\n2043#3,5:4893\n2049#3:4906\n2043#3,5:4907\n2049#3:4920\n158#4,7:4926\n174#4,4:4942\n179#4,3:4947\n174#4,4:4950\n179#4,3:4955\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n4328#1:4898,8\n4375#1:4912,8\n4395#1:4921,5\n4663#1:4933,4\n4665#1:4937,5\n4755#1:4946\n4815#1:4954\n4319#1:4893,5\n4319#1:4906\n4362#1:4907,5\n4362#1:4920\n4508#1:4926,7\n4755#1:4942,4\n4755#1:4947,3\n4815#1:4950,4\n4815#1:4955,3\n*E\n"})
/* loaded from: classes2.dex */
public final class ComposerKt {
    public static final boolean EnableDebugRuntimeChecks = false;
    public static final int compositionLocalMapKey = 202;
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
    private static final Object invocation = new OpaqueKey("provider");
    private static final Object provider = new OpaqueKey("provider");
    private static final Object compositionLocalMap = new OpaqueKey("compositionLocalMap");
    private static final Object providerValues = new OpaqueKey("providerValues");
    private static final Object providerMaps = new OpaqueKey("providers");
    private static final Object reference = new OpaqueKey(TypedValues.Custom.S_REFERENCE);
    private static final Comparator<Invalidation> InvalidationLocationAscending = new Comparator() { // from class: androidx.compose.runtime.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComposerKt.InvalidationLocationAscending$lambda$16((Invalidation) obj, (Invalidation) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final int InvalidationLocationAscending$lambda$16(Invalidation invalidation, Invalidation invalidation2) {
        return Intrinsics.compare(invalidation.getLocation(), invalidation2.getLocation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBool(int i6) {
        return i6 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int asInt(boolean z6) {
        return z6 ? 1 : 0;
    }

    @ComposeCompilerApi
    public static final <T> T cache(Composer composer, boolean z6, Function0<? extends T> function0) {
        T t6 = (T) composer.rememberedValue();
        if (!z6 && t6 != Composer.INSTANCE.getEmpty()) {
            return t6;
        }
        T tInvoke = function0.invoke();
        composer.updateRememberedValue(tInvoke);
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> collectNodesFrom(SlotTable slotTable, Anchor anchor) {
        ArrayList arrayList = new ArrayList();
        SlotReader slotReaderOpenReader = slotTable.openReader();
        try {
            collectNodesFrom$lambda$10$collectFromGroup(slotReaderOpenReader, arrayList, slotTable.anchorIndex(anchor));
            Unit unit = Unit.INSTANCE;
            return arrayList;
        } finally {
            slotReaderOpenReader.close();
        }
    }

    private static final void collectNodesFrom$lambda$10$collectFromGroup(SlotReader slotReader, List<Object> list, int i6) {
        if (slotReader.isNode(i6)) {
            list.add(slotReader.node(i6));
            return;
        }
        int iGroupSize = i6 + 1;
        int iGroupSize2 = i6 + slotReader.groupSize(i6);
        while (iGroupSize < iGroupSize2) {
            collectNodesFrom$lambda$10$collectFromGroup(slotReader, list, iGroupSize);
            iGroupSize += slotReader.groupSize(iGroupSize);
        }
    }

    public static final void composeImmediateRuntimeError(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final Void composeRuntimeError(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void deactivateCurrentGroup(SlotWriter slotWriter, RememberManager rememberManager) {
        int slotsSize;
        int iDataIndex = slotWriter.dataIndex(slotWriter.groups, slotWriter.groupIndexToAddress(slotWriter.getCurrentGroup() + slotWriter.groupSize(slotWriter.getCurrentGroup())));
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

    public static final void debugRuntimeCheck(boolean z6) {
    }

    private static final int distanceFrom(SlotReader slotReader, int i6, int i7) {
        int i8 = 0;
        while (i6 > 0 && i6 != i7) {
            i6 = slotReader.parent(i6);
            i8++;
        }
        return i8;
    }

    public static final MovableContentState extractMovableContentAtCurrent(final ControlledComposition controlledComposition, final MovableContentStateReference movableContentStateReference, SlotWriter slotWriter, Applier<?> applier) {
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
                int i6 = parent + 1;
                int iGroupSize = parent + slotWriter.groupSize(parent);
                int iNodeCount = 0;
                while (i6 < iGroupSize) {
                    int iGroupSize2 = slotWriter.groupSize(i6) + i6;
                    if (iGroupSize2 > currentGroup) {
                        break;
                    }
                    iNodeCount += slotWriter.isNode(i6) ? 1 : slotWriter.nodeCount(i6);
                    i6 = iGroupSize2;
                }
                int iNodeCount2 = slotWriter.isNode(currentGroup) ? 1 : slotWriter.nodeCount(currentGroup);
                applier.down(objNode);
                applier.remove(iNodeCount, iNodeCount2);
                applier.mo261up();
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
                    movableContentStateReference2.setInvalidations$runtime_release(CollectionsKt.plus((Collection<? extends Pair>) movableContentStateReference2.getInvalidations$runtime_release(), TuplesKt.m7887to(scope, instance)));
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
                Unit unit = Unit.INSTANCE;
                slotWriterOpenWriter.close(true);
                return movableContentState;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Invalidation> filterToRange(List<Invalidation> list, int i6, int i7) {
        ArrayList arrayList = new ArrayList();
        for (int iFindInsertLocation = findInsertLocation(list, i6); iFindInsertLocation < list.size(); iFindInsertLocation++) {
            Invalidation invalidation = list.get(iFindInsertLocation);
            if (invalidation.getLocation() >= i7) {
                break;
            }
            arrayList.add(invalidation);
        }
        return arrayList;
    }

    private static final int findInsertLocation(List<Invalidation> list, int i6) {
        int iFindLocation = findLocation(list, i6);
        return iFindLocation < 0 ? -(iFindLocation + 1) : iFindLocation;
    }

    private static final int findLocation(List<Invalidation> list, int i6) {
        int size = list.size() - 1;
        int i7 = 0;
        while (i7 <= size) {
            int i8 = (i7 + size) >>> 1;
            int iCompare = Intrinsics.compare(list.get(i8).getLocation(), i6);
            if (iCompare < 0) {
                i7 = i8 + 1;
            } else {
                if (iCompare <= 0) {
                    return i8;
                }
                size = i8 - 1;
            }
        }
        return -(i7 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation firstInRange(List<Invalidation> list, int i6, int i7) {
        int iFindInsertLocation = findInsertLocation(list, i6);
        if (iFindInsertLocation >= list.size()) {
            return null;
        }
        Invalidation invalidation = list.get(iFindInsertLocation);
        if (invalidation.getLocation() < i7) {
            return invalidation;
        }
        return null;
    }

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
        if (Intrinsics.areEqual(joinedKey.getLeft(), obj2) && Intrinsics.areEqual(joinedKey.getRight(), obj3)) {
            return obj;
        }
        Object key = getKey(joinedKey.getLeft(), obj2, obj3);
        return key == null ? getKey(joinedKey.getRight(), obj2, obj3) : key;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getNextGroup(SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() + slotWriter.groupSize(slotWriter.getCurrentGroup());
    }

    public static final Object getProvider() {
        return provider;
    }

    @PublishedApi
    public static /* synthetic */ void getProvider$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProviderKey$annotations() {
    }

    public static final Object getProviderMaps() {
        return providerMaps;
    }

    @PublishedApi
    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    public static final Object getProviderValues() {
        return providerValues;
    }

    @PublishedApi
    public static /* synthetic */ void getProviderValues$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

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
    public static final void insertIfMissing(List<Invalidation> list, int i6, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int iFindLocation = findLocation(list, i6);
        if (iFindLocation < 0) {
            int i7 = -(iFindLocation + 1);
            if (!(obj instanceof DerivedState)) {
                obj = null;
            }
            list.add(i7, new Invalidation(recomposeScopeImpl, i6, obj));
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

    public static final boolean isAfterFirstChild(SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() > slotWriter.getParent() + 1;
    }

    @ComposeCompilerApi
    public static final boolean isTraceInProgress() {
        CompositionTracer compositionTracer2 = compositionTracer;
        return compositionTracer2 != null && compositionTracer2.isTraceInProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> MutableScatterMap<Object, Object> multiMap(int i6) {
        return MultiValueMap.m13419constructorimpl(new MutableScatterMap(i6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nearestCommonRootOf(SlotReader slotReader, int i6, int i7, int i8) {
        if (i6 != i7) {
            if (i6 == i8 || i7 == i8) {
                return i8;
            }
            if (slotReader.parent(i6) == i7) {
                return i7;
            }
            if (slotReader.parent(i7) != i6) {
                if (slotReader.parent(i6) == slotReader.parent(i7)) {
                    return slotReader.parent(i6);
                }
                int iDistanceFrom = distanceFrom(slotReader, i6, i8);
                int iDistanceFrom2 = distanceFrom(slotReader, i7, i8);
                int i9 = iDistanceFrom - iDistanceFrom2;
                for (int i10 = 0; i10 < i9; i10++) {
                    i6 = slotReader.parent(i6);
                }
                int i11 = iDistanceFrom2 - iDistanceFrom;
                for (int i12 = 0; i12 < i11; i12++) {
                    i7 = slotReader.parent(i7);
                }
                while (i6 != i7) {
                    i6 = slotReader.parent(i6);
                    i7 = slotReader.parent(i7);
                }
                return i6;
            }
        }
        return i6;
    }

    public static final void removeCurrentGroup(SlotWriter slotWriter, RememberManager rememberManager) {
        int slotsSize;
        int iDataIndex = slotWriter.dataIndex(slotWriter.groups, slotWriter.groupIndexToAddress(slotWriter.getCurrentGroup() + slotWriter.groupSize(slotWriter.getCurrentGroup())));
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

    private static final void removeData(SlotWriter slotWriter, int i6, Object obj) {
        Object objClear = slotWriter.clear(i6);
        if (obj == objClear) {
            return;
        }
        composeImmediateRuntimeError("Slot table is out of sync (expected " + obj + ", got " + objClear + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation removeLocation(List<Invalidation> list, int i6) {
        int iFindLocation = findLocation(list, i6);
        if (iFindLocation >= 0) {
            return list.remove(iFindLocation);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeRange(List<Invalidation> list, int i6, int i7) {
        int iFindInsertLocation = findInsertLocation(list, i6);
        while (iFindInsertLocation < list.size() && list.get(iFindInsertLocation).getLocation() < i7) {
            list.remove(iFindInsertLocation);
        }
    }

    public static final void runtimeCheck(boolean z6, Function0<String> function0) {
        if (z6) {
            return;
        }
        composeImmediateRuntimeError(function0.invoke());
    }

    @ComposeCompilerApi
    public static final void sourceInformation(Composer composer, String str) {
        composer.sourceInformation(str);
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(Composer composer) {
        composer.sourceInformationMarkerEnd();
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerStart(Composer composer, int i6, String str) {
        composer.sourceInformationMarkerStart(i6, str);
    }

    @ComposeCompilerApi
    public static final void traceEventEnd() {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventEnd();
        }
    }

    public static final <R> void withAfterAnchorInfo(SlotWriter slotWriter, Anchor anchor, Function2<? super Integer, ? super Integer, ? extends R> function2) {
        int iAnchorIndex;
        int slotsSize;
        if (anchor == null || !anchor.getValid()) {
            iAnchorIndex = -1;
            slotsSize = -1;
        } else {
            iAnchorIndex = slotWriter.anchorIndex(anchor);
            slotsSize = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime_release(iAnchorIndex);
        }
        function2.invoke(Integer.valueOf(iAnchorIndex), Integer.valueOf(slotsSize));
    }

    public static final void debugRuntimeCheck(boolean z6, Function0<String> function0) {
    }

    public static final boolean isAfterFirstChild(SlotReader slotReader) {
        return slotReader.getCurrent() > slotReader.getParent() + 1;
    }

    public static final void runtimeCheck(boolean z6) {
        if (z6) {
            return;
        }
        composeImmediateRuntimeError("Check failed");
    }

    @ComposeCompilerApi
    public static final void traceEventStart(int i6, int i7, int i8, String str) {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventStart(i6, i7, i8, str);
        }
    }
}
