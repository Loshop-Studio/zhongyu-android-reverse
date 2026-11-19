.class public final Lw/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lw/g;


# direct methods
.method public constructor <init>(Lw/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw/g$b;->a:Lw/g;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;IILl/d;)Ln/j;
    .locals 0

    .line 1
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lw/g$b;->c(Ljava/nio/ByteBuffer;IILl/d;)Ln/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ll/d;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lw/g$b;->d(Ljava/nio/ByteBuffer;Ll/d;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c(Ljava/nio/ByteBuffer;IILl/d;)Ln/j;
    .locals 1

    .line 1
    invoke-static {p1}, Lu/i;->a(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lw/g$b;->a:Lw/g;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2, p3, p4}, Lw/g;->b(Landroid/graphics/ImageDecoder$Source;IILl/d;)Ln/j;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public d(Ljava/nio/ByteBuffer;Ll/d;)Z
    .locals 0

    .line 1
    iget-object p2, p0, Lw/g$b;->a:Lw/g;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Lw/g;->d(Ljava/nio/ByteBuffer;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
