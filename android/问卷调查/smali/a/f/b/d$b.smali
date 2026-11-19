.class public La/f/b/d$b;
.super La/f/b/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/f/b/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(La/f/b/d;La/f/b/c;)V
    .locals 0

    invoke-direct {p0}, La/f/b/b;-><init>()V

    new-instance p1, La/f/b/h;

    invoke-direct {p1, p0, p2}, La/f/b/h;-><init>(La/f/b/b;La/f/b/c;)V

    iput-object p1, p0, La/f/b/b;->d:La/f/b/b$a;

    return-void
.end method
