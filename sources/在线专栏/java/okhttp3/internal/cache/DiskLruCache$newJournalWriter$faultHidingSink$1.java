package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC2770m;
import kotlin.jvm.internal.C2769l;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import p128o2.C2925r;
import p171x2.InterfaceC3470l;

/* loaded from: classes.dex */
final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends AbstractC2770m implements InterfaceC3470l<IOException, C2925r> {
    final /* synthetic */ DiskLruCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.this$0 = diskLruCache;
    }

    @Override // p171x2.InterfaceC3470l
    public /* bridge */ /* synthetic */ C2925r invoke(IOException iOException) {
        invoke2(iOException);
        return C2925r.f11415a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull IOException it) {
        C2769l.m9241e(it, "it");
        DiskLruCache diskLruCache = this.this$0;
        if (!Util.assertionsEnabled || Thread.holdsLock(diskLruCache)) {
            this.this$0.hasJournalErrors = true;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        C2769l.m9240d(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(diskLruCache);
        throw new AssertionError(sb.toString());
    }
}
