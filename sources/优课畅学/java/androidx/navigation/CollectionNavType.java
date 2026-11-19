package androidx.navigation;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class CollectionNavType<T> extends NavType<T> {
    public CollectionNavType(boolean z10) {
        super(z10);
    }

    public abstract T emptyCollection();

    public abstract List<String> serializeAsValues(T t10);
}
