package androidx.compose.p014ui.text.font;

import androidx.collection.MutableScatterSet;
import androidx.compose.material3.MenuKt;
import androidx.compose.p014ui.text.font.TypefaceResult;
import androidx.compose.p014ui.text.platform.DispatcherKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.asm.Opcodes;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.AbstractC10776g;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11108e2;
import sd.AbstractC11117h;
import sd.InterfaceC11110f0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class FontListFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    private InterfaceC11122i0 asyncLoadScope;
    private final AsyncTypefaceCache asyncTypefaceCache;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final FontMatcher fontMatcher = new FontMatcher();
    private static final InterfaceC11110f0 DropExceptionHandler = new C3157x6d95c97a(InterfaceC11110f0.f26779d0);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final InterfaceC11110f0 getDropExceptionHandler() {
            return FontListFontFamilyTypefaceAdapter.DropExceptionHandler;
        }

        public final FontMatcher getFontMatcher() {
            return FontListFontFamilyTypefaceAdapter.fontMatcher;
        }

        private Companion() {
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3", m26211f = "FontListFontFamilyTypefaceAdapter.kt", m26212l = {MenuKt.InTransitionDuration}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3 */
    public static final class C31583 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ List<Font> $asyncLoads;
        final /* synthetic */ PlatformFontLoader $resourceLoader;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FontListFontFamilyTypefaceAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31583(List<Font> list, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontLoader platformFontLoader, InterfaceC11588c<? super C31583> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$asyncLoads = list;
            this.this$0 = fontListFontFamilyTypefaceAdapter;
            this.$resourceLoader = platformFontLoader;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C31583 c31583 = new C31583(this.$asyncLoads, this.this$0, this.$resourceLoader, interfaceC11588c);
            c31583.L$0 = obj;
            return c31583;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
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
                    arrayList2.add(AbstractC11117h.m24724b(interfaceC11122i0, null, null, new FontListFontFamilyTypefaceAdapter$preload$3$2$1(fontListFontFamilyTypefaceAdapter, (Font) arrayList.get(i12), platformFontLoader, null), 3, null));
                }
                this.label = 1;
                if (AwaitKt.m20371a(arrayList2, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C31583) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", m26211f = "FontListFontFamilyTypefaceAdapter.kt", m26212l = {Opcodes.IF_ICMPEQ}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1 */
    public static final class C31601 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ AsyncFontListLoader $asyncLoader;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31601(AsyncFontListLoader asyncFontListLoader, InterfaceC11588c<? super C31601> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$asyncLoader = asyncFontListLoader;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C31601(this.$asyncLoader, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                AsyncFontListLoader asyncFontListLoader = this.$asyncLoader;
                this.label = 1;
                if (asyncFontListLoader.load(this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C31601) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FontListFontFamilyTypefaceAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Object preload(FontFamily fontFamily, PlatformFontLoader platformFontLoader, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        FontFamily fontFamily2 = fontFamily;
        if (!(fontFamily2 instanceof FontListFontFamily)) {
            return C10786q.f26013a;
        }
        FontListFontFamily fontListFontFamily = (FontListFontFamily) fontFamily2;
        List<Font> fonts = fontListFontFamily.getFonts();
        List<Font> fonts2 = fontListFontFamily.getFonts();
        ArrayList arrayList = new ArrayList(fonts2.size());
        int size = fonts2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Font font = fonts2.get(i10);
            if (FontLoadingStrategy.m33064equalsimpl0(font.mo33022getLoadingStrategyPKNRLFQ(), FontLoadingStrategy.Companion.m33068getAsyncPKNRLFQ())) {
                arrayList.add(AbstractC10776g.m22975a(font.getWeight(), FontStyle.m33074boximpl(font.mo33030getStyle_LCdwA())));
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
            FontWeight fontWeight = (FontWeight) pair.m20048a();
            int iM33080unboximpl = ((FontStyle) pair.m20049c()).m33080unboximpl();
            List list = (List) FontListFontFamilyTypefaceAdapterKt.firstImmediatelyAvailable(fontMatcher.m33073matchFontRetOiIg(fonts, fontWeight, iM33080unboximpl), new TypefaceRequest(fontFamily2, fontWeight, iM33080unboximpl, FontSynthesis.Companion.m33094getAllGVVA2EU(), platformFontLoader.getCacheKey(), null), this.asyncTypefaceCache, platformFontLoader, new InterfaceC9540l() { // from class: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$2$1
                public final void invoke(TypefaceRequest typefaceRequest) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((TypefaceRequest) obj2);
                    return C10786q.f26013a;
                }
            }).m20048a();
            if (list != null) {
                arrayList3.add(AbstractC10947g0.m23944m0(list));
            }
            i12++;
            fontFamily2 = fontFamily;
        }
        Object objM20748e = AbstractC10006d.m20748e(new C31583(arrayList3, this, platformFontLoader, null), interfaceC11588c);
        return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
    }

    @Override // androidx.compose.p014ui.text.font.FontFamilyTypefaceAdapter
    public TypefaceResult resolve(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        if (!(typefaceRequest.getFontFamily() instanceof FontListFontFamily)) {
            return null;
        }
        Pair pairFirstImmediatelyAvailable = FontListFontFamilyTypefaceAdapterKt.firstImmediatelyAvailable(fontMatcher.m33073matchFontRetOiIg(((FontListFontFamily) typefaceRequest.getFontFamily()).getFonts(), typefaceRequest.getFontWeight(), typefaceRequest.m33122getFontStyle_LCdwA()), typefaceRequest, this.asyncTypefaceCache, platformFontLoader, interfaceC9540l2);
        List list = (List) pairFirstImmediatelyAvailable.m20048a();
        Object objM20049c = pairFirstImmediatelyAvailable.m20049c();
        if (list == null) {
            return new TypefaceResult.Immutable(objM20049c, false, 2, null);
        }
        AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list, objM20049c, typefaceRequest, this.asyncTypefaceCache, interfaceC9540l, platformFontLoader);
        AbstractC11117h.m24726d(this.asyncLoadScope, null, CoroutineStart.f23479f, new C31601(asyncFontListLoader, null), 1, null);
        return new TypefaceResult.Async(asyncFontListLoader);
    }

    public FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, InterfaceC9945d interfaceC9945d) {
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.asyncLoadScope = AbstractC10006d.m20744a(DropExceptionHandler.plus(DispatcherKt.getFontCacheManagementDispatcher()).plus(interfaceC9945d).plus(AbstractC11108e2.m24700a((InterfaceC10045g) interfaceC9945d.get(InterfaceC10045g.f23976b0))));
    }

    public /* synthetic */ FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, InterfaceC9945d interfaceC9945d, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? new AsyncTypefaceCache() : asyncTypefaceCache, (i10 & 2) != 0 ? EmptyCoroutineContext.f23351c : interfaceC9945d);
    }
}
