.class public Lb/c/a/e/h/a/i;
.super Lb/c/a/e/h/a/e;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb/c/a/e/h/a/e<",
        "Lb/c/a/e/h/a/v;",
        "Lb/c/a/e/h/a/h;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(ILandroid/content/Context;)V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    new-instance v1, Lb/c/a/e/h/a/h;

    invoke-direct {v1}, Lb/c/a/e/h/a/h;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lb/c/a/e/h/a/v;

    invoke-direct {v1, p1}, Lb/c/a/e/h/a/v;-><init>(I)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Lb/c/a/e/h/a/v;

    invoke-direct {v1, p1}, Lb/c/a/e/h/a/v;-><init>(I)V

    const/4 p1, 0x2

    aput-object v1, v0, p1

    invoke-direct {p0, v0, p2}, Lb/c/a/e/h/a/e;-><init>([Landroid/graphics/drawable/Drawable;Landroid/content/Context;)V

    return-void
.end method
