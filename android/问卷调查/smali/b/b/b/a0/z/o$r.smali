.class public Lb/b/b/a0/z/o$r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/b/b/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/b/b/a0/z/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb/b/b/i;Lb/b/b/b0/a;)Lb/b/b/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lb/b/b/i;",
            "Lb/b/b/b0/a<",
            "TT;>;)",
            "Lb/b/b/x<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object p2, p2, Lb/b/b/b0/a;->a:Ljava/lang/Class;

    .line 2
    const-class v0, Ljava/sql/Timestamp;

    if-eq p2, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-class p2, Ljava/util/Date;

    .line 3
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    new-instance v0, Lb/b/b/b0/a;

    invoke-direct {v0, p2}, Lb/b/b/b0/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 5
    invoke-virtual {p1, v0}, Lb/b/b/i;->c(Lb/b/b/b0/a;)Lb/b/b/x;

    move-result-object p1

    .line 6
    new-instance p2, Lb/b/b/a0/z/o$r$a;

    invoke-direct {p2, p0, p1}, Lb/b/b/a0/z/o$r$a;-><init>(Lb/b/b/a0/z/o$r;Lb/b/b/x;)V

    return-object p2
.end method
