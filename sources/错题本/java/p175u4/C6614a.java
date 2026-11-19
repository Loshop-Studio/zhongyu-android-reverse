package p175u4;

import com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailContract$EntryMode;
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

/* renamed from: u4.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6614a implements InterfaceC6125c0 {

    /* renamed from: a */
    public static final C6614a f11063a;

    @NotNull
    private static final InterfaceC5765g descriptor;

    static {
        C6614a c6614a = new C6614a();
        f11063a = c6614a;
        C6118a1 c6118a1 = new C6118a1("com.zykj.mistake.navigation.args.CollectionDetailRouteArgs", c6614a, 4);
        c6118a1.m5821j("collectionId", true);
        c6118a1.m5821j("title", true);
        c6118a1.m5821j("currentCount", true);
        c6118a1.m5821j("entryMode", true);
        descriptor = c6118a1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p118m7.InterfaceC6125c0
    public final InterfaceC5686b[] childSerializers() {
        InterfaceC5429e[] interfaceC5429eArr = C6616c.f11064e;
        C6156m1 c6156m1 = C6156m1.f9829a;
        return new InterfaceC5686b[]{c6156m1, c6156m1, C6146j0.f9816a, interfaceC5429eArr[3].getValue()};
    }

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        int i;
        int i8;
        String str;
        String str2;
        MistakeCollectionDetailContract$EntryMode mistakeCollectionDetailContract$EntryMode;
        AbstractC5830k.m5330g(decoder, "decoder");
        InterfaceC5765g interfaceC5765g = descriptor;
        InterfaceC6069c interfaceC6069cBeginStructure = decoder.beginStructure(interfaceC5765g);
        InterfaceC5429e[] interfaceC5429eArr = C6616c.f11064e;
        if (interfaceC6069cBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 0);
            String strDecodeStringElement2 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 1);
            int iDecodeIntElement = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 2);
            mistakeCollectionDetailContract$EntryMode = (MistakeCollectionDetailContract$EntryMode) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 3, (InterfaceC5685a) interfaceC5429eArr[3].getValue(), null);
            str = strDecodeStringElement;
            i = iDecodeIntElement;
            i8 = 15;
            str2 = strDecodeStringElement2;
        } else {
            boolean z8 = true;
            int iDecodeIntElement2 = 0;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            MistakeCollectionDetailContract$EntryMode mistakeCollectionDetailContract$EntryMode2 = null;
            int i9 = 0;
            while (z8) {
                int iDecodeElementIndex = interfaceC6069cBeginStructure.decodeElementIndex(interfaceC5765g);
                if (iDecodeElementIndex == -1) {
                    z8 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement3 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 0);
                    i9 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement4 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 1);
                    i9 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    iDecodeIntElement2 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 2);
                    i9 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    mistakeCollectionDetailContract$EntryMode2 = (MistakeCollectionDetailContract$EntryMode) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 3, (InterfaceC5685a) interfaceC5429eArr[3].getValue(), mistakeCollectionDetailContract$EntryMode2);
                    i9 |= 8;
                }
            }
            i = iDecodeIntElement2;
            i8 = i9;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            mistakeCollectionDetailContract$EntryMode = mistakeCollectionDetailContract$EntryMode2;
        }
        interfaceC6069cBeginStructure.endStructure(interfaceC5765g);
        return new C6616c(i8, str, str2, i, mistakeCollectionDetailContract$EntryMode);
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return descriptor;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        C6616c value = (C6616c) obj;
        AbstractC5830k.m5330g(value, "value");
        MistakeCollectionDetailContract$EntryMode mistakeCollectionDetailContract$EntryMode = value.f11068d;
        int i = value.f11067c;
        String str = value.f11066b;
        String str2 = value.f11065a;
        InterfaceC5765g interfaceC5765g = descriptor;
        InterfaceC6070d interfaceC6070dBeginStructure = interfaceC6072f.beginStructure(interfaceC5765g);
        InterfaceC5429e[] interfaceC5429eArr = C6616c.f11064e;
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 0) || !AbstractC5830k.m5325b(str2, "")) {
            interfaceC6070dBeginStructure.encodeStringElement(interfaceC5765g, 0, str2);
        }
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 1) || !AbstractC5830k.m5325b(str, "错题集")) {
            interfaceC6070dBeginStructure.encodeStringElement(interfaceC5765g, 1, str);
        }
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 2) || i != 0) {
            interfaceC6070dBeginStructure.encodeIntElement(interfaceC5765g, 2, i);
        }
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 3) || mistakeCollectionDetailContract$EntryMode != MistakeCollectionDetailContract$EntryMode.EXISTING) {
            interfaceC6070dBeginStructure.encodeSerializableElement(interfaceC5765g, 3, (InterfaceC5689e) interfaceC5429eArr[3].getValue(), mistakeCollectionDetailContract$EntryMode);
        }
        interfaceC6070dBeginStructure.endStructure(interfaceC5765g);
    }

    @Override // p118m7.InterfaceC6125c0
    public final InterfaceC5686b[] typeParametersSerializers() {
        return AbstractC6191y0.f9897b;
    }
}
