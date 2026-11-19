.class public final Lt/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/e;


# instance fields
.field public final a:Lt/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lt/d;

    .line 5
    .line 6
    invoke-direct {v0}, Lt/d;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lt/i;->a:Lt/d;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lj/d;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lt/i;->d(Ljava/nio/ByteBuffer;Lj/d;)Z

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
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lt/i;->c(Ljava/nio/ByteBuffer;IILj/d;)Lm/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Ljava/nio/ByteBuffer;IILj/d;)Lm/j;
    .locals 1

    .line 1
    invoke-static {p1}, Lt/h;->a(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lt/i;->a:Lt/d;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2, p3, p4}, Ls/j;->d(Landroid/graphics/ImageDecoder$Source;IILj/d;)Lm/j;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public d(Ljava/nio/ByteBuffer;Lj/d;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    return p1
.end method
