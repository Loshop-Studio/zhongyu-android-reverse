package p169x0;

import android.util.Log;

/* renamed from: x0.n */
/* loaded from: classes.dex */
public abstract class AbstractC3445n {

    /* renamed from: a */
    private static AbstractC3445n f12072a = null;

    /* renamed from: b */
    private static final int f12073b = 20;

    /* renamed from: x0.n$a */
    public static class a extends AbstractC3445n {

        /* renamed from: c */
        private int f12074c;

        public a(int i4) {
            super(i4);
            this.f12074c = i4;
        }

        @Override // p169x0.AbstractC3445n
        /* renamed from: a */
        public void mo10504a(String str, String str2, Throwable... thArr) {
            if (this.f12074c <= 3) {
                if (thArr == null || thArr.length < 1) {
                    Log.d(str, str2);
                } else {
                    Log.d(str, str2, thArr[0]);
                }
            }
        }

        @Override // p169x0.AbstractC3445n
        /* renamed from: b */
        public void mo10505b(String str, String str2, Throwable... thArr) {
            if (this.f12074c <= 6) {
                if (thArr == null || thArr.length < 1) {
                    Log.e(str, str2);
                } else {
                    Log.e(str, str2, thArr[0]);
                }
            }
        }

        @Override // p169x0.AbstractC3445n
        /* renamed from: d */
        public void mo10506d(String str, String str2, Throwable... thArr) {
            if (this.f12074c <= 4) {
                if (thArr == null || thArr.length < 1) {
                    Log.i(str, str2);
                } else {
                    Log.i(str, str2, thArr[0]);
                }
            }
        }

        @Override // p169x0.AbstractC3445n
        /* renamed from: g */
        public void mo10507g(String str, String str2, Throwable... thArr) {
            if (this.f12074c <= 2) {
                if (thArr == null || thArr.length < 1) {
                    Log.v(str, str2);
                } else {
                    Log.v(str, str2, thArr[0]);
                }
            }
        }

        @Override // p169x0.AbstractC3445n
        /* renamed from: h */
        public void mo10508h(String str, String str2, Throwable... thArr) {
            if (this.f12074c <= 5) {
                if (thArr == null || thArr.length < 1) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, thArr[0]);
                }
            }
        }
    }

    public AbstractC3445n(int i4) {
    }

    /* renamed from: c */
    public static synchronized AbstractC3445n m10501c() {
        if (f12072a == null) {
            f12072a = new a(3);
        }
        return f12072a;
    }

    /* renamed from: e */
    public static synchronized void m10502e(AbstractC3445n abstractC3445n) {
        f12072a = abstractC3445n;
    }

    /* renamed from: f */
    public static String m10503f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i4 = f12073b;
        if (length >= i4) {
            sb.append(str.substring(0, i4));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public abstract void mo10504a(String str, String str2, Throwable... thArr);

    /* renamed from: b */
    public abstract void mo10505b(String str, String str2, Throwable... thArr);

    /* renamed from: d */
    public abstract void mo10506d(String str, String str2, Throwable... thArr);

    /* renamed from: g */
    public abstract void mo10507g(String str, String str2, Throwable... thArr);

    /* renamed from: h */
    public abstract void mo10508h(String str, String str2, Throwable... thArr);
}
