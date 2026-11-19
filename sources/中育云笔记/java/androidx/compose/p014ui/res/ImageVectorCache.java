package androidx.compose.p014ui.res;

import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.p014ui.graphics.vector.ImageVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ImageVectorCache {
    public static final int $stable = 8;
    private final HashMap<Key, WeakReference<ImageVectorEntry>> map = new HashMap<>();

    @StabilityInferred(parameters = 1)
    public static final class ImageVectorEntry {
        public static final int $stable = 0;
        private final int configFlags;
        private final ImageVector imageVector;

        public ImageVectorEntry(ImageVector imageVector, int i10) {
            this.imageVector = imageVector;
            this.configFlags = i10;
        }

        public static /* synthetic */ ImageVectorEntry copy$default(ImageVectorEntry imageVectorEntry, ImageVector imageVector, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageVector = imageVectorEntry.imageVector;
            }
            if ((i11 & 2) != 0) {
                i10 = imageVectorEntry.configFlags;
            }
            return imageVectorEntry.copy(imageVector, i10);
        }

        public final ImageVector component1() {
            return this.imageVector;
        }

        public final int component2() {
            return this.configFlags;
        }

        public final ImageVectorEntry copy(ImageVector imageVector, int i10) {
            return new ImageVectorEntry(imageVector, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageVectorEntry)) {
                return false;
            }
            ImageVectorEntry imageVectorEntry = (ImageVectorEntry) obj;
            return AbstractC9979u.m20289b(this.imageVector, imageVectorEntry.imageVector) && this.configFlags == imageVectorEntry.configFlags;
        }

        public final int getConfigFlags() {
            return this.configFlags;
        }

        public final ImageVector getImageVector() {
            return this.imageVector;
        }

        public int hashCode() {
            return (this.imageVector.hashCode() * 31) + Integer.hashCode(this.configFlags);
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.imageVector + ", configFlags=" + this.configFlags + ')';
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class Key {
        public static final int $stable = 8;

        /* renamed from: id */
        private final int f1277id;
        private final Resources.Theme theme;

        public Key(Resources.Theme theme, int i10) {
            this.theme = theme;
            this.f1277id = i10;
        }

        public static /* synthetic */ Key copy$default(Key key, Resources.Theme theme, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                theme = key.theme;
            }
            if ((i11 & 2) != 0) {
                i10 = key.f1277id;
            }
            return key.copy(theme, i10);
        }

        public final Resources.Theme component1() {
            return this.theme;
        }

        public final int component2() {
            return this.f1277id;
        }

        public final Key copy(Resources.Theme theme, int i10) {
            return new Key(theme, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return AbstractC9979u.m20289b(this.theme, key.theme) && this.f1277id == key.f1277id;
        }

        public final int getId() {
            return this.f1277id;
        }

        public final Resources.Theme getTheme() {
            return this.theme;
        }

        public int hashCode() {
            return (this.theme.hashCode() * 31) + Integer.hashCode(this.f1277id);
        }

        public String toString() {
            return "Key(theme=" + this.theme + ", id=" + this.f1277id + ')';
        }
    }

    public final void clear() {
        this.map.clear();
    }

    public final ImageVectorEntry get(Key key) {
        WeakReference<ImageVectorEntry> weakReference = this.map.get(key);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void prune(int i10) {
        Iterator<Map.Entry<Key, WeakReference<ImageVectorEntry>>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            ImageVectorEntry imageVectorEntry = it.next().getValue().get();
            if (imageVectorEntry == null || Configuration.needNewResources(i10, imageVectorEntry.getConfigFlags())) {
                it.remove();
            }
        }
    }

    public final void set(Key key, ImageVectorEntry imageVectorEntry) {
        this.map.put(key, new WeakReference<>(imageVectorEntry));
    }
}
