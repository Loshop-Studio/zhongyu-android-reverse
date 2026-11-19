.class public final Lcom/zykj/huiwei/launcher/dao/PDFPreviewDatabase$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/huiwei/launcher/dao/PDFPreviewDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/dao/PDFPreviewDatabase$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Lcom/zykj/huiwei/launcher/dao/PDFPreviewDatabase;
    .locals 2

    .line 1
    const-class v0, Lcom/zykj/huiwei/launcher/dao/PDFPreviewDatabase;

    .line 2
    .line 3
    const-string v1, "preview.db"

    .line 4
    .line 5
    invoke-static {p1, v0, v1}, Landroidx/room/Room;->databaseBuilder(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/RoomDatabase$Builder;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroidx/room/RoomDatabase$Builder;->build()Landroidx/room/RoomDatabase;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lcom/zykj/huiwei/launcher/dao/PDFPreviewDatabase;

    .line 14
    .line 15
    return-object p1
.end method

.method public final b(Landroid/content/Context;)Lcom/zykj/huiwei/launcher/dao/PDFPreviewDatabase;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/zykj/huiwei/launcher/dao/PDFPreviewDatabase;->g()Lcom/zykj/huiwei/launcher/dao/PDFPreviewDatabase;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    monitor-enter p0

    .line 13
    :try_start_0
    invoke-static {}, Lcom/zykj/huiwei/launcher/dao/PDFPreviewDatabase;->g()Lcom/zykj/huiwei/launcher/dao/PDFPreviewDatabase;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    sget-object v0, Lcom/zykj/huiwei/launcher/dao/PDFPreviewDatabase;->a:Lcom/zykj/huiwei/launcher/dao/PDFPreviewDatabase$a;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lcom/zykj/huiwei/launcher/dao/PDFPreviewDatabase$a;->a(Landroid/content/Context;)Lcom/zykj/huiwei/launcher/dao/PDFPreviewDatabase;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/dao/PDFPreviewDatabase;->h(Lcom/zykj/huiwei/launcher/dao/PDFPreviewDatabase;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :goto_0
    monitor-exit p0

    .line 32
    return-object v0

    .line 33
    :goto_1
    monitor-exit p0

    .line 34
    throw p1

    .line 35
    :cond_1
    return-object v0
.end method
