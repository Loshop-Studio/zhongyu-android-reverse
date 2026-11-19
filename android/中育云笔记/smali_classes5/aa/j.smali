.class public final Laa/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lga/d;

.field public final b:Lv9/c;


# direct methods
.method public constructor <init>(Lga/d;Lv9/c;)V
    .locals 1

    .line 1
    const-string v0, "sourceLoader"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "graphControl"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Laa/j;->a:Lga/d;

    .line 15
    .line 16
    iput-object p2, p0, Laa/j;->b:Lv9/c;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;J)Lz9/e;
    .locals 0

    .line 1
    const-string p2, "data"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Laa/j;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;)V

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lna/l;->a:Lna/l;

    .line 7
    .line 8
    iget-object v1, p0, Laa/j;->a:Lga/d;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->n()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "data.snapshot"

    .line 15
    .line 16
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lna/l;->a(Lga/d;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lba/a;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, Laa/j;->b:Lv9/c;

    .line 26
    .line 27
    invoke-interface {v1, v0}, Lv9/c;->E(Lba/c;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Laa/j;->b:Lv9/c;

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->getBackgroundColor()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-interface {v0, v1}, Lv9/c;->d(I)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Laa/j;->b:Lv9/c;

    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->g()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string v1, "data.backgroundLineConfig"

    .line 46
    .line 47
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p1}, Lna/g;->c(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-interface {v0, p1}, Lv9/c;->s(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Laa/j;->b:Lv9/c;

    .line 58
    .line 59
    invoke-interface {p1}, Lv9/c;->g()V

    .line 60
    .line 61
    .line 62
    :cond_0
    return-void
.end method
