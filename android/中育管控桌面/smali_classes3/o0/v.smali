.class public final Lo0/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/j;
.implements Lh0/g;


# instance fields
.field public final a:Landroid/content/res/Resources;

.field public final b:Lh0/j;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Lh0/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lb1/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/content/res/Resources;

    .line 9
    .line 10
    iput-object p1, p0, Lo0/v;->a:Landroid/content/res/Resources;

    .line 11
    .line 12
    invoke-static {p2}, Lb1/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lh0/j;

    .line 17
    .line 18
    iput-object p1, p0, Lo0/v;->b:Lh0/j;

    .line 19
    .line 20
    return-void
.end method

.method public static c(Landroid/content/res/Resources;Lh0/j;)Lh0/j;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    new-instance v0, Lo0/v;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, Lo0/v;-><init>(Landroid/content/res/Resources;Lh0/j;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Landroid/graphics/drawable/BitmapDrawable;
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 2
    .line 3
    iget-object v1, p0, Lo0/v;->a:Landroid/content/res/Resources;

    .line 4
    .line 5
    iget-object v2, p0, Lo0/v;->b:Lh0/j;

    .line 6
    .line 7
    invoke-interface {v2}, Lh0/j;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Landroid/graphics/Bitmap;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lo0/v;->b()Landroid/graphics/drawable/BitmapDrawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/v;->b:Lh0/j;

    .line 2
    .line 3
    invoke-interface {v0}, Lh0/j;->getSize()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public initialize()V
    .locals 2

    .line 1
    iget-object v0, p0, Lo0/v;->b:Lh0/j;

    .line 2
    .line 3
    instance-of v1, v0, Lh0/g;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lh0/g;

    .line 8
    .line 9
    invoke-interface {v0}, Lh0/g;->initialize()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public recycle()V
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/v;->b:Lh0/j;

    .line 2
    .line 3
    invoke-interface {v0}, Lh0/j;->recycle()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
