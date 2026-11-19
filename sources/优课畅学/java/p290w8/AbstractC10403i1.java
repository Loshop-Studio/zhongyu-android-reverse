package p290w8;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p077d8.C8319d;
import p246s8.InterfaceC10052b;
import p268u8.AbstractC10209e;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10254c;
import p279v8.InterfaceC10255d;
import p279v8.InterfaceC10257f;

/* renamed from: w8.i1 */
/* loaded from: classes5.dex */
public abstract class AbstractC10403i1 extends AbstractC10361a {

    /* renamed from: a */
    public final InterfaceC10052b f20713a;

    /* renamed from: b */
    public final InterfaceC10052b f20714b;

    public /* synthetic */ AbstractC10403i1(InterfaceC10052b interfaceC10052b, InterfaceC10052b interfaceC10052b2, AbstractC9126n abstractC9126n) {
        this(interfaceC10052b, interfaceC10052b2);
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public abstract InterfaceC10210f getDescriptor();

    /* renamed from: m */
    public final InterfaceC10052b m19425m() {
        return this.f20713a;
    }

    /* renamed from: n */
    public final InterfaceC10052b m19426n() {
        return this.f20714b;
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void mo19308g(InterfaceC10254c decoder, Map builder, int i10, int i11) {
        AbstractC9133u.m16133g(decoder, "decoder");
        AbstractC9133u.m16133g(builder, "builder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        C8319d c8319dM13524s = AbstractC8323h.m13524s(AbstractC8323h.m13525t(0, i11 * 2), 2);
        int iM13496b = c8319dM13524s.m13496b();
        int iM13497c = c8319dM13524s.m13497c();
        int iM13498d = c8319dM13524s.m13498d();
        if ((iM13498d <= 0 || iM13496b > iM13497c) && (iM13498d >= 0 || iM13497c > iM13496b)) {
            return;
        }
        while (true) {
            mo19309h(decoder, i10 + iM13496b, builder, false);
            if (iM13496b == iM13497c) {
                return;
            } else {
                iM13496b += iM13498d;
            }
        }
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void mo19309h(InterfaceC10254c decoder, int i10, Map builder, boolean z10) {
        int iDecodeElementIndex;
        AbstractC9133u.m16133g(decoder, "decoder");
        AbstractC9133u.m16133g(builder, "builder");
        Object objM19208c = InterfaceC10254c.a.m19208c(decoder, getDescriptor(), i10, this.f20713a, null, 8, null);
        if (z10) {
            iDecodeElementIndex = decoder.decodeElementIndex(getDescriptor());
            if (iDecodeElementIndex != i10 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i10 + ", returned index for value: " + iDecodeElementIndex).toString());
            }
        } else {
            iDecodeElementIndex = i10 + 1;
        }
        int i11 = iDecodeElementIndex;
        builder.put(objM19208c, (!builder.containsKey(objM19208c) || (this.f20714b.getDescriptor().getKind() instanceof AbstractC10209e)) ? InterfaceC10254c.a.m19208c(decoder, getDescriptor(), i11, this.f20714b, null, 8, null) : decoder.decodeSerializableElement(getDescriptor(), i11, this.f20714b, AbstractC9080a.m15944i(builder, objM19208c)));
    }

    @Override // p246s8.InterfaceC10059i
    public void serialize(InterfaceC10257f encoder, Object obj) {
        AbstractC9133u.m16133g(encoder, "encoder");
        int iMo19306e = mo19306e(obj);
        InterfaceC10210f descriptor = getDescriptor();
        InterfaceC10255d interfaceC10255dBeginCollection = encoder.beginCollection(descriptor, iMo19306e);
        Iterator itMo19305d = mo19305d(obj);
        int i10 = 0;
        while (itMo19305d.hasNext()) {
            Map.Entry entry = (Map.Entry) itMo19305d.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i11 = i10 + 1;
            interfaceC10255dBeginCollection.encodeSerializableElement(getDescriptor(), i10, m19425m(), key);
            i10 += 2;
            interfaceC10255dBeginCollection.encodeSerializableElement(getDescriptor(), i11, m19426n(), value);
        }
        interfaceC10255dBeginCollection.endStructure(descriptor);
    }

    public AbstractC10403i1(InterfaceC10052b interfaceC10052b, InterfaceC10052b interfaceC10052b2) {
        super(null);
        this.f20713a = interfaceC10052b;
        this.f20714b = interfaceC10052b2;
    }
}
