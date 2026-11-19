.class public final Lb/b/a/a/m/o;
.super La/k/b/l;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "La/k/b/l;"
    }
.end annotation


# static fields
.field public static final synthetic B0:I


# instance fields
.field public A0:Landroid/widget/Button;

.field public final k0:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Lb/b/a/a/m/q<",
            "-TS;>;>;"
        }
    .end annotation
.end field

.field public final l0:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Landroid/view/View$OnClickListener;",
            ">;"
        }
    .end annotation
.end field

.field public final m0:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Landroid/content/DialogInterface$OnCancelListener;",
            ">;"
        }
    .end annotation
.end field

.field public final n0:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Landroid/content/DialogInterface$OnDismissListener;",
            ">;"
        }
    .end annotation
.end field

.field public o0:I

.field public p0:Lb/b/a/a/m/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/b/a/a/m/d<",
            "TS;>;"
        }
    .end annotation
.end field

.field public q0:Lb/b/a/a/m/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/b/a/a/m/x<",
            "TS;>;"
        }
    .end annotation
.end field

.field public r0:Lb/b/a/a/m/a;

.field public s0:Lb/b/a/a/m/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/b/a/a/m/g<",
            "TS;>;"
        }
    .end annotation
.end field

.field public t0:I

.field public u0:Ljava/lang/CharSequence;

.field public v0:Z

.field public w0:I

.field public x0:Landroid/widget/TextView;

.field public y0:Lcom/google/android/material/internal/CheckableImageButton;

.field public z0:Lb/b/a/a/w/g;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, La/k/b/l;-><init>()V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lb/b/a/a/m/o;->k0:Ljava/util/LinkedHashSet;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lb/b/a/a/m/o;->l0:Ljava/util/LinkedHashSet;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lb/b/a/a/m/o;->m0:Ljava/util/LinkedHashSet;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lb/b/a/a/m/o;->n0:Ljava/util/LinkedHashSet;

    return-void
.end method

.method public static A0(Landroid/content/Context;)I
    .locals 4

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const v0, 0x7f07016e

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    invoke-static {}, Lb/b/a/a/m/s;->p()Lb/b/a/a/m/s;

    move-result-object v1

    iget v1, v1, Lb/b/a/a/m/s;->f:I

    const v2, 0x7f070174

    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    const v3, 0x7f070182

    invoke-virtual {p0, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p0

    mul-int/lit8 v0, v0, 0x2

    mul-int/2addr v2, v1

    add-int/2addr v2, v0

    add-int/lit8 v1, v1, -0x1

    mul-int/2addr v1, p0

    add-int/2addr v1, v2

    return v1
.end method

.method public static B0(Landroid/content/Context;)Z
    .locals 4

    const-class v0, Lb/b/a/a/m/g;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f040345

    invoke-static {p0, v1, v0}, Lb/b/a/a/a;->q(Landroid/content/Context;ILjava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    new-array v1, v1, [I

    const v2, 0x101020d

    const/4 v3, 0x0

    aput v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p0

    invoke-virtual {p0, v3, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return v0
.end method


# virtual methods
.method public final C0()V
    .locals 6

    iget-object v0, p0, Lb/b/a/a/m/o;->p0:Lb/b/a/a/m/d;

    invoke-virtual {p0}, La/k/b/m;->k0()Landroid/content/Context;

    move-result-object v1

    .line 1
    iget v2, p0, Lb/b/a/a/m/o;->o0:I

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lb/b/a/a/m/o;->p0:Lb/b/a/a/m/d;

    invoke-interface {v2, v1}, Lb/b/a/a/m/d;->h(Landroid/content/Context;)I

    move-result v2

    .line 2
    :goto_0
    iget-object v1, p0, Lb/b/a/a/m/o;->r0:Lb/b/a/a/m/a;

    .line 3
    new-instance v3, Lb/b/a/a/m/g;

    invoke-direct {v3}, Lb/b/a/a/m/g;-><init>()V

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v5, "THEME_RES_ID_KEY"

    invoke-virtual {v4, v5, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "GRID_SELECTOR_KEY"

    invoke-virtual {v4, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 4
    iget-object v1, v1, Lb/b/a/a/m/a;->d:Lb/b/a/a/m/s;

    const-string v2, "CURRENT_MONTH_KEY"

    .line 5
    invoke-virtual {v4, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v3, v4}, La/k/b/m;->p0(Landroid/os/Bundle;)V

    .line 6
    iput-object v3, p0, Lb/b/a/a/m/o;->s0:Lb/b/a/a/m/g;

    iget-object v1, p0, Lb/b/a/a/m/o;->y0:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v1}, Lcom/google/android/material/internal/CheckableImageButton;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lb/b/a/a/m/o;->p0:Lb/b/a/a/m/d;

    iget-object v2, p0, Lb/b/a/a/m/o;->r0:Lb/b/a/a/m/a;

    .line 7
    new-instance v3, Lb/b/a/a/m/r;

    invoke-direct {v3}, Lb/b/a/a/m/r;-><init>()V

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v5, "DATE_SELECTOR_KEY"

    invoke-virtual {v4, v5, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v4, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v3, v4}, La/k/b/m;->p0(Landroid/os/Bundle;)V

    goto :goto_1

    .line 8
    :cond_1
    iget-object v3, p0, Lb/b/a/a/m/o;->s0:Lb/b/a/a/m/g;

    :goto_1
    iput-object v3, p0, Lb/b/a/a/m/o;->q0:Lb/b/a/a/m/x;

    invoke-virtual {p0}, Lb/b/a/a/m/o;->D0()V

    invoke-virtual {p0}, La/k/b/m;->j()La/k/b/c0;

    move-result-object v0

    .line 9
    new-instance v1, La/k/b/a;

    invoke-direct {v1, v0}, La/k/b/a;-><init>(La/k/b/c0;)V

    const v0, 0x7f09015e

    .line 10
    iget-object v2, p0, Lb/b/a/a/m/o;->q0:Lb/b/a/a/m/x;

    const/4 v3, 0x2

    const/4 v4, 0x0

    .line 11
    invoke-virtual {v1, v0, v2, v4, v3}, La/k/b/a;->c(ILa/k/b/m;Ljava/lang/String;I)V

    .line 12
    iget-boolean v0, v1, La/k/b/l0;->g:Z

    if-nez v0, :cond_2

    .line 13
    iget-object v0, v1, La/k/b/a;->p:La/k/b/c0;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, La/k/b/c0;->D(La/k/b/c0$l;Z)V

    .line 14
    iget-object v0, p0, Lb/b/a/a/m/o;->q0:Lb/b/a/a/m/x;

    new-instance v1, Lb/b/a/a/m/o$c;

    invoke-direct {v1, p0}, Lb/b/a/a/m/o$c;-><init>(Lb/b/a/a/m/o;)V

    .line 15
    iget-object v0, v0, Lb/b/a/a/m/x;->V:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    return-void

    .line 16
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This transaction is already being added to the back stack"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final D0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lb/b/a/a/m/o;->p0:Lb/b/a/a/m/d;

    invoke-virtual {p0}, La/k/b/m;->k()Landroid/content/Context;

    move-result-object v1

    invoke-interface {v0, v1}, Lb/b/a/a/m/d;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lb/b/a/a/m/o;->x0:Landroid/widget/TextView;

    const v2, 0x7f0f0038

    invoke-virtual {p0, v2}, La/k/b/m;->C(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lb/b/a/a/m/o;->x0:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final E0(Lcom/google/android/material/internal/CheckableImageButton;)V
    .locals 1

    iget-object v0, p0, Lb/b/a/a/m/o;->y0:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Lcom/google/android/material/internal/CheckableImageButton;->isChecked()Z

    move-result v0

    invoke-virtual {p1}, Landroid/widget/ImageButton;->getContext()Landroid/content/Context;

    move-result-object p1

    if-eqz v0, :cond_0

    const v0, 0x7f0f0051

    goto :goto_0

    :cond_0
    const v0, 0x7f0f0053

    :goto_0
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lb/b/a/a/m/o;->y0:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final M(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, La/k/b/l;->M(Landroid/os/Bundle;)V

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, La/k/b/m;->h:Landroid/os/Bundle;

    :cond_0
    const-string v0, "OVERRIDE_THEME_RES_ID"

    .line 2
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lb/b/a/a/m/o;->o0:I

    const-string v0, "DATE_SELECTOR_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lb/b/a/a/m/d;

    iput-object v0, p0, Lb/b/a/a/m/o;->p0:Lb/b/a/a/m/d;

    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lb/b/a/a/m/a;

    iput-object v0, p0, Lb/b/a/a/m/o;->r0:Lb/b/a/a/m/a;

    const-string v0, "TITLE_TEXT_RES_ID_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lb/b/a/a/m/o;->t0:I

    const-string v0, "TITLE_TEXT_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lb/b/a/a/m/o;->u0:Ljava/lang/CharSequence;

    const-string v0, "INPUT_MODE_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lb/b/a/a/m/o;->w0:I

    return-void
.end method

.method public final P(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    iget-boolean p3, p0, Lb/b/a/a/m/o;->v0:Z

    if-eqz p3, :cond_0

    const p3, 0x7f0c004d

    goto :goto_0

    :cond_0
    const p3, 0x7f0c004c

    :goto_0
    invoke-virtual {p1, p3, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    iget-boolean p3, p0, Lb/b/a/a/m/o;->v0:Z

    const v0, 0x7f09015e

    if-eqz p3, :cond_1

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {p2}, Lb/b/a/a/m/o;->A0(Landroid/content/Context;)I

    move-result v1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    :cond_1
    const p3, 0x7f09015f

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {p2}, Lb/b/a/a/m/o;->A0(Landroid/content/Context;)I

    move-result v2

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p3, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0}, La/k/b/m;->k0()Landroid/content/Context;

    move-result-object p3

    .line 1
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v1, 0x7f070185

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    const v2, 0x7f070186

    invoke-virtual {p3, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v2

    add-int/2addr v2, v1

    const v1, 0x7f070184

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    add-int/2addr v1, v2

    const v2, 0x7f070175

    invoke-virtual {p3, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    sget v4, Lb/b/a/a/m/t;->f:I

    const v5, 0x7f070170

    invoke-virtual {p3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    mul-int/2addr v5, v4

    add-int/2addr v4, v3

    const v3, 0x7f070183

    invoke-virtual {p3, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v3

    mul-int/2addr v3, v4

    add-int/2addr v3, v5

    const v4, 0x7f07016d

    invoke-virtual {p3, v4}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p3

    add-int/2addr v1, v2

    add-int/2addr v1, v3

    add-int/2addr v1, p3

    .line 2
    invoke-virtual {v0, v1}, Landroid/view/View;->setMinimumHeight(I)V

    :goto_1
    const p3, 0x7f09016a

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p0, Lb/b/a/a/m/o;->x0:Landroid/widget/TextView;

    .line 3
    sget-object v0, La/h/j/o;->a:Ljava/util/WeakHashMap;

    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Landroid/view/View;->setAccessibilityLiveRegion(I)V

    const p3, 0x7f09016c

    .line 4
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/google/android/material/internal/CheckableImageButton;

    iput-object p3, p0, Lb/b/a/a/m/o;->y0:Lcom/google/android/material/internal/CheckableImageButton;

    const p3, 0x7f090170

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object v1, p0, Lb/b/a/a/m/o;->u0:Ljava/lang/CharSequence;

    if-eqz v1, :cond_2

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_2
    iget v1, p0, Lb/b/a/a/m/o;->t0:I

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(I)V

    .line 5
    :goto_2
    iget-object p3, p0, Lb/b/a/a/m/o;->y0:Lcom/google/android/material/internal/CheckableImageButton;

    const-string v1, "TOGGLE_BUTTON_TAG"

    invoke-virtual {p3, v1}, Landroid/widget/ImageButton;->setTag(Ljava/lang/Object;)V

    iget-object p3, p0, Lb/b/a/a/m/o;->y0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 6
    new-instance v1, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    new-array v2, v0, [I

    const v3, 0x10100a0

    const/4 v4, 0x0

    aput v3, v2, v4

    const v3, 0x7f08006c

    invoke-static {p2, v3}, La/b/d/a/a;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    new-array v2, v4, [I

    const v3, 0x7f08006e

    invoke-static {p2, v3}, La/b/d/a/a;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {v1, v2, p2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 7
    invoke-virtual {p3, v1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p2, p0, Lb/b/a/a/m/o;->y0:Lcom/google/android/material/internal/CheckableImageButton;

    iget p3, p0, Lb/b/a/a/m/o;->w0:I

    if-eqz p3, :cond_3

    move p3, v0

    goto :goto_3

    :cond_3
    move p3, v4

    :goto_3
    invoke-virtual {p2, p3}, Lcom/google/android/material/internal/CheckableImageButton;->setChecked(Z)V

    iget-object p2, p0, Lb/b/a/a/m/o;->y0:Lcom/google/android/material/internal/CheckableImageButton;

    const/4 p3, 0x0

    invoke-static {p2, p3}, La/h/j/o;->n(Landroid/view/View;La/h/j/a;)V

    iget-object p2, p0, Lb/b/a/a/m/o;->y0:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {p0, p2}, Lb/b/a/a/m/o;->E0(Lcom/google/android/material/internal/CheckableImageButton;)V

    iget-object p2, p0, Lb/b/a/a/m/o;->y0:Lcom/google/android/material/internal/CheckableImageButton;

    new-instance p3, Lb/b/a/a/m/p;

    invoke-direct {p3, p0}, Lb/b/a/a/m/p;-><init>(Lb/b/a/a/m/o;)V

    invoke-virtual {p2, p3}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f0900ab

    .line 8
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    iput-object p2, p0, Lb/b/a/a/m/o;->A0:Landroid/widget/Button;

    iget-object p2, p0, Lb/b/a/a/m/o;->p0:Lb/b/a/a/m/d;

    invoke-interface {p2}, Lb/b/a/a/m/d;->b()Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p2, p0, Lb/b/a/a/m/o;->A0:Landroid/widget/Button;

    invoke-virtual {p2, v0}, Landroid/widget/Button;->setEnabled(Z)V

    goto :goto_4

    :cond_4
    iget-object p2, p0, Lb/b/a/a/m/o;->A0:Landroid/widget/Button;

    invoke-virtual {p2, v4}, Landroid/widget/Button;->setEnabled(Z)V

    :goto_4
    iget-object p2, p0, Lb/b/a/a/m/o;->A0:Landroid/widget/Button;

    const-string p3, "CONFIRM_BUTTON_TAG"

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    iget-object p2, p0, Lb/b/a/a/m/o;->A0:Landroid/widget/Button;

    new-instance p3, Lb/b/a/a/m/o$a;

    invoke-direct {p3, p0}, Lb/b/a/a/m/o$a;-><init>(Lb/b/a/a/m/o;)V

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f090096

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    const-string p3, "CANCEL_BUTTON_TAG"

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    new-instance p3, Lb/b/a/a/m/o$b;

    invoke-direct {p3, p0}, Lb/b/a/a/m/o$b;-><init>(Lb/b/a/a/m/o;)V

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p1
.end method

.method public final b0(Landroid/os/Bundle;)V
    .locals 10

    invoke-super {p0, p1}, La/k/b/l;->b0(Landroid/os/Bundle;)V

    iget v0, p0, Lb/b/a/a/m/o;->o0:I

    const-string v1, "OVERRIDE_THEME_RES_ID"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lb/b/a/a/m/o;->p0:Lb/b/a/a/m/d;

    const-string v1, "DATE_SELECTOR_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    new-instance v0, Lb/b/a/a/m/a$b;

    iget-object v1, p0, Lb/b/a/a/m/o;->r0:Lb/b/a/a/m/a;

    invoke-direct {v0, v1}, Lb/b/a/a/m/a$b;-><init>(Lb/b/a/a/m/a;)V

    iget-object v1, p0, Lb/b/a/a/m/o;->s0:Lb/b/a/a/m/g;

    .line 1
    iget-object v1, v1, Lb/b/a/a/m/g;->Z:Lb/b/a/a/m/s;

    if-eqz v1, :cond_0

    .line 2
    iget-wide v1, v1, Lb/b/a/a/m/s;->h:J

    .line 3
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lb/b/a/a/m/a$b;->c:Ljava/lang/Long;

    .line 4
    :cond_0
    iget-object v1, v0, Lb/b/a/a/m/a$b;->c:Ljava/lang/Long;

    if-nez v1, :cond_2

    .line 5
    invoke-static {}, Lb/b/a/a/m/s;->p()Lb/b/a/a/m/s;

    move-result-object v1

    iget-wide v1, v1, Lb/b/a/a/m/s;->h:J

    .line 6
    iget-wide v3, v0, Lb/b/a/a/m/a$b;->a:J

    cmp-long v5, v3, v1

    if-gtz v5, :cond_1

    iget-wide v5, v0, Lb/b/a/a/m/a$b;->b:J

    cmp-long v5, v1, v5

    if-gtz v5, :cond_1

    goto :goto_0

    :cond_1
    move-wide v1, v3

    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lb/b/a/a/m/a$b;->c:Ljava/lang/Long;

    :cond_2
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, v0, Lb/b/a/a/m/a$b;->d:Lb/b/a/a/m/a$c;

    const-string v3, "DEEP_COPY_VALIDATOR_KEY"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    new-instance v2, Lb/b/a/a/m/a;

    iget-wide v4, v0, Lb/b/a/a/m/a$b;->a:J

    invoke-static {v4, v5}, Lb/b/a/a/m/s;->o(J)Lb/b/a/a/m/s;

    move-result-object v5

    iget-wide v6, v0, Lb/b/a/a/m/a$b;->b:J

    invoke-static {v6, v7}, Lb/b/a/a/m/s;->o(J)Lb/b/a/a/m/s;

    move-result-object v6

    iget-object v0, v0, Lb/b/a/a/m/a$b;->c:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-static {v7, v8}, Lb/b/a/a/m/s;->o(J)Lb/b/a/a/m/s;

    move-result-object v7

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lb/b/a/a/m/a$c;

    const/4 v9, 0x0

    move-object v4, v2

    invoke-direct/range {v4 .. v9}, Lb/b/a/a/m/a;-><init>(Lb/b/a/a/m/s;Lb/b/a/a/m/s;Lb/b/a/a/m/s;Lb/b/a/a/m/a$c;Lb/b/a/a/m/a$a;)V

    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 7
    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget v0, p0, Lb/b/a/a/m/o;->t0:I

    const-string v1, "TITLE_TEXT_RES_ID_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lb/b/a/a/m/o;->u0:Ljava/lang/CharSequence;

    const-string v1, "TITLE_TEXT_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public c0()V
    .locals 9

    invoke-super {p0}, La/k/b/l;->c0()V

    invoke-virtual {p0}, La/k/b/l;->z0()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    iget-boolean v1, p0, Lb/b/a/a/m/o;->v0:Z

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    iget-object v1, p0, Lb/b/a/a/m/o;->z0:Lb/b/a/a/w/g;

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    const/4 v1, -0x2

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    invoke-virtual {p0}, La/k/b/m;->y()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070176

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v8

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1, v8, v8, v8, v8}, Landroid/graphics/Rect;-><init>(IIII)V

    new-instance v2, Landroid/graphics/drawable/InsetDrawable;

    iget-object v4, p0, Lb/b/a/a/m/o;->z0:Lb/b/a/a/w/g;

    move-object v3, v2

    move v5, v8

    move v6, v8

    move v7, v8

    invoke-direct/range {v3 .. v8}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    invoke-virtual {v0, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    new-instance v2, Lb/b/a/a/n/a;

    invoke-virtual {p0}, La/k/b/l;->z0()Landroid/app/Dialog;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Lb/b/a/a/n/a;-><init>(Landroid/app/Dialog;Landroid/graphics/Rect;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :goto_0
    invoke-virtual {p0}, Lb/b/a/a/m/o;->C0()V

    return-void
.end method

.method public d0()V
    .locals 1

    iget-object v0, p0, Lb/b/a/a/m/o;->q0:Lb/b/a/a/m/x;

    .line 1
    iget-object v0, v0, Lb/b/a/a/m/x;->V:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->clear()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/k/b/m;->E:Z

    .line 3
    iget-object v0, p0, La/k/b/l;->g0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->hide()V

    :cond_0
    return-void
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    iget-object v0, p0, Lb/b/a/a/m/o;->m0:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/DialogInterface$OnCancelListener;

    invoke-interface {v1, p1}, Landroid/content/DialogInterface$OnCancelListener;->onCancel(Landroid/content/DialogInterface;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    iget-object v0, p0, Lb/b/a/a/m/o;->n0:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/DialogInterface$OnDismissListener;

    invoke-interface {v1, p1}, Landroid/content/DialogInterface$OnDismissListener;->onDismiss(Landroid/content/DialogInterface;)V

    goto :goto_0

    .line 1
    :cond_0
    iget-object v0, p0, La/k/b/m;->G:Landroid/view/View;

    .line 2
    check-cast v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_1
    invoke-super {p0, p1}, La/k/b/l;->onDismiss(Landroid/content/DialogInterface;)V

    return-void
.end method

.method public final y0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 6

    new-instance p1, Landroid/app/Dialog;

    invoke-virtual {p0}, La/k/b/m;->k0()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, La/k/b/m;->k0()Landroid/content/Context;

    move-result-object v1

    .line 1
    iget v2, p0, Lb/b/a/a/m/o;->o0:I

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lb/b/a/a/m/o;->p0:Lb/b/a/a/m/d;

    invoke-interface {v2, v1}, Lb/b/a/a/m/d;->h(Landroid/content/Context;)I

    move-result v2

    .line 2
    :goto_0
    invoke-direct {p1, v0, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lb/b/a/a/m/o;->B0(Landroid/content/Context;)Z

    move-result v1

    iput-boolean v1, p0, Lb/b/a/a/m/o;->v0:Z

    const v1, 0x7f04016f

    const-class v2, Lb/b/a/a/m/o;

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lb/b/a/a/a;->q(Landroid/content/Context;ILjava/lang/String;)I

    move-result v1

    new-instance v2, Lb/b/a/a/w/g;

    const/4 v3, 0x0

    const v4, 0x7f040345

    const v5, 0x7f1002f4

    .line 3
    invoke-static {v0, v3, v4, v5}, Lb/b/a/a/w/j;->b(Landroid/content/Context;Landroid/util/AttributeSet;II)Lb/b/a/a/w/j$b;

    move-result-object v3

    invoke-virtual {v3}, Lb/b/a/a/w/j$b;->a()Lb/b/a/a/w/j;

    move-result-object v3

    invoke-direct {v2, v3}, Lb/b/a/a/w/g;-><init>(Lb/b/a/a/w/j;)V

    .line 4
    iput-object v2, p0, Lb/b/a/a/m/o;->z0:Lb/b/a/a/w/g;

    .line 5
    iget-object v3, v2, Lb/b/a/a/w/g;->b:Lb/b/a/a/w/g$b;

    new-instance v4, Lb/b/a/a/o/a;

    invoke-direct {v4, v0}, Lb/b/a/a/o/a;-><init>(Landroid/content/Context;)V

    iput-object v4, v3, Lb/b/a/a/w/g$b;->b:Lb/b/a/a/o/a;

    invoke-virtual {v2}, Lb/b/a/a/w/g;->w()V

    .line 6
    iget-object v0, p0, Lb/b/a/a/m/o;->z0:Lb/b/a/a/w/g;

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb/b/a/a/w/g;->p(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lb/b/a/a/m/o;->z0:Lb/b/a/a/w/g;

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    .line 7
    sget-object v2, La/h/j/o;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v1}, Landroid/view/View;->getElevation()F

    move-result v1

    .line 8
    invoke-virtual {v0, v1}, Lb/b/a/a/w/g;->o(F)V

    return-object p1
.end method
