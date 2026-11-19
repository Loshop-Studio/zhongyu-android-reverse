package p137p4;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.UnknownFieldException;
import org.jetbrains.annotations.NotNull;
import p045d6.InterfaceC5429e;
import p084i7.InterfaceC5685a;
import p084i7.InterfaceC5686b;
import p084i7.InterfaceC5689e;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6070d;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;
import p118m7.AbstractC6191y0;
import p118m7.C6118a1;
import p118m7.C6136g;
import p118m7.C6146j0;
import p118m7.C6156m1;
import p118m7.C6161o0;
import p118m7.InterfaceC6125c0;

/* renamed from: p4.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6384c implements InterfaceC6125c0 {

    /* renamed from: a */
    public static final C6384c f10465a;

    @NotNull
    private static final InterfaceC5765g descriptor;

    static {
        C6384c c6384c = new C6384c();
        f10465a = c6384c;
        C6118a1 c6118a1 = new C6118a1("com.zykj.mistake.feature.mistake.model.MistakeNavItem", c6384c, 11);
        c6118a1.m5821j("itemId", false);
        c6118a1.m5821j("topicId", true);
        c6118a1.m5821j("subject", true);
        c6118a1.m5821j("examName", true);
        c6118a1.m5821j("title", true);
        c6118a1.m5821j("stemShoot", true);
        c6118a1.m5821j("isCustomMistake", true);
        c6118a1.m5821j("isRelatedQstGroup", true);
        c6118a1.m5821j("hasStem", true);
        c6118a1.m5821j("isMastered", true);
        c6118a1.m5821j("tags", true);
        descriptor = c6118a1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p118m7.InterfaceC6125c0
    public final InterfaceC5686b[] childSerializers() {
        InterfaceC5429e[] interfaceC5429eArr = C6386e.f10466l;
        C6156m1 c6156m1 = C6156m1.f9829a;
        C6136g c6136g = C6136g.f9800a;
        return new InterfaceC5686b[]{C6146j0.f9816a, C6161o0.f9839a, c6156m1, c6156m1, c6156m1, c6156m1, c6136g, c6136g, c6136g, c6136g, interfaceC5429eArr[10].getValue()};
    }

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        int iDecodeIntElement;
        List list;
        int i;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        long j7;
        String str;
        String str2;
        String str3;
        String str4;
        AbstractC5830k.m5330g(decoder, "decoder");
        InterfaceC5765g interfaceC5765g = descriptor;
        InterfaceC6069c interfaceC6069cBeginStructure = decoder.beginStructure(interfaceC5765g);
        InterfaceC5429e[] interfaceC5429eArr = C6386e.f10466l;
        int i8 = 9;
        int i9 = 0;
        if (interfaceC6069cBeginStructure.decodeSequentially()) {
            iDecodeIntElement = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 0);
            long jDecodeLongElement = interfaceC6069cBeginStructure.decodeLongElement(interfaceC5765g, 1);
            String strDecodeStringElement = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 2);
            String strDecodeStringElement2 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 3);
            String strDecodeStringElement3 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 4);
            String strDecodeStringElement4 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 5);
            boolean zDecodeBooleanElement = interfaceC6069cBeginStructure.decodeBooleanElement(interfaceC5765g, 6);
            boolean zDecodeBooleanElement2 = interfaceC6069cBeginStructure.decodeBooleanElement(interfaceC5765g, 7);
            boolean zDecodeBooleanElement3 = interfaceC6069cBeginStructure.decodeBooleanElement(interfaceC5765g, 8);
            boolean zDecodeBooleanElement4 = interfaceC6069cBeginStructure.decodeBooleanElement(interfaceC5765g, 9);
            list = (List) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 10, (InterfaceC5685a) interfaceC5429eArr[10].getValue(), null);
            z8 = zDecodeBooleanElement4;
            z9 = zDecodeBooleanElement2;
            z10 = zDecodeBooleanElement;
            str4 = strDecodeStringElement4;
            str2 = strDecodeStringElement2;
            z11 = zDecodeBooleanElement3;
            str3 = strDecodeStringElement3;
            str = strDecodeStringElement;
            i = 2047;
            j7 = jDecodeLongElement;
        } else {
            boolean z12 = true;
            iDecodeIntElement = 0;
            boolean zDecodeBooleanElement5 = false;
            List list2 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            long jDecodeLongElement2 = 0;
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            boolean zDecodeBooleanElement8 = false;
            while (z12) {
                int iDecodeElementIndex = interfaceC6069cBeginStructure.decodeElementIndex(interfaceC5765g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z12 = false;
                        i8 = 9;
                    case 0:
                        i9 |= 1;
                        iDecodeIntElement = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 0);
                        i8 = 9;
                    case 1:
                        jDecodeLongElement2 = interfaceC6069cBeginStructure.decodeLongElement(interfaceC5765g, 1);
                        i9 |= 2;
                        i8 = 9;
                    case 2:
                        strDecodeStringElement5 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 2);
                        i9 |= 4;
                    case 3:
                        strDecodeStringElement6 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 3);
                        i9 |= 8;
                    case 4:
                        strDecodeStringElement7 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 4);
                        i9 |= 16;
                    case 5:
                        strDecodeStringElement8 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 5);
                        i9 |= 32;
                    case 6:
                        zDecodeBooleanElement8 = interfaceC6069cBeginStructure.decodeBooleanElement(interfaceC5765g, 6);
                        i9 |= 64;
                    case 7:
                        zDecodeBooleanElement7 = interfaceC6069cBeginStructure.decodeBooleanElement(interfaceC5765g, 7);
                        i9 |= 128;
                    case 8:
                        zDecodeBooleanElement5 = interfaceC6069cBeginStructure.decodeBooleanElement(interfaceC5765g, 8);
                        i9 |= 256;
                    case 9:
                        zDecodeBooleanElement6 = interfaceC6069cBeginStructure.decodeBooleanElement(interfaceC5765g, i8);
                        i9 |= 512;
                    case 10:
                        list2 = (List) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 10, (InterfaceC5685a) interfaceC5429eArr[10].getValue(), list2);
                        i9 |= 1024;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list2;
            i = i9;
            z8 = zDecodeBooleanElement6;
            z9 = zDecodeBooleanElement7;
            z10 = zDecodeBooleanElement8;
            z11 = zDecodeBooleanElement5;
            j7 = jDecodeLongElement2;
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
        }
        int i10 = iDecodeIntElement;
        interfaceC6069cBeginStructure.endStructure(interfaceC5765g);
        return new C6386e(i, i10, j7, str, str2, str3, str4, z10, z9, z11, z8, list);
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return descriptor;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        C6386e value = (C6386e) obj;
        AbstractC5830k.m5330g(value, "value");
        InterfaceC5765g interfaceC5765g = descriptor;
        InterfaceC6070d interfaceC6070dBeginStructure = interfaceC6072f.beginStructure(interfaceC5765g);
        InterfaceC5429e[] interfaceC5429eArr = C6386e.f10466l;
        int i = value.f10467a;
        List list = value.f10477k;
        boolean z8 = value.f10476j;
        boolean z9 = value.f10475i;
        boolean z10 = value.f10474h;
        boolean z11 = value.f10473g;
        String str = value.f10472f;
        String str2 = value.f10471e;
        String str3 = value.f10470d;
        String str4 = value.f10469c;
        long j7 = value.f10468b;
        interfaceC6070dBeginStructure.encodeIntElement(interfaceC5765g, 0, i);
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 1) || j7 != 0) {
            interfaceC6070dBeginStructure.encodeLongElement(interfaceC5765g, 1, j7);
        }
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 2) || !AbstractC5830k.m5325b(str4, "")) {
            interfaceC6070dBeginStructure.encodeStringElement(interfaceC5765g, 2, str4);
        }
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 3) || !AbstractC5830k.m5325b(str3, "")) {
            interfaceC6070dBeginStructure.encodeStringElement(interfaceC5765g, 3, str3);
        }
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 4) || !AbstractC5830k.m5325b(str2, "")) {
            interfaceC6070dBeginStructure.encodeStringElement(interfaceC5765g, 4, str2);
        }
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 5) || !AbstractC5830k.m5325b(str, "")) {
            interfaceC6070dBeginStructure.encodeStringElement(interfaceC5765g, 5, str);
        }
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 6) || z11) {
            interfaceC6070dBeginStructure.encodeBooleanElement(interfaceC5765g, 6, z11);
        }
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 7) || z10) {
            interfaceC6070dBeginStructure.encodeBooleanElement(interfaceC5765g, 7, z10);
        }
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 8) || !z9) {
            interfaceC6070dBeginStructure.encodeBooleanElement(interfaceC5765g, 8, z9);
        }
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 9) || z8) {
            interfaceC6070dBeginStructure.encodeBooleanElement(interfaceC5765g, 9, z8);
        }
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 10) || !AbstractC5830k.m5325b(list, EmptyList.INSTANCE)) {
            interfaceC6070dBeginStructure.encodeSerializableElement(interfaceC5765g, 10, (InterfaceC5689e) interfaceC5429eArr[10].getValue(), list);
        }
        interfaceC6070dBeginStructure.endStructure(interfaceC5765g);
    }

    @Override // p118m7.InterfaceC6125c0
    public final InterfaceC5686b[] typeParametersSerializers() {
        return AbstractC6191y0.f9897b;
    }
}
