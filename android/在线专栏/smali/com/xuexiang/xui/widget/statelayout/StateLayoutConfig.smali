.class public Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final DEFAULT_ANIM_ENABLED:Z = true

.field private static final DEFAULT_IN_ANIM:I = 0x10a0000

.field private static final DEFAULT_OUT_ANIM:I = 0x10a0001


# instance fields
.field public animationEnabled:Z

.field public emptyImageRes:I

.field public emptyMessageRes:I

.field public errorImageRes:I

.field public errorMessageRes:I

.field public inAnimation:Landroid/view/animation/Animation;

.field public loadingMessageRes:I

.field public locationOffImageRes:I

.field public locationOffMessageRes:I

.field public offlineImageRes:I

.field public offlineMessageRes:I

.field public outAnimation:Landroid/view/animation/Animation;

.field public retryMessageRes:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->animationEnabled:Z

    const/high16 v0, 0x10a0000

    .line 3
    invoke-static {v0}, Lcom/xuexiang/xui/utils/ResUtils;->getAnim(I)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->inAnimation:Landroid/view/animation/Animation;

    const v0, 0x10a0001

    .line 4
    invoke-static {v0}, Lcom/xuexiang/xui/utils/ResUtils;->getAnim(I)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->outAnimation:Landroid/view/animation/Animation;

    .line 5
    sget v0, Lcom/xuexiang/xui/R$drawable;->stf_ic_empty:I

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->emptyImageRes:I

    .line 6
    sget v0, Lcom/xuexiang/xui/R$string;->stfEmptyMessage:I

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->emptyMessageRes:I

    .line 7
    sget v0, Lcom/xuexiang/xui/R$drawable;->stf_ic_error:I

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->errorImageRes:I

    .line 8
    sget v0, Lcom/xuexiang/xui/R$string;->stfErrorMessage:I

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->errorMessageRes:I

    .line 9
    sget v0, Lcom/xuexiang/xui/R$drawable;->stf_ic_offline:I

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->offlineImageRes:I

    .line 10
    sget v0, Lcom/xuexiang/xui/R$string;->stfOfflineMessage:I

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->offlineMessageRes:I

    .line 11
    sget v0, Lcom/xuexiang/xui/R$drawable;->stf_ic_location_off:I

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->locationOffImageRes:I

    .line 12
    sget v0, Lcom/xuexiang/xui/R$string;->stfLocationOffMessage:I

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->locationOffMessageRes:I

    .line 13
    sget v0, Lcom/xuexiang/xui/R$string;->stfRetryButtonText:I

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->retryMessageRes:I

    .line 14
    sget v0, Lcom/xuexiang/xui/R$string;->stfLoadingMessage:I

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->loadingMessageRes:I

    return-void
.end method


# virtual methods
.method public getEmptyImageRes()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->emptyImageRes:I

    return v0
.end method

.method public getEmptyMessageRes()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->emptyMessageRes:I

    return v0
.end method

.method public getErrorImageRes()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->errorImageRes:I

    return v0
.end method

.method public getErrorMessageRes()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->errorMessageRes:I

    return v0
.end method

.method public getInAnimation()Landroid/view/animation/Animation;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->inAnimation:Landroid/view/animation/Animation;

    return-object v0
.end method

.method public getLoadingMessageRes()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->loadingMessageRes:I

    return v0
.end method

.method public getLocationOffImageRes()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->locationOffImageRes:I

    return v0
.end method

.method public getLocationOffMessageRes()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->locationOffMessageRes:I

    return v0
.end method

.method public getOfflineImageRes()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->offlineImageRes:I

    return v0
.end method

.method public getOfflineMessageRes()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->offlineMessageRes:I

    return v0
.end method

.method public getOutAnimation()Landroid/view/animation/Animation;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->outAnimation:Landroid/view/animation/Animation;

    return-object v0
.end method

.method public getRetryMessageRes()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->retryMessageRes:I

    return v0
.end method

.method public isAnimationEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->animationEnabled:Z

    return v0
.end method

.method public setAnimationEnabled(Z)Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->animationEnabled:Z

    return-object p0
.end method

.method public setEmptyImageRes(I)Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->emptyImageRes:I

    return-object p0
.end method

.method public setEmptyMessageRes(I)Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->emptyMessageRes:I

    return-object p0
.end method

.method public setErrorImageRes(I)Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->errorImageRes:I

    return-object p0
.end method

.method public setErrorMessageRes(I)Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->errorMessageRes:I

    return-object p0
.end method

.method public setInAnimation(Landroid/view/animation/Animation;)Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->inAnimation:Landroid/view/animation/Animation;

    return-object p0
.end method

.method public setLoadingMessageRes(I)Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->loadingMessageRes:I

    return-object p0
.end method

.method public setLocationOffImageRes(I)Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->locationOffImageRes:I

    return-object p0
.end method

.method public setLocationOffMessageRes(I)Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->locationOffMessageRes:I

    return-object p0
.end method

.method public setOfflineImageRes(I)Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->offlineImageRes:I

    return-object p0
.end method

.method public setOfflineMessageRes(I)Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->offlineMessageRes:I

    return-object p0
.end method

.method public setOutAnimation(Landroid/view/animation/Animation;)Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->outAnimation:Landroid/view/animation/Animation;

    return-object p0
.end method

.method public setRetryMessageRes(I)Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->retryMessageRes:I

    return-object p0
.end method
