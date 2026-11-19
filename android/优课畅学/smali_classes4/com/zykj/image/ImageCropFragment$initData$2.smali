.class final Lcom/zykj/image/ImageCropFragment$initData$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/image/ImageCropFragment;->initData(Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.image.ImageCropFragment$initData$2"
    f = "ImageCropFragment.kt"
    l = {
        0x34,
        0x3a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/image/ImageCropFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/image/ImageCropFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/image/ImageCropFragment$initData$2;->b:Lcom/zykj/image/ImageCropFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/image/ImageCropFragment$initData$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/image/ImageCropFragment$initData$2;->b:Lcom/zykj/image/ImageCropFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/image/ImageCropFragment$initData$2;-><init>(Lcom/zykj/image/ImageCropFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/image/ImageCropFragment$initData$2;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/image/ImageCropFragment$initData$2;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/image/ImageCropFragment$initData$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/image/ImageCropFragment$initData$2;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/image/ImageCropFragment$initData$2;->a:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_0

    .line 12
    .line 13
    if-ne v1, v2, :cond_1

    .line 14
    .line 15
    :cond_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto/16 :goto_3

    .line 19
    .line 20
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    :try_start_0
    iget-object v1, p0, Lcom/zykj/image/ImageCropFragment$initData$2;->b:Lcom/zykj/image/ImageCropFragment;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1}, Ltop/zibin/luban/b;->g(Landroid/content/Context;)Ltop/zibin/luban/b$a;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object v4, p0, Lcom/zykj/image/ImageCropFragment$initData$2;->b:Lcom/zykj/image/ImageCropFragment;

    .line 43
    .line 44
    invoke-static {v4}, Lcom/zykj/image/ImageCropFragment;->access$getArgs(Lcom/zykj/image/ImageCropFragment;)Lcom/zykj/image/ImageCropFragmentArgs;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v4}, Lcom/zykj/image/ImageCropFragmentArgs;->c()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v1, v4}, Ltop/zibin/luban/b$a;->k(Ljava/lang/String;)Ltop/zibin/luban/b$a;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const/16 v4, 0x1f4

    .line 57
    .line 58
    invoke-virtual {v1, v4}, Ltop/zibin/luban/b$a;->i(I)Ltop/zibin/luban/b$a;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Ltop/zibin/luban/b$a;->h()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget-object v4, p0, Lcom/zykj/image/ImageCropFragment$initData$2;->b:Lcom/zykj/image/ImageCropFragment;

    .line 67
    .line 68
    invoke-static {v4}, Lcom/zykj/image/ImageCropFragment;->access$getLocalFilePath$p(Lcom/zykj/image/ImageCropFragment;)Landroidx/lifecycle/MutableLiveData;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    const-string v5, "this"

    .line 73
    .line 74
    invoke-static {v1, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v1}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Ljava/io/File;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v4, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .line 89
    .line 90
    goto :goto_3

    .line 91
    :catch_0
    move-exception v1

    .line 92
    goto :goto_0

    .line 93
    :catch_1
    move-exception v1

    .line 94
    goto :goto_1

    .line 95
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, Lcom/zykj/image/ImageCropFragment$initData$2;->b:Lcom/zykj/image/ImageCropFragment;

    .line 99
    .line 100
    invoke-static {v1}, Lcom/zykj/image/ImageCropFragment;->access$getLocalFilePath$p(Lcom/zykj/image/ImageCropFragment;)Landroidx/lifecycle/MutableLiveData;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v1, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-static {}, Li8/i0;->c()Li8/h1;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    new-instance v3, Lcom/zykj/image/ImageCropFragment$initData$2$3;

    .line 112
    .line 113
    invoke-direct {v3, p1}, Lcom/zykj/image/ImageCropFragment$initData$2$3;-><init>(Lm7/c;)V

    .line 114
    .line 115
    .line 116
    iput v2, p0, Lcom/zykj/image/ImageCropFragment$initData$2;->a:I

    .line 117
    .line 118
    invoke-static {v1, v3, p0}, Li8/f;->g(Lkotlin/coroutines/d;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    if-ne p1, v0, :cond_3

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 126
    .line 127
    .line 128
    iget-object v1, p0, Lcom/zykj/image/ImageCropFragment$initData$2;->b:Lcom/zykj/image/ImageCropFragment;

    .line 129
    .line 130
    invoke-static {v1}, Lcom/zykj/image/ImageCropFragment;->access$getLocalFilePath$p(Lcom/zykj/image/ImageCropFragment;)Landroidx/lifecycle/MutableLiveData;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v1, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-static {}, Li8/i0;->c()Li8/h1;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    new-instance v2, Lcom/zykj/image/ImageCropFragment$initData$2$2;

    .line 142
    .line 143
    invoke-direct {v2, p1}, Lcom/zykj/image/ImageCropFragment$initData$2$2;-><init>(Lm7/c;)V

    .line 144
    .line 145
    .line 146
    iput v3, p0, Lcom/zykj/image/ImageCropFragment$initData$2;->a:I

    .line 147
    .line 148
    invoke-static {v1, v2, p0}, Li8/f;->g(Lkotlin/coroutines/d;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    if-ne p1, v0, :cond_3

    .line 153
    .line 154
    :goto_2
    return-object v0

    .line 155
    :cond_3
    :goto_3
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 156
    .line 157
    return-object p1
.end method
