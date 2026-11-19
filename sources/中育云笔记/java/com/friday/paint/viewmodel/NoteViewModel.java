package com.friday.paint.viewmodel;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.blankj.utilcode.util.Utils;
import com.friday.common.base.BaseViewModel;
import com.friday.common.dao.FileDao;
import com.friday.common.dao.ResourceDao;
import com.friday.common.dao.UserDao;
import com.friday.common.entity.CreateNoteInput;
import com.friday.common.entity.FileEntity;
import com.friday.common.entity.ImageSafetyEntity;
import com.friday.common.entity.ResourceEntity;
import com.friday.common.helper.C5962b;
import com.google.gson.reflect.TypeToken;
import com.zykj.sketch.core.config.GraphConfig;
import com.zykj.sketch.core.config.SketchConfig;
import com.zykj.sketch.core.data.Mode;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9979u;
import p040c2.InterfaceC5308v0;
import p309qc.C10786q;
import p364uc.AbstractC11382b;
import p378vb.AbstractC11584n;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11608q;
import p379vd.InterfaceC11602k;
import p379vd.InterfaceC11607p;
import p393wc.AbstractC11725a;
import sd.AbstractC11109f;
import sd.AbstractC11117h;
import sd.C11157r0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class NoteViewModel extends BaseViewModel {

    /* renamed from: b */
    public final FileDao f10428b;

    /* renamed from: c */
    public final ResourceDao f10429c;

    /* renamed from: d */
    public final UserDao f10430d;

    /* renamed from: e */
    public final InterfaceC5308v0 f10431e;

    /* renamed from: f */
    public String f10432f;

    /* renamed from: g */
    public String f10433g;

    /* renamed from: h */
    public String f10434h;

    /* renamed from: i */
    public String f10435i;

    /* renamed from: j */
    public List f10436j;

    /* renamed from: k */
    public String f10437k;

    /* renamed from: l */
    public MutableLiveData f10438l;

    /* renamed from: m */
    public MutableLiveData f10439m;

    /* renamed from: n */
    public MutableLiveData f10440n;

    /* renamed from: o */
    public final HashMap f10441o;

    /* renamed from: p */
    public final long f10442p;

    /* renamed from: q */
    public final MutableLiveData f10443q;

    /* renamed from: r */
    public final MutableLiveData f10444r;

    /* renamed from: s */
    public final InterfaceC11602k f10445s;

    /* renamed from: t */
    public final InterfaceC11607p f10446t;

    /* renamed from: u */
    public final MutableLiveData f10447u;

    /* renamed from: v */
    public final LiveData f10448v;

    /* renamed from: w */
    public final MutableLiveData f10449w;

    /* renamed from: x */
    public final MutableLiveData f10450x;

    /* renamed from: y */
    public final InterfaceC11602k f10451y;

    /* renamed from: z */
    public final InterfaceC11607p f10452z;

    /* renamed from: com.friday.paint.viewmodel.NoteViewModel$a */
    public static final class C6324a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC11382b.m25330d(Integer.valueOf(((ResourceEntity) obj).getPageIndex()), Integer.valueOf(((ResourceEntity) obj2).getPageIndex()));
        }
    }

    /* renamed from: com.friday.paint.viewmodel.NoteViewModel$b */
    public static final class C6325b extends TypeToken<ArrayList<String>> {
    }

    public NoteViewModel(FileDao fileDao, ResourceDao resourceDao, UserDao userDao, InterfaceC5308v0 imageSafetyDao) {
        AbstractC9979u.m20294g(fileDao, "fileDao");
        AbstractC9979u.m20294g(resourceDao, "resourceDao");
        AbstractC9979u.m20294g(userDao, "userDao");
        AbstractC9979u.m20294g(imageSafetyDao, "imageSafetyDao");
        this.f10428b = fileDao;
        this.f10429c = resourceDao;
        this.f10430d = userDao;
        this.f10431e = imageSafetyDao;
        this.f10432f = "";
        this.f10433g = "";
        this.f10434h = "";
        this.f10435i = "";
        this.f10436j = new ArrayList();
        this.f10437k = "";
        this.f10438l = new MutableLiveData(new GraphConfig(3.0f, ViewCompat.MEASURED_STATE_MASK));
        this.f10439m = new MutableLiveData(Mode.ACTION_WRITING);
        SketchConfig.Builder builder = new SketchConfig.Builder();
        Boolean boolM25511h = AbstractC11584n.m25511h();
        SketchConfig.Builder maxImageCount = builder.setTouchable(boolM25511h != null ? boolM25511h.booleanValue() : true).setMaxImageCount(5);
        Application app = Utils.getApp();
        AbstractC9979u.m20293f(app, "getApp(...)");
        this.f10440n = new MutableLiveData(maxImageCount.build(app));
        this.f10441o = new HashMap();
        this.f10442p = C5962b.f6082a.m5299a().m5292t();
        this.f10443q = new MutableLiveData();
        this.f10444r = new MutableLiveData();
        InterfaceC11602k interfaceC11602kM25592b = AbstractC11608q.m25592b(0, 0, null, 7, null);
        this.f10445s = interfaceC11602kM25592b;
        this.f10446t = AbstractC11596e.m25551a(interfaceC11602kM25592b);
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f10447u = mutableLiveData;
        this.f10448v = mutableLiveData;
        MutableLiveData mutableLiveData2 = new MutableLiveData(Boolean.FALSE);
        this.f10449w = mutableLiveData2;
        this.f10450x = mutableLiveData2;
        InterfaceC11602k interfaceC11602kM25592b2 = AbstractC11608q.m25592b(0, 0, null, 7, null);
        this.f10451y = interfaceC11602kM25592b2;
        this.f10452z = AbstractC11596e.m25551a(interfaceC11602kM25592b2);
    }

    /* renamed from: N */
    private final Object m7699N(List list, InterfaceC11588c interfaceC11588c) {
        Object objM24709g = AbstractC11109f.m24709g(C11157r0.m24799b(), new NoteViewModel$handleResource$2(list, this, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(new Date()), null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }

    /* renamed from: Y */
    private final void m7700Y(String str, String str2, int i10) {
        BaseViewModel.m4802c(this, new NoteViewModel$updateNote$1(this, str, str2, i10, null), new NoteViewModel$updateNote$2(null), null, 4, null);
    }

    /* renamed from: o */
    private final void m7710o(CreateNoteInput createNoteInput) {
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(new Date());
        String noteId = createNoteInput.getNoteId();
        long userId = createNoteInput.getUserId();
        String noteName = createNoteInput.getNoteName();
        String localPath = createNoteInput.getLocalPath();
        String parentId = createNoteInput.getParentId();
        AbstractC9979u.m20291d(str);
        BaseViewModel.m4802c(this, new NoteViewModel$createNewNote$1(this, new FileEntity(noteId, userId, noteName, "", localPath, "1", parentId, str, str, 1, false, 0, false, null, 0, null, true, 0L, false, 450560, null), null), new NoteViewModel$createNewNote$2(null), null, 4, null);
    }

    /* renamed from: A */
    public final MutableLiveData m7711A() {
        return this.f10444r;
    }

    /* renamed from: B */
    public final String m7712B() {
        return this.f10432f;
    }

    /* renamed from: C */
    public final List m7713C() {
        return this.f10436j;
    }

    /* renamed from: D */
    public final String m7714D() {
        return this.f10433g;
    }

    /* renamed from: E */
    public final MutableLiveData m7715E() {
        return this.f10438l;
    }

    /* renamed from: F */
    public final HashMap m7716F() {
        return this.f10441o;
    }

    /* renamed from: G */
    public final String m7717G() {
        return this.f10435i;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7718H(java.lang.String r11, vc.InterfaceC11588c r12) {
        /*
            ResourceDao.V: keep the first row per pageName and sort by its pageIndex.
            With no live rows, read localFileUrl/index.json and keep existing paths in array order, including repeats.
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.viewmodel.NoteViewModel.m7718H(java.lang.String, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/viewmodel/NoteViewModel.smali:995
    }

    /* renamed from: I */
    public final Object m7719I(String str, InterfaceC11588c interfaceC11588c) {
        return AbstractC11109f.m24709g(C11157r0.m24799b(), new NoteViewModel$getRiskScoreByImageId$2(this, str, null), interfaceC11588c);
    }

    /* renamed from: J */
    public final Object m7720J(InterfaceC11588c interfaceC11588c) {
        return AbstractC11109f.m24709g(C11157r0.m24799b(), new NoteViewModel$getScreensPermission$2(this, null), interfaceC11588c);
    }

    /* renamed from: K */
    public final MutableLiveData m7721K() {
        return this.f10440n;
    }

    /* renamed from: L */
    public final MutableLiveData m7722L() {
        return this.f10439m;
    }

    /* renamed from: M */
    public final void m7723M() {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new NoteViewModel$goAsking$1(this, null), 3, null);
    }

    /* renamed from: O */
    public final Object m7724O(ImageSafetyEntity imageSafetyEntity, InterfaceC11588c interfaceC11588c) {
        BaseViewModel.m4802c(this, new NoteViewModel$insertImageSafety$2(this, imageSafetyEntity, null), new NoteViewModel$insertImageSafety$3(null), null, 4, null);
        return C10786q.f26013a;
    }

    /* renamed from: P */
    public final void m7725P(File file) {
        AbstractC9979u.m20294g(file, "file");
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new NoteViewModel$saveThumbnail$1(file, this, null), 3, null);
    }

    /* renamed from: Q */
    public final void m7726Q(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.f10437k = str;
    }

    /* renamed from: R */
    public final void m7727R(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.f10432f = str;
    }

    /* renamed from: S */
    public final void m7728S(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.f10434h = str;
    }

    /* renamed from: T */
    public final void m7729T(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.f10433g = str;
    }

    /* renamed from: U */
    public final void m7730U(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.f10435i = str;
    }

    /* renamed from: V */
    public final void m7731V(int i10) {
        this.f10443q.postValue(Integer.valueOf(i10));
    }

    /* renamed from: W */
    public final void m7732W(boolean z10) {
        this.f10449w.postValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b9, code lost:
    
        if (m7699N(r6, r2) != r3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7733X(java.util.List r19, vc.InterfaceC11588c r20) throws java.lang.Throwable {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof com.friday.paint.viewmodel.NoteViewModel$updateIndexJson$1
            if (r2 == 0) goto L17
            r2 = r1
            com.friday.paint.viewmodel.NoteViewModel$updateIndexJson$1 r2 = (com.friday.paint.viewmodel.NoteViewModel$updateIndexJson$1) r2
            int r3 = r2.f10544g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f10544g = r3
            goto L1c
        L17:
            com.friday.paint.viewmodel.NoteViewModel$updateIndexJson$1 r2 = new com.friday.paint.viewmodel.NoteViewModel$updateIndexJson$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f10542e
            java.lang.Object r3 = p393wc.AbstractC11725a.m25952f()
            int r4 = r2.f10544g
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L58
            if (r4 == r7) goto L50
            if (r4 == r6) goto L44
            if (r4 != r5) goto L3c
            java.lang.Object r3 = r2.f10541d
            com.friday.common.entity.FileEntity r3 = (com.friday.common.entity.FileEntity) r3
            java.lang.Object r2 = r2.f10540c
            java.util.List r2 = (java.util.List) r2
            kotlin.AbstractC9924b.m20071b(r1)
            goto Lbc
        L3c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L44:
            java.lang.Object r4 = r2.f10541d
            com.friday.common.entity.FileEntity r4 = (com.friday.common.entity.FileEntity) r4
            java.lang.Object r6 = r2.f10540c
            java.util.List r6 = (java.util.List) r6
            kotlin.AbstractC9924b.m20071b(r1)
            goto La7
        L50:
            java.lang.Object r4 = r2.f10540c
            java.util.List r4 = (java.util.List) r4
            kotlin.AbstractC9924b.m20071b(r1)
            goto L6d
        L58:
            kotlin.AbstractC9924b.m20071b(r1)
            com.friday.common.dao.FileDao r1 = r0.f10428b
            java.lang.String r4 = r0.f10432f
            r8 = r19
            r2.f10540c = r8
            r2.f10544g = r7
            java.lang.Object r1 = r1.mo4941r(r4, r2)
            if (r1 != r3) goto L6c
            goto Lbb
        L6c:
            r4 = r8
        L6d:
            com.friday.common.entity.FileEntity r1 = (com.friday.common.entity.FileEntity) r1
            if (r1 != 0) goto L89
            com.friday.common.entity.CreateNoteInput r8 = new com.friday.common.entity.CreateNoteInput
            java.lang.String r9 = r0.f10432f
            java.lang.String r10 = r0.f10434h
            java.lang.String r11 = r0.f10435i
            long r12 = r0.f10442p
            java.lang.String r14 = r0.f10437k
            r16 = 32
            r17 = 0
            r15 = 0
            r8.<init>(r9, r10, r11, r12, r14, r15, r16, r17)
            r0.m7710o(r8)
            goto L90
        L89:
            java.lang.String r8 = r0.f10432f
            java.lang.String r9 = r0.f10434h
            r0.m7700Y(r8, r9, r7)
        L90:
            com.friday.common.dao.FileDao r8 = r0.f10428b
            java.lang.String r9 = r0.f10432f
            r2.f10540c = r4
            java.lang.Object r10 = p409xc.AbstractC11833h.m26224a(r1)
            r2.f10541d = r10
            r2.f10544g = r6
            java.lang.Object r6 = r8.mo4931b0(r9, r7, r2)
            if (r6 != r3) goto La5
            goto Lbb
        La5:
            r6 = r4
            r4 = r1
        La7:
            java.lang.Object r1 = p409xc.AbstractC11833h.m26224a(r6)
            r2.f10540c = r1
            java.lang.Object r1 = p409xc.AbstractC11833h.m26224a(r4)
            r2.f10541d = r1
            r2.f10544g = r5
            java.lang.Object r1 = r0.m7699N(r6, r2)
            if (r1 != r3) goto Lbc
        Lbb:
            return r3
        Lbc:
            qc.q r1 = p309qc.C10786q.f26013a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.viewmodel.NoteViewModel.m7733X(java.util.List, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/viewmodel/NoteViewModel.smali:1781
    }

    /* renamed from: n */
    public final void m7734n() {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new NoteViewModel$copyToOthers$1(this, null), 3, null);
    }

    /* renamed from: p */
    public final Object m7735p(String str, InterfaceC11588c interfaceC11588c) {
        Object objMo2814c = this.f10431e.mo2814c(str, interfaceC11588c);
        return objMo2814c == AbstractC11725a.m25952f() ? objMo2814c : C10786q.f26013a;
    }

    /* renamed from: q */
    public final void m7736q(int i10, List dataList) {
        AbstractC9979u.m20294g(dataList, "dataList");
        BaseViewModel.m4802c(this, new NoteViewModel$deleteNote$1(i10, dataList, this, null), new NoteViewModel$deleteNote$2(this, null), null, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0137, code lost:
    
        if (r12.mo5114p(r9, r4, r8) == r2) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0137 -> B:36:0x013a). Please report as a decompilation issue!!! */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7737r(java.lang.String r18, int r19, vc.InterfaceC11588c r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.viewmodel.NoteViewModel.m7737r(java.lang.String, int, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/viewmodel/NoteViewModel.smali:2325
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        if (r1.mo5110k(r11, r5) == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7738s(java.lang.String r11, vc.InterfaceC11588c r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.friday.paint.viewmodel.NoteViewModel$deleteResourceById$1
            if (r0 == 0) goto L14
            r0 = r12
            com.friday.paint.viewmodel.NoteViewModel$deleteResourceById$1 r0 = (com.friday.paint.viewmodel.NoteViewModel$deleteResourceById$1) r0
            int r1 = r0.f10484i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f10484i = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            com.friday.paint.viewmodel.NoteViewModel$deleteResourceById$1 r0 = new com.friday.paint.viewmodel.NoteViewModel$deleteResourceById$1
            r0.<init>(r10, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r5.f10482g
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r5.f10484i
            r8 = 3
            r9 = 2
            r2 = 1
            if (r1 == 0) goto L5e
            if (r1 == r2) goto L56
            if (r1 == r9) goto L46
            if (r1 != r8) goto L3e
            java.lang.Object r11 = r5.f10480e
            com.friday.common.entity.ResourceEntity r11 = (com.friday.common.entity.ResourceEntity) r11
            java.lang.Object r11 = r5.f10479d
            com.friday.common.entity.ResourceEntity r11 = (com.friday.common.entity.ResourceEntity) r11
            java.lang.Object r11 = r5.f10478c
            java.lang.String r11 = (java.lang.String) r11
            kotlin.AbstractC9924b.m20071b(r12)
            goto Lc6
        L3e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L46:
            java.lang.Object r11 = r5.f10480e
            com.friday.common.entity.ResourceEntity r11 = (com.friday.common.entity.ResourceEntity) r11
            java.lang.Object r0 = r5.f10479d
            com.friday.common.entity.ResourceEntity r0 = (com.friday.common.entity.ResourceEntity) r0
            java.lang.Object r0 = r5.f10478c
            java.lang.String r0 = (java.lang.String) r0
            kotlin.AbstractC9924b.m20071b(r12)
            goto L9f
        L56:
            java.lang.Object r11 = r5.f10478c
            java.lang.String r11 = (java.lang.String) r11
            kotlin.AbstractC9924b.m20071b(r12)
            goto L74
        L5e:
            kotlin.AbstractC9924b.m20071b(r12)
            com.friday.common.dao.ResourceDao r1 = r10.f10429c
            r5.f10478c = r11
            r5.f10484i = r2
            r3 = 0
            r6 = 2
            r7 = 0
            r2 = r11
            java.lang.Object r12 = com.friday.common.dao.ResourceDao.m5082u(r1, r2, r3, r5, r6, r7)
            if (r12 != r0) goto L73
            goto Lc5
        L73:
            r11 = r2
        L74:
            com.friday.common.entity.ResourceEntity r12 = (com.friday.common.entity.ResourceEntity) r12
            if (r12 == 0) goto Lc9
            java.lang.String r1 = r12.getOssImageUrl()
            int r1 = r1.length()
            r2 = 0
            if (r1 != 0) goto Lab
            com.friday.common.dao.ResourceDao r1 = r10.f10429c
            java.lang.String r3 = r12.getId()
            r5.f10478c = r11
            java.lang.Object r11 = p409xc.AbstractC11833h.m26224a(r12)
            r5.f10479d = r11
            r5.f10480e = r12
            r5.f10481f = r2
            r5.f10484i = r9
            java.lang.Object r11 = r1.mo5102Z(r3, r5)
            if (r11 != r0) goto L9e
            goto Lc5
        L9e:
            r11 = r12
        L9f:
            java.lang.String r11 = r11.getId()
            boolean r11 = com.blankj.utilcode.util.FileUtils.delete(r11)
            p409xc.AbstractC11826a.m26206a(r11)
            goto Ld0
        Lab:
            com.friday.common.dao.ResourceDao r1 = r10.f10429c
            r5.f10478c = r11
            java.lang.Object r3 = p409xc.AbstractC11833h.m26224a(r12)
            r5.f10479d = r3
            java.lang.Object r12 = p409xc.AbstractC11833h.m26224a(r12)
            r5.f10480e = r12
            r5.f10481f = r2
            r5.f10484i = r8
            java.lang.Object r11 = r1.mo5110k(r11, r5)
            if (r11 != r0) goto Lc6
        Lc5:
            return r0
        Lc6:
            qc.q r11 = p309qc.C10786q.f26013a
            goto Ld0
        Lc9:
            boolean r11 = com.blankj.utilcode.util.FileUtils.delete(r11)
            p409xc.AbstractC11826a.m26206a(r11)
        Ld0:
            qc.q r11 = p309qc.C10786q.f26013a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.viewmodel.NoteViewModel.m7738s(java.lang.String, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/viewmodel/NoteViewModel.smali:3018
    }

    /* renamed from: t */
    public final Object m7739t(InterfaceC11588c interfaceC11588c) {
        return AbstractC11109f.m24709g(C11157r0.m24799b(), new NoteViewModel$getAlbumPermission$2(this, null), interfaceC11588c);
    }

    /* renamed from: u */
    public final InterfaceC11607p m7740u() {
        return this.f10446t;
    }

    /* renamed from: v */
    public final Object m7741v(InterfaceC11588c interfaceC11588c) {
        return AbstractC11109f.m24709g(C11157r0.m24799b(), new NoteViewModel$getCameraPermission$2(this, null), interfaceC11588c);
    }

    /* renamed from: w */
    public final InterfaceC11607p m7742w() {
        return this.f10452z;
    }

    /* renamed from: x */
    public final MutableLiveData m7743x() {
        return this.f10443q;
    }

    /* renamed from: y */
    public final MutableLiveData m7744y() {
        return this.f10450x;
    }

    /* renamed from: z */
    public final LiveData m7745z() {
        return this.f10448v;
    }
}
