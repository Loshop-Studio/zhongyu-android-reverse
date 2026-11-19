package p226r;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import p160l.C9230d;
import p226r.InterfaceC9888n;

/* renamed from: r.s */
/* loaded from: classes3.dex */
public class C9893s implements InterfaceC9888n {

    /* renamed from: a */
    public final InterfaceC9888n f19844a;

    /* renamed from: b */
    public final Resources f19845b;

    /* renamed from: r.s$a */
    public static final class a implements InterfaceC9889o {

        /* renamed from: a */
        public final Resources f19846a;

        public a(Resources resources) {
            this.f19846a = resources;
        }

        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9893s(this.f19846a, c9892r.m18520d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: r.s$b */
    public static class b implements InterfaceC9889o {

        /* renamed from: a */
        public final Resources f19847a;

        public b(Resources resources) {
            this.f19847a = resources;
        }

        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9893s(this.f19847a, c9892r.m18520d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: r.s$c */
    public static class c implements InterfaceC9889o {

        /* renamed from: a */
        public final Resources f19848a;

        public c(Resources resources) {
            this.f19848a = resources;
        }

        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9893s(this.f19848a, C9897w.m18540c());
        }
    }

    public C9893s(Resources resources, InterfaceC9888n interfaceC9888n) {
        this.f19845b = resources;
        this.f19844a = interfaceC9888n;
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9888n.a mo18446b(Integer num, int i10, int i11, C9230d c9230d) {
        Uri uriM18527d = m18527d(num);
        if (uriM18527d == null) {
            return null;
        }
        return this.f19844a.mo18446b(uriM18527d, i10, i11, c9230d);
    }

    /* renamed from: d */
    public final Uri m18527d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f19845b.getResourcePackageName(num.intValue()) + '/' + this.f19845b.getResourceTypeName(num.intValue()) + '/' + this.f19845b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
            return null;
        }
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo18445a(Integer num) {
        return true;
    }
}
