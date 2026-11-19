.class public final Lp4/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lv4/d;

.field public final b:Lj4/a;

.field public final c:Lk4/c;


# direct methods
.method public constructor <init>(Lv4/d;Lj4/a;Lk4/c;)V
    .locals 1

    .line 1
    const-string v0, "sourceLoader"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrixAdapter"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "graphControl"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lp4/e;->a:Lv4/d;

    .line 20
    .line 21
    iput-object p2, p0, Lp4/e;->b:Lj4/a;

    .line 22
    .line 23
    iput-object p3, p0, Lp4/e;->c:Lk4/c;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;J)Lo4/e;
    .locals 3

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lp4/e;->a:Lv4/d;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;->o()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "data.sourceFileName"

    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;->q()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-interface {v0, v1, p1}, Lv4/d;->a(Ljava/lang/String;I)Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    new-instance v0, Lw4/i;

    .line 28
    .line 29
    invoke-direct {v0}, Lw4/i;-><init>()V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lp4/e;->c:Lk4/c;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lo4/e;->n(Lk4/c;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lp4/e;->a:Lv4/d;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lo4/e;->r(Lv4/d;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lp4/e;->b:Lj4/a;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lo4/e;->o(Lj4/a;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1, p2, p3}, Lw4/i;->D(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;J)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_0
    const/4 p1, 0x0

    .line 52
    return-object p1
.end method

.method public b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;)V
    .locals 1

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lp4/e;->c:Lk4/c;

    .line 7
    .line 8
    invoke-interface {p1}, Lk4/c;->d()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
