.class public final Lx0/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lx0/g;


# direct methods
.method public constructor <init>(Lx0/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx0/g$c;->a:Lx0/g;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm0/d;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lx0/g$c;->d(Ljava/io/InputStream;Lm0/d;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILm0/d;)Lo0/j;
    .locals 0

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lx0/g$c;->c(Ljava/io/InputStream;IILm0/d;)Lo0/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Ljava/io/InputStream;IILm0/d;)Lo0/j;
    .locals 1

    .line 1
    invoke-static {p1}, Li1/a;->b(Ljava/io/InputStream;)Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Ln/h0;->a(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Lx0/g$c;->a:Lx0/g;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, p3, p4}, Lx0/g;->b(Landroid/graphics/ImageDecoder$Source;IILm0/d;)Lo0/j;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public d(Ljava/io/InputStream;Lm0/d;)Z
    .locals 0

    .line 1
    iget-object p2, p0, Lx0/g$c;->a:Lx0/g;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Lx0/g;->c(Ljava/io/InputStream;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
