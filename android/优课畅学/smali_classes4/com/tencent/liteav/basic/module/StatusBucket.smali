.class public Lcom/tencent/liteav/basic/module/StatusBucket;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "com.tencent.liteav.basic.module.StatusBucket"


# instance fields
.field private mBucketObj:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lcom/tencent/liteav/basic/module/StatusBucket;->mBucketObj:J

    .line 3
    invoke-static {}, Lcom/tencent/liteav/basic/module/StatusBucket;->nativeCreateStatusBucket()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/liteav/basic/module/StatusBucket;->mBucketObj:J

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-wide p1, p0, Lcom/tencent/liteav/basic/module/StatusBucket;->mBucketObj:J

    return-void
.end method

.method private static native nativeCreateStatusBucket()J
.end method

.method private static native nativeDestroyStatusBucket(J)V
.end method

.method private static native nativeGetBooleanStatus(JLjava/lang/String;I)Z
.end method

.method private static native nativeGetIntStatus(JLjava/lang/String;I)I
.end method

.method private static native nativeGetLongStatus(JLjava/lang/String;I)J
.end method

.method private static native nativeMerge(JJ)V
.end method

.method private static native nativeSetBooleanStatus(JLjava/lang/String;IZ)V
.end method

.method private static native nativeSetIntStatus(JLjava/lang/String;II)V
.end method

.method private static native nativeSetLongStatus(JLjava/lang/String;IJ)V
.end method

.method public static testStatusBucket()V
    .locals 15

    .line 1
    new-instance v0, Lcom/tencent/liteav/basic/module/StatusBucket;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/tencent/liteav/basic/module/StatusBucket;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/tencent/liteav/basic/module/StatusBucket;

    .line 7
    .line 8
    invoke-direct {v1}, Lcom/tencent/liteav/basic/module/StatusBucket;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v2, "1"

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-virtual {v0, v2, v3, v3}, Lcom/tencent/liteav/basic/module/StatusBucket;->setBooleanStatus(Ljava/lang/String;IZ)V

    .line 15
    .line 16
    .line 17
    const-string v4, "2"

    .line 18
    .line 19
    const/4 v5, 0x2

    .line 20
    invoke-virtual {v0, v4, v5, v5}, Lcom/tencent/liteav/basic/module/StatusBucket;->setIntStatus(Ljava/lang/String;II)V

    .line 21
    .line 22
    .line 23
    const-wide/16 v6, 0x3

    .line 24
    .line 25
    const-string v8, "3"

    .line 26
    .line 27
    const/4 v9, 0x3

    .line 28
    invoke-virtual {v0, v8, v9, v6, v7}, Lcom/tencent/liteav/basic/module/StatusBucket;->setLongStatus(Ljava/lang/String;IJ)V

    .line 29
    .line 30
    .line 31
    const/4 v6, 0x4

    .line 32
    invoke-virtual {v1, v2, v6, v6}, Lcom/tencent/liteav/basic/module/StatusBucket;->setIntStatus(Ljava/lang/String;II)V

    .line 33
    .line 34
    .line 35
    const-string v7, "5"

    .line 36
    .line 37
    const/4 v10, 0x5

    .line 38
    invoke-virtual {v1, v7, v10, v3}, Lcom/tencent/liteav/basic/module/StatusBucket;->setBooleanStatus(Ljava/lang/String;IZ)V

    .line 39
    .line 40
    .line 41
    const-wide/16 v11, 0x6

    .line 42
    .line 43
    const-string v13, "6"

    .line 44
    .line 45
    const/4 v14, 0x6

    .line 46
    invoke-virtual {v1, v13, v14, v11, v12}, Lcom/tencent/liteav/basic/module/StatusBucket;->setLongStatus(Ljava/lang/String;IJ)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/basic/module/StatusBucket;->merge(Lcom/tencent/liteav/basic/module/StatusBucket;)V

    .line 50
    .line 51
    .line 52
    sget-object v1, Lcom/tencent/liteav/basic/module/StatusBucket;->TAG:Ljava/lang/String;

    .line 53
    .line 54
    new-instance v11, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v12, "test_status_bucket: id:1, key:1, value:"

    .line 60
    .line 61
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2, v3}, Lcom/tencent/liteav/basic/module/StatusBucket;->getBooleanStatus(Ljava/lang/String;I)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-static {v1, v3}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    new-instance v3, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v11, "test_status_bucket: id:1, key:4, value:"

    .line 84
    .line 85
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v2, v6}, Lcom/tencent/liteav/basic/module/StatusBucket;->getIntStatus(Ljava/lang/String;I)I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-static {v1, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    new-instance v2, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    const-string v3, "test_status_bucket: id:2, key:2, value:"

    .line 108
    .line 109
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v4, v5}, Lcom/tencent/liteav/basic/module/StatusBucket;->getIntStatus(Ljava/lang/String;I)I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-static {v1, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    new-instance v2, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string v3, "test_status_bucket: id:3, key:3, value:"

    .line 132
    .line 133
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v8, v9}, Lcom/tencent/liteav/basic/module/StatusBucket;->getLongStatus(Ljava/lang/String;I)J

    .line 137
    .line 138
    .line 139
    move-result-wide v3

    .line 140
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-static {v1, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    new-instance v2, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    const-string v3, "test_status_bucket: id:5, key:5, value:"

    .line 156
    .line 157
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v7, v10}, Lcom/tencent/liteav/basic/module/StatusBucket;->getBooleanStatus(Ljava/lang/String;I)Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-static {v1, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    new-instance v2, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    .line 178
    .line 179
    const-string v3, "test_status_bucket: id:6, key:6, value:"

    .line 180
    .line 181
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0, v13, v14}, Lcom/tencent/liteav/basic/module/StatusBucket;->getLongStatus(Ljava/lang/String;I)J

    .line 185
    .line 186
    .line 187
    move-result-wide v3

    .line 188
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    return-void
.end method


# virtual methods
.method public finalize()V
    .locals 4

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Lcom/tencent/liteav/basic/module/StatusBucket;->mBucketObj:J

    .line 5
    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    iput-wide v2, p0, Lcom/tencent/liteav/basic/module/StatusBucket;->mBucketObj:J

    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/module/StatusBucket;->nativeDestroyStatusBucket(J)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public getBooleanStatus(Ljava/lang/String;I)Z
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tencent/liteav/basic/module/StatusBucket;->mBucketObj:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lcom/tencent/liteav/basic/module/StatusBucket;->nativeGetBooleanStatus(JLjava/lang/String;I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getIntStatus(Ljava/lang/String;I)I
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tencent/liteav/basic/module/StatusBucket;->mBucketObj:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lcom/tencent/liteav/basic/module/StatusBucket;->nativeGetIntStatus(JLjava/lang/String;I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getLongStatus(Ljava/lang/String;I)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tencent/liteav/basic/module/StatusBucket;->mBucketObj:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lcom/tencent/liteav/basic/module/StatusBucket;->nativeGetLongStatus(JLjava/lang/String;I)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public merge(Lcom/tencent/liteav/basic/module/StatusBucket;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/tencent/liteav/basic/module/StatusBucket;->mBucketObj:J

    .line 2
    .line 3
    iget-wide v2, p1, Lcom/tencent/liteav/basic/module/StatusBucket;->mBucketObj:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2, v3}, Lcom/tencent/liteav/basic/module/StatusBucket;->nativeMerge(JJ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setBooleanStatus(Ljava/lang/String;IZ)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tencent/liteav/basic/module/StatusBucket;->mBucketObj:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2, p3}, Lcom/tencent/liteav/basic/module/StatusBucket;->nativeSetBooleanStatus(JLjava/lang/String;IZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setIntStatus(Ljava/lang/String;II)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tencent/liteav/basic/module/StatusBucket;->mBucketObj:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2, p3}, Lcom/tencent/liteav/basic/module/StatusBucket;->nativeSetIntStatus(JLjava/lang/String;II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setLongStatus(Ljava/lang/String;IJ)V
    .locals 6

    .line 1
    iget-wide v0, p0, Lcom/tencent/liteav/basic/module/StatusBucket;->mBucketObj:J

    .line 2
    .line 3
    move-object v2, p1

    .line 4
    move v3, p2

    .line 5
    move-wide v4, p3

    .line 6
    invoke-static/range {v0 .. v5}, Lcom/tencent/liteav/basic/module/StatusBucket;->nativeSetLongStatus(JLjava/lang/String;IJ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
