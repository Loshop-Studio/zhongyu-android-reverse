.class public final synthetic Lcom/zykj/mistake/activity/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/activity/l;->a:I

    iput-object p2, p0, Lcom/zykj/mistake/activity/l;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/zykj/mistake/activity/l;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/mistake/activity/MistakeListActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lcom/zykj/mistake/activity/l;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/activity/l;->c:Ljava/lang/Object;

    iput-object p2, p0, Lcom/zykj/mistake/activity/l;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/zykj/mistake/activity/l;->a:I

    .line 4
    .line 5
    const-string v2, "mMistakeTagDialog"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "$viewHolder"

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    const-string v6, "getString(...)"

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, -0x1

    .line 15
    iget-object v9, v0, Lcom/zykj/mistake/activity/l;->c:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v10, v0, Lcom/zykj/mistake/activity/l;->b:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast v10, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 23
    .line 24
    check-cast v9, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;

    .line 25
    .line 26
    invoke-static {v10, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v10}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-ne v1, v8, :cond_0

    .line 34
    .line 35
    return v3

    .line 36
    :cond_0
    invoke-virtual {v10}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getItemViewType()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    iget-object v3, v9, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->e:Ljava/lang/Object;

    .line 41
    .line 42
    invoke-interface {v3}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Landroid/util/SparseArray;

    .line 47
    .line 48
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    if-nez v2, :cond_1

    .line 53
    .line 54
    const-string v2, "it"

    .line 55
    .line 56
    move-object/from16 v3, p1

    .line 57
    .line 58
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object v2, v9, Lcom/chad/library/adapter/base/BaseQuickAdapter;->b:Ljava/util/List;

    .line 62
    .line 63
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    throw v7

    .line 67
    :cond_1
    new-instance v1, Ljava/lang/ClassCastException;

    .line 68
    .line 69
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 70
    .line 71
    .line 72
    throw v1

    .line 73
    :pswitch_0
    check-cast v10, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 74
    .line 75
    check-cast v9, Lcom/chad/library/adapter/base/BaseBinderAdapter;

    .line 76
    .line 77
    invoke-static {v10, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v10}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-ne v1, v8, :cond_2

    .line 85
    .line 86
    return v3

    .line 87
    :cond_2
    invoke-virtual {v10}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getItemViewType()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-virtual {v9, v1}, Lcom/chad/library/adapter/base/BaseBinderAdapter;->j(I)V

    .line 92
    .line 93
    .line 94
    throw v7

    .line 95
    :pswitch_1
    move-object v11, v9

    .line 96
    check-cast v11, Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 97
    .line 98
    check-cast v10, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 99
    .line 100
    iget-boolean v1, v11, Lcom/zykj/mistake/activity/MistakeListActivity;->w:Z

    .line 101
    .line 102
    if-nez v1, :cond_4

    .line 103
    .line 104
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-ne v1, v8, :cond_4

    .line 109
    .line 110
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v14

    .line 114
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 115
    .line 116
    .line 117
    move-result-wide v12

    .line 118
    iget-object v1, v11, Lcom/zykj/mistake/activity/MistakeListActivity;->h:Ll4/i;

    .line 119
    .line 120
    if-eqz v1, :cond_3

    .line 121
    .line 122
    sget v2, Lcom/zykj/mistake/R$string;->edit_mistake_tag:I

    .line 123
    .line 124
    invoke-virtual {v11, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    new-instance v10, Lcom/zykj/mistake/activity/n;

    .line 132
    .line 133
    const/4 v15, 0x2

    .line 134
    invoke-direct/range {v10 .. v15}, Lcom/zykj/mistake/activity/n;-><init>(Lcom/zykj/mistake/base/BaseMVPActivity;JLjava/lang/String;I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v2, v14, v10}, Ll4/i;->a(Ljava/lang/String;Ljava/lang/String;Lr6/c;)V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v7

    .line 145
    :cond_4
    :goto_0
    return v5

    .line 146
    :pswitch_2
    check-cast v10, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 147
    .line 148
    move-object v12, v9

    .line 149
    check-cast v12, Lcom/zykj/mistake/activity/MistakeDetailActivity;

    .line 150
    .line 151
    sget v1, Lcom/zykj/mistake/activity/MistakeDetailActivity;->s:I

    .line 152
    .line 153
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-ne v1, v8, :cond_6

    .line 158
    .line 159
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v15

    .line 163
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 164
    .line 165
    .line 166
    move-result-wide v13

    .line 167
    iget-object v1, v12, Lcom/zykj/mistake/activity/MistakeDetailActivity;->g:Ll4/i;

    .line 168
    .line 169
    if-eqz v1, :cond_5

    .line 170
    .line 171
    sget v2, Lcom/zykj/mistake/R$string;->edit_mistake_tag:I

    .line 172
    .line 173
    invoke-virtual {v12, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    new-instance v11, Lcom/zykj/mistake/activity/n;

    .line 181
    .line 182
    const/16 v16, 0x1

    .line 183
    .line 184
    invoke-direct/range {v11 .. v16}, Lcom/zykj/mistake/activity/n;-><init>(Lcom/zykj/mistake/base/BaseMVPActivity;JLjava/lang/String;I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v2, v15, v11}, Ll4/i;->a(Ljava/lang/String;Ljava/lang/String;Lr6/c;)V

    .line 188
    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw v7

    .line 195
    :cond_6
    :goto_1
    return v5

    .line 196
    :pswitch_3
    check-cast v10, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 197
    .line 198
    move-object v12, v9

    .line 199
    check-cast v12, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 200
    .line 201
    sget v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u:I

    .line 202
    .line 203
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-ne v1, v8, :cond_7

    .line 208
    .line 209
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v15

    .line 213
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 214
    .line 215
    .line 216
    move-result-wide v13

    .line 217
    iget-object v1, v12, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->j:Ld6/e;

    .line 218
    .line 219
    invoke-interface {v1}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    check-cast v1, Ll4/i;

    .line 224
    .line 225
    sget v2, Lcom/zykj/mistake/R$string;->edit_mistake_tag:I

    .line 226
    .line 227
    invoke-virtual {v12, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    new-instance v11, Lcom/zykj/mistake/activity/n;

    .line 235
    .line 236
    const/16 v16, 0x0

    .line 237
    .line 238
    invoke-direct/range {v11 .. v16}, Lcom/zykj/mistake/activity/n;-><init>(Lcom/zykj/mistake/base/BaseMVPActivity;JLjava/lang/String;I)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1, v2, v15, v11}, Ll4/i;->a(Ljava/lang/String;Ljava/lang/String;Lr6/c;)V

    .line 242
    .line 243
    .line 244
    :cond_7
    return v5

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
