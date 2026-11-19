package p077i0;

import android.graphics.Bitmap;
import java.io.File;
import p016b0.InterfaceC3072g0;
import p180v0.AbstractC6664k;
import p185v7.AbstractC6675d;

/* renamed from: i0.v */
/* loaded from: classes2.dex */
public final class C5666v implements InterfaceC3072g0 {

    /* renamed from: a */
    public final /* synthetic */ int f8828a = 0;

    /* renamed from: b */
    public final Object f8829b;

    public C5666v(byte[] bArr) {
        AbstractC6675d.m6344f(bArr, "Argument must not be null");
        this.f8829b = bArr;
    }

    @Override // p016b0.InterfaceC3072g0
    /* renamed from: a */
    public final Class mo2004a() {
        switch (this.f8828a) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            default:
                return ((File) this.f8829b).getClass();
        }
    }

    @Override // p016b0.InterfaceC3072g0
    public final Object get() {
        switch (this.f8828a) {
            case 0:
                return (Bitmap) this.f8829b;
            case 1:
                return (byte[]) this.f8829b;
            default:
                return (File) this.f8829b;
        }
    }

    @Override // p016b0.InterfaceC3072g0
    public final int getSize() {
        switch (this.f8828a) {
            case 0:
                return AbstractC6664k.m6323c((Bitmap) this.f8829b);
            case 1:
                return ((byte[]) this.f8829b).length;
            default:
                return 1;
        }
    }

    @Override // p016b0.InterfaceC3072g0
    public final void recycle() {
        int i = this.f8828a;
    }

    public C5666v(File file) {
        AbstractC6675d.m6344f(file, "Argument must not be null");
        this.f8829b = file;
    }

    public C5666v(Bitmap bitmap) {
        this.f8829b = bitmap;
    }

    /* renamed from: b */
    private final void m4996b() {
    }

    /* renamed from: c */
    private final void m4997c() {
    }

    /* renamed from: d */
    private final void m4998d() {
    }
}
