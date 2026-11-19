package com.zykj.mistake.feature.ask;

import android.view.serialization.ClassDiscriminatorModeKt;
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
import p118m7.InterfaceC6125c0;

/* renamed from: com.zykj.mistake.feature.ask.k */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4530k implements InterfaceC6125c0 {

    /* renamed from: a */
    public static final C4530k f6259a;

    @NotNull
    private static final InterfaceC5765g descriptor;

    static {
        C4530k c4530k = new C4530k();
        f6259a = c4530k;
        C6118a1 c6118a1 = new C6118a1("com.zykj.mistake.feature.ask.MistakeAskMaterialContract.Group", c4530k, 2);
        c6118a1.m5821j(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, false);
        c6118a1.m5821j("items", false);
        descriptor = c6118a1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p118m7.InterfaceC6125c0
    public final InterfaceC5686b[] childSerializers() {
        InterfaceC5429e[] interfaceC5429eArr = C4534m.f6267c;
        return new InterfaceC5686b[]{interfaceC5429eArr[0].getValue(), interfaceC5429eArr[1].getValue()};
    }

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        int i;
        MistakeAskMaterialContract$MaterialType mistakeAskMaterialContract$MaterialType;
        List list;
        AbstractC5830k.m5330g(decoder, "decoder");
        InterfaceC5765g interfaceC5765g = descriptor;
        InterfaceC6069c interfaceC6069cBeginStructure = decoder.beginStructure(interfaceC5765g);
        InterfaceC5429e[] interfaceC5429eArr = C4534m.f6267c;
        MistakeAskMaterialContract$MaterialType mistakeAskMaterialContract$MaterialType2 = null;
        if (interfaceC6069cBeginStructure.decodeSequentially()) {
            mistakeAskMaterialContract$MaterialType = (MistakeAskMaterialContract$MaterialType) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 0, (InterfaceC5685a) interfaceC5429eArr[0].getValue(), null);
            list = (List) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 1, (InterfaceC5685a) interfaceC5429eArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z8 = true;
            int i8 = 0;
            List list2 = null;
            while (z8) {
                int iDecodeElementIndex = interfaceC6069cBeginStructure.decodeElementIndex(interfaceC5765g);
                if (iDecodeElementIndex == -1) {
                    z8 = false;
                } else if (iDecodeElementIndex == 0) {
                    mistakeAskMaterialContract$MaterialType2 = (MistakeAskMaterialContract$MaterialType) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 0, (InterfaceC5685a) interfaceC5429eArr[0].getValue(), mistakeAskMaterialContract$MaterialType2);
                    i8 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list2 = (List) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 1, (InterfaceC5685a) interfaceC5429eArr[1].getValue(), list2);
                    i8 |= 2;
                }
            }
            i = i8;
            mistakeAskMaterialContract$MaterialType = mistakeAskMaterialContract$MaterialType2;
            list = list2;
        }
        interfaceC6069cBeginStructure.endStructure(interfaceC5765g);
        return new C4534m(i, mistakeAskMaterialContract$MaterialType, list);
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return descriptor;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        C4534m value = (C4534m) obj;
        AbstractC5830k.m5330g(value, "value");
        InterfaceC5765g interfaceC5765g = descriptor;
        InterfaceC6070d interfaceC6070dBeginStructure = interfaceC6072f.beginStructure(interfaceC5765g);
        InterfaceC5429e[] interfaceC5429eArr = C4534m.f6267c;
        interfaceC6070dBeginStructure.encodeSerializableElement(interfaceC5765g, 0, (InterfaceC5689e) interfaceC5429eArr[0].getValue(), value.f6268a);
        interfaceC6070dBeginStructure.encodeSerializableElement(interfaceC5765g, 1, (InterfaceC5689e) interfaceC5429eArr[1].getValue(), value.f6269b);
        interfaceC6070dBeginStructure.endStructure(interfaceC5765g);
    }

    @Override // p118m7.InterfaceC6125c0
    public final InterfaceC5686b[] typeParametersSerializers() {
        return AbstractC6191y0.f9897b;
    }
}
