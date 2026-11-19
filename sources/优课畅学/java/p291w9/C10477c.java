package p291w9;

import java.net.IDN;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okio.ByteString;
import org.slf4j.Marker;
import p101f8.AbstractC8479q;
import p113g8.AbstractC8661c0;
import p113g8.C8660c;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8809v;
import p147j9.AbstractC9038h;

/* renamed from: w9.c */
/* loaded from: classes5.dex */
public final class C10477c {

    /* renamed from: b */
    public static final a f20816b = new a(null);

    /* renamed from: c */
    public static final ByteString f20817c = ByteString.Companion.m18122of(42);

    /* renamed from: d */
    public static final List f20818d = AbstractC8807u.m14755e(Marker.ANY_MARKER);

    /* renamed from: e */
    public static final C10477c f20819e = new C10477c(AbstractC10479e.m19604a(InterfaceC10478d.f20821a));

    /* renamed from: a */
    public final InterfaceC10478d f20820a;

    /* renamed from: w9.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: b */
        public final String m19602b(ByteString byteString, ByteString[] byteStringArr, int i10) {
            int i11;
            int iM15746b;
            boolean z10;
            int iM15746b2;
            int size = byteString.size();
            int i12 = 0;
            while (i12 < size) {
                int i13 = (i12 + size) / 2;
                while (i13 > -1 && byteString.getByte(i13) != 10) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (byteString.getByte(i11) == 10) {
                        break;
                    }
                    i15++;
                }
                int i16 = i11 - i14;
                int i17 = i10;
                boolean z11 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z11) {
                        iM15746b = 46;
                        z10 = false;
                    } else {
                        boolean z12 = z11;
                        iM15746b = AbstractC9038h.m15746b(byteStringArr[i17].getByte(i18), 255);
                        z10 = z12;
                    }
                    iM15746b2 = iM15746b - AbstractC9038h.m15746b(byteString.getByte(i14 + i19), 255);
                    if (iM15746b2 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (byteStringArr[i17].size() != i18) {
                        z11 = z10;
                    } else {
                        if (i17 == byteStringArr.length - 1) {
                            break;
                        }
                        i17++;
                        z11 = true;
                        i18 = -1;
                    }
                }
                if (iM15746b2 >= 0) {
                    if (iM15746b2 <= 0) {
                        int i20 = i16 - i19;
                        int size2 = byteStringArr[i17].size() - i18;
                        int length = byteStringArr.length;
                        for (int i21 = i17 + 1; i21 < length; i21++) {
                            size2 += byteStringArr[i21].size();
                        }
                        if (size2 >= i20) {
                            if (size2 <= i20) {
                                return byteString.substring(i14, i16 + i14).string(C8660c.f16206b);
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                size = i13;
            }
            return null;
        }

        /* renamed from: c */
        public final C10477c m19603c() {
            return C10477c.f20819e;
        }

        public a() {
        }
    }

    public C10477c(InterfaceC10478d publicSuffixList) {
        AbstractC9133u.m16133g(publicSuffixList, "publicSuffixList");
        this.f20820a = publicSuffixList;
    }

    /* renamed from: b */
    public final List m19598b(List list) {
        String str;
        String strM19602b;
        String str2;
        List listM14771n;
        List listM14771n2;
        this.f20820a.mo19591a();
        int size = list.size();
        ByteString[] byteStringArr = new ByteString[size];
        for (int i10 = 0; i10 < size; i10++) {
            byteStringArr[i10] = ByteString.Companion.encodeUtf8((String) list.get(i10));
        }
        int i11 = 0;
        while (true) {
            str = null;
            if (i11 >= size) {
                strM19602b = null;
                break;
            }
            strM19602b = f20816b.m19602b(this.f20820a.getBytes(), byteStringArr, i11);
            if (strM19602b != null) {
                break;
            }
            i11++;
        }
        if (size > 1) {
            ByteString[] byteStringArr2 = (ByteString[]) byteStringArr.clone();
            int length = byteStringArr2.length - 1;
            for (int i12 = 0; i12 < length; i12++) {
                byteStringArr2[i12] = f20817c;
                String strM19602b2 = f20816b.m19602b(this.f20820a.getBytes(), byteStringArr2, i12);
                if (strM19602b2 != null) {
                    str2 = strM19602b2;
                    break;
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int i13 = size - 1;
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    break;
                }
                String strM19602b3 = f20816b.m19602b(this.f20820a.mo19592b(), byteStringArr, i14);
                if (strM19602b3 != null) {
                    str = strM19602b3;
                    break;
                }
                i14++;
            }
        }
        if (str != null) {
            return AbstractC8661c0.m13957H0('!' + str, new char[]{'.'}, false, 0, 6, null);
        }
        if (strM19602b == null && str2 == null) {
            return f20818d;
        }
        if (strM19602b == null || (listM14771n = AbstractC8661c0.m13957H0(strM19602b, new char[]{'.'}, false, 0, 6, null)) == null) {
            listM14771n = AbstractC8809v.m14771n();
        }
        if (str2 == null || (listM14771n2 = AbstractC8661c0.m13957H0(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
            listM14771n2 = AbstractC8809v.m14771n();
        }
        return listM14771n.size() > listM14771n2.size() ? listM14771n : listM14771n2;
    }

    /* renamed from: c */
    public final String m19599c(String domain) {
        int size;
        int size2;
        AbstractC9133u.m16133g(domain, "domain");
        String unicode = IDN.toUnicode(domain);
        AbstractC9133u.m16130d(unicode);
        List listM19600d = m19600d(unicode);
        List listM19598b = m19598b(listM19600d);
        if (listM19600d.size() == listM19598b.size() && ((String) listM19598b.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM19598b.get(0)).charAt(0) == '!') {
            size = listM19600d.size();
            size2 = listM19598b.size();
        } else {
            size = listM19600d.size();
            size2 = listM19598b.size() + 1;
        }
        return AbstractC8479q.m13857z(AbstractC8479q.m13848q(AbstractC8778f0.m14554c0(m19600d(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    /* renamed from: d */
    public final List m19600d(String str) {
        List listM13957H0 = AbstractC8661c0.m13957H0(str, new char[]{'.'}, false, 0, 6, null);
        return AbstractC9133u.m16128b(AbstractC8778f0.m14578x0(listM13957H0), "") ? AbstractC8778f0.m14561g0(listM13957H0, 1) : listM13957H0;
    }
}
