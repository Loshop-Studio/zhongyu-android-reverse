.class public final Ln6/e;
.super Ln6/b;
.source "SourceFile"


# instance fields
.field public b:Z

.field public c:[Ljava/io/File;

.field public d:I

.field public final synthetic e:Ln6/g;


# direct methods
.method public constructor <init>(Ln6/g;Ljava/io/File;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln6/e;->e:Ln6/g;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ln6/h;-><init>(Ljava/io/File;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljava/io/File;
    .locals 8

    .line 1
    iget-boolean v0, p0, Ln6/e;->b:Z

    .line 2
    .line 3
    iget-object v2, p0, Ln6/h;->a:Ljava/io/File;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Ln6/e;->b:Z

    .line 9
    .line 10
    return-object v2

    .line 11
    :cond_0
    iget-object v0, p0, Ln6/e;->c:[Ljava/io/File;

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    iget v1, p0, Ln6/e;->d:I

    .line 17
    .line 18
    array-length v3, v0

    .line 19
    if-ge v1, v3, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return-object v7

    .line 23
    :cond_2
    :goto_0
    if-nez v0, :cond_5

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Ln6/e;->c:[Ljava/io/File;

    .line 30
    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    iget-object v0, p0, Ln6/e;->e:Ln6/g;

    .line 34
    .line 35
    iget-object v0, v0, Ln6/g;->d:Ln6/i;

    .line 36
    .line 37
    iget-object v0, v0, Ln6/i;->c:Lr6/e;

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    new-instance v1, Lkotlin/io/AccessDeniedException;

    .line 42
    .line 43
    const/4 v5, 0x2

    .line 44
    const/4 v6, 0x0

    .line 45
    const/4 v3, 0x0

    .line 46
    const-string v4, "Cannot list files in a directory"

    .line 47
    .line 48
    invoke-direct/range {v1 .. v6}, Lkotlin/io/AccessDeniedException;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILkotlin/jvm/internal/e;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v0, v2, v1}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :cond_3
    iget-object v0, p0, Ln6/e;->c:[Ljava/io/File;

    .line 55
    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    array-length v0, v0

    .line 59
    if-nez v0, :cond_5

    .line 60
    .line 61
    :cond_4
    return-object v7

    .line 62
    :cond_5
    iget-object v0, p0, Ln6/e;->c:[Ljava/io/File;

    .line 63
    .line 64
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget v1, p0, Ln6/e;->d:I

    .line 68
    .line 69
    add-int/lit8 v2, v1, 0x1

    .line 70
    .line 71
    iput v2, p0, Ln6/e;->d:I

    .line 72
    .line 73
    aget-object v0, v0, v1

    .line 74
    .line 75
    return-object v0
.end method
