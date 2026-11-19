package androidx.compose.p006ui.text.caches;

import androidx.compose.p006ui.text.platform.Synchronization_jvmKt;
import androidx.compose.p006ui.text.platform.SynchronizedObject;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0018\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0019J\u0006\u0010\u0007\u001a\u00020\u0005J/\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u00012\b\u0010\u001f\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0002\u0010 J\u0006\u0010!\u001a\u00020\u001bJ\u0006\u0010\b\u001a\u00020\u0005J\u0015\u0010\"\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0002\u0010\u0019J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0005J\u001d\u0010#\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010$\u001a\u00028\u0001¢\u0006\u0002\u0010%J\u0006\u0010\u0013\u001a\u00020\u0005J\u0015\u0010&\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0002\u0010\u0019J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010(\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010$\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010)J\u001d\u0010*\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010$\u001a\u00028\u0001H\u0014¢\u0006\u0002\u0010)J\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010,J'\u0010-\u001a\u0002H.\"\u0004\b\u0002\u0010.2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002H.00H\u0080\bø\u0001\u0000¢\u0006\u0004\b1\u00102J\b\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000bj\b\u0012\u0004\u0012\u00028\u0000`\fX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000ej\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00058G@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00066"}, m5175d2 = {"Landroidx/compose/ui/text/caches/LruCache;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "maxSize", "", "(I)V", "createCount", "evictionCount", "hitCount", "keySet", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "map", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "missCount", "monitor", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "putCount", "<set-?>", "size", "()I", "create", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "entryRemoved", "", "evicted", "", "oldValue", "newValue", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "evictAll", "get", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "resize", "safeSizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "sizeOf", "snapshot", "", "synchronizedValue", "R", "block", "Lkotlin/Function0;", "synchronizedValue$ui_text_release", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "toString", "", "trimToSize", "ui-text_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,352:1\n349#1:353\n349#1:362\n349#1:364\n349#1:366\n349#1:368\n349#1:370\n349#1:372\n24#2:354\n24#2:356\n24#2:357\n24#2:358\n24#2:359\n24#2:360\n24#2:361\n24#2:363\n24#2:365\n24#2:367\n24#2:369\n24#2:371\n24#2:373\n24#2:374\n24#2:375\n24#2:376\n1#3:355\n*S KotlinDebug\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n*L\n41#1:353\n296#1:362\n302#1:364\n308#1:366\n313#1:368\n318#1:370\n323#1:372\n41#1:354\n72#1:356\n87#1:357\n105#1:358\n143#1:359\n177#1:360\n219#1:361\n296#1:363\n302#1:365\n308#1:367\n313#1:369\n318#1:371\n323#1:373\n330#1:374\n340#1:375\n349#1:376\n*E\n"})
/* loaded from: classes.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashSet<K> keySet;
    private final HashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private final SynchronizedObject monitor = Synchronization_jvmKt.createSynchronizedObject();
    private int putCount;
    private int size;

    public LruCache(int i4) {
        if (!(i4 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.maxSize = i4;
        this.map = new HashMap<>(0, 0.75f);
        this.keySet = new LinkedHashSet<>();
    }

    private final int safeSizeOf(K key, V value) {
        int iSizeOf = sizeOf(key, value);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        throw new IllegalStateException(("Negative size: " + key + '=' + value).toString());
    }

    public V create(K key) {
        return null;
    }

    public final int createCount() {
        int i4;
        synchronized (this.monitor) {
            i4 = this.createCount;
        }
        return i4;
    }

    public void entryRemoved(boolean evicted, K key, V oldValue, V newValue) {
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i4;
        synchronized (this.monitor) {
            i4 = this.evictionCount;
        }
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V get(K key) {
        synchronized (this.monitor) {
            V v3 = this.map.get(key);
            if (v3 != null) {
                this.keySet.remove(key);
                this.keySet.add(key);
                this.hitCount++;
                return v3;
            }
            this.missCount++;
            V vCreate = create(key);
            if (vCreate == null) {
                return null;
            }
            synchronized (this.monitor) {
                this.createCount++;
                Object objPut = this.map.put(key, vCreate);
                this.keySet.remove(key);
                this.keySet.add(key);
                if (objPut != 0) {
                    this.map.put(key, objPut);
                    v3 = objPut;
                } else {
                    this.size = size() + safeSizeOf(key, vCreate);
                }
                Unit unit = Unit.INSTANCE;
            }
            if (v3 != null) {
                entryRemoved(false, key, vCreate, v3);
                return v3;
            }
            trimToSize(this.maxSize);
            return vCreate;
        }
    }

    public final int hitCount() {
        int i4;
        synchronized (this.monitor) {
            i4 = this.hitCount;
        }
        return i4;
    }

    public final int maxSize() {
        int i4;
        synchronized (this.monitor) {
            i4 = this.maxSize;
        }
        return i4;
    }

    public final int missCount() {
        int i4;
        synchronized (this.monitor) {
            i4 = this.missCount;
        }
        return i4;
    }

    public final V put(K key, V value) {
        V vPut;
        if (key == null || value == null) {
            throw null;
        }
        synchronized (this.monitor) {
            this.putCount++;
            this.size = size() + safeSizeOf(key, value);
            vPut = this.map.put(key, value);
            if (vPut != null) {
                this.size = size() - safeSizeOf(key, vPut);
            }
            if (this.keySet.contains(key)) {
                this.keySet.remove(key);
            }
            this.keySet.add(key);
        }
        if (vPut != null) {
            entryRemoved(false, key, vPut, value);
        }
        trimToSize(this.maxSize);
        return vPut;
    }

    public final int putCount() {
        int i4;
        synchronized (this.monitor) {
            i4 = this.putCount;
        }
        return i4;
    }

    public final V remove(K key) {
        V vRemove;
        key.getClass();
        synchronized (this.monitor) {
            vRemove = this.map.remove(key);
            this.keySet.remove(key);
            if (vRemove != null) {
                this.size = size() - safeSizeOf(key, vRemove);
            }
            Unit unit = Unit.INSTANCE;
        }
        if (vRemove != null) {
            entryRemoved(false, key, vRemove, null);
        }
        return vRemove;
    }

    public void resize(int maxSize) {
        if (!(maxSize > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        synchronized (this.monitor) {
            this.maxSize = maxSize;
            Unit unit = Unit.INSTANCE;
        }
        trimToSize(maxSize);
    }

    @JvmName(name = "size")
    public final int size() {
        int i4;
        synchronized (this.monitor) {
            i4 = this.size;
        }
        return i4;
    }

    public int sizeOf(K key, V value) {
        return 1;
    }

    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.monitor) {
            linkedHashMap = new LinkedHashMap();
            Iterator<K> it = this.keySet.iterator();
            while (it.hasNext()) {
                K next = it.next();
                V v3 = this.map.get(next);
                Intrinsics.checkNotNull(v3);
                linkedHashMap.put(next, v3);
            }
        }
        return linkedHashMap;
    }

    public final <R> R synchronizedValue$ui_text_release(Function0<? extends R> block) {
        R rInvoke;
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this.monitor) {
            try {
                rInvoke = block.invoke();
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        return rInvoke;
    }

    public String toString() {
        String str;
        synchronized (this.monitor) {
            int i4 = this.hitCount;
            int i5 = this.missCount + i4;
            str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i5 != 0 ? (i4 * 100) / i5 : 0) + "%]";
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void trimToSize(int r8) {
        /*
            r7 = this;
        L0:
            androidx.compose.ui.text.platform.SynchronizedObject r0 = r7.monitor
            monitor-enter(r0)
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L91
            if (r1 < 0) goto L89
            java.util.HashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L91
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r1 == 0) goto L17
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L91
            if (r1 != 0) goto L89
        L17:
            java.util.HashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L91
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L91
            java.util.LinkedHashSet<K> r2 = r7.keySet     // Catch: java.lang.Throwable -> L91
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r1 != r2) goto L89
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L91
            r2 = 1
            r3 = 0
            if (r1 <= r8) goto L74
            java.util.HashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L91
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r1 != 0) goto L74
            java.util.LinkedHashSet<K> r1 = r7.keySet     // Catch: java.lang.Throwable -> L91
            java.lang.Object r1 = kotlin.collections.CollectionsKt.first(r1)     // Catch: java.lang.Throwable -> L91
            java.util.HashMap<K, V> r4 = r7.map     // Catch: java.lang.Throwable -> L91
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L91
            if (r4 == 0) goto L6c
            java.util.HashMap<K, V> r5 = r7.map     // Catch: java.lang.Throwable -> L91
            java.util.Map r5 = kotlin.jvm.internal.TypeIntrinsics.asMutableMap(r5)     // Catch: java.lang.Throwable -> L91
            r5.remove(r1)     // Catch: java.lang.Throwable -> L91
            java.util.LinkedHashSet<K> r5 = r7.keySet     // Catch: java.lang.Throwable -> L91
            java.util.Collection r5 = kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(r5)     // Catch: java.lang.Throwable -> L91
            r5.remove(r1)     // Catch: java.lang.Throwable -> L91
            int r5 = r7.size()     // Catch: java.lang.Throwable -> L91
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L91
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch: java.lang.Throwable -> L91
            int r6 = r7.safeSizeOf(r1, r4)     // Catch: java.lang.Throwable -> L91
            int r5 = r5 - r6
            r7.size = r5     // Catch: java.lang.Throwable -> L91
            int r5 = r7.evictionCount     // Catch: java.lang.Throwable -> L91
            int r5 = r5 + r2
            r7.evictionCount = r5     // Catch: java.lang.Throwable -> L91
            goto L76
        L6c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L91
            java.lang.String r1 = "inconsistent state"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L91
            throw r8     // Catch: java.lang.Throwable -> L91
        L74:
            r1 = r3
            r4 = r1
        L76:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L91
            monitor-exit(r0)
            if (r1 != 0) goto L7e
            if (r4 != 0) goto L7e
            return
        L7e:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r7.entryRemoved(r2, r1, r4, r3)
            goto L0
        L89:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L91
            java.lang.String r1 = "map/keySet size inconsistency"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L91
            throw r8     // Catch: java.lang.Throwable -> L91
        L91:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.text.caches.LruCache.trimToSize(int):void");
    }
}
