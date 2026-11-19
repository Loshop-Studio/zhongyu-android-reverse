.class public Lcom/liulishuo/okdownload/a;
.super Lq1/a;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/liulishuo/okdownload/a$b;,
        Lcom/liulishuo/okdownload/a$c;,
        Lcom/liulishuo/okdownload/a$a;
    }
.end annotation


# instance fields
.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Landroid/net/Uri;

.field public final e:Ljava/util/Map;

.field public f:Lr1/c;

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:Ljava/lang/Integer;

.field public final m:Ljava/lang/Boolean;

.field public final n:Z

.field public final o:Z

.field public final p:I

.field public volatile q:Lp1/a;

.field public final r:Z

.field public final s:Ljava/util/concurrent/atomic/AtomicLong;

.field public final t:Z

.field public final u:Lu1/g$a;

.field public final v:Ljava/io/File;

.field public final w:Ljava/io/File;

.field public x:Ljava/io/File;

.field public y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/net/Uri;IIIIIZILjava/util/Map;Ljava/lang/String;ZZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lq1/a;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->c:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/liulishuo/okdownload/a;->d:Landroid/net/Uri;

    .line 4
    iput p3, p0, Lcom/liulishuo/okdownload/a;->g:I

    .line 5
    iput p4, p0, Lcom/liulishuo/okdownload/a;->h:I

    .line 6
    iput p5, p0, Lcom/liulishuo/okdownload/a;->i:I

    .line 7
    iput p6, p0, Lcom/liulishuo/okdownload/a;->j:I

    .line 8
    iput p7, p0, Lcom/liulishuo/okdownload/a;->k:I

    .line 9
    iput-boolean p8, p0, Lcom/liulishuo/okdownload/a;->o:Z

    .line 10
    iput p9, p0, Lcom/liulishuo/okdownload/a;->p:I

    .line 11
    iput-object p10, p0, Lcom/liulishuo/okdownload/a;->e:Ljava/util/Map;

    .line 12
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->s:Ljava/util/concurrent/atomic/AtomicLong;

    .line 13
    iput-boolean p12, p0, Lcom/liulishuo/okdownload/a;->n:Z

    .line 14
    iput-boolean p13, p0, Lcom/liulishuo/okdownload/a;->r:Z

    .line 15
    iput-object p15, p0, Lcom/liulishuo/okdownload/a;->l:Ljava/lang/Integer;

    move-object/from16 p1, p16

    .line 16
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->m:Ljava/lang/Boolean;

    .line 17
    invoke-static {p2}, Lq1/c;->t(Landroid/net/Uri;)Z

    move-result p1

    if-eqz p1, :cond_d

    .line 18
    new-instance p1, Ljava/io/File;

    invoke-virtual {p2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    if-eqz p14, :cond_7

    .line 19
    invoke-virtual {p14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 20
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 21
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "If you want filename from response please make sure you provide path is directory "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 23
    :cond_1
    :goto_0
    invoke-static {p11}, Lq1/c;->p(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 24
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Discard filename["

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "] because you set filenameFromResponse=true"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "DownloadTask"

    invoke-static {p3, p2}, Lq1/c;->z(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p11, 0x0

    .line 25
    :cond_2
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    :goto_1
    move-object p2, p14

    goto/16 :goto_4

    .line 26
    :cond_3
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-static {p11}, Lq1/c;->p(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_2

    .line 27
    :cond_4
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "If you don\'t want filename from response please make sure you have already provided valid filename or not directory path "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 29
    :cond_5
    :goto_2
    invoke-static {p11}, Lq1/c;->p(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 30
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p11

    .line 31
    invoke-static {p1}, Lq1/c;->l(Ljava/io/File;)Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    goto :goto_1

    .line 32
    :cond_6
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    goto :goto_1

    .line 33
    :cond_7
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result p2

    if-eqz p2, :cond_8

    .line 34
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 35
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    goto :goto_4

    .line 36
    :cond_8
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 37
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p3

    if-eqz p3, :cond_b

    .line 38
    invoke-static {p11}, Lq1/c;->p(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_a

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_9

    goto :goto_3

    .line 39
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Uri already provided filename!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 40
    :cond_a
    :goto_3
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p11

    .line 41
    invoke-static {p1}, Lq1/c;->l(Ljava/io/File;)Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    goto :goto_4

    .line 42
    :cond_b
    invoke-static {p11}, Lq1/c;->p(Ljava/lang/CharSequence;)Z

    move-result p3

    if-eqz p3, :cond_c

    .line 43
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p11

    .line 44
    invoke-static {p1}, Lq1/c;->l(Ljava/io/File;)Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    goto :goto_4

    .line 45
    :cond_c
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    .line 46
    :goto_4
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/liulishuo/okdownload/a;->t:Z

    goto :goto_5

    :cond_d
    const/4 p1, 0x0

    .line 47
    iput-boolean p1, p0, Lcom/liulishuo/okdownload/a;->t:Z

    .line 48
    new-instance p1, Ljava/io/File;

    invoke-virtual {p2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    .line 49
    :goto_5
    invoke-static {p11}, Lq1/c;->p(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_e

    .line 50
    new-instance p1, Lu1/g$a;

    invoke-direct {p1}, Lu1/g$a;-><init>()V

    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->u:Lu1/g$a;

    .line 51
    iget-object p1, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->v:Ljava/io/File;

    goto :goto_6

    .line 52
    :cond_e
    new-instance p1, Lu1/g$a;

    invoke-direct {p1, p11}, Lu1/g$a;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->u:Lu1/g$a;

    .line 53
    new-instance p1, Ljava/io/File;

    iget-object p2, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    invoke-direct {p1, p2, p11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->x:Ljava/io/File;

    .line 54
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->v:Ljava/io/File;

    .line 55
    :goto_6
    invoke-static {}, Lp1/d;->k()Lp1/d;

    move-result-object p1

    invoke-virtual {p1}, Lp1/d;->a()Lr1/f;

    move-result-object p1

    invoke-interface {p1, p0}, Lr1/f;->c(Lcom/liulishuo/okdownload/a;)I

    move-result p1

    iput p1, p0, Lcom/liulishuo/okdownload/a;->b:I

    return-void
.end method

.method public static synthetic g(Lcom/liulishuo/okdownload/a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/liulishuo/okdownload/a;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic h(Lcom/liulishuo/okdownload/a;)Ljava/io/File;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/liulishuo/okdownload/a;->v:Ljava/io/File;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public A()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->d:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public B()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/liulishuo/okdownload/a;->o:Z

    .line 2
    .line 3
    return v0
.end method

.method public C()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/liulishuo/okdownload/a;->t:Z

    .line 2
    .line 3
    return v0
.end method

.method public D()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/liulishuo/okdownload/a;->n:Z

    .line 2
    .line 3
    return v0
.end method

.method public E()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/liulishuo/okdownload/a;->r:Z

    .line 2
    .line 3
    return v0
.end method

.method public F(I)Lcom/liulishuo/okdownload/a$b;
    .locals 1

    .line 1
    new-instance v0, Lcom/liulishuo/okdownload/a$b;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, Lcom/liulishuo/okdownload/a$b;-><init>(ILcom/liulishuo/okdownload/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public G(Lr1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->f:Lr1/c;

    .line 2
    .line 3
    return-void
.end method

.method public H(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->s:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public I(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->y:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->u:Lu1/g$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu1/g$a;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/liulishuo/okdownload/a;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/liulishuo/okdownload/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/liulishuo/okdownload/a;->j(Lcom/liulishuo/okdownload/a;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public d()Ljava/io/File;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ljava/io/File;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->v:Ljava/io/File;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    instance-of v0, p1, Lcom/liulishuo/okdownload/a;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    check-cast p1, Lcom/liulishuo/okdownload/a;

    .line 14
    .line 15
    iget v0, p1, Lcom/liulishuo/okdownload/a;->b:I

    .line 16
    .line 17
    iget v2, p0, Lcom/liulishuo/okdownload/a;->b:I

    .line 18
    .line 19
    if-ne v0, v2, :cond_1

    .line 20
    .line 21
    return v1

    .line 22
    :cond_1
    invoke-virtual {p0, p1}, Lq1/a;->a(Lq1/a;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_2
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/liulishuo/okdownload/a;->c:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/liulishuo/okdownload/a;->v:Ljava/io/File;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/liulishuo/okdownload/a;->u:Lu1/g$a;

    .line 21
    .line 22
    invoke-virtual {v1}, Lu1/g$a;->a()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    return v0
.end method

.method public i()V
    .locals 1

    .line 1
    invoke-static {}, Lp1/d;->k()Lp1/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lp1/d;->e()Lt1/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p0}, Lt1/b;->a(Lq1/a;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public j(Lcom/liulishuo/okdownload/a;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/liulishuo/okdownload/a;->t()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Lcom/liulishuo/okdownload/a;->t()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sub-int/2addr p1, v0

    .line 10
    return p1
.end method

.method public k(Lp1/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->q:Lp1/a;

    .line 2
    .line 3
    invoke-static {}, Lp1/d;->k()Lp1/d;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lp1/d;->e()Lt1/b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1, p0}, Lt1/b;->c(Lcom/liulishuo/okdownload/a;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public l()Ljava/io/File;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->u:Lu1/g$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu1/g$a;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_0
    iget-object v1, p0, Lcom/liulishuo/okdownload/a;->x:Ljava/io/File;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    new-instance v1, Ljava/io/File;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    .line 18
    .line 19
    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lcom/liulishuo/okdownload/a;->x:Ljava/io/File;

    .line 23
    .line 24
    :cond_1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->x:Ljava/io/File;

    .line 25
    .line 26
    return-object v0
.end method

.method public m()Lu1/g$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->u:Lu1/g$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public n()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/liulishuo/okdownload/a;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public o()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->e:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public p()Lr1/c;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->f:Lr1/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lp1/d;->k()Lp1/d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lp1/d;->a()Lr1/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v1, p0, Lcom/liulishuo/okdownload/a;->b:I

    .line 14
    .line 15
    invoke-interface {v0, v1}, Lr1/f;->get(I)Lr1/c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/liulishuo/okdownload/a;->f:Lr1/c;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->f:Lr1/c;

    .line 22
    .line 23
    return-object v0
.end method

.method public q()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->s:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public r()Lp1/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->q:Lp1/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public s()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/liulishuo/okdownload/a;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public t()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/liulishuo/okdownload/a;->g:I

    .line 2
    .line 3
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
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "@"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v2, p0, Lcom/liulishuo/okdownload/a;->b:I

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Lcom/liulishuo/okdownload/a;->c:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, "/"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/liulishuo/okdownload/a;->u:Lu1/g$a;

    .line 49
    .line 50
    invoke-virtual {v1}, Lu1/g$a;->a()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0
.end method

.method public u()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/liulishuo/okdownload/a;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public v()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->y:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public w()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->l:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public x()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->m:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public y()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/liulishuo/okdownload/a;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public z()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/liulishuo/okdownload/a;->j:I

    .line 2
    .line 3
    return v0
.end method
