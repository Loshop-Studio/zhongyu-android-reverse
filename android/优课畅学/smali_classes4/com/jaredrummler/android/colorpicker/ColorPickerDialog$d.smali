.class public Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->onStart()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;


# direct methods
.method public constructor <init>(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$d;->a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$d;->a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->b:Landroid/widget/FrameLayout;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$d;->a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 9
    .line 10
    iget v1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->e:I

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    if-eq v1, v2, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    iput v1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->e:I

    .line 20
    .line 21
    check-cast p1, Landroid/widget/Button;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->h(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$d;->a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 30
    .line 31
    invoke-static {v0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->h(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    sget v0, Lcom/jaredrummler/android/colorpicker/R$string;->cpv_presets:I

    .line 37
    .line 38
    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$d;->a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 42
    .line 43
    iget-object v0, p1, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->b:Landroid/widget/FrameLayout;

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->j()Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    iput v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->e:I

    .line 54
    .line 55
    check-cast p1, Landroid/widget/Button;

    .line 56
    .line 57
    invoke-static {v0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->g(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$d;->a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 64
    .line 65
    invoke-static {v0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->g(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    goto :goto_1

    .line 70
    :cond_3
    sget v0, Lcom/jaredrummler/android/colorpicker/R$string;->cpv_custom:I

    .line 71
    .line 72
    :goto_1
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$d;->a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 76
    .line 77
    iget-object v0, p1, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->b:Landroid/widget/FrameLayout;

    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->k()Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method
