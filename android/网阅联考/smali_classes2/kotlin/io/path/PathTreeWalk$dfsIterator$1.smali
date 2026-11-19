.class final Lkotlin/io/path/PathTreeWalk$dfsIterator$1;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/io/path/PathTreeWalk;->dfsIterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlin/sequences/SequenceScope<",
        "-",
        "Ljava/nio/file/Path;",
        ">;",
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"
    }
    d2 = {
        "Lkotlin/sequences/SequenceScope;",
        "Ljava/nio/file/Path;",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "kotlin.io.path.PathTreeWalk$dfsIterator$1"
    f = "PathTreeWalk.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3
    }
    l = {
        0xb8,
        0xbe,
        0xc7,
        0xcd
    }
    m = "invokeSuspend"
    n = {
        "$this$iterator",
        "stack",
        "entriesReader",
        "startNode",
        "this_$iv",
        "path$iv",
        "$this$iterator",
        "stack",
        "entriesReader",
        "$this$iterator",
        "stack",
        "entriesReader",
        "pathNode",
        "this_$iv",
        "path$iv",
        "$this$iterator",
        "stack",
        "entriesReader"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$0",
        "L$1",
        "L$2"
    }
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lkotlin/io/path/PathTreeWalk;


# direct methods
.method public constructor <init>(Lkotlin/io/path/PathTreeWalk;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/io/path/PathTreeWalk;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/io/path/PathTreeWalk$dfsIterator$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->this$0:Lkotlin/io/path/PathTreeWalk;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;

    iget-object v1, p0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->this$0:Lkotlin/io/path/PathTreeWalk;

    invoke-direct {v0, v1, p2}, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;-><init>(Lkotlin/io/path/PathTreeWalk;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlin/sequences/SequenceScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->invoke(Lkotlin/sequences/SequenceScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/sequences/SequenceScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/sequences/SequenceScope<",
            "-",
            "Ljava/nio/file/Path;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

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
    iget v2, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->label:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x4

    .line 11
    const/4 v5, 0x3

    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x1

    .line 15
    if-eqz v2, :cond_4

    .line 16
    .line 17
    if-eq v2, v8, :cond_3

    .line 18
    .line 19
    if-eq v2, v6, :cond_0

    .line 20
    .line 21
    if-eq v2, v5, :cond_2

    .line 22
    .line 23
    if-ne v2, v4, :cond_1

    .line 24
    .line 25
    :cond_0
    iget-object v2, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$2:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Lkotlin/io/path/DirectoryEntriesReader;

    .line 28
    .line 29
    iget-object v6, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$1:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v6, Lkotlin/collections/ArrayDeque;

    .line 32
    .line 33
    iget-object v9, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$0:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v9, Lkotlin/sequences/SequenceScope;

    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_2

    .line 41
    .line 42
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v1

    .line 50
    :cond_2
    iget-object v2, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$5:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-static {v2}, Lkotlin/io/path/e;->a(Ljava/lang/Object;)Ljava/nio/file/Path;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget-object v6, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$4:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v6, Lkotlin/io/path/PathTreeWalk;

    .line 59
    .line 60
    iget-object v9, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$3:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v9, Lkotlin/io/path/PathNode;

    .line 63
    .line 64
    iget-object v10, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$2:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v10, Lkotlin/io/path/DirectoryEntriesReader;

    .line 67
    .line 68
    iget-object v11, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$1:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v11, Lkotlin/collections/ArrayDeque;

    .line 71
    .line 72
    iget-object v12, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$0:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v12, Lkotlin/sequences/SequenceScope;

    .line 75
    .line 76
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    move-object v13, v12

    .line 80
    move-object v12, v11

    .line 81
    move-object v11, v10

    .line 82
    move-object v10, v0

    .line 83
    goto/16 :goto_4

    .line 84
    .line 85
    :cond_3
    iget-object v2, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$5:Ljava/lang/Object;

    .line 86
    .line 87
    invoke-static {v2}, Lkotlin/io/path/e;->a(Ljava/lang/Object;)Ljava/nio/file/Path;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    iget-object v6, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$4:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v6, Lkotlin/io/path/PathTreeWalk;

    .line 94
    .line 95
    iget-object v9, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$3:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v9, Lkotlin/io/path/PathNode;

    .line 98
    .line 99
    iget-object v10, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$2:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v10, Lkotlin/io/path/DirectoryEntriesReader;

    .line 102
    .line 103
    iget-object v11, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$1:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v11, Lkotlin/collections/ArrayDeque;

    .line 106
    .line 107
    iget-object v12, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$0:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v12, Lkotlin/sequences/SequenceScope;

    .line 110
    .line 111
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto/16 :goto_0

    .line 115
    .line 116
    :cond_4
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    iget-object v2, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$0:Ljava/lang/Object;

    .line 120
    .line 121
    move-object v9, v2

    .line 122
    check-cast v9, Lkotlin/sequences/SequenceScope;

    .line 123
    .line 124
    new-instance v2, Lkotlin/collections/ArrayDeque;

    .line 125
    .line 126
    invoke-direct {v2}, Lkotlin/collections/ArrayDeque;-><init>()V

    .line 127
    .line 128
    .line 129
    new-instance v10, Lkotlin/io/path/DirectoryEntriesReader;

    .line 130
    .line 131
    iget-object v11, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->this$0:Lkotlin/io/path/PathTreeWalk;

    .line 132
    .line 133
    invoke-static {v11}, Lkotlin/io/path/PathTreeWalk;->access$getFollowLinks(Lkotlin/io/path/PathTreeWalk;)Z

    .line 134
    .line 135
    .line 136
    move-result v11

    .line 137
    invoke-direct {v10, v11}, Lkotlin/io/path/DirectoryEntriesReader;-><init>(Z)V

    .line 138
    .line 139
    .line 140
    new-instance v11, Lkotlin/io/path/PathNode;

    .line 141
    .line 142
    iget-object v12, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->this$0:Lkotlin/io/path/PathTreeWalk;

    .line 143
    .line 144
    invoke-static {v12}, Lkotlin/io/path/PathTreeWalk;->access$getStart$p(Lkotlin/io/path/PathTreeWalk;)Ljava/nio/file/Path;

    .line 145
    .line 146
    .line 147
    move-result-object v12

    .line 148
    iget-object v13, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->this$0:Lkotlin/io/path/PathTreeWalk;

    .line 149
    .line 150
    invoke-static {v13}, Lkotlin/io/path/PathTreeWalk;->access$getStart$p(Lkotlin/io/path/PathTreeWalk;)Ljava/nio/file/Path;

    .line 151
    .line 152
    .line 153
    move-result-object v13

    .line 154
    iget-object v14, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->this$0:Lkotlin/io/path/PathTreeWalk;

    .line 155
    .line 156
    invoke-static {v14}, Lkotlin/io/path/PathTreeWalk;->access$getLinkOptions(Lkotlin/io/path/PathTreeWalk;)[Ljava/nio/file/LinkOption;

    .line 157
    .line 158
    .line 159
    move-result-object v14

    .line 160
    invoke-static {v13, v14}, Lkotlin/io/path/PathTreeWalkKt;->access$keyOf(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v13

    .line 164
    invoke-direct {v11, v12, v13, v7}, Lkotlin/io/path/PathNode;-><init>(Ljava/nio/file/Path;Ljava/lang/Object;Lkotlin/io/path/PathNode;)V

    .line 165
    .line 166
    .line 167
    iget-object v12, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->this$0:Lkotlin/io/path/PathTreeWalk;

    .line 168
    .line 169
    invoke-virtual {v11}, Lkotlin/io/path/PathNode;->getPath()Ljava/nio/file/Path;

    .line 170
    .line 171
    .line 172
    move-result-object v13

    .line 173
    invoke-static {v12}, Lkotlin/io/path/PathTreeWalk;->access$getLinkOptions(Lkotlin/io/path/PathTreeWalk;)[Ljava/nio/file/LinkOption;

    .line 174
    .line 175
    .line 176
    move-result-object v14

    .line 177
    array-length v15, v14

    .line 178
    invoke-static {v14, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v14

    .line 182
    check-cast v14, [Ljava/nio/file/LinkOption;

    .line 183
    .line 184
    array-length v15, v14

    .line 185
    invoke-static {v14, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v14

    .line 189
    check-cast v14, [Ljava/nio/file/LinkOption;

    .line 190
    .line 191
    invoke-static {v13, v14}, Lkotlin/io/path/a;->a(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 192
    .line 193
    .line 194
    move-result v14

    .line 195
    if-eqz v14, :cond_8

    .line 196
    .line 197
    invoke-static {v11}, Lkotlin/io/path/PathTreeWalkKt;->access$createsCycle(Lkotlin/io/path/PathNode;)Z

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    if-nez v6, :cond_7

    .line 202
    .line 203
    invoke-static {v12}, Lkotlin/io/path/PathTreeWalk;->access$getIncludeDirectories(Lkotlin/io/path/PathTreeWalk;)Z

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    if-eqz v6, :cond_6

    .line 208
    .line 209
    iput-object v9, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$0:Ljava/lang/Object;

    .line 210
    .line 211
    iput-object v2, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$1:Ljava/lang/Object;

    .line 212
    .line 213
    iput-object v10, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$2:Ljava/lang/Object;

    .line 214
    .line 215
    iput-object v11, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$3:Ljava/lang/Object;

    .line 216
    .line 217
    iput-object v12, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$4:Ljava/lang/Object;

    .line 218
    .line 219
    iput-object v13, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$5:Ljava/lang/Object;

    .line 220
    .line 221
    iput v8, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->label:I

    .line 222
    .line 223
    invoke-virtual {v9, v13, v0}, Lkotlin/sequences/SequenceScope;->yield(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    if-ne v6, v1, :cond_5

    .line 228
    .line 229
    return-object v1

    .line 230
    :cond_5
    move-object v6, v12

    .line 231
    move-object v12, v9

    .line 232
    move-object v9, v11

    .line 233
    move-object v11, v2

    .line 234
    move-object v2, v13

    .line 235
    :goto_0
    move-object v13, v2

    .line 236
    move-object v2, v11

    .line 237
    move-object v11, v9

    .line 238
    move-object v9, v12

    .line 239
    move-object v12, v6

    .line 240
    :cond_6
    invoke-static {v12}, Lkotlin/io/path/PathTreeWalk;->access$getLinkOptions(Lkotlin/io/path/PathTreeWalk;)[Ljava/nio/file/LinkOption;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    array-length v12, v6

    .line 245
    invoke-static {v6, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    check-cast v6, [Ljava/nio/file/LinkOption;

    .line 250
    .line 251
    array-length v12, v6

    .line 252
    invoke-static {v6, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    check-cast v6, [Ljava/nio/file/LinkOption;

    .line 257
    .line 258
    invoke-static {v13, v6}, Lkotlin/io/path/a;->a(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    if-eqz v6, :cond_9

    .line 263
    .line 264
    invoke-virtual {v10, v11}, Lkotlin/io/path/DirectoryEntriesReader;->readEntries(Lkotlin/io/path/PathNode;)Ljava/util/List;

    .line 265
    .line 266
    .line 267
    move-result-object v6

    .line 268
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object v6

    .line 272
    invoke-virtual {v11, v6}, Lkotlin/io/path/PathNode;->setContentIterator(Ljava/util/Iterator;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v11}, Lkotlin/collections/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    goto :goto_1

    .line 279
    :cond_7
    invoke-static {}, Lkotlin/io/path/a0;->a()V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-static {v1}, Lkotlin/io/path/z;->a(Ljava/lang/String;)Ljava/nio/file/FileSystemLoopException;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    throw v1

    .line 291
    :cond_8
    new-array v11, v8, [Ljava/nio/file/LinkOption;

    .line 292
    .line 293
    invoke-static {}, Lkotlin/io/path/b;->a()Ljava/nio/file/LinkOption;

    .line 294
    .line 295
    .line 296
    move-result-object v12

    .line 297
    aput-object v12, v11, v3

    .line 298
    .line 299
    invoke-static {v11, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v11

    .line 303
    check-cast v11, [Ljava/nio/file/LinkOption;

    .line 304
    .line 305
    invoke-static {v13, v11}, Lkotlin/io/path/y;->a(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 306
    .line 307
    .line 308
    move-result v11

    .line 309
    if-eqz v11, :cond_9

    .line 310
    .line 311
    iput-object v9, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$0:Ljava/lang/Object;

    .line 312
    .line 313
    iput-object v2, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$1:Ljava/lang/Object;

    .line 314
    .line 315
    iput-object v10, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$2:Ljava/lang/Object;

    .line 316
    .line 317
    iput v6, v0, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->label:I

    .line 318
    .line 319
    invoke-virtual {v9, v13, v0}, Lkotlin/sequences/SequenceScope;->yield(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v6

    .line 323
    if-ne v6, v1, :cond_9

    .line 324
    .line 325
    return-object v1

    .line 326
    :cond_9
    :goto_1
    move-object v6, v2

    .line 327
    move-object v2, v10

    .line 328
    :goto_2
    move-object v10, v0

    .line 329
    :cond_a
    :goto_3
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 330
    .line 331
    .line 332
    move-result v11

    .line 333
    xor-int/2addr v11, v8

    .line 334
    if-eqz v11, :cond_10

    .line 335
    .line 336
    invoke-virtual {v6}, Lkotlin/collections/ArrayDeque;->last()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v11

    .line 340
    check-cast v11, Lkotlin/io/path/PathNode;

    .line 341
    .line 342
    invoke-virtual {v11}, Lkotlin/io/path/PathNode;->getContentIterator()Ljava/util/Iterator;

    .line 343
    .line 344
    .line 345
    move-result-object v11

    .line 346
    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 350
    .line 351
    .line 352
    move-result v12

    .line 353
    if-eqz v12, :cond_f

    .line 354
    .line 355
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v11

    .line 359
    check-cast v11, Lkotlin/io/path/PathNode;

    .line 360
    .line 361
    iget-object v12, v10, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->this$0:Lkotlin/io/path/PathTreeWalk;

    .line 362
    .line 363
    invoke-virtual {v11}, Lkotlin/io/path/PathNode;->getPath()Ljava/nio/file/Path;

    .line 364
    .line 365
    .line 366
    move-result-object v13

    .line 367
    invoke-static {v12}, Lkotlin/io/path/PathTreeWalk;->access$getLinkOptions(Lkotlin/io/path/PathTreeWalk;)[Ljava/nio/file/LinkOption;

    .line 368
    .line 369
    .line 370
    move-result-object v14

    .line 371
    array-length v15, v14

    .line 372
    invoke-static {v14, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v14

    .line 376
    check-cast v14, [Ljava/nio/file/LinkOption;

    .line 377
    .line 378
    array-length v15, v14

    .line 379
    invoke-static {v14, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v14

    .line 383
    check-cast v14, [Ljava/nio/file/LinkOption;

    .line 384
    .line 385
    invoke-static {v13, v14}, Lkotlin/io/path/a;->a(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 386
    .line 387
    .line 388
    move-result v14

    .line 389
    if-eqz v14, :cond_e

    .line 390
    .line 391
    invoke-static {v11}, Lkotlin/io/path/PathTreeWalkKt;->access$createsCycle(Lkotlin/io/path/PathNode;)Z

    .line 392
    .line 393
    .line 394
    move-result v14

    .line 395
    if-nez v14, :cond_d

    .line 396
    .line 397
    invoke-static {v12}, Lkotlin/io/path/PathTreeWalk;->access$getIncludeDirectories(Lkotlin/io/path/PathTreeWalk;)Z

    .line 398
    .line 399
    .line 400
    move-result v14

    .line 401
    if-eqz v14, :cond_c

    .line 402
    .line 403
    iput-object v9, v10, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$0:Ljava/lang/Object;

    .line 404
    .line 405
    iput-object v6, v10, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$1:Ljava/lang/Object;

    .line 406
    .line 407
    iput-object v2, v10, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$2:Ljava/lang/Object;

    .line 408
    .line 409
    iput-object v11, v10, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$3:Ljava/lang/Object;

    .line 410
    .line 411
    iput-object v12, v10, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$4:Ljava/lang/Object;

    .line 412
    .line 413
    iput-object v13, v10, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$5:Ljava/lang/Object;

    .line 414
    .line 415
    iput v5, v10, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->label:I

    .line 416
    .line 417
    invoke-virtual {v9, v13, v10}, Lkotlin/sequences/SequenceScope;->yield(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v14

    .line 421
    if-ne v14, v1, :cond_b

    .line 422
    .line 423
    return-object v1

    .line 424
    :cond_b
    move-object/from16 v16, v11

    .line 425
    .line 426
    move-object v11, v2

    .line 427
    move-object v2, v13

    .line 428
    move-object v13, v9

    .line 429
    move-object/from16 v9, v16

    .line 430
    .line 431
    move-object/from16 v17, v12

    .line 432
    .line 433
    move-object v12, v6

    .line 434
    move-object/from16 v6, v17

    .line 435
    .line 436
    :goto_4
    move-object/from16 v16, v13

    .line 437
    .line 438
    move-object v13, v2

    .line 439
    move-object v2, v11

    .line 440
    move-object v11, v9

    .line 441
    move-object/from16 v9, v16

    .line 442
    .line 443
    move-object/from16 v17, v12

    .line 444
    .line 445
    move-object v12, v6

    .line 446
    move-object/from16 v6, v17

    .line 447
    .line 448
    :cond_c
    invoke-static {v12}, Lkotlin/io/path/PathTreeWalk;->access$getLinkOptions(Lkotlin/io/path/PathTreeWalk;)[Ljava/nio/file/LinkOption;

    .line 449
    .line 450
    .line 451
    move-result-object v12

    .line 452
    array-length v14, v12

    .line 453
    invoke-static {v12, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v12

    .line 457
    check-cast v12, [Ljava/nio/file/LinkOption;

    .line 458
    .line 459
    array-length v14, v12

    .line 460
    invoke-static {v12, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v12

    .line 464
    check-cast v12, [Ljava/nio/file/LinkOption;

    .line 465
    .line 466
    invoke-static {v13, v12}, Lkotlin/io/path/a;->a(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 467
    .line 468
    .line 469
    move-result v12

    .line 470
    if-eqz v12, :cond_a

    .line 471
    .line 472
    invoke-virtual {v2, v11}, Lkotlin/io/path/DirectoryEntriesReader;->readEntries(Lkotlin/io/path/PathNode;)Ljava/util/List;

    .line 473
    .line 474
    .line 475
    move-result-object v12

    .line 476
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 477
    .line 478
    .line 479
    move-result-object v12

    .line 480
    invoke-virtual {v11, v12}, Lkotlin/io/path/PathNode;->setContentIterator(Ljava/util/Iterator;)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v6, v11}, Lkotlin/collections/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    goto/16 :goto_3

    .line 487
    .line 488
    :cond_d
    invoke-static {}, Lkotlin/io/path/a0;->a()V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    invoke-static {v1}, Lkotlin/io/path/z;->a(Ljava/lang/String;)Ljava/nio/file/FileSystemLoopException;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    throw v1

    .line 500
    :cond_e
    new-array v11, v8, [Ljava/nio/file/LinkOption;

    .line 501
    .line 502
    invoke-static {}, Lkotlin/io/path/b;->a()Ljava/nio/file/LinkOption;

    .line 503
    .line 504
    .line 505
    move-result-object v12

    .line 506
    aput-object v12, v11, v3

    .line 507
    .line 508
    invoke-static {v11, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v11

    .line 512
    check-cast v11, [Ljava/nio/file/LinkOption;

    .line 513
    .line 514
    invoke-static {v13, v11}, Lkotlin/io/path/y;->a(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 515
    .line 516
    .line 517
    move-result v11

    .line 518
    if-eqz v11, :cond_a

    .line 519
    .line 520
    iput-object v9, v10, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$0:Ljava/lang/Object;

    .line 521
    .line 522
    iput-object v6, v10, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$1:Ljava/lang/Object;

    .line 523
    .line 524
    iput-object v2, v10, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$2:Ljava/lang/Object;

    .line 525
    .line 526
    iput-object v7, v10, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$3:Ljava/lang/Object;

    .line 527
    .line 528
    iput-object v7, v10, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$4:Ljava/lang/Object;

    .line 529
    .line 530
    iput-object v7, v10, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->L$5:Ljava/lang/Object;

    .line 531
    .line 532
    iput v4, v10, Lkotlin/io/path/PathTreeWalk$dfsIterator$1;->label:I

    .line 533
    .line 534
    invoke-virtual {v9, v13, v10}, Lkotlin/sequences/SequenceScope;->yield(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v11

    .line 538
    if-ne v11, v1, :cond_a

    .line 539
    .line 540
    return-object v1

    .line 541
    :cond_f
    invoke-virtual {v6}, Lkotlin/collections/ArrayDeque;->removeLast()Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    goto/16 :goto_3

    .line 545
    .line 546
    :cond_10
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 547
    .line 548
    return-object v1
.end method
