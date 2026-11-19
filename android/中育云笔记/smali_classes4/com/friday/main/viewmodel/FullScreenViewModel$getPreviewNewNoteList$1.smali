.class final Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewNewNoteList$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/viewmodel/FullScreenViewModel;->l(Lcom/friday/common/entity/FileEntity;)V
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
    c = "com.friday.main.viewmodel.FullScreenViewModel$getPreviewNewNoteList$1"
    f = "FullScreenViewModel.kt"
    l = {
        0x4a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/friday/main/viewmodel/FullScreenViewModel;

.field public final synthetic f:Lcom/friday/common/entity/FileEntity;


# direct methods
.method public constructor <init>(Lcom/friday/main/viewmodel/FullScreenViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewNewNoteList$1;->e:Lcom/friday/main/viewmodel/FullScreenViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewNewNoteList$1;->f:Lcom/friday/common/entity/FileEntity;

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
    new-instance p1, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewNewNoteList$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewNewNoteList$1;->e:Lcom/friday/main/viewmodel/FullScreenViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewNewNoteList$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewNewNoteList$1;-><init>(Lcom/friday/main/viewmodel/FullScreenViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewNewNoteList$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewNewNoteList$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewNewNoteList$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewNewNoteList$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewNewNoteList$1;->d:I

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
    iget-object v0, p0, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewNewNoteList$1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lcom/friday/common/helper/NotePageOrder;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    move-object v7, p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object p1, Lcom/friday/common/helper/NotePageOrder;->a:Lcom/friday/common/helper/NotePageOrder;

    .line 33
    .line 34
    iget-object v1, p0, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewNewNoteList$1;->e:Lcom/friday/main/viewmodel/FullScreenViewModel;

    .line 35
    .line 36
    invoke-static {v1}, Lcom/friday/main/viewmodel/FullScreenViewModel;->f(Lcom/friday/main/viewmodel/FullScreenViewModel;)Lcom/friday/common/dao/ResourceDao;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iget-object v1, p0, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewNewNoteList$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    iput-object p1, p0, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewNewNoteList$1;->c:Ljava/lang/Object;

    .line 47
    .line 48
    iput v2, p0, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewNewNoteList$1;->d:I

    .line 49
    .line 50
    const-wide/16 v5, 0x0

    .line 51
    .line 52
    const/4 v8, 0x2

    .line 53
    const/4 v9, 0x0

    .line 54
    move-object v7, p0

    .line 55
    invoke-static/range {v3 .. v9}, Lcom/friday/common/dao/ResourceDao;->c(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-ne v1, v0, :cond_2

    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_2
    move-object v0, p1

    .line 63
    move-object p1, v1

    .line 64
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Lcom/friday/common/helper/NotePageOrder;->d(Ljava/util/List;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget-object v0, v7, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewNewNoteList$1;->e:Lcom/friday/main/viewmodel/FullScreenViewModel;

    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/friday/main/viewmodel/FullScreenViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 80
    .line 81
    return-object p1
.end method
