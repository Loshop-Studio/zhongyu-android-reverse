package androidx.compose.p011ui.text;

import androidx.collection.LruCache;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m5110d2 = {"Landroidx/compose/ui/text/TextLayoutCache;", "", "", "capacity", "<init>", "(I)V", "Landroidx/compose/ui/text/TextLayoutInput;", "key", "Landroidx/compose/ui/text/TextLayoutResult;", "get", "(Landroidx/compose/ui/text/TextLayoutInput;)Landroidx/compose/ui/text/TextLayoutResult;", "value", "Ld6/s;", "put", "(Landroidx/compose/ui/text/TextLayoutInput;Landroidx/compose/ui/text/TextLayoutResult;)V", "Landroidx/collection/LruCache;", "Landroidx/compose/ui/text/CacheTextLayoutInput;", "cache", "Landroidx/collection/LruCache;", "singleSizeCacheInput", "Landroidx/compose/ui/text/CacheTextLayoutInput;", "singleSizeCacheResult", "Landroidx/compose/ui/text/TextLayoutResult;", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class TextLayoutCache {
    public static final int $stable = 8;

    @Nullable
    private final LruCache<CacheTextLayoutInput, TextLayoutResult> cache;

    @Nullable
    private CacheTextLayoutInput singleSizeCacheInput;

    @Nullable
    private TextLayoutResult singleSizeCacheResult;

    public TextLayoutCache() {
        this(0, 1, null);
    }

    @Nullable
    public final TextLayoutResult get(@NotNull TextLayoutInput key) {
        TextLayoutResult textLayoutResult;
        CacheTextLayoutInput cacheTextLayoutInput = new CacheTextLayoutInput(key);
        LruCache<CacheTextLayoutInput, TextLayoutResult> lruCache = this.cache;
        if (lruCache != null) {
            textLayoutResult = lruCache.get(cacheTextLayoutInput);
        } else {
            if (!AbstractC5830k.m5325b(this.singleSizeCacheInput, cacheTextLayoutInput)) {
                return null;
            }
            textLayoutResult = this.singleSizeCacheResult;
        }
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts()) {
            return null;
        }
        return textLayoutResult;
    }

    public final void put(@NotNull TextLayoutInput key, @NotNull TextLayoutResult value) {
        LruCache<CacheTextLayoutInput, TextLayoutResult> lruCache = this.cache;
        if (lruCache != null) {
            lruCache.put(new CacheTextLayoutInput(key), value);
        } else {
            this.singleSizeCacheInput = new CacheTextLayoutInput(key);
            this.singleSizeCacheResult = value;
        }
    }

    public TextLayoutCache(int i) {
        this.cache = i != 1 ? new LruCache<>(i) : null;
    }

    public /* synthetic */ TextLayoutCache(int i, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? 8 : i);
    }
}
