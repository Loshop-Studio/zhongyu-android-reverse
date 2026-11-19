# RE note 本类字节码直接引用的读写或显示接口包括偏好设置。
.class public final Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initPageControl$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/listener/ITextSelectListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initPageControl()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\n*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "com/zykj/view/board/evaluation/BlackboardEvaluationFragment$initPageControl$4",
        "Lcom/zykj/blackboard/listener/ITextSelectListener;",
        "",
        "newColor",
        "Ld6/s;",
        "textColorChange",
        "(I)V",
        "",
        "newSize",
        "textSizeChange",
        "(F)V",
        "selectedColor",
        "selectedSize",
        "textSelected",
        "(IF)V",
        "textSelectedCancel",
        "()V",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initPageControl$4;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
# RE I/O 保存整数偏好（SharedPreferences$Editor.putInt）。
.method public textColorChange(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initPageControl$4;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->access$getBoardConfig$p(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lcom/zykj/blackboard/bean/BoardConfig;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/bean/BoardConfig;->setAddTextOriginalTextColor(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initPageControl$4;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "blackboard_evaluation_pen"

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "text_color_argb"

    .line 30
    .line 31
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public textSelected(IF)V
    .locals 0

    return-void
.end method

.method public textSelectedCancel()V
    .locals 0

    return-void
.end method

.method public textSizeChange(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initPageControl$4;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->access$getBoardConfig$p(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lcom/zykj/blackboard/bean/BoardConfig;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/bean/BoardConfig;->setAddTextOriginalTextSize(F)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
