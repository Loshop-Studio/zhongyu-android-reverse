package p199p4;

import com.google.protobuf.Any;
import kotlin.jvm.internal.Intrinsics;
import p142k4.InterfaceC7880c;
import p188o4.AbstractC8704e;
import p265v4.InterfaceC9668d;

/* renamed from: p4.k */
/* loaded from: classes4.dex */
public final class C8833k {

    /* renamed from: a */
    public final InterfaceC9668d f15036a;

    /* renamed from: b */
    public final InterfaceC7880c f15037b;

    public C8833k(InterfaceC9668d sourceLoader, InterfaceC7880c graphControl) {
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.f15036a = sourceLoader;
        this.f15037b = graphControl;
    }

    /* renamed from: a */
    public AbstractC8704e m14802a(Any data, long j10) {
        Intrinsics.checkNotNullParameter(data, "data");
        m14803b(data);
        return null;
    }

    /* renamed from: b */
    public void m14803b(Any data) {
        Intrinsics.checkNotNullParameter(data, "data");
    }
}
