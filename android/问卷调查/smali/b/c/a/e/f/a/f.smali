.class public abstract Lb/c/a/e/f/a/f;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lb/c/a/e/f/a/c;

.field public b:Lb/c/a/e/f/a/c;

.field public c:Lb/c/a/e/f/a/d;


# direct methods
.method public constructor <init>(Lb/c/a/e/f/a/c;Lb/c/a/e/f/a/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/c/a/e/f/a/f;->a:Lb/c/a/e/f/a/c;

    iput-object p2, p0, Lb/c/a/e/f/a/f;->b:Lb/c/a/e/f/a/c;

    new-instance v0, Lb/c/a/e/f/a/d;

    invoke-direct {v0, p1, p2}, Lb/c/a/e/f/a/d;-><init>(Lb/c/a/e/f/a/c;Lb/c/a/e/f/a/c;)V

    iput-object v0, p0, Lb/c/a/e/f/a/f;->c:Lb/c/a/e/f/a/d;

    return-void
.end method


# virtual methods
.method public abstract a(FFFLandroid/graphics/Rect;F)V
.end method

.method public b(FFLandroid/graphics/Rect;F)V
    .locals 8

    .line 1
    iget-object v0, p0, Lb/c/a/e/f/a/f;->c:Lb/c/a/e/f/a/d;

    .line 2
    iget-object v1, v0, Lb/c/a/e/f/a/d;->a:Lb/c/a/e/f/a/c;

    iget-object v0, v0, Lb/c/a/e/f/a/d;->b:Lb/c/a/e/f/a/c;

    if-eqz v1, :cond_0

    const/high16 v6, 0x3f800000    # 1.0f

    move v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Lb/c/a/e/f/a/c;->b(FFLandroid/graphics/Rect;FF)V

    :cond_0
    if-eqz v0, :cond_1

    const/high16 v7, 0x3f800000    # 1.0f

    move-object v2, v0

    move v3, p1

    move v4, p2

    move-object v5, p3

    move v6, p4

    invoke-virtual/range {v2 .. v7}, Lb/c/a/e/f/a/c;->b(FFLandroid/graphics/Rect;FF)V

    :cond_1
    return-void
.end method
