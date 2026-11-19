package p136p0;

import androidx.room.AbstractC0621h0;
import p149s0.InterfaceC3375f;

/* renamed from: p0.f */
/* loaded from: classes.dex */
public abstract class AbstractC2989f<T> extends AbstractC2995l {
    public AbstractC2989f(AbstractC0621h0 abstractC0621h0) {
        super(abstractC0621h0);
    }

    /* renamed from: g */
    protected abstract void mo10081g(InterfaceC3375f interfaceC3375f, T t3);

    /* renamed from: h */
    public final int m10082h(T t3) {
        InterfaceC3375f interfaceC3375fM10094a = m10094a();
        try {
            mo10081g(interfaceC3375fM10094a, t3);
            return interfaceC3375fM10094a.mo3521i();
        } finally {
            m10096f(interfaceC3375fM10094a);
        }
    }
}
