package p118m7;

import android.support.v4.media.AbstractC0037f;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.SerializationException;
import p000a.AbstractC0000a;
import p045d6.C5443s;
import p084i7.InterfaceC5686b;
import p101k7.C5759a;
import p101k7.C5766h;
import p101k7.C5770l;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6070d;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;
import p152r6.InterfaceC6471c;

/* renamed from: m7.r0 */
/* loaded from: classes4.dex */
public final class C6170r0 implements InterfaceC5686b {

    /* renamed from: a */
    public final InterfaceC5686b f9854a;

    /* renamed from: b */
    public final InterfaceC5686b f9855b;

    /* renamed from: c */
    public final /* synthetic */ int f9856c;

    /* renamed from: d */
    public final C5766h f9857d;

    public C6170r0(InterfaceC5686b interfaceC5686b, InterfaceC5686b interfaceC5686b2, byte b6) {
        this.f9854a = interfaceC5686b;
        this.f9855b = interfaceC5686b2;
    }

    /* renamed from: a */
    public final Object m5830a(Object obj, Object obj2) {
        switch (this.f9856c) {
            case 0:
                return new C6167q0(obj, obj2);
            default:
                return new Pair(obj, obj2);
        }
    }

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        Object objM5830a;
        Object obj = AbstractC6191y0.f9898c;
        AbstractC5830k.m5330g(decoder, "decoder");
        InterfaceC5765g descriptor = getDescriptor();
        InterfaceC6069c interfaceC6069cBeginStructure = decoder.beginStructure(descriptor);
        boolean zDecodeSequentially = interfaceC6069cBeginStructure.decodeSequentially();
        InterfaceC5686b interfaceC5686b = this.f9855b;
        InterfaceC5686b interfaceC5686b2 = this.f9854a;
        if (zDecodeSequentially) {
            objM5830a = m5830a(interfaceC6069cBeginStructure.decodeSerializableElement(getDescriptor(), 0, interfaceC5686b2, null), interfaceC6069cBeginStructure.decodeSerializableElement(getDescriptor(), 1, interfaceC5686b, null));
        } else {
            Object objDecodeSerializableElement = obj;
            Object objDecodeSerializableElement2 = objDecodeSerializableElement;
            while (true) {
                int iDecodeElementIndex = interfaceC6069cBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex != -1) {
                    if (iDecodeElementIndex == 0) {
                        objDecodeSerializableElement = interfaceC6069cBeginStructure.decodeSerializableElement(getDescriptor(), 0, interfaceC5686b2, null);
                    } else {
                        if (iDecodeElementIndex != 1) {
                            throw new SerializationException(AbstractC0037f.m81f(iDecodeElementIndex, "Invalid index: "));
                        }
                        objDecodeSerializableElement2 = interfaceC6069cBeginStructure.decodeSerializableElement(getDescriptor(), 1, interfaceC5686b, null);
                    }
                } else {
                    if (objDecodeSerializableElement == obj) {
                        throw new SerializationException("Element 'key' is missing");
                    }
                    if (objDecodeSerializableElement2 == obj) {
                        throw new SerializationException("Element 'value' is missing");
                    }
                    objM5830a = m5830a(objDecodeSerializableElement, objDecodeSerializableElement2);
                }
            }
        }
        interfaceC6069cBeginStructure.endStructure(descriptor);
        return objM5830a;
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        switch (this.f9856c) {
        }
        return this.f9857d;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        Object key;
        Object value;
        InterfaceC6070d interfaceC6070dBeginStructure = interfaceC6072f.beginStructure(getDescriptor());
        InterfaceC5765g descriptor = getDescriptor();
        InterfaceC5686b interfaceC5686b = this.f9854a;
        switch (this.f9856c) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC5830k.m5330g(entry, "<this>");
                key = entry.getKey();
                break;
            default:
                Pair pair = (Pair) obj;
                AbstractC5830k.m5330g(pair, "<this>");
                key = pair.getFirst();
                break;
        }
        interfaceC6070dBeginStructure.encodeSerializableElement(descriptor, 0, interfaceC5686b, key);
        InterfaceC5765g descriptor2 = getDescriptor();
        InterfaceC5686b interfaceC5686b2 = this.f9855b;
        switch (this.f9856c) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                AbstractC5830k.m5330g(entry2, "<this>");
                value = entry2.getValue();
                break;
            default:
                Pair pair2 = (Pair) obj;
                AbstractC5830k.m5330g(pair2, "<this>");
                value = pair2.getSecond();
                break;
        }
        interfaceC6070dBeginStructure.encodeSerializableElement(descriptor2, 1, interfaceC5686b2, value);
        interfaceC6070dBeginStructure.endStructure(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6170r0(final InterfaceC5686b interfaceC5686b, final InterfaceC5686b interfaceC5686b2, int i) {
        this(interfaceC5686b, interfaceC5686b2, (byte) 0);
        this.f9856c = i;
        switch (i) {
            case 1:
                this(interfaceC5686b, interfaceC5686b2, (byte) 0);
                final int i8 = 1;
                this.f9857d = AbstractC0000a.m4e("kotlin.Pair", new InterfaceC5765g[0], new InterfaceC6471c() { // from class: m7.p0
                    @Override // p152r6.InterfaceC6471c
                    public final Object invoke(Object obj) {
                        C5759a buildSerialDescriptor = (C5759a) obj;
                        switch (i8) {
                            case 0:
                                AbstractC5830k.m5330g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                                C5759a.m5098a(buildSerialDescriptor, "key", interfaceC5686b.getDescriptor());
                                C5759a.m5098a(buildSerialDescriptor, "value", interfaceC5686b2.getDescriptor());
                                break;
                            default:
                                AbstractC5830k.m5330g(buildSerialDescriptor, "$this$buildClassSerialDescriptor");
                                C5759a.m5098a(buildSerialDescriptor, "first", interfaceC5686b.getDescriptor());
                                C5759a.m5098a(buildSerialDescriptor, "second", interfaceC5686b2.getDescriptor());
                                break;
                        }
                        return C5443s.f8405a;
                    }
                });
                break;
            default:
                final int i9 = 0;
                this.f9857d = AbstractC0000a.m6g("kotlin.collections.Map.Entry", C5770l.f9148d, new InterfaceC5765g[0], new InterfaceC6471c() { // from class: m7.p0
                    @Override // p152r6.InterfaceC6471c
                    public final Object invoke(Object obj) {
                        C5759a buildSerialDescriptor = (C5759a) obj;
                        switch (i9) {
                            case 0:
                                AbstractC5830k.m5330g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                                C5759a.m5098a(buildSerialDescriptor, "key", interfaceC5686b.getDescriptor());
                                C5759a.m5098a(buildSerialDescriptor, "value", interfaceC5686b2.getDescriptor());
                                break;
                            default:
                                AbstractC5830k.m5330g(buildSerialDescriptor, "$this$buildClassSerialDescriptor");
                                C5759a.m5098a(buildSerialDescriptor, "first", interfaceC5686b.getDescriptor());
                                C5759a.m5098a(buildSerialDescriptor, "second", interfaceC5686b2.getDescriptor());
                                break;
                        }
                        return C5443s.f8405a;
                    }
                });
                break;
        }
    }
}
