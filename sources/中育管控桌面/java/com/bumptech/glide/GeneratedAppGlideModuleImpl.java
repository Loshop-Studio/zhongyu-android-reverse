package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.zykj.huiwei.launcher.utils.GlobalGlideConfig;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* renamed from: a */
    public final GlobalGlideConfig f2148a = new GlobalGlideConfig();

    public GeneratedAppGlideModuleImpl(Context context) {
        Log.isLoggable("Glide", 3);
    }

    @Override // p167v0.AbstractC7787c
    /* renamed from: a */
    public void mo2444a(Context context, ComponentCallbacks2C4678c componentCallbacks2C4678c, Registry registry) {
        this.f2148a.mo2444a(context, componentCallbacks2C4678c, registry);
    }

    @Override // p167v0.AbstractC7785a
    /* renamed from: b */
    public void mo2445b(Context context, C4679d c4679d) {
        this.f2148a.mo2445b(context, c4679d);
    }

    @Override // p167v0.AbstractC7785a
    /* renamed from: c */
    public boolean mo2446c() {
        return this.f2148a.mo2446c();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    /* renamed from: d */
    public Set mo2442d() {
        return Collections.EMPTY_SET;
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C4676a mo2443e() {
        return new C4676a();
    }
}
