.class public final Lg3/a;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field public a:F

.field public final b:F

.field public final c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg3/a;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 5
    .line 6
    iput p2, p0, Lg3/a;->b:F

    .line 7
    .line 8
    const/high16 p1, 0x4f000000

    .line 9
    .line 10
    iput p1, p0, Lg3/a;->a:F

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    iget v0, p0, Lg3/a;->a:F

    .line 2
    .line 3
    const/high16 v1, 0x4f000000

    .line 4
    .line 5
    cmpl-float v0, v0, v1

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_2

    .line 9
    .line 10
    iget v0, p0, Lg3/a;->b:F

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/high16 v3, 0x44fa0000    # 2000.0f

    .line 17
    .line 18
    cmpl-float v2, v2, v3

    .line 19
    .line 20
    if-lez v2, :cond_1

    .line 21
    .line 22
    cmpl-float v0, v0, v1

    .line 23
    .line 24
    if-lez v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/high16 v3, -0x3b060000    # -2000.0f

    .line 28
    .line 29
    :goto_0
    iput v3, p0, Lg3/a;->a:F

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    iput v0, p0, Lg3/a;->a:F

    .line 33
    .line 34
    :cond_2
    :goto_1
    iget v0, p0, Lg3/a;->a:F

    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    cmpl-float v0, v0, v1

    .line 41
    .line 42
    const/high16 v2, 0x41a00000    # 20.0f

    .line 43
    .line 44
    iget-object v3, p0, Lg3/a;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 45
    .line 46
    if-ltz v0, :cond_3

    .line 47
    .line 48
    iget v0, p0, Lg3/a;->a:F

    .line 49
    .line 50
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    cmpg-float v0, v0, v2

    .line 55
    .line 56
    if-gtz v0, :cond_3

    .line 57
    .line 58
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->a()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getHandler()Landroid/os/Handler;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const/16 v1, 0x7d0

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_3
    iget v0, p0, Lg3/a;->a:F

    .line 72
    .line 73
    const/high16 v4, 0x42c80000    # 100.0f

    .line 74
    .line 75
    div-float/2addr v0, v4

    .line 76
    float-to-int v0, v0

    .line 77
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getTotalScrollY()F

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    int-to-float v0, v0

    .line 82
    sub-float/2addr v4, v0

    .line 83
    invoke-virtual {v3, v4}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTotalScrollY(F)V

    .line 84
    .line 85
    .line 86
    iget-boolean v4, v3, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:Z

    .line 87
    .line 88
    if-nez v4, :cond_7

    .line 89
    .line 90
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getItemHeight()F

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getInitPosition()I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    neg-int v5, v5

    .line 99
    int-to-float v5, v5

    .line 100
    mul-float/2addr v5, v4

    .line 101
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getItemsCount()I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    add-int/lit8 v6, v6, -0x1

    .line 106
    .line 107
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getInitPosition()I

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    sub-int/2addr v6, v7

    .line 112
    int-to-float v6, v6

    .line 113
    mul-float/2addr v6, v4

    .line 114
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getTotalScrollY()F

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    float-to-double v7, v7

    .line 119
    float-to-double v9, v4

    .line 120
    const-wide/high16 v11, 0x3fd0000000000000L    # 0.25

    .line 121
    .line 122
    mul-double/2addr v9, v11

    .line 123
    sub-double/2addr v7, v9

    .line 124
    float-to-double v11, v5

    .line 125
    cmpg-double v4, v7, v11

    .line 126
    .line 127
    if-gez v4, :cond_4

    .line 128
    .line 129
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getTotalScrollY()F

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    add-float v5, v4, v0

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_4
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getTotalScrollY()F

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    float-to-double v7, v4

    .line 141
    add-double/2addr v7, v9

    .line 142
    float-to-double v9, v6

    .line 143
    cmpl-double v4, v7, v9

    .line 144
    .line 145
    if-lez v4, :cond_5

    .line 146
    .line 147
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getTotalScrollY()F

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    add-float v6, v4, v0

    .line 152
    .line 153
    :cond_5
    :goto_2
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getTotalScrollY()F

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    cmpg-float v0, v0, v5

    .line 158
    .line 159
    if-gtz v0, :cond_6

    .line 160
    .line 161
    const/high16 v0, 0x42200000    # 40.0f

    .line 162
    .line 163
    iput v0, p0, Lg3/a;->a:F

    .line 164
    .line 165
    float-to-int v0, v5

    .line 166
    int-to-float v0, v0

    .line 167
    invoke-virtual {v3, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTotalScrollY(F)V

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_6
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getTotalScrollY()F

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    cmpl-float v0, v0, v6

    .line 176
    .line 177
    if-ltz v0, :cond_7

    .line 178
    .line 179
    float-to-int v0, v6

    .line 180
    int-to-float v0, v0

    .line 181
    invoke-virtual {v3, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTotalScrollY(F)V

    .line 182
    .line 183
    .line 184
    const/high16 v0, -0x3de00000    # -40.0f

    .line 185
    .line 186
    iput v0, p0, Lg3/a;->a:F

    .line 187
    .line 188
    :cond_7
    :goto_3
    iget v0, p0, Lg3/a;->a:F

    .line 189
    .line 190
    cmpg-float v1, v0, v1

    .line 191
    .line 192
    if-gez v1, :cond_8

    .line 193
    .line 194
    add-float/2addr v0, v2

    .line 195
    iput v0, p0, Lg3/a;->a:F

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_8
    sub-float/2addr v0, v2

    .line 199
    iput v0, p0, Lg3/a;->a:F

    .line 200
    .line 201
    :goto_4
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getHandler()Landroid/os/Handler;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    const/16 v1, 0x3e8

    .line 206
    .line 207
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 208
    .line 209
    .line 210
    return-void
.end method
