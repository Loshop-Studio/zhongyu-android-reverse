package com.zykj.mistake.entity.req;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.UnknownFieldException;
import org.jetbrains.annotations.NotNull;
import p045d6.InterfaceC5429e;
import p084i7.InterfaceC5685a;
import p084i7.InterfaceC5686b;
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

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m5110d2 = {"com/zykj/mistake/entity/req/SearchMistakeCollectionReq.$serializer", "Lm7/c0;", "Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;", "<init>", "()V", "Ll7/f;", "encoder", "value", "Ld6/s;", "serialize", "(Ll7/f;Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;)V", "Ll7/e;", "decoder", "deserialize", "(Ll7/e;)Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;", "", "Li7/b;", "childSerializers", "()[Li7/b;", "Lk7/g;", "descriptor", "Lk7/g;", "getDescriptor", "()Lk7/g;", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class SearchMistakeCollectionReq$$serializer implements InterfaceC6125c0 {
    public static final int $stable;

    @NotNull
    public static final SearchMistakeCollectionReq$$serializer INSTANCE;

    @NotNull
    private static final InterfaceC5765g descriptor;

    static {
        SearchMistakeCollectionReq$$serializer searchMistakeCollectionReq$$serializer = new SearchMistakeCollectionReq$$serializer();
        INSTANCE = searchMistakeCollectionReq$$serializer;
        $stable = 8;
        C6118a1 c6118a1 = new C6118a1("com.zykj.mistake.entity.req.SearchMistakeCollectionReq", searchMistakeCollectionReq$$serializer, 14);
        c6118a1.m5821j("collectionId", true);
        c6118a1.m5821j("timeRange", true);
        c6118a1.m5821j("startTime", true);
        c6118a1.m5821j("endTime", true);
        c6118a1.m5821j("topicIds", true);
        c6118a1.m5821j("diff", true);
        c6118a1.m5821j("attainedLevel", true);
        c6118a1.m5821j("errorReason", true);
        c6118a1.m5821j("currentCollectionStatus", true);
        c6118a1.m5821j("otherCollectionStatus", true);
        c6118a1.m5821j("tagIdList", true);
        c6118a1.m5821j("sortType", true);
        c6118a1.m5821j("skipCount", true);
        c6118a1.m5821j("maxResultCount", true);
        descriptor = c6118a1;
    }

    private SearchMistakeCollectionReq$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p118m7.InterfaceC6125c0
    @NotNull
    public final InterfaceC5686b[] childSerializers() {
        InterfaceC5429e[] interfaceC5429eArr = SearchMistakeCollectionReq.$childSerializers;
        C6146j0 c6146j0 = C6146j0.f9816a;
        C6156m1 c6156m1 = C6156m1.f9829a;
        return new InterfaceC5686b[]{AbstractC5806u.m5283v(c6146j0), c6146j0, AbstractC5806u.m5283v(c6156m1), AbstractC5806u.m5283v(c6156m1), interfaceC5429eArr[4].getValue(), interfaceC5429eArr[5].getValue(), interfaceC5429eArr[6].getValue(), interfaceC5429eArr[7].getValue(), c6146j0, c6146j0, interfaceC5429eArr[10].getValue(), c6146j0, c6146j0, c6146j0};
    }

    @Override // p084i7.InterfaceC5685a
    @NotNull
    public final SearchMistakeCollectionReq deserialize(@NotNull InterfaceC6071e decoder) {
        String str;
        String str2;
        int i;
        Integer num;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i8;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int iDecodeIntElement;
        int i9;
        int i10;
        int iDecodeIntElement2;
        int iDecodeIntElement3;
        AbstractC5830k.m5330g(decoder, "decoder");
        InterfaceC5765g interfaceC5765g = descriptor;
        InterfaceC6069c interfaceC6069cBeginStructure = decoder.beginStructure(interfaceC5765g);
        InterfaceC5429e[] interfaceC5429eArr = SearchMistakeCollectionReq.$childSerializers;
        int i11 = 9;
        if (interfaceC6069cBeginStructure.decodeSequentially()) {
            Integer num2 = (Integer) interfaceC6069cBeginStructure.decodeNullableSerializableElement(interfaceC5765g, 0, C6146j0.f9816a, null);
            int iDecodeIntElement4 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 1);
            C6156m1 c6156m1 = C6156m1.f9829a;
            String str3 = (String) interfaceC6069cBeginStructure.decodeNullableSerializableElement(interfaceC5765g, 2, c6156m1, null);
            String str4 = (String) interfaceC6069cBeginStructure.decodeNullableSerializableElement(interfaceC5765g, 3, c6156m1, null);
            ArrayList arrayList6 = (ArrayList) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 4, (InterfaceC5685a) interfaceC5429eArr[4].getValue(), null);
            ArrayList arrayList7 = (ArrayList) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 5, (InterfaceC5685a) interfaceC5429eArr[5].getValue(), null);
            ArrayList arrayList8 = (ArrayList) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 6, (InterfaceC5685a) interfaceC5429eArr[6].getValue(), null);
            ArrayList arrayList9 = (ArrayList) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 7, (InterfaceC5685a) interfaceC5429eArr[7].getValue(), null);
            int iDecodeIntElement5 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 8);
            int iDecodeIntElement6 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 9);
            ArrayList arrayList10 = (ArrayList) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 10, (InterfaceC5685a) interfaceC5429eArr[10].getValue(), null);
            arrayList3 = arrayList10;
            num = num2;
            i = iDecodeIntElement4;
            str = str4;
            iDecodeIntElement = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 11);
            i9 = iDecodeIntElement6;
            arrayList2 = arrayList6;
            i10 = iDecodeIntElement5;
            str2 = str3;
            iDecodeIntElement2 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 12);
            arrayList4 = arrayList9;
            arrayList5 = arrayList8;
            arrayList = arrayList7;
            iDecodeIntElement3 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 13);
            i8 = 16383;
        } else {
            int i12 = 13;
            boolean z8 = true;
            int iDecodeIntElement7 = 0;
            int iDecodeIntElement8 = 0;
            int iDecodeIntElement9 = 0;
            int iDecodeIntElement10 = 0;
            int iDecodeIntElement11 = 0;
            String str5 = null;
            ArrayList arrayList11 = null;
            ArrayList arrayList12 = null;
            Integer num3 = null;
            int i13 = 7;
            int i14 = 6;
            int i15 = 5;
            int i16 = 4;
            int iDecodeIntElement12 = 0;
            int i17 = 0;
            String str6 = null;
            ArrayList arrayList13 = null;
            ArrayList arrayList14 = null;
            ArrayList arrayList15 = null;
            while (z8) {
                int iDecodeElementIndex = interfaceC6069cBeginStructure.decodeElementIndex(interfaceC5765g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z8 = false;
                        i11 = 9;
                        i16 = 4;
                        i15 = 5;
                        i14 = 6;
                        i13 = 7;
                    case 0:
                        i17 |= 1;
                        num3 = (Integer) interfaceC6069cBeginStructure.decodeNullableSerializableElement(interfaceC5765g, 0, C6146j0.f9816a, num3);
                        i12 = 13;
                        i11 = 9;
                        i16 = 4;
                        i15 = 5;
                        i14 = 6;
                        i13 = 7;
                    case 1:
                        iDecodeIntElement12 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 1);
                        i17 |= 2;
                        i12 = 13;
                        i11 = 9;
                        i16 = 4;
                        i15 = 5;
                        i14 = 6;
                        i13 = 7;
                    case 2:
                        str6 = (String) interfaceC6069cBeginStructure.decodeNullableSerializableElement(interfaceC5765g, 2, C6156m1.f9829a, str6);
                        i17 |= 4;
                        i12 = 13;
                        i11 = 9;
                        i16 = 4;
                        i15 = 5;
                        i14 = 6;
                        i13 = 7;
                    case 3:
                        str5 = (String) interfaceC6069cBeginStructure.decodeNullableSerializableElement(interfaceC5765g, 3, C6156m1.f9829a, str5);
                        i17 |= 8;
                        i12 = 13;
                        i11 = 9;
                        i16 = 4;
                        i15 = 5;
                        i14 = 6;
                        i13 = 7;
                    case 4:
                        arrayList12 = (ArrayList) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, i16, (InterfaceC5685a) interfaceC5429eArr[i16].getValue(), arrayList12);
                        i17 |= 16;
                        i12 = 13;
                        i11 = 9;
                        i15 = 5;
                        i14 = 6;
                        i13 = 7;
                    case 5:
                        arrayList11 = (ArrayList) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, i15, (InterfaceC5685a) interfaceC5429eArr[i15].getValue(), arrayList11);
                        i17 |= 32;
                        i12 = 13;
                        i11 = 9;
                        i14 = 6;
                        i13 = 7;
                    case 6:
                        arrayList15 = (ArrayList) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, i14, (InterfaceC5685a) interfaceC5429eArr[i14].getValue(), arrayList15);
                        i17 |= 64;
                        i12 = 13;
                        i11 = 9;
                        i13 = 7;
                    case 7:
                        arrayList14 = (ArrayList) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, i13, (InterfaceC5685a) interfaceC5429eArr[i13].getValue(), arrayList14);
                        i17 |= 128;
                        i12 = 13;
                        i11 = 9;
                    case 8:
                        iDecodeIntElement9 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 8);
                        i17 |= 256;
                        i12 = 13;
                    case 9:
                        iDecodeIntElement8 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, i11);
                        i17 |= 512;
                        i12 = 13;
                    case 10:
                        arrayList13 = (ArrayList) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 10, (InterfaceC5685a) interfaceC5429eArr[10].getValue(), arrayList13);
                        i17 |= 1024;
                        i12 = 13;
                    case 11:
                        iDecodeIntElement7 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 11);
                        i17 |= 2048;
                        i12 = 13;
                    case 12:
                        iDecodeIntElement10 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 12);
                        i17 |= 4096;
                    case 13:
                        iDecodeIntElement11 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, i12);
                        i17 |= 8192;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str5;
            str2 = str6;
            i = iDecodeIntElement12;
            num = num3;
            arrayList = arrayList11;
            arrayList2 = arrayList12;
            i8 = i17;
            arrayList3 = arrayList13;
            arrayList4 = arrayList14;
            arrayList5 = arrayList15;
            iDecodeIntElement = iDecodeIntElement7;
            i9 = iDecodeIntElement8;
            i10 = iDecodeIntElement9;
            iDecodeIntElement2 = iDecodeIntElement10;
            iDecodeIntElement3 = iDecodeIntElement11;
        }
        interfaceC6069cBeginStructure.endStructure(interfaceC5765g);
        return new SearchMistakeCollectionReq(i8, num, i, str2, str, arrayList2, arrayList, arrayList5, arrayList4, i10, i9, arrayList3, iDecodeIntElement, iDecodeIntElement2, iDecodeIntElement3, null);
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    @NotNull
    public final InterfaceC5765g getDescriptor() {
        return descriptor;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(@NotNull InterfaceC6072f encoder, @NotNull SearchMistakeCollectionReq value) {
        AbstractC5830k.m5330g(encoder, "encoder");
        AbstractC5830k.m5330g(value, "value");
        InterfaceC5765g interfaceC5765g = descriptor;
        InterfaceC6070d interfaceC6070dBeginStructure = encoder.beginStructure(interfaceC5765g);
        SearchMistakeCollectionReq.write$Self$app_release(value, interfaceC6070dBeginStructure, interfaceC5765g);
        interfaceC6070dBeginStructure.endStructure(interfaceC5765g);
    }

    @Override // p118m7.InterfaceC6125c0
    @NotNull
    public InterfaceC5686b[] typeParametersSerializers() {
        return AbstractC6191y0.f9897b;
    }
}
