.class public final Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final DEBUG:Z = false

.field private static final TAG:Ljava/lang/String; = "ScrollCapture"


# direct methods
.method public static synthetic a(Lkotlinx/coroutines/g;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback_androidKt;->launchWithCancellationSignal$lambda$0(Lkotlinx/coroutines/g;)V

    return-void
.end method

.method public static final synthetic access$launchWithCancellationSignal(Lsd/i0;Landroid/os/CancellationSignal;Lhd/p;)Lkotlinx/coroutines/g;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback_androidKt;->launchWithCancellationSignal(Lsd/i0;Landroid/os/CancellationSignal;Lhd/p;)Lkotlinx/coroutines/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final launchWithCancellationSignal(Lsd/i0;Landroid/os/CancellationSignal;Lhd/p;)Lkotlinx/coroutines/g;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/i0;",
            "Landroid/os/CancellationSignal;",
            "Lhd/p;",
            ")",
            "Lkotlinx/coroutines/g;"
        }
    .end annotation

    .line 1
    const/4 v4, 0x3

    .line 2
    const/4 v5, 0x0

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    move-object v0, p0

    .line 6
    move-object v3, p2

    .line 7
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance p2, Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1;

    .line 12
    .line 13
    invoke-direct {p2, p1}, Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1;-><init>(Landroid/os/CancellationSignal;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, p2}, Lkotlinx/coroutines/g;->A(Lhd/l;)Lsd/t0;

    .line 17
    .line 18
    .line 19
    new-instance p2, Landroidx/compose/ui/scrollcapture/c;

    .line 20
    .line 21
    invoke-direct {p2, p0}, Landroidx/compose/ui/scrollcapture/c;-><init>(Lkotlinx/coroutines/g;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method private static final launchWithCancellationSignal$lambda$0(Lkotlinx/coroutines/g;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, v0, v1, v0}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
