package com.zykj.huiwei.launcher.providers;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.DataStoreDelegateKt;
import androidx.datastore.core.DataStore;
import com.zykj.huiwei.launcher.proto.C6063a;
import com.zykj.huiwei.launcher.proto.C6066d;
import com.zykj.huiwei.launcher.proto.C6069g;
import com.zykj.huiwei.launcher.proto.C6072j;
import com.zykj.huiwei.launcher.proto.C6075m;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\tJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\tJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\tR%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006*\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\tR%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006*\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\tR%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006*\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\tR%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006*\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\t¨\u0006\u001d"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/datastore/core/DataStore;", "Lcom/zykj/huiwei/launcher/proto/d;", "settingDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "Lcom/zykj/huiwei/launcher/proto/g;", "studentInfoDataStore", "Lcom/zykj/huiwei/launcher/proto/m;", "userCacheBeanDataStore", "Lcom/zykj/huiwei/launcher/proto/a;", "serverBeanDataStore", "Lcom/zykj/huiwei/launcher/proto/j;", "updateSettingsDataStore", "settingDataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getSettingDataStore", "studentInfoDataStore$delegate", "getStudentInfoDataStore", "userCacheBeanDataStore$delegate", "getUserCacheBeanDataStore", "serverBeanDataStore$delegate", "getServerBeanDataStore", "updateSettingsDataStore$delegate", "getUpdateSettingsDataStore", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class LocalCacheProvide {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property2(new PropertyReference2Impl(LocalCacheProvide.class, "settingDataStore", "getSettingDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0)), Reflection.property2(new PropertyReference2Impl(LocalCacheProvide.class, "studentInfoDataStore", "getStudentInfoDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0)), Reflection.property2(new PropertyReference2Impl(LocalCacheProvide.class, "userCacheBeanDataStore", "getUserCacheBeanDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0)), Reflection.property2(new PropertyReference2Impl(LocalCacheProvide.class, "serverBeanDataStore", "getServerBeanDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0)), Reflection.property2(new PropertyReference2Impl(LocalCacheProvide.class, "updateSettingsDataStore", "getUpdateSettingsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
    public static final LocalCacheProvide INSTANCE = new LocalCacheProvide();

    /* renamed from: settingDataStore$delegate, reason: from kotlin metadata */
    private static final ReadOnlyProperty settingDataStore = DataStoreDelegateKt.dataStore$default("settings.pb", SettingsSerializer.INSTANCE, null, null, null, 28, null);

    /* renamed from: studentInfoDataStore$delegate, reason: from kotlin metadata */
    private static final ReadOnlyProperty studentInfoDataStore = DataStoreDelegateKt.dataStore$default("studentInfo.pb", StudentInfoSerializer.INSTANCE, null, null, null, 28, null);

    /* renamed from: userCacheBeanDataStore$delegate, reason: from kotlin metadata */
    private static final ReadOnlyProperty userCacheBeanDataStore = DataStoreDelegateKt.dataStore$default("userCacheBean.pb", UserCacheBeanSerializer.INSTANCE, null, null, null, 28, null);

    /* renamed from: serverBeanDataStore$delegate, reason: from kotlin metadata */
    private static final ReadOnlyProperty serverBeanDataStore = DataStoreDelegateKt.dataStore$default("serverBean.pb", ServerBeanSerializer.INSTANCE, null, null, null, 28, null);

    /* renamed from: updateSettingsDataStore$delegate, reason: from kotlin metadata */
    private static final ReadOnlyProperty updateSettingsDataStore = DataStoreDelegateKt.dataStore$default("updateSettings.pb", UpdateSettingsSerializer.INSTANCE, null, null, null, 28, null);
    public static final int $stable = 8;

    private LocalCacheProvide() {
    }

    private final DataStore<C6063a> getServerBeanDataStore(Context context) {
        return (DataStore) serverBeanDataStore.getValue(context, $$delegatedProperties[3]);
    }

    private final DataStore<C6066d> getSettingDataStore(Context context) {
        return (DataStore) settingDataStore.getValue(context, $$delegatedProperties[0]);
    }

    private final DataStore<C6069g> getStudentInfoDataStore(Context context) {
        return (DataStore) studentInfoDataStore.getValue(context, $$delegatedProperties[1]);
    }

    private final DataStore<C6072j> getUpdateSettingsDataStore(Context context) {
        return (DataStore) updateSettingsDataStore.getValue(context, $$delegatedProperties[4]);
    }

    private final DataStore<C6075m> getUserCacheBeanDataStore(Context context) {
        return (DataStore) userCacheBeanDataStore.getValue(context, $$delegatedProperties[2]);
    }

    @Singleton
    public final DataStore<C6063a> serverBeanDataStore(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getServerBeanDataStore(context);
    }

    @Singleton
    public final DataStore<C6066d> settingDataStore(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSettingDataStore(context);
    }

    @Singleton
    public final DataStore<C6069g> studentInfoDataStore(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getStudentInfoDataStore(context);
    }

    @Singleton
    public final DataStore<C6072j> updateSettingsDataStore(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getUpdateSettingsDataStore(context);
    }

    @Singleton
    public final DataStore<C6075m> userCacheBeanDataStore(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getUserCacheBeanDataStore(context);
    }
}
