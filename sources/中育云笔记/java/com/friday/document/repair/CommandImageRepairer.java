package com.friday.document.repair;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox、文件流。

import cd.AbstractC5423b;
import com.blankj.utilcode.util.FileIOUtils;
import com.friday.common.dao.ResourceDao;
import com.friday.common.entity.FileEntity;
import com.friday.common.entity.ResourceEntity;
import com.friday.common.helper.C5962b;
import com.friday.document.repair.CommandImageRepairer;
import java.io.File;
import java.util.List;
import je.AbstractC9746z;
import je.C9742v;
import je.C9743w;
import je.C9745y;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9979u;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p310qd.AbstractC10819z;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class CommandImageRepairer {

    /* renamed from: a */
    public static final CommandImageRepairer f6666a = new CommandImageRepairer();

    /* renamed from: b */
    public static final InterfaceC10773d f6667b = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: r2.a
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return CommandImageRepairer.m5567h();
        }
    });

    /* renamed from: c */
    public static final int f6668c = 8;

    /* renamed from: com.friday.document.repair.CommandImageRepairer$a */
    public static final class C5990a {

        /* renamed from: a */
        public final String f6669a;

        /* renamed from: b */
        public final ResourceEntity f6670b;

        public C5990a(String localPath, ResourceEntity resource) {
            AbstractC9979u.m20294g(localPath, "localPath");
            AbstractC9979u.m20294g(resource, "resource");
            this.f6669a = localPath;
            this.f6670b = resource;
        }

        /* renamed from: a */
        public final String m5577a() {
            return this.f6669a;
        }

        /* renamed from: b */
        public final ResourceEntity m5578b() {
            return this.f6670b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5990a)) {
                return false;
            }
            C5990a c5990a = (C5990a) obj;
            return AbstractC9979u.m20289b(this.f6669a, c5990a.f6669a) && AbstractC9979u.m20289b(this.f6670b, c5990a.f6670b);
        }

        public int hashCode() {
            return (this.f6669a.hashCode() * 31) + this.f6670b.hashCode();
        }

        public String toString() {
            return "MissingImageTarget(localPath=" + this.f6669a + ", resource=" + this.f6670b + ")";
        }
    }

    /* renamed from: h */
    public static final C9742v m5567h() {
        return new C9742v();
    }

    /* renamed from: j */
    public static final boolean m5568j(File file) {
        return file.isDirectory() && file.getName().length() == 36;
    }

    /* renamed from: d */
    public final void m5569d(File file, String str, List list) {
        if (new File(file, "res/image/" + str).exists() || list.contains(str)) {
            return;
        }
        list.add(str);
    }

    /* renamed from: e */
    public final C9742v m5570e() {
        return (C9742v) f6667b.getValue();
    }

    /* renamed from: f */
    public final boolean m5571f(String str) {
        return AbstractC10819z.m23228A(str, "jpg", true) || AbstractC10819z.m23228A(str, "png", true) || AbstractC10819z.m23228A(str, "webp", true);
    }

    /* renamed from: g */
    public final boolean m5572g(ResourceEntity resourceEntity, File file, String str, String str2) {
        if (AbstractC9979u.m20289b(resourceEntity.getPageName(), file.getAbsolutePath())) {
            if (AbstractC9979u.m20289b(resourceEntity.getId(), str2)) {
                return true;
            }
            if (AbstractC10819z.m23229B(resourceEntity.getId(), MqttTopic.TOPIC_LEVEL_SEPARATOR + str, false, 2, null)) {
                return true;
            }
            if (AbstractC10819z.m23229B(resourceEntity.getId(), "\\" + str, false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a4 -> B:27:0x00a7). Please report as a decompilation issue!!! */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5573i(com.friday.common.entity.FileEntity r11, java.util.List r12, com.friday.common.dao.ResourceDao r13, vc.InterfaceC11588c r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.friday.document.repair.CommandImageRepairer$repairMissingCommandImages$1
            if (r0 == 0) goto L13
            r0 = r14
            com.friday.document.repair.CommandImageRepairer$repairMissingCommandImages$1 r0 = (com.friday.document.repair.CommandImageRepairer$repairMissingCommandImages$1) r0
            int r1 = r0.f6681m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6681m = r1
            goto L18
        L13:
            com.friday.document.repair.CommandImageRepairer$repairMissingCommandImages$1 r0 = new com.friday.document.repair.CommandImageRepairer$repairMissingCommandImages$1
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f6679k
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f6681m
            r3 = 1
            if (r2 == 0) goto L51
            if (r2 != r3) goto L49
            int r11 = r0.f6678j
            int r12 = r0.f6677i
            java.lang.Object r13 = r0.f6676h
            java.io.File r13 = (java.io.File) r13
            java.lang.Object r13 = r0.f6675g
            java.io.File[] r13 = (java.io.File[]) r13
            java.lang.Object r2 = r0.f6674f
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r4 = r0.f6673e
            com.friday.common.dao.ResourceDao r4 = (com.friday.common.dao.ResourceDao) r4
            java.lang.Object r5 = r0.f6672d
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r0.f6671c
            com.friday.common.entity.FileEntity r6 = (com.friday.common.entity.FileEntity) r6
            kotlin.AbstractC9924b.m20071b(r14)
            r9 = r0
            r8 = r4
            r7 = r5
            r5 = r6
            goto La7
        L49:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L51:
            kotlin.AbstractC9924b.m20071b(r14)
            java.io.File r14 = new java.io.File
            java.lang.String r2 = r11.getLocalFileUrl()
            r14.<init>(r2)
            boolean r2 = r14.exists()
            if (r2 != 0) goto L66
            qc.q r11 = p309qc.C10786q.f26013a
            return r11
        L66:
            r2.b r2 = new r2.b
            r2.<init>()
            java.io.File[] r2 = r14.listFiles(r2)
            if (r2 != 0) goto L74
            qc.q r11 = p309qc.C10786q.f26013a
            return r11
        L74:
            int r4 = r2.length
            r5 = 0
            r7 = r12
            r8 = r13
            r9 = r0
            r13 = r2
            r12 = r5
            r5 = r11
            r2 = r14
            r11 = r4
        L7e:
            if (r12 >= r11) goto La9
            r6 = r13[r12]
            kotlin.jvm.internal.AbstractC9979u.m20291d(r6)
            r9.f6671c = r5
            r9.f6672d = r7
            r9.f6673e = r8
            java.lang.Object r14 = p409xc.AbstractC11833h.m26224a(r2)
            r9.f6674f = r14
            r9.f6675g = r13
            java.lang.Object r14 = p409xc.AbstractC11833h.m26224a(r6)
            r9.f6676h = r14
            r9.f6677i = r12
            r9.f6678j = r11
            r9.f6681m = r3
            r4 = r10
            java.lang.Object r14 = r4.m5575l(r5, r6, r7, r8, r9)
            if (r14 != r1) goto La7
            return r1
        La7:
            int r12 = r12 + r3
            goto L7e
        La9:
            qc.q r11 = p309qc.C10786q.f26013a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.repair.CommandImageRepairer.m5573i(com.friday.common.entity.FileEntity, java.util.List, com.friday.common.dao.ResourceDao, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/repair/CommandImageRepairer.smali:537
    }

    /* renamed from: k */
    public final Object m5574k(FileEntity fileEntity, String str, List list, ResourceDao resourceDao, InterfaceC11588c interfaceC11588c) throws Throwable {
        File file = new File(str);
        if (!file.exists()) {
            return C10786q.f26013a;
        }
        Object objM5575l = m5575l(fileEntity, file, list, resourceDao, interfaceC11588c);
        return objM5575l == AbstractC11725a.m25952f() ? objM5575l : C10786q.f26013a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x04ff, code lost:
    
        if (r7.mo5090E(r18, r4) != r5) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0503, code lost:
    
        r8 = r33;
        r0 = r34;
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x05c8, code lost:
    
        if (sd.AbstractC11109f.m24709g(r0, r1, r4) == r5) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0564 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x0503 -> B:126:0x0509). Please report as a decompilation issue!!! */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5575l(com.friday.common.entity.FileEntity r33, java.io.File r34, java.util.List r35, com.friday.common.dao.ResourceDao r36, vc.InterfaceC11588c r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.repair.CommandImageRepairer.m5575l(com.friday.common.entity.FileEntity, java.io.File, java.util.List, com.friday.common.dao.ResourceDao, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/repair/CommandImageRepairer.smali:994
    }

    /* renamed from: m */
    public final void m5576m(String str, String str2) throws Exception {
        String strM5277e = C5962b.f6082a.m5299a().m5277e(str);
        boolean z10 = false;
        Exception e10 = null;
        for (int i10 = 0; i10 < 3; i10++) {
            try {
                C9745y c9745yExecute = m5570e().mo19319b(new C9743w.a().m19608p(strM5277e).m19595b()).execute();
                try {
                    if (c9745yExecute.m19638s()) {
                        AbstractC9746z abstractC9746zM19628e = c9745yExecute.m19628e();
                        if (abstractC9746zM19628e == null) {
                            throw new Exception("Response body为空");
                        }
                        if (FileIOUtils.writeFileFromIS(str2, abstractC9746zM19628e.byteStream())) {
                            z10 = true;
                        }
                    } else {
                        e10 = new Exception("HTTP Code: " + c9745yExecute.m19632j());
                    }
                    C10786q c10786q = C10786q.f26013a;
                    AbstractC5423b.m2902a(c9745yExecute, null);
                } finally {
                }
            } catch (Exception e11) {
                e10 = e11;
            }
            if (z10) {
                break;
            }
            Thread.sleep(1000L);
        }
        if (z10) {
            return;
        }
        if (e10 != null) {
            throw e10;
        }
        throw new Exception("下载失败: " + strM5277e);
    }
}
