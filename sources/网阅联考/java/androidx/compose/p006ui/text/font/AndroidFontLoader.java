package androidx.compose.p006ui.text.font;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.compose.p006ui.text.font.AndroidFont;
import androidx.compose.p006ui.text.font.FontLoadingStrategy;
import androidx.compose.p006ui.text.font.FontVariation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3380c;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@Metadata(m5174d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\n \t*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m5175d2 = {"Landroidx/compose/ui/text/font/AndroidFontLoader;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", C3380c.f1965R, "Landroid/content/Context;", "(Landroid/content/Context;)V", "cacheKey", "", "getCacheKey", "()Ljava/lang/Object;", "kotlin.jvm.PlatformType", "awaitLoad", "Landroid/graphics/Typeface;", "font", "Landroidx/compose/ui/text/font/Font;", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBlocking", "ui-text_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidFontLoader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidFontLoader implements PlatformFontLoader {
    private final Object cacheKey;
    private final Context context;

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5191c = "androidx.compose.ui.text.font.AndroidFontLoader", m5192f = "AndroidFontLoader.android.kt", m5193i = {1, 1}, m5194l = {LockFreeTaskQueueCore.CLOSED_SHIFT, 62}, m5195m = "awaitLoad", m5196n = {"this", "font"}, m5197s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 */
    public static final class C16571 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C16571(Continuation<? super C16571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidFontLoader.this.awaitLoad(null, this);
        }
    }

    public AndroidFontLoader(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p006ui.text.font.PlatformFontLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitLoad(androidx.compose.p006ui.text.font.Font r7, kotlin.coroutines.Continuation<? super android.graphics.Typeface> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.p006ui.text.font.AndroidFontLoader.C16571
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = (androidx.compose.p006ui.text.font.AndroidFontLoader.C16571) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = new androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            java.lang.String r5 = "context"
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r7 = r0.L$1
            androidx.compose.ui.text.font.Font r7 = (androidx.compose.p006ui.text.font.Font) r7
            java.lang.Object r0 = r0.L$0
            androidx.compose.ui.text.font.AndroidFontLoader r0 = (androidx.compose.p006ui.text.font.AndroidFontLoader) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L78
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5d
        L42:
            kotlin.ResultKt.throwOnFailure(r8)
            boolean r8 = r7 instanceof androidx.compose.p006ui.text.font.AndroidFont
            if (r8 == 0) goto L5e
            androidx.compose.ui.text.font.AndroidFont r7 = (androidx.compose.p006ui.text.font.AndroidFont) r7
            androidx.compose.ui.text.font.AndroidFont$TypefaceLoader r8 = r7.getTypefaceLoader()
            android.content.Context r2 = r6.context
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            r0.label = r4
            java.lang.Object r8 = r8.awaitLoad(r2, r7, r0)
            if (r8 != r1) goto L5d
            return r1
        L5d:
            return r8
        L5e:
            boolean r8 = r7 instanceof androidx.compose.p006ui.text.font.ResourceFont
            if (r8 == 0) goto L8a
            r8 = r7
            androidx.compose.ui.text.font.ResourceFont r8 = (androidx.compose.p006ui.text.font.ResourceFont) r8
            android.content.Context r2 = r6.context
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = androidx.compose.p006ui.text.font.AndroidFontLoader_androidKt.access$loadAsync(r8, r2, r0)
            if (r8 != r1) goto L77
            return r1
        L77:
            r0 = r6
        L78:
            android.graphics.Typeface r8 = (android.graphics.Typeface) r8
            androidx.compose.ui.text.font.ResourceFont r7 = (androidx.compose.p006ui.text.font.ResourceFont) r7
            androidx.compose.ui.text.font.FontVariation$Settings r7 = r7.getVariationSettings()
            android.content.Context r0 = r0.context
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            android.graphics.Typeface r7 = androidx.compose.p006ui.text.font.PlatformTypefacesKt.setFontVariationSettings(r8, r7, r0)
            return r7
        L8a:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown font type: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.text.font.AndroidFontLoader.awaitLoad(androidx.compose.ui.text.font.Font, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.p006ui.text.font.PlatformFontLoader
    public Object getCacheKey() {
        return this.cacheKey;
    }

    @Override // androidx.compose.p006ui.text.font.PlatformFontLoader
    public Typeface loadBlocking(Font font) throws Resources.NotFoundException {
        Object objM11788constructorimpl;
        Typeface typefaceLoad;
        Intrinsics.checkNotNullParameter(font, "font");
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            AndroidFont.TypefaceLoader typefaceLoader = androidFont.getTypefaceLoader();
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            return typefaceLoader.loadBlocking(context, androidFont);
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        int loadingStrategy = font.getLoadingStrategy();
        FontLoadingStrategy.Companion companion = FontLoadingStrategy.INSTANCE;
        if (FontLoadingStrategy.m11149equalsimpl0(loadingStrategy, companion.m11154getBlockingPKNRLFQ())) {
            Context context2 = this.context;
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            typefaceLoad = AndroidFontLoader_androidKt.load((ResourceFont) font, context2);
        } else {
            if (!FontLoadingStrategy.m11149equalsimpl0(loadingStrategy, companion.m11155getOptionalLocalPKNRLFQ())) {
                if (FontLoadingStrategy.m11149equalsimpl0(loadingStrategy, companion.m11153getAsyncPKNRLFQ())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) FontLoadingStrategy.m11151toStringimpl(font.getLoadingStrategy())));
            }
            try {
                Result.Companion companion2 = Result.INSTANCE;
                Context context3 = this.context;
                Intrinsics.checkNotNullExpressionValue(context3, "context");
                objM11788constructorimpl = Result.m11788constructorimpl(AndroidFontLoader_androidKt.load((ResourceFont) font, context3));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM11788constructorimpl = Result.m11788constructorimpl(ResultKt.createFailure(th));
            }
            typefaceLoad = (Typeface) (Result.m11794isFailureimpl(objM11788constructorimpl) ? null : objM11788constructorimpl);
        }
        FontVariation.Settings variationSettings = ((ResourceFont) font).getVariationSettings();
        Context context4 = this.context;
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        return PlatformTypefacesKt.setFontVariationSettings(typefaceLoad, variationSettings, context4);
    }
}
