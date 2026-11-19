package com.tencent.liteav.basic.license;

import android.content.Context;
import java.io.File;

/* renamed from: com.tencent.liteav.basic.license.c */
/* loaded from: classes4.dex */
public class C6579c extends AbstractRunnableC6577a {

    /* renamed from: b */
    private Context f5475b;

    /* renamed from: c */
    private String f5476c;

    /* renamed from: d */
    private String f5477d;

    /* renamed from: e */
    private String f5478e;

    /* renamed from: f */
    private InterfaceC6578b f5479f;

    /* renamed from: g */
    private long f5480g;

    /* renamed from: h */
    private long f5481h;

    /* renamed from: i */
    private boolean f5482i;

    /* renamed from: j */
    private String f5483j;

    public C6579c(Context context, String str, String str2, String str3, InterfaceC6578b interfaceC6578b, boolean z10, String str4) {
        this.f5475b = context;
        this.f5476c = str;
        this.f5477d = str2;
        this.f5478e = str3;
        this.f5479f = interfaceC6578b;
        this.f5482i = z10;
        this.f5483j = str4;
    }

    /* renamed from: a */
    private void m4986a(Exception exc, int i10) {
        InterfaceC6578b interfaceC6578b = this.f5479f;
        if (interfaceC6578b != null) {
            interfaceC6578b.mo4984a((File) null, exc);
        }
        this.f5479f = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b9 A[Catch: IOException -> 0x0202, TryCatch #13 {IOException -> 0x0202, blocks: (B:115:0x01b4, B:117:0x01b9, B:118:0x01bc, B:120:0x01c3), top: B:167:0x01b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c3 A[Catch: IOException -> 0x0202, TRY_LEAVE, TryCatch #13 {IOException -> 0x0202, blocks: (B:115:0x01b4, B:117:0x01b9, B:118:0x01bc, B:120:0x01c3), top: B:167:0x01b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d9 A[Catch: IOException -> 0x01e8, TryCatch #9 {IOException -> 0x01e8, blocks: (B:129:0x01d4, B:131:0x01d9, B:133:0x01de, B:134:0x01e1, B:136:0x01e5), top: B:165:0x01d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01de A[Catch: IOException -> 0x01e8, TryCatch #9 {IOException -> 0x01e8, blocks: (B:129:0x01d4, B:131:0x01d9, B:133:0x01de, B:134:0x01e1, B:136:0x01e5), top: B:165:0x01d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e5 A[Catch: IOException -> 0x01e8, TRY_LEAVE, TryCatch #9 {IOException -> 0x01e8, blocks: (B:129:0x01d4, B:131:0x01d9, B:133:0x01de, B:134:0x01e1, B:136:0x01e5), top: B:165:0x01d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01f0 A[Catch: IOException -> 0x01ff, TryCatch #16 {IOException -> 0x01ff, blocks: (B:139:0x01eb, B:141:0x01f0, B:143:0x01f5, B:144:0x01f8, B:146:0x01fc), top: B:172:0x01eb }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f5 A[Catch: IOException -> 0x01ff, TryCatch #16 {IOException -> 0x01ff, blocks: (B:139:0x01eb, B:141:0x01f0, B:143:0x01f5, B:144:0x01f8, B:146:0x01fc), top: B:172:0x01eb }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01fc A[Catch: IOException -> 0x01ff, TRY_LEAVE, TryCatch #16 {IOException -> 0x01ff, blocks: (B:139:0x01eb, B:141:0x01f0, B:143:0x01f5, B:144:0x01f8, B:146:0x01fc), top: B:172:0x01eb }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0204 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x015f A[EDGE_INSN: B:183:0x015f->B:91:0x015f BREAK  A[LOOP:0: B:77:0x0124->B:184:0x0124], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce A[Catch: all -> 0x017a, Exception -> 0x017e, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x017e, blocks: (B:49:0x00ce, B:73:0x0115, B:108:0x0186, B:110:0x018a, B:112:0x0198), top: B:164:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012b A[Catch: all -> 0x0153, Exception -> 0x0158, TryCatch #17 {Exception -> 0x0158, all -> 0x0153, blocks: (B:76:0x0122, B:77:0x0124, B:79:0x012b, B:81:0x0132, B:83:0x014b, B:85:0x014f, B:91:0x015f, B:93:0x0166), top: B:176:0x0122 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0166 A[Catch: all -> 0x0153, Exception -> 0x0158, TRY_LEAVE, TryCatch #17 {Exception -> 0x0158, all -> 0x0153, blocks: (B:76:0x0122, B:77:0x0124, B:79:0x012b, B:81:0x0132, B:83:0x014b, B:85:0x014f, B:91:0x015f, B:93:0x0166), top: B:176:0x0122 }] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.basic.license.C6579c.run():void");
    }
}
