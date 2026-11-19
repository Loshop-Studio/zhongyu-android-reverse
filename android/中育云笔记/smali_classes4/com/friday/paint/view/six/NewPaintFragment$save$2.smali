.class final Lcom/friday/paint/view/six/NewPaintFragment$save$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/six/NewPaintFragment;->save(Lcom/zykj/view/board/board/BoardFragment;ZLhd/l;Lhd/l;)V
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
    c = "com.friday.paint.view.six.NewPaintFragment$save$2"
    f = "NewPaintFragment.kt"
    l = {
        0x473
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/zykj/view/board/board/BoardFragment;

.field public final synthetic e:Lhd/l;

.field public final synthetic f:Z

.field public final synthetic g:Lhd/l;

.field public final synthetic h:Lcom/friday/paint/view/six/NewPaintFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardFragment;Lhd/l;ZLhd/l;Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->d:Lcom/zykj/view/board/board/BoardFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->e:Lhd/l;

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->f:Z

    .line 6
    .line 7
    iput-object p4, p0, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->g:Lhd/l;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->h:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic g(Lcom/friday/paint/view/six/NewPaintFragment;Lhd/l;Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->m(Lcom/friday/paint/view/six/NewPaintFragment;Lhd/l;Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lcom/friday/paint/view/six/NewPaintFragment;Lhd/l;Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/String;)Lqc/q;
    .locals 7

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/paint/view/six/NewPaintFragment$save$2$1$1;

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    move-object v5, p0

    .line 9
    move-object v3, p1

    .line 10
    move-object v4, p2

    .line 11
    move-object v2, p3

    .line 12
    invoke-direct/range {v1 .. v6}, Lcom/friday/paint/view/six/NewPaintFragment$save$2$1$1;-><init>(Ljava/lang/String;Lhd/l;Lcom/zykj/view/board/board/BoardFragment;Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V

    .line 13
    .line 14
    .line 15
    const/4 v4, 0x3

    .line 16
    const/4 v5, 0x0

    .line 17
    move-object v3, v1

    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 21
    .line 22
    .line 23
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 24
    .line 25
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 7

    .line 1
    new-instance v0, Lcom/friday/paint/view/six/NewPaintFragment$save$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->d:Lcom/zykj/view/board/board/BoardFragment;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->e:Lhd/l;

    .line 6
    .line 7
    iget-boolean v3, p0, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->f:Z

    .line 8
    .line 9
    iget-object v4, p0, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->g:Lhd/l;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->h:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/friday/paint/view/six/NewPaintFragment$save$2;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lhd/l;ZLhd/l;Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/six/NewPaintFragment$save$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->c:I

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
    iput v2, p0, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->c:I

    .line 28
    .line 29
    const-wide/16 v3, 0x64

    .line 30
    .line 31
    invoke-static {v3, v4, p0}, Lkotlinx/coroutines/DelayKt;->b(JLvc/c;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-ne p1, v0, :cond_2

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->d:Lcom/zykj/view/board/board/BoardFragment;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const/4 v0, 0x0

    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    const-string v1, "path"

    .line 48
    .line 49
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    goto :goto_1

    .line 54
    :cond_3
    move-object p1, v0

    .line 55
    :goto_1
    if-eqz p1, :cond_5

    .line 56
    .line 57
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_4

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_4
    sget-object v1, Lf2/e;->a:Lf2/e;

    .line 65
    .line 66
    new-instance v3, Ljava/io/File;

    .line 67
    .line 68
    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v3}, Lf2/e;->a(Ljava/io/File;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_5

    .line 76
    .line 77
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->e:Lhd/l;

    .line 78
    .line 79
    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 83
    .line 84
    return-object p1

    .line 85
    :cond_5
    :goto_2
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->d:Lcom/zykj/view/board/board/BoardFragment;

    .line 86
    .line 87
    iget-boolean v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->f:Z

    .line 88
    .line 89
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->g:Lhd/l;

    .line 90
    .line 91
    iget-object v3, p0, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->h:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 92
    .line 93
    iget-object v4, p0, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->e:Lhd/l;

    .line 94
    .line 95
    new-instance v5, Lcom/friday/paint/view/six/h;

    .line 96
    .line 97
    invoke-direct {v5, v3, v4, p1}, Lcom/friday/paint/view/six/h;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;Lhd/l;Lcom/zykj/view/board/board/BoardFragment;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v0, v2, v1, v5}, Lcom/zykj/view/board/board/BoardFragment;->z0(ZZLhd/l;Lhd/l;)V

    .line 101
    .line 102
    .line 103
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 104
    .line 105
    return-object p1
.end method
