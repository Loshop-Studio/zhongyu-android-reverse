.class final Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/RecycleBinViewModel;->N0(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
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
    c = "com.friday.document.viewmodel.RecycleBinViewModel$resDelete$2"
    f = "RecycleBinViewModel.kt"
    l = {
        0x40,
        0x44,
        0x4e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/viewmodel/RecycleBinViewModel;

.field public final synthetic e:Lcom/friday/common/entity/FileEntity;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/RecycleBinViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;->d:Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;->e:Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;->d:Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;->e:Lcom/friday/common/entity/FileEntity;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;-><init>(Lcom/friday/document/viewmodel/RecycleBinViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;->c:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v4, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto/16 :goto_6

    .line 22
    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    move-object v7, p0

    .line 35
    goto/16 :goto_2

    .line 36
    .line 37
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;->d:Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->M()Lcom/friday/common/dao/FileDao;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object v1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;->e:Lcom/friday/common/entity/FileEntity;

    .line 51
    .line 52
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iput v4, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;->c:I

    .line 57
    .line 58
    invoke-interface {p1, v1, p0}, Lcom/friday/common/dao/FileDao;->P(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v0, :cond_4

    .line 63
    .line 64
    goto/16 :goto_5

    .line 65
    .line 66
    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;->e:Lcom/friday/common/entity/FileEntity;

    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    const/16 v4, 0x31

    .line 77
    .line 78
    if-eq v1, v4, :cond_6

    .line 79
    .line 80
    packed-switch v1, :pswitch_data_0

    .line 81
    .line 82
    .line 83
    packed-switch v1, :pswitch_data_1

    .line 84
    .line 85
    .line 86
    :goto_1
    move-object v7, p0

    .line 87
    goto/16 :goto_4

    .line 88
    .line 89
    :pswitch_0
    const-string v1, "12"

    .line 90
    .line 91
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-nez p1, :cond_7

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :pswitch_1
    const-string v1, "11"

    .line 99
    .line 100
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-nez p1, :cond_5

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :pswitch_2
    const-string v1, "10"

    .line 108
    .line 109
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-nez p1, :cond_5

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :pswitch_3
    const-string v1, "6"

    .line 117
    .line 118
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-nez p1, :cond_5

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :pswitch_4
    const-string v1, "5"

    .line 126
    .line 127
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-nez p1, :cond_5

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :pswitch_5
    const-string v1, "4"

    .line 135
    .line 136
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-nez p1, :cond_5

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :pswitch_6
    const-string v1, "3"

    .line 144
    .line 145
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-nez p1, :cond_5

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_5
    iget-object p1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;->e:Lcom/friday/common/entity/FileEntity;

    .line 153
    .line 154
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_6
    const-string v1, "1"

    .line 163
    .line 164
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-nez p1, :cond_7

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_7
    iget-object p1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;->d:Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 172
    .line 173
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->U()Lcom/friday/common/dao/ResourceDao;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    iget-object p1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;->e:Lcom/friday/common/entity/FileEntity;

    .line 178
    .line 179
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    iput v3, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;->c:I

    .line 184
    .line 185
    const-wide/16 v6, 0x0

    .line 186
    .line 187
    const/4 v9, 0x2

    .line 188
    const/4 v10, 0x0

    .line 189
    move-object v8, p0

    .line 190
    invoke-static/range {v4 .. v10}, Lcom/friday/common/dao/ResourceDao;->Q(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    move-object v7, v8

    .line 195
    if-ne p1, v0, :cond_8

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_8
    :goto_2
    check-cast p1, Ljava/util/List;

    .line 199
    .line 200
    check-cast p1, Ljava/lang/Iterable;

    .line 201
    .line 202
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_9

    .line 211
    .line 212
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    check-cast v1, Lcom/friday/common/entity/ResourceEntity;

    .line 217
    .line 218
    invoke-virtual {v1}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 223
    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_9
    :goto_4
    iget-object p1, v7, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;->d:Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 227
    .line 228
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->U()Lcom/friday/common/dao/ResourceDao;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    iget-object p1, v7, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;->e:Lcom/friday/common/entity/FileEntity;

    .line 233
    .line 234
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    iput v2, v7, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;->c:I

    .line 239
    .line 240
    const-wide/16 v5, 0x0

    .line 241
    .line 242
    const/4 v8, 0x2

    .line 243
    const/4 v9, 0x0

    .line 244
    invoke-static/range {v3 .. v9}, Lcom/friday/common/dao/ResourceDao;->U(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    if-ne p1, v0, :cond_a

    .line 249
    .line 250
    :goto_5
    return-object v0

    .line 251
    :cond_a
    :goto_6
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 252
    .line 253
    return-object p1

    .line 254
    nop

    .line 255
    :pswitch_data_0
    .packed-switch 0x33
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    :pswitch_data_1
    .packed-switch 0x61f
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
