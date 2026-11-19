.class public Lcom/zykj/video/play/controller/TCControllerFullScreen$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln5/f$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/video/play/controller/TCControllerFullScreen;->A(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/video/play/controller/TCControllerFullScreen;


# direct methods
.method public constructor <init>(Lcom/zykj/video/play/controller/TCControllerFullScreen;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->u(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->u(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/high16 v1, 0x42c80000    # 100.0f

    .line 16
    .line 17
    mul-float/2addr p1, v1

    .line 18
    float-to-int p1, p1

    .line 19
    invoke-virtual {v0, p1}, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;->setProgress(I)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 23
    .line 24
    invoke-static {p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->u(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    sget v0, Lcom/zykj/video/play/R$drawable;->superplayer_ic_light_max:I

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;->setImageResource(I)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 34
    .line 35
    invoke-static {p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->u(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;->b()V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public b(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->u(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->u(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget v1, Lcom/zykj/video/play/R$drawable;->superplayer_ic_volume_max:I

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;->setImageResource(I)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->u(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    float-to-int p1, p1

    .line 27
    invoke-virtual {v0, p1}, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;->setProgress(I)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 31
    .line 32
    invoke-static {p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->u(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;->b()V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public c(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->w(Lcom/zykj/video/play/controller/TCControllerFullScreen;Z)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->x(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCVideoProgressLayout;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_5

    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->v(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/zykj/video/play/view/TCPointSeekBar;->getMax()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-le p1, v0, :cond_0

    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->v(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lcom/zykj/video/play/view/TCPointSeekBar;->getMax()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    :cond_0
    if-gez p1, :cond_1

    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    :cond_1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 41
    .line 42
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->x(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCVideoProgressLayout;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0, p1}, Lcom/zykj/video/play/view/TCVideoProgressLayout;->setProgress(I)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 50
    .line 51
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->x(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCVideoProgressLayout;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Lcom/zykj/video/play/view/TCVideoProgressLayout;->c()V

    .line 56
    .line 57
    .line 58
    int-to-float v0, p1

    .line 59
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 60
    .line 61
    invoke-static {v1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->v(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1}, Lcom/zykj/video/play/view/TCPointSeekBar;->getMax()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    int-to-float v1, v1

    .line 70
    div-float/2addr v0, v1

    .line 71
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 72
    .line 73
    invoke-static {v1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->y(Lcom/zykj/video/play/controller/TCControllerFullScreen;)J

    .line 74
    .line 75
    .line 76
    move-result-wide v1

    .line 77
    long-to-float v1, v1

    .line 78
    mul-float/2addr v1, v0

    .line 79
    iget-object v2, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 80
    .line 81
    invoke-static {v2}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->k(Lcom/zykj/video/play/controller/TCControllerFullScreen;)I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    const/4 v3, 0x2

    .line 86
    if-eq v2, v3, :cond_3

    .line 87
    .line 88
    iget-object v2, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 89
    .line 90
    invoke-static {v2}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->k(Lcom/zykj/video/play/controller/TCControllerFullScreen;)I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    const/4 v3, 0x3

    .line 95
    if-ne v2, v3, :cond_2

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 99
    .line 100
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->x(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCVideoProgressLayout;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    new-instance v2, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    float-to-long v3, v1

    .line 110
    invoke-static {v3, v4}, Ln5/d;->b(J)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v1, " / "

    .line 118
    .line 119
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 123
    .line 124
    invoke-static {v1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->y(Lcom/zykj/video/play/controller/TCControllerFullScreen;)J

    .line 125
    .line 126
    .line 127
    move-result-wide v3

    .line 128
    invoke-static {v3, v4}, Ln5/d;->b(J)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v0, v1}, Lcom/zykj/video/play/view/TCVideoProgressLayout;->setTimeText(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_3
    :goto_0
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 144
    .line 145
    invoke-static {v1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->l(Lcom/zykj/video/play/controller/TCControllerFullScreen;)J

    .line 146
    .line 147
    .line 148
    move-result-wide v1

    .line 149
    const-wide/16 v3, 0x1c20

    .line 150
    .line 151
    cmp-long v1, v1, v3

    .line 152
    .line 153
    if-lez v1, :cond_4

    .line 154
    .line 155
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 156
    .line 157
    invoke-static {v1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->l(Lcom/zykj/video/play/controller/TCControllerFullScreen;)J

    .line 158
    .line 159
    .line 160
    move-result-wide v1

    .line 161
    long-to-float v1, v1

    .line 162
    const/high16 v2, 0x3f800000    # 1.0f

    .line 163
    .line 164
    sub-float/2addr v2, v0

    .line 165
    const/high16 v0, 0x45e10000    # 7200.0f

    .line 166
    .line 167
    mul-float/2addr v2, v0

    .line 168
    sub-float/2addr v1, v2

    .line 169
    float-to-int v0, v1

    .line 170
    int-to-float v0, v0

    .line 171
    goto :goto_1

    .line 172
    :cond_4
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 173
    .line 174
    invoke-static {v1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->l(Lcom/zykj/video/play/controller/TCControllerFullScreen;)J

    .line 175
    .line 176
    .line 177
    move-result-wide v1

    .line 178
    long-to-float v1, v1

    .line 179
    mul-float/2addr v0, v1

    .line 180
    :goto_1
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 181
    .line 182
    invoke-static {v1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->x(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCVideoProgressLayout;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    float-to-long v2, v0

    .line 187
    invoke-static {v2, v3}, Ln5/d;->b(J)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {v1, v0}, Lcom/zykj/video/play/view/TCVideoProgressLayout;->setTimeText(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    :goto_2
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 195
    .line 196
    invoke-static {v0, p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->m(Lcom/zykj/video/play/controller/TCControllerFullScreen;I)V

    .line 197
    .line 198
    .line 199
    :cond_5
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 200
    .line 201
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->v(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    if-eqz v0, :cond_6

    .line 206
    .line 207
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 208
    .line 209
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->v(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0, p1}, Lcom/zykj/video/play/view/TCPointSeekBar;->setProgress(I)V

    .line 214
    .line 215
    .line 216
    :cond_6
    return-void
.end method
