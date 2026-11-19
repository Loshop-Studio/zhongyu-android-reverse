.class public Lq/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq/d$a;,
        Lq/d$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lq/d;->d(Ljava/io/File;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILj/d;)Lq/m$a;
    .locals 0

    .line 1
    check-cast p1, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lq/d;->c(Ljava/io/File;IILj/d;)Lq/m$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Ljava/io/File;IILj/d;)Lq/m$a;
    .locals 0

    .line 1
    new-instance p2, Lq/m$a;

    .line 2
    .line 3
    new-instance p3, Lf0/b;

    .line 4
    .line 5
    invoke-direct {p3, p1}, Lf0/b;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance p4, Lq/d$a;

    .line 9
    .line 10
    invoke-direct {p4, p1}, Lq/d$a;-><init>(Ljava/io/File;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p2, p3, p4}, Lq/m$a;-><init>(Lj/b;Lk/d;)V

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public d(Ljava/io/File;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    return p1
.end method
