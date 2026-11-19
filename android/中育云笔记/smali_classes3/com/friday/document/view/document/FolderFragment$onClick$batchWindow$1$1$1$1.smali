.class final Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/document/FolderFragment;->onClick(Landroid/view/View;)V
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
    c = "com.friday.document.view.document.FolderFragment$onClick$batchWindow$1$1$1$1"
    f = "FolderFragment.kt"
    l = {
        0x15c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/view/document/FolderFragment;

.field public final synthetic e:Landroid/widget/PopupWindow;

.field public final synthetic f:I

.field public final synthetic g:Lcom/friday/document/databinding/PopSortBinding;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/document/FolderFragment;Landroid/widget/PopupWindow;ILcom/friday/document/databinding/PopSortBinding;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;->d:Lcom/friday/document/view/document/FolderFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;->e:Landroid/widget/PopupWindow;

    .line 4
    .line 5
    iput p3, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;->f:I

    .line 6
    .line 7
    iput-object p4, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;->g:Lcom/friday/document/databinding/PopSortBinding;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 6

    .line 1
    new-instance v0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;->d:Lcom/friday/document/view/document/FolderFragment;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;->e:Landroid/widget/PopupWindow;

    .line 6
    .line 7
    iget v3, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;->f:I

    .line 8
    .line 9
    iget-object v4, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;->g:Lcom/friday/document/databinding/PopSortBinding;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;-><init>(Lcom/friday/document/view/document/FolderFragment;Landroid/widget/PopupWindow;ILcom/friday/document/databinding/PopSortBinding;Lvc/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;->c:I

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance v1, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1$1;

    .line 32
    .line 33
    iget v3, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;->f:I

    .line 34
    .line 35
    iget-object v4, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;->g:Lcom/friday/document/databinding/PopSortBinding;

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-direct {v1, v3, v4, v5}, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1$1;-><init>(ILcom/friday/document/databinding/PopSortBinding;Lvc/c;)V

    .line 39
    .line 40
    .line 41
    iput v2, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;->c:I

    .line 42
    .line 43
    invoke-static {p1, v1, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-ne p1, v0, :cond_2

    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;->d:Lcom/friday/document/view/document/FolderFragment;

    .line 51
    .line 52
    invoke-static {p1}, Lcom/friday/document/view/document/FolderFragment;->c0(Lcom/friday/document/view/document/FolderFragment;)Lcom/friday/document/view/document/FileListFragment;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lcom/friday/document/view/document/FileListFragment;->E()V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;->d:Lcom/friday/document/view/document/FolderFragment;

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->y()V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;->d:Lcom/friday/document/view/document/FolderFragment;

    .line 65
    .line 66
    invoke-static {p1}, Lcom/friday/document/view/document/FolderFragment;->e0(Lcom/friday/document/view/document/FolderFragment;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;->e:Landroid/widget/PopupWindow;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 72
    .line 73
    .line 74
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 75
    .line 76
    return-object p1
.end method
