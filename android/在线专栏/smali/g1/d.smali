.class public Lg1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroidx/lifecycle/LiveData;Lj/a;Lh1/a;)Landroidx/lifecycle/LiveData;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<In:",
            "Ljava/lang/Object;",
            "Out:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/lifecycle/LiveData<",
            "TIn;>;",
            "Lj/a<",
            "TIn;TOut;>;",
            "Lh1/a;",
            ")",
            "Landroidx/lifecycle/LiveData<",
            "TOut;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v1, Landroidx/lifecycle/q;

    invoke-direct {v1}, Landroidx/lifecycle/q;-><init>()V

    .line 3
    new-instance v2, Lg1/d$a;

    invoke-direct {v2, p2, v0, p1, v1}, Lg1/d$a;-><init>(Lh1/a;Ljava/lang/Object;Lj/a;Landroidx/lifecycle/q;)V

    invoke-virtual {v1, p0, v2}, Landroidx/lifecycle/q;->a(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/t;)V

    return-object v1
.end method
