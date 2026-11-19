.class public Lcom/xuexiang/xui/widget/guidview/GuideCaseQueue;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/guidview/DismissListener;


# instance fields
.field private mCompleteListener:Lcom/xuexiang/xui/widget/guidview/OnCompleteListener;

.field private mCurrent:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

.field private mCurrentOriginalDismissListener:Lcom/xuexiang/xui/widget/guidview/DismissListener;

.field private mQueue:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lcom/xuexiang/xui/widget/guidview/GuideCaseView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseQueue;->mQueue:Ljava/util/Queue;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseQueue;->mCurrentOriginalDismissListener:Lcom/xuexiang/xui/widget/guidview/DismissListener;

    return-void
.end method


# virtual methods
.method public add(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)Lcom/xuexiang/xui/widget/guidview/GuideCaseQueue;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseQueue;->mQueue:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public cancel(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseQueue;->mCurrent:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->hide()V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseQueue;->mQueue:Ljava/util/Queue;

    invoke-interface {p1}, Ljava/util/Queue;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseQueue;->mQueue:Ljava/util/Queue;

    invoke-interface {p1}, Ljava/util/Queue;->clear()V

    :cond_1
    return-void
.end method

.method public onDismiss(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseQueue;->mCurrentOriginalDismissListener:Lcom/xuexiang/xui/widget/guidview/DismissListener;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/guidview/DismissListener;->onDismiss(Ljava/lang/String;)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseQueue;->show()V

    return-void
.end method

.method public onSkipped(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseQueue;->mCurrentOriginalDismissListener:Lcom/xuexiang/xui/widget/guidview/DismissListener;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/guidview/DismissListener;->onSkipped(Ljava/lang/String;)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseQueue;->show()V

    return-void
.end method

.method public setCompleteListener(Lcom/xuexiang/xui/widget/guidview/OnCompleteListener;)Lcom/xuexiang/xui/widget/guidview/GuideCaseQueue;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseQueue;->mCompleteListener:Lcom/xuexiang/xui/widget/guidview/OnCompleteListener;

    return-object p0
.end method

.method public show()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseQueue;->mQueue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseQueue;->mQueue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseQueue;->mCurrent:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    .line 3
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->getDismissListener()Lcom/xuexiang/xui/widget/guidview/DismissListener;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseQueue;->mCurrentOriginalDismissListener:Lcom/xuexiang/xui/widget/guidview/DismissListener;

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseQueue;->mCurrent:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-virtual {v0, p0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->setDismissListener(Lcom/xuexiang/xui/widget/guidview/DismissListener;)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseQueue;->mCurrent:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->show()V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseQueue;->mCompleteListener:Lcom/xuexiang/xui/widget/guidview/OnCompleteListener;

    if-eqz v0, :cond_1

    .line 7
    invoke-interface {v0}, Lcom/xuexiang/xui/widget/guidview/OnCompleteListener;->onComplete()V

    :cond_1
    :goto_0
    return-void
.end method
