.class public Landroidx/fragment/app/FragmentManager$6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/m/e;


# virtual methods
.method public g(La/m/g;La/m/d$a;)V
    .locals 1

    sget-object p1, La/m/d$a;->ON_START:La/m/d$a;

    const/4 v0, 0x0

    if-eq p2, p1, :cond_1

    sget-object p1, La/m/d$a;->ON_DESTROY:La/m/d$a;

    if-eq p2, p1, :cond_0

    return-void

    :cond_0
    throw v0

    .line 1
    :cond_1
    throw v0
.end method
