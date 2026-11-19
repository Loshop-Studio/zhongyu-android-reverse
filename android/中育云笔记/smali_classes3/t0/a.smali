.class public Lt0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lh0/e;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lt0/a;->d(Ljava/io/File;Lh0/e;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILh0/e;)Lj0/j;
    .locals 0

    .line 1
    check-cast p1, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lt0/a;->c(Ljava/io/File;IILh0/e;)Lj0/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Ljava/io/File;IILh0/e;)Lj0/j;
    .locals 0

    .line 1
    new-instance p2, Lt0/b;

    .line 2
    .line 3
    invoke-direct {p2, p1}, Lt0/b;-><init>(Ljava/io/File;)V

    .line 4
    .line 5
    .line 6
    return-object p2
.end method

.method public d(Ljava/io/File;Lh0/e;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method
