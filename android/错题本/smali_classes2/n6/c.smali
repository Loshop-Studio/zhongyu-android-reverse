.class public final Ln6/c;
.super Ln6/b;
.source "SourceFile"


# instance fields
.field public b:Z

.field public c:[Ljava/io/File;

.field public d:I

.field public e:Z

.field public final synthetic f:Ln6/g;


# direct methods
.method public constructor <init>(Ln6/g;Ljava/io/File;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln6/c;->f:Ln6/g;

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
    iget-boolean v0, p0, Ln6/c;->e:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v3, p0, Ln6/h;->a:Ljava/io/File;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Ln6/c;->c:[Ljava/io/File;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Ln6/c;->c:[Ljava/io/File;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Ln6/c;->f:Ln6/g;

    .line 21
    .line 22
    iget-object v0, v0, Ln6/g;->d:Ln6/i;

    .line 23
    .line 24
    iget-object v0, v0, Ln6/i;->c:Lr6/e;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    new-instance v2, Lkotlin/io/AccessDeniedException;

    .line 29
    .line 30
    const/4 v6, 0x2

    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const-string v5, "Cannot list files in a directory"

    .line 34
    .line 35
    invoke-direct/range {v2 .. v7}, Lkotlin/io/AccessDeniedException;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILkotlin/jvm/internal/e;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v3, v2}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    :cond_0
    iput-boolean v1, p0, Ln6/c;->e:Z

    .line 42
    .line 43
    :cond_1
    iget-object v0, p0, Ln6/c;->c:[Ljava/io/File;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    iget v2, p0, Ln6/c;->d:I

    .line 48
    .line 49
    array-length v4, v0

    .line 50
    if-ge v2, v4, :cond_2

    .line 51
    .line 52
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget v1, p0, Ln6/c;->d:I

    .line 56
    .line 57
    add-int/lit8 v2, v1, 0x1

    .line 58
    .line 59
    iput v2, p0, Ln6/c;->d:I

    .line 60
    .line 61
    aget-object v0, v0, v1

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_2
    iget-boolean v0, p0, Ln6/c;->b:Z

    .line 65
    .line 66
    if-nez v0, :cond_3

    .line 67
    .line 68
    iput-boolean v1, p0, Ln6/c;->b:Z

    .line 69
    .line 70
    return-object v3

    .line 71
    :cond_3
    const/4 v0, 0x0

    .line 72
    return-object v0
.end method
