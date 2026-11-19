package p175u4;

import com.zykj.mistake.feature.notebook.detail.MistakeDetailNewContract$EntryMode;
import com.zykj.mistake.feature.review.ReviewContract$PracticePoolType;
import com.zykj.mistake.feature.review.ReviewContract$PracticeScene;
import java.util.List;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.UnknownFieldException;
import org.jetbrains.annotations.NotNull;
import p045d6.InterfaceC5429e;
import p084i7.InterfaceC5685a;
import p084i7.InterfaceC5686b;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6071e;
import p118m7.AbstractC6191y0;
import p118m7.C6118a1;
import p118m7.C6136g;
import p118m7.C6146j0;
import p118m7.C6156m1;
import p118m7.C6161o0;
import p118m7.InterfaceC6125c0;

/* renamed from: u4.e */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6618e implements InterfaceC6125c0 {

    /* renamed from: a */
    public static final C6618e f11070a;

    @NotNull
    private static final InterfaceC5765g descriptor;

    static {
        C6618e c6618e = new C6618e();
        f11070a = c6618e;
        C6118a1 c6118a1 = new C6118a1("com.zykj.mistake.navigation.args.MistakeDetailRouteArgs", c6618e, 18);
        c6118a1.m5821j("bookId", true);
        c6118a1.m5821j("itemId", true);
        c6118a1.m5821j("topicId", true);
        c6118a1.m5821j("subject", true);
        c6118a1.m5821j("examName", true);
        c6118a1.m5821j("title", true);
        c6118a1.m5821j("stemShoot", true);
        c6118a1.m5821j("hasStem", true);
        c6118a1.m5821j("isCustomMistake", true);
        c6118a1.m5821j("isRelatedQstGroup", true);
        c6118a1.m5821j("tags", true);
        c6118a1.m5821j("navigationKey", true);
        c6118a1.m5821j("navIndex", true);
        c6118a1.m5821j("entryMode", true);
        c6118a1.m5821j("reviewPracticeSessionId", true);
        c6118a1.m5821j("reviewPracticeRoundId", true);
        c6118a1.m5821j("reviewPracticeScene", true);
        c6118a1.m5821j("reviewPracticePoolType", true);
        descriptor = c6118a1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p118m7.InterfaceC6125c0
    public final InterfaceC5686b[] childSerializers() {
        InterfaceC5429e[] interfaceC5429eArr = C6620g.f11071s;
        C6146j0 c6146j0 = C6146j0.f9816a;
        C6156m1 c6156m1 = C6156m1.f9829a;
        C6136g c6136g = C6136g.f9800a;
        return new InterfaceC5686b[]{c6146j0, c6146j0, C6161o0.f9839a, c6156m1, c6156m1, c6156m1, c6156m1, c6136g, c6136g, c6136g, interfaceC5429eArr[10].getValue(), c6156m1, c6146j0, interfaceC5429eArr[13].getValue(), c6156m1, c6156m1, interfaceC5429eArr[16].getValue(), AbstractC5806u.m5283v((InterfaceC5686b) interfaceC5429eArr[17].getValue())};
    }

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        int i;
        List list;
        MistakeDetailNewContract$EntryMode mistakeDetailNewContract$EntryMode;
        int i8;
        int i9;
        ReviewContract$PracticePoolType reviewContract$PracticePoolType;
        ReviewContract$PracticeScene reviewContract$PracticeScene;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i10;
        long j7;
        AbstractC5830k.m5330g(decoder, "decoder");
        InterfaceC5765g interfaceC5765g = descriptor;
        InterfaceC6069c interfaceC6069cBeginStructure = decoder.beginStructure(interfaceC5765g);
        InterfaceC5429e[] interfaceC5429eArr = C6620g.f11071s;
        int i11 = 5;
        int i12 = 10;
        if (interfaceC6069cBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 0);
            int iDecodeIntElement2 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 1);
            long jDecodeLongElement = interfaceC6069cBeginStructure.decodeLongElement(interfaceC5765g, 2);
            String strDecodeStringElement = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 3);
            String strDecodeStringElement2 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 4);
            String strDecodeStringElement3 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 5);
            String strDecodeStringElement4 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 6);
            boolean zDecodeBooleanElement = interfaceC6069cBeginStructure.decodeBooleanElement(interfaceC5765g, 7);
            boolean zDecodeBooleanElement2 = interfaceC6069cBeginStructure.decodeBooleanElement(interfaceC5765g, 8);
            boolean zDecodeBooleanElement3 = interfaceC6069cBeginStructure.decodeBooleanElement(interfaceC5765g, 9);
            List list2 = (List) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 10, (InterfaceC5685a) interfaceC5429eArr[10].getValue(), null);
            String strDecodeStringElement5 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 11);
            int iDecodeIntElement3 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 12);
            MistakeDetailNewContract$EntryMode mistakeDetailNewContract$EntryMode2 = (MistakeDetailNewContract$EntryMode) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 13, (InterfaceC5685a) interfaceC5429eArr[13].getValue(), null);
            String strDecodeStringElement6 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 14);
            String strDecodeStringElement7 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 15);
            ReviewContract$PracticeScene reviewContract$PracticeScene2 = (ReviewContract$PracticeScene) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 16, (InterfaceC5685a) interfaceC5429eArr[16].getValue(), null);
            i = 262143;
            mistakeDetailNewContract$EntryMode = mistakeDetailNewContract$EntryMode2;
            reviewContract$PracticePoolType = (ReviewContract$PracticePoolType) interfaceC6069cBeginStructure.decodeNullableSerializableElement(interfaceC5765g, 17, (InterfaceC5685a) interfaceC5429eArr[17].getValue(), null);
            i9 = iDecodeIntElement2;
            list = list2;
            str7 = strDecodeStringElement7;
            z8 = zDecodeBooleanElement3;
            z9 = zDecodeBooleanElement;
            str4 = strDecodeStringElement4;
            str3 = strDecodeStringElement3;
            str2 = strDecodeStringElement2;
            z10 = zDecodeBooleanElement2;
            str5 = strDecodeStringElement5;
            i10 = iDecodeIntElement3;
            str6 = strDecodeStringElement6;
            str = strDecodeStringElement;
            reviewContract$PracticeScene = reviewContract$PracticeScene2;
            i8 = iDecodeIntElement;
            j7 = jDecodeLongElement;
        } else {
            i = 0;
            int iDecodeIntElement4 = 0;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            int iDecodeIntElement5 = 0;
            boolean z11 = true;
            MistakeDetailNewContract$EntryMode mistakeDetailNewContract$EntryMode3 = null;
            ReviewContract$PracticePoolType reviewContract$PracticePoolType2 = null;
            ReviewContract$PracticeScene reviewContract$PracticeScene3 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            long jDecodeLongElement2 = 0;
            int iDecodeIntElement6 = 0;
            List list3 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            while (z11) {
                int iDecodeElementIndex = interfaceC6069cBeginStructure.decodeElementIndex(interfaceC5765g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                    case 0:
                        i |= 1;
                        iDecodeIntElement6 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 0);
                        i12 = 10;
                    case 1:
                        i |= 2;
                        iDecodeIntElement4 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 1);
                        i12 = 10;
                    case 2:
                        jDecodeLongElement2 = interfaceC6069cBeginStructure.decodeLongElement(interfaceC5765g, 2);
                        i |= 4;
                        i12 = 10;
                    case 3:
                        strDecodeStringElement13 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 3);
                        i |= 8;
                        i12 = 10;
                    case 4:
                        strDecodeStringElement14 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 4);
                        i |= 16;
                        i12 = 10;
                    case 5:
                        strDecodeStringElement8 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, i11);
                        i |= 32;
                    case 6:
                        strDecodeStringElement9 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 6);
                        i |= 64;
                        i11 = 5;
                    case 7:
                        zDecodeBooleanElement5 = interfaceC6069cBeginStructure.decodeBooleanElement(interfaceC5765g, 7);
                        i |= 128;
                        i11 = 5;
                    case 8:
                        zDecodeBooleanElement6 = interfaceC6069cBeginStructure.decodeBooleanElement(interfaceC5765g, 8);
                        i |= 256;
                        i11 = 5;
                    case 9:
                        zDecodeBooleanElement4 = interfaceC6069cBeginStructure.decodeBooleanElement(interfaceC5765g, 9);
                        i |= 512;
                        i11 = 5;
                    case 10:
                        list3 = (List) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, i12, (InterfaceC5685a) interfaceC5429eArr[i12].getValue(), list3);
                        i |= 1024;
                        i11 = 5;
                    case 11:
                        strDecodeStringElement10 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 11);
                        i |= 2048;
                        i11 = 5;
                    case 12:
                        iDecodeIntElement5 = interfaceC6069cBeginStructure.decodeIntElement(interfaceC5765g, 12);
                        i |= 4096;
                        i11 = 5;
                    case 13:
                        mistakeDetailNewContract$EntryMode3 = (MistakeDetailNewContract$EntryMode) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 13, (InterfaceC5685a) interfaceC5429eArr[13].getValue(), mistakeDetailNewContract$EntryMode3);
                        i |= 8192;
                        i11 = 5;
                    case 14:
                        strDecodeStringElement11 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 14);
                        i |= 16384;
                        i11 = 5;
                    case 15:
                        strDecodeStringElement12 = interfaceC6069cBeginStructure.decodeStringElement(interfaceC5765g, 15);
                        i |= 32768;
                        i11 = 5;
                    case 16:
                        reviewContract$PracticeScene3 = (ReviewContract$PracticeScene) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 16, (InterfaceC5685a) interfaceC5429eArr[16].getValue(), reviewContract$PracticeScene3);
                        i |= 65536;
                        i11 = 5;
                    case 17:
                        reviewContract$PracticePoolType2 = (ReviewContract$PracticePoolType) interfaceC6069cBeginStructure.decodeNullableSerializableElement(interfaceC5765g, 17, (InterfaceC5685a) interfaceC5429eArr[17].getValue(), reviewContract$PracticePoolType2);
                        i |= 131072;
                        i11 = 5;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list3;
            mistakeDetailNewContract$EntryMode = mistakeDetailNewContract$EntryMode3;
            i8 = iDecodeIntElement6;
            i9 = iDecodeIntElement4;
            reviewContract$PracticePoolType = reviewContract$PracticePoolType2;
            reviewContract$PracticeScene = reviewContract$PracticeScene3;
            str = strDecodeStringElement13;
            str2 = strDecodeStringElement14;
            str3 = strDecodeStringElement8;
            str4 = strDecodeStringElement9;
            str5 = strDecodeStringElement10;
            str6 = strDecodeStringElement11;
            str7 = strDecodeStringElement12;
            z8 = zDecodeBooleanElement4;
            z9 = zDecodeBooleanElement5;
            z10 = zDecodeBooleanElement6;
            i10 = iDecodeIntElement5;
            j7 = jDecodeLongElement2;
        }
        int i13 = i;
        interfaceC6069cBeginStructure.endStructure(interfaceC5765g);
        return new C6620g(i13, i8, i9, j7, str, str2, str3, str4, z9, z10, z8, list, str5, i10, mistakeDetailNewContract$EntryMode, str6, str7, reviewContract$PracticeScene, reviewContract$PracticePoolType);
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0189 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016f  */
    @Override // p084i7.InterfaceC5689e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void serialize(p109l7.InterfaceC6072f r25, java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p175u4.C6618e.serialize(l7.f, java.lang.Object):void");
    }

    @Override // p118m7.InterfaceC6125c0
    public final InterfaceC5686b[] typeParametersSerializers() {
        return AbstractC6191y0.f9897b;
    }
}
