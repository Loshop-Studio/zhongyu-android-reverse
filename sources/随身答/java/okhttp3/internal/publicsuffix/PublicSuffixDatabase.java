package okhttp3.internal.publicsuffix;

import androidx.constraintlayout.widget.ConstraintLayout;
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
import kotlin.p161io.CloseableKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import p182m8.AbstractC9045d;
import p266u8.C9734j;

@Metadata(m13412d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0003R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001c"}, m13413d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "", "domain", "c", "(Ljava/lang/String;)Ljava/lang/String;", "", "f", "(Ljava/lang/String;)Ljava/util/List;", "domainLabels", "b", "(Ljava/util/List;)Ljava/util/List;", "", "e", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "", "[B", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "okhttp"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f */
    public static final byte[] f15977f = {42};

    /* renamed from: g */
    public static final List f15978g = CollectionsKt.listOf("*");

    /* renamed from: h */
    public static final PublicSuffixDatabase f15979h = new PublicSuffixDatabase();

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
        public final String m15053b(byte[] bArr, byte[][] bArr2, int i9) {
            int i10;
            int iM14488d;
            boolean z9;
            int iM14488d2;
            int length = bArr.length;
            int i11 = 0;
            while (i11 < length) {
                int i12 = (i11 + length) / 2;
                while (i12 > -1 && bArr[i12] != 10) {
                    i12--;
                }
                int i13 = i12 + 1;
                int i14 = 1;
                while (true) {
                    i10 = i13 + i14;
                    if (bArr[i10] == 10) {
                        break;
                    }
                    i14++;
                }
                int i15 = i10 - i13;
                int i16 = i9;
                boolean z10 = false;
                int i17 = 0;
                int i18 = 0;
                while (true) {
                    if (z10) {
                        iM14488d = 46;
                        z9 = false;
                    } else {
                        boolean z11 = z10;
                        iM14488d = AbstractC9045d.m14488d(bArr2[i16][i17], 255);
                        z9 = z11;
                    }
                    iM14488d2 = iM14488d - AbstractC9045d.m14488d(bArr[i13 + i18], 255);
                    if (iM14488d2 != 0) {
                        break;
                    }
                    i18++;
                    i17++;
                    if (i18 == i15) {
                        break;
                    }
                    if (bArr2[i16].length != i17) {
                        z10 = z9;
                    } else {
                        if (i16 == bArr2.length - 1) {
                            break;
                        }
                        i16++;
                        z10 = true;
                        i17 = -1;
                    }
                }
                if (iM14488d2 >= 0) {
                    if (iM14488d2 <= 0) {
                        int i19 = i15 - i18;
                        int length2 = bArr2[i16].length - i17;
                        int length3 = bArr2.length;
                        for (int i20 = i16 + 1; i20 < length3; i20++) {
                            length2 += bArr2[i20].length;
                        }
                        if (length2 >= i19) {
                            if (length2 <= i19) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                                return new String(bArr, i13, i15, UTF_8);
                            }
                        }
                    }
                    i11 = i10 + 1;
                }
                length = i12;
            }
            return null;
        }

        /* renamed from: c */
        public final PublicSuffixDatabase m15054c() {
            return PublicSuffixDatabase.f15979h;
        }

        public Companion() {
        }
    }

    /* renamed from: b */
    public final List m15047b(List domainLabels) throws InterruptedException {
        String str;
        String strM15053b;
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
            m15050e();
        }
        if (this.publicSuffixListBytes == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = domainLabels.size();
        byte[][] bArr = new byte[size][];
        for (int i9 = 0; i9 < size; i9++) {
            String str3 = (String) domainLabels.get(i9);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = str3.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i9] = bytes;
        }
        int i10 = 0;
        while (true) {
            str = null;
            if (i10 >= size) {
                strM15053b = null;
                break;
            }
            Companion companion = INSTANCE;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                bArr2 = null;
            }
            strM15053b = companion.m15053b(bArr2, bArr, i10);
            if (strM15053b != null) {
                break;
            }
            i10++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i11 = 0; i11 < length; i11++) {
                bArr3[i11] = f15977f;
                Companion companion2 = INSTANCE;
                byte[] bArr4 = this.publicSuffixListBytes;
                if (bArr4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                    bArr4 = null;
                }
                String strM15053b2 = companion2.m15053b(bArr4, bArr3, i11);
                if (strM15053b2 != null) {
                    str2 = strM15053b2;
                    break;
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int i12 = size - 1;
            int i13 = 0;
            while (true) {
                if (i13 >= i12) {
                    break;
                }
                Companion companion3 = INSTANCE;
                byte[] bArr5 = this.publicSuffixExceptionListBytes;
                if (bArr5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                String strM15053b3 = companion3.m15053b(bArr5, bArr, i13);
                if (strM15053b3 != null) {
                    str = strM15053b3;
                    break;
                }
                i13++;
            }
        }
        if (str != null) {
            return StringsKt.split$default((CharSequence) ('!' + str), new char[]{'.'}, false, 0, 6, (Object) null);
        }
        if (strM15053b == null && str2 == null) {
            return f15978g;
        }
        if (strM15053b == null || (listEmptyList = StringsKt.split$default((CharSequence) strM15053b, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (str2 == null || (listEmptyList2 = StringsKt.split$default((CharSequence) str2, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return listEmptyList.size() > listEmptyList2.size() ? listEmptyList : listEmptyList2;
    }

    /* renamed from: c */
    public final String m15048c(String domain) throws InterruptedException {
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        Intrinsics.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        List listM15051f = m15051f(unicodeDomain);
        List listM15047b = m15047b(listM15051f);
        if (listM15051f.size() == listM15047b.size() && ((String) listM15047b.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM15047b.get(0)).charAt(0) == '!') {
            size = listM15051f.size();
            size2 = listM15047b.size();
        } else {
            size = listM15051f.size();
            size2 = listM15047b.size() + 1;
        }
        return SequencesKt.joinToString$default(SequencesKt.drop(CollectionsKt.asSequence(m15051f(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, byte[]] */
    /* renamed from: d */
    public final void m15049d() {
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
                        T t9 = objectRef.element;
                        Intrinsics.checkNotNull(t9);
                        this.publicSuffixListBytes = (byte[]) t9;
                        T t10 = objectRef2.element;
                        Intrinsics.checkNotNull(t10);
                        this.publicSuffixExceptionListBytes = (byte[]) t10;
                    }
                } finally {
                }
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }

    /* renamed from: e */
    public final void m15050e() {
        boolean z9 = false;
        while (true) {
            try {
                try {
                    m15049d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z9 = true;
                } catch (IOException e10) {
                    C9734j.f17200a.m16271g().m16264j("Failed to read public suffix list", 5, e10);
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
    public final List m15051f(String domain) {
        List listSplit$default = StringsKt.split$default((CharSequence) domain, new char[]{'.'}, false, 0, 6, (Object) null);
        return Intrinsics.areEqual(CollectionsKt.last(listSplit$default), "") ? CollectionsKt.dropLast(listSplit$default, 1) : listSplit$default;
    }
}
