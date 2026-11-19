package p081k;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import p081k.InterfaceC3843d;

/* renamed from: k.l */
/* loaded from: classes2.dex */
public abstract class AbstractC3851l implements InterfaceC3843d {

    /* renamed from: a */
    public final Uri f4758a;

    /* renamed from: b */
    public final ContentResolver f4759b;

    /* renamed from: c */
    public Object f4760c;

    public AbstractC3851l(ContentResolver contentResolver, Uri uri) {
        this.f4759b = contentResolver;
        this.f4758a = uri;
    }

    @Override // p081k.InterfaceC3843d
    /* renamed from: b */
    public void mo5119b() {
        Object obj = this.f4760c;
        if (obj != null) {
            try {
                mo5115c(obj);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public abstract void mo5115c(Object obj);

    @Override // p081k.InterfaceC3843d
    public void cancel() {
    }

    @Override // p081k.InterfaceC3843d
    /* renamed from: d */
    public DataSource mo5121d() {
        return DataSource.LOCAL;
    }

    /* renamed from: e */
    public abstract Object mo5116e(Uri uri, ContentResolver contentResolver);

    @Override // p081k.InterfaceC3843d
    /* renamed from: f */
    public final void mo5123f(Priority priority, InterfaceC3843d.a aVar) {
        try {
            Object objMo5116e = mo5116e(this.f4758a, this.f4759b);
            this.f4760c = objMo5116e;
            aVar.mo1830e(objMo5116e);
        } catch (FileNotFoundException e4) {
            Log.isLoggable("LocalUriFetcher", 3);
            aVar.mo1829c(e4);
        }
    }
}
