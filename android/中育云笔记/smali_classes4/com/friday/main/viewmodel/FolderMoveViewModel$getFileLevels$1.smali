.class final Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/viewmodel/FolderMoveViewModel;->v(Ljava/lang/String;)V
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
    c = "com.friday.main.viewmodel.FolderMoveViewModel$getFileLevels$1"
    f = "FolderMoveViewModel.kt"
    l = {
        0xab,
        0xb0
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public final synthetic f:Lcom/friday/main/viewmodel/FolderMoveViewModel;

.field public final synthetic g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;->f:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;->g:Ljava/lang/String;

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
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;->f:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;->g:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;-><init>(Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;->e:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 18
    .line 19
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/List;

    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_2

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
    iget-object v1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Ljava/util/List;

    .line 38
    .line 39
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance p1, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;->f:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 52
    .line 53
    invoke-static {v1}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->h(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lcom/friday/common/dao/FileDao;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object v4, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;->g:Ljava/lang/String;

    .line 58
    .line 59
    iput-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;->c:Ljava/lang/Object;

    .line 60
    .line 61
    iput v3, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;->e:I

    .line 62
    .line 63
    invoke-interface {v1, v4, p0}, Lcom/friday/common/dao/FileDao;->r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    if-ne v1, v0, :cond_3

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    move-object v5, v1

    .line 71
    move-object v1, p1

    .line 72
    move-object p1, v5

    .line 73
    :goto_0
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 74
    .line 75
    if-nez p1, :cond_4

    .line 76
    .line 77
    iget-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;->f:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 78
    .line 79
    invoke-static {p1}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->g(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lcom/friday/common/entity/FileEntity;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const/4 v0, 0x0

    .line 84
    invoke-interface {v1, v0, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_4
    iget-object v3, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;->f:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 89
    .line 90
    iput-object v1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;->c:Ljava/lang/Object;

    .line 91
    .line 92
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    iput-object v4, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;->d:Ljava/lang/Object;

    .line 97
    .line 98
    iput v2, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;->e:I

    .line 99
    .line 100
    invoke-static {v3, p1, v1, p0}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->f(Lcom/friday/main/viewmodel/FolderMoveViewModel;Lcom/friday/common/entity/FileEntity;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    if-ne p1, v0, :cond_5

    .line 105
    .line 106
    :goto_1
    return-object v0

    .line 107
    :cond_5
    move-object v0, v1

    .line 108
    :goto_2
    move-object v1, v0

    .line 109
    :goto_3
    iget-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;->f:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 110
    .line 111
    invoke-static {p1}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->l(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lvd/l;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-interface {p1, v1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 119
    .line 120
    return-object p1
.end method
