.class public final Lm/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh6/h;


# instance fields
.field public final a:Lh6/h;


# direct methods
.method public constructor <init>(Lh6/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm/b;->a:Lh6/h;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b;->a:Lh6/h;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final fold(Ljava/lang/Object;Lr6/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b;->a:Lh6/h;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lh6/h;->fold(Ljava/lang/Object;Lr6/e;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final get(Lh6/g;)Lh6/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b;->a:Lh6/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lh6/h;->get(Lh6/g;)Lh6/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b;->a:Lh6/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final minusKey(Lh6/g;)Lh6/h;
    .locals 3

    .line 1
    iget-object v0, p0, Lm/b;->a:Lh6/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lh6/h;->minusKey(Lh6/g;)Lh6/h;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget v0, Lm/e;->b:I

    .line 8
    .line 9
    sget-object v0, Lkotlinx/coroutines/r;->Key:Lkotlinx/coroutines/q;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lm/b;->get(Lh6/g;)Lh6/f;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lkotlinx/coroutines/r;

    .line 16
    .line 17
    invoke-interface {p1, v0}, Lh6/h;->get(Lh6/g;)Lh6/f;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lkotlinx/coroutines/r;

    .line 22
    .line 23
    instance-of v2, v1, Lm/c;

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    check-cast v1, Lm/c;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    iput v0, v1, Lm/c;->b:I

    .line 37
    .line 38
    :cond_0
    new-instance v0, Lm/b;

    .line 39
    .line 40
    invoke-direct {v0, p1}, Lm/b;-><init>(Lh6/h;)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method

.method public final plus(Lh6/h;)Lh6/h;
    .locals 3

    .line 1
    iget-object v0, p0, Lm/b;->a:Lh6/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lh6/h;->plus(Lh6/h;)Lh6/h;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget v0, Lm/e;->b:I

    .line 8
    .line 9
    sget-object v0, Lkotlinx/coroutines/r;->Key:Lkotlinx/coroutines/q;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lm/b;->get(Lh6/g;)Lh6/f;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lkotlinx/coroutines/r;

    .line 16
    .line 17
    invoke-interface {p1, v0}, Lh6/h;->get(Lh6/g;)Lh6/f;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lkotlinx/coroutines/r;

    .line 22
    .line 23
    instance-of v2, v1, Lm/c;

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    check-cast v1, Lm/c;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    iput v0, v1, Lm/c;->b:I

    .line 37
    .line 38
    :cond_0
    new-instance v0, Lm/b;

    .line 39
    .line 40
    invoke-direct {v0, p1}, Lm/b;-><init>(Lh6/h;)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ForwardingCoroutineContext(delegate="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lm/b;->a:Lh6/h;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ")"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method
