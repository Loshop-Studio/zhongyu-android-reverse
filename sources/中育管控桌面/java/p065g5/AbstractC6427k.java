package p065g5;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.SieveCacheKt;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;
import p058f5.AbstractC6379r;
import p058f5.C6356a0;
import p058f5.C6362d0;
import p058f5.C6377p;
import p058f5.C6383v;
import p058f5.C6384w;
import p058f5.InterfaceC6363e;
import p116n5.C7467a;

/* renamed from: g5.k */
/* loaded from: classes4.dex */
public abstract class AbstractC6427k {

    /* renamed from: a */
    public static final TimeZone f8099a;

    /* renamed from: b */
    public static final boolean f8100b;

    /* renamed from: c */
    public static final String f8101c;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        f8099a = timeZone;
        f8100b = false;
        String name = C6356a0.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        f8101c = StringsKt.removeSuffix(StringsKt.removePrefix(name, (CharSequence) "okhttp3."), (CharSequence) "Client");
    }

    /* renamed from: c */
    public static final AbstractC6379r.c m7015c(final AbstractC6379r abstractC6379r) {
        Intrinsics.checkNotNullParameter(abstractC6379r, "<this>");
        return new AbstractC6379r.c() { // from class: g5.i
            @Override // p058f5.AbstractC6379r.c
            /* renamed from: a */
            public final AbstractC6379r mo6793a(InterfaceC6363e interfaceC6363e) {
                return AbstractC6427k.m7016d(abstractC6379r, interfaceC6363e);
            }
        };
    }

    /* renamed from: d */
    public static final AbstractC6379r m7016d(AbstractC6379r abstractC6379r, InterfaceC6363e it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return abstractC6379r;
    }

    /* renamed from: e */
    public static final void m7017e(C6377p c6377p) {
        Intrinsics.checkNotNullParameter(c6377p, "<this>");
        if (f8100b && Thread.holdsLock(c6377p)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c6377p);
        }
    }

    /* renamed from: f */
    public static final boolean m7018f(C6384w c6384w, C6384w other) {
        Intrinsics.checkNotNullParameter(c6384w, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(c6384w.m6823h(), other.m6823h()) && c6384w.m6828m() == other.m6828m() && Intrinsics.areEqual(c6384w.m6832q(), other.m6832q());
    }

    /* renamed from: g */
    public static final int m7019g(String name, long j6, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j6 < 0) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        long millis = unit.toMillis(j6);
        if (millis > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException((name + " too large").toString());
        }
        if (millis != 0 || j6 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small").toString());
    }

    /* renamed from: h */
    public static final void m7020h(Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e6) {
            throw e6;
        } catch (RuntimeException e7) {
            if (!Intrinsics.areEqual(e7.getMessage(), "bio == null")) {
                throw e7;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    public static final boolean m7021i(Source source, int i6, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return m7027o(source, i6, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: j */
    public static final String m7022j(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* renamed from: k */
    public static final long m7023k(C6362d0 c6362d0) {
        Intrinsics.checkNotNullParameter(c6362d0, "<this>");
        String strM6799a = c6362d0.m6670p().m6799a(HttpHeaders.CONTENT_LENGTH);
        if (strM6799a != null) {
            return AbstractC6424h.m7012z(strM6799a, -1L);
        }
        return -1L;
    }

    /* renamed from: l */
    public static final List m7024l(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m7035w(elements);
    }

    /* renamed from: m */
    public static final boolean m7025m(Socket socket, BufferedSource source) throws SocketException {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.exhausted();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* renamed from: n */
    public static final Charset m7026n(BufferedSource bufferedSource, Charset charset) {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int iSelect = bufferedSource.select(AbstractC6424h.m6997k());
        if (iSelect == -1) {
            return charset;
        }
        if (iSelect == 0) {
            return Charsets.UTF_8;
        }
        if (iSelect == 1) {
            return Charsets.UTF_16BE;
        }
        if (iSelect == 2) {
            return Charsets.INSTANCE.UTF32_LE();
        }
        if (iSelect == 3) {
            return Charsets.UTF_16LE;
        }
        if (iSelect == 4) {
            return Charsets.INSTANCE.UTF32_BE();
        }
        throw new AssertionError();
    }

    /* renamed from: o */
    public static final boolean m7027o(Source source, int i6, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = source.getThis$0().getHasDeadline() ? source.getThis$0().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        source.getThis$0().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i6)) + jNanoTime);
        try {
            Buffer buffer = new Buffer();
            while (source.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                buffer.clear();
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.getThis$0().clearDeadline();
                return true;
            }
            source.getThis$0().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.getThis$0().clearDeadline();
                return false;
            }
            source.getThis$0().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.getThis$0().clearDeadline();
            } else {
                source.getThis$0().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
    }

    /* renamed from: p */
    public static final ThreadFactory m7028p(final String name, final boolean z6) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ThreadFactory() { // from class: g5.j
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return AbstractC6427k.m7029q(name, z6, runnable);
            }
        };
    }

    /* renamed from: q */
    public static final Thread m7029q(String str, boolean z6, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z6);
        return thread;
    }

    /* renamed from: r */
    public static final List m7030r(C6383v c6383v) {
        Intrinsics.checkNotNullParameter(c6383v, "<this>");
        IntRange intRangeUntil = RangesKt.until(0, c6383v.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            arrayList.add(new C7467a(c6383v.m6801c(iNextInt), c6383v.m6804g(iNextInt)));
        }
        return arrayList;
    }

    /* renamed from: s */
    public static final C6383v m7031s(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        C6383v.a aVar = new C6383v.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7467a c7467a = (C7467a) it.next();
            aVar.m6809d(c7467a.m8541a().utf8(), c7467a.m8542b().utf8());
        }
        return aVar.m6811f();
    }

    /* renamed from: t */
    public static final String m7032t(C6384w c6384w, boolean z6) {
        String strM6823h;
        Intrinsics.checkNotNullParameter(c6384w, "<this>");
        if (StringsKt.contains$default((CharSequence) c6384w.m6823h(), (CharSequence) ":", false, 2, (Object) null)) {
            strM6823h = '[' + c6384w.m6823h() + ']';
        } else {
            strM6823h = c6384w.m6823h();
        }
        if (!z6 && c6384w.m6828m() == C6384w.f7965j.m6867b(c6384w.m6832q())) {
            return strM6823h;
        }
        return strM6823h + ':' + c6384w.m6828m();
    }

    /* renamed from: u */
    public static /* synthetic */ String m7033u(C6384w c6384w, boolean z6, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z6 = false;
        }
        return m7032t(c6384w, z6);
    }

    /* renamed from: v */
    public static final List m7034v(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        Object[] array = list.toArray();
        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
        List listUnmodifiableList = Collections.unmodifiableList(ArraysKt.asList(array));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
        Intrinsics.checkNotNull(listUnmodifiableList, "null cannot be cast to non-null type kotlin.collections.List<T of okhttp3.internal._UtilJvmKt.toImmutableList>");
        return listUnmodifiableList;
    }

    /* renamed from: w */
    public static final List m7035w(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return CollectionsKt.emptyList();
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        List listUnmodifiableList = Collections.unmodifiableList(ArraysKt.asList((Object[]) objArr.clone()));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }
}
