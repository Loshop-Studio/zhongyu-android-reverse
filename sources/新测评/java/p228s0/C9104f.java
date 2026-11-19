package p228s0;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5356d;
import java.io.IOException;
import java.io.InputStream;
import p106h1.C7617b;
import p162m0.C8539d;
import p228s0.InterfaceC9112n;
import p281x0.AbstractC9834h;
import p281x0.C9837k;

/* renamed from: s0.f */
/* loaded from: classes3.dex */
public final class C9104f implements InterfaceC9112n {

    /* renamed from: a */
    public final Context f15741a;

    /* renamed from: b */
    public final e f15742b;

    /* renamed from: s0.f$a */
    public static final class a implements InterfaceC9113o, e {

        /* renamed from: a */
        public final Context f15743a;

        public a(Context context) {
            this.f15743a = context;
        }

        @Override // p228s0.C9104f.e
        /* renamed from: a */
        public Class mo15378a() {
            return AssetFileDescriptor.class;
        }

        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9104f(this.f15743a, this);
        }

        @Override // p228s0.C9104f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo15379b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // p228s0.C9104f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor mo15380c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResourceFd(i10);
        }
    }

    /* renamed from: s0.f$c */
    public static final class c implements InterfaceC9113o, e {

        /* renamed from: a */
        public final Context f15745a;

        public c(Context context) {
            this.f15745a = context;
        }

        @Override // p228s0.C9104f.e
        /* renamed from: a */
        public Class mo15378a() {
            return InputStream.class;
        }

        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9104f(this.f15745a, this);
        }

        @Override // p228s0.C9104f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo15379b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // p228s0.C9104f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public InputStream mo15380c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResource(i10);
        }
    }

    /* renamed from: s0.f$e */
    public interface e {
        /* renamed from: a */
        Class mo15378a();

        /* renamed from: b */
        void mo15379b(Object obj);

        /* renamed from: c */
        Object mo15380c(Resources.Theme theme, Resources resources, int i10);
    }

    public C9104f(Context context, e eVar) {
        this.f15741a = context.getApplicationContext();
        this.f15742b = eVar;
    }

    /* renamed from: c */
    public static InterfaceC9113o m15373c(Context context) {
        return new a(context);
    }

    /* renamed from: e */
    public static InterfaceC9113o m15374e(Context context) {
        return new b(context);
    }

    /* renamed from: g */
    public static InterfaceC9113o m15375g(Context context) {
        return new c(context);
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC9112n.a mo15355b(Integer num, int i10, int i11, C8539d c8539d) {
        Resources.Theme theme = (Resources.Theme) c8539d.m14057c(C9837k.f17394b);
        return new InterfaceC9112n.a(new C7617b(num), new d(theme, theme != null ? theme.getResources() : this.f15741a.getResources(), this.f15742b, num.intValue()));
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo15354a(Integer num) {
        return true;
    }

    /* renamed from: s0.f$d */
    public static final class d implements InterfaceC5356d {

        /* renamed from: a */
        public final Resources.Theme f15746a;

        /* renamed from: b */
        public final Resources f15747b;

        /* renamed from: c */
        public final e f15748c;

        /* renamed from: d */
        public final int f15749d;

        /* renamed from: e */
        public Object f15750e;

        public d(Resources.Theme theme, Resources resources, e eVar, int i10) {
            this.f15746a = theme;
            this.f15747b = resources;
            this.f15748c = eVar;
            this.f15749d = i10;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: a */
        public Class mo3399a() {
            return this.f15748c.mo15378a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: b */
        public void mo3404b() {
            Object obj = this.f15750e;
            if (obj != null) {
                try {
                    this.f15748c.mo15379b(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: d */
        public DataSource mo3406d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: e */
        public void mo3407e(Priority priority, InterfaceC5356d.a aVar) {
            try {
                Object objMo15380c = this.f15748c.mo15380c(this.f15746a, this.f15747b, this.f15749d);
                this.f15750e = objMo15380c;
                aVar.mo3413f(objMo15380c);
            } catch (Resources.NotFoundException e10) {
                aVar.mo3412c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        public void cancel() {
        }
    }

    /* renamed from: s0.f$b */
    public static final class b implements InterfaceC9113o, e {

        /* renamed from: a */
        public final Context f15744a;

        public b(Context context) {
            this.f15744a = context;
        }

        @Override // p228s0.C9104f.e
        /* renamed from: a */
        public Class mo15378a() {
            return Drawable.class;
        }

        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9104f(this.f15744a, this);
        }

        @Override // p228s0.C9104f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Drawable mo15380c(Resources.Theme theme, Resources resources, int i10) {
            return AbstractC9834h.m16466a(this.f15744a, i10, theme);
        }

        @Override // p228s0.C9104f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo15379b(Drawable drawable) {
        }
    }
}
