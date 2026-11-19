.class public abstract Lb/c/a/e/b/a/a/a/b;
.super Lb/c/a/e/b/a/a/a/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        "T:",
        "Lb/c/a/e/b/a/a/a/b<",
        "TE;TT;>;>",
        "Lb/c/a/e/b/a/a/a/a<",
        "TE;TT;>;"
    }
.end annotation


# instance fields
.field public t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/widget/ImageView;",
            ">;"
        }
    .end annotation
.end field

.field public u:I

.field public v:Landroid/graphics/drawable/Drawable;

.field public w:Landroid/graphics/drawable/Drawable;

.field public x:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    invoke-direct {p0, p1, p2}, Lb/c/a/e/b/a/a/a/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb/c/a/e/b/a/a/a/b;->t:Ljava/util/List;

    .line 1
    sget-object v0, Lb/c/a/b;->b:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lb/c/a/e/b/a/a/a/b;->u:I

    const/high16 v0, 0x40c00000    # 6.0f

    invoke-virtual {p0, v0}, Lb/c/a/e/b/a/a/a/a;->a(F)I

    move-result v2

    const/16 v3, 0x8

    invoke-virtual {p2, v3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    invoke-virtual {p0, v0}, Lb/c/a/e/b/a/a/a/a;->a(F)I

    move-result v2

    const/4 v3, 0x2

    invoke-virtual {p2, v3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    invoke-virtual {p0, v0}, Lb/c/a/e/b/a/a/a/a;->a(F)I

    move-result v0

    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    const/high16 v0, 0x40400000    # 3.0f

    invoke-virtual {p0, v0}, Lb/c/a/e/b/a/a/a/a;->a(F)I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    const-string v0, "#ffffff"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    const/4 v2, 0x3

    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    const-string v0, "#88ffffff"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    const/4 v2, 0x6

    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    const/4 v0, 0x4

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    const/4 v2, 0x7

    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    new-instance p2, Landroid/widget/LinearLayout;

    invoke-direct {p2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lb/c/a/e/b/a/a/a/b;->x:Landroid/widget/LinearLayout;

    const/16 p1, 0x11

    invoke-virtual {p2, p1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 2
    :try_start_0
    iget p1, p0, Lb/c/a/e/b/a/a/a/b;->u:I

    if-nez p1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lb/c/a/e/b/a/a/a/b;->v:Landroid/graphics/drawable/Drawable;

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lb/c/a/e/b/a/a/a/b;->w:Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Landroid/content/res/Resources$NotFoundException;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public setCurrentIndicator(I)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lb/c/a/e/b/a/a/a/b;->t:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lb/c/a/e/b/a/a/a/b;->t:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    if-ne v0, p1, :cond_0

    iget-object v2, p0, Lb/c/a/e/b/a/a/a/b;->v:Landroid/graphics/drawable/Drawable;

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lb/c/a/e/b/a/a/a/b;->w:Landroid/graphics/drawable/Drawable;

    :goto_1
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
