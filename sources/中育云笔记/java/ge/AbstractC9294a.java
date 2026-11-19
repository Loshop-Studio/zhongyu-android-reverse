package ge;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9226c;
import p153fe.InterfaceC9228e;

/* renamed from: ge.a */
/* loaded from: classes6.dex */
public abstract class AbstractC9294a implements InterfaceC5432b {
    public /* synthetic */ AbstractC9294a(AbstractC9972n abstractC9972n) {
        this();
    }

    /* renamed from: i */
    public static /* synthetic */ void m18327i(AbstractC9294a abstractC9294a, InterfaceC9226c interfaceC9226c, int i10, Object obj, boolean z10, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        abstractC9294a.mo18335h(interfaceC9226c, i10, obj, z10);
    }

    /* renamed from: a */
    public abstract Object mo18328a();

    /* renamed from: b */
    public abstract int mo18329b(Object obj);

    /* renamed from: c */
    public abstract void mo18330c(Object obj, int i10);

    /* renamed from: d */
    public abstract Iterator mo18331d(Object obj);

    @Override // p049ce.InterfaceC5431a
    public Object deserialize(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        return m18333f(decoder, null);
    }

    /* renamed from: e */
    public abstract int mo18332e(Object obj);

    /* renamed from: f */
    public final Object m18333f(InterfaceC9228e decoder, Object obj) {
        Object objMo18328a;
        AbstractC9979u.m20294g(decoder, "decoder");
        if (obj == null || (objMo18328a = mo18337k(obj)) == null) {
            objMo18328a = mo18328a();
        }
        Object obj2 = objMo18328a;
        int iMo18329b = mo18329b(obj2);
        InterfaceC9226c interfaceC9226cBeginStructure = decoder.beginStructure(getDescriptor());
        if (!interfaceC9226cBeginStructure.decodeSequentially()) {
            while (true) {
                int iDecodeElementIndex = interfaceC9226cBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    break;
                }
                m18327i(this, interfaceC9226cBeginStructure, iMo18329b + iDecodeElementIndex, obj2, false, 8, null);
            }
        } else {
            mo18334g(interfaceC9226cBeginStructure, obj2, iMo18329b, m18336j(interfaceC9226cBeginStructure, obj2));
        }
        interfaceC9226cBeginStructure.endStructure(getDescriptor());
        return mo18338l(obj2);
    }

    /* renamed from: g */
    public abstract void mo18334g(InterfaceC9226c interfaceC9226c, Object obj, int i10, int i11);

    /* renamed from: h */
    public abstract void mo18335h(InterfaceC9226c interfaceC9226c, int i10, Object obj, boolean z10);

    /* renamed from: j */
    public final int m18336j(InterfaceC9226c interfaceC9226c, Object obj) {
        int iDecodeCollectionSize = interfaceC9226c.decodeCollectionSize(getDescriptor());
        mo18330c(obj, iDecodeCollectionSize);
        return iDecodeCollectionSize;
    }

    /* renamed from: k */
    public abstract Object mo18337k(Object obj);

    /* renamed from: l */
    public abstract Object mo18338l(Object obj);

    public AbstractC9294a() {
    }
}
