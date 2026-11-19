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


# static fields
.field public static final Companion:Lcom/zykj/download/work/DownloadFileWorkProxy$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static DELAY_TIME:J


# instance fields
.field private final appDataBase:Lcom/zykj/download/data/AppDatabase;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final downloadFileWork:Lcom/zykj/download/work/DownloadFileWork;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/download/work/DownloadFileWorkProxy$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/download/work/DownloadFileWorkProxy$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/zykj/download/work/DownloadFileWorkProxy;->Companion:Lcom/zykj/download/work/DownloadFileWorkProxy$a;

    const-wide/16 v0, 0x3e8

    sput-wide v0, Lcom/zykj/download/work/DownloadFileWorkProxy;->DELAY_TIME:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/zykj/download/data/AppDatabase;Lcom/zykj/download/work/DownloadFileWork;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/download/data/AppDatabase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/download/work/DownloadFileWork;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "appDataBase"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/zykj/download/work/DownloadFileWorkProxy;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    .line 3
    iput-object p3, p0, Lcom/zykj/download/work/DownloadFileWorkProxy;->downloadFileWork:Lcom/zykj/download/work/DownloadFileWork;

    return-void
.end method

.method public static final synthetic access$getDELAY_TIME$cp()J
    .locals 2

    sget-wide v0, Lcom/zykj/download/work/DownloadFileWorkProxy;->DELAY_TIME:J

    return-wide v0
.end method

.method public static final synthetic access$setDELAY_TIME$cp(J)V
    .locals 0

    sput-wide p0, Lcom/zykj/download/work/DownloadFileWorkProxy;->DELAY_TIME:J

    return-void
.end method

.method private final checkFileIntegrity(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/alibaba/sdk/android/oss/common/utils/BinaryUtil;->calculateBase64Md5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public final checkDownloadSuccess(Ljava/lang/String;Ljava/io/File;Lq2/d;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Lq2/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object p3, p0, Lcom/zykj/download/work/DownloadFileWorkProxy;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    invoke-virtual {p3}, Lcom/zykj/download/data/AppDatabase;->E()Lv1/c;

    move-result-object p3

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    const-string v0, "currentLocalFile.absolutePath"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3, p1, p2}, Lv1/c;->c(Ljava/lang/String;Ljava/lang/String;)Lv1/b;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance p2, Ljava/io/File;

    invoke-virtual {p1}, Lv1/b;->g()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Lv1/b;->e()Lcom/zykj/download/DownloadFlag;

    move-result-object p3

    sget-object v0, Lcom/zykj/download/DownloadFlag;->DOWNLOAD_SUCCESS:Lcom/zykj/download/DownloadFlag;

    if-ne p3, v0, :cond_1

    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result p3

    if-eqz p3, :cond_1

    .line 4
    invoke-virtual {p1}, Lv1/b;->i()Ljava/lang/String;

    move-result-object p3

    .line 5
    invoke-direct {p0, p2, p3}, Lcom/zykj/download/work/DownloadFileWorkProxy;->checkFileIntegrity(Ljava/io/File;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 6
    invoke-virtual {p1}, Lv1/b;->g()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final checkRecord(Ljava/lang/String;Ljava/io/File;Lq2/d;)Ljava/lang/Object;
    .locals 21
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Lq2/d<",
            "-",
            "Lv1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    instance-of v2, v0, Lcom/zykj/download/work/DownloadFileWorkProxy$c;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/zykj/download/work/DownloadFileWorkProxy$c;

    iget v3, v2, Lcom/zykj/download/work/DownloadFileWorkProxy$c;->d:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/zykj/download/work/DownloadFileWorkProxy$c;->d:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/zykj/download/work/DownloadFileWorkProxy$c;

    invoke-direct {v2, v1, v0}, Lcom/zykj/download/work/DownloadFileWorkProxy$c;-><init>(Lcom/zykj/download/work/DownloadFileWorkProxy;Lq2/d;)V

    :goto_0
    iget-object v0, v2, Lcom/zykj/download/work/DownloadFileWorkProxy$c;->b:Ljava/lang/Object;

    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object v3

    .line 1
    iget v4, v2, Lcom/zykj/download/work/DownloadFileWorkProxy$c;->d:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    goto :goto_1

    .line 2
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3
    :cond_2
    :goto_1
    iget-object v2, v2, Lcom/zykj/download/work/DownloadFileWorkProxy$c;->a:Ljava/lang/Object;

    check-cast v2, Lv1/b;

    invoke-static {v0}, Lo2/m;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    invoke-static {v0}, Lo2/m;->b(Ljava/lang/Object;)V

    .line 4
    iget-object v0, v1, Lcom/zykj/download/work/DownloadFileWorkProxy;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    invoke-virtual {v0}, Lcom/zykj/download/data/AppDatabase;->E()Lv1/c;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    const-string v7, "file.absolutePath"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p1

    invoke-interface {v0, v10, v4}, Lv1/c;->c(Ljava/lang/String;Ljava/lang/String;)Lv1/b;

    move-result-object v8

    if-nez v8, :cond_4

    .line 5
    new-instance v0, Lv1/b;

    const/4 v9, 0x0

    .line 6
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v7}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    .line 7
    sget-object v17, Lcom/zykj/download/DownloadFlag;->DOWNLOADING:Lcom/zykj/download/DownloadFlag;

    move-object v8, v0

    move-object/from16 v10, p1

    .line 8
    invoke-direct/range {v8 .. v17}, Lv1/b;-><init>(ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lcom/zykj/download/DownloadFlag;)V

    .line 9
    iget-object v2, v1, Lcom/zykj/download/work/DownloadFileWorkProxy;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    invoke-virtual {v2}, Lcom/zykj/download/data/AppDatabase;->E()Lv1/c;

    move-result-object v2

    invoke-interface {v2, v0}, Lv1/c;->b(Lv1/b;)J

    move-result-wide v2

    long-to-int v10, v2

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x7e

    const/16 v20, 0x0

    move-object v9, v0

    .line 10
    invoke-static/range {v9 .. v20}, Lv1/b;->b(Lv1/b;ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lcom/zykj/download/DownloadFlag;ILjava/lang/Object;)Lv1/b;

    move-result-object v0

    return-object v0

    .line 11
    :cond_4
    new-instance v0, Ljava/io/File;

    invoke-virtual {v8}, Lv1/b;->g()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v8}, Lv1/b;->e()Lcom/zykj/download/DownloadFlag;

    move-result-object v4

    sget-object v7, Lcom/zykj/download/work/DownloadFileWorkProxy$b;->a:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v7, v4

    if-eq v4, v6, :cond_b

    if-ne v4, v5, :cond_a

    .line 13
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_9

    .line 14
    invoke-virtual {v8}, Lv1/b;->h()J

    move-result-wide v9

    const-wide/16 v11, 0x0

    cmp-long v4, v9, v11

    if-nez v4, :cond_7

    .line 15
    iget-object v0, v1, Lcom/zykj/download/work/DownloadFileWorkProxy;->downloadFileWork:Lcom/zykj/download/work/DownloadFileWork;

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    const/4 v4, 0x0

    .line 16
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v4

    .line 17
    iput-object v8, v2, Lcom/zykj/download/work/DownloadFileWorkProxy$c;->a:Ljava/lang/Object;

    iput v6, v2, Lcom/zykj/download/work/DownloadFileWorkProxy$c;->d:I

    invoke-virtual {v0, v11, v12, v4, v2}, Lcom/zykj/download/work/DownloadFileWork;->notifyProgress(JLjava/lang/Integer;Lq2/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_6

    return-object v3

    :cond_6
    move-object v2, v8

    :goto_2
    move-object v8, v2

    goto :goto_3

    .line 18
    :cond_7
    iget-object v4, v1, Lcom/zykj/download/work/DownloadFileWorkProxy;->downloadFileWork:Lcom/zykj/download/work/DownloadFileWork;

    if-nez v4, :cond_8

    goto :goto_3

    .line 19
    :cond_8
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v6

    const/16 v0, 0x64

    int-to-long v9, v0

    mul-long v6, v6, v9

    invoke-virtual {v8}, Lv1/b;->h()J

    move-result-wide v9

    div-long/2addr v6, v9

    long-to-int v0, v6

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v0

    .line 20
    iput-object v8, v2, Lcom/zykj/download/work/DownloadFileWorkProxy$c;->a:Ljava/lang/Object;

    iput v5, v2, Lcom/zykj/download/work/DownloadFileWorkProxy$c;->d:I

    invoke-virtual {v4, v11, v12, v0, v2}, Lcom/zykj/download/work/DownloadFileWork;->notifyProgress(JLjava/lang/Integer;Lq2/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_6

    return-object v3

    :goto_3
    return-object v8

    :cond_9
    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x67

    const/16 v19, 0x0

    .line 21
    invoke-static/range {v8 .. v19}, Lv1/b;->b(Lv1/b;ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lcom/zykj/download/DownloadFlag;ILjava/lang/Object;)Lv1/b;

    move-result-object v0

    .line 22
    iget-object v2, v1, Lcom/zykj/download/work/DownloadFileWorkProxy;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    invoke-virtual {v2}, Lcom/zykj/download/data/AppDatabase;->E()Lv1/c;

    move-result-object v2

    invoke-interface {v2, v0}, Lv1/c;->b(Lv1/b;)J

    return-object v0

    .line 23
    :cond_a
    new-instance v0, Lo2/j;

    invoke-direct {v0}, Lo2/j;-><init>()V

    throw v0

    .line 24
    :cond_b
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual {v8}, Lv1/b;->i()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/zykj/download/work/DownloadFileWorkProxy;->checkFileIntegrity(Ljava/io/File;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_c

    return-object v8

    .line 25
    :cond_c
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    move-object v2, v0

    .line 26
    invoke-virtual {v2}, Ljava/io/FileNotFoundException;->printStackTrace()V

    .line 27
    :goto_4
    sget-object v17, Lcom/zykj/download/DownloadFlag;->DOWNLOADING:Lcom/zykj/download/DownloadFlag;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x27

    const/16 v19, 0x0

    .line 28
    invoke-static/range {v8 .. v19}, Lv1/b;->b(Lv1/b;ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lcom/zykj/download/DownloadFlag;ILjava/lang/Object;)Lv1/b;

    move-result-object v0

    .line 29
    iget-object v2, v1, Lcom/zykj/download/work/DownloadFileWorkProxy;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    invoke-virtual {v2}, Lcom/zykj/download/data/AppDatabase;->E()Lv1/c;

    move-result-object v2

    invoke-interface {v2, v0}, Lv1/c;->b(Lv1/b;)J

    return-object v0
.end method

.method public final updateDownloadSize(Lv1/b;JLq2/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lv1/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv1/b;",
            "J",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p1, p2, p3}, Lv1/b;->j(J)V

    .line 2
    iget-object p2, p0, Lcom/zykj/download/work/DownloadFileWorkProxy;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    invoke-virtual {p2}, Lcom/zykj/download/data/AppDatabase;->E()Lv1/c;

    move-result-object p2

    invoke-interface {p2, p1}, Lv1/c;->a(Lv1/b;)V

    .line 3
    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method

.method public final updateFlag(Lv1/b;Lcom/zykj/download/DownloadFlag;Lq2/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lv1/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/download/DownloadFlag;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv1/b;",
            "Lcom/zykj/download/DownloadFlag;",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lv1/b;->k(Lcom/zykj/download/DownloadFlag;)V

    .line 2
    iget-object p2, p0, Lcom/zykj/download/work/DownloadFileWorkProxy;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    invoke-virtual {p2}, Lcom/zykj/download/data/AppDatabase;->E()Lv1/c;

    move-result-object p2

    invoke-interface {p2, p1}, Lv1/c;->a(Lv1/b;)V

    .line 3
    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method

.method public final updateTotalSize(Lv1/b;JLq2/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lv1/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv1/b;",
            "J",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p1, p2, p3}, Lv1/b;->l(J)V

    .line 2
    iget-object p2, p0, Lcom/zykj/download/work/DownloadFileWorkProxy;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    invoke-virtual {p2}, Lcom/zykj/download/data/AppDatabase;->E()Lv1/c;

    move-result-object p2

    invoke-interface {p2, p1}, Lv1/c;->a(Lv1/b;)V

    .line 3
    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method

.method public final updateVerifyCode(Lv1/b;Ljava/lang/String;Lq2/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lv1/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv1/b;",
            "Ljava/lang/String;",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lv1/b;->m(Ljava/lang/String;)V

    .line 2
    iget-object p2, p0, Lcom/zykj/download/work/DownloadFileWorkProxy;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    invoke-virtual {p2}, Lcom/zykj/download/data/AppDatabase;->E()Lv1/c;

    move-result-object p2

    invoke-interface {p2, p1}, Lv1/c;->a(Lv1/b;)V

    .line 3
    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method
