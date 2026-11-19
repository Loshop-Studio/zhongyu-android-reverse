.class public Lo0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo0/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo0/b$d;,
        Lo0/b$a;,
        Lo0/b$c;,
        Lo0/b$b;
    }
.end annotation


# instance fields
.field public final a:Lo0/b$b;


# direct methods
.method public constructor <init>(Lo0/b$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo0/b;->a:Lo0/b$b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, [B

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lo0/b;->d([B)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILh0/d;)Lo0/m$a;
    .locals 0

    .line 1
    check-cast p1, [B

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lo0/b;->c([BIILh0/d;)Lo0/m$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c([BIILh0/d;)Lo0/m$a;
    .locals 1

    .line 1
    new-instance p2, Lo0/m$a;

    .line 2
    .line 3
    new-instance p3, Ld1/b;

    .line 4
    .line 5
    invoke-direct {p3, p1}, Ld1/b;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance p4, Lo0/b$c;

    .line 9
    .line 10
    iget-object v0, p0, Lo0/b;->a:Lo0/b$b;

    .line 11
    .line 12
    invoke-direct {p4, p1, v0}, Lo0/b$c;-><init>([BLo0/b$b;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p2, p3, p4}, Lo0/m$a;-><init>(Lh0/b;Li0/d;)V

    .line 16
    .line 17
    .line 18
    return-object p2
.end method

.method public d([B)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method
