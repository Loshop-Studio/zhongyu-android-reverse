package p097l0;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import p053f0.C6285d;
import p097l0.InterfaceC7280n;

/* renamed from: l0.s */
/* loaded from: classes3.dex */
public class C7285s implements InterfaceC7280n {

    /* renamed from: a */
    public final InterfaceC7280n f9255a;

    /* renamed from: b */
    public final Resources f9256b;

    /* renamed from: l0.s$a */
    public static final class a implements InterfaceC7281o {

        /* renamed from: a */
        public final Resources f9257a;

        public a(Resources resources) {
            this.f9257a = resources;
        }

        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7285s(this.f9257a, c7284r.m8265d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: l0.s$b */
    public static class b implements InterfaceC7281o {

        /* renamed from: a */
        public final Resources f9258a;

        public b(Resources resources) {
            this.f9258a = resources;
        }

        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7285s(this.f9258a, c7284r.m8265d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: l0.s$c */
    public static class c implements InterfaceC7281o {

        /* renamed from: a */
        public final Resources f9259a;

        public c(Resources resources) {
            this.f9259a = resources;
        }

        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7285s(this.f9259a, C7289w.m8285c());
        }
    }

    public C7285s(Resources resources, InterfaceC7280n interfaceC7280n) {
        this.f9256b = resources;
        this.f9255a = interfaceC7280n;
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC7280n.a mo8191b(Integer num, int i6, int i7, C6285d c6285d) {
        Uri uriM8272d = m8272d(num);
        if (uriM8272d == null) {
            return null;
        }
        return this.f9255a.mo8191b(uriM8272d, i6, i7, c6285d);
    }

    /* renamed from: d */
    public final Uri m8272d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f9256b.getResourcePackageName(num.intValue()) + '/' + this.f9256b.getResourceTypeName(num.intValue()) + '/' + this.f9256b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e6) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e6);
            return null;
        }
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo8190a(Integer num) {
        return true;
    }
}
