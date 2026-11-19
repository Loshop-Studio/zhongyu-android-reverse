.class public final Lz/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/f;


# instance fields
.field public final a:Lc0/g;


# direct methods
.method public constructor <init>(Lc0/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz/l;->a:Lc0/g;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lz/g;
    .locals 2

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    new-instance v0, Lz/h;

    .line 4
    .line 5
    iget-object v1, p0, Lz/l;->a:Lc0/g;

    .line 6
    .line 7
    invoke-direct {v0, p1, v1}, Lz/h;-><init>(Ljava/io/InputStream;Lc0/g;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final b()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Ljava/io/InputStream;

    .line 2
    .line 3
    return-object v0
.end method
