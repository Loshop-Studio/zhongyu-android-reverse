.class public final Lcom/friday/common/dao/FileDao_Impl$1;
.super Landroidx/room/EntityInsertAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/dao/FileDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityInsertAdapter<",
        "Lcom/friday/common/entity/FileEntity;",
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
.method public a(Landroidx/sqlite/SQLiteStatement;Lcom/friday/common/entity/FileEntity;)V
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
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

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
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getAccountId()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x3

    .line 28
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x4

    .line 36
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getOssFileUrl()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x5

    .line 44
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x6

    .line 52
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 v0, 0x7

    .line 60
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-interface {p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/16 v0, 0x8

    .line 68
    .line 69
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getCreateTime()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-interface {p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const/16 v0, 0x9

    .line 77
    .line 78
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getUpdateTime()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-interface {p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    int-to-long v0, v0

    .line 90
    const/16 v2, 0xa

    .line 91
    .line 92
    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->isSync()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    const/16 v1, 0xb

    .line 100
    .line 101
    int-to-long v2, v0

    .line 102
    invoke-interface {p1, v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getVersion()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    int-to-long v0, v0

    .line 110
    const/16 v2, 0xc

    .line 111
    .line 112
    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->isShared()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    const/16 v1, 0xd

    .line 120
    .line 121
    int-to-long v2, v0

    .line 122
    invoke-interface {p1, v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getPreFileId()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    const/16 v1, 0xe

    .line 130
    .line 131
    if-nez v0, :cond_0

    .line 132
    .line 133
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_0
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 138
    .line 139
    .line 140
    :goto_0
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getErrorTimes()I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    int-to-long v0, v0

    .line 145
    const/16 v2, 0xf

    .line 146
    .line 147
    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getMd5()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    const/16 v1, 0x10

    .line 155
    .line 156
    if-nez v0, :cond_1

    .line 157
    .line 158
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_1
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :goto_1
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getCached()Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    const/16 v1, 0x11

    .line 170
    .line 171
    int-to-long v2, v0

    .line 172
    invoke-interface {p1, v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 173
    .line 174
    .line 175
    const/16 v0, 0x12

    .line 176
    .line 177
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getExpiredTime()J

    .line 178
    .line 179
    .line 180
    move-result-wide v1

    .line 181
    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->isRecycled()Z

    .line 185
    .line 186
    .line 187
    move-result p2

    .line 188
    const/16 v0, 0x13

    .line 189
    .line 190
    int-to-long v1, p2

    .line 191
    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 192
    .line 193
    .line 194
    return-void
.end method

.method public bridge synthetic bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/dao/FileDao_Impl$1;->a(Landroidx/sqlite/SQLiteStatement;Lcom/friday/common/entity/FileEntity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "INSERT OR REPLACE INTO `File` (`fileId`,`accountId`,`fileName`,`ossFileUrl`,`localFileUrl`,`fileType`,`parentId`,`createTime`,`updateTime`,`state`,`isSync`,`version`,`isShared`,`preFileId`,`errorTimes`,`md5`,`cached`,`expiredTime`,`isRecycled`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    .line 2
    .line 3
    return-object v0
.end method
