package p254n0;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import p168h0.C9438e;
import p254n0.InterfaceC10300n;

/* renamed from: n0.s */
/* loaded from: classes3.dex */
public class C10305s implements InterfaceC10300n {

    /* renamed from: a */
    public final InterfaceC10300n f24567a;

    /* renamed from: b */
    public final Resources f24568b;

    /* renamed from: n0.s$a */
    public static final class a implements InterfaceC10301o {

        /* renamed from: a */
        public final Resources f24569a;

        public a(Resources resources) {
            this.f24569a = resources;
        }

        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10305s(this.f24569a, c10304r.m21491d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: n0.s$b */
    public static class b implements InterfaceC10301o {

        /* renamed from: a */
        public final Resources f24570a;

        public b(Resources resources) {
            this.f24570a = resources;
        }

        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10305s(this.f24570a, c10304r.m21491d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: n0.s$c */
    public static class c implements InterfaceC10301o {

        /* renamed from: a */
        public final Resources f24571a;

        public c(Resources resources) {
            this.f24571a = resources;
        }

        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10305s(this.f24571a, C10309w.m21511c());
        }
    }

    public C10305s(Resources resources, InterfaceC10300n interfaceC10300n) {
        this.f24568b = resources;
        this.f24567a = interfaceC10300n;
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC10300n.a mo21421b(Integer num, int i10, int i11, C9438e c9438e) {
        Uri uriM21498d = m21498d(num);
        if (uriM21498d == null) {
            return null;
        }
        return this.f24567a.mo21421b(uriM21498d, i10, i11, c9438e);
    }

    /* renamed from: d */
    public final Uri m21498d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f24568b.getResourcePackageName(num.intValue()) + '/' + this.f24568b.getResourceTypeName(num.intValue()) + '/' + this.f24568b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
            return null;
        }
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo21420a(Integer num) {
        return true;
    }
}
