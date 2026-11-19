.class final Lcom/friday/main/view/FolderMoveActivity$initDataSource$4$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/view/FolderMoveActivity$initDataSource$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.main.view.FolderMoveActivity$initDataSource$4$1"
    f = "FolderMoveActivity.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Z

.field public final synthetic e:Lcom/friday/main/view/FolderMoveActivity;


# direct methods
.method public constructor <init>(Lcom/friday/main/view/FolderMoveActivity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/view/FolderMoveActivity$initDataSource$4$1;->e:Lcom/friday/main/view/FolderMoveActivity;

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
    new-instance v0, Lcom/friday/main/view/FolderMoveActivity$initDataSource$4$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/main/view/FolderMoveActivity$initDataSource$4$1;->e:Lcom/friday/main/view/FolderMoveActivity;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/main/view/FolderMoveActivity$initDataSource$4$1;-><init>(Lcom/friday/main/view/FolderMoveActivity;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput-boolean p1, v0, Lcom/friday/main/view/FolderMoveActivity$initDataSource$4$1;->d:Z

    .line 15
    .line 16
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/view/FolderMoveActivity$initDataSource$4$1;->invoke(ZLvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(ZLvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/view/FolderMoveActivity$initDataSource$4$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/main/view/FolderMoveActivity$initDataSource$4$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/main/view/FolderMoveActivity$initDataSource$4$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/friday/main/view/FolderMoveActivity$initDataSource$4$1;->d:Z

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/friday/main/view/FolderMoveActivity$initDataSource$4$1;->c:I

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/friday/main/view/FolderMoveActivity$initDataSource$4$1;->e:Lcom/friday/main/view/FolderMoveActivity;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {p1, v1}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 17
    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const-string p1, "MoveFileSuccess"

    .line 22
    .line 23
    invoke-static {p1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-interface {p1, v0}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const-string p1, "\u79fb\u52a8\u6210\u529f"

    .line 32
    .line 33
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lcom/friday/main/view/FolderMoveActivity$initDataSource$4$1;->e:Lcom/friday/main/view/FolderMoveActivity;

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const-string p1, "\u79fb\u52a8\u5931\u8d25"

    .line 43
    .line 44
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1
.end method
