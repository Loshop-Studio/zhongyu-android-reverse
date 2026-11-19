package coil3.network;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import coil3.decode.C3274o;
import coil3.disk.C3291i;
import com.zykj.mistake.network.ApiException;
import com.zykj.mistake.network.ThrowableHandler$ResponeThrowable;
import java.io.Closeable;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.AbstractC5835p;
import kotlin.text.AbstractC5855p;
import kotlin.text.AbstractC5862w;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5989p;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import okio.FileSystem;
import okio.Path;
import p008a7.AbstractC0020b;
import p008a7.C0019a;
import p054e7.C5483o;
import p073h4.AbstractC5625a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p169t6.AbstractC6600a;
import p185v7.AbstractC6683l;
import p204y1.AbstractC6768a;

/* renamed from: coil3.network.g */
/* loaded from: classes2.dex */
public abstract class AbstractC3315g {

    /* renamed from: a */
    public final /* synthetic */ int f2004a;

    public /* synthetic */ AbstractC3315g(int i) {
        this.f2004a = i;
    }

    /* renamed from: a */
    public static C3274o m2233a(Path path, FileSystem fileSystem, String str, C3291i c3291i, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            c3291i = null;
        }
        return new C3274o(path, fileSystem, str, c3291i);
    }

    /* renamed from: b */
    public static final long m2234b(String str) throws NumberFormatException {
        DurationUnit durationUnit;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i = C0019a.f57d;
        char cCharAt2 = str.charAt(0);
        int i8 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z8 = i8 > 0 && str.length() > 0 && AbstractC6768a.m6446k(str.charAt(0), '-', false);
        if (length <= i8) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i8) != 'P') {
            throw new IllegalArgumentException();
        }
        int i9 = i8 + 1;
        if (i9 == length) {
            throw new IllegalArgumentException();
        }
        DurationUnit durationUnit2 = null;
        long jM67f = 0;
        boolean z9 = false;
        while (i9 < length) {
            if (str.charAt(i9) != 'T') {
                int i10 = i9;
                while (i10 < str.length() && (('0' <= (cCharAt = str.charAt(i10)) && cCharAt < ':') || AbstractC5855p.m5373G("+-.", cCharAt))) {
                    i10++;
                }
                String strSubstring = str.substring(i9, i10);
                AbstractC5830k.m5329f(strSubstring, "substring(...)");
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i9;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i11 = length2 + 1;
                if (z9) {
                    if (cCharAt3 == 'H') {
                        durationUnit = DurationUnit.HOURS;
                    } else if (cCharAt3 == 'M') {
                        durationUnit = DurationUnit.MINUTES;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        durationUnit = DurationUnit.SECONDS;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    durationUnit = DurationUnit.DAYS;
                }
                if (durationUnit2 != null && durationUnit2.compareTo(durationUnit) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iM5379M = AbstractC5855p.m5379M(strSubstring, '.', 0, 6);
                if (durationUnit != DurationUnit.SECONDS || iM5379M <= 0) {
                    jM67f = C0019a.m67f(jM67f, m2246o(m2242j(strSubstring), durationUnit));
                } else {
                    String strSubstring2 = strSubstring.substring(0, iM5379M);
                    AbstractC5830k.m5329f(strSubstring2, "substring(...)");
                    long jM67f2 = C0019a.m67f(jM67f, m2246o(m2242j(strSubstring2), durationUnit));
                    String strSubstring3 = strSubstring.substring(iM5379M);
                    AbstractC5830k.m5329f(strSubstring3, "substring(...)");
                    double d9 = Double.parseDouble(strSubstring3);
                    double dM4944d = AbstractC5625a.m4944d(d9, durationUnit, DurationUnit.NANOSECONDS);
                    if (Double.isNaN(dM4944d)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    long jM6242r = AbstractC6600a.m6242r(dM4944d);
                    jM67f = C0019a.m67f(jM67f2, (-4611686018426999999L > jM6242r || jM6242r >= 4611686018427000000L) ? m2240h(AbstractC6600a.m6242r(AbstractC5625a.m4944d(d9, durationUnit, DurationUnit.MILLISECONDS))) : m2241i(jM6242r));
                }
                durationUnit2 = durationUnit;
                i9 = i11;
            } else {
                if (z9 || (i9 = i9 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z9 = true;
            }
        }
        return z8 ? C0019a.m69h(jM67f) : jM67f;
    }

    /* renamed from: c */
    public static void m2235c(StringBuilder sb, Object obj, InterfaceC6471c interfaceC6471c) {
        if (interfaceC6471c != null) {
            sb.append((CharSequence) interfaceC6471c.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    /* renamed from: d */
    public static Intent m2236d() {
        Intent intent = new Intent("com.zykj.dialogue.ask");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setDataAndType(Uri.parse("http://www.zykj.dialogue.ask/"), "share/file");
        intent.putExtra("fromOtherApp", true);
        return intent;
    }

    /* renamed from: e */
    public static final void m2237e(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC5806u.m5266e(th, th2);
            }
        }
    }

    /* renamed from: f */
    public static int m2238f(float f, int i, int i8) {
        float fMax = Math.max(Math.min(f, 1.0f), 0.0f);
        return Color.argb(((int) ((Color.alpha(i8) - r0) * fMax)) + Color.alpha(i), ((int) ((Color.red(i8) - r0) * fMax)) + Color.red(i), ((int) ((Color.green(i8) - r0) * fMax)) + Color.green(i), ((int) ((Color.blue(i8) - r5) * fMax)) + Color.blue(i));
    }

    /* renamed from: g */
    public static final long m2239g(long j7) {
        long j8 = (j7 << 1) + 1;
        int i = C0019a.f57d;
        int i8 = AbstractC0020b.f59a;
        return j8;
    }

    /* renamed from: h */
    public static final long m2240h(long j7) {
        return (-4611686018426L > j7 || j7 >= 4611686018427L) ? m2239g(AbstractC5806u.m5275n(j7, -4611686018427387903L, 4611686018427387903L)) : m2241i(j7 * 1000000);
    }

    /* renamed from: i */
    public static final long m2241i(long j7) {
        long j8 = j7 << 1;
        int i = C0019a.f57d;
        int i8 = AbstractC0020b.f59a;
        return j8;
    }

    /* renamed from: j */
    public static final long m2242j(String str) {
        char cCharAt;
        int length = str.length();
        int i = (length <= 0 || !AbstractC5855p.m5373G("+-", str.charAt(0))) ? 0 : 1;
        if (length - i > 16) {
            int i8 = i;
            while (true) {
                if (i < length) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 == '0') {
                        if (i8 == i) {
                            i8++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i++;
                } else if (length - i8 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!AbstractC5862w.m5409C(str, "+", false) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(AbstractC5855p.m5374H(1, str));
    }

    /* renamed from: k */
    public static final boolean m2243k(String method) {
        AbstractC5830k.m5330g(method, "method");
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }

    /* renamed from: m */
    public static final Object m2244m(C5483o c5483o, boolean z8, C5483o c5483o2, InterfaceC6473e interfaceC6473e) {
        Object c5989p;
        Object objM5447O;
        try {
            if (interfaceC6473e instanceof BaseContinuationImpl) {
                AbstractC5835p.m5354c(2, interfaceC6473e);
                c5989p = interfaceC6473e.invoke(c5483o2, c5483o);
            } else {
                c5989p = AbstractC6683l.m6379s(interfaceC6473e, c5483o2, c5483o);
            }
        } catch (DispatchException e) {
            c5483o.m5446N(new C5989p(false, e.getCause()));
            throw e.getCause();
        } catch (Throwable th) {
            c5989p = new C5989p(false, th);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (c5989p == coroutineSingletons || (objM5447O = c5483o.m5447O(c5989p)) == AbstractC6014x.f9521e) {
            return coroutineSingletons;
        }
        c5483o.mo4859c0();
        if (!(objM5447O instanceof C5989p)) {
            return AbstractC6014x.m5624D(objM5447O);
        }
        if (!z8) {
            Throwable th2 = ((C5989p) objM5447O).f9486a;
            if ((th2 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th2).coroutine == c5483o) {
                if (c5989p instanceof C5989p) {
                    throw ((C5989p) c5989p).f9486a;
                }
                return c5989p;
            }
        }
        throw ((C5989p) objM5447O).f9486a;
    }

    /* renamed from: n */
    public static final ApiException m2245n(Throwable th) {
        if (th instanceof ApiException) {
            return (ApiException) th;
        }
        ThrowableHandler$ResponeThrowable throwableHandler$ResponeThrowableM4951k = AbstractC5625a.m4951k(th);
        int code = throwableHandler$ResponeThrowableM4951k.getCode();
        String message = throwableHandler$ResponeThrowableM4951k.getMessage();
        if (message == null) {
            message = "";
        }
        return new ApiException(code, message);
    }

    /* renamed from: o */
    public static final long m2246o(long j7, DurationUnit unit) {
        AbstractC5830k.m5330g(unit, "unit");
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        long jM4946f = AbstractC5625a.m4946f(4611686018426999999L, durationUnit, unit);
        return ((-jM4946f) > j7 || j7 > jM4946f) ? m2239g(AbstractC5806u.m5275n(AbstractC5625a.m4945e(j7, unit, DurationUnit.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : m2241i(AbstractC5625a.m4946f(j7, unit, durationUnit));
    }

    public int hashCode() {
        switch (this.f2004a) {
            case 7:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    /* renamed from: l */
    public abstract void mo2247l(String str);

    public String toString() {
        switch (this.f2004a) {
            case 7:
                String strM5320e = AbstractC5832m.m5340a(getClass()).m5320e();
                AbstractC5830k.m5327d(strM5320e);
                return strM5320e;
            default:
                return super.toString();
        }
    }
}
