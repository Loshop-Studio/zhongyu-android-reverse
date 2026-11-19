.class public final Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$alignEvaluationPenColorPanelToPen$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->alignEvaluationPenColorPanelToPen()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "com/zykj/view/board/evaluation/BlackboardEvaluationFragment$alignEvaluationPenColorPanelToPen$1",
        "Landroid/view/ViewTreeObserver$OnPreDrawListener;",
        "onPreDraw",
        "",
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
.field final synthetic $ll:Landroid/widget/LinearLayout;

.field final synthetic $marginBelowToolbar:I

.field final synthetic $panel:Landroid/view/View;

.field final synthetic this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;


# direct methods
.method public constructor <init>(Landroid/view/View;ILcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/widget/LinearLayout;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$alignEvaluationPenColorPanelToPen$1;->$panel:Landroid/view/View;

    .line 2
    .line 3
    iput p2, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$alignEvaluationPenColorPanelToPen$1;->$marginBelowToolbar:I

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$alignEvaluationPenColorPanelToPen$1;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$alignEvaluationPenColorPanelToPen$1;->$ll:Landroid/widget/LinearLayout;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$alignEvaluationPenColorPanelToPen$1;->$panel:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$alignEvaluationPenColorPanelToPen$1;->$panel:Landroid/view/View;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$alignEvaluationPenColorPanelToPen$1;->$panel:Landroid/view/View;

    .line 20
    .line 21
    iget v2, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$alignEvaluationPenColorPanelToPen$1;->$marginBelowToolbar:I

    .line 22
    .line 23
    iget-object v3, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$alignEvaluationPenColorPanelToPen$1;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 24
    .line 25
    iget-object v4, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$alignEvaluationPenColorPanelToPen$1;->$ll:Landroid/widget/LinearLayout;

    .line 26
    .line 27
    invoke-static {v0, v2, v3, v4}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->access$alignEvaluationPenColorPanelToPen$applyAlignment(Landroid/view/View;ILcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/widget/LinearLayout;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$alignEvaluationPenColorPanelToPen$1;->$panel:Landroid/view/View;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    return v1
.end method
