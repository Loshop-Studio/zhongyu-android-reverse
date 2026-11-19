.class final Lcom/friday/document/viewmodel/BaseFileViewModel$addFolderLevel$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/BaseFileViewModel;->s(Lcom/friday/common/entity/FileEntity;)V
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
    c = "com.friday.document.viewmodel.BaseFileViewModel$addFolderLevel$1"
    f = "BaseFileViewModel.kt"
    l = {
        0x73
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
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$addFolderLevel$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

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
    new-instance p1, Lcom/friday/document/viewmodel/BaseFileViewModel$addFolderLevel$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$addFolderLevel$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$addFolderLevel$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$addFolderLevel$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$addFolderLevel$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/BaseFileViewModel$addFolderLevel$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$addFolderLevel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$addFolderLevel$1;->d:I

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
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$addFolderLevel$1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lcom/friday/document/model/FolderLevelEntity;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$addFolderLevel$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 32
    .line 33
    invoke-static {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->h(Lcom/friday/document/viewmodel/BaseFileViewModel;)Ljava/util/LinkedList;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Ljava/util/LinkedList;->peekFirst()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Lcom/friday/document/model/FolderLevelEntity;

    .line 42
    .line 43
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$addFolderLevel$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 44
    .line 45
    invoke-static {v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->l(Lcom/friday/document/viewmodel/BaseFileViewModel;)Landroidx/lifecycle/MutableLiveData;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$addFolderLevel$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 53
    .line 54
    invoke-static {v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->m(Lcom/friday/document/viewmodel/BaseFileViewModel;)Lvd/k;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/friday/document/model/FolderLevelEntity;->getFileId()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    if-nez v3, :cond_3

    .line 65
    .line 66
    :cond_2
    const-string v3, "0"

    .line 67
    .line 68
    :cond_3
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$addFolderLevel$1;->c:Ljava/lang/Object;

    .line 73
    .line 74
    iput v2, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$addFolderLevel$1;->d:I

    .line 75
    .line 76
    invoke-interface {v1, v3, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-ne p1, v0, :cond_4

    .line 81
    .line 82
    return-object v0

    .line 83
    :cond_4
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 84
    .line 85
    return-object p1
.end method
