.class final Lcom/friday/document/view/RecycleBinPreviewFragment$onResume$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/RecycleBinPreviewFragment$onResume$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.document.view.RecycleBinPreviewFragment$onResume$1$1"
    f = "RecycleBinPreviewFragment.kt"
    l = {
        0x15f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/friday/document/view/RecycleBinPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/RecycleBinPreviewFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$onResume$1$1;->e:Lcom/friday/document/view/RecycleBinPreviewFragment;

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
    new-instance p1, Lcom/friday/document/view/RecycleBinPreviewFragment$onResume$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$onResume$1$1;->e:Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/view/RecycleBinPreviewFragment$onResume$1$1;-><init>(Lcom/friday/document/view/RecycleBinPreviewFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/RecycleBinPreviewFragment$onResume$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/RecycleBinPreviewFragment$onResume$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/RecycleBinPreviewFragment$onResume$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/RecycleBinPreviewFragment$onResume$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$onResume$1$1;->d:I

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
    iget-object v0, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$onResume$1$1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lcom/friday/document/adapter/PreviewAdapter;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_1

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
    iget-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$onResume$1$1;->e:Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 32
    .line 33
    invoke-static {p1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->H(Lcom/friday/document/view/RecycleBinPreviewFragment;)Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->F()Landroidx/lifecycle/LiveData;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    const/4 p1, 0x0

    .line 55
    :goto_0
    const-string v1, "1"

    .line 56
    .line 57
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_4

    .line 62
    .line 63
    iget-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$onResume$1$1;->e:Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 64
    .line 65
    invoke-static {p1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->G(Lcom/friday/document/view/RecycleBinPreviewFragment;)Lcom/friday/document/adapter/PreviewAdapter;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iget-object v1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$onResume$1$1;->e:Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 70
    .line 71
    invoke-static {v1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->H(Lcom/friday/document/view/RecycleBinPreviewFragment;)Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iget-object v3, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$onResume$1$1;->e:Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 76
    .line 77
    invoke-static {v3}, Lcom/friday/document/view/RecycleBinPreviewFragment;->H(Lcom/friday/document/view/RecycleBinPreviewFragment;)Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v3}, Lcom/friday/document/viewmodel/BaseFileViewModel;->F()Landroidx/lifecycle/LiveData;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v3}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-static {v3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    check-cast v3, Lcom/friday/common/entity/FileEntity;

    .line 93
    .line 94
    iput-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$onResume$1$1;->c:Ljava/lang/Object;

    .line 95
    .line 96
    iput v2, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$onResume$1$1;->d:I

    .line 97
    .line 98
    invoke-virtual {v1, v3, p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->Q(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    if-ne v1, v0, :cond_3

    .line 103
    .line 104
    return-object v0

    .line 105
    :cond_3
    move-object v0, p1

    .line 106
    move-object p1, v1

    .line 107
    :goto_1
    check-cast p1, Ljava/util/List;

    .line 108
    .line 109
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    .line 110
    .line 111
    .line 112
    :cond_4
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 113
    .line 114
    return-object p1
.end method
