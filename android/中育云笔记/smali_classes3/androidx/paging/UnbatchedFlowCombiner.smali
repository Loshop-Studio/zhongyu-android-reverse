.class public final Landroidx/paging/UnbatchedFlowCombiner;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T1:",
        "Ljava/lang/Object;",
        "T2:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final initialDispatched:Lsd/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/s;"
        }
    .end annotation
.end field

.field private final lock:Lbe/a;

.field private final send:Lhd/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/r;"
        }
    .end annotation
.end field

.field private final valueReceived:[Lsd/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lsd/s;"
        }
    .end annotation
.end field

.field private final values:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lhd/r;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/r;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "send"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/paging/UnbatchedFlowCombiner;->send:Lhd/r;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-static {p1, v0, p1}, Lsd/u;->b(Lkotlinx/coroutines/g;ILjava/lang/Object;)Lsd/s;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iput-object v1, p0, Landroidx/paging/UnbatchedFlowCombiner;->initialDispatched:Lsd/s;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-static {v1, v0, p1}, Lbe/f;->b(ZILjava/lang/Object;)Lbe/a;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iput-object v2, p0, Landroidx/paging/UnbatchedFlowCombiner;->lock:Lbe/a;

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    new-array v3, v2, [Lsd/s;

    .line 28
    .line 29
    move v4, v1

    .line 30
    :goto_0
    if-ge v4, v2, :cond_0

    .line 31
    .line 32
    invoke-static {p1, v0, p1}, Lsd/u;->b(Lkotlinx/coroutines/g;ILjava/lang/Object;)Lsd/s;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    aput-object v5, v3, v4

    .line 37
    .line 38
    add-int/lit8 v4, v4, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iput-object v3, p0, Landroidx/paging/UnbatchedFlowCombiner;->valueReceived:[Lsd/s;

    .line 42
    .line 43
    new-array p1, v2, [Ljava/lang/Object;

    .line 44
    .line 45
    :goto_1
    if-ge v1, v2, :cond_1

    .line 46
    .line 47
    invoke-static {}, Landroidx/paging/FlowExtKt;->access$getNULL$p()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    aput-object v0, p1, v1

    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    iput-object p1, p0, Landroidx/paging/UnbatchedFlowCombiner;->values:[Ljava/lang/Object;

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final onNext(ILjava/lang/Object;Lvc/c;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Object;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p3, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;-><init>(Landroidx/paging/UnbatchedFlowCombiner;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    const/4 v6, 0x0

    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    if-eq v2, v5, :cond_3

    .line 40
    .line 41
    if-eq v2, v4, :cond_2

    .line 42
    .line 43
    if-ne v2, v3, :cond_1

    .line 44
    .line 45
    iget-object p1, v0, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Lbe/a;

    .line 48
    .line 49
    :try_start_0
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    goto/16 :goto_8

    .line 53
    .line 54
    :catchall_0
    move-exception p2

    .line 55
    goto/16 :goto_a

    .line 56
    .line 57
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_2
    iget p1, v0, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;->I$0:I

    .line 66
    .line 67
    iget-object p2, v0, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;->L$1:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p2, Lbe/a;

    .line 70
    .line 71
    iget-object v2, v0, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;->L$0:Ljava/lang/Object;

    .line 72
    .line 73
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_3
    iget p1, v0, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;->I$0:I

    .line 78
    .line 79
    iget-object p2, v0, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;->L$0:Ljava/lang/Object;

    .line 80
    .line 81
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object p3, p0, Landroidx/paging/UnbatchedFlowCombiner;->valueReceived:[Lsd/s;

    .line 89
    .line 90
    aget-object p3, p3, p1

    .line 91
    .line 92
    invoke-interface {p3}, Lkotlinx/coroutines/g;->isCompleted()Z

    .line 93
    .line 94
    .line 95
    move-result p3

    .line 96
    if-eqz p3, :cond_5

    .line 97
    .line 98
    iget-object p3, p0, Landroidx/paging/UnbatchedFlowCombiner;->initialDispatched:Lsd/s;

    .line 99
    .line 100
    iput-object p2, v0, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;->L$0:Ljava/lang/Object;

    .line 101
    .line 102
    iput p1, v0, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;->I$0:I

    .line 103
    .line 104
    iput v5, v0, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;->label:I

    .line 105
    .line 106
    invoke-interface {p3, v0}, Lsd/m0;->z(Lvc/c;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    if-ne p3, v1, :cond_6

    .line 111
    .line 112
    goto/16 :goto_7

    .line 113
    .line 114
    :cond_5
    iget-object p3, p0, Landroidx/paging/UnbatchedFlowCombiner;->valueReceived:[Lsd/s;

    .line 115
    .line 116
    aget-object p3, p3, p1

    .line 117
    .line 118
    sget-object v2, Lqc/q;->a:Lqc/q;

    .line 119
    .line 120
    invoke-interface {p3, v2}, Lsd/s;->n(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p3

    .line 124
    invoke-static {p3}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 125
    .line 126
    .line 127
    :cond_6
    :goto_1
    iget-object p3, p0, Landroidx/paging/UnbatchedFlowCombiner;->lock:Lbe/a;

    .line 128
    .line 129
    iput-object p2, v0, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;->L$0:Ljava/lang/Object;

    .line 130
    .line 131
    iput-object p3, v0, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;->L$1:Ljava/lang/Object;

    .line 132
    .line 133
    iput p1, v0, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;->I$0:I

    .line 134
    .line 135
    iput v4, v0, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;->label:I

    .line 136
    .line 137
    invoke-interface {p3, v6, v0}, Lbe/a;->lock(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    if-ne v2, v1, :cond_7

    .line 142
    .line 143
    goto :goto_7

    .line 144
    :cond_7
    move-object v2, p2

    .line 145
    move-object p2, p3

    .line 146
    :goto_2
    :try_start_1
    iget-object p3, p0, Landroidx/paging/UnbatchedFlowCombiner;->values:[Ljava/lang/Object;

    .line 147
    .line 148
    array-length v4, p3

    .line 149
    const/4 v7, 0x0

    .line 150
    move v8, v7

    .line 151
    :goto_3
    if-ge v8, v4, :cond_9

    .line 152
    .line 153
    aget-object v9, p3, v8

    .line 154
    .line 155
    invoke-static {}, Landroidx/paging/FlowExtKt;->access$getNULL$p()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v10

    .line 159
    if-ne v9, v10, :cond_8

    .line 160
    .line 161
    move p3, v5

    .line 162
    goto :goto_4

    .line 163
    :cond_8
    add-int/lit8 v8, v8, 0x1

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :catchall_1
    move-exception p1

    .line 167
    move-object v11, p2

    .line 168
    move-object p2, p1

    .line 169
    move-object p1, v11

    .line 170
    goto :goto_a

    .line 171
    :cond_9
    move p3, v7

    .line 172
    :goto_4
    iget-object v4, p0, Landroidx/paging/UnbatchedFlowCombiner;->values:[Ljava/lang/Object;

    .line 173
    .line 174
    aput-object v2, v4, p1

    .line 175
    .line 176
    array-length v2, v4

    .line 177
    move v8, v7

    .line 178
    :goto_5
    if-ge v8, v2, :cond_b

    .line 179
    .line 180
    aget-object v9, v4, v8

    .line 181
    .line 182
    invoke-static {}, Landroidx/paging/FlowExtKt;->access$getNULL$p()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v10

    .line 186
    if-ne v9, v10, :cond_a

    .line 187
    .line 188
    move-object p1, p2

    .line 189
    goto :goto_9

    .line 190
    :cond_a
    add-int/lit8 v8, v8, 0x1

    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_b
    if-eqz p3, :cond_c

    .line 194
    .line 195
    sget-object p1, Landroidx/paging/CombineSource;->INITIAL:Landroidx/paging/CombineSource;

    .line 196
    .line 197
    goto :goto_6

    .line 198
    :cond_c
    if-nez p1, :cond_d

    .line 199
    .line 200
    sget-object p1, Landroidx/paging/CombineSource;->RECEIVER:Landroidx/paging/CombineSource;

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_d
    sget-object p1, Landroidx/paging/CombineSource;->OTHER:Landroidx/paging/CombineSource;

    .line 204
    .line 205
    :goto_6
    iget-object p3, p0, Landroidx/paging/UnbatchedFlowCombiner;->send:Lhd/r;

    .line 206
    .line 207
    iget-object v2, p0, Landroidx/paging/UnbatchedFlowCombiner;->values:[Ljava/lang/Object;

    .line 208
    .line 209
    aget-object v4, v2, v7

    .line 210
    .line 211
    aget-object v2, v2, v5

    .line 212
    .line 213
    iput-object p2, v0, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;->L$0:Ljava/lang/Object;

    .line 214
    .line 215
    iput-object v6, v0, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;->L$1:Ljava/lang/Object;

    .line 216
    .line 217
    iput v3, v0, Landroidx/paging/UnbatchedFlowCombiner$onNext$1;->label:I

    .line 218
    .line 219
    invoke-interface {p3, v4, v2, p1, v0}, Lhd/r;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 223
    if-ne p1, v1, :cond_e

    .line 224
    .line 225
    :goto_7
    return-object v1

    .line 226
    :cond_e
    move-object p1, p2

    .line 227
    :goto_8
    :try_start_2
    iget-object p2, p0, Landroidx/paging/UnbatchedFlowCombiner;->initialDispatched:Lsd/s;

    .line 228
    .line 229
    sget-object p3, Lqc/q;->a:Lqc/q;

    .line 230
    .line 231
    invoke-interface {p2, p3}, Lsd/s;->n(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    :goto_9
    sget-object p2, Lqc/q;->a:Lqc/q;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 235
    .line 236
    invoke-interface {p1, v6}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 240
    .line 241
    return-object p1

    .line 242
    :goto_a
    invoke-interface {p1, v6}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    throw p2
.end method
