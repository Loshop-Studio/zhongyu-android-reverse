package com.zykj.cloudhelper.viewmodel;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.friday.common.base.BaseViewModel;
import com.friday.common.dao.FileDao;
import com.friday.common.entity.FileEntity;
import com.friday.common.entity.NoteBean;
import com.friday.common.helper.C5962b;
import com.zykj.cloudhelper.viewmodel.PickNoteViewModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9979u;
import p110d2.InterfaceC8919i;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p310qd.AbstractC10819z;
import p429z1.AbstractC11958b;
import pa.InterfaceC10639a;
import sd.AbstractC11117h;

@StabilityInferred(parameters = 0)
/* loaded from: classes6.dex */
public final class PickNoteViewModel extends BaseViewModel {

    /* renamed from: b */
    public final InterfaceC10639a f19534b;

    /* renamed from: c */
    public final InterfaceC8919i f19535c;

    /* renamed from: d */
    public final FileDao f19536d;

    /* renamed from: e */
    public Uri f19537e;

    /* renamed from: f */
    public String f19538f;

    /* renamed from: g */
    public String f19539g;

    /* renamed from: h */
    public final MutableLiveData f19540h;

    /* renamed from: i */
    public final MutableLiveData f19541i;

    /* renamed from: j */
    public final MutableLiveData f19542j;

    /* renamed from: k */
    public final MutableLiveData f19543k;

    /* renamed from: l */
    public final String f19544l;

    /* renamed from: m */
    public final MutableLiveData f19545m;

    public PickNoteViewModel(InterfaceC10639a service, InterfaceC8919i ezyService, FileDao fileDao) {
        AbstractC9979u.m20294g(service, "service");
        AbstractC9979u.m20294g(ezyService, "ezyService");
        AbstractC9979u.m20294g(fileDao, "fileDao");
        this.f19534b = service;
        this.f19535c = ezyService;
        this.f19536d = fileDao;
        this.f19538f = "";
        this.f19539g = "";
        this.f19540h = new MutableLiveData();
        this.f19541i = new MutableLiveData();
        this.f19542j = new MutableLiveData();
        this.f19543k = new MutableLiveData();
        this.f19544l = C5962b.f6082a.m5299a().m5284l();
        this.f19545m = new MutableLiveData();
    }

    /* renamed from: k */
    public static final C10786q m16481k(PickNoteViewModel pickNoteViewModel, NoteBean noteBean) {
        AbstractC11958b.m26588i("新建文件夹成功");
        pickNoteViewModel.f19545m.setValue(noteBean);
        return C10786q.f26013a;
    }

    /* renamed from: m */
    public static /* synthetic */ void m16482m(PickNoteViewModel pickNoteViewModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        pickNoteViewModel.m16484l(z10);
    }

    /* renamed from: j */
    public final void m16483j(String fileName, String parentId, long j10) {
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(parentId, "parentId");
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(new Date());
        String string = UUID.randomUUID().toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        String strM23238K = AbstractC10819z.m23238K(string, "-", "", false, 4, null);
        AbstractC9979u.m20291d(str);
        FileEntity fileEntity = new FileEntity(strM23238K, j10, fileName, "", "", "0", parentId, str, str, 1, false, 0, false, null, 0, null, false, 0L, false, 516096, null);
        final NoteBean noteBean = new NoteBean(strM23238K, fileName, parentId, "", "0", str, str, 0, 0L, true, false, false, 0L, 7168, null);
        m4804b(new PickNoteViewModel$createFolder$1(this, fileEntity, null), new PickNoteViewModel$createFolder$2(this, null), new InterfaceC9529a() { // from class: wa.a
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return PickNoteViewModel.m16481k(this.f27882c, noteBean);
            }
        });
    }

    /* renamed from: l */
    public final void m16484l(boolean z10) {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new PickNoteViewModel$fetchFileList$1(this, z10, null), 3, null);
    }

    /* renamed from: n */
    public final MutableLiveData m16485n() {
        return this.f19540h;
    }

    /* renamed from: o */
    public final MutableLiveData m16486o() {
        return this.f19543k;
    }

    /* renamed from: p */
    public final MutableLiveData m16487p() {
        return this.f19541i;
    }

    /* renamed from: q */
    public final MutableLiveData m16488q() {
        return this.f19545m;
    }

    /* renamed from: r */
    public final Uri m16489r() {
        return this.f19537e;
    }

    /* renamed from: s */
    public final String m16490s() {
        return this.f19539g;
    }

    /* renamed from: t */
    public final MutableLiveData m16491t() {
        return this.f19542j;
    }

    /* renamed from: u */
    public final void m16492u(NoteBean parent) {
        AbstractC9979u.m20294g(parent, "parent");
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new PickNoteViewModel$insertNewFile$1(this, parent, null), 3, null);
    }

    /* renamed from: v */
    public final void m16493v(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.f19538f = str;
    }

    /* renamed from: w */
    public final void m16494w(Uri uri) {
        this.f19537e = uri;
    }

    /* renamed from: x */
    public final void m16495x(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.f19539g = str;
    }
}
