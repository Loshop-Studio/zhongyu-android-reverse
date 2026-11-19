package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5405d;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.b */
/* loaded from: classes3.dex */
public abstract class AbstractC5403b implements InterfaceC5405d {

    /* renamed from: a */
    public final String f2928a;

    /* renamed from: b */
    public final AssetManager f2929b;

    /* renamed from: c */
    public Object f2930c;

    public AbstractC5403b(AssetManager assetManager, String str) {
        this.f2929b = assetManager;
        this.f2928a = str;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5405d
    /* renamed from: b */
    public void mo2851b() {
        Object obj = this.f2930c;
        if (obj == null) {
            return;
        }
        try {
            mo2852c(obj);
        } catch (IOException unused) {
        }
    }

    /* renamed from: c */
    public abstract void mo2852c(Object obj);

    @Override // com.bumptech.glide.load.data.InterfaceC5405d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5405d
    /* renamed from: d */
    public void mo2853d(Priority priority, InterfaceC5405d.a aVar) {
        try {
            Object objMo2854e = mo2854e(this.f2929b, this.f2928a);
            this.f2930c = objMo2854e;
            aVar.mo2859e(objMo2854e);
        } catch (IOException e10) {
            Log.isLoggable("AssetPathFetcher", 3);
            aVar.mo2858c(e10);
        }
    }

    /* renamed from: e */
    public abstract Object mo2854e(AssetManager assetManager, String str);

    @Override // com.bumptech.glide.load.data.InterfaceC5405d
    public DataSource getDataSource() {
        return DataSource.LOCAL;
    }
}
