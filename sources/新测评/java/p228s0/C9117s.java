package p228s0;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import p162m0.C8539d;
import p228s0.InterfaceC9112n;

/* renamed from: s0.s */
/* loaded from: classes3.dex */
public class C9117s implements InterfaceC9112n {

    /* renamed from: a */
    public final InterfaceC9112n f15809a;

    /* renamed from: b */
    public final Resources f15810b;

    /* renamed from: s0.s$a */
    public static final class a implements InterfaceC9113o {

        /* renamed from: a */
        public final Resources f15811a;

        public a(Resources resources) {
            this.f15811a = resources;
        }

        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9117s(this.f15811a, c9116r.m15429d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: s0.s$b */
    public static class b implements InterfaceC9113o {

        /* renamed from: a */
        public final Resources f15812a;

        public b(Resources resources) {
            this.f15812a = resources;
        }

        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9117s(this.f15812a, c9116r.m15429d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: s0.s$c */
    public static class c implements InterfaceC9113o {

        /* renamed from: a */
        public final Resources f15813a;

        public c(Resources resources) {
            this.f15813a = resources;
        }

        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9117s(this.f15813a, C9121w.m15449c());
        }
    }

    public C9117s(Resources resources, InterfaceC9112n interfaceC9112n) {
        this.f15810b = resources;
        this.f15809a = interfaceC9112n;
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9112n.a mo15355b(Integer num, int i10, int i11, C8539d c8539d) {
        Uri uriM15436d = m15436d(num);
        if (uriM15436d == null) {
            return null;
        }
        return this.f15809a.mo15355b(uriM15436d, i10, i11, c8539d);
    }

    /* renamed from: d */
    public final Uri m15436d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f15810b.getResourcePackageName(num.intValue()) + '/' + this.f15810b.getResourceTypeName(num.intValue()) + '/' + this.f15810b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
            return null;
        }
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo15354a(Integer num) {
        return true;
    }
}
