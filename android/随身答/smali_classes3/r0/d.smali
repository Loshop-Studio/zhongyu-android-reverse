.class public final Lr0/d;
.super Lq0/d;
.source "SourceFile"


# instance fields
.field public final b:Ll0/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lq0/d;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ll0/e;

    .line 5
    .line 6
    invoke-direct {v0}, Ll0/e;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr0/d;->b:Ll0/d;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public c(Landroid/graphics/ImageDecoder$Source;IILandroid/graphics/ImageDecoder$OnHeaderDecodedListener;)Lk0/j;
    .locals 0

    .line 1
    invoke-static {p1, p4}, Landroidx/core/graphics/t;->a(Landroid/graphics/ImageDecoder$Source;Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string p2, "BitmapImageDecoder"

    .line 6
    .line 7
    const/4 p3, 0x2

    .line 8
    invoke-static {p2, p3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 18
    .line 19
    .line 20
    :cond_0
    new-instance p2, Lr0/e;

    .line 21
    .line 22
    iget-object p3, p0, Lr0/d;->b:Ll0/d;

    .line 23
    .line 24
    invoke-direct {p2, p1, p3}, Lr0/e;-><init>(Landroid/graphics/Bitmap;Ll0/d;)V

    .line 25
    .line 26
    .line 27
    return-object p2
.end method
