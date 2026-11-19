.class public Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;
.super Landroid/widget/ScrollView;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/utils/KeyboardUtils$SoftKeyboardToggleListener;


# static fields
.field private static final DEFAULT_SCROLL_HEIGHT:I = 0x28


# instance fields
.field private mAutoScroll:Z

.field private mScrollDelay:I

.field private mScrollHeight:I

.field private mScrollHide:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;->mScrollHide:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;->mScrollHeight:I

    return p0
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->XUIKeyboardScrollView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    sget p2, Lcom/xuexiang/xui/R$styleable;->XUIKeyboardScrollView_ksv_auto_scroll:I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;->mAutoScroll:Z

    .line 3
    sget p2, Lcom/xuexiang/xui/R$styleable;->XUIKeyboardScrollView_ksv_scroll_height:I

    invoke-virtual {p0}, Landroid/widget/ScrollView;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x42200000    # 40.0f

    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;->mScrollHeight:I

    .line 4
    sget p2, Lcom/xuexiang/xui/R$styleable;->XUIKeyboardScrollView_ksv_scroll_delay:I

    const/16 v0, 0x64

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;->mScrollDelay:I

    .line 5
    sget p2, Lcom/xuexiang/xui/R$styleable;->XUIKeyboardScrollView_ksv_scroll_hide:I

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;->mScrollHide:Z

    .line 6
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 7
    :cond_0
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;->mAutoScroll:Z

    if-eqz p1, :cond_1

    .line 8
    invoke-static {p0, p0}, Lcom/xuexiang/xui/utils/KeyboardUtils;->addKeyboardToggleListener(Landroid/view/ViewGroup;Lcom/xuexiang/xui/utils/KeyboardUtils$SoftKeyboardToggleListener;)V

    :cond_1
    return-void
.end method


# virtual methods
.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;->mAutoScroll:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/xuexiang/xui/utils/KeyboardUtils;->removeKeyboardToggleListener(Lcom/xuexiang/xui/utils/KeyboardUtils$SoftKeyboardToggleListener;)V

    .line 3
    :cond_0
    invoke-super {p0}, Landroid/widget/ScrollView;->onDetachedFromWindow()V

    return-void
.end method

.method protected onScrollChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ScrollView;->onScrollChanged(IIII)V

    .line 2
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;->mScrollHide:Z

    if-eqz p1, :cond_0

    .line 3
    invoke-static {p0}, Lcom/xuexiang/xui/utils/KeyboardUtils;->hideSoftInput(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public onToggleSoftKeyboard(Z)V
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    new-instance p1, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView$1;

    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView$1;-><init>(Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;)V

    iget v0, p0, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;->mScrollDelay:I

    int-to-long v0, v0

    invoke-virtual {p0, p1, v0, v1}, Landroid/widget/ScrollView;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 2
    :cond_0
    new-instance p1, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView$2;

    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView$2;-><init>(Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;)V

    iget v0, p0, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;->mScrollDelay:I

    int-to-long v0, v0

    invoke-virtual {p0, p1, v0, v1}, Landroid/widget/ScrollView;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_0
    return-void
.end method

.method public setIsScrollHideKeyboard(Z)Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;->mScrollHide:Z

    return-object p0
.end method
