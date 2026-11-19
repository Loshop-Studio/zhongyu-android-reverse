package p073h4;

import android.content.Context;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.compose.material3.AbstractC1923c;
import androidx.core.view.PointerIconCompat;
import coil3.network.C3322k;
import coil3.network.C3324m;
import com.blankj.utilcode.util.RunnableC3378a;
import com.google.gson.JsonParseException;
import com.tencent.bugly.proguard.C4150z0;
import com.zykj.mistake.R;
import com.zykj.mistake.feature.ask.C4515c0;
import com.zykj.mistake.feature.ask.C4534m;
import com.zykj.mistake.feature.ask.C4548x;
import com.zykj.mistake.feature.ask.MistakeAskMaterialContract$MaterialType;
import com.zykj.mistake.feature.ask.MistakeAskMaterialContract$SourceType;
import com.zykj.mistake.feature.notebook.detail.C4846o0;
import com.zykj.mistake.feature.notebook.detail.C4849o3;
import com.zykj.mistake.network.ThrowableHandler$ResponeThrowable;
import com.zykj.mistake.network.ThrowableHandler$ServerException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.AbstractC5810y;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import kotlin.text.AbstractC5862w;
import kotlin.time.DurationUnit;
import kotlinx.serialization.json.internal.C6031l;
import okhttp3.Protocol;
import okio.BufferedSink;
import okio.BufferedSource;
import org.json.JSONException;
import p045d6.C5436l;
import p045d6.C5438n;
import p124n6.C6216a;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p198x4.AbstractC6748a;
import p204y1.AbstractC6768a;
import retrofit2.HttpException;

/* renamed from: h4.a */
/* loaded from: classes3.dex */
public abstract class AbstractC5625a {

    /* renamed from: a */
    public static Object f8756a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r32v0, types: [r6.c] */
    /* JADX WARN: Type inference failed for: r33v0, types: [r6.c] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* renamed from: a */
    public static void m4941a(ListBuilder listBuilder, MistakeAskMaterialContract$MaterialType mistakeAskMaterialContract$MaterialType, ArrayList arrayList, boolean z8, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2) {
        int i;
        int i8;
        ?? M5286y;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        boolean z9 = false;
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            int i11 = i10 + 1;
            int i12 = i9 + 1;
            if (i9 < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            C4846o0 c4846o0 = (C4846o0) obj;
            Iterable iterable = (Iterable) interfaceC6471c.invoke(c4846o0);
            ?? arrayList3 = new ArrayList();
            for (Object obj2 : iterable) {
                if (!AbstractC5855p.m5382P((String) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            int i13 = AbstractC6748a.f11417a[c4846o0.f7216b.ordinal()];
            if (i13 == 1) {
                i = size;
                i8 = i11;
                if (arrayList3.isEmpty()) {
                    M5286y = EmptyList.INSTANCE;
                } else {
                    M5286y = AbstractC5806u.m5286y(new C4548x(mistakeAskMaterialContract$MaterialType.name() + "_" + i9 + "_text", c4846o0.f7215a, MistakeAskMaterialContract$SourceType.TEXT, (String) null, (String) null, new C4515c0(c4846o0.f7215a, arrayList3, (List) interfaceC6471c2.invoke(c4846o0), mistakeAskMaterialContract$MaterialType == MistakeAskMaterialContract$MaterialType.ORIGINAL_ANSWER, z8), 24));
                    AbstractC5810y.m5291S(M5286y, arrayList2);
                    i9 = i12;
                    size = i;
                    i10 = i8;
                    z9 = false;
                }
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ArrayList arrayList4 = new ArrayList();
                int size2 = arrayList3.size();
                ?? r15 = z9;
                while (r15 < size2) {
                    Object obj3 = arrayList3.get(r15);
                    int i14 = r15 + 1;
                    int i15 = size;
                    String str = (String) obj3;
                    int i16 = i11;
                    if (AbstractC5862w.m5409C(str, "http://", z9) || AbstractC5862w.m5409C(str, "https://", z9) || AbstractC5862w.m5409C(str, "/", z9) || AbstractC5862w.m5409C(str, "file://", z9)) {
                        arrayList4.add(obj3);
                    }
                    size = i15;
                    i11 = i16;
                    r15 = i14;
                }
                i = size;
                i8 = i11;
                M5286y = new ArrayList(AbstractC5806u.m5277p(arrayList4, 10));
                int size3 = arrayList4.size();
                boolean z10 = z9;
                int i17 = z10 ? 1 : 0;
                ?? r9 = z10;
                while (i17 < size3) {
                    Object obj4 = arrayList4.get(i17);
                    i17++;
                    int i18 = r9 + 1;
                    if (r9 < 0) {
                        AbstractC5806u.m5258L();
                        throw null;
                    }
                    M5286y.add(new C4548x(mistakeAskMaterialContract$MaterialType.name() + "_" + i9 + "_" + r9, c4846o0.f7215a, MistakeAskMaterialContract$SourceType.IMAGE, (String) obj4, (String) null, (C4515c0) null, 48));
                    r9 = i18;
                }
            }
            AbstractC5810y.m5291S(M5286y, arrayList2);
            i9 = i12;
            size = i;
            i10 = i8;
            z9 = false;
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        listBuilder.add(new C4534m(mistakeAskMaterialContract$MaterialType, arrayList2));
    }

    /* renamed from: b */
    public static void m4942b(ListBuilder listBuilder, MistakeAskMaterialContract$MaterialType mistakeAskMaterialContract$MaterialType, List list, InterfaceC6473e interfaceC6473e) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i8 = i + 1;
            C4548x c4548x = null;
            if (i < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            C4849o3 c4849o3 = (C4849o3) obj;
            String str = c4849o3.f7231b;
            String str2 = !AbstractC5855p.m5382P(str) ? str : null;
            if (str2 != null) {
                c4548x = new C4548x(mistakeAskMaterialContract$MaterialType.name() + "_" + i, (String) interfaceC6473e.invoke(Integer.valueOf(i), c4849o3), MistakeAskMaterialContract$SourceType.IMAGE, str2, (String) null, (C4515c0) null, 48);
            }
            if (c4548x != null) {
                arrayList.add(c4548x);
            }
            i = i8;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        listBuilder.add(new C4534m(mistakeAskMaterialContract$MaterialType, arrayList));
    }

    /* renamed from: c */
    public static final void m4943c(AutoCloseable autoCloseable, Throwable th) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    AbstractC1923c.m1056t(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    AbstractC5806u.m5266e(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else {
                    if (!(autoCloseable instanceof MediaDrm)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaDrm) autoCloseable).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z8 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z8) {
                        executorService.shutdownNow();
                        z8 = true;
                    }
                }
            }
            if (z8) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: d */
    public static final double m4944d(double d9, DurationUnit durationUnit, DurationUnit targetUnit) {
        AbstractC5830k.m5330g(targetUnit, "targetUnit");
        long jConvert = targetUnit.getTimeUnit().convert(1L, durationUnit.getTimeUnit());
        return jConvert > 0 ? d9 * jConvert : d9 / durationUnit.getTimeUnit().convert(1L, targetUnit.getTimeUnit());
    }

    /* renamed from: e */
    public static final long m4945e(long j7, DurationUnit sourceUnit, DurationUnit targetUnit) {
        AbstractC5830k.m5330g(sourceUnit, "sourceUnit");
        AbstractC5830k.m5330g(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit().convert(j7, sourceUnit.getTimeUnit());
    }

    /* renamed from: f */
    public static final long m4946f(long j7, DurationUnit sourceUnit, DurationUnit targetUnit) {
        AbstractC5830k.m5330g(sourceUnit, "sourceUnit");
        AbstractC5830k.m5330g(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit().convert(j7, sourceUnit.getTimeUnit());
    }

    /* renamed from: g */
    public static final void m4947g(int i, int i8) {
        if (i <= i8) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i8 + ").");
    }

    /* renamed from: h */
    public static int m4948h(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: i */
    public static Object m4949i() {
        if (f8756a == null) {
            synchronized (AbstractC5625a.class) {
                try {
                    if (f8756a == null) {
                        Object objM4950j = m4950j();
                        f8756a = objM4950j;
                        if (objM4950j != null) {
                            return objM4950j;
                        }
                        if (Looper.getMainLooper() == Looper.myLooper()) {
                            f8756a = m4950j();
                        } else {
                            Handler handler = new Handler(Looper.getMainLooper());
                            synchronized (AbstractC5625a.class) {
                                handler.post(new RunnableC3378a(5));
                                try {
                                    AbstractC5625a.class.wait();
                                } catch (InterruptedException e) {
                                    Log.w("Applications", "Waiting notification from UI thread error.", e);
                                }
                            }
                        }
                    }
                } finally {
                }
            }
        }
        return f8756a;
    }

    /* renamed from: j */
    public static Object m4950j() throws NoSuchMethodException, SecurityException {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
            method.setAccessible(true);
            return method.invoke(null, null);
        } catch (Exception e) {
            Log.w("Applications", "Failed to get ActivityThread from ActivityThread#currentActivityThread. In some case, this method return null in worker thread.", e);
            return null;
        }
    }

    /* renamed from: k */
    public static ThrowableHandler$ResponeThrowable m4951k(Throwable e) {
        AbstractC5830k.m5330g(e, "e");
        if (e instanceof HttpException) {
            ThrowableHandler$ResponeThrowable throwableHandler$ResponeThrowable = new ThrowableHandler$ResponeThrowable(e, PointerIconCompat.TYPE_HELP);
            int iCode = ((HttpException) e).code();
            if (iCode == 403 || iCode == 404 || iCode == 408 || iCode == 504 || iCode == 500 || iCode == 502 || iCode == 503) {
                throwableHandler$ResponeThrowable.setMessage(AbstractC5626b.f8757a.getString(R.string.tips_network_err));
                return throwableHandler$ResponeThrowable;
            }
            if (iCode == 401) {
                throwableHandler$ResponeThrowable.setMessage(AbstractC5626b.f8757a.getString(R.string.login_not_authenticated));
                return throwableHandler$ResponeThrowable;
            }
            throwableHandler$ResponeThrowable.setMessage(AbstractC5626b.f8757a.getString(R.string.tips_network_err));
            return throwableHandler$ResponeThrowable;
        }
        if (e instanceof ThrowableHandler$ServerException) {
            ThrowableHandler$ServerException throwableHandler$ServerException = (ThrowableHandler$ServerException) e;
            ThrowableHandler$ResponeThrowable throwableHandler$ResponeThrowable2 = new ThrowableHandler$ResponeThrowable(e, throwableHandler$ServerException.getCode());
            throwableHandler$ResponeThrowable2.setMessage(throwableHandler$ServerException.getMessage());
            return throwableHandler$ResponeThrowable2;
        }
        if ((e instanceof JsonParseException) || (e instanceof JSONException)) {
            ThrowableHandler$ResponeThrowable throwableHandler$ResponeThrowable3 = new ThrowableHandler$ResponeThrowable(e, PointerIconCompat.TYPE_CONTEXT_MENU);
            throwableHandler$ResponeThrowable3.setMessage(AbstractC5626b.f8757a.getString(R.string.tips_analyze_err));
            return throwableHandler$ResponeThrowable3;
        }
        if ((e instanceof ConnectException) || (e instanceof UnknownHostException) || (e instanceof NoRouteToHostException) || (e instanceof SocketException) || ((e instanceof IOException) && !(e instanceof SocketTimeoutException))) {
            ThrowableHandler$ResponeThrowable throwableHandler$ResponeThrowable4 = new ThrowableHandler$ResponeThrowable(e, PointerIconCompat.TYPE_HAND);
            throwableHandler$ResponeThrowable4.setMessage(AbstractC5626b.f8757a.getString(R.string.tips_network_err));
            return throwableHandler$ResponeThrowable4;
        }
        if (e instanceof SSLHandshakeException) {
            ThrowableHandler$ResponeThrowable throwableHandler$ResponeThrowable5 = new ThrowableHandler$ResponeThrowable(e, 1005);
            throwableHandler$ResponeThrowable5.setMessage(AbstractC5626b.f8757a.getString(R.string.tips_authorization_err));
            return throwableHandler$ResponeThrowable5;
        }
        if (e instanceof SocketTimeoutException) {
            ThrowableHandler$ResponeThrowable throwableHandler$ResponeThrowable6 = new ThrowableHandler$ResponeThrowable(e, 1005);
            throwableHandler$ResponeThrowable6.setMessage(AbstractC5626b.f8757a.getString(R.string.tips_time_out_err));
            return throwableHandler$ResponeThrowable6;
        }
        ThrowableHandler$ResponeThrowable throwableHandler$ResponeThrowable7 = new ThrowableHandler$ResponeThrowable(e, 1000);
        throwableHandler$ResponeThrowable7.setMessage(AbstractC5626b.f8757a.getString(R.string.tips_unknown_err));
        return throwableHandler$ResponeThrowable7;
    }

    /* renamed from: l */
    public static C6031l m4952l(String statusLine) throws ProtocolException, NumberFormatException {
        Protocol protocol;
        int i;
        String strSubstring;
        AbstractC5830k.m5330g(statusLine, "statusLine");
        if (AbstractC5862w.m5409C(statusLine, "HTTP/1.", false)) {
            i = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int iCharAt = statusLine.charAt(7) - '0';
            if (iCharAt == 0) {
                protocol = Protocol.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                protocol = Protocol.HTTP_1_1;
            }
        } else {
            if (!AbstractC5862w.m5409C(statusLine, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            protocol = Protocol.HTTP_1_0;
            i = 4;
        }
        int i8 = i + 3;
        if (statusLine.length() < i8) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        try {
            String strSubstring2 = statusLine.substring(i, i8);
            AbstractC5830k.m5329f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            int i9 = Integer.parseInt(strSubstring2);
            if (statusLine.length() <= i8) {
                strSubstring = "";
            } else {
                if (statusLine.charAt(i8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                strSubstring = statusLine.substring(i + 4);
                AbstractC5830k.m5329f(strSubstring, "this as java.lang.String).substring(startIndex)");
            }
            return new C6031l(protocol, i9, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
    }

    /* renamed from: m */
    public static C3324m m4953m(BufferedSource bufferedSource) throws NumberFormatException, IOException {
        int i = Integer.parseInt(bufferedSource.readUtf8LineStrict());
        long j7 = Long.parseLong(bufferedSource.readUtf8LineStrict());
        long j8 = Long.parseLong(bufferedSource.readUtf8LineStrict());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i8 = Integer.parseInt(bufferedSource.readUtf8LineStrict());
        for (int i9 = 0; i9 < i8; i9++) {
            String utf8LineStrict = bufferedSource.readUtf8LineStrict();
            int iM5379M = AbstractC5855p.m5379M(utf8LineStrict, ':', 0, 6);
            if (iM5379M == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(utf8LineStrict).toString());
            }
            String strSubstring = utf8LineStrict.substring(0, iM5379M);
            AbstractC5830k.m5329f(strSubstring, "substring(...)");
            String string = AbstractC5855p.m5403k0(strSubstring).toString();
            String strSubstring2 = utf8LineStrict.substring(iM5379M + 1);
            AbstractC5830k.m5329f(strSubstring2, "substring(...)");
            String lowerCase = string.toLowerCase(Locale.ROOT);
            AbstractC5830k.m5329f(lowerCase, "toLowerCase(...)");
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(strSubstring2);
        }
        return new C3324m(i, j7, j8, new C3322k(AbstractC5785e0.m5156J(linkedHashMap)), null, null);
    }

    /* renamed from: n */
    public static int m4954n(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    /* renamed from: o */
    public static void m4955o(String str, InterfaceC6469a interfaceC6469a) {
        C4150z0 c4150z0 = new C4150z0(interfaceC6469a, 2);
        c4150z0.setName(str);
        c4150z0.start();
    }

    /* renamed from: p */
    public static void m4956p(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* renamed from: q */
    public static final C6216a m4957q(File file) {
        int length;
        List list;
        int iM5379M;
        String path = file.getPath();
        AbstractC5830k.m5327d(path);
        char c = File.separatorChar;
        int iM5379M2 = AbstractC5855p.m5379M(path, c, 0, 4);
        if (iM5379M2 != 0) {
            length = (iM5379M2 <= 0 || path.charAt(iM5379M2 + (-1)) != ':') ? (iM5379M2 == -1 && path.length() > 0 && AbstractC6768a.m6446k(path.charAt(AbstractC5855p.m5376J(path)), ':', false)) ? path.length() : 0 : iM5379M2 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c || (iM5379M = AbstractC5855p.m5379M(path, c, 2, 4)) < 0) {
            length = 1;
        } else {
            int iM5379M3 = AbstractC5855p.m5379M(path, c, iM5379M + 1, 4);
            length = iM5379M3 >= 0 ? iM5379M3 + 1 : path.length();
        }
        String strSubstring = path.substring(0, length);
        AbstractC5830k.m5329f(strSubstring, "substring(...)");
        String strSubstring2 = path.substring(length);
        AbstractC5830k.m5329f(strSubstring2, "substring(...)");
        if (strSubstring2.length() == 0) {
            list = EmptyList.INSTANCE;
        } else {
            List listM5393a0 = AbstractC5855p.m5393a0(strSubstring2, new char[]{c});
            ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(listM5393a0, 10));
            Iterator it = listM5393a0.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new C6216a(new File(strSubstring), list);
    }

    /* renamed from: r */
    public static final C5436l m4958r(String str) {
        int i;
        AbstractC6768a.m6440d(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i8 = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC5830k.m5332i(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i9 = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            int i10 = i8 ^ Integer.MIN_VALUE;
            if (Integer.compare(i10, i9 ^ Integer.MIN_VALUE) > 0) {
                if (i9 != 119304647) {
                    return null;
                }
                i9 = (int) (((-1) & 4294967295L) / (4294967295L & 10));
                if (Integer.compare(i10, i9 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i11 = i8 * 10;
            int i12 = iDigit + i11;
            if (Integer.compare(i12 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i++;
            i8 = i12;
        }
        return new C5436l(i8);
    }

    /* renamed from: s */
    public static final C5438n m4959s(String str) {
        int i;
        long j7;
        AbstractC5830k.m5330g(str, "<this>");
        int i8 = 10;
        AbstractC6768a.m6440d(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char cCharAt = str.charAt(0);
        int i9 = 1;
        if (AbstractC5830k.m5332i(cCharAt, 48) >= 0) {
            i = 0;
        } else {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i = 1;
        }
        long j8 = 10;
        long j9 = 0;
        long j10 = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), i8);
            if (iDigit < 0) {
                return null;
            }
            int i10 = length;
            long j11 = j9 ^ Long.MIN_VALUE;
            int i11 = i;
            if (Long.compare(j11, j10 ^ Long.MIN_VALUE) <= 0) {
                j7 = j8;
            } else {
                if (j10 != 512409557603043100L) {
                    return null;
                }
                if (j8 >= 0) {
                    long j12 = (Long.MAX_VALUE / j8) << i9;
                    j7 = j8;
                    j10 = j12 + ((((-1) - (j12 * j8)) ^ Long.MIN_VALUE) >= (j8 ^ Long.MIN_VALUE) ? i9 : 0);
                } else if (Long.MAX_VALUE < (j8 ^ Long.MIN_VALUE)) {
                    j7 = j8;
                    j10 = 0;
                } else {
                    j10 = 1;
                    j7 = j8;
                }
                if (Long.compare(j11, j10 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j13 = j9 * j7;
            long j14 = (iDigit & 4294967295L) + j13;
            if (Long.compare(j14 ^ Long.MIN_VALUE, j13 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i = i11 + 1;
            j9 = j14;
            length = i10;
            j8 = j7;
            i8 = 10;
            i9 = 1;
        }
        return new C5438n(j9);
    }

    /* renamed from: t */
    public static void m4960t(C3324m c3324m, BufferedSink bufferedSink) throws IOException {
        bufferedSink.writeDecimalLong(c3324m.f2024a).writeByte(10);
        bufferedSink.writeDecimalLong(c3324m.f2025b).writeByte(10);
        bufferedSink.writeDecimalLong(c3324m.f2026c).writeByte(10);
        Set<Map.Entry> setEntrySet = c3324m.f2027d.f2019a.entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        bufferedSink.writeDecimalLong(size).writeByte(10);
        for (Map.Entry entry : setEntrySet) {
            Iterator it2 = ((List) entry.getValue()).iterator();
            while (it2.hasNext()) {
                bufferedSink.writeUtf8((String) entry.getKey()).writeUtf8(":").writeUtf8((String) it2.next()).writeByte(10);
            }
        }
    }
}
