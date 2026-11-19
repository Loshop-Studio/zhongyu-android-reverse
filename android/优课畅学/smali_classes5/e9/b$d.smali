.class public Le9/b$d;
.super Le9/b$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Le9/b$c;-><init>(Le9/b$a;)V

    return-void
.end method

.method public synthetic constructor <init>(Le9/b$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Le9/b$d;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ZLz8/c;Lz8/m;FLz8/c;Lz8/c;)Z
    .locals 0

    .line 1
    iget p1, p2, Lz8/c;->p:F

    .line 2
    .line 3
    add-float/2addr p4, p1

    .line 4
    invoke-interface {p3}, Lz8/m;->getHeight()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    int-to-float p1, p1

    .line 9
    cmpl-float p1, p4, p1

    .line 10
    .line 11
    if-lez p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return p1
.end method
