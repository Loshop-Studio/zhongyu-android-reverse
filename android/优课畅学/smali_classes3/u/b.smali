.class public Lu/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll/f;


# instance fields
.field public final a:Lo/d;

.field public final b:Ll/f;


# direct methods
.method public constructor <init>(Lo/d;Ll/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu/b;->a:Lo/d;

    .line 5
    .line 6
    iput-object p2, p0, Lu/b;->b:Ll/f;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ll/d;)Lcom/bumptech/glide/load/EncodeStrategy;
    .locals 1

    .line 1
    iget-object v0, p0, Lu/b;->b:Ll/f;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ll/f;->a(Ll/d;)Lcom/bumptech/glide/load/EncodeStrategy;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljava/io/File;Ll/d;)Z
    .locals 0

    .line 1
    check-cast p1, Ln/j;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lu/b;->c(Ln/j;Ljava/io/File;Ll/d;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c(Ln/j;Ljava/io/File;Ll/d;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lu/b;->b:Ll/f;

    .line 2
    .line 3
    new-instance v1, Lu/f;

    .line 4
    .line 5
    invoke-interface {p1}, Ln/j;->get()Ljava/lang/Object;

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
    iget-object v2, p0, Lu/b;->a:Lo/d;

    .line 16
    .line 17
    invoke-direct {v1, p1, v2}, Lu/f;-><init>(Landroid/graphics/Bitmap;Lo/d;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1, p2, p3}, Ll/a;->b(Ljava/lang/Object;Ljava/io/File;Ll/d;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
.end method
