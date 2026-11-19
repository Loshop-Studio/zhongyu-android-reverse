.class public final Lz6/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz6/h;
.implements Lz6/c;


# instance fields
.field public final a:Lz6/h;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(Lz6/h;II)V
    .locals 1

    .line 1
    const-string/jumbo v0, "sequence"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lz6/n;->a:Lz6/h;

    .line 11
    .line 12
    iput p2, p0, Lz6/n;->b:I

    .line 13
    .line 14
    iput p3, p0, Lz6/n;->c:I

    .line 15
    .line 16
    if-ltz p2, :cond_2

    .line 17
    .line 18
    if-ltz p3, :cond_1

    .line 19
    .line 20
    if-lt p3, p2, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string p1, "endIndex should be not less than startIndex, but was "

    .line 24
    .line 25
    const-string v0, " < "

    .line 26
    .line 27
    invoke-static {p3, p2, p1, v0}, Landroidx/collection/a;->m(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p2

    .line 41
    :cond_1
    const-string p1, "endIndex should be non-negative, but is "

    .line 42
    .line 43
    invoke-static {p3, p1}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p2

    .line 57
    :cond_2
    const-string/jumbo p1, "startIndex should be non-negative, but is "

    .line 58
    .line 59
    .line 60
    invoke-static {p2, p1}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p2
.end method


# virtual methods
.method public final a(I)Lz6/h;
    .locals 4

    .line 1
    iget v0, p0, Lz6/n;->c:I

    .line 2
    .line 3
    iget v1, p0, Lz6/n;->b:I

    .line 4
    .line 5
    sub-int v2, v0, v1

    .line 6
    .line 7
    if-lt p1, v2, :cond_0

    .line 8
    .line 9
    sget-object p1, Lz6/d;->a:Lz6/d;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    new-instance v2, Lz6/n;

    .line 13
    .line 14
    iget-object v3, p0, Lz6/n;->a:Lz6/h;

    .line 15
    .line 16
    add-int/2addr v1, p1

    .line 17
    invoke-direct {v2, v3, v1, v0}, Lz6/n;-><init>(Lz6/h;II)V

    .line 18
    .line 19
    .line 20
    return-object v2
.end method

.method public final b(I)Lz6/h;
    .locals 3

    .line 1
    iget v0, p0, Lz6/n;->c:I

    .line 2
    .line 3
    iget v1, p0, Lz6/n;->b:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance v0, Lz6/n;

    .line 10
    .line 11
    iget-object v2, p0, Lz6/n;->a:Lz6/h;

    .line 12
    .line 13
    add-int/2addr p1, v1

    .line 14
    invoke-direct {v0, v2, v1, p1}, Lz6/n;-><init>(Lz6/h;II)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lz6/g;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lz6/g;-><init>(Lz6/n;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
