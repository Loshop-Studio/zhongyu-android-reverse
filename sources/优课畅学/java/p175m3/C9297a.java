package p175m3;

import android.content.Context;
import androidx.datastore.DataStoreDelegateKt;
import androidx.datastore.core.DataStore;
import com.zykj.lib.login.provide.ServerBeanSerializer;
import com.zykj.lib.login.provide.UserBeanSerializer;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.PropertyReference2Impl;
import p009a8.InterfaceC0048d;
import p089e8.InterfaceC8383k;

/* renamed from: m3.a */
/* loaded from: classes4.dex */
public final class C9297a {

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC8383k[] f18322b = {AbstractC9137y.m16160h(new PropertyReference2Impl(C9297a.class, "userDataStore", "getUserDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0)), AbstractC9137y.m16160h(new PropertyReference2Impl(C9297a.class, "serverDataStore", "getServerDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* renamed from: a */
    public static final C9297a f18321a = new C9297a();

    /* renamed from: c */
    public static final InterfaceC0048d f18323c = DataStoreDelegateKt.dataStore$default("UserBean.pb", UserBeanSerializer.f9918a, null, null, null, 28, null);

    /* renamed from: d */
    public static final InterfaceC0048d f18324d = DataStoreDelegateKt.dataStore$default("ServerBean.pb", ServerBeanSerializer.f9909a, null, null, null, 28, null);

    /* renamed from: e */
    public static final int f18325e = 8;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a8.d, com.tencent.smtt.audio.core.utils.TbsDialogBase$Builder] */
    /* renamed from: a */
    public final DataStore m17100a(Context context) {
        ?? r02 = f18324d;
        InterfaceC8383k interfaceC8383k = f18322b[1];
        return (DataStore) r02.setMessage(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a8.d, com.tencent.smtt.audio.core.utils.TbsDialogBase$Builder] */
    /* renamed from: b */
    public final DataStore m17101b(Context context) {
        ?? r02 = f18323c;
        InterfaceC8383k interfaceC8383k = f18322b[0];
        return (DataStore) r02.setMessage(context);
    }

    /* renamed from: c */
    public final DataStore m17102c(Context context) {
        AbstractC9133u.m16133g(context, "context");
        return m17100a(context);
    }

    /* renamed from: d */
    public final DataStore m17103d(Context context) {
        AbstractC9133u.m16133g(context, "context");
        return m17101b(context);
    }
}
