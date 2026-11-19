.class public Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jaredrummler/android/colorpicker/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->h()Landroid/view/View;
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
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$g;->a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$g;->a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 2
    .line 3
    iget v1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 4
    .line 5
    if-ne v1, p1, :cond_0

    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->c(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;I)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$g;->a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroidx/fragment/app/DialogFragment;->dismiss()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iput p1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 17
    .line 18
    iget-boolean v1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->g:Z

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->f(I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method
