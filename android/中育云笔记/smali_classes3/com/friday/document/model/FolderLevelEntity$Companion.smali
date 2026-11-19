.class public final Lcom/friday/document/model/FolderLevelEntity$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/document/model/FolderLevelEntity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/document/model/FolderLevelEntity$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final map2Me(Lcom/friday/common/entity/FileEntity;)Lcom/friday/document/model/FolderLevelEntity;
    .locals 11

    const-string v0, "fileEntity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v1, Lcom/friday/document/model/FolderLevelEntity;

    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    move-result-object v4

    const/16 v9, 0x38

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/friday/document/model/FolderLevelEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILkotlin/jvm/internal/n;)V

    return-object v1
.end method

.method public final map2Me(Lcom/friday/document/model/ShareFile;)Lcom/friday/document/model/FolderLevelEntity;
    .locals 9

    const-string v0, "shareFile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v1, Lcom/friday/document/model/FolderLevelEntity;

    .line 3
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getParentId()Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    move-result-object v3

    .line 5
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileName()Ljava/lang/String;

    move-result-object v4

    .line 6
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getOwnerName()Ljava/lang/String;

    move-result-object v5

    .line 7
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getShareTime()Ljava/lang/String;

    move-result-object v6

    .line 8
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getOwnerId()J

    move-result-wide v7

    .line 9
    invoke-direct/range {v1 .. v8}, Lcom/friday/document/model/FolderLevelEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    return-object v1
.end method
