.class public Lb9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb9/b;


# instance fields
.field public final a:Lb9/d;

.field public final b:I

.field public final c:Z

.field public d:Lb9/c;

.field public e:I


# direct methods
.method public constructor <init>(Lb9/d;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-lez p2, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lb9/a;->a:Lb9/d;

    .line 7
    .line 8
    iput p2, p0, Lb9/a;->b:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lb9/a;->c:Z

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    const-string p2, "The pool limit must be > 0"

    .line 17
    .line 18
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1
.end method


# virtual methods
.method public a(Lb9/c;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Lb9/c;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget-boolean v0, p0, Lb9/a;->c:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget v0, p0, Lb9/a;->e:I

    .line 12
    .line 13
    iget v1, p0, Lb9/a;->b:I

    .line 14
    .line 15
    if-ge v0, v1, :cond_1

    .line 16
    .line 17
    :cond_0
    iget v0, p0, Lb9/a;->e:I

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    add-int/2addr v0, v1

    .line 21
    iput v0, p0, Lb9/a;->e:I

    .line 22
    .line 23
    iget-object v0, p0, Lb9/a;->d:Lb9/c;

    .line 24
    .line 25
    invoke-interface {p1, v0}, Lb9/c;->g(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1, v1}, Lb9/c;->a(Z)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lb9/a;->d:Lb9/c;

    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Lb9/a;->a:Lb9/d;

    .line 34
    .line 35
    invoke-interface {v0, p1}, Lb9/d;->b(Lb9/c;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 40
    .line 41
    new-instance v1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v2, "[FinitePool] Element is already in pool: "

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public acquire()Lb9/c;
    .locals 2

    .line 1
    iget-object v0, p0, Lb9/a;->d:Lb9/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lb9/c;->c()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lb9/c;

    .line 10
    .line 11
    iput-object v1, p0, Lb9/a;->d:Lb9/c;

    .line 12
    .line 13
    iget v1, p0, Lb9/a;->e:I

    .line 14
    .line 15
    add-int/lit8 v1, v1, -0x1

    .line 16
    .line 17
    iput v1, p0, Lb9/a;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v0, p0, Lb9/a;->a:Lb9/d;

    .line 21
    .line 22
    invoke-interface {v0}, Lb9/d;->newInstance()Lb9/c;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    if-eqz v0, :cond_1

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-interface {v0, v1}, Lb9/c;->g(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-interface {v0, v1}, Lb9/c;->a(Z)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lb9/a;->a:Lb9/d;

    .line 37
    .line 38
    invoke-interface {v1, v0}, Lb9/d;->a(Lb9/c;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-object v0
.end method
