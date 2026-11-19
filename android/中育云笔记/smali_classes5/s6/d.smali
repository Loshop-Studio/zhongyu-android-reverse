.class public final Ls6/d;
.super Ls6/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ls6/a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "("

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "media_type"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v2, "=?"

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p3, " OR "

    .line 25
    .line 26
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p3, "=? AND "

    .line 33
    .line 34
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p1, ") AND "

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ls6/d;->I()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_0

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    return-object p1

    .line 59
    :cond_0
    const-string p1, ")"

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string p1, " GROUP BY (bucket_id"

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1
.end method

.method private D(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ls6/d;->I()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const-string v2, "=?"

    .line 11
    .line 12
    const-string v3, "media_type"

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p2, " AND "

    .line 26
    .line 27
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_0
    const-string v1, "("

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p2, ") AND "

    .line 53
    .line 54
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string p1, ")"

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string p1, " GROUP BY (bucket_id"

    .line 66
    .line 67
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1
.end method

.method private E(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ls6/d;->I()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const-string v2, "=?"

    .line 11
    .line 12
    const-string v3, "media_type"

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p2, " AND "

    .line 26
    .line 27
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_0
    const-string v1, "("

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p2, ") AND "

    .line 53
    .line 54
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string p1, ")"

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string p1, " GROUP BY (bucket_id"

    .line 66
    .line 67
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1
.end method

.method public static F(IJ)[Ljava/lang/String;
    .locals 3

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-array p1, v2, [Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    aput-object p0, p1, v1

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    const/4 v0, 0x2

    .line 19
    new-array v0, v0, [Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    aput-object p0, v0, v1

    .line 26
    .line 27
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, La7/q;->g(Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    aput-object p0, v0, v2

    .line 36
    .line 37
    return-object v0
.end method

.method private G(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ls6/d;->I()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const-string v2, "=?"

    .line 11
    .line 12
    const-string v3, "media_type"

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p2, " AND "

    .line 26
    .line 27
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_0
    const-string v1, "("

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p2, ") AND "

    .line 53
    .line 54
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string p1, ")"

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string p1, " GROUP BY (bucket_id"

    .line 66
    .line 67
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1
.end method

.method public static synthetic j(Ls6/d;J)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ls6/d;->u(J)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic k(Ls6/d;J)[Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ls6/d;->v(J)[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic l(Ls6/d;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ls6/d;->I()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic m(Landroid/database/Cursor;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Ls6/d;->s(Landroid/database/Cursor;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic n(Landroid/database/Cursor;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Ls6/d;->t(Landroid/database/Cursor;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic o(Landroid/database/Cursor;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Ls6/d;->r(Landroid/database/Cursor;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic p(Ls6/d;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ls6/d;->K(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static r(Landroid/database/Cursor;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "mime_type"

    .line 2
    .line 3
    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static s(Landroid/database/Cursor;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "_id"

    .line 2
    .line 3
    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-string v2, "mime_type"

    .line 12
    .line 13
    invoke-interface {p0, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-interface {p0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {v0, v1, p0}, La7/h;->j(JLjava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public static t(Landroid/database/Cursor;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "_data"

    .line 2
    .line 3
    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static w(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "("

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "media_type"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v2, "=?"

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p2, " OR "

    .line 25
    .line 26
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p2, "=? AND "

    .line 33
    .line 34
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p3, ") AND "

    .line 41
    .line 42
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-wide/16 v1, -0x1

    .line 46
    .line 47
    cmp-long p0, p0, v1

    .line 48
    .line 49
    if-nez p0, :cond_0

    .line 50
    .line 51
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :cond_0
    const-string p0, "bucket_id"

    .line 60
    .line 61
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0
.end method

.method public static x(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "("

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "media_type"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, "=?"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p2, " AND "

    .line 25
    .line 26
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p2, ") AND "

    .line 33
    .line 34
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-wide/16 p2, -0x1

    .line 38
    .line 39
    cmp-long p0, p0, p2

    .line 40
    .line 41
    if-nez p0, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_0
    const-string p0, "bucket_id"

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p0, "=? AND "

    .line 57
    .line 58
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method

.method public static y(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "("

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "media_type"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, "=?"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-wide/16 v1, -0x1

    .line 22
    .line 23
    cmp-long p0, p0, v1

    .line 24
    .line 25
    const-string p1, ") AND "

    .line 26
    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_0
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p0, "bucket_id"

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p0, "=? AND "

    .line 55
    .line 56
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method

.method public static z(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "("

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "media_type"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, "=?"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p2, " AND "

    .line 25
    .line 26
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p2, ") AND "

    .line 33
    .line 34
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-wide/16 p2, -0x1

    .line 38
    .line 39
    cmp-long p0, p0, p2

    .line 40
    .line 41
    if-nez p0, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_0
    const-string p0, "bucket_id"

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p0, "=? AND "

    .line 57
    .line 58
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method


# virtual methods
.method public A()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ls6/a;->c()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ls6/a;->d()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Ls6/a;->e()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget v3, v3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 18
    .line 19
    if-eqz v3, :cond_3

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    if-eq v3, v4, :cond_2

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    if-eq v3, v1, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    if-eq v3, v1, :cond_0

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    return-object v0

    .line 32
    :cond_0
    invoke-direct {p0, v0, v2}, Ls6/d;->D(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0

    .line 37
    :cond_1
    invoke-direct {p0, v0, v2}, Ls6/d;->G(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    :cond_2
    invoke-direct {p0, v1, v2}, Ls6/d;->E(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    :cond_3
    invoke-direct {p0, v0, v1, v2}, Ls6/d;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0
.end method

.method public B()[Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    if-eq v0, v2, :cond_2

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    if-eq v0, v2, :cond_1

    .line 15
    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    return-object v0

    .line 20
    :cond_0
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    filled-new-array {v0}, [Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0

    .line 29
    :cond_1
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    filled-new-array {v0}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0

    .line 38
    :cond_2
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    filled-new-array {v0}, [Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    :cond_3
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0
.end method

.method public H()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->g0:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v0, "date_modified DESC"

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    invoke-virtual {p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->g0:Ljava/lang/String;

    .line 21
    .line 22
    return-object v0
.end method

.method public final I()Z
    .locals 1

    .line 1
    invoke-static {}, La7/j;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->K0:Z

    .line 14
    .line 15
    return v0
.end method

.method public J(Landroid/database/Cursor;Z)Lcom/luck/picture/lib/entity/LocalMedia;
    .locals 24

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    sget-object v1, Ls6/a;->e:[Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v2, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x1

    .line 13
    aget-object v3, v1, v3

    .line 14
    .line 15
    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v4, 0x2

    .line 20
    aget-object v4, v1, v4

    .line 21
    .line 22
    invoke-interface {v0, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const/4 v5, 0x3

    .line 27
    aget-object v5, v1, v5

    .line 28
    .line 29
    invoke-interface {v0, v5}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const/4 v6, 0x4

    .line 34
    aget-object v6, v1, v6

    .line 35
    .line 36
    invoke-interface {v0, v6}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    const/4 v7, 0x5

    .line 41
    aget-object v7, v1, v7

    .line 42
    .line 43
    invoke-interface {v0, v7}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    const/4 v8, 0x6

    .line 48
    aget-object v8, v1, v8

    .line 49
    .line 50
    invoke-interface {v0, v8}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    const/4 v9, 0x7

    .line 55
    aget-object v9, v1, v9

    .line 56
    .line 57
    invoke-interface {v0, v9}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    const/16 v10, 0x8

    .line 62
    .line 63
    aget-object v10, v1, v10

    .line 64
    .line 65
    invoke-interface {v0, v10}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    const/16 v11, 0x9

    .line 70
    .line 71
    aget-object v11, v1, v11

    .line 72
    .line 73
    invoke-interface {v0, v11}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    const/16 v12, 0xa

    .line 78
    .line 79
    aget-object v12, v1, v12

    .line 80
    .line 81
    invoke-interface {v0, v12}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    move-result v12

    .line 85
    const/16 v13, 0xb

    .line 86
    .line 87
    aget-object v1, v1, v13

    .line 88
    .line 89
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getLong(I)J

    .line 94
    .line 95
    .line 96
    move-result-wide v13

    .line 97
    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-static {}, La7/j;->e()Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_0

    .line 110
    .line 111
    invoke-static {v13, v14, v2}, La7/h;->j(JLjava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    goto :goto_0

    .line 116
    :cond_0
    move-object v4, v3

    .line 117
    :goto_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result v15

    .line 121
    if-eqz v15, :cond_1

    .line 122
    .line 123
    invoke-static {}, Ll6/c;->o()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    :cond_1
    invoke-virtual/range {p0 .. p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 128
    .line 129
    .line 130
    move-result-object v15

    .line 131
    iget-boolean v15, v15, Lcom/luck/picture/lib/config/PictureSelectionConfig;->k0:Z

    .line 132
    .line 133
    const/16 v16, 0x0

    .line 134
    .line 135
    if-eqz v15, :cond_3

    .line 136
    .line 137
    invoke-static {v2}, Ll6/c;->h(Ljava/lang/String;)Z

    .line 138
    .line 139
    .line 140
    move-result v15

    .line 141
    if-eqz v15, :cond_2

    .line 142
    .line 143
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 144
    .line 145
    .line 146
    move-result v15

    .line 147
    if-nez v15, :cond_3

    .line 148
    .line 149
    invoke-static {v3}, La7/i;->n(Ljava/lang/String;)Z

    .line 150
    .line 151
    .line 152
    move-result v15

    .line 153
    if-nez v15, :cond_3

    .line 154
    .line 155
    return-object v16

    .line 156
    :cond_2
    invoke-static {v3}, La7/i;->l(Ljava/lang/String;)Z

    .line 157
    .line 158
    .line 159
    move-result v15

    .line 160
    if-nez v15, :cond_3

    .line 161
    .line 162
    return-object v16

    .line 163
    :cond_3
    const-string v15, "image/*"

    .line 164
    .line 165
    invoke-virtual {v2, v15}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 166
    .line 167
    .line 168
    move-result v17

    .line 169
    if-eqz v17, :cond_5

    .line 170
    .line 171
    invoke-static {v3}, La7/h;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    move-object/from16 v17, v2

    .line 176
    .line 177
    invoke-virtual/range {p0 .. p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    iget-boolean v2, v2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->F:Z

    .line 182
    .line 183
    if-nez v2, :cond_4

    .line 184
    .line 185
    invoke-static/range {v17 .. v17}, Ll6/c;->f(Ljava/lang/String;)Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-eqz v2, :cond_4

    .line 190
    .line 191
    return-object v16

    .line 192
    :cond_4
    move-object/from16 v2, v17

    .line 193
    .line 194
    :cond_5
    invoke-virtual {v2, v15}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 195
    .line 196
    .line 197
    move-result v15

    .line 198
    if-eqz v15, :cond_6

    .line 199
    .line 200
    return-object v16

    .line 201
    :cond_6
    invoke-virtual/range {p0 .. p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 202
    .line 203
    .line 204
    move-result-object v15

    .line 205
    iget-boolean v15, v15, Lcom/luck/picture/lib/config/PictureSelectionConfig;->G:Z

    .line 206
    .line 207
    if-nez v15, :cond_7

    .line 208
    .line 209
    invoke-static {}, Ll6/c;->p()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v15

    .line 213
    invoke-virtual {v2, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 214
    .line 215
    .line 216
    move-result v15

    .line 217
    if-eqz v15, :cond_7

    .line 218
    .line 219
    return-object v16

    .line 220
    :cond_7
    invoke-virtual/range {p0 .. p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 221
    .line 222
    .line 223
    move-result-object v15

    .line 224
    iget-boolean v15, v15, Lcom/luck/picture/lib/config/PictureSelectionConfig;->H:Z

    .line 225
    .line 226
    if-nez v15, :cond_8

    .line 227
    .line 228
    invoke-static {v2}, Ll6/c;->e(Ljava/lang/String;)Z

    .line 229
    .line 230
    .line 231
    move-result v15

    .line 232
    if-eqz v15, :cond_8

    .line 233
    .line 234
    return-object v16

    .line 235
    :cond_8
    invoke-interface {v0, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 236
    .line 237
    .line 238
    move-result v15

    .line 239
    invoke-interface {v0, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 240
    .line 241
    .line 242
    move-result v17

    .line 243
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    move/from16 v18, v15

    .line 248
    .line 249
    const/16 v15, 0x5a

    .line 250
    .line 251
    if-eq v1, v15, :cond_a

    .line 252
    .line 253
    const/16 v15, 0x10e

    .line 254
    .line 255
    if-ne v1, v15, :cond_9

    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_9
    move/from16 v15, v18

    .line 259
    .line 260
    :goto_1
    move/from16 v1, v17

    .line 261
    .line 262
    goto :goto_3

    .line 263
    :cond_a
    :goto_2
    invoke-interface {v0, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 264
    .line 265
    .line 266
    move-result v15

    .line 267
    invoke-interface {v0, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 268
    .line 269
    .line 270
    move-result v17

    .line 271
    goto :goto_1

    .line 272
    :goto_3
    invoke-interface {v0, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 273
    .line 274
    .line 275
    move-result-wide v5

    .line 276
    invoke-interface {v0, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 277
    .line 278
    .line 279
    move-result-wide v7

    .line 280
    invoke-interface {v0, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v9

    .line 284
    invoke-interface {v0, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v10

    .line 288
    move-object/from16 v17, v10

    .line 289
    .line 290
    invoke-interface {v0, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 291
    .line 292
    .line 293
    move-result-wide v10

    .line 294
    move-wide/from16 v18, v7

    .line 295
    .line 296
    invoke-interface {v0, v12}, Landroid/database/Cursor;->getLong(I)J

    .line 297
    .line 298
    .line 299
    move-result-wide v7

    .line 300
    invoke-static/range {v17 .. v17}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    if-eqz v0, :cond_b

    .line 305
    .line 306
    invoke-static {v3}, Ll6/c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    goto :goto_4

    .line 311
    :cond_b
    move-object/from16 v0, v17

    .line 312
    .line 313
    :goto_4
    invoke-virtual/range {p0 .. p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 314
    .line 315
    .line 316
    move-result-object v12

    .line 317
    iget-boolean v12, v12, Lcom/luck/picture/lib/config/PictureSelectionConfig;->I0:Z

    .line 318
    .line 319
    const-wide/16 v20, 0x0

    .line 320
    .line 321
    if-eqz v12, :cond_c

    .line 322
    .line 323
    cmp-long v12, v18, v20

    .line 324
    .line 325
    if-lez v12, :cond_c

    .line 326
    .line 327
    const-wide/16 v22, 0x400

    .line 328
    .line 329
    cmp-long v12, v18, v22

    .line 330
    .line 331
    if-gez v12, :cond_c

    .line 332
    .line 333
    return-object v16

    .line 334
    :cond_c
    invoke-static {v2}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 335
    .line 336
    .line 337
    move-result v12

    .line 338
    if-nez v12, :cond_e

    .line 339
    .line 340
    invoke-static {v2}, Ll6/c;->d(Ljava/lang/String;)Z

    .line 341
    .line 342
    .line 343
    move-result v12

    .line 344
    if-eqz v12, :cond_d

    .line 345
    .line 346
    goto :goto_5

    .line 347
    :cond_d
    move-wide/from16 v22, v7

    .line 348
    .line 349
    goto :goto_6

    .line 350
    :cond_e
    :goto_5
    invoke-virtual/range {p0 .. p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 351
    .line 352
    .line 353
    move-result-object v12

    .line 354
    iget v12, v12, Lcom/luck/picture/lib/config/PictureSelectionConfig;->t:I

    .line 355
    .line 356
    if-lez v12, :cond_f

    .line 357
    .line 358
    invoke-virtual/range {p0 .. p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 359
    .line 360
    .line 361
    move-result-object v12

    .line 362
    iget v12, v12, Lcom/luck/picture/lib/config/PictureSelectionConfig;->t:I

    .line 363
    .line 364
    move-wide/from16 v22, v7

    .line 365
    .line 366
    int-to-long v7, v12

    .line 367
    cmp-long v7, v5, v7

    .line 368
    .line 369
    if-gez v7, :cond_10

    .line 370
    .line 371
    return-object v16

    .line 372
    :cond_f
    move-wide/from16 v22, v7

    .line 373
    .line 374
    :cond_10
    invoke-virtual/range {p0 .. p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 375
    .line 376
    .line 377
    move-result-object v7

    .line 378
    iget v7, v7, Lcom/luck/picture/lib/config/PictureSelectionConfig;->s:I

    .line 379
    .line 380
    if-lez v7, :cond_11

    .line 381
    .line 382
    invoke-virtual/range {p0 .. p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 383
    .line 384
    .line 385
    move-result-object v7

    .line 386
    iget v7, v7, Lcom/luck/picture/lib/config/PictureSelectionConfig;->s:I

    .line 387
    .line 388
    int-to-long v7, v7

    .line 389
    cmp-long v7, v5, v7

    .line 390
    .line 391
    if-lez v7, :cond_11

    .line 392
    .line 393
    return-object v16

    .line 394
    :cond_11
    invoke-virtual/range {p0 .. p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 395
    .line 396
    .line 397
    move-result-object v7

    .line 398
    iget-boolean v7, v7, Lcom/luck/picture/lib/config/PictureSelectionConfig;->I0:Z

    .line 399
    .line 400
    if-eqz v7, :cond_12

    .line 401
    .line 402
    cmp-long v7, v5, v20

    .line 403
    .line 404
    if-gtz v7, :cond_12

    .line 405
    .line 406
    return-object v16

    .line 407
    :cond_12
    :goto_6
    if-eqz p2, :cond_13

    .line 408
    .line 409
    invoke-static {}, Lcom/luck/picture/lib/entity/LocalMedia;->N()Lcom/luck/picture/lib/entity/LocalMedia;

    .line 410
    .line 411
    .line 412
    move-result-object v7

    .line 413
    goto :goto_7

    .line 414
    :cond_13
    invoke-static {}, Lcom/luck/picture/lib/entity/LocalMedia;->a()Lcom/luck/picture/lib/entity/LocalMedia;

    .line 415
    .line 416
    .line 417
    move-result-object v7

    .line 418
    :goto_7
    invoke-virtual {v7, v13, v14}, Lcom/luck/picture/lib/entity/LocalMedia;->g0(J)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v7, v10, v11}, Lcom/luck/picture/lib/entity/LocalMedia;->P(J)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v7, v4}, Lcom/luck/picture/lib/entity/LocalMedia;->n0(Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v7, v3}, Lcom/luck/picture/lib/entity/LocalMedia;->p0(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v7, v0}, Lcom/luck/picture/lib/entity/LocalMedia;->d0(Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v7, v9}, Lcom/luck/picture/lib/entity/LocalMedia;->m0(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v7, v5, v6}, Lcom/luck/picture/lib/entity/LocalMedia;->b0(J)V

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {p0 .. p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 444
    .line 445
    invoke-virtual {v7, v0}, Lcom/luck/picture/lib/entity/LocalMedia;->R(I)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v7, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->i0(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v7, v15}, Lcom/luck/picture/lib/entity/LocalMedia;->s0(I)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v7, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->f0(I)V

    .line 455
    .line 456
    .line 457
    move-wide/from16 v0, v18

    .line 458
    .line 459
    invoke-virtual {v7, v0, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->r0(J)V

    .line 460
    .line 461
    .line 462
    move-wide/from16 v0, v22

    .line 463
    .line 464
    invoke-virtual {v7, v0, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->a0(J)V

    .line 465
    .line 466
    .line 467
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 468
    .line 469
    return-object v7
.end method

.method public final K(Ljava/util/List;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_2

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->a()J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    invoke-virtual {p0, v2, v3}, Ls6/d;->q(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-virtual {v1, v2}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->p(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    return-void
.end method

.method public g(Lq6/f;)V
    .locals 1

    .line 1
    new-instance v0, Ls6/d$c;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Ls6/d$c;-><init>(Ls6/d;Lq6/f;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->h(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public h(Lq6/e;)V
    .locals 1

    .line 1
    new-instance v0, Ls6/d$b;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Ls6/d$b;-><init>(Ls6/d;Lq6/e;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->h(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public i(JIILq6/g;)V
    .locals 7

    .line 1
    new-instance v0, Ls6/d$a;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-wide v2, p1

    .line 5
    move v5, p3

    .line 6
    move v4, p4

    .line 7
    move-object v6, p5

    .line 8
    invoke-direct/range {v0 .. v6}, Ls6/d$a;-><init>(Ls6/d;JIILq6/g;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->h(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public q(J)Ljava/lang/String;
    .locals 13

    .line 1
    const/4 v1, 0x0

    .line 2
    :try_start_0
    invoke-static {}, La7/j;->f()Z

    .line 3
    .line 4
    .line 5
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    const-string v2, "_data"

    .line 7
    .line 8
    const-string v3, "mime_type"

    .line 9
    .line 10
    const-string v4, "_id"

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    :try_start_1
    invoke-virtual {p0, p1, p2}, Ls6/d;->u(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, p1, p2}, Ls6/d;->v(J)[Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0}, Ls6/d;->H()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    const/4 v5, 0x1

    .line 27
    const/4 v6, 0x0

    .line 28
    invoke-static {v0, p1, v5, v6, p2}, La7/h;->a(Ljava/lang/String;[Ljava/lang/String;IILjava/lang/String;)Landroid/os/Bundle;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0}, Ls6/a;->b()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    sget-object v0, Ls6/a;->d:Landroid/net/Uri;

    .line 41
    .line 42
    filled-new-array {v4, v3, v2}, [Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-static {p2, v0, v5, p1, v1}, Ls6/c;->a(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    move-object p1, v0

    .line 53
    goto/16 :goto_4

    .line 54
    .line 55
    :catch_0
    move-exception v0

    .line 56
    move-object p1, v0

    .line 57
    move-object p2, v1

    .line 58
    goto/16 :goto_2

    .line 59
    .line 60
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Ls6/d;->H()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v5, " limit 1 offset 0"

    .line 73
    .line 74
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v11

    .line 81
    invoke-virtual {p0}, Ls6/a;->b()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    sget-object v7, Ls6/a;->d:Landroid/net/Uri;

    .line 90
    .line 91
    filled-new-array {v4, v3, v2}, [Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    invoke-virtual {p0, p1, p2}, Ls6/d;->u(J)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    invoke-virtual {p0, p1, p2}, Ls6/d;->v(J)[Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    invoke-virtual/range {v6 .. v11}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 104
    .line 105
    .line 106
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    :goto_0
    if-eqz p1, :cond_5

    .line 108
    .line 109
    :try_start_2
    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    if-lez p2, :cond_5

    .line 114
    .line 115
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    if-eqz p2, :cond_3

    .line 120
    .line 121
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getLong(I)J

    .line 126
    .line 127
    .line 128
    move-result-wide v4

    .line 129
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    invoke-static {}, La7/j;->e()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_1

    .line 142
    .line 143
    invoke-static {v4, v5, p2}, La7/h;->j(JLjava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    goto :goto_1

    .line 148
    :catchall_1
    move-exception v0

    .line 149
    move-object p2, v0

    .line 150
    move-object v1, p1

    .line 151
    move-object p1, p2

    .line 152
    goto :goto_4

    .line 153
    :catch_1
    move-exception v0

    .line 154
    move-object p2, v0

    .line 155
    move-object v12, p2

    .line 156
    move-object p2, p1

    .line 157
    move-object p1, v12

    .line 158
    goto :goto_2

    .line 159
    :cond_1
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 160
    .line 161
    .line 162
    move-result p2

    .line 163
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 167
    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->isClosed()Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-nez v0, :cond_2

    .line 172
    .line 173
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 174
    .line 175
    .line 176
    :cond_2
    return-object p2

    .line 177
    :cond_3
    invoke-interface {p1}, Landroid/database/Cursor;->isClosed()Z

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    if-nez p2, :cond_4

    .line 182
    .line 183
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 184
    .line 185
    .line 186
    :cond_4
    return-object v1

    .line 187
    :cond_5
    if-eqz p1, :cond_6

    .line 188
    .line 189
    invoke-interface {p1}, Landroid/database/Cursor;->isClosed()Z

    .line 190
    .line 191
    .line 192
    move-result p2

    .line 193
    if-nez p2, :cond_6

    .line 194
    .line 195
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 196
    .line 197
    .line 198
    goto :goto_3

    .line 199
    :goto_2
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 200
    .line 201
    .line 202
    if-eqz p2, :cond_6

    .line 203
    .line 204
    invoke-interface {p2}, Landroid/database/Cursor;->isClosed()Z

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    if-nez p1, :cond_6

    .line 209
    .line 210
    invoke-interface {p2}, Landroid/database/Cursor;->close()V

    .line 211
    .line 212
    .line 213
    :cond_6
    :goto_3
    return-object v1

    .line 214
    :catchall_2
    move-exception v0

    .line 215
    move-object p1, v0

    .line 216
    move-object v1, p2

    .line 217
    :goto_4
    if-eqz v1, :cond_7

    .line 218
    .line 219
    invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z

    .line 220
    .line 221
    .line 222
    move-result p2

    .line 223
    if-nez p2, :cond_7

    .line 224
    .line 225
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 226
    .line 227
    .line 228
    :cond_7
    throw p1
.end method

.method public final u(J)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ls6/a;->c()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ls6/a;->d()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Ls6/a;->e()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget v3, v3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 18
    .line 19
    if-eqz v3, :cond_3

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    if-eq v3, v4, :cond_2

    .line 23
    .line 24
    const/4 v4, 0x2

    .line 25
    if-eq v3, v4, :cond_1

    .line 26
    .line 27
    const/4 v4, 0x3

    .line 28
    if-eq v3, v4, :cond_0

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    return-object p1

    .line 32
    :cond_0
    invoke-static {p1, p2, v2, v0, v1}, Ls6/d;->x(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_1
    invoke-static {p1, p2, v2, v0, v1}, Ls6/d;->z(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_2
    invoke-static {p1, p2, v2, v1}, Ls6/d;->y(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :cond_3
    invoke-static {p1, p2, v2, v0, v1}, Ls6/d;->w(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1
.end method

.method public final v(J)[Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    if-eq v0, v2, :cond_2

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    if-eq v0, v2, :cond_1

    .line 15
    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return-object p1

    .line 20
    :cond_0
    invoke-static {v2, p1, p2}, Ls6/d;->F(IJ)[Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :cond_1
    invoke-static {v1, p1, p2}, Ls6/d;->F(IJ)[Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_2
    invoke-static {v2, p1, p2}, Ls6/d;->F(IJ)[Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :cond_3
    const-wide/16 v3, -0x1

    .line 36
    .line 37
    cmp-long v0, p1, v3

    .line 38
    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    filled-new-array {p1, p2}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    :cond_4
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p1}, La7/q;->g(Ljava/lang/Object;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1
.end method
