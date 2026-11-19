.class final Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/canhub/cropper/BitmapLoadingWorkerJob;->i()V
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
    c = "com.canhub.cropper.BitmapLoadingWorkerJob$start$1"
    f = "BitmapLoadingWorkerJob.kt"
    l = {
        0x34,
        0x42
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/canhub/cropper/BitmapLoadingWorkerJob;


# direct methods
.method public constructor <init>(Lcom/canhub/cropper/BitmapLoadingWorkerJob;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->e:Lcom/canhub/cropper/BitmapLoadingWorkerJob;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->e:Lcom/canhub/cropper/BitmapLoadingWorkerJob;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;-><init>(Lcom/canhub/cropper/BitmapLoadingWorkerJob;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    iget v0, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    if-eq v0, v3, :cond_1

    .line 12
    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto/16 :goto_2

    .line 19
    .line 20
    :cond_0
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
    :cond_1
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    goto/16 :goto_2

    .line 32
    .line 33
    :catch_0
    move-exception v0

    .line 34
    move-object p1, v0

    .line 35
    move-object v10, p1

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lsd/i0;

    .line 43
    .line 44
    :try_start_1
    invoke-static {p1}, Lkotlinx/coroutines/d;->f(Lsd/i0;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    sget-object v0, Lcom/canhub/cropper/a;->a:Lcom/canhub/cropper/a;

    .line 51
    .line 52
    iget-object v4, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->e:Lcom/canhub/cropper/BitmapLoadingWorkerJob;

    .line 53
    .line 54
    invoke-static {v4}, Lcom/canhub/cropper/BitmapLoadingWorkerJob;->a(Lcom/canhub/cropper/BitmapLoadingWorkerJob;)Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    iget-object v5, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->e:Lcom/canhub/cropper/BitmapLoadingWorkerJob;

    .line 59
    .line 60
    invoke-virtual {v5}, Lcom/canhub/cropper/BitmapLoadingWorkerJob;->g()Landroid/net/Uri;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    iget-object v6, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->e:Lcom/canhub/cropper/BitmapLoadingWorkerJob;

    .line 65
    .line 66
    invoke-static {v6}, Lcom/canhub/cropper/BitmapLoadingWorkerJob;->d(Lcom/canhub/cropper/BitmapLoadingWorkerJob;)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    iget-object v7, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->e:Lcom/canhub/cropper/BitmapLoadingWorkerJob;

    .line 71
    .line 72
    invoke-static {v7}, Lcom/canhub/cropper/BitmapLoadingWorkerJob;->c(Lcom/canhub/cropper/BitmapLoadingWorkerJob;)I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    invoke-virtual {v0, v4, v5, v6, v7}, Lcom/canhub/cropper/a;->l(Landroid/content/Context;Landroid/net/Uri;II)Lcom/canhub/cropper/a$a;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-static {p1}, Lkotlinx/coroutines/d;->f(Lsd/i0;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_3

    .line 85
    .line 86
    invoke-virtual {v4}, Lcom/canhub/cropper/a$a;->a()Landroid/graphics/Bitmap;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iget-object v5, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->e:Lcom/canhub/cropper/BitmapLoadingWorkerJob;

    .line 91
    .line 92
    invoke-static {v5}, Lcom/canhub/cropper/BitmapLoadingWorkerJob;->a(Lcom/canhub/cropper/BitmapLoadingWorkerJob;)Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    iget-object v6, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->e:Lcom/canhub/cropper/BitmapLoadingWorkerJob;

    .line 97
    .line 98
    invoke-virtual {v6}, Lcom/canhub/cropper/BitmapLoadingWorkerJob;->g()Landroid/net/Uri;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-virtual {v0, p1, v5, v6}, Lcom/canhub/cropper/a;->E(Landroid/graphics/Bitmap;Landroid/content/Context;Landroid/net/Uri;)Lcom/canhub/cropper/a$b;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iget-object v0, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->e:Lcom/canhub/cropper/BitmapLoadingWorkerJob;

    .line 107
    .line 108
    new-instance v5, Lcom/canhub/cropper/BitmapLoadingWorkerJob$a;

    .line 109
    .line 110
    invoke-virtual {v0}, Lcom/canhub/cropper/BitmapLoadingWorkerJob;->g()Landroid/net/Uri;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-virtual {p1}, Lcom/canhub/cropper/a$b;->a()Landroid/graphics/Bitmap;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    invoke-virtual {v4}, Lcom/canhub/cropper/a$a;->b()I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    invoke-virtual {p1}, Lcom/canhub/cropper/a$b;->b()I

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    invoke-virtual {p1}, Lcom/canhub/cropper/a$b;->c()Z

    .line 127
    .line 128
    .line 129
    move-result v10

    .line 130
    invoke-virtual {p1}, Lcom/canhub/cropper/a$b;->d()Z

    .line 131
    .line 132
    .line 133
    move-result v11

    .line 134
    const/4 v12, 0x0

    .line 135
    invoke-direct/range {v5 .. v12}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$a;-><init>(Landroid/net/Uri;Landroid/graphics/Bitmap;IIZZLjava/lang/Exception;)V

    .line 136
    .line 137
    .line 138
    iput v3, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->c:I

    .line 139
    .line 140
    invoke-static {v0, v5, p0}, Lcom/canhub/cropper/BitmapLoadingWorkerJob;->e(Lcom/canhub/cropper/BitmapLoadingWorkerJob;Lcom/canhub/cropper/BitmapLoadingWorkerJob$a;Lvc/c;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 144
    if-ne p1, v1, :cond_3

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :goto_0
    iget-object p1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->e:Lcom/canhub/cropper/BitmapLoadingWorkerJob;

    .line 148
    .line 149
    new-instance v3, Lcom/canhub/cropper/BitmapLoadingWorkerJob$a;

    .line 150
    .line 151
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob;->g()Landroid/net/Uri;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    const/4 v8, 0x0

    .line 156
    const/4 v9, 0x0

    .line 157
    const/4 v5, 0x0

    .line 158
    const/4 v6, 0x0

    .line 159
    const/4 v7, 0x0

    .line 160
    invoke-direct/range {v3 .. v10}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$a;-><init>(Landroid/net/Uri;Landroid/graphics/Bitmap;IIZZLjava/lang/Exception;)V

    .line 161
    .line 162
    .line 163
    iput v2, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->c:I

    .line 164
    .line 165
    invoke-static {p1, v3, p0}, Lcom/canhub/cropper/BitmapLoadingWorkerJob;->e(Lcom/canhub/cropper/BitmapLoadingWorkerJob;Lcom/canhub/cropper/BitmapLoadingWorkerJob$a;Lvc/c;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    if-ne p1, v1, :cond_3

    .line 170
    .line 171
    :goto_1
    return-object v1

    .line 172
    :cond_3
    :goto_2
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 173
    .line 174
    return-object p1
.end method
