.class public final Lcom/zykj/subscriber/dao/PDFPreviewDatabase$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/subscriber/dao/PDFPreviewDatabase;
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

    invoke-direct {p0}, Lcom/zykj/subscriber/dao/PDFPreviewDatabase$a;-><init>()V

    return-void
.end method

.method private final a(Landroid/content/Context;)Lcom/zykj/subscriber/dao/PDFPreviewDatabase;
    .locals 2

    .line 1
    const-class v0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase;

    const-string v1, "preview.db"

    invoke-static {p1, v0, v1}, Landroidx/room/g0;->a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/h0$a;

    move-result-object p1

    .line 2
    invoke-virtual {p1}, Landroidx/room/h0$a;->d()Landroidx/room/h0;

    move-result-object p1

    const-string v0, "databaseBuilder(context,\u2026\n                .build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/zykj/subscriber/dao/PDFPreviewDatabase;

    return-object p1
.end method


# virtual methods
.method public final b(Landroid/content/Context;)Lcom/zykj/subscriber/dao/PDFPreviewDatabase;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lcom/zykj/subscriber/dao/PDFPreviewDatabase;->C()Lcom/zykj/subscriber/dao/PDFPreviewDatabase;

    move-result-object v0

    if-nez v0, :cond_1

    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {}, Lcom/zykj/subscriber/dao/PDFPreviewDatabase;->C()Lcom/zykj/subscriber/dao/PDFPreviewDatabase;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase;->n:Lcom/zykj/subscriber/dao/PDFPreviewDatabase$a;

    invoke-direct {v0, p1}, Lcom/zykj/subscriber/dao/PDFPreviewDatabase$a;->a(Landroid/content/Context;)Lcom/zykj/subscriber/dao/PDFPreviewDatabase;

    move-result-object p1

    invoke-static {p1}, Lcom/zykj/subscriber/dao/PDFPreviewDatabase;->D(Lcom/zykj/subscriber/dao/PDFPreviewDatabase;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v0, p1

    .line 3
    :cond_0
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_1
    :goto_0
    return-object v0
.end method
