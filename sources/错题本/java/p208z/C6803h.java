package p208z;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.resource.bitmap.C3419a;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import p024c0.C3210g;
import p086j0.C5731a;

/* renamed from: z.h */
/* loaded from: classes2.dex */
public final class C6803h implements InterfaceC6802g {

    /* renamed from: c */
    public static final C5731a f11473c = new C5731a(1);

    /* renamed from: a */
    public final /* synthetic */ int f11474a;

    /* renamed from: b */
    public final Object f11475b;

    public /* synthetic */ C6803h(Object obj, int i) {
        this.f11474a = i;
        this.f11475b = obj;
    }

    @Override // p208z.InterfaceC6802g
    /* renamed from: a */
    public void mo4974a() {
        switch (this.f11474a) {
            case 2:
                ((C3419a) this.f11475b).m2415b();
                break;
        }
    }

    @Override // p208z.InterfaceC6802g
    /* renamed from: c */
    public Object mo4976c() {
        switch (this.f11474a) {
            case 1:
                return this.f11475b;
            case 2:
                C3419a c3419a = (C3419a) this.f11475b;
                c3419a.reset();
                return c3419a;
            default:
                return m6469e();
        }
    }

    /* renamed from: e */
    public ParcelFileDescriptor m6469e() throws IOException, ErrnoException {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ((C6803h) this.f11475b).f11475b;
        try {
            Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return parcelFileDescriptor;
        } catch (ErrnoException e) {
            throw new IOException(e);
        }
    }

    public C6803h() {
        this.f11474a = 0;
        this.f11475b = new HashMap();
    }

    public C6803h(InputStream inputStream, C3210g c3210g) {
        this.f11474a = 2;
        C3419a c3419a = new C3419a(inputStream, c3210g);
        this.f11475b = c3419a;
        c3419a.mark(5242880);
    }

    public C6803h(ParcelFileDescriptor parcelFileDescriptor) {
        this.f11474a = 4;
        this.f11475b = new C6803h(parcelFileDescriptor, 3);
    }

    /* renamed from: b */
    private final void m6467b() {
    }

    /* renamed from: d */
    private final void m6468d() {
    }
}
