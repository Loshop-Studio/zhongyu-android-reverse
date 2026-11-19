.class public Ly2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;

.field public b:I

.field public c:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly2/f;->a:Lcom/yanzhenjie/recyclerview/SwipeMenuLayout;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput p1, p0, Ly2/f;->b:I

    .line 8
    .line 9
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ly2/f;->c:Ljava/util/List;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public a(Ly2/i;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/f;->c:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/f;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Ly2/f;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/f;->c:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    xor-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    return v0
.end method
