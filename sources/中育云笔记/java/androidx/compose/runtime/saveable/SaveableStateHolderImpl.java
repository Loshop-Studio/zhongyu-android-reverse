package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes2.dex */
final class SaveableStateHolderImpl implements SaveableStateHolder {
    public static final Companion Companion = new Companion(null);
    private static final Saver<SaveableStateHolderImpl, ?> Saver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$Companion$Saver$1
        @Override // p181hd.InterfaceC9544p
        public final Map<Object, Map<String, List<Object>>> invoke(SaverScope saverScope, SaveableStateHolderImpl saveableStateHolderImpl) {
            return saveableStateHolderImpl.saveAll();
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$Companion$Saver$2
        @Override // p181hd.InterfaceC9540l
        public final SaveableStateHolderImpl invoke(Map<Object, Map<String, List<Object>>> map) {
            return new SaveableStateHolderImpl(map);
        }
    });
    private final InterfaceC9540l canBeSaved;
    private SaveableStateRegistry parentSaveableStateRegistry;
    private final MutableScatterMap<Object, SaveableStateRegistry> registries;
    private final Map<Object, Map<String, List<Object>>> savedStates;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final Saver<SaveableStateHolderImpl, ?> getSaver() {
            return SaveableStateHolderImpl.Saver;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SaveableStateHolderImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Object, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> saveAll() {
        /*
            r17 = this;
            r0 = r17
            java.util.Map<java.lang.Object, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> r1 = r0.savedStates
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.runtime.saveable.SaveableStateRegistry> r2 = r0.registries
            java.lang.Object[] r3 = r2.keys
            java.lang.Object[] r4 = r2.values
            long[] r2 = r2.metadata
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L4f
            r6 = 0
            r7 = r6
        L13:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4a
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2d:
            if (r12 >= r10) goto L48
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L44
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            androidx.compose.runtime.saveable.SaveableStateRegistry r13 = (androidx.compose.runtime.saveable.SaveableStateRegistry) r13
            r0.saveTo(r13, r1, r14)
        L44:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2d
        L48:
            if (r10 != r11) goto L4f
        L4a:
            if (r7 == r5) goto L4f
            int r7 = r7 + 1
            goto L13
        L4f:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L56
            r1 = 0
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.saveable.SaveableStateHolderImpl.saveAll():java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveTo(SaveableStateRegistry saveableStateRegistry, Map<Object, Map<String, List<Object>>> map, Object obj) {
        Map<String, List<Object>> mapPerformSave = saveableStateRegistry.performSave();
        if (mapPerformSave.isEmpty()) {
            map.remove(obj);
        } else {
            map.put(obj, mapPerformSave);
        }
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    @Composable
    public void SaveableStateProvider(final Object obj, InterfaceC9544p interfaceC9544p, Composer composer, int i10) {
        composer.startReplaceGroup(-1198538093);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1198538093, i10, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:69)");
        }
        composer.startReusableGroup(ComposerKt.reuseKey, obj);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (objRememberedValue == companion.getEmpty()) {
            if (!((Boolean) this.canBeSaved.invoke(obj)).booleanValue()) {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            objRememberedValue = SaveableStateRegistryKt.SaveableStateRegistry(this.savedStates.get(obj), this.canBeSaved);
            composer.updateRememberedValue(objRememberedValue);
        }
        final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) objRememberedValue;
        CompositionLocalKt.CompositionLocalProvider(SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(saveableStateRegistry), interfaceC9544p, composer, (i10 & 112) | ProvidedValue.$stable);
        C10786q c10786q = C10786q.f26013a;
        boolean zChangedInstance = composer.changedInstance(this) | composer.changedInstance(obj) | composer.changedInstance(saveableStateRegistry);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new InterfaceC9540l() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    boolean zContains = this.this$0.registries.contains(obj);
                    Object obj2 = obj;
                    if (zContains) {
                        throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
                    }
                    this.this$0.savedStates.remove(obj);
                    this.this$0.registries.set(obj, saveableStateRegistry);
                    final SaveableStateHolderImpl saveableStateHolderImpl = this.this$0;
                    final Object obj3 = obj;
                    final SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                    return new DisposableEffectResult() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            Object objRemove = saveableStateHolderImpl.registries.remove(obj3);
                            SaveableStateRegistry saveableStateRegistry3 = saveableStateRegistry2;
                            if (objRemove == saveableStateRegistry3) {
                                SaveableStateHolderImpl saveableStateHolderImpl2 = saveableStateHolderImpl;
                                saveableStateHolderImpl2.saveTo(saveableStateRegistry3, saveableStateHolderImpl2.savedStates, obj3);
                            }
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.DisposableEffect(c10786q, (InterfaceC9540l) objRememberedValue2, composer, 6);
        composer.endReusableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    public final SaveableStateRegistry getParentSaveableStateRegistry() {
        return this.parentSaveableStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(Object obj) {
        if (this.registries.remove(obj) == null) {
            this.savedStates.remove(obj);
        }
    }

    public final void setParentSaveableStateRegistry(SaveableStateRegistry saveableStateRegistry) {
        this.parentSaveableStateRegistry = saveableStateRegistry;
    }

    public SaveableStateHolderImpl(Map<Object, Map<String, List<Object>>> map) {
        this.savedStates = map;
        this.registries = ScatterMapKt.mutableScatterMapOf();
        this.canBeSaved = new InterfaceC9540l() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$canBeSaved$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(Object obj) {
                SaveableStateRegistry parentSaveableStateRegistry = this.this$0.getParentSaveableStateRegistry();
                return Boolean.valueOf(parentSaveableStateRegistry != null ? parentSaveableStateRegistry.canBeSaved(obj) : true);
            }
        };
    }

    public /* synthetic */ SaveableStateHolderImpl(Map map, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
