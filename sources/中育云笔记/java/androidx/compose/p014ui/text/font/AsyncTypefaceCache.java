package androidx.compose.p014ui.text.font;

import androidx.collection.LruCache;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.p014ui.text.platform.SynchronizedObject;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AsyncTypefaceCache {
    public static final int $stable = 8;
    private final Object PermanentFailure = AsyncTypefaceResult.m33033constructorimpl(null);
    private final LruCache<Key, AsyncTypefaceResult> resultCache = new LruCache<>(16);
    private final MutableScatterMap<Key, AsyncTypefaceResult> permanentCache = ScatterMapKt.mutableScatterMapOf();
    private final SynchronizedObject cacheLock = new SynchronizedObject();

    public static final class AsyncTypefaceResult {
        private final Object result;

        private /* synthetic */ AsyncTypefaceResult(Object obj) {
            this.result = obj;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ AsyncTypefaceResult m33032boximpl(Object obj) {
            return new AsyncTypefaceResult(obj);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static Object m33033constructorimpl(Object obj) {
            return obj;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m33034equalsimpl(Object obj, Object obj2) {
            return (obj2 instanceof AsyncTypefaceResult) && AbstractC9979u.m20289b(obj, ((AsyncTypefaceResult) obj2).m33039unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m33035equalsimpl0(Object obj, Object obj2) {
            return AbstractC9979u.m20289b(obj, obj2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m33036hashCodeimpl(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* renamed from: isPermanentFailure-impl, reason: not valid java name */
        public static final boolean m33037isPermanentFailureimpl(Object obj) {
            return obj == null;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m33038toStringimpl(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return m33034equalsimpl(this.result, obj);
        }

        public final Object getResult() {
            return this.result;
        }

        public int hashCode() {
            return m33036hashCodeimpl(this.result);
        }

        public String toString() {
            return m33038toStringimpl(this.result);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Object m33039unboximpl() {
            return this.result;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class Key {
        public static final int $stable = 8;
        private final Font font;
        private final Object loaderKey;

        public Key(Font font, Object obj) {
            this.font = font;
            this.loaderKey = obj;
        }

        public static /* synthetic */ Key copy$default(Key key, Font font, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                font = key.font;
            }
            if ((i10 & 2) != 0) {
                obj = key.loaderKey;
            }
            return key.copy(font, obj);
        }

        public final Font component1() {
            return this.font;
        }

        public final Object component2() {
            return this.loaderKey;
        }

        public final Key copy(Font font, Object obj) {
            return new Key(font, obj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return AbstractC9979u.m20289b(this.font, key.font) && AbstractC9979u.m20289b(this.loaderKey, key.loaderKey);
        }

        public final Font getFont() {
            return this.font;
        }

        public final Object getLoaderKey() {
            return this.loaderKey;
        }

        public int hashCode() {
            int iHashCode = this.font.hashCode() * 31;
            Object obj = this.loaderKey;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.font + ", loaderKey=" + this.loaderKey + ')';
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.ui.text.font.AsyncTypefaceCache", m26211f = "FontListFontFamilyTypefaceAdapter.kt", m26212l = {412}, m26213m = "runCached")
    /* renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 */
    public static final class C31541 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C31541(InterfaceC11588c<? super C31541> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AsyncTypefaceCache.this.runCached(null, null, false, null, this);
        }
    }

    public static /* synthetic */ void put$default(AsyncTypefaceCache asyncTypefaceCache, Font font, PlatformFontLoader platformFontLoader, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        asyncTypefaceCache.put(font, platformFontLoader, obj, z10);
    }

    /* renamed from: get-1ASDuI8, reason: not valid java name */
    public final AsyncTypefaceResult m33031get1ASDuI8(Font font, PlatformFontLoader platformFontLoader) {
        AsyncTypefaceResult asyncTypefaceResult;
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            asyncTypefaceResult = this.resultCache.get(key);
            if (asyncTypefaceResult == null) {
                asyncTypefaceResult = this.permanentCache.get(key);
            }
        }
        return asyncTypefaceResult;
    }

    public final void put(Font font, PlatformFontLoader platformFontLoader, Object obj, boolean z10) {
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            try {
                if (obj == null) {
                    this.permanentCache.set(key, AsyncTypefaceResult.m33032boximpl(this.PermanentFailure));
                    C10786q c10786q = C10786q.f26013a;
                } else if (z10) {
                    this.permanentCache.set(key, AsyncTypefaceResult.m33032boximpl(AsyncTypefaceResult.m33033constructorimpl(obj)));
                    C10786q c10786q2 = C10786q.f26013a;
                } else {
                    this.resultCache.put(key, AsyncTypefaceResult.m33032boximpl(AsyncTypefaceResult.m33033constructorimpl(obj)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runCached(androidx.compose.p014ui.text.font.Font r5, androidx.compose.p014ui.text.font.PlatformFontLoader r6, boolean r7, p181hd.InterfaceC9540l r8, vc.InterfaceC11588c<java.lang.Object> r9) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r9 instanceof androidx.compose.p014ui.text.font.AsyncTypefaceCache.C31541
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = (androidx.compose.p014ui.text.font.AsyncTypefaceCache.C31541) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            boolean r7 = r0.Z$0
            java.lang.Object r5 = r0.L$1
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r5 = (androidx.compose.ui.text.font.AsyncTypefaceCache.Key) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.ui.text.font.AsyncTypefaceCache r6 = (androidx.compose.p014ui.text.font.AsyncTypefaceCache) r6
            kotlin.AbstractC9924b.m20071b(r9)
            goto L7d
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.AbstractC9924b.m20071b(r9)
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r9 = new androidx.compose.ui.text.font.AsyncTypefaceCache$Key
            java.lang.Object r6 = r6.getCacheKey()
            r9.<init>(r5, r6)
            androidx.compose.ui.text.platform.SynchronizedObject r5 = r4.cacheLock
            monitor-enter(r5)
            androidx.collection.LruCache<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r6 = r4.resultCache     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r6 = r6.get(r9)     // Catch: java.lang.Throwable -> L5d
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r6 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r6     // Catch: java.lang.Throwable -> L5d
            if (r6 != 0) goto L5f
            androidx.collection.MutableScatterMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r6 = r4.permanentCache     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r6 = r6.get(r9)     // Catch: java.lang.Throwable -> L5d
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r6 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r6     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r6 = move-exception
            goto Lb3
        L5f:
            if (r6 == 0) goto L67
            java.lang.Object r6 = r6.m33039unboximpl()     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r5)
            return r6
        L67:
            qc.q r6 = p309qc.C10786q.f26013a     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r5)
            r0.L$0 = r4
            r0.L$1 = r9
            r0.Z$0 = r7
            r0.label = r3
            java.lang.Object r5 = r8.invoke(r0)
            if (r5 != r1) goto L79
            return r1
        L79:
            r6 = r9
            r9 = r5
            r5 = r6
            r6 = r4
        L7d:
            androidx.compose.ui.text.platform.SynchronizedObject r8 = r6.cacheLock
            monitor-enter(r8)
            if (r9 != 0) goto L90
            androidx.collection.MutableScatterMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r7 = r6.permanentCache     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r6 = r6.PermanentFailure     // Catch: java.lang.Throwable -> L8e
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r6 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m33032boximpl(r6)     // Catch: java.lang.Throwable -> L8e
            r7.set(r5, r6)     // Catch: java.lang.Throwable -> L8e
            goto Lad
        L8e:
            r5 = move-exception
            goto Lb1
        L90:
            if (r7 == 0) goto La0
            androidx.collection.MutableScatterMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r6 = r6.permanentCache     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r7 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m33033constructorimpl(r9)     // Catch: java.lang.Throwable -> L8e
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m33032boximpl(r7)     // Catch: java.lang.Throwable -> L8e
            r6.set(r5, r7)     // Catch: java.lang.Throwable -> L8e
            goto Lad
        La0:
            androidx.collection.LruCache<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r6 = r6.resultCache     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r7 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m33033constructorimpl(r9)     // Catch: java.lang.Throwable -> L8e
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m33032boximpl(r7)     // Catch: java.lang.Throwable -> L8e
            r6.put(r5, r7)     // Catch: java.lang.Throwable -> L8e
        Lad:
            qc.q r5 = p309qc.C10786q.f26013a     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r8)
            return r9
        Lb1:
            monitor-exit(r8)
            throw r5
        Lb3:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.text.font.AsyncTypefaceCache.runCached(androidx.compose.ui.text.font.Font, androidx.compose.ui.text.font.PlatformFontLoader, boolean, hd.l, vc.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object runCachedBlocking(Font font, PlatformFontLoader platformFontLoader, InterfaceC9529a interfaceC9529a) {
        synchronized (this.cacheLock) {
            try {
                Key key = new Key(font, platformFontLoader.getCacheKey());
                AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceResult) this.resultCache.get(key);
                if (asyncTypefaceResult == null) {
                    asyncTypefaceResult = (AsyncTypefaceResult) this.permanentCache.get(key);
                }
                if (asyncTypefaceResult != null) {
                    Object objM33039unboximpl = asyncTypefaceResult.m33039unboximpl();
                    AbstractC9977s.m20286b(2);
                    AbstractC9977s.m20285a(2);
                    return objM33039unboximpl;
                }
                C10786q c10786q = C10786q.f26013a;
                AbstractC9977s.m20286b(1);
                AbstractC9977s.m20285a(1);
                Object objInvoke = interfaceC9529a.invoke();
                put$default(this, font, platformFontLoader, objInvoke, false, 8, null);
                return objInvoke;
            } catch (Throwable th) {
                AbstractC9977s.m20286b(1);
                AbstractC9977s.m20285a(1);
                throw th;
            }
        }
    }
}
