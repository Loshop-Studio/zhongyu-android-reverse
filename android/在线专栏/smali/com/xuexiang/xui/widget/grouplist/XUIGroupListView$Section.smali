.class public Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Section"
.end annotation


# instance fields
.field private mContext:Landroid/content/Context;

.field private mDescriptionView:Lcom/xuexiang/xui/widget/grouplist/XUIGroupListSectionHeaderFooterView;

.field private mItemViews:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;",
            ">;"
        }
    .end annotation
.end field

.field private mLeftIconHeight:I

.field private mLeftIconWidth:I

.field private mSeparatorDrawableForBottom:I

.field private mSeparatorDrawableForMiddle:I

.field private mSeparatorDrawableForSingle:I

.field private mSeparatorDrawableForTop:I

.field private mTitleView:Lcom/xuexiang/xui/widget/grouplist/XUIGroupListSectionHeaderFooterView;

.field private mUseDefaultTitleIfNone:Z

.field private mUseTitleViewForSectionSpace:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mUseTitleViewForSectionSpace:Z

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mSeparatorDrawableForSingle:I

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mSeparatorDrawableForTop:I

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mSeparatorDrawableForBottom:I

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mSeparatorDrawableForMiddle:I

    const/4 v0, -0x2

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mLeftIconWidth:I

    .line 8
    iput v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mLeftIconHeight:I

    .line 9
    iput-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mContext:Landroid/content/Context;

    .line 10
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mItemViews:Landroid/util/SparseArray;

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mLeftIconWidth:I

    return p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mLeftIconHeight:I

    return p0
.end method


# virtual methods
.method public addItemView(Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->addItemView(Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;

    move-result-object p1

    return-object p1
.end method

.method public addItemView(Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;
    .locals 2

    .line 2
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->getAccessoryType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 3
    new-instance p2, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section$1;

    invoke-direct {p2, p0, p1}, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section$1;-><init>(Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;)V

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 4
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    :goto_0
    if-eqz p3, :cond_2

    .line 5
    invoke-virtual {p1, p3}, Landroid/widget/RelativeLayout;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 6
    :cond_2
    iget-object p2, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mItemViews:Landroid/util/SparseArray;

    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    move-result p3

    invoke-virtual {p2, p3, p1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    return-object p0
.end method

.method public addTo(Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mTitleView:Lcom/xuexiang/xui/widget/grouplist/XUIGroupListSectionHeaderFooterView;

    if-nez v0, :cond_1

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mUseDefaultTitleIfNone:Z

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Section "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView;->getSectionCount()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->setTitle(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;

    goto :goto_0

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mUseTitleViewForSectionSpace:Z

    if-eqz v0, :cond_1

    const-string v0, ""

    .line 5
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->setTitle(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;

    .line 6
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mTitleView:Lcom/xuexiang/xui/widget/grouplist/XUIGroupListSectionHeaderFooterView;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 8
    :cond_2
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView;->getSeparatorStyle()I

    move-result v0

    if-nez v0, :cond_6

    .line 9
    iget v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mSeparatorDrawableForSingle:I

    if-nez v0, :cond_3

    .line 10
    sget v0, Lcom/xuexiang/xui/R$drawable;->xui_list_item_bg_with_border_double_selector:I

    iput v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mSeparatorDrawableForSingle:I

    .line 11
    :cond_3
    iget v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mSeparatorDrawableForTop:I

    if-nez v0, :cond_4

    .line 12
    sget v0, Lcom/xuexiang/xui/R$drawable;->xui_list_item_bg_with_border_double_selector:I

    iput v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mSeparatorDrawableForTop:I

    .line 13
    :cond_4
    iget v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mSeparatorDrawableForBottom:I

    if-nez v0, :cond_5

    .line 14
    sget v0, Lcom/xuexiang/xui/R$drawable;->xui_list_item_bg_with_border_bottom_selector:I

    iput v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mSeparatorDrawableForBottom:I

    .line 15
    :cond_5
    iget v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mSeparatorDrawableForMiddle:I

    if-nez v0, :cond_6

    .line 16
    sget v0, Lcom/xuexiang/xui/R$drawable;->xui_list_item_bg_with_border_bottom_selector:I

    iput v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mSeparatorDrawableForMiddle:I

    .line 17
    :cond_6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mItemViews:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    .line 18
    new-instance v1, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section$2;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section$2;-><init>(Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;)V

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v0, :cond_b

    .line 19
    iget-object v3, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mItemViews:Landroid/util/SparseArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;

    .line 20
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView;->getSeparatorStyle()I

    move-result v4

    if-nez v4, :cond_a

    const/4 v4, 0x1

    if-ne v0, v4, :cond_7

    .line 21
    iget v4, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mSeparatorDrawableForSingle:I

    goto :goto_2

    :cond_7
    if-nez v2, :cond_8

    .line 22
    iget v4, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mSeparatorDrawableForTop:I

    goto :goto_2

    :cond_8
    add-int/lit8 v4, v0, -0x1

    if-ne v2, v4, :cond_9

    .line 23
    iget v4, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mSeparatorDrawableForBottom:I

    goto :goto_2

    .line 24
    :cond_9
    iget v4, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mSeparatorDrawableForMiddle:I

    goto :goto_2

    .line 25
    :cond_a
    sget v4, Lcom/xuexiang/xui/R$drawable;->xui_list_item_bg_with_border_none_selector:I

    .line 26
    :goto_2
    invoke-virtual {v3, v1}, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->updateImageViewLp(Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView$LayoutParamConfig;)V

    .line 27
    invoke-static {v3, v4}, Lcom/xuexiang/xui/utils/ViewUtils;->setBackgroundKeepingPadding(Landroid/view/View;I)V

    .line 28
    invoke-virtual {p1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 29
    :cond_b
    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mDescriptionView:Lcom/xuexiang/xui/widget/grouplist/XUIGroupListSectionHeaderFooterView;

    if-eqz v0, :cond_c

    .line 30
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 31
    :cond_c
    invoke-static {p1, p0}, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView;->access$200(Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView;Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;)V

    return-void
.end method

.method public createSectionFooter(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/grouplist/XUIGroupListSectionHeaderFooterView;
    .locals 3

    new-instance v0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListSectionHeaderFooterView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mContext:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p1, v2}, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListSectionHeaderFooterView;-><init>(Landroid/content/Context;Ljava/lang/CharSequence;Z)V

    return-object v0
.end method

.method public createSectionHeader(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/grouplist/XUIGroupListSectionHeaderFooterView;
    .locals 2

    new-instance v0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListSectionHeaderFooterView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListSectionHeaderFooterView;-><init>(Landroid/content/Context;Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method public removeFrom(Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mTitleView:Lcom/xuexiang/xui/widget/grouplist/XUIGroupListSectionHeaderFooterView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-ne v0, p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mTitleView:Lcom/xuexiang/xui/widget/grouplist/XUIGroupListSectionHeaderFooterView;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    :cond_0
    const/4 v0, 0x0

    .line 3
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mItemViews:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mItemViews:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;

    .line 5
    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mDescriptionView:Lcom/xuexiang/xui/widget/grouplist/XUIGroupListSectionHeaderFooterView;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-ne v0, p1, :cond_2

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mDescriptionView:Lcom/xuexiang/xui/widget/grouplist/XUIGroupListSectionHeaderFooterView;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    .line 8
    :cond_2
    invoke-static {p1, p0}, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView;->access$300(Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView;Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;)V

    return-void
.end method

.method public setDescription(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->createSectionFooter(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/grouplist/XUIGroupListSectionHeaderFooterView;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mDescriptionView:Lcom/xuexiang/xui/widget/grouplist/XUIGroupListSectionHeaderFooterView;

    return-object p0
.end method

.method public setLeftIconSize(II)Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;
    .locals 0

    .line 1
    iput p2, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mLeftIconHeight:I

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mLeftIconWidth:I

    return-object p0
.end method

.method public setSeparatorDrawableRes(I)Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;
    .locals 0

    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mSeparatorDrawableForMiddle:I

    return-object p0
.end method

.method public setSeparatorDrawableRes(IIII)Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mSeparatorDrawableForSingle:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mSeparatorDrawableForTop:I

    .line 3
    iput p3, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mSeparatorDrawableForBottom:I

    .line 4
    iput p4, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mSeparatorDrawableForMiddle:I

    return-object p0
.end method

.method public setTitle(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->createSectionHeader(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/grouplist/XUIGroupListSectionHeaderFooterView;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mTitleView:Lcom/xuexiang/xui/widget/grouplist/XUIGroupListSectionHeaderFooterView;

    return-object p0
.end method

.method public setUseDefaultTitleIfNone(Z)Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mUseDefaultTitleIfNone:Z

    return-object p0
.end method

.method public setUseTitleViewForSectionSpace(Z)Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->mUseTitleViewForSectionSpace:Z

    return-object p0
.end method
