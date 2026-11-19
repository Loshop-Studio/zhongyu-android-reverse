.class public Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/tabbar/TabSegment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Tab"
.end annotation


# static fields
.field public static final USE_TAB_SEGMENT:I = -0x80000000


# instance fields
.field private contentLeft:I

.field private contentWidth:I

.field private dynamicChangeIconColor:Z

.field private gravity:I

.field private iconPosition:I

.field private mCustomViews:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private mSignCountDigits:I

.field private mSignCountMarginLeft:I

.field private mSignCountMarginTop:I

.field private mSignCountTextView:Landroid/widget/TextView;

.field private normalColor:I

.field private normalIcon:Landroid/graphics/drawable/Drawable;

.field private selectedColor:I

.field private selectedIcon:Landroid/graphics/drawable/Drawable;

.field private text:Ljava/lang/CharSequence;

.field private textSize:I


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/CharSequence;Z)V
    .locals 6

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    .line 16
    invoke-direct/range {v0 .. v5}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;-><init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/CharSequence;ZZ)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/CharSequence;ZZ)V
    .locals 3

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x80000000

    .line 18
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->textSize:I

    .line 19
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->normalColor:I

    .line 20
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->selectedColor:I

    const/4 v1, 0x0

    .line 21
    iput-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->selectedIcon:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    .line 22
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->contentWidth:I

    .line 23
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->contentLeft:I

    .line 24
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->iconPosition:I

    const/16 v0, 0x11

    .line 25
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->gravity:I

    const/4 v0, 0x2

    .line 26
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountDigits:I

    .line 27
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountMarginLeft:I

    .line 28
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountMarginTop:I

    const/4 v0, 0x1

    .line 29
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->dynamicChangeIconColor:Z

    .line 30
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->normalIcon:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_0

    if-eqz p5, :cond_0

    .line 31
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    invoke-virtual {p1, v1, v1, v0, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 32
    :cond_0
    iput-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->selectedIcon:Landroid/graphics/drawable/Drawable;

    if-eqz p2, :cond_1

    if-eqz p5, :cond_1

    .line 33
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result p1

    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p5

    invoke-virtual {p2, v1, v1, p1, p5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 34
    :cond_1
    iput-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->text:Ljava/lang/CharSequence;

    .line 35
    iput-boolean p4, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->dynamicChangeIconColor:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x80000000

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->textSize:I

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->normalColor:I

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->selectedColor:I

    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->normalIcon:Landroid/graphics/drawable/Drawable;

    .line 6
    iput-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->selectedIcon:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    .line 7
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->contentWidth:I

    .line 8
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->contentLeft:I

    .line 9
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->iconPosition:I

    const/16 v0, 0x11

    .line 10
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->gravity:I

    const/4 v0, 0x2

    .line 11
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountDigits:I

    .line 12
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountMarginLeft:I

    .line 13
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountMarginTop:I

    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->dynamicChangeIconColor:Z

    .line 15
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->text:Ljava/lang/CharSequence;

    return-void
.end method

.method static synthetic access$1400(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->contentLeft:I

    return p0
.end method

.method static synthetic access$1500(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->contentWidth:I

    return p0
.end method

.method private ensureSignCountView(Landroid/content/Context;)Landroid/widget/TextView;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroid/widget/TextView;

    const/4 v1, 0x0

    sget v2, Lcom/xuexiang/xui/R$attr;->xui_tab_sign_count_view:I

    invoke-direct {v0, p1, v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    .line 3
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    sget v2, Lcom/xuexiang/xui/R$attr;->xui_tab_sign_count_view_minSize:I

    invoke-static {p1, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result p1

    invoke-direct {v0, v1, p1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/4 p1, 0x6

    .line 4
    sget v1, Lcom/xuexiang/xui/R$id;->xui_tab_segment_item_id:I

    invoke-virtual {v0, p1, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/4 p1, 0x1

    .line 5
    invoke-virtual {v0, p1, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->addCustomView(Landroid/view/View;)V

    .line 8
    :cond_0
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountMarginLeft:I

    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountMarginTop:I

    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->setSignCountMargin(II)V

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    return-object p1
.end method

.method private getDefaultCustomLayoutParam()Landroid/widget/RelativeLayout$LayoutParams;
    .locals 2

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method private getNumberDigitsFormattingValue(I)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/xuexiang/xui/utils/Utils;->getNumberDigits(I)I

    move-result v0

    iget v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountDigits:I

    if-le v0, v1, :cond_1

    .line 2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v0, 0x1

    .line 3
    :goto_0
    iget v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountDigits:I

    if-gt v0, v1, :cond_0

    const-string v1, "9"

    .line 4
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const-string v0, "+"

    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 7
    :cond_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public addCustomView(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mCustomViews:Ljava/util/List;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mCustomViews:Ljava/util/List;

    .line 3
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_1

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->getDefaultCustomLayoutParam()Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mCustomViews:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public getContentLeft()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->contentLeft:I

    return v0
.end method

.method public getContentWidth()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->contentWidth:I

    return v0
.end method

.method public getCustomViews()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mCustomViews:Ljava/util/List;

    return-object v0
.end method

.method public getGravity()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->gravity:I

    return v0
.end method

.method public getIconPosition()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->iconPosition:I

    return v0
.end method

.method public getNormalColor()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->normalColor:I

    return v0
.end method

.method public getNormalIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->normalIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getSelectedColor()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->selectedColor:I

    return v0
.end method

.method public getSelectedIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->selectedIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getSignCount()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Lcom/xuexiang/xui/utils/Utils;->isNullOrEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0

    :cond_1
    :goto_0
    return v1
.end method

.method public getText()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->text:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getTextSize()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->textSize:I

    return v0
.end method

.method public hideSignCountView()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public isDynamicChangeIconColor()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->dynamicChangeIconColor:Z

    return v0
.end method

.method public setContentLeft(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->contentLeft:I

    return-void
.end method

.method public setContentWidth(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->contentWidth:I

    return-void
.end method

.method public setGravity(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->gravity:I

    return-void
.end method

.method public setIconPosition(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->iconPosition:I

    return-void
.end method

.method public setSignCountMargin(II)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountMarginLeft:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountMarginTop:I

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    iput p2, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    :cond_0
    return-void
.end method

.method public setText(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->text:Ljava/lang/CharSequence;

    return-void
.end method

.method public setTextColor(II)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->normalColor:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->selectedColor:I

    return-void
.end method

.method public setTextSize(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->textSize:I

    return-void
.end method

.method public setmSignCountDigits(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountDigits:I

    return-void
.end method

.method public showSignCountView(Landroid/content/Context;I)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->ensureSignCountView(Landroid/content/Context;)Landroid/widget/TextView;

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout$LayoutParams;

    if-eqz p2, :cond_0

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$attr;->xui_tab_sign_count_view_minSize_with_text:I

    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v0

    iput v0, p1, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMinWidth(I)V

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->getNumberDigitsFormattingValue(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 9
    :cond_0
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object p2

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_tab_sign_count_view_minSize:I

    invoke-static {p2, v0}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result p2

    iput p2, p1, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 10
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 11
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, v0}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 12
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, v0}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setMinWidth(I)V

    .line 13
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->mSignCountTextView:Landroid/widget/TextView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method
