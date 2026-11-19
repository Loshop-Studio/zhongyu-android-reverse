package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import com.alibaba.fastjson.asm.Opcodes;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

/* loaded from: classes.dex */
final class LazySaveableStateHolder implements SaveableStateRegistry, SaveableStateHolder {
    public static final Companion Companion = new Companion(null);
    private final MutableScatterSet<Object> previouslyComposedKeys;
    private final SaveableStateHolder wrappedHolder;
    private final SaveableStateRegistry wrappedRegistry;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final Saver<LazySaveableStateHolder, Map<String, List<Object>>> saver(final SaveableStateRegistry saveableStateRegistry, final SaveableStateHolder saveableStateHolder) {
            return SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$Companion$saver$1
                @Override // p181hd.InterfaceC9544p
                public final Map<String, List<Object>> invoke(SaverScope saverScope, LazySaveableStateHolder lazySaveableStateHolder) {
                    Map<String, List<Object>> mapPerformSave = lazySaveableStateHolder.performSave();
                    if (mapPerformSave.isEmpty()) {
                        return null;
                    }
                    return mapPerformSave;
                }
            }, new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$Companion$saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public final LazySaveableStateHolder invoke(Map<String, ? extends List<? extends Object>> map) {
                    return new LazySaveableStateHolder(saveableStateRegistry, map, saveableStateHolder);
                }
            });
        }

        private Companion() {
        }
    }

    public LazySaveableStateHolder(SaveableStateRegistry saveableStateRegistry, SaveableStateHolder saveableStateHolder) {
        this.wrappedRegistry = saveableStateRegistry;
        this.wrappedHolder = saveableStateHolder;
        this.previouslyComposedKeys = ScatterSetKt.mutableScatterSetOf();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    @Composable
    public void SaveableStateProvider(final Object obj, InterfaceC9544p interfaceC9544p, Composer composer, int i10) {
        composer.startReplaceGroup(-697180401);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-697180401, i10, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:74)");
        }
        int i11 = i10 & 14;
        this.wrappedHolder.SaveableStateProvider(obj, interfaceC9544p, composer, i10 & Opcodes.IAND);
        boolean zChangedInstance = composer.changedInstance(this) | composer.changedInstance(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    this.this$0.previouslyComposedKeys.minusAssign((MutableScatterSet) obj);
                    final LazySaveableStateHolder lazySaveableStateHolder = this.this$0;
                    final Object obj2 = obj;
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            lazySaveableStateHolder.previouslyComposedKeys.plusAssign((MutableScatterSet) obj2);
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        EffectsKt.DisposableEffect(obj, (InterfaceC9540l) objRememberedValue, composer, i11);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object obj) {
        return this.wrappedRegistry.canBeSaved(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String str) {
        return this.wrappedRegistry.consumeRestored(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.util.List<java.lang.Object>> performSave() {
        /*
            r14 = this;
            androidx.collection.MutableScatterSet<java.lang.Object> r0 = r14.previouslyComposedKeys
            java.lang.Object[] r1 = r0.elements
            long[] r0 = r0.metadata
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L47
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.runtime.saveable.SaveableStateHolder r11 = r14.wrappedHolder
            r11.removeState(r10)
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L40:
            if (r7 != r8) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            androidx.compose.runtime.saveable.SaveableStateRegistry r0 = r14.wrappedRegistry
            java.util.Map r0 = r0.performSave()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.performSave():java.util.Map");
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(String str, InterfaceC9529a interfaceC9529a) {
        return this.wrappedRegistry.registerProvider(str, interfaceC9529a);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(Object obj) {
        this.wrappedHolder.removeState(obj);
    }

    public LazySaveableStateHolder(final SaveableStateRegistry saveableStateRegistry, Map<String, ? extends List<? extends Object>> map, SaveableStateHolder saveableStateHolder) {
        this(SaveableStateRegistryKt.SaveableStateRegistry(map, new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(Object obj) {
                SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                return Boolean.valueOf(saveableStateRegistry2 != null ? saveableStateRegistry2.canBeSaved(obj) : true);
            }
        }), saveableStateHolder);
    }
}
