.class public final Lv0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/e;


# instance fields
.field public final a:Lv0/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lv0/e;

    .line 5
    .line 6
    invoke-direct {v0}, Lv0/e;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lv0/i;->a:Lv0/e;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm0/d;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lv0/i;->d(Ljava/nio/ByteBuffer;Lm0/d;)Z

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
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lv0/i;->c(Ljava/nio/ByteBuffer;IILm0/d;)Lo0/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Ljava/nio/ByteBuffer;IILm0/d;)Lo0/j;
    .locals 1

    .line 1
    invoke-static {p1}, Ln/h0;->a(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lv0/i;->a:Lv0/e;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2, p3, p4}, Lv0/e;->c(Landroid/graphics/ImageDecoder$Source;IILm0/d;)Lo0/j;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public d(Ljava/nio/ByteBuffer;Lm0/d;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method
