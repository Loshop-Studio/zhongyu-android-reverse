package androidx.lifecycle;

import com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText;
import p000a.p057m.AbstractC0355d;
import p000a.p057m.InterfaceC0353b;
import p000a.p057m.InterfaceC0356e;
import p000a.p057m.InterfaceC0358g;

/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements InterfaceC0356e {

    /* renamed from: a */
    public final InterfaceC0353b f3187a;

    /* renamed from: b */
    public final InterfaceC0356e f3188b;

    public FullLifecycleObserverAdapter(InterfaceC0353b interfaceC0353b, InterfaceC0356e interfaceC0356e) {
        this.f3187a = interfaceC0353b;
        this.f3188b = interfaceC0356e;
    }

    @Override // p000a.p057m.InterfaceC0356e
    /* renamed from: g */
    public void mo1278g(InterfaceC0358g interfaceC0358g, AbstractC0355d.a aVar) {
        switch (aVar.ordinal()) {
            case MaterialEditText.FLOATING_LABEL_NONE /* 0 */:
                this.f3187a.m1272e(interfaceC0358g);
                break;
            case MaterialEditText.FLOATING_LABEL_NORMAL /* 1 */:
                this.f3187a.m1273f(interfaceC0358g);
                break;
            case MaterialEditText.FLOATING_LABEL_HIGHLIGHT /* 2 */:
                this.f3187a.m1268a(interfaceC0358g);
                break;
            case 3:
                this.f3187a.m1269b(interfaceC0358g);
                break;
            case 4:
                this.f3187a.m1271d(interfaceC0358g);
                break;
            case 5:
                this.f3187a.m1270c(interfaceC0358g);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0356e interfaceC0356e = this.f3188b;
        if (interfaceC0356e != null) {
            interfaceC0356e.mo1278g(interfaceC0358g, aVar);
        }
    }
}
