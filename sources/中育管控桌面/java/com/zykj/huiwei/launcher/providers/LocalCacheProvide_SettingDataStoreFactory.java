package com.zykj.huiwei.launcher.providers;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import android.content.Context;
import androidx.datastore.core.DataStore;
import com.zykj.huiwei.launcher.proto.C6066d;
import p006a5.AbstractC0016e;
import p006a5.InterfaceC0017f;

/* loaded from: classes4.dex */
public final class LocalCacheProvide_SettingDataStoreFactory implements InterfaceC0017f {
    private final InterfaceC0017f contextProvider;

    private LocalCacheProvide_SettingDataStoreFactory(InterfaceC0017f interfaceC0017f) {
        this.contextProvider = interfaceC0017f;
    }

    public static LocalCacheProvide_SettingDataStoreFactory create(InterfaceC0017f interfaceC0017f) {
        return new LocalCacheProvide_SettingDataStoreFactory(interfaceC0017f);
    }

    public static DataStore<C6066d> settingDataStore(Context context) {
        return (DataStore) AbstractC0016e.m26c(LocalCacheProvide.INSTANCE.settingDataStore(context));
    }

    @Override // javax.inject.Provider
    public DataStore<C6066d> get() {
        return settingDataStore((Context) this.contextProvider.get());
    }
}
