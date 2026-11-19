package coil3.disk;

import coil3.disk.AbstractC4573c;
import coil3.disk.InterfaceC4571a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import okio.FileSystem;

/* renamed from: coil3.disk.c */
/* loaded from: classes3.dex */
public abstract class AbstractC4573c {

    /* renamed from: a */
    public static final Lazy f1690a = LazyKt.lazy(new Function0() { // from class: o.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC4573c.m1877c();
        }
    });

    /* renamed from: b */
    public static final InterfaceC4571a m1876b() {
        return (InterfaceC4571a) f1690a.getValue();
    }

    /* renamed from: c */
    public static final InterfaceC4571a m1877c() {
        return new InterfaceC4571a.a().m1866b(FileSystem.SYSTEM_TEMPORARY_DIRECTORY.resolve("coil3_disk_cache")).m1865a();
    }

    /* renamed from: d */
    public static final InterfaceC4571a m1878d() {
        return m1876b();
    }
}
