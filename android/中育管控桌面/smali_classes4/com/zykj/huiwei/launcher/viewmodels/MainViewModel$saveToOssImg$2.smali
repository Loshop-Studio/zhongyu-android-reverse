.class final Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;->m(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.huiwei.launcher.viewmodels.MainViewModel$saveToOssImg$2"
    f = "MainViewModel.kt"
    i = {
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3
    }
    l = {
        0x8c,
        0x98,
        0xa5,
        0xaf
    }
    m = "invokeSuspend"
    n = {
        "ossData",
        "it",
        "objectKey",
        "path",
        "size",
        "it",
        "$i$a$-let-MainViewModel$saveToOssImg$2$1",
        "$i$a$-let-MainViewModel$saveToOssImg$2$1$1",
        "ossData",
        "it",
        "objectKey",
        "path",
        "size",
        "it",
        "url",
        "fileName",
        "name",
        "$i$a$-let-MainViewModel$saveToOssImg$2$1",
        "$i$a$-let-MainViewModel$saveToOssImg$2$1$1",
        "$i$a$-let-MainViewModel$saveToOssImg$2$1$1$1",
        "e",
        "remoteCodeException"
    }
    s = {
        "L$0",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "I$0",
        "I$1",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "L$7",
        "L$8",
        "I$0",
        "I$1",
        "I$2",
        "L$0",
        "L$1"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2\n+ 2 Logger.kt\ncom/dylanc/longan/LoggerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n98#2,2:191\n57#2,2:193\n98#2,2:196\n57#2,2:198\n1#3:195\n1#3:200\n*S KotlinDebug\n*F\n+ 1 MainViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2\n*L\n159#1:191,2\n159#1:193,2\n162#1:196,2\n162#1:198,2\n159#1:195\n162#1:200\n*E\n"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public final synthetic n:Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->n:Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    iput-object p2, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->o:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->p:Ljava/lang/String;

    iput-object p4, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->q:Landroid/net/Uri;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6

    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->n:Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    iget-object v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->o:Ljava/lang/String;

    iget-object v3, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->p:Ljava/lang/String;

    iget-object v4, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->q:Landroid/net/Uri;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v12

    .line 7
    iget v0, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->m:I

    .line 8
    .line 9
    const/4 v13, 0x4

    .line 10
    const/4 v14, 0x3

    .line 11
    const/4 v15, 0x2

    .line 12
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v0, :cond_4

    .line 16
    .line 17
    if-eq v0, v1, :cond_3

    .line 18
    .line 19
    if-eq v0, v15, :cond_2

    .line 20
    .line 21
    if-eq v0, v14, :cond_1

    .line 22
    .line 23
    if-ne v0, v13, :cond_0

    .line 24
    .line 25
    iget-object v0, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 28
    .line 29
    iget-object v0, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->a:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Ljava/lang/Throwable;

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_10

    .line 37
    .line 38
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :cond_1
    iget-object v0, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->i:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Ljava/lang/String;

    .line 49
    .line 50
    iget-object v0, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->h:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Ljava/lang/String;

    .line 53
    .line 54
    iget-object v0, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->g:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Ljava/lang/String;

    .line 57
    .line 58
    iget-object v0, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->f:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Ljava/lang/String;

    .line 61
    .line 62
    iget-object v0, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->e:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Ljava/lang/String;

    .line 65
    .line 66
    iget-object v0, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->d:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Ljava/lang/String;

    .line 69
    .line 70
    iget-object v0, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Ljava/lang/String;

    .line 73
    .line 74
    iget-object v0, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Lcom/zykj/gallery/oss/OssData;

    .line 77
    .line 78
    iget-object v0, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->a:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Lcom/zykj/gallery/oss/OssData;

    .line 81
    .line 82
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    .line 85
    goto/16 :goto_10

    .line 86
    .line 87
    :catchall_0
    move-exception v0

    .line 88
    goto/16 :goto_e

    .line 89
    .line 90
    :cond_2
    iget v0, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->k:I

    .line 91
    .line 92
    iget v1, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->j:I

    .line 93
    .line 94
    iget-object v4, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->g:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v4, Ljava/lang/String;

    .line 97
    .line 98
    iget-object v6, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->f:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v6, Ljava/lang/String;

    .line 101
    .line 102
    iget-object v7, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->e:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v7, Ljava/lang/String;

    .line 105
    .line 106
    iget-object v8, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->d:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v8, Ljava/lang/String;

    .line 109
    .line 110
    iget-object v9, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->c:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v9, Lcom/zykj/gallery/oss/OssData;

    .line 113
    .line 114
    iget-object v10, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v10, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 117
    .line 118
    iget-object v11, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->a:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v11, Lcom/zykj/gallery/oss/OssData;

    .line 121
    .line 122
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    move v13, v2

    .line 126
    move-object v14, v3

    .line 127
    move v2, v1

    .line 128
    move v1, v0

    .line 129
    move-object/from16 v0, p1

    .line 130
    .line 131
    :goto_0
    move-object v3, v6

    .line 132
    goto/16 :goto_2

    .line 133
    .line 134
    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 135
    .line 136
    .line 137
    move-object/from16 v0, p1

    .line 138
    .line 139
    move v13, v2

    .line 140
    move-object v14, v3

    .line 141
    goto :goto_1

    .line 142
    :cond_4
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :try_start_2
    iget-object v0, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->n:Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 146
    .line 147
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;->c(Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;)Lcom/zykj/gallery/repository/GalleryRepository;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    iget-object v4, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->o:Ljava/lang/String;

    .line 152
    .line 153
    move v6, v2

    .line 154
    sget-object v2, Lcom/zykj/gallery/oss/FileType$File;->INSTANCE:Lcom/zykj/gallery/oss/FileType$File;

    .line 155
    .line 156
    iget-object v7, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->p:Ljava/lang/String;

    .line 157
    .line 158
    new-instance v8, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    const-string v9, "."

    .line 164
    .line 165
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    move-object v8, v4

    .line 176
    sget-object v4, Lcom/zykj/gallery/oss/FileResource$Resource;->INSTANCE:Lcom/zykj/gallery/oss/FileResource$Resource;

    .line 177
    .line 178
    iput v1, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->m:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 179
    .line 180
    const/4 v5, 0x0

    .line 181
    move v1, v6

    .line 182
    const/4 v6, 0x0

    .line 183
    move v9, v1

    .line 184
    move-object v10, v3

    .line 185
    move-object v3, v7

    .line 186
    move-object v1, v8

    .line 187
    const-wide/16 v7, 0x0

    .line 188
    .line 189
    move-object v11, v10

    .line 190
    const/16 v10, 0x70

    .line 191
    .line 192
    move-object/from16 v16, v11

    .line 193
    .line 194
    const/4 v11, 0x0

    .line 195
    move v13, v9

    .line 196
    move-object/from16 v14, v16

    .line 197
    .line 198
    move-object/from16 v9, p0

    .line 199
    .line 200
    :try_start_3
    invoke-static/range {v0 .. v11}, Lcom/zykj/gallery/repository/GalleryRepository;->g(Lcom/zykj/gallery/repository/GalleryRepository;Ljava/lang/String;Lcom/zykj/gallery/oss/FileType;Ljava/lang/String;Lcom/zykj/gallery/oss/FileResource;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 204
    move-object v5, v9

    .line 205
    if-ne v0, v12, :cond_5

    .line 206
    .line 207
    goto/16 :goto_f

    .line 208
    .line 209
    :cond_5
    :goto_1
    :try_start_4
    move-object v9, v0

    .line 210
    check-cast v9, Lcom/zykj/gallery/oss/OssData;

    .line 211
    .line 212
    if-eqz v9, :cond_12

    .line 213
    .line 214
    iget-object v0, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->q:Landroid/net/Uri;

    .line 215
    .line 216
    iget-object v10, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->n:Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 217
    .line 218
    invoke-virtual {v9}, Lcom/zykj/gallery/oss/OssData;->getObjectKey()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    invoke-static {v0}, Lcom/blankj/utilcode/util/k0;->d(Landroid/net/Uri;)Ljava/io/File;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    invoke-static {v4}, Lcom/blankj/utilcode/util/l;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    sget-object v0, Lcom/zykj/gallery/oss/UploadUtils;->INSTANCE:Lcom/zykj/gallery/oss/UploadUtils;

    .line 235
    .line 236
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v9}, Lcom/zykj/gallery/oss/OssData;->getToken()Lcom/zykj/gallery/oss/OssToken;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    iput-object v2, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->a:Ljava/lang/Object;

    .line 251
    .line 252
    iput-object v10, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->b:Ljava/lang/Object;

    .line 253
    .line 254
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    iput-object v2, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->c:Ljava/lang/Object;

    .line 259
    .line 260
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    iput-object v2, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->d:Ljava/lang/Object;

    .line 265
    .line 266
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    iput-object v2, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->e:Ljava/lang/Object;

    .line 271
    .line 272
    iput-object v6, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->f:Ljava/lang/Object;

    .line 273
    .line 274
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    iput-object v2, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->g:Ljava/lang/Object;

    .line 279
    .line 280
    iput v13, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->j:I

    .line 281
    .line 282
    iput v13, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->k:I

    .line 283
    .line 284
    iput v15, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->m:I

    .line 285
    .line 286
    invoke-virtual {v0, v4, v8, v1, v5}, Lcom/zykj/gallery/oss/UploadUtils;->uploadFile(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/gallery/oss/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    if-ne v0, v12, :cond_6

    .line 291
    .line 292
    goto/16 :goto_f

    .line 293
    .line 294
    :cond_6
    move-object v7, v4

    .line 295
    move-object v11, v9

    .line 296
    move v1, v13

    .line 297
    move v2, v1

    .line 298
    goto/16 :goto_0

    .line 299
    .line 300
    :goto_2
    check-cast v0, Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 301
    .line 302
    const-string v6, ""

    .line 303
    .line 304
    const-string v15, "it"

    .line 305
    .line 306
    const-string v13, "currentThread().stackTrace"

    .line 307
    .line 308
    if-eqz v0, :cond_7

    .line 309
    .line 310
    :try_start_5
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 311
    .line 312
    .line 313
    move-result v17

    .line 314
    if-nez v17, :cond_8

    .line 315
    .line 316
    :cond_7
    const/4 v1, 0x0

    .line 317
    goto/16 :goto_8

    .line 318
    .line 319
    :cond_8
    new-instance v14, Ljava/lang/StringBuilder;

    .line 320
    .line 321
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 322
    .line 323
    .line 324
    move-object/from16 v18, v3

    .line 325
    .line 326
    const-string v3, "OssData \u6587\u4ef6\u4e0a\u4f20\u6210\u529f:"

    .line 327
    .line 328
    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    sget-object v14, Lf1/c;->a:Lf1/c$a;

    .line 339
    .line 340
    invoke-virtual {v14}, Lf1/c$a;->b()I

    .line 341
    .line 342
    .line 343
    move-result v14

    .line 344
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 345
    .line 346
    .line 347
    move-result-object v19

    .line 348
    move-object/from16 v20, v4

    .line 349
    .line 350
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 351
    .line 352
    .line 353
    move-result-object v4

    .line 354
    invoke-static {v4, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    array-length v13, v4

    .line 358
    move-object/from16 v19, v4

    .line 359
    .line 360
    const/4 v4, 0x0

    .line 361
    :goto_3
    if-ge v4, v13, :cond_a

    .line 362
    .line 363
    move/from16 v21, v4

    .line 364
    .line 365
    aget-object v4, v19, v21

    .line 366
    .line 367
    invoke-static {v4, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    invoke-static {v4}, Lf1/d;->b(Ljava/lang/StackTraceElement;)Z

    .line 371
    .line 372
    .line 373
    move-result v22

    .line 374
    if-nez v22, :cond_9

    .line 375
    .line 376
    goto :goto_4

    .line 377
    :cond_9
    add-int/lit8 v4, v21, 0x1

    .line 378
    .line 379
    goto :goto_3

    .line 380
    :cond_a
    const/4 v4, 0x0

    .line 381
    :goto_4
    if-nez v4, :cond_b

    .line 382
    .line 383
    const/4 v4, 0x0

    .line 384
    goto :goto_5

    .line 385
    :cond_b
    invoke-static {v4}, Lf1/d;->a(Ljava/lang/StackTraceElement;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v4

    .line 389
    :goto_5
    if-nez v4, :cond_c

    .line 390
    .line 391
    :goto_6
    const/4 v4, 0x0

    .line 392
    goto :goto_7

    .line 393
    :cond_c
    move-object v6, v4

    .line 394
    goto :goto_6

    .line 395
    :goto_7
    invoke-static {v14, v6, v3, v4}, Lf1/d;->c(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 396
    .line 397
    .line 398
    sget-object v3, Lcom/zykj/gallery/oss/UploadUtils;->INSTANCE:Lcom/zykj/gallery/oss/UploadUtils;

    .line 399
    .line 400
    invoke-virtual {v3, v0}, Lcom/zykj/gallery/oss/UploadUtils;->getFileNameFromUrlWithRegex(Ljava/lang/String;)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    if-eqz v3, :cond_12

    .line 405
    .line 406
    invoke-static {v10}, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;->c(Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;)Lcom/zykj/gallery/repository/GalleryRepository;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    move-object v6, v0

    .line 414
    move-object v0, v4

    .line 415
    const-string v4, "\u56fe\u5e93"

    .line 416
    .line 417
    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v10

    .line 421
    iput-object v10, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->a:Ljava/lang/Object;

    .line 422
    .line 423
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v9

    .line 427
    iput-object v9, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->b:Ljava/lang/Object;

    .line 428
    .line 429
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v8

    .line 433
    iput-object v8, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->c:Ljava/lang/Object;

    .line 434
    .line 435
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v7

    .line 439
    iput-object v7, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->d:Ljava/lang/Object;

    .line 440
    .line 441
    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v7

    .line 445
    iput-object v7, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->e:Ljava/lang/Object;

    .line 446
    .line 447
    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v7

    .line 451
    iput-object v7, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->f:Ljava/lang/Object;

    .line 452
    .line 453
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v7

    .line 457
    iput-object v7, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->g:Ljava/lang/Object;

    .line 458
    .line 459
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v7

    .line 463
    iput-object v7, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->h:Ljava/lang/Object;

    .line 464
    .line 465
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v7

    .line 469
    iput-object v7, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->i:Ljava/lang/Object;

    .line 470
    .line 471
    iput v2, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->j:I

    .line 472
    .line 473
    iput v1, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->k:I

    .line 474
    .line 475
    const/4 v1, 0x0

    .line 476
    iput v1, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->l:I

    .line 477
    .line 478
    const/4 v1, 0x3

    .line 479
    iput v1, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->m:I

    .line 480
    .line 481
    move-object v1, v3

    .line 482
    move-object v2, v6

    .line 483
    move-object/from16 v3, v18

    .line 484
    .line 485
    invoke-virtual/range {v0 .. v5}, Lcom/zykj/gallery/repository/GalleryRepository;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    if-ne v0, v12, :cond_12

    .line 490
    .line 491
    goto/16 :goto_f

    .line 492
    .line 493
    :goto_8
    const-string v0, "OssData \u6587\u4ef6\u4e0a\u4f20\u5931\u8d25"

    .line 494
    .line 495
    sget-object v2, Lf1/c;->a:Lf1/c$a;

    .line 496
    .line 497
    invoke-virtual {v2}, Lf1/c$a;->b()I

    .line 498
    .line 499
    .line 500
    move-result v2

    .line 501
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 502
    .line 503
    .line 504
    move-result-object v3

    .line 505
    invoke-virtual {v3}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 506
    .line 507
    .line 508
    move-result-object v3

    .line 509
    invoke-static {v3, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    array-length v4, v3

    .line 513
    :goto_9
    if-ge v1, v4, :cond_e

    .line 514
    .line 515
    aget-object v7, v3, v1

    .line 516
    .line 517
    invoke-static {v7, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    invoke-static {v7}, Lf1/d;->b(Ljava/lang/StackTraceElement;)Z

    .line 521
    .line 522
    .line 523
    move-result v8

    .line 524
    if-nez v8, :cond_d

    .line 525
    .line 526
    move-object v3, v7

    .line 527
    goto :goto_a

    .line 528
    :cond_d
    add-int/lit8 v1, v1, 0x1

    .line 529
    .line 530
    goto :goto_9

    .line 531
    :cond_e
    const/4 v3, 0x0

    .line 532
    :goto_a
    if-nez v3, :cond_f

    .line 533
    .line 534
    const/4 v3, 0x0

    .line 535
    goto :goto_b

    .line 536
    :cond_f
    invoke-static {v3}, Lf1/d;->a(Ljava/lang/StackTraceElement;)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v3

    .line 540
    :goto_b
    if-nez v3, :cond_10

    .line 541
    .line 542
    :goto_c
    const/4 v14, 0x0

    .line 543
    goto :goto_d

    .line 544
    :cond_10
    move-object v6, v3

    .line 545
    goto :goto_c

    .line 546
    :goto_d
    invoke-static {v2, v6, v0, v14}, Lf1/d;->c(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 547
    .line 548
    .line 549
    new-instance v0, Ljava/io/IOException;

    .line 550
    .line 551
    const-string v1, "\u6587\u4ef6\u4e0a\u4f20\u5931\u8d25"

    .line 552
    .line 553
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 557
    :catchall_1
    move-exception v0

    .line 558
    move-object v5, v9

    .line 559
    :goto_e
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 560
    .line 561
    if-eqz v1, :cond_11

    .line 562
    .line 563
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 564
    .line 565
    return-object v0

    .line 566
    :cond_11
    sget-object v1, Lcom/zykj/base/utils/ExceptionHandle;->INSTANCE:Lcom/zykj/base/utils/ExceptionHandle;

    .line 567
    .line 568
    invoke-virtual {v1, v0}, Lcom/zykj/base/utils/ExceptionHandle;->handleException(Ljava/lang/Throwable;)Lcom/zykj/http/exception/RemoteCodeException;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    sget-object v2, Lcom/zykj/huiwei/launcher/server/a;->a:Lcom/zykj/huiwei/launcher/server/a;

    .line 573
    .line 574
    invoke-virtual {v1}, Lcom/zykj/http/exception/RemoteCodeException;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 575
    .line 576
    .line 577
    move-result-object v3

    .line 578
    invoke-virtual {v3}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 579
    .line 580
    .line 581
    move-result v3

    .line 582
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v4

    .line 586
    new-instance v6, Ljava/lang/StringBuilder;

    .line 587
    .line 588
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 595
    .line 596
    .line 597
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v3

    .line 601
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    iput-object v0, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->a:Ljava/lang/Object;

    .line 606
    .line 607
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    iput-object v0, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->b:Ljava/lang/Object;

    .line 612
    .line 613
    const/4 v14, 0x0

    .line 614
    iput-object v14, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->c:Ljava/lang/Object;

    .line 615
    .line 616
    iput-object v14, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->d:Ljava/lang/Object;

    .line 617
    .line 618
    iput-object v14, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->e:Ljava/lang/Object;

    .line 619
    .line 620
    iput-object v14, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->f:Ljava/lang/Object;

    .line 621
    .line 622
    iput-object v14, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->g:Ljava/lang/Object;

    .line 623
    .line 624
    iput-object v14, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->h:Ljava/lang/Object;

    .line 625
    .line 626
    iput-object v14, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->i:Ljava/lang/Object;

    .line 627
    .line 628
    const/4 v1, 0x4

    .line 629
    iput v1, v5, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$2;->m:I

    .line 630
    .line 631
    invoke-virtual {v2, v3, v5}, Lcom/zykj/huiwei/launcher/server/a;->b(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    if-ne v0, v12, :cond_12

    .line 636
    .line 637
    :goto_f
    return-object v12

    .line 638
    :cond_12
    :goto_10
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 639
    .line 640
    return-object v0
.end method
