package com.zykj.study.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.zykj.base.BaseViewModel;
import com.zykj.study.R$color;
import kotlin.jvm.internal.AbstractC9133u;
import p135i8.AbstractC8839h;
import p169l8.AbstractC9276m;
import p169l8.InterfaceC9270g;
import p198o4.InterfaceC9528k;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class HomeViewModel extends BaseViewModel {

    /* renamed from: a */
    public final DataStore f14184a;

    /* renamed from: b */
    public final InterfaceC9528k f14185b;

    /* renamed from: c */
    public final InterfaceC9270g f14186c;

    /* renamed from: d */
    public final MutableLiveData f14187d;

    /* renamed from: e */
    public final int f14188e;

    /* renamed from: f */
    public final int f14189f;

    public HomeViewModel(DataStore userDataStore, InterfaceC9528k updateApi) {
        AbstractC9133u.m16133g(userDataStore, "userDataStore");
        AbstractC9133u.m16133g(updateApi, "updateApi");
        this.f14184a = userDataStore;
        this.f14185b = updateApi;
        this.f14186c = AbstractC9276m.m17044b(0, 0, null, 7, null);
        this.f14187d = new MutableLiveData(0);
        this.f14188e = R$color.menu_text_color_select;
        this.f14189f = R$color.menu_text_color_normal;
    }

    /* renamed from: b */
    public final void m12175b() {
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$checkVersion$1(this, null), 3, null);
    }

    /* renamed from: c */
    public final InterfaceC9270g m12176c() {
        return this.f14186c;
    }

    /* renamed from: d */
    public final MutableLiveData m12177d() {
        return this.f14187d;
    }

    /* renamed from: e */
    public final DataStore m12178e() {
        return this.f14184a;
    }

    /* renamed from: f */
    public final void m12179f(int i10) {
        this.f14187d.setValue(Integer.valueOf(i10));
    }
}
