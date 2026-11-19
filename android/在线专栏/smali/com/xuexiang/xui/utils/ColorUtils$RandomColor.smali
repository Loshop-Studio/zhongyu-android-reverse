.class public Lcom/xuexiang/xui/utils/ColorUtils$RandomColor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/utils/ColorUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RandomColor"
.end annotation


# instance fields
.field alpha:I

.field lower:I

.field upper:I


# direct methods
.method constructor <init>(III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-le p3, p2, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/utils/ColorUtils$RandomColor;->setAlpha(I)V

    .line 3
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/utils/ColorUtils$RandomColor;->setLower(I)V

    .line 4
    invoke-virtual {p0, p3}, Lcom/xuexiang/xui/utils/ColorUtils$RandomColor;->setUpper(I)V

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "must be lower < upper"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public getAlpha()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/utils/ColorUtils$RandomColor;->alpha:I

    return v0
.end method

.method public getColor()I
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/ColorUtils$RandomColor;->getLower()I

    move-result v0

    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/ColorUtils$RandomColor;->getUpper()I

    move-result v2

    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/ColorUtils$RandomColor;->getLower()I

    move-result v3

    sub-int/2addr v2, v3

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/ColorUtils$RandomColor;->getLower()I

    move-result v1

    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/ColorUtils$RandomColor;->getUpper()I

    move-result v3

    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/ColorUtils$RandomColor;->getLower()I

    move-result v4

    sub-int/2addr v3, v4

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v2, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    add-int/2addr v1, v2

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/ColorUtils$RandomColor;->getLower()I

    move-result v2

    new-instance v3, Ljava/util/Random;

    invoke-direct {v3}, Ljava/util/Random;-><init>()V

    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/ColorUtils$RandomColor;->getUpper()I

    move-result v4

    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/ColorUtils$RandomColor;->getLower()I

    move-result v5

    sub-int/2addr v4, v5

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    add-int/2addr v2, v3

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/ColorUtils$RandomColor;->getAlpha()I

    move-result v3

    invoke-static {v3, v0, v1, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0
.end method

.method getLower()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/utils/ColorUtils$RandomColor;->lower:I

    return v0
.end method

.method getUpper()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/utils/ColorUtils$RandomColor;->upper:I

    return v0
.end method

.method public setAlpha(I)V
    .locals 1

    const/16 v0, 0xff

    if-le p1, v0, :cond_0

    const/16 p1, 0xff

    :cond_0
    if-gez p1, :cond_1

    const/4 p1, 0x0

    :cond_1
    iput p1, p0, Lcom/xuexiang/xui/utils/ColorUtils$RandomColor;->alpha:I

    return-void
.end method

.method setLower(I)V
    .locals 0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/utils/ColorUtils$RandomColor;->lower:I

    return-void
.end method

.method setUpper(I)V
    .locals 1

    const/16 v0, 0xff

    if-le p1, v0, :cond_0

    const/16 p1, 0xff

    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/utils/ColorUtils$RandomColor;->upper:I

    return-void
.end method
