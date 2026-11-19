package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C2729k;
import kotlin.collections.C2730l;
import kotlin.collections.C2738t;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import kotlin.jvm.internal.C2772o;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p077d3.C2463j;
import p082e3.C2496v;
import p128o2.C2925r;
import p163v2.C3424a;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';

    @NotNull
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    public static final Companion Companion = new Companion(null);
    private static final byte[] WILDCARD_LABEL = {(byte) 42};
    private static final List<String> PREVAILING_RULE = C2729k.m9135b("*");
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C2764g c2764g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i4) {
            int i5;
            boolean z3;
            int iAnd;
            int iAnd2;
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
                        iAnd = 46;
                        z3 = false;
                    } else {
                        z3 = z4;
                        iAnd = Util.and(bArr2[i11][i12], 255);
                    }
                    iAnd2 = iAnd - Util.and(bArr[i8 + i13], 255);
                    if (iAnd2 != 0) {
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
                        z4 = true;
                        i12 = -1;
                    }
                }
                if (iAnd2 >= 0) {
                    if (iAnd2 <= 0) {
                        int i14 = i10 - i13;
                        int length2 = bArr2[i11].length - i12;
                        int length3 = bArr2.length;
                        for (int i15 = i11 + 1; i15 < length3; i15++) {
                            length2 += bArr2[i15].length;
                        }
                        if (length2 >= i14) {
                            if (length2 <= i14) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                C2769l.m9240d(UTF_8, "UTF_8");
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

        @NotNull
        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }
    }

    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$findMatchingRule$1 */
    final /* synthetic */ class C29441 extends C2772o {
        C29441(PublicSuffixDatabase publicSuffixDatabase) {
            super(publicSuffixDatabase, PublicSuffixDatabase.class, "publicSuffixListBytes", "getPublicSuffixListBytes()[B", 0);
        }

        @Override // kotlin.jvm.internal.C2772o, p019c3.InterfaceC1092i
        @Nullable
        public Object get() {
            return PublicSuffixDatabase.access$getPublicSuffixListBytes$p((PublicSuffixDatabase) this.receiver);
        }

        @Override // kotlin.jvm.internal.C2772o
        public void set(@Nullable Object obj) {
            ((PublicSuffixDatabase) this.receiver).publicSuffixListBytes = (byte[]) obj;
        }
    }

    public static final /* synthetic */ byte[] access$getPublicSuffixListBytes$p(PublicSuffixDatabase publicSuffixDatabase) {
        byte[] bArr = publicSuffixDatabase.publicSuffixListBytes;
        if (bArr == null) {
            C2769l.m9256t("publicSuffixListBytes");
        }
        return bArr;
    }

    private final List<String> findMatchingRule(List<String> list) throws InterruptedException {
        String str;
        String strBinarySearch;
        String str2;
        List<String> listM9139f;
        List<String> listM9139f2;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        if (!(this.publicSuffixListBytes != null)) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i4 = 0; i4 < size; i4++) {
            String str3 = list.get(i4);
            Charset UTF_8 = StandardCharsets.UTF_8;
            C2769l.m9240d(UTF_8, "UTF_8");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = str3.getBytes(UTF_8);
            C2769l.m9240d(bytes, "(this as java.lang.String).getBytes(charset)");
            bArr[i4] = bytes;
        }
        int i5 = 0;
        while (true) {
            str = null;
            if (i5 >= size) {
                strBinarySearch = null;
                break;
            }
            Companion companion = Companion;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                C2769l.m9256t("publicSuffixListBytes");
            }
            strBinarySearch = companion.binarySearch(bArr2, bArr, i5);
            if (strBinarySearch != null) {
                break;
            }
            i5++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i6 = 0; i6 < length; i6++) {
                bArr3[i6] = WILDCARD_LABEL;
                Companion companion2 = Companion;
                byte[] bArr4 = this.publicSuffixListBytes;
                if (bArr4 == null) {
                    C2769l.m9256t("publicSuffixListBytes");
                }
                String strBinarySearch2 = companion2.binarySearch(bArr4, bArr3, i6);
                if (strBinarySearch2 != null) {
                    str2 = strBinarySearch2;
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
                Companion companion3 = Companion;
                byte[] bArr5 = this.publicSuffixExceptionListBytes;
                if (bArr5 == null) {
                    C2769l.m9256t("publicSuffixExceptionListBytes");
                }
                String strBinarySearch3 = companion3.binarySearch(bArr5, bArr, i8);
                if (strBinarySearch3 != null) {
                    str = strBinarySearch3;
                    break;
                }
                i8++;
            }
        }
        if (str != null) {
            return C2496v.m8403q0(EXCEPTION_MARKER + str, new char[]{'.'}, false, 0, 6, null);
        }
        if (strBinarySearch == null && str2 == null) {
            return PREVAILING_RULE;
        }
        if (strBinarySearch == null || (listM9139f = C2496v.m8403q0(strBinarySearch, new char[]{'.'}, false, 0, 6, null)) == null) {
            listM9139f = C2730l.m9139f();
        }
        if (str2 == null || (listM9139f2 = C2496v.m8403q0(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
            listM9139f2 = C2730l.m9139f();
        }
        return listM9139f.size() > listM9139f2.size() ? listM9139f : listM9139f2;
    }

    private final void readTheList() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        BufferedSource bufferedSourceBuffer = Okio.buffer(new GzipSource(Okio.source(resourceAsStream)));
        try {
            byte[] byteArray = bufferedSourceBuffer.readByteArray(bufferedSourceBuffer.readInt());
            byte[] byteArray2 = bufferedSourceBuffer.readByteArray(bufferedSourceBuffer.readInt());
            C2925r c2925r = C2925r.f11415a;
            C3424a.m10441a(bufferedSourceBuffer, null);
            synchronized (this) {
                C2769l.m9239c(byteArray);
                this.publicSuffixListBytes = byteArray;
                C2769l.m9239c(byteArray2);
                this.publicSuffixExceptionListBytes = byteArray2;
            }
            this.readCompleteLatch.countDown();
        } finally {
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z3 = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z3 = true;
                } catch (IOException e4) {
                    Platform.Companion.get().log("Failed to read public suffix list", 5, e4);
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

    private final List<String> splitDomain(String str) {
        List<String> listM8403q0 = C2496v.m8403q0(str, new char[]{'.'}, false, 0, 6, null);
        return C2769l.m9237a((String) C2738t.m9155C(listM8403q0), "") ? C2738t.m9168u(listM8403q0, 1) : listM8403q0;
    }

    @Nullable
    public final String getEffectiveTldPlusOne(@NotNull String domain) throws InterruptedException {
        int size;
        int size2;
        C2769l.m9241e(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        C2769l.m9240d(unicodeDomain, "unicodeDomain");
        List<String> listSplitDomain = splitDomain(unicodeDomain);
        List<String> listFindMatchingRule = findMatchingRule(listSplitDomain);
        if (listSplitDomain.size() == listFindMatchingRule.size() && listFindMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (listFindMatchingRule.get(0).charAt(0) == '!') {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size();
        } else {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size() + 1;
        }
        return C2463j.m8216g(C2463j.m8213d(C2738t.m9167t(splitDomain(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    public final void setListBytes(@NotNull byte[] publicSuffixListBytes, @NotNull byte[] publicSuffixExceptionListBytes) {
        C2769l.m9241e(publicSuffixListBytes, "publicSuffixListBytes");
        C2769l.m9241e(publicSuffixExceptionListBytes, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = publicSuffixListBytes;
        this.publicSuffixExceptionListBytes = publicSuffixExceptionListBytes;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
