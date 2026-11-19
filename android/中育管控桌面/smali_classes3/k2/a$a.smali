.class public Lk2/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk2/a;->d(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/widget/ImageView;Lk2/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lk2/c;

.field public final synthetic b:Lk2/a;


# direct methods
.method public constructor <init>(Lk2/a;Lk2/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk2/a$a;->b:Lk2/a;

    .line 2
    .line 3
    iput-object p2, p0, Lk2/a$a;->a:Lk2/c;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lcom/bumptech/glide/load/engine/GlideException;Ljava/lang/Object;Ly0/h;Z)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lk2/a$a;->a:Lk2/c;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    invoke-interface {p1, p2}, Lk2/c;->b(Landroid/graphics/drawable/Drawable;)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;Ly0/h;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 1
    check-cast p1, Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, Lk2/a$a;->c(Landroid/graphics/Bitmap;Ljava/lang/Object;Ly0/h;Lcom/bumptech/glide/load/DataSource;Z)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c(Landroid/graphics/Bitmap;Ljava/lang/Object;Ly0/h;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lk2/a$a;->a:Lk2/c;

    .line 2
    .line 3
    invoke-interface {p1}, Lk2/c;->c()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return p1
.end method
