.class final Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$3$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->E()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.ui.home.my.ManagementSubscribeFragment$initFragmentListener$3$1"
    f = "ManagementSubscribeFragment.kt"
    l = {
        0x149
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:I

.field public e:I

.field public final synthetic f:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$3$1;->f:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$3$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$3$1;->f:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$3$1;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$3$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$3$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$3$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$3$1;->e:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$3$1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lcom/zykj/study/bean/FreeSubscribeReq;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$3$1;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$3$1;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lcom/zykj/study/bean/FreeSubscribeReq;

    .line 23
    .line 24
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$3$1;->f:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->A()Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->e()Lcom/zykj/study/bean/FreeSubscribeReq;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$3$1;->f:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->A()Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    new-instance v4, Lcom/zykj/study/bean/DeleteSubBatchReq;

    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/zykj/study/bean/FreeSubscribeReq;->getCourseId()J

    .line 58
    .line 59
    .line 60
    move-result-wide v5

    .line 61
    invoke-virtual {p1}, Lcom/zykj/study/bean/FreeSubscribeReq;->getName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-virtual {p1}, Lcom/zykj/study/bean/FreeSubscribeReq;->getRoleType()Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    invoke-virtual {p1}, Lcom/zykj/study/bean/FreeSubscribeReq;->getLearnDateTimeStart()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    invoke-virtual {p1}, Lcom/zykj/study/bean/FreeSubscribeReq;->getLearnDateTimeEnd()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    invoke-direct/range {v4 .. v10}, Lcom/zykj/study/bean/DeleteSubBatchReq;-><init>(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$3$1;->a:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object v1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$3$1;->b:Ljava/lang/Object;

    .line 83
    .line 84
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$3$1;->c:Ljava/lang/Object;

    .line 89
    .line 90
    const/4 p1, 0x0

    .line 91
    iput p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$3$1;->d:I

    .line 92
    .line 93
    iput v2, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$3$1;->e:I

    .line 94
    .line 95
    invoke-virtual {v3, v4, p0}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->b(Lcom/zykj/study/bean/DeleteSubBatchReq;Lm7/c;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-ne p1, v0, :cond_2

    .line 100
    .line 101
    return-object v0

    .line 102
    :cond_2
    move-object v0, v1

    .line 103
    :goto_0
    invoke-static {v2}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_3

    .line 112
    .line 113
    invoke-static {v0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->v(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)Lcom/zykj/study/adapter/FreeSubscribeAdapter;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p1}, Landroidx/paging/PagingDataAdapter;->refresh()V

    .line 118
    .line 119
    .line 120
    :cond_3
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 121
    .line 122
    return-object p1
.end method
