package androidx.compose.runtime.saveable;

import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
final class SaveableHolder<T> implements SaverScope, RememberObserver {
    private SaveableStateRegistry.Entry entry;
    private Object[] inputs;
    private String key;
    private SaveableStateRegistry registry;
    private Saver<T, Object> saver;
    private T value;
    private final InterfaceC10559a valueProvider = new InterfaceC10559a(this) { // from class: androidx.compose.runtime.saveable.SaveableHolder$valueProvider$1
        final /* synthetic */ SaveableHolder<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.this$0 = this;
        }

        @Override // p300x7.InterfaceC10559a
        public final Object invoke() {
            Saver saver = ((SaveableHolder) this.this$0).saver;
            SaveableHolder<T> saveableHolder = this.this$0;
            Object obj = ((SaveableHolder) saveableHolder).value;
            if (obj != null) {
                return saver.save(saveableHolder, obj);
            }
            throw new IllegalArgumentException("Value should be initialized");
        }
    };

    public SaveableHolder(Saver<T, Object> saver, SaveableStateRegistry saveableStateRegistry, String str, T t10, Object[] objArr) {
        this.saver = saver;
        this.registry = saveableStateRegistry;
        this.key = str;
        this.value = t10;
        this.inputs = objArr;
    }

    private final void register() {
        SaveableStateRegistry saveableStateRegistry = this.registry;
        if (this.entry == null) {
            if (saveableStateRegistry != null) {
                RememberSaveableKt.requireCanBeSaved(saveableStateRegistry, this.valueProvider.invoke());
                this.entry = saveableStateRegistry.registerProvider(this.key, this.valueProvider);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + this.entry + ") is not null").toString());
    }

    @Override // androidx.compose.runtime.saveable.SaverScope
    public boolean canBeSaved(Object obj) {
        SaveableStateRegistry saveableStateRegistry = this.registry;
        return saveableStateRegistry == null || saveableStateRegistry.canBeSaved(obj);
    }

    public final T getValueIfInputsDidntChange(Object[] objArr) {
        if (Arrays.equals(objArr, this.inputs)) {
            return this.value;
        }
        return null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        SaveableStateRegistry.Entry entry = this.entry;
        if (entry != null) {
            entry.unregister();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        SaveableStateRegistry.Entry entry = this.entry;
        if (entry != null) {
            entry.unregister();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        register();
    }

    public final void update(Saver<T, Object> saver, SaveableStateRegistry saveableStateRegistry, String str, T t10, Object[] objArr) {
        boolean z10;
        boolean z11 = true;
        if (this.registry != saveableStateRegistry) {
            this.registry = saveableStateRegistry;
            z10 = true;
        } else {
            z10 = false;
        }
        if (AbstractC9133u.m16128b(this.key, str)) {
            z11 = z10;
        } else {
            this.key = str;
        }
        this.saver = saver;
        this.value = t10;
        this.inputs = objArr;
        SaveableStateRegistry.Entry entry = this.entry;
        if (entry == null || !z11) {
            return;
        }
        if (entry != null) {
            entry.unregister();
        }
        this.entry = null;
        register();
    }
}
