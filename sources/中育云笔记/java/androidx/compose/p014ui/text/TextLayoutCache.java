package androidx.compose.p014ui.text;

import androidx.collection.LruCache;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TextLayoutCache {
    public static final int $stable = 8;
    private final LruCache<CacheTextLayoutInput, TextLayoutResult> cache;
    private CacheTextLayoutInput singleSizeCacheInput;
    private TextLayoutResult singleSizeCacheResult;

    public TextLayoutCache() {
        this(0, 1, null);
    }

    public final TextLayoutResult get(TextLayoutInput textLayoutInput) {
        TextLayoutResult textLayoutResult;
        CacheTextLayoutInput cacheTextLayoutInput = new CacheTextLayoutInput(textLayoutInput);
        LruCache<CacheTextLayoutInput, TextLayoutResult> lruCache = this.cache;
        if (lruCache != null) {
            textLayoutResult = lruCache.get(cacheTextLayoutInput);
        } else {
            if (!AbstractC9979u.m20289b(this.singleSizeCacheInput, cacheTextLayoutInput)) {
                return null;
            }
            textLayoutResult = this.singleSizeCacheResult;
        }
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts()) {
            return null;
        }
        return textLayoutResult;
    }

    public final void put(TextLayoutInput textLayoutInput, TextLayoutResult textLayoutResult) {
        LruCache<CacheTextLayoutInput, TextLayoutResult> lruCache = this.cache;
        if (lruCache != null) {
            lruCache.put(new CacheTextLayoutInput(textLayoutInput), textLayoutResult);
        } else {
            this.singleSizeCacheInput = new CacheTextLayoutInput(textLayoutInput);
            this.singleSizeCacheResult = textLayoutResult;
        }
    }

    public TextLayoutCache(int i10) {
        this.cache = i10 != 1 ? new LruCache<>(i10) : null;
    }

    public /* synthetic */ TextLayoutCache(int i10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
