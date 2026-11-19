.class public final Lra/a;
.super Lq1/a;
.source "SourceFile"


# instance fields
.field public final e:I

.field public final f:I

.field public final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lq1/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lra/a;->e:I

    .line 5
    .line 6
    iput p2, p0, Lra/a;->f:I

    .line 7
    .line 8
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenWidth()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    int-to-float p1, p1

    .line 13
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    sget v0, Lcom/zykj/cloudhelper/R$dimen;->view_18:I

    .line 22
    .line 23
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    sub-float/2addr p1, p2

    .line 28
    float-to-int p1, p1

    .line 29
    iput p1, p0, Lra/a;->g:I

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ln1/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lra/a;->t(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ln1/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic b(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V
    .locals 0

    .line 1
    check-cast p2, Ln1/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lra/a;->u(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ln1/b;Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public g()I
    .locals 1

    .line 1
    iget v0, p0, Lra/a;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Lra/a;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public t(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ln1/b;)V
    .locals 6

    .line 1
    const-string v0, "helper"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "item"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    instance-of v0, p2, Lua/a;

    .line 12
    .line 13
    if-eqz v0, :cond_4

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->f()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget v1, Lcom/zykj/cloudhelper/R$dimen;->view_18:I

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    float-to-int v0, v0

    .line 30
    sget v1, Lcom/zykj/cloudhelper/R$id;->ll_item:I

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Landroid/widget/LinearLayout;

    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-string v2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams"

    .line 43
    .line 44
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 48
    .line 49
    iget v2, p0, Lra/a;->g:I

    .line 50
    .line 51
    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 52
    .line 53
    check-cast p2, Lua/a;

    .line 54
    .line 55
    invoke-virtual {p2}, Lua/a;->e()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    mul-int/2addr v2, v0

    .line 60
    const/4 v0, 0x0

    .line 61
    invoke-virtual {v1, v2, v0, v0, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 62
    .line 63
    .line 64
    sget v2, Lcom/zykj/cloudhelper/R$id;->ll_item:I

    .line 65
    .line 66
    invoke-virtual {p1, v2}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Landroid/widget/LinearLayout;

    .line 71
    .line 72
    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2}, Lua/a;->d()Lcom/friday/common/entity/NoteBean;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    sget v2, Lcom/zykj/cloudhelper/R$id;->iv_status:I

    .line 80
    .line 81
    invoke-virtual {p1, v2}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Landroid/widget/ImageView;

    .line 86
    .line 87
    sget v3, Lcom/zykj/cloudhelper/R$id;->iv_icon:I

    .line 88
    .line 89
    invoke-virtual {p1, v3}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    check-cast v3, Landroid/widget/ImageView;

    .line 94
    .line 95
    sget v4, Lcom/zykj/cloudhelper/R$id;->tv_file_name:I

    .line 96
    .line 97
    invoke-virtual {v1}, Lcom/friday/common/entity/NoteBean;->getFileName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-virtual {p1, v4, v5}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 102
    .line 103
    .line 104
    sget-object v4, Lk2/n;->a:Lk2/n$a;

    .line 105
    .line 106
    invoke-virtual {v1}, Lcom/friday/common/entity/NoteBean;->getType()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-virtual {v4, v5}, Lk2/n$a;->d(Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Lcom/friday/common/entity/NoteBean;->getType()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    const-string v4, "0"

    .line 122
    .line 123
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    const/4 v4, -0x1

    .line 128
    if-eqz v3, :cond_2

    .line 129
    .line 130
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2}, Lua/a;->a()Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    check-cast v1, Ljava/util/Collection;

    .line 138
    .line 139
    if-eqz v1, :cond_1

    .line 140
    .line 141
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-eqz v1, :cond_0

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_0
    sget v0, Lcom/zykj/cloudhelper/R$drawable;->selector_item_expand_collapse:I

    .line 149
    .line 150
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2}, Ln1/a;->b()Z

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    invoke-virtual {v2, p2}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_1
    :goto_0
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 162
    .line 163
    .line 164
    :goto_1
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 165
    .line 166
    invoke-virtual {p1, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_2
    const/4 p2, 0x4

    .line 171
    invoke-virtual {v2, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1}, Lcom/friday/common/entity/NoteBean;->isSelected()Z

    .line 175
    .line 176
    .line 177
    move-result p2

    .line 178
    if-eqz p2, :cond_3

    .line 179
    .line 180
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 181
    .line 182
    const-string p2, "#80999999"

    .line 183
    .line 184
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    move-result p2

    .line 188
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :cond_3
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 193
    .line 194
    invoke-virtual {p1, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 195
    .line 196
    .line 197
    :cond_4
    return-void
.end method

.method public u(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ln1/b;Ljava/util/List;)V
    .locals 2

    .line 1
    const-string v0, "helper"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "item"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "payloads"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    instance-of v1, v0, Ljava/lang/Integer;

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    const/16 v1, 0x6e

    .line 35
    .line 36
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    invoke-virtual {p0, p1, p2, v0}, Lra/a;->v(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ln1/b;Z)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    return-void
.end method

.method public final v(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ln1/b;Z)V
    .locals 3

    .line 1
    const-string v0, "null cannot be cast to non-null type com.zykj.cloudhelper.entity.NoteHelperNode"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p2, Lua/a;

    .line 7
    .line 8
    sget v0, Lcom/zykj/cloudhelper/R$id;->iv_status:I

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroid/widget/ImageView;

    .line 15
    .line 16
    invoke-virtual {p2}, Ln1/a;->b()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const-wide/16 v1, 0xc8

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    if-eqz p3, :cond_0

    .line 26
    .line 27
    invoke-static {p1}, Landroidx/core/view/ViewCompat;->animate(Landroid/view/View;)Landroidx/core/view/ViewPropertyAnimatorCompat;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    invoke-virtual {p3, v1, v2}, Landroidx/core/view/ViewPropertyAnimatorCompat;->setDuration(J)Landroidx/core/view/ViewPropertyAnimatorCompat;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    .line 36
    .line 37
    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p3, v1}, Landroidx/core/view/ViewPropertyAnimatorCompat;->setInterpolator(Landroid/view/animation/Interpolator;)Landroidx/core/view/ViewPropertyAnimatorCompat;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    invoke-virtual {p3, v0}, Landroidx/core/view/ViewPropertyAnimatorCompat;->rotation(F)Landroidx/core/view/ViewPropertyAnimatorCompat;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    invoke-virtual {p3}, Landroidx/core/view/ViewPropertyAnimatorCompat;->start()V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setRotation(F)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    const/high16 v0, 0x42b40000    # 90.0f

    .line 57
    .line 58
    if-eqz p3, :cond_2

    .line 59
    .line 60
    invoke-static {p1}, Landroidx/core/view/ViewCompat;->animate(Landroid/view/View;)Landroidx/core/view/ViewPropertyAnimatorCompat;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    invoke-virtual {p3, v1, v2}, Landroidx/core/view/ViewPropertyAnimatorCompat;->setDuration(J)Landroidx/core/view/ViewPropertyAnimatorCompat;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    .line 69
    .line 70
    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p3, v1}, Landroidx/core/view/ViewPropertyAnimatorCompat;->setInterpolator(Landroid/view/animation/Interpolator;)Landroidx/core/view/ViewPropertyAnimatorCompat;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    invoke-virtual {p3, v0}, Landroidx/core/view/ViewPropertyAnimatorCompat;->rotation(F)Landroidx/core/view/ViewPropertyAnimatorCompat;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    invoke-virtual {p3}, Landroidx/core/view/ViewPropertyAnimatorCompat;->start()V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    invoke-virtual {p1, v0}, Landroid/view/View;->setRotation(F)V

    .line 86
    .line 87
    .line 88
    :goto_0
    invoke-virtual {p2}, Ln1/a;->b()Z

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 93
    .line 94
    .line 95
    return-void
.end method
