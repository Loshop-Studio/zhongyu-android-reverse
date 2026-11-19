package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC2770m;
import kotlin.jvm.internal.C2769l;
import okhttp3.internal.cache.DiskLruCache;
import org.jetbrains.annotations.NotNull;
import p128o2.C2925r;
import p171x2.InterfaceC3470l;

/* loaded from: classes.dex */
final class DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1 extends AbstractC2770m implements InterfaceC3470l<IOException, C2925r> {
    final /* synthetic */ int $index$inlined;
    final /* synthetic */ DiskLruCache.Editor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1(DiskLruCache.Editor editor, int i4) {
        super(1);
        this.this$0 = editor;
        this.$index$inlined = i4;
    }

    @Override // p171x2.InterfaceC3470l
    public /* bridge */ /* synthetic */ C2925r invoke(IOException iOException) {
        invoke2(iOException);
        return C2925r.f11415a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull IOException it) {
        C2769l.m9241e(it, "it");
        synchronized (this.this$0.this$0) {
            this.this$0.detach$okhttp();
            C2925r c2925r = C2925r.f11415a;
        }
    }
}
