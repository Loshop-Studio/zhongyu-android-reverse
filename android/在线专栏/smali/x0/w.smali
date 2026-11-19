.class public abstract Lx0/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "AddedAbstractMethod"
    }
.end annotation


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Landroid/content/Context;)Lx0/w;
    .locals 0

    invoke-static {p0}, Ly0/i;->n(Landroid/content/Context;)Ly0/i;

    move-result-object p0

    return-object p0
.end method

.method public static g(Landroid/content/Context;Lx0/b;)V
    .locals 0

    invoke-static {p0, p1}, Ly0/i;->g(Landroid/content/Context;Lx0/b;)V

    return-void
.end method


# virtual methods
.method public abstract a()Lx0/q;
.end method

.method public abstract b(Ljava/util/UUID;)Lx0/q;
.end method

.method public abstract c(Ljava/util/List;)Lx0/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lx0/y;",
            ">;)",
            "Lx0/q;"
        }
    .end annotation
.end method

.method public final d(Lx0/y;)Lx0/q;
    .locals 0

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx0/w;->c(Ljava/util/List;)Lx0/q;

    move-result-object p1

    return-object p1
.end method

.method public abstract f(Ljava/util/UUID;)Landroidx/lifecycle/LiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            ")",
            "Landroidx/lifecycle/LiveData<",
            "Lx0/v;",
            ">;"
        }
    .end annotation
.end method
