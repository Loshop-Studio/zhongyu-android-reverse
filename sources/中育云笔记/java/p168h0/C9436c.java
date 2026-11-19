package p168h0;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p198j0.InterfaceC9657j;

/* renamed from: h0.c */
/* loaded from: classes3.dex */
public class C9436c implements InterfaceC9441h {

    /* renamed from: b */
    public final Collection f21838b;

    public C9436c(InterfaceC9441h... interfaceC9441hArr) {
        if (interfaceC9441hArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f21838b = Arrays.asList(interfaceC9441hArr);
    }

    @Override // p168h0.InterfaceC9441h
    /* renamed from: a */
    public InterfaceC9657j mo18617a(Context context, InterfaceC9657j interfaceC9657j, int i10, int i11) {
        Iterator it = this.f21838b.iterator();
        InterfaceC9657j interfaceC9657j2 = interfaceC9657j;
        while (it.hasNext()) {
            InterfaceC9657j interfaceC9657jMo18617a = ((InterfaceC9441h) it.next()).mo18617a(context, interfaceC9657j2, i10, i11);
            if (interfaceC9657j2 != null && !interfaceC9657j2.equals(interfaceC9657j) && !interfaceC9657j2.equals(interfaceC9657jMo18617a)) {
                interfaceC9657j2.recycle();
            }
            interfaceC9657j2 = interfaceC9657jMo18617a;
        }
        return interfaceC9657j2;
    }

    @Override // p168h0.InterfaceC9435b
    /* renamed from: b */
    public void mo2797b(MessageDigest messageDigest) {
        Iterator it = this.f21838b.iterator();
        while (it.hasNext()) {
            ((InterfaceC9441h) it.next()).mo2797b(messageDigest);
        }
    }

    @Override // p168h0.InterfaceC9435b
    public boolean equals(Object obj) {
        if (obj instanceof C9436c) {
            return this.f21838b.equals(((C9436c) obj).f21838b);
        }
        return false;
    }

    @Override // p168h0.InterfaceC9435b
    public int hashCode() {
        return this.f21838b.hashCode();
    }
}
