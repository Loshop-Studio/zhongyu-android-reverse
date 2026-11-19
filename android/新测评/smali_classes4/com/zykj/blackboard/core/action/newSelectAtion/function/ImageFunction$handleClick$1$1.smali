# RE note 本类字节码直接引用的读写或显示接口包括位图。
.class final Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1;->invoke(Ljava/lang/String;)V
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
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction$handleClick$1$1"
    f = "ImageFunction.kt"
    i = {}
    l = {
        0x98
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Ljava/lang/String;Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->b:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    iput-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->d:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;

    iput-object p4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->e:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6

    new-instance v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->b:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->d:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;

    iget-object v4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->e:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;-><init>(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Ljava/lang/String;Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

# RE I/O 解码本地图片（BitmapFactory.decodeFile）。
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->a:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    if-ne v2, v4, :cond_0

    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    move-object/from16 v2, p1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v1

    .line 29
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    new-instance v5, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1$newFilePath$1;

    .line 37
    .line 38
    iget-object v6, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->e:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v7, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->c:Ljava/lang/String;

    .line 41
    .line 42
    invoke-direct {v5, v6, v7, v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1$newFilePath$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 43
    .line 44
    .line 45
    iput v4, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->a:I

    .line 46
    .line 47
    invoke-static {v2, v5, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    if-ne v2, v1, :cond_2

    .line 52
    .line 53
    return-object v1

    .line 54
    :cond_2
    :goto_0
    move-object v5, v2

    .line 55
    check-cast v5, Ljava/lang/String;

    .line 56
    .line 57
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    .line 58
    .line 59
    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-boolean v4, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 63
    .line 64
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->b:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 65
    .line 66
    invoke-virtual {v2}, Lq4/a;->g()Landroid/graphics/RectF;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    iget-object v6, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->c:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v6, v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    iget v7, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 80
    .line 81
    int-to-float v7, v7

    .line 82
    div-float/2addr v6, v7

    .line 83
    iget-object v7, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->b:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 84
    .line 85
    invoke-virtual {v7}, Lq4/a;->b()Landroid/graphics/Matrix;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-static {v5, v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 90
    .line 91
    .line 92
    iget v8, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 93
    .line 94
    int-to-float v8, v8

    .line 95
    mul-float/2addr v8, v6

    .line 96
    iget v1, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 97
    .line 98
    int-to-float v1, v1

    .line 99
    mul-float/2addr v1, v6

    .line 100
    new-instance v12, Landroid/graphics/RectF;

    .line 101
    .line 102
    const/4 v6, 0x0

    .line 103
    invoke-direct {v12, v6, v6, v8, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 104
    .line 105
    .line 106
    new-instance v1, Landroid/graphics/Matrix;

    .line 107
    .line 108
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerX()F

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    invoke-virtual {v12}, Landroid/graphics/RectF;->centerX()F

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    sub-float/2addr v6, v8

    .line 120
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    invoke-virtual {v12}, Landroid/graphics/RectF;->centerY()F

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    sub-float/2addr v2, v8

    .line 129
    invoke-virtual {v1, v6, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v7}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 133
    .line 134
    .line 135
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->d:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;

    .line 136
    .line 137
    invoke-virtual {v2}, Li4/a;->o()Lk4/c;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    iget-object v6, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->b:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 142
    .line 143
    invoke-virtual {v6}, Lq4/a;->getId()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    const-string v7, "newFilePath"

    .line 148
    .line 149
    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-interface {v2, v6, v12, v1, v5}, Lk4/c;->u(Ljava/lang/String;Landroid/graphics/RectF;Landroid/graphics/Matrix;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->d:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;

    .line 156
    .line 157
    invoke-static {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->Z(Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;)V

    .line 158
    .line 159
    .line 160
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->d:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;

    .line 161
    .line 162
    invoke-static {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->Y(Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;)V

    .line 163
    .line 164
    .line 165
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->d:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;

    .line 166
    .line 167
    const/4 v6, 0x0

    .line 168
    invoke-static {v2, v6, v4, v3}, Li4/a;->V(Li4/a;ZILjava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->d:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;

    .line 172
    .line 173
    invoke-virtual {v2}, Li4/a;->q()Lg4/b;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    iget-object v3, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->b:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 178
    .line 179
    sget-object v11, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->d:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 180
    .line 181
    sget-char v6, Ljava/io/File;->separatorChar:C

    .line 182
    .line 183
    const/4 v9, 0x6

    .line 184
    const/4 v10, 0x0

    .line 185
    const/4 v7, 0x0

    .line 186
    const/4 v8, 0x0

    .line 187
    invoke-static/range {v5 .. v10}, Lkotlin/text/StringsKt;->lastIndexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    add-int/2addr v6, v4

    .line 192
    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    const-string v5, "this as java.lang.String).substring(startIndex)"

    .line 197
    .line 198
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    const/16 v18, 0x38

    .line 202
    .line 203
    const/16 v19, 0x0

    .line 204
    .line 205
    const/4 v13, 0x0

    .line 206
    const/4 v14, 0x0

    .line 207
    const/4 v15, 0x0

    .line 208
    move-object/from16 v16, v1

    .line 209
    .line 210
    move-object v9, v2

    .line 211
    move-object v10, v3

    .line 212
    move-object/from16 v17, v4

    .line 213
    .line 214
    invoke-static/range {v9 .. v19}, Lg4/b$a;->a(Lg4/b;Lq4/c;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    iget-object v1, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->d:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;

    .line 218
    .line 219
    invoke-virtual {v1}, Li4/a;->q()Lg4/b;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-interface {v1}, Lg4/b;->l()V

    .line 224
    .line 225
    .line 226
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 227
    .line 228
    return-object v1
.end method
