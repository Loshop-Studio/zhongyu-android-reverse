.class final Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.paint.view.six.NewStudentPaintFragment$handleHomework$1$5$2"
    f = "NewStudentPaintFragment.kt"
    l = {
        0x18b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public f:I

.field public final synthetic g:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic h:Lcom/friday/paint/view/six/NewStudentPaintFragment;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/friday/paint/view/six/NewStudentPaintFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2;->g:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2;->h:Lcom/friday/paint/view/six/NewStudentPaintFragment;

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

.method public static synthetic g(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2;->m(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel2(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->G()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v1, "["

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string p0, "] \u6dfb\u52a0\u56fe\u7247:\u7b54\u9898\u4efb\u52a1,\u8def\u5f84:"

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 42
    .line 43
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2;->g:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2;->h:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/friday/paint/view/six/NewStudentPaintFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2;->f:I

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
    iget-object v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Landroid/graphics/Bitmap;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    move-object v4, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2;->g:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 37
    .line 38
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Landroid/graphics/Bitmap;

    .line 41
    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    iget-object v1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2;->h:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 45
    .line 46
    iput-object v1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2;->c:Ljava/lang/Object;

    .line 47
    .line 48
    iput-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2;->d:Ljava/lang/Object;

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    iput v3, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2;->e:I

    .line 52
    .line 53
    iput v2, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2;->f:I

    .line 54
    .line 55
    const-wide/16 v2, 0xc8

    .line 56
    .line 57
    invoke-static {v2, v3, p0}, Lkotlinx/coroutines/DelayKt;->b(JLvc/c;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-ne v2, v0, :cond_2

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_2
    move-object v4, p1

    .line 65
    :goto_0
    :try_start_0
    sget-object p1, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 66
    .line 67
    invoke-virtual {v1}, Lcom/friday/paint/view/six/NewPaintFragment;->getCurrentNoteFragment()Lcom/zykj/view/board/board/BoardFragment;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    if-eqz v3, :cond_3

    .line 72
    .line 73
    new-instance v8, Lcom/friday/paint/view/six/k;

    .line 74
    .line 75
    invoke-direct {v8, v1}, Lcom/friday/paint/view/six/k;-><init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;)V

    .line 76
    .line 77
    .line 78
    const/4 v9, 0x6

    .line 79
    const/4 v10, 0x0

    .line 80
    const/4 v5, 0x0

    .line 81
    const/4 v6, 0x0

    .line 82
    const/4 v7, 0x1

    .line 83
    invoke-static/range {v3 .. v10}, Lcom/zykj/view/board/board/BoardFragment;->u0(Lcom/zykj/view/board/board/BoardFragment;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZLhd/l;ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    move-object p1, v0

    .line 91
    goto :goto_2

    .line 92
    :cond_3
    const/4 p1, 0x0

    .line 93
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    .line 95
    .line 96
    goto :goto_3

    .line 97
    :goto_2
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 98
    .line 99
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    :cond_4
    :goto_3
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 107
    .line 108
    return-object p1
.end method
