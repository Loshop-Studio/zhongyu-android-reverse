.class final Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.activity.SketchActivity$cropImage$1"
    f = "SketchActivity.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $bitmap:Landroid/graphics/Bitmap;

.field final synthetic $callback:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/activity/SketchActivity;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Lr6/c;Lcom/zykj/mistake/activity/SketchActivity;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lr6/c;",
            "Lcom/zykj/mistake/activity/SketchActivity;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;->$bitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;->$callback:Lr6/c;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;->this$0:Lcom/zykj/mistake/activity/SketchActivity;

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
    .locals 3
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
    new-instance p1, Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;->$bitmap:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;->$callback:Lr6/c;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;->this$0:Lcom/zykj/mistake/activity/SketchActivity;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;-><init>(Landroid/graphics/Bitmap;Lr6/c;Lcom/zykj/mistake/activity/SketchActivity;Lh6/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;->$bitmap:Landroid/graphics/Bitmap;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;->$callback:Lr6/c;

    .line 18
    .line 19
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    new-instance p1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 24
    .line 25
    invoke-direct {p1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v2, Ljava/io/File;

    .line 29
    .line 30
    iget-object v3, p0, Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;->this$0:Lcom/zykj/mistake/activity/SketchActivity;

    .line 31
    .line 32
    invoke-virtual {v3}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-static {v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 44
    .line 45
    .line 46
    move-result-wide v4

    .line 47
    new-instance v6, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v3, "/"

    .line 56
    .line 57
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v3, ".jpg"

    .line 64
    .line 65
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget-object v3, p0, Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;->$bitmap:Landroid/graphics/Bitmap;

    .line 76
    .line 77
    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 78
    .line 79
    invoke-static {v3, v2}, Lcom/blankj/utilcode/util/c;->n(Landroid/graphics/Bitmap;Ljava/io/File;)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_1

    .line 84
    .line 85
    invoke-static {v2}, Lcom/blankj/utilcode/util/c;->c(Ljava/io/File;)Landroid/net/Uri;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    iput-object v2, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 90
    .line 91
    :cond_1
    iget-object v2, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 92
    .line 93
    if-nez v2, :cond_3

    .line 94
    .line 95
    iget-object p1, p0, Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;->$callback:Lr6/c;

    .line 96
    .line 97
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    iget-object p1, p0, Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;->this$0:Lcom/zykj/mistake/activity/SketchActivity;

    .line 101
    .line 102
    sget v0, Lcom/zykj/mistake/R$string;->tips_data_insert_err:I

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const-string v2, "getString(...)"

    .line 109
    .line 110
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    sget-object v2, Lcom/zykj/mistake/utils/d;->e:Landroid/widget/Toast;

    .line 114
    .line 115
    if-nez v2, :cond_2

    .line 116
    .line 117
    const/4 v2, 0x0

    .line 118
    invoke-static {p1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    const/16 v0, 0x51

    .line 123
    .line 124
    const/16 v3, 0xdc

    .line 125
    .line 126
    invoke-virtual {p1, v0, v2, v3}, Landroid/widget/Toast;->setGravity(III)V

    .line 127
    .line 128
    .line 129
    sput-object p1, Lcom/zykj/mistake/utils/d;->e:Landroid/widget/Toast;

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_2
    invoke-virtual {v2, v0}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 133
    .line 134
    .line 135
    :goto_0
    sget-object p1, Lcom/zykj/mistake/utils/d;->e:Landroid/widget/Toast;

    .line 136
    .line 137
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 141
    .line 142
    .line 143
    return-object v1

    .line 144
    :cond_3
    iget-object v0, p0, Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;->this$0:Lcom/zykj/mistake/activity/SketchActivity;

    .line 145
    .line 146
    iget-object v0, v0, Lcom/zykj/mistake/activity/SketchActivity;->r:Lcom/zykj/view/utils/ImagePicker;

    .line 147
    .line 148
    check-cast v2, Landroid/net/Uri;

    .line 149
    .line 150
    iget-object v3, p0, Lcom/zykj/mistake/activity/SketchActivity$cropImage$1;->$callback:Lr6/c;

    .line 151
    .line 152
    new-instance v4, Landroidx/navigation/d;

    .line 153
    .line 154
    const/4 v5, 0x3

    .line 155
    invoke-direct {v4, v5, p1, v3}, Landroidx/navigation/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v2, v4}, Lcom/zykj/view/utils/ImagePicker;->startCrop(Landroid/net/Uri;Lr6/c;)V

    .line 159
    .line 160
    .line 161
    return-object v1

    .line 162
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 163
    .line 164
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 165
    .line 166
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw p1
.end method
