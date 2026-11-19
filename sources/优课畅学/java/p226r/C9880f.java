package p226r;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5405d;
import java.io.IOException;
import java.io.InputStream;
import p105g0.C8514b;
import p160l.C9230d;
import p226r.InterfaceC9888n;
import p281w.AbstractC10266h;
import p281w.C10269k;

/* renamed from: r.f */
/* loaded from: classes3.dex */
public final class C9880f implements InterfaceC9888n {

    /* renamed from: a */
    public final Context f19776a;

    /* renamed from: b */
    public final e f19777b;

    /* renamed from: r.f$a */
    public static final class a implements InterfaceC9889o, e {

        /* renamed from: a */
        public final Context f19778a;

        public a(Context context) {
            this.f19778a = context;
        }

        @Override // p226r.C9880f.e
        /* renamed from: a */
        public Class mo18469a() {
            return AssetFileDescriptor.class;
        }

        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9880f(this.f19778a, this);
        }

        @Override // p226r.C9880f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo18470b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // p226r.C9880f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor mo18471c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResourceFd(i10);
        }
    }

    /* renamed from: r.f$c */
    public static final class c implements InterfaceC9889o, e {

        /* renamed from: a */
        public final Context f19780a;

        public c(Context context) {
            this.f19780a = context;
        }

        @Override // p226r.C9880f.e
        /* renamed from: a */
        public Class mo18469a() {
            return InputStream.class;
        }

        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9880f(this.f19780a, this);
        }

        @Override // p226r.C9880f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo18470b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // p226r.C9880f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public InputStream mo18471c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResource(i10);
        }
    }

    /* renamed from: r.f$e */
    public interface e {
        /* renamed from: a */
        Class mo18469a();

        /* renamed from: b */
        void mo18470b(Object obj);

        /* renamed from: c */
        Object mo18471c(Resources.Theme theme, Resources resources, int i10);
    }

    public C9880f(Context context, e eVar) {
        this.f19776a = context.getApplicationContext();
        this.f19777b = eVar;
    }

    /* renamed from: c */
    public static InterfaceC9889o m18464c(Context context) {
        return new a(context);
    }

    /* renamed from: e */
    public static InterfaceC9889o m18465e(Context context) {
        return new b(context);
    }

    /* renamed from: g */
    public static InterfaceC9889o m18466g(Context context) {
        return new c(context);
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC9888n.a mo18446b(Integer num, int i10, int i11, C9230d c9230d) {
        Resources.Theme theme = (Resources.Theme) c9230d.m16940c(C10269k.f20498b);
        return new InterfaceC9888n.a(new C8514b(num), new d(theme, theme != null ? theme.getResources() : this.f19776a.getResources(), this.f19777b, num.intValue()));
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo18445a(Integer num) {
        return true;
    }

    /* renamed from: r.f$d */
    public static final class d implements InterfaceC5405d {

        /* renamed from: a */
        public final Resources.Theme f19781a;

        /* renamed from: b */
        public final Resources f19782b;

        /* renamed from: c */
        public final e f19783c;

        /* renamed from: d */
        public final int f19784d;

        /* renamed from: e */
        public Object f19785e;

        public d(Resources.Theme theme, Resources resources, e eVar, int i10) {
            this.f19781a = theme;
            this.f19782b = resources;
            this.f19783c = eVar;
            this.f19784d = i10;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: a */
        public Class mo2846a() {
            return this.f19783c.mo18469a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: b */
        public void mo2851b() {
            Object obj = this.f19785e;
            if (obj != null) {
                try {
                    this.f19783c.mo18470b(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: d */
        public void mo2853d(Priority priority, InterfaceC5405d.a aVar) {
            try {
                Object objMo18471c = this.f19783c.mo18471c(this.f19781a, this.f19782b, this.f19784d);
                this.f19785e = objMo18471c;
                aVar.mo2859e(objMo18471c);
            } catch (Resources.NotFoundException e10) {
                aVar.mo2858c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        public void cancel() {
        }
    }

    /* renamed from: r.f$b */
    public static final class b implements InterfaceC9889o, e {

        /* renamed from: a */
        public final Context f19779a;

        public b(Context context) {
            this.f19779a = context;
        }

        @Override // p226r.C9880f.e
        /* renamed from: a */
        public Class mo18469a() {
            return Drawable.class;
        }

        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9880f(this.f19779a, this);
        }

        @Override // p226r.C9880f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Drawable mo18471c(Resources.Theme theme, Resources resources, int i10) {
            return AbstractC10266h.m19233a(this.f19779a, i10, theme);
        }

        @Override // p226r.C9880f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo18470b(Drawable drawable) {
        }
    }
}
