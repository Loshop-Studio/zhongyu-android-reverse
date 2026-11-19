.class public final Lcom/blankj/utilcode/util/v;
.super Lcom/blankj/utilcode/util/t;
.source "SourceFile"


# static fields
.field public static g:I


# instance fields
.field public final synthetic d:I

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, Lcom/blankj/utilcode/util/v;->d:I

    sget-object v0, Lcom/blankj/utilcode/util/x;->b:Lcom/blankj/utilcode/util/x;

    .line 2
    invoke-direct {p0, v0}, Lcom/blankj/utilcode/util/t;-><init>(Lcom/blankj/utilcode/util/x;)V

    .line 3
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iput-object v0, p0, Lcom/blankj/utilcode/util/v;->f:Ljava/lang/Object;

    .line 4
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    move-result-object v1

    const-string/jumbo v2, "window"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/WindowManager;

    iput-object v1, p0, Lcom/blankj/utilcode/util/v;->e:Ljava/lang/Object;

    .line 5
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/blankj/utilcode/util/x;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/blankj/utilcode/util/v;->d:I

    invoke-direct {p0, p1}, Lcom/blankj/utilcode/util/t;-><init>(Lcom/blankj/utilcode/util/x;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget v0, p0, Lcom/blankj/utilcode/util/v;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/blankj/utilcode/util/v;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/view/WindowManager;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/blankj/utilcode/util/t;->c:Landroid/view/View;

    .line 13
    .line 14
    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lcom/blankj/utilcode/util/v;->e:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    :catch_0
    :cond_0
    invoke-super {p0}, Lcom/blankj/utilcode/util/t;->a()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    iget-object v0, p0, Lcom/blankj/utilcode/util/v;->e:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lcom/blankj/utilcode/util/u;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    if-eqz v0, :cond_4

    .line 30
    .line 31
    sget-object v2, Lcom/blankj/utilcode/util/b0;->g:Lcom/blankj/utilcode/util/b0;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object v3, Lcom/blankj/utilcode/util/b0;->h:Landroid/app/Activity;

    .line 37
    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    new-instance v4, Lcom/blankj/utilcode/util/z;

    .line 44
    .line 45
    const/4 v5, 0x1

    .line 46
    invoke-direct {v4, v2, v3, v0, v5}, Lcom/blankj/utilcode/util/z;-><init>(Lcom/blankj/utilcode/util/b0;Landroid/app/Activity;Lcom/blankj/utilcode/util/u;I)V

    .line 47
    .line 48
    .line 49
    invoke-static {v4}, Lcom/blankj/utilcode/util/c0;->g(Ljava/lang/Runnable;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_0
    iput-object v1, p0, Lcom/blankj/utilcode/util/v;->e:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-static {}, Lcom/blankj/utilcode/util/c0;->c()Ljava/util/LinkedList;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :catch_1
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Landroid/app/Activity;

    .line 73
    .line 74
    if-eqz v2, :cond_3

    .line 75
    .line 76
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-nez v3, :cond_3

    .line 81
    .line 82
    invoke-virtual {v2}, Landroid/app/Activity;->isDestroyed()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-nez v3, :cond_3

    .line 87
    .line 88
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    if-eqz v2, :cond_3

    .line 93
    .line 94
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Landroid/view/ViewGroup;

    .line 99
    .line 100
    new-instance v3, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v4, "TAG_TOAST"

    .line 103
    .line 104
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    sget v4, Lcom/blankj/utilcode/util/v;->g:I

    .line 108
    .line 109
    add-int/lit8 v4, v4, -0x1

    .line 110
    .line 111
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    if-eqz v3, :cond_3

    .line 123
    .line 124
    :try_start_1
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_4
    iget-object v0, p0, Lcom/blankj/utilcode/util/v;->f:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Lcom/blankj/utilcode/util/t;

    .line 131
    .line 132
    if-eqz v0, :cond_5

    .line 133
    .line 134
    invoke-virtual {v0}, Lcom/blankj/utilcode/util/t;->a()V

    .line 135
    .line 136
    .line 137
    iput-object v1, p0, Lcom/blankj/utilcode/util/v;->f:Ljava/lang/Object;

    .line 138
    .line 139
    :cond_5
    invoke-super {p0}, Lcom/blankj/utilcode/util/t;->a()V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()V
    .locals 6

    .line 1
    iget v0, p0, Lcom/blankj/utilcode/util/v;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/blankj/utilcode/util/v;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/view/WindowManager$LayoutParams;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/blankj/utilcode/util/t;->a:Landroid/widget/Toast;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, -0x2

    .line 16
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 17
    .line 18
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 19
    .line 20
    const/4 v1, -0x3

    .line 21
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 22
    .line 23
    const v1, 0x1030004

    .line 24
    .line 25
    .line 26
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 27
    .line 28
    const-string v1, "ToastWithoutNotification"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    const/16 v1, 0x98

    .line 34
    .line 35
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 36
    .line 37
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iput-object v1, v0, Landroid/view/WindowManager$LayoutParams;->packageName:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v1, p0, Lcom/blankj/utilcode/util/t;->a:Landroid/widget/Toast;

    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/widget/Toast;->getGravity()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 54
    .line 55
    and-int/lit8 v2, v1, 0x7

    .line 56
    .line 57
    const/high16 v3, 0x3f800000    # 1.0f

    .line 58
    .line 59
    const/4 v4, 0x7

    .line 60
    if-ne v2, v4, :cond_1

    .line 61
    .line 62
    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->horizontalWeight:F

    .line 63
    .line 64
    :cond_1
    const/16 v2, 0x70

    .line 65
    .line 66
    and-int/2addr v1, v2

    .line 67
    if-ne v1, v2, :cond_2

    .line 68
    .line 69
    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->verticalWeight:F

    .line 70
    .line 71
    :cond_2
    iget-object v1, p0, Lcom/blankj/utilcode/util/t;->a:Landroid/widget/Toast;

    .line 72
    .line 73
    invoke-virtual {v1}, Landroid/widget/Toast;->getXOffset()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 78
    .line 79
    iget-object v1, p0, Lcom/blankj/utilcode/util/t;->a:Landroid/widget/Toast;

    .line 80
    .line 81
    invoke-virtual {v1}, Landroid/widget/Toast;->getYOffset()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 86
    .line 87
    iget-object v1, p0, Lcom/blankj/utilcode/util/t;->a:Landroid/widget/Toast;

    .line 88
    .line 89
    invoke-virtual {v1}, Landroid/widget/Toast;->getHorizontalMargin()F

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->horizontalMargin:F

    .line 94
    .line 95
    iget-object v1, p0, Lcom/blankj/utilcode/util/t;->a:Landroid/widget/Toast;

    .line 96
    .line 97
    invoke-virtual {v1}, Landroid/widget/Toast;->getVerticalMargin()F

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->verticalMargin:F

    .line 102
    .line 103
    :try_start_0
    iget-object v1, p0, Lcom/blankj/utilcode/util/v;->e:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v1, Landroid/view/WindowManager;

    .line 106
    .line 107
    if-eqz v1, :cond_3

    .line 108
    .line 109
    iget-object v2, p0, Lcom/blankj/utilcode/util/t;->c:Landroid/view/View;

    .line 110
    .line 111
    invoke-interface {v1, v2, v0}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    .line 113
    .line 114
    :catch_0
    :cond_3
    new-instance v0, Lb0/a;

    .line 115
    .line 116
    const/4 v1, 0x6

    .line 117
    invoke-direct {v0, p0, v1}, Lb0/a;-><init>(Ljava/lang/Object;I)V

    .line 118
    .line 119
    .line 120
    const-wide/16 v1, 0x7d0

    .line 121
    .line 122
    sget-object v3, Lcom/blankj/utilcode/util/p;->a:Landroid/os/Handler;

    .line 123
    .line 124
    invoke-virtual {v3, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 125
    .line 126
    .line 127
    :goto_0
    return-void

    .line 128
    :pswitch_0
    iget-object v0, p0, Lcom/blankj/utilcode/util/t;->a:Landroid/widget/Toast;

    .line 129
    .line 130
    if-nez v0, :cond_4

    .line 131
    .line 132
    goto/16 :goto_2

    .line 133
    .line 134
    :cond_4
    sget-object v0, Lcom/blankj/utilcode/util/b0;->g:Lcom/blankj/utilcode/util/b0;

    .line 135
    .line 136
    iget-boolean v0, v0, Lcom/blankj/utilcode/util/b0;->f:Z

    .line 137
    .line 138
    if-eqz v0, :cond_5

    .line 139
    .line 140
    new-instance v0, Lcom/blankj/utilcode/util/w;

    .line 141
    .line 142
    iget-object v1, p0, Lcom/blankj/utilcode/util/t;->b:Lcom/blankj/utilcode/util/x;

    .line 143
    .line 144
    invoke-direct {v0, v1}, Lcom/blankj/utilcode/util/w;-><init>(Lcom/blankj/utilcode/util/x;)V

    .line 145
    .line 146
    .line 147
    iget-object v1, p0, Lcom/blankj/utilcode/util/t;->a:Landroid/widget/Toast;

    .line 148
    .line 149
    iput-object v1, v0, Lcom/blankj/utilcode/util/t;->a:Landroid/widget/Toast;

    .line 150
    .line 151
    invoke-virtual {v0}, Lcom/blankj/utilcode/util/w;->d()V

    .line 152
    .line 153
    .line 154
    iput-object v0, p0, Lcom/blankj/utilcode/util/v;->f:Ljava/lang/Object;

    .line 155
    .line 156
    goto/16 :goto_2

    .line 157
    .line 158
    :cond_5
    invoke-static {}, Lcom/blankj/utilcode/util/c0;->c()Ljava/util/LinkedList;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    const/4 v1, 0x0

    .line 167
    :cond_6
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    const/4 v3, 0x1

    .line 172
    if-eqz v2, :cond_8

    .line 173
    .line 174
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    check-cast v2, Landroid/app/Activity;

    .line 179
    .line 180
    if-eqz v2, :cond_6

    .line 181
    .line 182
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-nez v4, :cond_6

    .line 187
    .line 188
    invoke-virtual {v2}, Landroid/app/Activity;->isDestroyed()Z

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    if-nez v4, :cond_6

    .line 193
    .line 194
    if-nez v1, :cond_7

    .line 195
    .line 196
    new-instance v1, Lcom/blankj/utilcode/util/v;

    .line 197
    .line 198
    invoke-virtual {v2}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    const/4 v4, 0x1

    .line 203
    iget-object v5, p0, Lcom/blankj/utilcode/util/t;->b:Lcom/blankj/utilcode/util/x;

    .line 204
    .line 205
    invoke-direct {v1, v5, v4}, Lcom/blankj/utilcode/util/v;-><init>(Lcom/blankj/utilcode/util/x;I)V

    .line 206
    .line 207
    .line 208
    new-instance v4, Landroid/view/WindowManager$LayoutParams;

    .line 209
    .line 210
    invoke-direct {v4}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 211
    .line 212
    .line 213
    iput-object v4, v1, Lcom/blankj/utilcode/util/v;->f:Ljava/lang/Object;

    .line 214
    .line 215
    iput-object v2, v1, Lcom/blankj/utilcode/util/v;->e:Ljava/lang/Object;

    .line 216
    .line 217
    const/16 v2, 0x63

    .line 218
    .line 219
    iput v2, v4, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 220
    .line 221
    const/4 v2, -0x1

    .line 222
    invoke-virtual {p0, v2}, Lcom/blankj/utilcode/util/t;->b(I)Landroid/widget/ImageView;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    iput-object v2, v1, Lcom/blankj/utilcode/util/t;->c:Landroid/view/View;

    .line 227
    .line 228
    iget-object v2, p0, Lcom/blankj/utilcode/util/t;->a:Landroid/widget/Toast;

    .line 229
    .line 230
    iput-object v2, v1, Lcom/blankj/utilcode/util/t;->a:Landroid/widget/Toast;

    .line 231
    .line 232
    invoke-virtual {v1}, Lcom/blankj/utilcode/util/v;->d()V

    .line 233
    .line 234
    .line 235
    iput-object v1, p0, Lcom/blankj/utilcode/util/v;->f:Ljava/lang/Object;

    .line 236
    .line 237
    move v1, v3

    .line 238
    goto :goto_1

    .line 239
    :cond_7
    sget v4, Lcom/blankj/utilcode/util/v;->g:I

    .line 240
    .line 241
    invoke-virtual {p0, v2, v4, v3}, Lcom/blankj/utilcode/util/v;->e(Landroid/app/Activity;IZ)V

    .line 242
    .line 243
    .line 244
    goto :goto_1

    .line 245
    :cond_8
    if-eqz v1, :cond_a

    .line 246
    .line 247
    sget v0, Lcom/blankj/utilcode/util/v;->g:I

    .line 248
    .line 249
    new-instance v1, Lcom/blankj/utilcode/util/u;

    .line 250
    .line 251
    invoke-direct {v1, p0, v0}, Lcom/blankj/utilcode/util/u;-><init>(Lcom/blankj/utilcode/util/v;I)V

    .line 252
    .line 253
    .line 254
    iput-object v1, p0, Lcom/blankj/utilcode/util/v;->e:Ljava/lang/Object;

    .line 255
    .line 256
    sget-object v0, Lcom/blankj/utilcode/util/b0;->g:Lcom/blankj/utilcode/util/b0;

    .line 257
    .line 258
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    sget-object v2, Lcom/blankj/utilcode/util/b0;->h:Landroid/app/Activity;

    .line 262
    .line 263
    if-eqz v2, :cond_9

    .line 264
    .line 265
    new-instance v4, Lcom/blankj/utilcode/util/z;

    .line 266
    .line 267
    const/4 v5, 0x0

    .line 268
    invoke-direct {v4, v0, v2, v1, v5}, Lcom/blankj/utilcode/util/z;-><init>(Lcom/blankj/utilcode/util/b0;Landroid/app/Activity;Lcom/blankj/utilcode/util/u;I)V

    .line 269
    .line 270
    .line 271
    invoke-static {v4}, Lcom/blankj/utilcode/util/c0;->g(Ljava/lang/Runnable;)V

    .line 272
    .line 273
    .line 274
    :cond_9
    new-instance v0, Lb0/a;

    .line 275
    .line 276
    const/4 v1, 0x5

    .line 277
    invoke-direct {v0, p0, v1}, Lb0/a;-><init>(Ljava/lang/Object;I)V

    .line 278
    .line 279
    .line 280
    const-wide/16 v1, 0x7d0

    .line 281
    .line 282
    sget-object v4, Lcom/blankj/utilcode/util/p;->a:Landroid/os/Handler;

    .line 283
    .line 284
    invoke-virtual {v4, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 285
    .line 286
    .line 287
    sget v0, Lcom/blankj/utilcode/util/v;->g:I

    .line 288
    .line 289
    add-int/2addr v0, v3

    .line 290
    sput v0, Lcom/blankj/utilcode/util/v;->g:I

    .line 291
    .line 292
    goto :goto_2

    .line 293
    :cond_a
    new-instance v0, Lcom/blankj/utilcode/util/w;

    .line 294
    .line 295
    iget-object v1, p0, Lcom/blankj/utilcode/util/t;->b:Lcom/blankj/utilcode/util/x;

    .line 296
    .line 297
    invoke-direct {v0, v1}, Lcom/blankj/utilcode/util/w;-><init>(Lcom/blankj/utilcode/util/x;)V

    .line 298
    .line 299
    .line 300
    iget-object v1, p0, Lcom/blankj/utilcode/util/t;->a:Landroid/widget/Toast;

    .line 301
    .line 302
    iput-object v1, v0, Lcom/blankj/utilcode/util/t;->a:Landroid/widget/Toast;

    .line 303
    .line 304
    invoke-virtual {v0}, Lcom/blankj/utilcode/util/w;->d()V

    .line 305
    .line 306
    .line 307
    iput-object v0, p0, Lcom/blankj/utilcode/util/v;->f:Ljava/lang/Object;

    .line 308
    .line 309
    :goto_2
    return-void

    .line 310
    nop

    .line 311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e(Landroid/app/Activity;IZ)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Landroid/view/ViewGroup;

    .line 12
    .line 13
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 14
    .line 15
    const/4 v1, -0x2

    .line 16
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lcom/blankj/utilcode/util/t;->a:Landroid/widget/Toast;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/widget/Toast;->getGravity()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 26
    .line 27
    iget-object v1, p0, Lcom/blankj/utilcode/util/t;->a:Landroid/widget/Toast;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/widget/Toast;->getYOffset()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const-string v3, "navigation_bar_height"

    .line 38
    .line 39
    const-string v4, "dimen"

    .line 40
    .line 41
    const-string v5, "android"

    .line 42
    .line 43
    invoke-virtual {v2, v3, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const/4 v2, 0x0

    .line 55
    :goto_0
    add-int/2addr v1, v2

    .line 56
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 57
    .line 58
    iget-object v1, p0, Lcom/blankj/utilcode/util/t;->a:Landroid/widget/Toast;

    .line 59
    .line 60
    invoke-virtual {v1}, Landroid/widget/Toast;->getYOffset()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    const-string/jumbo v3, "status_bar_height"

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v3, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    add-int/2addr v2, v1

    .line 80
    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 81
    .line 82
    iget-object v1, p0, Lcom/blankj/utilcode/util/t;->a:Landroid/widget/Toast;

    .line 83
    .line 84
    invoke-virtual {v1}, Landroid/widget/Toast;->getXOffset()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 89
    .line 90
    invoke-virtual {p0, p2}, Lcom/blankj/utilcode/util/t;->b(I)Landroid/widget/ImageView;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    if-eqz p3, :cond_1

    .line 95
    .line 96
    const/4 p3, 0x0

    .line 97
    invoke-virtual {p2, p3}, Landroid/view/View;->setAlpha(F)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    const/high16 v1, 0x3f800000    # 1.0f

    .line 105
    .line 106
    invoke-virtual {p3, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    const-wide/16 v1, 0xc8

    .line 111
    .line 112
    invoke-virtual {p3, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    invoke-virtual {p3}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 117
    .line 118
    .line 119
    :cond_1
    invoke-virtual {p1, p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 120
    .line 121
    .line 122
    :cond_2
    return-void
.end method
