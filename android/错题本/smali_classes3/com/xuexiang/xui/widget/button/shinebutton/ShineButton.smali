.class public Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;
.super Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;
.source "SourceFile"

# interfaces
.implements Landroid/widget/Checkable;


# instance fields
.field public l:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->ShineButtonStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x0

    .line 4
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->l:Z

    .line 5
    const-string v0, "#FFFF99"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->k:[I

    aput v0, v1, p3

    .line 6
    const-string p3, "#FFCCCC"

    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p3

    const/4 v0, 0x1

    aput p3, v1, v0

    .line 7
    const-string p3, "#996699"

    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p3

    const/4 v0, 0x2

    aput p3, v1, v0

    .line 8
    const-string p3, "#FF6666"

    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p3

    const/4 v0, 0x3

    aput p3, v1, v0

    .line 9
    const-string p3, "#FFFF66"

    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p3

    const/4 v0, 0x4

    aput p3, v1, v0

    .line 10
    const-string p3, "#F44336"

    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p3

    const/4 v0, 0x5

    aput p3, v1, v0

    .line 11
    const-string p3, "#666666"

    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    const/4 v2, 0x6

    aput v0, v1, v2

    .line 12
    const-string v0, "#CCCC00"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    const/4 v2, 0x7

    aput v0, v1, v2

    const/16 v0, 0x8

    .line 13
    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p3

    aput p3, v1, v0

    .line 14
    const-string p3, "#999933"

    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p3

    const/16 v0, 0x9

    aput p3, v1, v0

    .line 15
    sget-object p3, Lcom/xuexiang/xui/R$styleable;->ShineButton:[I

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 16
    invoke-static {}, Lt1/a;->a()V

    const/4 p1, 0x0

    throw p1
.end method


# virtual methods
.method public getColor()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getWindow()Landroid/view/Window;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final isChecked()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method public setChecked(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->l:Z

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->setTintColor(I)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->l:Z

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->setTintColor(I)V

    .line 14
    .line 15
    .line 16
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->l:Z

    .line 17
    .line 18
    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lg2/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final toggle()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->l:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->setChecked(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
