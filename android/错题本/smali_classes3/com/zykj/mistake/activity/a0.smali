.class public final synthetic Lcom/zykj/mistake/activity/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/activity/SketchActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/activity/SketchActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/activity/a0;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/activity/a0;->b:Lcom/zykj/mistake/activity/SketchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lcom/zykj/mistake/activity/a0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/mistake/activity/a0;->b:Lcom/zykj/mistake/activity/SketchActivity;

    .line 7
    .line 8
    iget-object v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->i:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/activity/SketchActivity;->u(Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Lcom/zykj/mistake/activity/SketchActivity;->m:Ll4/k;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 21
    .line 22
    .line 23
    :goto_0
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string v0, "mMenuPopupWindow"

    .line 27
    .line 28
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    throw v0

    .line 33
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/mistake/activity/a0;->b:Lcom/zykj/mistake/activity/SketchActivity;

    .line 34
    .line 35
    iget-object v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->h:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/activity/SketchActivity;->u(Ljava/util/List;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, v0, Lcom/zykj/mistake/activity/SketchActivity;->m:Ll4/k;

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const-string v0, "mMenuPopupWindow"

    .line 52
    .line 53
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    throw v0

    .line 58
    :pswitch_1
    iget-object v0, p0, Lcom/zykj/mistake/activity/a0;->b:Lcom/zykj/mistake/activity/SketchActivity;

    .line 59
    .line 60
    iget-object v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->m:Ll4/k;

    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    if-eqz v1, :cond_7

    .line 64
    .line 65
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Lcom/zykj/mistake/utils/d;->d(Landroid/content/Context;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_5

    .line 73
    .line 74
    iget-object v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->f:Ljava/lang/String;

    .line 75
    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    iget-object v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->n:Lcom/zykj/mistake/dialog/WebViewShotDialog;

    .line 79
    .line 80
    if-eqz v1, :cond_2

    .line 81
    .line 82
    new-instance v2, Lcom/zykj/mistake/activity/c0;

    .line 83
    .line 84
    const/4 v3, 0x0

    .line 85
    invoke-direct {v2, v0, v3}, Lcom/zykj/mistake/activity/c0;-><init>(Lcom/zykj/mistake/activity/SketchActivity;I)V

    .line 86
    .line 87
    .line 88
    iput-object v2, v1, Lcom/zykj/mistake/dialog/WebViewShotDialog;->g:Lcom/zykj/mistake/activity/c0;

    .line 89
    .line 90
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const-string v2, "getSupportFragmentManager(...)"

    .line 95
    .line 96
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    const-string v2, "WebViewShotDialog"

    .line 100
    .line 101
    invoke-virtual {v1, v0, v2}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const/4 v0, 0x0

    .line 105
    iput v0, v1, Lcom/zykj/mistake/dialog/WebViewShotDialog;->f:I

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_2
    const-string v0, "mWebViewShotDialog"

    .line 109
    .line 110
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw v2

    .line 114
    :cond_3
    iget-object v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->g:Ljava/util/ArrayList;

    .line 115
    .line 116
    if-eqz v1, :cond_6

    .line 117
    .line 118
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_4

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    iget-object v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->g:Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/activity/SketchActivity;->u(Ljava/util/List;)V

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_5
    const-string v1, "\u5f53\u524d\u65e0\u7f51\u7edc\uff0c\u8bf7\u8054\u7f51\u540e\u518d\u8bd5"

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :cond_6
    :goto_1
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 140
    .line 141
    return-object v0

    .line 142
    :cond_7
    const-string v0, "mMenuPopupWindow"

    .line 143
    .line 144
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw v2

    .line 148
    :pswitch_2
    iget-object v0, p0, Lcom/zykj/mistake/activity/a0;->b:Lcom/zykj/mistake/activity/SketchActivity;

    .line 149
    .line 150
    iget-object v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->k:Lcom/zykj/mistake/utils/h;

    .line 151
    .line 152
    const/4 v2, 0x0

    .line 153
    const-string v3, "mMicroLessonUtils"

    .line 154
    .line 155
    if-eqz v1, :cond_b

    .line 156
    .line 157
    invoke-virtual {v1}, Lcom/zykj/mistake/utils/h;->b()I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    const/4 v4, 0x5

    .line 162
    if-ne v1, v4, :cond_a

    .line 163
    .line 164
    iget-object v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->k:Lcom/zykj/mistake/utils/h;

    .line 165
    .line 166
    if-eqz v1, :cond_9

    .line 167
    .line 168
    invoke-virtual {v1}, Lcom/zykj/mistake/utils/h;->d()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    if-eqz v6, :cond_a

    .line 173
    .line 174
    iget-object v4, v0, Lcom/zykj/mistake/activity/SketchActivity;->j:Lcom/zykj/view/board/board/BoardFragment;

    .line 175
    .line 176
    if-eqz v4, :cond_8

    .line 177
    .line 178
    const/4 v8, 0x5

    .line 179
    const/4 v9, 0x0

    .line 180
    const/4 v5, 0x0

    .line 181
    const/4 v7, 0x0

    .line 182
    invoke-static/range {v4 .. v9}, Lcom/zykj/view/board/board/BoardFragment;->addFullBitmap$default(Lcom/zykj/view/board/board/BoardFragment;Landroid/graphics/Bitmap;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_8
    const-string v0, "mSketchFragment"

    .line 187
    .line 188
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw v2

    .line 192
    :cond_9
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw v2

    .line 196
    :cond_a
    :goto_2
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 197
    .line 198
    return-object v0

    .line 199
    :cond_b
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw v2

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
