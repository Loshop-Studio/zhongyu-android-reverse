.class public Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$AdapterDataSetObserver;,
        Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$OnTagSelectListener;,
        Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$OnTagClickListener;,
        Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$OnInitSelectedPosition;
    }
.end annotation


# static fields
.field public static final FLOW_TAG_CHECKED_MULTI:I = 0x2

.field public static final FLOW_TAG_CHECKED_NONE:I = 0x0

.field public static final FLOW_TAG_CHECKED_SINGLE:I = 0x1

.field public static final FLOW_TAG_DISPLAY:I = 0x3


# instance fields
.field mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

.field private mCheckedTagArray:Landroid/util/SparseBooleanArray;

.field mDataSetObserver:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$AdapterDataSetObserver;

.field mOnTagClickListener:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$OnTagClickListener;

.field mOnTagSelectListener:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$OnTagSelectListener;

.field private mSingleCancelable:Z

.field private mTagCheckMode:I

.field private mWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mTagCheckMode:I

    .line 3
    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mCheckedTagArray:Landroid/util/SparseBooleanArray;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 4
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mTagCheckMode:I

    .line 6
    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mCheckedTagArray:Landroid/util/SparseBooleanArray;

    .line 7
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x0

    .line 9
    iput p3, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mTagCheckMode:I

    .line 10
    new-instance p3, Landroid/util/SparseBooleanArray;

    invoke-direct {p3}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mCheckedTagArray:Landroid/util/SparseBooleanArray;

    .line 11
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mTagCheckMode:I

    return p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)Landroid/util/SparseBooleanArray;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mCheckedTagArray:Landroid/util/SparseBooleanArray;

    return-object p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mSingleCancelable:Z

    return p0
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->setSelectedIndexs(Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)V
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->reloadData()V

    return-void
.end method

.method private getSelectedPositions(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava/util/List<",
            "TT;>;)",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->isListEmpty(Ljava/util/List;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->isListEmpty(Ljava/util/List;)Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 3
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    const/4 v3, 0x0

    .line 4
    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_1

    .line 5
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 6
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->FlowTagLayout:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    sget p2, Lcom/xuexiang/xui/R$styleable;->FlowTagLayout_ftl_check_mode:I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mTagCheckMode:I

    .line 3
    sget p2, Lcom/xuexiang/xui/R$styleable;->FlowTagLayout_ftl_single_cancelable:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mSingleCancelable:Z

    .line 4
    sget p2, Lcom/xuexiang/xui/R$styleable;->FlowTagLayout_ftl_entries:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    if-eqz p2, :cond_0

    .line 5
    invoke-static {p2}, Lcom/xuexiang/xui/utils/ResUtils;->getStringArray(I)[Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->setItems([Ljava/lang/Object;)Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    move-result-object p2

    .line 6
    sget v1, Lcom/xuexiang/xui/R$styleable;->FlowTagLayout_ftl_selecteds:I

    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    invoke-static {v0}, Lcom/xuexiang/xui/utils/ResUtils;->getIntArray(I)[I

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;->setSelectedPositions([I)Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    .line 8
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private isListEmpty(Ljava/util/List;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;)Z"
        }
    .end annotation

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private isRtl()Z
    .locals 2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private reloadData()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 2
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mWidth:I

    if-eqz v1, :cond_0

    .line 4
    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 5
    :goto_0
    iget-object v4, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    invoke-virtual {v4}, Lcom/xuexiang/xui/adapter/listview/XListAdapter;->getCount()I

    move-result v4

    if-ge v2, v4, :cond_4

    .line 6
    iget-object v4, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mCheckedTagArray:Landroid/util/SparseBooleanArray;

    invoke-virtual {v4, v2, v1}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 7
    iget-object v4, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    const/4 v5, 0x0

    invoke-virtual {v4, v2, v5, p0}, Lcom/xuexiang/xui/adapter/listview/BaseListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 8
    invoke-virtual {p0, v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 9
    iget-object v6, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    instance-of v7, v6, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$OnInitSelectedPosition;

    const/4 v8, 0x1

    if-eqz v7, :cond_3

    .line 10
    invoke-virtual {v6, v2}, Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;->isSelectedPosition(I)Z

    move-result v6

    .line 11
    iget v7, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mTagCheckMode:I

    if-ne v7, v8, :cond_1

    if-eqz v6, :cond_3

    if-nez v3, :cond_3

    .line 12
    iget-object v3, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mCheckedTagArray:Landroid/util/SparseBooleanArray;

    invoke-virtual {v3, v2, v8}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 13
    invoke-virtual {v4, v8}, Landroid/view/View;->setSelected(Z)V

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v9, 0x2

    if-ne v7, v9, :cond_2

    if-eqz v6, :cond_3

    .line 14
    iget-object v6, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mCheckedTagArray:Landroid/util/SparseBooleanArray;

    invoke-virtual {v6, v2, v8}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 15
    invoke-virtual {v4, v8}, Landroid/view/View;->setSelected(Z)V

    goto :goto_1

    :cond_2
    const/4 v6, 0x3

    if-ne v7, v6, :cond_3

    .line 16
    iget-object v6, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mCheckedTagArray:Landroid/util/SparseBooleanArray;

    invoke-virtual {v6, v2, v8}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 17
    invoke-virtual {v4, v8}, Landroid/view/View;->setSelected(Z)V

    .line 18
    invoke-virtual {v4, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 19
    :cond_3
    :goto_1
    invoke-direct {p0, v5}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->setSelectedIndexs(Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 20
    invoke-direct {p0, v2, v4}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->setChildViewClickListener(ILandroid/view/View;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method private setChildViewClickListener(ILandroid/view/View;)V
    .locals 1

    new-instance v0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;

    invoke-direct {v0, p0, p2, p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;-><init>(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;Landroid/view/View;I)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private setSelectedIndexs(Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;->setSelectedIndexs(Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    :cond_0
    return-object p0
.end method


# virtual methods
.method public addTag(Ljava/lang/Object;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;->addTag(Ljava/lang/Object;)V

    :cond_0
    return-object p0
.end method

.method public addTags(Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;)",
            "Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;->addTags(Ljava/util/List;)V

    :cond_0
    return-object p0
.end method

.method public addTags([Ljava/lang/Object;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;->addTags([Ljava/lang/Object;)V

    :cond_0
    return-object p0
.end method

.method public clearAndAddTags(Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;)",
            "Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;->clearAndAddTags(Ljava/util/List;)V

    :cond_0
    return-object p0
.end method

.method public clearSelection()Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mTagCheckMode:I

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;->clearSelection()Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    :cond_0
    return-object p0
.end method

.method public clearTags()Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/adapter/listview/XListAdapter;->clearData()V

    :cond_0
    return-object p0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public getAdapter()Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    return-object v0
.end method

.method public getSelectedIndex()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;->getSelectedIndex()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public getSelectedIndexs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;->getSelectedIndexs()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSelectedItem()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()TT;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getTagCheckMode()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mTagCheckMode:I

    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result p1

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingStart()I

    move-result p2

    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result p3

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p4

    const/4 p5, 0x0

    :goto_0
    if-ge p5, p4, :cond_3

    .line 5
    invoke-virtual {p0, p5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    goto :goto_2

    .line 7
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 10
    iget v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v4, v1

    iget v5, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v4, v5

    .line 11
    iget v5, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v5, v2

    iget v6, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v5, v6

    add-int v6, p2, v4

    .line 12
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v7

    sub-int v7, p1, v7

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v8

    sub-int/2addr v7, v8

    if-le v6, v7, :cond_1

    add-int/2addr p3, v5

    .line 13
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingStart()I

    move-result p2

    .line 14
    :cond_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->isRtl()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 15
    invoke-virtual {v3}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    move-result v5

    add-int/2addr v5, p2

    sub-int v5, p1, v5

    .line 16
    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v3, p3

    sub-int v1, v5, v1

    add-int/2addr v2, v3

    .line 17
    invoke-virtual {v0, v1, v3, v5, v2}, Landroid/view/View;->layout(IIII)V

    goto :goto_1

    .line 18
    :cond_2
    invoke-virtual {v3}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    move-result v5

    add-int/2addr v5, p2

    .line 19
    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v3, p3

    add-int/2addr v1, v5

    add-int/2addr v2, v3

    .line 20
    invoke-virtual {v0, v5, v3, v1, v2}, Landroid/view/View;->layout(IIII)V

    :goto_1
    add-int/2addr p2, v4

    :goto_2
    add-int/lit8 p5, p5, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method protected onMeasure(II)V
    .locals 18

    move-object/from16 v0, p0

    .line 1
    invoke-super/range {p0 .. p2}, Landroid/view/ViewGroup;->onMeasure(II)V

    .line 2
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 3
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    .line 4
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    .line 5
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    .line 6
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_0
    if-ge v6, v5, :cond_2

    .line 7
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    move/from16 v12, p1

    move/from16 v13, p2

    .line 8
    invoke-virtual {v0, v11, v12, v13}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 9
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v14

    .line 10
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    move-result v15

    .line 11
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, Landroid/view/ViewGroup$MarginLayoutParams;

    move/from16 v16, v2

    .line 12
    iget v2, v11, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v14, v2

    iget v2, v11, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v14, v2

    .line 13
    iget v2, v11, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v15, v2

    iget v2, v11, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v15, v2

    add-int v2, v7, v14

    .line 14
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v11

    sub-int v11, v1, v11

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v17

    sub-int v11, v11, v17

    if-le v2, v11, :cond_0

    .line 15
    invoke-static {v7, v14}, Ljava/lang/Math;->max(II)I

    move-result v8

    add-int/2addr v10, v15

    move v7, v14

    move v9, v15

    goto :goto_1

    .line 16
    :cond_0
    invoke-static {v9, v15}, Ljava/lang/Math;->max(II)I

    move-result v7

    move v9, v7

    move v7, v2

    :goto_1
    add-int/lit8 v2, v5, -0x1

    if-ne v6, v2, :cond_1

    .line 17
    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/2addr v10, v9

    move v8, v2

    :cond_1
    add-int/lit8 v6, v6, 0x1

    move/from16 v2, v16

    goto :goto_0

    :cond_2
    move/from16 v16, v2

    const/high16 v2, 0x40000000    # 2.0f

    if-ne v3, v2, :cond_3

    goto :goto_2

    :cond_3
    move v1, v8

    :goto_2
    if-ne v4, v2, :cond_4

    move/from16 v2, v16

    goto :goto_3

    :cond_4
    move v2, v10

    .line 18
    :goto_3
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void
.end method

.method public setAdapter(Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mDataSetObserver:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$AdapterDataSetObserver;

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/BaseAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    if-eqz p1, :cond_1

    .line 5
    new-instance p1, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$AdapterDataSetObserver;

    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$AdapterDataSetObserver;-><init>(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mDataSetObserver:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$AdapterDataSetObserver;

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    invoke-virtual {v0, p1}, Landroid/widget/BaseAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    :cond_1
    return-object p0
.end method

.method public setChildWidth(I)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mWidth:I

    return-object p0
.end method

.method public setItems(Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;)",
            "Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;->clearAndAddTags(Ljava/util/List;)V

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Lcom/xuexiang/xui/widget/flowlayout/DefaultFlowTagAdapter;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/flowlayout/DefaultFlowTagAdapter;-><init>(Landroid/content/Context;)V

    .line 5
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->setAdapter(Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 6
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;->addTags(Ljava/util/List;)V

    .line 7
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    return-object p1
.end method

.method public final varargs setItems([Ljava/lang/Object;)Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->setItems(Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    move-result-object p1

    return-object p1
.end method

.method public setOnTagClickListener(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$OnTagClickListener;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mOnTagClickListener:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$OnTagClickListener;

    return-object p0
.end method

.method public setOnTagSelectListener(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$OnTagSelectListener;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mOnTagSelectListener:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$OnTagSelectListener;

    return-object p0
.end method

.method public setSelectedItems(Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;)",
            "Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;"
        }
    .end annotation

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mTagCheckMode:I

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/xuexiang/xui/adapter/listview/XListAdapter;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, p1, v1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->getSelectedPositions(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;->setSelectedPositions(Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    :cond_0
    return-object p0
.end method

.method public final varargs setSelectedItems([Ljava/lang/Object;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->setSelectedItems(Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    return-object p0
.end method

.method public setSelectedPositions(Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;->setSelectedPositions(Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    :cond_0
    return-object p0
.end method

.method public setSelectedPositions([I)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;->setSelectedPositions([I)Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    :cond_0
    return-object p0
.end method

.method public varargs setSelectedPositions([Ljava/lang/Integer;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;->setSelectedPositions([Ljava/lang/Integer;)Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    :cond_0
    return-object p0
.end method

.method public setSingleCancelable(Z)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mSingleCancelable:Z

    return-object p0
.end method

.method public setTagCheckedMode(I)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mTagCheckMode:I

    return-object p0
.end method
