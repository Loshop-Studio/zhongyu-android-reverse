.class final Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil3/network/NetworkFetcher;->a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lu/l;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lp/p;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lu/l;",
        "response",
        "Lp/p;",
        "<anonymous>",
        "(Lu/l;)Lp/p;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "coil3.network.NetworkFetcher$fetch$fetchResult$1"
    f = "NetworkFetcher.kt"
    i = {
        0x0,
        0x1
    }
    l = {
        0x4c,
        0x57
    }
    m = "invokeSuspend"
    n = {
        "response",
        "response"
    }
    s = {
        "L$0",
        "L$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic e:Lcoil3/network/NetworkFetcher;

.field public final synthetic f:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic g:Lu/j;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcoil3/network/NetworkFetcher;Lkotlin/jvm/internal/Ref$ObjectRef;Lu/j;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->d:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 2
    .line 3
    iput-object p2, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->e:Lcoil3/network/NetworkFetcher;

    .line 4
    .line 5
    iput-object p3, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->f:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 6
    .line 7
    iput-object p4, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->g:Lu/j;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Lu/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;

    .line 6
    .line 7
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6

    new-instance v0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;

    iget-object v1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->d:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->e:Lcoil3/network/NetworkFetcher;

    iget-object v3, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->f:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v4, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->g:Lu/j;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcoil3/network/NetworkFetcher;Lkotlin/jvm/internal/Ref$ObjectRef;Lu/j;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu/l;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->a(Lu/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->b:I

    .line 6
    .line 7
    const-string v2, "Content-Type"

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    const/4 v5, 0x0

    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    if-eq v1, v4, :cond_1

    .line 15
    .line 16
    if-ne v1, v3, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lu/l;

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    move-object v11, p0

    .line 26
    goto/16 :goto_2

    .line 27
    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    iget-object v1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->a:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 39
    .line 40
    iget-object v4, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v4, Lu/l;

    .line 43
    .line 44
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object v11, p0

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->c:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v10, p1

    .line 55
    check-cast v10, Lu/l;

    .line 56
    .line 57
    iget-object v1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->d:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 58
    .line 59
    iget-object v6, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->e:Lcoil3/network/NetworkFetcher;

    .line 60
    .line 61
    iget-object p1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 62
    .line 63
    move-object v7, p1

    .line 64
    check-cast v7, Lcoil3/disk/a$c;

    .line 65
    .line 66
    iget-object p1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->f:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 67
    .line 68
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v8, p1

    .line 71
    check-cast v8, Lu/l;

    .line 72
    .line 73
    iget-object v9, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->g:Lu/j;

    .line 74
    .line 75
    iput-object v10, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->c:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object v1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->a:Ljava/lang/Object;

    .line 78
    .line 79
    iput v4, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->b:I

    .line 80
    .line 81
    move-object v11, p0

    .line 82
    invoke-static/range {v6 .. v11}, Lcoil3/network/NetworkFetcher;->g(Lcoil3/network/NetworkFetcher;Lcoil3/disk/a$c;Lu/l;Lu/j;Lu/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-ne p1, v0, :cond_3

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    move-object v4, v10

    .line 90
    :goto_0
    iput-object p1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 91
    .line 92
    iget-object p1, v11, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->d:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 93
    .line 94
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 95
    .line 96
    if-eqz p1, :cond_5

    .line 97
    .line 98
    iget-object v0, v11, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->f:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 99
    .line 100
    iget-object v1, v11, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->e:Lcoil3/network/NetworkFetcher;

    .line 101
    .line 102
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    check-cast p1, Lcoil3/disk/a$c;

    .line 106
    .line 107
    invoke-static {v1, p1}, Lcoil3/network/NetworkFetcher;->f(Lcoil3/network/NetworkFetcher;Lcoil3/disk/a$c;)Lu/l;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iput-object p1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 112
    .line 113
    new-instance p1, Lp/p;

    .line 114
    .line 115
    iget-object v0, v11, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->e:Lcoil3/network/NetworkFetcher;

    .line 116
    .line 117
    iget-object v1, v11, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->d:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 118
    .line 119
    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 120
    .line 121
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    check-cast v1, Lcoil3/disk/a$c;

    .line 125
    .line 126
    invoke-static {v0, v1}, Lcoil3/network/NetworkFetcher;->d(Lcoil3/network/NetworkFetcher;Lcoil3/disk/a$c;)Ln/r;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iget-object v1, v11, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->e:Lcoil3/network/NetworkFetcher;

    .line 131
    .line 132
    invoke-static {v1}, Lcoil3/network/NetworkFetcher;->b(Lcoil3/network/NetworkFetcher;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    iget-object v4, v11, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->f:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 137
    .line 138
    iget-object v4, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v4, Lu/l;

    .line 141
    .line 142
    if-eqz v4, :cond_4

    .line 143
    .line 144
    invoke-virtual {v4}, Lu/l;->e()Lcoil3/network/c;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    if-eqz v4, :cond_4

    .line 149
    .line 150
    invoke-virtual {v4, v2}, Lcoil3/network/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    :cond_4
    invoke-virtual {v1, v3, v5}, Lcoil3/network/NetworkFetcher;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    sget-object v2, Lcoil3/decode/DataSource;->d:Lcoil3/decode/DataSource;

    .line 159
    .line 160
    invoke-direct {p1, v0, v1, v2}, Lp/p;-><init>(Ln/r;Ljava/lang/String;Lcoil3/decode/DataSource;)V

    .line 161
    .line 162
    .line 163
    return-object p1

    .line 164
    :cond_5
    invoke-static {v4}, Lcoil3/network/internal/UtilsKt;->f(Lu/l;)Lu/m;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    iput-object v4, v11, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->c:Ljava/lang/Object;

    .line 169
    .line 170
    iput-object v5, v11, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->a:Ljava/lang/Object;

    .line 171
    .line 172
    iput v3, v11, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->b:I

    .line 173
    .line 174
    invoke-static {p1, p0}, Lcoil3/network/internal/UtilsKt;->e(Lu/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    if-ne p1, v0, :cond_6

    .line 179
    .line 180
    :goto_1
    return-object v0

    .line 181
    :cond_6
    move-object v0, v4

    .line 182
    :goto_2
    check-cast p1, Lokio/Buffer;

    .line 183
    .line 184
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 185
    .line 186
    .line 187
    move-result-wide v3

    .line 188
    const-wide/16 v6, 0x0

    .line 189
    .line 190
    cmp-long v1, v3, v6

    .line 191
    .line 192
    if-lez v1, :cond_7

    .line 193
    .line 194
    new-instance v1, Lp/p;

    .line 195
    .line 196
    iget-object v3, v11, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->e:Lcoil3/network/NetworkFetcher;

    .line 197
    .line 198
    invoke-static {v3, p1}, Lcoil3/network/NetworkFetcher;->e(Lcoil3/network/NetworkFetcher;Lokio/Buffer;)Ln/r;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    iget-object v3, v11, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->e:Lcoil3/network/NetworkFetcher;

    .line 203
    .line 204
    invoke-static {v3}, Lcoil3/network/NetworkFetcher;->b(Lcoil3/network/NetworkFetcher;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    invoke-virtual {v0}, Lu/l;->e()Lcoil3/network/c;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-virtual {v0, v2}, Lcoil3/network/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-virtual {v3, v4, v0}, Lcoil3/network/NetworkFetcher;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    sget-object v2, Lcoil3/decode/DataSource;->d:Lcoil3/decode/DataSource;

    .line 221
    .line 222
    invoke-direct {v1, p1, v0, v2}, Lp/p;-><init>(Ln/r;Ljava/lang/String;Lcoil3/decode/DataSource;)V

    .line 223
    .line 224
    .line 225
    return-object v1

    .line 226
    :cond_7
    return-object v5
.end method
