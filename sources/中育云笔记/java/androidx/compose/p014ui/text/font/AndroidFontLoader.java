package androidx.compose.p014ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p014ui.text.font.FontLoadingStrategy;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidFontLoader implements PlatformFontLoader {
    public static final int $stable = 8;
    private final Object cacheKey;
    private final Context context;

    @InterfaceC11829d(m26210c = "androidx.compose.ui.text.font.AndroidFontLoader", m26211f = "AndroidFontLoader.android.kt", m26212l = {55, Opcodes.DSTORE}, m26213m = "awaitLoad")
    /* renamed from: androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 */
    public static final class C31521 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C31521(InterfaceC11588c<? super C31521> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidFontLoader.this.awaitLoad(null, this);
        }
    }

    public AndroidFontLoader(Context context) {
        this.context = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p014ui.text.font.PlatformFontLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitLoad(androidx.compose.p014ui.text.font.Font r6, vc.InterfaceC11588c<? super android.graphics.Typeface> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.p014ui.text.font.AndroidFontLoader.C31521
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = (androidx.compose.p014ui.text.font.AndroidFontLoader.C31521) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = new androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.L$1
            androidx.compose.ui.text.font.Font r6 = (androidx.compose.p014ui.text.font.Font) r6
            java.lang.Object r0 = r0.L$0
            androidx.compose.ui.text.font.AndroidFontLoader r0 = (androidx.compose.p014ui.text.font.AndroidFontLoader) r0
            kotlin.AbstractC9924b.m20071b(r7)
            goto L70
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            kotlin.AbstractC9924b.m20071b(r7)
            return r7
        L40:
            kotlin.AbstractC9924b.m20071b(r7)
            boolean r7 = r6 instanceof androidx.compose.p014ui.text.font.AndroidFont
            if (r7 == 0) goto L59
            androidx.compose.ui.text.font.AndroidFont r6 = (androidx.compose.p014ui.text.font.AndroidFont) r6
            androidx.compose.ui.text.font.AndroidFont$TypefaceLoader r7 = r6.getTypefaceLoader()
            android.content.Context r2 = r5.context
            r0.label = r4
            java.lang.Object r6 = r7.awaitLoad(r2, r6, r0)
            if (r6 != r1) goto L58
            goto L6e
        L58:
            return r6
        L59:
            boolean r7 = r6 instanceof androidx.compose.p014ui.text.font.ResourceFont
            if (r7 == 0) goto L7f
            r7 = r6
            androidx.compose.ui.text.font.ResourceFont r7 = (androidx.compose.p014ui.text.font.ResourceFont) r7
            android.content.Context r2 = r5.context
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = androidx.compose.p014ui.text.font.AndroidFontLoader_androidKt.access$loadAsync(r7, r2, r0)
            if (r7 != r1) goto L6f
        L6e:
            return r1
        L6f:
            r0 = r5
        L70:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            androidx.compose.ui.text.font.ResourceFont r6 = (androidx.compose.p014ui.text.font.ResourceFont) r6
            androidx.compose.ui.text.font.FontVariation$Settings r6 = r6.getVariationSettings()
            android.content.Context r0 = r0.context
            android.graphics.Typeface r6 = androidx.compose.p014ui.text.font.PlatformTypefaces_androidKt.setFontVariationSettings(r7, r6, r0)
            return r6
        L7f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown font type: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.text.font.AndroidFontLoader.awaitLoad(androidx.compose.ui.text.font.Font, vc.c):java.lang.Object");
    }

    @Override // androidx.compose.p014ui.text.font.PlatformFontLoader
    public Object getCacheKey() {
        return this.cacheKey;
    }

    @Override // androidx.compose.p014ui.text.font.PlatformFontLoader
    public Typeface loadBlocking(Font font) {
        Object objM20054c;
        Typeface typefaceLoad;
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            return androidFont.getTypefaceLoader().loadBlocking(this.context, androidFont);
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        int iMo33022getLoadingStrategyPKNRLFQ = font.mo33022getLoadingStrategyPKNRLFQ();
        FontLoadingStrategy.Companion companion = FontLoadingStrategy.Companion;
        if (FontLoadingStrategy.m33064equalsimpl0(iMo33022getLoadingStrategyPKNRLFQ, companion.m33069getBlockingPKNRLFQ())) {
            typefaceLoad = AndroidFontLoader_androidKt.load((ResourceFont) font, this.context);
        } else {
            if (!FontLoadingStrategy.m33064equalsimpl0(iMo33022getLoadingStrategyPKNRLFQ, companion.m33070getOptionalLocalPKNRLFQ())) {
                if (FontLoadingStrategy.m33064equalsimpl0(iMo33022getLoadingStrategyPKNRLFQ, companion.m33068getAsyncPKNRLFQ())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) FontLoadingStrategy.m33066toStringimpl(font.mo33022getLoadingStrategyPKNRLFQ())));
            }
            try {
                Result.C9921a c9921a = Result.f23263d;
                objM20054c = Result.m20054c(AndroidFontLoader_androidKt.load((ResourceFont) font, this.context));
            } catch (Throwable th) {
                Result.C9921a c9921a2 = Result.f23263d;
                objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
            }
            typefaceLoad = (Typeface) (Result.m20058g(objM20054c) ? null : objM20054c);
        }
        return PlatformTypefaces_androidKt.setFontVariationSettings(typefaceLoad, ((ResourceFont) font).getVariationSettings(), this.context);
    }
}
