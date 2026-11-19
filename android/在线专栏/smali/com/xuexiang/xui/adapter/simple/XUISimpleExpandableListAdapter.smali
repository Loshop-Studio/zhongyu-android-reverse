.class public Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;
.super Landroid/widget/BaseExpandableListAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$ChildViewHolder;,
        Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$GroupViewHolder;
    }
.end annotation


# instance fields
.field private mArrowDownResId:I

.field private mArrowUpResId:I

.field private mData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/xuexiang/xui/adapter/simple/ExpandableItem;",
            ">;"
        }
    .end annotation
.end field

.field private mPaddingStartPx:I


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/xuexiang/xui/adapter/simple/ExpandableItem;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseExpandableListAdapter;-><init>()V

    .line 2
    sget v0, Lcom/xuexiang/xui/R$drawable;->xui_ic_expand_arrow_up:I

    iput v0, p0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->mArrowUpResId:I

    .line 3
    sget v0, Lcom/xuexiang/xui/R$drawable;->xui_ic_expand_arrow_down:I

    iput v0, p0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->mArrowDownResId:I

    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->mData:Ljava/util/List;

    return-void
.end method

.method public varargs constructor <init>([Lcom/xuexiang/xui/adapter/simple/ExpandableItem;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Landroid/widget/BaseExpandableListAdapter;-><init>()V

    .line 6
    sget v0, Lcom/xuexiang/xui/R$drawable;->xui_ic_expand_arrow_up:I

    iput v0, p0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->mArrowUpResId:I

    .line 7
    sget v0, Lcom/xuexiang/xui/R$drawable;->xui_ic_expand_arrow_down:I

    iput v0, p0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->mArrowDownResId:I

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->mData:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getChild(II)Lcom/xuexiang/xui/adapter/simple/AdapterItem;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->mData:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/adapter/simple/ExpandableItem;

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/adapter/simple/ExpandableItem;->getChildItem(I)Lcom/xuexiang/xui/adapter/simple/AdapterItem;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic getChild(II)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->getChild(II)Lcom/xuexiang/xui/adapter/simple/AdapterItem;

    move-result-object p1

    return-object p1
.end method

.method public getChildId(II)J
    .locals 0

    int-to-long p1, p2

    return-wide p1
.end method

.method public getChildView(IIZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    const/4 p3, 0x0

    if-nez p4, :cond_1

    .line 1
    invoke-virtual {p5}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-static {p4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p4

    sget v0, Lcom/xuexiang/xui/R$layout;->xui_layout_expand_child_item:I

    invoke-virtual {p4, v0, p5, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p4

    .line 2
    new-instance v0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$ChildViewHolder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$ChildViewHolder;-><init>(Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$1;)V

    .line 3
    sget v1, Lcom/xuexiang/xui/R$id;->ll_content:I

    invoke-virtual {p4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, v0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$ChildViewHolder;->llContentView:Landroid/widget/LinearLayout;

    .line 4
    sget v1, Lcom/xuexiang/xui/R$id;->iv_icon:I

    invoke-virtual {p4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/AppCompatImageView;

    iput-object v1, v0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$ChildViewHolder;->ivIcon:Landroidx/appcompat/widget/AppCompatImageView;

    .line 5
    sget v1, Lcom/xuexiang/xui/R$id;->tv_child_name:I

    invoke-virtual {p4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$ChildViewHolder;->tvTitle:Landroid/widget/TextView;

    .line 6
    iget v1, p0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->mPaddingStartPx:I

    if-eqz v1, :cond_0

    .line 7
    invoke-virtual {p5}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p5

    sget v1, Lcom/xuexiang/xui/R$attr;->xui_config_content_spacing_vertical:I

    invoke-static {p5, v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result p5

    .line 8
    iget-object v1, v0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$ChildViewHolder;->llContentView:Landroid/widget/LinearLayout;

    iget v2, p0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->mPaddingStartPx:I

    invoke-virtual {v1, v2, p5, p5, p5}, Landroid/widget/LinearLayout;->setPaddingRelative(IIII)V

    .line 9
    iget-object p5, v0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$ChildViewHolder;->llContentView:Landroid/widget/LinearLayout;

    const/16 v1, 0x10

    invoke-virtual {p5, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    goto :goto_0

    .line 10
    :cond_0
    iget-object p5, v0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$ChildViewHolder;->llContentView:Landroid/widget/LinearLayout;

    const/16 v1, 0x11

    invoke-virtual {p5, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 11
    :goto_0
    invoke-virtual {p4, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_1

    .line 12
    :cond_1
    invoke-virtual {p4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p5

    move-object v0, p5

    check-cast v0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$ChildViewHolder;

    .line 13
    :goto_1
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->getChild(II)Lcom/xuexiang/xui/adapter/simple/AdapterItem;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 14
    iget-object p2, v0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$ChildViewHolder;->tvTitle:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/xuexiang/xui/adapter/simple/AdapterItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object p5

    invoke-virtual {p2, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    invoke-virtual {p1}, Lcom/xuexiang/xui/adapter/simple/AdapterItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 16
    iget-object p2, v0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$ChildViewHolder;->ivIcon:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 17
    iget-object p2, v0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$ChildViewHolder;->ivIcon:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {p1}, Lcom/xuexiang/xui/adapter/simple/AdapterItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    .line 18
    :cond_2
    iget-object p1, v0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$ChildViewHolder;->ivIcon:Landroidx/appcompat/widget/AppCompatImageView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_3
    :goto_2
    return-object p4
.end method

.method public getChildrenCount(I)I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->mData:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/adapter/simple/ExpandableItem;

    invoke-virtual {p1}, Lcom/xuexiang/xui/adapter/simple/ExpandableItem;->getChildSize()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getGroup(I)Lcom/xuexiang/xui/adapter/simple/ExpandableItem;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->mData:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/adapter/simple/ExpandableItem;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic getGroup(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->getGroup(I)Lcom/xuexiang/xui/adapter/simple/ExpandableItem;

    move-result-object p1

    return-object p1
.end method

.method public getGroupCount()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->mData:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getGroupId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getGroupView(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    const/4 v0, 0x0

    if-nez p3, :cond_0

    .line 1
    invoke-virtual {p4}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p3

    sget v1, Lcom/xuexiang/xui/R$layout;->xui_layout_expand_group_item:I

    invoke-virtual {p3, v1, p4, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p3

    .line 2
    new-instance p4, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$GroupViewHolder;

    const/4 v1, 0x0

    invoke-direct {p4, v1}, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$GroupViewHolder;-><init>(Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$1;)V

    .line 3
    sget v1, Lcom/xuexiang/xui/R$id;->iv_icon:I

    invoke-virtual {p3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/AppCompatImageView;

    iput-object v1, p4, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$GroupViewHolder;->ivIcon:Landroidx/appcompat/widget/AppCompatImageView;

    .line 4
    sget v1, Lcom/xuexiang/xui/R$id;->tv_group_name:I

    invoke-virtual {p3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p4, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$GroupViewHolder;->tvTitle:Landroid/widget/TextView;

    .line 5
    sget v1, Lcom/xuexiang/xui/R$id;->iv_indicator:I

    invoke-virtual {p3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/AppCompatImageView;

    iput-object v1, p4, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$GroupViewHolder;->ivIndicator:Landroidx/appcompat/widget/AppCompatImageView;

    .line 6
    invoke-virtual {p3, p4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$GroupViewHolder;

    .line 8
    :goto_0
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->getGroup(I)Lcom/xuexiang/xui/adapter/simple/ExpandableItem;

    move-result-object p1

    invoke-virtual {p1}, Lcom/xuexiang/xui/adapter/simple/ExpandableItem;->getGroup()Lcom/xuexiang/xui/adapter/simple/AdapterItem;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 9
    iget-object v1, p4, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$GroupViewHolder;->tvTitle:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/xuexiang/xui/adapter/simple/AdapterItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object v1, p4, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$GroupViewHolder;->ivIndicator:Landroidx/appcompat/widget/AppCompatImageView;

    if-eqz p2, :cond_1

    iget p2, p0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->mArrowUpResId:I

    goto :goto_1

    :cond_1
    iget p2, p0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->mArrowDownResId:I

    :goto_1
    invoke-virtual {v1, p2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 11
    invoke-virtual {p1}, Lcom/xuexiang/xui/adapter/simple/AdapterItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 12
    iget-object p2, p4, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$GroupViewHolder;->ivIcon:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 13
    iget-object p2, p4, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$GroupViewHolder;->ivIcon:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {p1}, Lcom/xuexiang/xui/adapter/simple/AdapterItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    .line 14
    :cond_2
    iget-object p1, p4, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter$GroupViewHolder;->ivIcon:Landroidx/appcompat/widget/AppCompatImageView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_3
    :goto_2
    return-object p3
.end method

.method public hasStableIds()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isChildSelectable(II)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public setArrowStyle(II)Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->mArrowDownResId:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->mArrowUpResId:I

    return-object p0
.end method

.method public setPaddingLeftDp(I)Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    int-to-float p1, p1

    invoke-static {p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(F)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->mPaddingStartPx:I

    return-object p0
.end method

.method public setPaddingLeftPx(I)Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput p1, p0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->mPaddingStartPx:I

    return-object p0
.end method

.method public setPaddingStartDp(I)Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;
    .locals 0

    int-to-float p1, p1

    invoke-static {p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(F)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->mPaddingStartPx:I

    return-object p0
.end method

.method public setPaddingStartPx(I)Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->mPaddingStartPx:I

    return-object p0
.end method
