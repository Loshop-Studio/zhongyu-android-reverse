package p242s4;

import android.content.Context;
import androidx.datastore.DataStoreDelegateKt;
import androidx.datastore.core.DataStore;
import com.zykj.study.bean.ClientCodeLiveData;
import com.zykj.study.bean.DataStoreManager;
import com.zykj.study.provide.SettingsSerializer;
import com.zykj.study.repository.RefreshRepositoryImp;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.PropertyReference2Impl;
import p009a8.InterfaceC0048d;
import p089e8.InterfaceC8383k;
import p130i3.AbstractC8756a;
import p169l8.InterfaceC9270g;
import p169l8.InterfaceC9271h;
import p198o4.InterfaceC9525h;

/* renamed from: s4.w */
/* loaded from: classes3.dex */
public final class C10010w {

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC8383k[] f20026b = {AbstractC9137y.m16160h(new PropertyReference2Impl(C10010w.class, "settingsDataStore", "getSettingsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* renamed from: a */
    public static final C10010w f20025a = new C10010w();

    /* renamed from: c */
    public static final InterfaceC0048d f20027c = DataStoreDelegateKt.dataStore$default("settings.pb", SettingsSerializer.f11292a, null, null, null, 28, null);

    /* renamed from: d */
    public static final int f20028d = 8;

    /* renamed from: a */
    public final DataStoreManager m18705a(Context appContext) {
        AbstractC9133u.m16133g(appContext, "appContext");
        return new DataStoreManager(appContext);
    }

    /* renamed from: b */
    public final ClientCodeLiveData m18706b() {
        return new ClientCodeLiveData();
    }

    /* renamed from: c */
    public final AbstractC8756a m18707c(InterfaceC9525h autoService, DataStore serverBeanDataStore, InterfaceC9270g unauthorizedFlow, InterfaceC9271h headerLiveData, ClientCodeLiveData clientCodeLiveData) {
        AbstractC9133u.m16133g(autoService, "autoService");
        AbstractC9133u.m16133g(serverBeanDataStore, "serverBeanDataStore");
        AbstractC9133u.m16133g(unauthorizedFlow, "unauthorizedFlow");
        AbstractC9133u.m16133g(headerLiveData, "headerLiveData");
        AbstractC9133u.m16133g(clientCodeLiveData, "clientCodeLiveData");
        return new RefreshRepositoryImp(autoService, serverBeanDataStore, unauthorizedFlow, headerLiveData, clientCodeLiveData);
    }
}
