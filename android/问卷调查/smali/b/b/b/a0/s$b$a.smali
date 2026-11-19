.class public Lb/b/b/a0/s$b$a;
.super Lb/b/b/a0/s$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/b/b/a0/s$b;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb/b/b/a0/s<",
        "TK;TV;>.d<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lb/b/b/a0/s$b;)V
    .locals 0

    iget-object p1, p1, Lb/b/b/a0/s$b;->b:Lb/b/b/a0/s;

    invoke-direct {p0, p1}, Lb/b/b/a0/s$d;-><init>(Lb/b/b/a0/s;)V

    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lb/b/b/a0/s$d;->a()Lb/b/b/a0/s$e;

    move-result-object v0

    return-object v0
.end method
