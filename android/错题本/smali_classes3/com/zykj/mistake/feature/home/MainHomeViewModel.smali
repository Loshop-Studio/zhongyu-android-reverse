.class public final Lcom/zykj/mistake/feature/home/MainHomeViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/zykj/mistake/feature/home/MainHomeViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "<init>",
        "()V",
        "app_release"
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
        "SMAP\nMainHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainHomeViewModel.kt\ncom/zykj/mistake/feature/home/MainHomeViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,46:1\n230#2,5:47\n230#2,5:52\n*S KotlinDebug\n*F\n+ 1 MainHomeViewModel.kt\ncom/zykj/mistake/feature/home/MainHomeViewModel\n*L\n23#1:47,5\n33#1:52,5\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lkotlinx/coroutines/flow/n0;

.field public final b:Lkotlinx/coroutines/flow/a0;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/mistake/feature/home/o;

    .line 5
    .line 6
    sget-object v1, Lcom/zykj/mistake/feature/home/HomeTab;->MISTAKE_NOTEBOOK:Lcom/zykj/mistake/feature/home/HomeTab;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, v1, v2}, Lcom/zykj/mistake/feature/home/o;-><init>(Lcom/zykj/mistake/feature/home/HomeTab;Z)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lkotlinx/coroutines/flow/h;->b(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/zykj/mistake/feature/home/MainHomeViewModel;->a:Lkotlinx/coroutines/flow/n0;

    .line 17
    .line 18
    new-instance v1, Lkotlinx/coroutines/flow/a0;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Lkotlinx/coroutines/flow/a0;-><init>(Lkotlinx/coroutines/flow/y;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lcom/zykj/mistake/feature/home/MainHomeViewModel;->b:Lkotlinx/coroutines/flow/a0;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/mistake/feature/home/k;)V
    .locals 6

    .line 1
    instance-of v0, p1, Lcom/zykj/mistake/feature/home/n;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/home/MainHomeViewModel;->a:Lkotlinx/coroutines/flow/n0;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const-string v3, "selectedTab"

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    check-cast p1, Lcom/zykj/mistake/feature/home/n;

    .line 11
    .line 12
    iget-object v0, p1, Lcom/zykj/mistake/feature/home/n;->a:Lcom/zykj/mistake/feature/home/HomeTab;

    .line 13
    .line 14
    :cond_0
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    move-object v4, p1

    .line 19
    check-cast v4, Lcom/zykj/mistake/feature/home/o;

    .line 20
    .line 21
    iget-object v4, v4, Lcom/zykj/mistake/feature/home/o;->a:Lcom/zykj/mistake/feature/home/HomeTab;

    .line 22
    .line 23
    if-ne v4, v0, :cond_1

    .line 24
    .line 25
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    new-instance v5, Lcom/zykj/mistake/feature/home/o;

    .line 29
    .line 30
    invoke-direct {v5, v4, v2}, Lcom/zykj/mistake/feature/home/o;-><init>(Lcom/zykj/mistake/feature/home/HomeTab;Z)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    new-instance v5, Lcom/zykj/mistake/feature/home/o;

    .line 38
    .line 39
    invoke-direct {v5, v0, v2}, Lcom/zykj/mistake/feature/home/o;-><init>(Lcom/zykj/mistake/feature/home/HomeTab;Z)V

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual {v1, p1, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_2
    instance-of v0, p1, Lcom/zykj/mistake/feature/home/m;

    .line 50
    .line 51
    if-eqz v0, :cond_6

    .line 52
    .line 53
    check-cast p1, Lcom/zykj/mistake/feature/home/m;

    .line 54
    .line 55
    iget-boolean p1, p1, Lcom/zykj/mistake/feature/home/m;->a:Z

    .line 56
    .line 57
    :cond_3
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    move-object v4, v0

    .line 62
    check-cast v4, Lcom/zykj/mistake/feature/home/o;

    .line 63
    .line 64
    iget-boolean v5, v4, Lcom/zykj/mistake/feature/home/o;->b:Z

    .line 65
    .line 66
    if-eqz v5, :cond_4

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    if-eqz p1, :cond_5

    .line 70
    .line 71
    sget-object v4, Lcom/zykj/mistake/feature/home/HomeTab;->REVIEW:Lcom/zykj/mistake/feature/home/HomeTab;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_5
    sget-object v4, Lcom/zykj/mistake/feature/home/HomeTab;->MISTAKE_NOTEBOOK:Lcom/zykj/mistake/feature/home/HomeTab;

    .line 75
    .line 76
    :goto_1
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    new-instance v5, Lcom/zykj/mistake/feature/home/o;

    .line 80
    .line 81
    invoke-direct {v5, v4, v2}, Lcom/zykj/mistake/feature/home/o;-><init>(Lcom/zykj/mistake/feature/home/HomeTab;Z)V

    .line 82
    .line 83
    .line 84
    move-object v4, v5

    .line 85
    :goto_2
    invoke-virtual {v1, v0, v4}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_3

    .line 90
    .line 91
    :goto_3
    return-void

    .line 92
    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 93
    .line 94
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 95
    .line 96
    .line 97
    throw p1
.end method
