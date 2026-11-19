package p097l0;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC4692d;
import java.io.IOException;
import java.io.InputStream;
import p002a1.C0007b;
import p053f0.C6285d;
import p097l0.InterfaceC7280n;
import p132q0.AbstractC7613h;
import p132q0.C7616k;

/* renamed from: l0.f */
/* loaded from: classes3.dex */
public final class C7272f implements InterfaceC7280n {

    /* renamed from: a */
    public final Context f9187a;

    /* renamed from: b */
    public final e f9188b;

    /* renamed from: l0.f$a */
    public static final class a implements InterfaceC7281o, e {

        /* renamed from: a */
        public final Context f9189a;

        public a(Context context) {
            this.f9189a = context;
        }

        @Override // p097l0.C7272f.e
        /* renamed from: a */
        public Class mo8214a() {
            return AssetFileDescriptor.class;
        }

        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7272f(this.f9189a, this);
        }

        @Override // p097l0.C7272f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo8215b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // p097l0.C7272f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor mo8216c(Resources.Theme theme, Resources resources, int i6) {
            return resources.openRawResourceFd(i6);
        }
    }

    /* renamed from: l0.f$c */
    public static final class c implements InterfaceC7281o, e {

        /* renamed from: a */
        public final Context f9191a;

        public c(Context context) {
            this.f9191a = context;
        }

        @Override // p097l0.C7272f.e
        /* renamed from: a */
        public Class mo8214a() {
            return InputStream.class;
        }

        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7272f(this.f9191a, this);
        }

        @Override // p097l0.C7272f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo8215b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // p097l0.C7272f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public InputStream mo8216c(Resources.Theme theme, Resources resources, int i6) {
            return resources.openRawResource(i6);
        }
    }

    /* renamed from: l0.f$e */
    public interface e {
        /* renamed from: a */
        Class mo8214a();

        /* renamed from: b */
        void mo8215b(Object obj);

        /* renamed from: c */
        Object mo8216c(Resources.Theme theme, Resources resources, int i6);
    }

    public C7272f(Context context, e eVar) {
        this.f9187a = context.getApplicationContext();
        this.f9188b = eVar;
    }

    /* renamed from: c */
    public static InterfaceC7281o m8209c(Context context) {
        return new a(context);
    }

    /* renamed from: e */
    public static InterfaceC7281o m8210e(Context context) {
        return new b(context);
    }

    /* renamed from: g */
    public static InterfaceC7281o m8211g(Context context) {
        return new c(context);
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC7280n.a mo8191b(Integer num, int i6, int i7, C6285d c6285d) {
        Resources.Theme theme = (Resources.Theme) c6285d.m6420c(C7616k.f10074b);
        return new InterfaceC7280n.a(new C0007b(num), new d(theme, theme != null ? theme.getResources() : this.f9187a.getResources(), this.f9188b, num.intValue()));
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo8190a(Integer num) {
        return true;
    }

    /* renamed from: l0.f$d */
    public static final class d implements InterfaceC4692d {

        /* renamed from: a */
        public final Resources.Theme f9192a;

        /* renamed from: b */
        public final Resources f9193b;

        /* renamed from: c */
        public final e f9194c;

        /* renamed from: d */
        public final int f9195d;

        /* renamed from: e */
        public Object f9196e;

        public d(Resources.Theme theme, Resources resources, e eVar, int i6) {
            this.f9192a = theme;
            this.f9193b = resources;
            this.f9194c = eVar;
            this.f9195d = i6;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: a */
        public Class mo2580a() {
            return this.f9194c.mo8214a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: b */
        public void mo2585b() {
            Object obj = this.f9196e;
            if (obj != null) {
                try {
                    this.f9194c.mo8215b(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: d */
        public DataSource mo2587d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: e */
        public void mo2588e(Priority priority, InterfaceC4692d.a aVar) {
            try {
                Object objMo8216c = this.f9194c.mo8216c(this.f9192a, this.f9193b, this.f9195d);
                this.f9196e = objMo8216c;
                aVar.mo2594f(objMo8216c);
            } catch (Resources.NotFoundException e6) {
                aVar.mo2593c(e6);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        public void cancel() {
        }
    }

    /* renamed from: l0.f$b */
    public static final class b implements InterfaceC7281o, e {

        /* renamed from: a */
        public final Context f9190a;

        public b(Context context) {
            this.f9190a = context;
        }

        @Override // p097l0.C7272f.e
        /* renamed from: a */
        public Class mo8214a() {
            return Drawable.class;
        }

        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7272f(this.f9190a, this);
        }

        @Override // p097l0.C7272f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Drawable mo8216c(Resources.Theme theme, Resources resources, int i6) {
            return AbstractC7613h.m9040a(this.f9190a, i6, theme);
        }

        @Override // p097l0.C7272f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo8215b(Drawable drawable) {
        }
    }
}
