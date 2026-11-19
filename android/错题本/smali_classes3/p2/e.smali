.class public final Lp2/e;
.super Lp2/c;
.source "SourceFile"


# instance fields
.field public final synthetic d:I

.field public final e:Lcom/xuexiang/xui/widget/imageview/crop/Edge;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;I)V
    .locals 0

    .line 1
    iput p2, p0, Lp2/e;->d:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    invoke-direct {p0, p1, p2}, Lp2/c;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lp2/e;->e:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    const/4 p2, 0x0

    .line 14
    invoke-direct {p0, p2, p1}, Lp2/c;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lp2/e;->e:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(FFFLandroid/graphics/Rect;F)V
    .locals 8

    .line 1
    iget v0, p0, Lp2/e;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lp2/e;->e:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 7
    .line 8
    move v2, p1

    .line 9
    move v3, p2

    .line 10
    move v6, p3

    .line 11
    move-object v4, p4

    .line 12
    move v5, p5

    .line 13
    invoke-virtual/range {v1 .. v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->adjustCoordinate(FFLandroid/graphics/Rect;FF)V

    .line 14
    .line 15
    .line 16
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    sget-object p2, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 23
    .line 24
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    sget-object p4, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 29
    .line 30
    invoke-virtual {p4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 31
    .line 32
    .line 33
    move-result p4

    .line 34
    sget-object p5, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 35
    .line 36
    invoke-virtual {p5}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    sub-float/2addr p4, p1

    .line 41
    div-float/2addr p4, v6

    .line 42
    sub-float p1, v0, p3

    .line 43
    .line 44
    sub-float/2addr p4, p1

    .line 45
    const/high16 p1, 0x40000000    # 2.0f

    .line 46
    .line 47
    div-float/2addr p4, p1

    .line 48
    sub-float/2addr p3, p4

    .line 49
    add-float/2addr v0, p4

    .line 50
    invoke-virtual {p2, p3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p5, v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, v4, v5}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isOutsideMargin(Landroid/graphics/Rect;F)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    iget-object p3, p0, Lp2/e;->e:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 61
    .line 62
    if-eqz p1, :cond_0

    .line 63
    .line 64
    invoke-virtual {p3, p2, v4, v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isNewRectangleOutOfBounds(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Landroid/graphics/Rect;F)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_0

    .line 69
    .line 70
    invoke-virtual {p2, v4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->snapToRect(Landroid/graphics/Rect;)F

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    neg-float p1, p1

    .line 75
    invoke-virtual {p5, p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->offset(F)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p3, v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->adjustCoordinate(F)V

    .line 79
    .line 80
    .line 81
    :cond_0
    invoke-virtual {p5, v4, v5}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isOutsideMargin(Landroid/graphics/Rect;F)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_1

    .line 86
    .line 87
    invoke-virtual {p3, p5, v4, v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isNewRectangleOutOfBounds(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Landroid/graphics/Rect;F)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-nez p1, :cond_1

    .line 92
    .line 93
    invoke-virtual {p5, v4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->snapToRect(Landroid/graphics/Rect;)F

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    neg-float p1, p1

    .line 98
    invoke-virtual {p2, p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->offset(F)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p3, v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->adjustCoordinate(F)V

    .line 102
    .line 103
    .line 104
    :cond_1
    return-void

    .line 105
    :pswitch_0
    move v2, p1

    .line 106
    move v3, p2

    .line 107
    move v6, p3

    .line 108
    move-object v4, p4

    .line 109
    move v5, p5

    .line 110
    iget-object p1, p0, Lp2/e;->e:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 111
    .line 112
    move v7, v6

    .line 113
    move v6, v5

    .line 114
    move-object v5, v4

    .line 115
    move v4, v3

    .line 116
    move v3, v2

    .line 117
    move-object v2, p1

    .line 118
    invoke-virtual/range {v2 .. v7}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->adjustCoordinate(FFLandroid/graphics/Rect;FF)V

    .line 119
    .line 120
    .line 121
    move-object v4, v5

    .line 122
    move v5, v6

    .line 123
    move v6, v7

    .line 124
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 125
    .line 126
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    sget-object p3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 131
    .line 132
    invoke-virtual {p3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 133
    .line 134
    .line 135
    move-result p3

    .line 136
    sget-object p4, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 137
    .line 138
    invoke-virtual {p4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 139
    .line 140
    .line 141
    move-result p5

    .line 142
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 143
    .line 144
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    sub-float/2addr v0, p3

    .line 149
    mul-float/2addr v0, v6

    .line 150
    sub-float p3, p5, p2

    .line 151
    .line 152
    sub-float/2addr v0, p3

    .line 153
    const/high16 p3, 0x40000000    # 2.0f

    .line 154
    .line 155
    div-float/2addr v0, p3

    .line 156
    sub-float/2addr p2, v0

    .line 157
    add-float/2addr p5, v0

    .line 158
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p4, p5}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, v4, v5}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isOutsideMargin(Landroid/graphics/Rect;F)Z

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    iget-object p3, p0, Lp2/e;->e:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 169
    .line 170
    if-eqz p2, :cond_2

    .line 171
    .line 172
    invoke-virtual {p3, p1, v4, v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isNewRectangleOutOfBounds(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Landroid/graphics/Rect;F)Z

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    if-nez p2, :cond_2

    .line 177
    .line 178
    invoke-virtual {p1, v4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->snapToRect(Landroid/graphics/Rect;)F

    .line 179
    .line 180
    .line 181
    move-result p2

    .line 182
    neg-float p2, p2

    .line 183
    invoke-virtual {p4, p2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->offset(F)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p3, v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->adjustCoordinate(F)V

    .line 187
    .line 188
    .line 189
    :cond_2
    invoke-virtual {p4, v4, v5}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isOutsideMargin(Landroid/graphics/Rect;F)Z

    .line 190
    .line 191
    .line 192
    move-result p2

    .line 193
    if-eqz p2, :cond_3

    .line 194
    .line 195
    invoke-virtual {p3, p4, v4, v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isNewRectangleOutOfBounds(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Landroid/graphics/Rect;F)Z

    .line 196
    .line 197
    .line 198
    move-result p2

    .line 199
    if-nez p2, :cond_3

    .line 200
    .line 201
    invoke-virtual {p4, v4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->snapToRect(Landroid/graphics/Rect;)F

    .line 202
    .line 203
    .line 204
    move-result p2

    .line 205
    neg-float p2, p2

    .line 206
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->offset(F)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p3, v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->adjustCoordinate(F)V

    .line 210
    .line 211
    .line 212
    :cond_3
    return-void

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
