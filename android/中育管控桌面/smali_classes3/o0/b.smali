.class public Lo0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf0/f;


# instance fields
.field public final a:Li0/d;

.field public final b:Lf0/f;


# direct methods
.method public constructor <init>(Li0/d;Lf0/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo0/b;->a:Li0/d;

    .line 5
    .line 6
    iput-object p2, p0, Lo0/b;->b:Lf0/f;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/io/File;Lf0/d;)Z
    .locals 0

    .line 1
    check-cast p1, Lh0/j;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lo0/b;->c(Lh0/j;Ljava/io/File;Lf0/d;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b(Lf0/d;)Lcom/bumptech/glide/load/EncodeStrategy;
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/b;->b:Lf0/f;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lf0/f;->b(Lf0/d;)Lcom/bumptech/glide/load/EncodeStrategy;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Lh0/j;Ljava/io/File;Lf0/d;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lo0/b;->b:Lf0/f;

    .line 2
    .line 3
    new-instance v1, Lo0/f;

    .line 4
    .line 5
    invoke-interface {p1}, Lh0/j;->get()Ljava/lang/Object;

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
    iget-object v2, p0, Lo0/b;->a:Li0/d;

    .line 16
    .line 17
    invoke-direct {v1, p1, v2}, Lo0/f;-><init>(Landroid/graphics/Bitmap;Li0/d;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1, p2, p3}, Lf0/a;->a(Ljava/lang/Object;Ljava/io/File;Lf0/d;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
.end method
