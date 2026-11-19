.class public La9/d$d;
.super La9/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic c:La9/d;


# direct methods
.method public constructor <init>(La9/d;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, La9/d$d;->c:La9/d;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, La9/d$a;-><init>(La9/d;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lz8/c;Lz8/c;)I
    .locals 1

    .line 1
    iget-boolean v0, p0, La9/d$a;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1, p2}, Lf9/b;->g(Lz8/c;Lz8/c;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :cond_0
    invoke-virtual {p1}, Lz8/c;->l()F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {p2}, Lz8/c;->l()F

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lz8/c;

    .line 2
    .line 3
    check-cast p2, Lz8/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La9/d$d;->a(Lz8/c;Lz8/c;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method
