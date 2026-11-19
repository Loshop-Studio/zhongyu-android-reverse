package androidx.compose.p014ui.text.font;

import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class FontFamilyResolverImpl implements FontFamily.Resolver {
    public static final int $stable = 8;
    private final InterfaceC9540l createDefaultTypeface;
    private final FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
    private final PlatformFontFamilyTypefaceAdapter platformFamilyTypefaceAdapter;
    private final PlatformFontLoader platformFontLoader;
    private final PlatformResolveInterceptor platformResolveInterceptor;
    private final TypefaceRequestCache typefaceRequestCache;

    @InterfaceC11829d(m26210c = "androidx.compose.ui.text.font.FontFamilyResolverImpl", m26211f = "FontFamilyResolver.kt", m26212l = {43}, m26213m = "preload")
    /* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1 */
    public static final class C31551 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C31551(InterfaceC11588c<? super C31551> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FontFamilyResolverImpl.this.preload(null, this);
        }
    }

    public FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter) {
        this.platformFontLoader = platformFontLoader;
        this.platformResolveInterceptor = platformResolveInterceptor;
        this.typefaceRequestCache = typefaceRequestCache;
        this.fontListFontFamilyTypefaceAdapter = fontListFontFamilyTypefaceAdapter;
        this.platformFamilyTypefaceAdapter = platformFontFamilyTypefaceAdapter;
        this.createDefaultTypeface = new InterfaceC9540l() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$createDefaultTypeface$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final Object invoke(TypefaceRequest typefaceRequest) {
                return this.this$0.resolve(TypefaceRequest.m33118copye1PVR60$default(typefaceRequest, null, null, 0, 0, null, 30, null)).getValue();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final State<Object> resolve(final TypefaceRequest typefaceRequest) {
        return this.typefaceRequestCache.runCached(typefaceRequest, new InterfaceC9540l() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$resolve$result$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final TypefaceResult invoke(InterfaceC9540l interfaceC9540l) {
                TypefaceResult typefaceResultResolve = this.this$0.fontListFontFamilyTypefaceAdapter.resolve(typefaceRequest, this.this$0.getPlatformFontLoader$ui_text_release(), interfaceC9540l, this.this$0.createDefaultTypeface);
                if (typefaceResultResolve != null) {
                    return typefaceResultResolve;
                }
                TypefaceResult typefaceResultResolve2 = this.this$0.platformFamilyTypefaceAdapter.resolve(typefaceRequest, this.this$0.getPlatformFontLoader$ui_text_release(), interfaceC9540l, this.this$0.createDefaultTypeface);
                if (typefaceResultResolve2 != null) {
                    return typefaceResultResolve2;
                }
                throw new IllegalStateException("Could not load font");
            }
        });
    }

    public final PlatformFontLoader getPlatformFontLoader$ui_text_release() {
        return this.platformFontLoader;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object preload(androidx.compose.p014ui.text.font.FontFamily r13, vc.InterfaceC11588c<? super p309qc.C10786q> r14) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r14 instanceof androidx.compose.p014ui.text.font.FontFamilyResolverImpl.C31551
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1 r0 = (androidx.compose.p014ui.text.font.FontFamilyResolverImpl.C31551) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1 r0 = new androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r13 = r0.L$1
            androidx.compose.ui.text.font.FontFamily r13 = (androidx.compose.p014ui.text.font.FontFamily) r13
            java.lang.Object r0 = r0.L$0
            androidx.compose.ui.text.font.FontFamilyResolverImpl r0 = (androidx.compose.p014ui.text.font.FontFamilyResolverImpl) r0
            kotlin.AbstractC9924b.m20071b(r14)
            goto L55
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            kotlin.AbstractC9924b.m20071b(r14)
            boolean r14 = r13 instanceof androidx.compose.p014ui.text.font.FontListFontFamily
            if (r14 != 0) goto L43
            qc.q r13 = p309qc.C10786q.f26013a
            return r13
        L43:
            androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter r14 = r12.fontListFontFamilyTypefaceAdapter
            androidx.compose.ui.text.font.PlatformFontLoader r2 = r12.platformFontLoader
            r0.L$0 = r12
            r0.L$1 = r13
            r0.label = r3
            java.lang.Object r14 = r14.preload(r13, r2, r0)
            if (r14 != r1) goto L54
            return r1
        L54:
            r0 = r12
        L55:
            r14 = r13
            androidx.compose.ui.text.font.FontListFontFamily r14 = (androidx.compose.p014ui.text.font.FontListFontFamily) r14
            java.util.List r14 = r14.getFonts()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r14.size()
            r1.<init>(r2)
            r2 = r14
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r3 = 0
        L6d:
            if (r3 >= r2) goto La7
            java.lang.Object r4 = r14.get(r3)
            androidx.compose.ui.text.font.Font r4 = (androidx.compose.p014ui.text.font.Font) r4
            androidx.compose.ui.text.font.TypefaceRequest r5 = new androidx.compose.ui.text.font.TypefaceRequest
            androidx.compose.ui.text.font.PlatformResolveInterceptor r6 = r0.platformResolveInterceptor
            androidx.compose.ui.text.font.FontFamily r6 = r6.interceptFontFamily(r13)
            androidx.compose.ui.text.font.PlatformResolveInterceptor r7 = r0.platformResolveInterceptor
            androidx.compose.ui.text.font.FontWeight r8 = r4.getWeight()
            androidx.compose.ui.text.font.FontWeight r7 = r7.interceptFontWeight(r8)
            androidx.compose.ui.text.font.PlatformResolveInterceptor r8 = r0.platformResolveInterceptor
            int r4 = r4.mo33030getStyle_LCdwA()
            int r8 = r8.m33102interceptFontStyleT2F_aPo(r4)
            androidx.compose.ui.text.font.FontSynthesis$Companion r4 = androidx.compose.p014ui.text.font.FontSynthesis.Companion
            int r9 = r4.m33094getAllGVVA2EU()
            androidx.compose.ui.text.font.PlatformFontLoader r4 = r0.platformFontLoader
            java.lang.Object r10 = r4.getCacheKey()
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1.add(r5)
            int r3 = r3 + 1
            goto L6d
        La7:
            androidx.compose.ui.text.font.TypefaceRequestCache r13 = r0.typefaceRequestCache
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2 r14 = new androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2
            r14.<init>()
            r13.preWarmCache(r1, r14)
            qc.q r13 = p309qc.C10786q.f26013a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.text.font.FontFamilyResolverImpl.preload(androidx.compose.ui.text.font.FontFamily, vc.c):java.lang.Object");
    }

    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    /* renamed from: resolve-DPcqOEQ */
    public State<Object> mo33050resolveDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i10, int i11) {
        return resolve(new TypefaceRequest(this.platformResolveInterceptor.interceptFontFamily(fontFamily), this.platformResolveInterceptor.interceptFontWeight(fontWeight), this.platformResolveInterceptor.m33102interceptFontStyleT2F_aPo(i10), this.platformResolveInterceptor.m33103interceptFontSynthesisMscr08Y(i11), this.platformFontLoader.getCacheKey(), null));
    }

    public /* synthetic */ FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter, int i10, AbstractC9972n abstractC9972n) {
        this(platformFontLoader, (i10 & 2) != 0 ? PlatformResolveInterceptor.Companion.getDefault$ui_text_release() : platformResolveInterceptor, (i10 & 4) != 0 ? FontFamilyResolverKt.getGlobalTypefaceRequestCache() : typefaceRequestCache, (i10 & 8) != 0 ? new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), null, 2, null) : fontListFontFamilyTypefaceAdapter, (i10 & 16) != 0 ? new PlatformFontFamilyTypefaceAdapter() : platformFontFamilyTypefaceAdapter);
    }
}
