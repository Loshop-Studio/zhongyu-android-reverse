.class public Lb/c/a/e/h/a/b$b;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/c/a/e/h/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lb/c/a/e/h/a/b;


# direct methods
.method public constructor <init>(Lb/c/a/e/h/a/b;Lb/c/a/e/h/a/b$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb/c/a/e/h/a/b$b;->a:Lb/c/a/e/h/a/b;

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    return-void
.end method


# virtual methods
.method public getChangingConfigurations()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lb/c/a/e/h/a/b$b;->a:Lb/c/a/e/h/a/b;

    return-object v0
.end method
