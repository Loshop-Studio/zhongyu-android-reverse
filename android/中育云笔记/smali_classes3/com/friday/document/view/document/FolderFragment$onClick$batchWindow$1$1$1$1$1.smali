.class final Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.document.view.document.FolderFragment$onClick$batchWindow$1$1$1$1$1"
    f = "FolderFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:I

.field public final synthetic e:Lcom/friday/document/databinding/PopSortBinding;


# direct methods
.method public constructor <init>(ILcom/friday/document/databinding/PopSortBinding;Lvc/c;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1$1;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1$1;->e:Lcom/friday/document/databinding/PopSortBinding;

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
    new-instance p1, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1$1;

    .line 2
    .line 3
    iget v0, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1$1;->d:I

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1$1;->e:Lcom/friday/document/databinding/PopSortBinding;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1$1;-><init>(ILcom/friday/document/databinding/PopSortBinding;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget v0, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1$1;->d:I

    .line 18
    .line 19
    iget-object v1, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1$1;->e:Lcom/friday/document/databinding/PopSortBinding;

    .line 20
    .line 21
    iget-object v1, v1, Lcom/friday/document/databinding/PopSortBinding;->c:Landroid/widget/RadioButton;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x0

    .line 28
    if-ne v0, v1, :cond_0

    .line 29
    .line 30
    sget-object v0, Lk2/v;->a:Lk2/v$a;

    .line 31
    .line 32
    const-string v1, "SortByTime"

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lk2/v$a;->a(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v1, p0, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1$1;->e:Lcom/friday/document/databinding/PopSortBinding;

    .line 39
    .line 40
    iget-object v1, v1, Lcom/friday/document/databinding/PopSortBinding;->d:Landroid/widget/RadioButton;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-ne v0, v1, :cond_1

    .line 47
    .line 48
    sget-object v0, Lk2/v;->a:Lk2/v$a;

    .line 49
    .line 50
    const-string v1, "SortByName"

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lk2/v$a;->a(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    :cond_1
    :goto_0
    invoke-virtual {p1, v2}, Lcom/friday/common/helper/b;->B(I)V

    .line 57
    .line 58
    .line 59
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 60
    .line 61
    return-object p1

    .line 62
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1
.end method
