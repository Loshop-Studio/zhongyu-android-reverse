.class final Lcom/friday/document/view/FolderPreviewFragment$initData$2$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/FolderPreviewFragment$initData$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.document.view.FolderPreviewFragment$initData$2$1$1"
    f = "FolderPreviewFragment.kt"
    l = {
        0x4d,
        0x4f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/common/entity/FileEntity;

.field public final synthetic e:Lcom/friday/document/view/FolderPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/view/FolderPreviewFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/FolderPreviewFragment$initData$2$1$1;->d:Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/view/FolderPreviewFragment$initData$2$1$1;->e:Lcom/friday/document/view/FolderPreviewFragment;

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
    new-instance p1, Lcom/friday/document/view/FolderPreviewFragment$initData$2$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/FolderPreviewFragment$initData$2$1$1;->d:Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/view/FolderPreviewFragment$initData$2$1$1;->e:Lcom/friday/document/view/FolderPreviewFragment;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/view/FolderPreviewFragment$initData$2$1$1;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/view/FolderPreviewFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/FolderPreviewFragment$initData$2$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/FolderPreviewFragment$initData$2$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/FolderPreviewFragment$initData$2$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/FolderPreviewFragment$initData$2$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/document/view/FolderPreviewFragment$initData$2$1$1;->c:I

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/friday/document/view/FolderPreviewFragment$initData$2$1$1;->d:Lcom/friday/common/entity/FileEntity;

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const-string v1, "1"

    .line 41
    .line 42
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_4

    .line 47
    .line 48
    iget-object p1, p0, Lcom/friday/document/view/FolderPreviewFragment$initData$2$1$1;->e:Lcom/friday/document/view/FolderPreviewFragment;

    .line 49
    .line 50
    invoke-static {p1}, Lcom/friday/document/view/FolderPreviewFragment;->H(Lcom/friday/document/view/FolderPreviewFragment;)Lcom/friday/document/viewmodel/FolderViewModel;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-object v1, p0, Lcom/friday/document/view/FolderPreviewFragment$initData$2$1$1;->d:Lcom/friday/common/entity/FileEntity;

    .line 55
    .line 56
    iput v3, p0, Lcom/friday/document/view/FolderPreviewFragment$initData$2$1$1;->c:I

    .line 57
    .line 58
    invoke-virtual {p1, v1, p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->Q(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v0, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_4
    iget-object p1, p0, Lcom/friday/document/view/FolderPreviewFragment$initData$2$1$1;->e:Lcom/friday/document/view/FolderPreviewFragment;

    .line 69
    .line 70
    invoke-static {p1}, Lcom/friday/document/view/FolderPreviewFragment;->H(Lcom/friday/document/view/FolderPreviewFragment;)Lcom/friday/document/viewmodel/FolderViewModel;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iget-object v1, p0, Lcom/friday/document/view/FolderPreviewFragment$initData$2$1$1;->d:Lcom/friday/common/entity/FileEntity;

    .line 75
    .line 76
    iput v2, p0, Lcom/friday/document/view/FolderPreviewFragment$initData$2$1$1;->c:I

    .line 77
    .line 78
    invoke-virtual {p1, v1, p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->R(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-ne p1, v0, :cond_5

    .line 83
    .line 84
    :goto_1
    return-object v0

    .line 85
    :cond_5
    :goto_2
    check-cast p1, Ljava/util/List;

    .line 86
    .line 87
    return-object p1
.end method
