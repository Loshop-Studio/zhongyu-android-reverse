.class final Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog$startBtEnableStatusJob$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->startBtEnableStatusJob()V
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
    c = "com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog$startBtEnableStatusJob$1"
    f = "ObjectiveHomeworkSubmitDialog.kt"
    l = {
        0xc7
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;


# direct methods
.method public constructor <init>(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog$startBtEnableStatusJob$1;->d:Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

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
    new-instance p1, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog$startBtEnableStatusJob$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog$startBtEnableStatusJob$1;->d:Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog$startBtEnableStatusJob$1;-><init>(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog$startBtEnableStatusJob$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog$startBtEnableStatusJob$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog$startBtEnableStatusJob$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog$startBtEnableStatusJob$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog$startBtEnableStatusJob$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog$startBtEnableStatusJob$1;->d:Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 29
    .line 30
    invoke-static {p1}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->w(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;)Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p1, p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->d:Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;

    .line 35
    .line 36
    iget-object p1, p1, Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;->f:Landroid/widget/TextView;

    .line 37
    .line 38
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 39
    .line 40
    .line 41
    iput v3, p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog$startBtEnableStatusJob$1;->c:I

    .line 42
    .line 43
    const-wide/16 v4, 0x1388

    .line 44
    .line 45
    invoke-static {v4, v5, p0}, Lkotlinx/coroutines/DelayKt;->b(JLvc/c;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-ne p1, v0, :cond_2

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog$startBtEnableStatusJob$1;->d:Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 53
    .line 54
    invoke-static {p1}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->w(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;)Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object p1, p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->d:Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;

    .line 59
    .line 60
    iget-object p1, p1, Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;->f:Landroid/widget/TextView;

    .line 61
    .line 62
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 63
    .line 64
    .line 65
    const-string p1, "\u968f\u5802\u6d4b\u6570\u636e\u8fde\u63a5\u5f02\u5e38\uff0c\u6682\u65f6\u65e0\u6cd5\u63d0\u4ea4"

    .line 66
    .line 67
    new-array v0, v2, [Ljava/lang/Object;

    .line 68
    .line 69
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 73
    .line 74
    return-object p1
.end method
