package com.zykj.mistake.feature.collection.filter;

import com.zykj.mistake.entity.req.SearchMistakeCollectionReq;
import com.zykj.mistake.entity.req.SearchMistakeCollectionReq$$serializer;
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
import p118m7.InterfaceC6125c0;

/* renamed from: com.zykj.mistake.feature.collection.filter.j */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4657j implements InterfaceC6125c0 {

    /* renamed from: a */
    public static final C4657j f6649a;

    @NotNull
    private static final InterfaceC5765g descriptor;

    static {
        C4657j c4657j = new C4657j();
        f6649a = c4657j;
        C6118a1 c6118a1 = new C6118a1("com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultContract.Args", c4657j, 9);
        c6118a1.m5821j("collectionId", true);
        c6118a1.m5821j("title", true);
        c6118a1.m5821j("currentCount", true);
        c6118a1.m5821j("capacity", true);
        c6118a1.m5821j("mistakeListReq", true);
        c6118a1.m5821j("currentCollectionType", true);
        c6118a1.m5821j("otherCollectionType", true);
        c6118a1.m5821j("showCurrentCollectionFilter", true);
        c6118a1.m5821j("sourceType", true);
        descriptor = c6118a1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p118m7.InterfaceC6125c0
    public final InterfaceC5686b[] childSerializers() {
        InterfaceC5429e[] interfaceC5429eArr = C4661l.f6652j;
        C6156m1 c6156m1 = C6156m1.f9829a;
        C6146j0 c6146j0 = C6146j0.f9816a;
        return new InterfaceC5686b[]{c6156m1, c6156m1, c6146j0, c6146j0, SearchMistakeCollectionReq$$serializer.INSTANCE, c6146j0, c6146j0, C6136g.f9800a, interfaceC5429eArr[8].getValue()};
    }

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        boolean z8;
        MistakeCollectionFilterResultContract$SourceType mistakeCollectionFilterResultContract$SourceType;
        SearchMistakeCollectionReq searchMistakeCollectionReq;
        int i;
        int i8;
        int i9;
        int i10;
        int i11;
        String str;
        String str2;
        AbstractC5830k.m5330g(decoder, "decoder");
        InterfaceC5765g interfaceC5765g = descriptor;
        InterfaceC6069c interfaceC6069cBeginStructure = decoder.beginStructure(interfaceC5765g);
        InterfaceC5429e[] interfaceC5429eArr = C4661l.f6652j;
        int i12 = 7;
        int i13 = 0;
        if (interfaceC6069cBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 0);
            String strDecodeStringElement2 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 1);
            int iDecodeIntElement = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 2);
            int iDecodeIntElement2 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 3);
            SearchMistakeCollectionReq searchMistakeCollectionReq2 = (SearchMistakeCollectionReq) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 4, SearchMistakeCollectionReq$$serializer.INSTANCE, null);
            int iDecodeIntElement3 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 5);
            int iDecodeIntElement4 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 6);
            boolean zDecodeBooleanElement = interfaceC6069cBeginStructure.decodeBooleanElement(interfaceC5765g, 7);
            mistakeCollectionFilterResultContract$SourceType = (MistakeCollectionFilterResultContract$SourceType) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 8, (InterfaceC5685a) interfaceC5429eArr[8].getValue(), null);
            str = strDecodeStringElement;
            z8 = zDecodeBooleanElement;
            i8 = iDecodeIntElement4;
            i9 = iDecodeIntElement3;
            i10 = iDecodeIntElement2;
            searchMistakeCollectionReq = searchMistakeCollectionReq2;
            i11 = iDecodeIntElement;
            i = 511;
            str2 = strDecodeStringElement2;
        } else {
            boolean z9 = true;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            int iDecodeIntElement7 = 0;
            MistakeCollectionFilterResultContract$SourceType mistakeCollectionFilterResultContract$SourceType2 = null;
            SearchMistakeCollectionReq searchMistakeCollectionReq3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            int iDecodeIntElement8 = 0;
            while (z9) {
                int iDecodeElementIndex = interfaceC6069cBeginStructure.decodeElementIndex(interfaceC5765g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z9 = false;
                        i12 = 7;
                    case 0:
                        strDecodeStringElement3 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 0);
                        i13 |= 1;
                        i12 = 7;
                    case 1:
                        strDecodeStringElement4 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 1);
                        i13 |= 2;
                        i12 = 7;
                    case 2:
                        iDecodeIntElement7 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 2);
                        i13 |= 4;
                        i12 = 7;
                    case 3:
                        iDecodeIntElement6 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 3);
                        i13 |= 8;
                    case 4:
                        searchMistakeCollectionReq3 = (SearchMistakeCollectionReq) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 4, SearchMistakeCollectionReq$$serializer.INSTANCE, searchMistakeCollectionReq3);
                        i13 |= 16;
                    case 5:
                        iDecodeIntElement5 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 5);
                        i13 |= 32;
                    case 6:
                        iDecodeIntElement8 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 6);
                        i13 |= 64;
                    case 7:
                        zDecodeBooleanElement2 = interfaceC6069cBeginStructure.decodeBooleanElement(interfaceC5765g, i12);
                        i13 |= 128;
                    case 8:
                        mistakeCollectionFilterResultContract$SourceType2 = (MistakeCollectionFilterResultContract$SourceType) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 8, (InterfaceC5685a) interfaceC5429eArr[8].getValue(), mistakeCollectionFilterResultContract$SourceType2);
                        i13 |= 256;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z8 = zDecodeBooleanElement2;
            mistakeCollectionFilterResultContract$SourceType = mistakeCollectionFilterResultContract$SourceType2;
            searchMistakeCollectionReq = searchMistakeCollectionReq3;
            i = i13;
            i8 = iDecodeIntElement8;
            i9 = iDecodeIntElement5;
            i10 = iDecodeIntElement6;
            i11 = iDecodeIntElement7;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
        }
        interfaceC6069cBeginStructure.endStructure(interfaceC5765g);
        return new C4661l(i, str, str2, i11, i10, searchMistakeCollectionReq, i9, i8, z8, mistakeCollectionFilterResultContract$SourceType);
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return descriptor;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        C4661l value = (C4661l) obj;
        AbstractC5830k.m5330g(value, "value");
        MistakeCollectionFilterResultContract$SourceType mistakeCollectionFilterResultContract$SourceType = value.f6661i;
        boolean z8 = value.f6660h;
        int i = value.f6659g;
        int i8 = value.f6658f;
        SearchMistakeCollectionReq searchMistakeCollectionReq = value.f6657e;
        int i9 = value.f6656d;
        int i10 = value.f6655c;
        String str = value.f6654b;
        String str2 = value.f6653a;
        InterfaceC5765g interfaceC5765g = descriptor;
        InterfaceC6070d interfaceC6070dBeginStructure = interfaceC6072f.beginStructure(interfaceC5765g);
        InterfaceC5429e[] interfaceC5429eArr = C4661l.f6652j;
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 0) || !AbstractC5830k.m5325b(str2, "")) {
            interfaceC6070dBeginStructure.encodeStringElement(interfaceC5765g, 0, str2);
        }
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 1) || !AbstractC5830k.m5325b(str, "错题集")) {
            interfaceC6070dBeginStructure.encodeStringElement(interfaceC5765g, 1, str);
        }
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 2) || i10 != 0) {
            interfaceC6070dBeginStructure.encodeIntElement(interfaceC5765g, 2, i10);
        }
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 3) || i9 != 100) {
            interfaceC6070dBeginStructure.encodeIntElement(interfaceC5765g, 3, i9);
        }
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 4) || !AbstractC5830k.m5325b(searchMistakeCollectionReq, new SearchMistakeCollectionReq())) {
            interfaceC6070dBeginStructure.encodeSerializableElement(interfaceC5765g, 4, SearchMistakeCollectionReq$$serializer.INSTANCE, searchMistakeCollectionReq);
        }
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 5) || i8 != 0) {
            interfaceC6070dBeginStructure.encodeIntElement(interfaceC5765g, 5, i8);
        }
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 6) || i != 1) {
            interfaceC6070dBeginStructure.encodeIntElement(interfaceC5765g, 6, i);
        }
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 7) || z8) {
            interfaceC6070dBeginStructure.encodeBooleanElement(interfaceC5765g, 7, z8);
        }
        if (interfaceC6070dBeginStructure.shouldEncodeElementDefault(interfaceC5765g, 8) || mistakeCollectionFilterResultContract$SourceType != MistakeCollectionFilterResultContract$SourceType.CREATE_COLLECTION) {
            interfaceC6070dBeginStructure.encodeSerializableElement(interfaceC5765g, 8, (InterfaceC5689e) interfaceC5429eArr[8].getValue(), mistakeCollectionFilterResultContract$SourceType);
        }
        interfaceC6070dBeginStructure.endStructure(interfaceC5765g);
    }

    @Override // p118m7.InterfaceC6125c0
    public final InterfaceC5686b[] typeParametersSerializers() {
        return AbstractC6191y0.f9897b;
    }
}
