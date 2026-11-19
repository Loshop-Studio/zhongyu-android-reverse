.class public Li2/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li2/a;->d(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/widget/ImageView;Li2/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Li2/c;

.field public final synthetic b:Li2/a;


# direct methods
.method public constructor <init>(Li2/a;Li2/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li2/a$a;->b:Li2/a;

    .line 2
    .line 3
    iput-object p2, p0, Li2/a$a;->a:Li2/c;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Le0/i;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 1
    check-cast p1, Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, Li2/a$a;->c(Landroid/graphics/Bitmap;Ljava/lang/Object;Le0/i;Lcom/bumptech/glide/load/DataSource;Z)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b(Lcom/bumptech/glide/load/engine/GlideException;Ljava/lang/Object;Le0/i;Z)Z
    .locals 0

    .line 1
    iget-object p1, p0, Li2/a$a;->a:Li2/c;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    invoke-interface {p1, p2}, Li2/c;->a(Landroid/graphics/drawable/Drawable;)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1
.end method

.method public c(Landroid/graphics/Bitmap;Ljava/lang/Object;Le0/i;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 1
    iget-object p1, p0, Li2/a$a;->a:Li2/c;

    .line 2
    .line 3
    invoke-interface {p1}, Li2/c;->b()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return p1
.end method
