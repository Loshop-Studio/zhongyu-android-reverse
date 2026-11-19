.class final Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/six/NewPaintFragment;->initObserver()V
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
    c = "com.friday.paint.view.six.NewPaintFragment$initObserver$7$1"
    f = "NewPaintFragment.kt"
    l = {
        0x168
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/paint/view/six/NewPaintFragment;

.field public final synthetic e:Landroid/graphics/Bitmap;

.field public final synthetic f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/graphics/Bitmap;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;->d:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;->e:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;->f:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic g(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;->m(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->access$checkImageSafety(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->G()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v1, "["

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p0, "] \u6dfb\u52a0\u56fe\u7247:\u5c4f\u5e55\u622a\u56fe,\u8def\u5f84:"

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 47
    .line 48
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;->d:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;->e:Landroid/graphics/Bitmap;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;->f:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/graphics/Bitmap;Ljava/lang/String;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;->c:I

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
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;->d:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;->e:Landroid/graphics/Bitmap;

    .line 30
    .line 31
    iget-object v3, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;->f:Ljava/lang/String;

    .line 32
    .line 33
    iput v2, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;->c:I

    .line 34
    .line 35
    invoke-static {p1, v1, v3, p0}, Lcom/friday/paint/view/six/NewPaintFragment;->access$saveScreenCaptureToPng(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/graphics/Bitmap;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    :goto_0
    move-object v2, p1

    .line 43
    check-cast v2, Ljava/lang/String;

    .line 44
    .line 45
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;->d:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->getCurrentNoteFragment()Lcom/zykj/view/board/board/BoardFragment;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    if-nez v2, :cond_3

    .line 54
    .line 55
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;->e:Landroid/graphics/Bitmap;

    .line 56
    .line 57
    :goto_1
    move-object v1, p1

    .line 58
    goto :goto_2

    .line 59
    :cond_3
    const/4 p1, 0x0

    .line 60
    goto :goto_1

    .line 61
    :goto_2
    iget-object v3, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;->f:Ljava/lang/String;

    .line 62
    .line 63
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;->d:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 64
    .line 65
    new-instance v5, Lcom/friday/paint/view/six/g;

    .line 66
    .line 67
    invoke-direct {v5, p1}, Lcom/friday/paint/view/six/g;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 68
    .line 69
    .line 70
    const/4 v4, 0x1

    .line 71
    invoke-virtual/range {v0 .. v5}, Lcom/zykj/view/board/board/BoardFragment;->t0(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZLhd/l;)V

    .line 72
    .line 73
    .line 74
    :cond_4
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 75
    .line 76
    return-object p1
.end method
