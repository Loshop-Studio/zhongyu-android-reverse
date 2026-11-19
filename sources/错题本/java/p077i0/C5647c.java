package p077i0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p016b0.InterfaceC3064c0;
import p016b0.InterfaceC3072g0;
import p024c0.InterfaceC3205b;
import p180v0.AbstractC6664k;
import p185v7.AbstractC6675d;

/* renamed from: i0.c */
/* loaded from: classes2.dex */
public final class C5647c implements InterfaceC3072g0, InterfaceC3064c0 {

    /* renamed from: a */
    public final /* synthetic */ int f8783a = 1;

    /* renamed from: b */
    public final Object f8784b;

    /* renamed from: c */
    public final Object f8785c;

    public C5647c(Bitmap bitmap, InterfaceC3205b interfaceC3205b) {
        AbstractC6675d.m6344f(bitmap, "Bitmap must not be null");
        this.f8784b = bitmap;
        AbstractC6675d.m6344f(interfaceC3205b, "BitmapPool must not be null");
        this.f8785c = interfaceC3205b;
    }

    /* renamed from: b */
    public static C5647c m4972b(Bitmap bitmap, InterfaceC3205b interfaceC3205b) {
        if (bitmap == null) {
            return null;
        }
        return new C5647c(bitmap, interfaceC3205b);
    }

    @Override // p016b0.InterfaceC3072g0
    /* renamed from: a */
    public final Class mo2004a() {
        switch (this.f8783a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // p016b0.InterfaceC3072g0
    public final Object get() {
        switch (this.f8783a) {
            case 0:
                return (Bitmap) this.f8784b;
            default:
                return new BitmapDrawable((Resources) this.f8784b, (Bitmap) ((InterfaceC3072g0) this.f8785c).get());
        }
    }

    @Override // p016b0.InterfaceC3072g0
    public final int getSize() {
        switch (this.f8783a) {
            case 0:
                return AbstractC6664k.m6323c((Bitmap) this.f8784b);
            default:
                return ((InterfaceC3072g0) this.f8785c).getSize();
        }
    }

    @Override // p016b0.InterfaceC3064c0
    public final void initialize() {
        switch (this.f8783a) {
            case 0:
                ((Bitmap) this.f8784b).prepareToDraw();
                break;
            default:
                InterfaceC3072g0 interfaceC3072g0 = (InterfaceC3072g0) this.f8785c;
                if (interfaceC3072g0 instanceof InterfaceC3064c0) {
                    ((InterfaceC3064c0) interfaceC3072g0).initialize();
                    break;
                }
                break;
        }
    }

    @Override // p016b0.InterfaceC3072g0
    public final void recycle() {
        switch (this.f8783a) {
            case 0:
                ((InterfaceC3205b) this.f8785c).mo2142b((Bitmap) this.f8784b);
                break;
            default:
                ((InterfaceC3072g0) this.f8785c).recycle();
                break;
        }
    }

    public C5647c(Resources resources, InterfaceC3072g0 interfaceC3072g0) {
        AbstractC6675d.m6344f(resources, "Argument must not be null");
        this.f8784b = resources;
        AbstractC6675d.m6344f(interfaceC3072g0, "Argument must not be null");
        this.f8785c = interfaceC3072g0;
    }
}
