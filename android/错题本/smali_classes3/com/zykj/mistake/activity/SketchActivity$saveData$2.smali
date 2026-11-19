.class final Lcom/zykj/mistake/activity/SketchActivity$saveData$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "it",
        "Ld6/s;",
        "<anonymous>",
        "(Ljava/lang/String;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.activity.SketchActivity$saveData$2"
    f = "SketchActivity.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $dataPath:Ljava/lang/String;

.field final synthetic $saveSuccess:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation
.end field

.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/activity/SketchActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/activity/SketchActivity;Lr6/a;Ljava/lang/String;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/activity/SketchActivity;",
            "Lr6/a;",
            "Ljava/lang/String;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/activity/SketchActivity$saveData$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/activity/SketchActivity$saveData$2;->this$0:Lcom/zykj/mistake/activity/SketchActivity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/activity/SketchActivity$saveData$2;->$saveSuccess:Lr6/a;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/activity/SketchActivity$saveData$2;->$dataPath:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/mistake/activity/SketchActivity$saveData$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/activity/SketchActivity$saveData$2;->this$0:Lcom/zykj/mistake/activity/SketchActivity;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/activity/SketchActivity$saveData$2;->$saveSuccess:Lr6/a;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/activity/SketchActivity$saveData$2;->$dataPath:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, Lcom/zykj/mistake/activity/SketchActivity$saveData$2;-><init>(Lcom/zykj/mistake/activity/SketchActivity;Lr6/a;Ljava/lang/String;Lh6/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lcom/zykj/mistake/activity/SketchActivity$saveData$2;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/activity/SketchActivity$saveData$2;->invoke(Ljava/lang/String;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/activity/SketchActivity$saveData$2;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/activity/SketchActivity$saveData$2;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/activity/SketchActivity$saveData$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/activity/SketchActivity$saveData$2;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/mistake/activity/SketchActivity$saveData$2;->label:I

    .line 8
    .line 9
    if-nez v1, :cond_7

    .line 10
    .line 11
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    iget-object v1, p0, Lcom/zykj/mistake/activity/SketchActivity$saveData$2;->this$0:Lcom/zykj/mistake/activity/SketchActivity;

    .line 20
    .line 21
    iget-object v1, v1, Lcom/zykj/mistake/activity/SketchActivity;->j:Lcom/zykj/view/board/board/BoardFragment;

    .line 22
    .line 23
    if-eqz v1, :cond_6

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/zykj/view/board/board/BoardFragment;->getPathListByImageGraph()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    new-instance v2, Ljava/io/File;

    .line 30
    .line 31
    const-string v3, "res/image"

    .line 32
    .line 33
    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    new-instance v3, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    array-length v4, v2

    .line 48
    const/4 v5, 0x0

    .line 49
    move v6, v5

    .line 50
    :goto_0
    if-ge v6, v4, :cond_2

    .line 51
    .line 52
    aget-object v7, v2, v6

    .line 53
    .line 54
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    invoke-interface {v1, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    if-nez v8, :cond_1

    .line 63
    .line 64
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    :goto_1
    if-ge v5, v1, :cond_3

    .line 75
    .line 76
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    add-int/lit8 v5, v5, 0x1

    .line 81
    .line 82
    check-cast v2, Ljava/io/File;

    .line 83
    .line 84
    invoke-static {v2}, Lcom/blankj/utilcode/util/e;->e(Ljava/io/File;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    iget-object v1, p0, Lcom/zykj/mistake/activity/SketchActivity$saveData$2;->$saveSuccess:Lr6/a;

    .line 89
    .line 90
    invoke-interface {v1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    iget-object v1, p0, Lcom/zykj/mistake/activity/SketchActivity$saveData$2;->$dataPath:Ljava/lang/String;

    .line 94
    .line 95
    invoke-static {v0}, Lcom/blankj/utilcode/util/e;->g(Ljava/lang/String;)Ljava/io/File;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v1}, Lcom/blankj/utilcode/util/e;->g(Ljava/lang/String;)Ljava/io/File;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    if-nez v0, :cond_4

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_5

    .line 111
    .line 112
    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/e;->a(Ljava/io/File;Ljava/io/File;)Z

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_5
    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/e;->b(Ljava/io/File;Ljava/io/File;)Z

    .line 117
    .line 118
    .line 119
    :goto_2
    iget-object v0, p0, Lcom/zykj/mistake/activity/SketchActivity$saveData$2;->this$0:Lcom/zykj/mistake/activity/SketchActivity;

    .line 120
    .line 121
    iget-object v1, p0, Lcom/zykj/mistake/activity/SketchActivity$saveData$2;->$dataPath:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    new-instance v2, Landroid/content/Intent;

    .line 127
    .line 128
    const-class v3, Lcom/zykj/mistake/service/UploadFolderIntentService;

    .line 129
    .line 130
    invoke-direct {v2, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 131
    .line 132
    .line 133
    const-string v3, "UPLOAD_PATH"

    .line 134
    .line 135
    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 136
    .line 137
    .line 138
    new-instance v1, Landroid/os/Messenger;

    .line 139
    .line 140
    new-instance v3, Lcom/blankj/utilcode/util/h;

    .line 141
    .line 142
    const/4 v4, 0x3

    .line 143
    invoke-direct {v3, v0, v4}, Lcom/blankj/utilcode/util/h;-><init>(Landroid/content/ComponentCallbacks;I)V

    .line 144
    .line 145
    .line 146
    invoke-direct {v1, v3}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    .line 147
    .line 148
    .line 149
    const-string v3, "UPLOAD_MESSENGER"

    .line 150
    .line 151
    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 155
    .line 156
    .line 157
    return-object p1

    .line 158
    :cond_6
    const-string p1, "mSketchFragment"

    .line 159
    .line 160
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    const/4 p1, 0x0

    .line 164
    throw p1

    .line 165
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 166
    .line 167
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 168
    .line 169
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw p1
.end method
