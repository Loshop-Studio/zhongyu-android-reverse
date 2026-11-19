.class public Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TIME_PLACE_HOLDER:Ljava/lang/String; = "$"


# instance fields
.field private mEffectiveInternal:I

.field private mID:Ljava/lang/String;

.field private final mMessage:Ljava/lang/String;

.field private mTime:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->mMessage:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JI)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->mID:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->mMessage:Ljava/lang/String;

    .line 6
    iput-wide p3, p0, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->mTime:J

    .line 7
    iput p5, p0, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->mEffectiveInternal:I

    return-void
.end method

.method private updateMessage()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->isValid()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->mTime:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->mMessage:Ljava/lang/String;

    const-string v1, "$"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-wide v2, p0, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->mTime:J

    invoke-virtual {p0, v2, v3}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->calculateNumberOfMinutes(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->mMessage:Ljava/lang/String;

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->mMessage:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public calculateNumberOfMinutes(J)I
    .locals 2

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->getCurrentDate()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    sub-long/2addr v0, p1

    const-wide/32 p1, 0xea60

    div-long/2addr v0, p1

    long-to-int p1, v0

    return p1
.end method

.method public getCurrentDate()Ljava/util/Date;
    .locals 3

    new-instance v0, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    return-object v0
.end method

.method public getEffectiveInternal()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->mEffectiveInternal:I

    return v0
.end method

.method public getID()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->mID:Ljava/lang/String;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->mMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getTime()J
    .locals 2

    iget-wide v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->mTime:J

    return-wide v0
.end method

.method public isValid()Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->mMessage:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public setEffectiveInternal(I)Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->mEffectiveInternal:I

    return-object p0
.end method

.method public setID(Ljava/lang/String;)Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->mID:Ljava/lang/String;

    return-object p0
.end method

.method public setTime(J)Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;
    .locals 0

    iput-wide p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->mTime:J

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->updateMessage()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
