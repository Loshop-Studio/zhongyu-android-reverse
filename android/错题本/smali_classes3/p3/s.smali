.class public abstract Lp3/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroidx/core/util/Pools$SimplePool;

.field public b:Ljava/util/ArrayList;

.field public c:Ljava/util/ArrayList;

.field public d:Lcom/xuexiang/xui/widget/tabbar/c;


# virtual methods
.method public final a(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lp3/s;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    :goto_0
    if-lez v1, :cond_3

    .line 8
    .line 9
    if-lez p1, :cond_3

    .line 10
    .line 11
    add-int/lit8 v2, v1, -0x1

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Landroid/view/View;

    .line 18
    .line 19
    iget-object v3, p0, Lp3/s;->a:Landroidx/core/util/Pools$SimplePool;

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    new-instance v3, Landroidx/core/util/Pools$SimplePool;

    .line 24
    .line 25
    const/16 v4, 0xc

    .line 26
    .line 27
    invoke-direct {v3, v4}, Landroidx/core/util/Pools$SimplePool;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object v3, p0, Lp3/s;->a:Landroidx/core/util/Pools$SimplePool;

    .line 31
    .line 32
    :cond_0
    sget v3, Lcom/xuexiang/xui/R$id;->xui_view_can_not_cache_tag:I

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    check-cast v3, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_2

    .line 47
    .line 48
    :cond_1
    :try_start_0
    iget-object v3, p0, Lp3/s;->a:Landroidx/core/util/Pools$SimplePool;

    .line 49
    .line 50
    invoke-interface {v3, v2}, Landroidx/core/util/Pools$Pool;->release(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    :catch_0
    :cond_2
    iget-object v3, p0, Lp3/s;->d:Lcom/xuexiang/xui/widget/tabbar/c;

    .line 54
    .line 55
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v1, v1, -0x1

    .line 59
    .line 60
    add-int/lit8 p1, p1, -0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    return-void
.end method

.method public final b(I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lp3/s;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    if-ltz p1, :cond_2

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-lt p1, v1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 21
    return-object p1
.end method

.method public final c()V
    .locals 14

    .line 1
    iget-object v0, p0, Lp3/s;->d:Lcom/xuexiang/xui/widget/tabbar/c;

    .line 2
    .line 3
    iget-object v1, p0, Lp3/s;->b:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget-object v3, p0, Lp3/s;->c:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const/4 v5, 0x0

    .line 16
    if-le v4, v2, :cond_0

    .line 17
    .line 18
    sub-int/2addr v4, v2

    .line 19
    invoke-virtual {p0, v4}, Lp3/s;->a(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    if-ge v4, v2, :cond_3

    .line 24
    .line 25
    move v6, v5

    .line 26
    :goto_0
    sub-int v7, v2, v4

    .line 27
    .line 28
    if-ge v6, v7, :cond_3

    .line 29
    .line 30
    iget-object v7, p0, Lp3/s;->a:Landroidx/core/util/Pools$SimplePool;

    .line 31
    .line 32
    if-eqz v7, :cond_1

    .line 33
    .line 34
    invoke-interface {v7}, Landroidx/core/util/Pools$Pool;->acquire()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    check-cast v7, Landroid/view/View;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/4 v7, 0x0

    .line 42
    :goto_1
    if-nez v7, :cond_2

    .line 43
    .line 44
    move-object v7, p0

    .line 45
    check-cast v7, Lcom/xuexiang/xui/widget/tabbar/d;

    .line 46
    .line 47
    new-instance v8, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 48
    .line 49
    iget-object v7, v7, Lcom/xuexiang/xui/widget/tabbar/d;->e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 50
    .line 51
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    invoke-direct {v8, v7, v9}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/content/Context;)V

    .line 56
    .line 57
    .line 58
    move-object v7, v8

    .line 59
    :cond_2
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    add-int/lit8 v6, v6, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    :goto_2
    move v4, v5

    .line 69
    :goto_3
    if-ge v4, v2, :cond_6

    .line 70
    .line 71
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    check-cast v6, Landroid/view/View;

    .line 76
    .line 77
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    move-object v8, p0

    .line 82
    check-cast v8, Lcom/xuexiang/xui/widget/tabbar/d;

    .line 83
    .line 84
    check-cast v7, Lp3/h;

    .line 85
    .line 86
    check-cast v6, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 87
    .line 88
    invoke-virtual {v6}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->getTextView()Landroid/widget/TextView;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    sget v10, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->B:I

    .line 93
    .line 94
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    iget-object v8, v8, Lcom/xuexiang/xui/widget/tabbar/d;->e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 98
    .line 99
    iget v10, v8, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->p:I

    .line 100
    .line 101
    const/4 v11, 0x1

    .line 102
    if-ne v10, v11, :cond_4

    .line 103
    .line 104
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    check-cast v10, Landroid/widget/RelativeLayout$LayoutParams;

    .line 109
    .line 110
    const/16 v12, 0x9

    .line 111
    .line 112
    invoke-virtual {v10, v12, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 113
    .line 114
    .line 115
    const/16 v12, 0xe

    .line 116
    .line 117
    const/4 v13, -0x1

    .line 118
    invoke-virtual {v10, v12, v13}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 119
    .line 120
    .line 121
    const/16 v12, 0xb

    .line 122
    .line 123
    invoke-virtual {v10, v12, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v9, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 127
    .line 128
    .line 129
    :cond_4
    iget-object v10, v7, Lp3/h;->c:Ljava/lang/CharSequence;

    .line 130
    .line 131
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 132
    .line 133
    .line 134
    iget v10, v8, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->e:I

    .line 135
    .line 136
    int-to-float v10, v10

    .line 137
    invoke-virtual {v9, v5, v10}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 138
    .line 139
    .line 140
    iget v9, v8, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:I

    .line 141
    .line 142
    if-ne v9, v4, :cond_5

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_5
    move v11, v5

    .line 146
    :goto_4
    invoke-virtual {v6, v7, v11}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->b(Lp3/h;Z)V

    .line 147
    .line 148
    .line 149
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    invoke-virtual {v6, v7}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    iget-object v7, v8, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->t:Lb1/c;

    .line 157
    .line 158
    invoke-virtual {v6, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 159
    .line 160
    .line 161
    add-int/lit8 v4, v4, 0x1

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_6
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 168
    .line 169
    .line 170
    return-void
.end method
