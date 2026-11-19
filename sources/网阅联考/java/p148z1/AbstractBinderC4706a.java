package p148z1;

import p003a2.InterfaceC0009a;

/* renamed from: z1.a */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4706a extends InterfaceC0009a.a {

    /* renamed from: a */
    public final String f6066a;

    public AbstractBinderC4706a() {
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append('-');
        sb.append(System.currentTimeMillis());
        this.f6066a = sb.toString();
    }

    @Override // p003a2.InterfaceC0009a
    public String getName() {
        return this.f6066a;
    }
}
