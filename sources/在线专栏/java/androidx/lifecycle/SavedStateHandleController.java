package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0496f;
import androidx.savedstate.InterfaceC0651c;
import androidx.savedstate.SavedStateRegistry;
import java.util.Iterator;

/* loaded from: classes.dex */
final class SavedStateHandleController implements InterfaceC0501i {

    /* renamed from: a */
    private final String f3379a;

    /* renamed from: b */
    private boolean f3380b = false;

    /* renamed from: c */
    private final C0517y f3381c;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    static final class C0484a implements SavedStateRegistry.InterfaceC0647a {
        C0484a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0647a
        /* renamed from: a */
        public void mo2823a(InterfaceC0651c interfaceC0651c) throws NoSuchMethodException, SecurityException {
            if (!(interfaceC0651c instanceof InterfaceC0495e0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
            }
            C0493d0 viewModelStore = ((InterfaceC0495e0) interfaceC0651c).getViewModelStore();
            SavedStateRegistry savedStateRegistry = interfaceC0651c.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.m2864c().iterator();
            while (it.hasNext()) {
                SavedStateHandleController.m2817e(viewModelStore.m2863b(it.next()), savedStateRegistry, interfaceC0651c.getLifecycle());
            }
            if (viewModelStore.m2864c().isEmpty()) {
                return;
            }
            savedStateRegistry.m3662e(C0484a.class);
        }
    }

    SavedStateHandleController(String str, C0517y c0517y) {
        this.f3379a = str;
        this.f3381c = c0517y;
    }

    /* renamed from: e */
    static void m2817e(AbstractC0489b0 abstractC0489b0, SavedStateRegistry savedStateRegistry, AbstractC0496f abstractC0496f) throws NoSuchMethodException, SecurityException {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) abstractC0489b0.m2840c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.m2822l()) {
            return;
        }
        savedStateHandleController.m2820i(savedStateRegistry, abstractC0496f);
        m2819m(savedStateRegistry, abstractC0496f);
    }

    /* renamed from: j */
    static SavedStateHandleController m2818j(SavedStateRegistry savedStateRegistry, AbstractC0496f abstractC0496f, String str, Bundle bundle) throws NoSuchMethodException, SecurityException {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, C0517y.m2917a(savedStateRegistry.m3658a(str), bundle));
        savedStateHandleController.m2820i(savedStateRegistry, abstractC0496f);
        m2819m(savedStateRegistry, abstractC0496f);
        return savedStateHandleController;
    }

    /* renamed from: m */
    private static void m2819m(final SavedStateRegistry savedStateRegistry, final AbstractC0496f abstractC0496f) throws NoSuchMethodException, SecurityException {
        AbstractC0496f.c cVarMo2868b = abstractC0496f.mo2868b();
        if (cVarMo2868b == AbstractC0496f.c.INITIALIZED || cVarMo2868b.m2874a(AbstractC0496f.c.STARTED)) {
            savedStateRegistry.m3662e(C0484a.class);
        } else {
            abstractC0496f.mo2867a(new InterfaceC0501i() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // androidx.lifecycle.InterfaceC0501i
                /* renamed from: d */
                public void mo63d(InterfaceC0504l interfaceC0504l, AbstractC0496f.b bVar) throws NoSuchMethodException, SecurityException {
                    if (bVar == AbstractC0496f.b.ON_START) {
                        abstractC0496f.mo2869c(this);
                        savedStateRegistry.m3662e(C0484a.class);
                    }
                }
            });
        }
    }

    @Override // androidx.lifecycle.InterfaceC0501i
    /* renamed from: d */
    public void mo63d(InterfaceC0504l interfaceC0504l, AbstractC0496f.b bVar) {
        if (bVar == AbstractC0496f.b.ON_DESTROY) {
            this.f3380b = false;
            interfaceC0504l.getLifecycle().mo2869c(this);
        }
    }

    /* renamed from: i */
    void m2820i(SavedStateRegistry savedStateRegistry, AbstractC0496f abstractC0496f) {
        if (this.f3380b) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f3380b = true;
        abstractC0496f.mo2867a(this);
        savedStateRegistry.m3661d(this.f3379a, this.f3381c.m2919b());
    }

    /* renamed from: k */
    C0517y m2821k() {
        return this.f3381c;
    }

    /* renamed from: l */
    boolean m2822l() {
        return this.f3380b;
    }
}
