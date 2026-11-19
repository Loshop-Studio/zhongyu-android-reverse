package p015b0;

import kotlin.NoWhenBranchMatchedException;
import p015b0.InterfaceC4397c;
import p187y.C7871d;
import p187y.C7884q;
import p187y.InterfaceC7877j;

/* renamed from: b0.b */
/* loaded from: classes3.dex */
public final class C4396b implements InterfaceC4397c {

    /* renamed from: a */
    public final InterfaceC4398d f1237a;

    /* renamed from: b */
    public final InterfaceC7877j f1238b;

    /* renamed from: b0.b$a */
    public static final class a implements InterfaceC4397c.a {
        @Override // p015b0.InterfaceC4397c.a
        /* renamed from: a */
        public InterfaceC4397c mo1404a(InterfaceC4398d interfaceC4398d, InterfaceC7877j interfaceC7877j) {
            return new C4396b(interfaceC4398d, interfaceC7877j);
        }
    }

    public C4396b(InterfaceC4398d interfaceC4398d, InterfaceC7877j interfaceC7877j) {
        this.f1237a = interfaceC4398d;
        this.f1238b = interfaceC7877j;
    }

    @Override // p015b0.InterfaceC4397c
    /* renamed from: a */
    public void mo1403a() {
        InterfaceC7877j interfaceC7877j = this.f1238b;
        if (interfaceC7877j instanceof C7884q) {
            this.f1237a.mo5a(((C7884q) interfaceC7877j).m9674d());
        } else {
            if (!(interfaceC7877j instanceof C7871d)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f1237a.mo6b(((C7871d) interfaceC7877j).m9569b());
        }
    }
}
