.class public final Lcom/zykj/blackboard/core/play/PlayPageControl;
.super Lm5/f;
.source "SourceFile"


# instance fields
.field public final s:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Lm5/l;Lb5/j;)V
    .locals 1

    .line 1
    const-string v0, "playControl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "renderLayer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Lm5/f;-><init>(Lm5/l;Lb5/j;)V

    .line 12
    .line 13
    .line 14
    sget-object p1, Lcom/zykj/blackboard/core/play/PlayPageControl$singleExecutor$2;->a:Lcom/zykj/blackboard/core/play/PlayPageControl$singleExecutor$2;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/PlayPageControl;->s:Lkotlin/Lazy;

    .line 21
    .line 22
    return-void
.end method

.method public static final A(Lcom/zykj/blackboard/core/play/PlayPageControl;Lkotlin/jvm/functions/Function0;)V
    .locals 5

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$callBack"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lm5/f;->status()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->f:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v1, "playThread = "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, " initCommandThread"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lm5/f;->o()Lm5/h;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Lm5/h;->l()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lm5/f;->m()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->l()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lm5/f;->r()Lz4/a;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Lz4/a;->i()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lm5/f;->p()La5/b;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, La5/b;->P()V

    .line 80
    .line 81
    .line 82
    const-wide/16 v0, 0x32

    .line 83
    .line 84
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lm5/f;->o()Lm5/h;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {p0}, Lm5/f;->p()La5/b;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v2, v3}, Le5/e;->n(La5/c;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Lm5/f;->o()Lm5/h;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {p0}, Lm5/f;->n()Ll5/a;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v2, v3}, Le5/e;->r(Ll5/e;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Lm5/f;->o()Lm5/h;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {p0}, Lm5/f;->r()Lz4/a;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v2, v3}, Le5/e;->o(Lz4/a;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Lm5/f;->o()Lm5/h;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {p0}, Lm5/f;->q()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {v2, v3}, Lm5/h;->E(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Lm5/f;->o()Lm5/h;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {p0}, Lm5/f;->t()J

    .line 136
    .line 137
    .line 138
    move-result-wide v3

    .line 139
    invoke-virtual {v2, v3, v4}, Lm5/h;->D(J)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Lm5/f;->m()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {p0}, Lm5/f;->p()La5/b;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v2, v3}, Le5/e;->n(La5/c;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Lm5/f;->m()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {p0}, Lm5/f;->n()Ll5/a;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {v2, v3}, Le5/e;->r(Ll5/e;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, Lm5/f;->m()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {p0}, Lm5/f;->q()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-virtual {v2, v3}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->H(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0}, Lm5/f;->m()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-virtual {p0}, Lm5/f;->t()J

    .line 180
    .line 181
    .line 182
    move-result-wide v3

    .line 183
    invoke-virtual {v2, v3, v4}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->G(J)V

    .line 184
    .line 185
    .line 186
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0}, Lm5/f;->u()V

    .line 190
    .line 191
    .line 192
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_0
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    return-void
.end method

.method public static synthetic x(Lcom/zykj/blackboard/core/play/PlayPageControl;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/play/PlayPageControl;->A(Lcom/zykj/blackboard/core/play/PlayPageControl;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    const-string v0, "motionEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lm5/f;->l()Lw4/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lw4/a;->w(Landroid/view/MotionEvent;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lm5/f;->l()Lw4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lw4/a;->s()Lw4/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lw4/d;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lw4/d;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Lw4/d;->n(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public areaMoveStart()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lm5/f;->l()Lw4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lw4/a;->s()Lw4/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lw4/d;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lw4/d;

    .line 14
    .line 15
    invoke-virtual {v0}, Lw4/d;->o()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lm5/f;->l()Lw4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lw4/a;->s()Lw4/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lw4/d;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lw4/d;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Lw4/d;->p(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public c()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm5/f;->p()La5/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La5/b;->R()Landroid/graphics/Bitmap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public d(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 7

    .line 1
    const-string v0, "onSuccess"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onError"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;

    .line 12
    .line 13
    move-object v2, p0

    .line 14
    move-wide v3, p1

    .line 15
    move-object v5, p3

    .line 16
    move-object v6, p4

    .line 17
    invoke-direct/range {v1 .. v6}, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;-><init>(Lcom/zykj/blackboard/core/play/PlayPageControl;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lcom/zykj/blackboard/core/play/PlayPageControl;->z(Lkotlin/jvm/functions/Function0;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm5/f;->q()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public g(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lm5/f;->s()Lv4/e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lv4/e;->b(F)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lm5/f;->m()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->I(F)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public getDuration()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lm5/f;->t()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public getMoveHorizontalProgress()F
    .locals 2

    .line 1
    invoke-virtual {p0}, Lm5/f;->l()Lw4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lw4/a;->s()Lw4/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lw4/d;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lw4/d;

    .line 14
    .line 15
    invoke-virtual {v0}, Lw4/d;->u()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method public getMoveMaxHeightTimes()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm5/f;->l()Lw4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lw4/a;->k()Lv4/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lv4/b;->z()Lv4/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lv4/d;->b()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
.end method

.method public getMoveMaxWidthTimes()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm5/f;->l()Lw4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lw4/a;->k()Lv4/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lv4/b;->z()Lv4/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lv4/d;->c()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
.end method

.method public getMoveVerticalProgress()F
    .locals 3

    .line 1
    invoke-virtual {p0}, Lm5/f;->l()Lw4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lw4/a;->s()Lw4/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "MoveProgress"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    instance-of v1, v0, Lw4/d;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    check-cast v0, Lw4/d;

    .line 23
    .line 24
    invoke-virtual {v0}, Lw4/d;->w()F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    return v0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    return v0
.end method

.method public pause()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lm5/f;->status()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->c:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 6
    .line 7
    if-eq v0, v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Lm5/f;->status()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->e:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void

    .line 19
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lm5/f;->o()Lm5/h;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lm5/h;->k()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lm5/f;->m()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->k()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public resume()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lm5/f;->status()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->d:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lm5/f;->o()Lm5/h;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lm5/h;->m()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lm5/f;->m()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->m()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lm5/f;->u()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public setAreaMoveListener(Ls5/d;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm5/f;->l()Lw4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lw4/a;->x(Ls5/d;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setScaleEnable(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lm5/f;->l()Lw4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lw4/a;->k()Lv4/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lv4/b;->z()Lv4/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-virtual {v0, v1}, Lv4/d;->l(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lv4/d;->i(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lv4/d;->o(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lv4/d;->n(Z)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public setTranslateEnable(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lm5/f;->l()Lw4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lw4/a;->k()Lv4/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lv4/b;->z()Lv4/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-virtual {v0, v1}, Lv4/d;->l(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lv4/d;->i(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lv4/d;->o(Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public start()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/play/PlayPageControl$start$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/blackboard/core/play/PlayPageControl$start$1;-><init>(Lcom/zykj/blackboard/core/play/PlayPageControl;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/play/PlayPageControl;->z(Lkotlin/jvm/functions/Function0;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final y()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayPageControl;->s:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    return-object v0
.end method

.method public final z(Lkotlin/jvm/functions/Function0;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/PlayPageControl;->y()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lm5/r;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lm5/r;-><init>(Lcom/zykj/blackboard/core/play/PlayPageControl;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 11
    .line 12
    .line 13
    return-void
.end method
