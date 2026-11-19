package com.friday.document.sync;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import cd.AbstractC5428g;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ResourceUtils;
import com.blankj.utilcode.util.Utils;
import com.friday.common.dao.FileDao;
import com.friday.common.dao.ResourceDao;
import com.friday.common.entity.FileEntity;
import com.friday.common.entity.ResourceEntity;
import com.friday.common.helper.C5962b;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.taobao.accs.common.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9979u;
import p040c2.InterfaceC5308v0;
import p110d2.InterfaceC8919i;
import p141f2.C9168e;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10819z;
import p330s2.InterfaceC11051a;
import sd.AbstractC11109f;
import sd.C11157r0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class SyncStateOne {

    /* renamed from: a */
    public final InterfaceC11051a f6908a;

    /* renamed from: b */
    public final InterfaceC8919i f6909b;

    /* renamed from: c */
    public final FileDao f6910c;

    /* renamed from: d */
    public final ResourceDao f6911d;

    /* renamed from: e */
    public final InterfaceC5308v0 f6912e;

    /* renamed from: f */
    public final String f6913f;

    /* renamed from: g */
    public final String f6914g;

    /* renamed from: com.friday.document.sync.SyncStateOne$a */
    public static final class C5996a extends TypeToken<ArrayList<String>> {
    }

    public SyncStateOne(InterfaceC11051a service, InterfaceC8919i ezyService, FileDao fileDao, ResourceDao resourceDao, InterfaceC5308v0 imageSafetyDao) {
        AbstractC9979u.m20294g(service, "service");
        AbstractC9979u.m20294g(ezyService, "ezyService");
        AbstractC9979u.m20294g(fileDao, "fileDao");
        AbstractC9979u.m20294g(resourceDao, "resourceDao");
        AbstractC9979u.m20294g(imageSafetyDao, "imageSafetyDao");
        this.f6908a = service;
        this.f6909b = ezyService;
        this.f6910c = fileDao;
        this.f6911d = resourceDao;
        this.f6912e = imageSafetyDao;
        String str = Utils.getApp().getCacheDir() + File.separator + "placeholder.jpg";
        this.f6913f = str;
        if (!FileUtils.isFileExists(str)) {
            ResourceUtils.copyFileFromAssets("placeholder.jpg", str);
        }
        String fileMD5ToString = FileUtils.getFileMD5ToString(str);
        AbstractC9979u.m20293f(fileMD5ToString, "getFileMD5ToString(...)");
        this.f6914g = fileMD5ToString;
    }

    /* renamed from: C */
    public static final CharSequence m5624C(ResourceEntity it) {
        AbstractC9979u.m20294g(it, "it");
        return it.getId();
    }

    /* renamed from: D */
    public static final CharSequence m5625D(ResourceEntity it) {
        AbstractC9979u.m20294g(it, "it");
        return it.getId();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:38|(18:40|(1:42)|45|(1:51)(1:47)|52|273|53|54|267|55|56|261|57|58|281|59|(12:62|263|63|(1:65)(1:68)|69|70|80|(2:82|(1:299)(9:86|(1:88)(1:89)|(1:91)(1:92)|(1:97)(1:96)|(1:99)|(1:104)(1:103)|(1:109)(1:108)|(1:111)(1:112)|113))(1:115)|116|(1:118)(1:119)|120|(2:122|(3:125|126|(2:128|(12:131|132|(3:137|(4:140|(1:297)(3:293|146|298)|294|138)|290)(1:136)|147|289|(2:150|(2:236|286)(3:288|154|(3:157|158|(4:160|161|289|(1:148))(4:162|279|163|(10:166|271|167|168|174|(1:176)(1:177)|178|(1:180)(1:181)|182|(5:186|235|285|289|(1:148))(2:187|(3:190|191|(9:194|23|195|(1:232)(2:199|(4:201|(1:203)(1:204)|205|(4:207|230|289|(1:148))(2:208|(8:211|212|(1:214)(1:216)|215|217|275|218|(7:221|269|222|229|230|289|(1:148))))))|231|233|234|289|(1:148)))))))))|287|237|(1:239)|240|257|258))(2:241|(4:244|245|246|(2:248|(4:251|252|246|(2:253|(3:256|257|258))(0)))(0)))))(2:259|260))|255)(1:43)|44|45|(16:48|51|52|273|53|54|267|55|56|261|57|58|281|59|(0)|255)|47|52|273|53|54|267|55|56|261|57|58|281|59|(0)|255) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:211|212|(1:214)(1:216)|215|217|275|218|(7:221|269|222|229|230|289|(1:148))) */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0ac6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0ac7, code lost:
    
        r11 = r3;
        r21 = r32;
        r15 = r35;
        r9 = r26;
        r20 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x048c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x048d, code lost:
    
        r5 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0490, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0493, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0496, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0497, code lost:
    
        r8 = r35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:134:0x061b, B:137:0x0626], limit reached: 285 */
    /* JADX WARN: Path cross not found for [B:197:0x08f7, B:232:0x0af9], limit reached: 285 */
    /* JADX WARN: Path cross not found for [B:47:0x0414, B:48:0x0417], limit reached: 285 */
    /* JADX WARN: Removed duplicated region for block: B:115:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0a30  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0a39  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0ab5  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0b2c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0b66  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0c25  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0cd6  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0d96  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x047b A[Catch: all -> 0x0480, TryCatch #1 {all -> 0x0480, blocks: (B:63:0x0473, B:65:0x047b, B:69:0x0483), top: B:263:0x0473 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:207:0x094d -> B:230:0x0aec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:221:0x0ab5 -> B:269:0x0abd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:228:0x0acf -> B:229:0x0ad9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:251:0x0cc5 -> B:252:0x0ccc). Please report as a decompilation issue!!! */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5637A(com.friday.common.entity.FileEntity r35, vc.InterfaceC11588c r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.sync.SyncStateOne.m5637A(com.friday.common.entity.FileEntity, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/sync/SyncStateOne.smali:414
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02cb A[LOOP:0: B:47:0x02c5->B:49:0x02cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x073e  */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v89, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v29, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x0861 -> B:108:0x0866). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0514 -> B:70:0x0523). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x052d -> B:72:0x0537). Please report as a decompilation issue!!! */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5638B(java.lang.String r37, java.lang.String r38, vc.InterfaceC11588c r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.sync.SyncStateOne.m5638B(java.lang.String, java.lang.String, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/sync/SyncStateOne.smali:4380
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02cd A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:20:0x00bb, B:96:0x02c5, B:98:0x02cd, B:100:0x02d3), top: B:128:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d2  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5639E(com.friday.common.entity.FileEntity r30, vc.InterfaceC11588c r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.sync.SyncStateOne.m5639E(com.friday.common.entity.FileEntity, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/sync/SyncStateOne.smali:6884
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0171, code lost:
    
        if (r1.mo5090E(r14, r7) == r2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01f5, code lost:
    
        if (r1.mo5109j(r6, r5, r8, r7) != r2) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5640F(com.friday.common.entity.FileEntity r29, java.io.File r30, int r31, java.io.File r32, java.lang.String r33, vc.InterfaceC11588c r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.sync.SyncStateOne.m5640F(com.friday.common.entity.FileEntity, java.io.File, int, java.io.File, java.lang.String, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/sync/SyncStateOne.smali:9142
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0322, code lost:
    
        if (com.friday.common.dao.FileDao.m4898g(r5, r5, r9, false, r8, 4, null) == r3) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0325, code lost:
    
        r3 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0366, code lost:
    
        if (com.friday.common.dao.FileDao.m4896G(r5, r5, r9, false, r8, 4, null) == r3) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fc, code lost:
    
        if (r2.equals("12") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018e, code lost:
    
        if (r5.mo4928a(r9, r4, r8) == r3) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a4, code lost:
    
        if (r2.equals("1") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ab, code lost:
    
        r8.f6915c = r1;
        r8.f6923k = 1;
        r2 = m5643n(r1, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b3, code lost:
    
        if (r2 != r3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e5, code lost:
    
        if (r4.mo4928a(r5, r2, r8) == r3) goto L144;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0228  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5641l(com.friday.common.entity.FileEntity r22, vc.InterfaceC11588c r23) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.sync.SyncStateOne.m5641l(com.friday.common.entity.FileEntity, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/sync/SyncStateOne.smali:10199
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (r2.mo5091H(r4, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0119, code lost:
    
        if (r2.mo5091H(r5, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5642m(com.friday.common.entity.FileEntity r10, com.friday.common.entity.ResourceEntity r11, vc.InterfaceC11588c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.sync.SyncStateOne.m5642m(com.friday.common.entity.FileEntity, com.friday.common.entity.ResourceEntity, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/sync/SyncStateOne.smali:12522
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        if (r11 == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5643n(com.friday.common.entity.FileEntity r10, vc.InterfaceC11588c r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.friday.document.sync.SyncStateOne$doesFileExits$1
            if (r0 == 0) goto L14
            r0 = r11
            com.friday.document.sync.SyncStateOne$doesFileExits$1 r0 = (com.friday.document.sync.SyncStateOne$doesFileExits$1) r0
            int r1 = r0.f6934g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f6934g = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            com.friday.document.sync.SyncStateOne$doesFileExits$1 r0 = new com.friday.document.sync.SyncStateOne$doesFileExits$1
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.f6932e
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r5.f6934g
            r8 = 3
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L52
            if (r1 == r3) goto L4a
            if (r1 == r2) goto L42
            if (r1 != r8) goto L3a
            java.lang.Object r10 = r5.f6931d
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r10 = r5.f6930c
            com.friday.common.entity.FileEntity r10 = (com.friday.common.entity.FileEntity) r10
            kotlin.AbstractC9924b.m20071b(r11)
            goto Lad
        L3a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L42:
            java.lang.Object r10 = r5.f6930c
            com.friday.common.entity.FileEntity r10 = (com.friday.common.entity.FileEntity) r10
            kotlin.AbstractC9924b.m20071b(r11)
            goto L87
        L4a:
            java.lang.Object r10 = r5.f6930c
            com.friday.common.entity.FileEntity r10 = (com.friday.common.entity.FileEntity) r10
            kotlin.AbstractC9924b.m20071b(r11)
            return r11
        L52:
            kotlin.AbstractC9924b.m20071b(r11)
            java.lang.String r11 = r10.getFileType()
            java.lang.String r1 = "12"
            boolean r11 = kotlin.jvm.internal.AbstractC9979u.m20289b(r11, r1)
            if (r11 == 0) goto L71
            java.lang.Object r11 = p409xc.AbstractC11833h.m26224a(r10)
            r5.f6930c = r11
            r5.f6934g = r3
            java.lang.Object r10 = r9.m5651v(r10, r5)
            if (r10 != r0) goto L70
            goto Lac
        L70:
            return r10
        L71:
            com.friday.common.dao.ResourceDao r1 = r9.f6911d
            r11 = r2
            java.lang.String r2 = r10.getFileId()
            r5.f6930c = r10
            r5.f6934g = r11
            r3 = 0
            r6 = 2
            r7 = 0
            java.lang.Object r11 = com.friday.common.dao.ResourceDao.m5077c(r1, r2, r3, r5, r6, r7)
            if (r11 != r0) goto L87
            goto Lac
        L87:
            java.util.List r11 = (java.util.List) r11
            r1 = r11
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lb8
            com.friday.common.dao.FileDao r1 = r9.f6910c
            java.lang.String r2 = r10.getFileId()
            java.lang.Object r10 = p409xc.AbstractC11833h.m26224a(r10)
            r5.f6930c = r10
            java.lang.Object r10 = p409xc.AbstractC11833h.m26224a(r11)
            r5.f6931d = r10
            r5.f6934g = r8
            java.lang.Object r11 = r1.mo4926Y(r2, r5)
            if (r11 != r0) goto Lad
        Lac:
            return r0
        Lad:
            com.friday.common.entity.FileEntity r11 = (com.friday.common.entity.FileEntity) r11
            if (r11 == 0) goto Lb6
            boolean r10 = r11.getCached()
            goto Ld6
        Lb6:
            r10 = 0
            goto Ld6
        Lb8:
            java.lang.String r10 = r10.getLocalFileUrl()
            java.lang.String r11 = java.io.File.separator
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r11)
            java.lang.String r10 = "index.json"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            boolean r10 = com.blankj.utilcode.util.FileUtils.isFileExists(r10)
        Ld6:
            java.lang.Boolean r10 = p409xc.AbstractC11826a.m26206a(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.sync.SyncStateOne.m5643n(com.friday.common.entity.FileEntity, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/sync/SyncStateOne.smali:13229
    }

    /* renamed from: o */
    public final Object m5644o(String str, InterfaceC11588c interfaceC11588c) {
        return AbstractC11109f.m24709g(C11157r0.m24799b(), new SyncStateOne$doesObjectExist$2(str, null), interfaceC11588c);
    }

    /* renamed from: p */
    public final List m5645p(File file) {
        return C9168e.f21413a.m18069c(file);
    }

    /* q reads the legacy page-directory array verbatim, including repeated and missing paths. */
    public final ArrayList m5646q(String str) {
        Object objFromJson = new Gson().fromJson(AbstractC5428g.m2921e(new File(str + File.separator + "index.json"), null, 1, null), new C5996a().getType());
        AbstractC9979u.m20293f(objFromJson, "fromJson(...)");
        return (ArrayList) objFromJson;
    }

    /* renamed from: r */
    public final long m5647r() {
        return C5962b.f6082a.m5299a().m5292t();
    }

    /* renamed from: s */
    public final boolean m5648s(File file, File file2) {
        if (AbstractC10819z.m23230C(file.getName(), "snapshot.bin", true) || AbstractC10819z.m23230C(file.getName(), "screenshot.png", true)) {
            return true;
        }
        String absolutePath = file.getAbsolutePath();
        AbstractC9979u.m20293f(absolutePath, "getAbsolutePath(...)");
        String absolutePath2 = file2.getAbsolutePath();
        AbstractC9979u.m20293f(absolutePath2, "getAbsolutePath(...)");
        String strM23149y0 = AbstractC10793c0.m23149y0(absolutePath, absolutePath2);
        String fileExtension = FileUtils.getFileExtension(file.getAbsolutePath());
        AbstractC9979u.m20293f(fileExtension, "getFileExtension(...)");
        Locale ROOT = Locale.ROOT;
        AbstractC9979u.m20293f(ROOT, "ROOT");
        String lowerCase = fileExtension.toLowerCase(ROOT);
        AbstractC9979u.m20293f(lowerCase, "toLowerCase(...)");
        String str = File.separator;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(Constants.SEND_TYPE_RES);
        sb2.append(str);
        return AbstractC10793c0.m23108U(strM23149y0, sb2.toString(), false, 2, null) && (AbstractC9979u.m20289b(lowerCase, "jpg") || AbstractC9979u.m20289b(lowerCase, "png") || AbstractC9979u.m20289b(lowerCase, "webp"));
    }

    /* renamed from: t */
    public final boolean m5649t() {
        return C5962b.f6082a.m5299a().m5294v();
    }

    /* renamed from: u */
    public final int m5650u(File file) {
        if (AbstractC10819z.m23230C(file.getName(), "screenshot.png", true)) {
            return 2;
        }
        return AbstractC10819z.m23230C(file.getName(), "snapshot.bin", true) ? 1 : 0;
    }

    /* renamed from: v */
    public final Object m5651v(FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        return AbstractC11109f.m24709g(C11157r0.m24799b(), new SyncStateOne$prepareNewNoteForSync$2(fileEntity, this, null), interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0136, code lost:
    
        if (r6.mo5091H(r7, r4) == r5) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0172, code lost:
    
        if (r6.mo5091H(r7, r4) == r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5652w(com.friday.common.entity.FileEntity r18, com.friday.common.entity.ResourceEntity r19, vc.InterfaceC11588c r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.sync.SyncStateOne.m5652w(com.friday.common.entity.FileEntity, com.friday.common.entity.ResourceEntity, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/sync/SyncStateOne.smali:14308
    }

    /* renamed from: x */
    public final boolean m5653x(String str) {
        return AbstractC10793c0.m23108U(str, "_deleted", false, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x02e1, code lost:
    
        if (r3.mo5113o(r4, r5, r6, r8) == r10) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01e4 -> B:50:0x0203). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x026d -> B:18:0x00b0). Please report as a decompilation issue!!! */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5654y(com.friday.common.entity.FileEntity r25, java.io.File r26, java.lang.String r27, vc.InterfaceC11588c r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.sync.SyncStateOne.m5654y(com.friday.common.entity.FileEntity, java.io.File, java.lang.String, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/sync/SyncStateOne.smali:15174
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x048c -> B:94:0x0527). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x0517 -> B:93:0x0520). Please report as a decompilation issue!!! */
    /* renamed from: z */
    public final java.lang.Object m5655z(com.friday.common.helper.OssUploadHelper r28, java.util.List r29, java.lang.String r30, java.util.ArrayList r31, vc.InterfaceC11588c r32) {
        /*
            Method dump skipped, instructions count: 1329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.sync.SyncStateOne.m5655z(com.friday.common.helper.OssUploadHelper, java.util.List, java.lang.String, java.util.ArrayList, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/sync/SyncStateOne.smali:16756
    }
}
