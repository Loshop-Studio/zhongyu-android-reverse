package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5824d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.l */
/* loaded from: classes3.dex */
public abstract class AbstractC5832l implements InterfaceC5824d {

    /* renamed from: c */
    public final Uri f4722c;

    /* renamed from: d */
    public final ContentResolver f4723d;

    /* renamed from: e */
    public Object f4724e;

    public AbstractC5832l(ContentResolver contentResolver, Uri uri) {
        this.f4723d = contentResolver;
        this.f4722c = uri;
    }

    /* renamed from: b */
    public abstract void mo4052b(Object obj);

    @Override // com.bumptech.glide.load.data.InterfaceC5824d
    /* renamed from: c */
    public final void mo4057c(Priority priority, InterfaceC5824d.a aVar) {
        try {
            Object objMo4053d = mo4053d(this.f4722c, this.f4723d);
            this.f4724e = objMo4053d;
            aVar.mo4063d(objMo4053d);
        } catch (FileNotFoundException e10) {
            Log.isLoggable("LocalUriFetcher", 3);
            aVar.mo4062b(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5824d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5824d
    public void cleanup() {
        Object obj = this.f4724e;
        if (obj != null) {
            try {
                mo4052b(obj);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: d */
    public abstract Object mo4053d(Uri uri, ContentResolver contentResolver);

    @Override // com.bumptech.glide.load.data.InterfaceC5824d
    public DataSource getDataSource() {
        return DataSource.LOCAL;
    }
}
