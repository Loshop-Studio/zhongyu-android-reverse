.class public Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/view/ViewGroup;"
    }
.end annotation


# static fields
.field public static final BOTTOMCOLSPAN:I = 0x3

.field public static final LEFTROWSPAN:I = 0x4

.field public static final NOSPAN:I = 0x0

.field public static final STYLE_FILL:I = 0x1

.field public static final STYLE_GRID:I = 0x0

.field public static final TOPCOLSPAN:I = 0x2


# instance fields
.field private mAdapter:Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageViewAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageViewAdapter<",
            "TT;>;"
        }
    .end annotation
.end field

.field private mColumnCount:I

.field private mGap:I

.field private mGridSize:I

.field private mImageViewList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/widget/ImageView;",
            ">;"
        }
    .end annotation
.end field

.field private mImgDataList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field private mItemImageClickListener:Lcom/xuexiang/xui/widget/imageview/nine/ItemImageClickListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/xuexiang/xui/widget/imageview/nine/ItemImageClickListener<",
            "TT;>;"
        }
    .end annotation
.end field

.field private mItemImageLongClickListener:Lcom/xuexiang/xui/widget/imageview/nine/ItemImageLongClickListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/xuexiang/xui/widget/imageview/nine/ItemImageLongClickListener<",
            "TT;>;"
        }
    .end annotation
.end field

.field private mMaxSize:I

.field private mRowCount:I

.field private mShowStyle:I

.field private mSingleImgSize:I

.field private mSpanType:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mImageViewList:Ljava/util/List;

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mImgDataList:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;)Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageViewAdapter;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mAdapter:Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageViewAdapter;

    return-object p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;)Lcom/xuexiang/xui/widget/imageview/nine/ItemImageClickListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mItemImageClickListener:Lcom/xuexiang/xui/widget/imageview/nine/ItemImageClickListener;

    return-object p0
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;)Lcom/xuexiang/xui/widget/imageview/nine/ItemImageLongClickListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mItemImageLongClickListener:Lcom/xuexiang/xui/widget/imageview/nine/ItemImageLongClickListener;

    return-object p0
.end method

.method private generateUnitRowAndColumnForSpanType(I[I)V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-gt p1, v1, :cond_0

    .line 1
    aput v2, p2, v0

    .line 2
    aput p1, p2, v2

    goto :goto_1

    :cond_0
    const/4 v3, 0x4

    const/4 v4, 0x3

    if-ne p1, v4, :cond_2

    .line 3
    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mSpanType:I

    if-eq p1, v1, :cond_1

    if-eq p1, v4, :cond_1

    if-eq p1, v3, :cond_1

    .line 4
    aput v2, p2, v0

    .line 5
    aput v4, p2, v2

    goto :goto_1

    .line 6
    :cond_1
    aput v1, p2, v0

    .line 7
    aput v1, p2, v2

    goto :goto_1

    :cond_2
    const/4 v5, 0x6

    if-gt p1, v5, :cond_4

    .line 8
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mSpanType:I

    if-eq v5, v1, :cond_3

    if-eq v5, v4, :cond_3

    if-eq v5, v3, :cond_3

    .line 9
    aput v1, p2, v0

    .line 10
    div-int/lit8 v0, p1, 0x2

    rem-int/2addr p1, v1

    add-int/2addr v0, p1

    aput v0, p2, v2

    goto :goto_1

    .line 11
    :cond_3
    aput v4, p2, v0

    .line 12
    aput v4, p2, v2

    goto :goto_1

    .line 13
    :cond_4
    div-int/lit8 v1, p1, 0x3

    rem-int/2addr p1, v4

    if-nez p1, :cond_5

    const/4 p1, 0x0

    goto :goto_0

    :cond_5
    const/4 p1, 0x1

    :goto_0
    add-int/2addr v1, p1

    aput v1, p2, v0

    .line 14
    aput v4, p2, v2

    :goto_1
    return-void
.end method

.method private getImageView(I)Landroid/widget/ImageView;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mImageViewList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mImageViewList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    return-object p1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mAdapter:Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageViewAdapter;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageViewAdapter;->generateImageView(Landroid/content/Context;)Landroid/widget/ImageView;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mImageViewList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$1;

    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$1;-><init>(Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;I)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$2;

    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$2;-><init>(Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;I)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-object v0

    :cond_1
    const-string p1, "NineGirdImageView"

    const-string v0, "Your must set a NineGridImageViewAdapter for NineGirdImageView"

    .line 8
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method private getNeedShowCount(I)I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mMaxSize:I

    if-lez v0, :cond_0

    if-le p1, v0, :cond_0

    return v0

    :cond_0
    return p1
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->NineGridImageView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    sget p2, Lcom/xuexiang/xui/R$styleable;->NineGridImageView_ngiv_imgGap:I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    float-to-int p2, p2

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    .line 3
    sget p2, Lcom/xuexiang/xui/R$styleable;->NineGridImageView_ngiv_singleImgSize:I

    const/4 v0, -0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mSingleImgSize:I

    .line 4
    sget p2, Lcom/xuexiang/xui/R$styleable;->NineGridImageView_ngiv_showStyle:I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mShowStyle:I

    .line 5
    sget p2, Lcom/xuexiang/xui/R$styleable;->NineGridImageView_ngiv_maxSize:I

    const/16 v0, 0x9

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mMaxSize:I

    .line 6
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private layoutChildrenView()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mImgDataList:Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->getNeedShowCount(I)I

    move-result v0

    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mSpanType:I

    if-eqz v1, :cond_6

    const/4 v1, 0x2

    if-gt v0, v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x3

    if-eq v0, v1, :cond_5

    const/4 v1, 0x4

    if-eq v0, v1, :cond_4

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    const/4 v1, 0x6

    if-eq v0, v1, :cond_2

    .line 4
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->layoutForNoSpanChildrenView(I)V

    goto :goto_0

    .line 5
    :cond_2
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->layoutForSixChildrenView(I)V

    goto :goto_0

    .line 6
    :cond_3
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->layoutForFiveChildrenView(I)V

    goto :goto_0

    .line 7
    :cond_4
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->layoutForFourChildrenView(I)V

    goto :goto_0

    .line 8
    :cond_5
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->layoutForThreeChildrenView(I)V

    :goto_0
    return-void

    .line 9
    :cond_6
    :goto_1
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->layoutForNoSpanChildrenView(I)V

    return-void
.end method

.method private layoutForFiveChildrenView(I)V
    .locals 9

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_10

    .line 1
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 2
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mSpanType:I

    const/4 v3, 0x1

    const/4 v4, 0x3

    const/4 v5, 0x2

    if-eq v2, v5, :cond_a

    if-eq v2, v4, :cond_5

    const/4 v6, 0x4

    if-eq v2, v6, :cond_0

    goto/16 :goto_a

    :cond_0
    if-nez v0, :cond_1

    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 5
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v7, v6, 0x2

    add-int/2addr v7, v2

    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v7, v8

    mul-int/lit8 v6, v6, 0x3

    add-int/2addr v6, v8

    .line 6
    div-int/2addr v6, v5

    :goto_1
    add-int/2addr v6, v3

    goto :goto_3

    :cond_1
    if-ne v0, v3, :cond_2

    .line 7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    .line 8
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v7, v6, 0x3

    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v7, v8

    div-int/2addr v7, v5

    add-int/2addr v3, v7

    add-int/2addr v3, v8

    mul-int/lit8 v7, v6, 0x2

    add-int/2addr v7, v2

    add-int/2addr v7, v8

    mul-int/lit8 v6, v6, 0x3

    add-int/2addr v6, v8

    .line 9
    div-int/2addr v6, v5

    goto :goto_1

    :cond_2
    if-ne v0, v5, :cond_3

    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    .line 11
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 12
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    :goto_2
    add-int v7, v2, v4

    add-int v6, v3, v4

    goto :goto_3

    :cond_3
    if-ne v0, v4, :cond_4

    .line 13
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    .line 14
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v3, v4

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v3, v5

    goto :goto_2

    .line 15
    :cond_4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    .line 16
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v6, v4, 0x2

    add-int/2addr v3, v6

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    mul-int/lit8 v6, v6, 0x2

    add-int/2addr v3, v6

    goto :goto_2

    .line 17
    :goto_3
    invoke-virtual {v1, v2, v3, v7, v6}, Landroid/widget/ImageView;->layout(IIII)V

    goto/16 :goto_a

    :cond_5
    if-nez v0, :cond_6

    .line 18
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    .line 19
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 20
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    :goto_4
    add-int v5, v2, v4

    add-int/2addr v4, v3

    goto :goto_6

    :cond_6
    if-ne v0, v3, :cond_7

    .line 21
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v2, v3

    .line 22
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 23
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    goto :goto_4

    :cond_7
    if-ne v0, v5, :cond_8

    .line 24
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    .line 25
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 26
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    goto :goto_4

    :cond_8
    if-ne v0, v4, :cond_9

    .line 27
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    .line 28
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v3, v4

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v3, v6

    mul-int/lit8 v7, v4, 0x3

    add-int/2addr v7, v6

    .line 29
    div-int/2addr v7, v5

    goto :goto_5

    .line 30
    :cond_9
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v3, v3, 0x3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v3, v4

    div-int/2addr v3, v5

    add-int/2addr v2, v3

    add-int/2addr v2, v4

    .line 31
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v3, v4

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v3, v6

    mul-int/lit8 v7, v4, 0x3

    add-int/2addr v7, v6

    .line 32
    div-int/2addr v7, v5

    :goto_5
    add-int/2addr v7, v2

    mul-int/lit8 v4, v4, 0x2

    add-int/2addr v4, v3

    add-int/2addr v4, v6

    move v5, v7

    .line 33
    :goto_6
    invoke-virtual {v1, v2, v3, v5, v4}, Landroid/widget/ImageView;->layout(IIII)V

    goto/16 :goto_a

    :cond_a
    if-nez v0, :cond_b

    .line 34
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    .line 35
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 36
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v6, v4, 0x3

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v6, v7

    div-int/2addr v6, v5

    :goto_7
    add-int/2addr v6, v2

    mul-int/lit8 v4, v4, 0x2

    add-int/2addr v4, v3

    add-int/2addr v4, v7

    goto :goto_9

    :cond_b
    if-ne v0, v3, :cond_c

    .line 37
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v3, v3, 0x3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v3, v4

    div-int/2addr v3, v5

    add-int/2addr v2, v3

    add-int/2addr v2, v4

    .line 38
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 39
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v6, v4, 0x3

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v6, v7

    div-int/2addr v6, v5

    goto :goto_7

    :cond_c
    if-ne v0, v5, :cond_d

    .line 40
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    .line 41
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v6, v4, 0x2

    add-int/2addr v3, v6

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    :goto_8
    mul-int/lit8 v6, v6, 0x2

    add-int/2addr v3, v6

    add-int v6, v2, v4

    add-int/2addr v4, v3

    goto :goto_9

    :cond_d
    if-ne v0, v4, :cond_e

    .line 42
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v2, v3

    .line 43
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v6, v4, 0x2

    add-int/2addr v3, v6

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    goto :goto_8

    .line 44
    :cond_e
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    .line 45
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v6, v4, 0x2

    add-int/2addr v3, v6

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    goto :goto_8

    .line 46
    :goto_9
    invoke-virtual {v1, v2, v3, v6, v4}, Landroid/widget/ImageView;->layout(IIII)V

    .line 47
    :goto_a
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mAdapter:Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageViewAdapter;

    if-eqz v2, :cond_f

    .line 48
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mImgDataList:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v1, v4}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageViewAdapter;->onDisplayImage(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/Object;)V

    :cond_f
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_10
    return-void
.end method

.method private layoutForFourChildrenView(I)V
    .locals 9

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_d

    .line 1
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 2
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mSpanType:I

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq v2, v4, :cond_8

    const/4 v5, 0x3

    if-eq v2, v5, :cond_4

    const/4 v6, 0x4

    if-eq v2, v6, :cond_0

    goto/16 :goto_7

    :cond_0
    if-nez v0, :cond_1

    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 5
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v7, v6, 0x2

    add-int/2addr v7, v2

    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v7, v8

    mul-int/lit8 v6, v6, 0x3

    add-int/2addr v6, v3

    mul-int/lit8 v8, v8, 0x2

    add-int/2addr v6, v8

    goto :goto_2

    :cond_1
    if-ne v0, v3, :cond_2

    .line 6
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    .line 7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 8
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    :goto_1
    add-int v7, v2, v4

    add-int v6, v3, v4

    goto :goto_2

    :cond_2
    if-ne v0, v4, :cond_3

    .line 9
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v3, v4

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v3, v5

    goto :goto_1

    .line 11
    :cond_3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    .line 12
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v6, v5, 0x2

    add-int/2addr v3, v6

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    mul-int/lit8 v6, v6, 0x2

    add-int/2addr v3, v6

    add-int v7, v2, v5

    add-int v6, v3, v5

    .line 13
    :goto_2
    invoke-virtual {v1, v2, v3, v7, v6}, Landroid/widget/ImageView;->layout(IIII)V

    goto/16 :goto_7

    :cond_4
    if-nez v0, :cond_5

    .line 14
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    .line 15
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 16
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    :goto_3
    add-int v5, v2, v4

    add-int/2addr v4, v3

    goto :goto_4

    :cond_5
    if-ne v0, v3, :cond_6

    .line 17
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v2, v3

    .line 18
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 19
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    goto :goto_3

    :cond_6
    if-ne v0, v4, :cond_7

    .line 20
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    .line 21
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 22
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    goto :goto_3

    .line 23
    :cond_7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    .line 24
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v3, v5

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v3, v6

    mul-int/lit8 v7, v5, 0x3

    add-int/2addr v7, v2

    mul-int/lit8 v8, v6, 0x2

    add-int/2addr v7, v8

    mul-int/lit8 v5, v5, 0x2

    add-int/2addr v5, v3

    add-int v4, v5, v6

    move v5, v7

    .line 25
    :goto_4
    invoke-virtual {v1, v2, v3, v5, v4}, Landroid/widget/ImageView;->layout(IIII)V

    goto :goto_7

    :cond_8
    if-nez v0, :cond_9

    .line 26
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    .line 27
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 28
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v6, v5, 0x3

    add-int/2addr v6, v2

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    mul-int/lit8 v8, v7, 0x2

    add-int/2addr v6, v8

    mul-int/lit8 v5, v5, 0x2

    add-int/2addr v5, v3

    add-int/2addr v5, v7

    goto :goto_6

    :cond_9
    if-ne v0, v3, :cond_a

    .line 29
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    .line 30
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v6, v5, 0x2

    add-int/2addr v3, v6

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    :goto_5
    mul-int/lit8 v6, v6, 0x2

    add-int/2addr v3, v6

    add-int v6, v2, v5

    add-int/2addr v5, v3

    goto :goto_6

    :cond_a
    if-ne v0, v4, :cond_b

    .line 31
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v2, v3

    .line 32
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v6, v5, 0x2

    add-int/2addr v3, v6

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    goto :goto_5

    .line 33
    :cond_b
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    .line 34
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v6, v5, 0x2

    add-int/2addr v3, v6

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    goto :goto_5

    .line 35
    :goto_6
    invoke-virtual {v1, v2, v3, v6, v5}, Landroid/widget/ImageView;->layout(IIII)V

    .line 36
    :goto_7
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mAdapter:Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageViewAdapter;

    if-eqz v2, :cond_c

    .line 37
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mImgDataList:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v1, v4}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageViewAdapter;->onDisplayImage(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/Object;)V

    :cond_c
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_d
    return-void
.end method

.method private layoutForNoSpanChildrenView(I)V
    .locals 6

    if-gtz p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_2

    .line 1
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 2
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mColumnCount:I

    div-int v3, v0, v2

    .line 3
    rem-int v2, v0, v2

    .line 4
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v4, v5

    mul-int v4, v4, v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    add-int/2addr v4, v2

    .line 5
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v2, v5

    mul-int v2, v2, v3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    add-int/2addr v2, v3

    .line 6
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int v5, v4, v3

    add-int/2addr v3, v2

    .line 7
    invoke-virtual {v1, v4, v2, v5, v3}, Landroid/widget/ImageView;->layout(IIII)V

    .line 8
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mAdapter:Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageViewAdapter;

    if-eqz v2, :cond_1

    .line 9
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mImgDataList:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v1, v4}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageViewAdapter;->onDisplayImage(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/Object;)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private layoutForSixChildrenView(I)V
    .locals 8

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_13

    .line 1
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 2
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mSpanType:I

    const/4 v3, 0x1

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    if-eq v2, v6, :cond_c

    if-eq v2, v5, :cond_6

    if-eq v2, v4, :cond_0

    goto/16 :goto_c

    :cond_0
    if-nez v0, :cond_1

    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 5
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    :goto_1
    add-int v5, v2, v4

    add-int/2addr v4, v3

    goto/16 :goto_4

    :cond_1
    if-ne v0, v3, :cond_2

    .line 6
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v2, v3

    .line 7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 8
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v5, v4, 0x2

    add-int/2addr v5, v2

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v5, v7

    mul-int/lit8 v4, v4, 0x2

    add-int/2addr v4, v3

    add-int/2addr v4, v7

    goto :goto_4

    :cond_2
    if-ne v0, v6, :cond_3

    .line 9
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v3, v4

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    :goto_2
    add-int/2addr v3, v5

    goto :goto_1

    :cond_3
    if-ne v0, v5, :cond_4

    .line 11
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    .line 12
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v5, v4, 0x2

    add-int/2addr v3, v5

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    :goto_3
    mul-int/lit8 v5, v5, 0x2

    goto :goto_2

    :cond_4
    if-ne v0, v4, :cond_5

    .line 13
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v2, v3

    .line 14
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v5, v4, 0x2

    add-int/2addr v3, v5

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    goto :goto_3

    .line 15
    :cond_5
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    .line 16
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v5, v4, 0x2

    add-int/2addr v3, v5

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    goto :goto_3

    .line 17
    :goto_4
    invoke-virtual {v1, v2, v3, v5, v4}, Landroid/widget/ImageView;->layout(IIII)V

    goto/16 :goto_c

    :cond_6
    if-nez v0, :cond_7

    .line 18
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    .line 19
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 20
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    :goto_5
    add-int v5, v2, v4

    add-int/2addr v4, v3

    goto/16 :goto_7

    :cond_7
    if-ne v0, v3, :cond_8

    .line 21
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v2, v3

    .line 22
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 23
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    goto :goto_5

    :cond_8
    if-ne v0, v6, :cond_9

    .line 24
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    .line 25
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 26
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    goto :goto_5

    :cond_9
    if-ne v0, v5, :cond_a

    .line 27
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    .line 28
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v3, v4

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v3, v5

    mul-int/lit8 v7, v4, 0x2

    add-int/2addr v7, v2

    add-int/2addr v7, v5

    mul-int/lit8 v4, v4, 0x2

    add-int/2addr v4, v3

    add-int/2addr v4, v5

    move v5, v7

    goto :goto_7

    :cond_a
    if-ne v0, v4, :cond_b

    .line 29
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    .line 30
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v3, v4

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    goto :goto_6

    .line 31
    :cond_b
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    .line 32
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v5, v4, 0x2

    add-int/2addr v3, v5

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    mul-int/lit8 v5, v5, 0x2

    :goto_6
    add-int/2addr v3, v5

    goto :goto_5

    .line 33
    :goto_7
    invoke-virtual {v1, v2, v3, v5, v4}, Landroid/widget/ImageView;->layout(IIII)V

    goto/16 :goto_c

    :cond_c
    if-nez v0, :cond_d

    .line 34
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    .line 35
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 36
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v5, v4, 0x2

    add-int/2addr v5, v2

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v5, v7

    mul-int/lit8 v4, v4, 0x2

    add-int/2addr v4, v3

    add-int/2addr v4, v7

    goto/16 :goto_b

    :cond_d
    if-ne v0, v3, :cond_e

    .line 37
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    .line 38
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 39
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    :goto_8
    add-int v5, v2, v4

    add-int/2addr v4, v3

    goto :goto_b

    :cond_e
    if-ne v0, v6, :cond_f

    .line 40
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    .line 41
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v3, v4

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    :goto_9
    add-int/2addr v3, v5

    goto :goto_8

    :cond_f
    if-ne v0, v5, :cond_10

    .line 42
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    .line 43
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v5, v4, 0x2

    add-int/2addr v3, v5

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    :goto_a
    mul-int/lit8 v5, v5, 0x2

    goto :goto_9

    :cond_10
    if-ne v0, v4, :cond_11

    .line 44
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v2, v3

    .line 45
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v5, v4, 0x2

    add-int/2addr v3, v5

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    goto :goto_a

    .line 46
    :cond_11
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    .line 47
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v5, v4, 0x2

    add-int/2addr v3, v5

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    goto :goto_a

    .line 48
    :goto_b
    invoke-virtual {v1, v2, v3, v5, v4}, Landroid/widget/ImageView;->layout(IIII)V

    .line 49
    :goto_c
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mAdapter:Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageViewAdapter;

    if-eqz v2, :cond_12

    .line 50
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mImgDataList:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v1, v4}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageViewAdapter;->onDisplayImage(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/Object;)V

    :cond_12
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_13
    return-void
.end method

.method private layoutForThreeChildrenView(I)V
    .locals 7

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_a

    .line 1
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 2
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mSpanType:I

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq v2, v4, :cond_6

    const/4 v5, 0x3

    if-eq v2, v5, :cond_3

    const/4 v5, 0x4

    if-eq v2, v5, :cond_0

    goto/16 :goto_9

    :cond_0
    if-nez v0, :cond_1

    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 5
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int v6, v2, v5

    mul-int/lit8 v5, v5, 0x2

    add-int/2addr v5, v3

    .line 6
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v5, v4

    goto :goto_2

    :cond_1
    if-ne v0, v3, :cond_2

    .line 7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v2, v3

    .line 8
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 9
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    goto :goto_1

    .line 10
    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v2, v3

    .line 11
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v3, v4

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v3, v5

    :goto_1
    add-int v6, v2, v4

    add-int v5, v3, v4

    .line 12
    :goto_2
    invoke-virtual {v1, v2, v3, v6, v5}, Landroid/widget/ImageView;->layout(IIII)V

    goto/16 :goto_9

    :cond_3
    if-nez v0, :cond_4

    .line 13
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    .line 14
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 15
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    :goto_3
    add-int v5, v2, v4

    :goto_4
    add-int/2addr v4, v3

    goto :goto_5

    :cond_4
    if-ne v0, v3, :cond_5

    .line 16
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v2, v3

    .line 17
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 18
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    goto :goto_3

    .line 19
    :cond_5
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    .line 20
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v3, v4

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v3, v5

    mul-int/lit8 v6, v4, 0x2

    add-int/2addr v6, v2

    add-int/2addr v5, v6

    goto :goto_4

    .line 21
    :goto_5
    invoke-virtual {v1, v2, v3, v5, v4}, Landroid/widget/ImageView;->layout(IIII)V

    goto :goto_9

    :cond_6
    if-nez v0, :cond_7

    .line 22
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    .line 23
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    .line 24
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    mul-int/lit8 v5, v4, 0x2

    add-int/2addr v5, v2

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v5, v6

    :goto_6
    add-int/2addr v4, v3

    goto :goto_8

    :cond_7
    if-ne v0, v3, :cond_8

    .line 25
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    .line 26
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v3, v4

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    goto :goto_7

    .line 27
    :cond_8
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    add-int/2addr v2, v3

    .line 28
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    add-int/2addr v3, v4

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    :goto_7
    add-int/2addr v3, v5

    add-int v5, v2, v4

    goto :goto_6

    .line 29
    :goto_8
    invoke-virtual {v1, v2, v3, v5, v4}, Landroid/widget/ImageView;->layout(IIII)V

    .line 30
    :goto_9
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mAdapter:Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageViewAdapter;

    if-eqz v2, :cond_9

    .line 31
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mImgDataList:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v1, v4}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageViewAdapter;->onDisplayImage(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/Object;)V

    :cond_9
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_a
    return-void
.end method


# virtual methods
.method protected calculateGridParam(II)[I
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x1

    if-eq p2, v1, :cond_1

    .line 1
    div-int/lit8 p2, p1, 0x3

    const/4 v2, 0x3

    rem-int/2addr p1, v2

    const/4 v3, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    add-int/2addr p2, p1

    aput p2, v0, v3

    aput v2, v0, v1

    goto :goto_1

    .line 2
    :cond_1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->generateUnitRowAndColumnForSpanType(I[I)V

    :goto_1
    return-object v0
.end method

.method public getImgDataItem(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mImgDataList:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mImgDataList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->layoutChildrenView()V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 4

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onMeasure(II)V

    .line 2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 3
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v0

    sub-int v0, p1, v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mImgDataList:Ljava/util/List;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 6
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mImgDataList:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    const/4 v1, 0x1

    if-ne p2, v1, :cond_0

    iget p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mSingleImgSize:I

    const/4 v2, -0x1

    if-eq p2, v2, :cond_0

    .line 7
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    goto :goto_0

    .line 8
    :cond_0
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mImageViewList:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p2, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 9
    iget p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mColumnCount:I

    add-int/lit8 v3, v2, -0x1

    mul-int p2, p2, v3

    sub-int/2addr v0, p2

    div-int/2addr v0, v2

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    .line 10
    :goto_0
    iget p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGridSize:I

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mRowCount:I

    mul-int p2, p2, v0

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    sub-int/2addr v0, v1

    mul-int v2, v2, v0

    add-int/2addr p2, v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v0

    add-int/2addr p2, v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v0

    add-int/2addr p2, v0

    .line 11
    :cond_1
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void
.end method

.method public setAdapter(Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageViewAdapter;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mAdapter:Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageViewAdapter;

    return-void
.end method

.method public setGap(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mGap:I

    return-void
.end method

.method public setImagesData(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->setImagesData(Ljava/util/List;I)V

    return-void
.end method

.method public setImagesData(Ljava/util/List;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;I)V"
        }
    .end annotation

    if-eqz p1, :cond_6

    .line 2
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    :cond_0
    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 4
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mSpanType:I

    .line 5
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->getNeedShowCount(I)I

    move-result p2

    .line 6
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mShowStyle:I

    invoke-virtual {p0, p2, v1}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->calculateGridParam(II)[I

    move-result-object v1

    .line 7
    aget v2, v1, v0

    iput v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mRowCount:I

    const/4 v2, 0x1

    .line 8
    aget v1, v1, v2

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mColumnCount:I

    .line 9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mImgDataList:Ljava/util/List;

    if-nez v1, :cond_2

    :goto_0
    if-ge v0, p2, :cond_5

    .line 10
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    .line 11
    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 12
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->getNeedShowCount(I)I

    move-result v0

    if-le v0, p2, :cond_3

    sub-int/2addr v0, p2

    .line 13
    invoke-virtual {p0, p2, v0}, Landroid/view/ViewGroup;->removeViews(II)V

    goto :goto_2

    :cond_3
    if-ge v0, p2, :cond_5

    :goto_1
    if-ge v0, p2, :cond_5

    .line 14
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v1

    if-nez v1, :cond_4

    return-void

    .line 15
    :cond_4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 16
    :cond_5
    :goto_2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mImgDataList:Ljava/util/List;

    .line 17
    invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V

    return-void

    :cond_6
    :goto_3
    const/16 p1, 0x8

    .line 18
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method public setItemImageClickListener(Lcom/xuexiang/xui/widget/imageview/nine/ItemImageClickListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/xuexiang/xui/widget/imageview/nine/ItemImageClickListener<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mItemImageClickListener:Lcom/xuexiang/xui/widget/imageview/nine/ItemImageClickListener;

    return-void
.end method

.method public setItemImageLongClickListener(Lcom/xuexiang/xui/widget/imageview/nine/ItemImageLongClickListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/xuexiang/xui/widget/imageview/nine/ItemImageLongClickListener<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mItemImageLongClickListener:Lcom/xuexiang/xui/widget/imageview/nine/ItemImageLongClickListener;

    return-void
.end method

.method public setMaxSize(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mMaxSize:I

    return-void
.end method

.method public setShowStyle(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mShowStyle:I

    return-void
.end method

.method public setSingleImgSize(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->mSingleImgSize:I

    return-void
.end method
