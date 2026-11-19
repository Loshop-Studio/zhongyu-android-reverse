package p132i0;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import p132i0.InterfaceC8115d;

/* renamed from: i0.l */
/* loaded from: classes3.dex */
public abstract class AbstractC8123l implements InterfaceC8115d {

    /* renamed from: a */
    public final Uri f13890a;

    /* renamed from: b */
    public final ContentResolver f13891b;

    /* renamed from: c */
    public Object f13892c;

    public AbstractC8123l(ContentResolver contentResolver, Uri uri) {
        this.f13891b = contentResolver;
        this.f13890a = uri;
    }

    @Override // p132i0.InterfaceC8115d
    /* renamed from: b */
    public void mo12983b() {
        Object obj = this.f13892c;
        if (obj != null) {
            try {
                mo12979c(obj);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public abstract void mo12979c(Object obj);

    @Override // p132i0.InterfaceC8115d
    /* renamed from: d */
    public final void mo12985d(Priority priority, InterfaceC8115d.a aVar) {
        try {
            Object objMo12980f = mo12980f(this.f13890a, this.f13891b);
            this.f13892c = objMo12980f;
            aVar.mo3155f(objMo12980f);
        } catch (FileNotFoundException e10) {
            Log.isLoggable("LocalUriFetcher", 3);
            aVar.mo3154c(e10);
        }
    }

    @Override // p132i0.InterfaceC8115d
    /* renamed from: e */
    public DataSource mo12986e() {
        return DataSource.LOCAL;
    }

    /* renamed from: f */
    public abstract Object mo12980f(Uri uri, ContentResolver contentResolver);

    @Override // p132i0.InterfaceC8115d
    public void cancel() {
    }
}
