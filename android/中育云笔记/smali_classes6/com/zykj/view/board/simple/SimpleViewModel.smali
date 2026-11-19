.class public final Lcom/zykj/view/board/simple/SimpleViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# instance fields
.field public final a:Lvd/l;

.field public final b:Lvd/u;

.field public final c:Lvd/k;

.field public final d:Lvd/p;


# direct methods
.method public constructor <init>()V
    .locals 11

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/view/board/simple/e;

    .line 5
    .line 6
    const/16 v9, 0xff

    .line 7
    .line 8
    const/4 v10, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x0

    .line 17
    invoke-direct/range {v0 .. v10}, Lcom/zykj/view/board/simple/e;-><init>(ZLcom/zykj/view/board/board/q;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/simple/d;Lcom/zykj/view/board/simple/c;Lcom/zykj/view/board/board/s;Lcom/zykj/view/board/board/j;Lcom/zykj/view/board/board/l;ILkotlin/jvm/internal/n;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->a:Lvd/l;

    .line 25
    .line 26
    invoke-static {v0}, Lvd/e;->b(Lvd/l;)Lvd/u;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->b:Lvd/u;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    const/4 v1, 0x7

    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-static {v2, v2, v0, v1, v0}, Lvd/q;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/k;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->c:Lvd/k;

    .line 40
    .line 41
    invoke-static {v0}, Lvd/e;->a(Lvd/k;)Lvd/p;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->d:Lvd/p;

    .line 46
    .line 47
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/view/board/simple/SimpleViewModel;)Lvd/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->c:Lvd/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lcom/zykj/view/board/simple/SimpleViewModel;)Lvd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->a:Lvd/l;

    .line 2
    .line 3
    return-object p0
.end method

.method private final i()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutEraser$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutEraser$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private final j()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static synthetic r(Lcom/zykj/view/board/simple/SimpleViewModel;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->a:Lvd/l;

    .line 6
    .line 7
    invoke-interface {p1}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/zykj/view/board/simple/e;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/view/board/simple/e;->j()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    xor-int/lit8 p1, p1, 0x1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->q(Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/view/board/simple/SimpleViewModel$cleanPage$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/zykj/view/board/simple/SimpleViewModel$cleanPage$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final d()Lvd/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->d:Lvd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->b:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/view/board/simple/SimpleViewModel$handleExpandClick$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/zykj/view/board/simple/SimpleViewModel$handleExpandClick$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final g()V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->a:Lvd/l;

    .line 2
    .line 3
    :cond_0
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/view/board/simple/e;

    .line 9
    .line 10
    invoke-virtual {v2}, Lcom/zykj/view/board/simple/e;->f()Lcom/zykj/view/board/board/r;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    sget-object v4, Lcom/zykj/view/board/board/r$b;->e:Lcom/zykj/view/board/board/r$b;

    .line 15
    .line 16
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    :goto_0
    move-object v5, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    sget-object v4, Lcom/zykj/view/board/board/r$d;->e:Lcom/zykj/view/board/board/r$d;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    const/16 v11, 0xfb

    .line 28
    .line 29
    const/4 v12, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v8, 0x0

    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v10, 0x0

    .line 37
    invoke-static/range {v2 .. v12}, Lcom/zykj/view/board/simple/e;->b(Lcom/zykj/view/board/simple/e;ZLcom/zykj/view/board/board/q;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/simple/d;Lcom/zykj/view/board/simple/c;Lcom/zykj/view/board/board/s;Lcom/zykj/view/board/board/j;Lcom/zykj/view/board/board/l;ILjava/lang/Object;)Lcom/zykj/view/board/simple/e;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v0, v1, v2}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    return-void
.end method

.method public final h()V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->a:Lvd/l;

    .line 2
    .line 3
    :cond_0
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/view/board/simple/e;

    .line 9
    .line 10
    invoke-virtual {v2}, Lcom/zykj/view/board/simple/e;->f()Lcom/zykj/view/board/board/r;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    sget-object v4, Lcom/zykj/view/board/board/r$e;->e:Lcom/zykj/view/board/board/r$e;

    .line 15
    .line 16
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    :goto_0
    move-object v5, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    sget-object v4, Lcom/zykj/view/board/board/r$d;->e:Lcom/zykj/view/board/board/r$d;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    const/16 v11, 0xfb

    .line 28
    .line 29
    const/4 v12, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v8, 0x0

    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v10, 0x0

    .line 37
    invoke-static/range {v2 .. v12}, Lcom/zykj/view/board/simple/e;->b(Lcom/zykj/view/board/simple/e;ZLcom/zykj/view/board/board/q;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/simple/d;Lcom/zykj/view/board/simple/c;Lcom/zykj/view/board/board/s;Lcom/zykj/view/board/board/j;Lcom/zykj/view/board/board/l;ILjava/lang/Object;)Lcom/zykj/view/board/simple/e;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v0, v1, v2}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    return-void
.end method

.method public final k(I)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/view/board/simple/SimpleViewModel$updateEraserSizeLevel$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p1, p0, v1}, Lcom/zykj/view/board/simple/SimpleViewModel$updateEraserSizeLevel$1;-><init>(ILcom/zykj/view/board/simple/SimpleViewModel;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final l(Z)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, p1, v1}, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;ZLvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final m(Lcom/zykj/view/board/board/q;)V
    .locals 13

    .line 1
    const-string v0, "mainToolType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->a:Lvd/l;

    .line 7
    .line 8
    :goto_0
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    move-object v2, v1

    .line 13
    check-cast v2, Lcom/zykj/view/board/simple/e;

    .line 14
    .line 15
    const/16 v11, 0xfd

    .line 16
    .line 17
    const/4 v12, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v8, 0x0

    .line 23
    const/4 v9, 0x0

    .line 24
    const/4 v10, 0x0

    .line 25
    move-object v4, p1

    .line 26
    invoke-static/range {v2 .. v12}, Lcom/zykj/view/board/simple/e;->b(Lcom/zykj/view/board/simple/e;ZLcom/zykj/view/board/board/q;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/simple/d;Lcom/zykj/view/board/simple/c;Lcom/zykj/view/board/board/s;Lcom/zykj/view/board/board/j;Lcom/zykj/view/board/board/l;ILjava/lang/Object;)Lcom/zykj/view/board/simple/e;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {v0, v1, p1}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    instance-of p1, v4, Lcom/zykj/view/board/board/q$c;

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    invoke-direct {p0}, Lcom/zykj/view/board/simple/SimpleViewModel;->j()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    instance-of p1, v4, Lcom/zykj/view/board/board/q$a;

    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    invoke-direct {p0}, Lcom/zykj/view/board/simple/SimpleViewModel;->i()V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void

    .line 52
    :cond_2
    move-object p1, v4

    .line 53
    goto :goto_0
.end method

.method public final n(I)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p1, p0, v1}, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;-><init>(ILcom/zykj/view/board/simple/SimpleViewModel;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final o(I)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenSizeLevel$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p1, p0, v1}, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenSizeLevel$1;-><init>(ILcom/zykj/view/board/simple/SimpleViewModel;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final p(Lcom/zykj/view/board/simple/d;)V
    .locals 7

    .line 1
    const-string v0, "penType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;Lcom/zykj/view/board/simple/d;Lvc/c;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final q(Z)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, p1, v1}, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;ZLvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    return-void
.end method
