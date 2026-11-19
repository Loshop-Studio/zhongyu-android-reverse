package p016b0;

import android.os.Handler;
import android.os.Looper;
import coil3.network.AbstractC3315g;
import io.reactivex.exceptions.CompositeException;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.C5823d;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.internal.AbstractC6044y;
import p041d2.C5413c;
import p073h4.AbstractC5625a;
import p084i7.InterfaceC5686b;
import p101k7.AbstractC5762d;
import p101k7.AbstractC5764f;
import p101k7.C5768j;
import p101k7.C5769k;
import p101k7.C5770l;
import p101k7.InterfaceC5765g;
import p125n7.C6232g;
import p133o7.InterfaceC6282f;
import p145q5.InterfaceC6436g;
import p152r6.InterfaceC6471c;
import p159s5.InterfaceC6559b;
import p185v7.AbstractC6675d;
import p207y6.InterfaceC6779c;
import retrofit2.C6509n0;
import retrofit2.adapter.rxjava2.HttpException;

/* renamed from: b0.k0 */
/* loaded from: classes2.dex */
public class C3080k0 implements InterfaceC6436g, InterfaceC6282f {

    /* renamed from: a */
    public boolean f1464a;

    /* renamed from: b */
    public final Object f1465b;

    public C3080k0() {
        this.f1465b = new Handler(Looper.getMainLooper(), new C3078j0());
    }

    /* renamed from: a */
    public void m2031a() {
        this.f1464a = false;
    }

    /* renamed from: b */
    public void mo2032b(byte b6) {
        ((C5413c) this.f1465b).m4807h(String.valueOf(b6));
    }

    /* renamed from: c */
    public void m2033c(char c) {
        C5413c c5413c = (C5413c) this.f1465b;
        c5413c.m4803d(c5413c.f8374b, 1);
        char[] cArr = (char[]) c5413c.f8375c;
        int i = c5413c.f8374b;
        c5413c.f8374b = i + 1;
        cArr[i] = c;
    }

    /* renamed from: d */
    public void mo2034d(int i) {
        ((C5413c) this.f1465b).m4807h(String.valueOf(i));
    }

    /* renamed from: e */
    public void mo2035e(long j7) {
        ((C5413c) this.f1465b).m4807h(String.valueOf(j7));
    }

    /* renamed from: f */
    public void m2036f(String v2) {
        AbstractC5830k.m5330g(v2, "v");
        ((C5413c) this.f1465b).m4807h(v2);
    }

    /* renamed from: g */
    public void mo2037g(short s8) {
        ((C5413c) this.f1465b).m4807h(String.valueOf(s8));
    }

    /* renamed from: h */
    public void mo2038h(String value) {
        byte b6;
        AbstractC5830k.m5330g(value, "value");
        C5413c c5413c = (C5413c) this.f1465b;
        c5413c.m4803d(c5413c.f8374b, value.length() + 2);
        char[] cArr = (char[]) c5413c.f8375c;
        int i = c5413c.f8374b;
        int i8 = i + 1;
        cArr[i] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i8);
        int i9 = length + i8;
        int i10 = i8;
        while (i10 < i9) {
            char c = cArr[i10];
            byte[] bArr = AbstractC6044y.f9603b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = value.length();
                for (int i11 = i10 - i8; i11 < length2; i11++) {
                    c5413c.m4803d(i10, 2);
                    char cCharAt = value.charAt(i11);
                    byte[] bArr2 = AbstractC6044y.f9603b;
                    if (cCharAt >= bArr2.length || (b6 = bArr2[cCharAt]) == 0) {
                        int i12 = i10 + 1;
                        ((char[]) c5413c.f8375c)[i10] = cCharAt;
                        i10 = i12;
                    } else {
                        if (b6 == 1) {
                            String str = AbstractC6044y.f9602a[cCharAt];
                            AbstractC5830k.m5327d(str);
                            c5413c.m4803d(i10, str.length());
                            str.getChars(0, str.length(), (char[]) c5413c.f8375c, i10);
                            int length3 = str.length() + i10;
                            c5413c.f8374b = length3;
                            i10 = length3;
                        } else {
                            char[] cArr2 = (char[]) c5413c.f8375c;
                            cArr2[i10] = '\\';
                            cArr2[i10 + 1] = (char) b6;
                            i10 += 2;
                            c5413c.f8374b = i10;
                        }
                    }
                }
                c5413c.m4803d(i10, 1);
                ((char[]) c5413c.f8375c)[i10] = '\"';
                c5413c.f8374b = i10 + 1;
                return;
            }
            i10++;
        }
        cArr[i9] = '\"';
        c5413c.f8374b = i9 + 1;
    }

    /* renamed from: i */
    public synchronized void m2039i(InterfaceC3072g0 interfaceC3072g0, boolean z8) {
        try {
            if (this.f1464a || z8) {
                ((Handler) this.f1465b).obtainMessage(1, interfaceC3072g0).sendToTarget();
            } else {
                this.f1464a = true;
                interfaceC3072g0.recycle();
                this.f1464a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p133o7.InterfaceC6282f
    /* renamed from: m */
    public void mo2043m(InterfaceC6779c interfaceC6779c, InterfaceC6779c interfaceC6779c2, InterfaceC5686b interfaceC5686b) {
        boolean z8 = this.f1464a;
        InterfaceC5765g descriptor = interfaceC5686b.getDescriptor();
        AbstractC3315g kind = descriptor.getKind();
        if ((kind instanceof AbstractC5762d) || AbstractC5830k.m5325b(kind, C5768j.f9144b)) {
            throw new IllegalArgumentException("Serializer for " + ((C5823d) interfaceC6779c2).m5320e() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (z8 && (AbstractC5830k.m5325b(kind, C5770l.f9147c) || AbstractC5830k.m5325b(kind, C5770l.f9148d) || (kind instanceof AbstractC5764f) || (kind instanceof C5769k))) {
            throw new IllegalArgumentException("Serializer for " + ((C5823d) interfaceC6779c2).m5320e() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
        }
        if (z8) {
            int iMo5101d = descriptor.mo5101d();
            for (int i = 0; i < iMo5101d; i++) {
                String strMo5102e = descriptor.mo5102e(i);
                if (AbstractC5830k.m5325b(strMo5102e, (String) this.f1465b)) {
                    throw new IllegalArgumentException("Polymorphic serializer for " + interfaceC6779c2 + " has property '" + strMo5102e + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                }
            }
        }
    }

    @Override // p145q5.InterfaceC6436g
    public void onComplete() {
        if (this.f1464a) {
            return;
        }
        ((InterfaceC6436g) this.f1465b).onComplete();
    }

    @Override // p145q5.InterfaceC6436g
    public void onError(Throwable th) {
        if (!this.f1464a) {
            ((InterfaceC6436g) this.f1465b).onError(th);
            return;
        }
        AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
        assertionError.initCause(th);
        AbstractC6675d.m6351q(assertionError);
    }

    @Override // p145q5.InterfaceC6436g
    public void onNext(Object obj) {
        C6509n0 c6509n0 = (C6509n0) obj;
        InterfaceC6436g interfaceC6436g = (InterfaceC6436g) this.f1465b;
        if (c6509n0.f10762a.m5899b()) {
            interfaceC6436g.onNext(c6509n0.f10763b);
            return;
        }
        this.f1464a = true;
        HttpException httpException = new HttpException(c6509n0);
        try {
            interfaceC6436g.onError(httpException);
        } catch (Throwable th) {
            AbstractC5625a.m4956p(th);
            AbstractC6675d.m6351q(new CompositeException(httpException, th));
        }
    }

    @Override // p145q5.InterfaceC6436g
    public void onSubscribe(InterfaceC6559b interfaceC6559b) {
        ((InterfaceC6436g) this.f1465b).onSubscribe(interfaceC6559b);
    }

    @Override // p133o7.InterfaceC6282f
    /* renamed from: q */
    public void mo2045q(InterfaceC6779c kClass, InterfaceC6471c interfaceC6471c) {
        AbstractC5830k.m5330g(kClass, "kClass");
    }

    public C3080k0(C6232g c6232g) {
        this.f1465b = c6232g.f9979e;
        this.f1464a = c6232g.f9981g != ClassDiscriminatorMode.NONE;
    }

    public C3080k0(C5413c c5413c) {
        this.f1465b = c5413c;
        this.f1464a = true;
    }

    public C3080k0(InterfaceC6436g interfaceC6436g) {
        this.f1465b = interfaceC6436g;
    }

    /* renamed from: j */
    public void m2040j() {
    }

    /* renamed from: k */
    public void m2041k() {
    }

    @Override // p133o7.InterfaceC6282f
    /* renamed from: l */
    public void mo2042l(InterfaceC6779c interfaceC6779c, InterfaceC6471c interfaceC6471c) {
    }

    @Override // p133o7.InterfaceC6282f
    /* renamed from: o */
    public void mo2044o(InterfaceC6779c interfaceC6779c, InterfaceC6471c interfaceC6471c) {
    }
}
