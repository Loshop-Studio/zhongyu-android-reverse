package p077i0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;
import p016b0.InterfaceC3072g0;
import p094k0.C5750a;
import p202y.C6763f;
import p202y.InterfaceC6764g;

/* renamed from: i0.w */
/* loaded from: classes2.dex */
public final class C5667w implements InterfaceC6764g {

    /* renamed from: a */
    public final /* synthetic */ int f8830a;

    public /* synthetic */ C5667w(int i) {
        this.f8830a = i;
    }

    @Override // p202y.InterfaceC6764g
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo4970a(Object obj, C6763f c6763f) {
        switch (this.f8830a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p202y.InterfaceC6764g
    /* renamed from: b */
    public final InterfaceC3072g0 mo4971b(Object obj, int i, int i8, C6763f c6763f) {
        switch (this.f8830a) {
            case 0:
                return new C5666v((Bitmap) obj);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new C5750a(drawable, 0);
                }
                return null;
            default:
                return new C5666v((File) obj);
        }
    }
}
