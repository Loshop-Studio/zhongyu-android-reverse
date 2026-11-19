package p110q;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;
import p076j.C3794d;
import p110q.InterfaceC4464m;

/* renamed from: q.r */
/* loaded from: classes2.dex */
public class C4469r implements InterfaceC4464m {

    /* renamed from: a */
    public final InterfaceC4464m f5218a;

    /* renamed from: b */
    public final Resources f5219b;

    /* renamed from: q.r$a */
    public static final class a implements InterfaceC4465n {

        /* renamed from: a */
        public final Resources f5220a;

        public a(Resources resources) {
            this.f5220a = resources;
        }

        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4469r(this.f5220a, c4468q.m5732d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: q.r$b */
    public static class b implements InterfaceC4465n {

        /* renamed from: a */
        public final Resources f5221a;

        public b(Resources resources) {
            this.f5221a = resources;
        }

        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4469r(this.f5221a, c4468q.m5732d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: q.r$c */
    public static class c implements InterfaceC4465n {

        /* renamed from: a */
        public final Resources f5222a;

        public c(Resources resources) {
            this.f5222a = resources;
        }

        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4469r(this.f5222a, c4468q.m5732d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: q.r$d */
    public static class d implements InterfaceC4465n {

        /* renamed from: a */
        public final Resources f5223a;

        public d(Resources resources) {
            this.f5223a = resources;
        }

        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4469r(this.f5223a, C4472u.m5746c());
        }
    }

    public C4469r(Resources resources, InterfaceC4464m interfaceC4464m) {
        this.f5219b = resources;
        this.f5218a = interfaceC4464m;
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4464m.a mo5671b(Integer num, int i4, int i5, C3794d c3794d) {
        Uri uriM5739d = m5739d(num);
        if (uriM5739d == null) {
            return null;
        }
        return this.f5218a.mo5671b(uriM5739d, i4, i5, c3794d);
    }

    /* renamed from: d */
    public final Uri m5739d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f5219b.getResourcePackageName(num.intValue()) + '/' + this.f5219b.getResourceTypeName(num.intValue()) + '/' + this.f5219b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e4) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e4);
            return null;
        }
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo5670a(Integer num) {
        return true;
    }
}
