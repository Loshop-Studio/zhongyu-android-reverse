.class public final Lcom/friday/common/dao/ResourceDao_Impl$1;
.super Landroidx/room/EntityInsertAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/dao/ResourceDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityInsertAdapter<",
        "Lcom/friday/common/entity/ResourceEntity;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/room/EntityInsertAdapter;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Landroidx/sqlite/SQLiteStatement;Lcom/friday/common/entity/ResourceEntity;)V
    .locals 4

    .line 1
    const-string v0, "statement"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "entity"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getFileId()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x3

    .line 28
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getPageIndex()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    int-to-long v0, v0

    .line 40
    const/4 v2, 0x4

    .line 41
    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x5

    .line 45
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getOssImageUrl()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-interface {p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 v0, 0x6

    .line 53
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getMd5()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x7

    .line 61
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getUserId()J

    .line 62
    .line 63
    .line 64
    move-result-wide v1

    .line 65
    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getResourceType()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    int-to-long v0, v0

    .line 73
    const/16 v2, 0x8

    .line 74
    .line 75
    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getToBeUploaded()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    const/16 v1, 0x9

    .line 83
    .line 84
    int-to-long v2, v0

    .line 85
    invoke-interface {p1, v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getWasDeleted()Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    const/16 v1, 0xa

    .line 93
    .line 94
    int-to-long v2, v0

    .line 95
    invoke-interface {p1, v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getCreateTimeStamp()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const/16 v1, 0xb

    .line 103
    .line 104
    if-nez v0, :cond_0

    .line 105
    .line 106
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_0
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :goto_0
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getUpdateTimeStamp()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    const/16 v0, 0xc

    .line 118
    .line 119
    if-nez p2, :cond_1

    .line 120
    .line 121
    invoke-interface {p1, v0}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_1
    invoke-interface {p1, v0, p2}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public bridge synthetic bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/friday/common/entity/ResourceEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/dao/ResourceDao_Impl$1;->a(Landroidx/sqlite/SQLiteStatement;Lcom/friday/common/entity/ResourceEntity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "INSERT OR REPLACE INTO `ResourceEntity` (`id`,`fileId`,`pageName`,`pageIndex`,`ossImageUrl`,`md5`,`userId`,`resourceType`,`toBeUploaded`,`wasDeleted`,`createTimeStamp`,`updateTimeStamp`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)"

    .line 2
    .line 3
    return-object v0
.end method
