.class public interface abstract Lc2/g2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lc2/g2;JLjava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    if-nez p8, :cond_1

    .line 2
    .line 3
    and-int/lit8 p7, p7, 0x4

    .line 4
    .line 5
    if-eqz p7, :cond_0

    .line 6
    .line 7
    sget-object p4, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 8
    .line 9
    invoke-virtual {p4}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 10
    .line 11
    .line 12
    move-result-object p4

    .line 13
    invoke-virtual {p4}, Lcom/friday/common/helper/b;->t()J

    .line 14
    .line 15
    .line 16
    move-result-wide p4

    .line 17
    :cond_0
    move-object v0, p0

    .line 18
    move-wide v1, p1

    .line 19
    move-object v3, p3

    .line 20
    move-wide v4, p4

    .line 21
    move-object v6, p6

    .line 22
    invoke-interface/range {v0 .. v6}, Lc2/g2;->f(JLjava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 28
    .line 29
    const-string p1, "Super calls with default arguments not supported in this target, function: updatePreviewTime"

    .line 30
    .line 31
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p0
.end method


# virtual methods
.method public abstract b(JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract c(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract d(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract e(JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract f(JLjava/lang/String;JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract g(Lcom/friday/common/entity/ShareCacheEntity;Lvc/c;)Ljava/lang/Object;
.end method
