.class public Lb/b/b/a0/z/h$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/b/b/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/b/b/a0/z/h;
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
    const-class v0, Ljava/lang/Object;

    if-ne p2, v0, :cond_0

    new-instance p2, Lb/b/b/a0/z/h;

    invoke-direct {p2, p1}, Lb/b/b/a0/z/h;-><init>(Lb/b/b/i;)V

    return-object p2

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
