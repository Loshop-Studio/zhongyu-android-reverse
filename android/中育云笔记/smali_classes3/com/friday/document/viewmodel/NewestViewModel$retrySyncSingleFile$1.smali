.class final Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/NewestViewModel;->J0(Lcom/friday/common/entity/FileEntity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.viewmodel.NewestViewModel$retrySyncSingleFile$1"
    f = "NewestViewModel.kt"
    l = {
        0x67,
        0x6a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public e:I

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic g:Lcom/friday/document/viewmodel/NewestViewModel;

.field public final synthetic h:Lcom/friday/common/entity/FileEntity;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/NewestViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;->g:Lcom/friday/document/viewmodel/NewestViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;->h:Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance v0, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;->g:Lcom/friday/document/viewmodel/NewestViewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;->h:Lcom/friday/common/entity/FileEntity;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;-><init>(Lcom/friday/document/viewmodel/NewestViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;->f:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lsd/i0;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;->e:I

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    const/4 v4, 0x1

    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    if-eq v2, v4, :cond_1

    .line 16
    .line 17
    if-ne v2, v3, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_4

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    iget-object v2, p0, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Lsd/i0;

    .line 34
    .line 35
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;->g:Lcom/friday/document/viewmodel/NewestViewModel;

    .line 45
    .line 46
    iget-object v2, p0, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;->h:Lcom/friday/common/entity/FileEntity;

    .line 47
    .line 48
    :try_start_1
    sget-object v5, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->N()Lcom/friday/document/service/FileManager;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    iput-object v5, p0, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;->f:Ljava/lang/Object;

    .line 59
    .line 60
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    iput-object v5, p0, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;->c:Ljava/lang/Object;

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    iput v5, p0, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;->d:I

    .line 68
    .line 69
    iput v4, p0, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;->e:I

    .line 70
    .line 71
    invoke-virtual {p1, v2, p0}, Lcom/friday/document/service/FileManager;->G(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-ne p1, v1, :cond_3

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 79
    .line 80
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    goto :goto_2

    .line 85
    :goto_1
    sget-object v2, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 86
    .line 87
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    :goto_2
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    new-instance v4, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1$1;

    .line 100
    .line 101
    const/4 v5, 0x0

    .line 102
    invoke-direct {v4, p1, v5}, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1$1;-><init>(Ljava/lang/Object;Lvc/c;)V

    .line 103
    .line 104
    .line 105
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iput-object v0, p0, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;->f:Ljava/lang/Object;

    .line 110
    .line 111
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    iput-object p1, p0, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;->c:Ljava/lang/Object;

    .line 116
    .line 117
    iput v3, p0, Lcom/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1;->e:I

    .line 118
    .line 119
    invoke-static {v2, v4, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    if-ne p1, v1, :cond_4

    .line 124
    .line 125
    :goto_3
    return-object v1

    .line 126
    :cond_4
    :goto_4
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 127
    .line 128
    return-object p1
.end method
