.class public final Ls0/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls0/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ls0/g;


# direct methods
.method public constructor <init>(Ls0/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls0/g$b;->a:Ls0/g;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lh0/e;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ls0/g$b;->d(Ljava/nio/ByteBuffer;Lh0/e;)Z

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
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Ls0/g$b;->c(Ljava/nio/ByteBuffer;IILh0/e;)Lj0/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Ljava/nio/ByteBuffer;IILh0/e;)Lj0/j;
    .locals 1

    .line 1
    invoke-static {p1}, Ll/h0;->a(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Ls0/g$b;->a:Ls0/g;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2, p3, p4}, Ls0/g;->b(Landroid/graphics/ImageDecoder$Source;IILh0/e;)Lj0/j;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public d(Ljava/nio/ByteBuffer;Lh0/e;)Z
    .locals 0

    .line 1
    iget-object p2, p0, Ls0/g$b;->a:Ls0/g;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Ls0/g;->d(Ljava/nio/ByteBuffer;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
