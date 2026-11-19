.class public Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;
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
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$b;->a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$b;->a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 2
    .line 3
    iget-object p2, p2, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->o:Landroid/widget/EditText;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eq p1, p2, :cond_0

    .line 7
    .line 8
    invoke-virtual {p2}, Landroid/view/View;->hasFocus()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$b;->a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 15
    .line 16
    iget-object p1, p1, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->o:Landroid/widget/EditText;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->clearFocus()V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$b;->a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string p2, "input_method"

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 34
    .line 35
    iget-object p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$b;->a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 36
    .line 37
    iget-object p2, p2, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->o:Landroid/widget/EditText;

    .line 38
    .line 39
    invoke-virtual {p2}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p1, p2, v0}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$b;->a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 47
    .line 48
    iget-object p1, p1, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->o:Landroid/widget/EditText;

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/view/View;->clearFocus()V

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x1

    .line 54
    return p1

    .line 55
    :cond_0
    return v0
.end method
