package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.InterfaceC9100d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public interface Composer {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Object Empty = new Object() { // from class: androidx.compose.runtime.Composer$Companion$Empty$1
            public String toString() {
                return "Empty";
            }
        };

        private Companion() {
        }

        public final Object getEmpty() {
            return Empty;
        }

        @InternalComposeTracingApi
        public final void setTracer(CompositionTracer compositionTracer) {
            ComposerKt.compositionTracer = compositionTracer;
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
    <V, T> void apply(V v10, InterfaceC10574p interfaceC10574p);

    @InternalComposeApi
    CompositionContext buildContext();

    @ComposeCompilerApi
    boolean changed(Object obj);

    @ComposeCompilerApi
    default boolean changed(boolean z10) {
        return changed(z10);
    }

    @ComposeCompilerApi
    default boolean changedInstance(Object obj) {
        return changed(obj);
    }

    void collectParameterInformation();

    @InternalComposeApi
    <T> T consume(CompositionLocal<T> compositionLocal);

    @ComposeCompilerApi
    <T> void createNode(InterfaceC10559a interfaceC10559a);

    @ComposeCompilerApi
    void deactivateToEndGroup(boolean z10);

    @ComposeCompilerApi
    void disableReusing();

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
    ScopeUpdateScope endRestartGroup();

    @ComposeCompilerApi
    void endReusableGroup();

    @ComposeCompilerApi
    void endToMarker(int i10);

    Applier<?> getApplier();

    InterfaceC9100d getApplyCoroutineContext();

    ControlledComposition getComposition();

    CompositionData getCompositionData();

    int getCompoundKeyHash();

    CompositionLocalMap getCurrentCompositionLocalMap();

    int getCurrentMarker();

    boolean getDefaultsInvalid();

    boolean getInserting();

    RecomposeScope getRecomposeScope();

    Object getRecomposeScopeIdentity();

    boolean getSkipping();

    @InternalComposeApi
    void insertMovableContent(MovableContent<?> movableContent, Object obj);

    @InternalComposeApi
    void insertMovableContentReferences(List<Pair<MovableContentStateReference, MovableContentStateReference>> list);

    @ComposeCompilerApi
    Object joinKey(Object obj, Object obj2);

    @InternalComposeApi
    void recordSideEffect(InterfaceC10559a interfaceC10559a);

    @InternalComposeApi
    void recordUsed(RecomposeScope recomposeScope);

    @ComposeCompilerApi
    Object rememberedValue();

    @InternalComposeApi
    boolean shouldExecute(boolean z10, int i10);

    @ComposeCompilerApi
    void skipCurrentGroup();

    @ComposeCompilerApi
    void skipToGroupEnd();

    void sourceInformation(String str);

    void sourceInformationMarkerEnd();

    void sourceInformationMarkerStart(int i10, String str);

    @ComposeCompilerApi
    void startDefaults();

    @ComposeCompilerApi
    void startMovableGroup(int i10, Object obj);

    @ComposeCompilerApi
    void startNode();

    @InternalComposeApi
    void startProvider(ProvidedValue<?> providedValue);

    @InternalComposeApi
    void startProviders(ProvidedValue<?>[] providedValueArr);

    @ComposeCompilerApi
    void startReplaceGroup(int i10);

    @ComposeCompilerApi
    void startReplaceableGroup(int i10);

    @ComposeCompilerApi
    Composer startRestartGroup(int i10);

    @ComposeCompilerApi
    void startReusableGroup(int i10, Object obj);

    @ComposeCompilerApi
    void startReusableNode();

    @ComposeCompilerApi
    void updateRememberedValue(Object obj);

    @ComposeCompilerApi
    void useNode();

    @ComposeCompilerApi
    default boolean changed(char c10) {
        return changed(c10);
    }

    @ComposeCompilerApi
    default boolean changed(byte b10) {
        return changed(b10);
    }

    @ComposeCompilerApi
    default boolean changed(short s10) {
        return changed(s10);
    }

    @ComposeCompilerApi
    default boolean changed(int i10) {
        return changed(i10);
    }

    @ComposeCompilerApi
    default boolean changed(float f10) {
        return changed(f10);
    }

    @ComposeCompilerApi
    default boolean changed(long j10) {
        return changed(j10);
    }

    @ComposeCompilerApi
    default boolean changed(double d10) {
        return changed(d10);
    }
}
