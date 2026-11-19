package p254n0;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5824d;
import java.io.IOException;
import java.io.InputStream;
import p039c1.C5222d;
import p168h0.C9438e;
import p254n0.InterfaceC10300n;
import p328s0.AbstractC11029h;
import p328s0.C11032k;

/* renamed from: n0.f */
/* loaded from: classes3.dex */
public final class C10292f implements InterfaceC10300n {

    /* renamed from: a */
    public final Context f24499a;

    /* renamed from: b */
    public final e f24500b;

    /* renamed from: n0.f$a */
    public static final class a implements InterfaceC10301o, e {

        /* renamed from: a */
        public final Context f24501a;

        public a(Context context) {
            this.f24501a = context;
        }

        @Override // p254n0.C10292f.e
        /* renamed from: a */
        public Class mo21443a() {
            return AssetFileDescriptor.class;
        }

        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10292f(this.f24501a, this);
        }

        @Override // p254n0.C10292f.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void close(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // p254n0.C10292f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor mo21444b(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResourceFd(i10);
        }
    }

    /* renamed from: n0.f$c */
    public static final class c implements InterfaceC10301o, e {

        /* renamed from: a */
        public final Context f24503a;

        public c(Context context) {
            this.f24503a = context;
        }

        @Override // p254n0.C10292f.e
        /* renamed from: a */
        public Class mo21443a() {
            return InputStream.class;
        }

        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10292f(this.f24503a, this);
        }

        @Override // p254n0.C10292f.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void close(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // p254n0.C10292f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public InputStream mo21444b(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResource(i10);
        }
    }

    /* renamed from: n0.f$e */
    public interface e {
        /* renamed from: a */
        Class mo21443a();

        /* renamed from: b */
        Object mo21444b(Resources.Theme theme, Resources resources, int i10);

        void close(Object obj);
    }

    public C10292f(Context context, e eVar) {
        this.f24499a = context.getApplicationContext();
        this.f24500b = eVar;
    }

    /* renamed from: c */
    public static InterfaceC10301o m21438c(Context context) {
        return new a(context);
    }

    /* renamed from: e */
    public static InterfaceC10301o m21439e(Context context) {
        return new b(context);
    }

    /* renamed from: g */
    public static InterfaceC10301o m21440g(Context context) {
        return new c(context);
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC10300n.a mo21421b(Integer num, int i10, int i11, C9438e c9438e) {
        Resources.Theme theme = (Resources.Theme) c9438e.m18626c(C11032k.f26606b);
        return new InterfaceC10300n.a(new C5222d(num), new d(theme, theme != null ? theme.getResources() : this.f24499a.getResources(), this.f24500b, num.intValue()));
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo21420a(Integer num) {
        return true;
    }

    /* renamed from: n0.f$d */
    public static final class d implements InterfaceC5824d {

        /* renamed from: c */
        public final Resources.Theme f24504c;

        /* renamed from: d */
        public final Resources f24505d;

        /* renamed from: e */
        public final e f24506e;

        /* renamed from: f */
        public final int f24507f;

        /* renamed from: g */
        public Object f24508g;

        public d(Resources.Theme theme, Resources resources, e eVar, int i10) {
            this.f24504c = theme;
            this.f24505d = resources;
            this.f24506e = eVar;
            this.f24507f = i10;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        /* renamed from: a */
        public Class mo4051a() {
            return this.f24506e.mo21443a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        /* renamed from: c */
        public void mo4057c(Priority priority, InterfaceC5824d.a aVar) {
            try {
                Object objMo21444b = this.f24506e.mo21444b(this.f24504c, this.f24505d, this.f24507f);
                this.f24508g = objMo21444b;
                aVar.mo4063d(objMo21444b);
            } catch (Resources.NotFoundException e10) {
                aVar.mo4062b(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public void cleanup() {
            Object obj = this.f24508g;
            if (obj != null) {
                try {
                    this.f24506e.close(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public void cancel() {
        }
    }

    /* renamed from: n0.f$b */
    public static final class b implements InterfaceC10301o, e {

        /* renamed from: a */
        public final Context f24502a;

        public b(Context context) {
            this.f24502a = context;
        }

        @Override // p254n0.C10292f.e
        /* renamed from: a */
        public Class mo21443a() {
            return Drawable.class;
        }

        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10292f(this.f24502a, this);
        }

        @Override // p254n0.C10292f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Drawable mo21444b(Resources.Theme theme, Resources resources, int i10) {
            return AbstractC11029h.m24372a(this.f24502a, i10, theme);
        }

        @Override // p254n0.C10292f.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void close(Drawable drawable) {
        }
    }
}
