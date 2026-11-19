package p290w8;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10052b;
import p279v8.InterfaceC10254c;
import p279v8.InterfaceC10256e;

/* renamed from: w8.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10361a implements InterfaceC10052b {
    public /* synthetic */ AbstractC10361a(AbstractC9126n abstractC9126n) {
        this();
    }

    /* renamed from: i */
    public static /* synthetic */ void m19301i(AbstractC10361a abstractC10361a, InterfaceC10254c interfaceC10254c, int i10, Object obj, boolean z10, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        abstractC10361a.mo19309h(interfaceC10254c, i10, obj, z10);
    }

    /* renamed from: a */
    public abstract Object mo19302a();

    /* renamed from: b */
    public abstract int mo19303b(Object obj);

    /* renamed from: c */
    public abstract void mo19304c(Object obj, int i10);

    /* renamed from: d */
    public abstract Iterator mo19305d(Object obj);

    @Override // p246s8.InterfaceC10051a
    public Object deserialize(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        return m19307f(decoder, null);
    }

    /* renamed from: e */
    public abstract int mo19306e(Object obj);

    /* renamed from: f */
    public final Object m19307f(InterfaceC10256e decoder, Object obj) {
        Object objMo19302a;
        AbstractC9133u.m16133g(decoder, "decoder");
        if (obj == null || (objMo19302a = mo19311k(obj)) == null) {
            objMo19302a = mo19302a();
        }
        Object obj2 = objMo19302a;
        int iMo19303b = mo19303b(obj2);
        InterfaceC10254c interfaceC10254cBeginStructure = decoder.beginStructure(getDescriptor());
        if (!interfaceC10254cBeginStructure.decodeSequentially()) {
            while (true) {
                int iDecodeElementIndex = interfaceC10254cBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    break;
                }
                m19301i(this, interfaceC10254cBeginStructure, iMo19303b + iDecodeElementIndex, obj2, false, 8, null);
            }
        } else {
            mo19308g(interfaceC10254cBeginStructure, obj2, iMo19303b, m19310j(interfaceC10254cBeginStructure, obj2));
        }
        interfaceC10254cBeginStructure.endStructure(getDescriptor());
        return mo19312l(obj2);
    }

    /* renamed from: g */
    public abstract void mo19308g(InterfaceC10254c interfaceC10254c, Object obj, int i10, int i11);

    /* renamed from: h */
    public abstract void mo19309h(InterfaceC10254c interfaceC10254c, int i10, Object obj, boolean z10);

    /* renamed from: j */
    public final int m19310j(InterfaceC10254c interfaceC10254c, Object obj) {
        int iDecodeCollectionSize = interfaceC10254c.decodeCollectionSize(getDescriptor());
        mo19304c(obj, iDecodeCollectionSize);
        return iDecodeCollectionSize;
    }

    /* renamed from: k */
    public abstract Object mo19311k(Object obj);

    /* renamed from: l */
    public abstract Object mo19312l(Object obj);

    public AbstractC10361a() {
    }
}
