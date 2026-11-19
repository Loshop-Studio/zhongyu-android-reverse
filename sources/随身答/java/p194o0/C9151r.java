package p194o0;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;
import p122h0.C8084d;
import p194o0.InterfaceC9146m;

/* renamed from: o0.r */
/* loaded from: classes3.dex */
public class C9151r implements InterfaceC9146m {

    /* renamed from: a */
    public final InterfaceC9146m f15449a;

    /* renamed from: b */
    public final Resources f15450b;

    /* renamed from: o0.r$a */
    public static final class a implements InterfaceC9147n {

        /* renamed from: a */
        public final Resources f15451a;

        public a(Resources resources) {
            this.f15451a = resources;
        }

        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public InterfaceC9146m mo14660b(C9150q c9150q) {
            return new C9151r(this.f15451a, c9150q.m14716d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: o0.r$b */
    public static class b implements InterfaceC9147n {

        /* renamed from: a */
        public final Resources f15452a;

        public b(Resources resources) {
            this.f15452a = resources;
        }

        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public InterfaceC9146m mo14660b(C9150q c9150q) {
            return new C9151r(this.f15452a, c9150q.m14716d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: o0.r$c */
    public static class c implements InterfaceC9147n {

        /* renamed from: a */
        public final Resources f15453a;

        public c(Resources resources) {
            this.f15453a = resources;
        }

        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public InterfaceC9146m mo14660b(C9150q c9150q) {
            return new C9151r(this.f15453a, c9150q.m14716d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: o0.r$d */
    public static class d implements InterfaceC9147n {

        /* renamed from: a */
        public final Resources f15454a;

        public d(Resources resources) {
            this.f15454a = resources;
        }

        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public InterfaceC9146m mo14660b(C9150q c9150q) {
            return new C9151r(this.f15454a, C9154u.m14730c());
        }
    }

    public C9151r(Resources resources, InterfaceC9146m interfaceC9146m) {
        this.f15450b = resources;
        this.f15449a = interfaceC9146m;
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9146m.a mo14656b(Integer num, int i9, int i10, C8084d c8084d) {
        Uri uriM14723d = m14723d(num);
        if (uriM14723d == null) {
            return null;
        }
        return this.f15449a.mo14656b(uriM14723d, i9, i10, c8084d);
    }

    /* renamed from: d */
    public final Uri m14723d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f15450b.getResourcePackageName(num.intValue()) + '/' + this.f15450b.getResourceTypeName(num.intValue()) + '/' + this.f15450b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
            return null;
        }
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo14655a(Integer num) {
        return true;
    }
}
