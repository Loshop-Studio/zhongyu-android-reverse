package p024b4;

import p035c4.InterfaceC5232a;

/* renamed from: b4.a */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC5031a extends InterfaceC5232a.a {

    /* renamed from: a */
    public final String f2117a;

    public AbstractBinderC5031a() {
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append('-');
        sb.append(System.currentTimeMillis());
        this.f2117a = sb.toString();
    }

    @Override // p035c4.InterfaceC5232a
    public String getName() {
        return this.f2117a;
    }
}
