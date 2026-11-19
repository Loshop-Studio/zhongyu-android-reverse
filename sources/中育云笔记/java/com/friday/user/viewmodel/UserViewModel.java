package com.friday.user.viewmodel;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.blankj.utilcode.util.PathUtils;
import com.friday.common.base.BaseViewModel;
import com.friday.common.dao.FileDao;
import com.friday.common.dao.ResourceDao;
import com.friday.common.dao.UserDao;
import com.friday.common.helper.C5962b;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9979u;
import p040c2.InterfaceC5250g2;
import p040c2.InterfaceC5308v0;
import p110d2.InterfaceC8919i;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11612u;
import sd.AbstractC11117h;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class UserViewModel extends BaseViewModel {

    /* renamed from: b */
    public final UserDao f10667b;

    /* renamed from: c */
    public final FileDao f10668c;

    /* renamed from: d */
    public final ResourceDao f10669d;

    /* renamed from: e */
    public final InterfaceC5250g2 f10670e;

    /* renamed from: f */
    public final InterfaceC5308v0 f10671f;

    /* renamed from: g */
    public final InterfaceC8919i f10672g;

    /* renamed from: h */
    public final InterfaceC11603l f10673h;

    /* renamed from: i */
    public final InterfaceC11612u f10674i;

    /* renamed from: j */
    public final String f10675j;

    /* renamed from: k */
    public final MutableLiveData f10676k;

    /* renamed from: l */
    public final MutableState f10677l;

    /* renamed from: com.friday.user.viewmodel.UserViewModel$a */
    public static final class C6330a extends TypeToken<ArrayList<String>> {
    }

    public UserViewModel(UserDao userDao, FileDao fileDao, ResourceDao resourceDao, InterfaceC5250g2 shareCacheDao, InterfaceC5308v0 imageSafetyDao, InterfaceC8919i ezyService) {
        AbstractC9979u.m20294g(userDao, "userDao");
        AbstractC9979u.m20294g(fileDao, "fileDao");
        AbstractC9979u.m20294g(resourceDao, "resourceDao");
        AbstractC9979u.m20294g(shareCacheDao, "shareCacheDao");
        AbstractC9979u.m20294g(imageSafetyDao, "imageSafetyDao");
        AbstractC9979u.m20294g(ezyService, "ezyService");
        this.f10667b = userDao;
        this.f10668c = fileDao;
        this.f10669d = resourceDao;
        this.f10670e = shareCacheDao;
        this.f10671f = imageSafetyDao;
        this.f10672g = ezyService;
        m7826o();
        InterfaceC11603l interfaceC11603lM25602a = AbstractC11613v.m25602a("");
        this.f10673h = interfaceC11603lM25602a;
        this.f10674i = AbstractC11596e.m25552b(interfaceC11603lM25602a);
        String externalAppDataPath = PathUtils.getExternalAppDataPath();
        String str = File.separator;
        this.f10675j = externalAppDataPath + str + "share" + str + C5962b.f6082a.m5299a().m5292t();
        this.f10676k = new MutableLiveData();
        this.f10677l = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* renamed from: m */
    public final void m7824m() {
        BaseViewModel.m4802c(this, new UserViewModel$clearCache$1(this, null), new UserViewModel$clearCache$2(this, null), null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7825n(java.lang.String r17, java.lang.String r18, java.util.List r19, java.util.List r20, vc.InterfaceC11588c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.user.viewmodel.UserViewModel.m7825n(java.lang.String, java.lang.String, java.util.List, java.util.List, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes5/com/friday/user/viewmodel/UserViewModel.smali:424
    }

    /* renamed from: o */
    public final void m7826o() {
        BaseViewModel.m4802c(this, new UserViewModel$getName$1(this, null), new UserViewModel$getName$2(null), null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public final boolean m7827p() {
        return ((Boolean) this.f10677l.getValue()).booleanValue();
    }

    /* renamed from: q */
    public final InterfaceC11612u m7828q() {
        return this.f10674i;
    }

    /* renamed from: r */
    public final MutableLiveData m7829r() {
        return this.f10676k;
    }

    /* renamed from: s */
    public final void m7830s(boolean z10) {
        this.f10677l.setValue(Boolean.valueOf(z10));
    }

    /* renamed from: t */
    public final void m7831t() {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new UserViewModel$uploadLog$1(this, null), 3, null);
    }
}
