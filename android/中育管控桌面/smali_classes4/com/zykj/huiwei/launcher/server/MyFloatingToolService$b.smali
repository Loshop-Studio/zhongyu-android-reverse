.class public final Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final a:J

.field public final b:Landroid/os/Handler;

.field public final c:I

.field public d:Z

.field public e:F

.field public f:F

.field public g:I

.field public h:I

.field public i:Z

.field public final j:Ljava/lang/Runnable;

.field public final synthetic k:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->k:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-wide p2, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->a:J

    .line 7
    .line 8
    new-instance p2, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    invoke-direct {p2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->b:Landroid/os/Handler;

    .line 18
    .line 19
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    iput p2, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->c:I

    .line 28
    .line 29
    const/4 p2, 0x1

    .line 30
    iput-boolean p2, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->i:Z

    .line 31
    .line 32
    new-instance p2, Lx3/q;

    .line 33
    .line 34
    invoke-direct {p2, p0, p1}, Lx3/q;-><init>(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V

    .line 35
    .line 36
    .line 37
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->j:Ljava/lang/Runnable;

    .line 38
    .line 39
    return-void
.end method

.method public static synthetic a(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->b(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V

    return-void
.end method

.method public static final b(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->d:Z

    .line 3
    .line 4
    invoke-static {p1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->o(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)Landroid/view/WindowManager$LayoutParams;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    const-string v2, "layoutParams"

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object v0, v1

    .line 17
    :cond_0
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 18
    .line 19
    iput v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->g:I

    .line 20
    .line 21
    invoke-static {p1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->o(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)Landroid/view/WindowManager$LayoutParams;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object v1, p1

    .line 32
    :goto_0
    iget p1, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 33
    .line 34
    iput p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->h:I

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    const-string v0, "v"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "event"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const-string v1, "layoutParams"

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    if-eqz v0, :cond_c

    .line 21
    .line 22
    if-eq v0, v2, :cond_a

    .line 23
    .line 24
    const/4 v5, 0x2

    .line 25
    if-eq v0, v5, :cond_0

    .line 26
    .line 27
    const/4 p2, 0x3

    .line 28
    if-eq v0, p2, :cond_a

    .line 29
    .line 30
    return v4

    .line 31
    :cond_0
    iget-boolean p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->d:Z

    .line 32
    .line 33
    if-eqz p1, :cond_7

    .line 34
    .line 35
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iget v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->e:F

    .line 40
    .line 41
    sub-float/2addr p1, v0

    .line 42
    float-to-int p1, p1

    .line 43
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    iget v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->f:F

    .line 48
    .line 49
    sub-float/2addr p2, v0

    .line 50
    float-to-int p2, p2

    .line 51
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->k:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;

    .line 52
    .line 53
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->o(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)Landroid/view/WindowManager$LayoutParams;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-nez v0, :cond_1

    .line 58
    .line 59
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    move-object v0, v3

    .line 63
    :cond_1
    iget-boolean v5, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->i:Z

    .line 64
    .line 65
    if-eqz v5, :cond_2

    .line 66
    .line 67
    iget v5, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->g:I

    .line 68
    .line 69
    sub-int/2addr v5, p1

    .line 70
    invoke-static {v5, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    goto :goto_0

    .line 75
    :cond_2
    iget v5, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->g:I

    .line 76
    .line 77
    add-int/2addr v5, p1

    .line 78
    invoke-static {v5, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    :goto_0
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 83
    .line 84
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->k:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;

    .line 85
    .line 86
    invoke-static {p1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->o(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)Landroid/view/WindowManager$LayoutParams;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-nez p1, :cond_3

    .line 91
    .line 92
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    move-object p1, v3

    .line 96
    :cond_3
    iget v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->h:I

    .line 97
    .line 98
    add-int/2addr v0, p2

    .line 99
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 100
    .line 101
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->k:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;

    .line 102
    .line 103
    invoke-static {p1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->q(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)Landroid/view/WindowManager;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-nez p1, :cond_4

    .line 108
    .line 109
    const-string p1, "windowManager"

    .line 110
    .line 111
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    move-object p1, v3

    .line 115
    :cond_4
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->k:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;

    .line 116
    .line 117
    invoke-static {p2}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->n(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)Landroid/view/View;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    if-nez p2, :cond_5

    .line 122
    .line 123
    const-string p2, "floatingView"

    .line 124
    .line 125
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    move-object p2, v3

    .line 129
    :cond_5
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->k:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;

    .line 130
    .line 131
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->o(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)Landroid/view/WindowManager$LayoutParams;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    if-nez v0, :cond_6

    .line 136
    .line 137
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_6
    move-object v3, v0

    .line 142
    :goto_1
    invoke-interface {p1, p2, v3}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 143
    .line 144
    .line 145
    return v2

    .line 146
    :cond_7
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    iget v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->e:F

    .line 151
    .line 152
    sub-float/2addr p1, v0

    .line 153
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    iget v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->c:I

    .line 158
    .line 159
    int-to-float v0, v0

    .line 160
    cmpl-float p1, p1, v0

    .line 161
    .line 162
    if-gtz p1, :cond_8

    .line 163
    .line 164
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    iget p2, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->f:F

    .line 169
    .line 170
    sub-float/2addr p1, p2

    .line 171
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    iget p2, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->c:I

    .line 176
    .line 177
    int-to-float p2, p2

    .line 178
    cmpl-float p1, p1, p2

    .line 179
    .line 180
    if-lez p1, :cond_9

    .line 181
    .line 182
    :cond_8
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->b:Landroid/os/Handler;

    .line 183
    .line 184
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->j:Ljava/lang/Runnable;

    .line 185
    .line 186
    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 187
    .line 188
    .line 189
    :cond_9
    return v4

    .line 190
    :cond_a
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->b:Landroid/os/Handler;

    .line 191
    .line 192
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->j:Ljava/lang/Runnable;

    .line 193
    .line 194
    invoke-virtual {p2, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 195
    .line 196
    .line 197
    iget-boolean p2, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->d:Z

    .line 198
    .line 199
    if-eqz p2, :cond_b

    .line 200
    .line 201
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->k:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;

    .line 202
    .line 203
    invoke-static {p1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->r(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V

    .line 204
    .line 205
    .line 206
    return v2

    .line 207
    :cond_b
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    .line 208
    .line 209
    .line 210
    return v4

    .line 211
    :cond_c
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    iput p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->e:F

    .line 216
    .line 217
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    iput p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->f:F

    .line 222
    .line 223
    iput-boolean v4, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->d:Z

    .line 224
    .line 225
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->k:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;

    .line 226
    .line 227
    invoke-static {p1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->o(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)Landroid/view/WindowManager$LayoutParams;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    if-nez p1, :cond_d

    .line 232
    .line 233
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_d
    move-object v3, p1

    .line 238
    :goto_2
    iget p1, v3, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 239
    .line 240
    const/4 p2, 0x5

    .line 241
    and-int/2addr p1, p2

    .line 242
    if-ne p1, p2, :cond_e

    .line 243
    .line 244
    move v4, v2

    .line 245
    :cond_e
    iput-boolean v4, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->i:Z

    .line 246
    .line 247
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->b:Landroid/os/Handler;

    .line 248
    .line 249
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->j:Ljava/lang/Runnable;

    .line 250
    .line 251
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->a:J

    .line 252
    .line 253
    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 254
    .line 255
    .line 256
    return v2
.end method
