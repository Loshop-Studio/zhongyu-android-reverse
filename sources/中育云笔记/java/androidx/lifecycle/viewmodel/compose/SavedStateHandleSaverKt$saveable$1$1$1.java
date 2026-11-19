package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.lifecycle.SavedStateHandle;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.InterfaceC9975q;
import p309qc.InterfaceC10772c;

/* loaded from: classes2.dex */
public /* synthetic */ class SavedStateHandleSaverKt$saveable$1$1$1 implements SaverScope, InterfaceC9975q {
    final /* synthetic */ SavedStateHandle.Companion $tmp0;

    public SavedStateHandleSaverKt$saveable$1$1$1(SavedStateHandle.Companion companion) {
        this.$tmp0 = companion;
    }

    @Override // androidx.compose.runtime.saveable.SaverScope
    public final boolean canBeSaved(Object obj) {
        return this.$tmp0.validateValue(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof SaverScope) && (obj instanceof InterfaceC9975q)) {
            return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC9975q
    public final InterfaceC10772c getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.$tmp0, SavedStateHandle.Companion.class, "validateValue", "validateValue(Ljava/lang/Object;)Z", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
