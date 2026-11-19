.class final Lcom/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/BaseFileViewModel;->q0()V
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
    c = "com.friday.document.viewmodel.BaseFileViewModel$pollFolderLevel$1"
    f = "BaseFileViewModel.kt"
    l = {
        0x4f,
        0x53
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/friday/document/viewmodel/BaseFileViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

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
    new-instance p1, Lcom/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$1;->d:I

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
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$1;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lcom/friday/document/model/FolderLevelEntity;

    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_2

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance v1, Lcom/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$1$realLevel$1;

    .line 43
    .line 44
    iget-object v4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    invoke-direct {v1, v4, v5}, Lcom/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$1$realLevel$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 48
    .line 49
    .line 50
    iput v3, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$1;->d:I

    .line 51
    .line 52
    invoke-static {p1, v1, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v0, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    :goto_0
    check-cast p1, Lcom/friday/document/model/FolderLevelEntity;

    .line 60
    .line 61
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 62
    .line 63
    invoke-static {v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->l(Lcom/friday/document/viewmodel/BaseFileViewModel;)Landroidx/lifecycle/MutableLiveData;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 71
    .line 72
    invoke-static {v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->n(Lcom/friday/document/viewmodel/BaseFileViewModel;)Lvd/k;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/friday/document/model/FolderLevelEntity;->getFileId()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    if-nez v3, :cond_5

    .line 83
    .line 84
    :cond_4
    const-string v3, "0"

    .line 85
    .line 86
    :cond_5
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$1;->c:Ljava/lang/Object;

    .line 91
    .line 92
    iput v2, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$1;->d:I

    .line 93
    .line 94
    invoke-interface {v1, v3, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-ne p1, v0, :cond_6

    .line 99
    .line 100
    :goto_1
    return-object v0

    .line 101
    :cond_6
    :goto_2
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 102
    .line 103
    return-object p1
.end method
