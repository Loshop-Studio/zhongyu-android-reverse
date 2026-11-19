.class final Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcoil3/network/m;",
        "response",
        "Ln/k;",
        "<anonymous>",
        "(Lcoil3/network/m;)Ln/k;"
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
.field final synthetic $cacheResponse:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcoil3/network/m;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $networkRequest:Lcoil3/network/l;

.field final synthetic $snapshot:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcoil3/disk/i;",
            ">;"
        }
    .end annotation
.end field

.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcoil3/network/j;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcoil3/network/j;Lkotlin/jvm/internal/Ref$ObjectRef;Lcoil3/network/l;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcoil3/disk/i;",
            ">;",
            "Lcoil3/network/j;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcoil3/network/m;",
            ">;",
            "Lcoil3/network/l;",
            "Lh6/c<",
            "-",
            "Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->$snapshot:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 2
    .line 3
    iput-object p2, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->this$0:Lcoil3/network/j;

    .line 4
    .line 5
    iput-object p3, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->$cacheResponse:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 6
    .line 7
    iput-object p4, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->$networkRequest:Lcoil3/network/l;

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
    new-instance v0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->$snapshot:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 4
    .line 5
    iget-object v2, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->this$0:Lcoil3/network/j;

    .line 6
    .line 7
    iget-object v3, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->$cacheResponse:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 8
    .line 9
    iget-object v4, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->$networkRequest:Lcoil3/network/l;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcoil3/network/j;Lkotlin/jvm/internal/Ref$ObjectRef;Lcoil3/network/l;Lh6/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Lcoil3/network/m;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcoil3/network/m;",
            "Lh6/c<",
            "-",
            "Ln/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcoil3/network/m;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->invoke(Lcoil3/network/m;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    if-eq v1, v3, :cond_1

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->L$0:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lcoil3/network/m;

    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto/16 :goto_2

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
    iget-object v1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->L$1:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 34
    .line 35
    iget-object v3, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->L$0:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, Lcoil3/network/m;

    .line 38
    .line 39
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Lcoil3/network/m;

    .line 49
    .line 50
    iget-object v1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->$snapshot:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 51
    .line 52
    iget-object v5, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->this$0:Lcoil3/network/j;

    .line 53
    .line 54
    iget-object v6, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v6, Lcoil3/disk/i;

    .line 57
    .line 58
    iget-object v7, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->$cacheResponse:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 59
    .line 60
    iget-object v7, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v7, Lcoil3/network/m;

    .line 63
    .line 64
    iput-object p1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    iput-object v1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->L$1:Ljava/lang/Object;

    .line 67
    .line 68
    iput v3, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->label:I

    .line 69
    .line 70
    invoke-static {v5, v6, v7, p1, p0}, Lcoil3/network/j;->c(Lcoil3/network/j;Lcoil3/disk/i;Lcoil3/network/m;Lcoil3/network/m;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    if-ne v3, v0, :cond_3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    move-object v8, v3

    .line 78
    move-object v3, p1

    .line 79
    move-object p1, v8

    .line 80
    :goto_0
    iput-object p1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 81
    .line 82
    iget-object p1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->$snapshot:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 83
    .line 84
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 85
    .line 86
    if-eqz p1, :cond_5

    .line 87
    .line 88
    iget-object v0, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->$cacheResponse:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 89
    .line 90
    iget-object v1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->this$0:Lcoil3/network/j;

    .line 91
    .line 92
    check-cast p1, Lcoil3/disk/i;

    .line 93
    .line 94
    invoke-virtual {v1, p1}, Lcoil3/network/j;->i(Lcoil3/disk/i;)Lcoil3/network/m;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 99
    .line 100
    new-instance p1, Ln/k;

    .line 101
    .line 102
    iget-object v0, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->this$0:Lcoil3/network/j;

    .line 103
    .line 104
    iget-object v1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->$snapshot:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 105
    .line 106
    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 107
    .line 108
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    check-cast v1, Lcoil3/disk/i;

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Lcoil3/network/j;->h(Lcoil3/disk/i;)Lcoil3/decode/o;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iget-object v1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->this$0:Lcoil3/network/j;

    .line 118
    .line 119
    iget-object v1, v1, Lcoil3/network/j;->a:Ljava/lang/String;

    .line 120
    .line 121
    iget-object v2, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->$cacheResponse:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 122
    .line 123
    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v2, Lcoil3/network/m;

    .line 126
    .line 127
    if-eqz v2, :cond_4

    .line 128
    .line 129
    iget-object v2, v2, Lcoil3/network/m;->d:Lcoil3/network/k;

    .line 130
    .line 131
    if-eqz v2, :cond_4

    .line 132
    .line 133
    invoke-virtual {v2}, Lcoil3/network/k;->a()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    :cond_4
    invoke-static {v1, v4}, Lcoil3/network/j;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    sget-object v2, Lcoil3/decode/DataSource;->NETWORK:Lcoil3/decode/DataSource;

    .line 142
    .line 143
    invoke-direct {p1, v0, v1, v2}, Ln/k;-><init>(Lcoil3/decode/p;Ljava/lang/String;Lcoil3/decode/DataSource;)V

    .line 144
    .line 145
    .line 146
    return-object p1

    .line 147
    :cond_5
    iget-object p1, v3, Lcoil3/network/m;->e:Lcoil3/network/n;

    .line 148
    .line 149
    if-eqz p1, :cond_8

    .line 150
    .line 151
    iput-object v3, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->L$0:Ljava/lang/Object;

    .line 152
    .line 153
    iput-object v4, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->L$1:Ljava/lang/Object;

    .line 154
    .line 155
    iput v2, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->label:I

    .line 156
    .line 157
    invoke-static {p1, p0}, Lcoil3/network/internal/c;->a(Lcoil3/network/n;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    if-ne p1, v0, :cond_6

    .line 162
    .line 163
    :goto_1
    return-object v0

    .line 164
    :cond_6
    move-object v0, v3

    .line 165
    :goto_2
    check-cast p1, Lokio/Buffer;

    .line 166
    .line 167
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 168
    .line 169
    .line 170
    move-result-wide v1

    .line 171
    const-wide/16 v5, 0x0

    .line 172
    .line 173
    cmp-long v1, v1, v5

    .line 174
    .line 175
    if-lez v1, :cond_7

    .line 176
    .line 177
    new-instance v1, Ln/k;

    .line 178
    .line 179
    iget-object v2, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->this$0:Lcoil3/network/j;

    .line 180
    .line 181
    invoke-virtual {v2}, Lcoil3/network/j;->e()Lokio/FileSystem;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    new-instance v3, Lcoil3/decode/r;

    .line 186
    .line 187
    invoke-direct {v3, p1, v2, v4}, Lcoil3/decode/r;-><init>(Lokio/BufferedSource;Lokio/FileSystem;La/a;)V

    .line 188
    .line 189
    .line 190
    iget-object p1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->this$0:Lcoil3/network/j;

    .line 191
    .line 192
    iget-object p1, p1, Lcoil3/network/j;->a:Ljava/lang/String;

    .line 193
    .line 194
    iget-object v0, v0, Lcoil3/network/m;->d:Lcoil3/network/k;

    .line 195
    .line 196
    invoke-virtual {v0}, Lcoil3/network/k;->a()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-static {p1, v0}, Lcoil3/network/j;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    sget-object v0, Lcoil3/decode/DataSource;->NETWORK:Lcoil3/decode/DataSource;

    .line 205
    .line 206
    invoke-direct {v1, v3, p1, v0}, Ln/k;-><init>(Lcoil3/decode/p;Ljava/lang/String;Lcoil3/decode/DataSource;)V

    .line 207
    .line 208
    .line 209
    return-object v1

    .line 210
    :cond_7
    return-object v4

    .line 211
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 212
    .line 213
    const-string v0, "body == null"

    .line 214
    .line 215
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    throw p1
.end method
