.class public Lcom/lzy/okgo/model/Progress;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lzy/okgo/model/Progress$a;
    }
.end annotation


# instance fields
.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:F

.field public i:J

.field public j:J

.field public transient k:J

.field public l:I

.field public m:I

.field public n:J

.field public o:Lcom/lzy/okgo/request/base/Request;

.field public p:Ljava/io/Serializable;

.field public q:Ljava/io/Serializable;

.field public r:Ljava/io/Serializable;

.field public s:Ljava/lang/Throwable;

.field public transient t:J

.field public transient u:J

.field public transient v:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iput-wide v0, p0, Lcom/lzy/okgo/model/Progress;->u:J

    .line 9
    .line 10
    const-wide/16 v0, -0x1

    .line 11
    .line 12
    iput-wide v0, p0, Lcom/lzy/okgo/model/Progress;->i:J

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput v0, p0, Lcom/lzy/okgo/model/Progress;->m:I

    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iput-wide v0, p0, Lcom/lzy/okgo/model/Progress;->n:J

    .line 22
    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/lzy/okgo/model/Progress;->v:Ljava/util/List;

    .line 29
    .line 30
    return-void
.end method

.method public static c(Lcom/lzy/okgo/model/Progress;)Landroid/content/ContentValues;
    .locals 3

    .line 1
    new-instance v0, Landroid/content/ContentValues;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "tag"

    .line 7
    .line 8
    iget-object v2, p0, Lcom/lzy/okgo/model/Progress;->c:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "url"

    .line 14
    .line 15
    iget-object v2, p0, Lcom/lzy/okgo/model/Progress;->d:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v1, "folder"

    .line 21
    .line 22
    iget-object v2, p0, Lcom/lzy/okgo/model/Progress;->e:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v1, "filePath"

    .line 28
    .line 29
    iget-object v2, p0, Lcom/lzy/okgo/model/Progress;->f:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v1, "fileName"

    .line 35
    .line 36
    iget-object v2, p0, Lcom/lzy/okgo/model/Progress;->g:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget v1, p0, Lcom/lzy/okgo/model/Progress;->h:F

    .line 42
    .line 43
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-string v2, "fraction"

    .line 48
    .line 49
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Float;)V

    .line 50
    .line 51
    .line 52
    iget-wide v1, p0, Lcom/lzy/okgo/model/Progress;->i:J

    .line 53
    .line 54
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const-string v2, "totalSize"

    .line 59
    .line 60
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 61
    .line 62
    .line 63
    iget-wide v1, p0, Lcom/lzy/okgo/model/Progress;->j:J

    .line 64
    .line 65
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    const-string v2, "currentSize"

    .line 70
    .line 71
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 72
    .line 73
    .line 74
    iget v1, p0, Lcom/lzy/okgo/model/Progress;->l:I

    .line 75
    .line 76
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const-string v2, "status"

    .line 81
    .line 82
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 83
    .line 84
    .line 85
    iget v1, p0, Lcom/lzy/okgo/model/Progress;->m:I

    .line 86
    .line 87
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    const-string v2, "priority"

    .line 92
    .line 93
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 94
    .line 95
    .line 96
    iget-wide v1, p0, Lcom/lzy/okgo/model/Progress;->n:J

    .line 97
    .line 98
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    const-string v2, "date"

    .line 103
    .line 104
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, Lcom/lzy/okgo/model/Progress;->o:Lcom/lzy/okgo/request/base/Request;

    .line 108
    .line 109
    invoke-static {v1}, Lf7/b;->g(Ljava/lang/Object;)[B

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    const-string v2, "request"

    .line 114
    .line 115
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 116
    .line 117
    .line 118
    iget-object v1, p0, Lcom/lzy/okgo/model/Progress;->p:Ljava/io/Serializable;

    .line 119
    .line 120
    invoke-static {v1}, Lf7/b;->g(Ljava/lang/Object;)[B

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    const-string v2, "extra1"

    .line 125
    .line 126
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 127
    .line 128
    .line 129
    iget-object v1, p0, Lcom/lzy/okgo/model/Progress;->q:Ljava/io/Serializable;

    .line 130
    .line 131
    invoke-static {v1}, Lf7/b;->g(Ljava/lang/Object;)[B

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    const-string v2, "extra2"

    .line 136
    .line 137
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 138
    .line 139
    .line 140
    iget-object p0, p0, Lcom/lzy/okgo/model/Progress;->r:Ljava/io/Serializable;

    .line 141
    .line 142
    invoke-static {p0}, Lf7/b;->g(Ljava/lang/Object;)[B

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    const-string v1, "extra3"

    .line 147
    .line 148
    invoke-virtual {v0, v1, p0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 149
    .line 150
    .line 151
    return-object v0
.end method

.method public static d(Lcom/lzy/okgo/model/Progress;)Landroid/content/ContentValues;
    .locals 3

    .line 1
    new-instance v0, Landroid/content/ContentValues;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/lzy/okgo/model/Progress;->h:F

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "fraction"

    .line 13
    .line 14
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Float;)V

    .line 15
    .line 16
    .line 17
    iget-wide v1, p0, Lcom/lzy/okgo/model/Progress;->i:J

    .line 18
    .line 19
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "totalSize"

    .line 24
    .line 25
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 26
    .line 27
    .line 28
    iget-wide v1, p0, Lcom/lzy/okgo/model/Progress;->j:J

    .line 29
    .line 30
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "currentSize"

    .line 35
    .line 36
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 37
    .line 38
    .line 39
    iget v1, p0, Lcom/lzy/okgo/model/Progress;->l:I

    .line 40
    .line 41
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v2, "status"

    .line 46
    .line 47
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 48
    .line 49
    .line 50
    iget v1, p0, Lcom/lzy/okgo/model/Progress;->m:I

    .line 51
    .line 52
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const-string v2, "priority"

    .line 57
    .line 58
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 59
    .line 60
    .line 61
    iget-wide v1, p0, Lcom/lzy/okgo/model/Progress;->n:J

    .line 62
    .line 63
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const-string v1, "date"

    .line 68
    .line 69
    invoke-virtual {v0, v1, p0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 70
    .line 71
    .line 72
    return-object v0
.end method

.method public static e(Lcom/lzy/okgo/model/Progress;JJLcom/lzy/okgo/model/Progress$a;)Lcom/lzy/okgo/model/Progress;
    .locals 6

    .line 1
    iput-wide p3, p0, Lcom/lzy/okgo/model/Progress;->i:J

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/lzy/okgo/model/Progress;->j:J

    .line 4
    .line 5
    add-long/2addr v0, p1

    .line 6
    iput-wide v0, p0, Lcom/lzy/okgo/model/Progress;->j:J

    .line 7
    .line 8
    iget-wide v0, p0, Lcom/lzy/okgo/model/Progress;->t:J

    .line 9
    .line 10
    add-long/2addr v0, p1

    .line 11
    iput-wide v0, p0, Lcom/lzy/okgo/model/Progress;->t:J

    .line 12
    .line 13
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    iget-wide v0, p0, Lcom/lzy/okgo/model/Progress;->u:J

    .line 18
    .line 19
    sub-long v2, p1, v0

    .line 20
    .line 21
    sget-wide v4, Lb7/a;->i:J

    .line 22
    .line 23
    cmp-long v2, v2, v4

    .line 24
    .line 25
    if-ltz v2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-wide v2, p0, Lcom/lzy/okgo/model/Progress;->j:J

    .line 29
    .line 30
    cmp-long v2, v2, p3

    .line 31
    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    :goto_0
    sub-long v0, p1, v0

    .line 35
    .line 36
    const-wide/16 v2, 0x0

    .line 37
    .line 38
    cmp-long v4, v0, v2

    .line 39
    .line 40
    if-nez v4, :cond_1

    .line 41
    .line 42
    const-wide/16 v0, 0x1

    .line 43
    .line 44
    :cond_1
    iget-wide v4, p0, Lcom/lzy/okgo/model/Progress;->j:J

    .line 45
    .line 46
    long-to-float v4, v4

    .line 47
    const/high16 v5, 0x3f800000    # 1.0f

    .line 48
    .line 49
    mul-float/2addr v4, v5

    .line 50
    long-to-float p3, p3

    .line 51
    div-float/2addr v4, p3

    .line 52
    iput v4, p0, Lcom/lzy/okgo/model/Progress;->h:F

    .line 53
    .line 54
    iget-wide p3, p0, Lcom/lzy/okgo/model/Progress;->t:J

    .line 55
    .line 56
    const-wide/16 v4, 0x3e8

    .line 57
    .line 58
    mul-long/2addr p3, v4

    .line 59
    div-long/2addr p3, v0

    .line 60
    invoke-virtual {p0, p3, p4}, Lcom/lzy/okgo/model/Progress;->a(J)J

    .line 61
    .line 62
    .line 63
    move-result-wide p3

    .line 64
    iput-wide p3, p0, Lcom/lzy/okgo/model/Progress;->k:J

    .line 65
    .line 66
    iput-wide p1, p0, Lcom/lzy/okgo/model/Progress;->u:J

    .line 67
    .line 68
    iput-wide v2, p0, Lcom/lzy/okgo/model/Progress;->t:J

    .line 69
    .line 70
    if-eqz p5, :cond_2

    .line 71
    .line 72
    invoke-interface {p5, p0}, Lcom/lzy/okgo/model/Progress$a;->a(Lcom/lzy/okgo/model/Progress;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    return-object p0
.end method

.method public static f(Lcom/lzy/okgo/model/Progress;JLcom/lzy/okgo/model/Progress$a;)Lcom/lzy/okgo/model/Progress;
    .locals 6

    .line 1
    iget-wide v3, p0, Lcom/lzy/okgo/model/Progress;->i:J

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-wide v1, p1

    .line 5
    move-object v5, p3

    .line 6
    invoke-static/range {v0 .. v5}, Lcom/lzy/okgo/model/Progress;->e(Lcom/lzy/okgo/model/Progress;JJLcom/lzy/okgo/model/Progress$a;)Lcom/lzy/okgo/model/Progress;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static g(Landroid/database/Cursor;)Lcom/lzy/okgo/model/Progress;
    .locals 3

    .line 1
    new-instance v0, Lcom/lzy/okgo/model/Progress;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/lzy/okgo/model/Progress;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "tag"

    .line 7
    .line 8
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, v0, Lcom/lzy/okgo/model/Progress;->c:Ljava/lang/String;

    .line 17
    .line 18
    const-string v1, "url"

    .line 19
    .line 20
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iput-object v1, v0, Lcom/lzy/okgo/model/Progress;->d:Ljava/lang/String;

    .line 29
    .line 30
    const-string v1, "folder"

    .line 31
    .line 32
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iput-object v1, v0, Lcom/lzy/okgo/model/Progress;->e:Ljava/lang/String;

    .line 41
    .line 42
    const-string v1, "filePath"

    .line 43
    .line 44
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iput-object v1, v0, Lcom/lzy/okgo/model/Progress;->f:Ljava/lang/String;

    .line 53
    .line 54
    const-string v1, "fileName"

    .line 55
    .line 56
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iput-object v1, v0, Lcom/lzy/okgo/model/Progress;->g:Ljava/lang/String;

    .line 65
    .line 66
    const-string v1, "fraction"

    .line 67
    .line 68
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getFloat(I)F

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    iput v1, v0, Lcom/lzy/okgo/model/Progress;->h:F

    .line 77
    .line 78
    const-string v1, "totalSize"

    .line 79
    .line 80
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 85
    .line 86
    .line 87
    move-result-wide v1

    .line 88
    iput-wide v1, v0, Lcom/lzy/okgo/model/Progress;->i:J

    .line 89
    .line 90
    const-string v1, "currentSize"

    .line 91
    .line 92
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 97
    .line 98
    .line 99
    move-result-wide v1

    .line 100
    iput-wide v1, v0, Lcom/lzy/okgo/model/Progress;->j:J

    .line 101
    .line 102
    const-string v1, "status"

    .line 103
    .line 104
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    iput v1, v0, Lcom/lzy/okgo/model/Progress;->l:I

    .line 113
    .line 114
    const-string v1, "priority"

    .line 115
    .line 116
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    iput v1, v0, Lcom/lzy/okgo/model/Progress;->m:I

    .line 125
    .line 126
    const-string v1, "date"

    .line 127
    .line 128
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 133
    .line 134
    .line 135
    move-result-wide v1

    .line 136
    iput-wide v1, v0, Lcom/lzy/okgo/model/Progress;->n:J

    .line 137
    .line 138
    const-string v1, "request"

    .line 139
    .line 140
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-static {v1}, Lf7/b;->h([B)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    check-cast v1, Lcom/lzy/okgo/request/base/Request;

    .line 153
    .line 154
    iput-object v1, v0, Lcom/lzy/okgo/model/Progress;->o:Lcom/lzy/okgo/request/base/Request;

    .line 155
    .line 156
    const-string v1, "extra1"

    .line 157
    .line 158
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-static {v1}, Lf7/b;->h([B)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    check-cast v1, Ljava/io/Serializable;

    .line 171
    .line 172
    iput-object v1, v0, Lcom/lzy/okgo/model/Progress;->p:Ljava/io/Serializable;

    .line 173
    .line 174
    const-string v1, "extra2"

    .line 175
    .line 176
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-static {v1}, Lf7/b;->h([B)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    check-cast v1, Ljava/io/Serializable;

    .line 189
    .line 190
    iput-object v1, v0, Lcom/lzy/okgo/model/Progress;->q:Ljava/io/Serializable;

    .line 191
    .line 192
    const-string v1, "extra3"

    .line 193
    .line 194
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-static {p0}, Lf7/b;->h([B)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    check-cast p0, Ljava/io/Serializable;

    .line 207
    .line 208
    iput-object p0, v0, Lcom/lzy/okgo/model/Progress;->r:Ljava/io/Serializable;

    .line 209
    .line 210
    return-object v0
.end method


# virtual methods
.method public final a(J)J
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lzy/okgo/model/Progress;->v:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/lzy/okgo/model/Progress;->v:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/16 p2, 0xa

    .line 17
    .line 18
    if-le p1, p2, :cond_0

    .line 19
    .line 20
    iget-object p1, p0, Lcom/lzy/okgo/model/Progress;->v:Ljava/util/List;

    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    invoke-interface {p1, p2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object p1, p0, Lcom/lzy/okgo/model/Progress;->v:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-wide/16 v0, 0x0

    .line 33
    .line 34
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eqz p2, :cond_1

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    check-cast p2, Ljava/lang/Long;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    long-to-float p2, v2

    .line 51
    long-to-float v0, v0

    .line 52
    add-float/2addr v0, p2

    .line 53
    float-to-long v0, v0

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    iget-object p1, p0, Lcom/lzy/okgo/model/Progress;->v:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    int-to-long p1, p1

    .line 62
    div-long/2addr v0, p1

    .line 63
    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eq v2, v3, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    check-cast p1, Lcom/lzy/okgo/model/Progress;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/lzy/okgo/model/Progress;->c:Ljava/lang/String;

    .line 22
    .line 23
    iget-object p1, p1, Lcom/lzy/okgo/model/Progress;->c:Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1

    .line 32
    :cond_2
    if-nez p1, :cond_3

    .line 33
    .line 34
    return v0

    .line 35
    :cond_3
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lzy/okgo/model/Progress;->c:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Progress{fraction="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget v1, p0, Lcom/lzy/okgo/model/Progress;->h:F

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", totalSize="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-wide v1, p0, Lcom/lzy/okgo/model/Progress;->i:J

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", currentSize="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-wide v1, p0, Lcom/lzy/okgo/model/Progress;->j:J

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ", speed="

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-wide v1, p0, Lcom/lzy/okgo/model/Progress;->k:J

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, ", status="

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget v1, p0, Lcom/lzy/okgo/model/Progress;->l:I

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v1, ", priority="

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    iget v1, p0, Lcom/lzy/okgo/model/Progress;->m:I

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, ", folder="

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    iget-object v1, p0, Lcom/lzy/okgo/model/Progress;->e:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v1, ", filePath="

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, Lcom/lzy/okgo/model/Progress;->f:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, ", fileName="

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    iget-object v1, p0, Lcom/lzy/okgo/model/Progress;->g:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v1, ", tag="

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    iget-object v1, p0, Lcom/lzy/okgo/model/Progress;->c:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v1, ", url="

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    iget-object v1, p0, Lcom/lzy/okgo/model/Progress;->d:Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const/16 v1, 0x7d

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    return-object v0
.end method
