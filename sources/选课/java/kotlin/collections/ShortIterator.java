package kotlin.collections;

import com.zykj.message.client.BuildConfig;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: Iterators.kt */
@Metadata(m16bv = {1, 0, 3}, m17d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\n\n\u0002\b\u0005\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H&¨\u0006\u0007"}, m18d2 = {"Lkotlin/collections/ShortIterator;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "()V", "next", "()Ljava/lang/Short;", "nextShort", "kotlin-stdlib"}, m19k = 1, m20mv = {1, 4, 0})
/* loaded from: classes.dex */
public abstract class ShortIterator implements Iterator<Short>, KMappedMarker {
    public abstract short nextShort();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final Short next() {
        return Short.valueOf(nextShort());
    }
}
