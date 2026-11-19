.class public final synthetic Lcom/zykj/mistake/activity/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/activity/o;->a:I

    iput-object p3, p0, Lcom/zykj/mistake/activity/o;->c:Ljava/lang/Object;

    iput-object p4, p0, Lcom/zykj/mistake/activity/o;->d:Ljava/lang/Object;

    iput-object p5, p0, Lcom/zykj/mistake/activity/o;->e:Ljava/lang/Object;

    iput p1, p0, Lcom/zykj/mistake/activity/o;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILandroid/widget/ImageView;Landroid/widget/ImageView;Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lcom/zykj/mistake/activity/o;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lcom/zykj/mistake/activity/o;->c:Ljava/lang/Object;

    iput p1, p0, Lcom/zykj/mistake/activity/o;->b:I

    iput-object p2, p0, Lcom/zykj/mistake/activity/o;->d:Ljava/lang/Object;

    iput-object p3, p0, Lcom/zykj/mistake/activity/o;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/zykj/mistake/activity/o;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lcom/zykj/mistake/activity/o;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 11
    .line 12
    iget-object v2, v0, Lcom/zykj/mistake/activity/o;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 15
    .line 16
    iget-object v3, v0, Lcom/zykj/mistake/activity/o;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Ljava/util/ArrayList;

    .line 19
    .line 20
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/list/e1;->j:Ljava/util/Set;

    .line 21
    .line 22
    iget-object v4, v2, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d:Lkotlinx/coroutines/flow/n0;

    .line 23
    .line 24
    :cond_0
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    move-object v6, v5

    .line 29
    check-cast v6, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 30
    .line 31
    iget v7, v6, Lcom/zykj/mistake/feature/notebook/list/e1;->a:I

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    sub-int/2addr v7, v8

    .line 38
    const/4 v8, 0x0

    .line 39
    if-gez v7, :cond_1

    .line 40
    .line 41
    move v7, v8

    .line 42
    :cond_1
    iget v9, v6, Lcom/zykj/mistake/feature/notebook/list/e1;->b:I

    .line 43
    .line 44
    iget v10, v0, Lcom/zykj/mistake/activity/o;->b:I

    .line 45
    .line 46
    sub-int/2addr v9, v10

    .line 47
    if-gez v9, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move v8, v9

    .line 51
    :goto_0
    iget-object v9, v6, Lcom/zykj/mistake/feature/notebook/list/e1;->d:Ljava/util/List;

    .line 52
    .line 53
    new-instance v10, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    :cond_3
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v11

    .line 66
    if-eqz v11, :cond_4

    .line 67
    .line 68
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v11

    .line 72
    move-object v12, v11

    .line 73
    check-cast v12, Lp4/b;

    .line 74
    .line 75
    iget-object v12, v12, Lp4/b;->a:Ljava/lang/String;

    .line 76
    .line 77
    invoke-interface {v1, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    if-nez v12, :cond_3

    .line 82
    .line 83
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    sget-object v15, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 88
    .line 89
    const/16 v29, 0x0

    .line 90
    .line 91
    const v30, 0x1fffcf4

    .line 92
    .line 93
    .line 94
    const/4 v9, 0x0

    .line 95
    const/4 v11, 0x0

    .line 96
    const/4 v12, 0x0

    .line 97
    const/4 v13, 0x0

    .line 98
    const/4 v14, 0x0

    .line 99
    const/16 v16, 0x0

    .line 100
    .line 101
    const/16 v17, 0x0

    .line 102
    .line 103
    const/16 v18, 0x0

    .line 104
    .line 105
    const/16 v19, 0x0

    .line 106
    .line 107
    const/16 v20, 0x0

    .line 108
    .line 109
    const/16 v21, 0x0

    .line 110
    .line 111
    const/16 v22, 0x0

    .line 112
    .line 113
    const/16 v23, 0x0

    .line 114
    .line 115
    const/16 v24, 0x0

    .line 116
    .line 117
    const/16 v25, 0x0

    .line 118
    .line 119
    const/16 v26, 0x0

    .line 120
    .line 121
    const/16 v27, 0x0

    .line 122
    .line 123
    const/16 v28, 0x0

    .line 124
    .line 125
    invoke-static/range {v6 .. v30}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    invoke-virtual {v4, v5, v6}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    if-eqz v5, :cond_0

    .line 134
    .line 135
    sget-object v1, Lcom/zykj/mistake/feature/notebook/list/l;->a:Lcom/zykj/mistake/feature/notebook/list/l;

    .line 136
    .line 137
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 138
    .line 139
    .line 140
    sget-object v1, Lcom/zykj/mistake/feature/notebook/list/u;->a:Lcom/zykj/mistake/feature/notebook/list/u;

    .line 141
    .line 142
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 143
    .line 144
    .line 145
    new-instance v1, Lcom/zykj/mistake/feature/notebook/list/x;

    .line 146
    .line 147
    sget v3, Lcom/zykj/mistake/R$string;->remove_mistake_success:I

    .line 148
    .line 149
    invoke-virtual {v2}, Landroidx/lifecycle/AndroidViewModel;->getApplication()Landroid/app/Application;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-virtual {v4, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    const-string v4, "getString(...)"

    .line 158
    .line 159
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-direct {v1, v3}, Lcom/zykj/mistake/feature/notebook/list/x;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 166
    .line 167
    .line 168
    :goto_2
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 169
    .line 170
    return-object v1

    .line 171
    :pswitch_0
    iget-object v1, v0, Lcom/zykj/mistake/activity/o;->c:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v1, Lcom/zykj/mistake/widget/StemWebView;

    .line 174
    .line 175
    iget-object v2, v0, Lcom/zykj/mistake/activity/o;->d:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v2, Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 178
    .line 179
    iget-object v3, v0, Lcom/zykj/mistake/activity/o;->e:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v3, Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 182
    .line 183
    new-instance v4, Lcom/zykj/merge/sketch/view/f;

    .line 184
    .line 185
    iget v5, v0, Lcom/zykj/mistake/activity/o;->b:I

    .line 186
    .line 187
    invoke-direct {v4, v2, v3, v1, v5}, Lcom/zykj/merge/sketch/view/f;-><init>(Lcom/zykj/mistake/feature/notebook/detail/a5;Lcom/zykj/mistake/feature/notebook/detail/f;Lcom/zykj/mistake/widget/StemWebView;I)V

    .line 188
    .line 189
    .line 190
    const-wide/16 v2, 0x12c

    .line 191
    .line 192
    invoke-virtual {v1, v4, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 193
    .line 194
    .line 195
    goto :goto_2

    .line 196
    :pswitch_1
    iget-object v1, v0, Lcom/zykj/mistake/activity/o;->c:Ljava/lang/Object;

    .line 197
    .line 198
    move-object v5, v1

    .line 199
    check-cast v5, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 200
    .line 201
    iget-object v1, v0, Lcom/zykj/mistake/activity/o;->d:Ljava/lang/Object;

    .line 202
    .line 203
    move-object v6, v1

    .line 204
    check-cast v6, Landroid/widget/ImageView;

    .line 205
    .line 206
    iget-object v1, v0, Lcom/zykj/mistake/activity/o;->e:Ljava/lang/Object;

    .line 207
    .line 208
    move-object v7, v1

    .line 209
    check-cast v7, Landroid/widget/ImageView;

    .line 210
    .line 211
    iget-boolean v1, v5, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->m:Z

    .line 212
    .line 213
    if-nez v1, :cond_5

    .line 214
    .line 215
    iget-object v1, v5, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->n:Ld6/e;

    .line 216
    .line 217
    invoke-interface {v1}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    check-cast v1, Ll4/d;

    .line 222
    .line 223
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 224
    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_5
    iget-object v1, v5, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->k:Lcom/zykj/view/utils/ImagePicker;

    .line 228
    .line 229
    new-instance v2, Lcom/zykj/mistake/activity/p;

    .line 230
    .line 231
    const/4 v4, 0x2

    .line 232
    iget v3, v0, Lcom/zykj/mistake/activity/o;->b:I

    .line 233
    .line 234
    invoke-direct/range {v2 .. v7}, Lcom/zykj/mistake/activity/p;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    move-object v8, v5

    .line 238
    const/4 v6, 0x1

    .line 239
    const/4 v7, 0x0

    .line 240
    const/4 v3, 0x0

    .line 241
    const/4 v4, 0x1

    .line 242
    move-object v5, v2

    .line 243
    move-object v2, v1

    .line 244
    invoke-static/range {v2 .. v7}, Lcom/zykj/view/utils/ImagePicker;->startSystemCamera$default(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;ZLr6/c;ILjava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    const/4 v1, 0x0

    .line 248
    invoke-virtual {v8, v1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 249
    .line 250
    .line 251
    :goto_3
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 252
    .line 253
    return-object v1

    .line 254
    nop

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
