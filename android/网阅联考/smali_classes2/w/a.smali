.class public Lw/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lj/d;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lw/a;->d(Ljava/io/File;Lj/d;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILj/d;)Lm/j;
    .locals 0

    .line 1
    check-cast p1, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lw/a;->c(Ljava/io/File;IILj/d;)Lm/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Ljava/io/File;IILj/d;)Lm/j;
    .locals 0

    .line 1
    new-instance p2, Lw/b;

    .line 2
    .line 3
    invoke-direct {p2, p1}, Lw/b;-><init>(Ljava/io/File;)V

    .line 4
    .line 5
    .line 6
    return-object p2
.end method

.method public d(Ljava/io/File;Lj/d;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    return p1
.end method
