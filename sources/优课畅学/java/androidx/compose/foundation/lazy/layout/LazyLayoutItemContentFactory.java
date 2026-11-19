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
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactory {
    public static final int $stable = 8;
    private final InterfaceC10559a itemProvider;
    private final MutableScatterMap<Object, CachedItemContent> lambdasCache = ScatterMapKt.mutableScatterMapOf();
    private final SaveableStateHolder saveableStateHolder;

    public final class CachedItemContent {
        private InterfaceC10574p _content;
        private final Object contentType;
        private int index;
        private final Object key;

        public CachedItemContent(int i10, Object obj, Object obj2) {
            this.key = obj;
            this.contentType = obj2;
            this.index = i10;
        }

        private final InterfaceC10574p createContentLambda() {
            final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = LazyLayoutItemContentFactory.this;
            return ComposableLambdaKt.composableLambdaInstance(1403994769, true, new InterfaceC10574p() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C8736p.f16368a;
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
                    if ((index >= lazyLayoutItemProvider.getItemCount() || !AbstractC9133u.m16128b(lazyLayoutItemProvider.getKey(index), this.getKey())) && (index = lazyLayoutItemProvider.getIndex(this.getKey())) != -1) {
                        this.index = index;
                    }
                    int i11 = index;
                    if (i11 != -1) {
                        composer.startReplaceGroup(-660404355);
                        composer2 = composer;
                        LazyLayoutItemContentFactoryKt.m21029SkippableItemJVlU9Rs(lazyLayoutItemProvider, StableValue.m21051constructorimpl(lazyLayoutItemContentFactory.saveableStateHolder), i11, StableValue.m21051constructorimpl(this.getKey()), composer2, 0);
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
                        objRememberedValue = new InterfaceC10570l() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$1$1
                            {
                                super(1);
                            }

                            @Override // p300x7.InterfaceC10570l
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
                    EffectsKt.DisposableEffect(key, (InterfaceC10570l) objRememberedValue, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
        }

        public final InterfaceC10574p getContent() {
            InterfaceC10574p interfaceC10574p = this._content;
            if (interfaceC10574p != null) {
                return interfaceC10574p;
            }
            InterfaceC10574p interfaceC10574pCreateContentLambda = createContentLambda();
            this._content = interfaceC10574pCreateContentLambda;
            return interfaceC10574pCreateContentLambda;
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

    public LazyLayoutItemContentFactory(SaveableStateHolder saveableStateHolder, InterfaceC10559a interfaceC10559a) {
        this.saveableStateHolder = saveableStateHolder;
        this.itemProvider = interfaceC10559a;
    }

    public final InterfaceC10574p getContent(int i10, Object obj, Object obj2) {
        CachedItemContent cachedItemContent = this.lambdasCache.get(obj);
        if (cachedItemContent != null && cachedItemContent.getIndex() == i10 && AbstractC9133u.m16128b(cachedItemContent.getContentType(), obj2)) {
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

    public final InterfaceC10559a getItemProvider() {
        return this.itemProvider;
    }
}
