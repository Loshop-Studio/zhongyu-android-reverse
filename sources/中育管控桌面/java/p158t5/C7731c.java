package p158t5;

import java.net.IDN;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okio.ByteString;
import p065g5.AbstractC6424h;

/* renamed from: t5.c */
/* loaded from: classes4.dex */
public final class C7731c {

    /* renamed from: b */
    public static final a f10217b = new a(null);

    /* renamed from: c */
    public static final ByteString f10218c = ByteString.INSTANCE.m8941of(42);

    /* renamed from: d */
    public static final List f10219d = CollectionsKt.listOf("*");

    /* renamed from: e */
    public static final C7731c f10220e = new C7731c(AbstractC7733e.m9226a(InterfaceC7732d.f10222a));

    /* renamed from: a */
    public final InterfaceC7732d f10221a;

    /* renamed from: t5.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final String m9224b(ByteString byteString, ByteString[] byteStringArr, int i6) {
            int i7;
            int iM6988b;
            boolean z6;
            int iM6988b2;
            int size = byteString.size();
            int i8 = 0;
            while (i8 < size) {
                int i9 = (i8 + size) / 2;
                while (i9 > -1 && byteString.getByte(i9) != 10) {
                    i9--;
                }
                int i10 = i9 + 1;
                int i11 = 1;
                while (true) {
                    i7 = i10 + i11;
                    if (byteString.getByte(i7) == 10) {
                        break;
                    }
                    i11++;
                }
                int i12 = i7 - i10;
                int i13 = i6;
                boolean z7 = false;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    if (z7) {
                        iM6988b = 46;
                        z6 = false;
                    } else {
                        boolean z8 = z7;
                        iM6988b = AbstractC6424h.m6988b(byteStringArr[i13].getByte(i14), 255);
                        z6 = z8;
                    }
                    iM6988b2 = iM6988b - AbstractC6424h.m6988b(byteString.getByte(i10 + i15), 255);
                    if (iM6988b2 != 0) {
                        break;
                    }
                    i15++;
                    i14++;
                    if (i15 == i12) {
                        break;
                    }
                    if (byteStringArr[i13].size() != i14) {
                        z7 = z6;
                    } else {
                        if (i13 == byteStringArr.length - 1) {
                            break;
                        }
                        i13++;
                        z7 = true;
                        i14 = -1;
                    }
                }
                if (iM6988b2 >= 0) {
                    if (iM6988b2 <= 0) {
                        int i16 = i12 - i15;
                        int size2 = byteStringArr[i13].size() - i14;
                        int length = byteStringArr.length;
                        for (int i17 = i13 + 1; i17 < length; i17++) {
                            size2 += byteStringArr[i17].size();
                        }
                        if (size2 >= i16) {
                            if (size2 <= i16) {
                                return byteString.substring(i10, i12 + i10).string(Charsets.UTF_8);
                            }
                        }
                    }
                    i8 = i7 + 1;
                }
                size = i9;
            }
            return null;
        }

        /* renamed from: c */
        public final C7731c m9225c() {
            return C7731c.f10220e;
        }

        public a() {
        }
    }

    public C7731c(InterfaceC7732d publicSuffixList) {
        Intrinsics.checkNotNullParameter(publicSuffixList, "publicSuffixList");
        this.f10221a = publicSuffixList;
    }

    /* renamed from: b */
    public final List m9220b(List list) {
        String str;
        String strM9224b;
        String str2;
        List listEmptyList;
        List listEmptyList2;
        this.f10221a.mo9213a();
        int size = list.size();
        ByteString[] byteStringArr = new ByteString[size];
        for (int i6 = 0; i6 < size; i6++) {
            byteStringArr[i6] = ByteString.INSTANCE.encodeUtf8((String) list.get(i6));
        }
        int i7 = 0;
        while (true) {
            str = null;
            if (i7 >= size) {
                strM9224b = null;
                break;
            }
            strM9224b = f10217b.m9224b(this.f10221a.getBytes(), byteStringArr, i7);
            if (strM9224b != null) {
                break;
            }
            i7++;
        }
        if (size > 1) {
            ByteString[] byteStringArr2 = (ByteString[]) byteStringArr.clone();
            int length = byteStringArr2.length - 1;
            for (int i8 = 0; i8 < length; i8++) {
                byteStringArr2[i8] = f10218c;
                String strM9224b2 = f10217b.m9224b(this.f10221a.getBytes(), byteStringArr2, i8);
                if (strM9224b2 != null) {
                    str2 = strM9224b2;
                    break;
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int i9 = size - 1;
            int i10 = 0;
            while (true) {
                if (i10 >= i9) {
                    break;
                }
                String strM9224b3 = f10217b.m9224b(this.f10221a.mo9214b(), byteStringArr, i10);
                if (strM9224b3 != null) {
                    str = strM9224b3;
                    break;
                }
                i10++;
            }
        }
        if (str != null) {
            return StringsKt.split$default((CharSequence) ('!' + str), new char[]{'.'}, false, 0, 6, (Object) null);
        }
        if (strM9224b == null && str2 == null) {
            return f10219d;
        }
        if (strM9224b == null || (listEmptyList = StringsKt.split$default((CharSequence) strM9224b, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (str2 == null || (listEmptyList2 = StringsKt.split$default((CharSequence) str2, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return listEmptyList.size() > listEmptyList2.size() ? listEmptyList : listEmptyList2;
    }

    /* renamed from: c */
    public final String m9221c(String domain) {
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicode = IDN.toUnicode(domain);
        Intrinsics.checkNotNull(unicode);
        List listM9222d = m9222d(unicode);
        List listM9220b = m9220b(listM9222d);
        if (listM9222d.size() == listM9220b.size() && ((String) listM9220b.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM9220b.get(0)).charAt(0) == '!') {
            size = listM9222d.size();
            size2 = listM9220b.size();
        } else {
            size = listM9222d.size();
            size2 = listM9220b.size() + 1;
        }
        return SequencesKt.joinToString$default(SequencesKt.drop(CollectionsKt.asSequence(m9222d(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    /* renamed from: d */
    public final List m9222d(String str) {
        List listSplit$default = StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
        return Intrinsics.areEqual(CollectionsKt.last(listSplit$default), "") ? CollectionsKt.dropLast(listSplit$default, 1) : listSplit$default;
    }
}
