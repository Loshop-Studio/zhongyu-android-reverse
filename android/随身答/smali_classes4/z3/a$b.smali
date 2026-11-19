.class public Lz3/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La1/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz3/a;->c(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/widget/ImageView;Lz3/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lz3/c;

.field public final synthetic b:Lz3/a;


# direct methods
.method public constructor <init>(Lz3/a;Lz3/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz3/a$b;->b:Lz3/a;

    .line 2
    .line 3
    iput-object p2, p0, Lz3/a$b;->a:Lz3/c;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Lb1/h;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, Lz3/a$b;->c(Lcom/bumptech/glide/load/resource/gif/GifDrawable;Ljava/lang/Object;Lb1/h;Lcom/bumptech/glide/load/DataSource;Z)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b(Lcom/bumptech/glide/load/engine/GlideException;Ljava/lang/Object;Lb1/h;Z)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lz3/a$b;->a:Lz3/c;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    invoke-interface {p1, p2}, Lz3/c;->b(Landroid/graphics/drawable/Drawable;)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1
.end method

.method public c(Lcom/bumptech/glide/load/resource/gif/GifDrawable;Ljava/lang/Object;Lb1/h;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lz3/a$b;->a:Lz3/c;

    .line 2
    .line 3
    invoke-interface {p1}, Lz3/c;->a()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return p1
.end method
