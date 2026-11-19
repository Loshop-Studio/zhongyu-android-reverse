package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5356d;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.b */
/* loaded from: classes3.dex */
public abstract class AbstractC5354b implements InterfaceC5356d {

    /* renamed from: a */
    public final String f3495a;

    /* renamed from: b */
    public final AssetManager f3496b;

    /* renamed from: c */
    public Object f3497c;

    public AbstractC5354b(AssetManager assetManager, String str) {
        this.f3496b = assetManager;
        this.f3495a = str;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5356d
    /* renamed from: b */
    public void mo3404b() {
        Object obj = this.f3497c;
        if (obj == null) {
            return;
        }
        try {
            mo3405c(obj);
        } catch (IOException unused) {
        }
    }

    /* renamed from: c */
    public abstract void mo3405c(Object obj);

    @Override // com.bumptech.glide.load.data.InterfaceC5356d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5356d
    /* renamed from: d */
    public DataSource mo3406d() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5356d
    /* renamed from: e */
    public void mo3407e(Priority priority, InterfaceC5356d.a aVar) {
        try {
            Object objMo3408f = mo3408f(this.f3496b, this.f3495a);
            this.f3497c = objMo3408f;
            aVar.mo3413f(objMo3408f);
        } catch (IOException e10) {
            Log.isLoggable("AssetPathFetcher", 3);
            aVar.mo3412c(e10);
        }
    }

    /* renamed from: f */
    public abstract Object mo3408f(AssetManager assetManager, String str);
}
