.class public final Lcoil3/intercept/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcoil3/intercept/d;


# instance fields
.field public final a:Ls/f;

.field public final b:Ljava/util/List;

.field public final c:I

.field public final d:Ls/f;

.field public final e:Lt/f;

.field public final f:Lcoil3/h;

.field public final g:Z


# direct methods
.method public constructor <init>(Ls/f;Ljava/util/List;ILs/f;Lt/f;Lcoil3/h;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcoil3/intercept/e;->a:Ls/f;

    .line 5
    .line 6
    iput-object p2, p0, Lcoil3/intercept/e;->b:Ljava/util/List;

    .line 7
    .line 8
    iput p3, p0, Lcoil3/intercept/e;->c:I

    .line 9
    .line 10
    iput-object p4, p0, Lcoil3/intercept/e;->d:Ls/f;

    .line 11
    .line 12
    iput-object p5, p0, Lcoil3/intercept/e;->e:Lt/f;

    .line 13
    .line 14
    iput-object p6, p0, Lcoil3/intercept/e;->f:Lcoil3/h;

    .line 15
    .line 16
    iput-boolean p7, p0, Lcoil3/intercept/e;->g:Z

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p1, Lcoil3/intercept/RealInterceptorChain$proceed$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcoil3/intercept/RealInterceptorChain$proceed$1;

    .line 7
    .line 8
    iget v1, v0, Lcoil3/intercept/RealInterceptorChain$proceed$1;->label:I

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
    iput v1, v0, Lcoil3/intercept/RealInterceptorChain$proceed$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcoil3/intercept/RealInterceptorChain$proceed$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcoil3/intercept/RealInterceptorChain$proceed$1;-><init>(Lcoil3/intercept/e;Lh6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcoil3/intercept/RealInterceptorChain$proceed$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lcoil3/intercept/RealInterceptorChain$proceed$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object v0, v0, Lcoil3/intercept/RealInterceptorChain$proceed$1;->L$0:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lcoil3/intercept/b;

    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lcoil3/intercept/e;->b:Ljava/util/List;

    .line 56
    .line 57
    iget v2, p0, Lcoil3/intercept/e;->c:I

    .line 58
    .line 59
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Lcoil3/intercept/b;

    .line 64
    .line 65
    add-int/lit8 v7, v2, 0x1

    .line 66
    .line 67
    new-instance v4, Lcoil3/intercept/e;

    .line 68
    .line 69
    iget-object v10, p0, Lcoil3/intercept/e;->f:Lcoil3/h;

    .line 70
    .line 71
    iget-boolean v11, p0, Lcoil3/intercept/e;->g:Z

    .line 72
    .line 73
    iget-object v5, p0, Lcoil3/intercept/e;->a:Ls/f;

    .line 74
    .line 75
    iget-object v6, p0, Lcoil3/intercept/e;->b:Ljava/util/List;

    .line 76
    .line 77
    iget-object v8, p0, Lcoil3/intercept/e;->d:Ls/f;

    .line 78
    .line 79
    iget-object v9, p0, Lcoil3/intercept/e;->e:Lt/f;

    .line 80
    .line 81
    invoke-direct/range {v4 .. v11}, Lcoil3/intercept/e;-><init>(Ls/f;Ljava/util/List;ILs/f;Lt/f;Lcoil3/h;Z)V

    .line 82
    .line 83
    .line 84
    iput-object p1, v0, Lcoil3/intercept/RealInterceptorChain$proceed$1;->L$0:Ljava/lang/Object;

    .line 85
    .line 86
    iput v3, v0, Lcoil3/intercept/RealInterceptorChain$proceed$1;->label:I

    .line 87
    .line 88
    invoke-virtual {p1, v4, v0}, Lcoil3/intercept/b;->d(Lcoil3/intercept/e;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-ne v0, v1, :cond_3

    .line 93
    .line 94
    return-object v1

    .line 95
    :cond_3
    move-object v12, v0

    .line 96
    move-object v0, p1

    .line 97
    move-object p1, v12

    .line 98
    :goto_1
    check-cast p1, Ls/i;

    .line 99
    .line 100
    invoke-interface {p1}, Ls/i;->a()Ls/f;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iget-object v2, v1, Ls/f;->a:Landroid/content/Context;

    .line 105
    .line 106
    iget-object v3, p0, Lcoil3/intercept/e;->a:Ls/f;

    .line 107
    .line 108
    iget-object v4, v3, Ls/f;->a:Landroid/content/Context;

    .line 109
    .line 110
    const-string v5, "Interceptor \'"

    .line 111
    .line 112
    if-ne v2, v4, :cond_7

    .line 113
    .line 114
    iget-object v2, v1, Ls/f;->b:Ljava/lang/Object;

    .line 115
    .line 116
    sget-object v4, Ls/j;->a:Ls/j;

    .line 117
    .line 118
    if-eq v2, v4, :cond_6

    .line 119
    .line 120
    iget-object v2, v1, Ls/f;->c:Lu/a;

    .line 121
    .line 122
    iget-object v4, v3, Ls/f;->c:Lu/a;

    .line 123
    .line 124
    if-ne v2, v4, :cond_5

    .line 125
    .line 126
    iget-object v1, v1, Ls/f;->o:Lt/g;

    .line 127
    .line 128
    iget-object v2, v3, Ls/f;->o:Lt/g;

    .line 129
    .line 130
    if-ne v1, v2, :cond_4

    .line 131
    .line 132
    return-object p1

    .line 133
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v0, "\' cannot modify the request\'s size resolver. Use `Interceptor.Chain.withSize` instead."

    .line 142
    .line 143
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw v0

    .line 160
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string v0, "\' cannot modify the request\'s target."

    .line 169
    .line 170
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 178
    .line 179
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw v0

    .line 187
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    const-string v0, "\' cannot set the request\'s data to null."

    .line 196
    .line 197
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw v0

    .line 214
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    const-string v0, "\' cannot modify the request\'s context."

    .line 223
    .line 224
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 232
    .line 233
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw v0
.end method
