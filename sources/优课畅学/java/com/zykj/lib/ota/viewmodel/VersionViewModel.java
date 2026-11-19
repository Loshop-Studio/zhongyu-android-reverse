package com.zykj.lib.ota.viewmodel;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.datastore.core.DataStore;
import androidx.lifecycle.MutableLiveData;
import com.zykj.base.BaseViewModel;
import com.zykj.lib.ota.bean.AppType;
import kotlin.jvm.internal.AbstractC9133u;
import p274v3.AbstractC10241a;

/* loaded from: classes4.dex */
public final class VersionViewModel extends BaseViewModel {

    /* renamed from: a */
    public final AbstractC10241a f10306a;

    /* renamed from: b */
    public final DataStore f10307b;

    /* renamed from: c */
    public final MutableLiveData f10308c;

    /* renamed from: d */
    public final MutableLiveData f10309d;

    /* renamed from: e */
    public final MutableLiveData f10310e;

    /* renamed from: f */
    public final MutableLiveData f10311f;

    /* renamed from: g */
    public final MutableLiveData f10312g;

    /* renamed from: h */
    public final MutableLiveData f10313h;

    /* renamed from: i */
    public final MutableLiveData f10314i;

    public VersionViewModel(AbstractC10241a versionRepository, DataStore settings) {
        AbstractC9133u.m16133g(versionRepository, "versionRepository");
        AbstractC9133u.m16133g(settings, "settings");
        this.f10306a = versionRepository;
        this.f10307b = settings;
        this.f10308c = new MutableLiveData();
        this.f10309d = new MutableLiveData(0);
        this.f10310e = new MutableLiveData();
        this.f10311f = new MutableLiveData();
        this.f10312g = new MutableLiveData();
        this.f10313h = new MutableLiveData();
        this.f10314i = new MutableLiveData();
    }

    /* renamed from: a */
    public final void m9489a() {
        this.f10311f.setValue(Boolean.TRUE);
    }

    /* renamed from: b */
    public final MutableLiveData m9490b() {
        return this.f10311f;
    }

    /* renamed from: c */
    public final MutableLiveData m9491c() {
        return this.f10313h;
    }

    /* renamed from: d */
    public final MutableLiveData m9492d() {
        return this.f10309d;
    }

    /* renamed from: e */
    public final MutableLiveData m9493e() {
        return this.f10314i;
    }

    /* renamed from: f */
    public final MutableLiveData m9494f() {
        return this.f10312g;
    }

    /* renamed from: g */
    public final void m9495g(String packageName, int i10, AppType appType) {
        AbstractC9133u.m16133g(packageName, "packageName");
        AbstractC9133u.m16133g(appType, "appType");
        launchData(getToastLiveData(), isDialogVisible(), new VersionViewModel$getVersionInfo$1(this, packageName, i10, appType, null));
    }

    /* renamed from: h */
    public final AbstractC10241a m9496h() {
        return this.f10306a;
    }

    /* renamed from: i */
    public final MutableLiveData m9497i() {
        return this.f10308c;
    }

    /* renamed from: j */
    public final void m9498j() {
        this.f10313h.setValue(Boolean.TRUE);
    }

    /* renamed from: k */
    public final void m9499k() {
        this.f10314i.setValue(Boolean.FALSE);
        m9500l();
    }

    /* renamed from: l */
    public final void m9500l() {
        this.f10312g.setValue(Boolean.TRUE);
    }
}
