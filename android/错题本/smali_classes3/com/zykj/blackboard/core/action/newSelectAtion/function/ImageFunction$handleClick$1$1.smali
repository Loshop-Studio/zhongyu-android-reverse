# RE note 本类字节码直接引用的读写或显示接口包括位图。
.class final Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


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
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
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
.field final synthetic $cropFilePath:Ljava/lang/String;

.field final synthetic $graph:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

.field final synthetic $graphFilePath:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Ljava/lang/String;Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;Ljava/lang/String;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/graph/group/ImageGraph;",
            "Ljava/lang/String;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;",
            "Ljava/lang/String;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->$graph:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->$graphFilePath:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->$cropFilePath:Ljava/lang/String;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->$graph:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->$graphFilePath:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->$cropFilePath:Ljava/lang/String;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;-><init>(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Ljava/lang/String;Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;Ljava/lang/String;Lh6/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lkotlinx/coroutines/v;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
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

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

# RE I/O 解码本地图片（BitmapFactory.decodeFile）。
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->label:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    if-ne v2, v4, :cond_0

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    move-object/from16 v2, p1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v1

    .line 27
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sget-object v2, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 31
    .line 32
    sget-object v2, Lg7/d;->a:Lg7/d;

    .line 33
    .line 34
    new-instance v5, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1$newFilePath$1;

    .line 35
    .line 36
    iget-object v6, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->$cropFilePath:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v7, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->$graphFilePath:Ljava/lang/String;

    .line 39
    .line 40
    invoke-direct {v5, v6, v7, v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1$newFilePath$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lh6/c;)V

    .line 41
    .line 42
    .line 43
    iput v4, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->label:I

    .line 44
    .line 45
    invoke-static {v2, v5, v0}, Lkotlinx/coroutines/x;->F(Lh6/h;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-ne v2, v1, :cond_2

    .line 50
    .line 51
    return-object v1

    .line 52
    :cond_2
    :goto_0
    check-cast v2, Ljava/lang/String;

    .line 53
    .line 54
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    .line 55
    .line 56
    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-boolean v4, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 60
    .line 61
    iget-object v5, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->$graph:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 62
    .line 63
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    iget-object v6, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->$graphFilePath:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v6, v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    iget v7, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 77
    .line 78
    int-to-float v7, v7

    .line 79
    div-float/2addr v6, v7

    .line 80
    iget-object v7, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->$graph:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 81
    .line 82
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/graph/Graph;->getRenderMatrix()Landroid/graphics/Matrix;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-static {v2, v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 87
    .line 88
    .line 89
    iget v8, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 90
    .line 91
    int-to-float v8, v8

    .line 92
    mul-float/2addr v8, v6

    .line 93
    iget v1, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 94
    .line 95
    int-to-float v1, v1

    .line 96
    mul-float/2addr v1, v6

    .line 97
    new-instance v12, Landroid/graphics/RectF;

    .line 98
    .line 99
    const/4 v6, 0x0

    .line 100
    invoke-direct {v12, v6, v6, v8, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 101
    .line 102
    .line 103
    new-instance v1, Landroid/graphics/Matrix;

    .line 104
    .line 105
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5}, Landroid/graphics/RectF;->centerX()F

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    invoke-virtual {v12}, Landroid/graphics/RectF;->centerX()F

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    sub-float/2addr v6, v8

    .line 117
    invoke-virtual {v5}, Landroid/graphics/RectF;->centerY()F

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    invoke-virtual {v12}, Landroid/graphics/RectF;->centerY()F

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    sub-float/2addr v5, v8

    .line 126
    invoke-virtual {v1, v6, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v7}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 130
    .line 131
    .line 132
    iget-object v5, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;

    .line 133
    .line 134
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    iget-object v6, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->$graph:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 139
    .line 140
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/graph/Graph;->getId()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    const-string v7, "newFilePath"

    .line 145
    .line 146
    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-interface {v5, v6, v12, v1, v2}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->changeImageGraph(Ljava/lang/String;Landroid/graphics/RectF;Landroid/graphics/Matrix;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    iget-object v5, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;

    .line 153
    .line 154
    invoke-static {v5}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->access$updateSingleSelectedRectF(Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;)V

    .line 155
    .line 156
    .line 157
    iget-object v5, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;

    .line 158
    .line 159
    invoke-static {v5}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->access$calculateFunctionRectF(Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;)V

    .line 160
    .line 161
    .line 162
    iget-object v5, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;

    .line 163
    .line 164
    const/4 v6, 0x0

    .line 165
    invoke-static {v5, v6, v4, v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->showSelectRectF$default(Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;ZILjava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    iget-object v3, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;

    .line 169
    .line 170
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    iget-object v10, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->$graph:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 175
    .line 176
    sget-object v11, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->IMAGE_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 177
    .line 178
    sget-char v3, Ljava/io/File;->separatorChar:C

    .line 179
    .line 180
    const/4 v5, 0x6

    .line 181
    invoke-static {v2, v3, v6, v5}, Lkotlin/text/p;->S(Ljava/lang/CharSequence;CII)I

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    add-int/2addr v3, v4

    .line 186
    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    const-string v3, "this as java.lang.String).substring(startIndex)"

    .line 191
    .line 192
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    const/16 v18, 0x38

    .line 196
    .line 197
    const/16 v19, 0x0

    .line 198
    .line 199
    const/4 v13, 0x0

    .line 200
    const/4 v14, 0x0

    .line 201
    const/4 v15, 0x0

    .line 202
    move-object/from16 v16, v1

    .line 203
    .line 204
    move-object/from16 v17, v2

    .line 205
    .line 206
    invoke-static/range {v9 .. v19}, Lcom/zykj/blackboard/core/action/IActionListener$DefaultImpls;->changeGraph$default(Lcom/zykj/blackboard/core/action/IActionListener;Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    iget-object v1, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;

    .line 210
    .line 211
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-interface {v1}, Lcom/zykj/blackboard/core/action/IActionListener;->saveSnapshot()V

    .line 216
    .line 217
    .line 218
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 219
    .line 220
    return-object v1
.end method
