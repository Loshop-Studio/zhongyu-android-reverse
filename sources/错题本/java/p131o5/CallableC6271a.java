package p131o5;

import android.content.res.AssetFileDescriptor;
import io.objectbox.query.Query;
import java.io.Closeable;
import java.util.concurrent.Callable;

/* renamed from: o5.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class CallableC6271a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f10023a;

    /* renamed from: b */
    public final /* synthetic */ Closeable f10024b;

    public /* synthetic */ CallableC6271a(Closeable closeable, int i) {
        this.f10023a = i;
        this.f10024b = closeable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f10023a) {
            case 0:
                Query query = (Query) this.f10024b;
                return query.nativeFindUnique(query.f8973d, query.f8970a.m5031b().internalHandle());
            case 1:
                Query query2 = (Query) this.f10024b;
                return query2.nativeFind(query2.f8973d, query2.f8970a.m5031b().internalHandle(), 0L, 0L);
            default:
                return (AssetFileDescriptor) this.f10024b;
        }
    }
}
