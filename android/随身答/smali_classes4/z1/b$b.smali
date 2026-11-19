.class public Lz1/b$b;
.super Lz1/a$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public e:Lp1/f;

.field public f:Landroid/util/SparseArray;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lz1/a$c;-><init>(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lr1/c;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lz1/a$c;->a(Lr1/c;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lp1/f;

    .line 5
    .line 6
    invoke-direct {v0}, Lp1/f;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lz1/b$b;->e:Lp1/f;

    .line 10
    .line 11
    new-instance v0, Landroid/util/SparseArray;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lz1/b$b;->f:Landroid/util/SparseArray;

    .line 17
    .line 18
    invoke-virtual {p1}, Lr1/c;->d()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/4 v0, 0x0

    .line 23
    :goto_0
    if-ge v0, p1, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, Lz1/b$b;->f:Landroid/util/SparseArray;

    .line 26
    .line 27
    new-instance v2, Lp1/f;

    .line 28
    .line 29
    invoke-direct {v2}, Lp1/f;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void
.end method

.method public b(I)Lp1/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lz1/b$b;->f:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lp1/f;

    .line 8
    .line 9
    return-object p1
.end method
