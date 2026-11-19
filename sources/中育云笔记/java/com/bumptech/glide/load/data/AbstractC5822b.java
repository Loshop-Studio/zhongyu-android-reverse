package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5824d;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.b */
/* loaded from: classes3.dex */
public abstract class AbstractC5822b implements InterfaceC5824d {

    /* renamed from: c */
    public final String f4698c;

    /* renamed from: d */
    public final AssetManager f4699d;

    /* renamed from: e */
    public Object f4700e;

    public AbstractC5822b(AssetManager assetManager, String str) {
        this.f4699d = assetManager;
        this.f4698c = str;
    }

    /* renamed from: b */
    public abstract void mo4056b(Object obj);

    @Override // com.bumptech.glide.load.data.InterfaceC5824d
    /* renamed from: c */
    public void mo4057c(Priority priority, InterfaceC5824d.a aVar) {
        try {
            Object objMo4058d = mo4058d(this.f4699d, this.f4698c);
            this.f4700e = objMo4058d;
            aVar.mo4063d(objMo4058d);
        } catch (IOException e10) {
            Log.isLoggable("AssetPathFetcher", 3);
            aVar.mo4062b(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5824d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5824d
    public void cleanup() {
        Object obj = this.f4700e;
        if (obj == null) {
            return;
        }
        try {
            mo4056b(obj);
        } catch (IOException unused) {
        }
    }

    /* renamed from: d */
    public abstract Object mo4058d(AssetManager assetManager, String str);

    @Override // com.bumptech.glide.load.data.InterfaceC5824d
    public DataSource getDataSource() {
        return DataSource.LOCAL;
    }
}
