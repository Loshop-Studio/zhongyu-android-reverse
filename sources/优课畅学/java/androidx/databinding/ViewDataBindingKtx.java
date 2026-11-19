package androidx.databinding;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9212n;
import p135i8.AbstractC8839h;
import p169l8.InterfaceC9266c;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class ViewDataBindingKtx {
    public static final ViewDataBindingKtx INSTANCE = new ViewDataBindingKtx();
    private static final CreateWeakListener CREATE_STATE_FLOW_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.a
        @Override // androidx.databinding.CreateWeakListener
        public final WeakListener create(ViewDataBinding viewDataBinding, int i10, ReferenceQueue referenceQueue) {
            return ViewDataBindingKtx.CREATE_STATE_FLOW_LISTENER$lambda$0(viewDataBinding, i10, referenceQueue);
        }
    };

    public static final class StateFlowListener implements ObservableReference<InterfaceC9266c> {
        private WeakReference<LifecycleOwner> _lifecycleOwnerRef;
        private final WeakListener<InterfaceC9266c> listener;
        private InterfaceC9212n observerJob;

        public StateFlowListener(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            AbstractC9133u.m16133g(referenceQueue, "referenceQueue");
            this.listener = new WeakListener<>(viewDataBinding, i10, this, referenceQueue);
        }

        private final void startCollection(LifecycleOwner lifecycleOwner, InterfaceC9266c interfaceC9266c) {
            InterfaceC9212n interfaceC9212n = this.observerJob;
            if (interfaceC9212n != null) {
                InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
            }
            this.observerJob = AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new ViewDataBindingKtx$StateFlowListener$startCollection$1(lifecycleOwner, interfaceC9266c, this, null), 3, null);
        }

        @Override // androidx.databinding.ObservableReference
        public WeakListener<InterfaceC9266c> getListener() {
            return this.listener;
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
            WeakReference<LifecycleOwner> weakReference = this._lifecycleOwnerRef;
            if ((weakReference != null ? weakReference.get() : null) == lifecycleOwner) {
                return;
            }
            InterfaceC9212n interfaceC9212n = this.observerJob;
            if (interfaceC9212n != null) {
                InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
            }
            if (lifecycleOwner == null) {
                this._lifecycleOwnerRef = null;
                return;
            }
            this._lifecycleOwnerRef = new WeakReference<>(lifecycleOwner);
            InterfaceC9266c target = this.listener.getTarget();
            if (target != null) {
                startCollection(lifecycleOwner, target);
            }
        }

        @Override // androidx.databinding.ObservableReference
        public void addListener(InterfaceC9266c interfaceC9266c) {
            LifecycleOwner lifecycleOwner;
            WeakReference<LifecycleOwner> weakReference = this._lifecycleOwnerRef;
            if (weakReference == null || (lifecycleOwner = weakReference.get()) == null || interfaceC9266c == null) {
                return;
            }
            startCollection(lifecycleOwner, interfaceC9266c);
        }

        @Override // androidx.databinding.ObservableReference
        public void removeListener(InterfaceC9266c interfaceC9266c) {
            InterfaceC9212n interfaceC9212n = this.observerJob;
            if (interfaceC9212n != null) {
                InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
            }
            this.observerJob = null;
        }
    }

    private ViewDataBindingKtx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WeakListener CREATE_STATE_FLOW_LISTENER$lambda$0(ViewDataBinding viewDataBinding, int i10, ReferenceQueue referenceQueue) {
        AbstractC9133u.m16130d(referenceQueue);
        return new StateFlowListener(viewDataBinding, i10, referenceQueue).getListener();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final boolean updateStateFlowRegistration(ViewDataBinding viewDataBinding, int i10, InterfaceC9266c interfaceC9266c) {
        AbstractC9133u.m16133g(viewDataBinding, "viewDataBinding");
        viewDataBinding.mInStateFlowRegisterObserver = true;
        try {
            return viewDataBinding.updateRegistration(i10, interfaceC9266c, CREATE_STATE_FLOW_LISTENER);
        } finally {
            viewDataBinding.mInStateFlowRegisterObserver = false;
        }
    }
}
