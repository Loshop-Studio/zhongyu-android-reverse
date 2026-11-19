.class public Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mAllowEmptyInput:Z

.field private mHint:Ljava/lang/String;

.field private mInputType:I

.field private mPreFill:Ljava/lang/String;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mInputType:I

    const-string p1, ""

    .line 3
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mHint:Ljava/lang/String;

    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mPreFill:Ljava/lang/String;

    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mAllowEmptyInput:Z

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput p1, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mInputType:I

    .line 8
    iput-object p2, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mHint:Ljava/lang/String;

    const-string p1, ""

    .line 9
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mPreFill:Ljava/lang/String;

    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mAllowEmptyInput:Z

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput p1, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mInputType:I

    .line 13
    iput-object p2, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mHint:Ljava/lang/String;

    .line 14
    iput-object p3, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mPreFill:Ljava/lang/String;

    .line 15
    iput-boolean p4, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mAllowEmptyInput:Z

    return-void
.end method


# virtual methods
.method public getHint()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mHint:Ljava/lang/String;

    return-object v0
.end method

.method public getInputType()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mInputType:I

    return v0
.end method

.method public getPreFill()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mPreFill:Ljava/lang/String;

    return-object v0
.end method

.method public isAllowEmptyInput()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mAllowEmptyInput:Z

    return v0
.end method

.method public setAllowEmptyInput(Z)Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mAllowEmptyInput:Z

    return-object p0
.end method

.method public setHint(Ljava/lang/String;)Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mHint:Ljava/lang/String;

    return-object p0
.end method

.method public setInputType(I)Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mInputType:I

    return-object p0
.end method

.method public setPreFill(Ljava/lang/String;)Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mPreFill:Ljava/lang/String;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "InputInfo{mInputType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mInputType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHint=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mHint:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", mPreFill=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mPreFill:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", mAllowEmptyInput="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->mAllowEmptyInput:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
