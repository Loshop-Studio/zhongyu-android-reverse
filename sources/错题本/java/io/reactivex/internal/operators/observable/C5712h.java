package io.reactivex.internal.operators.observable;

import android.media.MediaMetadataRetriever;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p039d0.C5406i;
import p077i0.C5668x;
import p077i0.InterfaceC5669y;
import p127o0.InterfaceC6263i;
import p168t5.InterfaceC6599c;
import p187w0.InterfaceC6695c;
import p202y.InterfaceC6761d;

/* renamed from: io.reactivex.internal.operators.observable.h */
/* loaded from: classes.dex */
public final class C5712h implements InterfaceC6695c, InterfaceC5669y, InterfaceC6263i, InterfaceC6599c, InterfaceC6761d {

    /* renamed from: a */
    public final /* synthetic */ int f9011a;

    public /* synthetic */ C5712h(int i) {
        this.f9011a = i;
    }

    @Override // p187w0.InterfaceC6695c
    /* renamed from: a */
    public Object mo2052a() {
        try {
            return new C5406i(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p077i0.InterfaceC5669y
    /* renamed from: g */
    public void mo4999g(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(new C5668x((ByteBuffer) obj));
    }

    public String toString() {
        switch (this.f9011a) {
            case 9:
                return "EmptyConsumer";
            default:
                return super.toString();
        }
    }

    @Override // p168t5.InterfaceC6599c
    public void accept(Object obj) {
    }

    @Override // p202y.InterfaceC6761d
    /* renamed from: b */
    public void mo4975b(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
