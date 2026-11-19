package okhttp3.internal.publicsuffix;

import com.umeng.analytics.pro.C3335ai;
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
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p086io.CloseableKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import p004a3.C0021k;
import p121s2.AbstractC4550b;

@Metadata(m5174d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u001a"}, m5175d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "", "domain", C3335ai.f1663aD, "", "f", "domainLabels", "b", "", "e", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", C3335ai.f1705at, "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "", "[B", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "<init>", "()V", "h", "okhttp"}, m5176k = 1, m5177mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class PublicSuffixDatabase {

    /* renamed from: a, reason: from kotlin metadata */
    public final AtomicBoolean listRead = new AtomicBoolean(false);

    /* renamed from: b, reason: from kotlin metadata */
    public final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* renamed from: c, reason: from kotlin metadata */
    public byte[] publicSuffixListBytes;

    /* renamed from: d, reason: from kotlin metadata */
    public byte[] publicSuffixExceptionListBytes;

    /* renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e */
    public static final byte[] f5114e = {(byte) 42};

    /* renamed from: f */
    public static final List f5115f = CollectionsKt__CollectionsJVMKt.listOf("*");

    /* renamed from: g */
    public static final PublicSuffixDatabase f5116g = new PublicSuffixDatabase();

    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final String m5644b(byte[] bArr, byte[][] bArr2, int i4) {
            int i5;
            boolean z3;
            int iM6220b;
            int iM6220b2;
            int length = bArr.length;
            int i6 = 0;
            while (i6 < length) {
                int i7 = (i6 + length) / 2;
                while (i7 > -1 && bArr[i7] != ((byte) 10)) {
                    i7--;
                }
                int i8 = i7 + 1;
                int i9 = 1;
                while (true) {
                    i5 = i8 + i9;
                    if (bArr[i5] == ((byte) 10)) {
                        break;
                    }
                    i9++;
                }
                int i10 = i5 - i8;
                int i11 = i4;
                boolean z4 = false;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (z4) {
                        iM6220b = 46;
                        z3 = false;
                    } else {
                        z3 = z4;
                        iM6220b = AbstractC4550b.m6220b(bArr2[i11][i12], 255);
                    }
                    iM6220b2 = iM6220b - AbstractC4550b.m6220b(bArr[i8 + i13], 255);
                    if (iM6220b2 != 0) {
                        break;
                    }
                    i13++;
                    i12++;
                    if (i13 == i10) {
                        break;
                    }
                    if (bArr2[i11].length != i12) {
                        z4 = z3;
                    } else {
                        if (i11 == bArr2.length - 1) {
                            break;
                        }
                        i11++;
                        i12 = -1;
                        z4 = true;
                    }
                }
                if (iM6220b2 >= 0) {
                    if (iM6220b2 <= 0) {
                        int i14 = i10 - i13;
                        int length2 = bArr2[i11].length - i12;
                        int length3 = bArr2.length;
                        for (int i15 = i11 + 1; i15 < length3; i15++) {
                            length2 += bArr2[i15].length;
                        }
                        if (length2 >= i14) {
                            if (length2 <= i14) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                                return new String(bArr, i8, i10, UTF_8);
                            }
                        }
                    }
                    i6 = i5 + 1;
                }
                length = i8 - 1;
            }
            return null;
        }

        /* renamed from: c */
        public final PublicSuffixDatabase m5645c() {
            return PublicSuffixDatabase.f5116g;
        }
    }

    /* renamed from: b */
    public final List m5638b(List domainLabels) throws InterruptedException {
        String str;
        String strM5644b;
        String str2;
        List listEmptyList;
        List listEmptyList2;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            m5641e();
        }
        if (!(this.publicSuffixListBytes != null)) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = domainLabels.size();
        byte[][] bArr = new byte[size][];
        for (int i4 = 0; i4 < size; i4++) {
            String str3 = (String) domainLabels.get(i4);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            if (str3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = str3.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            bArr[i4] = bytes;
        }
        int i5 = 0;
        while (true) {
            str = null;
            if (i5 >= size) {
                strM5644b = null;
                break;
            }
            Companion companion = INSTANCE;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
            }
            strM5644b = companion.m5644b(bArr2, bArr, i5);
            if (strM5644b != null) {
                break;
            }
            i5++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i6 = 0; i6 < length; i6++) {
                bArr3[i6] = f5114e;
                Companion companion2 = INSTANCE;
                byte[] bArr4 = this.publicSuffixListBytes;
                if (bArr4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                }
                String strM5644b2 = companion2.m5644b(bArr4, bArr3, i6);
                if (strM5644b2 != null) {
                    str2 = strM5644b2;
                    break;
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int i7 = size - 1;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    break;
                }
                Companion companion3 = INSTANCE;
                byte[] bArr5 = this.publicSuffixExceptionListBytes;
                if (bArr5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("publicSuffixExceptionListBytes");
                }
                String strM5644b3 = companion3.m5644b(bArr5, bArr, i8);
                if (strM5644b3 != null) {
                    str = strM5644b3;
                    break;
                }
                i8++;
            }
        }
        if (str != null) {
            return StringsKt__StringsKt.split$default((CharSequence) ('!' + str), new char[]{'.'}, false, 0, 6, (Object) null);
        }
        if (strM5644b == null && str2 == null) {
            return f5115f;
        }
        if (strM5644b == null || (listEmptyList = StringsKt__StringsKt.split$default((CharSequence) strM5644b, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        if (str2 == null || (listEmptyList2 = StringsKt__StringsKt.split$default((CharSequence) str2, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        return listEmptyList.size() > listEmptyList2.size() ? listEmptyList : listEmptyList2;
    }

    /* renamed from: c */
    public final String m5639c(String domain) throws InterruptedException {
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        Intrinsics.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        List listM5642f = m5642f(unicodeDomain);
        List listM5638b = m5638b(listM5642f);
        if (listM5642f.size() == listM5638b.size() && ((String) listM5638b.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM5638b.get(0)).charAt(0) == '!') {
            size = listM5642f.size();
            size2 = listM5638b.size();
        } else {
            size = listM5642f.size();
            size2 = listM5638b.size() + 1;
        }
        return SequencesKt___SequencesKt.joinToString$default(SequencesKt___SequencesKt.drop(CollectionsKt___CollectionsKt.asSequence(m5642f(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    /* renamed from: d */
    public final void m5640d() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        BufferedSource bufferedSourceBuffer = Okio.buffer(new GzipSource(Okio.source(resourceAsStream)));
        try {
            byte[] byteArray = bufferedSourceBuffer.readByteArray(bufferedSourceBuffer.readInt());
            byte[] byteArray2 = bufferedSourceBuffer.readByteArray(bufferedSourceBuffer.readInt());
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(bufferedSourceBuffer, null);
            synchronized (this) {
                Intrinsics.checkNotNull(byteArray);
                this.publicSuffixListBytes = byteArray;
                Intrinsics.checkNotNull(byteArray2);
                this.publicSuffixExceptionListBytes = byteArray2;
            }
            this.readCompleteLatch.countDown();
        } finally {
        }
    }

    /* renamed from: e */
    public final void m5641e() {
        boolean z3 = false;
        while (true) {
            try {
                try {
                    m5640d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z3 = true;
                } catch (IOException e4) {
                    C0021k.f39c.m71g().m64j("Failed to read public suffix list", 5, e4);
                    if (z3) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: f */
    public final List m5642f(String domain) {
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) domain, new char[]{'.'}, false, 0, 6, (Object) null);
        return Intrinsics.areEqual((String) CollectionsKt___CollectionsKt.last(listSplit$default), "") ? CollectionsKt___CollectionsKt.dropLast(listSplit$default, 1) : listSplit$default;
    }
}
