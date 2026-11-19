.class public final Lk5/h$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk5/h$j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lk5/h$h;

.field public final b:Lk5/h$d;

.field public final c:Lk5/h$j;

.field public final d:I


# direct methods
.method public constructor <init>(Lk5/h$h;Lk5/h$d;Lk5/h$j;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk5/h$j$a;->a:Lk5/h$h;

    .line 5
    .line 6
    iput-object p2, p0, Lk5/h$j$a;->b:Lk5/h$d;

    .line 7
    .line 8
    iput-object p3, p0, Lk5/h$j$a;->c:Lk5/h$j;

    .line 9
    .line 10
    iput p4, p0, Lk5/h$j$a;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lk5/h$j$a;->d:I

    packed-switch v0, :pswitch_data_0

    .line 2
    new-instance v0, Ljava/lang/AssertionError;

    iget v1, p0, Lk5/h$j$a;->d:I

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(I)V

    throw v0

    .line 3
    :pswitch_0
    new-instance v2, Lcom/zykj/evaluation/ui/sheet/treble/TrebleViewModel;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->o:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lp5/j;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->x:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lp5/k;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->c:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->k:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/zykj/evaluation/upload/OssTaskManger;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->u:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/zykj/evaluation/submit/SubmitTaskManger;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->j:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/zykj/evaluation/di/AppDatabase;

    invoke-direct/range {v2 .. v8}, Lcom/zykj/evaluation/ui/sheet/treble/TrebleViewModel;-><init>(Lp5/j;Lp5/k;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lcom/zykj/evaluation/di/AppDatabase;)V

    return-object v2

    .line 4
    :pswitch_1
    new-instance v0, Lcom/zykj/evaluation/ui/guide/normal/toDo/TodoGuideViewModel;

    iget-object v1, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v1, v1, Lk5/h$h;->o:Lo8/f;

    invoke-interface {v1}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp5/j;

    iget-object v2, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v2, v2, Lk5/h$h;->c:Lo8/f;

    invoke-interface {v2}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v3, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v3, v3, Lk5/h$h;->u:Lo8/f;

    invoke-interface {v3}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/zykj/evaluation/submit/SubmitTaskManger;

    iget-object v4, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v4, v4, Lk5/h$h;->j:Lo8/f;

    invoke-interface {v4}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/zykj/evaluation/di/AppDatabase;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/zykj/evaluation/ui/guide/normal/toDo/TodoGuideViewModel;-><init>(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lcom/zykj/evaluation/di/AppDatabase;)V

    return-object v0

    .line 5
    :pswitch_2
    new-instance v5, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->c:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->d:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->j:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/zykj/evaluation/di/AppDatabase;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->k:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/zykj/evaluation/upload/OssTaskManger;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->u:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/zykj/evaluation/submit/SubmitTaskManger;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->o:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lp5/j;

    invoke-direct/range {v5 .. v11}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/di/AppDatabase;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lp5/j;)V

    return-object v5

    .line 6
    :pswitch_3
    new-instance v0, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;

    iget-object v1, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v1, v1, Lk5/h$h;->o:Lo8/f;

    invoke-interface {v1}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp5/j;

    iget-object v2, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v2, v2, Lk5/h$h;->c:Lo8/f;

    invoke-interface {v2}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v3, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v3, v3, Lk5/h$h;->u:Lo8/f;

    invoke-interface {v3}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/zykj/evaluation/submit/SubmitTaskManger;

    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;-><init>(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/submit/SubmitTaskManger;)V

    return-object v0

    .line 7
    :pswitch_4
    new-instance v4, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->c:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->d:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->j:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/zykj/evaluation/di/AppDatabase;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->k:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/zykj/evaluation/upload/OssTaskManger;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->u:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/zykj/evaluation/submit/SubmitTaskManger;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->o:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lp5/j;

    invoke-direct/range {v4 .. v10}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/di/AppDatabase;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lp5/j;)V

    return-object v4

    .line 8
    :pswitch_5
    new-instance v0, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;

    iget-object v1, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v1, v1, Lk5/h$h;->o:Lo8/f;

    invoke-interface {v1}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp5/j;

    iget-object v2, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v2, v2, Lk5/h$h;->c:Lo8/f;

    invoke-interface {v2}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v3, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v3, v3, Lk5/h$h;->u:Lo8/f;

    invoke-interface {v3}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/zykj/evaluation/submit/SubmitTaskManger;

    iget-object v4, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v4, v4, Lk5/h$h;->j:Lo8/f;

    invoke-interface {v4}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/zykj/evaluation/di/AppDatabase;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;-><init>(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lcom/zykj/evaluation/di/AppDatabase;)V

    return-object v0

    .line 9
    :pswitch_6
    new-instance v5, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->c:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->d:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->j:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/zykj/evaluation/di/AppDatabase;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->k:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/zykj/evaluation/upload/OssTaskManger;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->u:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/zykj/evaluation/submit/SubmitTaskManger;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->o:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lp5/j;

    invoke-direct/range {v5 .. v11}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/di/AppDatabase;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lp5/j;)V

    return-object v5

    .line 10
    :pswitch_7
    new-instance v0, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;

    iget-object v1, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v1, v1, Lk5/h$h;->o:Lo8/f;

    invoke-interface {v1}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp5/j;

    invoke-direct {v0, v1}, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;-><init>(Lp5/j;)V

    return-object v0

    .line 11
    :pswitch_8
    new-instance v0, Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;

    iget-object v1, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v1, v1, Lk5/h$h;->o:Lo8/f;

    invoke-interface {v1}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp5/j;

    iget-object v2, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v2, v2, Lk5/h$h;->c:Lo8/f;

    invoke-interface {v2}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v3, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v3, v3, Lk5/h$h;->u:Lo8/f;

    invoke-interface {v3}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/zykj/evaluation/submit/SubmitTaskManger;

    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;-><init>(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/submit/SubmitTaskManger;)V

    return-object v0

    .line 12
    :pswitch_9
    new-instance v0, Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;

    iget-object v1, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v1, v1, Lk5/h$h;->c:Lo8/f;

    invoke-interface {v1}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v2, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v2, v2, Lk5/h$h;->d:Lo8/f;

    invoke-interface {v2}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v3, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v3, v3, Lk5/h$h;->o:Lo8/f;

    invoke-interface {v3}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp5/j;

    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lp5/j;)V

    return-object v0

    .line 13
    :pswitch_a
    new-instance v0, Lcom/zykj/evaluation/ui/progress/ProgressViewModel;

    invoke-direct {v0}, Lcom/zykj/evaluation/ui/progress/ProgressViewModel;-><init>()V

    return-object v0

    .line 14
    :pswitch_b
    new-instance v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->o:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lp5/j;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->x:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lp5/k;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->c:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->k:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/zykj/evaluation/upload/OssTaskManger;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->u:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/zykj/evaluation/submit/SubmitTaskManger;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->j:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/zykj/evaluation/di/AppDatabase;

    invoke-direct/range {v1 .. v7}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;-><init>(Lp5/j;Lp5/k;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lcom/zykj/evaluation/di/AppDatabase;)V

    return-object v1

    .line 15
    :pswitch_c
    new-instance v2, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->o:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lp5/j;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->c:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->k:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/zykj/evaluation/upload/OssTaskManger;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->u:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/zykj/evaluation/submit/SubmitTaskManger;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->j:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/zykj/evaluation/di/AppDatabase;

    invoke-direct/range {v2 .. v7}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;-><init>(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lcom/zykj/evaluation/di/AppDatabase;)V

    return-object v2

    .line 16
    :pswitch_d
    new-instance v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    iget-object v1, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v1, v1, Lk5/h$h;->c:Lo8/f;

    invoke-interface {v1}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v2, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v2, v2, Lk5/h$h;->o:Lo8/f;

    invoke-interface {v2}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp5/j;

    iget-object v3, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v3, v3, Lk5/h$h;->k:Lo8/f;

    invoke-interface {v3}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/zykj/evaluation/upload/OssTaskManger;

    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lp5/j;Lcom/zykj/evaluation/upload/OssTaskManger;)V

    return-object v0

    .line 17
    :pswitch_e
    new-instance v0, Lcom/zykj/evaluation/ui/MainViewModel;

    iget-object v1, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v1, v1, Lk5/h$h;->d:Lo8/f;

    invoke-interface {v1}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v2, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v2, v2, Lk5/h$h;->e:Lo8/f;

    invoke-interface {v2}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/coroutines/flow/MutableSharedFlow;

    iget-object v3, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v3, v3, Lk5/h$h;->c:Lo8/f;

    invoke-interface {v3}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v4, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v4, v4, Lk5/h$h;->k:Lo8/f;

    invoke-interface {v4}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/zykj/evaluation/upload/OssTaskManger;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/zykj/evaluation/ui/MainViewModel;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableSharedFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/upload/OssTaskManger;)V

    return-object v0

    .line 18
    :pswitch_f
    new-instance v5, Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->c:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->o:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lp5/j;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->v:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lh7/b;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->j:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/zykj/evaluation/di/AppDatabase;

    iget-object v0, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v0, v0, Lk5/h$h;->u:Lo8/f;

    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/zykj/evaluation/submit/SubmitTaskManger;

    invoke-direct/range {v5 .. v10}, Lcom/zykj/evaluation/ui/home/HomeViewModel;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lp5/j;Lh7/b;Lcom/zykj/evaluation/di/AppDatabase;Lcom/zykj/evaluation/submit/SubmitTaskManger;)V

    return-object v5

    .line 19
    :pswitch_10
    new-instance v0, Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;

    iget-object v1, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v1, v1, Lk5/h$h;->o:Lo8/f;

    invoke-interface {v1}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp5/j;

    iget-object v2, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v2, v2, Lk5/h$h;->c:Lo8/f;

    invoke-interface {v2}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v3, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v3, v3, Lk5/h$h;->u:Lo8/f;

    invoke-interface {v3}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/zykj/evaluation/submit/SubmitTaskManger;

    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;-><init>(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/submit/SubmitTaskManger;)V

    return-object v0

    .line 20
    :pswitch_11
    new-instance v0, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;

    iget-object v1, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v1, v1, Lk5/h$h;->c:Lo8/f;

    invoke-interface {v1}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v2, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v2, v2, Lk5/h$h;->d:Lo8/f;

    invoke-interface {v2}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v3, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v3, v3, Lk5/h$h;->o:Lo8/f;

    invoke-interface {v3}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp5/j;

    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lp5/j;)V

    return-object v0

    .line 21
    :pswitch_12
    new-instance v0, Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;

    iget-object v1, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v1, v1, Lk5/h$h;->o:Lo8/f;

    invoke-interface {v1}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp5/j;

    iget-object v2, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v2, v2, Lk5/h$h;->c:Lo8/f;

    invoke-interface {v2}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v3, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v3, v3, Lk5/h$h;->u:Lo8/f;

    invoke-interface {v3}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/zykj/evaluation/submit/SubmitTaskManger;

    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;-><init>(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/submit/SubmitTaskManger;)V

    return-object v0

    .line 22
    :pswitch_13
    new-instance v0, Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;

    iget-object v1, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v1, v1, Lk5/h$h;->c:Lo8/f;

    invoke-interface {v1}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v2, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v2, v2, Lk5/h$h;->d:Lo8/f;

    invoke-interface {v2}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v3, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v3, v3, Lk5/h$h;->o:Lo8/f;

    invoke-interface {v3}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp5/j;

    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lp5/j;)V

    return-object v0

    .line 23
    :pswitch_14
    new-instance v0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    iget-object v1, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v1, v1, Lk5/h$h;->c:Lo8/f;

    invoke-interface {v1}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v2, p0, Lk5/h$j$a;->a:Lk5/h$h;

    iget-object v2, v2, Lk5/h$h;->k:Lo8/f;

    invoke-interface {v2}, Lw8/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/zykj/evaluation/upload/OssTaskManger;

    invoke-direct {v0, v1, v2}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/upload/OssTaskManger;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
