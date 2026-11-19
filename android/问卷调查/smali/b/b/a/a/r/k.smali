.class public final Lb/b/a/a/r/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/h/j/k;


# instance fields
.field public final synthetic a:Lb/b/a/a/r/m;

.field public final synthetic b:Lb/b/a/a/r/n;


# direct methods
.method public constructor <init>(Lb/b/a/a/r/m;Lb/b/a/a/r/n;)V
    .locals 0

    iput-object p1, p0, Lb/b/a/a/r/k;->a:Lb/b/a/a/r/m;

    iput-object p2, p0, Lb/b/a/a/r/k;->b:Lb/b/a/a/r/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;La/h/j/z;)La/h/j/z;
    .locals 2

    iget-object p1, p0, Lb/b/a/a/r/k;->a:Lb/b/a/a/r/m;

    iget-object v0, p0, Lb/b/a/a/r/k;->b:Lb/b/a/a/r/n;

    .line 1
    iget v0, v0, Lb/b/a/a/r/n;->a:I

    .line 2
    check-cast p1, Lb/b/a/a/g/b;

    .line 3
    iget-object v0, p1, Lb/b/a/a/g/b;->a:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 4
    iget-object v1, p2, La/h/j/z;->a:La/h/j/z$j;

    invoke-virtual {v1}, La/h/j/z$j;->f()La/h/d/b;

    move-result-object v1

    .line 5
    iget v1, v1, La/h/d/b;->d:I

    .line 6
    iput v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->j:I

    .line 7
    iget-object p1, p1, Lb/b/a/a/g/b;->a:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->S(Z)V

    return-object p2
.end method
