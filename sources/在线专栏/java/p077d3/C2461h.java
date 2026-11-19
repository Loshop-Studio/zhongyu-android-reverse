package p077d3;

import java.util.Iterator;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d3.h */
/* loaded from: classes.dex */
public class C2461h extends C2460g {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: d3.h$a */
    public static final class a<T> implements InterfaceC2457d<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f10038a;

        public a(Iterator it) {
            this.f10038a = it;
        }

        @Override // p077d3.InterfaceC2457d
        @NotNull
        public Iterator<T> iterator() {
            return this.f10038a;
        }
    }

    @NotNull
    /* renamed from: a */
    public static <T> InterfaceC2457d<T> m8210a(@NotNull Iterator<? extends T> it) {
        C2769l.m9241e(it, "<this>");
        return m8211b(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: b */
    public static final <T> InterfaceC2457d<T> m8211b(@NotNull InterfaceC2457d<? extends T> interfaceC2457d) {
        C2769l.m9241e(interfaceC2457d, "<this>");
        return interfaceC2457d instanceof C2454a ? interfaceC2457d : new C2454a(interfaceC2457d);
    }
}
