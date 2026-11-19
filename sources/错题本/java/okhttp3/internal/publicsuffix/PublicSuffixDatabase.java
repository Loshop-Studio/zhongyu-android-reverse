package okhttp3.internal.publicsuffix;

import android.support.v4.media.AbstractC0037f;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil3.network.AbstractC3315g;
import io.reactivex.internal.operators.observable.C5707c;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.AbstractC5855p;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import p185v7.C6685n;
import p214z6.AbstractC6833k;
import p214z6.C6824b;
import p214z6.InterfaceC6825c;
import p214z6.InterfaceC6830h;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m5110d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "io/reactivex/internal/operators/observable/c", "okhttp"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e */
    public static final byte[] f10195e = {42};

    /* renamed from: f */
    public static final List f10196f = AbstractC5806u.m5286y("*");

    /* renamed from: g */
    public static final PublicSuffixDatabase f10197g = new PublicSuffixDatabase();

    /* renamed from: a */
    public final AtomicBoolean f10198a = new AtomicBoolean(false);

    /* renamed from: b */
    public final CountDownLatch f10199b = new CountDownLatch(1);

    /* renamed from: c */
    public byte[] f10200c;

    /* renamed from: d */
    public byte[] f10201d;

    /* renamed from: c */
    public static List m5936c(String str) {
        List listM5393a0 = AbstractC5855p.m5393a0(str, new char[]{'.'});
        return AbstractC5830k.m5325b(AbstractC5805t.m5235o0(listM5393a0), "") ? AbstractC5805t.m5226f0(listM5393a0) : listM5393a0;
    }

    /* renamed from: a */
    public final String m5937a(String str) throws InterruptedException {
        String strM5076j;
        String strM5076j2;
        String strM5076j3;
        List listM5393a0;
        int size;
        int size2;
        String unicodeDomain = IDN.toUnicode(str);
        AbstractC5830k.m5329f(unicodeDomain, "unicodeDomain");
        List listM5936c = m5936c(unicodeDomain);
        if (this.f10198a.get() || !this.f10198a.compareAndSet(false, true)) {
            try {
                this.f10199b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z8 = false;
            while (true) {
                try {
                    try {
                        m5938b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z8 = true;
                    } catch (IOException e) {
                        C6685n c6685n = C6685n.f11276a;
                        C6685n.f11276a.getClass();
                        C6685n.m6380i("Failed to read public suffix list", 5, e);
                        if (z8) {
                        }
                    }
                } finally {
                    if (z8) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.f10200c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size3 = listM5936c.size();
        byte[][] bArr = new byte[size3][];
        for (int i = 0; i < size3; i++) {
            String str2 = (String) listM5936c.get(i);
            Charset UTF_8 = StandardCharsets.UTF_8;
            AbstractC5830k.m5329f(UTF_8, "UTF_8");
            byte[] bytes = str2.getBytes(UTF_8);
            AbstractC5830k.m5329f(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i] = bytes;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= size3) {
                strM5076j = null;
                break;
            }
            byte[] bArr2 = this.f10200c;
            if (bArr2 == null) {
                AbstractC5830k.m5339p("publicSuffixListBytes");
                throw null;
            }
            strM5076j = C5707c.m5076j(bArr2, bArr, i8);
            if (strM5076j != null) {
                break;
            }
            i8++;
        }
        if (size3 > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i9 = 0; i9 < length; i9++) {
                bArr3[i9] = f10195e;
                byte[] bArr4 = this.f10200c;
                if (bArr4 == null) {
                    AbstractC5830k.m5339p("publicSuffixListBytes");
                    throw null;
                }
                strM5076j2 = C5707c.m5076j(bArr4, bArr3, i9);
                if (strM5076j2 != null) {
                    break;
                }
            }
            strM5076j2 = null;
        } else {
            strM5076j2 = null;
        }
        if (strM5076j2 != null) {
            int i10 = size3 - 1;
            for (int i11 = 0; i11 < i10; i11++) {
                byte[] bArr5 = this.f10201d;
                if (bArr5 == null) {
                    AbstractC5830k.m5339p("publicSuffixExceptionListBytes");
                    throw null;
                }
                strM5076j3 = C5707c.m5076j(bArr5, bArr, i11);
                if (strM5076j3 != null) {
                    break;
                }
            }
            strM5076j3 = null;
        } else {
            strM5076j3 = null;
        }
        if (strM5076j3 != null) {
            listM5393a0 = AbstractC5855p.m5393a0("!".concat(strM5076j3), new char[]{'.'});
        } else if (strM5076j == null && strM5076j2 == null) {
            listM5393a0 = f10196f;
        } else {
            List listM5393a02 = strM5076j != null ? AbstractC5855p.m5393a0(strM5076j, new char[]{'.'}) : EmptyList.INSTANCE;
            listM5393a0 = strM5076j2 != null ? AbstractC5855p.m5393a0(strM5076j2, new char[]{'.'}) : EmptyList.INSTANCE;
            if (listM5393a02.size() > listM5393a0.size()) {
                listM5393a0 = listM5393a02;
            }
        }
        if (listM5936c.size() == listM5393a0.size() && ((String) listM5393a0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM5393a0.get(0)).charAt(0) == '!') {
            size = listM5936c.size();
            size2 = listM5393a0.size();
        } else {
            size = listM5936c.size();
            size2 = listM5393a0.size() + 1;
        }
        int i12 = size - size2;
        InterfaceC6830h interfaceC6830hM5223c0 = AbstractC5805t.m5223c0(m5936c(str));
        if (i12 < 0) {
            throw new IllegalArgumentException(AbstractC0037f.m82g(i12, "Requested element count ", " is less than zero.").toString());
        }
        if (i12 != 0) {
            interfaceC6830hM5223c0 = interfaceC6830hM5223c0 instanceof InterfaceC6825c ? ((InterfaceC6825c) interfaceC6830hM5223c0).mo6486a(i12) : new C6824b(interfaceC6830hM5223c0, i12, 0);
        }
        return AbstractC6833k.m6496w(interfaceC6830hM5223c0, ".");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, byte[]] */
    /* renamed from: b */
    public final void m5938b() {
        try {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                BufferedSource bufferedSourceBuffer = Okio.buffer(new GzipSource(Okio.source(resourceAsStream)));
                try {
                    ref$ObjectRef.element = bufferedSourceBuffer.readByteArray(bufferedSourceBuffer.readInt());
                    ref$ObjectRef2.element = bufferedSourceBuffer.readByteArray(bufferedSourceBuffer.readInt());
                    AbstractC3315g.m2237e(bufferedSourceBuffer, null);
                    synchronized (this) {
                        T t8 = ref$ObjectRef.element;
                        AbstractC5830k.m5327d(t8);
                        this.f10200c = (byte[]) t8;
                        T t9 = ref$ObjectRef2.element;
                        AbstractC5830k.m5327d(t9);
                        this.f10201d = (byte[]) t9;
                    }
                } finally {
                }
            }
        } finally {
            this.f10199b.countDown();
        }
    }
}
