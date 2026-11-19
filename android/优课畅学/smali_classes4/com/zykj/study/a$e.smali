.class public final Lcom/zykj/study/a$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public a:Lj6/a;

.field public b:Ls4/o;

.field public c:Lcom/zykj/study/provide/GlobalObjectProvide;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lm4/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/a$e;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lj6/a;)Lcom/zykj/study/a$e;
    .locals 0

    .line 1
    invoke-static {p1}, Ll6/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lj6/a;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/zykj/study/a$e;->a:Lj6/a;

    .line 8
    .line 9
    return-object p0
.end method

.method public b()Lm4/g;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/study/a$e;->a:Lj6/a;

    .line 2
    .line 3
    const-class v1, Lj6/a;

    .line 4
    .line 5
    invoke-static {v0, v1}, Ll6/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/study/a$e;->b:Ls4/o;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ls4/o;

    .line 13
    .line 14
    invoke-direct {v0}, Ls4/o;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/zykj/study/a$e;->b:Ls4/o;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/zykj/study/a$e;->c:Lcom/zykj/study/provide/GlobalObjectProvide;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    new-instance v0, Lcom/zykj/study/provide/GlobalObjectProvide;

    .line 24
    .line 25
    invoke-direct {v0}, Lcom/zykj/study/provide/GlobalObjectProvide;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/zykj/study/a$e;->c:Lcom/zykj/study/provide/GlobalObjectProvide;

    .line 29
    .line 30
    :cond_1
    new-instance v0, Lcom/zykj/study/a$h;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/zykj/study/a$e;->a:Lj6/a;

    .line 33
    .line 34
    iget-object v2, p0, Lcom/zykj/study/a$e;->b:Ls4/o;

    .line 35
    .line 36
    iget-object v3, p0, Lcom/zykj/study/a$e;->c:Lcom/zykj/study/provide/GlobalObjectProvide;

    .line 37
    .line 38
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/study/a$h;-><init>(Lj6/a;Ls4/o;Lcom/zykj/study/provide/GlobalObjectProvide;)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method
