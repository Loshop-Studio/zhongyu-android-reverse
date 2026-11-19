package com.taobao.accs.utl;

import com.taobao.accs.utl.C7685k;

/* renamed from: com.taobao.accs.utl.i */
/* loaded from: classes5.dex */
public class C7683i implements C7685k.a {

    /* renamed from: a */
    private final c[] f13233a;

    /* renamed from: b */
    private final int f13234b;

    /* renamed from: c */
    private final String[] f13235c;

    /* renamed from: d */
    private final long[] f13236d;

    /* renamed from: e */
    private int f13237e;

    /* renamed from: com.taobao.accs.utl.i$a */
    public static class a implements c {

        /* renamed from: a */
        private final String f13238a;

        public a(String str) {
            this.f13238a = str;
        }

        @Override // com.taobao.accs.utl.C7683i.c
        /* renamed from: a */
        public boolean mo10184a(String str) {
            return (str == null || !str.contains(this.f13238a) || str.contains(" #$%")) ? false : true;
        }
    }

    /* renamed from: com.taobao.accs.utl.i$b */
    public static class b {

        /* renamed from: a */
        private static final C7683i f13239a = new C7683i();

        private b() {
        }
    }

    /* renamed from: com.taobao.accs.utl.i$c */
    public interface c {
        /* renamed from: a */
        boolean mo10184a(String str);
    }

    /* renamed from: a */
    public static C7683i m10179a() {
        return b.f13239a;
    }

    /* renamed from: b */
    private void m10181b(String str) {
        int i10 = this.f13237e % 5;
        this.f13235c[i10] = str + " #$%";
        this.f13236d[i10] = System.currentTimeMillis() / 1000;
        this.f13237e = i10 + 1;
    }

    private C7683i() {
        this.f13234b = 5;
        this.f13235c = new String[5];
        this.f13236d = new long[5];
        this.f13237e = 0;
        for (int i10 = 0; i10 < 5; i10++) {
            this.f13235c[i10] = null;
            this.f13236d[i10] = 0;
        }
        this.f13233a = new c[]{new a("send msg time out"), new a("errorCode::"), new a("errorId::"), new a("TNET_JNI_ERR_LOAD_SO_FAIL")};
    }

    @Override // com.taobao.accs.utl.C7685k.a
    /* renamed from: a */
    public void mo10182a(String str) {
        try {
            if (m10180a(str, this.f13233a)) {
                m10181b(str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    private boolean m10180a(String str, c[] cVarArr) {
        for (c cVar : cVarArr) {
            if (cVar.mo10184a(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public String m10183b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(System.currentTimeMillis() / 1000);
        sb2.append(" ");
        try {
            int i10 = ((this.f13237e - 1) % 5) + 5;
            for (int i11 = 0; i11 < 5; i11++) {
                int i12 = (i10 - i11) % 5;
                if (this.f13235c[i12] == null) {
                    break;
                }
                sb2.append(this.f13236d[i12]);
                sb2.append(" ");
                sb2.append(this.f13235c[i12]);
                sb2.append(" ");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return sb2.toString();
    }
}
