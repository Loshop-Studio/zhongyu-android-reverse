.class public Lcom/xuexiang/xui/widget/textview/label/LabelView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"


# static fields
.field public static final k:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:I

.field public j:Landroid/view/animation/Animation;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/xuexiang/xui/widget/textview/label/LabelView;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/textview/label/LabelView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x1010084

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/textview/label/LabelView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p1, Lcom/xuexiang/xui/widget/textview/label/LabelView$a;

    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/textview/label/LabelView$a;-><init>(Lcom/xuexiang/xui/widget/textview/label/LabelView;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView;->j:Landroid/view/animation/Animation;

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/label/LabelView;->h()V

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView;->j:Landroid/view/animation/Animation;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/view/animation/Animation;->setFillBefore(Z)V

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView;->j:Landroid/view/animation/Animation;

    invoke-virtual {p1, p2}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView;->j:Landroid/view/animation/Animation;

    invoke-virtual {p1, p2}, Landroid/view/animation/Animation;->setFillEnabled(Z)V

    return-void
.end method

.method public static synthetic c(Lcom/xuexiang/xui/widget/textview/label/LabelView;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView;->d:F

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic d(Lcom/xuexiang/xui/widget/textview/label/LabelView;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView;->e:F

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic e(Lcom/xuexiang/xui/widget/textview/label/LabelView;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView;->h:F

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic f(Lcom/xuexiang/xui/widget/textview/label/LabelView;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView;->f:F

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic g(Lcom/xuexiang/xui/widget/textview/label/LabelView;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView;->g:F

    .line 2
    .line 3
    return p0
.end method

.method private h()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 9
    .line 10
    const/4 v2, -0x2

    .line 11
    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iput v1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView;->i:I

    .line 18
    .line 19
    const/16 v0, 0x11

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 25
    .line 26
    .line 27
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    const/high16 v1, 0x41400000    # 12.0f

    .line 34
    .line 35
    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setTextSize(IF)V

    .line 36
    .line 37
    .line 38
    const v0, -0xffff01

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
