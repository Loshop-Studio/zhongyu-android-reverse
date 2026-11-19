package com.zykj.huiwei.launcher.utils;

import android.content.Context;
import android.graphics.drawable.PictureDrawable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bumptech.glide.ComponentCallbacks2C4678c;
import com.bumptech.glide.Registry;
import com.caverock.androidsvg.SVG;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p092k4.C6675a;
import p092k4.C6676b;
import p167v0.AbstractC7785a;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/utils/GlobalGlideConfig;", "Lv0/a;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/bumptech/glide/c;", "glide", "Lcom/bumptech/glide/Registry;", "registry", "", "a", "(Landroid/content/Context;Lcom/bumptech/glide/c;Lcom/bumptech/glide/Registry;)V", "", "c", "()Z", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class GlobalGlideConfig extends AbstractC7785a {
    @Override // p167v0.AbstractC7787c
    /* renamed from: a */
    public void mo2444a(Context context, ComponentCallbacks2C4678c glide, Registry registry) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(glide, "glide");
        Intrinsics.checkNotNullParameter(registry, "registry");
        registry.m2466q(SVG.class, PictureDrawable.class, new C6676b()).m2452c(InputStream.class, SVG.class, new C6675a());
    }

    @Override // p167v0.AbstractC7785a
    /* renamed from: c */
    public boolean mo2446c() {
        return false;
    }
}
