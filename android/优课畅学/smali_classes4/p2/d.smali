.class public abstract Lp2/d;
.super Lp2/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp2/d$b;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lm1/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lp2/b;-><init>(Landroid/content/Context;Landroid/widget/ListAdapter;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public A()Lm1/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lp2/b;->z:Landroid/widget/ListAdapter;

    .line 2
    .line 3
    check-cast v0, Lm1/c;

    .line 4
    .line 5
    return-object v0
.end method

.method public B(Z)Lp2/d;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lp2/b;->x(Z)Lp2/b;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public C(Lp2/d$b;)Lp2/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lp2/b;->y:Landroid/widget/ListView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lp2/d$a;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lp2/d$a;-><init>(Lp2/d;Lp2/d$b;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-object p0
.end method

.method public z(IILp2/d$b;)Lp2/d;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lp2/b;->w(II)Lp2/b;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p3}, Lp2/d;->C(Lp2/d$b;)Lp2/d;

    .line 5
    .line 6
    .line 7
    return-object p0
.end method
