package androidx.databinding;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.InterfaceC10045g;
import p379vd.InterfaceC11594c;
import sd.AbstractC11117h;

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

    public static final class StateFlowListener implements ObservableReference<InterfaceC11594c> {
        private WeakReference<LifecycleOwner> _lifecycleOwnerRef;
        private final WeakListener<InterfaceC11594c> listener;
        private InterfaceC10045g observerJob;

        public StateFlowListener(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            AbstractC9979u.m20294g(referenceQueue, "referenceQueue");
            this.listener = new WeakListener<>(viewDataBinding, i10, this, referenceQueue);
        }

        private final void startCollection(LifecycleOwner lifecycleOwner, InterfaceC11594c interfaceC11594c) {
            InterfaceC10045g interfaceC10045g = this.observerJob;
            if (interfaceC10045g != null) {
                InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
            }
            this.observerJob = AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new ViewDataBindingKtx$StateFlowListener$startCollection$1(lifecycleOwner, interfaceC11594c, this, null), 3, null);
        }

        @Override // androidx.databinding.ObservableReference
        public WeakListener<InterfaceC11594c> getListener() {
            return this.listener;
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
            WeakReference<LifecycleOwner> weakReference = this._lifecycleOwnerRef;
            if ((weakReference != null ? weakReference.get() : null) == lifecycleOwner) {
                return;
            }
            InterfaceC10045g interfaceC10045g = this.observerJob;
            if (interfaceC10045g != null) {
                InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
            }
            if (lifecycleOwner == null) {
                this._lifecycleOwnerRef = null;
                return;
            }
            this._lifecycleOwnerRef = new WeakReference<>(lifecycleOwner);
            InterfaceC11594c target = this.listener.getTarget();
            if (target != null) {
                startCollection(lifecycleOwner, target);
            }
        }

        @Override // androidx.databinding.ObservableReference
        public void addListener(InterfaceC11594c interfaceC11594c) {
            LifecycleOwner lifecycleOwner;
            WeakReference<LifecycleOwner> weakReference = this._lifecycleOwnerRef;
            if (weakReference == null || (lifecycleOwner = weakReference.get()) == null || interfaceC11594c == null) {
                return;
            }
            startCollection(lifecycleOwner, interfaceC11594c);
        }

        @Override // androidx.databinding.ObservableReference
        public void removeListener(InterfaceC11594c interfaceC11594c) {
            InterfaceC10045g interfaceC10045g = this.observerJob;
            if (interfaceC10045g != null) {
                InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
            }
            this.observerJob = null;
        }
    }

    private ViewDataBindingKtx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WeakListener CREATE_STATE_FLOW_LISTENER$lambda$0(ViewDataBinding viewDataBinding, int i10, ReferenceQueue referenceQueue) {
        AbstractC9979u.m20291d(referenceQueue);
        return new StateFlowListener(viewDataBinding, i10, referenceQueue).getListener();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final boolean updateStateFlowRegistration(ViewDataBinding viewDataBinding, int i10, InterfaceC11594c interfaceC11594c) {
        AbstractC9979u.m20294g(viewDataBinding, "viewDataBinding");
        viewDataBinding.mInStateFlowRegisterObserver = true;
        try {
            return viewDataBinding.updateRegistration(i10, interfaceC11594c, CREATE_STATE_FLOW_LISTENER);
        } finally {
            viewDataBinding.mInStateFlowRegisterObserver = false;
        }
    }
}
