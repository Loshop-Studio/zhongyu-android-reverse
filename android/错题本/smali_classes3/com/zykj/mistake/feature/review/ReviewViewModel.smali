.class public final Lcom/zykj/mistake/feature/review/ReviewViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/zykj/mistake/feature/review/ReviewViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "<init>",
        "()V",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nReviewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReviewViewModel.kt\ncom/zykj/mistake/feature/review/ReviewViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,134:1\n230#2,5:135\n*S KotlinDebug\n*F\n+ 1 ReviewViewModel.kt\ncom/zykj/mistake/feature/review/ReviewViewModel\n*L\n39#1:135,5\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/mistake/feature/review/r;

.field public final b:Lkotlinx/coroutines/flow/n0;

.field public final c:Lkotlinx/coroutines/flow/a0;

.field public final d:Lkotlinx/coroutines/channels/b;

.field public final e:Lkotlinx/coroutines/flow/c;

.field public f:Lkotlinx/coroutines/k1;

.field public g:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/mistake/feature/review/r;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/mistake/feature/review/ReviewViewModel;->a:Lcom/zykj/mistake/feature/review/r;

    .line 10
    .line 11
    new-instance v0, Lcom/zykj/mistake/feature/review/i;

    .line 12
    .line 13
    const v1, 0x7fffff

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v0, v2, v1}, Lcom/zykj/mistake/feature/review/i;-><init>(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lkotlinx/coroutines/flow/h;->b(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lcom/zykj/mistake/feature/review/ReviewViewModel;->b:Lkotlinx/coroutines/flow/n0;

    .line 25
    .line 26
    new-instance v1, Lkotlinx/coroutines/flow/a0;

    .line 27
    .line 28
    invoke-direct {v1, v0}, Lkotlinx/coroutines/flow/a0;-><init>(Lkotlinx/coroutines/flow/y;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/zykj/mistake/feature/review/ReviewViewModel;->c:Lkotlinx/coroutines/flow/a0;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    const/4 v1, 0x7

    .line 35
    invoke-static {v0, v1, v2}, Lkotlinx/coroutines/channels/k;->a(IILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/channels/b;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lcom/zykj/mistake/feature/review/ReviewViewModel;->d:Lkotlinx/coroutines/channels/b;

    .line 40
    .line 41
    invoke-static {v0}, Lkotlinx/coroutines/flow/h;->l(Lkotlinx/coroutines/channels/b;)Lkotlinx/coroutines/flow/c;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Lcom/zykj/mistake/feature/review/ReviewViewModel;->e:Lkotlinx/coroutines/flow/c;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/mistake/feature/review/h;)V
    .locals 8

    .line 1
    instance-of v0, p1, Lcom/zykj/mistake/feature/review/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lcom/zykj/mistake/feature/review/ReviewViewModel;->b:Lkotlinx/coroutines/flow/n0;

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    check-cast p1, Lcom/zykj/mistake/feature/review/d;

    .line 9
    .line 10
    iget v0, p1, Lcom/zykj/mistake/feature/review/d;->a:I

    .line 11
    .line 12
    iget-object v3, p1, Lcom/zykj/mistake/feature/review/d;->b:Ljava/lang/String;

    .line 13
    .line 14
    iget p1, p0, Lcom/zykj/mistake/feature/review/ReviewViewModel;->g:I

    .line 15
    .line 16
    if-ne p1, v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iput v0, p0, Lcom/zykj/mistake/feature/review/ReviewViewModel;->g:I

    .line 20
    .line 21
    iget-object p1, p0, Lcom/zykj/mistake/feature/review/ReviewViewModel;->f:Lkotlinx/coroutines/k1;

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Lkotlinx/coroutines/c1;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    move-object v0, p1

    .line 33
    check-cast v0, Lcom/zykj/mistake/feature/review/i;

    .line 34
    .line 35
    new-instance v0, Lcom/zykj/mistake/feature/review/i;

    .line 36
    .line 37
    const v1, 0x5ffffe

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v3, v1}, Lcom/zykj/mistake/feature/review/i;-><init>(Ljava/lang/String;I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, p1, v0}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0, v3}, Lcom/zykj/mistake/feature/review/ReviewViewModel;->b(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    sget-object v0, Lcom/zykj/mistake/feature/review/e;->a:Lcom/zykj/mistake/feature/review/e;

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Lcom/zykj/mistake/feature/review/i;

    .line 66
    .line 67
    iget-object p1, p1, Lcom/zykj/mistake/feature/review/i;->a:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Lcom/zykj/mistake/feature/review/ReviewViewModel;->b(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_3
    sget-object v0, Lcom/zykj/mistake/feature/review/g;->a:Lcom/zykj/mistake/feature/review/g;

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    const/4 v3, 0x3

    .line 80
    if-eqz v0, :cond_6

    .line 81
    .line 82
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, Lcom/zykj/mistake/feature/review/i;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    check-cast p1, Lcom/zykj/mistake/feature/review/i;

    .line 96
    .line 97
    iget-boolean p1, p1, Lcom/zykj/mistake/feature/review/i;->e:Z

    .line 98
    .line 99
    if-eqz p1, :cond_5

    .line 100
    .line 101
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    check-cast p1, Lcom/zykj/mistake/feature/review/i;

    .line 106
    .line 107
    iget p1, p1, Lcom/zykj/mistake/feature/review/i;->d:I

    .line 108
    .line 109
    if-gtz p1, :cond_4

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_4
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    new-instance v0, Lcom/zykj/mistake/feature/review/ReviewViewModel$startRecommendPractice$2;

    .line 117
    .line 118
    invoke-direct {v0, p0, v1}, Lcom/zykj/mistake/feature/review/ReviewViewModel$startRecommendPractice$2;-><init>(Lcom/zykj/mistake/feature/review/ReviewViewModel;Lh6/c;)V

    .line 119
    .line 120
    .line 121
    invoke-static {p1, v1, v1, v0, v3}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_5
    :goto_0
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    new-instance v0, Lcom/zykj/mistake/feature/review/ReviewViewModel$startRecommendPractice$1;

    .line 130
    .line 131
    invoke-direct {v0, p0, v1}, Lcom/zykj/mistake/feature/review/ReviewViewModel$startRecommendPractice$1;-><init>(Lcom/zykj/mistake/feature/review/ReviewViewModel;Lh6/c;)V

    .line 132
    .line 133
    .line 134
    invoke-static {p1, v1, v1, v0, v3}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_6
    instance-of v0, p1, Lcom/zykj/mistake/feature/review/f;

    .line 139
    .line 140
    if-eqz v0, :cond_f

    .line 141
    .line 142
    check-cast p1, Lcom/zykj/mistake/feature/review/f;

    .line 143
    .line 144
    iget-object p1, p1, Lcom/zykj/mistake/feature/review/f;->a:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    .line 145
    .line 146
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, Lcom/zykj/mistake/feature/review/i;

    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    check-cast v0, Lcom/zykj/mistake/feature/review/i;

    .line 160
    .line 161
    sget-object v2, Lcom/zykj/mistake/feature/review/z;->a:[I

    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    aget v4, v2, v4

    .line 168
    .line 169
    const/4 v5, 0x1

    .line 170
    const/4 v6, 0x2

    .line 171
    if-eq v4, v5, :cond_9

    .line 172
    .line 173
    if-eq v4, v6, :cond_8

    .line 174
    .line 175
    if-ne v4, v3, :cond_7

    .line 176
    .line 177
    iget-boolean v4, v0, Lcom/zykj/mistake/feature/review/i;->n:Z

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 181
    .line 182
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 183
    .line 184
    .line 185
    throw p1

    .line 186
    :cond_8
    iget-boolean v4, v0, Lcom/zykj/mistake/feature/review/i;->k:Z

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_9
    iget-boolean v4, v0, Lcom/zykj/mistake/feature/review/i;->h:Z

    .line 190
    .line 191
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    aget v2, v2, v7

    .line 196
    .line 197
    if-eq v2, v5, :cond_c

    .line 198
    .line 199
    if-eq v2, v6, :cond_b

    .line 200
    .line 201
    if-ne v2, v3, :cond_a

    .line 202
    .line 203
    iget v0, v0, Lcom/zykj/mistake/feature/review/i;->m:I

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 207
    .line 208
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 209
    .line 210
    .line 211
    throw p1

    .line 212
    :cond_b
    iget v0, v0, Lcom/zykj/mistake/feature/review/i;->j:I

    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_c
    iget v0, v0, Lcom/zykj/mistake/feature/review/i;->g:I

    .line 216
    .line 217
    :goto_2
    if-eqz v4, :cond_e

    .line 218
    .line 219
    if-gtz v0, :cond_d

    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_d
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    new-instance v2, Lcom/zykj/mistake/feature/review/ReviewViewModel$startPoolPractice$2;

    .line 227
    .line 228
    invoke-direct {v2, p0, p1, v1}, Lcom/zykj/mistake/feature/review/ReviewViewModel$startPoolPractice$2;-><init>(Lcom/zykj/mistake/feature/review/ReviewViewModel;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;Lh6/c;)V

    .line 229
    .line 230
    .line 231
    invoke-static {v0, v1, v1, v2, v3}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :cond_e
    :goto_3
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    new-instance v0, Lcom/zykj/mistake/feature/review/ReviewViewModel$startPoolPractice$1;

    .line 240
    .line 241
    invoke-direct {v0, p0, v1}, Lcom/zykj/mistake/feature/review/ReviewViewModel$startPoolPractice$1;-><init>(Lcom/zykj/mistake/feature/review/ReviewViewModel;Lh6/c;)V

    .line 242
    .line 243
    .line 244
    invoke-static {p1, v1, v1, v0, v3}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 245
    .line 246
    .line 247
    return-void

    .line 248
    :cond_f
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 249
    .line 250
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 251
    .line 252
    .line 253
    throw p1
.end method

.method public final b(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/review/ReviewViewModel;->f:Lkotlinx/coroutines/k1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Lkotlinx/coroutines/c1;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget v0, p0, Lcom/zykj/mistake/feature/review/ReviewViewModel;->g:I

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v2, Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;

    .line 19
    .line 20
    invoke-direct {v2, p0, p1, v1}, Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;-><init>(Lcom/zykj/mistake/feature/review/ReviewViewModel;Ljava/lang/String;Lh6/c;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x3

    .line 24
    invoke-static {v0, v1, v1, v2, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lcom/zykj/mistake/feature/review/ReviewViewModel;->f:Lkotlinx/coroutines/k1;

    .line 29
    .line 30
    return-void
.end method
