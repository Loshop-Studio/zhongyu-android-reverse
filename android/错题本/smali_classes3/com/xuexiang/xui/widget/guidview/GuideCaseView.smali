.class public Lcom/xuexiang/xui/widget/guidview/GuideCaseView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# virtual methods
.method public getDismissListener()Lcom/xuexiang/xui/widget/guidview/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getFocusCenterX()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    throw v0
.end method

.method public getFocusCenterY()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    throw v0
.end method

.method public getFocusHeight()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    throw v0
.end method

.method public getFocusRadius()F
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/guidview/FocusShape;->CIRCLE:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_0
    throw v1
.end method

.method public getFocusWidth()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    throw v0
.end method

.method public final onGlobalLayout()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    throw v0
.end method

.method public setDismissListener(Lcom/xuexiang/xui/widget/guidview/a;)V
    .locals 0

    return-void
.end method
