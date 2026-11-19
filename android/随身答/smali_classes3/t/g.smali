.class public final Lt/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt/g$a;
    }
.end annotation


# instance fields
.field public final a:Lt/j;

.field public final b:Lt/g$b;


# direct methods
.method public constructor <init>(JLt/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lt/g;->a:Lt/j;

    .line 5
    .line 6
    new-instance p3, Lt/g$b;

    .line 7
    .line 8
    invoke-direct {p3, p1, p2, p0}, Lt/g$b;-><init>(JLt/g;)V

    .line 9
    .line 10
    .line 11
    iput-object p3, p0, Lt/g;->b:Lt/g$b;

    .line 12
    .line 13
    return-void
.end method

.method public static final synthetic e(Lt/g;)Lt/j;
    .locals 0

    .line 1
    iget-object p0, p0, Lt/g;->a:Lt/j;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(Lt/d$b;)Lt/d$c;
    .locals 2

    .line 1
    iget-object v0, p0, Lt/g;->b:Lt/g$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Le0/p;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lt/g$a;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance v0, Lt/d$c;

    .line 12
    .line 13
    invoke-virtual {p1}, Lt/g$a;->b()Lk/j;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p1}, Lt/g$a;->a()Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {v0, v1, p1}, Lt/d$c;-><init>(Lk/j;Ljava/util/Map;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    return-object p1
.end method

.method public b(Lt/d$b;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lt/g;->b:Lt/g$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Le0/p;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method public c(Lt/d$b;Lk/j;Ljava/util/Map;J)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lt/g;->f()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    cmp-long v0, p4, v0

    .line 6
    .line 7
    if-gtz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lt/g;->b:Lt/g$b;

    .line 10
    .line 11
    new-instance v1, Lt/g$a;

    .line 12
    .line 13
    invoke-direct {v1, p2, p3, p4, p5}, Lt/g$a;-><init>(Lk/j;Ljava/util/Map;J)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1, v1}, Le0/p;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, Lt/g;->b:Lt/g$b;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Le0/p;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lt/g;->a:Lt/j;

    .line 26
    .line 27
    move-object v2, p1

    .line 28
    move-object v3, p2

    .line 29
    move-object v4, p3

    .line 30
    move-wide v5, p4

    .line 31
    invoke-interface/range {v1 .. v6}, Lt/j;->c(Lt/d$b;Lk/j;Ljava/util/Map;J)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt/g;->b:Lt/g$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Le0/p;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt/g;->b:Lt/g$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Le0/p;->k(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f()J
    .locals 2

    .line 1
    iget-object v0, p0, Lt/g;->b:Lt/g$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Le0/p;->d()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public getSize()J
    .locals 2

    .line 1
    iget-object v0, p0, Lt/g;->b:Lt/g$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Le0/p;->e()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method
