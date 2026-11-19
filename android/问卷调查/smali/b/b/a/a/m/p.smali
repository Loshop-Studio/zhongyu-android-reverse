.class public Lb/b/a/a/m/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lb/b/a/a/m/o;


# direct methods
.method public constructor <init>(Lb/b/a/a/m/o;)V
    .locals 0

    iput-object p1, p0, Lb/b/a/a/m/p;->b:Lb/b/a/a/m/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lb/b/a/a/m/p;->b:Lb/b/a/a/m/o;

    .line 1
    iget-object v0, p1, Lb/b/a/a/m/o;->A0:Landroid/widget/Button;

    .line 2
    iget-object p1, p1, Lb/b/a/a/m/o;->p0:Lb/b/a/a/m/d;

    .line 3
    invoke-interface {p1}, Lb/b/a/a/m/d;->b()Z

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object p1, p0, Lb/b/a/a/m/p;->b:Lb/b/a/a/m/o;

    .line 4
    iget-object p1, p1, Lb/b/a/a/m/o;->y0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 5
    invoke-virtual {p1}, Lcom/google/android/material/internal/CheckableImageButton;->toggle()V

    iget-object p1, p0, Lb/b/a/a/m/p;->b:Lb/b/a/a/m/o;

    .line 6
    iget-object v0, p1, Lb/b/a/a/m/o;->y0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 7
    invoke-virtual {p1, v0}, Lb/b/a/a/m/o;->E0(Lcom/google/android/material/internal/CheckableImageButton;)V

    .line 8
    iget-object p1, p0, Lb/b/a/a/m/p;->b:Lb/b/a/a/m/o;

    .line 9
    invoke-virtual {p1}, Lb/b/a/a/m/o;->C0()V

    return-void
.end method
