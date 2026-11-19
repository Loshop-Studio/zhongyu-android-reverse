package coil3.compose;

import android.os.Trace;
import androidx.compose.p012ui.geometry.Size;
import androidx.compose.p012ui.graphics.ColorFilter;
import androidx.compose.p012ui.graphics.drawscope.DrawScope;
import androidx.compose.p012ui.graphics.painter.Painter;
import androidx.compose.p012ui.layout.ContentScale;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil3.InterfaceC5328e;
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
import p029c0.InterfaceC5217a;
import p151k.InterfaceC8239j;
import p163l.AbstractC8859e;
import p163l.InterfaceC8856b;
import p173m.AbstractC8932e;
import p173m.AbstractC8937j;
import p297y.C9923d;
import p297y.C9924e;
import p297y.C9936q;
import p297y.InterfaceC9929j;
import p307z.InterfaceC9977g;

@Stable
@Metadata(m13412d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 i2\u00020\u00012\u00020\u0002:\u0003.0'B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0010*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0007*\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010\tJ\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\tJ\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\tJ\r\u0010%\u001a\u00020\u0007¢\u0006\u0004\b%\u0010\tR/\u0010-\u001a\u0004\u0018\u00010\u00012\b\u0010&\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R(\u0010;\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u0001058\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R$\u0010E\u001a\u00020=2\u0006\u00106\u001a\u00020=8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010L\u001a\u00020F8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b)\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR.\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100M8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR0\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010M8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010O\u001a\u0004\bU\u0010Q\"\u0004\bV\u0010SR\"\u0010_\u001a\u00020X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010e\u001a\u00020`8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010a\u001a\u0004\bA\u0010b\"\u0004\bc\u0010dR$\u0010k\u001a\u0004\u0018\u00010f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010g\u001a\u0004\bN\u0010h\"\u0004\bi\u0010jR.\u0010p\u001a\u0004\u0018\u00010\u00032\b\u00106\u001a\u0004\u0018\u00010\u00038\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b]\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010\u0006R\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00030q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030t8\u0006¢\u0006\f\n\u0004\bc\u0010u\u001a\u0004\bv\u0010wR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00100q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010rR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100t8\u0006¢\u0006\f\n\u0004\b+\u0010u\u001a\u0004\bY\u0010wR\u0014\u0010{\u001a\u00020=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010z¨\u0006|"}, m13413d2 = {"Lcoil3/compose/AsyncImagePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/runtime/RememberObserver;", "Lcoil3/compose/AsyncImagePainter$b;", "input", "<init>", "(Lcoil3/compose/AsyncImagePainter$b;)V", "", "l", "()V", "Ly/e;", "request", "", "isPreview", "y", "(Ly/e;Z)Ly/e;", "Lcoil3/compose/AsyncImagePainter$c;", "state", "z", "(Lcoil3/compose/AsyncImagePainter$c;)V", "Ly/j;", "x", "(Ly/j;)Lcoil3/compose/AsyncImagePainter$c;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "alpha", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "onRemembered", "onForgotten", "onAbandoned", "m", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "h", "()Landroidx/compose/ui/graphics/painter/Painter;", "r", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "painter", "b", "F", "c", "Landroidx/compose/ui/graphics/ColorFilter;", "d", "Z", "isRemembered", "Lkotlinx/coroutines/Job;", "value", "e", "Lkotlinx/coroutines/Job;", "t", "(Lkotlinx/coroutines/Job;)V", "rememberJob", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Landroidx/compose/ui/geometry/Size;", "f", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "drawSizeFlow", "g", "J", "o", "(J)V", "drawSize", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "j", "()Lkotlinx/coroutines/CoroutineScope;", "u", "(Lkotlinx/coroutines/CoroutineScope;)V", "scope", "Lkotlin/Function1;", "i", "Lkotlin/jvm/functions/Function1;", "getTransform$coil_compose_core_release", "()Lkotlin/jvm/functions/Function1;", "v", "(Lkotlin/jvm/functions/Function1;)V", "transform", "getOnState$coil_compose_core_release", "q", "onState", "Landroidx/compose/ui/layout/ContentScale;", "k", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale$coil_compose_core_release", "()Landroidx/compose/ui/layout/ContentScale;", "n", "(Landroidx/compose/ui/layout/ContentScale;)V", "contentScale", "Landroidx/compose/ui/graphics/FilterQuality;", "I", "()I", "p", "(I)V", "filterQuality", "Lcoil3/compose/AsyncImagePreviewHandler;", "Lcoil3/compose/AsyncImagePreviewHandler;", "()Lcoil3/compose/AsyncImagePreviewHandler;", "s", "(Lcoil3/compose/AsyncImagePreviewHandler;)V", "previewHandler", "Lcoil3/compose/AsyncImagePainter$b;", "get_input$coil_compose_core_release", "()Lcoil3/compose/AsyncImagePainter$b;", "w", "_input", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "inputFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "getInput", "()Lkotlinx/coroutines/flow/StateFlow;", "stateFlow", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "coil-compose-core_release"}, m13414k = 1, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAsyncImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImagePainter.kt\ncoil3/compose/AsyncImagePainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 5 ImageRequest.kt\ncoil3/request/ImageRequest$Builder\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,413:1\n85#2:414\n113#2,2:415\n1#3:417\n26#4,5:418\n410#5,9:423\n148#6:432\n*S KotlinDebug\n*F\n+ 1 AsyncImagePainter.kt\ncoil3/compose/AsyncImagePainter\n*L\n152#1:414\n152#1:415,2\n214#1:418,5\n272#1:423,9\n334#1:432\n*E\n"})
/* loaded from: classes3.dex */
public final class AsyncImagePainter extends Painter implements RememberObserver {

    /* renamed from: s, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: t */
    public static final Function1 f2761t = new Function1() { // from class: l.c
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AsyncImagePainter.m2623b((AsyncImagePainter.InterfaceC5307c) obj);
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
    public C5306b _input;

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
    public long drawSize = Size.INSTANCE.m21245getUnspecifiedNHjbRc();

    /* renamed from: i, reason: from kotlin metadata */
    public Function1 transform = f2761t;

    /* renamed from: k, reason: from kotlin metadata */
    public ContentScale contentScale = ContentScale.INSTANCE.getFit();

    /* renamed from: l, reason: from kotlin metadata */
    public int filterQuality = DrawScope.INSTANCE.m21963getDefaultFilterQualityfv9h1I();

    /* renamed from: coil3.compose.AsyncImagePainter$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function1 m2648a() {
            return AsyncImagePainter.f2761t;
        }

        public Companion() {
        }
    }

    /* renamed from: coil3.compose.AsyncImagePainter$b */
    public static final class C5306b {

        /* renamed from: a */
        public final InterfaceC5328e f2780a;

        /* renamed from: b */
        public final C9924e f2781b;

        /* renamed from: c */
        public final InterfaceC8856b f2782c;

        public C5306b(InterfaceC5328e interfaceC5328e, C9924e c9924e, InterfaceC8856b interfaceC8856b) {
            this.f2780a = interfaceC5328e;
            this.f2781b = c9924e;
            this.f2782c = interfaceC8856b;
        }

        /* renamed from: a */
        public final InterfaceC5328e m2649a() {
            return this.f2780a;
        }

        /* renamed from: b */
        public final C9924e m2650b() {
            return this.f2781b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5306b)) {
                return false;
            }
            C5306b c5306b = (C5306b) obj;
            return Intrinsics.areEqual(this.f2780a, c5306b.f2780a) && Intrinsics.areEqual(this.f2782c, c5306b.f2782c) && this.f2782c.equals(this.f2781b, c5306b.f2781b);
        }

        public int hashCode() {
            return (((this.f2780a.hashCode() * 31) + this.f2782c.hashCode()) * 31) + this.f2782c.hashCode(this.f2781b);
        }

        public String toString() {
            return "Input(imageLoader=" + this.f2780a + ", request=" + this.f2781b + ", modelEqualityDelegate=" + this.f2782c + ")";
        }
    }

    /* renamed from: coil3.compose.AsyncImagePainter$c */
    public interface InterfaceC5307c {

        /* renamed from: coil3.compose.AsyncImagePainter$c$a */
        public static final class a implements InterfaceC5307c {

            /* renamed from: a */
            public static final a f2783a = new a();

            @Override // coil3.compose.AsyncImagePainter.InterfaceC5307c
            /* renamed from: a */
            public Painter mo2651a() {
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
        public static final class b implements InterfaceC5307c {

            /* renamed from: a */
            public final Painter f2784a;

            /* renamed from: b */
            public final C9923d f2785b;

            public b(Painter painter, C9923d c9923d) {
                this.f2784a = painter;
                this.f2785b = c9923d;
            }

            /* renamed from: c */
            public static /* synthetic */ b m2652c(b bVar, Painter painter, C9923d c9923d, int i9, Object obj) {
                if ((i9 & 1) != 0) {
                    painter = bVar.f2784a;
                }
                if ((i9 & 2) != 0) {
                    c9923d = bVar.f2785b;
                }
                return bVar.m2653b(painter, c9923d);
            }

            @Override // coil3.compose.AsyncImagePainter.InterfaceC5307c
            /* renamed from: a */
            public Painter mo2651a() {
                return this.f2784a;
            }

            /* renamed from: b */
            public final b m2653b(Painter painter, C9923d c9923d) {
                return new b(painter, c9923d);
            }

            /* renamed from: d */
            public final C9923d m2654d() {
                return this.f2785b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.f2784a, bVar.f2784a) && Intrinsics.areEqual(this.f2785b, bVar.f2785b);
            }

            public int hashCode() {
                Painter painter = this.f2784a;
                return ((painter == null ? 0 : painter.hashCode()) * 31) + this.f2785b.hashCode();
            }

            public String toString() {
                return "Error(painter=" + this.f2784a + ", result=" + this.f2785b + ")";
            }
        }

        /* renamed from: coil3.compose.AsyncImagePainter$c$c */
        public static final class c implements InterfaceC5307c {

            /* renamed from: a */
            public final Painter f2786a;

            public c(Painter painter) {
                this.f2786a = painter;
            }

            @Override // coil3.compose.AsyncImagePainter.InterfaceC5307c
            /* renamed from: a */
            public Painter mo2651a() {
                return this.f2786a;
            }

            /* renamed from: b */
            public final c m2655b(Painter painter) {
                return new c(painter);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.areEqual(this.f2786a, ((c) obj).f2786a);
            }

            public int hashCode() {
                Painter painter = this.f2786a;
                if (painter == null) {
                    return 0;
                }
                return painter.hashCode();
            }

            public String toString() {
                return "Loading(painter=" + this.f2786a + ")";
            }
        }

        /* renamed from: coil3.compose.AsyncImagePainter$c$d */
        public static final class d implements InterfaceC5307c {

            /* renamed from: a */
            public final Painter f2787a;

            /* renamed from: b */
            public final C9936q f2788b;

            public d(Painter painter, C9936q c9936q) {
                this.f2787a = painter;
                this.f2788b = c9936q;
            }

            @Override // coil3.compose.AsyncImagePainter.InterfaceC5307c
            /* renamed from: a */
            public Painter mo2651a() {
                return this.f2787a;
            }

            /* renamed from: b */
            public final C9936q m2656b() {
                return this.f2788b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return Intrinsics.areEqual(this.f2787a, dVar.f2787a) && Intrinsics.areEqual(this.f2788b, dVar.f2788b);
            }

            public int hashCode() {
                return (this.f2787a.hashCode() * 31) + this.f2788b.hashCode();
            }

            public String toString() {
                return "Success(painter=" + this.f2787a + ", result=" + this.f2788b + ")";
            }
        }

        /* renamed from: a */
        Painter mo2651a();
    }

    public AsyncImagePainter(C5306b c5306b) {
        this._input = c5306b;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(c5306b);
        this.inputFlow = MutableStateFlow;
        this.input = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(InterfaceC5307c.a.f2783a);
        this.stateFlow = MutableStateFlow2;
        this.state = FlowKt.asStateFlow(MutableStateFlow2);
    }

    /* renamed from: b */
    public static final InterfaceC5307c m2623b(InterfaceC5307c interfaceC5307c) {
        return interfaceC5307c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    private final Painter m2628h() {
        return (Painter) this.painter.getValue();
    }

    /* renamed from: r */
    private final void m2629r(Painter painter) {
        this.painter.setValue(painter);
    }

    @Override // androidx.compose.p012ui.graphics.painter.Painter
    public boolean applyAlpha(float alpha) {
        this.alpha = alpha;
        return true;
    }

    @Override // androidx.compose.p012ui.graphics.painter.Painter
    public boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    /* renamed from: g, reason: from getter */
    public final int getFilterQuality() {
        return this.filterQuality;
    }

    @Override // androidx.compose.p012ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        Painter painterM2628h = m2628h();
        return painterM2628h != null ? painterM2628h.getIntrinsicSize() : Size.INSTANCE.m21245getUnspecifiedNHjbRc();
    }

    /* renamed from: i, reason: from getter */
    public final AsyncImagePreviewHandler getPreviewHandler() {
        return this.previewHandler;
    }

    /* renamed from: j */
    public final CoroutineScope m2632j() {
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
    public final void m2634l() {
        C5306b c5306b = this._input;
        if (c5306b == null) {
            return;
        }
        m2641t(AbstractC8932e.m14225a(m2632j(), new AsyncImagePainter$launchJob$1(this, c5306b, null)));
    }

    /* renamed from: m */
    public final void m2635m() {
        if (this._input == null) {
            m2641t(null);
        } else if (this.isRemembered) {
            m2634l();
        }
    }

    /* renamed from: n */
    public final void m2636n(ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    /* renamed from: o */
    public final void m2637o(long j9) {
        if (Size.m21233equalsimpl0(this.drawSize, j9)) {
            return;
        }
        this.drawSize = j9;
        MutableSharedFlow mutableSharedFlow = this.drawSizeFlow;
        if (mutableSharedFlow != null) {
            mutableSharedFlow.tryEmit(Size.m21225boximpl(j9));
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        m2641t(null);
        Object objM2628h = m2628h();
        RememberObserver rememberObserver = objM2628h instanceof RememberObserver ? (RememberObserver) objM2628h : null;
        if (rememberObserver != null) {
            rememberObserver.onAbandoned();
        }
        this.isRemembered = false;
    }

    @Override // androidx.compose.p012ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        m2637o(drawScope.mo21960getSizeNHjbRc());
        Painter painterM2628h = m2628h();
        if (painterM2628h != null) {
            painterM2628h.m22086drawx_KDEd0(drawScope, drawScope.mo21960getSizeNHjbRc(), this.alpha, this.colorFilter);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        m2641t(null);
        Object objM2628h = m2628h();
        RememberObserver rememberObserver = objM2628h instanceof RememberObserver ? (RememberObserver) objM2628h : null;
        if (rememberObserver != null) {
            rememberObserver.onForgotten();
        }
        this.isRemembered = false;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object objM2628h = m2628h();
            RememberObserver rememberObserver = objM2628h instanceof RememberObserver ? (RememberObserver) objM2628h : null;
            if (rememberObserver != null) {
                rememberObserver.onRemembered();
            }
            m2634l();
            this.isRemembered = true;
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* renamed from: p */
    public final void m2638p(int i9) {
        this.filterQuality = i9;
    }

    /* renamed from: q */
    public final void m2639q(Function1 function1) {
        this.onState = function1;
    }

    /* renamed from: s */
    public final void m2640s(AsyncImagePreviewHandler asyncImagePreviewHandler) {
        this.previewHandler = asyncImagePreviewHandler;
    }

    /* renamed from: t */
    public final void m2641t(Job job) {
        Job job2 = this.rememberJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.rememberJob = job;
    }

    /* renamed from: u */
    public final void m2642u(CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
    }

    /* renamed from: v */
    public final void m2643v(Function1 function1) {
        this.transform = function1;
    }

    /* renamed from: w */
    public final void m2644w(C5306b c5306b) {
        if (Intrinsics.areEqual(this._input, c5306b)) {
            return;
        }
        this._input = c5306b;
        m2635m();
        if (c5306b != null) {
            this.inputFlow.setValue(c5306b);
        }
    }

    /* renamed from: x */
    public final InterfaceC5307c m2645x(InterfaceC9929j interfaceC9929j) {
        if (interfaceC9929j instanceof C9936q) {
            C9936q c9936q = (C9936q) interfaceC9929j;
            return new InterfaceC5307c.d(AbstractC8859e.m13712a(c9936q.m17120c(), c9936q.mo17012a().m17019c(), this.filterQuality), c9936q);
        }
        if (!(interfaceC9929j instanceof C9923d)) {
            throw new NoWhenBranchMatchedException();
        }
        C9923d c9923d = (C9923d) interfaceC9929j;
        InterfaceC8239j interfaceC8239jM17013b = c9923d.m17013b();
        return new InterfaceC5307c.b(interfaceC8239jM17013b != null ? AbstractC8859e.m13712a(interfaceC8239jM17013b, c9923d.mo17012a().m17019c(), this.filterQuality) : null, c9923d);
    }

    /* renamed from: y */
    public final C9924e m2646y(C9924e request, boolean isPreview) {
        request.m17040x();
        C9924e.a aVarM17053k = C9924e.m17015A(request, null, 1, null).m17053k(new C5308d(request, this));
        if (request.m17024h().m17082m() == null) {
            aVarM17053k.m17052j(InterfaceC9977g.f17948b0);
        }
        if (request.m17024h().m17081l() == null) {
            aVarM17053k.m17051i(AbstractC8937j.m14240o(this.contentScale));
        }
        if (request.m17024h().m17080k() == null) {
            aVarM17053k.m17050h(Precision.f3120b);
        }
        if (isPreview) {
            aVarM17053k.m17044b(EmptyCoroutineContext.INSTANCE);
        }
        return aVarM17053k.m17043a();
    }

    /* renamed from: z */
    public final void m2647z(InterfaceC5307c state) {
        InterfaceC5307c interfaceC5307c = (InterfaceC5307c) this.stateFlow.getValue();
        InterfaceC5307c interfaceC5307c2 = (InterfaceC5307c) this.transform.invoke(state);
        this.stateFlow.setValue(interfaceC5307c2);
        Painter painterM2672a = AbstractC5311b.m2672a(interfaceC5307c, interfaceC5307c2, this.contentScale);
        if (painterM2672a == null) {
            painterM2672a = interfaceC5307c2.mo2651a();
        }
        m2629r(painterM2672a);
        if (interfaceC5307c.mo2651a() != interfaceC5307c2.mo2651a()) {
            Object objMo2651a = interfaceC5307c.mo2651a();
            RememberObserver rememberObserver = objMo2651a instanceof RememberObserver ? (RememberObserver) objMo2651a : null;
            if (rememberObserver != null) {
                rememberObserver.onForgotten();
            }
            Object objMo2651a2 = interfaceC5307c2.mo2651a();
            RememberObserver rememberObserver2 = objMo2651a2 instanceof RememberObserver ? (RememberObserver) objMo2651a2 : null;
            if (rememberObserver2 != null) {
                rememberObserver2.onRemembered();
            }
        }
        Function1 function1 = this.onState;
        if (function1 != null) {
            function1.invoke(interfaceC5307c2);
        }
    }

    /* renamed from: coil3.compose.AsyncImagePainter$d */
    public static final class C5308d implements InterfaceC5217a {

        /* renamed from: a */
        public final /* synthetic */ C9924e f2789a;

        /* renamed from: b */
        public final /* synthetic */ AsyncImagePainter f2790b;

        public C5308d(C9924e c9924e, AsyncImagePainter asyncImagePainter) {
            this.f2789a = c9924e;
            this.f2790b = asyncImagePainter;
        }

        @Override // p029c0.InterfaceC5217a
        /* renamed from: c */
        public void mo2309c(InterfaceC8239j interfaceC8239j) {
            this.f2790b.m2647z(new InterfaceC5307c.c(interfaceC8239j != null ? AbstractC8859e.m13712a(interfaceC8239j, this.f2789a.m17019c(), this.f2790b.getFilterQuality()) : null));
        }

        @Override // p029c0.InterfaceC5217a
        /* renamed from: a */
        public void mo2307a(InterfaceC8239j interfaceC8239j) {
        }

        @Override // p029c0.InterfaceC5217a
        /* renamed from: b */
        public void mo2308b(InterfaceC8239j interfaceC8239j) {
        }
    }
}
