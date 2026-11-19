.class final Lcom/friday/document/view/document/FolderFragment$onClick$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/document/FolderFragment$onClick$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.document.view.document.FolderFragment$onClick$2$1"
    f = "FolderFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/view/document/FolderFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/document/FolderFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/document/FolderFragment$onClick$2$1;->d:Lcom/friday/document/view/document/FolderFragment;

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
    new-instance p1, Lcom/friday/document/view/document/FolderFragment$onClick$2$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/document/FolderFragment$onClick$2$1;->d:Lcom/friday/document/view/document/FolderFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/view/document/FolderFragment$onClick$2$1;-><init>(Lcom/friday/document/view/document/FolderFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/FolderFragment$onClick$2$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/FolderFragment$onClick$2$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/document/FolderFragment$onClick$2$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/document/FolderFragment$onClick$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/document/view/document/FolderFragment$onClick$2$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/document/view/document/FolderFragment$onClick$2$1;->d:Lcom/friday/document/view/document/FolderFragment;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->V()Lvd/u;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {p1}, Lvd/u;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Ljava/util/List;

    .line 28
    .line 29
    sget-object v0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 30
    .line 31
    iget-object v1, p0, Lcom/friday/document/view/document/FolderFragment$onClick$2$1;->d:Lcom/friday/document/view/document/FolderFragment;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-string v2, "requireActivity(...)"

    .line 38
    .line 39
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Lcom/friday/common/entity/FileEntity;

    .line 47
    .line 48
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    new-instance v8, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    check-cast p1, Ljava/lang/Iterable;

    .line 58
    .line 59
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_0

    .line 68
    .line 69
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Lcom/friday/common/entity/FileEntity;

    .line 74
    .line 75
    invoke-virtual {v3}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 84
    .line 85
    const/16 v9, 0x7c

    .line 86
    .line 87
    const/4 v10, 0x0

    .line 88
    const/4 v3, 0x0

    .line 89
    const/4 v4, 0x0

    .line 90
    const/4 v5, 0x0

    .line 91
    const/4 v6, 0x0

    .line 92
    const/4 v7, 0x0

    .line 93
    invoke-static/range {v0 .. v10}, Lcom/friday/common/helper/c;->b(Lcom/friday/common/helper/c;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/util/ArrayList;ZZLjava/util/ArrayList;ILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 97
    .line 98
    return-object p1

    .line 99
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 100
    .line 101
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 102
    .line 103
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p1
.end method
