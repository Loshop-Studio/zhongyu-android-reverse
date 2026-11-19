.class public Lq0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/g;


# instance fields
.field public final a:Lk0/d;

.field public final b:Lh0/g;


# direct methods
.method public constructor <init>(Lk0/d;Lh0/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq0/b;->a:Lk0/d;

    .line 5
    .line 6
    iput-object p2, p0, Lq0/b;->b:Lh0/g;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/io/File;Lh0/e;)Z
    .locals 0

    .line 1
    check-cast p1, Lj0/j;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lq0/b;->c(Lj0/j;Ljava/io/File;Lh0/e;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b(Lh0/e;)Lcom/bumptech/glide/load/EncodeStrategy;
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/b;->b:Lh0/g;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lh0/g;->b(Lh0/e;)Lcom/bumptech/glide/load/EncodeStrategy;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Lj0/j;Ljava/io/File;Lh0/e;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lq0/b;->b:Lh0/g;

    .line 2
    .line 3
    new-instance v1, Lq0/f;

    .line 4
    .line 5
    invoke-interface {p1}, Lj0/j;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v2, p0, Lq0/b;->a:Lk0/d;

    .line 16
    .line 17
    invoke-direct {v1, p1, v2}, Lq0/f;-><init>(Landroid/graphics/Bitmap;Lk0/d;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1, p2, p3}, Lh0/a;->a(Ljava/lang/Object;Ljava/io/File;Lh0/e;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
.end method
