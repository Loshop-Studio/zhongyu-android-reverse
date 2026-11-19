.class public abstract Lcom/friday/common/base/BaseViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final a:I = 0x8


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a()Lqc/q;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/common/base/BaseViewModel;->d()Lqc/q;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lcom/friday/common/base/BaseViewModel;Lhd/p;Lhd/p;Lhd/a;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p5, :cond_2

    .line 2
    .line 3
    and-int/lit8 p5, p4, 0x2

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    new-instance p2, Lcom/friday/common/base/BaseViewModel$launch$1;

    .line 8
    .line 9
    const/4 p5, 0x0

    .line 10
    invoke-direct {p2, p5}, Lcom/friday/common/base/BaseViewModel$launch$1;-><init>(Lvc/c;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 14
    .line 15
    if-eqz p4, :cond_1

    .line 16
    .line 17
    new-instance p3, Lcom/friday/common/base/a;

    .line 18
    .line 19
    invoke-direct {p3}, Lcom/friday/common/base/a;-><init>()V

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/common/base/BaseViewModel;->b(Lhd/p;Lhd/p;Lhd/a;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 27
    .line 28
    const-string p1, "Super calls with default arguments not supported in this target, function: launch"

    .line 29
    .line 30
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p0
.end method

.method public static final d()Lqc/q;
    .locals 1

    .line 1
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final b(Lhd/p;Lhd/p;Lhd/a;)V
    .locals 7

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onError"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onComplete"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v4, Lcom/friday/common/base/BaseViewModel$launch$3;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-direct {v4, p1, p2, p3, v0}, Lcom/friday/common/base/BaseViewModel$launch$3;-><init>(Lhd/p;Lhd/p;Lhd/a;Lvc/c;)V

    .line 24
    .line 25
    .line 26
    const/4 v5, 0x3

    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v2, 0x0

    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 31
    .line 32
    .line 33
    return-void
.end method
