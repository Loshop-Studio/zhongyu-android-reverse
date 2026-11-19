package androidx.compose.p006ui.text.input;

import androidx.compose.p006ui.text.InternalTextApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.NonCancellable;

@StabilityInferred(parameters = 0)
@Metadata(m5174d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB#\u0012\u001c\u0010\u0002\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0002J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0014\"\b\b\u0000\u0010\u0015*\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0004H\u0007J*\u0010\u0017\u001a\f\u0012\u0004\u0012\u0002H\u00150\nR\u00020\u0000\"\b\b\u0000\u0010\u0015*\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0004H\u0002J%\u0010\u0018\u001a\u0002H\u0015\"\b\b\u0000\u0010\u0015*\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0004H\u0017¢\u0006\u0002\u0010\u0019R&\u0010\b\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0002\b\u00030\nR\u00020\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0002\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m5175d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistry;", "factory", "Lkotlin/Function2;", "Landroidx/compose/ui/text/input/PlatformTextInputPlugin;", "Landroidx/compose/ui/text/input/PlatformTextInput;", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "(Lkotlin/jvm/functions/Function2;)V", "adaptersByPlugin", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterWithRefCount;", "adaptersMayNeedDisposal", "", "focusedAdapter", "getFocusedAdapter", "()Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "focusedPlugin", "disposeTombstonedAdapters", "", "getOrCreateAdapter", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterHandle;", ExifInterface.GPS_DIRECTION_TRUE, "plugin", "instantiateAdapter", "rememberAdapter", "(Landroidx/compose/ui/text/input/PlatformTextInputPlugin;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "AdapterHandle", "AdapterInput", "AdapterWithRefCount", "ui-text_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@InternalTextApi
@SourceDebugExtension({"SMAP\nPlatformTextInputAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,335:1\n1#2:336\n36#3:337\n25#3:348\n1057#4,6:338\n1057#4,3:349\n1060#4,3:355\n473#5,4:344\n477#5,2:352\n481#5:358\n473#6:354\n766#7:359\n857#7,2:360\n33#8,6:362\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl\n*L\n167#1:337\n172#1:348\n167#1:338,6\n172#1:349,3\n172#1:355,3\n172#1:344,4\n172#1:352,2\n172#1:358\n172#1:354\n241#1:359\n241#1:360,2\n242#1:362,6\n*E\n"})
/* loaded from: classes.dex */
public final class PlatformTextInputPluginRegistryImpl implements PlatformTextInputPluginRegistry {
    public static final int $stable = 0;
    private final SnapshotStateMap<PlatformTextInputPlugin<?>, AdapterWithRefCount<?>> adaptersByPlugin;
    private boolean adaptersMayNeedDisposal;
    private final Function2<PlatformTextInputPlugin<?>, PlatformTextInput, PlatformTextInputAdapter> factory;
    private PlatformTextInputPlugin<?> focusedPlugin;

    @StabilityInferred(parameters = 0)
    @Metadata(m5174d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\u0007R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m5175d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterHandle;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "", "adapter", "onDispose", "Lkotlin/Function0;", "", "(Landroidx/compose/ui/text/input/PlatformTextInputAdapter;Lkotlin/jvm/functions/Function0;)V", "getAdapter", "()Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "disposed", "dispose", "ui-text_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @InternalTextApi
    @SourceDebugExtension({"SMAP\nPlatformTextInputAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterHandle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,335:1\n1#2:336\n*E\n"})
    public static final class AdapterHandle<T extends PlatformTextInputAdapter> {
        public static final int $stable = 8;
        private final T adapter;
        private boolean disposed;
        private final Function0<Boolean> onDispose;

        public AdapterHandle(T adapter, Function0<Boolean> onDispose) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(onDispose, "onDispose");
            this.adapter = adapter;
            this.onDispose = onDispose;
        }

        public final boolean dispose() {
            if (!(!this.disposed)) {
                throw new IllegalStateException("AdapterHandle already disposed".toString());
            }
            this.disposed = true;
            return this.onDispose.invoke().booleanValue();
        }

        public final T getAdapter() {
            return this.adapter;
        }
    }

    @Metadata(m5174d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m5175d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterInput;", "Landroidx/compose/ui/text/input/PlatformTextInput;", "plugin", "Landroidx/compose/ui/text/input/PlatformTextInputPlugin;", "(Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;Landroidx/compose/ui/text/input/PlatformTextInputPlugin;)V", "releaseInputFocus", "", "requestInputFocus", "ui-text_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public final class AdapterInput implements PlatformTextInput {
        private final PlatformTextInputPlugin<?> plugin;
        final /* synthetic */ PlatformTextInputPluginRegistryImpl this$0;

        public AdapterInput(PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl, PlatformTextInputPlugin<?> plugin) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            this.this$0 = platformTextInputPluginRegistryImpl;
            this.plugin = plugin;
        }

        @Override // androidx.compose.p006ui.text.input.PlatformTextInput
        public void releaseInputFocus() {
            if (Intrinsics.areEqual(this.this$0.focusedPlugin, this.plugin)) {
                this.this$0.focusedPlugin = null;
            }
        }

        @Override // androidx.compose.p006ui.text.input.PlatformTextInput
        public void requestInputFocus() {
            this.this$0.focusedPlugin = this.plugin;
        }
    }

    @Metadata(m5174d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0015\u001a\u00020\nJ\u0006\u0010\u0016\u001a\u00020\u0017R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m5175d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterWithRefCount;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "", "adapter", "(Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;Landroidx/compose/ui/text/input/PlatformTextInputAdapter;)V", "getAdapter", "()Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "isRefCountZero", "", "()Z", "<set-?>", "", "refCount", "getRefCount", "()I", "setRefCount", "(I)V", "refCount$delegate", "Landroidx/compose/runtime/MutableState;", "decrementRefCount", "incrementRefCount", "", "ui-text_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nPlatformTextInputAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterWithRefCount\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,335:1\n76#2:336\n102#2,2:337\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterWithRefCount\n*L\n291#1:336\n291#1:337,2\n*E\n"})
    public final class AdapterWithRefCount<T extends PlatformTextInputAdapter> {
        private final T adapter;

        /* renamed from: refCount$delegate, reason: from kotlin metadata */
        private final MutableState refCount;
        final /* synthetic */ PlatformTextInputPluginRegistryImpl this$0;

        public AdapterWithRefCount(PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl, T adapter) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.this$0 = platformTextInputPluginRegistryImpl;
            this.adapter = adapter;
            this.refCount = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final int getRefCount() {
            return ((Number) this.refCount.getValue()).intValue();
        }

        private final void setRefCount(int i4) {
            this.refCount.setValue(Integer.valueOf(i4));
        }

        public final boolean decrementRefCount() {
            setRefCount(getRefCount() - 1);
            if (getRefCount() >= 0) {
                if (getRefCount() != 0) {
                    return false;
                }
                this.this$0.adaptersMayNeedDisposal = true;
                return true;
            }
            throw new IllegalStateException(("AdapterWithRefCount.decrementRefCount called too many times (refCount=" + getRefCount() + ')').toString());
        }

        public final T getAdapter() {
            return this.adapter;
        }

        public final void incrementRefCount() {
            setRefCount(getRefCount() + 1);
        }

        public final boolean isRefCountZero() {
            return getRefCount() == 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlatformTextInputPluginRegistryImpl(Function2<? super PlatformTextInputPlugin<?>, ? super PlatformTextInput, ? extends PlatformTextInputAdapter> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.factory = factory;
        this.adaptersByPlugin = SnapshotStateKt.mutableStateMapOf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disposeTombstonedAdapters() {
        if (this.adaptersMayNeedDisposal) {
            this.adaptersMayNeedDisposal = false;
            Set<Map.Entry<PlatformTextInputPlugin<?>, AdapterWithRefCount<?>>> setEntrySet = this.adaptersByPlugin.entrySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setEntrySet) {
                if (((AdapterWithRefCount) ((Map.Entry) obj).getValue()).isRefCountZero()) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                Map.Entry entry = (Map.Entry) arrayList.get(i4);
                PlatformTextInputPlugin platformTextInputPlugin = (PlatformTextInputPlugin) entry.getKey();
                AdapterWithRefCount adapterWithRefCount = (AdapterWithRefCount) entry.getValue();
                if (Intrinsics.areEqual(this.focusedPlugin, platformTextInputPlugin)) {
                    this.focusedPlugin = null;
                }
                this.adaptersByPlugin.remove(platformTextInputPlugin);
                PlatformTextInputAdapter_androidKt.dispose(adapterWithRefCount.getAdapter());
            }
        }
    }

    private final <T extends PlatformTextInputAdapter> AdapterWithRefCount<T> instantiateAdapter(PlatformTextInputPlugin<T> plugin) {
        PlatformTextInputAdapter platformTextInputAdapterInvoke = this.factory.invoke(plugin, new AdapterInput(this, plugin));
        Intrinsics.checkNotNull(platformTextInputAdapterInvoke, "null cannot be cast to non-null type T of androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.instantiateAdapter");
        AdapterWithRefCount<T> adapterWithRefCount = new AdapterWithRefCount<>(this, platformTextInputAdapterInvoke);
        this.adaptersByPlugin.put(plugin, adapterWithRefCount);
        return adapterWithRefCount;
    }

    public final PlatformTextInputAdapter getFocusedAdapter() {
        AdapterWithRefCount<?> adapterWithRefCount = this.adaptersByPlugin.get(this.focusedPlugin);
        if (adapterWithRefCount != null) {
            return adapterWithRefCount.getAdapter();
        }
        return null;
    }

    @InternalTextApi
    public final <T extends PlatformTextInputAdapter> AdapterHandle<T> getOrCreateAdapter(PlatformTextInputPlugin<T> plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        final AdapterWithRefCount<T> adapterWithRefCountInstantiateAdapter = (AdapterWithRefCount) this.adaptersByPlugin.get(plugin);
        if (adapterWithRefCountInstantiateAdapter == null) {
            adapterWithRefCountInstantiateAdapter = instantiateAdapter(plugin);
        }
        adapterWithRefCountInstantiateAdapter.incrementRefCount();
        return new AdapterHandle<>(adapterWithRefCountInstantiateAdapter.getAdapter(), new Function0<Boolean>() { // from class: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.getOrCreateAdapter.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(adapterWithRefCountInstantiateAdapter.decrementRefCount());
            }
        });
    }

    @Override // androidx.compose.p006ui.text.input.PlatformTextInputPluginRegistry
    @Composable
    public <T extends PlatformTextInputAdapter> T rememberAdapter(PlatformTextInputPlugin<T> plugin, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        composer.startReplaceableGroup(-845039128);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-845039128, i4, -1, "androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.rememberAdapter (PlatformTextInputAdapter.kt:161)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(plugin);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = getOrCreateAdapter(plugin);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final AdapterHandle adapterHandle = (AdapterHandle) objRememberedValue;
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(adapterHandle, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.rememberAdapter.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final AdapterHandle<T> adapterHandle2 = adapterHandle;
                final CoroutineScope coroutineScope2 = coroutineScope;
                final PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl = this;
                return new DisposableEffectResult() { // from class: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$rememberAdapter$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        if (adapterHandle2.dispose()) {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope2, NonCancellable.INSTANCE, null, new PlatformTextInputPluginRegistryImpl$rememberAdapter$1$1$1(platformTextInputPluginRegistryImpl, null), 2, null);
                        }
                    }
                };
            }
        }, composer, 8);
        T t3 = (T) adapterHandle.getAdapter();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return t3;
    }
}
