.class public final Lt0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt0/e;


# instance fields
.field public final a:Li0/d;

.field public final b:Lt0/e;

.field public final c:Lt0/e;


# direct methods
.method public constructor <init>(Li0/d;Lt0/e;Lt0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt0/c;->a:Li0/d;

    .line 5
    .line 6
    iput-object p2, p0, Lt0/c;->b:Lt0/e;

    .line 7
    .line 8
    iput-object p3, p0, Lt0/c;->c:Lt0/e;

    .line 9
    .line 10
    return-void
.end method

.method public static b(Lh0/j;)Lh0/j;
    .locals 0

    .line 1
    return-object p0
.end method


# virtual methods
.method public a(Lh0/j;Lf0/d;)Lh0/j;
    .locals 2

    .line 1
    invoke-interface {p1}, Lh0/j;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lt0/c;->b:Lt0/e;

    .line 12
    .line 13
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lt0/c;->a:Li0/d;

    .line 20
    .line 21
    invoke-static {v0, v1}, Lo0/f;->c(Landroid/graphics/Bitmap;Li0/d;)Lo0/f;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {p1, v0, p2}, Lt0/e;->a(Lh0/j;Lf0/d;)Lh0/j;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_0
    instance-of v0, v0, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lt0/c;->c:Lt0/e;

    .line 35
    .line 36
    invoke-static {p1}, Lt0/c;->b(Lh0/j;)Lh0/j;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {v0, p1, p2}, Lt0/e;->a(Lh0/j;Lf0/d;)Lh0/j;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_1
    const/4 p1, 0x0

    .line 46
    return-object p1
.end method
