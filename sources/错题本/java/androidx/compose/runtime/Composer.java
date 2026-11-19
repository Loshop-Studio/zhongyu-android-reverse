package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 £\u00012\u00020\u0001:\u0002£\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\bJ!\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0004H'¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0004H'¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0019\u001a\u00020\u00042\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001f\u001a\u00020\u00042\u001a\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c0\u001bH'¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H&¢\u0006\u0004\b&\u0010\bJ\u000f\u0010'\u001a\u00020\u0004H'¢\u0006\u0004\b'\u0010\bJ\u0017\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H'¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0004H'¢\u0006\u0004\b,\u0010\bJ\u000f\u0010-\u001a\u00020\u0004H'¢\u0006\u0004\b-\u0010\bJ\u000f\u0010.\u001a\u00020\u0004H'¢\u0006\u0004\b.\u0010\bJ#\u00102\u001a\u00020\u0004\"\u0004\b\u0000\u0010/2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000000H'¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0004H'¢\u0006\u0004\b4\u0010\bJ\u000f\u00105\u001a\u00020\u0004H'¢\u0006\u0004\b5\u0010\bJ!\u00106\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b6\u0010\rJ\u000f\u00107\u001a\u00020\u0004H'¢\u0006\u0004\b7\u0010\bJ\u000f\u00108\u001a\u00020\u0004H'¢\u0006\u0004\b8\u0010\bJ\u000f\u00109\u001a\u00020\u0004H'¢\u0006\u0004\b9\u0010\bJ\u0017\u0010;\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0002H'¢\u0006\u0004\b;\u0010\u0006JB\u0010@\u001a\u00020\u0004\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010/2\u0006\u0010\u0017\u001a\u00028\u00002\u001d\u0010?\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040=¢\u0006\u0002\b>H'¢\u0006\u0004\b@\u0010AJ#\u0010D\u001a\u00020\u00012\b\u0010B\u001a\u0004\u0018\u00010\u00012\b\u0010C\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\bD\u0010EJ\u0011\u0010F\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\bF\u0010GJ\u0019\u0010H\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\bH\u0010IJ\u0019\u0010)\u001a\u00020(2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b)\u0010JJ\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020(H\u0017¢\u0006\u0004\b)\u0010KJ\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020LH\u0017¢\u0006\u0004\b)\u0010MJ\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020NH\u0017¢\u0006\u0004\b)\u0010OJ\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020PH\u0017¢\u0006\u0004\b)\u0010QJ\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b)\u0010RJ\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020SH\u0017¢\u0006\u0004\b)\u0010TJ\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020UH\u0017¢\u0006\u0004\b)\u0010VJ\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020WH\u0017¢\u0006\u0004\b)\u0010XJ\u0019\u0010Y\u001a\u00020(2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0004\bY\u0010JJ\u0017\u0010\\\u001a\u00020\u00042\u0006\u0010[\u001a\u00020ZH'¢\u0006\u0004\b\\\u0010]J\u001f\u0010`\u001a\u00020(2\u0006\u0010^\u001a\u00020(2\u0006\u0010_\u001a\u00020\u0002H'¢\u0006\u0004\b`\u0010aJ\u001d\u0010c\u001a\u00020\u00042\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u000400H'¢\u0006\u0004\bc\u00103J#\u0010e\u001a\u00028\u0000\"\u0004\b\u0000\u0010/2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000dH'¢\u0006\u0004\be\u0010fJ#\u0010j\u001a\u00020\u00042\u0012\u0010i\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030h0gH'¢\u0006\u0004\bj\u0010kJ\u000f\u0010l\u001a\u00020\u0004H'¢\u0006\u0004\bl\u0010\bJ\u001b\u0010m\u001a\u00020\u00042\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030hH'¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\u0004H'¢\u0006\u0004\bo\u0010\bJ\u000f\u0010p\u001a\u00020\u0004H&¢\u0006\u0004\bp\u0010\bJ\u000f\u0010r\u001a\u00020qH'¢\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u00020\u0004H'¢\u0006\u0004\bt\u0010\bR\u001e\u0010y\u001a\u0006\u0012\u0002\b\u00030u8&X§\u0004¢\u0006\f\u0012\u0004\bx\u0010\b\u001a\u0004\bv\u0010wR\u001a\u0010}\u001a\u00020(8&X§\u0004¢\u0006\f\u0012\u0004\b|\u0010\b\u001a\u0004\bz\u0010{R\u001b\u0010\u0080\u0001\u001a\u00020(8&X§\u0004¢\u0006\f\u0012\u0004\b\u007f\u0010\b\u001a\u0004\b~\u0010{R\u001d\u0010\u0083\u0001\u001a\u00020(8&X§\u0004¢\u0006\u000e\u0012\u0005\b\u0082\u0001\u0010\b\u001a\u0005\b\u0081\u0001\u0010{R \u0010\u0087\u0001\u001a\u0004\u0018\u00010Z8&X§\u0004¢\u0006\u000f\u0012\u0005\b\u0086\u0001\u0010\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00018&X§\u0004¢\u0006\u000e\u0012\u0005\b\u0089\u0001\u0010\b\u001a\u0005\b\u0088\u0001\u0010GR\u001e\u0010\u008e\u0001\u001a\u00020\u00028&X§\u0004¢\u0006\u000f\u0012\u0005\b\u008d\u0001\u0010\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001e\u0010\u0091\u0001\u001a\u00020\u00028&X§\u0004¢\u0006\u000f\u0012\u0005\b\u0090\u0001\u0010\b\u001a\u0006\b\u008f\u0001\u0010\u008c\u0001R\u001f\u0010\u0096\u0001\u001a\u00030\u0092\u00018gX§\u0004¢\u0006\u000f\u0012\u0005\b\u0095\u0001\u0010\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0097\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009b\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010¢\u0001\u001a\u00030\u009f\u00018gX¦\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001\u0082\u0001\u0002¤\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006¥\u0001À\u0006\u0001"}, m5110d2 = {"Landroidx/compose/runtime/Composer;", "", "", "key", "Ld6/s;", "startReplaceableGroup", "(I)V", "endReplaceableGroup", "()V", "startReplaceGroup", "endReplaceGroup", "dataKey", "startMovableGroup", "(ILjava/lang/Object;)V", "endMovableGroup", "startDefaults", "endDefaults", "startRestartGroup", "(I)Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/ScopeUpdateScope;", "endRestartGroup", "()Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/MovableContent;", "value", "parameter", "insertMovableContent", "(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;)V", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContentReferences", "(Ljava/util/List;)V", "", "sourceInformation", "(Ljava/lang/String;)V", "sourceInformationMarkerStart", "(ILjava/lang/String;)V", "sourceInformationMarkerEnd", "skipToGroupEnd", "", "changed", "deactivateToEndGroup", "(Z)V", "skipCurrentGroup", "startNode", "startReusableNode", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "factory", "createNode", "(Lr6/a;)V", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "disableReusing", "enableReusing", RequestParameters.MARKER, "endToMarker", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "apply", "(Ljava/lang/Object;Lr6/e;)V", "left", "right", "joinKey", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "rememberedValue", "()Ljava/lang/Object;", "updateRememberedValue", "(Ljava/lang/Object;)V", "(Ljava/lang/Object;)Z", "(Z)Z", "", "(C)Z", "", "(B)Z", "", "(S)Z", "(I)Z", "", "(F)Z", "", "(J)Z", "", "(D)Z", "changedInstance", "Landroidx/compose/runtime/RecomposeScope;", "scope", "recordUsed", "(Landroidx/compose/runtime/RecomposeScope;)V", "parametersChanged", "flags", "shouldExecute", "(ZI)Z", "effect", "recordSideEffect", "Landroidx/compose/runtime/CompositionLocal;", "consume", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/ProvidedValue;", "values", "startProviders", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", "startProvider", "(Landroidx/compose/runtime/ProvidedValue;)V", "endProvider", "collectParameterInformation", "Landroidx/compose/runtime/CompositionContext;", "buildContext", "()Landroidx/compose/runtime/CompositionContext;", "disableSourceInformation", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "getApplier$annotations", "applier", "getInserting", "()Z", "getInserting$annotations", "inserting", "getSkipping", "getSkipping$annotations", "skipping", "getDefaultsInvalid", "getDefaultsInvalid$annotations", "defaultsInvalid", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope$annotations", "recomposeScope", "getRecomposeScopeIdentity", "getRecomposeScopeIdentity$annotations", "recomposeScopeIdentity", "getCompoundKeyHash", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "getCurrentMarker", "getCurrentMarker$annotations", "currentMarker", "Lh6/h;", "getApplyCoroutineContext", "()Lh6/h;", "getApplyCoroutineContext$annotations", "applyCoroutineContext", "Landroidx/compose/runtime/CompositionLocalMap;", "getCurrentCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "currentCompositionLocalMap", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "Landroidx/compose/runtime/ControlledComposition;", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "composition", "Companion", "Landroidx/compose/runtime/ComposerImpl;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface Composer {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m5110d2 = {"Landroidx/compose/runtime/Composer$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/CompositionTracer;", "tracer", "Ld6/s;", "setTracer", "(Landroidx/compose/runtime/CompositionTracer;)V", "Empty", "Ljava/lang/Object;", "getEmpty", "()Ljava/lang/Object;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final Object Empty = new Object() { // from class: androidx.compose.runtime.Composer$Companion$Empty$1
            public String toString() {
                return "Empty";
            }
        };

        private Companion() {
        }

        @NotNull
        public final Object getEmpty() {
            return Empty;
        }

        @InternalComposeTracingApi
        public final void setTracer(@Nullable CompositionTracer tracer) {
            ComposerKt.compositionTracer = tracer;
        }
    }

    @ComposeCompilerApi
    static /* synthetic */ void getApplier$annotations() {
    }

    @InternalComposeApi
    static /* synthetic */ void getApplyCoroutineContext$annotations() {
    }

    @InternalComposeApi
    static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getCurrentMarker$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getInserting$annotations() {
    }

    @InternalComposeApi
    static /* synthetic */ void getRecomposeScope$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getRecomposeScopeIdentity$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getSkipping$annotations() {
    }

    @ComposeCompilerApi
    <V, T> void apply(V value, @NotNull InterfaceC6473e block);

    @InternalComposeApi
    @NotNull
    CompositionContext buildContext();

    @ComposeCompilerApi
    boolean changed(@Nullable Object value);

    @ComposeCompilerApi
    default boolean changed(boolean value) {
        return changed(value);
    }

    @ComposeCompilerApi
    default boolean changedInstance(@Nullable Object value) {
        return changed(value);
    }

    void collectParameterInformation();

    @InternalComposeApi
    <T> T consume(@NotNull CompositionLocal<T> key);

    @ComposeCompilerApi
    <T> void createNode(@NotNull InterfaceC6469a factory);

    @ComposeCompilerApi
    void deactivateToEndGroup(boolean changed);

    @ComposeCompilerApi
    void disableReusing();

    @TestOnly
    void disableSourceInformation();

    @ComposeCompilerApi
    void enableReusing();

    @ComposeCompilerApi
    void endDefaults();

    @ComposeCompilerApi
    void endMovableGroup();

    @ComposeCompilerApi
    void endNode();

    @InternalComposeApi
    void endProvider();

    @InternalComposeApi
    void endProviders();

    @ComposeCompilerApi
    void endReplaceGroup();

    @ComposeCompilerApi
    void endReplaceableGroup();

    @ComposeCompilerApi
    @Nullable
    ScopeUpdateScope endRestartGroup();

    @ComposeCompilerApi
    void endReusableGroup();

    @ComposeCompilerApi
    void endToMarker(int marker);

    @NotNull
    Applier<?> getApplier();

    @TestOnly
    @NotNull
    InterfaceC5636h getApplyCoroutineContext();

    @TestOnly
    @NotNull
    ControlledComposition getComposition();

    @NotNull
    CompositionData getCompositionData();

    int getCompoundKeyHash();

    @NotNull
    CompositionLocalMap getCurrentCompositionLocalMap();

    int getCurrentMarker();

    boolean getDefaultsInvalid();

    boolean getInserting();

    @Nullable
    RecomposeScope getRecomposeScope();

    @Nullable
    Object getRecomposeScopeIdentity();

    boolean getSkipping();

    @InternalComposeApi
    void insertMovableContent(@NotNull MovableContent<?> value, @Nullable Object parameter);

    @InternalComposeApi
    void insertMovableContentReferences(@NotNull List<Pair<MovableContentStateReference, MovableContentStateReference>> references);

    @ComposeCompilerApi
    @NotNull
    Object joinKey(@Nullable Object left, @Nullable Object right);

    @InternalComposeApi
    void recordSideEffect(@NotNull InterfaceC6469a effect);

    @InternalComposeApi
    void recordUsed(@NotNull RecomposeScope scope);

    @ComposeCompilerApi
    @Nullable
    Object rememberedValue();

    @InternalComposeApi
    boolean shouldExecute(boolean parametersChanged, int flags);

    @ComposeCompilerApi
    void skipCurrentGroup();

    @ComposeCompilerApi
    void skipToGroupEnd();

    void sourceInformation(@NotNull String sourceInformation);

    void sourceInformationMarkerEnd();

    void sourceInformationMarkerStart(int key, @NotNull String sourceInformation);

    @ComposeCompilerApi
    void startDefaults();

    @ComposeCompilerApi
    void startMovableGroup(int key, @Nullable Object dataKey);

    @ComposeCompilerApi
    void startNode();

    @InternalComposeApi
    void startProvider(@NotNull ProvidedValue<?> value);

    @InternalComposeApi
    void startProviders(@NotNull ProvidedValue<?>[] values);

    @ComposeCompilerApi
    void startReplaceGroup(int key);

    @ComposeCompilerApi
    void startReplaceableGroup(int key);

    @ComposeCompilerApi
    @NotNull
    Composer startRestartGroup(int key);

    @ComposeCompilerApi
    void startReusableGroup(int key, @Nullable Object dataKey);

    @ComposeCompilerApi
    void startReusableNode();

    @ComposeCompilerApi
    void updateRememberedValue(@Nullable Object value);

    @ComposeCompilerApi
    void useNode();

    @ComposeCompilerApi
    default boolean changed(char value) {
        return changed(value);
    }

    @ComposeCompilerApi
    default boolean changed(byte value) {
        return changed(value);
    }

    @ComposeCompilerApi
    default boolean changed(short value) {
        return changed(value);
    }

    @ComposeCompilerApi
    default boolean changed(int value) {
        return changed(value);
    }

    @ComposeCompilerApi
    default boolean changed(float value) {
        return changed(value);
    }

    @ComposeCompilerApi
    default boolean changed(long value) {
        return changed(value);
    }

    @ComposeCompilerApi
    default boolean changed(double value) {
        return changed(value);
    }
}
