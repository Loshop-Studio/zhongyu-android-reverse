package org.tensorflow.lite.nnapi;

import org.tensorflow.lite.InterfaceC10587a;
import org.tensorflow.lite.TensorFlowLite;

/* loaded from: classes6.dex */
public class NnApiDelegate implements InterfaceC10587a, AutoCloseable {

    /* renamed from: c */
    public long f25558c;

    /* renamed from: org.tensorflow.lite.nnapi.NnApiDelegate$a */
    public static final class C10589a {

        /* renamed from: a */
        public int f25559a = -1;

        /* renamed from: b */
        public String f25560b = null;

        /* renamed from: c */
        public String f25561c = null;

        /* renamed from: d */
        public String f25562d = null;

        /* renamed from: e */
        public Integer f25563e = null;

        /* renamed from: f */
        public Boolean f25564f = null;

        /* renamed from: g */
        public Boolean f25565g = null;
    }

    public NnApiDelegate(C10589a c10589a) {
        TensorFlowLite.m22400a();
        this.f25558c = createDelegate(c10589a.f25559a, c10589a.f25560b, c10589a.f25561c, c10589a.f25562d, c10589a.f25563e != null ? c10589a.f25563e.intValue() : -1, c10589a.f25564f != null, (c10589a.f25564f == null || c10589a.f25564f.booleanValue()) ? false : true, c10589a.f25565g != null ? c10589a.f25565g.booleanValue() : false);
    }

    private static native long createDelegate(int i10, String str, String str2, String str3, int i11, boolean z10, boolean z11, boolean z12);

    private static native void deleteDelegate(long j10);

    private static native int getNnapiErrno(long j10);

    @Override // java.lang.AutoCloseable
    public void close() {
        long j10 = this.f25558c;
        if (j10 != 0) {
            deleteDelegate(j10);
            this.f25558c = 0L;
        }
    }

    @Override // org.tensorflow.lite.InterfaceC10587a
    /* renamed from: e */
    public long mo22402e() {
        return this.f25558c;
    }

    public NnApiDelegate() {
        this(new C10589a());
    }
}
