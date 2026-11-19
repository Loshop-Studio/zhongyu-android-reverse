.class public Lx1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/d;


# instance fields
.field public final a:Ljava/io/InputStream;

.field public final b:[B

.field public final c:Lw1/d;

.field public final d:I

.field public final e:Lcom/liulishuo/okdownload/a;

.field public final f:Lu1/a;


# direct methods
.method public constructor <init>(ILjava/io/InputStream;Lw1/d;Lcom/liulishuo/okdownload/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lx1/b;->d:I

    .line 5
    .line 6
    iput-object p2, p0, Lx1/b;->a:Ljava/io/InputStream;

    .line 7
    .line 8
    invoke-virtual {p4}, Lcom/liulishuo/okdownload/a;->u()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    new-array p1, p1, [B

    .line 13
    .line 14
    iput-object p1, p0, Lx1/b;->b:[B

    .line 15
    .line 16
    iput-object p3, p0, Lx1/b;->c:Lw1/d;

    .line 17
    .line 18
    iput-object p4, p0, Lx1/b;->e:Lcom/liulishuo/okdownload/a;

    .line 19
    .line 20
    invoke-static {}, Lq1/d;->k()Lq1/d;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Lq1/d;->b()Lu1/a;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lx1/b;->f:Lu1/a;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public b(Lv1/f;)J
    .locals 4

    .line 1
    invoke-virtual {p1}, Lv1/f;->e()Lv1/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lv1/d;->f()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    invoke-static {}, Lq1/d;->k()Lq1/d;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lq1/d;->f()Lv1/g;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1}, Lv1/f;->k()Lcom/liulishuo/okdownload/a;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Lv1/g;->f(Lcom/liulishuo/okdownload/a;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lx1/b;->a:Ljava/io/InputStream;

    .line 27
    .line 28
    iget-object v1, p0, Lx1/b;->b:[B

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, -0x1

    .line 35
    if-ne v0, v1, :cond_0

    .line 36
    .line 37
    int-to-long v0, v0

    .line 38
    return-wide v0

    .line 39
    :cond_0
    iget-object v1, p0, Lx1/b;->c:Lw1/d;

    .line 40
    .line 41
    iget v2, p0, Lx1/b;->d:I

    .line 42
    .line 43
    iget-object v3, p0, Lx1/b;->b:[B

    .line 44
    .line 45
    invoke-virtual {v1, v2, v3, v0}, Lw1/d;->y(I[BI)V

    .line 46
    .line 47
    .line 48
    int-to-long v0, v0

    .line 49
    invoke-virtual {p1, v0, v1}, Lv1/f;->l(J)V

    .line 50
    .line 51
    .line 52
    iget-object v2, p0, Lx1/b;->f:Lu1/a;

    .line 53
    .line 54
    iget-object v3, p0, Lx1/b;->e:Lcom/liulishuo/okdownload/a;

    .line 55
    .line 56
    invoke-virtual {v2, v3}, Lu1/a;->c(Lcom/liulishuo/okdownload/a;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    invoke-virtual {p1}, Lv1/f;->c()V

    .line 63
    .line 64
    .line 65
    :cond_1
    return-wide v0

    .line 66
    :cond_2
    sget-object p1, Lcom/liulishuo/okdownload/core/exception/InterruptException;->a:Lcom/liulishuo/okdownload/core/exception/InterruptException;

    .line 67
    .line 68
    throw p1
.end method
