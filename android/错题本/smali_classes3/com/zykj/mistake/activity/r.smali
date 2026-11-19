.class public final synthetic Lcom/zykj/mistake/activity/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La8/e;
.implements Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/base/BaseMVPActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/base/BaseMVPActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/activity/r;->a:Lcom/zykj/mistake/base/BaseMVPActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityResult(Ljava/lang/Object;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/activity/r;->a:Lcom/zykj/mistake/base/BaseMVPActivity;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lcom/zykj/mistake/activity/SketchActivity;

    .line 5
    .line 6
    check-cast p1, Landroidx/activity/result/ActivityResult;

    .line 7
    .line 8
    sget v0, Lcom/zykj/mistake/activity/SketchActivity;->v:I

    .line 9
    .line 10
    const-string v0, "result"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->getResultCode()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, -0x1

    .line 20
    if-ne v0, v2, :cond_5

    .line 21
    .line 22
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->getData()Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object p1, v2

    .line 35
    :goto_0
    if-eqz p1, :cond_5

    .line 36
    .line 37
    :try_start_0
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 46
    .line 47
    .line 48
    move-result-object p1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 49
    :try_start_1
    new-instance v0, Ljava/io/File;

    .line 50
    .line 51
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 60
    .line 61
    .line 62
    move-result-wide v4

    .line 63
    new-instance v6, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v4, ".jpg"

    .line 72
    .line 73
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-direct {v0, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-static {p1, v3}, Lcom/blankj/utilcode/util/c;->t(Ljava/io/InputStream;Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    if-eqz p1, :cond_1

    .line 95
    .line 96
    :try_start_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 97
    .line 98
    .line 99
    :cond_1
    :goto_1
    move-object v5, v3

    .line 100
    goto :goto_5

    .line 101
    :catch_0
    move-exception v0

    .line 102
    move-object p1, v0

    .line 103
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :catchall_0
    move-exception v0

    .line 108
    move-object v2, p1

    .line 109
    :goto_2
    move-object p1, v0

    .line 110
    goto :goto_6

    .line 111
    :catch_1
    move-exception v0

    .line 112
    goto :goto_3

    .line 113
    :catchall_1
    move-exception v0

    .line 114
    goto :goto_2

    .line 115
    :catch_2
    move-exception v0

    .line 116
    move-object p1, v2

    .line 117
    :goto_3
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 118
    .line 119
    .line 120
    if-eqz p1, :cond_2

    .line 121
    .line 122
    :try_start_4
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 123
    .line 124
    .line 125
    goto :goto_4

    .line 126
    :catch_3
    move-exception v0

    .line 127
    move-object p1, v0

    .line 128
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 129
    .line 130
    .line 131
    :cond_2
    :goto_4
    move-object v5, v2

    .line 132
    :goto_5
    if-eqz v5, :cond_5

    .line 133
    .line 134
    iget-object v3, v1, Lcom/zykj/mistake/activity/SketchActivity;->j:Lcom/zykj/view/board/board/BoardFragment;

    .line 135
    .line 136
    if-eqz v3, :cond_3

    .line 137
    .line 138
    new-instance v8, Lcom/zykj/mistake/activity/m;

    .line 139
    .line 140
    const/4 p1, 0x3

    .line 141
    invoke-direct {v8, v5, p1}, Lcom/zykj/mistake/activity/m;-><init>(Ljava/lang/Object;I)V

    .line 142
    .line 143
    .line 144
    const/4 v9, 0x5

    .line 145
    const/4 v10, 0x0

    .line 146
    const/4 v4, 0x0

    .line 147
    const/4 v6, 0x0

    .line 148
    const/4 v7, 0x1

    .line 149
    invoke-static/range {v3 .. v10}, Lcom/zykj/view/board/board/BoardFragment;->addBitmap$default(Lcom/zykj/view/board/board/BoardFragment;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZLr6/c;ILjava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    goto :goto_8

    .line 153
    :cond_3
    const-string p1, "mSketchFragment"

    .line 154
    .line 155
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw v2

    .line 159
    :goto_6
    if-eqz v2, :cond_4

    .line 160
    .line 161
    :try_start_5
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 162
    .line 163
    .line 164
    goto :goto_7

    .line 165
    :catch_4
    move-exception v0

    .line 166
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 167
    .line 168
    .line 169
    :cond_4
    :goto_7
    throw p1

    .line 170
    :cond_5
    :goto_8
    return-void
.end method

.method public onRefresh()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/activity/r;->a:Lcom/zykj/mistake/base/BaseMVPActivity;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 4
    .line 5
    sget v1, Lcom/zykj/mistake/activity/MistakeListActivity;->x:I

    .line 6
    .line 7
    iget-object v1, v0, Lcom/zykj/mistake/activity/MistakeListActivity;->n:Lcom/zykj/mistake/entity/req/MistakeListReq;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/entity/req/MistakeListReq;->setSkipCount(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v0, v1, v2}, Lcom/zykj/mistake/presenter/MistakeListPresenter;->d(Lcom/zykj/mistake/entity/req/MistakeListReq;Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
