package p263u3;

import android.content.Context;
import androidx.datastore.DataStoreDelegateKt;
import androidx.datastore.core.DataStore;
import com.zykj.lib.ota.provide.UpdateSettingsSerializer;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.PropertyReference2Impl;
import p009a8.InterfaceC0048d;
import p089e8.InterfaceC8383k;

/* renamed from: u3.a */
/* loaded from: classes4.dex */
public final class C10168a {

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC8383k[] f20305b = {AbstractC9137y.m16160h(new PropertyReference2Impl(C10168a.class, "updateSettingsDataStore", "getUpdateSettingsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* renamed from: a */
    public static final C10168a f20304a = new C10168a();

    /* renamed from: c */
    public static final InterfaceC0048d f20306c = DataStoreDelegateKt.dataStore$default("updateSettings.pb", UpdateSettingsSerializer.f10275a, null, null, null, 28, null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a8.d, com.tencent.smtt.audio.core.utils.TbsDialogBase$Builder] */
    /* renamed from: a */
    public final DataStore m19037a(Context context) {
        ?? r02 = f20306c;
        InterfaceC8383k interfaceC8383k = f20305b[0];
        return (DataStore) r02.setMessage(context);
    }

    /* renamed from: b */
    public final DataStore m19038b(Context context) {
        AbstractC9133u.m16133g(context, "context");
        return m19037a(context);
    }
}
