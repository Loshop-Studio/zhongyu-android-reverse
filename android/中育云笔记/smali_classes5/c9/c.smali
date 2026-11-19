.class public Lc9/c;
.super Lc9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc9/c$b;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;La8/c;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lc9/a;-><init>(Landroid/content/Context;Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, La8/c;->j(Landroid/content/Context;[Ljava/lang/String;)La8/c;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lc9/c;-><init>(Landroid/content/Context;La8/c;)V

    return-void
.end method


# virtual methods
.method public A()La8/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lc9/a;->z:Landroid/widget/ListAdapter;

    .line 2
    .line 3
    check-cast v0, La8/c;

    .line 4
    .line 5
    return-object v0
.end method

.method public B(Z)Lc9/c;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lc9/a;->x(Z)Lc9/a;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public C(Lc9/c$b;)Lc9/c;
    .locals 2

    .line 1
    iget-object v0, p0, Lc9/a;->y:Landroid/widget/ListView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lc9/c$a;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lc9/c$a;-><init>(Lc9/c;Lc9/c$b;)V

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

.method public z(IILc9/c$b;)Lc9/c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lc9/a;->w(II)Lc9/a;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p3}, Lc9/c;->C(Lc9/c$b;)Lc9/c;

    .line 5
    .line 6
    .line 7
    return-object p0
.end method
