.class public final Laa/d;
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
    iput-object p1, p0, Laa/d;->a:Lga/d;

    .line 15
    .line 16
    iput-object p2, p0, Laa/d;->b:Lv9/c;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;J)Lz9/e;
    .locals 0

    .line 1
    const-string p2, "data"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Laa/d;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1
.end method

.method public b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;)V
    .locals 2

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Laa/d;->b:Lv9/c;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;->n()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-interface {v0, v1}, Lv9/c;->d(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Laa/d;->b:Lv9/c;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;->o()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v1, "data.lastBackgroundLineConfig"

    .line 22
    .line 23
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Lna/g;->c(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {v0, p1}, Lv9/c;->s(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Laa/d;->b:Lv9/c;

    .line 34
    .line 35
    invoke-interface {p1}, Lv9/c;->g()V

    .line 36
    .line 37
    .line 38
    return-void
.end method
