package androidx.lifecycle;

import androidx.lifecycle.AbstractC0496f;

/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements InterfaceC0501i {

    /* renamed from: a */
    private final InterfaceC0492d f3353a;

    /* renamed from: b */
    private final InterfaceC0501i f3354b;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    static /* synthetic */ class C0478a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3355a;

        static {
            int[] iArr = new int[AbstractC0496f.b.values().length];
            f3355a = iArr;
            try {
                iArr[AbstractC0496f.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3355a[AbstractC0496f.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3355a[AbstractC0496f.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3355a[AbstractC0496f.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3355a[AbstractC0496f.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3355a[AbstractC0496f.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3355a[AbstractC0496f.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    FullLifecycleObserverAdapter(InterfaceC0492d interfaceC0492d, InterfaceC0501i interfaceC0501i) {
        this.f3353a = interfaceC0492d;
        this.f3354b = interfaceC0501i;
    }

    @Override // androidx.lifecycle.InterfaceC0501i
    /* renamed from: d */
    public void mo63d(InterfaceC0504l interfaceC0504l, AbstractC0496f.b bVar) {
        switch (C0478a.f3355a[bVar.ordinal()]) {
            case 1:
                this.f3353a.m2858c(interfaceC0504l);
                break;
            case 2:
                this.f3353a.m2860g(interfaceC0504l);
                break;
            case 3:
                this.f3353a.m2856a(interfaceC0504l);
                break;
            case 4:
                this.f3353a.m2859f(interfaceC0504l);
                break;
            case 5:
                this.f3353a.m2861h(interfaceC0504l);
                break;
            case 6:
                this.f3353a.m2857b(interfaceC0504l);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0501i interfaceC0501i = this.f3354b;
        if (interfaceC0501i != null) {
            interfaceC0501i.mo63d(interfaceC0504l, bVar);
        }
    }
}
