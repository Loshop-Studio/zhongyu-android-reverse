package coil3.compose;

import android.os.Trace;
import androidx.compose.p009ui.geometry.Size;
import androidx.compose.p009ui.graphics.ColorFilter;
import androidx.compose.p009ui.graphics.drawscope.DrawScope;
import androidx.compose.p009ui.graphics.painter.Painter;
import androidx.compose.p009ui.layout.ContentScale;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import coil3.InterfaceC4574e;
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
import p001a0.InterfaceC0004a;
import p087k.InterfaceC6611j;
import p096l.AbstractC7262d;
import p096l.InterfaceC7259a;
import p103m.AbstractC7362e;
import p103m.AbstractC7365h;
import p187y.C7871d;
import p187y.C7872e;
import p187y.C7884q;
import p187y.InterfaceC7877j;
import p194z.InterfaceC7925g;

@Stable
@Metadata(m7879d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 i2\u00020\u00012\u00020\u0002:\u0003.0'B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0010*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0007*\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010\tJ\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\tJ\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\tJ\r\u0010%\u001a\u00020\u0007¢\u0006\u0004\b%\u0010\tR/\u0010-\u001a\u0004\u0018\u00010\u00012\b\u0010&\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R(\u0010;\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u0001058\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R$\u0010E\u001a\u00020=2\u0006\u00106\u001a\u00020=8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010L\u001a\u00020F8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b)\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR.\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100M8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR0\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010M8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010O\u001a\u0004\bU\u0010Q\"\u0004\bV\u0010SR\"\u0010_\u001a\u00020X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010e\u001a\u00020`8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010a\u001a\u0004\bA\u0010b\"\u0004\bc\u0010dR$\u0010k\u001a\u0004\u0018\u00010f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010g\u001a\u0004\bN\u0010h\"\u0004\bi\u0010jR.\u0010p\u001a\u0004\u0018\u00010\u00032\b\u00106\u001a\u0004\u0018\u00010\u00038\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b]\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010\u0006R\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00030q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030t8\u0006¢\u0006\f\n\u0004\bc\u0010u\u001a\u0004\bv\u0010wR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00100q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010rR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100t8\u0006¢\u0006\f\n\u0004\b+\u0010u\u001a\u0004\bY\u0010wR\u0014\u0010{\u001a\u00020=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010z¨\u0006|"}, m7880d2 = {"Lcoil3/compose/AsyncImagePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/runtime/RememberObserver;", "Lcoil3/compose/AsyncImagePainter$b;", "input", "<init>", "(Lcoil3/compose/AsyncImagePainter$b;)V", "", "l", "()V", "Ly/e;", "request", "", "isPreview", "y", "(Ly/e;Z)Ly/e;", "Lcoil3/compose/AsyncImagePainter$c;", "state", "z", "(Lcoil3/compose/AsyncImagePainter$c;)V", "Ly/j;", "x", "(Ly/j;)Lcoil3/compose/AsyncImagePainter$c;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "alpha", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "onRemembered", "onForgotten", "onAbandoned", "m", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "h", "()Landroidx/compose/ui/graphics/painter/Painter;", "r", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "painter", "b", "F", "c", "Landroidx/compose/ui/graphics/ColorFilter;", "d", "Z", "isRemembered", "Lkotlinx/coroutines/Job;", "value", "e", "Lkotlinx/coroutines/Job;", "t", "(Lkotlinx/coroutines/Job;)V", "rememberJob", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Landroidx/compose/ui/geometry/Size;", "f", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "drawSizeFlow", "g", "J", "o", "(J)V", "drawSize", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "j", "()Lkotlinx/coroutines/CoroutineScope;", "u", "(Lkotlinx/coroutines/CoroutineScope;)V", "scope", "Lkotlin/Function1;", "i", "Lkotlin/jvm/functions/Function1;", "getTransform$coil_compose_core_release", "()Lkotlin/jvm/functions/Function1;", "v", "(Lkotlin/jvm/functions/Function1;)V", "transform", "getOnState$coil_compose_core_release", "q", "onState", "Landroidx/compose/ui/layout/ContentScale;", "k", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale$coil_compose_core_release", "()Landroidx/compose/ui/layout/ContentScale;", "n", "(Landroidx/compose/ui/layout/ContentScale;)V", "contentScale", "Landroidx/compose/ui/graphics/FilterQuality;", "I", "()I", "p", "(I)V", "filterQuality", "Lcoil3/compose/AsyncImagePreviewHandler;", "Lcoil3/compose/AsyncImagePreviewHandler;", "()Lcoil3/compose/AsyncImagePreviewHandler;", "s", "(Lcoil3/compose/AsyncImagePreviewHandler;)V", "previewHandler", "Lcoil3/compose/AsyncImagePainter$b;", "get_input$coil_compose_core_release", "()Lcoil3/compose/AsyncImagePainter$b;", "w", "_input", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "inputFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "getInput", "()Lkotlinx/coroutines/flow/StateFlow;", "stateFlow", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "coil-compose-core_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nAsyncImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImagePainter.kt\ncoil3/compose/AsyncImagePainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 5 ImageRequest.kt\ncoil3/request/ImageRequest$Builder\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,419:1\n85#2:420\n113#2,2:421\n1#3:423\n26#4,5:424\n410#5,9:429\n148#6:438\n*S KotlinDebug\n*F\n+ 1 AsyncImagePainter.kt\ncoil3/compose/AsyncImagePainter\n*L\n158#1:420\n158#1:421,2\n220#1:424,5\n278#1:429,9\n340#1:438\n*E\n"})
/* loaded from: classes3.dex */
public final class AsyncImagePainter extends Painter implements RememberObserver {

    /* renamed from: s, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: t */
    public static final Function1 f1510t = new Function1() { // from class: l.b
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AsyncImagePainter.m1729b((AsyncImagePainter.InterfaceC4553c) obj);
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
    public C4552b _input;

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
    public long drawSize = Size.INSTANCE.m13735getUnspecifiedNHjbRc();

    /* renamed from: i, reason: from kotlin metadata */
    public Function1 transform = f1510t;

    /* renamed from: k, reason: from kotlin metadata */
    public ContentScale contentScale = ContentScale.INSTANCE.getFit();

    /* renamed from: l, reason: from kotlin metadata */
    public int filterQuality = DrawScope.INSTANCE.m14453getDefaultFilterQualityfv9h1I();

    /* renamed from: coil3.compose.AsyncImagePainter$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function1 m1754a() {
            return AsyncImagePainter.f1510t;
        }

        public Companion() {
        }
    }

    /* renamed from: coil3.compose.AsyncImagePainter$b */
    public static final class C4552b {

        /* renamed from: a */
        public final InterfaceC4574e f1529a;

        /* renamed from: b */
        public final C7872e f1530b;

        /* renamed from: c */
        public final InterfaceC7259a f1531c;

        public C4552b(InterfaceC4574e interfaceC4574e, C7872e c7872e, InterfaceC7259a interfaceC7259a) {
            this.f1529a = interfaceC4574e;
            this.f1530b = c7872e;
            this.f1531c = interfaceC7259a;
        }

        /* renamed from: a */
        public final InterfaceC4574e m1755a() {
            return this.f1529a;
        }

        /* renamed from: b */
        public final C7872e m1756b() {
            return this.f1530b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4552b)) {
                return false;
            }
            C4552b c4552b = (C4552b) obj;
            return Intrinsics.areEqual(this.f1529a, c4552b.f1529a) && Intrinsics.areEqual(this.f1531c, c4552b.f1531c) && this.f1531c.equals(this.f1530b, c4552b.f1530b);
        }

        public int hashCode() {
            return (((this.f1529a.hashCode() * 31) + this.f1531c.hashCode()) * 31) + this.f1531c.hashCode(this.f1530b);
        }

        public String toString() {
            return "Input(imageLoader=" + this.f1529a + ", request=" + this.f1530b + ", modelEqualityDelegate=" + this.f1531c + ")";
        }
    }

    /* renamed from: coil3.compose.AsyncImagePainter$c */
    public interface InterfaceC4553c {

        /* renamed from: coil3.compose.AsyncImagePainter$c$a */
        public static final class a implements InterfaceC4553c {

            /* renamed from: a */
            public static final a f1532a = new a();

            @Override // coil3.compose.AsyncImagePainter.InterfaceC4553c
            /* renamed from: a */
            public Painter mo1757a() {
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
        public static final class b implements InterfaceC4553c {

            /* renamed from: a */
            public final Painter f1533a;

            /* renamed from: b */
            public final C7871d f1534b;

            public b(Painter painter, C7871d c7871d) {
                this.f1533a = painter;
                this.f1534b = c7871d;
            }

            @Override // coil3.compose.AsyncImagePainter.InterfaceC4553c
            /* renamed from: a */
            public Painter mo1757a() {
                return this.f1533a;
            }

            /* renamed from: b */
            public final C7871d m1758b() {
                return this.f1534b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.f1533a, bVar.f1533a) && Intrinsics.areEqual(this.f1534b, bVar.f1534b);
            }

            public int hashCode() {
                Painter painter = this.f1533a;
                return ((painter == null ? 0 : painter.hashCode()) * 31) + this.f1534b.hashCode();
            }

            public String toString() {
                return "Error(painter=" + this.f1533a + ", result=" + this.f1534b + ")";
            }
        }

        /* renamed from: coil3.compose.AsyncImagePainter$c$c */
        public static final class c implements InterfaceC4553c {

            /* renamed from: a */
            public final Painter f1535a;

            public c(Painter painter) {
                this.f1535a = painter;
            }

            @Override // coil3.compose.AsyncImagePainter.InterfaceC4553c
            /* renamed from: a */
            public Painter mo1757a() {
                return this.f1535a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.areEqual(this.f1535a, ((c) obj).f1535a);
            }

            public int hashCode() {
                Painter painter = this.f1535a;
                if (painter == null) {
                    return 0;
                }
                return painter.hashCode();
            }

            public String toString() {
                return "Loading(painter=" + this.f1535a + ")";
            }
        }

        /* renamed from: coil3.compose.AsyncImagePainter$c$d */
        public static final class d implements InterfaceC4553c {

            /* renamed from: a */
            public final Painter f1536a;

            /* renamed from: b */
            public final C7884q f1537b;

            public d(Painter painter, C7884q c7884q) {
                this.f1536a = painter;
                this.f1537b = c7884q;
            }

            @Override // coil3.compose.AsyncImagePainter.InterfaceC4553c
            /* renamed from: a */
            public Painter mo1757a() {
                return this.f1536a;
            }

            /* renamed from: b */
            public final C7884q m1759b() {
                return this.f1537b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return Intrinsics.areEqual(this.f1536a, dVar.f1536a) && Intrinsics.areEqual(this.f1537b, dVar.f1537b);
            }

            public int hashCode() {
                return (this.f1536a.hashCode() * 31) + this.f1537b.hashCode();
            }

            public String toString() {
                return "Success(painter=" + this.f1536a + ", result=" + this.f1537b + ")";
            }
        }

        /* renamed from: a */
        Painter mo1757a();
    }

    public AsyncImagePainter(C4552b c4552b) {
        this._input = c4552b;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(c4552b);
        this.inputFlow = MutableStateFlow;
        this.input = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(InterfaceC4553c.a.f1532a);
        this.stateFlow = MutableStateFlow2;
        this.state = FlowKt.asStateFlow(MutableStateFlow2);
    }

    /* renamed from: b */
    public static final InterfaceC4553c m1729b(InterfaceC4553c interfaceC4553c) {
        return interfaceC4553c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    private final Painter m1734h() {
        return (Painter) this.painter.getValue();
    }

    /* renamed from: r */
    private final void m1735r(Painter painter) {
        this.painter.setValue(painter);
    }

    @Override // androidx.compose.p009ui.graphics.painter.Painter
    public boolean applyAlpha(float alpha) {
        this.alpha = alpha;
        return true;
    }

    @Override // androidx.compose.p009ui.graphics.painter.Painter
    public boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    /* renamed from: g, reason: from getter */
    public final int getFilterQuality() {
        return this.filterQuality;
    }

    @Override // androidx.compose.p009ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        Painter painterM1734h = m1734h();
        return painterM1734h != null ? painterM1734h.getIntrinsicSize() : Size.INSTANCE.m13735getUnspecifiedNHjbRc();
    }

    /* renamed from: i, reason: from getter */
    public final AsyncImagePreviewHandler getPreviewHandler() {
        return this.previewHandler;
    }

    /* renamed from: j */
    public final CoroutineScope m1738j() {
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
    public final void m1740l() {
        C4552b c4552b = this._input;
        if (c4552b == null) {
            return;
        }
        m1747t(AbstractC7362e.m8369a(m1738j(), new AsyncImagePainter$launchJob$1(this, c4552b, null)));
    }

    /* renamed from: m */
    public final void m1741m() {
        if (this._input == null) {
            m1747t(null);
        } else if (this.isRemembered) {
            m1740l();
        }
    }

    /* renamed from: n */
    public final void m1742n(ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    /* renamed from: o */
    public final void m1743o(long j6) {
        if (Size.m13723equalsimpl0(this.drawSize, j6)) {
            return;
        }
        this.drawSize = j6;
        MutableSharedFlow mutableSharedFlow = this.drawSizeFlow;
        if (mutableSharedFlow != null) {
            mutableSharedFlow.tryEmit(Size.m13715boximpl(j6));
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        m1747t(null);
        Object objM1734h = m1734h();
        RememberObserver rememberObserver = objM1734h instanceof RememberObserver ? (RememberObserver) objM1734h : null;
        if (rememberObserver != null) {
            rememberObserver.onAbandoned();
        }
        this.isRemembered = false;
    }

    @Override // androidx.compose.p009ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        m1743o(drawScope.mo14450getSizeNHjbRc());
        Painter painterM1734h = m1734h();
        if (painterM1734h != null) {
            painterM1734h.m14576drawx_KDEd0(drawScope, drawScope.mo14450getSizeNHjbRc(), this.alpha, this.colorFilter);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        m1747t(null);
        Object objM1734h = m1734h();
        RememberObserver rememberObserver = objM1734h instanceof RememberObserver ? (RememberObserver) objM1734h : null;
        if (rememberObserver != null) {
            rememberObserver.onForgotten();
        }
        this.isRemembered = false;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object objM1734h = m1734h();
            RememberObserver rememberObserver = objM1734h instanceof RememberObserver ? (RememberObserver) objM1734h : null;
            if (rememberObserver != null) {
                rememberObserver.onRemembered();
            }
            m1740l();
            this.isRemembered = true;
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* renamed from: p */
    public final void m1744p(int i6) {
        this.filterQuality = i6;
    }

    /* renamed from: q */
    public final void m1745q(Function1 function1) {
        this.onState = function1;
    }

    /* renamed from: s */
    public final void m1746s(AsyncImagePreviewHandler asyncImagePreviewHandler) {
        this.previewHandler = asyncImagePreviewHandler;
    }

    /* renamed from: t */
    public final void m1747t(Job job) {
        Job job2 = this.rememberJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.rememberJob = job;
    }

    /* renamed from: u */
    public final void m1748u(CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
    }

    /* renamed from: v */
    public final void m1749v(Function1 function1) {
        this.transform = function1;
    }

    /* renamed from: w */
    public final void m1750w(C4552b c4552b) {
        if (Intrinsics.areEqual(this._input, c4552b)) {
            return;
        }
        this._input = c4552b;
        m1741m();
        if (c4552b != null) {
            this.inputFlow.setValue(c4552b);
        }
    }

    /* renamed from: x */
    public final InterfaceC4553c m1751x(InterfaceC7877j interfaceC7877j) {
        if (interfaceC7877j instanceof C7884q) {
            C7884q c7884q = (C7884q) interfaceC7877j;
            return new InterfaceC4553c.d(AbstractC7262d.m8181a(c7884q.m9674d(), c7884q.mo9568a().m9574c(), this.filterQuality), c7884q);
        }
        if (!(interfaceC7877j instanceof C7871d)) {
            throw new NoWhenBranchMatchedException();
        }
        C7871d c7871d = (C7871d) interfaceC7877j;
        InterfaceC6611j interfaceC6611jM9569b = c7871d.m9569b();
        return new InterfaceC4553c.b(interfaceC6611jM9569b != null ? AbstractC7262d.m8181a(interfaceC6611jM9569b, c7871d.mo9568a().m9574c(), this.filterQuality) : null, c7871d);
    }

    /* renamed from: y */
    public final C7872e m1752y(C7872e request, boolean isPreview) {
        request.m9595x();
        C7872e.a aVarM9607j = C7872e.m9570A(request, null, 1, null).m9607j(new C4554d(request, this));
        if (request.m9579h().m9636m() == null) {
            aVarM9607j.m9606i(InterfaceC7925g.f10647c0);
        }
        if (request.m9579h().m9635l() == null) {
            aVarM9607j.m9605h(AbstractC7365h.m8378i(this.contentScale));
        }
        if (request.m9579h().m9634k() == null) {
            aVarM9607j.m9604g(Precision.f1916b);
        }
        if (isPreview) {
            aVarM9607j.m9599b(EmptyCoroutineContext.INSTANCE);
        }
        return aVarM9607j.m9598a();
    }

    /* renamed from: z */
    public final void m1753z(InterfaceC4553c state) {
        InterfaceC4553c interfaceC4553c = (InterfaceC4553c) this.stateFlow.getValue();
        InterfaceC4553c interfaceC4553c2 = (InterfaceC4553c) this.transform.invoke(state);
        this.stateFlow.setValue(interfaceC4553c2);
        Painter painterM1772a = AbstractC4557b.m1772a(interfaceC4553c, interfaceC4553c2, this.contentScale);
        if (painterM1772a == null) {
            painterM1772a = interfaceC4553c2.mo1757a();
        }
        m1735r(painterM1772a);
        if (interfaceC4553c.mo1757a() != interfaceC4553c2.mo1757a()) {
            Object objMo1757a = interfaceC4553c.mo1757a();
            RememberObserver rememberObserver = objMo1757a instanceof RememberObserver ? (RememberObserver) objMo1757a : null;
            if (rememberObserver != null) {
                rememberObserver.onForgotten();
            }
            Object objMo1757a2 = interfaceC4553c2.mo1757a();
            RememberObserver rememberObserver2 = objMo1757a2 instanceof RememberObserver ? (RememberObserver) objMo1757a2 : null;
            if (rememberObserver2 != null) {
                rememberObserver2.onRemembered();
            }
        }
        Function1 function1 = this.onState;
        if (function1 != null) {
            function1.invoke(interfaceC4553c2);
        }
    }

    /* renamed from: coil3.compose.AsyncImagePainter$d */
    public static final class C4554d implements InterfaceC0004a {

        /* renamed from: a */
        public final /* synthetic */ C7872e f1538a;

        /* renamed from: b */
        public final /* synthetic */ AsyncImagePainter f1539b;

        public C4554d(C7872e c7872e, AsyncImagePainter asyncImagePainter) {
            this.f1538a = c7872e;
            this.f1539b = asyncImagePainter;
        }

        @Override // p001a0.InterfaceC0004a
        /* renamed from: c */
        public void mo7c(InterfaceC6611j interfaceC6611j) {
            this.f1539b.m1753z(new InterfaceC4553c.c(interfaceC6611j != null ? AbstractC7262d.m8181a(interfaceC6611j, this.f1538a.m9574c(), this.f1539b.getFilterQuality()) : null));
        }

        @Override // p001a0.InterfaceC0004a
        /* renamed from: a */
        public void mo5a(InterfaceC6611j interfaceC6611j) {
        }

        @Override // p001a0.InterfaceC0004a
        /* renamed from: b */
        public void mo6b(InterfaceC6611j interfaceC6611j) {
        }
    }
}
