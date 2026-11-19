.class public Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final DEFAULT_TIMEOUT:I = 0x9c4


# instance fields
.field public align:Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

.field public cacheStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;

.field public error:Landroid/graphics/drawable/Drawable;

.field public height:I

.field public placeholder:Landroid/graphics/drawable/Drawable;

.field public timeoutMs:I

.field public width:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;->DEFAULT:Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->align:Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    const/16 v0, 0x9c4

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->timeoutMs:I

    return-void
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;->DEFAULT:Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->align:Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    const/16 v0, 0x9c4

    .line 10
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->timeoutMs:I

    .line 11
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->placeholder:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;->DEFAULT:Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->align:Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    const/16 v0, 0x9c4

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->timeoutMs:I

    .line 7
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->cacheStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;

    return-void
.end method

.method public static of(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;
    .locals 1

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;-><init>(Landroid/graphics/drawable/Drawable;)V

    return-object v0
.end method

.method public static of(Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;-><init>(Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)V

    return-object v0
.end method


# virtual methods
.method public getAlign()Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->align:Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    return-object v0
.end method

.method public getCacheStrategy()Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->cacheStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;

    return-object v0
.end method

.method public getError()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->error:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->height:I

    return v0
.end method

.method public getPlaceholder()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->placeholder:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getTimeoutMs()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->timeoutMs:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->width:I

    return v0
.end method

.method public hasSize()Z
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->width:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->height:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setAlign(Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;)Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->align:Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    return-object p0
.end method

.method public setCacheStrategy(Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;)Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->cacheStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;

    return-object p0
.end method

.method public setError(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->error:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public setPlaceholder(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->placeholder:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public setSize(II)Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->width:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->height:I

    return-object p0
.end method

.method public setTimeoutMs(I)Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->timeoutMs:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LoadOption{cacheStrategy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->cacheStrategy:Lcom/xuexiang/xui/widget/imageview/strategy/DiskCacheStrategyEnum;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", placeholder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->placeholder:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->width:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;->height:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
