.class public Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;


# instance fields
.field private mMaxValue:I

.field private mMinValue:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;->mMinValue:I

    .line 3
    iput p2, p0, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;->mMaxValue:I

    return-void
.end method


# virtual methods
.method public getItem(I)Ljava/lang/Object;
    .locals 1

    if-ltz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;->getItemsCount()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;->mMinValue:I

    add-int/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public getItemsCount()I
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;->mMaxValue:I

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;->mMinValue:I

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 1

    :try_start_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;->mMinValue:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sub-int/2addr p1, v0

    return p1

    :catch_0
    const/4 p1, -0x1

    return p1
.end method
