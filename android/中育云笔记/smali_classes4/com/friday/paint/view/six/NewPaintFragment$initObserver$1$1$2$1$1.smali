.class final Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1$2$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.paint.view.six.NewPaintFragment$initObserver$1$1$2$1$1"
    f = "NewPaintFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/paint/view/six/NewPaintFragment;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1$2$1$1;->d:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1$2$1$1;->e:Ljava/lang/String;

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
    new-instance p1, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1$2$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1$2$1$1;->d:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1$2$1$1;->e:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1$2$1$1;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1$2$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1$2$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1$2$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1$2$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1$2$1$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1$2$1$1;->d:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1$2$1$1;->e:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    sget-object v0, Landroid/os/Environment;->DIRECTORY_DOCUMENTS:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    new-instance v4, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, "/"

    .line 53
    .line 54
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v0, ".png"

    .line 61
    .line 62
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/FileUtils;->copy(Ljava/lang/String;Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_0

    .line 74
    .line 75
    move-object p1, v0

    .line 76
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1$2$1$1;->d:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 77
    .line 78
    invoke-static {v0}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getAskLauncher$p(Lcom/friday/paint/view/six/NewPaintFragment;)Landroidx/activity/result/ActivityResultLauncher;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    new-instance v2, Landroid/content/Intent;

    .line 83
    .line 84
    const-string v3, "com.zykj.dialogue.ask"

    .line 85
    .line 86
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    const-string v3, "android.intent.category.DEFAULT"

    .line 90
    .line 91
    invoke-virtual {v2, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 92
    .line 93
    .line 94
    const-string v3, "http://www.zykj.dialogue.ask/"

    .line 95
    .line 96
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    const-string v4, "share/file"

    .line 101
    .line 102
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 103
    .line 104
    .line 105
    const-string v3, "localFileName"

    .line 106
    .line 107
    invoke-virtual {v2, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 108
    .line 109
    .line 110
    const-string p1, "fromOtherApp"

    .line 111
    .line 112
    const/4 v3, 0x1

    .line 113
    invoke-virtual {v2, p1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v2}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :catch_0
    const-string p1, "\u672a\u68c0\u6d4b\u5230\u968f\u8eab\u7b54\u5e94\u7528\uff0c\u65e0\u6cd5\u63d0\u95ee"

    .line 121
    .line 122
    new-array v0, v1, [Ljava/lang/Object;

    .line 123
    .line 124
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_1
    const-string p1, "\u622a\u56fe\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5"

    .line 129
    .line 130
    new-array v0, v1, [Ljava/lang/Object;

    .line 131
    .line 132
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 136
    .line 137
    return-object p1

    .line 138
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 139
    .line 140
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 141
    .line 142
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw p1
.end method
