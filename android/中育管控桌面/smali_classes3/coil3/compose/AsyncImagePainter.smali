.class public final Lcoil3/compose/AsyncImagePainter;
.super Landroidx/compose/ui/graphics/painter/Painter;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/RememberObserver;


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcoil3/compose/AsyncImagePainter$a;,
        Lcoil3/compose/AsyncImagePainter$b;,
        Lcoil3/compose/AsyncImagePainter$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 i2\u00020\u00012\u00020\u0002:\u0003.0\'B\u0011\u0008\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0010*\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0007*\u00020\u0017H\u0014\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u000c2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014\u00a2\u0006\u0004\u0008 \u0010!J\u000f\u0010\"\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\"\u0010\tJ\u000f\u0010#\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008#\u0010\tJ\u000f\u0010$\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008$\u0010\tJ\r\u0010%\u001a\u00020\u0007\u00a2\u0006\u0004\u0008%\u0010\tR/\u0010-\u001a\u0004\u0018\u00010\u00012\u0008\u0010&\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0016\u00104\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00082\u00103R(\u0010;\u001a\u0004\u0018\u0001052\u0008\u00106\u001a\u0004\u0018\u0001058\u0002@BX\u0082\u000e\u00a2\u0006\u000c\n\u0004\u00087\u00108\"\u0004\u00089\u0010:R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010<8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R$\u0010E\u001a\u00020=2\u0006\u00106\u001a\u00020=8\u0002@BX\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008A\u0010B\"\u0004\u0008C\u0010DR\"\u0010L\u001a\u00020F8\u0000@\u0000X\u0080.\u00a2\u0006\u0012\n\u0004\u0008)\u0010G\u001a\u0004\u0008H\u0010I\"\u0004\u0008J\u0010KR.\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100M8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008N\u0010O\u001a\u0004\u0008P\u0010Q\"\u0004\u0008R\u0010SR0\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010M8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008H\u0010O\u001a\u0004\u0008U\u0010Q\"\u0004\u0008V\u0010SR\"\u0010_\u001a\u00020X8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008Y\u0010Z\u001a\u0004\u0008[\u0010\\\"\u0004\u0008]\u0010^R\"\u0010e\u001a\u00020`8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010a\u001a\u0004\u0008A\u0010b\"\u0004\u0008c\u0010dR$\u0010k\u001a\u0004\u0018\u00010f8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008%\u0010g\u001a\u0004\u0008N\u0010h\"\u0004\u0008i\u0010jR.\u0010p\u001a\u0004\u0018\u00010\u00032\u0008\u00106\u001a\u0004\u0018\u00010\u00038\u0000@@X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008]\u0010l\u001a\u0004\u0008m\u0010n\"\u0004\u0008o\u0010\u0006R\u001a\u0010s\u001a\u0008\u0012\u0004\u0012\u00020\u00030q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010rR\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030t8\u0006\u00a2\u0006\u000c\n\u0004\u0008c\u0010u\u001a\u0004\u0008v\u0010wR\u001a\u0010x\u001a\u0008\u0012\u0004\u0012\u00020\u00100q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008V\u0010rR\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100t8\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u0010u\u001a\u0004\u0008Y\u0010wR\u0014\u0010{\u001a\u00020=8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008y\u0010z\u00a8\u0006|"
    }
    d2 = {
        "Lcoil3/compose/AsyncImagePainter;",
        "Landroidx/compose/ui/graphics/painter/Painter;",
        "Landroidx/compose/runtime/RememberObserver;",
        "Lcoil3/compose/AsyncImagePainter$b;",
        "input",
        "<init>",
        "(Lcoil3/compose/AsyncImagePainter$b;)V",
        "",
        "l",
        "()V",
        "Ly/e;",
        "request",
        "",
        "isPreview",
        "y",
        "(Ly/e;Z)Ly/e;",
        "Lcoil3/compose/AsyncImagePainter$c;",
        "state",
        "z",
        "(Lcoil3/compose/AsyncImagePainter$c;)V",
        "Ly/j;",
        "x",
        "(Ly/j;)Lcoil3/compose/AsyncImagePainter$c;",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
        "onDraw",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V",
        "",
        "alpha",
        "applyAlpha",
        "(F)Z",
        "Landroidx/compose/ui/graphics/ColorFilter;",
        "colorFilter",
        "applyColorFilter",
        "(Landroidx/compose/ui/graphics/ColorFilter;)Z",
        "onRemembered",
        "onForgotten",
        "onAbandoned",
        "m",
        "<set-?>",
        "a",
        "Landroidx/compose/runtime/MutableState;",
        "h",
        "()Landroidx/compose/ui/graphics/painter/Painter;",
        "r",
        "(Landroidx/compose/ui/graphics/painter/Painter;)V",
        "painter",
        "b",
        "F",
        "c",
        "Landroidx/compose/ui/graphics/ColorFilter;",
        "d",
        "Z",
        "isRemembered",
        "Lkotlinx/coroutines/Job;",
        "value",
        "e",
        "Lkotlinx/coroutines/Job;",
        "t",
        "(Lkotlinx/coroutines/Job;)V",
        "rememberJob",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "Landroidx/compose/ui/geometry/Size;",
        "f",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "drawSizeFlow",
        "g",
        "J",
        "o",
        "(J)V",
        "drawSize",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlinx/coroutines/CoroutineScope;",
        "j",
        "()Lkotlinx/coroutines/CoroutineScope;",
        "u",
        "(Lkotlinx/coroutines/CoroutineScope;)V",
        "scope",
        "Lkotlin/Function1;",
        "i",
        "Lkotlin/jvm/functions/Function1;",
        "getTransform$coil_compose_core_release",
        "()Lkotlin/jvm/functions/Function1;",
        "v",
        "(Lkotlin/jvm/functions/Function1;)V",
        "transform",
        "getOnState$coil_compose_core_release",
        "q",
        "onState",
        "Landroidx/compose/ui/layout/ContentScale;",
        "k",
        "Landroidx/compose/ui/layout/ContentScale;",
        "getContentScale$coil_compose_core_release",
        "()Landroidx/compose/ui/layout/ContentScale;",
        "n",
        "(Landroidx/compose/ui/layout/ContentScale;)V",
        "contentScale",
        "Landroidx/compose/ui/graphics/FilterQuality;",
        "I",
        "()I",
        "p",
        "(I)V",
        "filterQuality",
        "Lcoil3/compose/AsyncImagePreviewHandler;",
        "Lcoil3/compose/AsyncImagePreviewHandler;",
        "()Lcoil3/compose/AsyncImagePreviewHandler;",
        "s",
        "(Lcoil3/compose/AsyncImagePreviewHandler;)V",
        "previewHandler",
        "Lcoil3/compose/AsyncImagePainter$b;",
        "get_input$coil_compose_core_release",
        "()Lcoil3/compose/AsyncImagePainter$b;",
        "w",
        "_input",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "inputFlow",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getInput",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "stateFlow",
        "getIntrinsicSize-NH-jbRc",
        "()J",
        "intrinsicSize",
        "coil-compose-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAsyncImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImagePainter.kt\ncoil3/compose/AsyncImagePainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 5 ImageRequest.kt\ncoil3/request/ImageRequest$Builder\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,419:1\n85#2:420\n113#2,2:421\n1#3:423\n26#4,5:424\n410#5,9:429\n148#6:438\n*S KotlinDebug\n*F\n+ 1 AsyncImagePainter.kt\ncoil3/compose/AsyncImagePainter\n*L\n158#1:420\n158#1:421,2\n220#1:424,5\n278#1:429,9\n340#1:438\n*E\n"
    }
.end annotation


# static fields
.field public static final s:Lcoil3/compose/AsyncImagePainter$a;

.field public static final t:Lkotlin/jvm/functions/Function1;


# instance fields
.field public final a:Landroidx/compose/runtime/MutableState;

.field public b:F

.field public c:Landroidx/compose/ui/graphics/ColorFilter;

.field public d:Z

.field public e:Lkotlinx/coroutines/Job;

.field public f:Lkotlinx/coroutines/flow/MutableSharedFlow;

.field public g:J

.field public h:Lkotlinx/coroutines/CoroutineScope;

.field public i:Lkotlin/jvm/functions/Function1;

.field public j:Lkotlin/jvm/functions/Function1;

.field public k:Landroidx/compose/ui/layout/ContentScale;

.field public l:I

.field public m:Lcoil3/compose/AsyncImagePreviewHandler;

.field public n:Lcoil3/compose/AsyncImagePainter$b;

.field public final o:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final p:Lkotlinx/coroutines/flow/StateFlow;

.field public final q:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final r:Lkotlinx/coroutines/flow/StateFlow;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcoil3/compose/AsyncImagePainter$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcoil3/compose/AsyncImagePainter$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcoil3/compose/AsyncImagePainter;->s:Lcoil3/compose/AsyncImagePainter$a;

    .line 8
    .line 9
    new-instance v0, Ll/b;

    .line 10
    .line 11
    invoke-direct {v0}, Ll/b;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcoil3/compose/AsyncImagePainter;->t:Lkotlin/jvm/functions/Function1;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Lcoil3/compose/AsyncImagePainter$b;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/graphics/painter/Painter;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-static {v0, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcoil3/compose/AsyncImagePainter;->a:Landroidx/compose/runtime/MutableState;

    .line 11
    .line 12
    const/high16 v0, 0x3f800000    # 1.0f

    .line 13
    .line 14
    iput v0, p0, Lcoil3/compose/AsyncImagePainter;->b:F

    .line 15
    .line 16
    sget-object v0, Landroidx/compose/ui/geometry/Size;->Companion:Landroidx/compose/ui/geometry/Size$Companion;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Size$Companion;->getUnspecified-NH-jbRc()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    iput-wide v0, p0, Lcoil3/compose/AsyncImagePainter;->g:J

    .line 23
    .line 24
    sget-object v0, Lcoil3/compose/AsyncImagePainter;->t:Lkotlin/jvm/functions/Function1;

    .line 25
    .line 26
    iput-object v0, p0, Lcoil3/compose/AsyncImagePainter;->i:Lkotlin/jvm/functions/Function1;

    .line 27
    .line 28
    sget-object v0, Landroidx/compose/ui/layout/ContentScale;->Companion:Landroidx/compose/ui/layout/ContentScale$Companion;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/compose/ui/layout/ContentScale$Companion;->getFit()Landroidx/compose/ui/layout/ContentScale;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lcoil3/compose/AsyncImagePainter;->k:Landroidx/compose/ui/layout/ContentScale;

    .line 35
    .line 36
    sget-object v0, Landroidx/compose/ui/graphics/drawscope/DrawScope;->Companion:Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;->getDefaultFilterQuality-f-v9h1I()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iput v0, p0, Lcoil3/compose/AsyncImagePainter;->l:I

    .line 43
    .line 44
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->n:Lcoil3/compose/AsyncImagePainter$b;

    .line 45
    .line 46
    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->o:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 51
    .line 52
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->p:Lkotlinx/coroutines/flow/StateFlow;

    .line 57
    .line 58
    sget-object p1, Lcoil3/compose/AsyncImagePainter$c$a;->a:Lcoil3/compose/AsyncImagePainter$c$a;

    .line 59
    .line 60
    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->q:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 65
    .line 66
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->r:Lkotlinx/coroutines/flow/StateFlow;

    .line 71
    .line 72
    return-void
.end method

.method public static synthetic a(Lcoil3/compose/AsyncImagePainter$c;)Lcoil3/compose/AsyncImagePainter$c;
    .locals 0

    .line 1
    invoke-static {p0}, Lcoil3/compose/AsyncImagePainter;->b(Lcoil3/compose/AsyncImagePainter$c;)Lcoil3/compose/AsyncImagePainter$c;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcoil3/compose/AsyncImagePainter$c;)Lcoil3/compose/AsyncImagePainter$c;
    .locals 0

    .line 1
    return-object p0
.end method

.method public static final synthetic c()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    sget-object v0, Lcoil3/compose/AsyncImagePainter;->t:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic d(Lcoil3/compose/AsyncImagePainter;Ly/j;)Lcoil3/compose/AsyncImagePainter$c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcoil3/compose/AsyncImagePainter;->x(Ly/j;)Lcoil3/compose/AsyncImagePainter$c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic e(Lcoil3/compose/AsyncImagePainter;Ly/e;Z)Ly/e;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcoil3/compose/AsyncImagePainter;->y(Ly/e;Z)Ly/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic f(Lcoil3/compose/AsyncImagePainter;Lcoil3/compose/AsyncImagePainter$c;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcoil3/compose/AsyncImagePainter;->z(Lcoil3/compose/AsyncImagePainter$c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final h()Landroidx/compose/ui/graphics/painter/Painter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->a:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/ui/graphics/painter/Painter;

    .line 8
    .line 9
    return-object v0
.end method

.method private final r(Landroidx/compose/ui/graphics/painter/Painter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->a:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public applyAlpha(F)Z
    .locals 0

    .line 1
    iput p1, p0, Lcoil3/compose/AsyncImagePainter;->b:F

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1
.end method

.method public applyColorFilter(Landroidx/compose/ui/graphics/ColorFilter;)Z
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->c:Landroidx/compose/ui/graphics/ColorFilter;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1
.end method

.method public final g()I
    .locals 1

    .line 1
    iget v0, p0, Lcoil3/compose/AsyncImagePainter;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public getIntrinsicSize-NH-jbRc()J
    .locals 2

    .line 1
    invoke-direct {p0}, Lcoil3/compose/AsyncImagePainter;->h()Landroidx/compose/ui/graphics/painter/Painter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/painter/Painter;->getIntrinsicSize-NH-jbRc()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0

    .line 12
    :cond_0
    sget-object v0, Landroidx/compose/ui/geometry/Size;->Companion:Landroidx/compose/ui/geometry/Size$Companion;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Size$Companion;->getUnspecified-NH-jbRc()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    return-wide v0
.end method

.method public final i()Lcoil3/compose/AsyncImagePreviewHandler;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->m:Lcoil3/compose/AsyncImagePreviewHandler;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Lkotlinx/coroutines/CoroutineScope;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->h:Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "scope"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final k()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->r:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->n:Lcoil3/compose/AsyncImagePainter$b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcoil3/compose/AsyncImagePainter;->j()Lkotlinx/coroutines/CoroutineScope;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v2, Lcoil3/compose/AsyncImagePainter$launchJob$1;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-direct {v2, p0, v0, v3}, Lcoil3/compose/AsyncImagePainter$launchJob$1;-><init>(Lcoil3/compose/AsyncImagePainter;Lcoil3/compose/AsyncImagePainter$b;Lkotlin/coroutines/Continuation;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lm/e;->a(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p0, v0}, Lcoil3/compose/AsyncImagePainter;->t(Lkotlinx/coroutines/Job;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final m()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->n:Lcoil3/compose/AsyncImagePainter$b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Lcoil3/compose/AsyncImagePainter;->t(Lkotlinx/coroutines/Job;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-boolean v0, p0, Lcoil3/compose/AsyncImagePainter;->d:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Lcoil3/compose/AsyncImagePainter;->l()V

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
.end method

.method public final n(Landroidx/compose/ui/layout/ContentScale;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->k:Landroidx/compose/ui/layout/ContentScale;

    .line 2
    .line 3
    return-void
.end method

.method public final o(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lcoil3/compose/AsyncImagePainter;->g:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Landroidx/compose/ui/geometry/Size;->equals-impl0(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-wide p1, p0, Lcoil3/compose/AsyncImagePainter;->g:J

    .line 10
    .line 11
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->f:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->box-impl(J)Landroidx/compose/ui/geometry/Size;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableSharedFlow;->tryEmit(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public onAbandoned()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcoil3/compose/AsyncImagePainter;->t(Lkotlinx/coroutines/Job;)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcoil3/compose/AsyncImagePainter;->h()Landroidx/compose/ui/graphics/painter/Painter;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    instance-of v2, v1, Landroidx/compose/runtime/RememberObserver;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    move-object v0, v1

    .line 14
    check-cast v0, Landroidx/compose/runtime/RememberObserver;

    .line 15
    .line 16
    :cond_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Landroidx/compose/runtime/RememberObserver;->onAbandoned()V

    .line 19
    .line 20
    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Lcoil3/compose/AsyncImagePainter;->d:Z

    .line 23
    .line 24
    return-void
.end method

.method public onDraw(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V
    .locals 8

    .line 1
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0, v0, v1}, Lcoil3/compose/AsyncImagePainter;->o(J)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcoil3/compose/AsyncImagePainter;->h()Landroidx/compose/ui/graphics/painter/Painter;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 15
    .line 16
    .line 17
    move-result-wide v4

    .line 18
    iget v6, p0, Lcoil3/compose/AsyncImagePainter;->b:F

    .line 19
    .line 20
    iget-object v7, p0, Lcoil3/compose/AsyncImagePainter;->c:Landroidx/compose/ui/graphics/ColorFilter;

    .line 21
    .line 22
    move-object v3, p1

    .line 23
    invoke-virtual/range {v2 .. v7}, Landroidx/compose/ui/graphics/painter/Painter;->draw-x_KDEd0(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/ui/graphics/ColorFilter;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public onForgotten()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcoil3/compose/AsyncImagePainter;->t(Lkotlinx/coroutines/Job;)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcoil3/compose/AsyncImagePainter;->h()Landroidx/compose/ui/graphics/painter/Painter;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    instance-of v2, v1, Landroidx/compose/runtime/RememberObserver;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    move-object v0, v1

    .line 14
    check-cast v0, Landroidx/compose/runtime/RememberObserver;

    .line 15
    .line 16
    :cond_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Landroidx/compose/runtime/RememberObserver;->onForgotten()V

    .line 19
    .line 20
    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Lcoil3/compose/AsyncImagePainter;->d:Z

    .line 23
    .line 24
    return-void
.end method

.method public onRemembered()V
    .locals 2

    .line 1
    const-string v0, "AsyncImagePainter.onRemembered"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-direct {p0}, Lcoil3/compose/AsyncImagePainter;->h()Landroidx/compose/ui/graphics/painter/Painter;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    instance-of v1, v0, Landroidx/compose/runtime/RememberObserver;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    check-cast v0, Landroidx/compose/runtime/RememberObserver;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, Landroidx/compose/runtime/RememberObserver;->onRemembered()V

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {p0}, Lcoil3/compose/AsyncImagePainter;->l()V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    iput-boolean v0, p0, Lcoil3/compose/AsyncImagePainter;->d:Z

    .line 30
    .line 31
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 38
    .line 39
    .line 40
    throw v0
.end method

.method public final p(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcoil3/compose/AsyncImagePainter;->l:I

    .line 2
    .line 3
    return-void
.end method

.method public final q(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->j:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method

.method public final s(Lcoil3/compose/AsyncImagePreviewHandler;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->m:Lcoil3/compose/AsyncImagePreviewHandler;

    .line 2
    .line 3
    return-void
.end method

.method public final t(Lkotlinx/coroutines/Job;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->e:Lkotlinx/coroutines/Job;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/Job$DefaultImpls;->cancel$default(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->e:Lkotlinx/coroutines/Job;

    .line 11
    .line 12
    return-void
.end method

.method public final u(Lkotlinx/coroutines/CoroutineScope;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->h:Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    return-void
.end method

.method public final v(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->i:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method

.method public final w(Lcoil3/compose/AsyncImagePainter$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->n:Lcoil3/compose/AsyncImagePainter$b;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->n:Lcoil3/compose/AsyncImagePainter$b;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcoil3/compose/AsyncImagePainter;->m()V

    .line 12
    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->o:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 17
    .line 18
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final x(Ly/j;)Lcoil3/compose/AsyncImagePainter$c;
    .locals 4

    .line 1
    instance-of v0, p1, Ly/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcoil3/compose/AsyncImagePainter$c$d;

    .line 6
    .line 7
    check-cast p1, Ly/q;

    .line 8
    .line 9
    invoke-virtual {p1}, Ly/q;->d()Lk/j;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p1}, Ly/q;->a()Ly/e;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Ly/e;->c()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget v3, p0, Lcoil3/compose/AsyncImagePainter;->l:I

    .line 22
    .line 23
    invoke-static {v1, v2, v3}, Ll/d;->a(Lk/j;Landroid/content/Context;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-direct {v0, v1, p1}, Lcoil3/compose/AsyncImagePainter$c$d;-><init>(Landroidx/compose/ui/graphics/painter/Painter;Ly/q;)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_0
    instance-of v0, p1, Ly/d;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    new-instance v0, Lcoil3/compose/AsyncImagePainter$c$b;

    .line 36
    .line 37
    check-cast p1, Ly/d;

    .line 38
    .line 39
    invoke-virtual {p1}, Ly/d;->b()Lk/j;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-virtual {p1}, Ly/d;->a()Ly/e;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Ly/e;->c()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    iget v3, p0, Lcoil3/compose/AsyncImagePainter;->l:I

    .line 54
    .line 55
    invoke-static {v1, v2, v3}, Ll/d;->a(Lk/j;Landroid/content/Context;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    const/4 v1, 0x0

    .line 61
    :goto_0
    invoke-direct {v0, v1, p1}, Lcoil3/compose/AsyncImagePainter$c$b;-><init>(Landroidx/compose/ui/graphics/painter/Painter;Ly/d;)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 66
    .line 67
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 68
    .line 69
    .line 70
    throw p1
.end method

.method public final y(Ly/e;Z)Ly/e;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ly/e;->x()Lz/g;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-static {p1, v0, v1, v0}, Ly/e;->A(Ly/e;Landroid/content/Context;ILjava/lang/Object;)Ly/e$a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcoil3/compose/AsyncImagePainter$d;

    .line 11
    .line 12
    invoke-direct {v1, p1, p0}, Lcoil3/compose/AsyncImagePainter$d;-><init>(Ly/e;Lcoil3/compose/AsyncImagePainter;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ly/e$a;->j(La0/a;)Ly/e$a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1}, Ly/e;->h()Ly/e$c;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ly/e$c;->m()Lz/g;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    sget-object v1, Lz/g;->c0:Lz/g;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ly/e$a;->i(Lz/g;)Ly/e$a;

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p1}, Ly/e;->h()Ly/e$c;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ly/e$c;->l()Lcoil3/size/Scale;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    iget-object v1, p0, Lcoil3/compose/AsyncImagePainter;->k:Landroidx/compose/ui/layout/ContentScale;

    .line 45
    .line 46
    invoke-static {v1}, Lm/h;->i(Landroidx/compose/ui/layout/ContentScale;)Lcoil3/size/Scale;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Ly/e$a;->h(Lcoil3/size/Scale;)Ly/e$a;

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-virtual {p1}, Ly/e;->h()Ly/e$c;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Ly/e$c;->k()Lcoil3/size/Precision;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-nez p1, :cond_2

    .line 62
    .line 63
    sget-object p1, Lcoil3/size/Precision;->b:Lcoil3/size/Precision;

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ly/e$a;->g(Lcoil3/size/Precision;)Ly/e$a;

    .line 66
    .line 67
    .line 68
    :cond_2
    if-eqz p2, :cond_3

    .line 69
    .line 70
    sget-object p1, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Ly/e$a;->b(Lkotlin/coroutines/CoroutineContext;)Ly/e$a;

    .line 73
    .line 74
    .line 75
    :cond_3
    invoke-virtual {v0}, Ly/e$a;->a()Ly/e;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1
.end method

.method public final z(Lcoil3/compose/AsyncImagePainter$c;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->q:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcoil3/compose/AsyncImagePainter$c;

    .line 8
    .line 9
    iget-object v1, p0, Lcoil3/compose/AsyncImagePainter;->i:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lcoil3/compose/AsyncImagePainter$c;

    .line 16
    .line 17
    iget-object v1, p0, Lcoil3/compose/AsyncImagePainter;->q:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcoil3/compose/AsyncImagePainter;->k:Landroidx/compose/ui/layout/ContentScale;

    .line 23
    .line 24
    invoke-static {v0, p1, v1}, Lcoil3/compose/b;->a(Lcoil3/compose/AsyncImagePainter$c;Lcoil3/compose/AsyncImagePainter$c;Landroidx/compose/ui/layout/ContentScale;)Lcoil3/compose/CrossfadePainter;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-interface {p1}, Lcoil3/compose/AsyncImagePainter$c;->a()Landroidx/compose/ui/graphics/painter/Painter;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    :goto_0
    invoke-direct {p0, v1}, Lcoil3/compose/AsyncImagePainter;->r(Landroidx/compose/ui/graphics/painter/Painter;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0}, Lcoil3/compose/AsyncImagePainter$c;->a()Landroidx/compose/ui/graphics/painter/Painter;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {p1}, Lcoil3/compose/AsyncImagePainter$c;->a()Landroidx/compose/ui/graphics/painter/Painter;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-eq v1, v2, :cond_4

    .line 47
    .line 48
    invoke-interface {v0}, Lcoil3/compose/AsyncImagePainter$c;->a()Landroidx/compose/ui/graphics/painter/Painter;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    instance-of v1, v0, Landroidx/compose/runtime/RememberObserver;

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    check-cast v0, Landroidx/compose/runtime/RememberObserver;

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move-object v0, v2

    .line 61
    :goto_1
    if-eqz v0, :cond_2

    .line 62
    .line 63
    invoke-interface {v0}, Landroidx/compose/runtime/RememberObserver;->onForgotten()V

    .line 64
    .line 65
    .line 66
    :cond_2
    invoke-interface {p1}, Lcoil3/compose/AsyncImagePainter$c;->a()Landroidx/compose/ui/graphics/painter/Painter;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    instance-of v1, v0, Landroidx/compose/runtime/RememberObserver;

    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    move-object v2, v0

    .line 75
    check-cast v2, Landroidx/compose/runtime/RememberObserver;

    .line 76
    .line 77
    :cond_3
    if-eqz v2, :cond_4

    .line 78
    .line 79
    invoke-interface {v2}, Landroidx/compose/runtime/RememberObserver;->onRemembered()V

    .line 80
    .line 81
    .line 82
    :cond_4
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->j:Lkotlin/jvm/functions/Function1;

    .line 83
    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    :cond_5
    return-void
.end method
