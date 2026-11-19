.class public final Lcom/zykj/download/work/DownloadFileWorkProxy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/download/work/DownloadFileWorkProxy$a;,
        Lcom/zykj/download/work/DownloadFileWorkProxy$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \'2\u00020\u0001:\u0001(B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J%\u0010\u0013\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0014J#\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ%\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00152\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001f\u0010 J#\u0010#\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010%R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010&\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006)"
    }
    d2 = {
        "Lcom/zykj/download/work/DownloadFileWorkProxy;",
        "",
        "Landroid/content/Context;",
        "context",
        "Lcom/zykj/download/data/AppDatabase;",
        "appDataBase",
        "Lcom/zykj/download/work/DownloadFileWork;",
        "downloadFileWork",
        "<init>",
        "(Landroid/content/Context;Lcom/zykj/download/data/AppDatabase;Lcom/zykj/download/work/DownloadFileWork;)V",
        "Ljava/io/File;",
        "file",
        "",
        "verifyCode",
        "",
        "checkFileIntegrity",
        "(Ljava/io/File;Ljava/lang/String;)Z",
        "url",
        "currentLocalFile",
        "checkDownloadSuccess",
        "(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lw5/b;",
        "checkRecord",
        "entity",
        "",
        "totalLength",
        "",
        "updateTotalSize",
        "(Lw5/b;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "downloadSize",
        "updateDownloadSize",
        "updateVerifyCode",
        "(Lw5/b;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/zykj/download/DownloadFlag;",
        "downloadSuccess",
        "updateFlag",
        "(Lw5/b;Lcom/zykj/download/DownloadFlag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/zykj/download/data/AppDatabase;",
        "Lcom/zykj/download/work/DownloadFileWork;",
        "Companion",
        "a",
        "download_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/download/work/DownloadFileWorkProxy$a;

.field private static DELAY_TIME:J


# instance fields
.field private final appDataBase:Lcom/zykj/download/data/AppDatabase;

.field private final downloadFileWork:Lcom/zykj/download/work/DownloadFileWork;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/download/work/DownloadFileWorkProxy$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/download/work/DownloadFileWorkProxy$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/download/work/DownloadFileWorkProxy;->Companion:Lcom/zykj/download/work/DownloadFileWorkProxy$a;

    .line 8
    .line 9
    const-wide/16 v0, 0x3e8

    .line 10
    .line 11
    sput-wide v0, Lcom/zykj/download/work/DownloadFileWorkProxy;->DELAY_TIME:J

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/zykj/download/data/AppDatabase;Lcom/zykj/download/work/DownloadFileWork;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "appDataBase"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lcom/zykj/download/work/DownloadFileWorkProxy;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    .line 15
    .line 16
    iput-object p3, p0, Lcom/zykj/download/work/DownloadFileWorkProxy;->downloadFileWork:Lcom/zykj/download/work/DownloadFileWork;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic access$getDELAY_TIME$cp()J
    .locals 2

    .line 1
    sget-wide v0, Lcom/zykj/download/work/DownloadFileWorkProxy;->DELAY_TIME:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic access$setDELAY_TIME$cp(J)V
    .locals 0

    .line 1
    sput-wide p0, Lcom/zykj/download/work/DownloadFileWorkProxy;->DELAY_TIME:J

    .line 2
    .line 3
    return-void
.end method

.method private final checkFileIntegrity(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lcom/alibaba/sdk/android/oss/common/utils/BinaryUtil;->calculateBase64Md5(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method


# virtual methods
.method public final checkDownloadSuccess(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object p3, p0, Lcom/zykj/download/work/DownloadFileWorkProxy;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    .line 2
    .line 3
    invoke-virtual {p3}, Lcom/zykj/download/data/AppDatabase;->i()Lw5/c;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    const-string v0, "currentLocalFile.absolutePath"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p3, p1, p2}, Lw5/c;->b(Ljava/lang/String;Ljava/lang/String;)Lw5/b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p2, Ljava/io/File;

    .line 24
    .line 25
    invoke-virtual {p1}, Lw5/b;->g()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    invoke-direct {p2, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lw5/b;->e()Lcom/zykj/download/DownloadFlag;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    sget-object v0, Lcom/zykj/download/DownloadFlag;->DOWNLOAD_SUCCESS:Lcom/zykj/download/DownloadFlag;

    .line 37
    .line 38
    if-ne p3, v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-eqz p3, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1}, Lw5/b;->i()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    invoke-direct {p0, p2, p3}, Lcom/zykj/download/work/DownloadFileWorkProxy;->checkFileIntegrity(Ljava/io/File;Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    invoke-virtual {p1}, Lw5/b;->g()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1

    .line 61
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 62
    return-object p1
.end method

.method public final checkRecord(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lw5/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    instance-of v2, v0, Lcom/zykj/download/work/DownloadFileWorkProxy$checkRecord$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lcom/zykj/download/work/DownloadFileWorkProxy$checkRecord$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/download/work/DownloadFileWorkProxy$checkRecord$1;->d:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/zykj/download/work/DownloadFileWorkProxy$checkRecord$1;->d:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/download/work/DownloadFileWorkProxy$checkRecord$1;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Lcom/zykj/download/work/DownloadFileWorkProxy$checkRecord$1;-><init>(Lcom/zykj/download/work/DownloadFileWorkProxy;Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Lcom/zykj/download/work/DownloadFileWorkProxy$checkRecord$1;->b:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/zykj/download/work/DownloadFileWorkProxy$checkRecord$1;->d:I

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x1

    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    if-eq v4, v6, :cond_1

    .line 42
    .line 43
    if-ne v4, v5, :cond_2

    .line 44
    .line 45
    :cond_1
    iget-object v2, v2, Lcom/zykj/download/work/DownloadFileWorkProxy$checkRecord$1;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, Lw5/b;

    .line 48
    .line 49
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-object v2

    .line 53
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, v1, Lcom/zykj/download/work/DownloadFileWorkProxy;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/zykj/download/data/AppDatabase;->i()Lw5/c;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    const-string v7, "file.absolutePath"

    .line 75
    .line 76
    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    move-object/from16 v10, p1

    .line 80
    .line 81
    invoke-interface {v0, v10, v4}, Lw5/c;->b(Ljava/lang/String;Ljava/lang/String;)Lw5/b;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    if-nez v8, :cond_4

    .line 86
    .line 87
    new-instance v8, Lw5/b;

    .line 88
    .line 89
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    invoke-static {v11, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const/16 v16, 0x0

    .line 97
    .line 98
    sget-object v17, Lcom/zykj/download/DownloadFlag;->DOWNLOADING:Lcom/zykj/download/DownloadFlag;

    .line 99
    .line 100
    const/4 v9, 0x0

    .line 101
    const-wide/16 v12, 0x0

    .line 102
    .line 103
    const-wide/16 v14, 0x0

    .line 104
    .line 105
    invoke-direct/range {v8 .. v17}, Lw5/b;-><init>(ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lcom/zykj/download/DownloadFlag;)V

    .line 106
    .line 107
    .line 108
    iget-object v0, v1, Lcom/zykj/download/work/DownloadFileWorkProxy;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    .line 109
    .line 110
    invoke-virtual {v0}, Lcom/zykj/download/data/AppDatabase;->i()Lw5/c;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-interface {v0, v8}, Lw5/c;->c(Lw5/b;)J

    .line 115
    .line 116
    .line 117
    move-result-wide v2

    .line 118
    long-to-int v10, v2

    .line 119
    const/16 v19, 0x7e

    .line 120
    .line 121
    const/16 v20, 0x0

    .line 122
    .line 123
    const/4 v11, 0x0

    .line 124
    const/4 v12, 0x0

    .line 125
    const-wide/16 v13, 0x0

    .line 126
    .line 127
    const-wide/16 v15, 0x0

    .line 128
    .line 129
    const/16 v17, 0x0

    .line 130
    .line 131
    const/16 v18, 0x0

    .line 132
    .line 133
    move-object v9, v8

    .line 134
    invoke-static/range {v9 .. v20}, Lw5/b;->b(Lw5/b;ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lcom/zykj/download/DownloadFlag;ILjava/lang/Object;)Lw5/b;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    return-object v0

    .line 139
    :cond_4
    new-instance v0, Ljava/io/File;

    .line 140
    .line 141
    invoke-virtual {v8}, Lw5/b;->g()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v8}, Lw5/b;->e()Lcom/zykj/download/DownloadFlag;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    sget-object v7, Lcom/zykj/download/work/DownloadFileWorkProxy$b;->a:[I

    .line 153
    .line 154
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    aget v4, v7, v4

    .line 159
    .line 160
    if-eq v4, v6, :cond_a

    .line 161
    .line 162
    if-ne v4, v5, :cond_9

    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-eqz v4, :cond_8

    .line 169
    .line 170
    invoke-virtual {v8}, Lw5/b;->h()J

    .line 171
    .line 172
    .line 173
    move-result-wide v9

    .line 174
    const-wide/16 v11, 0x0

    .line 175
    .line 176
    cmp-long v4, v9, v11

    .line 177
    .line 178
    if-nez v4, :cond_6

    .line 179
    .line 180
    iget-object v0, v1, Lcom/zykj/download/work/DownloadFileWorkProxy;->downloadFileWork:Lcom/zykj/download/work/DownloadFileWork;

    .line 181
    .line 182
    if-nez v0, :cond_5

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_5
    const/4 v4, 0x0

    .line 186
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    iput-object v8, v2, Lcom/zykj/download/work/DownloadFileWorkProxy$checkRecord$1;->a:Ljava/lang/Object;

    .line 191
    .line 192
    iput v6, v2, Lcom/zykj/download/work/DownloadFileWorkProxy$checkRecord$1;->d:I

    .line 193
    .line 194
    invoke-virtual {v0, v11, v12, v4, v2}, Lcom/zykj/download/work/DownloadFileWork;->notifyProgress(JLjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    if-ne v0, v3, :cond_b

    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_6
    iget-object v4, v1, Lcom/zykj/download/work/DownloadFileWorkProxy;->downloadFileWork:Lcom/zykj/download/work/DownloadFileWork;

    .line 202
    .line 203
    if-nez v4, :cond_7

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_7
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 207
    .line 208
    .line 209
    move-result-wide v6

    .line 210
    const/16 v0, 0x64

    .line 211
    .line 212
    int-to-long v9, v0

    .line 213
    mul-long/2addr v6, v9

    .line 214
    invoke-virtual {v8}, Lw5/b;->h()J

    .line 215
    .line 216
    .line 217
    move-result-wide v9

    .line 218
    div-long/2addr v6, v9

    .line 219
    long-to-int v0, v6

    .line 220
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    iput-object v8, v2, Lcom/zykj/download/work/DownloadFileWorkProxy$checkRecord$1;->a:Ljava/lang/Object;

    .line 225
    .line 226
    iput v5, v2, Lcom/zykj/download/work/DownloadFileWorkProxy$checkRecord$1;->d:I

    .line 227
    .line 228
    invoke-virtual {v4, v11, v12, v0, v2}, Lcom/zykj/download/work/DownloadFileWork;->notifyProgress(JLjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    if-ne v0, v3, :cond_b

    .line 233
    .line 234
    :goto_1
    return-object v3

    .line 235
    :cond_8
    const/16 v18, 0x67

    .line 236
    .line 237
    const/16 v19, 0x0

    .line 238
    .line 239
    const/4 v9, 0x0

    .line 240
    const/4 v10, 0x0

    .line 241
    const/4 v11, 0x0

    .line 242
    const-wide/16 v12, 0x0

    .line 243
    .line 244
    const-wide/16 v14, 0x0

    .line 245
    .line 246
    const/16 v16, 0x0

    .line 247
    .line 248
    const/16 v17, 0x0

    .line 249
    .line 250
    invoke-static/range {v8 .. v19}, Lw5/b;->b(Lw5/b;ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lcom/zykj/download/DownloadFlag;ILjava/lang/Object;)Lw5/b;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    iget-object v2, v1, Lcom/zykj/download/work/DownloadFileWorkProxy;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    .line 255
    .line 256
    invoke-virtual {v2}, Lcom/zykj/download/data/AppDatabase;->i()Lw5/c;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-interface {v2, v0}, Lw5/c;->c(Lw5/b;)J

    .line 261
    .line 262
    .line 263
    return-object v0

    .line 264
    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 265
    .line 266
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 267
    .line 268
    .line 269
    throw v0

    .line 270
    :cond_a
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    if-eqz v2, :cond_c

    .line 275
    .line 276
    invoke-virtual {v8}, Lw5/b;->i()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    invoke-direct {v1, v0, v2}, Lcom/zykj/download/work/DownloadFileWorkProxy;->checkFileIntegrity(Ljava/io/File;Ljava/lang/String;)Z

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    if-eqz v2, :cond_c

    .line 285
    .line 286
    :cond_b
    :goto_2
    return-object v8

    .line 287
    :cond_c
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 288
    .line 289
    .line 290
    goto :goto_3

    .line 291
    :catch_0
    move-exception v0

    .line 292
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 293
    .line 294
    .line 295
    :goto_3
    sget-object v17, Lcom/zykj/download/DownloadFlag;->DOWNLOADING:Lcom/zykj/download/DownloadFlag;

    .line 296
    .line 297
    const/16 v18, 0x27

    .line 298
    .line 299
    const/16 v19, 0x0

    .line 300
    .line 301
    const/4 v9, 0x0

    .line 302
    const/4 v10, 0x0

    .line 303
    const/4 v11, 0x0

    .line 304
    const-wide/16 v12, 0x0

    .line 305
    .line 306
    const-wide/16 v14, 0x0

    .line 307
    .line 308
    const/16 v16, 0x0

    .line 309
    .line 310
    invoke-static/range {v8 .. v19}, Lw5/b;->b(Lw5/b;ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lcom/zykj/download/DownloadFlag;ILjava/lang/Object;)Lw5/b;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    iget-object v2, v1, Lcom/zykj/download/work/DownloadFileWorkProxy;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    .line 315
    .line 316
    invoke-virtual {v2}, Lcom/zykj/download/data/AppDatabase;->i()Lw5/c;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    invoke-interface {v2, v0}, Lw5/c;->c(Lw5/b;)J

    .line 321
    .line 322
    .line 323
    return-object v0
.end method

.method public final updateDownloadSize(Lw5/b;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw5/b;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2, p3}, Lw5/b;->j(J)V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lcom/zykj/download/work/DownloadFileWorkProxy;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    .line 5
    .line 6
    invoke-virtual {p2}, Lcom/zykj/download/data/AppDatabase;->i()Lw5/c;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-interface {p2, p1}, Lw5/c;->a(Lw5/b;)V

    .line 11
    .line 12
    .line 13
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p1
.end method

.method public final updateFlag(Lw5/b;Lcom/zykj/download/DownloadFlag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw5/b;",
            "Lcom/zykj/download/DownloadFlag;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lw5/b;->k(Lcom/zykj/download/DownloadFlag;)V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lcom/zykj/download/work/DownloadFileWorkProxy;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    .line 5
    .line 6
    invoke-virtual {p2}, Lcom/zykj/download/data/AppDatabase;->i()Lw5/c;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-interface {p2, p1}, Lw5/c;->a(Lw5/b;)V

    .line 11
    .line 12
    .line 13
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p1
.end method

.method public final updateTotalSize(Lw5/b;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw5/b;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2, p3}, Lw5/b;->l(J)V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lcom/zykj/download/work/DownloadFileWorkProxy;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    .line 5
    .line 6
    invoke-virtual {p2}, Lcom/zykj/download/data/AppDatabase;->i()Lw5/c;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-interface {p2, p1}, Lw5/c;->a(Lw5/b;)V

    .line 11
    .line 12
    .line 13
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p1
.end method

.method public final updateVerifyCode(Lw5/b;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw5/b;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lw5/b;->m(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lcom/zykj/download/work/DownloadFileWorkProxy;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    .line 5
    .line 6
    invoke-virtual {p2}, Lcom/zykj/download/data/AppDatabase;->i()Lw5/c;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-interface {p2, p1}, Lw5/c;->a(Lw5/b;)V

    .line 11
    .line 12
    .line 13
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p1
.end method
