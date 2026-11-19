.class public La/k/b/x;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:La/k/b/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/k/b/z<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La/k/b/z;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/k/b/z<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/k/b/x;->a:La/k/b/z;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, La/k/b/x;->a:La/k/b/z;

    iget-object v0, v0, La/k/b/z;->e:La/k/b/c0;

    invoke-virtual {v0}, La/k/b/c0;->U()V

    return-void
.end method
