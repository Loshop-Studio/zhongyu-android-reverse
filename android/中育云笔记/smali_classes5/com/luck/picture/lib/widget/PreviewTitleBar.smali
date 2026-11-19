.class public Lcom/luck/picture/lib/widget/PreviewTitleBar;
.super Lcom/luck/picture/lib/widget/TitleBar;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/luck/picture/lib/widget/TitleBar;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/luck/picture/lib/widget/TitleBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/luck/picture/lib/widget/TitleBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/luck/picture/lib/widget/TitleBar;->d()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lz6/a;->d()Lcom/luck/picture/lib/style/TitleBarStyle;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->b()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v1}, La7/o;->c(I)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->b()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {p0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->h()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-static {v1}, La7/o;->b(I)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->h()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {p0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 43
    .line 44
    .line 45
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->q()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-static {v1}, La7/o;->c(I)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    iget-object v1, p0, Lcom/luck/picture/lib/widget/TitleBar;->d:Landroid/widget/ImageView;

    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->q()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->c()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-static {v1}, La7/o;->c(I)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    iget-object v1, p0, Lcom/luck/picture/lib/widget/TitleBar;->d:Landroid/widget/ImageView;

    .line 76
    .line 77
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->c()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 82
    .line 83
    .line 84
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->c:Landroid/widget/RelativeLayout;

    .line 85
    .line 86
    const/4 v1, 0x0

    .line 87
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->j:Landroid/view/View;

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->c:Landroid/widget/RelativeLayout;

    .line 96
    .line 97
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 102
    .line 103
    const/16 v1, 0x11

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 106
    .line 107
    .line 108
    const/16 v1, 0xe

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->c:Landroid/widget/RelativeLayout;

    .line 114
    .line 115
    sget v1, Lcom/luck/picture/lib/R$drawable;->ps_ic_trans_1px:I

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 118
    .line 119
    .line 120
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->h:Landroid/widget/TextView;

    .line 121
    .line 122
    const/16 v1, 0x8

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->e:Landroid/widget/ImageView;

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 130
    .line 131
    .line 132
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->j:Landroid/view/View;

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 135
    .line 136
    .line 137
    return-void
.end method
