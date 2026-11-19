.class final Lcom/friday/paint/view/ThePaintFragment$initDrawerRight$2$onDrawerOpened$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/ThePaintFragment$initDrawerRight$2;->onDrawerOpened(Landroid/view/View;)V
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
    c = "com.friday.paint.view.ThePaintFragment$initDrawerRight$2$onDrawerOpened$1"
    f = "ThePaintFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/paint/view/ThePaintFragment;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/ThePaintFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$initDrawerRight$2$onDrawerOpened$1;->d:Lcom/friday/paint/view/ThePaintFragment;

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
    new-instance p1, Lcom/friday/paint/view/ThePaintFragment$initDrawerRight$2$onDrawerOpened$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/ThePaintFragment$initDrawerRight$2$onDrawerOpened$1;->d:Lcom/friday/paint/view/ThePaintFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/paint/view/ThePaintFragment$initDrawerRight$2$onDrawerOpened$1;-><init>(Lcom/friday/paint/view/ThePaintFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/ThePaintFragment$initDrawerRight$2$onDrawerOpened$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/ThePaintFragment$initDrawerRight$2$onDrawerOpened$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/ThePaintFragment$initDrawerRight$2$onDrawerOpened$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/ThePaintFragment$initDrawerRight$2$onDrawerOpened$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/paint/view/ThePaintFragment$initDrawerRight$2$onDrawerOpened$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$initDrawerRight$2$onDrawerOpened$1;->d:Lcom/friday/paint/view/ThePaintFragment;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/friday/paint/view/ThePaintFragment;->f0(Lcom/friday/paint/view/ThePaintFragment;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->x()Landroidx/lifecycle/MutableLiveData;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ljava/lang/Integer;

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, Lcom/friday/paint/view/ThePaintFragment$initDrawerRight$2$onDrawerOpened$1;->d:Lcom/friday/paint/view/ThePaintFragment;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-virtual {v0}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0, p1}, Lcom/friday/paint/adapter/ThumbnailListAdapter;->updateThumbnailExceptCurrent(I)V

    .line 40
    .line 41
    .line 42
    :cond_0
    const-string p1, "updateCurrentThumbnail"

    .line 43
    .line 44
    invoke-static {p1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const/4 v0, 0x0

    .line 49
    invoke-interface {p1, v0}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1
.end method
