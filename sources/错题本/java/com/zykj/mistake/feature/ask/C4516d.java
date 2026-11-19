package com.zykj.mistake.feature.ask;

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
import p118m7.InterfaceC6125c0;

/* renamed from: com.zykj.mistake.feature.ask.d */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4516d implements InterfaceC6125c0 {

    /* renamed from: a */
    public static final C4516d f6222a;

    @NotNull
    private static final InterfaceC5765g descriptor;

    static {
        C4516d c4516d = new C4516d();
        f6222a = c4516d;
        C6118a1 c6118a1 = new C6118a1("com.zykj.mistake.feature.ask.MistakeAskMaterialContract.Bundle", c4516d, 1);
        c6118a1.m5821j("groups", true);
        descriptor = c6118a1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p118m7.InterfaceC6125c0
    public final InterfaceC5686b[] childSerializers() {
        return new InterfaceC5686b[]{C4520f.f6234b[0].getValue()};
    }

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        List list;
        AbstractC5830k.m5330g(decoder, "decoder");
        InterfaceC5765g interfaceC5765g = descriptor;
        InterfaceC6069c interfaceC6069cBeginStructure = decoder.beginStructure(interfaceC5765g);
        InterfaceC5429e[] interfaceC5429eArr = C4520f.f6234b;
        int i = 1;
        List list2 = null;
        if (interfaceC6069cBeginStructure.decodeSequentially()) {
            list = (List) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 0, (InterfaceC5685a) interfaceC5429eArr[0].getValue(), null);
        } else {
            boolean z8 = true;
            int i8 = 0;
            while (z8) {
                int iDecodeElementIndex = interfaceC6069cBeginStructure.decodeElementIndex(interfaceC5765g);
                if (iDecodeElementIndex == -1) {
                    z8 = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list2 = (List) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 0, (InterfaceC5685a) interfaceC5429eArr[0].getValue(), list2);
                    i8 = 1;
                }
            }
            list = list2;
            i = i8;
        }
        interfaceC6069cBeginStructure.endStructure(interfaceC5765g);
        return new C4520f(i, list);
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return descriptor;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        C4520f value = (C4520f) obj;
        AbstractC5830k.m5330g(value, "value");
        List list = value.f6235a;
        InterfaceC5765g interfaceC5765g = descriptor;
        InterfaceC6070d interfaceC6070dBeginStructure = interfaceC6072f.beginStructure(interfaceC5765g);
        InterfaceC5429e[] interfaceC5429eArr = C4520f.f6234b;
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 0) || !AbstractC5830k.m5325b(list, EmptyList.INSTANCE)) {
            interfaceC6070dBeginStructure.encodeSerializableElement(interfaceC5765g, 0, (InterfaceC5689e) interfaceC5429eArr[0].getValue(), list);
        }
        interfaceC6070dBeginStructure.endStructure(interfaceC5765g);
    }

    @Override // p118m7.InterfaceC6125c0
    public final InterfaceC5686b[] typeParametersSerializers() {
        return AbstractC6191y0.f9897b;
    }
}
