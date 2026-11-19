package com.taobao.accs.utl;

import com.taobao.accs.utl.C1788k;

/* renamed from: com.taobao.accs.utl.i */
/* loaded from: classes.dex */
public class C1786i implements C1788k.a {

    /* renamed from: a */
    private final c[] f7835a;

    /* renamed from: b */
    private final int f7836b;

    /* renamed from: c */
    private final String[] f7837c;

    /* renamed from: d */
    private final long[] f7838d;

    /* renamed from: e */
    private int f7839e;

    /* renamed from: com.taobao.accs.utl.i$a */
    static class a implements c {

        /* renamed from: a */
        private final String f7840a;

        public a(String str) {
            this.f7840a = str;
        }

        @Override // com.taobao.accs.utl.C1786i.c
        /* renamed from: a */
        public boolean mo6158a(String str) {
            return (str == null || !str.contains(this.f7840a) || str.contains(" #$%")) ? false : true;
        }
    }

    /* renamed from: com.taobao.accs.utl.i$b */
    private static class b {

        /* renamed from: a */
        private static final C1786i f7841a = new C1786i();

        private b() {
        }
    }

    /* renamed from: com.taobao.accs.utl.i$c */
    interface c {
        /* renamed from: a */
        boolean mo6158a(String str);
    }

    /* renamed from: a */
    public static C1786i m6153a() {
        return b.f7841a;
    }

    /* renamed from: b */
    private void m6155b(String str) {
        int i4 = this.f7839e % 5;
        this.f7837c[i4] = str + " #$%";
        this.f7838d[i4] = System.currentTimeMillis() / 1000;
        this.f7839e = i4 + 1;
    }

    private C1786i() {
        this.f7836b = 5;
        this.f7837c = new String[5];
        this.f7838d = new long[5];
        this.f7839e = 0;
        for (int i4 = 0; i4 < 5; i4++) {
            this.f7837c[i4] = null;
            this.f7838d[i4] = 0;
        }
        this.f7835a = new c[]{new a("send msg time out"), new a("errorCode::"), new a("errorId::"), new a("TNET_JNI_ERR_LOAD_SO_FAIL")};
    }

    @Override // com.taobao.accs.utl.C1788k.a
    /* renamed from: a */
    public void mo6156a(String str) {
        try {
            if (m6154a(str, this.f7835a)) {
                m6155b(str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    private boolean m6154a(String str, c[] cVarArr) {
        for (c cVar : cVarArr) {
            if (cVar.mo6158a(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public String m6157b() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis() / 1000);
        sb.append(" ");
        try {
            int i4 = ((this.f7839e - 1) % 5) + 5;
            for (int i5 = 0; i5 < 5; i5++) {
                int i6 = (i4 - i5) % 5;
                if (this.f7837c[i6] == null) {
                    break;
                }
                sb.append(this.f7838d[i6]);
                sb.append(" ");
                sb.append(this.f7837c[i6]);
                sb.append(" ");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return sb.toString();
    }
}
