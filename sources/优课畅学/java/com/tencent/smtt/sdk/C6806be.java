package com.tencent.smtt.sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.tencent.smtt.export.external.DexLoader;
import dalvik.system.DexClassLoader;

/* renamed from: com.tencent.smtt.sdk.be */
/* loaded from: classes4.dex */
class C6806be {

    /* renamed from: a */
    protected DexLoader f6860a;

    public C6806be(DexLoader dexLoader) {
        this.f6860a = dexLoader;
    }

    /* renamed from: a */
    public Object m6148a(Context context) {
        DexLoader dexLoader = this.f6860a;
        return dexLoader.newInstance("com.tencent.tbs.player.TbsPlayerProxy", new Class[]{Context.class, DexClassLoader.class}, context, dexLoader.getClassLoader());
    }

    /* renamed from: a */
    public void m6149a(Object obj) {
        this.f6860a.invokeMethod(obj, "com.tencent.tbs.player.TbsPlayerProxy", "onUserStateChanged", new Class[0], new Object[0]);
    }

    /* renamed from: a */
    public void m6150a(Object obj, Activity activity, int i10) {
        this.f6860a.invokeMethod(obj, "com.tencent.tbs.player.TbsPlayerProxy", "onActivity", new Class[]{Activity.class, Integer.TYPE}, activity, Integer.valueOf(i10));
    }

    /* renamed from: a */
    public boolean m6151a(Object obj, Bundle bundle, FrameLayout frameLayout, Object obj2) {
        Object objInvokeMethod = obj2 != null ? this.f6860a.invokeMethod(obj, "com.tencent.tbs.player.TbsPlayerProxy", "play", new Class[]{Bundle.class, FrameLayout.class, Object.class}, bundle, frameLayout, obj2) : this.f6860a.invokeMethod(obj, "com.tencent.tbs.player.TbsPlayerProxy", "play", new Class[]{Bundle.class, FrameLayout.class}, bundle, frameLayout);
        if (objInvokeMethod instanceof Boolean) {
            return ((Boolean) objInvokeMethod).booleanValue();
        }
        return false;
    }
}
