package coil3.disk;

import coil3.disk.AbstractC5327c;
import coil3.disk.InterfaceC5325a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import okio.FileSystem;

/* renamed from: coil3.disk.c */
/* loaded from: classes3.dex */
public abstract class AbstractC5327c {

    /* renamed from: a */
    public static final Lazy f2934a = LazyKt.lazy(new Function0() { // from class: o.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC5327c.m2774c();
        }
    });

    /* renamed from: b */
    public static final InterfaceC5325a m2773b() {
        return (InterfaceC5325a) f2934a.getValue();
    }

    /* renamed from: c */
    public static final InterfaceC5325a m2774c() {
        return new InterfaceC5325a.a().m2763b(FileSystem.SYSTEM_TEMPORARY_DIRECTORY.resolve("coil3_disk_cache")).m2762a();
    }

    /* renamed from: d */
    public static final InterfaceC5325a m2775d() {
        return m2773b();
    }
}
