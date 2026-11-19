package okhttp3.internal.publicsuffix;

import cd.AbstractC5423b;
import com.alibaba.android.arouter.utils.Consts;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$ObjectRef;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import p296pd.AbstractC10669q;
import p309qc.C10786q;
import p310qd.AbstractC10793c0;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;
import se.C11192j;

/* loaded from: classes6.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e */
    public static final C10504a f25273e = new C10504a(null);

    /* renamed from: f */
    public static final byte[] f25274f = {42};

    /* renamed from: g */
    public static final List f25275g = AbstractC10976v.m24126e("*");

    /* renamed from: h */
    public static final PublicSuffixDatabase f25276h = new PublicSuffixDatabase();

    /* renamed from: a */
    public final AtomicBoolean f25277a = new AtomicBoolean(false);

    /* renamed from: b */
    public final CountDownLatch f25278b = new CountDownLatch(1);

    /* renamed from: c */
    public byte[] f25279c;

    /* renamed from: d */
    public byte[] f25280d;

    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a */
    public static final class C10504a {
        public /* synthetic */ C10504a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: b */
        public final String m22178b(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            int iM20022d;
            boolean z10;
            int iM20022d2;
            int length = bArr.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = (i12 + length) / 2;
                while (i13 > -1 && bArr[i13] != 10) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (bArr[i11] == 10) {
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
                        iM20022d = 46;
                        z10 = false;
                    } else {
                        boolean z12 = z11;
                        iM20022d = AbstractC9920d.m20022d(bArr2[i17][i18], 255);
                        z10 = z12;
                    }
                    iM20022d2 = iM20022d - AbstractC9920d.m20022d(bArr[i14 + i19], 255);
                    if (iM20022d2 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (bArr2[i17].length != i18) {
                        z11 = z10;
                    } else {
                        if (i17 == bArr2.length - 1) {
                            break;
                        }
                        i17++;
                        z11 = true;
                        i18 = -1;
                    }
                }
                if (iM20022d2 >= 0) {
                    if (iM20022d2 <= 0) {
                        int i20 = i16 - i19;
                        int length2 = bArr2[i17].length - i18;
                        int length3 = bArr2.length;
                        for (int i21 = i17 + 1; i21 < length3; i21++) {
                            length2 += bArr2[i21].length;
                        }
                        if (length2 >= i20) {
                            if (length2 <= i20) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                AbstractC9979u.m20293f(UTF_8, "UTF_8");
                                return new String(bArr, i14, i16, UTF_8);
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                length = i13;
            }
            return null;
        }

        /* renamed from: c */
        public final PublicSuffixDatabase m22179c() {
            return PublicSuffixDatabase.f25276h;
        }

        public C10504a() {
        }
    }

    /* renamed from: b */
    public final List m22172b(List list) throws InterruptedException {
        String str;
        String strM22178b;
        String str2;
        List listM24136n;
        List listM24136n2;
        if (this.f25277a.get() || !this.f25277a.compareAndSet(false, true)) {
            try {
                this.f25278b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            m22175e();
        }
        if (this.f25279c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i10 = 0; i10 < size; i10++) {
            String str3 = (String) list.get(i10);
            Charset UTF_8 = StandardCharsets.UTF_8;
            AbstractC9979u.m20293f(UTF_8, "UTF_8");
            byte[] bytes = str3.getBytes(UTF_8);
            AbstractC9979u.m20293f(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i10] = bytes;
        }
        int i11 = 0;
        while (true) {
            str = null;
            if (i11 >= size) {
                strM22178b = null;
                break;
            }
            C10504a c10504a = f25273e;
            byte[] bArr2 = this.f25279c;
            if (bArr2 == null) {
                AbstractC9979u.m20312y("publicSuffixListBytes");
                bArr2 = null;
            }
            strM22178b = c10504a.m22178b(bArr2, bArr, i11);
            if (strM22178b != null) {
                break;
            }
            i11++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i12 = 0; i12 < length; i12++) {
                bArr3[i12] = f25274f;
                C10504a c10504a2 = f25273e;
                byte[] bArr4 = this.f25279c;
                if (bArr4 == null) {
                    AbstractC9979u.m20312y("publicSuffixListBytes");
                    bArr4 = null;
                }
                String strM22178b2 = c10504a2.m22178b(bArr4, bArr3, i12);
                if (strM22178b2 != null) {
                    str2 = strM22178b2;
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
                C10504a c10504a3 = f25273e;
                byte[] bArr5 = this.f25280d;
                if (bArr5 == null) {
                    AbstractC9979u.m20312y("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                String strM22178b3 = c10504a3.m22178b(bArr5, bArr, i14);
                if (strM22178b3 != null) {
                    str = strM22178b3;
                    break;
                }
                i14++;
            }
        }
        if (str != null) {
            return AbstractC10793c0.m23090H0('!' + str, new char[]{'.'}, false, 0, 6, null);
        }
        if (strM22178b == null && str2 == null) {
            return f25275g;
        }
        if (strM22178b == null || (listM24136n = AbstractC10793c0.m23090H0(strM22178b, new char[]{'.'}, false, 0, 6, null)) == null) {
            listM24136n = AbstractC10978w.m24136n();
        }
        if (str2 == null || (listM24136n2 = AbstractC10793c0.m23090H0(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
            listM24136n2 = AbstractC10978w.m24136n();
        }
        return listM24136n.size() > listM24136n2.size() ? listM24136n : listM24136n2;
    }

    /* renamed from: c */
    public final String m22173c(String domain) throws InterruptedException {
        int size;
        int size2;
        AbstractC9979u.m20294g(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        AbstractC9979u.m20293f(unicodeDomain, "unicodeDomain");
        List listM22176f = m22176f(unicodeDomain);
        List listM22172b = m22172b(listM22176f);
        if (listM22176f.size() == listM22172b.size() && ((String) listM22172b.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM22172b.get(0)).charAt(0) == '!') {
            size = listM22176f.size();
            size2 = listM22172b.size();
        } else {
            size = listM22176f.size();
            size2 = listM22172b.size() + 1;
        }
        return AbstractC10669q.m22588z(AbstractC10669q.m22579q(AbstractC10947g0.m23930d0(m22176f(domain)), size - size2), Consts.DOT, null, null, 0, null, null, 62, null);
    }

    /* renamed from: d */
    public final void m22174d() {
        try {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                BufferedSource bufferedSourceBuffer = Okio.buffer(new GzipSource(Okio.source(resourceAsStream)));
                try {
                    ref$ObjectRef.f23402c = bufferedSourceBuffer.readByteArray(bufferedSourceBuffer.readInt());
                    ref$ObjectRef2.f23402c = bufferedSourceBuffer.readByteArray(bufferedSourceBuffer.readInt());
                    C10786q c10786q = C10786q.f26013a;
                    AbstractC5423b.m2902a(bufferedSourceBuffer, null);
                    synchronized (this) {
                        Object obj = ref$ObjectRef.f23402c;
                        AbstractC9979u.m20291d(obj);
                        this.f25279c = (byte[]) obj;
                        Object obj2 = ref$ObjectRef2.f23402c;
                        AbstractC9979u.m20291d(obj2);
                        this.f25280d = (byte[]) obj2;
                    }
                } finally {
                }
            }
        } finally {
            this.f25278b.countDown();
        }
    }

    /* renamed from: e */
    public final void m22175e() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    m22174d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    C11192j.f26882a.m24899g().m24892j("Failed to read public suffix list", 5, e10);
                    if (!z10) {
                        return;
                    }
                }
            } finally {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* renamed from: f */
    public final List m22176f(String str) {
        List listM23090H0 = AbstractC10793c0.m23090H0(str, new char[]{'.'}, false, 0, 6, null);
        return AbstractC9979u.m20289b(AbstractC10947g0.m23956y0(listM23090H0), "") ? AbstractC10947g0.m23938h0(listM23090H0, 1) : listM23090H0;
    }
}
