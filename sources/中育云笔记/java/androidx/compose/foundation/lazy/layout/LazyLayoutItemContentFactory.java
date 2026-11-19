package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactory {
    public static final int $stable = 8;
    private final InterfaceC9529a itemProvider;
    private final MutableScatterMap<Object, CachedItemContent> lambdasCache = ScatterMapKt.mutableScatterMapOf();
    private final SaveableStateHolder saveableStateHolder;

    public final class CachedItemContent {
        private InterfaceC9544p _content;
        private final Object contentType;
        private int index;
        private final Object key;

        public CachedItemContent(int i10, Object obj, Object obj2) {
            this.key = obj;
            this.contentType = obj2;
            this.index = i10;
        }

        private final InterfaceC9544p createContentLambda() {
            final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = LazyLayoutItemContentFactory.this;
            return ComposableLambdaKt.composableLambdaInstance(1403994769, true, new InterfaceC9544p() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                @Composable
                public final void invoke(Composer composer, int i10) {
                    Composer composer2;
                    if (!composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1403994769, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:87)");
                    }
                    LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) lazyLayoutItemContentFactory.getItemProvider().invoke();
                    int index = this.getIndex();
                    if ((index >= lazyLayoutItemProvider.getItemCount() || !AbstractC9979u.m20289b(lazyLayoutItemProvider.getKey(index), this.getKey())) && (index = lazyLayoutItemProvider.getIndex(this.getKey())) != -1) {
                        this.index = index;
                    }
                    int i11 = index;
                    if (i11 != -1) {
                        composer.startReplaceGroup(-660404355);
                        composer2 = composer;
                        LazyLayoutItemContentFactoryKt.m27631SkippableItemJVlU9Rs(lazyLayoutItemProvider, StableValue.m27653constructorimpl(lazyLayoutItemContentFactory.saveableStateHolder), i11, StableValue.m27653constructorimpl(this.getKey()), composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2 = composer;
                        composer2.startReplaceGroup(-660169871);
                        composer2.endReplaceGroup();
                    }
                    Object key = this.getKey();
                    boolean zChangedInstance = composer2.changedInstance(this);
                    final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this;
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$1$1
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent2 = cachedItemContent;
                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$1$1$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        cachedItemContent2._content = null;
                                    }
                                };
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    EffectsKt.DisposableEffect(key, (InterfaceC9540l) objRememberedValue, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
        }

        public final InterfaceC9544p getContent() {
            InterfaceC9544p interfaceC9544p = this._content;
            if (interfaceC9544p != null) {
                return interfaceC9544p;
            }
            InterfaceC9544p interfaceC9544pCreateContentLambda = createContentLambda();
            this._content = interfaceC9544pCreateContentLambda;
            return interfaceC9544pCreateContentLambda;
        }

        public final Object getContentType() {
            return this.contentType;
        }

        public final int getIndex() {
            return this.index;
        }

        public final Object getKey() {
            return this.key;
        }
    }

    public LazyLayoutItemContentFactory(SaveableStateHolder saveableStateHolder, InterfaceC9529a interfaceC9529a) {
        this.saveableStateHolder = saveableStateHolder;
        this.itemProvider = interfaceC9529a;
    }

    public final InterfaceC9544p getContent(int i10, Object obj, Object obj2) {
        CachedItemContent cachedItemContent = this.lambdasCache.get(obj);
        if (cachedItemContent != null && cachedItemContent.getIndex() == i10 && AbstractC9979u.m20289b(cachedItemContent.getContentType(), obj2)) {
            return cachedItemContent.getContent();
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(i10, obj, obj2);
        this.lambdasCache.set(obj, cachedItemContent2);
        return cachedItemContent2.getContent();
    }

    public final Object getContentType(Object obj) {
        if (obj == null) {
            return null;
        }
        CachedItemContent cachedItemContent = this.lambdasCache.get(obj);
        if (cachedItemContent != null) {
            return cachedItemContent.getContentType();
        }
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) this.itemProvider.invoke();
        int index = lazyLayoutItemProvider.getIndex(obj);
        if (index != -1) {
            return lazyLayoutItemProvider.getContentType(index);
        }
        return null;
    }

    public final InterfaceC9529a getItemProvider() {
        return this.itemProvider;
    }
}
