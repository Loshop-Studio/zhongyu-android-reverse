.class final Landroidx/work/CoroutineWorker$DeprecatedDispatcher;
.super Lsd/e0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/CoroutineWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DeprecatedDispatcher"
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/work/CoroutineWorker$DeprecatedDispatcher;

.field private static final dispatcher:Lsd/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/work/CoroutineWorker$DeprecatedDispatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/work/CoroutineWorker$DeprecatedDispatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/work/CoroutineWorker$DeprecatedDispatcher;->INSTANCE:Landroidx/work/CoroutineWorker$DeprecatedDispatcher;

    .line 7
    .line 8
    invoke-static {}, Lsd/r0;->a()Lsd/e0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Landroidx/work/CoroutineWorker$DeprecatedDispatcher;->dispatcher:Lsd/e0;

    .line 13
    .line 14
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lsd/e0;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public dispatch(Lkotlin/coroutines/d;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "block"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Landroidx/work/CoroutineWorker$DeprecatedDispatcher;->dispatcher:Lsd/e0;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lsd/e0;->dispatch(Lkotlin/coroutines/d;Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final getDispatcher()Lsd/e0;
    .locals 1

    .line 1
    sget-object v0, Landroidx/work/CoroutineWorker$DeprecatedDispatcher;->dispatcher:Lsd/e0;

    .line 2
    .line 3
    return-object v0
.end method

.method public isDispatchNeeded(Lkotlin/coroutines/d;)Z
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroidx/work/CoroutineWorker$DeprecatedDispatcher;->dispatcher:Lsd/e0;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lsd/e0;->isDispatchNeeded(Lkotlin/coroutines/d;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method
