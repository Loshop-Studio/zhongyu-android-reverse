.class public final Lcom/zykj/mistake/adapter/MistakeListAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/zykj/mistake/adapter/MistakeListAdapter;",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;",
        "ViewHolder",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeListAdapter.kt\ncom/zykj/mistake/adapter/MistakeListAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,188:1\n1869#2,2:189\n1869#2,2:191\n*S KotlinDebug\n*F\n+ 1 MistakeListAdapter.kt\ncom/zykj/mistake/adapter/MistakeListAdapter\n*L\n113#1:189,2\n144#1:191,2\n*E\n"
    }
.end annotation


# instance fields
.field public a:Lcom/zykj/mistake/activity/MistakeListActivity;

.field public b:Ljava/util/ArrayList;

.field public c:Lcom/zykj/mistake/activity/MistakeListActivity;

.field public d:Z


# virtual methods
.method public final a(ZLjava/lang/Integer;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/adapter/MistakeListAdapter;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    iput-boolean p1, p0, Lcom/zykj/mistake/adapter/MistakeListAdapter;->d:Z

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    if-ge v2, p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    check-cast v3, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 22
    .line 23
    invoke-virtual {v3, v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->setSelected(Z)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-eqz p2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    check-cast p2, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->isSelected()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    xor-int/lit8 p1, p1, 0x1

    .line 50
    .line 51
    invoke-virtual {p2, p1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->setSelected(Z)V

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final b(ILjava/lang/String;)Landroid/view/View;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/adapter/MistakeListAdapter;->a:Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget v1, Lcom/zykj/mistake/R$layout;->item_mistake_tag_little:I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget v1, Lcom/zykj/mistake/R$id;->tv_item_tag_content:I

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroid/widget/TextView;

    .line 21
    .line 22
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    const/4 p2, -0x1

    .line 26
    if-eq p1, p2, :cond_3

    .line 27
    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    const/4 p2, 0x1

    .line 31
    if-eq p1, p2, :cond_1

    .line 32
    .line 33
    const/4 p2, 0x2

    .line 34
    if-eq p1, p2, :cond_0

    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_0
    sget p1, Lcom/zykj/mistake/R$drawable;->bg_tag_red:I

    .line 38
    .line 39
    invoke-virtual {v1, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_1
    sget p1, Lcom/zykj/mistake/R$drawable;->bg_tag_yellow:I

    .line 44
    .line 45
    invoke-virtual {v1, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    sget p1, Lcom/zykj/mistake/R$drawable;->bg_tag_green:I

    .line 50
    .line 51
    invoke-virtual {v1, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_3
    sget p1, Lcom/zykj/mistake/R$drawable;->bg_blue_corner:I

    .line 56
    .line 57
    invoke-virtual {v1, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 58
    .line 59
    .line 60
    return-object v0
.end method

.method public final c(Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;I)V
    .locals 11

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;->a:Landroidx/cardview/widget/CardView;

    .line 7
    .line 8
    iget-object v1, p1, Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;->f:Landroid/widget/RelativeLayout;

    .line 9
    .line 10
    iget-object v2, p1, Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;->e:Landroid/widget/LinearLayout;

    .line 11
    .line 12
    iget-object v3, p1, Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;->b:Landroid/widget/TextView;

    .line 13
    .line 14
    iget-object v4, p0, Lcom/zykj/mistake/adapter/MistakeListAdapter;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v4, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    check-cast v5, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 21
    .line 22
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getRealTitle()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    iget-object v3, p1, Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;->c:Landroid/widget/ImageView;

    .line 30
    .line 31
    sget-object v5, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 32
    .line 33
    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 34
    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-static {v5}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v4, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    check-cast v6, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 53
    .line 54
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getStemShoot()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-virtual {v5, v6}, Lcom/bumptech/glide/h;->l(Ljava/lang/String;)Lcom/bumptech/glide/f;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    sget-object v6, Lb0/o;->a:Lb0/m;

    .line 63
    .line 64
    invoke-virtual {v5, v6}, Lr0/a;->g(Lb0/o;)Lr0/a;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    check-cast v5, Lcom/bumptech/glide/f;

    .line 69
    .line 70
    sget v6, Lcom/zykj/mistake/R$mipmap;->pic_error:I

    .line 71
    .line 72
    invoke-virtual {v5, v6}, Lr0/a;->h(I)Lr0/a;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    check-cast v5, Lcom/bumptech/glide/f;

    .line 77
    .line 78
    new-instance v6, Lcom/zykj/mistake/adapter/a;

    .line 79
    .line 80
    invoke-direct {v6, p1, v3}, Lcom/zykj/mistake/adapter/a;-><init>(Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;Landroid/widget/ImageView;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v5, v6}, Lcom/bumptech/glide/f;->z(Ls0/i;)V

    .line 84
    .line 85
    .line 86
    iget-object v3, p1, Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;->d:Landroid/widget/TextView;

    .line 87
    .line 88
    invoke-virtual {v4, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    check-cast v5, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 93
    .line 94
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getCreationTime()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    const-string v6, ""

    .line 99
    .line 100
    if-nez v5, :cond_0

    .line 101
    .line 102
    move-object v5, v6

    .line 103
    :cond_0
    const-string v7, " "

    .line 104
    .line 105
    invoke-static {v5, v7}, Lkotlin/text/p;->g0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    check-cast v3, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 120
    .line 121
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getDiff()Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    const/4 v5, 0x0

    .line 126
    if-eqz v3, :cond_1

    .line 127
    .line 128
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    goto :goto_0

    .line 133
    :cond_1
    move v3, v5

    .line 134
    :goto_0
    invoke-virtual {v4, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    check-cast v7, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 139
    .line 140
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getAttainedLevel()Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    if-eqz v7, :cond_2

    .line 145
    .line 146
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    goto :goto_1

    .line 151
    :cond_2
    move v7, v5

    .line 152
    :goto_1
    invoke-virtual {v4, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    check-cast v8, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 157
    .line 158
    invoke-virtual {v8}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getErrorReason()Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    if-eqz v8, :cond_3

    .line 163
    .line 164
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    goto :goto_2

    .line 169
    :cond_3
    move v8, v5

    .line 170
    :goto_2
    const/4 v9, 0x1

    .line 171
    if-eqz v3, :cond_5

    .line 172
    .line 173
    sget-object v10, Lcom/zykj/mistake/utils/d;->a:[Ljava/lang/String;

    .line 174
    .line 175
    sub-int/2addr v3, v9

    .line 176
    invoke-static {v3, v10}, Lkotlin/collections/q;->V(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    check-cast v3, Ljava/lang/String;

    .line 181
    .line 182
    if-nez v3, :cond_4

    .line 183
    .line 184
    move-object v3, v6

    .line 185
    :cond_4
    invoke-virtual {p0, v5, v3}, Lcom/zykj/mistake/adapter/MistakeListAdapter;->b(ILjava/lang/String;)Landroid/view/View;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 190
    .line 191
    .line 192
    :cond_5
    if-eqz v7, :cond_7

    .line 193
    .line 194
    sget-object v3, Lcom/zykj/mistake/utils/d;->b:[Ljava/lang/String;

    .line 195
    .line 196
    sub-int/2addr v7, v9

    .line 197
    invoke-static {v7, v3}, Lkotlin/collections/q;->V(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    check-cast v3, Ljava/lang/String;

    .line 202
    .line 203
    if-nez v3, :cond_6

    .line 204
    .line 205
    move-object v3, v6

    .line 206
    :cond_6
    invoke-virtual {p0, v9, v3}, Lcom/zykj/mistake/adapter/MistakeListAdapter;->b(ILjava/lang/String;)Landroid/view/View;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 211
    .line 212
    .line 213
    :cond_7
    if-eqz v8, :cond_9

    .line 214
    .line 215
    sget-object v3, Lcom/zykj/mistake/utils/d;->c:[Ljava/lang/String;

    .line 216
    .line 217
    sub-int/2addr v8, v9

    .line 218
    invoke-static {v8, v3}, Lkotlin/collections/q;->V(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    check-cast v3, Ljava/lang/String;

    .line 223
    .line 224
    if-nez v3, :cond_8

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_8
    move-object v6, v3

    .line 228
    :goto_3
    const/4 v3, 0x2

    .line 229
    invoke-virtual {p0, v3, v6}, Lcom/zykj/mistake/adapter/MistakeListAdapter;->b(ILjava/lang/String;)Landroid/view/View;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 234
    .line 235
    .line 236
    :cond_9
    invoke-virtual {v4, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    check-cast v3, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 241
    .line 242
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getTagNames()Ljava/util/ArrayList;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    if-nez v3, :cond_a

    .line 247
    .line 248
    sget-object v3, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 249
    .line 250
    :cond_a
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 255
    .line 256
    .line 257
    move-result v6

    .line 258
    if-eqz v6, :cond_b

    .line 259
    .line 260
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    check-cast v6, Ljava/lang/String;

    .line 265
    .line 266
    const/4 v7, -0x1

    .line 267
    invoke-virtual {p0, v7, v6}, Lcom/zykj/mistake/adapter/MistakeListAdapter;->b(ILjava/lang/String;)Landroid/view/View;

    .line 268
    .line 269
    .line 270
    move-result-object v6

    .line 271
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 272
    .line 273
    .line 274
    goto :goto_4

    .line 275
    :cond_b
    iget-boolean v2, p0, Lcom/zykj/mistake/adapter/MistakeListAdapter;->d:Z

    .line 276
    .line 277
    const/16 v3, 0x8

    .line 278
    .line 279
    if-eqz v2, :cond_c

    .line 280
    .line 281
    move v2, v5

    .line 282
    goto :goto_5

    .line 283
    :cond_c
    move v2, v3

    .line 284
    :goto_5
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v4, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    check-cast v2, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 292
    .line 293
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->isSelected()Z

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    invoke-virtual {v1, v2}, Landroid/view/View;->setSelected(Z)V

    .line 298
    .line 299
    .line 300
    iget-object p1, p1, Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;->g:Landroid/widget/TextView;

    .line 301
    .line 302
    invoke-virtual {v4, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    check-cast v1, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 307
    .line 308
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->isSelected()Z

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    if-eqz v1, :cond_d

    .line 313
    .line 314
    goto :goto_6

    .line 315
    :cond_d
    move v5, v3

    .line 316
    :goto_6
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 317
    .line 318
    .line 319
    new-instance p1, Landroidx/navigation/k;

    .line 320
    .line 321
    const/4 v1, 0x3

    .line 322
    invoke-direct {p1, p0, p2, v1}, Landroidx/navigation/k;-><init>(Ljava/lang/Object;II)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 326
    .line 327
    .line 328
    new-instance p1, Lg4/a;

    .line 329
    .line 330
    invoke-direct {p1, p0, p2}, Lg4/a;-><init>(Lcom/zykj/mistake/adapter/MistakeListAdapter;I)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 334
    .line 335
    .line 336
    return-void
.end method

.method public final getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/adapter/MistakeListAdapter;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/adapter/MistakeListAdapter;->c(Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;I)V

    return-void
.end method

.method public final onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V
    .locals 1

    .line 2
    check-cast p1, Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;

    .line 3
    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payloads"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/adapter/MistakeListAdapter;->c(Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;I)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 2

    .line 1
    const-string p2, "parent"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;

    .line 7
    .line 8
    iget-object p2, p0, Lcom/zykj/mistake/adapter/MistakeListAdapter;->a:Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 9
    .line 10
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    sget v0, Lcom/zykj/mistake/R$layout;->item_mistake_list:I

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {p2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    const-string v0, "inflate(...)"

    .line 22
    .line 23
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p1, p2}, Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;-><init>(Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    return-object p1
.end method
