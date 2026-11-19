.class public Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/tabbar/TabSegment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TabItemView"
.end annotation


# instance fields
.field private mGestureDetector:Landroid/view/GestureDetector;

.field private mTextView:Landroidx/appcompat/widget/AppCompatTextView;

.field final synthetic this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/content/Context;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 2
    invoke-direct {p0, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 3
    new-instance p2, Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->mTextView:Landroidx/appcompat/widget/AppCompatTextView;

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 5
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->mTextView:Landroidx/appcompat/widget/AppCompatTextView;

    const/16 v0, 0x11

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 6
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->mTextView:Landroidx/appcompat/widget/AppCompatTextView;

    sget-object v0, Landroid/text/TextUtils$TruncateAt;->MIDDLE:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 7
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->mTextView:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {}, Lcom/xuexiang/xui/XUI;->getDefaultTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 8
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->mTextView:Landroidx/appcompat/widget/AppCompatTextView;

    sget v0, Lcom/xuexiang/xui/R$id;->xui_tab_segment_item_id:I

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setId(I)V

    .line 9
    new-instance p2, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x2

    invoke-direct {p2, v0, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v0, 0xf

    const/4 v1, -0x1

    .line 10
    invoke-virtual {p2, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->mTextView:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {p0, v0, p2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 12
    new-instance p2, Landroid/view/GestureDetector;

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView$1;

    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView$1;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;Lcom/xuexiang/xui/widget/tabbar/TabSegment;)V

    invoke-direct {p2, v0, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->mGestureDetector:Landroid/view/GestureDetector;

    return-void
.end method


# virtual methods
.method public getTextView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->mTextView:Landroidx/appcompat/widget/AppCompatTextView;

    return-object v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->mGestureDetector:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

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

.method public setColorInTransition(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->mTextView:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->isDynamicChangeIconColor()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->mTextView:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v1, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2300(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_0

    .line 4
    invoke-static {v0, p2}, Lcom/xuexiang/xui/utils/Utils;->setDrawableTintColor(Landroid/graphics/drawable/Drawable;I)Landroid/graphics/ColorFilter;

    .line 5
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->mTextView:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {p2, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2300(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result p1

    invoke-static {p2, v1, v0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2400(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;I)V

    :cond_0
    return-void
.end method

.method public updateDecoration(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    if-eqz p2, :cond_0

    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$500(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$600(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result v0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->mTextView:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 3
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->getNormalIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz p2, :cond_2

    .line 4
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->isDynamicChangeIconColor()Z

    move-result p2

    if-nez p2, :cond_1

    .line 5
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->getSelectedIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->getSelectedIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    goto :goto_1

    :cond_1
    if-eqz v1, :cond_2

    .line 6
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 7
    invoke-static {v1, v0}, Lcom/xuexiang/xui/utils/Utils;->setDrawableTintColor(Landroid/graphics/drawable/Drawable;I)Landroid/graphics/ColorFilter;

    :cond_2
    :goto_1
    if-nez v1, :cond_3

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->mTextView:Landroidx/appcompat/widget/AppCompatTextView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->mTextView:Landroidx/appcompat/widget/AppCompatTextView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p2, p2}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    .line 10
    :cond_3
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->mTextView:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v2, 0x40800000    # 4.0f

    invoke-static {v0, v2}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 11
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->mTextView:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {p2, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2300(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result p1

    invoke-static {p2, v0, v1, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2400(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;I)V

    :goto_2
    return-void
.end method
