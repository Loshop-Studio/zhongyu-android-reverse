package coil3.disk;

import coil3.disk.AbstractC5192c;
import coil3.disk.InterfaceC5190a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import okio.FileSystem;

/* renamed from: coil3.disk.c */
/* loaded from: classes3.dex */
public abstract class AbstractC5192c {

    /* renamed from: a */
    public static final Lazy f3006a = LazyKt.lazy(new Function0() { // from class: o.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC5192c.m3049c();
        }
    });

    /* renamed from: b */
    public static final InterfaceC5190a m3048b() {
        return (InterfaceC5190a) f3006a.getValue();
    }

    /* renamed from: c */
    public static final InterfaceC5190a m3049c() {
        return new InterfaceC5190a.a().m3038b(FileSystem.SYSTEM_TEMPORARY_DIRECTORY.resolve("coil3_disk_cache")).m3037a();
    }

    /* renamed from: d */
    public static final InterfaceC5190a m3050d() {
        return m3048b();
    }
}
