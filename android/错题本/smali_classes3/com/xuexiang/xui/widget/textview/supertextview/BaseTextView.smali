.class public Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# instance fields
.field public a:Landroid/content/Context;

.field public b:Landroid/widget/TextView;

.field public c:Landroid/widget/TextView;

.field public d:Landroid/widget/TextView;

.field public e:Landroid/widget/LinearLayout$LayoutParams;

.field public f:Landroid/widget/LinearLayout$LayoutParams;

.field public g:Landroid/widget/LinearLayout$LayoutParams;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->a(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->a:Landroid/content/Context;

    .line 6
    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->e:Landroid/widget/LinearLayout$LayoutParams;

    .line 8
    .line 9
    const/4 v0, -0x2

    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 15
    .line 16
    invoke-direct {p1, v0, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->e:Landroid/widget/LinearLayout$LayoutParams;

    .line 20
    .line 21
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->b:Landroid/widget/TextView;

    .line 22
    .line 23
    if-nez p1, :cond_2

    .line 24
    .line 25
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->e:Landroid/widget/LinearLayout$LayoutParams;

    .line 26
    .line 27
    invoke-virtual {p0, v1, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->b(Landroid/widget/LinearLayout$LayoutParams;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->b:Landroid/widget/TextView;

    .line 32
    .line 33
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->f:Landroid/widget/LinearLayout$LayoutParams;

    .line 34
    .line 35
    if-nez p1, :cond_4

    .line 36
    .line 37
    if-nez p1, :cond_3

    .line 38
    .line 39
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 40
    .line 41
    invoke-direct {p1, v0, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 42
    .line 43
    .line 44
    :cond_3
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->f:Landroid/widget/LinearLayout$LayoutParams;

    .line 45
    .line 46
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->c:Landroid/widget/TextView;

    .line 47
    .line 48
    if-nez p1, :cond_5

    .line 49
    .line 50
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->f:Landroid/widget/LinearLayout$LayoutParams;

    .line 51
    .line 52
    invoke-virtual {p0, v1, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->b(Landroid/widget/LinearLayout$LayoutParams;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->c:Landroid/widget/TextView;

    .line 57
    .line 58
    :cond_5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->g:Landroid/widget/LinearLayout$LayoutParams;

    .line 59
    .line 60
    if-nez p1, :cond_7

    .line 61
    .line 62
    if-nez p1, :cond_6

    .line 63
    .line 64
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 65
    .line 66
    invoke-direct {p1, v0, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 67
    .line 68
    .line 69
    :cond_6
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->g:Landroid/widget/LinearLayout$LayoutParams;

    .line 70
    .line 71
    :cond_7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->d:Landroid/widget/TextView;

    .line 72
    .line 73
    if-nez p1, :cond_8

    .line 74
    .line 75
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->g:Landroid/widget/LinearLayout$LayoutParams;

    .line 76
    .line 77
    invoke-virtual {p0, v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->b(Landroid/widget/LinearLayout$LayoutParams;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->d:Landroid/widget/TextView;

    .line 82
    .line 83
    :cond_8
    return-void
.end method

.method public final b(Landroid/widget/LinearLayout$LayoutParams;Landroid/widget/TextView;)Landroid/widget/TextView;
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    new-instance p2, Landroid/widget/TextView;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {p2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 11
    .line 12
    .line 13
    const/16 p1, 0x8

    .line 14
    .line 15
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    const/16 p1, 0x11

    .line 19
    .line 20
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    return-object p2
.end method

.method public getBottomTextView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->d:Landroid/widget/TextView;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCenterTextView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->c:Landroid/widget/TextView;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTopTextView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->b:Landroid/widget/TextView;

    .line 2
    .line 3
    return-object v0
.end method

.method public setBottomTextString(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->d:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setCenterSpaceHeight(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->e:Landroid/widget/LinearLayout$LayoutParams;

    .line 2
    .line 3
    div-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1, v1, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->f:Landroid/widget/LinearLayout$LayoutParams;

    .line 10
    .line 11
    invoke-virtual {v0, v1, p1, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->g:Landroid/widget/LinearLayout$LayoutParams;

    .line 15
    .line 16
    invoke-virtual {v0, v1, p1, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public setCenterTextString(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->c:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setTopTextString(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->b:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->b:Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->c:Landroid/widget/TextView;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 13
    .line 14
    .line 15
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->d:Landroid/widget/TextView;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 20
    .line 21
    .line 22
    :cond_2
    return-void
.end method
