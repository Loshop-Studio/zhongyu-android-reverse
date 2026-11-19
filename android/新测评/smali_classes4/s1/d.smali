.class public Ls1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Z

.field public final g:Z


# direct methods
.method public constructor <init>(Landroid/database/Cursor;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "id"

    .line 5
    .line 6
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Ls1/d;->a:I

    .line 15
    .line 16
    const-string v0, "url"

    .line 17
    .line 18
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Ls1/d;->b:Ljava/lang/String;

    .line 27
    .line 28
    const-string v0, "etag"

    .line 29
    .line 30
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Ls1/d;->c:Ljava/lang/String;

    .line 39
    .line 40
    const-string v0, "parent_path"

    .line 41
    .line 42
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Ls1/d;->d:Ljava/lang/String;

    .line 51
    .line 52
    const-string v0, "filename"

    .line 53
    .line 54
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, Ls1/d;->e:Ljava/lang/String;

    .line 63
    .line 64
    const-string v0, "task_only_parent_path"

    .line 65
    .line 66
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    const/4 v1, 0x0

    .line 75
    const/4 v2, 0x1

    .line 76
    if-ne v0, v2, :cond_0

    .line 77
    .line 78
    move v0, v2

    .line 79
    goto :goto_0

    .line 80
    :cond_0
    move v0, v1

    .line 81
    :goto_0
    iput-boolean v0, p0, Ls1/d;->f:Z

    .line 82
    .line 83
    const-string v0, "chunked"

    .line 84
    .line 85
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-ne p1, v2, :cond_1

    .line 94
    .line 95
    move v1, v2

    .line 96
    :cond_1
    iput-boolean v1, p0, Ls1/d;->g:Z

    .line 97
    .line 98
    return-void
.end method


# virtual methods
.method public a()Ls1/c;
    .locals 6

    .line 1
    new-instance v0, Ls1/c;

    .line 2
    .line 3
    iget v1, p0, Ls1/d;->a:I

    .line 4
    .line 5
    iget-object v2, p0, Ls1/d;->b:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v3, Ljava/io/File;

    .line 8
    .line 9
    iget-object v4, p0, Ls1/d;->d:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v4, p0, Ls1/d;->e:Ljava/lang/String;

    .line 15
    .line 16
    iget-boolean v5, p0, Ls1/d;->f:Z

    .line 17
    .line 18
    invoke-direct/range {v0 .. v5}, Ls1/c;-><init>(ILjava/lang/String;Ljava/io/File;Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Ls1/d;->c:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ls1/c;->s(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-boolean v1, p0, Ls1/d;->g:Z

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ls1/c;->r(Z)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method
