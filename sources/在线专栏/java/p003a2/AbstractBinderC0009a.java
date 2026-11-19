package p003a2;

import org.jetbrains.annotations.NotNull;
import p013b2.InterfaceC1030a;

/* renamed from: a2.a */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0009a extends InterfaceC1030a.a {

    /* renamed from: a */
    private final String f53a;

    public AbstractBinderC0009a() {
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append('-');
        sb.append(System.currentTimeMillis());
        this.f53a = sb.toString();
    }

    @Override // p013b2.InterfaceC1030a
    @NotNull
    public String getName() {
        return this.f53a;
    }
}
