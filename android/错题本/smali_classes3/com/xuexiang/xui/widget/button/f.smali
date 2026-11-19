.class public final Lcom/xuexiang/xui/widget/button/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/xuexiang/xui/widget/button/f;->a:I

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/f;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/f;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/lang/Float;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->setExpansion(F)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/f;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lcom/xw/repo/BubbleSeekBar;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Ljava/lang/Float;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iput p1, v0, Lcom/xw/repo/BubbleSeekBar;->K:F

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/xw/repo/BubbleSeekBar;->d()F

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    iput p1, v0, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 45
    .line 46
    iget-boolean p1, v0, Lcom/xw/repo/BubbleSeekBar;->D:Z

    .line 47
    .line 48
    if-nez p1, :cond_1

    .line 49
    .line 50
    iget-object p1, v0, Lcom/xw/repo/BubbleSeekBar;->d0:Lw3/d;

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/xw/repo/BubbleSeekBar;->c()F

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    iput p1, v0, Lcom/xw/repo/BubbleSeekBar;->h0:F

    .line 63
    .line 64
    iget-object p1, v0, Lcom/xw/repo/BubbleSeekBar;->i0:Landroid/view/WindowManager$LayoutParams;

    .line 65
    .line 66
    iget v1, v0, Lcom/xw/repo/BubbleSeekBar;->h0:F

    .line 67
    .line 68
    const/high16 v2, 0x3f000000    # 0.5f

    .line 69
    .line 70
    add-float/2addr v1, v2

    .line 71
    float-to-int v1, v1

    .line 72
    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 73
    .line 74
    iget-object v1, v0, Lcom/xw/repo/BubbleSeekBar;->c0:Landroid/view/WindowManager;

    .line 75
    .line 76
    iget-object v2, v0, Lcom/xw/repo/BubbleSeekBar;->d0:Lw3/d;

    .line 77
    .line 78
    invoke-interface {v1, v2, p1}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 79
    .line 80
    .line 81
    iget-object p1, v0, Lcom/xw/repo/BubbleSeekBar;->d0:Lw3/d;

    .line 82
    .line 83
    iget-boolean v1, v0, Lcom/xw/repo/BubbleSeekBar;->w:Z

    .line 84
    .line 85
    if-eqz v1, :cond_0

    .line 86
    .line 87
    invoke-virtual {v0}, Lcom/xw/repo/BubbleSeekBar;->getProgressFloat()F

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    goto :goto_0

    .line 96
    :cond_0
    invoke-virtual {v0}, Lcom/xw/repo/BubbleSeekBar;->getProgress()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    :goto_0
    invoke-virtual {p1, v1}, Lw3/d;->a(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_1
    invoke-virtual {v0}, Lcom/xw/repo/BubbleSeekBar;->g()F

    .line 109
    .line 110
    .line 111
    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :pswitch_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/f;->b:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p1, Lt3/c;

    .line 121
    .line 122
    iget-object v0, p1, Lt3/c;->b:Ljava/lang/ref/WeakReference;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;

    .line 129
    .line 130
    if-eqz v0, :cond_3

    .line 131
    .line 132
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-nez v1, :cond_2

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_3
    :goto_2
    invoke-virtual {p1}, Landroid/animation/Animator;->cancel()V

    .line 144
    .line 145
    .line 146
    :goto_3
    return-void

    .line 147
    :pswitch_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/f;->b:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;

    .line 150
    .line 151
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    check-cast p1, Ljava/lang/Integer;

    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    iput p1, v0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->c:I

    .line 162
    .line 163
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :pswitch_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/f;->b:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 170
    .line 171
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    check-cast p1, Ljava/lang/Float;

    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    iput p1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->g:F

    .line 182
    .line 183
    const/4 p1, 0x0

    .line 184
    throw p1

    .line 185
    :pswitch_4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/f;->b:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v0, Lcom/xuexiang/xui/widget/picker/RulerView;

    .line 188
    .line 189
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/RulerView;->q:F

    .line 190
    .line 191
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    check-cast p1, Ljava/lang/Integer;

    .line 196
    .line 197
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 198
    .line 199
    .line 200
    move-result p1

    .line 201
    int-to-float p1, p1

    .line 202
    add-float/2addr v1, p1

    .line 203
    iput v1, v0, Lcom/xuexiang/xui/widget/picker/RulerView;->q:F

    .line 204
    .line 205
    iget p1, v0, Lcom/xuexiang/xui/widget/picker/RulerView;->q:F

    .line 206
    .line 207
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/RulerView;->o:I

    .line 208
    .line 209
    int-to-float v2, v1

    .line 210
    const/high16 v3, 0x40000000    # 2.0f

    .line 211
    .line 212
    div-float/2addr v2, v3

    .line 213
    cmpl-float v2, p1, v2

    .line 214
    .line 215
    if-ltz v2, :cond_4

    .line 216
    .line 217
    int-to-float p1, v1

    .line 218
    div-float/2addr p1, v3

    .line 219
    iput p1, v0, Lcom/xuexiang/xui/widget/picker/RulerView;->q:F

    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_4
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/RulerView;->h:I

    .line 223
    .line 224
    int-to-float v1, v1

    .line 225
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/RulerView;->a(F)F

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    cmpg-float p1, p1, v1

    .line 230
    .line 231
    if-gtz p1, :cond_5

    .line 232
    .line 233
    iget p1, v0, Lcom/xuexiang/xui/widget/picker/RulerView;->h:I

    .line 234
    .line 235
    int-to-float p1, p1

    .line 236
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/RulerView;->a(F)F

    .line 237
    .line 238
    .line 239
    move-result p1

    .line 240
    iput p1, v0, Lcom/xuexiang/xui/widget/picker/RulerView;->q:F

    .line 241
    .line 242
    :cond_5
    :goto_4
    iget p1, v0, Lcom/xuexiang/xui/widget/picker/RulerView;->q:F

    .line 243
    .line 244
    iput p1, v0, Lcom/xuexiang/xui/widget/picker/RulerView;->r:F

    .line 245
    .line 246
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :pswitch_5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/f;->b:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v0, Lcom/xuexiang/xui/widget/button/SwitchIconView;

    .line 253
    .line 254
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    check-cast p1, Ljava/lang/Float;

    .line 259
    .line 260
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 261
    .line 262
    .line 263
    move-result p1

    .line 264
    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->a(Lcom/xuexiang/xui/widget/button/SwitchIconView;F)V

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    nop

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
