.class final Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil3/network/NetworkFetcher;->a(Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "coil3.network.NetworkFetcher$fetch$fetchResult$1"
    f = "NetworkFetcher.kt"
    l = {
        0x4c,
        0x57
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic g:Lcoil3/network/NetworkFetcher;

.field public final synthetic h:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic i:Ls/j;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcoil3/network/NetworkFetcher;Lkotlin/jvm/internal/Ref$ObjectRef;Ls/j;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->f:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 2
    .line 3
    iput-object p2, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->g:Lcoil3/network/NetworkFetcher;

    .line 4
    .line 5
    iput-object p3, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->h:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 6
    .line 7
    iput-object p4, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->i:Ls/j;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 6

    .line 1
    new-instance v0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->f:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 4
    .line 5
    iget-object v2, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->g:Lcoil3/network/NetworkFetcher;

    .line 6
    .line 7
    iget-object v3, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->h:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 8
    .line 9
    iget-object v4, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->i:Ls/j;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcoil3/network/NetworkFetcher;Lkotlin/jvm/internal/Ref$ObjectRef;Ls/j;Lvc/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->e:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final g(Ls/l;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

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

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ls/l;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->g(Ls/l;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->e:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v5, v0

    .line 4
    check-cast v5, Ls/l;

    .line 5
    .line 6
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget v1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->d:I

    .line 11
    .line 12
    const-string v7, "Content-Type"

    .line 13
    .line 14
    const/4 v8, 0x2

    .line 15
    const/4 v2, 0x1

    .line 16
    const/4 v9, 0x0

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    if-eq v1, v2, :cond_1

    .line 20
    .line 21
    if-ne v1, v8, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    move-object v6, p0

    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    iget-object v1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 40
    .line 41
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object v6, p0

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->f:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 50
    .line 51
    iget-object v1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->g:Lcoil3/network/NetworkFetcher;

    .line 52
    .line 53
    iget-object v3, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v3, Lcoil3/disk/a$c;

    .line 56
    .line 57
    iget-object v4, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->h:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 58
    .line 59
    iget-object v4, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v4, Ls/l;

    .line 62
    .line 63
    move v6, v2

    .line 64
    move-object v2, v3

    .line 65
    move-object v3, v4

    .line 66
    iget-object v4, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->i:Ls/j;

    .line 67
    .line 68
    iput-object v5, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->e:Ljava/lang/Object;

    .line 69
    .line 70
    iput-object p1, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->c:Ljava/lang/Object;

    .line 71
    .line 72
    iput v6, p0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->d:I

    .line 73
    .line 74
    move-object v6, p0

    .line 75
    invoke-static/range {v1 .. v6}, Lcoil3/network/NetworkFetcher;->g(Lcoil3/network/NetworkFetcher;Lcoil3/disk/a$c;Ls/l;Ls/j;Ls/l;Lvc/c;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-ne v1, v0, :cond_3

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    move-object v10, v1

    .line 83
    move-object v1, p1

    .line 84
    move-object p1, v10

    .line 85
    :goto_0
    iput-object p1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 86
    .line 87
    iget-object p1, v6, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->f:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 88
    .line 89
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 90
    .line 91
    if-eqz p1, :cond_5

    .line 92
    .line 93
    iget-object v0, v6, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->h:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 94
    .line 95
    iget-object v1, v6, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->g:Lcoil3/network/NetworkFetcher;

    .line 96
    .line 97
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    check-cast p1, Lcoil3/disk/a$c;

    .line 101
    .line 102
    invoke-static {v1, p1}, Lcoil3/network/NetworkFetcher;->f(Lcoil3/network/NetworkFetcher;Lcoil3/disk/a$c;)Ls/l;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iput-object p1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 107
    .line 108
    new-instance p1, Ln/p;

    .line 109
    .line 110
    iget-object v0, v6, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->g:Lcoil3/network/NetworkFetcher;

    .line 111
    .line 112
    iget-object v1, v6, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->f:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 113
    .line 114
    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 115
    .line 116
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    check-cast v1, Lcoil3/disk/a$c;

    .line 120
    .line 121
    invoke-static {v0, v1}, Lcoil3/network/NetworkFetcher;->d(Lcoil3/network/NetworkFetcher;Lcoil3/disk/a$c;)Ll/r;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iget-object v1, v6, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->g:Lcoil3/network/NetworkFetcher;

    .line 126
    .line 127
    invoke-static {v1}, Lcoil3/network/NetworkFetcher;->b(Lcoil3/network/NetworkFetcher;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    iget-object v3, v6, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->h:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 132
    .line 133
    iget-object v3, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v3, Ls/l;

    .line 136
    .line 137
    if-eqz v3, :cond_4

    .line 138
    .line 139
    invoke-virtual {v3}, Ls/l;->e()Lcoil3/network/c;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    if-eqz v3, :cond_4

    .line 144
    .line 145
    invoke-virtual {v3, v7}, Lcoil3/network/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    :cond_4
    invoke-virtual {v1, v2, v9}, Lcoil3/network/NetworkFetcher;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    sget-object v2, Lcoil3/decode/DataSource;->f:Lcoil3/decode/DataSource;

    .line 154
    .line 155
    invoke-direct {p1, v0, v1, v2}, Ln/p;-><init>(Ll/r;Ljava/lang/String;Lcoil3/decode/DataSource;)V

    .line 156
    .line 157
    .line 158
    return-object p1

    .line 159
    :cond_5
    invoke-static {v5}, Lcoil3/network/internal/UtilsKt;->f(Ls/l;)Ls/m;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    iput-object v5, v6, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->e:Ljava/lang/Object;

    .line 164
    .line 165
    iput-object v9, v6, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->c:Ljava/lang/Object;

    .line 166
    .line 167
    iput v8, v6, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->d:I

    .line 168
    .line 169
    invoke-static {p1, p0}, Lcoil3/network/internal/UtilsKt;->e(Ls/m;Lvc/c;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    if-ne p1, v0, :cond_6

    .line 174
    .line 175
    :goto_1
    return-object v0

    .line 176
    :cond_6
    :goto_2
    check-cast p1, Lokio/Buffer;

    .line 177
    .line 178
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 179
    .line 180
    .line 181
    move-result-wide v0

    .line 182
    const-wide/16 v2, 0x0

    .line 183
    .line 184
    cmp-long v0, v0, v2

    .line 185
    .line 186
    if-lez v0, :cond_7

    .line 187
    .line 188
    new-instance v0, Ln/p;

    .line 189
    .line 190
    iget-object v1, v6, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->g:Lcoil3/network/NetworkFetcher;

    .line 191
    .line 192
    invoke-static {v1, p1}, Lcoil3/network/NetworkFetcher;->e(Lcoil3/network/NetworkFetcher;Lokio/Buffer;)Ll/r;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    iget-object v1, v6, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;->g:Lcoil3/network/NetworkFetcher;

    .line 197
    .line 198
    invoke-static {v1}, Lcoil3/network/NetworkFetcher;->b(Lcoil3/network/NetworkFetcher;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-virtual {v5}, Ls/l;->e()Lcoil3/network/c;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    invoke-virtual {v3, v7}, Lcoil3/network/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-virtual {v1, v2, v3}, Lcoil3/network/NetworkFetcher;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    sget-object v2, Lcoil3/decode/DataSource;->f:Lcoil3/decode/DataSource;

    .line 215
    .line 216
    invoke-direct {v0, p1, v1, v2}, Ln/p;-><init>(Ll/r;Ljava/lang/String;Lcoil3/decode/DataSource;)V

    .line 217
    .line 218
    .line 219
    return-object v0

    .line 220
    :cond_7
    return-object v9
.end method
