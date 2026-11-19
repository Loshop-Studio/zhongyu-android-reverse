package p204j6;

import android.content.Context;
import p260n6.InterfaceC10324c;

/* renamed from: j6.b */
/* loaded from: classes5.dex */
public class C9685b implements InterfaceC9684a {

    /* renamed from: b */
    public static C9685b f22486b;

    /* renamed from: a */
    public InterfaceC9684a f22487a;

    /* renamed from: c */
    public static C9685b m19172c() {
        if (f22486b == null) {
            synchronized (C9685b.class) {
                try {
                    if (f22486b == null) {
                        f22486b = new C9685b();
                    }
                } finally {
                }
            }
        }
        return f22486b;
    }

    @Override // p204j6.InterfaceC9684a
    /* renamed from: a */
    public InterfaceC10324c mo19170a() {
        InterfaceC9684a interfaceC9684a = this.f22487a;
        if (interfaceC9684a == null) {
            return null;
        }
        interfaceC9684a.mo19170a();
        return null;
    }

    @Override // p204j6.InterfaceC9684a
    /* renamed from: b */
    public Context mo19171b() {
        InterfaceC9684a interfaceC9684a = this.f22487a;
        if (interfaceC9684a == null) {
            return null;
        }
        return interfaceC9684a.mo19171b();
    }
}
