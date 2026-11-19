.class public final Lf5/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ll5/e;

.field public final b:La5/c;


# direct methods
.method public constructor <init>(Ll5/e;La5/c;)V
    .locals 1

    .line 1
    const-string v0, "sourceLoader"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "graphControl"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lf5/j;->a:Ll5/e;

    .line 15
    .line 16
    iput-object p2, p0, Lf5/j;->b:La5/c;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;J)Le5/e;
    .locals 0

    .line 1
    const-string p2, "data"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lf5/j;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1
.end method

.method public b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;)V
    .locals 4

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lu5/l;->a:Lu5/l;

    .line 7
    .line 8
    iget-object v1, p0, Lf5/j;->a:Ll5/e;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->v()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "data.snapshot"

    .line 15
    .line 16
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lu5/l;->a(Ll5/e;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lg5/a;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, Lf5/j;->b:La5/c;

    .line 26
    .line 27
    invoke-interface {v1, v0}, La5/c;->x(Lg5/c;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lf5/j;->b:La5/c;

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->getBackgroundColor()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-interface {v0, v1}, La5/c;->c(I)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lf5/j;->b:La5/c;

    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->q()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string v1, "data.backgroundLineConfig"

    .line 46
    .line 47
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p1}, Lu5/g;->c(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-interface {v0, p1}, La5/c;->r(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lf5/j;->b:La5/c;

    .line 58
    .line 59
    invoke-interface {p1}, La5/c;->e()V

    .line 60
    .line 61
    .line 62
    :cond_0
    return-void
.end method
