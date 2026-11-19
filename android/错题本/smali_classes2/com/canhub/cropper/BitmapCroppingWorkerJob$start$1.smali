.class final Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.canhub.cropper.BitmapCroppingWorkerJob$start$1"
    f = "BitmapCroppingWorkerJob.kt"
    i = {}
    l = {
        0x4c,
        0x73
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/canhub/cropper/b;


# direct methods
.method public constructor <init>(Lcom/canhub/cropper/b;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/canhub/cropper/b;",
            "Lh6/c<",
            "-",
            "Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;->this$0:Lcom/canhub/cropper/b;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;->this$0:Lcom/canhub/cropper/b;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;-><init>(Lcom/canhub/cropper/b;Lh6/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v0, v1, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;->label:I

    .line 6
    .line 7
    sget-object v3, Ld6/s;->a:Ld6/s;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    if-eq v0, v5, :cond_2

    .line 14
    .line 15
    if-ne v0, v4, :cond_1

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    move-object/from16 v21, v3

    .line 21
    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_2
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    return-object v3

    .line 36
    :catch_0
    move-exception v0

    .line 37
    move-object/from16 v21, v3

    .line 38
    .line 39
    goto/16 :goto_1

    .line 40
    .line 41
    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, v1, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;->L$0:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lkotlinx/coroutines/v;

    .line 47
    .line 48
    :try_start_1
    invoke-static {v0}, Lkotlinx/coroutines/x;->s(Lkotlinx/coroutines/v;)Z

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    if-eqz v7, :cond_0

    .line 53
    .line 54
    iget-object v7, v1, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;->this$0:Lcom/canhub/cropper/b;

    .line 55
    .line 56
    iget-object v9, v7, Lcom/canhub/cropper/b;->c:Landroid/net/Uri;

    .line 57
    .line 58
    if-eqz v9, :cond_4

    .line 59
    .line 60
    sget-object v8, Lcom/canhub/cropper/h;->a:Landroid/graphics/Rect;

    .line 61
    .line 62
    iget-object v8, v7, Lcom/canhub/cropper/b;->a:Landroid/content/Context;

    .line 63
    .line 64
    iget-object v10, v7, Lcom/canhub/cropper/b;->e:[F

    .line 65
    .line 66
    iget v11, v7, Lcom/canhub/cropper/b;->f:I

    .line 67
    .line 68
    iget v12, v7, Lcom/canhub/cropper/b;->g:I

    .line 69
    .line 70
    iget v13, v7, Lcom/canhub/cropper/b;->h:I

    .line 71
    .line 72
    iget-boolean v14, v7, Lcom/canhub/cropper/b;->i:Z

    .line 73
    .line 74
    iget v15, v7, Lcom/canhub/cropper/b;->j:I

    .line 75
    .line 76
    iget v5, v7, Lcom/canhub/cropper/b;->k:I

    .line 77
    .line 78
    iget v4, v7, Lcom/canhub/cropper/b;->l:I

    .line 79
    .line 80
    iget v6, v7, Lcom/canhub/cropper/b;->m:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 81
    .line 82
    move-object/from16 v21, v3

    .line 83
    .line 84
    :try_start_2
    iget-boolean v3, v7, Lcom/canhub/cropper/b;->n:Z

    .line 85
    .line 86
    iget-boolean v7, v7, Lcom/canhub/cropper/b;->o:Z

    .line 87
    .line 88
    move/from16 v19, v3

    .line 89
    .line 90
    move/from16 v17, v4

    .line 91
    .line 92
    move/from16 v16, v5

    .line 93
    .line 94
    move/from16 v18, v6

    .line 95
    .line 96
    move/from16 v20, v7

    .line 97
    .line 98
    invoke-static/range {v8 .. v20}, Lcom/canhub/cropper/h;->c(Landroid/content/Context;Landroid/net/Uri;[FIIIZIIIIZZ)Lcom/canhub/cropper/e;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    goto :goto_0

    .line 103
    :catch_1
    move-exception v0

    .line 104
    goto :goto_1

    .line 105
    :cond_4
    move-object/from16 v21, v3

    .line 106
    .line 107
    iget-object v3, v7, Lcom/canhub/cropper/b;->d:Landroid/graphics/Bitmap;

    .line 108
    .line 109
    if-eqz v3, :cond_5

    .line 110
    .line 111
    sget-object v4, Lcom/canhub/cropper/h;->a:Landroid/graphics/Rect;

    .line 112
    .line 113
    iget-object v4, v7, Lcom/canhub/cropper/b;->e:[F

    .line 114
    .line 115
    iget v5, v7, Lcom/canhub/cropper/b;->f:I

    .line 116
    .line 117
    iget-boolean v6, v7, Lcom/canhub/cropper/b;->i:Z

    .line 118
    .line 119
    iget v8, v7, Lcom/canhub/cropper/b;->j:I

    .line 120
    .line 121
    move v9, v8

    .line 122
    iget v8, v7, Lcom/canhub/cropper/b;->k:I

    .line 123
    .line 124
    move v10, v9

    .line 125
    iget-boolean v9, v7, Lcom/canhub/cropper/b;->n:Z

    .line 126
    .line 127
    move v11, v10

    .line 128
    iget-boolean v10, v7, Lcom/canhub/cropper/b;->o:Z

    .line 129
    .line 130
    move v7, v11

    .line 131
    invoke-static/range {v3 .. v10}, Lcom/canhub/cropper/h;->e(Landroid/graphics/Bitmap;[FIZIIZZ)Lcom/canhub/cropper/e;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    :goto_0
    iget-object v4, v3, Lcom/canhub/cropper/e;->a:Landroid/graphics/Bitmap;

    .line 136
    .line 137
    iget-object v5, v1, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;->this$0:Lcom/canhub/cropper/b;

    .line 138
    .line 139
    iget v6, v5, Lcom/canhub/cropper/b;->l:I

    .line 140
    .line 141
    iget v7, v5, Lcom/canhub/cropper/b;->m:I

    .line 142
    .line 143
    iget-object v5, v5, Lcom/canhub/cropper/b;->p:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 144
    .line 145
    invoke-static {v4, v6, v7, v5}, Lcom/canhub/cropper/h;->u(Landroid/graphics/Bitmap;IILcom/canhub/cropper/CropImageView$RequestSizeOptions;)Landroid/graphics/Bitmap;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    sget-object v5, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 150
    .line 151
    sget-object v5, Lg7/d;->a:Lg7/d;

    .line 152
    .line 153
    new-instance v6, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;

    .line 154
    .line 155
    iget-object v7, v1, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;->this$0:Lcom/canhub/cropper/b;

    .line 156
    .line 157
    const/4 v8, 0x0

    .line 158
    invoke-direct {v6, v7, v4, v3, v8}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;-><init>(Lcom/canhub/cropper/b;Landroid/graphics/Bitmap;Lcom/canhub/cropper/e;Lh6/c;)V

    .line 159
    .line 160
    .line 161
    const/4 v3, 0x2

    .line 162
    invoke-static {v0, v5, v8, v6, v3}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 163
    .line 164
    .line 165
    return-object v21

    .line 166
    :cond_5
    new-instance v0, Lcom/canhub/cropper/a;

    .line 167
    .line 168
    const/4 v3, 0x1

    .line 169
    const/4 v8, 0x0

    .line 170
    invoke-direct {v0, v8, v8, v8, v3}, Lcom/canhub/cropper/a;-><init>(Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;I)V

    .line 171
    .line 172
    .line 173
    iput v3, v1, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;->label:I

    .line 174
    .line 175
    invoke-static {v7, v0, v1}, Lcom/canhub/cropper/b;->a(Lcom/canhub/cropper/b;Lcom/canhub/cropper/a;Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 179
    if-ne v0, v2, :cond_6

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :goto_1
    iget-object v3, v1, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;->this$0:Lcom/canhub/cropper/b;

    .line 183
    .line 184
    new-instance v4, Lcom/canhub/cropper/a;

    .line 185
    .line 186
    const/4 v5, 0x1

    .line 187
    const/4 v8, 0x0

    .line 188
    invoke-direct {v4, v8, v8, v0, v5}, Lcom/canhub/cropper/a;-><init>(Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;I)V

    .line 189
    .line 190
    .line 191
    const/4 v5, 0x2

    .line 192
    iput v5, v1, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;->label:I

    .line 193
    .line 194
    invoke-static {v3, v4, v1}, Lcom/canhub/cropper/b;->a(Lcom/canhub/cropper/b;Lcom/canhub/cropper/a;Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    if-ne v0, v2, :cond_6

    .line 199
    .line 200
    :goto_2
    return-object v2

    .line 201
    :cond_6
    :goto_3
    return-object v21
.end method
