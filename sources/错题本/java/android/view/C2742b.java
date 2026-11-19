package android.view;

import p152r6.InterfaceC6469a;

/* renamed from: androidx.lifecycle.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2742b implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f1116a;

    /* renamed from: b */
    public final /* synthetic */ Object f1117b;

    public /* synthetic */ C2742b(Object obj, int i) {
        this.f1116a = i;
        this.f1117b = obj;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        switch (this.f1116a) {
            case 0:
                return CoroutineLiveData._init_$lambda$0((CoroutineLiveData) this.f1117b);
            default:
                return SavedStateHandleSupport.getSavedStateHandlesVM((ViewModelStoreOwner) this.f1117b);
        }
    }
}
