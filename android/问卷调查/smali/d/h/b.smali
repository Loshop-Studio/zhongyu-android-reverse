.class public final Ld/h/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "TT;>;",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final synthetic b:Ld/h/a;


# direct methods
.method public constructor <init>(Ld/h/a;)V
    .locals 0

    iput-object p1, p0, Ld/h/b;->b:Ld/h/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Ld/h/b;->b:Ld/h/a;

    invoke-interface {v0}, Ld/h/a;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
