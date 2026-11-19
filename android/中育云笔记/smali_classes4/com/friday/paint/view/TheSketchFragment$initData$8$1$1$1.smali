.class final Lcom/friday/paint/view/TheSketchFragment$initData$8$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/TheSketchFragment$initData$8$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.paint.view.TheSketchFragment$initData$8$1$1$1"
    f = "TheSketchFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/friday/paint/view/TheSketchFragment;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/friday/paint/view/TheSketchFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/TheSketchFragment$initData$8$1$1$1;->d:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/view/TheSketchFragment$initData$8$1$1$1;->e:Lcom/friday/paint/view/TheSketchFragment;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/paint/view/TheSketchFragment$initData$8$1$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/TheSketchFragment$initData$8$1$1$1;->d:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/paint/view/TheSketchFragment$initData$8$1$1$1;->e:Lcom/friday/paint/view/TheSketchFragment;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/paint/view/TheSketchFragment$initData$8$1$1$1;-><init>(Ljava/lang/String;Lcom/friday/paint/view/TheSketchFragment;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/TheSketchFragment$initData$8$1$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/TheSketchFragment$initData$8$1$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/TheSketchFragment$initData$8$1$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/TheSketchFragment$initData$8$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/paint/view/TheSketchFragment$initData$8$1$1$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/paint/view/TheSketchFragment$initData$8$1$1$1;->d:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p1, "/thumbnail.jpg"

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    sget-object v0, Landroid/os/Environment;->DIRECTORY_DOCUMENTS:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 48
    .line 49
    .line 50
    move-result-wide v2

    .line 51
    new-instance v4, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v0, "/"

    .line 60
    .line 61
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v0, ".png"

    .line 68
    .line 69
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/FileUtils;->copy(Ljava/lang/String;Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_0

    .line 81
    .line 82
    move-object p1, v0

    .line 83
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/friday/paint/view/TheSketchFragment$initData$8$1$1$1;->e:Lcom/friday/paint/view/TheSketchFragment;

    .line 84
    .line 85
    invoke-static {v0}, Lcom/friday/paint/view/TheSketchFragment;->J(Lcom/friday/paint/view/TheSketchFragment;)Landroidx/activity/result/ActivityResultLauncher;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    new-instance v2, Landroid/content/Intent;

    .line 90
    .line 91
    const-string v3, "com.zykj.dialogue.ask"

    .line 92
    .line 93
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const-string v3, "android.intent.category.DEFAULT"

    .line 97
    .line 98
    invoke-virtual {v2, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 99
    .line 100
    .line 101
    const-string v3, "http://www.zykj.dialogue.ask/"

    .line 102
    .line 103
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    const-string v4, "share/file"

    .line 108
    .line 109
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 110
    .line 111
    .line 112
    const-string v3, "localFileName"

    .line 113
    .line 114
    invoke-virtual {v2, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 115
    .line 116
    .line 117
    const-string p1, "fromOtherApp"

    .line 118
    .line 119
    const/4 v3, 0x1

    .line 120
    invoke-virtual {v2, p1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v2}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :catch_0
    const-string p1, "\u672a\u68c0\u6d4b\u5230\u968f\u8eab\u7b54\u5e94\u7528\uff0c\u65e0\u6cd5\u63d0\u95ee"

    .line 128
    .line 129
    new-array v0, v1, [Ljava/lang/Object;

    .line 130
    .line 131
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_1
    const-string p1, "\u622a\u56fe\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5"

    .line 136
    .line 137
    new-array v0, v1, [Ljava/lang/Object;

    .line 138
    .line 139
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 143
    .line 144
    return-object p1

    .line 145
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 146
    .line 147
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 148
    .line 149
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw p1
.end method
