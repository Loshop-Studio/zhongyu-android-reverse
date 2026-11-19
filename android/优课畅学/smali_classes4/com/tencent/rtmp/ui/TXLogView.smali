.class public Lcom/tencent/rtmp/ui/TXLogView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/StringBuffer;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/ScrollView;

.field private e:Landroid/widget/ScrollView;

.field private final f:I

.field private g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/tencent/rtmp/ui/TXLogView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 11

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    new-instance p2, Ljava/lang/StringBuffer;

    const-string v0, ""

    invoke-direct {p2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/tencent/rtmp/ui/TXLogView;->a:Ljava/lang/StringBuffer;

    const/16 p2, 0xbb8

    .line 4
    iput p2, p0, Lcom/tencent/rtmp/ui/TXLogView;->f:I

    const/4 p2, 0x0

    .line 5
    iput-boolean p2, p0, Lcom/tencent/rtmp/ui/TXLogView;->g:Z

    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 7
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/tencent/rtmp/ui/TXLogView;->b:Landroid/widget/TextView;

    .line 8
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/tencent/rtmp/ui/TXLogView;->c:Landroid/widget/TextView;

    .line 9
    new-instance v1, Landroid/widget/ScrollView;

    invoke-direct {v1, p1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/tencent/rtmp/ui/TXLogView;->d:Landroid/widget/ScrollView;

    .line 10
    new-instance v1, Landroid/widget/ScrollView;

    invoke-direct {v1, p1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/tencent/rtmp/ui/TXLogView;->e:Landroid/widget/ScrollView;

    .line 11
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const v3, 0x3e4ccccd    # 0.2f

    .line 12
    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 13
    iget-object v3, p0, Lcom/tencent/rtmp/ui/TXLogView;->d:Landroid/widget/ScrollView;

    invoke-virtual {v3, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 14
    iget-object v1, p0, Lcom/tencent/rtmp/ui/TXLogView;->d:Landroid/widget/ScrollView;

    const v3, 0x60ffffff

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 15
    iget-object v1, p0, Lcom/tencent/rtmp/ui/TXLogView;->d:Landroid/widget/ScrollView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 16
    iget-object v1, p0, Lcom/tencent/rtmp/ui/TXLogView;->d:Landroid/widget/ScrollView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setScrollbarFadingEnabled(Z)V

    .line 17
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 18
    iget-object v4, p0, Lcom/tencent/rtmp/ui/TXLogView;->b:Landroid/widget/TextView;

    invoke-virtual {v4, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    iget-object v1, p0, Lcom/tencent/rtmp/ui/TXLogView;->b:Landroid/widget/TextView;

    const/high16 v4, 0x41300000    # 11.0f

    const/4 v5, 0x2

    invoke-virtual {v1, v5, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 20
    iget-object v1, p0, Lcom/tencent/rtmp/ui/TXLogView;->b:Landroid/widget/TextView;

    const/high16 v4, -0x1000000

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 21
    iget-object v1, p0, Lcom/tencent/rtmp/ui/TXLogView;->b:Landroid/widget/TextView;

    sget-object v6, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {v1, v6, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 22
    iget-object v1, p0, Lcom/tencent/rtmp/ui/TXLogView;->b:Landroid/widget/TextView;

    const/high16 v6, 0x40800000    # 4.0f

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-virtual {v1, v6, v7}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 23
    iget-object v1, p0, Lcom/tencent/rtmp/ui/TXLogView;->b:Landroid/widget/TextView;

    const/high16 v6, 0x40000000    # 2.0f

    invoke-static {p1, v6}, Lcom/tencent/rtmp/ui/TXLogView;->a(Landroid/content/Context;F)I

    move-result v7

    invoke-static {p1, v6}, Lcom/tencent/rtmp/ui/TXLogView;->a(Landroid/content/Context;F)I

    move-result v8

    invoke-static {p1, v6}, Lcom/tencent/rtmp/ui/TXLogView;->a(Landroid/content/Context;F)I

    move-result v9

    invoke-static {p1, v6}, Lcom/tencent/rtmp/ui/TXLogView;->a(Landroid/content/Context;F)I

    move-result v10

    invoke-virtual {v1, v7, v8, v9, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 24
    iget-object v1, p0, Lcom/tencent/rtmp/ui/TXLogView;->d:Landroid/widget/ScrollView;

    iget-object v7, p0, Lcom/tencent/rtmp/ui/TXLogView;->b:Landroid/widget/TextView;

    invoke-virtual {v1, v7}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 25
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v2, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const p2, 0x3f4ccccd    # 0.8f

    .line 26
    iput p2, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 27
    invoke-static {p1, v6}, Lcom/tencent/rtmp/ui/TXLogView;->a(Landroid/content/Context;F)I

    move-result p2

    iput p2, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 28
    iget-object p2, p0, Lcom/tencent/rtmp/ui/TXLogView;->e:Landroid/widget/ScrollView;

    invoke-virtual {p2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 29
    iget-object p2, p0, Lcom/tencent/rtmp/ui/TXLogView;->e:Landroid/widget/ScrollView;

    invoke-virtual {p2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 30
    iget-object p2, p0, Lcom/tencent/rtmp/ui/TXLogView;->e:Landroid/widget/ScrollView;

    invoke-virtual {p2, v0}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 31
    iget-object p2, p0, Lcom/tencent/rtmp/ui/TXLogView;->e:Landroid/widget/ScrollView;

    invoke-virtual {p2, v0}, Landroid/view/View;->setScrollbarFadingEnabled(Z)V

    .line 32
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {p2, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 33
    iget-object v0, p0, Lcom/tencent/rtmp/ui/TXLogView;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 34
    iget-object p2, p0, Lcom/tencent/rtmp/ui/TXLogView;->c:Landroid/widget/TextView;

    const/high16 v0, 0x41500000    # 13.0f

    invoke-virtual {p2, v5, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 35
    iget-object p2, p0, Lcom/tencent/rtmp/ui/TXLogView;->c:Landroid/widget/TextView;

    invoke-virtual {p2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 36
    iget-object p2, p0, Lcom/tencent/rtmp/ui/TXLogView;->c:Landroid/widget/TextView;

    invoke-static {p1, v6}, Lcom/tencent/rtmp/ui/TXLogView;->a(Landroid/content/Context;F)I

    move-result v0

    invoke-static {p1, v6}, Lcom/tencent/rtmp/ui/TXLogView;->a(Landroid/content/Context;F)I

    move-result v1

    invoke-static {p1, v6}, Lcom/tencent/rtmp/ui/TXLogView;->a(Landroid/content/Context;F)I

    move-result v2

    invoke-static {p1, v6}, Lcom/tencent/rtmp/ui/TXLogView;->a(Landroid/content/Context;F)I

    move-result p1

    invoke-virtual {p2, v0, v1, v2, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 37
    iget-object p1, p0, Lcom/tencent/rtmp/ui/TXLogView;->e:Landroid/widget/ScrollView;

    iget-object p2, p0, Lcom/tencent/rtmp/ui/TXLogView;->c:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 38
    iget-object p1, p0, Lcom/tencent/rtmp/ui/TXLogView;->d:Landroid/widget/ScrollView;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 39
    iget-object p1, p0, Lcom/tencent/rtmp/ui/TXLogView;->e:Landroid/widget/ScrollView;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 p1, 0x8

    .line 40
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static a(Landroid/content/Context;F)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 10
    .line 11
    mul-float/2addr p1, p0

    .line 12
    const/high16 p0, 0x3f000000    # 0.5f

    .line 13
    .line 14
    add-float/2addr p1, p0

    .line 15
    float-to-int p0, p1

    .line 16
    return p0
.end method
