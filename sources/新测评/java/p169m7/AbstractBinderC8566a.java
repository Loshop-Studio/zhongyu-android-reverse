package p169m7;

import p180n7.InterfaceC8668a;

/* renamed from: m7.a */
/* loaded from: classes.dex */
public abstract class AbstractBinderC8566a extends InterfaceC8668a.a {

    /* renamed from: a */
    public final String f14208a;

    public AbstractBinderC8566a() {
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append('-');
        sb.append(System.currentTimeMillis());
        this.f14208a = sb.toString();
    }

    @Override // p180n7.InterfaceC8668a
    public String getName() {
        return this.f14208a;
    }
}
