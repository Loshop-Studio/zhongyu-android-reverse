.class public final Lm1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lm1/d;


# direct methods
.method public constructor <init>(Lm1/d;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm1/b;->b:Lm1/d;

    .line 5
    .line 6
    iput p2, p0, Lm1/b;->a:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lm1/b;->b:Lm1/d;

    .line 2
    .line 3
    iget-object v0, p1, Lm1/d;->e:Lm1/e;

    .line 4
    .line 5
    iget v1, v0, Lm1/e;->c:I

    .line 6
    .line 7
    iget v2, p0, Lm1/b;->a:I

    .line 8
    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    iput v2, v0, Lm1/e;->c:I

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object p1, p1, Lm1/d;->e:Lm1/e;

    .line 17
    .line 18
    iget-object v0, p1, Lm1/e;->a:Lo2/a;

    .line 19
    .line 20
    iget-object p1, p1, Lm1/e;->b:[I

    .line 21
    .line 22
    aget p1, p1, v2

    .line 23
    .line 24
    iget-object v0, v0, Lo2/a;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 27
    .line 28
    iget v1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 29
    .line 30
    if-ne v1, p1, :cond_1

    .line 31
    .line 32
    invoke-static {v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->e(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Landroidx/fragment/app/DialogFragment;->dismiss()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iput p1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 40
    .line 41
    iget-boolean v1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->f:Z

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->f(I)V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-void
.end method
