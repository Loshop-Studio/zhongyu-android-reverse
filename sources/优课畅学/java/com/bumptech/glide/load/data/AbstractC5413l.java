package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5405d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.l */
/* loaded from: classes3.dex */
public abstract class AbstractC5413l implements InterfaceC5405d {

    /* renamed from: a */
    public final Uri f2952a;

    /* renamed from: b */
    public final ContentResolver f2953b;

    /* renamed from: c */
    public Object f2954c;

    public AbstractC5413l(ContentResolver contentResolver, Uri uri) {
        this.f2953b = contentResolver;
        this.f2952a = uri;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5405d
    /* renamed from: b */
    public void mo2851b() {
        Object obj = this.f2954c;
        if (obj != null) {
            try {
                mo2847c(obj);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public abstract void mo2847c(Object obj);

    @Override // com.bumptech.glide.load.data.InterfaceC5405d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5405d
    /* renamed from: d */
    public final void mo2853d(Priority priority, InterfaceC5405d.a aVar) {
        try {
            Object objMo2848e = mo2848e(this.f2952a, this.f2953b);
            this.f2954c = objMo2848e;
            aVar.mo2859e(objMo2848e);
        } catch (FileNotFoundException e10) {
            Log.isLoggable("LocalUriFetcher", 3);
            aVar.mo2858c(e10);
        }
    }

    /* renamed from: e */
    public abstract Object mo2848e(Uri uri, ContentResolver contentResolver);

    @Override // com.bumptech.glide.load.data.InterfaceC5405d
    public DataSource getDataSource() {
        return DataSource.LOCAL;
    }
}
