.class public final Lcom/zykj/gallery/utils/Coil3ImageCacheUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/zykj/gallery/utils/Coil3ImageCacheUtil;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/gallery/utils/Coil3ImageCacheUtil;

    invoke-direct {v0}, Lcom/zykj/gallery/utils/Coil3ImageCacheUtil;-><init>()V

    sput-object v0, Lcom/zykj/gallery/utils/Coil3ImageCacheUtil;->a:Lcom/zykj/gallery/utils/Coil3ImageCacheUtil;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/Object;)Ljava/io/File;
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "data"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lcoil3/l;->a(Landroid/content/Context;)Lcoil3/e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ly/e$a;

    .line 16
    .line 17
    invoke-direct {v1, p1}, Ly/e$a;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p2}, Ly/e$a;->c(Ljava/lang/Object;)Ly/e$a;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ly/e$a;->a()Ly/e;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ly/e;->i()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/4 p2, 0x0

    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    return-object p2

    .line 36
    :cond_0
    invoke-interface {v0}, Lcoil3/e;->a()Lcoil3/disk/a;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-interface {v0, p1}, Lcoil3/disk/a;->b(Ljava/lang/String;)Lcoil3/disk/a$c;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    :try_start_0
    invoke-interface {p1}, Lcoil3/disk/a$c;->getData()Lokio/Path;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Lokio/Path;->toFile()Ljava/io/File;

    .line 53
    .line 54
    .line 55
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    invoke-static {p1, p2}, Lkotlin/jdk7/AutoCloseableKt;->closeFinally(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :catchall_0
    move-exception p2

    .line 61
    :try_start_1
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 62
    :catchall_1
    move-exception v0

    .line 63
    invoke-static {p1, p2}, Lkotlin/jdk7/AutoCloseableKt;->closeFinally(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    throw v0

    .line 67
    :cond_1
    return-object p2
.end method

.method public final b(Landroid/content/Context;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Lcom/zykj/gallery/utils/Coil3ImageCacheUtil$getOrDownloadImageFile$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/zykj/gallery/utils/Coil3ImageCacheUtil$getOrDownloadImageFile$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/gallery/utils/Coil3ImageCacheUtil$getOrDownloadImageFile$1;->g:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/gallery/utils/Coil3ImageCacheUtil$getOrDownloadImageFile$1;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/gallery/utils/Coil3ImageCacheUtil$getOrDownloadImageFile$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/zykj/gallery/utils/Coil3ImageCacheUtil$getOrDownloadImageFile$1;-><init>(Lcom/zykj/gallery/utils/Coil3ImageCacheUtil;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/zykj/gallery/utils/Coil3ImageCacheUtil$getOrDownloadImageFile$1;->e:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/gallery/utils/Coil3ImageCacheUtil$getOrDownloadImageFile$1;->g:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lcom/zykj/gallery/utils/Coil3ImageCacheUtil$getOrDownloadImageFile$1;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Ly/e;

    .line 41
    .line 42
    iget-object p1, v0, Lcom/zykj/gallery/utils/Coil3ImageCacheUtil$getOrDownloadImageFile$1;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lcoil3/e;

    .line 45
    .line 46
    iget-object p2, v0, Lcom/zykj/gallery/utils/Coil3ImageCacheUtil$getOrDownloadImageFile$1;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p2, Landroid/content/Context;

    .line 49
    .line 50
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Lcoil3/l;->a(Landroid/content/Context;)Lcoil3/e;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    invoke-virtual {p0, p1, p2}, Lcom/zykj/gallery/utils/Coil3ImageCacheUtil;->a(Landroid/content/Context;Ljava/lang/Object;)Ljava/io/File;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    if-eqz v2, :cond_3

    .line 74
    .line 75
    return-object v2

    .line 76
    :cond_3
    new-instance v2, Ly/e$a;

    .line 77
    .line 78
    invoke-direct {v2, p1}, Ly/e$a;-><init>(Landroid/content/Context;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, p2}, Ly/e$a;->c(Ljava/lang/Object;)Ly/e$a;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v2}, Ly/e$a;->a()Ly/e;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iput-object p1, v0, Lcom/zykj/gallery/utils/Coil3ImageCacheUtil$getOrDownloadImageFile$1;->a:Ljava/lang/Object;

    .line 94
    .line 95
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iput-object p1, v0, Lcom/zykj/gallery/utils/Coil3ImageCacheUtil$getOrDownloadImageFile$1;->b:Ljava/lang/Object;

    .line 100
    .line 101
    iput-object p3, v0, Lcom/zykj/gallery/utils/Coil3ImageCacheUtil$getOrDownloadImageFile$1;->c:Ljava/lang/Object;

    .line 102
    .line 103
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iput-object p1, v0, Lcom/zykj/gallery/utils/Coil3ImageCacheUtil$getOrDownloadImageFile$1;->d:Ljava/lang/Object;

    .line 108
    .line 109
    iput v3, v0, Lcom/zykj/gallery/utils/Coil3ImageCacheUtil$getOrDownloadImageFile$1;->g:I

    .line 110
    .line 111
    invoke-interface {p3, v2, v0}, Lcoil3/e;->c(Ly/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-ne p1, v1, :cond_4

    .line 116
    .line 117
    return-object v1

    .line 118
    :cond_4
    move-object v4, p3

    .line 119
    move-object p3, p1

    .line 120
    move-object p1, v4

    .line 121
    :goto_1
    check-cast p3, Ly/j;

    .line 122
    .line 123
    instance-of p2, p3, Ly/q;

    .line 124
    .line 125
    const/4 v0, 0x0

    .line 126
    if-eqz p2, :cond_6

    .line 127
    .line 128
    check-cast p3, Ly/q;

    .line 129
    .line 130
    invoke-virtual {p3}, Ly/q;->c()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    if-nez p2, :cond_5

    .line 135
    .line 136
    return-object v0

    .line 137
    :cond_5
    invoke-interface {p1}, Lcoil3/e;->a()Lcoil3/disk/a;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    if-eqz p1, :cond_6

    .line 142
    .line 143
    invoke-interface {p1, p2}, Lcoil3/disk/a;->b(Ljava/lang/String;)Lcoil3/disk/a$c;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    if-eqz p1, :cond_6

    .line 148
    .line 149
    :try_start_0
    invoke-interface {p1}, Lcoil3/disk/a$c;->getData()Lokio/Path;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    invoke-virtual {p2}, Lokio/Path;->toFile()Ljava/io/File;

    .line 154
    .line 155
    .line 156
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    invoke-static {p1, v0}, Lkotlin/jdk7/AutoCloseableKt;->closeFinally(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    return-object p2

    .line 161
    :catchall_0
    move-exception p2

    .line 162
    :try_start_1
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 163
    :catchall_1
    move-exception p3

    .line 164
    invoke-static {p1, p2}, Lkotlin/jdk7/AutoCloseableKt;->closeFinally(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    throw p3

    .line 168
    :cond_6
    return-object v0
.end method

.method public final c(Landroid/content/Context;Ljava/util/List;)V
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "urls"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lcoil3/l;->a(Landroid/content/Context;)Lcoil3/e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lcoil3/e;->a()Lcoil3/disk/a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    new-instance v2, Ly/e$a;

    .line 39
    .line 40
    invoke-direct {v2, p1}, Ly/e$a;-><init>(Landroid/content/Context;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v1}, Ly/e$a;->c(Ljava/lang/Object;)Ly/e$a;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Ly/e$a;->a()Ly/e;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Ly/e;->i()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    invoke-interface {v0, v1}, Lcoil3/disk/a;->remove(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    :goto_1
    return-void
.end method
