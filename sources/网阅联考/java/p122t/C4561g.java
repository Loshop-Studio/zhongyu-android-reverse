package p122t;

import com.bumptech.glide.load.resource.bitmap.C2892a;
import java.nio.ByteBuffer;
import p062g0.AbstractC3741a;
import p076j.C3794d;
import p076j.InterfaceC3795e;
import p093m.InterfaceC4361j;

/* renamed from: t.g */
/* loaded from: classes2.dex */
public class C4561g implements InterfaceC3795e {

    /* renamed from: a */
    public final C2892a f5739a;

    public C4561g(C2892a c2892a) {
        this.f5739a = c2892a;
    }

    @Override // p076j.InterfaceC3795e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4361j mo1966b(ByteBuffer byteBuffer, int i4, int i5, C3794d c3794d) {
        return this.f5739a.m1952f(AbstractC3741a.m4742f(byteBuffer), i4, i5, c3794d);
    }

    @Override // p076j.InterfaceC3795e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo1965a(ByteBuffer byteBuffer, C3794d c3794d) {
        return this.f5739a.m1957q(byteBuffer);
    }
}
