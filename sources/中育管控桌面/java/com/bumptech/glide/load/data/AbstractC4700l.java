package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC4692d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.l */
/* loaded from: classes3.dex */
public abstract class AbstractC4700l implements InterfaceC4692d {

    /* renamed from: a */
    public final Uri f2310a;

    /* renamed from: b */
    public final ContentResolver f2311b;

    /* renamed from: c */
    public Object f2312c;

    public AbstractC4700l(ContentResolver contentResolver, Uri uri) {
        this.f2311b = contentResolver;
        this.f2310a = uri;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4692d
    /* renamed from: b */
    public void mo2585b() {
        Object obj = this.f2312c;
        if (obj != null) {
            try {
                mo2581c(obj);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public abstract void mo2581c(Object obj);

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
    public final void mo2588e(Priority priority, InterfaceC4692d.a aVar) {
        try {
            Object objMo2582f = mo2582f(this.f2310a, this.f2311b);
            this.f2312c = objMo2582f;
            aVar.mo2594f(objMo2582f);
        } catch (FileNotFoundException e6) {
            Log.isLoggable("LocalUriFetcher", 3);
            aVar.mo2593c(e6);
        }
    }

    /* renamed from: f */
    public abstract Object mo2582f(Uri uri, ContentResolver contentResolver);
}
