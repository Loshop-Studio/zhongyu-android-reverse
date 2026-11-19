package ge;

import ee.AbstractC9128e;
import ee.InterfaceC9129f;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9226c;
import p153fe.InterfaceC9227d;
import p153fe.InterfaceC9229f;
import p265nd.AbstractC10410o;
import p265nd.C10403h;

/* renamed from: ge.i1 */
/* loaded from: classes6.dex */
public abstract class AbstractC9336i1 extends AbstractC9294a {

    /* renamed from: a */
    public final InterfaceC5432b f21740a;

    /* renamed from: b */
    public final InterfaceC5432b f21741b;

    public /* synthetic */ AbstractC9336i1(InterfaceC5432b interfaceC5432b, InterfaceC5432b interfaceC5432b2, AbstractC9972n abstractC9972n) {
        this(interfaceC5432b, interfaceC5432b2);
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public abstract InterfaceC9129f getDescriptor();

    /* renamed from: m */
    public final InterfaceC5432b m18451m() {
        return this.f21740a;
    }

    /* renamed from: n */
    public final InterfaceC5432b m18452n() {
        return this.f21741b;
    }

    @Override // ge.AbstractC9294a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void mo18334g(InterfaceC9226c decoder, Map builder, int i10, int i11) {
        AbstractC9979u.m20294g(decoder, "decoder");
        AbstractC9979u.m20294g(builder, "builder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        C10403h c10403hM21767t = AbstractC10410o.m21767t(AbstractC10410o.m21768u(0, i11 * 2), 2);
        int iM21733b = c10403hM21767t.m21733b();
        int iM21734c = c10403hM21767t.m21734c();
        int iM21735d = c10403hM21767t.m21735d();
        if ((iM21735d <= 0 || iM21733b > iM21734c) && (iM21735d >= 0 || iM21734c > iM21733b)) {
            return;
        }
        while (true) {
            mo18335h(decoder, i10 + iM21733b, builder, false);
            if (iM21733b == iM21734c) {
                return;
            } else {
                iM21733b += iM21735d;
            }
        }
    }

    @Override // ge.AbstractC9294a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void mo18335h(InterfaceC9226c decoder, int i10, Map builder, boolean z10) {
        int iDecodeElementIndex;
        AbstractC9979u.m20294g(decoder, "decoder");
        AbstractC9979u.m20294g(builder, "builder");
        Object objM18145c = InterfaceC9226c.a.m18145c(decoder, getDescriptor(), i10, this.f21740a, null, 8, null);
        if (z10) {
            iDecodeElementIndex = decoder.decodeElementIndex(getDescriptor());
            if (iDecodeElementIndex != i10 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i10 + ", returned index for value: " + iDecodeElementIndex).toString());
            }
        } else {
            iDecodeElementIndex = i10 + 1;
        }
        int i11 = iDecodeElementIndex;
        builder.put(objM18145c, (!builder.containsKey(objM18145c) || (this.f21741b.getDescriptor().getKind() instanceof AbstractC9128e)) ? InterfaceC9226c.a.m18145c(decoder, getDescriptor(), i11, this.f21741b, null, 8, null) : decoder.decodeSerializableElement(getDescriptor(), i11, this.f21741b, AbstractC9925a.m20089i(builder, objM18145c)));
    }

    @Override // p049ce.InterfaceC5439i
    public void serialize(InterfaceC9229f encoder, Object obj) {
        AbstractC9979u.m20294g(encoder, "encoder");
        int iMo18332e = mo18332e(obj);
        InterfaceC9129f descriptor = getDescriptor();
        InterfaceC9227d interfaceC9227dBeginCollection = encoder.beginCollection(descriptor, iMo18332e);
        Iterator itMo18331d = mo18331d(obj);
        int i10 = 0;
        while (itMo18331d.hasNext()) {
            Map.Entry entry = (Map.Entry) itMo18331d.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i11 = i10 + 1;
            interfaceC9227dBeginCollection.encodeSerializableElement(getDescriptor(), i10, m18451m(), key);
            i10 += 2;
            interfaceC9227dBeginCollection.encodeSerializableElement(getDescriptor(), i11, m18452n(), value);
        }
        interfaceC9227dBeginCollection.endStructure(descriptor);
    }

    public AbstractC9336i1(InterfaceC5432b interfaceC5432b, InterfaceC5432b interfaceC5432b2) {
        super(null);
        this.f21740a = interfaceC5432b;
        this.f21741b = interfaceC5432b2;
    }
}
