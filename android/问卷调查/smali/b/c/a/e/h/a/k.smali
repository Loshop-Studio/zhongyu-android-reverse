.class public Lb/c/a/e/h/a/k;
.super Lb/c/a/e/h/a/e;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb/c/a/e/h/a/e<",
        "Lb/c/a/e/h/a/w;",
        "Lb/c/a/e/h/a/j;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    new-instance v1, Lb/c/a/e/h/a/j;

    invoke-direct {v1, p1}, Lb/c/a/e/h/a/j;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lb/c/a/e/h/a/w;

    invoke-direct {v1, p1}, Lb/c/a/e/h/a/w;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Lb/c/a/e/h/a/w;

    invoke-direct {v1, p1}, Lb/c/a/e/h/a/w;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-direct {p0, v0, p1}, Lb/c/a/e/h/a/e;-><init>([Landroid/graphics/drawable/Drawable;Landroid/content/Context;)V

    return-void
.end method
