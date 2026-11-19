package com.zykj.mistake.feature.ask;

import java.util.List;
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
import p118m7.C6156m1;
import p118m7.InterfaceC6125c0;

/* renamed from: com.zykj.mistake.feature.ask.a0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4511a0 implements InterfaceC6125c0 {

    /* renamed from: a */
    public static final C4511a0 f6214a;

    @NotNull
    private static final InterfaceC5765g descriptor;

    static {
        C4511a0 c4511a0 = new C4511a0();
        f6214a = c4511a0;
        C6118a1 c6118a1 = new C6118a1("com.zykj.mistake.feature.ask.MistakeAskMaterialContract.TextAnswerPayload", c4511a0, 5);
        c6118a1.m5821j("index", false);
        c6118a1.m5821j("answers", false);
        c6118a1.m5821j("comments", false);
        c6118a1.m5821j("isOriginal", false);
        c6118a1.m5821j("isShowAnswer", false);
        descriptor = c6118a1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p118m7.InterfaceC6125c0
    public final InterfaceC5686b[] childSerializers() {
        InterfaceC5429e[] interfaceC5429eArr = C4515c0.f6216f;
        C6136g c6136g = C6136g.f9800a;
        return new InterfaceC5686b[]{C6156m1.f9829a, interfaceC5429eArr[1].getValue(), interfaceC5429eArr[2].getValue(), c6136g, c6136g};
    }

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        boolean zDecodeBooleanElement;
        boolean zDecodeBooleanElement2;
        int i;
        String str;
        List list;
        List list2;
        AbstractC5830k.m5330g(decoder, "decoder");
        InterfaceC5765g interfaceC5765g = descriptor;
        InterfaceC6069c interfaceC6069cBeginStructure = decoder.beginStructure(interfaceC5765g);
        InterfaceC5429e[] interfaceC5429eArr = C4515c0.f6216f;
        if (interfaceC6069cBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 0);
            List list3 = (List) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 1, (InterfaceC5685a) interfaceC5429eArr[1].getValue(), null);
            list2 = (List) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 2, (InterfaceC5685a) interfaceC5429eArr[2].getValue(), null);
            str = strDecodeStringElement;
            zDecodeBooleanElement = interfaceC6069cBeginStructure.decodeBooleanElement(interfaceC5765g, 3);
            zDecodeBooleanElement2 = interfaceC6069cBeginStructure.decodeBooleanElement(interfaceC5765g, 4);
            i = 31;
            list = list3;
        } else {
            boolean z8 = true;
            boolean zDecodeBooleanElement3 = false;
            int i8 = 0;
            String strDecodeStringElement2 = null;
            List list4 = null;
            List list5 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z8) {
                int iDecodeElementIndex = interfaceC6069cBeginStructure.decodeElementIndex(interfaceC5765g);
                if (iDecodeElementIndex == -1) {
                    z8 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 0);
                    i8 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    list4 = (List) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 1, (InterfaceC5685a) interfaceC5429eArr[1].getValue(), list4);
                    i8 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    list5 = (List) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 2, (InterfaceC5685a) interfaceC5429eArr[2].getValue(), list5);
                    i8 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    zDecodeBooleanElement3 = interfaceC6069cBeginStructure.decodeBooleanElement(interfaceC5765g, 3);
                    i8 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    zDecodeBooleanElement4 = interfaceC6069cBeginStructure.decodeBooleanElement(interfaceC5765g, 4);
                    i8 |= 16;
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement3;
            zDecodeBooleanElement2 = zDecodeBooleanElement4;
            i = i8;
            str = strDecodeStringElement2;
            list = list4;
            list2 = list5;
        }
        interfaceC6069cBeginStructure.endStructure(interfaceC5765g);
        return new C4515c0(i, str, list, list2, zDecodeBooleanElement, zDecodeBooleanElement2);
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return descriptor;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        C4515c0 value = (C4515c0) obj;
        AbstractC5830k.m5330g(value, "value");
        InterfaceC5765g interfaceC5765g = descriptor;
        InterfaceC6070d interfaceC6070dBeginStructure = interfaceC6072f.beginStructure(interfaceC5765g);
        InterfaceC5429e[] interfaceC5429eArr = C4515c0.f6216f;
        interfaceC6070dBeginStructure.encodeStringElement(interfaceC5765g, 0, value.f6217a);
        interfaceC6070dBeginStructure.encodeSerializableElement(interfaceC5765g, 1, (InterfaceC5689e) interfaceC5429eArr[1].getValue(), value.f6218b);
        interfaceC6070dBeginStructure.encodeSerializableElement(interfaceC5765g, 2, (InterfaceC5689e) interfaceC5429eArr[2].getValue(), value.f6219c);
        interfaceC6070dBeginStructure.encodeBooleanElement(interfaceC5765g, 3, value.f6220d);
        interfaceC6070dBeginStructure.encodeBooleanElement(interfaceC5765g, 4, value.f6221e);
        interfaceC6070dBeginStructure.endStructure(interfaceC5765g);
    }

    @Override // p118m7.InterfaceC6125c0
    public final InterfaceC5686b[] typeParametersSerializers() {
        return AbstractC6191y0.f9897b;
    }
}
