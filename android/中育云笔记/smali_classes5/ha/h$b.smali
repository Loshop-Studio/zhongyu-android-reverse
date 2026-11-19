.class public final Lha/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz9/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lha/h;->B(Ljava/util/ListIterator;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lha/h;

.field public final synthetic b:Lz9/e;

.field public final synthetic c:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;


# direct methods
.method public constructor <init>(Lha/h;Lz9/e;Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lha/h$b;->a:Lha/h;

    .line 2
    .line 3
    iput-object p2, p0, Lha/h$b;->b:Lz9/e;

    .line 4
    .line 5
    iput-object p3, p0, Lha/h$b;->c:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(Lz9/e;Z)V
    .locals 1

    .line 1
    const-string v0, "thread"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lha/h$b;->a:Lha/h;

    .line 7
    .line 8
    invoke-static {v0}, Lha/h;->w(Lha/h;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lha/h$b;->b:Lz9/e;

    .line 18
    .line 19
    invoke-virtual {p1}, Lz9/e;->g()Lga/d;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lha/h$b;->a:Lha/h;

    .line 26
    .line 27
    iget-object p2, p0, Lha/h$b;->c:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 28
    .line 29
    invoke-static {p1}, Lha/h;->v(Lha/h;)Lz9/a;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lz9/a;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
.end method
