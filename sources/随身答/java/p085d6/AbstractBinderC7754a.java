package p085d6;

import p096e6.InterfaceC7851a;

/* renamed from: d6.a */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC7754a extends InterfaceC7851a.a {

    /* renamed from: a */
    public final String f13072a;

    public AbstractBinderC7754a() {
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append('-');
        sb.append(System.currentTimeMillis());
        this.f13072a = sb.toString();
    }

    @Override // p096e6.InterfaceC7851a
    public String getName() {
        return this.f13072a;
    }
}
