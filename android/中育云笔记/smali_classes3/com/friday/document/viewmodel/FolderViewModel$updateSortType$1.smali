.class final Lcom/friday/document/viewmodel/FolderViewModel$updateSortType$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/FolderViewModel;->P0()V
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
    c = "com.friday.document.viewmodel.FolderViewModel$updateSortType$1"
    f = "FolderViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/viewmodel/FolderViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/FolderViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/FolderViewModel$updateSortType$1;->d:Lcom/friday/document/viewmodel/FolderViewModel;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/document/viewmodel/FolderViewModel$updateSortType$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/FolderViewModel$updateSortType$1;->d:Lcom/friday/document/viewmodel/FolderViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/viewmodel/FolderViewModel$updateSortType$1;-><init>(Lcom/friday/document/viewmodel/FolderViewModel;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/FolderViewModel$updateSortType$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/FolderViewModel$updateSortType$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/FolderViewModel$updateSortType$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/FolderViewModel$updateSortType$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/document/viewmodel/FolderViewModel$updateSortType$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/document/viewmodel/FolderViewModel$updateSortType$1;->d:Lcom/friday/document/viewmodel/FolderViewModel;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/friday/document/viewmodel/FolderViewModel;->G0(Lcom/friday/document/viewmodel/FolderViewModel;)Lvd/l;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :cond_0
    invoke-interface {p1}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    move-object v1, v0

    .line 22
    check-cast v1, Lkotlin/Pair;

    .line 23
    .line 24
    new-instance v2, Lkotlin/Pair;

    .line 25
    .line 26
    invoke-virtual {v1}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    sget-object v3, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 31
    .line 32
    invoke-virtual {v3}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v3}, Lcom/friday/common/helper/b;->j()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-static {v3}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-direct {v2, v1, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1, v0, v2}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    iget-object p1, p0, Lcom/friday/document/viewmodel/FolderViewModel$updateSortType$1;->d:Lcom/friday/document/viewmodel/FolderViewModel;

    .line 54
    .line 55
    invoke-static {p1}, Lcom/friday/document/viewmodel/FolderViewModel;->E0(Lcom/friday/document/viewmodel/FolderViewModel;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Ljava/lang/Iterable;

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Lvd/l;

    .line 76
    .line 77
    :cond_1
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    move-object v2, v1

    .line 82
    check-cast v2, Lkotlin/Pair;

    .line 83
    .line 84
    new-instance v3, Lkotlin/Pair;

    .line 85
    .line 86
    invoke-virtual {v2}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    sget-object v4, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 91
    .line 92
    invoke-virtual {v4}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {v4}, Lcom/friday/common/helper/b;->j()I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    invoke-static {v4}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-direct {v3, v2, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v0, v1, v3}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 115
    .line 116
    return-object p1

    .line 117
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 118
    .line 119
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 120
    .line 121
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw p1
.end method
