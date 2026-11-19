.class public final Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$4$1;
.super Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic f:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;


# direct methods
.method public constructor <init>(Lt0/a;Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$4$1;->f:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;-><init>(Lt0/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getMovementFlags(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)I
    .locals 1

    .line 1
    const-string v0, "recyclerView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "viewHolder"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x3

    .line 12
    const/4 p2, 0x0

    .line 13
    invoke-static {p1, p2}, Landroidx/recyclerview/widget/ItemTouchHelper$Callback;->makeMovementFlags(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public onChildDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;FFIZ)V
    .locals 8

    .line 1
    const-string v0, "c"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "recyclerView"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "viewHolder"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    if-ne p6, v0, :cond_4

    .line 18
    .line 19
    if-eqz p7, :cond_4

    .line 20
    .line 21
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getItemViewType()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x1

    .line 26
    if-ne v0, v1, :cond_4

    .line 27
    .line 28
    iget-object v0, p3, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    int-to-float v0, v0

    .line 35
    add-float/2addr v0, p5

    .line 36
    iget-object v2, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$4$1;->f:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->b0()Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const/4 v3, 0x0

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    :goto_0
    if-ge v3, v2, :cond_4

    .line 53
    .line 54
    iget-object v4, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$4$1;->f:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 55
    .line 56
    invoke-virtual {p2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v4, v5}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->y0(Landroid/view/View;)V

    .line 61
    .line 62
    .line 63
    iget-object v4, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$4$1;->f:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 64
    .line 65
    invoke-virtual {v4}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->b0()Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-static {v4}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, v4}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    iget-object v5, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$4$1;->f:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 77
    .line 78
    invoke-virtual {v5}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->b0()Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    iget-object v6, p3, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 83
    .line 84
    invoke-static {v5, v6}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-nez v5, :cond_2

    .line 89
    .line 90
    iget-object v5, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$4$1;->f:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 91
    .line 92
    invoke-static {v5}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->F(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/adapter/CatalogEditAdapter;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    invoke-virtual {v5, v6}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemViewType(I)I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-eq v5, v1, :cond_2

    .line 105
    .line 106
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    sub-int/2addr v5, v6

    .line 115
    invoke-static {v5}, Ljava/lang/StrictMath;->abs(I)I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-ne v5, v1, :cond_3

    .line 120
    .line 121
    iget-object v5, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$4$1;->f:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 122
    .line 123
    invoke-virtual {v5}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->b0()Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-static {v5}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    int-to-float v5, v5

    .line 135
    sub-float/2addr v5, v0

    .line 136
    invoke-static {v5}, Ljava/lang/StrictMath;->abs(F)F

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    const/high16 v6, 0x41a00000    # 20.0f

    .line 141
    .line 142
    cmpg-float v5, v5, v6

    .line 143
    .line 144
    if-ltz v5, :cond_1

    .line 145
    .line 146
    iget-object v5, p3, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 147
    .line 148
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    int-to-float v5, v5

    .line 153
    add-float/2addr v5, p5

    .line 154
    iget-object v7, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$4$1;->f:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 155
    .line 156
    invoke-virtual {v7}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->b0()Landroid/view/View;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    invoke-static {v7}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v7}, Landroid/view/View;->getBottom()I

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    int-to-float v7, v7

    .line 168
    sub-float/2addr v5, v7

    .line 169
    invoke-static {v5}, Ljava/lang/StrictMath;->abs(F)F

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    cmpg-float v5, v5, v6

    .line 174
    .line 175
    if-gez v5, :cond_3

    .line 176
    .line 177
    :cond_1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$4$1;->f:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 178
    .line 179
    new-instance v1, Lkotlin/Pair;

    .line 180
    .line 181
    invoke-static {v0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->F(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/adapter/CatalogEditAdapter;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    invoke-virtual {v2, v3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    check-cast v2, Lcom/zykj/study/bean/course/CatalogBean;

    .line 194
    .line 195
    iget-object v3, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$4$1;->f:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 196
    .line 197
    invoke-static {v3}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->F(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/adapter/CatalogEditAdapter;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    invoke-virtual {v3, v4}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    check-cast v3, Lcom/zykj/study/bean/course/CatalogBean;

    .line 210
    .line 211
    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, v1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->z0(Lkotlin/Pair;)V

    .line 215
    .line 216
    .line 217
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$4$1;->f:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 218
    .line 219
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->b0()Landroid/view/View;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    if-eqz v0, :cond_4

    .line 224
    .line 225
    const-string v1, "#664876FF"

    .line 226
    .line 227
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 232
    .line 233
    .line 234
    goto :goto_1

    .line 235
    :cond_2
    iget-object v4, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$4$1;->f:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 236
    .line 237
    new-instance v5, Lkotlin/Pair;

    .line 238
    .line 239
    const/4 v6, 0x0

    .line 240
    invoke-direct {v5, v6, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v4, v5}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->z0(Lkotlin/Pair;)V

    .line 244
    .line 245
    .line 246
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 247
    .line 248
    goto/16 :goto_0

    .line 249
    .line 250
    :cond_4
    :goto_1
    invoke-super/range {p0 .. p7}, Landroidx/recyclerview/widget/ItemTouchHelper$Callback;->onChildDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;FFIZ)V

    .line 251
    .line 252
    .line 253
    return-void
.end method

.method public onMove(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z
    .locals 1

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "source"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "target"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method
