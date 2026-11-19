.class public Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->j()Landroid/view/View;
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
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$e;->a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

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
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$e;->a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->n:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->getColor()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$e;->a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 10
    .line 11
    iget v1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 12
    .line 13
    if-ne p1, v1, :cond_0

    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->f(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;I)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$e;->a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroidx/fragment/app/DialogFragment;->dismiss()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method
