package androidx.compose.p014ui.text.font;

import androidx.appcompat.app.AppCompatDelegate;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutKt;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1", m26211f = "FontListFontFamilyTypefaceAdapter.kt", m26212l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FontListFontFamilyTypefaceAdapter$preload$3$2$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ Font $font;
    final /* synthetic */ PlatformFontLoader $resourceLoader;
    int label;
    final /* synthetic */ FontListFontFamilyTypefaceAdapter this$0;

    @InterfaceC11829d(m26210c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1", m26211f = "FontListFontFamilyTypefaceAdapter.kt", m26212l = {111}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1 */
    public static final class C31591 extends SuspendLambda implements InterfaceC9540l {
        final /* synthetic */ Font $font;
        final /* synthetic */ PlatformFontLoader $resourceLoader;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1", m26211f = "FontListFontFamilyTypefaceAdapter.kt", m26212l = {112}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ Font $font;
            final /* synthetic */ PlatformFontLoader $resourceLoader;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlatformFontLoader platformFontLoader, Font font, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$resourceLoader = platformFontLoader;
                this.$font = font;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass1(this.$resourceLoader, this.$font, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                    return obj;
                }
                AbstractC9924b.m20071b(obj);
                PlatformFontLoader platformFontLoader = this.$resourceLoader;
                Font font = this.$font;
                this.label = 1;
                Object objAwaitLoad = platformFontLoader.awaitLoad(font, this);
                return objAwaitLoad == objM25952f ? objM25952f : objAwaitLoad;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<Object> interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31591(Font font, PlatformFontLoader platformFontLoader, InterfaceC11588c<? super C31591> interfaceC11588c) {
            super(1, interfaceC11588c);
            this.$font = font;
            this.$resourceLoader = platformFontLoader;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(InterfaceC11588c<?> interfaceC11588c) {
            return new C31591(this.$font, this.$resourceLoader, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$resourceLoader, this.$font, null);
                    this.label = 1;
                    obj = TimeoutKt.m20487c(15000L, anonymousClass1, this);
                    if (obj == objM25952f) {
                        return objM25952f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                }
                if (obj != null) {
                    return obj;
                }
                throw new IllegalStateException("Unable to load font " + this.$font);
            } catch (Exception e10) {
                throw new IllegalStateException("Unable to load font " + this.$font, e10);
            }
        }

        @Override // p181hd.InterfaceC9540l
        public final Object invoke(InterfaceC11588c<Object> interfaceC11588c) {
            return ((C31591) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontListFontFamilyTypefaceAdapter$preload$3$2$1(FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, Font font, PlatformFontLoader platformFontLoader, InterfaceC11588c<? super FontListFontFamilyTypefaceAdapter$preload$3$2$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = fontListFontFamilyTypefaceAdapter;
        this.$font = font;
        this.$resourceLoader = platformFontLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new FontListFontFamilyTypefaceAdapter$preload$3$2$1(this.this$0, this.$font, this.$resourceLoader, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return obj;
        }
        AbstractC9924b.m20071b(obj);
        AsyncTypefaceCache asyncTypefaceCache = this.this$0.asyncTypefaceCache;
        Font font = this.$font;
        PlatformFontLoader platformFontLoader = this.$resourceLoader;
        C31591 c31591 = new C31591(font, platformFontLoader, null);
        this.label = 1;
        Object objRunCached = asyncTypefaceCache.runCached(font, platformFontLoader, true, c31591, this);
        return objRunCached == objM25952f ? objM25952f : objRunCached;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<Object> interfaceC11588c) {
        return ((FontListFontFamilyTypefaceAdapter$preload$3$2$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
