.class final Lcom/friday/document/view/share/ShareSearchActivity$initDataSource$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/share/ShareSearchActivity$initDataSource$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.document.view.share.ShareSearchActivity$initDataSource$1$1"
    f = "ShareSearchActivity.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/friday/document/view/share/ShareSearchActivity;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/share/ShareSearchActivity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/share/ShareSearchActivity$initDataSource$1$1;->e:Lcom/friday/document/view/share/ShareSearchActivity;

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
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/document/view/share/ShareSearchActivity$initDataSource$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/document/view/share/ShareSearchActivity$initDataSource$1$1;->e:Lcom/friday/document/view/share/ShareSearchActivity;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/document/view/share/ShareSearchActivity$initDataSource$1$1;-><init>(Lcom/friday/document/view/share/ShareSearchActivity;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/friday/document/view/share/ShareSearchActivity$initDataSource$1$1;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/share/ShareSearchActivity$initDataSource$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/document/view/share/ShareSearchActivity$initDataSource$1$1;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/friday/document/view/share/ShareSearchActivity$initDataSource$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/share/ShareSearchActivity$initDataSource$1$1;->g(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/share/ShareSearchActivity$initDataSource$1$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/friday/document/view/share/ShareSearchActivity$initDataSource$1$1;->c:I

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/4 v1, 0x0

    .line 20
    const-string v2, "tvEmpty"

    .line 21
    .line 22
    const/16 v3, 0x8

    .line 23
    .line 24
    const-string v4, "rvSearch"

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    iget-object p1, p0, Lcom/friday/document/view/share/ShareSearchActivity$initDataSource$1$1;->e:Lcom/friday/document/view/share/ShareSearchActivity;

    .line 29
    .line 30
    invoke-static {p1}, Lcom/friday/document/view/share/ShareSearchActivity;->T(Lcom/friday/document/view/share/ShareSearchActivity;)Lcom/friday/document/databinding/ShareSearchActivityBinding;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p1, p1, Lcom/friday/document/databinding/ShareSearchActivityBinding;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 35
    .line 36
    invoke-static {p1, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lcom/friday/document/view/share/ShareSearchActivity$initDataSource$1$1;->e:Lcom/friday/document/view/share/ShareSearchActivity;

    .line 43
    .line 44
    invoke-static {p1}, Lcom/friday/document/view/share/ShareSearchActivity;->T(Lcom/friday/document/view/share/ShareSearchActivity;)Lcom/friday/document/databinding/ShareSearchActivityBinding;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object p1, p1, Lcom/friday/document/databinding/ShareSearchActivityBinding;->g:Landroid/widget/TextView;

    .line 49
    .line 50
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-object p1, p0, Lcom/friday/document/view/share/ShareSearchActivity$initDataSource$1$1;->e:Lcom/friday/document/view/share/ShareSearchActivity;

    .line 58
    .line 59
    invoke-static {p1}, Lcom/friday/document/view/share/ShareSearchActivity;->T(Lcom/friday/document/view/share/ShareSearchActivity;)Lcom/friday/document/databinding/ShareSearchActivityBinding;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object p1, p1, Lcom/friday/document/databinding/ShareSearchActivityBinding;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 64
    .line 65
    invoke-static {p1, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lcom/friday/document/view/share/ShareSearchActivity$initDataSource$1$1;->e:Lcom/friday/document/view/share/ShareSearchActivity;

    .line 72
    .line 73
    invoke-static {p1}, Lcom/friday/document/view/share/ShareSearchActivity;->T(Lcom/friday/document/view/share/ShareSearchActivity;)Lcom/friday/document/databinding/ShareSearchActivityBinding;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget-object p1, p1, Lcom/friday/document/databinding/ShareSearchActivityBinding;->g:Landroid/widget/TextView;

    .line 78
    .line 79
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, Lcom/friday/document/view/share/ShareSearchActivity$initDataSource$1$1;->e:Lcom/friday/document/view/share/ShareSearchActivity;

    .line 86
    .line 87
    invoke-static {p1}, Lcom/friday/document/view/share/ShareSearchActivity;->V(Lcom/friday/document/view/share/ShareSearchActivity;)Lcom/friday/document/view/share/ShareSearchAdapter;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    .line 92
    .line 93
    .line 94
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 95
    .line 96
    return-object p1

    .line 97
    :cond_1
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
