package p136p0;

import androidx.room.AbstractC0621h0;
import p149s0.InterfaceC3375f;

/* renamed from: p0.g */
/* loaded from: classes.dex */
public abstract class AbstractC2990g<T> extends AbstractC2995l {
    public AbstractC2990g(AbstractC0621h0 abstractC0621h0) {
        super(abstractC0621h0);
    }

    /* renamed from: g */
    protected abstract void mo8257g(InterfaceC3375f interfaceC3375f, T t3);

    /* renamed from: h */
    public final void m10083h(T t3) {
        InterfaceC3375f interfaceC3375fM10094a = m10094a();
        try {
            mo8257g(interfaceC3375fM10094a, t3);
            interfaceC3375fM10094a.mo3520G();
        } finally {
            m10096f(interfaceC3375fM10094a);
        }
    }

    /* renamed from: i */
    public final long m10084i(T t3) {
        InterfaceC3375f interfaceC3375fM10094a = m10094a();
        try {
            mo8257g(interfaceC3375fM10094a, t3);
            return interfaceC3375fM10094a.mo3520G();
        } finally {
            m10096f(interfaceC3375fM10094a);
        }
    }
}
