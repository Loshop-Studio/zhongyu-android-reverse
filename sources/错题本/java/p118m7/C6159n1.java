package p118m7;

import android.support.v4.media.AbstractC0037f;
import androidx.navigation.C2861i;
import kotlin.Triple;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.SerializationException;
import p000a.AbstractC0000a;
import p084i7.InterfaceC5686b;
import p101k7.C5766h;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6070d;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;

/* renamed from: m7.n1 */
/* loaded from: classes4.dex */
public final class C6159n1 implements InterfaceC5686b {

    /* renamed from: a */
    public final InterfaceC5686b f9834a;

    /* renamed from: b */
    public final InterfaceC5686b f9835b;

    /* renamed from: c */
    public final InterfaceC5686b f9836c;

    /* renamed from: d */
    public final C5766h f9837d = AbstractC0000a.m4e("kotlin.Triple", new InterfaceC5765g[0], new C2861i(this, 27));

    public C6159n1(InterfaceC5686b interfaceC5686b, InterfaceC5686b interfaceC5686b2, InterfaceC5686b interfaceC5686b3) {
        this.f9834a = interfaceC5686b;
        this.f9835b = interfaceC5686b2;
        this.f9836c = interfaceC5686b3;
    }

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        C5766h c5766h = this.f9837d;
        InterfaceC6069c interfaceC6069cBeginStructure = decoder.beginStructure(c5766h);
        boolean zDecodeSequentially = interfaceC6069cBeginStructure.decodeSequentially();
        InterfaceC5686b interfaceC5686b = this.f9836c;
        InterfaceC5686b interfaceC5686b2 = this.f9835b;
        InterfaceC5686b interfaceC5686b3 = this.f9834a;
        if (zDecodeSequentially) {
            Object objDecodeSerializableElement = interfaceC6069cBeginStructure.decodeSerializableElement(c5766h, 0, interfaceC5686b3, null);
            Object objDecodeSerializableElement2 = interfaceC6069cBeginStructure.decodeSerializableElement(c5766h, 1, interfaceC5686b2, null);
            Object objDecodeSerializableElement3 = interfaceC6069cBeginStructure.decodeSerializableElement(c5766h, 2, interfaceC5686b, null);
            interfaceC6069cBeginStructure.endStructure(c5766h);
            return new Triple(objDecodeSerializableElement, objDecodeSerializableElement2, objDecodeSerializableElement3);
        }
        Object obj = AbstractC6191y0.f9898c;
        Object objDecodeSerializableElement4 = obj;
        Object objDecodeSerializableElement5 = objDecodeSerializableElement4;
        Object objDecodeSerializableElement6 = objDecodeSerializableElement5;
        while (true) {
            int iDecodeElementIndex = interfaceC6069cBeginStructure.decodeElementIndex(c5766h);
            if (iDecodeElementIndex == -1) {
                interfaceC6069cBeginStructure.endStructure(c5766h);
                if (objDecodeSerializableElement4 == obj) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objDecodeSerializableElement5 == obj) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objDecodeSerializableElement6 != obj) {
                    return new Triple(objDecodeSerializableElement4, objDecodeSerializableElement5, objDecodeSerializableElement6);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iDecodeElementIndex == 0) {
                objDecodeSerializableElement4 = interfaceC6069cBeginStructure.decodeSerializableElement(c5766h, 0, interfaceC5686b3, null);
            } else if (iDecodeElementIndex == 1) {
                objDecodeSerializableElement5 = interfaceC6069cBeginStructure.decodeSerializableElement(c5766h, 1, interfaceC5686b2, null);
            } else {
                if (iDecodeElementIndex != 2) {
                    throw new SerializationException(AbstractC0037f.m81f(iDecodeElementIndex, "Unexpected index "));
                }
                objDecodeSerializableElement6 = interfaceC6069cBeginStructure.decodeSerializableElement(c5766h, 2, interfaceC5686b, null);
            }
        }
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return this.f9837d;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        Triple value = (Triple) obj;
        AbstractC5830k.m5330g(value, "value");
        C5766h c5766h = this.f9837d;
        InterfaceC6070d interfaceC6070dBeginStructure = interfaceC6072f.beginStructure(c5766h);
        interfaceC6070dBeginStructure.encodeSerializableElement(c5766h, 0, this.f9834a, value.getFirst());
        interfaceC6070dBeginStructure.encodeSerializableElement(c5766h, 1, this.f9835b, value.getSecond());
        interfaceC6070dBeginStructure.encodeSerializableElement(c5766h, 2, this.f9836c, value.getThird());
        interfaceC6070dBeginStructure.endStructure(c5766h);
    }
}
