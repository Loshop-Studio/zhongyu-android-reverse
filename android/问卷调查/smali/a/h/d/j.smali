.class public La/h/d/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/h/d/k$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La/h/d/k$a<",
        "La/h/g/l;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(La/h/d/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, La/h/g/l;

    .line 1
    iget p1, p1, La/h/g/l;->c:I

    return p1
.end method

.method public b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, La/h/g/l;

    .line 1
    iget-boolean p1, p1, La/h/g/l;->d:Z

    return p1
.end method
