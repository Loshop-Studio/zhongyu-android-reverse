.class public final Lm1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;I)V
    .locals 0

    .line 1
    iput p2, p0, Lm1/i;->a:I

    iput-object p1, p0, Lm1/i;->b:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget v0, p0, Lm1/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lm1/i;->b:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 7
    .line 8
    iget-object v0, p1, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->m:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->getColor()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v1, p1, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    invoke-static {p1, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->e(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroidx/fragment/app/DialogFragment;->dismiss()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void

    .line 25
    :pswitch_0
    iget-object v0, p0, Lm1/i;->b:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 26
    .line 27
    iget-object v1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->b:Landroid/widget/FrameLayout;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 30
    .line 31
    .line 32
    iget v1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->e:I

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    if-eq v1, v2, :cond_1

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    const/4 v1, 0x0

    .line 41
    iput v1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->e:I

    .line 42
    .line 43
    check-cast p1, Landroid/widget/Button;

    .line 44
    .line 45
    iget v1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->p:I

    .line 46
    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    sget v1, Lcom/jaredrummler/android/colorpicker/R$string;->cpv_presets:I

    .line 51
    .line 52
    :goto_0
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V

    .line 53
    .line 54
    .line 55
    iget-object p1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->b:Landroid/widget/FrameLayout;

    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->g()Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    iput v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->e:I

    .line 66
    .line 67
    check-cast p1, Landroid/widget/Button;

    .line 68
    .line 69
    iget v1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->r:I

    .line 70
    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    sget v1, Lcom/jaredrummler/android/colorpicker/R$string;->cpv_custom:I

    .line 75
    .line 76
    :goto_1
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V

    .line 77
    .line 78
    .line 79
    iget-object p1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->b:Landroid/widget/FrameLayout;

    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->h()Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 86
    .line 87
    .line 88
    :goto_2
    return-void

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
