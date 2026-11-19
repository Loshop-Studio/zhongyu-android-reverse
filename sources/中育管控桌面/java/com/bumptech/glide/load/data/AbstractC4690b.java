package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC4692d;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.b */
/* loaded from: classes3.dex */
public abstract class AbstractC4690b implements InterfaceC4692d {

    /* renamed from: a */
    public final String f2286a;

    /* renamed from: b */
    public final AssetManager f2287b;

    /* renamed from: c */
    public Object f2288c;

    public AbstractC4690b(AssetManager assetManager, String str) {
        this.f2287b = assetManager;
        this.f2286a = str;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4692d
    /* renamed from: b */
    public void mo2585b() {
        Object obj = this.f2288c;
        if (obj == null) {
            return;
        }
        try {
            mo2586c(obj);
        } catch (IOException unused) {
        }
    }

    /* renamed from: c */
    public abstract void mo2586c(Object obj);

    @Override // com.bumptech.glide.load.data.InterfaceC4692d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4692d
    /* renamed from: d */
    public DataSource mo2587d() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4692d
    /* renamed from: e */
    public void mo2588e(Priority priority, InterfaceC4692d.a aVar) {
        try {
            Object objMo2589f = mo2589f(this.f2287b, this.f2286a);
            this.f2288c = objMo2589f;
            aVar.mo2594f(objMo2589f);
        } catch (IOException e6) {
            Log.isLoggable("AssetPathFetcher", 3);
            aVar.mo2593c(e6);
        }
    }

    /* renamed from: f */
    public abstract Object mo2589f(AssetManager assetManager, String str);
}
