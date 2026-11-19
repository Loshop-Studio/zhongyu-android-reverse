package p122t;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p062g0.AbstractC3749i;
import p093m.InterfaceC4358g;
import p093m.InterfaceC4361j;

/* renamed from: t.x */
/* loaded from: classes2.dex */
public final class C4578x implements InterfaceC4361j, InterfaceC4358g {

    /* renamed from: a */
    public final Resources f5756a;

    /* renamed from: b */
    public final InterfaceC4361j f5757b;

    public C4578x(Resources resources, InterfaceC4361j interfaceC4361j) {
        this.f5756a = (Resources) AbstractC3749i.m4768d(resources);
        this.f5757b = (InterfaceC4361j) AbstractC3749i.m4768d(interfaceC4361j);
    }

    /* renamed from: d */
    public static InterfaceC4361j m6304d(Resources resources, InterfaceC4361j interfaceC4361j) {
        if (interfaceC4361j == null) {
            return null;
        }
        return new C4578x(resources, interfaceC4361j);
    }

    @Override // p093m.InterfaceC4358g
    /* renamed from: a */
    public void mo5369a() {
        InterfaceC4361j interfaceC4361j = this.f5757b;
        if (interfaceC4361j instanceof InterfaceC4358g) {
            ((InterfaceC4358g) interfaceC4361j).mo5369a();
        }
    }

    @Override // p093m.InterfaceC4361j
    /* renamed from: b */
    public Class mo1898b() {
        return BitmapDrawable.class;
    }

    @Override // p093m.InterfaceC4361j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f5756a, (Bitmap) this.f5757b.get());
    }

    @Override // p093m.InterfaceC4361j
    public int getSize() {
        return this.f5757b.getSize();
    }

    @Override // p093m.InterfaceC4361j
    public void recycle() {
        this.f5757b.recycle();
    }
}
