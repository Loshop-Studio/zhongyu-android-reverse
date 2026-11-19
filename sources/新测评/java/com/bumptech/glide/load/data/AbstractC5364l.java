package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5356d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.l */
/* loaded from: classes3.dex */
public abstract class AbstractC5364l implements InterfaceC5356d {

    /* renamed from: a */
    public final Uri f3519a;

    /* renamed from: b */
    public final ContentResolver f3520b;

    /* renamed from: c */
    public Object f3521c;

    public AbstractC5364l(ContentResolver contentResolver, Uri uri) {
        this.f3520b = contentResolver;
        this.f3519a = uri;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5356d
    /* renamed from: b */
    public void mo3404b() {
        Object obj = this.f3521c;
        if (obj != null) {
            try {
                mo3400c(obj);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public abstract void mo3400c(Object obj);

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
    public final void mo3407e(Priority priority, InterfaceC5356d.a aVar) {
        try {
            Object objMo3401f = mo3401f(this.f3519a, this.f3520b);
            this.f3521c = objMo3401f;
            aVar.mo3413f(objMo3401f);
        } catch (FileNotFoundException e10) {
            Log.isLoggable("LocalUriFetcher", 3);
            aVar.mo3412c(e10);
        }
    }

    /* renamed from: f */
    public abstract Object mo3401f(Uri uri, ContentResolver contentResolver);
}
