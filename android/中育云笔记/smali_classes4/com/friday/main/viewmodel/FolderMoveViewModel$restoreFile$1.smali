.class final Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/viewmodel/FolderMoveViewModel;->J(Ljava/lang/String;Ljava/lang/String;)V
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
    c = "com.friday.main.viewmodel.FolderMoveViewModel$restoreFile$1"
    f = "FolderMoveViewModel.kt"
    l = {
        0x225,
        0x227,
        0x228
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/friday/main/viewmodel/FolderMoveViewModel;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;->e:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;->f:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;->g:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;->e:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;->f:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;->g:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;-><init>(Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;Ljava/lang/String;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;->d:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v4, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lcom/friday/common/property/BaseResponse;

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_3

    .line 26
    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    iget-object v1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Lcom/friday/common/property/BaseResponse;

    .line 38
    .line 39
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;->e:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 51
    .line 52
    invoke-static {p1}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->i(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lu3/b;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    new-instance v1, Lcom/friday/main/model/RestoreReq;

    .line 57
    .line 58
    iget-object v5, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;->f:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v6, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;->g:Ljava/lang/String;

    .line 61
    .line 62
    invoke-direct {v1, v5, v6}, Lcom/friday/main/model/RestoreReq;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iput v4, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;->d:I

    .line 66
    .line 67
    invoke-interface {p1, v1, p0}, Lu3/b;->a(Lcom/friday/main/model/RestoreReq;Lvc/c;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, v0, :cond_4

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    :goto_0
    move-object v1, p1

    .line 75
    check-cast v1, Lcom/friday/common/property/BaseResponse;

    .line 76
    .line 77
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getCode()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-nez p1, :cond_6

    .line 82
    .line 83
    iget-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;->e:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 84
    .line 85
    invoke-static {p1}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->h(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lcom/friday/common/dao/FileDao;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, Ljava/util/List;

    .line 94
    .line 95
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    iput-object v6, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;->c:Ljava/lang/Object;

    .line 100
    .line 101
    iput v3, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;->d:I

    .line 102
    .line 103
    invoke-interface {p1, v5, p0}, Lcom/friday/common/dao/FileDao;->H(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-ne p1, v0, :cond_5

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;->e:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 111
    .line 112
    invoke-virtual {p1}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->A()Lvd/k;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-static {v4}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    iput-object v1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;->c:Ljava/lang/Object;

    .line 125
    .line 126
    iput v2, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;->d:I

    .line 127
    .line 128
    invoke-interface {p1, v3, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    if-ne p1, v0, :cond_7

    .line 133
    .line 134
    :goto_2
    return-object v0

    .line 135
    :cond_6
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getMsg()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    const/4 v0, 0x0

    .line 140
    new-array v0, v0, [Ljava/lang/Object;

    .line 141
    .line 142
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_7
    :goto_3
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 146
    .line 147
    return-object p1
.end method
