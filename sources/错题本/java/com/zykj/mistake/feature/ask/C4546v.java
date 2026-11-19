package com.zykj.mistake.feature.ask;

import kotlin.collections.AbstractC5806u;
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
import p118m7.C6156m1;
import p118m7.InterfaceC6125c0;

/* renamed from: com.zykj.mistake.feature.ask.v */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4546v implements InterfaceC6125c0 {

    /* renamed from: a */
    public static final C4546v f6299a;

    @NotNull
    private static final InterfaceC5765g descriptor;

    static {
        C4546v c4546v = new C4546v();
        f6299a = c4546v;
        C6118a1 c6118a1 = new C6118a1("com.zykj.mistake.feature.ask.MistakeAskMaterialContract.Item", c4546v, 6);
        c6118a1.m5821j("id", false);
        c6118a1.m5821j("title", false);
        c6118a1.m5821j("sourceType", false);
        c6118a1.m5821j("imageSource", true);
        c6118a1.m5821j("webUrl", true);
        c6118a1.m5821j("textPayload", true);
        descriptor = c6118a1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p118m7.InterfaceC6125c0
    public final InterfaceC5686b[] childSerializers() {
        InterfaceC5429e[] interfaceC5429eArr = C4548x.f6300g;
        C6156m1 c6156m1 = C6156m1.f9829a;
        return new InterfaceC5686b[]{c6156m1, c6156m1, interfaceC5429eArr[2].getValue(), c6156m1, c6156m1, AbstractC5806u.m5283v(C4511a0.f6214a)};
    }

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        int i;
        String str;
        String str2;
        MistakeAskMaterialContract$SourceType mistakeAskMaterialContract$SourceType;
        String str3;
        String str4;
        C4515c0 c4515c0;
        AbstractC5830k.m5330g(decoder, "decoder");
        InterfaceC5765g interfaceC5765g = descriptor;
        InterfaceC6069c interfaceC6069cBeginStructure = decoder.beginStructure(interfaceC5765g);
        InterfaceC5429e[] interfaceC5429eArr = C4548x.f6300g;
        String strDecodeStringElement = null;
        if (interfaceC6069cBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 0);
            String strDecodeStringElement3 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 1);
            MistakeAskMaterialContract$SourceType mistakeAskMaterialContract$SourceType2 = (MistakeAskMaterialContract$SourceType) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 2, (InterfaceC5685a) interfaceC5429eArr[2].getValue(), null);
            String strDecodeStringElement4 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 3);
            String strDecodeStringElement5 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 4);
            mistakeAskMaterialContract$SourceType = mistakeAskMaterialContract$SourceType2;
            str = strDecodeStringElement2;
            c4515c0 = (C4515c0) interfaceC6069cBeginStructure.decodeNullableSerializableElement(interfaceC5765g, 5, C4511a0.f6214a, null);
            str3 = strDecodeStringElement4;
            str4 = strDecodeStringElement5;
            i = 63;
            str2 = strDecodeStringElement3;
        } else {
            boolean z8 = true;
            int i8 = 0;
            String strDecodeStringElement6 = null;
            MistakeAskMaterialContract$SourceType mistakeAskMaterialContract$SourceType3 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            C4515c0 c4515c02 = null;
            while (z8) {
                int iDecodeElementIndex = interfaceC6069cBeginStructure.decodeElementIndex(interfaceC5765g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z8 = false;
                        continue;
                    case 0:
                        strDecodeStringElement = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 0);
                        i8 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement6 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 1);
                        i8 |= 2;
                        break;
                    case 2:
                        mistakeAskMaterialContract$SourceType3 = (MistakeAskMaterialContract$SourceType) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 2, (InterfaceC5685a) interfaceC5429eArr[2].getValue(), mistakeAskMaterialContract$SourceType3);
                        i8 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement7 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 3);
                        i8 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement8 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 4);
                        i8 |= 16;
                        break;
                    case 5:
                        c4515c02 = (C4515c0) interfaceC6069cBeginStructure.decodeNullableSerializableElement(interfaceC5765g, 5, C4511a0.f6214a, c4515c02);
                        i8 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i8;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement6;
            mistakeAskMaterialContract$SourceType = mistakeAskMaterialContract$SourceType3;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
            c4515c0 = c4515c02;
        }
        interfaceC6069cBeginStructure.endStructure(interfaceC5765g);
        return new C4548x(i, str, str2, mistakeAskMaterialContract$SourceType, str3, str4, c4515c0);
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return descriptor;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        C4548x value = (C4548x) obj;
        AbstractC5830k.m5330g(value, "value");
        InterfaceC5765g interfaceC5765g = descriptor;
        InterfaceC6070d interfaceC6070dBeginStructure = interfaceC6072f.beginStructure(interfaceC5765g);
        InterfaceC5429e[] interfaceC5429eArr = C4548x.f6300g;
        String str = value.f6301a;
        C4515c0 c4515c0 = value.f6306f;
        String str2 = value.f6305e;
        String str3 = value.f6304d;
        interfaceC6070dBeginStructure.encodeStringElement(interfaceC5765g, 0, str);
        interfaceC6070dBeginStructure.encodeStringElement(interfaceC5765g, 1, value.f6302b);
        interfaceC6070dBeginStructure.encodeSerializableElement(interfaceC5765g, 2, (InterfaceC5689e) interfaceC5429eArr[2].getValue(), value.f6303c);
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 3) || !AbstractC5830k.m5325b(str3, "")) {
            interfaceC6070dBeginStructure.encodeStringElement(interfaceC5765g, 3, str3);
        }
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 4) || !AbstractC5830k.m5325b(str2, "")) {
            interfaceC6070dBeginStructure.encodeStringElement(interfaceC5765g, 4, str2);
        }
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 5) || c4515c0 != null) {
            interfaceC6070dBeginStructure.encodeNullableSerializableElement(interfaceC5765g, 5, C4511a0.f6214a, c4515c0);
        }
        interfaceC6070dBeginStructure.endStructure(interfaceC5765g);
    }

    @Override // p118m7.InterfaceC6125c0
    public final InterfaceC5686b[] typeParametersSerializers() {
        return AbstractC6191y0.f9897b;
    }
}
