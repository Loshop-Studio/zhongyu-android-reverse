package androidx.compose.p014ui.text.font;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p181hd.InterfaceC9540l;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class AsyncFontListLoader implements State<Object> {
    public static final int $stable = 0;
    private final AsyncTypefaceCache asyncTypefaceCache;
    private boolean cacheable = true;
    private final List<Font> fontList;
    private final InterfaceC9540l onCompletion;
    private final PlatformFontLoader platformFontLoader;
    private final TypefaceRequest typefaceRequest;
    private final MutableState value$delegate;

    @InterfaceC11829d(m26210c = "androidx.compose.ui.text.font.AsyncFontListLoader", m26211f = "FontListFontFamilyTypefaceAdapter.kt", m26212l = {281, 295}, m26213m = "load")
    /* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader$load$1 */
    public static final class C31531 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C31531(InterfaceC11588c<? super C31531> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AsyncFontListLoader.this.load(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(List<? extends Font> list, Object obj, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, InterfaceC9540l interfaceC9540l, PlatformFontLoader platformFontLoader) {
        this.fontList = list;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.onCompletion = interfaceC9540l;
        this.platformFontLoader = platformFontLoader;
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
    }

    private void setValue(Object obj) {
        this.value$delegate.setValue(obj);
    }

    public final boolean getCacheable$ui_text_release() {
        return this.cacheable;
    }

    @Override // androidx.compose.runtime.State
    public Object getValue() {
        return this.value$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0063, blocks: (B:35:0x00b4, B:38:0x00e8, B:20:0x005a), top: B:56:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0063, blocks: (B:35:0x00b4, B:38:0x00e8, B:20:0x005a), top: B:56:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008d -> B:45:0x0105). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fb -> B:42:0x00fc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object load(vc.InterfaceC11588c<? super p309qc.C10786q> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.text.font.AsyncFontListLoader.load(vc.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadWithTimeoutOrNull$ui_text_release(androidx.compose.p014ui.text.font.Font r7, vc.InterfaceC11588c<java.lang.Object> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.p014ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = (androidx.compose.p014ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.text.font.Font r7 = (androidx.compose.p014ui.text.font.Font) r7
            kotlin.AbstractC9924b.m20071b(r8)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            return r8
        L2e:
            r8 = move-exception
            goto L50
        L30:
            r7 = move-exception
            goto L7c
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            kotlin.AbstractC9924b.m20071b(r8)
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 r8 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r8.<init>(r6, r7, r4)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r0.L$0 = r7     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r0.label = r3     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r7 = kotlinx.coroutines.TimeoutKt.m20489e(r2, r8, r0)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            if (r7 != r1) goto L4f
            return r1
        L4f:
            return r7
        L50:
            kotlin.coroutines.d r1 = r0.getContext()
            sd.f0$a r2 = sd.InterfaceC11110f0.f26779d0
            kotlin.coroutines.d$b r1 = r1.get(r2)
            sd.f0 r1 = (sd.InterfaceC11110f0) r1
            if (r1 == 0) goto L86
            kotlin.coroutines.d r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to load font "
            r3.append(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.handleException(r0, r2)
            goto L86
        L7c:
            kotlin.coroutines.d r8 = r0.getContext()
            boolean r8 = sd.AbstractC11147o1.m24780n(r8)
            if (r8 == 0) goto L87
        L86:
            return r4
        L87:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.text.font.AsyncFontListLoader.loadWithTimeoutOrNull$ui_text_release(androidx.compose.ui.text.font.Font, vc.c):java.lang.Object");
    }

    public final void setCacheable$ui_text_release(boolean z10) {
        this.cacheable = z10;
    }
}
