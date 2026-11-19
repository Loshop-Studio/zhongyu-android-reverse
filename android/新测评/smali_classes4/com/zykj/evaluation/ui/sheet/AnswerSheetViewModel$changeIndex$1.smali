# RE note 本类字节码直接引用的读写或显示接口包括位图。
.class final Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->o(I)V
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
    c = "com.zykj.evaluation.ui.sheet.AnswerSheetViewModel$changeIndex$1"
    f = "AnswerSheetViewModel.kt"
    i = {}
    l = {
        0xce
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAnswerSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerSheetViewModel.kt\ncom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,281:1\n88#2:282\n1563#3:283\n1634#3,3:284\n*S KotlinDebug\n*F\n+ 1 AnswerSheetViewModel.kt\ncom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1\n*L\n211#1:282\n213#1:283\n213#1:284,3\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;ILkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;->b:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iput p2, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;->c:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;->b:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iget v1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;->c:I

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;-><init>(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;ILkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

# RE I/O 解码本地图片（BitmapFactory.decodeFile）。
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;->b:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->v()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iget v1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;->c:I

    .line 34
    .line 35
    if-ne p1, v1, :cond_2

    .line 36
    .line 37
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_2
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;->b:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    .line 41
    .line 42
    iput v2, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;->a:I

    .line 43
    .line 44
    invoke-virtual {p1, p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->s(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-ne p1, v0, :cond_3

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;->b:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->y()[Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;->c:I

    .line 58
    .line 59
    aget-object p1, p1, v0

    .line 60
    .line 61
    if-eqz p1, :cond_5

    .line 62
    .line 63
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-nez p1, :cond_4

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    :goto_1
    move-object v4, p1

    .line 71
    goto :goto_3

    .line 72
    :cond_5
    :goto_2
    sget-object p1, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    .line 73
    .line 74
    invoke-static {v2, v2, p1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    goto :goto_1

    .line 79
    :goto_3
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;->b:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->D()Lcom/zykj/evaluation/ui/sheet/a;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/sheet/a;->e()Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;->b:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    .line 90
    .line 91
    iget v1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;->c:I

    .line 92
    .line 93
    new-instance v8, Ljava/util/ArrayList;

    .line 94
    .line 95
    const/16 v3, 0xa

    .line 96
    .line 97
    invoke-static {p1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    invoke-direct {v8, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 102
    .line 103
    .line 104
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eqz v3, :cond_a

    .line 113
    .line 114
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    check-cast v3, Lv6/z;

    .line 119
    .line 120
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->y()[Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-virtual {v3}, Lv6/z;->c()I

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    aget-object v5, v5, v6

    .line 129
    .line 130
    invoke-virtual {v3}, Lv6/z;->c()I

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    if-ne v6, v1, :cond_7

    .line 135
    .line 136
    if-eqz v5, :cond_6

    .line 137
    .line 138
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-nez v5, :cond_6

    .line 143
    .line 144
    sget-object v5, Lcom/zykj/evaluation/ui/sheet/c$a$a;->d:Lcom/zykj/evaluation/ui/sheet/c$a$a;

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_6
    sget-object v5, Lcom/zykj/evaluation/ui/sheet/c$a$b;->d:Lcom/zykj/evaluation/ui/sheet/c$a$b;

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_7
    if-nez v5, :cond_8

    .line 151
    .line 152
    sget-object v5, Lcom/zykj/evaluation/ui/sheet/c$c;->d:Lcom/zykj/evaluation/ui/sheet/c$c;

    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_8
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    if-nez v5, :cond_9

    .line 160
    .line 161
    sget-object v5, Lcom/zykj/evaluation/ui/sheet/c$b$a;->d:Lcom/zykj/evaluation/ui/sheet/c$b$a;

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_9
    sget-object v5, Lcom/zykj/evaluation/ui/sheet/c$b$b;->d:Lcom/zykj/evaluation/ui/sheet/c$b$b;

    .line 165
    .line 166
    :goto_5
    const/4 v6, 0x0

    .line 167
    const/4 v7, 0x0

    .line 168
    invoke-static {v3, v6, v5, v2, v7}, Lv6/z;->b(Lv6/z;ILcom/zykj/evaluation/ui/sheet/c;ILjava/lang/Object;)Lv6/z;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-interface {v8, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_a
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;->b:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    .line 177
    .line 178
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->D()Lcom/zykj/evaluation/ui/sheet/a;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    const/16 v10, 0x2e

    .line 183
    .line 184
    const/4 v11, 0x0

    .line 185
    const/4 v5, 0x0

    .line 186
    const/4 v6, 0x0

    .line 187
    const/4 v7, 0x0

    .line 188
    const/4 v9, 0x0

    .line 189
    invoke-static/range {v3 .. v11}, Lcom/zykj/evaluation/ui/sheet/a;->b(Lcom/zykj/evaluation/ui/sheet/a;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lcom/zykj/evaluation/ui/sheet/b;Ljava/util/List;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/sheet/a;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-virtual {p1, v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->X(Lcom/zykj/evaluation/ui/sheet/a;)V

    .line 194
    .line 195
    .line 196
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;->b:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    .line 197
    .line 198
    iget v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;->c:I

    .line 199
    .line 200
    invoke-virtual {p1, v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->q(I)V

    .line 201
    .line 202
    .line 203
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 204
    .line 205
    return-object p1
.end method
