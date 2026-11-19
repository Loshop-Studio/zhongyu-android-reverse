package io.reactivex.internal.operators.observable;

import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;
import java.io.File;
import java.io.InputStream;
import p016b0.C3071g;
import p039d0.InterfaceC5398a;
import p055f0.C5501f;
import p055f0.C5519x;
import p055f0.C5521z;
import p055f0.InterfaceC5511p;
import p055f0.InterfaceC5512q;
import p077i0.InterfaceC5669y;
import p168t5.InterfaceC6597a;
import p187w0.InterfaceC6698f;
import p202y.InterfaceC6760c;

/* renamed from: io.reactivex.internal.operators.observable.g */
/* loaded from: classes.dex */
public final class C5711g implements InterfaceC5398a, InterfaceC5512q, InterfaceC5669y, InterfaceC6597a, InterfaceC6698f {

    /* renamed from: b */
    public static volatile C5711g f9009b;

    /* renamed from: a */
    public final /* synthetic */ int f9010a;

    public /* synthetic */ C5711g(int i) {
        this.f9010a = i;
    }

    @Override // p039d0.InterfaceC5398a
    /* renamed from: a */
    public File mo4793a(InterfaceC6760c interfaceC6760c) {
        return null;
    }

    @Override // p077i0.InterfaceC5669y
    /* renamed from: g */
    public void mo4999g(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // p055f0.InterfaceC5512q
    /* renamed from: r */
    public InterfaceC5511p mo2140r(C5519x c5519x) {
        return new C5521z(c5519x.m4889a(C5501f.class, InputStream.class), 1);
    }

    public String toString() {
        switch (this.f9010a) {
            case 9:
                return "EmptyAction";
            default:
                return super.toString();
        }
    }

    @Override // p039d0.InterfaceC5398a
    public void clear() {
    }

    @Override // p187w0.InterfaceC6698f
    /* renamed from: b */
    public void mo5083b(Object obj) {
    }

    @Override // p039d0.InterfaceC5398a
    /* renamed from: c */
    public void mo4794c(InterfaceC6760c interfaceC6760c, C3071g c3071g) {
    }
}
