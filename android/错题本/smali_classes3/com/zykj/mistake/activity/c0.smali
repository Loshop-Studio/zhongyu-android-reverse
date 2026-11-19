.class public final synthetic Lcom/zykj/mistake/activity/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/activity/SketchActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/activity/SketchActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/activity/c0;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/activity/c0;->b:Lcom/zykj/mistake/activity/SketchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lcom/zykj/mistake/activity/c0;->a:I

    .line 2
    .line 3
    const-string v1, "it"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    sget-object v4, Ld6/s;->a:Ld6/s;

    .line 8
    .line 9
    iget-object v5, p0, Lcom/zykj/mistake/activity/c0;->b:Lcom/zykj/mistake/activity/SketchActivity;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Lr6/a;

    .line 15
    .line 16
    sget v0, Lcom/zykj/mistake/activity/SketchActivity;->v:I

    .line 17
    .line 18
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :try_start_0
    iget-object p1, v5, Lcom/zykj/mistake/activity/SketchActivity;->u:Landroidx/activity/result/ActivityResultLauncher;

    .line 22
    .line 23
    new-instance v0, Landroid/content/Intent;

    .line 24
    .line 25
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v1, "com.zykj.manage"

    .line 29
    .line 30
    const-string v2, "com.zykj.gallery.ui.share.ShareActivity"

    .line 31
    .line 32
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    move-object p1, v0

    .line 45
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-eqz p1, :cond_0

    .line 58
    .line 59
    sget p1, Lcom/zykj/mistake/R$string;->open_gallery_failure:I

    .line 60
    .line 61
    invoke-static {v5, p1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const/16 v0, 0x51

    .line 66
    .line 67
    const/16 v1, 0xdc

    .line 68
    .line 69
    invoke-virtual {p1, v0, v3, v1}, Landroid/widget/Toast;->setGravity(III)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 73
    .line 74
    .line 75
    :cond_0
    return-object v4

    .line 76
    :pswitch_0
    check-cast p1, Lr6/a;

    .line 77
    .line 78
    sget v0, Lcom/zykj/mistake/activity/SketchActivity;->v:I

    .line 79
    .line 80
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    iget-boolean v0, v5, Lcom/zykj/mistake/activity/SketchActivity;->s:Z

    .line 84
    .line 85
    if-eqz v0, :cond_1

    .line 86
    .line 87
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    iget-object p1, v5, Lcom/zykj/mistake/activity/SketchActivity;->t:Ll4/d;

    .line 92
    .line 93
    if-eqz p1, :cond_2

    .line 94
    .line 95
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 96
    .line 97
    .line 98
    :cond_2
    :goto_1
    return-object v4

    .line 99
    :pswitch_1
    check-cast p1, Landroid/view/View;

    .line 100
    .line 101
    sget v0, Lcom/zykj/mistake/activity/SketchActivity;->v:I

    .line 102
    .line 103
    const-string v0, "view"

    .line 104
    .line 105
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 109
    .line 110
    .line 111
    iget-object v0, v5, Lcom/zykj/mistake/activity/SketchActivity;->p:Ljava/lang/String;

    .line 112
    .line 113
    if-eqz v0, :cond_3

    .line 114
    .line 115
    new-instance v1, Lcom/zykj/mistake/activity/b0;

    .line 116
    .line 117
    invoke-direct {v1, p1, v3}, Lcom/zykj/mistake/activity/b0;-><init>(Landroid/view/KeyEvent$Callback;I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v5, v0, v1}, Lcom/zykj/mistake/activity/SketchActivity;->w(Ljava/lang/String;Lr6/a;)V

    .line 121
    .line 122
    .line 123
    return-object v4

    .line 124
    :cond_3
    const-string p1, "mUploadDataPath"

    .line 125
    .line 126
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw v2

    .line 130
    :pswitch_2
    move-object v7, p1

    .line 131
    check-cast v7, Ljava/lang/String;

    .line 132
    .line 133
    if-nez v7, :cond_4

    .line 134
    .line 135
    sget p1, Lcom/zykj/mistake/activity/SketchActivity;->v:I

    .line 136
    .line 137
    const-string p1, "SketchActivity"

    .line 138
    .line 139
    const-string v0, "\u9898\u5e72\u52a0\u8f7d\u5931\u8d25"

    .line 140
    .line 141
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_4
    iget-object v5, v5, Lcom/zykj/mistake/activity/SketchActivity;->j:Lcom/zykj/view/board/board/BoardFragment;

    .line 146
    .line 147
    if-eqz v5, :cond_5

    .line 148
    .line 149
    const/16 v11, 0x15

    .line 150
    .line 151
    const/4 v12, 0x0

    .line 152
    const/4 v6, 0x0

    .line 153
    const/4 v8, 0x0

    .line 154
    const/4 v9, 0x1

    .line 155
    const/4 v10, 0x0

    .line 156
    invoke-static/range {v5 .. v12}, Lcom/zykj/view/board/board/BoardFragment;->addBitmap$default(Lcom/zykj/view/board/board/BoardFragment;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZLr6/c;ILjava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :goto_2
    return-object v4

    .line 160
    :cond_5
    const-string p1, "mSketchFragment"

    .line 161
    .line 162
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw v2

    .line 166
    :pswitch_3
    check-cast p1, Landroid/graphics/Bitmap;

    .line 167
    .line 168
    sget v0, Lcom/zykj/mistake/activity/SketchActivity;->v:I

    .line 169
    .line 170
    new-instance v0, Lcom/zykj/mistake/activity/c0;

    .line 171
    .line 172
    const/4 v1, 0x1

    .line 173
    invoke-direct {v0, v5, v1}, Lcom/zykj/mistake/activity/c0;-><init>(Lcom/zykj/mistake/activity/SketchActivity;I)V

    .line 174
    .line 175
    .line 176
    invoke-static {v5}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    new-instance v3, Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;

    .line 181
    .line 182
    invoke-direct {v3, p1, v0, v5, v2}, Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;-><init>(Landroid/graphics/Bitmap;Lr6/c;Lcom/zykj/mistake/activity/SketchActivity;Lh6/c;)V

    .line 183
    .line 184
    .line 185
    const/4 p1, 0x3

    .line 186
    invoke-static {v1, v2, v2, v3, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 187
    .line 188
    .line 189
    return-object v4

    .line 190
    nop

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
