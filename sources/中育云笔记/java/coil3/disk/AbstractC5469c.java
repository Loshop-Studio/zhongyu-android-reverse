package coil3.disk;

import coil3.disk.AbstractC5469c;
import coil3.disk.InterfaceC5467a;
import kotlin.AbstractC9923a;
import okio.FileSystem;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

/* renamed from: coil3.disk.c */
/* loaded from: classes3.dex */
public abstract class AbstractC5469c {

    /* renamed from: a */
    public static final InterfaceC10773d f3681a = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: m.c
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return AbstractC5469c.m3143c();
        }
    });

    /* renamed from: b */
    public static final InterfaceC5467a m3142b() {
        return (InterfaceC5467a) f3681a.getValue();
    }

    /* renamed from: c */
    public static final InterfaceC5467a m3143c() {
        return new InterfaceC5467a.a().m3132b(FileSystem.SYSTEM_TEMPORARY_DIRECTORY.resolve("coil3_disk_cache")).m3131a();
    }

    /* renamed from: d */
    public static final InterfaceC5467a m3144d() {
        return m3142b();
    }
}
