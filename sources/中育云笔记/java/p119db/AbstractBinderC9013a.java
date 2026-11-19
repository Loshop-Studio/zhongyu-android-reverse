package p119db;

import p135eb.InterfaceC9114a;

/* renamed from: db.a */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC9013a extends InterfaceC9114a.a {

    /* renamed from: a */
    public final String f20990a;

    public AbstractBinderC9013a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hashCode());
        sb2.append('-');
        sb2.append(System.currentTimeMillis());
        this.f20990a = sb2.toString();
    }

    @Override // p135eb.InterfaceC9114a
    public String getName() {
        return this.f20990a;
    }
}
