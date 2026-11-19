.class final Landroidx/collection/MutableEntries$iterator$1$1;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/collection/MutableEntries$iterator$1;-><init>(Landroidx/collection/MutableEntries;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\'\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u0002H\u008a@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "K",
        "V",
        "Lz6/j;",
        "",
        "Ld6/s;",
        "<anonymous>",
        "(Lz6/j;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.collection.MutableEntries$iterator$1$1"
    f = "ScatterMap.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x602
    }
    m = "invokeSuspend"
    n = {
        "$this$iterator",
        "m$iv",
        "lastIndex$iv",
        "i$iv",
        "slot$iv",
        "bitCount$iv",
        "j$iv"
    }
    s = {
        "L$0",
        "L$3",
        "I$0",
        "I$1",
        "J$0",
        "I$2",
        "I$3"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableEntries$iterator$1$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1787:1\n329#2,6:1788\n339#2,3:1795\n342#2,9:1799\n1399#3:1794\n1270#3:1798\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableEntries$iterator$1$1\n*L\n1536#1:1788,6\n1536#1:1795,3\n1536#1:1799,9\n1536#1:1794\n1536#1:1798\n*E\n"
    }
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field I$2:I

.field I$3:I

.field J$0:J

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/collection/MutableEntries;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableEntries<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field final synthetic this$1:Landroidx/collection/MutableEntries$iterator$1;


# direct methods
.method public constructor <init>(Landroidx/collection/MutableEntries;Landroidx/collection/MutableEntries$iterator$1;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableEntries<",
            "TK;TV;>;",
            "Landroidx/collection/MutableEntries$iterator$1;",
            "Lh6/c<",
            "-",
            "Landroidx/collection/MutableEntries$iterator$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/collection/MutableEntries$iterator$1$1;->this$0:Landroidx/collection/MutableEntries;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/collection/MutableEntries$iterator$1$1;->this$1:Landroidx/collection/MutableEntries$iterator$1;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILh6/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 3
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
    new-instance v0, Landroidx/collection/MutableEntries$iterator$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/collection/MutableEntries$iterator$1$1;->this$0:Landroidx/collection/MutableEntries;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/collection/MutableEntries$iterator$1$1;->this$1:Landroidx/collection/MutableEntries$iterator$1;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Landroidx/collection/MutableEntries$iterator$1$1;-><init>(Landroidx/collection/MutableEntries;Landroidx/collection/MutableEntries$iterator$1;Lh6/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Landroidx/collection/MutableEntries$iterator$1$1;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lz6/j;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Landroidx/collection/MutableEntries$iterator$1$1;->invoke(Lz6/j;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lz6/j;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz6/j;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/collection/MutableEntries$iterator$1$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Landroidx/collection/MutableEntries$iterator$1$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Landroidx/collection/MutableEntries$iterator$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v0, Landroidx/collection/MutableEntries$iterator$1$1;->label:I

    .line 6
    .line 7
    const/16 v4, 0x8

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v5, :cond_0

    .line 13
    .line 14
    iget v2, v0, Landroidx/collection/MutableEntries$iterator$1$1;->I$3:I

    .line 15
    .line 16
    iget v6, v0, Landroidx/collection/MutableEntries$iterator$1$1;->I$2:I

    .line 17
    .line 18
    iget-wide v7, v0, Landroidx/collection/MutableEntries$iterator$1$1;->J$0:J

    .line 19
    .line 20
    iget v9, v0, Landroidx/collection/MutableEntries$iterator$1$1;->I$1:I

    .line 21
    .line 22
    iget v10, v0, Landroidx/collection/MutableEntries$iterator$1$1;->I$0:I

    .line 23
    .line 24
    iget-object v11, v0, Landroidx/collection/MutableEntries$iterator$1$1;->L$3:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v11, [J

    .line 27
    .line 28
    iget-object v12, v0, Landroidx/collection/MutableEntries$iterator$1$1;->L$2:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v12, Landroidx/collection/MutableEntries;

    .line 31
    .line 32
    iget-object v13, v0, Landroidx/collection/MutableEntries$iterator$1$1;->L$1:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v13, Landroidx/collection/MutableEntries$iterator$1;

    .line 35
    .line 36
    iget-object v14, v0, Landroidx/collection/MutableEntries$iterator$1$1;->L$0:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v14, Lz6/j;

    .line 39
    .line 40
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto/16 :goto_2

    .line 44
    .line 45
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v1

    .line 53
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v2, v0, Landroidx/collection/MutableEntries$iterator$1$1;->L$0:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, Lz6/j;

    .line 59
    .line 60
    iget-object v6, v0, Landroidx/collection/MutableEntries$iterator$1$1;->this$0:Landroidx/collection/MutableEntries;

    .line 61
    .line 62
    invoke-static {v6}, Landroidx/collection/MutableEntries;->access$getParent$p(Landroidx/collection/MutableEntries;)Landroidx/collection/MutableScatterMap;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    iget-object v7, v0, Landroidx/collection/MutableEntries$iterator$1$1;->this$1:Landroidx/collection/MutableEntries$iterator$1;

    .line 67
    .line 68
    iget-object v8, v0, Landroidx/collection/MutableEntries$iterator$1$1;->this$0:Landroidx/collection/MutableEntries;

    .line 69
    .line 70
    iget-object v6, v6, Landroidx/collection/ScatterMap;->metadata:[J

    .line 71
    .line 72
    array-length v9, v6

    .line 73
    add-int/lit8 v9, v9, -0x2

    .line 74
    .line 75
    if-ltz v9, :cond_6

    .line 76
    .line 77
    const/4 v10, 0x0

    .line 78
    :goto_0
    aget-wide v11, v6, v10

    .line 79
    .line 80
    not-long v13, v11

    .line 81
    const/4 v15, 0x7

    .line 82
    shl-long/2addr v13, v15

    .line 83
    and-long/2addr v13, v11

    .line 84
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    and-long/2addr v13, v15

    .line 90
    cmp-long v13, v13, v15

    .line 91
    .line 92
    if-eqz v13, :cond_5

    .line 93
    .line 94
    sub-int v13, v10, v9

    .line 95
    .line 96
    not-int v13, v13

    .line 97
    ushr-int/lit8 v13, v13, 0x1f

    .line 98
    .line 99
    rsub-int/lit8 v13, v13, 0x8

    .line 100
    .line 101
    move v14, v10

    .line 102
    move v10, v9

    .line 103
    move v9, v14

    .line 104
    move-object v14, v2

    .line 105
    const/4 v2, 0x0

    .line 106
    move-wide/from16 v19, v11

    .line 107
    .line 108
    move-object v11, v6

    .line 109
    move-object v12, v8

    .line 110
    move v6, v13

    .line 111
    move-object v13, v7

    .line 112
    move-wide/from16 v7, v19

    .line 113
    .line 114
    :goto_1
    if-ge v2, v6, :cond_4

    .line 115
    .line 116
    const-wide/16 v15, 0xff

    .line 117
    .line 118
    and-long/2addr v15, v7

    .line 119
    const-wide/16 v17, 0x80

    .line 120
    .line 121
    cmp-long v15, v15, v17

    .line 122
    .line 123
    if-gez v15, :cond_2

    .line 124
    .line 125
    shl-int/lit8 v15, v9, 0x3

    .line 126
    .line 127
    add-int/2addr v15, v2

    .line 128
    invoke-virtual {v13, v15}, Landroidx/collection/MutableEntries$iterator$1;->setCurrent(I)V

    .line 129
    .line 130
    .line 131
    new-instance v15, Landroidx/collection/MutableMapEntry;

    .line 132
    .line 133
    invoke-static {v12}, Landroidx/collection/MutableEntries;->access$getParent$p(Landroidx/collection/MutableEntries;)Landroidx/collection/MutableScatterMap;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    iget-object v3, v3, Landroidx/collection/ScatterMap;->keys:[Ljava/lang/Object;

    .line 138
    .line 139
    move/from16 v17, v4

    .line 140
    .line 141
    invoke-static {v12}, Landroidx/collection/MutableEntries;->access$getParent$p(Landroidx/collection/MutableEntries;)Landroidx/collection/MutableScatterMap;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    iget-object v4, v4, Landroidx/collection/ScatterMap;->values:[Ljava/lang/Object;

    .line 146
    .line 147
    invoke-virtual {v13}, Landroidx/collection/MutableEntries$iterator$1;->getCurrent()I

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    invoke-direct {v15, v3, v4, v5}, Landroidx/collection/MutableMapEntry;-><init>([Ljava/lang/Object;[Ljava/lang/Object;I)V

    .line 152
    .line 153
    .line 154
    iput-object v14, v0, Landroidx/collection/MutableEntries$iterator$1$1;->L$0:Ljava/lang/Object;

    .line 155
    .line 156
    iput-object v13, v0, Landroidx/collection/MutableEntries$iterator$1$1;->L$1:Ljava/lang/Object;

    .line 157
    .line 158
    iput-object v12, v0, Landroidx/collection/MutableEntries$iterator$1$1;->L$2:Ljava/lang/Object;

    .line 159
    .line 160
    iput-object v11, v0, Landroidx/collection/MutableEntries$iterator$1$1;->L$3:Ljava/lang/Object;

    .line 161
    .line 162
    iput v10, v0, Landroidx/collection/MutableEntries$iterator$1$1;->I$0:I

    .line 163
    .line 164
    iput v9, v0, Landroidx/collection/MutableEntries$iterator$1$1;->I$1:I

    .line 165
    .line 166
    iput-wide v7, v0, Landroidx/collection/MutableEntries$iterator$1$1;->J$0:J

    .line 167
    .line 168
    iput v6, v0, Landroidx/collection/MutableEntries$iterator$1$1;->I$2:I

    .line 169
    .line 170
    iput v2, v0, Landroidx/collection/MutableEntries$iterator$1$1;->I$3:I

    .line 171
    .line 172
    const/4 v3, 0x1

    .line 173
    iput v3, v0, Landroidx/collection/MutableEntries$iterator$1$1;->label:I

    .line 174
    .line 175
    invoke-virtual {v14, v0, v15}, Lz6/j;->a(Lh6/c;Ljava/lang/Object;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    if-ne v4, v1, :cond_3

    .line 180
    .line 181
    return-object v1

    .line 182
    :cond_2
    :goto_2
    move/from16 v17, v4

    .line 183
    .line 184
    move v3, v5

    .line 185
    :cond_3
    shr-long v7, v7, v17

    .line 186
    .line 187
    add-int/2addr v2, v3

    .line 188
    move v5, v3

    .line 189
    move/from16 v4, v17

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_4
    move v3, v5

    .line 193
    if-ne v6, v4, :cond_6

    .line 194
    .line 195
    move v2, v10

    .line 196
    move v10, v9

    .line 197
    move v9, v2

    .line 198
    move-object v6, v11

    .line 199
    move-object v8, v12

    .line 200
    move-object v7, v13

    .line 201
    move-object v2, v14

    .line 202
    goto :goto_3

    .line 203
    :cond_5
    move v3, v5

    .line 204
    :goto_3
    if-eq v10, v9, :cond_6

    .line 205
    .line 206
    add-int/lit8 v10, v10, 0x1

    .line 207
    .line 208
    move v5, v3

    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :cond_6
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 212
    .line 213
    return-object v1
.end method
