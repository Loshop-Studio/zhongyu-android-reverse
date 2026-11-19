.class final Lcom/friday/document/view/FolderPreviewFragment$onClick$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/FolderPreviewFragment;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.view.FolderPreviewFragment$onClick$2"
    f = "FolderPreviewFragment.kt"
    l = {
        0xf4,
        0x101
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:I

.field public h:I

.field public final synthetic i:Lcom/friday/document/view/FolderPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/FolderPreviewFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->i:Lcom/friday/document/view/FolderPreviewFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->i:Lcom/friday/document/view/FolderPreviewFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;-><init>(Lcom/friday/document/view/FolderPreviewFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->h:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v4, :cond_1

    .line 13
    .line 14
    if-ne v1, v3, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->e:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lcom/friday/document/view/FolderPreviewFragment;

    .line 23
    .line 24
    iget-object v3, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Lcom/friday/common/entity/FileEntity;

    .line 27
    .line 28
    iget-object v3, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v3, Lcom/friday/common/entity/FileEntity;

    .line 31
    .line 32
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_2

    .line 36
    .line 37
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_1
    iget-object v0, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->f:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 48
    .line 49
    iget-object v1, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->e:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Lcom/friday/document/view/FolderPreviewFragment;

    .line 52
    .line 53
    iget-object v3, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v3, Lcom/friday/common/entity/FileEntity;

    .line 56
    .line 57
    iget-object v3, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v3, Lcom/friday/common/entity/FileEntity;

    .line 60
    .line 61
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->i:Lcom/friday/document/view/FolderPreviewFragment;

    .line 69
    .line 70
    invoke-static {p1}, Lcom/friday/document/view/FolderPreviewFragment;->H(Lcom/friday/document/view/FolderPreviewFragment;)Lcom/friday/document/viewmodel/FolderViewModel;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->W()Lcom/friday/common/entity/FileEntity;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-eqz p1, :cond_9

    .line 79
    .line 80
    iget-object v1, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->i:Lcom/friday/document/view/FolderPreviewFragment;

    .line 81
    .line 82
    const-string v5, "6"

    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    invoke-static {v5, v6}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    const/4 v6, 0x0

    .line 93
    if-eqz v5, :cond_5

    .line 94
    .line 95
    invoke-static {v1}, Lcom/friday/document/view/FolderPreviewFragment;->H(Lcom/friday/document/view/FolderPreviewFragment;)Lcom/friday/document/viewmodel/FolderViewModel;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    iput-object v5, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->c:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object p1, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->d:Ljava/lang/Object;

    .line 106
    .line 107
    iput-object v1, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->e:Ljava/lang/Object;

    .line 108
    .line 109
    iput-object p1, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->f:Ljava/lang/Object;

    .line 110
    .line 111
    iput v6, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->g:I

    .line 112
    .line 113
    iput v4, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->h:I

    .line 114
    .line 115
    invoke-virtual {v3, p1, p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->u(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    if-ne v3, v0, :cond_3

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_3
    move-object v0, p1

    .line 123
    move-object p1, v3

    .line 124
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-eqz p1, :cond_4

    .line 131
    .line 132
    sget-object v3, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 133
    .line 134
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    sget-object v7, Lcom/friday/common/entity/FromPage;->FROM_FOLDER:Lcom/friday/common/entity/FromPage;

    .line 147
    .line 148
    const/16 v11, 0x70

    .line 149
    .line 150
    const/4 v12, 0x0

    .line 151
    const/4 v8, 0x0

    .line 152
    const/4 v9, 0x0

    .line 153
    const/4 v10, 0x0

    .line 154
    invoke-static/range {v3 .. v12}, Lcom/friday/common/helper/c;->q(Lcom/friday/common/helper/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    goto/16 :goto_3

    .line 158
    .line 159
    :cond_4
    invoke-static {v1}, Lcom/friday/document/view/FolderPreviewFragment;->H(Lcom/friday/document/view/FolderPreviewFragment;)Lcom/friday/document/viewmodel/FolderViewModel;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-virtual {p1, v2}, Lcom/friday/document/viewmodel/BaseFileViewModel;->t0(Lcom/friday/common/entity/FileEntity;)V

    .line 164
    .line 165
    .line 166
    const-string p1, "\u6587\u672c\u7f13\u5b58\u88ab\u6e05\u9664\uff0c\u8bf7\u4e0b\u8f7d\u540e\u518d\u8bd5"

    .line 167
    .line 168
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_5
    invoke-static {v1}, Lcom/friday/document/view/FolderPreviewFragment;->H(Lcom/friday/document/view/FolderPreviewFragment;)Lcom/friday/document/viewmodel/FolderViewModel;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    iput-object v5, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->c:Ljava/lang/Object;

    .line 181
    .line 182
    iput-object p1, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->d:Ljava/lang/Object;

    .line 183
    .line 184
    iput-object v1, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->e:Ljava/lang/Object;

    .line 185
    .line 186
    iput-object p1, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->f:Ljava/lang/Object;

    .line 187
    .line 188
    iput v6, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->g:I

    .line 189
    .line 190
    iput v3, p0, Lcom/friday/document/view/FolderPreviewFragment$onClick$2;->h:I

    .line 191
    .line 192
    invoke-virtual {v4, p1, p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->w(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    if-ne v3, v0, :cond_6

    .line 197
    .line 198
    :goto_1
    return-object v0

    .line 199
    :cond_6
    move-object v0, p1

    .line 200
    move-object p1, v3

    .line 201
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 202
    .line 203
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    if-eqz p1, :cond_8

    .line 208
    .line 209
    const-string p1, "1"

    .line 210
    .line 211
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    if-eqz p1, :cond_7

    .line 220
    .line 221
    sget-object p1, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 222
    .line 223
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    sget-object v3, Lcom/friday/common/entity/FromPage;->FROM_FOLDER:Lcom/friday/common/entity/FromPage;

    .line 236
    .line 237
    invoke-virtual {p1, v1, v2, v0, v3}, Lcom/friday/common/helper/c;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;)V

    .line 238
    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_7
    sget-object p1, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 242
    .line 243
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    sget-object v3, Lcom/friday/common/entity/FromPage;->FROM_FOLDER:Lcom/friday/common/entity/FromPage;

    .line 256
    .line 257
    invoke-virtual {p1, v1, v2, v0, v3}, Lcom/friday/common/helper/c;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;)V

    .line 258
    .line 259
    .line 260
    goto :goto_3

    .line 261
    :cond_8
    invoke-static {v1}, Lcom/friday/document/view/FolderPreviewFragment;->H(Lcom/friday/document/view/FolderPreviewFragment;)Lcom/friday/document/viewmodel/FolderViewModel;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    invoke-virtual {p1, v2}, Lcom/friday/document/viewmodel/BaseFileViewModel;->t0(Lcom/friday/common/entity/FileEntity;)V

    .line 266
    .line 267
    .line 268
    const-string p1, "\u7b14\u8bb0\u7f13\u5b58\u88ab\u6e05\u9664\uff0c\u8bf7\u4e0b\u8f7d\u540e\u518d\u8bd5"

    .line 269
    .line 270
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 271
    .line 272
    .line 273
    :goto_3
    sget-object p1, Lk2/v;->a:Lk2/v$a;

    .line 274
    .line 275
    const-string v0, "PreviewEdit"

    .line 276
    .line 277
    invoke-virtual {p1, v0}, Lk2/v$a;->a(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    :cond_9
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 281
    .line 282
    return-object p1
.end method
