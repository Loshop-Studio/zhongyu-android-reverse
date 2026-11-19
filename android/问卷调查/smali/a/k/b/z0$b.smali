.class public La/k/b/z0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/k/b/z0;->a(La/k/b/z0$d$c;La/k/b/z0$d$b;La/k/b/j0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:La/k/b/z0$c;

.field public final synthetic c:La/k/b/z0;


# direct methods
.method public constructor <init>(La/k/b/z0;La/k/b/z0$c;)V
    .locals 0

    iput-object p1, p0, La/k/b/z0$b;->c:La/k/b/z0;

    iput-object p2, p0, La/k/b/z0$b;->b:La/k/b/z0$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, La/k/b/z0$b;->c:La/k/b/z0;

    iget-object v0, v0, La/k/b/z0;->b:Ljava/util/ArrayList;

    iget-object v1, p0, La/k/b/z0$b;->b:La/k/b/z0$c;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, La/k/b/z0$b;->c:La/k/b/z0;

    iget-object v0, v0, La/k/b/z0;->c:Ljava/util/ArrayList;

    iget-object v1, p0, La/k/b/z0$b;->b:La/k/b/z0$c;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
