.class public final synthetic Landroidx/navigation/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Landroidx/navigation/k;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/navigation/k;->b:I

    iput-object p2, p0, Landroidx/navigation/k;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p3, p0, Landroidx/navigation/k;->a:I

    iput-object p1, p0, Landroidx/navigation/k;->c:Ljava/lang/Object;

    iput p2, p0, Landroidx/navigation/k;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 10

    .line 1
    iget v0, p0, Landroidx/navigation/k;->a:I

    .line 2
    .line 3
    const-string/jumbo v1, "topicId"

    .line 4
    .line 5
    .line 6
    const-string v2, "bookId"

    .line 7
    .line 8
    iget v3, p0, Landroidx/navigation/k;->b:I

    .line 9
    .line 10
    iget-object v4, p0, Landroidx/navigation/k;->c:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v4, Lcom/zykj/view/widget/customColor/CustomColorLayout;

    .line 16
    .line 17
    invoke-static {v4, v3, p1}, Lcom/zykj/view/widget/customColor/CustomColorLayout;->a(Lcom/zykj/view/widget/customColor/CustomColorLayout;ILandroid/view/View;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    check-cast v4, Lcom/zykj/mistake/adapter/SketchMaterialAdapter;

    .line 22
    .line 23
    iget-object p1, v4, Lcom/zykj/mistake/adapter/SketchMaterialAdapter;->b:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lg4/b;

    .line 30
    .line 31
    iget-object p1, p1, Lg4/b;->c:Lr6/a;

    .line 32
    .line 33
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_1
    check-cast v4, Lcom/zykj/mistake/adapter/MistakeListAdapter;

    .line 38
    .line 39
    iget-boolean p1, v4, Lcom/zykj/mistake/adapter/MistakeListAdapter;->d:Z

    .line 40
    .line 41
    iget-object v0, v4, Lcom/zykj/mistake/adapter/MistakeListAdapter;->c:Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 42
    .line 43
    iget-object v5, v4, Lcom/zykj/mistake/adapter/MistakeListAdapter;->b:Ljava/util/ArrayList;

    .line 44
    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 52
    .line 53
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 58
    .line 59
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->isSelected()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    xor-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    invoke-virtual {p1, v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->setSelected(Z)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 69
    .line 70
    .line 71
    iget-object p1, v0, Lcom/zykj/mistake/activity/MistakeListActivity;->s:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_0

    .line 82
    .line 83
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_1

    .line 103
    .line 104
    invoke-virtual {v0}, Lcom/zykj/mistake/activity/MistakeListActivity;->v()V

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/mistake/activity/MistakeListActivity;->w()V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    new-instance p1, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 118
    .line 119
    .line 120
    iget-object v4, v0, Lcom/zykj/mistake/activity/MistakeListActivity;->e:Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    const/4 v6, 0x0

    .line 127
    move v7, v6

    .line 128
    :goto_1
    if-ge v7, v5, :cond_3

    .line 129
    .line 130
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    add-int/lit8 v7, v7, 0x1

    .line 135
    .line 136
    check-cast v8, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 137
    .line 138
    new-instance v9, Lcom/google/gson/g;

    .line 139
    .line 140
    invoke-direct {v9}, Lcom/google/gson/g;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v9, v8}, Lcom/google/gson/g;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_3
    iget-wide v4, v0, Lcom/zykj/mistake/activity/MistakeListActivity;->q:J

    .line 152
    .line 153
    iget-wide v7, v0, Lcom/zykj/mistake/activity/MistakeListActivity;->r:J

    .line 154
    .line 155
    new-instance v9, Landroid/os/Bundle;

    .line 156
    .line 157
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v9, v2, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v9, v1, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 164
    .line 165
    .line 166
    const-string v1, "mistakeList"

    .line 167
    .line 168
    invoke-virtual {v9, v1, p1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 169
    .line 170
    .line 171
    const-string p1, "position"

    .line 172
    .line 173
    invoke-virtual {v9, p1, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 174
    .line 175
    .line 176
    new-instance p1, Landroid/content/Intent;

    .line 177
    .line 178
    const-class v1, Lcom/zykj/mistake/activity/MistakeDetailActivity;

    .line 179
    .line 180
    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, v9}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, p1, v6}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 187
    .line 188
    .line 189
    :goto_2
    return-void

    .line 190
    :pswitch_2
    check-cast v4, Lcom/zykj/mistake/adapter/MainLessonAdapter;

    .line 191
    .line 192
    iget-object p1, v4, Lcom/zykj/mistake/adapter/MainLessonAdapter;->c:Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;

    .line 193
    .line 194
    iget-object v0, p1, Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;->e:Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    check-cast v4, Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;

    .line 201
    .line 202
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;->getTopic()Lcom/zykj/mistake/entity/resp/MistakeBookResp$TopicInfo;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeBookResp$TopicInfo;->getContent()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    const/4 v5, 0x4

    .line 211
    const-string v6, "MainSubjectCard"

    .line 212
    .line 213
    invoke-static {v5, v6, v4}, Lcom/zykj/mistake/utils/e;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    sget v4, Lcom/zykj/mistake/activity/MistakeListActivity;->x:I

    .line 217
    .line 218
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    const-string/jumbo v4, "requireActivity(...)"

    .line 223
    .line 224
    .line 225
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    check-cast v4, Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;

    .line 233
    .line 234
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;->getTopic()Lcom/zykj/mistake/entity/resp/MistakeBookResp$TopicInfo;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeBookResp$TopicInfo;->getContent()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    check-cast v5, Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;

    .line 247
    .line 248
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;->getId()J

    .line 249
    .line 250
    .line 251
    move-result-wide v5

    .line 252
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    check-cast v0, Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;

    .line 257
    .line 258
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;->getTopic()Lcom/zykj/mistake/entity/resp/MistakeBookResp$TopicInfo;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/resp/MistakeBookResp$TopicInfo;->getId()J

    .line 263
    .line 264
    .line 265
    move-result-wide v7

    .line 266
    const-string v0, "name"

    .line 267
    .line 268
    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    new-instance v3, Landroid/os/Bundle;

    .line 272
    .line 273
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3, v0, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v3, v2, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v3, v1, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 283
    .line 284
    .line 285
    new-instance v0, Landroid/content/Intent;

    .line 286
    .line 287
    const-class v1, Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 288
    .line 289
    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0, v3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 293
    .line 294
    .line 295
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 296
    .line 297
    .line 298
    return-void

    .line 299
    :pswitch_3
    check-cast v4, Lcom/zykj/view/board/play/PlaySettingAdapter;

    .line 300
    .line 301
    invoke-static {v4, v3, p1}, Lcom/zykj/view/board/play/PlaySettingAdapter;->a(Lcom/zykj/view/board/play/PlaySettingAdapter;ILandroid/view/View;)V

    .line 302
    .line 303
    .line 304
    return-void

    .line 305
    :pswitch_4
    check-cast v4, Landroid/os/Bundle;

    .line 306
    .line 307
    invoke-static {v3, v4, p1}, Landroidx/navigation/Navigation;->d(ILandroid/os/Bundle;Landroid/view/View;)V

    .line 308
    .line 309
    .line 310
    return-void

    .line 311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
