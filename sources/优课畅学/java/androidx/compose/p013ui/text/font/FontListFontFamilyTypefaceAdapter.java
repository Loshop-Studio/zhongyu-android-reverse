package androidx.compose.p013ui.text.font;

import androidx.collection.MutableScatterSet;
import androidx.compose.p013ui.text.font.TypefaceResult;
import androidx.compose.p013ui.text.platform.DispatcherKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlinx.coroutines.AbstractC9165e;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p135i8.AbstractC8839h;
import p135i8.AbstractC8874s1;
import p135i8.InterfaceC8822b0;
import p135i8.InterfaceC8893z;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class FontListFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    private InterfaceC8822b0 asyncLoadScope;
    private final AsyncTypefaceCache asyncTypefaceCache;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final FontMatcher fontMatcher = new FontMatcher();
    private static final InterfaceC8893z DropExceptionHandler = new C3127x6d95c97a(InterfaceC8893z.f16555a0);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final InterfaceC8893z getDropExceptionHandler() {
            return FontListFontFamilyTypefaceAdapter.DropExceptionHandler;
        }

        public final FontMatcher getFontMatcher() {
            return FontListFontFamilyTypefaceAdapter.fontMatcher;
        }

        private Companion() {
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3", m17801f = "FontListFontFamilyTypefaceAdapter.kt", m17802l = {120}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3 */
    public static final class C31283 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ List<Font> $asyncLoads;
        final /* synthetic */ PlatformFontLoader $resourceLoader;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FontListFontFamilyTypefaceAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31283(List<Font> list, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontLoader platformFontLoader, InterfaceC9324c<? super C31283> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$asyncLoads = list;
            this.this$0 = fontListFontFamilyTypefaceAdapter;
            this.$resourceLoader = platformFontLoader;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C31283 c31283 = new C31283(this.$asyncLoads, this.this$0, this.$resourceLoader, interfaceC9324c);
            c31283.L$0 = obj;
            return c31283;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C31283) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
                List<Font> list = this.$asyncLoads;
                MutableScatterSet mutableScatterSet = new MutableScatterSet(list.size());
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Font font = list.get(i11);
                    if (mutableScatterSet.add(font)) {
                        arrayList.add(font);
                    }
                }
                FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = this.this$0;
                PlatformFontLoader platformFontLoader = this.$resourceLoader;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size2 = arrayList.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    arrayList2.add(AbstractC8839h.m14859b(interfaceC8822b0, null, null, new FontListFontFamilyTypefaceAdapter$preload$3$2$1(fontListFontFamilyTypefaceAdapter, (Font) arrayList.get(i12), platformFontLoader, null), 3, null));
                }
                this.label = 1;
                if (AwaitKt.m16211a(arrayList2, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", m17801f = "FontListFontFamilyTypefaceAdapter.kt", m17802l = {159}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1 */
    public static final class C31301 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ AsyncFontListLoader $asyncLoader;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31301(AsyncFontListLoader asyncFontListLoader, InterfaceC9324c<? super C31301> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$asyncLoader = asyncFontListLoader;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C31301(this.$asyncLoader, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C31301) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                AsyncFontListLoader asyncFontListLoader = this.$asyncLoader;
                this.label = 1;
                if (asyncFontListLoader.load(this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FontListFontFamilyTypefaceAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Object preload(FontFamily fontFamily, PlatformFontLoader platformFontLoader, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        FontFamily fontFamily2 = fontFamily;
        if (!(fontFamily2 instanceof FontListFontFamily)) {
            return C8736p.f16368a;
        }
        FontListFontFamily fontListFontFamily = (FontListFontFamily) fontFamily2;
        List<Font> fonts = fontListFontFamily.getFonts();
        List<Font> fonts2 = fontListFontFamily.getFonts();
        ArrayList arrayList = new ArrayList(fonts2.size());
        int size = fonts2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Font font = fonts2.get(i10);
            if (FontLoadingStrategy.m26462equalsimpl0(font.mo26420getLoadingStrategyPKNRLFQ(), FontLoadingStrategy.Companion.m26466getAsyncPKNRLFQ())) {
                arrayList.add(AbstractC8726f.m14230a(font.getWeight(), FontStyle.m26472boximpl(font.mo26428getStyle_LCdwA())));
            }
        }
        MutableScatterSet mutableScatterSet = new MutableScatterSet(arrayList.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Object obj = arrayList.get(i11);
            if (mutableScatterSet.add((Pair) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size3 = arrayList2.size();
        int i12 = 0;
        while (i12 < size3) {
            Pair pair = (Pair) arrayList2.get(i12);
            FontWeight fontWeight = (FontWeight) pair.m15903a();
            int iM26478unboximpl = ((FontStyle) pair.m15904b()).m26478unboximpl();
            List list = (List) FontListFontFamilyTypefaceAdapterKt.firstImmediatelyAvailable(fontMatcher.m26471matchFontRetOiIg(fonts, fontWeight, iM26478unboximpl), new TypefaceRequest(fontFamily2, fontWeight, iM26478unboximpl, FontSynthesis.Companion.m26492getAllGVVA2EU(), platformFontLoader.getCacheKey(), null), this.asyncTypefaceCache, platformFontLoader, new InterfaceC10570l() { // from class: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$2$1
                public final void invoke(TypefaceRequest typefaceRequest) {
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((TypefaceRequest) obj2);
                    return C8736p.f16368a;
                }
            }).m15903a();
            if (list != null) {
                arrayList3.add(AbstractC8778f0.m14566l0(list));
            }
            i12++;
            fontFamily2 = fontFamily;
        }
        Object objM16556e = AbstractC9165e.m16556e(new C31283(arrayList3, this, platformFontLoader, null), interfaceC9324c);
        return objM16556e == AbstractC9434a.m17291f() ? objM16556e : C8736p.f16368a;
    }

    @Override // androidx.compose.p013ui.text.font.FontFamilyTypefaceAdapter
    public TypefaceResult resolve(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        if (!(typefaceRequest.getFontFamily() instanceof FontListFontFamily)) {
            return null;
        }
        Pair pairFirstImmediatelyAvailable = FontListFontFamilyTypefaceAdapterKt.firstImmediatelyAvailable(fontMatcher.m26471matchFontRetOiIg(((FontListFontFamily) typefaceRequest.getFontFamily()).getFonts(), typefaceRequest.getFontWeight(), typefaceRequest.m26520getFontStyle_LCdwA()), typefaceRequest, this.asyncTypefaceCache, platformFontLoader, interfaceC10570l2);
        List list = (List) pairFirstImmediatelyAvailable.m15903a();
        Object objM15904b = pairFirstImmediatelyAvailable.m15904b();
        if (list == null) {
            return new TypefaceResult.Immutable(objM15904b, false, 2, null);
        }
        AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list, objM15904b, typefaceRequest, this.asyncTypefaceCache, interfaceC10570l, platformFontLoader);
        AbstractC8839h.m14861d(this.asyncLoadScope, null, CoroutineStart.f17555d, new C31301(asyncFontListLoader, null), 1, null);
        return new TypefaceResult.Async(asyncFontListLoader);
    }

    public FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, InterfaceC9100d interfaceC9100d) {
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.asyncLoadScope = AbstractC9165e.m16552a(DropExceptionHandler.plus(DispatcherKt.getFontCacheManagementDispatcher()).plus(interfaceC9100d).plus(AbstractC8874s1.m14909a((InterfaceC9212n) interfaceC9100d.get(InterfaceC9212n.f18095c0))));
    }

    public /* synthetic */ FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, InterfaceC9100d interfaceC9100d, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? new AsyncTypefaceCache() : asyncTypefaceCache, (i10 & 2) != 0 ? EmptyCoroutineContext.f17438a : interfaceC9100d);
    }
}
