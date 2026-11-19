.class public Ln5/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln5/f$a;
    }
.end annotation


# instance fields
.field public a:I

.field public b:Ln5/f$a;

.field public c:I

.field public d:F

.field public e:Landroid/view/Window;

.field public f:Landroid/view/WindowManager$LayoutParams;

.field public g:Landroid/content/ContentResolver;

.field public h:Landroid/media/AudioManager;

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ln5/f;->a:I

    .line 6
    .line 7
    const/high16 v1, 0x3f800000    # 1.0f

    .line 8
    .line 9
    iput v1, p0, Ln5/f;->d:F

    .line 10
    .line 11
    iput v0, p0, Ln5/f;->i:I

    .line 12
    .line 13
    iput v0, p0, Ln5/f;->j:I

    .line 14
    .line 15
    const/16 v0, 0x14

    .line 16
    .line 17
    iput v0, p0, Ln5/f;->m:I

    .line 18
    .line 19
    const v0, 0x3e99999a    # 0.3f

    .line 20
    .line 21
    .line 22
    iput v0, p0, Ln5/f;->n:F

    .line 23
    .line 24
    const-string v0, "audio"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Landroid/media/AudioManager;

    .line 31
    .line 32
    iput-object v0, p0, Ln5/f;->h:Landroid/media/AudioManager;

    .line 33
    .line 34
    const/4 v1, 0x3

    .line 35
    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iput v0, p0, Ln5/f;->i:I

    .line 40
    .line 41
    instance-of v0, p1, Landroid/app/Activity;

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    move-object v0, p1

    .line 46
    check-cast v0, Landroid/app/Activity;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Ln5/f;->e:Landroid/view/Window;

    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, Ln5/f;->f:Landroid/view/WindowManager$LayoutParams;

    .line 59
    .line 60
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 61
    .line 62
    iput v0, p0, Ln5/f;->d:F

    .line 63
    .line 64
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, Ln5/f;->g:Landroid/content/ContentResolver;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public a(ILandroid/view/MotionEvent;Landroid/view/MotionEvent;FF)V
    .locals 3

    .line 1
    iget p4, p0, Ln5/f;->a:I

    .line 2
    .line 3
    const/4 p5, 0x1

    .line 4
    const/4 v0, 0x3

    .line 5
    const/4 v1, 0x2

    .line 6
    if-eqz p4, :cond_9

    .line 7
    .line 8
    const/high16 v2, 0x42c80000    # 100.0f

    .line 9
    .line 10
    if-eq p4, p5, :cond_7

    .line 11
    .line 12
    if-eq p4, v1, :cond_1

    .line 13
    .line 14
    if-eq p4, v0, :cond_0

    .line 15
    .line 16
    goto/16 :goto_2

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    sub-float/2addr p1, p2

    .line 27
    iget p2, p0, Ln5/f;->c:I

    .line 28
    .line 29
    int-to-float p2, p2

    .line 30
    div-float/2addr p1, p2

    .line 31
    iget p2, p0, Ln5/f;->l:I

    .line 32
    .line 33
    int-to-float p2, p2

    .line 34
    mul-float/2addr p1, v2

    .line 35
    add-float/2addr p2, p1

    .line 36
    float-to-int p1, p2

    .line 37
    iput p1, p0, Ln5/f;->k:I

    .line 38
    .line 39
    iget-object p2, p0, Ln5/f;->b:Ln5/f$a;

    .line 40
    .line 41
    if-eqz p2, :cond_8

    .line 42
    .line 43
    invoke-interface {p2, p1}, Ln5/f$a;->c(I)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    const/4 p4, 0x0

    .line 48
    if-nez p1, :cond_2

    .line 49
    .line 50
    move p2, p4

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    sub-float/2addr p2, p3

    .line 61
    int-to-float p1, p1

    .line 62
    div-float/2addr p2, p1

    .line 63
    iget p1, p0, Ln5/f;->n:F

    .line 64
    .line 65
    mul-float/2addr p2, p1

    .line 66
    :goto_0
    iget p1, p0, Ln5/f;->d:F

    .line 67
    .line 68
    add-float/2addr p2, p1

    .line 69
    cmpg-float p1, p2, p4

    .line 70
    .line 71
    if-gez p1, :cond_3

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    const/high16 p4, 0x3f800000    # 1.0f

    .line 75
    .line 76
    cmpl-float p1, p2, p4

    .line 77
    .line 78
    if-lez p1, :cond_4

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    move p4, p2

    .line 82
    :goto_1
    iget-object p1, p0, Ln5/f;->f:Landroid/view/WindowManager$LayoutParams;

    .line 83
    .line 84
    if-eqz p1, :cond_5

    .line 85
    .line 86
    iput p4, p1, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 87
    .line 88
    :cond_5
    iget-object p2, p0, Ln5/f;->e:Landroid/view/Window;

    .line 89
    .line 90
    if-eqz p2, :cond_6

    .line 91
    .line 92
    invoke-virtual {p2, p1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 93
    .line 94
    .line 95
    :cond_6
    iget-object p1, p0, Ln5/f;->b:Ln5/f$a;

    .line 96
    .line 97
    if-eqz p1, :cond_8

    .line 98
    .line 99
    invoke-interface {p1, p4}, Ln5/f$a;->a(F)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_7
    iget p4, p0, Ln5/f;->i:I

    .line 104
    .line 105
    div-int/2addr p1, p4

    .line 106
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    .line 111
    .line 112
    .line 113
    move-result p3

    .line 114
    sub-float/2addr p2, p3

    .line 115
    int-to-float p1, p1

    .line 116
    div-float/2addr p2, p1

    .line 117
    iget p1, p0, Ln5/f;->n:F

    .line 118
    .line 119
    mul-float/2addr p2, p1

    .line 120
    iget p1, p0, Ln5/f;->j:I

    .line 121
    .line 122
    int-to-float p1, p1

    .line 123
    add-float/2addr p2, p1

    .line 124
    float-to-int p1, p2

    .line 125
    iget-object p2, p0, Ln5/f;->h:Landroid/media/AudioManager;

    .line 126
    .line 127
    const/4 p3, 0x4

    .line 128
    invoke-virtual {p2, v0, p1, p3}, Landroid/media/AudioManager;->setStreamVolume(III)V

    .line 129
    .line 130
    .line 131
    int-to-float p1, p1

    .line 132
    iget p2, p0, Ln5/f;->i:I

    .line 133
    .line 134
    int-to-float p2, p2

    .line 135
    div-float/2addr p1, p2

    .line 136
    mul-float/2addr p1, v2

    .line 137
    iget-object p2, p0, Ln5/f;->b:Ln5/f$a;

    .line 138
    .line 139
    if-eqz p2, :cond_8

    .line 140
    .line 141
    invoke-interface {p2, p1}, Ln5/f$a;->b(F)V

    .line 142
    .line 143
    .line 144
    :cond_8
    :goto_2
    return-void

    .line 145
    :cond_9
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    .line 150
    .line 151
    .line 152
    move-result p3

    .line 153
    sub-float/2addr p1, p3

    .line 154
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    iget p3, p0, Ln5/f;->m:I

    .line 159
    .line 160
    int-to-float p3, p3

    .line 161
    cmpl-float p1, p1, p3

    .line 162
    .line 163
    if-lez p1, :cond_a

    .line 164
    .line 165
    iput v0, p0, Ln5/f;->a:I

    .line 166
    .line 167
    return-void

    .line 168
    :cond_a
    iget p1, p0, Ln5/f;->c:I

    .line 169
    .line 170
    div-int/2addr p1, v1

    .line 171
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 172
    .line 173
    .line 174
    move-result p2

    .line 175
    int-to-float p1, p1

    .line 176
    cmpg-float p1, p2, p1

    .line 177
    .line 178
    if-gez p1, :cond_b

    .line 179
    .line 180
    iput v1, p0, Ln5/f;->a:I

    .line 181
    .line 182
    return-void

    .line 183
    :cond_b
    iput p5, p0, Ln5/f;->a:I

    .line 184
    .line 185
    return-void
.end method

.method public final b()I
    .locals 3

    .line 1
    iget-object v0, p0, Ln5/f;->g:Landroid/content/ContentResolver;

    .line 2
    .line 3
    const/16 v1, 0xff

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v2, "screen_brightness"

    .line 8
    .line 9
    invoke-static {v0, v2, v1}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_0
    return v1
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Ln5/f;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public d()Z
    .locals 2

    .line 1
    iget v0, p0, Ln5/f;->a:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public e(II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ln5/f;->k:I

    .line 3
    .line 4
    iput p1, p0, Ln5/f;->c:I

    .line 5
    .line 6
    iput v0, p0, Ln5/f;->a:I

    .line 7
    .line 8
    iget-object p1, p0, Ln5/f;->h:Landroid/media/AudioManager;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-virtual {p1, v0}, Landroid/media/AudioManager;->getStreamVolume(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput p1, p0, Ln5/f;->j:I

    .line 16
    .line 17
    iget-object p1, p0, Ln5/f;->f:Landroid/view/WindowManager$LayoutParams;

    .line 18
    .line 19
    iget p1, p1, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 20
    .line 21
    iput p1, p0, Ln5/f;->d:F

    .line 22
    .line 23
    const/high16 v0, -0x40800000    # -1.0f

    .line 24
    .line 25
    cmpl-float p1, p1, v0

    .line 26
    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Ln5/f;->b()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    int-to-float p1, p1

    .line 34
    const/high16 v0, 0x437f0000    # 255.0f

    .line 35
    .line 36
    div-float/2addr p1, v0

    .line 37
    iput p1, p0, Ln5/f;->d:F

    .line 38
    .line 39
    :cond_0
    iput p2, p0, Ln5/f;->l:I

    .line 40
    .line 41
    return-void
.end method

.method public f(Ln5/f$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln5/f;->b:Ln5/f$a;

    .line 2
    .line 3
    return-void
.end method
