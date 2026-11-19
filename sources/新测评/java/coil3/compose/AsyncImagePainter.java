package coil3.compose;

import android.os.Trace;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.painter.Painter;
import androidx.compose.p013ui.layout.ContentScale;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import coil3.InterfaceC5193e;
import coil3.compose.AsyncImagePainter;
import coil3.size.Precision;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p002a0.InterfaceC0006a;
import p137k.InterfaceC7838j;
import p150l.AbstractC8477e;
import p150l.InterfaceC8474b;
import p161m.AbstractC8529e;
import p161m.AbstractC8534j;
import p290y.C9885d;
import p290y.C9886e;
import p290y.C9896o;
import p290y.InterfaceC9889h;
import p300z.InterfaceC9960g;

@Stable
@Metadata(m13557d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 i2\u00020\u00012\u00020\u0002:\u0003.0'B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0010*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0007*\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010\tJ\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\tJ\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\tJ\r\u0010%\u001a\u00020\u0007¢\u0006\u0004\b%\u0010\tR/\u0010-\u001a\u0004\u0018\u00010\u00012\b\u0010&\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R(\u0010;\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u0001058\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R$\u0010E\u001a\u00020=2\u0006\u00106\u001a\u00020=8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010L\u001a\u00020F8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b)\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR.\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100M8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR0\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010M8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010O\u001a\u0004\bU\u0010Q\"\u0004\bV\u0010SR\"\u0010_\u001a\u00020X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010e\u001a\u00020`8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010a\u001a\u0004\bA\u0010b\"\u0004\bc\u0010dR$\u0010k\u001a\u0004\u0018\u00010f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010g\u001a\u0004\bN\u0010h\"\u0004\bi\u0010jR.\u0010p\u001a\u0004\u0018\u00010\u00032\b\u00106\u001a\u0004\u0018\u00010\u00038\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b]\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010\u0006R\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00030q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030t8\u0006¢\u0006\f\n\u0004\bc\u0010u\u001a\u0004\bv\u0010wR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00100q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010rR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100t8\u0006¢\u0006\f\n\u0004\b+\u0010u\u001a\u0004\bY\u0010wR\u0014\u0010{\u001a\u00020=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010z¨\u0006|"}, m13558d2 = {"Lcoil3/compose/AsyncImagePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/runtime/RememberObserver;", "Lcoil3/compose/AsyncImagePainter$b;", "input", "<init>", "(Lcoil3/compose/AsyncImagePainter$b;)V", "", "l", "()V", "Ly/e;", "request", "", "isPreview", "y", "(Ly/e;Z)Ly/e;", "Lcoil3/compose/AsyncImagePainter$c;", "state", "z", "(Lcoil3/compose/AsyncImagePainter$c;)V", "Ly/h;", "x", "(Ly/h;)Lcoil3/compose/AsyncImagePainter$c;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "alpha", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "onRemembered", "onForgotten", "onAbandoned", "m", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "h", "()Landroidx/compose/ui/graphics/painter/Painter;", "r", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "painter", "b", "F", "c", "Landroidx/compose/ui/graphics/ColorFilter;", "d", "Z", "isRemembered", "Lkotlinx/coroutines/Job;", "value", "e", "Lkotlinx/coroutines/Job;", "t", "(Lkotlinx/coroutines/Job;)V", "rememberJob", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Landroidx/compose/ui/geometry/Size;", "f", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "drawSizeFlow", "g", "J", "o", "(J)V", "drawSize", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "j", "()Lkotlinx/coroutines/CoroutineScope;", "u", "(Lkotlinx/coroutines/CoroutineScope;)V", "scope", "Lkotlin/Function1;", "i", "Lkotlin/jvm/functions/Function1;", "getTransform$coil_compose_core_release", "()Lkotlin/jvm/functions/Function1;", "v", "(Lkotlin/jvm/functions/Function1;)V", "transform", "getOnState$coil_compose_core_release", "q", "onState", "Landroidx/compose/ui/layout/ContentScale;", "k", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale$coil_compose_core_release", "()Landroidx/compose/ui/layout/ContentScale;", "n", "(Landroidx/compose/ui/layout/ContentScale;)V", "contentScale", "Landroidx/compose/ui/graphics/FilterQuality;", "I", "()I", "p", "(I)V", "filterQuality", "Lcoil3/compose/AsyncImagePreviewHandler;", "Lcoil3/compose/AsyncImagePreviewHandler;", "()Lcoil3/compose/AsyncImagePreviewHandler;", "s", "(Lcoil3/compose/AsyncImagePreviewHandler;)V", "previewHandler", "Lcoil3/compose/AsyncImagePainter$b;", "get_input$coil_compose_core_release", "()Lcoil3/compose/AsyncImagePainter$b;", "w", "_input", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "inputFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "getInput", "()Lkotlinx/coroutines/flow/StateFlow;", "stateFlow", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "coil-compose-core_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nAsyncImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImagePainter.kt\ncoil3/compose/AsyncImagePainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 5 ImageRequest.kt\ncoil3/request/ImageRequest$Builder\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,419:1\n85#2:420\n113#2,2:421\n1#3:423\n26#4,5:424\n410#5,9:429\n148#6:438\n*S KotlinDebug\n*F\n+ 1 AsyncImagePainter.kt\ncoil3/compose/AsyncImagePainter\n*L\n158#1:420\n158#1:421,2\n220#1:424,5\n278#1:429,9\n340#1:438\n*E\n"})
/* loaded from: classes3.dex */
public final class AsyncImagePainter extends Painter implements RememberObserver {

    /* renamed from: s, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: t */
    public static final Function1 f2826t = new Function1() { // from class: l.c
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AsyncImagePainter.m2895b((AsyncImagePainter.InterfaceC5172c) obj);
        }
    };

    /* renamed from: c, reason: from kotlin metadata */
    public ColorFilter colorFilter;

    /* renamed from: d, reason: from kotlin metadata */
    public boolean isRemembered;

    /* renamed from: e, reason: from kotlin metadata */
    public Job rememberJob;

    /* renamed from: f, reason: from kotlin metadata */
    public MutableSharedFlow drawSizeFlow;

    /* renamed from: h, reason: from kotlin metadata */
    public CoroutineScope scope;

    /* renamed from: j, reason: from kotlin metadata */
    public Function1 onState;

    /* renamed from: m, reason: from kotlin metadata */
    public AsyncImagePreviewHandler previewHandler;

    /* renamed from: n, reason: from kotlin metadata */
    public C5171b _input;

    /* renamed from: o, reason: from kotlin metadata */
    public final MutableStateFlow inputFlow;

    /* renamed from: p, reason: from kotlin metadata */
    public final StateFlow input;

    /* renamed from: q, reason: from kotlin metadata */
    public final MutableStateFlow stateFlow;

    /* renamed from: r, reason: from kotlin metadata */
    public final StateFlow state;

    /* renamed from: a, reason: from kotlin metadata */
    public final MutableState painter = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: b, reason: from kotlin metadata */
    public float alpha = 1.0f;

    /* renamed from: g, reason: from kotlin metadata */
    public long drawSize = Size.INSTANCE.m20812getUnspecifiedNHjbRc();

    /* renamed from: i, reason: from kotlin metadata */
    public Function1 transform = f2826t;

    /* renamed from: k, reason: from kotlin metadata */
    public ContentScale contentScale = ContentScale.INSTANCE.getFit();

    /* renamed from: l, reason: from kotlin metadata */
    public int filterQuality = DrawScope.INSTANCE.m21530getDefaultFilterQualityfv9h1I();

    /* renamed from: coil3.compose.AsyncImagePainter$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function1 m2920a() {
            return AsyncImagePainter.f2826t;
        }

        public Companion() {
        }
    }

    /* renamed from: coil3.compose.AsyncImagePainter$b */
    public static final class C5171b {

        /* renamed from: a */
        public final InterfaceC5193e f2845a;

        /* renamed from: b */
        public final C9886e f2846b;

        /* renamed from: c */
        public final InterfaceC8474b f2847c;

        public C5171b(InterfaceC5193e interfaceC5193e, C9886e c9886e, InterfaceC8474b interfaceC8474b) {
            this.f2845a = interfaceC5193e;
            this.f2846b = c9886e;
            this.f2847c = interfaceC8474b;
        }

        /* renamed from: a */
        public final InterfaceC5193e m2921a() {
            return this.f2845a;
        }

        /* renamed from: b */
        public final C9886e m2922b() {
            return this.f2846b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5171b)) {
                return false;
            }
            C5171b c5171b = (C5171b) obj;
            return Intrinsics.areEqual(this.f2845a, c5171b.f2845a) && Intrinsics.areEqual(this.f2847c, c5171b.f2847c) && this.f2847c.equals(this.f2846b, c5171b.f2846b);
        }

        public int hashCode() {
            return (((this.f2845a.hashCode() * 31) + this.f2847c.hashCode()) * 31) + this.f2847c.hashCode(this.f2846b);
        }

        public String toString() {
            return "Input(imageLoader=" + this.f2845a + ", request=" + this.f2846b + ", modelEqualityDelegate=" + this.f2847c + ")";
        }
    }

    /* renamed from: coil3.compose.AsyncImagePainter$c */
    public interface InterfaceC5172c {

        /* renamed from: coil3.compose.AsyncImagePainter$c$a */
        public static final class a implements InterfaceC5172c {

            /* renamed from: a */
            public static final a f2848a = new a();

            @Override // coil3.compose.AsyncImagePainter.InterfaceC5172c
            /* renamed from: a */
            public Painter mo2923a() {
                return null;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1625786264;
            }

            public String toString() {
                return "Empty";
            }
        }

        /* renamed from: coil3.compose.AsyncImagePainter$c$b */
        public static final class b implements InterfaceC5172c {

            /* renamed from: a */
            public final Painter f2849a;

            /* renamed from: b */
            public final C9885d f2850b;

            public b(Painter painter, C9885d c9885d) {
                this.f2849a = painter;
                this.f2850b = c9885d;
            }

            /* renamed from: c */
            public static /* synthetic */ b m2924c(b bVar, Painter painter, C9885d c9885d, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    painter = bVar.f2849a;
                }
                if ((i10 & 2) != 0) {
                    c9885d = bVar.f2850b;
                }
                return bVar.m2925b(painter, c9885d);
            }

            @Override // coil3.compose.AsyncImagePainter.InterfaceC5172c
            /* renamed from: a */
            public Painter mo2923a() {
                return this.f2849a;
            }

            /* renamed from: b */
            public final b m2925b(Painter painter, C9885d c9885d) {
                return new b(painter, c9885d);
            }

            /* renamed from: d */
            public final C9885d m2926d() {
                return this.f2850b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.f2849a, bVar.f2849a) && Intrinsics.areEqual(this.f2850b, bVar.f2850b);
            }

            public int hashCode() {
                Painter painter = this.f2849a;
                return ((painter == null ? 0 : painter.hashCode()) * 31) + this.f2850b.hashCode();
            }

            public String toString() {
                return "Error(painter=" + this.f2849a + ", result=" + this.f2850b + ")";
            }
        }

        /* renamed from: coil3.compose.AsyncImagePainter$c$c */
        public static final class c implements InterfaceC5172c {

            /* renamed from: a */
            public final Painter f2851a;

            public c(Painter painter) {
                this.f2851a = painter;
            }

            @Override // coil3.compose.AsyncImagePainter.InterfaceC5172c
            /* renamed from: a */
            public Painter mo2923a() {
                return this.f2851a;
            }

            /* renamed from: b */
            public final c m2927b(Painter painter) {
                return new c(painter);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.areEqual(this.f2851a, ((c) obj).f2851a);
            }

            public int hashCode() {
                Painter painter = this.f2851a;
                if (painter == null) {
                    return 0;
                }
                return painter.hashCode();
            }

            public String toString() {
                return "Loading(painter=" + this.f2851a + ")";
            }
        }

        /* renamed from: coil3.compose.AsyncImagePainter$c$d */
        public static final class d implements InterfaceC5172c {

            /* renamed from: a */
            public final Painter f2852a;

            /* renamed from: b */
            public final C9896o f2853b;

            public d(Painter painter, C9896o c9896o) {
                this.f2852a = painter;
                this.f2853b = c9896o;
            }

            @Override // coil3.compose.AsyncImagePainter.InterfaceC5172c
            /* renamed from: a */
            public Painter mo2923a() {
                return this.f2852a;
            }

            /* renamed from: b */
            public final C9896o m2928b() {
                return this.f2853b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return Intrinsics.areEqual(this.f2852a, dVar.f2852a) && Intrinsics.areEqual(this.f2853b, dVar.f2853b);
            }

            public int hashCode() {
                return (this.f2852a.hashCode() * 31) + this.f2853b.hashCode();
            }

            public String toString() {
                return "Success(painter=" + this.f2852a + ", result=" + this.f2853b + ")";
            }
        }

        /* renamed from: a */
        Painter mo2923a();
    }

    public AsyncImagePainter(C5171b c5171b) {
        this._input = c5171b;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(c5171b);
        this.inputFlow = MutableStateFlow;
        this.input = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(InterfaceC5172c.a.f2848a);
        this.stateFlow = MutableStateFlow2;
        this.state = FlowKt.asStateFlow(MutableStateFlow2);
    }

    /* renamed from: b */
    public static final InterfaceC5172c m2895b(InterfaceC5172c interfaceC5172c) {
        return interfaceC5172c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    private final Painter m2900h() {
        return (Painter) this.painter.getValue();
    }

    /* renamed from: r */
    private final void m2901r(Painter painter) {
        this.painter.setValue(painter);
    }

    @Override // androidx.compose.p013ui.graphics.painter.Painter
    public boolean applyAlpha(float alpha) {
        this.alpha = alpha;
        return true;
    }

    @Override // androidx.compose.p013ui.graphics.painter.Painter
    public boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    /* renamed from: g, reason: from getter */
    public final int getFilterQuality() {
        return this.filterQuality;
    }

    @Override // androidx.compose.p013ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        Painter painterM2900h = m2900h();
        return painterM2900h != null ? painterM2900h.getIntrinsicSize() : Size.INSTANCE.m20812getUnspecifiedNHjbRc();
    }

    /* renamed from: i, reason: from getter */
    public final AsyncImagePreviewHandler getPreviewHandler() {
        return this.previewHandler;
    }

    /* renamed from: j */
    public final CoroutineScope m2904j() {
        CoroutineScope coroutineScope = this.scope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        Intrinsics.throwUninitializedPropertyAccessException("scope");
        return null;
    }

    /* renamed from: k, reason: from getter */
    public final StateFlow getState() {
        return this.state;
    }

    /* renamed from: l */
    public final void m2906l() {
        C5171b c5171b = this._input;
        if (c5171b == null) {
            return;
        }
        m2913t(AbstractC8529e.m14023a(m2904j(), new AsyncImagePainter$launchJob$1(this, c5171b, null)));
    }

    /* renamed from: m */
    public final void m2907m() {
        if (this._input == null) {
            m2913t(null);
        } else if (this.isRemembered) {
            m2906l();
        }
    }

    /* renamed from: n */
    public final void m2908n(ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    /* renamed from: o */
    public final void m2909o(long j10) {
        if (Size.m20800equalsimpl0(this.drawSize, j10)) {
            return;
        }
        this.drawSize = j10;
        MutableSharedFlow mutableSharedFlow = this.drawSizeFlow;
        if (mutableSharedFlow != null) {
            mutableSharedFlow.tryEmit(Size.m20792boximpl(j10));
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        m2913t(null);
        Object objM2900h = m2900h();
        RememberObserver rememberObserver = objM2900h instanceof RememberObserver ? (RememberObserver) objM2900h : null;
        if (rememberObserver != null) {
            rememberObserver.onAbandoned();
        }
        this.isRemembered = false;
    }

    @Override // androidx.compose.p013ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        m2909o(drawScope.mo21527getSizeNHjbRc());
        Painter painterM2900h = m2900h();
        if (painterM2900h != null) {
            painterM2900h.m21653drawx_KDEd0(drawScope, drawScope.mo21527getSizeNHjbRc(), this.alpha, this.colorFilter);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        m2913t(null);
        Object objM2900h = m2900h();
        RememberObserver rememberObserver = objM2900h instanceof RememberObserver ? (RememberObserver) objM2900h : null;
        if (rememberObserver != null) {
            rememberObserver.onForgotten();
        }
        this.isRemembered = false;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object objM2900h = m2900h();
            RememberObserver rememberObserver = objM2900h instanceof RememberObserver ? (RememberObserver) objM2900h : null;
            if (rememberObserver != null) {
                rememberObserver.onRemembered();
            }
            m2906l();
            this.isRemembered = true;
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* renamed from: p */
    public final void m2910p(int i10) {
        this.filterQuality = i10;
    }

    /* renamed from: q */
    public final void m2911q(Function1 function1) {
        this.onState = function1;
    }

    /* renamed from: s */
    public final void m2912s(AsyncImagePreviewHandler asyncImagePreviewHandler) {
        this.previewHandler = asyncImagePreviewHandler;
    }

    /* renamed from: t */
    public final void m2913t(Job job) {
        Job job2 = this.rememberJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.rememberJob = job;
    }

    /* renamed from: u */
    public final void m2914u(CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
    }

    /* renamed from: v */
    public final void m2915v(Function1 function1) {
        this.transform = function1;
    }

    /* renamed from: w */
    public final void m2916w(C5171b c5171b) {
        if (Intrinsics.areEqual(this._input, c5171b)) {
            return;
        }
        this._input = c5171b;
        m2907m();
        if (c5171b != null) {
            this.inputFlow.setValue(c5171b);
        }
    }

    /* renamed from: x */
    public final InterfaceC5172c m2917x(InterfaceC9889h interfaceC9889h) {
        if (interfaceC9889h instanceof C9896o) {
            C9896o c9896o = (C9896o) interfaceC9889h;
            return new InterfaceC5172c.d(AbstractC8477e.m13857a(c9896o.getImage(), c9896o.mo16611a().m16617c(), this.filterQuality), c9896o);
        }
        if (!(interfaceC9889h instanceof C9885d)) {
            throw new NoWhenBranchMatchedException();
        }
        C9885d c9885d = (C9885d) interfaceC9889h;
        InterfaceC7838j image = c9885d.getImage();
        return new InterfaceC5172c.b(image != null ? AbstractC8477e.m13857a(image, c9885d.mo16611a().m16617c(), this.filterQuality) : null, c9885d);
    }

    /* renamed from: y */
    public final C9886e m2918y(C9886e request, boolean isPreview) {
        request.m16638x();
        C9886e.a aVarM16652l = C9886e.m16613A(request, null, 1, null).m16652l(new C5173d(request, this));
        if (request.m16622h().m16681m() == null) {
            aVarM16652l.m16651k(InterfaceC9960g.f17804b0);
        }
        if (request.m16622h().m16680l() == null) {
            aVarM16652l.m16648h(AbstractC8534j.m14038o(this.contentScale));
        }
        if (request.m16622h().m16679k() == null) {
            aVarM16652l.m16647g(Precision.f3232b);
        }
        if (isPreview) {
            aVarM16652l.m16642b(EmptyCoroutineContext.INSTANCE);
        }
        return aVarM16652l.m16641a();
    }

    /* renamed from: z */
    public final void m2919z(InterfaceC5172c state) {
        InterfaceC5172c interfaceC5172c = (InterfaceC5172c) this.stateFlow.getValue();
        InterfaceC5172c interfaceC5172c2 = (InterfaceC5172c) this.transform.invoke(state);
        this.stateFlow.setValue(interfaceC5172c2);
        Painter painterM2944a = AbstractC5176b.m2944a(interfaceC5172c, interfaceC5172c2, this.contentScale);
        if (painterM2944a == null) {
            painterM2944a = interfaceC5172c2.mo2923a();
        }
        m2901r(painterM2944a);
        if (interfaceC5172c.mo2923a() != interfaceC5172c2.mo2923a()) {
            Object objMo2923a = interfaceC5172c.mo2923a();
            RememberObserver rememberObserver = objMo2923a instanceof RememberObserver ? (RememberObserver) objMo2923a : null;
            if (rememberObserver != null) {
                rememberObserver.onForgotten();
            }
            Object objMo2923a2 = interfaceC5172c2.mo2923a();
            RememberObserver rememberObserver2 = objMo2923a2 instanceof RememberObserver ? (RememberObserver) objMo2923a2 : null;
            if (rememberObserver2 != null) {
                rememberObserver2.onRemembered();
            }
        }
        Function1 function1 = this.onState;
        if (function1 != null) {
            function1.invoke(interfaceC5172c2);
        }
    }

    /* renamed from: coil3.compose.AsyncImagePainter$d */
    public static final class C5173d implements InterfaceC0006a {

        /* renamed from: a */
        public final /* synthetic */ C9886e f2854a;

        /* renamed from: b */
        public final /* synthetic */ AsyncImagePainter f2855b;

        public C5173d(C9886e c9886e, AsyncImagePainter asyncImagePainter) {
            this.f2854a = c9886e;
            this.f2855b = asyncImagePainter;
        }

        @Override // p002a0.InterfaceC0006a
        /* renamed from: c */
        public void mo15c(InterfaceC7838j interfaceC7838j) {
            this.f2855b.m2919z(new InterfaceC5172c.c(interfaceC7838j != null ? AbstractC8477e.m13857a(interfaceC7838j, this.f2854a.m16617c(), this.f2855b.getFilterQuality()) : null));
        }

        @Override // p002a0.InterfaceC0006a
        /* renamed from: a */
        public void mo13a(InterfaceC7838j interfaceC7838j) {
        }

        @Override // p002a0.InterfaceC0006a
        /* renamed from: b */
        public void mo14b(InterfaceC7838j interfaceC7838j) {
        }
    }
}
