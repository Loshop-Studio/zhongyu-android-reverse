package p137p4;

import android.view.serialization.ClassDiscriminatorModeKt;
import com.zykj.mistake.feature.mistake.model.MistakeTagType;
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
import p118m7.C6146j0;
import p118m7.C6156m1;
import p118m7.InterfaceC6125c0;

/* renamed from: p4.g */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6388g implements InterfaceC6125c0 {

    /* renamed from: a */
    public static final C6388g f10478a;

    @NotNull
    private static final InterfaceC5765g descriptor;

    static {
        C6388g c6388g = new C6388g();
        f10478a = c6388g;
        C6118a1 c6118a1 = new C6118a1("com.zykj.mistake.feature.mistake.model.MistakeTagUiState", c6388g, 3);
        c6118a1.m5821j("text", false);
        c6118a1.m5821j(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, false);
        c6118a1.m5821j("tagId", true);
        descriptor = c6118a1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p118m7.InterfaceC6125c0
    public final InterfaceC5686b[] childSerializers() {
        return new InterfaceC5686b[]{C6156m1.f9829a, C6390i.f10479d[1].getValue(), AbstractC5806u.m5283v(C6146j0.f9816a)};
    }

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        int i;
        String strDecodeStringElement;
        MistakeTagType mistakeTagType;
        Integer num;
        AbstractC5830k.m5330g(decoder, "decoder");
        InterfaceC5765g interfaceC5765g = descriptor;
        InterfaceC6069c interfaceC6069cBeginStructure = decoder.beginStructure(interfaceC5765g);
        InterfaceC5429e[] interfaceC5429eArr = C6390i.f10479d;
        String strDecodeStringElement2 = null;
        if (interfaceC6069cBeginStructure.decodeSequentially()) {
            strDecodeStringElement = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 0);
            mistakeTagType = (MistakeTagType) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 1, (InterfaceC5685a) interfaceC5429eArr[1].getValue(), null);
            num = (Integer) interfaceC6069cBeginStructure.decodeNullableSerializableElement(interfaceC5765g, 2, C6146j0.f9816a, null);
            i = 7;
        } else {
            boolean z8 = true;
            int i8 = 0;
            MistakeTagType mistakeTagType2 = null;
            Integer num2 = null;
            while (z8) {
                int iDecodeElementIndex = interfaceC6069cBeginStructure.decodeElementIndex(interfaceC5765g);
                if (iDecodeElementIndex == -1) {
                    z8 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 0);
                    i8 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    mistakeTagType2 = (MistakeTagType) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 1, (InterfaceC5685a) interfaceC5429eArr[1].getValue(), mistakeTagType2);
                    i8 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    num2 = (Integer) interfaceC6069cBeginStructure.decodeNullableSerializableElement(interfaceC5765g, 2, C6146j0.f9816a, num2);
                    i8 |= 4;
                }
            }
            i = i8;
            strDecodeStringElement = strDecodeStringElement2;
            mistakeTagType = mistakeTagType2;
            num = num2;
        }
        interfaceC6069cBeginStructure.endStructure(interfaceC5765g);
        return new C6390i(i, strDecodeStringElement, mistakeTagType, num);
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return descriptor;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        C6390i value = (C6390i) obj;
        AbstractC5830k.m5330g(value, "value");
        InterfaceC5765g interfaceC5765g = descriptor;
        InterfaceC6070d interfaceC6070dBeginStructure = interfaceC6072f.beginStructure(interfaceC5765g);
        InterfaceC5429e[] interfaceC5429eArr = C6390i.f10479d;
        String str = value.f10480a;
        Integer num = value.f10482c;
        interfaceC6070dBeginStructure.encodeStringElement(interfaceC5765g, 0, str);
        interfaceC6070dBeginStructure.encodeSerializableElement(interfaceC5765g, 1, (InterfaceC5689e) interfaceC5429eArr[1].getValue(), value.f10481b);
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 2) || num != null) {
            interfaceC6070dBeginStructure.encodeNullableSerializableElement(interfaceC5765g, 2, C6146j0.f9816a, num);
        }
        interfaceC6070dBeginStructure.endStructure(interfaceC5765g);
    }

    @Override // p118m7.InterfaceC6125c0
    public final InterfaceC5686b[] typeParametersSerializers() {
        return AbstractC6191y0.f9897b;
    }
}
