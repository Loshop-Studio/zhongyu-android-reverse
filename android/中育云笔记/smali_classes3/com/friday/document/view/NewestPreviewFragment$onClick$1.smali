.class final Lcom/friday/document/view/NewestPreviewFragment$onClick$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/NewestPreviewFragment;->onClick(Landroid/view/View;)V
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
    c = "com.friday.document.view.NewestPreviewFragment$onClick$1"
    f = "NewestPreviewFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/view/NewestPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/NewestPreviewFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$1;->d:Lcom/friday/document/view/NewestPreviewFragment;

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
    new-instance p1, Lcom/friday/document/view/NewestPreviewFragment$onClick$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$1;->d:Lcom/friday/document/view/NewestPreviewFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/view/NewestPreviewFragment$onClick$1;-><init>(Lcom/friday/document/view/NewestPreviewFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/NewestPreviewFragment$onClick$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/NewestPreviewFragment$onClick$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/NewestPreviewFragment$onClick$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/NewestPreviewFragment$onClick$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$1;->d:Lcom/friday/document/view/NewestPreviewFragment;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/friday/document/view/NewestPreviewFragment;->H(Lcom/friday/document/view/NewestPreviewFragment;)Lcom/friday/document/viewmodel/NewestViewModel;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->W()Lcom/friday/common/entity/FileEntity;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    sget-object v0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v2, "12"

    .line 34
    .line 35
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    const/16 v6, 0x10

    .line 40
    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v2, 0x0

    .line 43
    const/4 v3, 0x1

    .line 44
    const/4 v5, 0x0

    .line 45
    invoke-static/range {v0 .. v7}, Lcom/friday/common/helper/c;->l(Lcom/friday/common/helper/c;Ljava/lang/String;ZZZLjava/lang/String;ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object p1, Lk2/v;->a:Lk2/v$a;

    .line 49
    .line 50
    const-string v0, "FullScreen"

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lk2/v$a;->a(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 56
    .line 57
    return-object p1

    .line 58
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1
.end method
