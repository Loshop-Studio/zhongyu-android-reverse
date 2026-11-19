package com.friday.paint.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.blankj.utilcode.util.ActivityUtils;
import com.friday.common.base.BaseViewModel;
import com.friday.common.dao.FileDao;
import com.friday.common.dao.ResourceDao;
import com.friday.common.dao.UserDao;
import com.friday.common.entity.CreateNoteInput;
import com.friday.common.entity.FileEntity;
import com.friday.common.entity.ImageSafetyEntity;
import com.friday.common.entity.ResourceEntity;
import com.friday.common.helper.C5962b;
import com.friday.common.helper.NotePageOrder;
import com.taobao.accs.common.Constants;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;
import p040c2.InterfaceC5308v0;
import p200j2.InterfaceC9664d;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11608q;
import p379vd.InterfaceC11602k;
import p379vd.InterfaceC11607p;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import sd.AbstractC11109f;
import sd.AbstractC11117h;
import sd.C11157r0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class NewNoteViewModel extends BaseViewModel {

    /* renamed from: b */
    public final FileDao f10306b;

    /* renamed from: c */
    public final ResourceDao f10307c;

    /* renamed from: d */
    public final UserDao f10308d;

    /* renamed from: e */
    public final InterfaceC5308v0 f10309e;

    /* renamed from: f */
    public final InterfaceC9664d f10310f;

    /* renamed from: g */
    public boolean f10311g;

    /* renamed from: h */
    public String f10312h;

    /* renamed from: i */
    public String f10313i;

    /* renamed from: j */
    public String f10314j;

    /* renamed from: k */
    public String f10315k;

    /* renamed from: l */
    public String f10316l;

    /* renamed from: m */
    public final Set f10317m;

    /* renamed from: n */
    public final InterfaceC11602k f10318n;

    /* renamed from: o */
    public final InterfaceC11607p f10319o;

    /* renamed from: p */
    public final long f10320p;

    /* renamed from: q */
    public final MutableLiveData f10321q;

    /* renamed from: r */
    public final MutableLiveData f10322r;

    /* renamed from: s */
    public final MutableLiveData f10323s;

    /* renamed from: t */
    public final LiveData f10324t;

    /* renamed from: u */
    public final MutableLiveData f10325u;

    /* renamed from: v */
    public final MutableLiveData f10326v;

    /* renamed from: w */
    public final InterfaceC11602k f10327w;

    /* renamed from: x */
    public final InterfaceC11607p f10328x;

    /* renamed from: y */
    public final InterfaceC11602k f10329y;

    /* renamed from: z */
    public final InterfaceC11607p f10330z;

    public NewNoteViewModel(FileDao fileDao, ResourceDao resourceDao, UserDao userDao, InterfaceC5308v0 imageSafetyDao, InterfaceC9664d fileManager) {
        AbstractC9979u.m20294g(fileDao, "fileDao");
        AbstractC9979u.m20294g(resourceDao, "resourceDao");
        AbstractC9979u.m20294g(userDao, "userDao");
        AbstractC9979u.m20294g(imageSafetyDao, "imageSafetyDao");
        AbstractC9979u.m20294g(fileManager, "fileManager");
        this.f10306b = fileDao;
        this.f10307c = resourceDao;
        this.f10308d = userDao;
        this.f10309e = imageSafetyDao;
        this.f10310f = fileManager;
        this.f10312h = "";
        this.f10313i = "";
        this.f10314j = "";
        this.f10315k = "";
        this.f10316l = "";
        this.f10317m = new LinkedHashSet();
        InterfaceC11602k interfaceC11602kM25592b = AbstractC11608q.m25592b(0, 0, null, 7, null);
        this.f10318n = interfaceC11602kM25592b;
        this.f10319o = AbstractC11596e.m25551a(interfaceC11602kM25592b);
        this.f10320p = C5962b.f6082a.m5299a().m5292t();
        this.f10321q = new MutableLiveData();
        this.f10322r = new MutableLiveData();
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f10323s = mutableLiveData;
        this.f10324t = mutableLiveData;
        MutableLiveData mutableLiveData2 = new MutableLiveData(Boolean.FALSE);
        this.f10325u = mutableLiveData2;
        this.f10326v = mutableLiveData2;
        InterfaceC11602k interfaceC11602kM25592b2 = AbstractC11608q.m25592b(0, 0, null, 7, null);
        this.f10327w = interfaceC11602kM25592b2;
        this.f10328x = AbstractC11596e.m25551a(interfaceC11602kM25592b2);
        InterfaceC11602k interfaceC11602kM25592b3 = AbstractC11608q.m25592b(0, 0, null, 7, null);
        this.f10329y = interfaceC11602kM25592b3;
        this.f10330z = AbstractC11596e.m25551a(interfaceC11602kM25592b3);
    }

    /* renamed from: R */
    public static final CharSequence m7644R(ResourceEntity it) {
        AbstractC9979u.m20294g(it, "it");
        return it.getId();
    }

    /* renamed from: A */
    public final InterfaceC11607p m7659A() {
        return this.f10328x;
    }

    /* renamed from: B */
    public final MutableLiveData m7660B() {
        return this.f10321q;
    }

    /* renamed from: C */
    public final MutableLiveData m7661C() {
        return this.f10326v;
    }

    /* renamed from: D */
    public final LiveData m7662D() {
        return this.f10324t;
    }

    /* renamed from: E */
    public final String m7663E() {
        return this.f10315k;
    }

    /* renamed from: F */
    public final MutableLiveData m7664F() {
        return this.f10322r;
    }

    /* renamed from: G */
    public final String m7665G() {
        return this.f10312h;
    }

    /* renamed from: H */
    public final String m7666H() {
        return this.f10313i;
    }

    /* renamed from: I */
    public final String m7667I() {
        return this.f10316l;
    }

    /* renamed from: J */
    public final String m7668J(String notePath) {
        File file;
        File file2;
        File[] fileArrListFiles;
        String path;
        AbstractC9979u.m20294g(notePath, "notePath");
        File[] fileArrListFiles2 = new File(notePath).listFiles();
        if (fileArrListFiles2 == null) {
            return "";
        }
        int length = fileArrListFiles2.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            file = null;
            if (i11 >= length) {
                file2 = null;
                break;
            }
            file2 = fileArrListFiles2[i11];
            if (file2.isDirectory() && !AbstractC9979u.m20289b(file2.getName(), Constants.SEND_TYPE_RES) && !AbstractC9979u.m20289b(file2.getName(), "page_mdb")) {
                break;
            }
            i11++;
        }
        if (file2 == null || (fileArrListFiles = file2.listFiles()) == null) {
            return "";
        }
        int length2 = fileArrListFiles.length;
        while (true) {
            if (i10 >= length2) {
                break;
            }
            File file3 = fileArrListFiles[i10];
            if (AbstractC9979u.m20289b(file3.getName(), "screenshot.png")) {
                file = file3;
                break;
            }
            i10++;
        }
        return (file == null || (path = file.getPath()) == null) ? "" : path;
    }

    /* renamed from: K */
    public final String m7669K() {
        return this.f10314j;
    }

    /* renamed from: L */
    public final InterfaceC11607p m7670L() {
        return this.f10319o;
    }

    /* renamed from: M */
    public final void m7671M() {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new NewNoteViewModel$getPreviewNoteList$1(this, null), 3, null);
    }

    /* renamed from: N */
    public final Object m7672N(InterfaceC11588c interfaceC11588c) {
        return UserDao.m5201i(this.f10308d, 0L, interfaceC11588c, 1, null);
    }

    /* renamed from: O */
    public final void m7673O() {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new NewNoteViewModel$goAsking$1(this, null), 3, null);
    }

    /* renamed from: P */
    public final Object m7674P(List list, InterfaceC11588c interfaceC11588c) {
        Object objM24709g = AbstractC11109f.m24709g(C11157r0.m24799b(), new NewNoteViewModel$handleResource$2(list, this, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(new Date()), null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0505, code lost:
    
        r21 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04c8 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:16:0x0076, B:104:0x04c2, B:106:0x04c8, B:108:0x04db, B:118:0x050b, B:119:0x052c, B:111:0x04e5, B:112:0x04e9, B:114:0x04ef, B:124:0x0598, B:125:0x05ab, B:127:0x05b1, B:128:0x05bf, B:23:0x00b7, B:103:0x045d, B:26:0x00f6, B:62:0x02a1, B:64:0x02a5, B:67:0x02ad, B:56:0x021e, B:58:0x0224, B:69:0x02be, B:71:0x02e1, B:73:0x02ed, B:75:0x02f6, B:77:0x0387, B:78:0x0394, B:80:0x039a, B:82:0x03a9, B:91:0x03ce, B:85:0x03b3, B:86:0x03b7, B:88:0x03bd, B:92:0x03d2, B:94:0x03d8, B:96:0x03e4, B:98:0x03f8, B:99:0x0408, B:72:0x02e9, B:29:0x011c, B:55:0x0201, B:32:0x012f, B:34:0x014c, B:36:0x0155, B:38:0x016b, B:40:0x0175, B:41:0x0178, B:42:0x017c, B:48:0x018b, B:50:0x01cb, B:51:0x01db, B:129:0x05d2), top: B:137:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0598 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:16:0x0076, B:104:0x04c2, B:106:0x04c8, B:108:0x04db, B:118:0x050b, B:119:0x052c, B:111:0x04e5, B:112:0x04e9, B:114:0x04ef, B:124:0x0598, B:125:0x05ab, B:127:0x05b1, B:128:0x05bf, B:23:0x00b7, B:103:0x045d, B:26:0x00f6, B:62:0x02a1, B:64:0x02a5, B:67:0x02ad, B:56:0x021e, B:58:0x0224, B:69:0x02be, B:71:0x02e1, B:73:0x02ed, B:75:0x02f6, B:77:0x0387, B:78:0x0394, B:80:0x039a, B:82:0x03a9, B:91:0x03ce, B:85:0x03b3, B:86:0x03b7, B:88:0x03bd, B:92:0x03d2, B:94:0x03d8, B:96:0x03e4, B:98:0x03f8, B:99:0x0408, B:72:0x02e9, B:29:0x011c, B:55:0x0201, B:32:0x012f, B:34:0x014c, B:36:0x0155, B:38:0x016b, B:40:0x0175, B:41:0x0178, B:42:0x017c, B:48:0x018b, B:50:0x01cb, B:51:0x01db, B:129:0x05d2), top: B:137:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0224 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:16:0x0076, B:104:0x04c2, B:106:0x04c8, B:108:0x04db, B:118:0x050b, B:119:0x052c, B:111:0x04e5, B:112:0x04e9, B:114:0x04ef, B:124:0x0598, B:125:0x05ab, B:127:0x05b1, B:128:0x05bf, B:23:0x00b7, B:103:0x045d, B:26:0x00f6, B:62:0x02a1, B:64:0x02a5, B:67:0x02ad, B:56:0x021e, B:58:0x0224, B:69:0x02be, B:71:0x02e1, B:73:0x02ed, B:75:0x02f6, B:77:0x0387, B:78:0x0394, B:80:0x039a, B:82:0x03a9, B:91:0x03ce, B:85:0x03b3, B:86:0x03b7, B:88:0x03bd, B:92:0x03d2, B:94:0x03d8, B:96:0x03e4, B:98:0x03f8, B:99:0x0408, B:72:0x02e9, B:29:0x011c, B:55:0x0201, B:32:0x012f, B:34:0x014c, B:36:0x0155, B:38:0x016b, B:40:0x0175, B:41:0x0178, B:42:0x017c, B:48:0x018b, B:50:0x01cb, B:51:0x01db, B:129:0x05d2), top: B:137:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02a5 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:16:0x0076, B:104:0x04c2, B:106:0x04c8, B:108:0x04db, B:118:0x050b, B:119:0x052c, B:111:0x04e5, B:112:0x04e9, B:114:0x04ef, B:124:0x0598, B:125:0x05ab, B:127:0x05b1, B:128:0x05bf, B:23:0x00b7, B:103:0x045d, B:26:0x00f6, B:62:0x02a1, B:64:0x02a5, B:67:0x02ad, B:56:0x021e, B:58:0x0224, B:69:0x02be, B:71:0x02e1, B:73:0x02ed, B:75:0x02f6, B:77:0x0387, B:78:0x0394, B:80:0x039a, B:82:0x03a9, B:91:0x03ce, B:85:0x03b3, B:86:0x03b7, B:88:0x03bd, B:92:0x03d2, B:94:0x03d8, B:96:0x03e4, B:98:0x03f8, B:99:0x0408, B:72:0x02e9, B:29:0x011c, B:55:0x0201, B:32:0x012f, B:34:0x014c, B:36:0x0155, B:38:0x016b, B:40:0x0175, B:41:0x0178, B:42:0x017c, B:48:0x018b, B:50:0x01cb, B:51:0x01db, B:129:0x05d2), top: B:137:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02ad A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:16:0x0076, B:104:0x04c2, B:106:0x04c8, B:108:0x04db, B:118:0x050b, B:119:0x052c, B:111:0x04e5, B:112:0x04e9, B:114:0x04ef, B:124:0x0598, B:125:0x05ab, B:127:0x05b1, B:128:0x05bf, B:23:0x00b7, B:103:0x045d, B:26:0x00f6, B:62:0x02a1, B:64:0x02a5, B:67:0x02ad, B:56:0x021e, B:58:0x0224, B:69:0x02be, B:71:0x02e1, B:73:0x02ed, B:75:0x02f6, B:77:0x0387, B:78:0x0394, B:80:0x039a, B:82:0x03a9, B:91:0x03ce, B:85:0x03b3, B:86:0x03b7, B:88:0x03bd, B:92:0x03d2, B:94:0x03d8, B:96:0x03e4, B:98:0x03f8, B:99:0x0408, B:72:0x02e9, B:29:0x011c, B:55:0x0201, B:32:0x012f, B:34:0x014c, B:36:0x0155, B:38:0x016b, B:40:0x0175, B:41:0x0178, B:42:0x017c, B:48:0x018b, B:50:0x01cb, B:51:0x01db, B:129:0x05d2), top: B:137:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02be A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:16:0x0076, B:104:0x04c2, B:106:0x04c8, B:108:0x04db, B:118:0x050b, B:119:0x052c, B:111:0x04e5, B:112:0x04e9, B:114:0x04ef, B:124:0x0598, B:125:0x05ab, B:127:0x05b1, B:128:0x05bf, B:23:0x00b7, B:103:0x045d, B:26:0x00f6, B:62:0x02a1, B:64:0x02a5, B:67:0x02ad, B:56:0x021e, B:58:0x0224, B:69:0x02be, B:71:0x02e1, B:73:0x02ed, B:75:0x02f6, B:77:0x0387, B:78:0x0394, B:80:0x039a, B:82:0x03a9, B:91:0x03ce, B:85:0x03b3, B:86:0x03b7, B:88:0x03bd, B:92:0x03d2, B:94:0x03d8, B:96:0x03e4, B:98:0x03f8, B:99:0x0408, B:72:0x02e9, B:29:0x011c, B:55:0x0201, B:32:0x012f, B:34:0x014c, B:36:0x0155, B:38:0x016b, B:40:0x0175, B:41:0x0178, B:42:0x017c, B:48:0x018b, B:50:0x01cb, B:51:0x01db, B:129:0x05d2), top: B:137:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v56, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x0590 -> B:123:0x0594). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x028f -> B:62:0x02a1). Please report as a decompilation issue!!! */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7675Q(java.lang.String r33, java.util.List r34, vc.InterfaceC11588c r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.viewmodel.NewNoteViewModel.m7675Q(java.lang.String, java.util.List, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/viewmodel/NewNoteViewModel.smali:1100
    }

    /* renamed from: S */
    public final Object m7676S(ImageSafetyEntity imageSafetyEntity, InterfaceC11588c interfaceC11588c) {
        BaseViewModel.m4802c(this, new NewNoteViewModel$insertImageSafety$2(this, imageSafetyEntity, null), null, null, 6, null);
        return C10786q.f26013a;
    }

    /* renamed from: T */
    public final void m7677T(String imagePath) {
        AbstractC9979u.m20294g(imagePath, "imagePath");
        this.f10317m.add(imagePath);
    }

    /* renamed from: U */
    public final void m7678U(String pageDir) {
        AbstractC9979u.m20294g(pageDir, "pageDir");
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), C11157r0.m24799b(), null, new NewNoteViewModel$repairMissingImagesByPageDir$1(this, pageDir, null), 2, null);
    }

    /* renamed from: V */
    public final void m7679V(boolean z10) {
        this.f10311g = z10;
    }

    /* renamed from: W */
    public final void m7680W(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.f10315k = str;
    }

    /* renamed from: X */
    public final void m7681X(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.f10312h = str;
    }

    /* renamed from: Y */
    public final void m7682Y(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.f10313i = str;
    }

    /* renamed from: Z */
    public final void m7683Z(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.f10316l = str;
    }

    /* renamed from: a0 */
    public final void m7684a0(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.f10314j = str;
    }

    /* renamed from: b0 */
    public final void m7685b0(int i10) {
        this.f10321q.postValue(Integer.valueOf(i10));
    }

    /* renamed from: c0 */
    public final void m7686c0(boolean z10) {
        this.f10325u.postValue(Boolean.valueOf(z10));
    }

    /* renamed from: d0 */
    public final Object m7687d0(List list, InterfaceC11588c interfaceC11588c) throws Throwable {
        Object objM5247e = NotePageOrder.f6040a.m5247e(this.f10312h, new NewNoteViewModel$updateIndexJson$2(AbstractC10947g0.m23922X0(list), this, null), interfaceC11588c);
        return objM5247e == AbstractC11725a.m25952f() ? objM5247e : C10786q.f26013a;
    }

    /* renamed from: e0 */
    public final Object m7688e0(String str, String str2, int i10, String str3, InterfaceC11588c interfaceC11588c) {
        Object objMo4930b = this.f10306b.mo4930b(str, str2, i10, str3, true, interfaceC11588c);
        return objMo4930b == AbstractC11725a.m25952f() ? objMo4930b : C10786q.f26013a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7689f0(java.lang.String r10, vc.InterfaceC11588c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.friday.paint.viewmodel.NewNoteViewModel$wasDeleted$1
            if (r0 == 0) goto L14
            r0 = r11
            com.friday.paint.viewmodel.NewNoteViewModel$wasDeleted$1 r0 = (com.friday.paint.viewmodel.NewNoteViewModel$wasDeleted$1) r0
            int r1 = r0.f10427f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f10427f = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            com.friday.paint.viewmodel.NewNoteViewModel$wasDeleted$1 r0 = new com.friday.paint.viewmodel.NewNoteViewModel$wasDeleted$1
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.f10425d
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r5.f10427f
            r8 = 1
            if (r1 == 0) goto L37
            if (r1 != r8) goto L2f
            java.lang.Object r10 = r5.f10424c
            java.lang.String r10 = (java.lang.String) r10
            kotlin.AbstractC9924b.m20071b(r11)
            goto L53
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            kotlin.AbstractC9924b.m20071b(r11)
            if (r10 != 0) goto L3d
            goto L5b
        L3d:
            com.friday.common.dao.ResourceDao r1 = r9.f10307c
            java.lang.Object r11 = p409xc.AbstractC11833h.m26224a(r10)
            r5.f10424c = r11
            r5.f10427f = r8
            r3 = 0
            r6 = 2
            r7 = 0
            r2 = r10
            java.lang.Object r11 = com.friday.common.dao.ResourceDao.m5082u(r1, r2, r3, r5, r6, r7)
            if (r11 != r0) goto L53
            return r0
        L53:
            com.friday.common.entity.ResourceEntity r11 = (com.friday.common.entity.ResourceEntity) r11
            if (r11 == 0) goto L5b
            boolean r8 = r11.getWasDeleted()
        L5b:
            java.lang.Boolean r10 = p409xc.AbstractC11826a.m26206a(r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.viewmodel.NewNoteViewModel.m7689f0(java.lang.String, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/viewmodel/NewNoteViewModel.smali:3258
    }

    /* renamed from: s */
    public final Object m7690s(InterfaceC11588c interfaceC11588c) throws Throwable {
        Object objM5247e = NotePageOrder.f6040a.m5247e(this.f10312h, new NewNoteViewModel$awaitPendingSave$2(null), interfaceC11588c);
        return objM5247e == AbstractC11725a.m25952f() ? objM5247e : C10786q.f26013a;
    }

    /* renamed from: t */
    public final void m7691t() {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new NewNoteViewModel$copyToOthers$1(this, null), 3, null);
    }

    /* renamed from: u */
    public final Object m7692u(String str, CreateNoteInput createNoteInput, InterfaceC11588c interfaceC11588c) {
        Object objMo4910I = this.f10306b.mo4910I(new FileEntity(createNoteInput.getNoteId(), createNoteInput.getUserId(), createNoteInput.getNoteName(), "", createNoteInput.getLocalPath(), "12", createNoteInput.getParentId(), str, str, 1, false, 0, false, null, 0, null, true, 0L, false, 450560, null), interfaceC11588c);
        return objMo4910I == AbstractC11725a.m25952f() ? objMo4910I : C10786q.f26013a;
    }

    /* renamed from: v */
    public final void m7693v(int i10, List dataList) {
        AbstractC9979u.m20294g(dataList, "dataList");
        BaseViewModel.m4802c(this, new NewNoteViewModel$deleteNote$1(i10, dataList, this, null), new NewNoteViewModel$deleteNote$2(this, null), null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7694w(java.lang.String r9, java.lang.String r10, vc.InterfaceC11588c r11) throws java.lang.Exception {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.friday.paint.viewmodel.NewNoteViewModel$deleteResource$1
            if (r0 == 0) goto L14
            r0 = r11
            com.friday.paint.viewmodel.NewNoteViewModel$deleteResource$1 r0 = (com.friday.paint.viewmodel.NewNoteViewModel$deleteResource$1) r0
            int r1 = r0.f10356i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f10356i = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.friday.paint.viewmodel.NewNoteViewModel$deleteResource$1 r0 = new com.friday.paint.viewmodel.NewNoteViewModel$deleteResource$1
            r0.<init>(r8, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f10354g
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r6.f10356i
            r2 = 1
            if (r1 == 0) goto L44
            if (r1 != r2) goto L3c
            boolean r9 = r6.f10353f
            java.lang.Object r10 = r6.f10352e
            java.io.File r10 = (java.io.File) r10
            java.lang.Object r0 = r6.f10351d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r6.f10350c
            java.lang.String r0 = (java.lang.String) r0
            kotlin.AbstractC9924b.m20071b(r11)     // Catch: java.lang.Exception -> L39
            goto L74
        L39:
            r0 = move-exception
            r11 = r0
            goto L98
        L3c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L44:
            kotlin.AbstractC9924b.m20071b(r11)
            java.io.File r11 = new java.io.File
            r11.<init>(r10)
            f2.e r1 = p141f2.C9168e.f21413a
            boolean r7 = r1.m18068b(r11)
            com.friday.common.dao.ResourceDao r1 = r8.f10307c     // Catch: java.lang.Exception -> L93
            long r4 = r8.f10320p     // Catch: java.lang.Exception -> L93
            java.lang.Object r3 = p409xc.AbstractC11833h.m26224a(r9)     // Catch: java.lang.Exception -> L93
            r6.f10350c = r3     // Catch: java.lang.Exception -> L93
            java.lang.Object r3 = p409xc.AbstractC11833h.m26224a(r10)     // Catch: java.lang.Exception -> L93
            r6.f10351d = r3     // Catch: java.lang.Exception -> L93
            r6.f10352e = r11     // Catch: java.lang.Exception -> L93
            r6.f10353f = r7     // Catch: java.lang.Exception -> L93
            r6.f10356i = r2     // Catch: java.lang.Exception -> L93
            r2 = r9
            r3 = r10
            java.lang.Object r9 = r1.mo5086A(r2, r3, r4, r6)     // Catch: java.lang.Exception -> L93
            if (r9 != r0) goto L71
            return r0
        L71:
            r10 = r11
            r11 = r9
            r9 = r7
        L74:
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Exception -> L39
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r9 = r11.iterator()
        L7c:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L90
            java.lang.Object r10 = r9.next()
            com.friday.common.entity.ResourceEntity r10 = (com.friday.common.entity.ResourceEntity) r10
            java.lang.String r10 = r10.getId()
            com.blankj.utilcode.util.FileUtils.delete(r10)
            goto L7c
        L90:
            qc.q r9 = p309qc.C10786q.f26013a
            return r9
        L93:
            r0 = move-exception
            r9 = r0
            r10 = r11
            r11 = r9
            r9 = r7
        L98:
            if (r9 == 0) goto La5
            f2.e r9 = p141f2.C9168e.f21413a     // Catch: java.lang.Exception -> La0
            r9.m18070d(r10)     // Catch: java.lang.Exception -> La0
            goto La5
        La0:
            r0 = move-exception
            r9 = r0
            p309qc.AbstractC10771b.m22973a(r11, r9)
        La5:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.viewmodel.NewNoteViewModel.m7694w(java.lang.String, java.lang.String, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/viewmodel/NewNoteViewModel.smali:3783
    }

    /* renamed from: x */
    public final Object m7695x(InterfaceC11588c interfaceC11588c) {
        return AbstractC11826a.m26206a(ActivityUtils.isActivityExists("com.zykj.manage", "com.zykj.gallery.ui.share.ShareActivity"));
    }

    /* renamed from: y */
    public final InterfaceC11607p m7696y() {
        return this.f10330z;
    }

    /* renamed from: z */
    public final Object m7697z(InterfaceC11588c interfaceC11588c) {
        return UserDao.m5200e(this.f10308d, 0L, interfaceC11588c, 1, null);
    }
}
