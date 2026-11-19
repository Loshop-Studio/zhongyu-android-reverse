.class public Lcom/xuexiang/xui/widget/tabbar/TabSegment$j;
.super Lk9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/tabbar/TabSegment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "j"
.end annotation


# instance fields
.field public final synthetic e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$j;->e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lk9/a;-><init>(Landroid/view/ViewGroup;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;

    .line 2
    .line 3
    check-cast p2, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$j;->k(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public bridge synthetic d(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$j;->l(Landroid/view/ViewGroup;)Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public k(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;I)V
    .locals 8

    .line 1
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->getTextView()Landroid/widget/TextView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$j;->e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v1, v0, v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/widget/TextView;Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->e()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-lez v3, :cond_1

    .line 22
    .line 23
    sget v3, Lcom/xuexiang/xui/R$id;->xui_view_can_not_cache_tag:I

    .line 24
    .line 25
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {p2, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Landroid/view/View;

    .line 45
    .line 46
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-nez v4, :cond_0

    .line 51
    .line 52
    invoke-virtual {p2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$j;->e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 57
    .line 58
    invoke-static {v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->l(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    const/4 v3, 0x1

    .line 63
    if-ne v1, v3, :cond_5

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->f()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, Landroid/widget/RelativeLayout$LayoutParams;

    .line 74
    .line 75
    and-int/lit8 v5, v1, 0x3

    .line 76
    .line 77
    const/4 v6, 0x3

    .line 78
    const/4 v7, -0x1

    .line 79
    if-ne v5, v6, :cond_2

    .line 80
    .line 81
    move v5, v7

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move v5, v2

    .line 84
    :goto_1
    const/16 v6, 0x9

    .line 85
    .line 86
    invoke-virtual {v4, v6, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 87
    .line 88
    .line 89
    and-int/lit8 v5, v1, 0x11

    .line 90
    .line 91
    const/16 v6, 0x11

    .line 92
    .line 93
    if-ne v5, v6, :cond_3

    .line 94
    .line 95
    move v5, v7

    .line 96
    goto :goto_2

    .line 97
    :cond_3
    move v5, v2

    .line 98
    :goto_2
    const/16 v6, 0xe

    .line 99
    .line 100
    invoke-virtual {v4, v6, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 101
    .line 102
    .line 103
    const/4 v5, 0x5

    .line 104
    and-int/2addr v1, v5

    .line 105
    if-ne v1, v5, :cond_4

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_4
    move v7, v2

    .line 109
    :goto_3
    const/16 v1, 0xb

    .line 110
    .line 111
    invoke-virtual {v4, v1, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 115
    .line 116
    .line 117
    :cond_5
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->l()Ljava/lang/CharSequence;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    .line 123
    .line 124
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$j;->e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 125
    .line 126
    invoke-static {v1, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->m(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    int-to-float v1, v1

    .line 131
    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 132
    .line 133
    .line 134
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$j;->e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 135
    .line 136
    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->e(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-ne v0, p3, :cond_6

    .line 141
    .line 142
    move v2, v3

    .line 143
    :cond_6
    invoke-virtual {p2, p1, v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->b(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;Z)V

    .line 144
    .line 145
    .line 146
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {p2, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$j;->e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 154
    .line 155
    iget-object p1, p1, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->v:Landroid/view/View$OnClickListener;

    .line 156
    .line 157
    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 158
    .line 159
    .line 160
    return-void
.end method

.method public l(Landroid/view/ViewGroup;)Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;
    .locals 2

    .line 1
    new-instance p1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$j;->e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {p1, v0, v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method
