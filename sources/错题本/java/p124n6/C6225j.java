package p124n6;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6473e;

/* renamed from: n6.j */
/* loaded from: classes2.dex */
public final class C6225j implements InterfaceC6473e {

    /* renamed from: a */
    public static final C6225j f9964a = new C6225j();

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) throws IOException {
        IOException exception = (IOException) obj2;
        AbstractC5830k.m5330g((File) obj, "<unused var>");
        AbstractC5830k.m5330g(exception, "exception");
        throw exception;
    }
}
