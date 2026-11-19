.class public final Lcom/zykj/download/work/DownloadFileCommonWork$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/download/work/DownloadFileCommonWork;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lcom/zykj/download/work/DownloadFileCommonWork$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/work/a;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "fileUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileDir"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    new-array v1, v0, [Lo2/k;

    const-string v2, "file_url"

    .line 1
    invoke-static {v2, p1}, Lo2/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Lo2/k;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "file_dir"

    .line 2
    invoke-static {p1, p2}, Lo2/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Lo2/k;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    const-string p1, "file_name"

    .line 3
    invoke-static {p1, p3}, Lo2/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Lo2/k;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    .line 4
    new-instance p1, Landroidx/work/a$a;

    invoke-direct {p1}, Landroidx/work/a$a;-><init>()V

    :goto_0
    if-ge v2, v0, :cond_0

    .line 5
    aget-object p2, v1, v2

    .line 6
    invoke-virtual {p2}, Lo2/k;->c()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p2}, Lo2/k;->d()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Landroidx/work/a$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/a$a;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p1}, Landroidx/work/a$a;->a()Landroidx/work/a;

    move-result-object p1

    const-string p2, "dataBuilder.build()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    new-instance p2, Landroidx/work/a;

    invoke-direct {p2, p1}, Landroidx/work/a;-><init>(Landroidx/work/a;)V

    return-object p2
.end method
