package okhttp3.internal.publicsuffix;

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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.p148io.CloseableKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import p028b9.AbstractC5070d;
import p136j9.C7828j;

@Metadata(m13557d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0003R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001c"}, m13558d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "", "domain", "c", "(Ljava/lang/String;)Ljava/lang/String;", "", "f", "(Ljava/lang/String;)Ljava/util/List;", "domainLabels", "b", "(Ljava/util/List;)Ljava/util/List;", "", "e", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "", "[B", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "okhttp"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f */
    public static final byte[] f14850f = {42};

    /* renamed from: g */
    public static final List f14851g = CollectionsKt.listOf("*");

    /* renamed from: h */
    public static final PublicSuffixDatabase f14852h = new PublicSuffixDatabase();

    /* renamed from: a, reason: from kotlin metadata */
    public final AtomicBoolean listRead = new AtomicBoolean(false);

    /* renamed from: b, reason: from kotlin metadata */
    public final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* renamed from: c, reason: from kotlin metadata */
    public byte[] publicSuffixListBytes;

    /* renamed from: d, reason: from kotlin metadata */
    public byte[] publicSuffixExceptionListBytes;

    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final String m14618b(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            int iM2639d;
            boolean z9;
            int iM2639d2;
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
                boolean z10 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z10) {
                        iM2639d = 46;
                        z9 = false;
                    } else {
                        boolean z11 = z10;
                        iM2639d = AbstractC5070d.m2639d(bArr2[i17][i18], 255);
                        z9 = z11;
                    }
                    iM2639d2 = iM2639d - AbstractC5070d.m2639d(bArr[i14 + i19], 255);
                    if (iM2639d2 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (bArr2[i17].length != i18) {
                        z10 = z9;
                    } else {
                        if (i17 == bArr2.length - 1) {
                            break;
                        }
                        i17++;
                        z10 = true;
                        i18 = -1;
                    }
                }
                if (iM2639d2 >= 0) {
                    if (iM2639d2 <= 0) {
                        int i20 = i16 - i19;
                        int length2 = bArr2[i17].length - i18;
                        int length3 = bArr2.length;
                        for (int i21 = i17 + 1; i21 < length3; i21++) {
                            length2 += bArr2[i21].length;
                        }
                        if (length2 >= i20) {
                            if (length2 <= i20) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
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
        public final PublicSuffixDatabase m14619c() {
            return PublicSuffixDatabase.f14852h;
        }

        public Companion() {
        }
    }

    /* renamed from: b */
    public final List m14612b(List domainLabels) throws InterruptedException {
        String str;
        String strM14618b;
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
            m14615e();
        }
        if (this.publicSuffixListBytes == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = domainLabels.size();
        byte[][] bArr = new byte[size][];
        for (int i10 = 0; i10 < size; i10++) {
            String str3 = (String) domainLabels.get(i10);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = str3.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i10] = bytes;
        }
        int i11 = 0;
        while (true) {
            str = null;
            if (i11 >= size) {
                strM14618b = null;
                break;
            }
            Companion companion = INSTANCE;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                bArr2 = null;
            }
            strM14618b = companion.m14618b(bArr2, bArr, i11);
            if (strM14618b != null) {
                break;
            }
            i11++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i12 = 0; i12 < length; i12++) {
                bArr3[i12] = f14850f;
                Companion companion2 = INSTANCE;
                byte[] bArr4 = this.publicSuffixListBytes;
                if (bArr4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                    bArr4 = null;
                }
                String strM14618b2 = companion2.m14618b(bArr4, bArr3, i12);
                if (strM14618b2 != null) {
                    str2 = strM14618b2;
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
                Companion companion3 = INSTANCE;
                byte[] bArr5 = this.publicSuffixExceptionListBytes;
                if (bArr5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                String strM14618b3 = companion3.m14618b(bArr5, bArr, i14);
                if (strM14618b3 != null) {
                    str = strM14618b3;
                    break;
                }
                i14++;
            }
        }
        if (str != null) {
            return StringsKt.split$default((CharSequence) ('!' + str), new char[]{'.'}, false, 0, 6, (Object) null);
        }
        if (strM14618b == null && str2 == null) {
            return f14851g;
        }
        if (strM14618b == null || (listEmptyList = StringsKt.split$default((CharSequence) strM14618b, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (str2 == null || (listEmptyList2 = StringsKt.split$default((CharSequence) str2, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return listEmptyList.size() > listEmptyList2.size() ? listEmptyList : listEmptyList2;
    }

    /* renamed from: c */
    public final String m14613c(String domain) throws InterruptedException {
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        Intrinsics.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        List listM14616f = m14616f(unicodeDomain);
        List listM14612b = m14612b(listM14616f);
        if (listM14616f.size() == listM14612b.size() && ((String) listM14612b.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM14612b.get(0)).charAt(0) == '!') {
            size = listM14616f.size();
            size2 = listM14612b.size();
        } else {
            size = listM14616f.size();
            size2 = listM14612b.size() + 1;
        }
        return SequencesKt.joinToString$default(SequencesKt.drop(CollectionsKt.asSequence(m14616f(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, byte[]] */
    /* renamed from: d */
    public final void m14614d() {
        try {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                BufferedSource bufferedSourceBuffer = Okio.buffer(new GzipSource(Okio.source(resourceAsStream)));
                try {
                    objectRef.element = bufferedSourceBuffer.readByteArray(bufferedSourceBuffer.readInt());
                    objectRef2.element = bufferedSourceBuffer.readByteArray(bufferedSourceBuffer.readInt());
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(bufferedSourceBuffer, null);
                    synchronized (this) {
                        T t10 = objectRef.element;
                        Intrinsics.checkNotNull(t10);
                        this.publicSuffixListBytes = (byte[]) t10;
                        T t11 = objectRef2.element;
                        Intrinsics.checkNotNull(t11);
                        this.publicSuffixExceptionListBytes = (byte[]) t11;
                    }
                } finally {
                }
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }

    /* renamed from: e */
    public final void m14615e() {
        boolean z9 = false;
        while (true) {
            try {
                try {
                    m14614d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z9 = true;
                } catch (IOException e10) {
                    C7828j.f13560a.m13291g().m13284j("Failed to read public suffix list", 5, e10);
                    if (!z9) {
                        return;
                    }
                }
            } finally {
                if (z9) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* renamed from: f */
    public final List m14616f(String domain) {
        List listSplit$default = StringsKt.split$default((CharSequence) domain, new char[]{'.'}, false, 0, 6, (Object) null);
        return Intrinsics.areEqual(CollectionsKt.last(listSplit$default), "") ? CollectionsKt.dropLast(listSplit$default, 1) : listSplit$default;
    }
}
