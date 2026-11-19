.class final Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$5$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/share/ShareBaseFileFragment;->initObserver()V
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
    c = "com.friday.document.view.share.ShareBaseFileFragment$initObserver$5$1"
    f = "ShareBaseFileFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/view/share/ShareBaseFileFragment;

.field public final synthetic e:Lcom/friday/document/model/ShareFile;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/share/ShareBaseFileFragment;Lcom/friday/document/model/ShareFile;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$5$1;->d:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$5$1;->e:Lcom/friday/document/model/ShareFile;

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
    new-instance p1, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$5$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$5$1;->d:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$5$1;->e:Lcom/friday/document/model/ShareFile;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$5$1;-><init>(Lcom/friday/document/view/share/ShareBaseFileFragment;Lcom/friday/document/model/ShareFile;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$5$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$5$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$5$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$5$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$5$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$5$1;->d:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/friday/document/view/share/ShareBaseFileFragment;->E()Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$5$1;->e:Lcom/friday/document/model/ShareFile;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lcom/friday/document/viewmodel/ShareFileViewModel;->N(Lcom/friday/document/model/ShareFile;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$5$1;->d:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/friday/document/view/share/ShareBaseFileFragment;->E()Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/ShareFileViewModel;->B()Lvd/u;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Lvd/u;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Ljava/util/List;

    .line 37
    .line 38
    iget-object v0, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$5$1;->e:Lcom/friday/document/model/ShareFile;

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const/4 v1, 0x0

    .line 45
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    const/4 v3, -0x1

    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Lcom/friday/document/model/ShareListEntity;

    .line 57
    .line 58
    invoke-virtual {v2}, Lcom/friday/document/model/ShareListEntity;->getShareFile()Lcom/friday/document/model/ShareFile;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v2}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_0

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    move v1, v3

    .line 81
    :goto_1
    if-eq v1, v3, :cond_2

    .line 82
    .line 83
    iget-object p1, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$5$1;->d:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 84
    .line 85
    invoke-static {p1}, Lcom/friday/document/view/share/ShareBaseFileFragment;->w(Lcom/friday/document/view/share/ShareBaseFileFragment;)Lcom/friday/document/databinding/FragmentShareFileBinding;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iget-object p1, p1, Lcom/friday/document/databinding/FragmentShareFileBinding;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 90
    .line 91
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    .line 92
    .line 93
    .line 94
    :cond_2
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 95
    .line 96
    return-object p1

    .line 97
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 100
    .line 101
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p1
.end method
